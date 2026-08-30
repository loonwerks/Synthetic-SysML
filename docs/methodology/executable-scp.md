# Executable Spec–Code–Proof Agent Guidelines

These rules extend, rather than replace, the Designer and Model guidelines for
seeds declaring `profile: executable-slang-jvm-v1`.

## E-01 — Keep evaluation context traceable

The Designer maps every `NEED`, `PURPOSE`, `MISSION`, and `SCN` identifier to
an abstract goal, observable behavior, or scenario. Context prose without a
downstream design or validation consequence is reported as informational.

## E-02 — Freeze scenarios before application implementation

The Designer supplies one bounded public scenario for every required family
after approving the System Abstract and before the Application Agent begins.
Scenario steps state boundary inputs and observable outcomes, never internal
method calls. The harness validates and compiles this declarative manifest.

## E-03 — Make execution semantics explicit

Every Thread in the executable slice is periodic and has an operational
`timeTriggered` entrypoint. The logical period and deterministic pipeline order
are experiment assumptions, not physical timing claims. Safe initialization is
formalized and implemented rather than inferred from enum order.

## E-04 — Preserve the generated/application boundary

The Application Agent edits only files under the generated Slang component
directory and never edits generated bridge, GumboX, API, architecture, test,
or contract-owned regions. HAMR regeneration must preserve application logic;
the harness binds both revisions by hashes.

## E-05 — Prove every contract-bearing method

The proof manifest enumerates every contract-bearing `initialise` and
`timeTriggered` method. `sireum proyek logika` verifies the exact retained
project and file. Missing, skipped, timed-out, or unknown methods fail closed.
Model-level `sireum hamr sysml logika` is a separate gate.

## E-06 — Execute application code, not contract predicates

Scenario execution injects boundary values through generated ART
infrastructure, runs the complete scheduler, and observes boundary-delivery
outputs. Calling GumboX predicates, a duplicated policy function, or component
methods in isolation is not system-run evidence.

## E-07 — Separate public repair from held-out evaluation

Public run and formal diagnostics may drive at most two localized repair
rounds. Held-out results are not disclosed until the repair budget closes.
First-pass and repaired evidence remain separately scored.

## E-08 — Classify discrepancies before repair

Use `application-defect`, `model-contract-defect`, `abstract-defect`,
`seed-oracle-defect`, or `infrastructure-defect`. A model repair forces
regeneration, application reconciliation, all proofs, and all scenarios to run
again. A seed/oracle defect invalidates the item rather than penalizing the
candidate.

## E-09 — Keep proof and validation claims distinct

Logika evidence is proof relative to the retained contracts and tool settings.
Concrete scenarios are contextual and integration validation. Neither the
artificial plant fixture nor a finite scenario suite is a completeness,
physical-performance, or safety-certification argument.

