# Ten-output reconstruction results

Ten independently generated SysML/GUMBO reconstructions per example, using
GPT-5.6-Terra with high reasoning effort and a 600-second generation cap.

| Example | Reference-equivalent | Weaker than reference |
| --- | ---: | ---: |
| Battery supervisor | **9/10** | 1/10 |
| Repaired HVAC supervisor | **8/10** | 2/10 |

These are per-output fidelity counts against the supplied reference contracts.
Both sets have a reference-equivalent majority. They are two selected examples,
not a population accuracy estimate or a measurement of voting improvement.
Equivalence does not establish that a reference is correct or realizable;
battery health checks remained inconclusive.

From the repository root:

```sh
python3 experiments/ensemble-10/verify.py
```

This checks file hashes, generation receipts, native proof-outcome receipts,
complete 16-unit coverage, and the equivalence paths supporting every row in
[`results.csv`](results.csv). It recomputes the table without model calls or
rerunning the solver. Reference labels propagate only over proved equality;
redundant reference comparisons are unnecessary.

Each case contains the exact requirements (`N.md`), contract-free architecture
(`M-star.sysml`), reference (`oracle.sysml`), ten unchanged candidates, generation
receipts and the supporting native comparison JSON records. The shared prompt
and syntax guide are included. [`manifest.json`](manifest.json) pins hashes,
checker revision, runtime settings and collection provenance. The compact
archive retains outcomes, not the generated HAMR/Logika project trees or solver
transcripts; its receipts are not independently checkable proof certificates.

To rerun all twenty reference comparisons, install the pinned Sireum toolchain,
initialize `external/sysml-aadl-libraries` at the recorded revision, and set
`SIREUM_HOME` as described in the [checker instructions](../../src/equiv_checker/README.md):

```sh
python3 experiments/ensemble-10/verify.py --recheck --output build/ensemble-10-recheck
```

This may take hours, makes no model calls, and requires a new output directory.
Timeouts and tool failures are reported as unresolved, separately from semantic
differences. It does not change the archived results.
