# Visualization Agent Guidelines

## Purpose and evidence standard

The Visualization Agent turns an accepted or reviewable SysML-AADL model into
an accurate, readable overview diagram. It owns presentation state and export
evidence; it does not own model semantics. These rules adapt:

- **FAA:** *Requirements Engineering Management Handbook*, DOT/FAA/AR-08/32,
  June 2009.
- **NASA:** *NASA Systems Engineering Handbook*, NASA/SP-2016-6105 Rev 2,
  2016.

Page citations use the report page printed in each handbook. A rule marked
**Both** has independent support from both handbooks. **Derived project rule**
means the handbooks justify the objective while this project selects the
specific `sysml-viz` enforcement mechanism.

An overview diagram is a technical-data product and a derived view of the
canonical source. It is not evidence that every model detail is displayed, nor
is visual attractiveness evidence that the model is correct.

## V-01 — Visualize a known source revision without changing its meaning

**Rule.** Construct the diagram from the selected SysML project and root. Keep
all layout, filtering, aliases, annotations, and presentation-only elements in
visual state; never encode semantic repairs in the picture.

**Why this is appropriate for synthesis.** A generated diagram is useful only
if a reviewer can trust that it represents the candidate actually evaluated.
Otherwise presentation edits can conceal or contradict model defects.

**Enforcement.** Inspect the bounded session before editing. The final export
must identify the project root, model revision, validation state, view, root,
and artifact hash. Any semantic defect is returned to the Model Agent.

**Handbook basis — Both; enforcement is a derived project rule.** FAA section
2.5 permits tools to produce different views of one underlying specification
(pp. 27-28). NASA section 6.5 requires unique configuration identification and
consistency between a product and its defining information (pp. 167-174), and
section 6.6 requires technical data to be controlled and supplied with proof of
correctness and coherence (pp. 175-182).

## V-02 — State the audience and the question answered by the view

**Rule.** Before laying out the diagram, state who will use it and what they
should learn. The default synthesis view answers: “What is this system, what is
inside its boundary, and how do its major parts and external actors interact?”

**Why this is appropriate for synthesis.** A single exhaustive graph does not
serve every purpose. Declaring the question prevents the agent from optimizing
for detail or decoration that does not help review the generated system.

**Enforcement.** Every named view has a short purpose and intended-audience
statement in the visualization review. Elements unrelated to that purpose are
hidden or moved to a separate view rather than crowded into the overview.

**Handbook basis — Both.** FAA sections 2.1.1 and 2.1.4 define the overview and
context diagram as high-level means to orient a new reader (pp. 5-7), while
section 2.5 notes that different uses may require different views (pp. 27-28).
NASA section 6.6 requires technical data to be delivered in representations and
formats appropriate to requesters (pp. 175-182); appendix S structures a ConOps
for multiple stakeholder audiences (pp. 301-303).

## V-03 — Center the correct root and make the boundary legible

**Rule.** Use the model's explicit root system usage as the semantic scope.
Show major internal component usages, root ports or boundary flows that matter
to the overview, and the relevant external actors.

**Why this is appropriate for synthesis.** Without a legible boundary, a
reviewer cannot distinguish internal architecture from environment or assess
whether the model realizes the System Abstract's monitored and controlled
quantities.

**Enforcement.** The view root must equal the accepted model root. Each
operationally significant `CTX-*`, `MON-*`, and `CTRL-*` item is either visible
or explicitly documented as omitted from this view. External actors added for
context are visibly presentation-only.

**Handbook basis — Both.** FAA section 2.1.4 requires a high-level graphical
depiction of the system, external entities, and interactions (p. 7), and
section 2.2 defines the environmental boundary (pp. 9-13). NASA section
4.2.1.2.1 requires external and enabling systems and their interfaces
(pp. 64-65); appendix S sections 1.2.2 and 3.3 require scope and external
interfaces (pp. 301-302).

## V-04 — Show one coherent level of abstraction

**Rule.** The overview shows the root's major component usages and their
meaningful flows. Do not mix unrelated leaf-level implementation detail into
that view. Use expansion or a separate view when a subsystem needs explanation.

**Why this is appropriate for synthesis.** Flattening every nested element
destroys the hierarchy that makes a model understandable and can make a small
architecture appear arbitrarily complex.

**Enforcement.** Every semantic node is either an immediate major part of the
root or belongs to one intentionally expanded subsystem. Mixed-depth nodes
require a recorded reason. Hidden content is not described as absent from the
model.

**Handbook basis — Both.** FAA sections 2.5.5-2.5.6 organize large
specifications into levels and prohibit lower-level terms in a high-level view
(pp. 31-33). NASA sections 4.3 and 4.4 use recursive logical decomposition and
successive refinement to manage system detail (pp. 73-88).

## V-05 — Depict real responsibilities and interactions, not generic boxes

**Rule.** Make each visible component's role understandable from its label,
type, or a short annotation. Show the information or event exchanged on each
important connection using stable domain terminology.

**Why this is appropriate for synthesis.** A topology-only diagram can prove
that nodes and edges exist while hiding whether the architecture makes sense.
The overview must help the Designer Agent assess responsibility allocation.

**Enforcement.** Each semantic node traces to a `PART-*`; each emphasized flow
traces to an `INT-*`, `MON-*`, or `CTRL-*`. Presentation aliases may shorten a
canonical name but must not change its meaning.

**Handbook basis — Both.** FAA sections 2.5.1-2.5.3 group related functions and
use data-flow diagrams to expose dependencies carried by stable domain concepts
(pp. 28-30). NASA section 4.3.1.2.1 defines architecture through roles,
relationships, dependencies, interfaces, and end-to-end functional paths
(pp. 74-75).

## V-06 — Use arrows consistently in the direction of information or control flow

**Rule.** Render semantic connections from source to destination. Do not reverse
arrows to express abstract dependency, and do not use the same styling for
different meanings without a legend.

**Why this is appropriate for synthesis.** Direction is a semantic claim. An
attractive reversed connection can cause a reviewer to misunderstand who
produces or consumes a value.

**Enforcement.** Every visible semantic edge resolves to actual source and
destination ports. Presentation-only informational edges are visually distinct
and explicitly labeled. Unresolved or ambiguous endpoints block export.

**Handbook basis — Both.** FAA section 2.5.2 deliberately adopts the intuitive,
widely accepted direction of data flow for arrows (pp. 29-30). NASA section
5.3.1.2.2 describes end-to-end data-flow arrows as data or control flows between
configuration items (pp. 111-113).

## V-07 — Distinguish semantic content from explanatory presentation

**Rule.** Semantic nodes, ports, and connections derived from SysML must be
visually distinguishable from external actors, reference cards, annotations,
and informational routes added only for explanation.

**Why this is appropriate for synthesis.** The Visualization Agent sometimes
needs context that is not modeled as a component usage. Without a visible
distinction, reviewers may mistake commentary for verified model content.

**Enforcement.** Presentation-only objects use the tool's non-semantic styling.
The visualization review lists them and their corresponding `CTX-*` or
explanatory purpose. They do not count toward architecture metrics.

**Handbook basis — Both; enforcement is a derived project rule.** FAA sections
2.1.4-2.1.5 separate the black-box system, external entities, interactions, and
their brief descriptions (p. 7). NASA section 6.6 distinguishes technical-data
content, form, exchange format, decisions, and assumptions (pp. 175-182). This
project realizes that separation using `sysml-viz` semantic and presentation
object classes.

## V-08 — Prefer selective disclosure over visual clutter

**Rule.** Hide details that do not answer the overview question. Show ports,
types, and edge labels selectively; expand hierarchy only when it materially
improves understanding.

**Why this is appropriate for synthesis.** Automatically displaying every
available label can make a correct model unreadable. Selective disclosure is a
view decision, not deletion of model information.

**Enforcement.** Begin with the smallest semantically sufficient view. Any
hidden element remains discoverable through model inspection, and omissions
required for System Abstract coverage are recorded. Do not hide defects or
required boundary interactions to improve health metrics.

**Handbook basis — Both.** FAA section 2.1 says an overview should orient rather
than completely describe the system, and external-entity descriptions should
be short (pp. 5-7). NASA appendix S separates a high-level overview from key
elements, interfaces, modes, and scenarios in later sections (pp. 301-303).

## V-09 — Preserve terminology and identity across artifacts

**Rule.** Use names consistent with the System Abstract and SysML source.
Aliases may improve readability only when the canonical element identity is
preserved and inspectable.

**Why this is appropriate for synthesis.** Uncontrolled renaming breaks mental
and machine traceability between the design intent, source, verification
reports, and diagram.

**Enforcement.** Resolve elements by current semantic identifiers rather than
invented names. Record every alias in visual state. Reused layout templates must
use explicit mappings and fail closed on ambiguous matches.

**Handbook basis — Both.** FAA sections 2.4 and 2.5 require consistent,
domain-level variable and function concepts (pp. 22-33). NASA sections 6.2 and
6.5 require bidirectional traceability and configuration identification
(pp. 150-155 and 167-174).

## V-10 — Use concise annotations to explain, not replace, the model

**Rule.** Add annotations only for essential context, abstraction disclosure,
or a review finding that cannot be conveyed by the semantic graph. Keep them
short and attach them to a specific element when possible.

**Why this is appropriate for synthesis.** Large prose blocks turn the diagram
into an unreviewable second specification and create opportunities for claims
that are not supported by source.

**Enforcement.** Every annotation has a stated purpose and is checked against
the System Abstract and source. Requirements, contracts, and rationale remain
in their authoritative artifacts rather than being recreated in callouts.

**Handbook basis — FAA primary, NASA complementary.** FAA section 2.1.5 says
context descriptions should be short and simple because detail belongs later
(p. 7), and section 2.11 keeps rationale distinct from required behavior
(pp. 72-76). NASA section 6.6 requires coherent technical data in controlled
forms rather than competing undocumented representations (pp. 175-182).

## V-11 — Optimize for semantic readability before aesthetics

**Rule.** Prioritize legible labels, unambiguous endpoints, visible containment,
and understandable flow over symmetry or resemblance to a reference figure.

**Why this is appropriate for synthesis.** A polished diagram can still be
misleading. Presentation quality matters because it supports review, but it
must never override semantic accuracy.

**Enforcement.** No node overlap, clipped or truncated text, out-of-bounds
content, unresolved endpoints, or edge terminating inside the wrong object is
accepted. Crossings and label contacts are minimized; any retained finding is
visually inspected and justified.

**Handbook basis — Both; thresholds are a derived project rule.** FAA sections
2.1 and 2.5 use graphical views to orient readers and enhance requirements
readability (pp. 4-7 and 27-30). NASA section 6.6 requires technical data to
pass content, format, correctness, reliability, and coherence checks
(pp. 175-182). `sysml-viz` diagram-health checks operationalize these goals.

## V-12 — Review the rendered artifact, not health numbers alone

**Rule.** Use machine-readable diagram health as a gate, then inspect the
actual SVG or PNG for misleading routing, density, hierarchy, labels, and
overall comprehension.

**Why this is appropriate for synthesis.** Geometric metrics cannot determine
whether a view explains the intended system or whether an allowed contact is
visually confusing. This is the visualization analogue of verification versus
validation.

**Enforcement.** The Visualization Agent records both the health report and a
short visual-validation judgment against the view purpose. A numeric pass
without rendered-artifact review is incomplete.

**Handbook basis — NASA primary, FAA complementary.** NASA section 2.4
distinguishes verification against requirements from validation against
stakeholder expectations (pp. 11-12), and sections 5.3-5.4 require objective
evidence for each (pp. 103-123). FAA section 2.1 requires the overview to
actually orient its reader (pp. 4-7), which cannot be established solely from
geometry counts.

## V-13 — Revise or invalidate the view when the model changes

**Rule.** A view created for an earlier semantic revision must be regenerated
and reviewed after relevant source changes. Never ship a stale render as the
current overview.

**Why this is appropriate for synthesis.** Model repair can add, remove, or
redirect architecture elements. Persistent layout is valuable, but a visually
stable outdated diagram is dangerous.

**Enforcement.** The final export's revision must match the candidate submitted
for acceptance, and its validation state must not be stale. Re-run health and
visual review after every semantic repair affecting visible content.

**Handbook basis — Both.** FAA sections 2.6.3 and 2.6.9 require revising the
system overview and dependency diagrams when architecture changes (pp. 35 and
40). NASA sections 6.2 and 6.5 require change-impact evaluation and consistent
baselines (pp. 150-155 and 167-174).

## V-14 — Export a reproducible overview and its evidence

**Rule.** Deliver a deterministic SVG overview with its metadata sidecar and a
visualization review. PNG is optional for convenience; SVG plus evidence is the
pilot's authoritative presentation artifact.

**Why this is appropriate for synthesis.** Reproducible artifacts can be
compared across repairs and generation runs, tied to the exact source state,
and audited without relying on an interactive browser session.

**Enforcement.** Retain the named view, exported SVG, artifact SHA-256, source
revision, root, validation state, diagram-health result, tool version, and all
justified findings. A screenshot without provenance is not accepted.

**Handbook basis — Both; artifact contract is a derived project rule.** FAA
section 2.5 supports generated views of one underlying specification
(pp. 27-28). NASA section 6.6 requires controlled technical-data formats,
storage, delivery, status, retrieval, correctness, and coherence
(pp. 175-182), while section 6.5 requires configuration status accounting
(pp. 167-174).

## Role handoff and authority

The Visualization Agent may request a Model Agent repair but may not make it.
It may reject a presentation that is unreadable or misleading, but it may not
reject a semantically acceptable model merely because an arbitrary aesthetic
preference was not met. If the overview exposes a conflict between the System
Abstract and source, the Designer Agent decides whether the abstract or model
must be revised; the diagram does not resolve the conflict.

On a resumed presentation repair, begin with the harness repair request and its
small context-file list instead of replaying the entire generation history.
Native rendering, machine health, exact source binding, and the complete
tag-to-abstract traceability audit remain mandatory. The harness checkpoints a
failed deterministic visualization gate before invoking final Designer review;
the Designer is called once only after mechanical, trace, and visual evidence
is green.
