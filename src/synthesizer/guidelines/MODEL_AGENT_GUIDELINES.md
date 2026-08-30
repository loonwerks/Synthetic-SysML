# Model Agent Guidelines

## Purpose and evidence standard

The Model Agent realizes an approved System Abstract as canonical SysML-AADL
source and GUMBO contracts, validates each stage, and repairs localized defects
without redefining the target. Evidence references use:

- **FAA:** *Requirements Engineering Management Handbook*, DOT/FAA/AR-08/32,
  June 2009.
- **NASA:** *NASA Systems Engineering Handbook*, NASA/SP-2016-6105 Rev 2,
  2016.

Page citations use report page numbers. **Derived project rule** identifies an
enforcement choice selected by this project rather than language directly
mandated by either handbook.

## M-01 — Treat SysML source as the authoritative model

**Rule.** Author `.sysml` directly using the repository's SysML-AADL library
semantics. Derived graphs, summaries, and fingerprints may inspect the source
but may not become a competing source of truth.

**Why this is appropriate for synthesis.** One authoritative representation
prevents repair, metrics, visualization, and validation from reasoning about
different versions of the system.

**Enforcement.** Every derived artifact records the source revision or hash.
No derived view may be edited to change model meaning.

**Handbook basis — Derived project rule.** NASA configuration management
requires a known configuration, consistency between the product and its
information, unique identification, and controlled baselines (section 6.5,
pp. 167-174). FAA section 2.5 notes that tools may generate different views of
one underlying specification (pp. 27-28). This project selects SysML source as
that underlying specification.

## M-02 — Build by successive, validated refinement

**Rule.** Generate in stages: packages and types; architecture and connections;
then state, modes, detailed behavior, and GUMBO. Validate each stable stage
before increasing detail.

**Why this is appropriate for synthesis.** Staging localizes failures and
prevents an invalid architecture from being obscured by large quantities of
contract text.

**Enforcement.** The architecture checkpoint must pass its required checks
before contract generation begins. Later repair may return to architecture only
through an explicit stage rollback.

**Handbook basis — Both.** FAA recommended practices progress iteratively from
overview and boundary through functional architecture, modes, and detailed
requirements (sections 2.1-2.8, pp. 4-52). NASA sections 2.1, 4.3, and 4.4
describe recursive, iterative decomposition and successive refinement from
expectations to requirements, architecture, and design (pp. 5-8 and 73-88).

## M-03 — Realize responsibilities, not arbitrary graph targets

**Rule.** Every component must own a traced responsibility, and every
interaction must carry information or an event needed by a responsibility or
boundary scenario. Do not add components or connections solely to satisfy graph
metrics.

**Why this is appropriate for synthesis.** Syntactically valid random topology
does not constitute a system design. System value arises from relationships
that jointly provide the required capability.

**Enforcement.** Untraced components and unexplained connections fail
structural review. Average degree and density are measurements and constraints,
not optimization objectives.

**Handbook basis — Both.** FAA section 2.5 organizes requirements into related
functions and stable dependencies (pp. 27-33). NASA chapter 2 states that
system-level value is created primarily by how parts are interconnected
(pp. 3-4), and section 4.3 requires roles, relationships, dependencies,
interfaces, and end-to-end functional paths (pp. 73-76).

## M-04 — Provide exactly one explicit root system usage

**Rule.** Every generated source project has one explicit root system usage
that encloses or references the modeled architecture.

**Why this is appropriate for synthesis.** The root makes scope unambiguous for
parsing, visualization, reachability, graph metrics, boundary-port analysis,
and potential future HAMR code generation.

**Enforcement.** Zero or multiple generated roots fail structural acceptance.
Imported library definitions are excluded from the count.

**Handbook basis — Derived project rule.** FAA section 2.2 and NASA appendix S
section 1.2.2 require an explicit system boundary and scope (FAA pp. 9-13;
NASA p. 301). This project realizes that objective through one SysML root usage.

## M-05 — Make every interface explicit and compatible

**Rule.** Define each port and connection with an unambiguous direction, kind,
payload type, source, destination, and domain meaning. Preserve compatibility
across both ends of every interface.

**Why this is appropriate for synthesis.** Interface mismatches are a primary
way independently plausible components fail to form a coherent system.

**Enforcement.** Reject unresolved endpoints, direction errors, kind/type
mismatches, duplicate accidental connections, and abstract interactions with no
realizing connection. Record boundary connections separately from internal
component edges.

**Handbook basis — Both.** FAA sections 2.2.4-2.2.7 require correct abstraction
and complete physical interfaces (pp. 12-13), and section 2.5.2 uses data flows
to expose function dependencies (pp. 29-30). NASA section 6.3 calls interface
definition, compatibility, documentation, and change control crucial
(pp. 156-159); appendix C requires all internal and external interfaces to be
necessary, sufficient, and consistent (pp. 238-239).

## M-06 — Define data semantics, bounds, units, and validity

**Rule.** Model data using types that preserve the System Abstract's physical
or operational meaning. Include ranges, units, precision, and validity/status
where those distinctions affect behavior.

**Why this is appropriate for synthesis.** A port named `temperature` is not a
complete interface if its units, valid range, or trust state are unknown.

**Enforcement.** Each `MON-*` and `CTRL-*` must map to a compatible SysML type.
Validity-bearing values use explicit status rather than magic values. Initial
status prevents unsensed data from being treated as trustworthy.

Fields of a `Data` record type that GUMBO expressions inspect are declared as
`attribute` members, never nested `part` members. A GUMBO member-not-found
diagnostic triggers inspection of the receiving type declaration; if the
intended field was modeled as a nested `part`, repair the representation to an
`attribute` instead of merely renaming the member or routing around the failed
access. This syntax-level repair preserves the approved semantic interactions
and owner-local facts.

**Handbook basis — Both.** FAA section 2.4.1 and 2.4.5 require type, range,
precision, units, status, and safe initial trust state (pp. 23-27). NASA
appendix C requires tolerances, accuracy, precision, timing, interfaces, and
explicit assumptions (pp. 236-239); section 4.2 includes functional,
performance, interface, environmental, and safety requirements (pp. 63-72).

## M-07 — Maintain coverage-based trace links in the source

**Rule.** Annotate every significant component, port, connection, state item,
and contract clause with its System Abstract identifier or an explicit
generated-support rationale.

**Why this is appropriate for synthesis.** Trace links enable automated
coverage checks and make unsupported invention visible during review.

**Enforcement.** Use adjacent `// @trace ...` comments for architectural
elements and related stable identifiers for GUMBO clauses. Trace links may be
one-to-many or many-to-one, but may not be absent.

**Handbook basis — Both.** FAA sections 2.3.4, 2.3.7, 2.5.1, and 2.10 establish
goal-to-scenario-to-function and system-to-subsystem traceability
(pp. 18-19, 28-29, and 63-72). NASA sections 4.2.1.2.3 and 6.2 require unique
identifiers, parent/child relationships, and bidirectional traceability
(pp. 68-71 and 150-155); appendix C requires unique referencing and
bidirectional traceability (pp. 237-238).

## M-08 — Write behavioral requirements as precise conditions and outcomes

**Rule.** Each detailed GUMBO behavior states the applicable mode and condition
and then constrains an output or state result. Keep one principal behavioral
obligation per clause.

**Why this is appropriate for synthesis.** Condition/outcome structure lowers
ambiguity, improves reviewability, and supports automated completeness and
overlap analysis.

**Enforcement.** Avoid clauses containing several unrelated obligations,
ambiguous pronouns, vague qualifiers, or prose that has no formal expression.
Clause descriptions and formulas must agree.

**Handbook basis — Both.** FAA sections 2.8.1-2.8.2 prescribe conditions,
modes, and assigned controlled-variable values (pp. 47-48). NASA appendix C
requires one subject, predicate, and thought per requirement, active and
unambiguous language, and verifiable criteria (pp. 236-239).

## M-09 — Make contracts complete, consistent, nonduplicative, and nontrivial

**Rule.** For every controlled output and relevant state, cover all intended
modes and admissible conditions, assign no conflicting outcomes, avoid
duplicate cases, and reject vacuous guarantees.

**Why this is appropriate for synthesis.** Typechecking does not detect a
contract that is always true, leaves outputs unconstrained, or gives
contradictory results under overlapping guards.

**Enforcement.** Perform coverage, overlap, satisfiability, output-dependence,
and triviality checks when supported. Use an explicit unconstrained or
unspecified state only when the abstract permits it and downstream consumers
can identify it.

**Handbook basis — Both.** FAA sections 2.8.3-2.8.5 require complete,
consistent, nonduplicative assignments for every system state (pp. 47-49).
NASA section 4.2.1.2.4 checks correctness, feasibility, uniqueness, and
over-specification (pp. 70-71), while appendix C checks completeness,
consistency, functionality, and explicit don't-care conditions (pp. 237-239).

## M-10 — Model modes and state only when behavior requires them

**Rule.** Introduce state and modes to represent memory or observably different
behavior, not to inflate complexity. Specify initialization and every allowed
mode transition.

**Why this is appropriate for synthesis.** Gratuitous state creates apparent
sophistication without semantic value; missing initialization and transitions
make genuine stateful behavior incomplete.

**Enforcement.** Every state variable affects a traced behavior. Every mode has
an observable consequence, an initialization path, and defined transitions.

**Handbook basis — Both.** FAA section 2.7 restricts modes to externally visible
behavioral discontinuities and requires transitions (pp. 42-45); section 2.8
requires behavior for every system state (pp. 45-52). NASA sections 4.3-4.4 use
time, behavior, states, and modes in logical decomposition (pp. 73-88), and
appendix S sections 3.4 and 6 require operational modes and scenarios
(pp. 302-303).

## M-11 — Specify fault, degraded, and untrustworthy-input behavior

**Rule.** When the System Abstract identifies a hazard, fault, degraded mode,
invalid input, stale value, or operator error, explicitly model detection,
response, safe output, and recovery or latching behavior.

**Why this is appropriate for synthesis.** A nominal-only model is not a
credible realization of a system whose purpose includes monitoring or safe
control.

**Enforcement.** Every `FAULT-*` traces to at least one formal behavior. Invalid
or unknown monitored data cannot silently take the nominal path. Unhandled
fault entries block acceptance.

**Handbook basis — Both.** FAA sections 2.3.9, 2.4.5, and 2.6.5 require
exception handling and explicit trust status (pp. 19, 26-27, and 39-40).
NASA section 4.1.1.2.4 and appendix S section 6.2 require off-nominal,
malfunction, degraded, hazard, fault, and operator-error scenarios
(pp. 58-61 and 303); appendix C requires error detection, reporting, handling,
recovery, and fault survivability (p. 239).

## M-12 — Keep assumptions, guarantees, design choices, and rationale distinct

**Rule.** Use assumptions for obligations on the environment, guarantees for
system obligations, explicit annotations for derived design choices, and prose
rationale only to explain why.

**Why this is appropriate for synthesis.** Mixing these categories can make a
system appear verified by assuming the behavior it was meant to guarantee or
can hide a new requirement inside nonbinding prose.

**Enforcement.** Rationale must not introduce behavior absent from the formal
clause. A derived choice affecting observable behavior must trace upward or be
reported to the Designer Agent.

**Handbook basis — Both.** FAA section 2.4 frames environmental assumptions as
environment obligations (pp. 22-27), sections 2.5.7 and 2.11 separate rationale
from requirements (pp. 32-33 and 72-76), and section 2.9.6 identifies derived
requirements (pp. 58-59). NASA section 4.2.1.2.3 distinguishes requirement
rationale, assumptions, and design constraints (pp. 68-70), while appendix C
requires rationale and assumptions without mixing them into requirement text
(pp. 236-239).

## M-13 — Verify each stage, then validate the complete design against intent

**Rule.** Run the prescribed mechanical checks at each checkpoint. Do not use a
passing parser or typechecker as evidence that the generated model is suitable
for its domain.

**Why this is appropriate for synthesis.** Verification asks whether the model
conforms to its stated rules; validation asks whether it realizes the intended
system. Both failure classes must remain visible.

**Enforcement.** The Model Agent supplies typecheck, structural, contract, and
trace evidence. The Designer Agent performs the separate intent/domain review.
Reports use `passed`, `failed`, or `not-run`; absence is never interpreted as a
pass.

**Handbook basis — NASA primary, FAA complementary.** NASA section 2.4 and
sections 5.3-5.4 distinguish compliance from suitability in the intended
environment and require objective results and discrepancy records
(pp. 11-12 and 103-123). FAA section 2.8 provides detailed completeness and
consistency checks (pp. 45-52), while the overview and operational concepts
provide the intent against which the result is reviewed (sections 2.1-2.3,
pp. 4-21).

## M-14 — Repair locally and rerun affected checks

**Rule.** Repair the smallest coherent source region that addresses the
diagnostic. Preserve previously correct behavior, rerun all affected checks,
and never weaken the System Abstract to obtain a pass.

**Why this is appropriate for synthesis.** Unbounded regeneration can fix one
error while silently introducing new defects or changing the intended system.

**Enforcement.** Each repair records the diagnostic, files changed, rationale,
and before/after validation results. Architecture-changing repairs roll back to
the architecture checkpoint. Previously passed checks affected by the change
are rerun as regression checks.

On a resumed localized repair, the harness supplies one repair request with a
small context-file allowlist. Read that scope first and expand it only for a
specific unresolved dependency; do not repeat repository discovery or rebuild
an already approved architecture. The complete mechanical Model gates still run
after the patch, so reduced prompt context does not weaken acceptance.

**Handbook basis — Both.** FAA section 2.6 requires coordinated revision of the
overview, boundary, assumptions, architecture, and requirements when changes
occur (pp. 33-42). NASA section 5.4.1.2.3 warns that corrective action can break
previously satisfactory behavior and recommends regression testing
(pp. 120-121); sections 6.2 and 6.5 require impact assessment and controlled
changes (pp. 150-155 and 167-174).

## M-15 — Preserve configuration identity and complete run evidence

**Rule.** Retain source hashes, prompts, responses, tool/model versions,
diagnostics, metrics, repairs, decisions, and final disposition. Never overwrite
evidence from an earlier stage or attempt.

**Why this is appropriate for synthesis.** Without configuration and
provenance, an accepted model cannot be reproduced, audited, compared, or used
as reliable experimental evidence.

**Enforcement.** Every derived result identifies the exact source revision and
tool configuration. Repair invocations preserve earlier wire evidence and stay
in the same run. Accepted runs become immutable; an operator may explicitly
archive a diagnosed no-progress checkpoint.

**Handbook basis — Both.** FAA section 2.11 preserves rationale and sources
(pp. 72-76). NASA sections 6.5-6.6 require unique configuration identity,
historical status, data integrity, accessibility, decisions, assumptions,
anomalies, and lessons learned (pp. 167-182); sections 5.3-5.4 require the
verified/validated configuration, procedures, methods, results, discrepancies,
and corrective actions to be reported (pp. 103-123).

## M-16 — Revalidate every reused pattern in its new context

**Rule.** Reuse syntax and modeling idioms from trusted examples only after
checking their assumptions, interfaces, behavior, and role against the current
System Abstract. Do not copy a complete decomposition and rename it.

**Why this is appropriate for synthesis.** Context-free reuse creates surface
variants and imports assumptions or safety behavior that may not apply.

**Enforcement.** Reused patterns are noted in provenance and independently pass
the current run's checks. Semantic fingerprints and structural similarity are
retained to identify clone-like outputs.

**Handbook basis — Both.** FAA section 1.1 describes its examples as
illustrative rather than complete templates (p. 1), and section 2.4 explains
that reuse without known environmental assumptions causes failures
(pp. 22-27). NASA's Product Realization Keys require reused products to be
verified and validated for their new system (p. 90); section 4.4.1.2.2 treats
heritage products in new architectures or environments as requiring renewed
assessment (pp. 79-81).

## M-17 — Do not count identity wrappers as behavior owners

**Rule.** A usage claimed as an applicability, proposal, or decision owner must
derive at least one behaviorally meaningful owner-local fact from its assigned
inputs. A usage whose contracts only preserve, copy, bundle, rename, or reroute
inputs is an identity wrapper, not a behavior owner.

A bijective enum or integer-code translation remains an identity wrapper when
the output differs only by type or label. A substantive owner must introduce a
reviewable classification, combination, state-dependent choice, or other
policy distinction; `outputCode == inputCode` does not qualify.

**Why this is appropriate for synthesis.** Component and owner targets can
otherwise reward decomposition that changes only the apparent size of a model,
without adding an independently reviewable responsibility or decision boundary.

**Enforcement.** `metrics.json` identifies every claimed owner, its assigned
inputs, owner-local facts, contract cases, and analyzer checks. The bounded
analyzer executes those same local cases; centrally recomputing a final result
or reproducing forwarding logic does not establish ownership. Identity wrappers
receive neither owner credit nor semantic-usage credit.

**Handbook basis — Derived project rule.** FAA sections 2.5.1-2.5.3 organize
cohesive functions around stable domain responsibilities (pp. 28-30). NASA
sections 4.3-4.4 require architecture elements to have defined roles,
relationships, and behavior that contribute to end-to-end function (pp. 73-88).
This project makes those objectives auditable for complexity-controlled model
generation.
