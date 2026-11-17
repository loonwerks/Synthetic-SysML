"""Offline integrity controls; no model calls or native solver runs."""
import contextlib
import hashlib
import importlib.util
import io
import json
from pathlib import Path
import shutil
import tempfile
import unittest

SOURCE = Path(__file__).resolve().parent
spec = importlib.util.spec_from_file_location('ensemble_verify', SOURCE / 'verify.py')
module = importlib.util.module_from_spec(spec)
spec.loader.exec_module(module)


class ArchiveIntegrity(unittest.TestCase):
    def setUp(self):
        self.temp = tempfile.TemporaryDirectory()
        self.addCleanup(self.temp.cleanup)
        self.bundle = Path(self.temp.name) / 'bundle'
        shutil.copytree(SOURCE, self.bundle, ignore=shutil.ignore_patterns('__pycache__'))

    def verify(self):
        with contextlib.redirect_stdout(io.StringIO()):
            return module.verify(self.bundle)

    def test_saved_archive(self):
        self.verify()

    def test_candidate_edit_rejected(self):
        with (self.bundle / 'battery/candidates/s01.sysml').open('a') as stream:
            stream.write('\n// modified\n')
        with self.assertRaisesRegex(ValueError, 'Hash mismatch'):
            self.verify()

    def test_proof_receipt_conflict_rejected_even_with_updated_hash(self):
        name = 'battery/evidence/oracle/s02/verification.json'
        path = self.bundle / name
        data = module.read(path)
        proof = next(p for p in data['proofs'] if p['category'] == 'atomic')
        proof['outcome'] = 'TOOL_ERROR'
        path.write_text(json.dumps(data))
        manifest = module.read(self.bundle / 'manifest.json')
        manifest['files'][name] = hashlib.sha256(path.read_bytes()).hexdigest()
        (self.bundle / 'manifest.json').write_text(json.dumps(manifest))
        with self.assertRaisesRegex(ValueError, 'proof receipt mismatch'):
            self.verify()

    def test_missing_equivalence_path_rejected(self):
        path = self.bundle / 'manifest.json'
        manifest = module.read(path)
        comparisons = manifest['cases']['battery']['comparisons']
        comparisons[:] = [e for e in comparisons if e['right'] != 's03']
        path.write_text(json.dumps(manifest))
        with self.assertRaisesRegex(ValueError, 'missing or conflicting proof path'):
            self.verify()


if __name__ == '__main__':
    unittest.main()
