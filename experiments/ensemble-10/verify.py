#!/usr/bin/env python3
"""Validate archived records; optionally rerun native reference comparisons."""
import argparse
import collections
import csv
import hashlib
import json
import os
import signal
from pathlib import Path
import subprocess
import sys


def require(condition, message):
    if not condition:
        raise ValueError(message)


def digest(path):
    return hashlib.sha256(path.read_bytes()).hexdigest()


def read(path):
    return json.loads(path.read_text())


def verify(bundle):
    manifest = read(bundle / 'manifest.json')
    for name, expected in manifest['files'].items():
        path = (bundle / name).resolve()
        require(path.is_relative_to(bundle.resolve()), f'Unsafe path: {name}')
        require(digest(path) == expected, f'Hash mismatch: {name}')
    with (bundle / 'results.csv').open() as stream:
        rows = list(csv.DictReader(stream))
    require(len(rows) == 20, 'Expected twenty output records')
    require(set(manifest['cases']) == {'battery', 'hvac'}, 'Unexpected cases')
    for case, spec in manifest['cases'].items():
        samples = {f's{i:02}' for i in range(1, 11)}
        hashes = {'oracle': digest(bundle / case / 'oracle.sysml')}
        case_rows = [r for r in rows if r['case'] == case]
        require(len(case_rows) == 10 and {r['sample'] for r in case_rows} == samples,
                f'{case}: expected ten distinct samples')
        for sample in samples:
            hashes[sample] = digest(bundle / case / 'candidates' / f'{sample}.sysml')
            generation = read(bundle / case / 'generation' / f'{sample}.json')
            require(generation['candidate_sha256'] == hashes[sample]
                    and generation['state'] == 'completed'
                    and generation['requirements_unchanged']
                    and not generation['timed_out'], f'{case}/{sample}: generation mismatch')
        adjacent = collections.defaultdict(set)
        direct = {}
        for edge in spec['comparisons']:
            base = bundle / edge['path']
            receipt, result, verification = [read(base / f'{n}.json')
                                            for n in ['receipt', 'result', 'verification']]
            left, right = edge['left'], edge['right']
            require(receipt['signature']['left'] == hashes[left]
                    and receipt['signature']['right'] == hashes[right], f'{base}: input mismatch')
            verdict = receipt['verdict']
            require(verdict in {'EQUIVALENT', 'CANDIDATE_WEAKER'}
                    and result['comparison_verdict'] == verdict
                    and result['result'] == ('EQUIVALENT' if verdict == 'EQUIVALENT' else 'NOT_EQUIVALENT')
                    and result['run_status'] == 'COMPLETED'
                    and result['breakdown_complete']
                    and not receipt['timed_out'], f'{base}: incomplete comparison')
            units = result['unit_results']
            require(len(units) == receipt['unit_count'] == 16, f'{base}: unit coverage')
            proofs = {p['id']: p for p in verification['proofs']}
            classifications = []
            for unit in units:
                vcs = unit['atomic_vcs']
                require([v['name'] for v in vcs] == ['A* -> A', 'A* & G -> G*',
                        'A -> A*', 'A & G* -> G'], f'{base}: unexpected obligations')
                statuses = tuple(v['status'] for v in vcs)
                if statuses == ('VERIFIED',) * 4:
                    classification = 'EQUIVALENT'
                elif statuses == ('VERIFIED', 'COUNTEREXAMPLE', 'VERIFIED', 'VERIFIED'):
                    classification = 'CANDIDATE_WEAKER'
                else:
                    raise ValueError(f'{base}: unresolved or unexpected VC outcomes')
                require(unit['classification'] == classification, f'{base}: unit verdict mismatch')
                classifications.append(classification)
                for vc in vcs:
                    key = 'validity_evidence' if vc['status'] == 'VERIFIED' else 'witness_evidence'
                    proof = proofs[vc[key]]
                    require(proof['outcome'] == ('VERIFIED' if key == 'validity_evidence' else 'SAT')
                            and proof['exit_code'] == 0, f'{base}: proof receipt mismatch')
            require(verdict == ('CANDIDATE_WEAKER' if 'CANDIDATE_WEAKER' in classifications
                                else 'EQUIVALENT'), f'{base}: aggregate verdict mismatch')
            if left == 'oracle':
                direct[right] = verdict
            else:
                require(verdict == 'EQUIVALENT', f'{base}: only equality may propagate labels')
                adjacent[left].add(right)
                adjacent[right].add(left)
        counts = collections.Counter()
        for row in case_rows:
            sample = row['sample']
            reachable, pending = set(), [sample]
            while pending:
                node = pending.pop()
                if node not in reachable:
                    reachable.add(node)
                    pending.extend(adjacent[node] - reachable)
            labels = {direct[node] for node in reachable if node in direct}
            require(labels == {row['verdict']}, f'{case}/{sample}: missing or conflicting proof path')
            require(row['candidate_sha256'] == hashes[sample]
                    and row['reference_sha256'] == hashes['oracle'], f'{case}/{sample}: row hash mismatch')
            counts[row['verdict']] += 1
        require(counts == {'EQUIVALENT': spec['expected_equivalent'],
                           'CANDIDATE_WEAKER': spec['expected_weaker']}, f'{case}: count mismatch')
        print(f"{case}: {counts['EQUIVALENT']}/10 reference-equivalent; "
              f"{counts['CANDIDATE_WEAKER']}/10 weaker")
    return manifest, rows


def recheck(bundle, manifest, rows, output):
    repo = Path(__file__).resolve().parents[2]
    for name, expected in manifest['checker_source_hashes'].items():
        require(digest(repo / name) == expected, f'Checker differs from recorded version: {name}')
    output.mkdir(parents=True, exist_ok=False)
    env = dict(os.environ, PYTHONPATH=str(repo / 'src'))
    failures = []
    for row in rows:
        case, sample = row['case'], row['sample']
        dest = output / case / sample
        dest.mkdir(parents=True)
        command = [sys.executable, '-m', 'equiv_checker', 'compare',
                   '--oracle', str(bundle / case / 'oracle.sysml'),
                   '--candidate', str(bundle / case / 'candidates' / f'{sample}.sysml'),
                   '--output-dir', str(dest / 'evidence'), '--timeout', '180']
        with (dest / 'console.log').open('w') as log:
            try:
                with subprocess.Popen(command, cwd=repo, env=env, stdout=log,
                                      stderr=subprocess.STDOUT, start_new_session=True) as process:
                    try:
                        process.wait(timeout=manifest['comparison_seconds'])
                    except subprocess.TimeoutExpired:
                        # Terminate the entire native worker tree on a whole-comparison timeout.
                        os.killpg(process.pid, signal.SIGKILL)
                        process.wait()
                        raise
                result = read(dest / 'evidence/result.json')
                verdict = result['comparison_verdict'] if result['run_status'] == 'COMPLETED' and result['breakdown_complete'] else 'UNKNOWN'
            except (subprocess.TimeoutExpired, OSError, ValueError, KeyError):
                verdict = 'UNKNOWN'
        print(f'{case}/{sample}: {verdict}', flush=True)
        if verdict != row['verdict']:
            failures.append({'case': case, 'sample': sample, 'observed': verdict,
                             'expected': row['verdict']})
    (output / 'mismatches.json').write_text(json.dumps(failures, indent=2) + '\n')
    require(not failures, f'{len(failures)} unresolved or different results; inspect {output}')


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--bundle', type=Path, default=Path(__file__).resolve().parent)
    parser.add_argument('--recheck', action='store_true', help='Run twenty native comparisons; may take hours')
    parser.add_argument('--output', type=Path, default=Path('build/ensemble-10-recheck'))
    args = parser.parse_args()
    try:
        bundle = args.bundle.resolve()
        manifest, rows = verify(bundle)
        if args.recheck:
            recheck(bundle, manifest, rows, args.output.resolve())
        else:
            print('Archived hashes, proof receipts and label paths verified; solver not rerun.')
    except (ValueError, KeyError, OSError) as error:
        parser.exit(1, f'FAIL: {error}\n')


if __name__ == '__main__':
    main()
