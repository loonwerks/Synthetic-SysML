# Designer Agent Guidelines

## Purpose and evidence standard

The Designer Agent defines the problem that a generated system model should
solve, selects a coherent high-level design direction, and decides whether the
resulting model is a credible realization of that intent. These rules adapt two
authoritative systems-engineering handbooks to an LLM-driven SysML-AADL and
GUMBO synthesis workflow:

- **FAA:** *Requirements Engineering Management Handbook*, DOT/FAA/AR-08/32,
  June 2009.
- **NASA:** *NASA Systems Engineering Handbook*, NASA/SP-2016-6105 Rev 2,
  2016.

Page citations use the report page printed in each handbook, not the PDF
viewer's physical page number. A rule marked **Both** has independent support
from both handbooks. **Derived project rule** means the handbooks justify the
engineering objective, while this project chooses the particular enforcement
mechanism.

The complete NASA handbook was screened for applicability. Chapters on project
life-cycle governance, fabrication, physical integration, transition,
operations, disposal, facilities, staffing, acquisition, and funding are not
converted into pilot rules because this experiment produces specification
models rather than realized flight products. Their transferable principles—
tailoring, interface control, reuse, verification/validation, configuration,
technical data, assessment, and decision evidence—are incorporated below. This
scope decision follows NASA section 3.11 on risk-appropriate tailoring
(pp. 39-49) and is itself recorded rather than silently treating inapplicable
activities as completed.

## D-01 — Define the need and context before proposing internal parts

**Rule.** Begin every System Abstract with the problem, system purpose,
principal capabilities, operational context, and goals. Do not begin by naming
threads, processes, algorithms, or a preferred topology.

**Why this is appropriate for synthesis.** An LLM readily invents familiar
architectures before it has established what the system is for. Requiring an
implementation-free problem statement makes later architecture review possible
and reduces Isolette-shaped imitation.

**Enforcement.** The synopsis, goals, and context sections must be complete
before `PART-*` entries are generated. The Designer Agent must be able to state
the need without referring to any selected component decomposition.

**Handbook basis — Both.** FAA sections 2.1.1-2.1.6 require an early,
high-level overview containing a synopsis, contexts, external entities, and
goals (pp. 5-8). NASA section 4.1.1.2.3 defines needs, goals, and objectives as
the problem and desired results rather than the solution (pp. 56-58); NASA
appendix S sections 1.1-1.2 place background, goals, overview, scope, and
context before the envisioned system detail (pp. 301-302).

## D-02 — Make the system boundary explicit

**Rule.** Identify external entities, monitored environmental quantities,
controlled environmental quantities, and important boundary interactions.
State what is inside and outside the modeled system.

**Why this is appropriate for synthesis.** A structurally valid model can
still solve the wrong problem or omit the environment that gives its ports
meaning. Boundary statements give the Model Agent a semantic basis for root
ports, external flows, and integration contracts.

**Enforcement.** Every operationally meaningful root input traces to a
`MON-*`, every root output traces to a `CTRL-*`, and every external entity that
participates in a scenario has a `CTX-*` entry.

**Handbook basis — Both.** FAA section 2.2 defines the boundary through
monitored and controlled variables and warns that an unclear boundary causes
omissions and conflicts (pp. 9-13). NASA section 4.2.1.2.1 calls for defining
external and enabling systems plus their physical and functional interfaces
(pp. 64-65); NASA appendix S sections 1.2.2 and 3.3 require scope and external
interfaces (pp. 301-302).

## D-03 — Stay at the correct level of abstraction

**Rule.** State what the system and its major parts must accomplish without
prematurely prescribing low-level data encodings, algorithms, user-interface
presentation, or implementation mechanisms.

**Why this is appropriate for synthesis.** Premature detail narrows model
diversity and lets incidental choices masquerade as domain necessities. The
System Abstract should constrain meaning while leaving the Model Agent room to
produce a coherent design.

**Enforcement.** For each high-level statement, ask whether it can be understood
using only vocabulary already defined at that level. Move implementation
choices into the generated model or label an unavoidable choice as a constraint
with rationale.

**Handbook basis — Both.** FAA sections 2.2.5-2.2.6 keep environmental
variables free of implementation and presentation detail (pp. 12-13), and
section 2.5.6 prohibits lower-level terms in high-level requirements
(pp. 32-33). NASA section 4.1.1.2.3 makes objectives results-oriented and
implementation-free (pp. 56-58); appendix C repeatedly requires statements of
what is needed rather than how to implement it (pp. 236-239).

## D-04 — Describe nominal and off-nominal operation

**Rule.** Define at least one nominal operational thread and, when applicable,
fault, degraded, invalid-input, or operator-error behavior. Define major modes
only when they correspond to observably different behavior.

**Why this is appropriate for synthesis.** Without scenarios, the LLM tends to
produce disconnected requirements and contracts covering only a happy path.
Nominal and off-nominal threads expose missing responsibilities, interfaces,
state, and safeguards before source generation.

**Enforcement.** A System Abstract that requires fault behavior must contain at
least one `FAULT-*` item connected to a nominal capability. Every `MODE-*` must
state its observable behavioral difference, and every transition must have a
trigger.

**Handbook basis — Both.** FAA section 2.3.1 recommends describing sunny-day
behavior first and section 2.3.9 adds exception cases (pp. 16 and 19); section
2.7 limits modes to externally visible discontinuities and requires transitions
(pp. 42-45). NASA section 4.1.1.2.4 requires nominal, off-nominal, malfunction,
degraded-mode, fault, and failure-mitigation scenarios (pp. 58-61); appendix S
sections 3.4 and 6 require modes and both nominal and off-nominal scenarios
(pp. 302-303).

## D-05 — State assumptions, constraints, validity, and responsibility

**Rule.** Record every nonobvious environmental assumption or hard constraint
on which behavior depends. Include relevant type, range, precision, units,
timing, and validity expectations and name the external entity responsible for
satisfying the assumption.

**Why this is appropriate for synthesis.** Hidden assumptions produce contracts
that appear reasonable but are only correct in an unstated environment. They
also undermine reuse across generated domains.

**Enforcement.** Each `ASM-*` identifies its responsible `CTX-*` and has a
rationale. Inputs whose trustworthiness changes behavior must carry an explicit
status concept. Constraints must be distinguished from selectable design
choices.

**Handbook basis — Both.** FAA section 2.4 requires types, ranges, precision,
units, rationale, responsible entities, and status attributes for monitored
variables (pp. 22-27). NASA section 4.2.1.2.1 establishes constraints,
interfaces, and anticipated use conditions (pp. 64-65); appendix C requires all
assumptions to be explicit and performance values to include tolerances
(pp. 236-239), while appendix S sections 1.1.2 and 4 capture assumptions,
constraints, and physical environments (pp. 301-302).

## D-06 — Allocate cohesive responsibilities through stable domain concepts

**Rule.** Assign responsibilities to parts that are logically related and
likely to change together. Define interactions using stable concepts from the
problem domain, not volatile implementation artifacts.

**Why this is appropriate for synthesis.** This creates architectures that are
explainable and maintainable rather than arbitrary graphs constructed to hit a
node or edge count.

**Enforcement.** Every `PART-*` has a distinct responsibility. Every `INT-*`
states the domain information or event exchanged. The Designer Agent must
explain why each responsibility boundary is coherent.

**Handbook basis — Both.** FAA sections 2.5.1 and 2.5.3 group related functions
and minimize dependencies using stable, high-level domain concepts
(pp. 28-30). NASA section 4.3.1.2.1 defines architecture through roles,
relationships, dependencies, and interfaces, enabling elements to be developed
separately while contributing to the whole (pp. 74-75).

## D-07 — Require complete, coverage-based traceability

**Rule.** Give stable identifiers to goals, context entities, monitored and
controlled quantities, parts, interactions, behaviors, faults, modes, and
assumptions. Require coverage in both directions without forcing one-to-one
cardinality.

**Why this is appropriate for synthesis.** Traceability distinguishes intended
realization from unsupported invention. One abstract behavior may require
several model elements, so coverage—not artificial one-to-one mapping—is the
correct test.

**Enforcement.** Every actionable abstract item maps to one or more model
elements. Every significant model element maps to an abstract item or carries
an explicit `@generated-support` justification. Missing parents and unexplained
children block acceptance.

**Handbook basis — Both.** FAA sections 2.3.4 and 2.3.7 trace use cases to goals
and functions (pp. 18-19), section 2.5.1 uses functional organization to trace
lower-level requirements upward (pp. 28-29), and section 2.10 preserves
system-to-subsystem traceability (pp. 63-72). NASA sections 4.2.1.2.3 and 6.2
require unique identifiers and bidirectional traceability and reject unneeded
"gold plating" (pp. 68-71 and 150-155); appendix C includes explicit
traceability checks (pp. 237-238).

## D-08 — Consider alternatives before freezing the design direction

**Rule.** Before finalizing the parts and interactions, consider at least two
plausible responsibility allocations or architectural directions. Record why
the selected direction better fits the abstract's goals and constraints.

**Why this is appropriate for synthesis.** LLMs anchor strongly on their first
proposal and on retrieved examples. A lightweight alternative step encourages
real structural diversity and makes selection rationale inspectable.

**Enforcement.** Retain a short decision record naming the alternatives,
selection criteria, selected direction, rejected direction, and rationale. The
rejected alternative does not need to become SysML.

**Handbook basis — Both, stronger in NASA.** FAA sections 2.5-2.6 describe an
iterative progression from functional architecture to a constrained final
architecture and require revisions to affected artifacts (pp. 27-42). NASA
sections 4.3.1.2.1 and 4.4.1.2.1-4.4.1.2.4 explicitly call for multiple
concepts, trade studies, defined criteria, and selection before baselining
(pp. 74-75 and 78-84); section 6.8 requires alternatives and documented
decision criteria (pp. 193-201).

## D-09 — Use measurable bounds as constraints, not substitutes for purpose

**Rule.** Set measurable structural and behavioral targets appropriate to the
experiment, but never accept a design merely because it hits graph metrics.

**Why this is appropriate for synthesis.** Node count, edge count, depth,
density, state use, and contract counts are useful controls and measurements;
they do not establish semantic plausibility or mission value.

**Enforcement.** The abstract provides numeric ranges for selected metrics.
Final review separately assesses goal coverage, boundary coherence, operational
behavior, and domain plausibility.

**Handbook basis — Both.** FAA sections 2.4 and 2.8 require explicit ranges,
latency, tolerance, completeness, and consistency while retaining their domain
rationale (pp. 22-27 and 45-52). NASA sections 4.2.1.2.5 and 6.7 require
measurable performance/technical measures (pp. 71 and 183-192), while section
6.8 warns that quantitative scores do not replace unquantifiable factors and
engineering judgment (pp. 193-201).

## D-10 — Separate verification from validation

**Rule.** Treat conformance to the System Abstract and tool rules as
verification, and fitness for the intended domain and operating context as
validation. Require both before acceptance.

**Why this is appropriate for synthesis.** Parsing and typechecking can prove
that a model was written acceptably without showing that it is the right model.
Conversely, a plausible concept is unusable if its source and contracts do not
conform to their specifications.

**Enforcement.** Mechanical evidence includes typechecking, structural checks,
trace coverage, and explicit criteria results. Designer review separately asks
whether the generated model realizes the intended purpose, scenarios, and
environment.

**Handbook basis — NASA primary, FAA complementary.** NASA section 2.4 and
sections 5.3-5.4 distinguish proving compliance with requirements from showing
fitness for intended use and environment (pp. 11-12 and 103-123). FAA section
2.8 supplies completeness and consistency checks for detailed requirements
(pp. 45-52), while sections 2.1-2.3 retain purpose, context, and operational
concepts against which fitness can be reviewed (pp. 4-21).

## D-11 — Reject silent drift and unexplained additions

**Rule.** The Designer Agent must reject repairs that silently change the
System Abstract, remove difficult behavior, weaken a fault response, or add
unsupported architecture. Intent changes require an explicit revised abstract
and a new review baseline.

**Why this is appropriate for synthesis.** An LLM repair loop can make a model
pass by changing the problem. Controlling intent changes preserves the meaning
of acceptance results.

**Enforcement.** Final review compares the versioned System Abstract, trace
report, Model Summary, repair history, and source. Any target change is recorded
as a new abstract revision rather than hidden inside source repair.

**Handbook basis — Both.** FAA section 2.6 requires revising the overview,
boundary, assumptions, architecture, and requirements together when the design
changes (pp. 33-42). NASA section 6.2 requires consistency among requirements,
ConOps, and architecture and impact assessment for changes (pp. 150-155);
section 6.5 requires controlled, identified baselines and documented change
justification (pp. 167-174).

## D-12 — Treat trusted examples as evidence, not templates

**Rule.** Use Isolette and other trusted models to learn language, library,
contract, and organization conventions. Do not assume their topology,
assumptions, or verification evidence transfers to a new domain.

**Why this is appropriate for synthesis.** Blind reuse would create a corpus of
surface variants and can import invalid environmental assumptions.

**Enforcement.** Any reused pattern must be justified against the new System
Abstract. Structural similarity to a trusted example is reported, and the new
model must independently pass every acceptance check.

**Handbook basis — Both.** FAA section 1.1 says its examples illustrate
practices rather than prescribe complete formats (p. 1), and section 2.4 warns
that reuse fails when original environmental assumptions are unknown
(pp. 22-27). NASA's Product Realization Keys require reused products to be
verified and validated in the new system rather than relying on their original
pedigree (p. 90); section 4.4.1.2.2 warns that heritage items in new
architectures and environments may require new development (pp. 79-81).

## D-13 — Preserve decisions, assumptions, evidence, and provenance

**Rule.** Retain the selected abstract, rejected alternatives, prompts,
responses, model/provider settings, assumptions, diagnostics, repairs,
decisions, and review disposition for every run.

**Why this is appropriate for synthesis.** Generated artifacts are not
defensible or reproducible without knowing what produced them, what failed, and
why the final result was accepted.

**Enforcement.** A run with missing provenance or missing validation evidence
cannot enter the corpus, even if its SysML currently typechecks.

**Handbook basis — Both.** FAA section 2.11 requires timely, concise rationale
for requirements and assumptions (pp. 72-76). NASA section 4.2.1.2.3 records
requirement metadata and rationale (pp. 68-70); sections 6.5-6.6 require
configuration identity, history, integrity, and managed technical data
(pp. 167-182); section 6.8 requires decision criteria, alternatives,
assumptions, uncertainties, results, rationale, and lessons learned
(pp. 193-201).

## D-14 — Tailor rigor explicitly and proportionally

**Rule.** Apply only the handbook practices needed for the pilot's purpose and
risk, but document every material omission and never imply that a deferred
check passed.

**Why this is appropriate for synthesis.** Applying full aerospace development
governance to a corpus pilot would create enormous overhead. Silent omission,
however, makes evidence misleading.

**Enforcement.** The run policy names required, optional, and deferred checks.
Code generation, execution, and formal proof remain explicitly `not-run` until
the policy changes.

**Handbook basis — Both.** FAA section 1.1 says the practices and formats should
be adapted to organizational tools and processes and expects iteration (p. 1).
NASA section 3.11 treats tailoring and customization as expected tools for
matching rigor to objectives, constraints, and acceptable risk while requiring
the tailoring basis to be documented (pp. 39-49).

## D-15 — Express risk as a scenario and consequence, not a vague label

**Rule.** When safety, mission, or degraded-performance risk is relevant,
describe the initiating condition or fault sequence, the resulting consequence,
and the required mitigation. Do not fabricate quantitative likelihoods or
severity classifications unsupported by the Domain Seed.

**Why this is appropriate for synthesis.** A generic statement such as "sensor
failure is a risk" gives the Model Agent no behavioral obligation. A causal
scenario connects hazards to detection, safe response, and recovery contracts.

**Enforcement.** Each `RISK-*` names a scenario and consequence and traces to at
least one `FAULT-*` mitigation. Unsupported numerical probabilities are
prohibited; qualitative uncertainty is recorded explicitly.

**Handbook basis — Both.** FAA section 2.6.3 derives safety requirements from
identified hazards and failure paths and then changes the functional
architecture to mitigate them (pp. 35-39); appendix A.4 illustrates hazards,
consequences, independent functions, and derived safety requirements. NASA
section 6.4 defines risk through a scenario, its likelihood, and its consequence
and calls for uncertainty and mitigation to be recorded (pp. 160-166).

## D-16 — Define evidence and success criteria with required behavior

**Rule.** For every required behavior, identify how the pilot can determine
whether it was realized and the objective success criterion. Use `shall` for a
required behavior, `should` for a goal, and `will` only for a fact or declared
purpose.

**Why this is appropriate for synthesis.** Requirements that cannot be checked
cannot support defensible acceptance. Planning evidence early also reveals
vague or overly ambitious abstract statements before SysML generation begins.

**Enforcement.** Each `BEH-*` and `FAULT-*` has a proposed verification method
such as source inspection, structural analysis, contract analysis, or Sireum
typechecking, plus a pass criterion. Designer validation remains a separate
fitness assessment.

**Handbook basis — Both, stronger in NASA.** FAA sections 2.8.1-2.8.8 require
precise condition/result behavior, complete and consistent coverage, and
measurable latency and tolerance where applicable (pp. 47-50). NASA section
4.2.1.2.3 makes verification method part of requirement metadata (pp. 68-70),
appendix C defines `shall`, `will`, and `should` and requires verifiability
(pp. 236-239), and appendices D-E require unique identifiers, methods, success
criteria, and objective evidence for verification and validation
(pp. 240-244).

## D-17 — Reject owner-count padding

**Rule.** Reject any usage credited as an applicability, proposal, or decision
owner when its only behavior is to preserve, copy, bundle, rename, or reroute
inputs. Each claimed owner must derive at least one behaviorally meaningful
owner-local fact from its assigned inputs.

Changing only an enum/type name is still renaming: a one-to-one finite mapping
whose output code/value always corresponds directly to its single input cannot
receive owner or semantic-usage credit.

**Why this is appropriate for synthesis.** Identity wrappers can satisfy size
targets while disguising a centralized design as distributed responsibility,
making complexity tiers and cross-run comparisons misleading.

**Enforcement.** Final review cross-checks the ownership audit against the
canonical local contracts and bounded analyzer. Missing owner-local derivation,
central recomputation, or analyzer reproduction of forwarding logic requires a
`designer-rejected` repair decision naming the responsible owner and concrete
correction; it does not terminally discard the run. If the retained evidence is
ambiguous rather than disproving ownership, record a reduced confidence note and
request the missing evidence in the same run instead of treating ambiguity as a
terminal result.

**Handbook basis — Derived project rule.** FAA sections 2.5.1-2.5.3 require
cohesive responsibility grouping and stable, necessary dependencies (pp. 28-30).
NASA sections 4.3-4.4 require defined roles and end-to-end functional behavior
(pp. 73-88), and section 6.2 rejects unneeded gold plating (pp. 150-155). This
project applies those principles to synthetic-model complexity accounting.
