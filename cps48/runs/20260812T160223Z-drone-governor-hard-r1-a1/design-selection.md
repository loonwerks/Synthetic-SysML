# Approved design selection — logical drone lifecycle and energy governor

## Decision frame and evidence limits

DS-FRAME-01: The decision selects one implementation-independent responsibility
architecture for the frozen reusable seed at the declared hard tier. It does
not select physical drone topology, algorithms, thread scheduling, deployment,
code, or safety mechanisms.

DS-EVID-01: Source-grounded selection evidence is limited to the seed's named
lifecycle, battery/charging, flight-control, navigation, radio, sensing,
landing-gear, pilot, and forest-observation vocabulary and its four candidate
system scopes. Exact policy and allocation are downstream design choices.

DS-CRIT-01: Alternatives are compared for purpose coherence, explicit boundary,
hard-tier semantic substance, separable local ownership, priority/fault/recovery
coverage, compositional analyzability over finite values, unsupported-claim
risk, and realizability in the declared SysML-AADL/GUMBO workflow.

## Comparison of the seed's four candidate scopes

DS-SCOPE-01: Alternative S1, a drone lifecycle governor, makes the source-named
phases the controlled outcome and admits battery, charging, readiness, and
selected flight-support evidence only when consequential to lifecycle policy.
It supports all mandatory hard-tier obligations without asserting a physical
mission controller.

DS-SCOPE-02: Alternative S2, a battery-awareness supervisor, gives strong
battery/fault/recovery focus but makes thirteen non-padded responsibilities and
twenty-one or more distinct cases difficult without importing physical energy
or lifecycle authority that the seed deliberately leaves open.

DS-SCOPE-03: Alternative S3, a flight-readiness coordinator, supports evidence
qualification and launch gating but provides a narrower state progression;
adding return/landing recovery would effectively turn it into S1 while risking
an implicit physical-flight claim.

DS-SCOPE-04: Alternative S4, the whole logical forest-fire observation drone,
has ample capability breadth but would encourage unsupported fire detection,
mapping, radio-peer, obstacle, payload, and performance behavior. It also
confounds a product boundary with the single supervisory decision problem.

DS-SCOPE-DEC-01: S1 is selected. It has the clearest controlled outcomes,
supports a closed finite priority/recovery policy, uses other seed capabilities
only as abstract evidence contexts, and most directly limits forest-observation
and physical claims.

## Responsibility-allocation alternatives

DS-ALT-01: Allocation A centralizes qualification, confidence, eligibility,
fault aggregation, lifecycle state, and output composition in one governor,
surrounded by boundary adapters. It is compact but has only one meaningful
decision/state owner; adapters would be identity wrappers, so it fails the hard
tier's multiple-owner and anti-padding obligations.

DS-ALT-02: Allocation B federates request classification, battery and charger
qualification, charge eligibility, combined flight readiness, home and
touchdown qualification, battery confidence, airborne-hazard proposals,
airborne-request classification, fault aggregation, lifecycle priority, and
outcome composition. Facts move through typed directed domain interactions and
each of the thirteen owners has a distinct nonidentity local contract relation.

DS-ALT-03: Allocation C groups battery/charge, readiness, airborne recovery,
and fault behavior into nested subsystems, each with local arbitration, then
adds a top-level lifecycle arbiter. It offers subsystem autonomy but duplicates
priority and fault meanings across levels, increases reconciliation risk, and
obscures the exact thirty-case oracle.

DS-COMP-01: A is rejected because most apparent usages cannot receive semantic
credit and central ownership defeats the declared tier. C is rejected because
distributed arbitration creates overlapping case authority and more complex
composition without a seed-grounded reason. Revised B best preserves cohesive
nonidentity local facts and a single explicit owner of final lifecycle priority.

DS-DEC-01: Revised Allocation B is approved with exactly thirteen
responsibility-bearing usages `PART-01..PART-13`, thirty-five interactions
`INT-01..INT-35`, thirty cases, and eleven scenario families. All counts are
exact selected points inside the hard bounds and exclude generated support.

## Selection rationale and ownership audit

DS-OWN-01: PART-08 alone owns battery-confidence state and PART-12 alone owns
lifecycle-phase state. PART-04 owns charge eligibility, PART-05 owns combined
flight readiness, PART-09 owns airborne-hazard proposals, PART-10 owns
airborne-request classification, PART-11 owns battery-fault classification and
aggregate disjunction, PART-12 selects first-match lifecycle results, and
PART-13 owns the nonidentity public-output equations.

DS-OWN-02: PART-01 receives credit only for the ten-to-five `RequestFamily`
classification; exact intent predicates are uncredited support. PART-02
suppresses invalid-band distinctions, PART-03 derives charger policy classes,
and PART-06 and PART-07 establish qualified completion only from valid
affirmative evidence. Binary report decoding, forwarded local faults, copied
phase/fault outputs, bundling, and pass-through receive no credit.

DS-CASE-01: Counted cases are owned only by PART-08 (`CASE-A-01..CASE-A-04`) and
PART-12 (`CASE-L-01..CASE-L-26`). The other owners' local contracts are necessary
composition obligations but are not padded into counted cases.

DS-PRI-01: PART-12 is the sole final lifecycle priority owner. PART-04 and
PART-05 publish ground applicability, PART-09 and PART-10 publish
phase-independent proposals, and none can update phase; PART-13 cannot
recompute or replace the winning case.

DS-REC-01: Recovery is split deliberately: PART-08 owns two-valid-step battery
confidence recovery; current evidence paths and PART-11 clear non-battery
faults; PART-09 proposes airborne mitigation; PART-12 prevents
correction-driven phase reversal; fresh action requests are enforced by
current-snapshot request semantics.

DS-COMP-02: The thirty-five-flow inventory is closed: eleven boundary-input
fan-out interactions, twenty internal owner flows, and four outputs. The output
composer has connected winning-resolution, confidence/band, and fault-vector
evidence, so no sibling or root reread is needed to compose the public tuple.

## Structural decision and generated-support limits

DS-STRUCT-01: The approved realization has exactly one explicit root, one
connected semantic region, one behavior-free Process at depth one, and all
thirteen contract-bearing usages at depth two. The Process receives no semantic
credit.

DS-STRUCT-02: Generated support is limited to transparent containment routing,
fan-out wires, typed ports, flat record attributes and closed types, context and
visualization nodes, plus exactly eleven root/Process boundary delegations.
Together with thirty-five semantic connections this permits forty-six raw
`PortConnection` declarations. Support shall add no guard, transformation,
state, owner, semantic interaction, or counted contract case.

DS-STRUCT-03: The selected point `13/35/30/11` deliberately uses the lower usage
bound and upper interaction/case bounds because each evidence responsibility
needs several distinct consumers and because the closed lifecycle partition
requires all recovery and fresh-request paths. No element exists solely to hit
a count.

## Verification and validation basis

DS-VER-01: Architecture inspection shall require exact semantic counts,
resolved typed endpoints, one root, depth `1..2`, one semantic region, and
owner-local behavioral evidence for every usage.

DS-VER-02: A deterministic analyzer shall first compute reachable phase and
confidence pairs from `Off/Untrusted`, then evaluate all 15,360 snapshots for
each reachable pair through both explicit owner composition and a separately
expressed direct oracle.

DS-VER-03: Passing evidence requires zero partition gaps/overlaps, state/output
mismatches, priority violations, fault-disjunction mismatches, stale-request
transitions, charge/propulsion conflicts, ownership violations, decoder or copy
credits, and composition-oracle differences, plus witnesses for all thirty
cases and eleven scenario families.

DS-VAL-01: Designer validation remains separate and shall reject a mechanically
valid result that changes the boundary, centralizes ownership, weakens priority
or recovery, omits fresh requests, or adds unsupported physical or
forest-observation claims.

## Assumptions, uncertainty, and resolved Model questions

DS-ASM-01: All finite values, snapshot ordering, initial state, policy,
priority, confidence recovery, and owner boundaries are recorded pilot/design
choices. The seed does not validate them as real-drone behavior.

DS-UNC-01: Effective-guard expression, local contract visibility across the
thirty-five flows, atomic tuple composition, and bounded reachability remain
Model-stage pressure points. The review established realizability but did not
typecheck, generate, execute, or prove the future realization.

DS-ANS-01: All thirteen revised owner-local relations are computable from their
listed incoming `INT-*` values. PART-08 and PART-12 alone may refer to owned
prior state; sibling/root rereads and central recomputation are prohibited.

DS-ANS-02: The twenty-six lifecycle cases shall be encoded as effective guards,
each conjoined with exclusion of all earlier raw guards, rather than relying on
text order. PART-12 alone emits the winning-case identifier and primitive
request-effect facts; PART-13 derives the four-valued disposition.

DS-ANS-03: One root System, one uncredited Process, thirteen contract-bearing
Threads, typed ports, flat Data attributes, fan-out, and eleven root/Process
delegations form the authorized containment. The delegations are generated
support distinct from the thirty-five semantic interactions.

DS-ANS-04: The analyzer obligation is exactly 15,360 snapshots for each
reachable phase/confidence pair `R`, with reachability computed from
`Off/Untrusted`, `R <= 21`, and therefore at most 322,560 end-to-end
evaluations. It shall execute explicit owner-local relations, compare their
composition with an independently represented oracle, and retain witnesses for
all thirty cases and eleven scenarios.

DS-ANS-05: `INT-15`, `INT-30`, and `INT-31` provide PART-13 enough information
to derive disposition, notice, intent, and permission equations atomically.
Copying next phase and fault fields is mandatory but uncredited and does not
make PART-13 a second lifecycle owner.

## Approved disposition

DS-PASS-01: The revised allocation satisfies the declared hard bounds at exact
metrics `13/35/30/11` and retains multiple state/decision owners, explicit
first-match priority, local-to-aggregate fault propagation, bounded recovery,
fresh-request rules, and complete composition-oracle obligations. The approved
baseline authorizes Model generation within these constraints.

DS-DEFER-01: Engine-count consistency, physical flight/charging/landing,
forest-observation performance, real timing, concurrency, deployment, code
generation, execution, formal proof, physical validity, reliability, safety,
certification, and production readiness remain prohibited claims or `not-run`.
