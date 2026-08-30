# Offline Verus verification

## Final status

Status: **passed after regeneration**.

Each of the eight behavior crates was run from its crate directory with:

```sh
CARGO_NET_OFFLINE=true make verus
```

The first all-eight pass succeeded before regeneration. The repaired model was
then regenerated unchanged, all eight application files were preserved
byte-for-byte, and the same eight commands succeeded again. The governing
aggregate is `rust/proof/verus-accepted-final-pass2/aggregate.log` (SHA-256
`825c70d6d11dc1b923f2a23f7352e3257ccdda8d1512d0b9dfe25158880ccc9d`).

| Owner | Crate | Final verified | Errors | Exit |
| --- | --- | ---: | ---: | ---: |
| PART-FCS-01 | `crewCommandQualifier_behavior` | 9 | 0 | 0 |
| PART-FCS-02 | `attitudeSafetyQualifier_behavior` | 8 | 0 | 0 |
| PART-FGS-01 | `referenceManager_behavior` | 11 | 0 | 0 |
| PART-FGS-02 | `fdGuidanceHealthGenerator_behavior` | 10 | 0 | 0 |
| PART-FGS-03 | `apGuidanceGenerator_behavior` | 9 | 0 | 0 |
| PART-APS-01 | `apEngagementManager_behavior` | 13 | 0 | 0 |
| PART-APS-02 | `actuatorRateProposer_behavior` | 9 | 0 | 0 |
| PART-APS-03 | `actuatorSafetyGate_behavior` | 9 | 0 | 0 |
| **Owner total** | **8 crates** | **78** | **0** | **all 0** |

Each isolated invocation also re-reported 38 verified / 0 errors from the
generated `data` dependency and 0 verified / 0 errors from the specification-only
`FlightStack` crate. Thus the aggregate text contains 304 repeated generated-data
successes plus 78 owner-crate successes: 382 tool-reported verified results and
0 errors across the eight invocations. The non-duplicated implementation claim
is the 78 owner-crate obligations above.

## Iteration and regeneration evidence

- Baseline and repair iterations:
  `rust/proof/verus-iterations/first-pass/`.
- First successful pre-regeneration logs: each crate's `.03.log` in that
  directory; 78 verified / 0 errors total.
- Pre-regeneration hashes:
  `rust/proof/application-hashes.accepted.before-regeneration.txt`.
- Regeneration command/output/exit:
  `rust/proof/regeneration-accepted-final.log` (exit 0).
- Post-regeneration hashes:
  `rust/proof/application-hashes.accepted.after-regeneration.txt`.
- Preservation verdict: the two accepted manifests compare equal: 8 files, 0
  byte differences. Both manifests have SHA-256
  `263074211986f9c56f69b8fb137c59fdb355acc13b0f3a748c91d5bec822dc73`.
- Per-crate final logs: `rust/proof/verus-accepted-final-pass2/`.

## What is proved

All eight semantic `initialize`/`timeTriggered` implementations are verified
against substantive generated `CASE_*_spec` postconditions covering all 20 CASE
mappings. They use generated API inputs and outputs and retain only the accepted
persistent state: four reference-manager fields and one AP-mode field. There
are zero application placeholder files, zero application `requires` clauses,
and zero `assume`/`admit` statements.

The owner implementations avoid relying on external enum equality by exhaustive
matching and avoid arithmetic overflow assumptions by using widened
intermediates. Generated API bridges remain generator-owned; their external
device I/O is connected to ghost I/O contracts. The only `external_body`
declarations in application files are non-semantic logging wrappers.

## Explicit exclusion

The current HAMR Microkit backend did not lower datatype invariants for
`AircraftAttitude`, `PairedFdGuidance`, `PairedApStatus`, `ActuatorCommand`, and
`ProposedActuatorRates`. The five source invariants remain in both SysML sources
but are not included in this Verus proof claim. No assumptions or application
preconditions were used to claim them. There are no remaining proof blockers.
