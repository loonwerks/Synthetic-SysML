---
abstract_id: MINING-CARGO-DOCKING-SA-01
run_id: 20260813T234356Z-mining-cargo-docking-small-r1-a1
domain_seed: 20260813T233942Z-mining-cargo-docking-seed-v1
campaign_complexity: small
selected_scope: station-cargo-transfer-verification
semantic_usage_count: 7
semantic_interaction_count: 13
nontrivial_contract_case_count: 12
scenario_family_count: 5
root_system_usage_count: 1
semantic_containment_depth: 2
weakly_connected_semantic_regions: 1
principal_decision_owner_count: 1
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
baseline_status: designer-approved
---

# Approved Revised Small Station Cargo-Transfer Verification Supervisor

## Synopsis, need, purpose, and goals

NEED-01: A mining-frigate pilot and station need a bounded logical supervisor that admits one offload request only while docking is reported established, observes ship-side transfer progress and station warehouse receipt evidence, and reports whether that one transfer has been verified. The modeled concern is evidence coordination, not physical docking, cargo motion, or warehouse control.

PURPOSE-01: The system shall qualify four finite boundary observations, retain the logical phase and rearm obligation of one transfer at a time, choose exactly one disposition for each logical evaluation, issue a one-evaluation begin command only for an admitted fresh request, and establish verification only from applicable ship and warehouse evidence.

GOAL-01: The system shall produce one fully constrained next state, cargo-transfer command, supervisory status, and verification finding for every admissible finite pre-state and boundary-input combination.

GOAL-02: The system shall distinguish a newly admitted request, active ship-side transfer, completed ship-side transfer awaiting warehouse receipt, and logically verified completion without treating any report as physical proof.

GOAL-03: The system shall inhibit a begin command and verification after invalid or inconsistent evidence until a valid neutral observation has occurred and any subsequent transfer uses a later fresh request.

GOAL-04: The system should remain small enough for exhaustive finite analysis, ownership review, complete trace audit, and human validation without identity wrappers, duplicate decision owners, or count-only interactions.

## Evidence classes and claim boundary

METHOD-01: Handbook-derived method requires an implementation-independent need and boundary before decomposition, explicit assumptions and responsible external entities, coherent allocation, nominal and off-nominal scenarios, alternative comparison, traceability, measurable bounds, and separate verification and validation. These are methodology obligations, not mining-frigate facts.

FACT-SRC-01: The frozen seed supports the mining-frigate, pilot or pilot pod, station, warehouse or storage, ore or cargo, docking, cargo transfer, transfer verification, and ship or warehouse report vocabulary. It also supports the limited association of docked context with cargo transfer and station services.

FACT-SRC-02: The source does not establish a complete transfer state machine, uniform command or report semantics, readiness or inhibition rules, validity status, ordering, priority, invalid-report handling, recovery, finite encodings, or responsibility allocation. Its cargo-transfer verification cases do not establish supervisory behavior.

ABS-PILOT-01: The exact one-transfer boundary, finite value sets, explicit validity, logical evaluation semantics, phase and rearm state, ordered priority, evidence-applicability rules, fault response, neutralization, and fresh-request policy in this abstract are Designer-selected pilot abstractions beyond the source.

ARCH-SEL-01: The approved architecture separates request, docking, ship-progress, and warehouse-evidence qualification around one stateful Transfer Decision Owner, then delegates command and report derivation to two distinct output owners. The final alternative comparison and rationale are retained in `design-selection.md`.

DEFER-01: Physical docking and undocking, travel, extraction, hold capacity, cargo identity or quantity, transfer mechanics, station storage mutation, warehouse inventory accuracy, timing, throughput, energy, repair, resupply, concurrency, economics, game fidelity, safety, certification, deployment, code generation, execution, formal proof, and production readiness are deferred and shall be reported out of scope or `not-run`, never passed.

## Operational context and exact system boundary

CTX-01: The Pilot Request Context is outside the system and supplies an offload-request sample and its validity. It is responsible for presenting a fresh logical request event only when one transfer is intended.

CTX-02: The Docking Status Context is outside the system and supplies a finite docking observation and its validity. It may represent station or frigate reporting, but the supervisor neither performs nor proves physical docking.

CTX-03: The Ship Cargo Context is outside the system, supplies ship-side transfer progress and validity, and receives the logical begin-transfer command. It owns any unmodeled transfer mechanism and physical cargo effect.

CTX-04: The Station Warehouse Context is outside the system and supplies warehouse receipt evidence and validity. The supervisor neither changes warehouse contents nor establishes cargo identity, quantity, or inventory accuracy.

CTX-05: The Transfer Information Recipient is outside the system and receives supervisory status and a verification finding. It may be the pilot or station operator and shall not interpret a logical finding as physical certification.

MON-01: `OffloadRequestSample` is a finite root input from CTX-01 with `event : OffloadRequestEvent` and `status : InputStatus`; `OffloadRequestEvent` is exactly `{NoRequest, OffloadRequested}` and `InputStatus` is exactly `{Valid, Invalid}`.

MON-02: `DockingSample` is a finite root input from CTX-02 with `docking : DockingObservation` and `status : InputStatus`; `DockingObservation` is exactly `{NotDocked, Docked}` and makes no mechanical-latch or safety claim.

MON-03: `ShipTransferSample` is a finite root input from CTX-03 with `progress : ShipTransferProgress` and `status : InputStatus`; `ShipTransferProgress` is exactly `{Idle, InProgress, Complete, Failed}`.

MON-04: `WarehouseReceiptSample` is a finite root input from CTX-04 with `receipt : WarehouseReceiptEvidence` and `status : InputStatus`; `WarehouseReceiptEvidence` is exactly `{NoReceipt, ReceiptConfirmed, ReceiptRejected}`.

CTRL-01: `CargoTransferCommand` is a finite root output to CTX-03 with exactly `{Hold, BeginOffload}`. `BeginOffload` is a one-evaluation logical command and `Hold` neither cancels nor reverses an action already accepted outside the boundary.

CTRL-02: `TransferSupervisorStatus` is a finite root output to CTX-05 with exactly `{Ready, NotDocked, TransferStarted, TransferActive, AwaitingReceipt, TransferVerified, EvidenceFault, UnexpectedEvidence, InputFault, AwaitingNeutral}`.

CTRL-03: `TransferVerificationFinding` is a finite root output to CTX-05 with exactly `{NotEstablished, Verified, Rejected}`. `Verified` means only that the selected finite evidence rule was satisfied; `Rejected` means evidence was inapplicable or inconsistent, not that physical cargo was lost.

BOUND-01: The root boundary is exactly MON-01 through MON-04 and CTRL-01 through CTRL-03. Cargo values, ore-hold state, cargo identifiers, quantities, docking commands, physical actuator feedback, warehouse control, service requests, repair, resupply, and travel data are outside the selected small system.

## Logical evaluation, persistent state, and freshness

SEM-01: One logical evaluation consumes the current MON-01 through MON-04 samples and PART-05 pre-state, selects exactly one ordered CASE-01 through CASE-12, atomically updates the PART-05 state, and publishes CTRL-01 through CTRL-03 from the same resolution. This is deterministic logical ordering, not a physical period, scheduler, latency, or execution claim.

STATE-01: `transferPhase : TransferPhase` and `rearmRequired : Boolean` are the only persistent domain state; `TransferPhase` is exactly `{Idle, TransferOutstanding, AwaitingReceipt}`. PART-05 exclusively owns, initializes, reads, and updates both values.

INIT-01: Initial state shall be `transferPhase = Idle` and `rearmRequired = false`; initial CTRL-01 through CTRL-03 values shall be `Hold`, `Ready`, and `NotEstablished` respectively.

INIT-QUAL-REQ-01: Before the first logical evaluation, PART-01's `QualifiedRequest` output shall initialize to `NoQualifiedRequest`. This startup value is not an admitted request and shall be replaced by QUAL-REQ-01 whenever PART-01 qualifies MON-01.

INIT-QUAL-DOCK-01: Before the first logical evaluation, PART-02's `DockingAssessment` output shall initialize to `InvalidDocking`. This conservative startup value makes no physical-docking claim and shall be replaced by QUAL-DOCK-01 whenever PART-02 assesses MON-02.

INIT-QUAL-SHIP-01: Before the first logical evaluation, PART-03's `QualifiedShipProgress` output shall initialize to `ShipIdle`. This startup value asserts no active or completed transfer evidence and shall be replaced by QUAL-SHIP-01 whenever PART-03 qualifies MON-03.

INIT-QUAL-WH-01: Before the first logical evaluation, PART-04's `QualifiedWarehouseEvidence` output shall initialize to `NoQualifiedReceipt`. This startup value asserts no warehouse verification evidence and shall be replaced by QUAL-WH-01 whenever PART-04 qualifies MON-04.

INVAR-01: Every reachable state shall satisfy `rearmRequired implies transferPhase = Idle`. CASE-01, CASE-04, CASE-05, CASE-07, CASE-08, and CASE-10 establish that condition; CASE-02 preserves it; CASE-03 clears rearm; and all other cases preserve `rearmRequired = false`.

NEUTRAL-01: A valid neutral observation is exactly qualified `NoRequest`, qualified ship progress `Idle`, and qualified warehouse evidence `NoReceipt`; either valid docking observation is neutral because docking alone is not a transfer request or transfer result.

FRESH-01: A request is fresh after any rearm obligation only when one evaluation first selects CASE-03 using NEUTRAL-01 and a later evaluation presents valid `OffloadRequested`. Restored validity, docking change, or completion of a prior transfer while `OffloadRequested` remains present shall not authorize reuse of that sample.

## Exact seven semantic usages and ownership

PART-01: Request Qualification shall derive `QualifiedRequest` from both MON-01 fields, producing `InvalidRequest` for either invalid-status raw pair and otherwise `NoQualifiedRequest` or `QualifiedOffloadRequest`. It owns no state, docking eligibility, or transfer disposition.

PART-02: Docking Assessment shall derive `DockingAssessment` from both MON-02 fields, producing `InvalidDocking` for either invalid-status raw pair and otherwise `NotDockedAssessment` or `DockedAssessment`. It owns no physical-docking claim or transfer disposition.

PART-03: Ship Progress Qualification shall derive `QualifiedShipProgress` from both MON-03 fields, producing `InvalidShipProgress` for any invalid-status raw pair and otherwise one of `ShipIdle`, `ShipInProgress`, `ShipComplete`, or `ShipFailed`. It owns no evidence applicability or verification decision.

PART-04: Warehouse Evidence Qualification shall derive `QualifiedWarehouseEvidence` from both MON-04 fields, producing `InvalidWarehouseEvidence` for any invalid-status raw pair and otherwise `NoQualifiedReceipt`, `QualifiedReceiptConfirmed`, or `QualifiedReceiptRejected`. It owns no cargo identity or verification decision.

PART-05: Transfer Decision Owner is the sole principal decision owner and sole state owner. Its owner-local contract shall own STATE-01, apply PRIORITY-01, select exactly one CASE-01 through CASE-12, and derive one complete `TransferResolution` containing `nextPhase`, `nextRearmRequired`, and `disposition`.

RESOLUTION-01: `TransferDisposition` is exactly `{InputFault, RearmBlocked, RearmCleared, ActiveEvidenceFault, UnexpectedIdleEvidence, BeginAccepted, BeginDenied, VerifiedImmediate, ReceiptPending, VerifiedDelayed, ActiveHolding, IdleHolding}`; `TransferResolution.disposition` shall have that type and no additional or unspecified code.

PART-06: Transfer Command Derivation shall locally derive CTRL-01 from `TransferResolution`, producing `BeginOffload` exactly for `BeginAccepted` and `Hold` for every other disposition. This many-to-one control policy is neither forwarding nor bijective renaming.

PART-07: Transfer Report Derivation shall locally derive CTRL-02 and CTRL-03 from `TransferResolution` and REPORT-01. Its combined status-and-finding classification is a behavioral derivation, not a copied bundle, and it owns no case, phase, or rearm decision.

OWNER-01: The ownership audit shall report PART-05 as the only principal decision owner, only state owner, and owner of all twelve cases; PART-01 through PART-04 as four distinct validity-aware qualification owners; PART-06 as the command owner; and PART-07 as the status-and-finding owner. No support element, analyzer, or other usage may recompute, select, or override PART-05 policy.

QUAL-REQ-01: PART-01's total local relation shall map both invalid request raw pairs to `InvalidRequest`, valid `NoRequest` to `NoQualifiedRequest`, and valid `OffloadRequested` to `QualifiedOffloadRequest`.

QUAL-DOCK-01: PART-02's total local relation shall map both invalid docking raw pairs to `InvalidDocking`, valid `NotDocked` to `NotDockedAssessment`, and valid `Docked` to `DockedAssessment`.

QUAL-SHIP-01: PART-03's total local relation shall map all four invalid-status progress pairs to `InvalidShipProgress` and each valid raw progress value to its corresponding qualified semantic value.

QUAL-WH-01: PART-04's total local relation shall map all three invalid-status receipt pairs to `InvalidWarehouseEvidence` and each valid raw receipt value to its corresponding qualified semantic value.

PRIORITY-01: PART-05 shall apply strict descending priority: any invalid qualified input; an uncleared rearm obligation; clearing rearm with NEUTRAL-01; active-transfer docking or evidence conflict; unexpected transfer evidence while idle; a fresh docked request; a fresh not-docked request; immediate dual-evidence verification; completed ship transfer awaiting receipt; delayed warehouse verification; active-phase persistence; otherwise idle. Generated conjunctive cases shall include exclusions for all earlier guards so the partition is effectively mutually exclusive.

REPORT-01: PART-07 shall map `InputFault` to `{InputFault, NotEstablished}`, `RearmBlocked` to `{AwaitingNeutral, NotEstablished}`, `RearmCleared` or `IdleHolding` to `{Ready, NotEstablished}`, `ActiveEvidenceFault` to `{EvidenceFault, Rejected}`, `UnexpectedIdleEvidence` to `{UnexpectedEvidence, Rejected}`, `BeginAccepted` to `{TransferStarted, NotEstablished}`, `BeginDenied` to `{NotDocked, NotEstablished}`, either verification disposition to `{TransferVerified, Verified}`, `ReceiptPending` to `{AwaitingReceipt, NotEstablished}`, and `ActiveHolding` to `{TransferActive, NotEstablished}` when next phase is `TransferOutstanding` or `{AwaitingReceipt, NotEstablished}` when next phase is `AwaitingReceipt`.

OUTPUT-01: Every selected case shall constrain the complete resolution and PART-05 post-state; CTRL-01 shall equal PART-06's mapping and CTRL-02 and CTRL-03 shall equal PART-07's REPORT-01 mapping of that same resolution. No state, resolution field, command, status, or finding may retain an unrelated prior value or remain unconstrained.

## Exact thirteen typed directed semantic interactions

INT-01: The root MON-01 shall provide `OffloadRequestSample` to PART-01 for request qualification.

INT-02: PART-01 shall provide `QualifiedRequest` to PART-05 for disposition selection.

INT-03: The root MON-02 shall provide `DockingSample` to PART-02 for docking assessment.

INT-04: PART-02 shall provide `DockingAssessment` to PART-05 for admission and active-consistency decisions.

INT-05: The root MON-03 shall provide `ShipTransferSample` to PART-03 for progress qualification.

INT-06: PART-03 shall provide `QualifiedShipProgress` to PART-05 for progress and evidence-applicability decisions.

INT-07: The root MON-04 shall provide `WarehouseReceiptSample` to PART-04 for receipt-evidence qualification.

INT-08: PART-04 shall provide `QualifiedWarehouseEvidence` to PART-05 for verification and evidence-conflict decisions.

INT-09: PART-05 shall provide `TransferResolution` to PART-06 for command derivation.

INT-10: PART-05 shall independently provide `TransferResolution` to PART-07 for status-and-finding derivation.

INT-11: PART-06 shall provide `CargoTransferCommand` to root CTRL-01.

INT-12: PART-07 shall provide `TransferSupervisorStatus` to root CTRL-02.

INT-13: PART-07 shall provide `TransferVerificationFinding` to root CTRL-03.

INT-AUDIT-01: The complete semantic interaction inventory is exactly INT-01 through INT-13: four boundary-input deliveries, six inter-usage flows, and three boundary-output deliveries. Every flow has a typed direction and distinct producer-consumer purpose; the two resolution flows intentionally serve different output derivations.

## Exact twelve ordered nontrivial contract cases

CASE-01: If any qualified input is invalid, PART-05 shall resolve `nextPhase = Idle`, `nextRearmRequired = true`, and `InputFault`, regardless of other values or admissible pre-state.

CASE-02: Otherwise, if `rearmRequired = true` and NEUTRAL-01 is false, PART-05 shall resolve `Idle`, `true`, and `RearmBlocked`; a retained request, ship report, or warehouse report shall not be replayed.

CASE-03: Otherwise, if `rearmRequired = true`, all inputs are valid and NEUTRAL-01 is true; PART-05 shall resolve `Idle`, `false`, and `RearmCleared`, with either valid docking assessment allowed and no command or finding established.

CASE-04: Otherwise, if phase is `TransferOutstanding` or `AwaitingReceipt` and any of these holds—docking is `NotDockedAssessment`, ship progress is `ShipFailed`, receipt is `QualifiedReceiptRejected`, phase is `TransferOutstanding` with a confirmed receipt before `ShipComplete`, or phase is `AwaitingReceipt` with regressed `ShipInProgress`—PART-05 shall resolve `Idle`, `true`, and `ActiveEvidenceFault`.

CASE-05: Otherwise, if phase is `Idle` and ship progress is not `ShipIdle` or warehouse evidence is not `NoQualifiedReceipt`, PART-05 shall resolve `Idle`, `true`, and `UnexpectedIdleEvidence`; any simultaneous request is consumed without admission and must later be fresh.

CASE-06: Otherwise, if phase is `Idle`, request is `QualifiedOffloadRequest`, and docking is `DockedAssessment`, PART-05 shall resolve `TransferOutstanding`, `false`, and `BeginAccepted`.

CASE-07: Otherwise, if phase is `Idle`, request is `QualifiedOffloadRequest`, and docking is `NotDockedAssessment`, PART-05 shall resolve `Idle`, `true`, and `BeginDenied`; a later docking change alone shall not reuse the denied request.

CASE-08: Otherwise, if phase is `TransferOutstanding`, ship progress is `ShipComplete`, and warehouse evidence is `QualifiedReceiptConfirmed`, PART-05 shall resolve `Idle`, `true`, and `VerifiedImmediate`; rearm prevents a simultaneous or retained request from starting another transfer.

CASE-09: Otherwise, if phase is `TransferOutstanding`, ship progress is `ShipComplete`, and warehouse evidence is `NoQualifiedReceipt`, PART-05 shall resolve `AwaitingReceipt`, `false`, and `ReceiptPending`.

CASE-10: Otherwise, if phase is `AwaitingReceipt` and warehouse evidence is `QualifiedReceiptConfirmed`, PART-05 shall resolve `Idle`, `true`, and `VerifiedDelayed`; the remembered phase makes a later valid receipt applicable even if ship progress has returned to `ShipIdle`.

CASE-11: Otherwise, if phase is `TransferOutstanding` or `AwaitingReceipt`, PART-05 shall preserve that phase, set `nextRearmRequired = false`, and select `ActiveHolding`; this includes in-progress or no-progress active observations, receipt waiting, and ignored new requests while one transfer remains active.

CASE-12: Otherwise, every remaining valid nonrearm combination is idle with neutral transfer evidence and no admitted request; PART-05 shall resolve `Idle`, `false`, and `IdleHolding`.

CASE-AUDIT-01: CASE-01 through CASE-12 are exactly twelve counted owner-local cases and form an ordered, total, effectively mutually exclusive partition over every admissible state and qualified input combination. Qualification equations, initialization, invariants, types, output mappings, and scenario witnesses are mandatory but receive no additional case credit.

## Required nominal, boundary, invalid/fault, and recovery behavior

BEH-01: With valid neutral evidence, no rearm obligation, `Idle`, a fresh request, and `DockedAssessment`, CASE-06 shall issue exactly one `BeginOffload` and enter `TransferOutstanding`; CASE-11 shall hold while progress remains active; CASE-09 shall remember ship completion without a receipt; and CASE-10 shall establish delayed verification and return to rearm-required idle. VERIFY-01 supplies its inspection method and exact pass criterion.

BEH-02: A fresh request with valid `NotDockedAssessment` shall select CASE-07, output `Hold`, report `NotDocked`, and require neutralization. A docking change while the request remains asserted shall select CASE-02, not CASE-06; only a later fresh request after CASE-03 may be admitted. VERIFY-01 supplies its inspection method and exact pass criterion.

BEH-03: Applicable dual evidence may verify only through CASE-08 in `TransferOutstanding` with simultaneous `ShipComplete` and confirmed receipt, or CASE-10 after CASE-09 has established `AwaitingReceipt`. Completion or receipt evidence in `Idle`, premature receipt, rejected receipt, failure, active docking loss, or progress regression after remembered completion shall never verify. VERIFY-01 supplies its inspection method and exact pass criterion.

RISK-01: Invalid, premature, contradictory, or phase-inapplicable evidence could otherwise cause an unjustified begin command or false logical verification. The consequence claimed here is only incoherent supervisory output; no likelihood, severity, physical loss, or safety classification is asserted.

FAULT-01: Any individual or combined invalid status shall select CASE-01 in the same evaluation, output `Hold`, `InputFault`, and `NotEstablished`, force `Idle`, and set rearm required. Active docking loss, ship failure, warehouse rejection, premature receipt, or progress regression after remembered completion shall select CASE-04 and output `Hold`, `EvidenceFault`, and `Rejected`. VERIFY-02 supplies its exhaustive method and exact pass criterion.

RECOVERY-01: After CASE-01, CASE-04, CASE-05, CASE-07, CASE-08, or CASE-10 establishes rearm, any restored-valid but nonneutral request or evidence shall remain blocked by CASE-02. Only CASE-03 with valid NEUTRAL-01 clears rearm, and only a later evaluation containing a fresh request may select CASE-06 or CASE-07. VERIFY-02 supplies its ordered-trace method and exact pass criterion.

## Exact five required scenario families

SCN-01: Nominal delayed verification shall trace CASE-12, CASE-06, CASE-11 with `ShipInProgress`, CASE-09 with `ShipComplete` and no receipt, CASE-11 while receipt remains absent, and CASE-10 when a receipt is confirmed. The trace shall show one begin command, no early verification, delayed verification, and rearm-required idle afterward.

SCN-02: Docking boundary and immediate verification shall trace CASE-07 for a not-docked request, CASE-02 when docking becomes established but that request remains asserted, CASE-03 on a neutral step, CASE-06 on a later fresh docked request, and CASE-08 when ship completion and warehouse confirmation arrive together.

SCN-03: Evidence applicability and priority shall exercise CASE-05 for completion or receipt evidence in idle; after neutralization and a new admitted request, it shall exercise each CASE-04 initiating class—docking loss, ship failure, warehouse rejection, confirmed receipt before ship completion, and `ShipInProgress` regression after remembered completion—with no begin replay or verification.

SCN-04: Invalid/fault entry shall inject each individual invalid status, representative invalid pairs, and all four invalid together from each reachable phase; every variant shall select CASE-01 and produce the complete FAULT-01 response regardless of simultaneous request or evidence values.

SCN-05: Recovery and fresh-request behavior shall begin with CASE-01 or CASE-04, exercise CASE-02 with restored-valid retained request and separately with retained transfer evidence, exercise CASE-03 only on NEUTRAL-01, then show CASE-12 if no request arrives and CASE-06 or CASE-07 only for a later fresh request.

SCN-AUDIT-01: SCN-01 through SCN-05 are exactly five distinct families: nominal delayed verification, docking boundary with immediate verification, evidence applicability and active faults, invalid-input entry, and ordered recovery with fresh-request reentry. Their variants do not increase the family count, and together they witness all twelve cases.

## Essential environmental assumptions and constraints

ASM-01: CTX-01 is responsible for presenting at most one logical offload request at a time and returning to `NoRequest` before a later fresh request. This makes a two-valued request event and one-transfer state sufficient without inventing cargo identity, quantity, queueing, or concurrency.

ASM-02: CTX-02 is responsible for pairing each docking observation with explicit validity. Valid `Docked` means only that the external context permits logical admission and continued supervision; it is not proof of latch condition, physical safety, or docking effectiveness.

ASM-03: CTX-03 is responsible for pairing progress with explicit validity and using `Complete` or `Failed` only for the one currently active logical transfer. The supervisor treats valid samples according to policy but does not independently measure physical cargo movement.

ASM-04: CTX-04 is responsible for pairing warehouse evidence with explicit validity and using confirmation or rejection only for the one active logical transfer. Because identity and quantity are absent, this is an experiment assumption necessary for bounded evidence applicability, not a source fact.

ASM-05: CTX-03 is responsible for interpreting `BeginOffload` as a one-evaluation logical request and for not treating later `Hold` as cancellation. No delivery guarantee, retry protocol, acknowledgment timing, or physical effect is implied.

ASM-06: CTX-05 is responsible for treating CTRL-02 and CTRL-03 as supervisory information. `Verified` is a finite-policy result relative to assumed input meaning and shall not be represented as independent warehouse truth, game fidelity, or certification.

CONSTRAINT-01: The model shall use finite domains exactly matching the boundary, qualified facts, resolution, disposition, state, and output definitions. It shall not introduce numeric cargo, identifiers, timestamps, capacity, duration, energy, physical motion, or hidden environmental premises into the behavior.

CONSTRAINT-02: Only PART-05 may persist domain state or select cases. Other semantic usages shall be stateless nonidentity derivations, and generated support shall neither manufacture owner credit nor alter the end-to-end meaning of an inventoried interaction.

## Exact structural, trace, and analysis obligations

STRUCT-01: The accepted architecture shall contain exactly one explicit root System usage, exactly seven reachable responsibility-bearing semantic Thread usages realizing PART-01 through PART-07, semantic containment depth exactly `2` beneath the root, exactly one weakly connected semantic region, exactly thirteen typed directed end-to-end semantic interactions realizing INT-01 through INT-13, exactly twelve nontrivial cases, exactly five scenario families, and exactly one principal decision owner.

SUPPORT-01: Generation may introduce exactly one behavior-free Process at depth one containing the seven semantic Threads at depth two. The four root inputs and three root outputs may each use two explicitly marked boundary-delegation routing declarations, giving fourteen uncounted support routes plus six direct inter-Thread connections and exactly twenty concrete connection declarations that realize the thirteen semantic interactions.

STRUCT-02: The root, SUPPORT-01 Process, context actors, data/type definitions, ports, routing-only connections, visualization-only nodes, and analyzer are not semantic usages or interactions. No further support usage, altered INT endpoint, or additional semantic flow is preauthorized.

STRUCT-03: Every PART shall participate in the listed boundary-relevant path and shall carry its stated owner-local nonidentity contract. Copying, bundling, rerouting, one-to-one renaming, central recomputation, or analyzer-only derivation shall fail semantic-usage and ownership credit even if structural counts match.

TRACE-01: Every actionable canonical identifier shall trace to one or more retained model elements, owner-local contracts, analyzer checks, or scenario witnesses; every significant generated component, port, connection, state value, and contract clause shall trace back to an abstract identifier or carry a narrow `@generated-support <reason>` justification. Missing parents, unexplained children, or reused IDs fail acceptance.

ANALYSIS-01: A dependency-free deterministic analyzer shall enumerate exactly `4 * 4 * 4 * 8 * 6 = 3,072` admissible raw snapshots: four invariant-satisfying `(transferPhase, rearmRequired)` pairs, four request value/status pairs, four docking value/status pairs, eight ship-progress value/status pairs, and six warehouse-evidence value/status pairs.

ANALYSIS-02: For every snapshot the analyzer shall independently perform the four qualifications, apply ordered priority, identify exactly one effective CASE, derive next state and all outputs, and compare them with the retained local contracts. Pass requires zero gaps, zero effective overlaps, zero qualification mismatches, zero state or output mismatches, preservation of INVAR-01, and at least one admissible witness for every CASE-01 through CASE-12.

ANALYSIS-03: The analyzer shall separately execute all five scenario families and check NEUTRAL-01, FRESH-01, PRIORITY-01, OUTPUT-01, fault entry from each phase, same-evaluation evidence precedence, neutralization, and later fresh-request reentry. This is bounded conformance evidence, not formal, compositional, unbounded, executable, or physical validation.

## Verification methods and objective pass criteria

VERIFY-01: BEH-01 through BEH-03 shall be verified by owner-local contract inspection plus bounded case and scenario analysis. Pass requires the exact commanded outputs, findings, phases, and rearm values stated in each behavior for every enumerated matching snapshot and required trace step.

VERIFY-02: FAULT-01 and RECOVERY-01 shall be verified by exhaustive status-combination analysis and the ordered SCN-03 through SCN-05 traces. Pass requires fail-closed output in the same evaluation, no verification during rearm, exactly one neutral clearing step, and no admission before a later fresh request.

PASS-01: Structural acceptance requires the exact semantic tuple `7 usages / 13 interactions / 12 cases / 5 scenario families`, one explicit root, semantic depth `2`, one weak semantic region, one principal owner, exactly twenty concrete connections when SUPPORT-01 is used, and no padded or identity-only owner.

PASS-02: Behavioral acceptance requires CASE-01 through CASE-12 to be owner-local to PART-05, total, effectively exclusive under explicit earlier-priority exclusions, reachable by witness, and complete over resolution, next state, command, status, and verification finding.

PASS-03: Boundary acceptance requires exactly four typed and validity-bearing root inputs and three finite root outputs with the meanings in MON-01 through CTRL-03, with no physical-success, timing, quantity, identity, or unsupported readiness signal added.

PASS-04: Ownership acceptance requires PART-05 as sole decision and state owner, PART-01 through PART-04 to retain their four distinct validity-aware qualifications, PART-06 to own nonidentity command derivation, PART-07 to own nonidentity status-and-finding derivation, and no competing or central recomputation.

PASS-05: Verification acceptance requires architecture-stage and final `hamr sysml tipe` success, compatible typed and directed endpoints, complete trace coverage, successful 3,072-snapshot analysis, successful five-family scenario analysis, and exact reporting of semantic versus support structure. Any unrun check shall remain `not-run`.

PASS-06: Designer validation separately requires fitness to NEED-01, the one-transfer station offload scope, evidence-applicability semantics, all five scenario families, the seed limitations, every pilot assumption, and DEFER-01; mechanical conformance alone is insufficient.

PASS-07: Visualization acceptance requires exactly one native-resolution `system-overview` bound to the accepted source revision and visibly distinguishing the root boundary, seven semantic usages, PART-05 as sole principal owner, thirteen directed semantic flows, and five external contexts without presenting support or context as semantic usage or implying physical transfer success.

PASS-08: Campaign acceptance fails outside semantic usages `5..8`, interactions `7..14`, cases `6..12`, or scenario families `4..6`; satisfying numeric bounds never compensates for missing responsibility, ownership, partition branch, fault response, recovery, scenario trace, or domain rationale.

## Final Designer audit and Model-realizability constraints

AUDIT-FINAL-01: The approved final design contains exactly seven semantic usages, thirteen typed directed semantic interactions, twelve owner-local nontrivial cases, five scenario families, one root, semantic depth `2`, one weak semantic region, and one principal decision owner; every counted item has a distinct responsibility or behavioral trace.

AUDIT-FINAL-02: PART-05 exclusively owns both state values, priority, all cases, complete resolution, and applicability decisions; PART-01 through PART-04 own distinct qualifications; PART-06 owns the command mapping; PART-07 owns status and finding. Every decision, state, case, output, and interaction has exactly one declared owner and no unresolved competing owner.

AUDIT-FINAL-03: The partition covers all invalid combinations, rearm blocking and clearing, active docking loss, ship failure, rejected or premature receipt, post-completion progress regression, idle unexpected evidence, admitted and denied fresh requests, immediate and delayed verification, active persistence, idle persistence, success rearm, fault recovery, neutralization, and later fresh-request reentry. INT-01 through INT-13 remain the complete recounted semantic inventory after this closure; INIT-QUAL-REQ-01, INIT-QUAL-DOCK-01, INIT-QUAL-SHIP-01, and INIT-QUAL-WH-01 add traceable startup defaults but no semantic usage, interaction, nontrivial case, scenario family, state owner, or principal owner.

MAP-MODEL-01: PART-05 may realize its two state values, initialization, invariant, pre-state-sensitive guards, next-state updates, and complete resolution through owner-local GUMBO state and compute contracts. Because compute cases are conjunctive, every generated CASE guard shall explicitly exclude all earlier PRIORITY-01 guards; this mapping shall not create a second owner or change any case.

MAP-MODEL-02: `TransferResolution` may be realized as structured finite Data whose `nextPhase`, `nextRearmRequired`, and `disposition` members are inspectable attributes. PART-05 may publish two identically constrained resolution output ports solely to realize the distinct INT-09 and INT-10 deliveries, and PART-07 shall derive both report outputs locally without tuple operations or policy recomputation.

MAP-MODEL-03: The only authorized containment mapping is the SUPPORT-01 root-System to behavior-free-Process to seven-Thread structure with fourteen marked boundary-delegation routes and six direct sibling connections. This allowance preserves exactly thirteen end-to-end semantic interactions, exactly twenty concrete connection declarations, every declared INT endpoint, semantic depth `2`, one weak semantic region, and no support credit.

MAP-MODEL-04: Model-review enumeration establishes feasibility but does not discharge ANALYSIS-01 through ANALYSIS-03. The retained analyzer shall independently enumerate all 3,072 snapshots, compare every owner-local relation and output mapping, preserve case witnesses and the state invariant, and execute all five scenario families before those checks may be reported passed.
