# Logika symbolic-branch failures

This self-contained reproducer contains four SAT verification conditions and
the generated Scala sources they require. It has no Python scripts or custom
runner. The only external requirement is a `sireum` command on `PATH`.

Run every command below from inside
`tests/regressions/logika-symbolic-branches/`.

## Reproduce

EIT VC 02:

```sh
sireum proyek logika --timeout 300 --log-detailed-info --sat --sat-timeout ./eit-project ./eit-project/src/main/bridge/equiv_checker/proofs/root-eit-acquisition-session-coordinator-eitacqu-361c4e09b9/02-361c4e09b9b8-sat-complement.scala
```

EIT VC 04:

```sh
sireum proyek logika --timeout 300 --log-detailed-info --sat --sat-timeout ./eit-project ./eit-project/src/main/bridge/equiv_checker/proofs/root-eit-acquisition-session-coordinator-eitacqu-361c4e09b9/04-361c4e09b9b8-sat-complement.scala
```

HVAC VC 02:

```sh
sireum proyek logika --timeout 300 --log-detailed-info --sat --sat-timeout ./hvac-project ./hvac-project/src/main/bridge/equiv_checker/proofs/root-hvac-visibility-priority-supervisor-hvacsup-a6f3d66458/02-a6f3d664584e-sat-complement.scala
```

HVAC VC 04:

```sh
sireum proyek logika --timeout 300 --log-detailed-info --sat --sat-timeout ./hvac-project ./hvac-project/src/main/bridge/equiv_checker/proofs/root-hvac-visibility-priority-supervisor-hvacsup-a6f3d66458/04-a6f3d664584e-sat-complement.scala
```

Each command runs raw `sireum proyek logika` in SAT mode, checks exactly one
VC, and has a 300-second solver limit.

## What is included

```text
tests/regressions/logika-symbolic-branches/
├── README.md
├── eit-project/
│   ├── bin/project.cmd
│   ├── versions.properties
│   └── src/main/
│       ├── generated EIT types and GumboX dependencies
│       └── exactly two failing EIT VCs
└── hvac-project/
    ├── bin/project.cmd
    ├── versions.properties
    └── src/main/
        ├── generated HVAC types and GumboX dependencies
        └── exactly two failing HVAC VCs
```

Build caches, generated output directories, and the other 364 unrelated proof
VCs from the original projects were intentionally excluded.

The four included VCs are byte-identical to those that failed in the
equivalence-checking campaign. Their SHA-256 hashes are:

```text
3f81d543ff86b204f010767cc674d8942833103f5f244564587036372976720c  EIT VC 02
2d16bf092e32020ba07f30c16195c3f06d4b81d93df291dbfed92c831ce904f6  EIT VC 04
afdeb49b9ea22da910bbe5e2bb6d461dd1e5a128b2ac4181d95a0482918ac03c  HVAC VC 02
018c5b48fef2f91d5e0f4781b2d84348a3234cebcdaa3705c4e0886586824c8a  HVAC VC 04
```

## Observed result

All four commands load the project and reach `Verifying module:
gumbo-semantic-export`. On the tested Sireum installation, each command then
returns exit code 242 without reporting SAT or UNSAT.

The observed Logika elapsed times were:

- EIT VC 02: 13.371 seconds
- EIT VC 04: 59.001 seconds
- HVAC VC 02: 13.816 seconds
- HVAC VC 04: 19.295 seconds

The installation also reported that it used its internal library version
instead of the older version named in each copied `versions.properties` file.
The branch failure therefore reproduces with the installed internal library.

For both EIT VCs it reports:

```text
AcquisitionEligibilityOwner_acquisitionCoordinationProcess_acquisitionEligibilityOwner_Candidate_GumboX.scala
  [21, 70] Error occurred when doing &&-true-branch at [21, 70]
  [21, 70] Error occurred when doing &&-false-branch at [21, 70]
```

Line 21 begins:

```scala
api_eligibilityEnvelope.preparationState == api_preparationState &&
  api_eligibilityEnvelope.monitoringState == api_monitoringState
```

For both HVAC VCs it reports:

```text
EquipmentFaultAssessor_supervision_equipmentFaultAssessor_GumboX.scala
  [99, 66] Error occurred when doing -->:-true-branch at [99, 66]
  [99, 66] Error occurred when doing -->:-false-branch at [99, 66]
```

Line 99 is the implication in:

```scala
(api_equipmentReadiness.validity == Validity.Valid &
  api_equipmentReadiness.thermal == ThermalReadiness.Ready ___>:
  api_thermalPath.thermalReady == ThermalEquipmentAvailability.Available)
```

## Expected result

In SAT mode, Logika should return one of two meaningful results:

- SAT, with an assignment satisfying the `Requires` expression; or
- UNSAT, meaning no assignment satisfies it.

Instead, it returns the branch errors above. Because it produces neither a
model nor an unsatisfiability result, the equivalence checker records these
attempts as tool errors.
