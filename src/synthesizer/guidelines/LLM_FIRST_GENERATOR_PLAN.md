# LLM-First Generator: Initial Experiment Plan

## Goal

Establish whether a three-agent, direct-SysML workflow can generate, verify,
review, and clearly present one small SysML-AADL system model with meaningful
GUMBO contracts. The first attempt optimizes for completing and diagnosing the
entire handoff, not corpus scale or cross-domain diversity. Code generation and
executable application implementations are out of scope.

## Agreed operating model

The **Designer Agent** creates a concise System Abstract, delegates its
realization, and conducts final semantic review. One **Model Agent** authors the
SysML source directly, first establishing the architecture and then adding
formal behavior. One **Visualization Agent** turns a selected reviewable model
revision into a faithful overview diagram and reviews the rendered artifact.
Derived representations are inspection aids; SysML remains the source of truth.

The enforceable rules for these roles are maintained in
[`DESIGNER_AGENT_GUIDELINES.md`](./DESIGNER_AGENT_GUIDELINES.md) and
[`MODEL_AGENT_GUIDELINES.md`](./MODEL_AGENT_GUIDELINES.md), and
[`VISUALIZATION_AGENT_GUIDELINES.md`](./VISUALIZATION_AGENT_GUIDELINES.md). A
run policy may tailor a rule only by recording the omitted check, its
justification, and the resulting risk. A tailored or unrun check is never
reported as passed.

Each run follows this loop:

1. Designer Agent creates the System Abstract from a Domain Seed and the common
   generator policy. Before freezing its parts, it considers at least two
   plausible responsibility allocations and retains a short selection record.
2. Model Agent creates packages, domain types, components, ports, connections,
   properties, and exactly one root system usage.
3. The architecture is typechecked and inspected structurally.
4. Model Agent adds state, modes, initialization, compute behavior, fault
   behavior, and GUMBO contracts required by the abstract.
5. The complete project is typechecked and inspected for contract and trace
   coverage.
6. Model Agent receives localized diagnostics and repairs the retained
   candidate in the same run. A negative finding is a resumable checkpoint,
   not a reason to discard otherwise useful generation work.
7. Visualization Agent inspects the exact project, model revision, and root;
   creates one named overview view; runs diagram-health checks; and exports a
   deterministic SVG with metadata.
8. Visualization Agent reviews the rendered artifact against its stated
   audience and purpose. It returns semantic defects to the Model Agent and
   presentation defects to its own localized correction loop.
9. The harness requires the mechanical source, bounded analyzer, complexity,
   visualization-health, source-binding, and traceability gates to be green.
   A failed deterministic gate returns directly to its owning repair stage and
   does not spend a full Designer-review invocation.
10. Designer Agent compares the System Abstract, derived Model Summary,
   traceability report, overview diagram, visualization review, and source
   once the deterministic evidence is green, then accepts the model or routes
   the smallest remaining semantic repair to its owner.

Reusable Domain Seed generation is a separate preparation job. A published,
complexity-neutral seed is reused by the Small, Medium, and Hard synthesis
runs, so each synthesis run contains three logical agents: Designer, Model, and
Visualization.

## Handbook guidance adopted for the System Abstract

The source is the FAA *Requirements Engineering Management Handbook*,
DOT/FAA/AR-08/32, available in this repository as
*Requirements Engineering Management Handbook*, DOT/FAA/AR-08/32.
The handbook explicitly permits organizations to tailor its formats to their
tools and processes (Executive Summary and section 1.1, report pages xi and 1),
so the compact template below preserves its information objectives without
copying its tables.

The complementary NASA source is the *NASA Systems Engineering Handbook*,
NASA/SP-2016-6105 Rev 2, available in this repository as
*NASA Systems Engineering Handbook*, NASA/SP-2016-6105 Rev 2.
NASA adds explicit practices for stakeholder expectations, alternative design
concepts, verification versus validation, bidirectional traceability,
interface/configuration/data management, technical assessment, and recorded
decision analysis. Exact combined citations and the synthesis-specific
justification for each rule are maintained in the three agent-guideline
documents.

The pilot adopts these practices:

- Start with a short synopsis naming the system, its purpose, and principal
  capabilities; keep it high-level and useful for quickly orienting a reader
  (section 2.1.1-2.1.2, pages 5-6).
- State the operational context, external entities, and interactions before
  opening the system black box (section 2.1.3-2.1.5, pages 6-7).
- Establish the boundary in terms of monitored and controlled environmental
  quantities. Keep them abstract and independent of presentation or accidental
  implementation details (section 2.2, pages 9-13).
- Describe nominal behavior first and exceptional or fault behavior as an
  extension (section 2.3.1 and 2.3.9, pages 16 and 19).
- Record essential environmental assumptions, especially type, range,
  precision, units, and validity/status expectations. Associate each assumption
  with the entity responsible for satisfying it (section 2.4, pages 22-27).
- Group responsibilities that are logically related and likely to change
  together. Communicate between them using stable, high-level domain concepts
  rather than volatile implementation details (section 2.5.1 and 2.5.3, pages
  28-30).
- Keep high-level statements genuinely high-level; do not pull lower-level
  behavioral detail into the overview (section 2.5.6, pages 32-33).
- Identify modes only when they correspond to externally visible behavioral
  discontinuities, and state the allowed transitions (section 2.7, pages
  42-45).
- At the detailed-contract stage, specify behavior as a condition and assigned
  result, and check coverage, consistency, and duplication for every controlled
  variable (section 2.8.1-2.8.6, pages 47-49).
- Keep rationale separate from required behavior. Rationale explains why; it
  must not become a second, nonbinding source of requirements (section 2.11,
  pages 72-76).
- Give an independently understandable overview to any subsystem whose
  requirements are allocated separately, while preserving traceability to the
  parent function (section 2.10.2-2.10.3, pages 67-69).

The appendix examples support the same organization across distinct scales:
the Isolette System Overview and detailed thermostat decomposition appear in
appendix A.1 and A.5; the FCS overview and allocation appear in appendix B.1
and B.4; and the independently understandable FGS and Autopilot subsystem
overviews appear in appendices C.1 and D.1.

## System Abstract template

The abstract is Markdown with minimal YAML front matter. Lists use identified
paragraphs rather than tables.

```markdown
---
abstract_id: SA-0001
domain_seed: greenhouse-ventilation-v1
node_count: [4, 6]
edge_count: [5, 9]
containment_depth: [1, 2]
requires_stateful_behavior: false
requires_fault_behavior: true
---

# <System name>

## Synopsis

<Purpose, operating environment, and principal capabilities in one or two
short paragraphs. Avoid internal design details.>

## Goals

GOAL-01: <High-level outcome.>

Rationale: <Why this outcome matters, when not obvious.>

## Operational context and system boundary

CTX-01: <External entity>

<How it interacts with the system.>

MON-01: <Monitored environmental quantity>

<Meaning, source entity, type/range/unit expectations, and status expectation.>

CTRL-01: <Controlled environmental quantity>

<Meaning, receiving entity, and directly controlled effect.>

## Parts and responsibilities

PART-01: <Part name>

<Responsibility stated without detailed implementation.>

PART-02: <Part name>

<Responsibility stated without detailed implementation.>

## Interactions

INT-01: <PART-01 provides information or an event to PART-02.>

INT-02: <PART-02 provides information or an event to PART-03.>

## Nominal behavior

BEH-01: <The system shall provide a high-level required response under a stated
condition.>

Verification: <Inspection or analysis method and objective pass criterion.>

## Hazards and risks

RISK-01: <Initiating scenario and resulting consequence. Do not invent a
likelihood or severity unsupported by the Domain Seed.>

## Fault and degraded behavior

FAULT-01: <The system shall provide a high-level response that mitigates
RISK-01.>

Verification: <Inspection or analysis method and objective pass criterion.>

## Modes

MODE-01: <Externally distinguishable mode and its behavioral significance.>

TRANS-01: <Allowed transition and triggering condition.>

## Essential environmental assumptions

ASM-01: <Assumption and the external entity responsible for satisfying it.>

Rationale: <Why the assumption or selected bound is necessary.>
```

Sections with no justified content may be marked `None` rather than filled with
invented detail. The Designer Agent must not use `None` for nominal behavior.

## Trace convention

System Abstract identifiers are stable within a run. Generated architecture
elements use adjacent comments such as:

```sysml
// @trace PART-02 INT-01
part def Regulator_i :> Thread {
  // @trace MON-01 INT-01
  in port temperature : TempStatusPort;
}
```

GUMBO clause identifiers reuse or extend the corresponding behavior identifier,
for example `BEH_01`, `BEH_01_LOW`, and `FAULT_01_INVALID_SENSOR`.

Traceability is coverage-based:

- every abstract identifier must be realized, explicitly marked deferred, or
  declared informational;
- every significant generated component, port, connection, state variable, and
  contract clause must trace to an abstract identifier or use an explicit
  `@generated-support <reason>` annotation;
- a trace link may be one-to-many or many-to-one;
- missing coverage and unexplained additions block acceptance.

## Architecture metrics

Metrics are computed over component usages reachable from the root:

- `V`: architecture-node count;
- `E`: resolved directed port-connection count between component usages;
- containment depth;
- average total vertex degree, `2E / V`;
- density of unique ordered component pairs,
  `unique_pairs / (V * (V - 1))`;
- number and membership of weakly connected components.

Node count, edge count, and containment depth are initial hard bounds. Average
degree, density, and connected-component information are retained for review
but are not initial acceptance gates. A disconnected region is not rejected
automatically: it is rejected when it has no traced responsibility or no
meaningful path involving a system boundary interaction.

Responsibility ownership is behavioral, not structural: forwarding, renaming,
bundling, or bijectively translating an input does not earn owner or semantic-
usage credit unless the usage derives a distinct reviewable domain fact from
its assigned inputs. The metrics ownership audit, canonical local contracts,
and bounded analyzer must agree on that derivation.

## First generation attempt: one vertical slice

The first attempt is one immutable run, not a corpus experiment. Its purpose is
to determine whether the three roles can complete their handoffs and produce
diagnosable evidence without a human editing SysML or visual state.

### Domain and intended capability

Generate a **single-zone greenhouse ventilation controller**. The system
receives a temperature measurement with an explicit validity status and an
operator-selected upper temperature limit. It commands one ventilation fan and
reports whether the temperature input is invalid.

The versioned Domain Seed supplies the following facts as pilot assumptions,
not as claims about production greenhouse engineering:

- temperature values use degrees Celsius;
- the representable sensor range is `-20..60`;
- the selectable upper limit is `10..35`;
- a valid temperature above the selected limit requires ventilation on;
- a valid temperature at or below the selected limit requires ventilation off;
- an invalid temperature requires ventilation off and the sensor-fault status
  asserted.

This intentionally stateless threshold policy avoids hysteresis, timing,
redundancy, scheduling, deployment, and physical actuator feedback in the first
attempt. Those are meaningful later dimensions, not prerequisites for proving
the generation loop.

### Design freedom and structural bounds

The System Abstract specifies responsibilities for measurement intake and
validation, operator configuration, control decision, fan-command delivery,
and status reporting. The Designer Agent considers at least these two
allocations before selecting one:

- validation is owned by a separate input-adaptation part; or
- validation is owned by the control-decision part.

The Designer may name and group the final parts but must remain within:

- 4-6 reachable component usages;
- 5-9 resolved directed component connections;
- containment depth of at most 2 beneath the root;
- exactly one root system usage and one weakly connected architectural region;
- no modes, state machine, deployment bindings, or nested subsystem expansion.

Source generation is restricted to the AADL-oriented SysML component, port,
connection, type, and GUMBO forms already exercised by the trusted Isolette and
the current `sysml-viz` focused parser. The first run does not introduce a new
language construct and a parser extension at the same time.

Node and edge bounds constrain size; they are not optimization targets. No
component or edge may be introduced only to reach a bound.

### Contract scope

GUMBO is limited to the smallest behaviorally useful set:

- initialization of the fan command and fault indication, if required by the
  selected component form;
- one guarantee for valid temperature above the selected limit;
- one guarantee for valid temperature at or below the selected limit;
- one guarantee for invalid temperature;
- range or well-formedness assumptions only when they correspond to the Domain
  Seed or modeled input type.

There is no requirement for compositional proof, solver certification,
GumboX/HAMR code generation, executable application logic, or contracts on
pass-through components. `hamr sysml tipe` remains the formal source gate.
`sysml-viz` parsing and rendering are presentation gates; they do not replace
the Sireum/HAMR result.

### Visualization scope

The Visualization Agent creates exactly one named `system-overview` view for a
reviewer trying to understand the boundary, responsibility allocation, and
principal flows. The view:

- uses the explicit root and shows all 4-6 semantic component usages;
- adds greenhouse sensor, operator, fan, and status recipient only when needed
  as clearly non-semantic context actors;
- uses data/control-flow direction and only essential edge labels;
- does not expand nested content or reproduce GUMBO text;
- has zero unresolved endpoints, node overlaps, clipped or truncated text, and
  out-of-bounds objects;
- records and justifies any remaining crossing or label-contact finding; and
- exports deterministic `system-overview.svg` plus its metadata sidecar.

Presentation correction stays in the same run while the retained view makes
substantive progress. A semantic problem discovered while visualizing is routed
to Designer resolution and Model regeneration of that same candidate; it is
never hidden in visual state.

### Repair-first run and stop conditions

- Negative `failed`, `blocker`, or `rejected` agent dispositions checkpoint and
  route the same candidate to the role capable of repairing it.
- There is no token, iteration, architecture-repair, contract-repair, or
  presentation-repair budget that automatically rejects a candidate.
- Automatic repair continues while substantive candidate or view artifacts
  change. Repetition of the same diagnostic with an unchanged substantive
  fingerprint pauses for operator diagnosis; it does not create a replacement
  attempt or terminal rejection.
- Repair requests identify the exact diagnostic, smallest requested actions,
  and a narrow initial context-file list. Model and Visualization repairs use
  compact repair-specific prompts and expand context only for a named
  dependency; complete deterministic gates still run afterward.
- A Model-review blocker is input to Designer resolution. A final Designer
  rejection names `designer`, `model`, or `visualization` as repair owner.
- No human source or `.sysmlviz` editing is allowed inside the run.

The only automatic terminal synthesis result is `accepted`. Operational and
repair findings remain `incomplete` or `awaiting-visualization`; an operator may
explicitly archive a diagnosed no-progress run. Infrastructure interruptions
also checkpoint the run so completed generation work and cumulative token/time
accounting are preserved.

## Expansion after the first attempt

Do not begin a multi-domain matrix until the vertical slice is accepted or has
a diagnosed operator-archived no-progress state with complete evidence. If its
checkpoint is understood and the workflow is
stable, expand first to one flight-guidance or vehicle-monitoring model and one
electrical-power-management model. Corpus-scale sampling is a later decision,
not part of this first attempt.

## Per-run artifacts

Each immutable run directory retains:

- `system-abstract.md`;
- `design-selection.md` recording the considered responsibility allocations,
  selection criteria, and rationale;
- `model/` containing canonical `.sysml` source;
- complete prompts, model responses, model/provider identifiers, sampling
  parameters, timestamps, token usage, repair history, and the exact guideline
  and policy revisions used;
- architecture-stage and final `hamr sysml tipe` diagnostics;
- `model-summary.json` and a readable `model-summary.md`;
- `traceability.json` listing covered, missing, and unexplained elements;
- `metrics.json` containing the graph metrics and contract counts;
- the named `sysml-viz` view state, deterministic `system-overview.svg`, and
  export metadata;
- `visualization-review.md` recording view purpose, semantic/presentation
  distinction, health findings, rendered-artifact review, and disposition;
- `verification-report.json` recording rule and tool conformance;
- `designer-validation.md` recording fitness against purpose, context, and
  operational scenarios, with the final disposition and rationale.

## Acceptance criteria for the pilot

A run is accepted only when:

1. its source uses the repository's SysML-AADL library semantics;
2. it has exactly one explicit root system usage;
3. architecture-stage and final `hamr sysml tipe` pass;
4. all connection endpoints resolve and port kinds, directions, and types are
   compatible;
5. every component has a traced responsibility and participates in a meaningful
   interaction;
6. the node, edge, containment-depth, and first-attempt connected-region bounds
   in the System Abstract hold;
7. required GUMBO behavior exists and no required output is left trivially or
   unintentionally unconstrained;
8. trace coverage is complete and unexplained model additions are absent;
9. all mandatory Designer, Model, and Visualization Agent guideline checks pass
   or have an explicitly approved pilot-policy tailoring record;
10. the overview export matches the accepted source revision, passes the
    visualization gates above, and is judged fit for its stated review purpose;
    and
11. the Designer Agent finds the generated model faithful to the System Abstract
    and semantically plausible for its Domain Seed.

Code generation, application implementation, and execution are explicitly not
acceptance criteria for this pilot.

## Implementation sequence

### 1. Freeze the first-run inputs and artifact contracts

- Finalize the System Abstract template and trace-comment grammar.
- Freeze the greenhouse Domain Seed and versioned Designer, Model, and
  Visualization Agent guideline profiles, including machine-checkable rules
  and human-review questions.
- Define the common generator policy separately from Domain Seeds.
- Define the run-directory manifest, resumable checkpoints, and accepted state.

### 2. Assemble existing inspection commands

- Use existing source checks plus `sysml-viz` session inspection, model summary,
  element inspection, diagram health, named views, and deterministic export.
- Implement only the smallest external report assembly needed for trace
  coverage and the defined architecture metrics.
- Do not extend `sysml-viz` unless the first run identifies a concrete missing
  capability that prevents completion.

### 3. Execute the three-agent loop

- Implement the Designer Agent prompt and System Abstract validation.
- Implement the lightweight alternative-allocation and selection record before
  the System Abstract is frozen.
- Implement the staged Model Agent prompt: architecture first, contracts second.
- Feed only localized validation diagnostics into repair turns.
- Preserve immutable provenance and cumulative cost accounting across repairs;
  do not use token consumption or repair count as an acceptance gate.
- Use compact Model/Visualization repair prompts and skip final Designer review
  until deterministic source, analyzer, trace, and visualization gates pass.
- Run the Visualization Agent only against an identified model revision; retain
  its named view, health evidence, export, and rendered-artifact review.
- Produce separate verification, visualization-review, and Designer-validation
  reports.

### 4. Diagnose the run result

- Classify every failure by role, stage, and cause before changing prompts.
- Distinguish generator defects, model-language/tool limitations, policy
  mistakes, and presentation defects.
- Repair candidate defects in the existing run. Start a new attempt only for an
  intentional independent sample or an operator-approved policy experiment.

### 5. Decide whether to expand

- Expand only if the workflow demonstrates a faithful abstract, statically valid
  source, complete traceability, diagnosed repairs, and a defensible overview.
- Add the two named domains before repeated sampling. Diversity claims require
  multiple models and are explicitly unavailable from this first run.

## Explicitly deferred

- HAMR/GumboX code generation;
- application implementation and executable simulation;
- GP- or SyGuS-based primary generation;
- strict graph-density or connected-component thresholds;
- claims of formal semantic correctness beyond the checks actually run;
- repeated or multi-domain generation before the one-run vertical slice is
  understood.
