---
abstract_id: SA-FAA-FLIGHT-STACK-0002
baseline_revision: designer-resolution-01
source_id: faa-flight-stack-appendices-b-c-d
source_kind: human-curated-handbook-appendices
complexity: medium
semantic_usages: 8
semantic_interactions: 15
nontrivial_contract_cases: 20
scenario_families: 8
node_count: [8, 8]
edge_count: [21, 21]
containment_depth: [1, 1]
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
---

# Bounded Flight Guidance and Autopilot Stack

## Synopsis and evidence classes

SA-FAA-FLIGHT-STACK-0002 / PURPOSE-01 — This approved System Abstract specifies a bounded portion of a Flight Control System (FCS) that accepts flight-crew requests and measured aircraft attitude, provides Flight Director (FD) guidance to both Primary Flight Displays (PFDs), maintains a Reference Attitude, provides Autopilot (AP) guidance, and, when AP authority is active, commands the Control Surface Actuators (CSA) to track that reference. Its primary controlled purpose is coordinated manual-attitude guidance and automatic attitude holding with explicit engagement, control-wheel-steering, inhibition, failure, and recovery behavior.

SCOPE-01 — The system boundary is the FCS of appendix B. The Flight Guidance System (FGS) and AP of appendices C and D are allocated responsibility domains inside that boundary. The Flight Crew Interface (FCI), Attitude Heading System (AHS), left and right PFDs, CSA, Pilot, Copilot, and aircraft dynamics remain outside. No thread, process, scheduling, deployment, display rendering, actuator mechanism, or control-law implementation is selected here.

EVID-01 — A clause labeled “handbook fact” or carrying a `REQ-*` identifier preserves information stated in appendices B, C, or D. A `FORM-*` clause is a necessary formalization choice not supplied by the appendices. A `PART-*`, `INT-*`, `STATE-*`, `POL-*`, or `CASE-*` clause is selected architecture or policy for this run. A `DEFER-*` clause records a claim that is not established. These classes are not interchangeable evidence.

SCALE-01 — The medium tier is exactly eight semantic component usages, exactly 15 owner-to-owner semantic interactions under `campaign-v1` counting, exactly 20 nontrivial contract cases, and exactly eight scenario families. The complete typed inventory also contains six operationally meaningful root boundary routes, for exactly 21 total directed connections. At least two usages must derive owner-local decisions; no usage or interaction may be retained merely to meet a count.

## Source-grounded goals

GOAL-B-01 — Handbook fact, appendix B G1: Provide guidance to the Pilot and Copilot to allow them to manually fly the aircraft to a desired attitude.

GOAL-B-02 — Handbook fact, appendix B G2: Automatically fly the aircraft to hold at a desired attitude when the AP is engaged.

GOAL-B-03 — Handbook fact, appendix B G3: Ensure that unsafe aircraft maneuvers are not commanded by the FCS.

GOAL-B-04 — Handbook fact, appendix B G4: Ensure that aircraft maneuvers that might cause passenger discomfort are not commanded by the FCS.

GOAL-B-05 — Handbook fact, appendix B G5: Keep the cost of manufacturing the FCS as low as possible.

GOAL-B-06 — Handbook fact, appendix B G6: Keep the cost of operating the FCS as low as possible.

GOAL-C-01 — Handbook fact, appendix C G1: Provide guidance to the Pilot and Copilot to allow them to manually fly the aircraft to a desired attitude.

GOAL-C-02 — Handbook fact, appendix C G2: Provide guidance to the AP to allow it to automatically fly the aircraft to hold to a desired attitude.

GOAL-C-03 — Handbook fact, appendix C G3: Ensure that unsafe aircraft maneuvers are not commanded by the FGS.

GOAL-C-04 — Handbook fact, appendix C G4: Ensure that aircraft maneuvers that might cause passenger discomfort are not commanded by the FGS.

GOAL-C-05 — Handbook fact, appendix C G5: Keep the cost of manufacturing the FGS as low as possible.

GOAL-C-06 — Handbook fact, appendix C G6: Keep the cost of operating the FGS as low as possible.

GOAL-D-01 — Handbook fact, appendix D G1: Generate the Actuator Commands to hold the aircraft to the attitude provided by the FGS.

GOAL-D-02 — Handbook fact, appendix D G2: Ensure unsafe aircraft maneuvers are not commanded by the AP.

GOAL-D-03 — Handbook fact, appendix D G3: Ensure aircraft maneuvers that could cause passenger discomfort are not commanded by the AP.

GOAL-D-04 — Handbook fact, appendix D G4: Keep the cost of manufacturing the AP as low as possible.

GOAL-D-05 — Handbook fact, appendix D G5: Keep the cost of operating the AP as low as possible.

## Operational context and system boundary

CTX-FCI-01 — Handbook fact: the external FCI supplies Pilot and Copilot requests, including Display FD, Sync FD, and Engage AP. This abstract also makes the source-described control-wheel-steering request explicit through FORM-CWS-01.

CTX-AHS-01 — Handbook fact: the external AHS supplies current Aircraft Attitude, comprising roll and pitch values with validity status.

CTX-PFD-01 — Handbook fact: the external left PFD displays FD guidance, FD visibility, FCS Failed, and AP Status to the flight crew.

CTX-PFD-02 — Handbook fact: the external right PFD displays the same categories of information to the flight crew.

CTX-CSA-01 — Handbook fact: the external CSA positions aircraft control surfaces according to Roll Actuator and Pitch Actuator rate commands when AP On is true.

CTX-CREW-01 — Handbook fact: the external Pilot and Copilot indirectly view both PFDs and issue requests through the FCI; either operator may perform every source use case.

CTX-AIR-01 — Handbook fact: the aircraft and its dynamics are outside the system. The system controls commands, not achieved aircraft attitude, passenger comfort, or surface motion.

MON-CREW-01 — The finite root input `CrewRequests` is a record containing `displayFdWanted: Boolean`, `displayFdStatus: {Invalid, Valid}`, `syncFd: Boolean`, `syncFdStatus: {Invalid, Valid}`, `engageApWanted: Boolean`, `engageApStatus: {Invalid, Valid}`, `cwsHeld: Boolean`, and `cwsStatus: {Invalid, Valid}`. The FCI is responsible for the values and statuses; all status fields initially are Invalid, matching the source convention for the three tabulated requests.

MON-ATT-01 — The finite root input `AircraftAttitude` is a record containing `rollTenthDeg: -1800..1799`, `rollStatus: {Invalid, Valid}`, `pitchTenthDeg: -1800..1799`, and `pitchStatus: {Invalid, Valid}`. Units are tenths of a degree. AHS is responsible for the values, statuses, range, and stated ±0.1-degree sensing accuracy; both statuses initially are Invalid.

CTRL-FD-01 — The root output `PairedFdGuidance` contains separate left and right copies of roll guidance, pitch guidance, and FD On. Each guidance value is in `-450..450` tenths of a degree. The two copies shall be equal on every observation, but they remain distinguishable boundary fields so both PFD obligations are checkable.

CTRL-FCS-01 — The root output `PairedFcsIndications` contains separate left and right Boolean FCS Failed and Unsafe Attitude indications. Each left/right pair shall carry the same FGS-owned result on every observation. Unsafe Attitude is true exactly for the source exception annunciation reconciled by FORM-ANN-01; Invalid input is not mislabeled Unsafe.

CTRL-AP-01 — The root output `PairedApStatus` contains separate left and right values in `{Failed, Off, On}`. Both shall carry the AP-owned result and shall be equal on every observation. AP mode CWS is displayed as On because normal CWS decouples without disengaging AP; CwsSuspended is displayed as Off because the source unsafe-attitude exception disengages AP while the CWS workflow continues.

CTRL-CSA-01 — The root output `ActuatorCommand` contains `rollRateTenthDegPerSec: -200..200`, `pitchRateTenthDegPerSec: -200..200`, and `apOn: Boolean`. It directly controls only the command offered to CSA; achieved surface rate and aircraft response are outside the boundary.

BND-01 — The complete finite root boundary is exactly MON-CREW-01, MON-ATT-01, CTRL-FD-01, CTRL-FCS-01, CTRL-AP-01, and CTRL-CSA-01. There are no hidden root inputs, clocks, resets, hardware-failure flags, or achieved-state feedbacks.

## Preserved numbered normative statements

REQ-FCS-01 — Appendix B FCS requirement 1: The FCS shall generate the FD Guidance commands. Allocation: PART-FGS-02; delivered by CTRL-FD-01.

REQ-FCS-02 — Appendix B FCS requirement 2: The FCS shall set the Reference Attitude. Allocation: PART-FGS-01.

REQ-FCS-03 — Appendix B FCS requirement 3: The FCS shall set FCS Failed status to indicate if the FCS Function has failed. Allocation: PART-FGS-02; delivered by CTRL-FCS-01.

REQ-FCS-04 — Appendix B FCS requirement 4: The FCS shall generate the Actuator Commands. Allocation: PART-APS-02 and PART-APS-03; delivered by CTRL-CSA-01.

REQ-FCS-05 — Appendix B FCS requirement 5: The FCS shall set the AP Status to indicate the current status of the AP Function. Allocation: PART-APS-01; delivered by CTRL-AP-01.

REQ-FG-01 — Appendix B FG requirement 1: The FG Function shall generate the FD Guidance commands. Allocation: PART-FGS-02.

REQ-FG-02 — Appendix B FG requirement 2: The FG Function shall set the Reference Attitude. Allocation: PART-FGS-01.

REQ-FG-03 — Appendix B FG requirement 3: The FG Function shall generate the AP Guidance commands. Allocation: PART-FGS-03.

REQ-FG-04 — Appendix B FG requirement 4: The FG Function shall set the FCS Failed indication. Allocation: PART-FGS-02.

REQ-AP-01 — Appendix B AP requirement 1: The AP Function shall generate the Actuator Commands. Allocation: PART-APS-02 and PART-APS-03.

REQ-AP-02 — Appendix B AP requirement 2: The AP Function shall set the AP Status to indicate its status. Allocation: PART-APS-01.

REQ-AP-03 — Appendix B AP requirement 3: The AP Function shall generate the AP Guidance Request. Allocation: PART-APS-01.

REQ-FGS-01 — Appendix C FGS requirement 1: The FGS shall generate the FD Guidance commands. Allocation: PART-FGS-02.

REQ-FGS-02 — Appendix C FGS requirement 2: The FGS shall set the Reference Attitude. Allocation: PART-FGS-01.

REQ-FGS-03 — Appendix C FGS requirement 3: The FGS shall generate the AP Guidance commands. Allocation: PART-FGS-03.

REQ-FGS-04 — Appendix C FGS requirement 4: The FGS Function shall set the FCS Failed status. Allocation: PART-FGS-02. The appendix rationale calls this FCS Failed even though the subsystem is named FGS; this abstract preserves that wording.

REQ-APS-01 — Appendix D AP-system requirement 1: The AP system shall generate the Actuator Commands. Allocation: PART-APS-02 and PART-APS-03.

REQ-APS-02 — Appendix D AP-system requirement 2: The AP shall set the AP Status to indicate its status. Allocation: PART-APS-01.

REQ-APS-03 — Appendix D AP-system requirement 3: The AP shall generate the AP Guidance Request. Allocation: PART-APS-01.

## Necessary formalization choices

FORM-NUM-01 — All source real quantities are represented for finite analysis in their stated 0.1-unit resolution: attitude and guidance use tenths of a degree and actuator rate uses tenths of a degree surface per second. This is a value-domain choice, not a Rust representation or a physical timing claim.

FORM-RNG-01 — The appendix C aircraft-attitude table prints the Aircraft Pitch upper bound as +179.0 degrees while its third numbered AHS environmental assumption and appendices B and D state +179.9 degrees. This abstract selects the consistent `-180.0..+179.9` range and records the discrepancy rather than silently narrowing the domain.

FORM-CWS-01 — The appendices describe initiation and cancellation of control wheel steering but omit it from the FCI variable tables. `cwsHeld` with validity status is added as the smallest boundary input needed to realize use case 4; true means CWS requested/held and false means released.

FORM-ANN-01 — Appendix B exception paths require each PFD to annunciate Unsafe Attitude, but the controlled-variable table lists FD Guidance, FCS Failed, and AP Status without an Unsafe Attitude field. This abstract adds paired Boolean Unsafe Attitude fields to CTRL-FCS-01 as the smallest reconciliation; they report the FORM-SAFE-01 Unsafe class and do not assert a new display design.

FORM-REQ-01 — Appendix C gives monitored AP Guidance Request an initially Invalid status while appendices B and D present the request as an unqualified Boolean. The selected internal cross-allocation type is `{Invalid, NotRequested, Requested}`: initialization is Invalid, an initialized Off/On/Failed observation is NotRequested, and SyncPending, CWS, or CwsSuspended-with-held-CWS is Requested. PART-FGS-01 synchronizes only on Requested and Safe attitude.

FORM-SAFE-01 — “Safe attitude” is not numerically defined by the appendices. For this bounded model, a valid attitude is `Safe` for synchronization and AP engagement when roll and pitch are each within `-450..450` tenths of a degree, inclusive; a valid attitude outside either bound is `Unsafe`. This selected envelope aligns with the source guidance range but is not an aircraft safety certification threshold.

FORM-GUID-01 — The appendices omit the guidance relation. With a valid reference and Safe attitude, FD roll and pitch guidance are the signed reference-minus-measured errors saturated to `-450..450`; FD On additionally follows requested FD state. AP roll and pitch guidance are the stored Reference Attitude, which FORM-SAFE-01 already bounds, and AP Guidance Valid is true exactly when the reference is valid, attitude is Safe, and FD state is Displayed. Unqualified numeric guidance is zero. No separate FD-product qualification is created because those three owner inputs already determine FD usability in the selected relations.

FORM-ACT-01 — The appendices omit the AP control law. The bounded proposal relation is three-level per axis: AP-guidance-minus-measured-attitude above +1 tenth degree proposes +50 tenths degree-surface/second, below -1 proposes -50, and within the inclusive deadband proposes zero. This deterministic experiment policy stays inside the source actuator range; it is not a production control law or a demonstrated comfort limit.

FORM-STEP-01 — Behavior is interpreted as deterministic logical observations. Every observation reads the prior retained state, classifies current boundary input, computes next state and outputs, and commits next state atomically. No elapsed-time, period, latency, plant response, or convergence claim follows from an observation.

FORM-INIT-01 — Safe initialization is: FD state Cleared, Reference Valid false with numeric reference fields zero but unusable, AP mode Off, AP Guidance Request Invalid, AP Status Off, FCS Failed true while required guidance inputs are unavailable, Unsafe Attitude false, and actuator rates/AP On all zero/false.

FORM-FAIL-01 — Because no hardware-failure input is in the frozen source boundary, FGS failure in this bounded model means required attitude status is Invalid or Reference Attitude is invalid; valid Unsafe attitude is separately inhibited and annunciated without being mislabeled FCS Failed. AP failure means authority input is invalid, the direct attitude class is Invalid, or AP guidance is unavailable while direct attitude is Safe and AP is active or pending. Direct Unsafe attitude follows its higher-priority Off/CwsSuspended inhibition instead of being relabeled a guidance failure. The bounded proposer can produce only `-50`, `0`, or `+50`, so no generated range-feedback failure is claimed. No unmodeled hardware failure is claimed detected.

FORM-REC-01 — FGS Failed clears automatically when attitude status and Reference Attitude are valid again; Unsafe status-valid attitude may keep guidance inhibited and Unsafe Attitude asserted while FCS Failed is false. AP Failed is latched until a valid explicit disengage request is present while the separately supplied attitude class and AP-guidance qualification are acceptable; it then recovers to Off, never directly to On.

## Selected parts and responsibilities

PART-FCS-01 — Crew Command Qualifier is a stateless FCS boundary owner. It derives one `QualifiedCrewDisposition` from all four request values and statuses, suppresses invalid nonauthority requests, derives force-disengage from invalid authority requests, and resolves simultaneous command conflicts according to POL-PRI-01. It is not credited for copying the request record.

PART-FCS-02 — Attitude Safety Qualifier is a stateless FCS boundary owner. It derives exactly one of `{Invalid, Unsafe, Safe}` from both axis values and statuses and provides the qualified attitude values only in the Safe or Unsafe cases. This three-way classification is not a renamed status field.

PART-FGS-01 — Reference and FD State Manager is the FGS state/decision owner for Reference Attitude validity and value and the requested FD state `{Cleared, Displayed}`. It applies display, synchronization, AP-guidance-request, AP-active-clear, unsafe, and failure priorities; it does not compute guidance.

PART-FGS-02 — FD Guidance and Health Generator is the FGS decision owner for FD Guidance, FD On, FCS Failed, and Unsafe Attitude annunciation. It combines qualified Aircraft Attitude with retained Reference Attitude and FD state according to FORM-GUID-01, derives paired FD error cues when usable, and derives the failure/unsafe/neutral/hidden results when unusable; it does not generate AP Guidance or a redundant product-qualification signal.

PART-FGS-03 — AP Guidance Generator is the FGS decision owner for AP Guidance and Guidance Valid. It combines qualified Aircraft Attitude with retained Reference Attitude/FD state according to FORM-GUID-01 and derives `{Available, Unavailable}` without exporting attitude cause codes. It does not compute FD cues or FCS Failed, and its multi-input applicability decision is not an unconditional reference copy.

PART-APS-01 — AP Engagement Manager is the AP state/priority owner for mode `{Off, SyncPending, On, CWS, CwsSuspended, Failed}`, AP Status, actuation authority, AP Guidance Request, and the AP-active clear-inhibit fact. It combines qualified crew disposition, a direct three-class Qualified Attitude fact, and separately supplied AP-guidance qualification to distinguish Unsafe inhibition from Invalid failure and to decide fresh engagement, synchronization completion, CWS decoupling/recoupling, unsafe CWS suspension, disengagement, failure latching, and explicit recovery.

PART-APS-02 — Actuator Rate Proposer is the AP decision owner for candidate roll and pitch rates. It combines AP Guidance and qualified Aircraft Attitude using FORM-ACT-01; it produces a distinct proposed-rate fact and cannot authorize CSA output.

PART-APS-03 — Actuator Safety Gate is the final AP authority owner for CTRL-CSA-01. It combines proposed-rate validity with actuation authority, publishes the bounded proposal only in the accepted partition, and emits neutral commands whenever authority or validity is absent. The source `-200..200` bounds remain type and invariant checks, but no unreachable range-fault result or feedback interaction receives semantic credit.

## Ownership audit

OWN-FCS-01 — PART-FCS-01 locally derives a multi-input conflict/validity disposition; canonical evidence must include CASE-CMD-01 and CASE-CMD-02. A one-to-one request code translation is insufficient.

OWN-FCS-02 — PART-FCS-02 locally derives a three-class attitude qualification from two values and two statuses; canonical evidence must include CASE-ATT-01 and CASE-ATT-02.

OWN-FGS-01 — PART-FGS-01 locally derives retained Reference Attitude, Reference Valid, and FD state from prior state plus competing requests; canonical evidence must include CASE-REF-01 through CASE-REF-03.

OWN-FGS-02 — PART-FGS-02 locally derives per-axis FD error guidance, FD visibility, paired FCS failure, and the distinct paired Unsafe Attitude annunciation from reference, attitude class, and FD state; canonical evidence must include CASE-FD-01 and CASE-FD-02.

OWN-FGS-03 — PART-FGS-03 locally derives AP desired-attitude guidance and an availability fact from reference, attitude, and FD state; canonical evidence must include CASE-APG-01 and CASE-APG-02. An unconditional copy of Reference Attitude is insufficient because availability must depend on the complete multi-input applicability partition.

OWN-APS-01 — PART-APS-01 locally derives six-mode next state, three-valued AP Status, authority, synchronization request, and AP-active clear inhibition from independent crew, attitude-class, and AP-guidance facts; canonical evidence must include CASE-AP-01 through CASE-AP-06.

OWN-APS-02 — PART-APS-02 locally derives a three-level per-axis rate proposal from desired and measured attitudes; canonical evidence must include CASE-PROP-01.

OWN-APS-03 — PART-APS-03 locally derives the complementary publish/inhibit results from independent authority and proposal validity; canonical evidence must include CASE-GATE-01 and CASE-GATE-02. Copying proposal rates only inside the accepted branch does not erase the owner-local gate decision.

## Complete typed directed interaction inventory

INT-BND-01 — `CrewRequests`, MON-CREW-01, flows from root/CTX-FCI-01 to PART-FCS-01. This is the only raw crew-request interaction.

INT-BND-02 — `AircraftAttitude`, MON-ATT-01, flows from root/CTX-AHS-01 to PART-FCS-02. This is the only raw attitude interaction.

INT-BND-03 — `PairedFdGuidance`, CTRL-FD-01, flows from PART-FGS-02 to the root for CTX-PFD-01 and CTX-PFD-02.

INT-BND-04 — `PairedFcsIndications`, CTRL-FCS-01, flows from PART-FGS-02 to the root for CTX-PFD-01 and CTX-PFD-02.

INT-BND-05 — `PairedApStatus`, CTRL-AP-01, flows from PART-APS-01 to the root for CTX-PFD-01 and CTX-PFD-02.

INT-BND-06 — `ActuatorCommand`, CTRL-CSA-01, flows from PART-APS-03 to the root for CTX-CSA-01.

INT-FCS-01 — `QualifiedFdAndSyncDisposition` flows from PART-FCS-01 to PART-FGS-01; it contains derived display/sync actions and conflict outcome, not raw request fields.

INT-FCS-02 — `QualifiedApDisposition` flows from PART-FCS-01 to PART-APS-01; it contains derived engage/disengage/CWS actions, conflict outcome, and whether forced removal came from invalid authority input or valid explicit disengagement so PART-APS-01 can select Failed versus Off.

INT-FCS-03 — `QualifiedAttitude` flows from PART-FCS-02 to PART-APS-01. Its distinct `{Safe, Unsafe, Invalid}` class lets the AP owner apply Unsafe inhibition and Invalid failure directly rather than infer or duplicate that distinction from renamed AP-guidance cause codes.

INT-FGS-01 — `QualifiedAttitude` flows from PART-FCS-02 to PART-FGS-01 for safe synchronization and unsafe/invalid inhibition.

INT-FGS-02 — `QualifiedAttitude` flows from PART-FCS-02 to PART-FGS-02 for FD error, visibility, and FCS Failed generation.

INT-FGS-03 — `ReferenceAndFdState` flows from PART-FGS-01 to PART-FGS-02; it contains Reference Attitude, Reference Valid, and requested FD state.

INT-FGS-04 — `QualifiedAttitude` flows from PART-FCS-02 to PART-FGS-03 for AP Guidance and its multi-input availability decision.

INT-FGS-05 — `ReferenceAndFdState` flows from PART-FGS-01 to PART-FGS-03 and contains Reference Attitude, Reference Valid, and FD state so AP Guidance availability can enforce the source engagement precondition that both FDs are displayed.

INT-CROSS-01 — `ApGuidanceAndValidity` flows from PART-FGS-03 to PART-APS-01 for engagement completion, invalid-guidance handling, and recovery decisions. It carries guidance plus Available/Unavailable only; direct Unsafe/Invalid attitude handling comes solely from INT-FCS-03.

INT-CROSS-02A — `ApGuidanceRequest` flows from PART-APS-01 to PART-FGS-01 with the three-valued FORM-REQ-01 code. Requested drives Reference Attitude synchronization before fresh AP authority and throughout CWS.

INT-CROSS-02B — `ApActiveClearInhibit` flows from PART-APS-01 to PART-FGS-01. It independently enforces the appendix B use-case-2 rule that an active AP blocks FD clearing; it affects a different PART-FGS-01 decision than INT-CROSS-02A.

INT-CROSS-03 — `ApGuidanceAndValidity` flows from PART-FGS-03 to PART-APS-02 for rate proposal derivation.

INT-APS-01 — `QualifiedAttitude` flows from PART-FCS-02 to PART-APS-02 for candidate actuator-rate derivation.

INT-APS-02 — `ActuationAuthority` flows from PART-APS-01 to PART-APS-03; true exactly in AP mode On, never in SyncPending, CWS, CwsSuspended, Off, or Failed.

INT-APS-03 — `ProposedActuatorRates` flows from PART-APS-02 to PART-APS-03 and contains both candidate rates plus proposal validity.

INT-AUD-01 — The complete inventory is INT-BND-01 through INT-BND-06; INT-FCS-01 through INT-FCS-03; INT-FGS-01 through INT-FGS-05; INT-CROSS-01, INT-CROSS-02A, INT-CROSS-02B, and INT-CROSS-03; and INT-APS-01 through INT-APS-03: exactly 21 directed connections. Excluding the six root boundary routes under `campaign-v1` leaves exactly 15 owner-to-owner semantic interactions. Every entry changes a named consumer decision or boundary observation; none is count padding.

## State, modes, transitions, priority, and recovery

STATE-FGS-01 — PART-FGS-01 solely owns `referenceRoll`, `referencePitch`, `referenceValid`, and `fdState`. No other usage may recompute or retain a shadow Reference Attitude or FD state.

STATE-APS-01 — PART-APS-01 solely owns `apMode: {Off, SyncPending, On, CWS, CwsSuspended, Failed}`. No other usage may infer and retain a competing mode; CTRL-AP-01 and actuation authority must be functions of this owned state.

MODE-APS-01 — Off is externally observable as AP Status Off, AP On false, neutral actuator rates, and no CWS coupling. It is the initial mode.

MODE-APS-02 — SyncPending is externally observable as AP Status Off, AP On false, neutral actuator rates, and AP Guidance Request Requested. It separates a fresh request from successful synchronized engagement.

MODE-APS-03 — On is externally observable as AP Status On and, when proposal checks pass, AP On true with actuator commands enabled.

MODE-APS-04 — CWS is externally observable as AP Status On but AP On false and neutral actuator commands; Reference Attitude follows valid safe Aircraft Attitude while CWS remains held.

MODE-APS-05 — CwsSuspended is externally observable as AP Status Off, AP On false, and neutral actuator commands after Unsafe attitude disengages AP during CWS. While CWS remains valid/held, Safe attitude resumes Reference synchronization but never restores AP authority; release ends the workflow in Off.

MODE-APS-06 — Failed is externally observable as AP Status Failed, AP On false, neutral actuator commands, and a latched recovery obligation.

TRANS-APS-01 — Off transitions to SyncPending on a fresh valid engage request only when FD is displayed and the direct Aircraft Attitude class is Safe; PART-APS-01 asserts AP Guidance Request while SyncPending. SyncPending transitions to On on a later observation only when synchronized Guidance Valid is true and all separately supplied qualifications remain acceptable. An inadmissible fresh request remains Off; an invalid pending authority, attitude, or guidance input transitions to Failed; explicit disengagement transitions pending to Off.

TRANS-APS-02 — On transitions to CWS on a valid held CWS request. CWS transitions to On on valid release while attitude and guidance remain qualified; CWS transitions to CwsSuspended on Unsafe attitude and to Failed on Invalid input. CwsSuspended remains without authority, resumes Reference synchronization when attitude becomes Safe while CWS stays held, and transitions to Off on valid CWS release or explicit disengagement; Invalid input transitions it to Failed.

TRANS-APS-03 — On transitions to Off on a valid explicit disengage request or direct valid Unsafe attitude. CWS or CwsSuspended transitions to Off on valid explicit disengagement. On, CWS, or CwsSuspended transitions to Failed on invalid authority input, direct Invalid attitude, or invalid guidance, except that valid Unsafe attitude follows TRANS-APS-02 for CWS.

TRANS-APS-04 — Failed transitions to Off only on a valid explicit disengage request while the direct attitude class and separately supplied guidance are again qualified. A fresh engage request in Failed is ignored; recovery cannot directly restore authority.

POL-PRI-01 — The total same-observation priority from highest to lowest is: initialization; latched AP recovery conditions; current FGS/AP fault or invalid authority input; valid explicit AP disengage; Unsafe-attitude AP inhibition; CWS decouple/release; fresh AP engage with synchronization; explicit Sync FD; Display FD request; prior-state retention. For the typed AP disposition, either `ForceDisengage` action denotes invalid authority, every lower-priority branch excludes all higher-priority guards, and `None` retains the mode appropriate to the prior-state partition. Within FD handling, FGS failure clears FD ahead of every request, an active AP blocks a crew clear request as in appendix B use case 2 exception 1, and a fresh display from Cleared synchronizes before displaying.

POL-PRI-02 — `engageApWanted=false` is the explicit disengage command and dominates simultaneous `cwsHeld=true`, `syncFd=true`, or `displayFdWanted=true`. A simultaneous request to clear FD and freshly engage AP leaves AP Off and clears FD. CWS is ignored unless prior AP mode is On, CWS, or CwsSuspended. These choices close combinations the source does not order.

POL-REC-01 — After Unsafe attitude in On, AP authority is removed by transition to Off; a later Safe attitude alone does not reengage AP, and a fresh valid engage request is required. During CWS, Unsafe instead follows the source exception through CwsSuspended: later Safe attitude resumes synchronization while held but never authority, and release ends Off. After invalid authority, attitude, or guidance input, mode is Failed and the explicit recovery in TRANS-APS-04 followed by the two-observation Off→SyncPending→On path in TRANS-APS-01 is required.

## Required nontrivial contract cases

CASE-CMD-01 — PART-FCS-01 shall derive normal FD/sync and AP dispositions from the combination of all valid request fields, including recognition of fresh display, sync, fresh engage, explicit disengage, CWS hold, and CWS release; the result shall conform to POL-PRI-01 and POL-PRI-02 rather than reproduce the input record.

CASE-CMD-02 — PART-FCS-01 shall totally handle every invalid/conflicting command combination: invalid Display or Sync suppresses only that action; invalid Engage or invalid CWS derives force-disengage; simultaneous valid conflicts resolve by POL-PRI-02. No invalid field may create engagement, synchronization, or actuation authority.

CASE-ATT-01 — PART-FCS-02 shall derive Safe exactly when both statuses are Valid, both values are representable, and both values satisfy FORM-SAFE-01; it shall preserve the two qualified numeric values for downstream calculations.

CASE-ATT-02 — PART-FCS-02 shall derive Unsafe exactly for status-valid representable attitude outside FORM-SAFE-01 and Invalid whenever either status is Invalid or a value is not representable. These cases close the complement of CASE-ATT-01.

CASE-REF-01 — PART-FGS-01 shall initialize to Cleared/reference-invalid and, whenever guidance failure prevents a meaningful display, retain the numeric reference without making it valid and require downstream FD On false; no failure path may invent a reference.

CASE-REF-02 — PART-FGS-01 shall set Reference Attitude to current qualified attitude and Reference Valid true on safe fresh FD display, valid Sync FD, valid CWS hold, or AP Guidance Request Requested, subject to POL-PRI-01; the same observation shall not select more than one different reference.

CASE-REF-03 — PART-FGS-01 shall otherwise retain Reference Attitude and apply the complete FD state partition: failure clears, active AP blocks clear, valid inactive clear clears, valid display displays after successful sync, and absence/invalidity of a display action retains prior state.

CASE-FD-01 — PART-FGS-02 shall, when Reference Valid and attitude is Safe, derive left/right-equal FD error guidance saturated to `-450..450`, set FD On exactly when requested FD state is Displayed, set both FCS Failed copies false, and set both Unsafe Attitude copies false; each axis must depend on both its reference and measured value.

CASE-FD-02 — PART-FGS-02 shall, when reference is invalid or attitude is Unsafe/Invalid, set both FD On copies false and all FD numeric guidance fields to zero. It shall set both FCS Failed copies true exactly for Invalid attitude or invalid reference and false for status-valid Unsafe attitude; it shall set both Unsafe Attitude copies true exactly for the Unsafe class and false for Invalid attitude or invalid reference. This closes the complete complement of CASE-FD-01 and supplies the selected initial/failure/recovery/annunciation result without a forwarding-only health usage.

CASE-APG-01 — PART-FGS-03 shall, when Reference Valid, attitude is Safe, and FD state is Displayed, derive AP roll and pitch Guidance from the bounded Reference Attitude and set qualification Available/Guidance Valid true; this is a multi-input applicability decision over reference validity/value, measured-attitude class, and the source AP-engagement precondition rather than an unconditional copy.

CASE-APG-02 — PART-FGS-03 shall otherwise set AP numeric Guidance to zero, Guidance Valid false, and availability Unavailable; this closes the complete invalid-attitude, Unsafe-attitude, invalid-reference, and FD-cleared complement of CASE-APG-01 without exporting those causes as renamed codes. PART-APS-01 shall consume this validity separately from its direct Qualified Attitude input.

CASE-AP-01 — PART-APS-01 shall initialize Off with AP Status Off, authority false, Guidance Request Invalid, and clear-inhibit false; subsequent Off observations emit NotRequested and retain Off until an admissible fresh request with direct Safe attitude and available FD/AP-guidance prerequisites transitions to SyncPending. Either invalid-authority action or direct Invalid attitude selects Failed first; explicit disengage and Unsafe inhibition then select Off; an inadmissible request shall remain Off without stale authority.

CASE-AP-02 — PART-APS-01 shall keep AP Status Off and authority false while SyncPending, emit Guidance Request Requested, and enter On only on a later observation with newly synchronized valid guidance, direct Safe attitude, and every TRANS-APS-01 qualification. Invalid pending authority (either force action), direct Invalid attitude, or unavailable guidance while direct attitude is Safe selects Failed before the mutually exclusive explicit-disengagement and direct-Unsafe Off branches; stale pre-request guidance cannot complete engagement.

CASE-AP-03 — PART-APS-01 shall enter CWS from On only on a valid hold with direct Safe attitude and Available guidance after excluding invalid authority, direct Invalid attitude, Safe/unavailable-guidance fault, and explicit disengagement. It shall keep AP Status On while setting authority false and request continuous Reference synchronization through INT-CROSS-02A; its independently derived AP-active fact shall travel through INT-CROSS-02B. The predicate consumes the separate guidance input so this branch cannot overlap a higher-priority fault branch.

CASE-AP-04 — PART-APS-01 shall totally partition CWS and CwsSuspended observations. Invalid authority, direct Invalid attitude, or unavailable guidance while direct attitude is Safe selects Failed first; explicit disengagement selects Off next. From CWS, Unsafe/held enters CwsSuspended and Unsafe/not-held selects Off; Safe/Available release returns to On and Safe/Available hold or `None` retains CWS. From CwsSuspended, release enters Off while hold or `None` retains CwsSuspended (and Safe/held resumes synchronization), always without authority.

CASE-AP-05 — PART-APS-01 shall cover exactly the On observations not selected by CASE-AP-03. It shall latch Failed for either invalid-authority action, direct Invalid attitude, or unavailable active guidance while direct attitude is Safe; otherwise valid explicit disengage or direct Unsafe attitude selects Off. With direct Safe attitude, Available guidance, no higher-priority guard, and no qualified hold, it retains On with authority true. Thus On+hold+Unsafe and On+hold+fault observations remain covered by this case and cannot decouple into CWS. None may auto-reengage.

CASE-AP-06 — PART-APS-01 shall recover Failed only by TRANS-APS-04 to Off when explicit disengagement is valid, neither typed authority action reports invalid authority, direct attitude is Safe, and guidance is Available, with AP Status Off, authority false, Guidance Request NotRequested, and clear-inhibit false. All other Failed observations retain Failed, neutral authority, and NotRequested.

CASE-PROP-01 — PART-APS-02 shall derive each valid candidate rate from AP Guidance and the corresponding measured attitude using the three-way error partition in FORM-ACT-01; the two axes are independent and both proposal-valid conditions must hold. For the complete complementary partition, it shall mark the proposal invalid and produce zero candidates whenever AP Guidance is invalid or attitude is not Safe.

CASE-GATE-01 — PART-APS-03 shall publish the proposed rates with AP On true exactly when authority is true and proposal-valid is true. FORM-ACT-01 makes each valid proposed rate one of `-50`, `0`, or `+50`, and the source `-200..200` limits shall also remain explicit payload-type and local invariant checks.

CASE-GATE-02 — PART-APS-03 shall implement the complete complement of CASE-GATE-01: absent authority or an invalid proposal produces zero roll rate, zero pitch rate, and AP On false. This inhibit decision receives contract credit; an unreachable out-of-range branch, fault code, or feedback edge does not.

CASE-AUD-01 — CASE-CMD-01, CASE-CMD-02, CASE-ATT-01, CASE-ATT-02, CASE-REF-01 through CASE-REF-03, CASE-FD-01, CASE-FD-02, CASE-APG-01, CASE-APG-02, CASE-AP-01 through CASE-AP-06, CASE-PROP-01, and CASE-GATE-01 through CASE-GATE-02 are exactly 20 nontrivial contract cases. Each is allocated to one owner, and their antecedents jointly cover initialization, nominal, boundary, invalid, conflicting, fresh-request, active, fault, and recovery paths.

CONTRACT-AUD-01 — The exact owner-local expectation is two cases at PART-FCS-01, two at PART-FCS-02, three at PART-FGS-01, two at PART-FGS-02, two at PART-FGS-03, six at PART-APS-01, one at PART-APS-02, and two at PART-APS-03, totaling 20. Each case shall constrain a fact derived by that owner; pass-through, type renaming, routing, and unreachable defensive branches receive no case credit.

## Required behaviors, risks, and mitigations

BEH-FD-01 — The system shall activate, clear, synchronize, and generate paired FD Guidance according to REQ-FCS-01, REQ-FCS-02, REQ-FG-01, REQ-FG-02, REQ-FGS-01, REQ-FGS-02, CASE-REF-01 through CASE-REF-03, and CASE-FD-01 through CASE-FD-02. Verification: contract inspection plus bounded analysis; pass only if every finite command/attitude class selects exactly one result and the left/right outputs agree.

BEH-AP-01 — The system shall generate AP Guidance, AP Guidance Request, AP Status, and bounded Actuator Commands according to REQ-FCS-04, REQ-FCS-05, REQ-FG-03, REQ-AP-01 through REQ-AP-03, REQ-FGS-03, and REQ-APS-01 through REQ-APS-03. Verification: contract inspection and bounded analysis; pass only if fresh engagement, active tracking, CWS, disengagement, failure, and recovery are all represented and authority is never stale.

BEH-HLT-01 — The system shall generate paired FCS Failed according to REQ-FCS-03, REQ-FG-04, REQ-FGS-04, FORM-FAIL-01, CASE-FD-01, and CASE-FD-02. Verification: contract inspection and bounded analysis; pass only if initialization, invalid attitude/reference, status-valid Unsafe attitude, and restored valid inputs produce the specified distinct results on both PFD fields.

BEH-ANN-01 — The system shall annunciate Unsafe Attitude on both PFD boundary fields during source unsafe-attitude exception paths according to FORM-ANN-01 and CASE-FD-02, and shall clear that annunciation for Safe or Invalid classes. Verification: bounded analysis; pass only if left/right fields agree and no Invalid input is reported as Unsafe.

RISK-MAN-01 — A fresh engagement, synchronization, or FD-display request at Unsafe/Invalid attitude could establish an unusable Reference Attitude and lead to unsafe guidance or actuation. No quantitative likelihood or certified severity is available from the appendices.

FAULT-MAN-01 — The system shall mitigate RISK-MAN-01 by attitude qualification, safe synchronization/engagement preconditions, zero invalid guidance, and zero actuation without authority. Verification: CASE-ATT-01, CASE-ATT-02, CASE-REF-02, CASE-FD-02, CASE-APG-02, CASE-AP-02, and CASE-GATE-01 must all be present and bounded analysis must find no violating finite observation.

RISK-ACT-01 — Loss of authority, CWS decoupling, or invalid active attitude/guidance could otherwise leave nonzero CSA commands or an incorrect AP On indication.

FAULT-ACT-01 — The system shall mitigate RISK-ACT-01 by the AP mode transitions and independent Actuator Safety Gate: every inhibited or failed observation publishes zero rates and AP On false. Verification: CASE-AP-03 through CASE-AP-06 and CASE-GATE-01 through CASE-GATE-02 must make the unsafe conjunction unreachable, while type/invariant checks establish that every published rate remains within the source bounds.

RISK-CREW-01 — Conflicting or invalid flight-crew requests could otherwise create simultaneous engage, clear, sync, and CWS actions with ambiguous priority.

FAULT-CREW-01 — The system shall mitigate RISK-CREW-01 using the complete priority in POL-PRI-01 and POL-PRI-02, with invalid authority requests and explicit disengagement taking precedence. Verification: exhaustive enumeration of the finite CrewRequests validity/value combinations must yield one QualifiedCrewDisposition each.

## Scenario families

SCN-FD-01 — Activate and fly the FD: from Off/Cleared with Safe attitude and valid display true, the reference synchronizes to current attitude, both FD fields display zero initial error, later attitude error produces bounded paired cues, and a valid Sync FD refreshes the reference. An Unsafe attempt leaves FD hidden and asserts both Unsafe Attitude indications until attitude returns Safe. This realizes appendix B use case 1 plus its exception.

SCN-FD-02 — Clear the FD: when AP is Off, valid display false clears both FD displays; while AP is On or CWS, the clear request is denied until valid AP disengagement occurs, after which a repeated clear succeeds. This realizes appendix B use case 2 and its exception.

SCN-AP-01 — Fresh AP engagement: with FD Displayed, Safe attitude, and no fault, a valid engage request enters SyncPending, displays AP Status Off, generates AP Guidance Request, and synchronizes the reference; a later qualified-guidance observation enters On, displays paired AP Status On, and authorizes bounded actuator commands. An Unsafe attempt remains Off and asserts both Unsafe Attitude indications. This realizes appendix B use case 3 and its unsafe exception.

SCN-CWS-01 — Control wheel steering: from On, valid CWS hold enters CWS, preserves displayed AP Status On, publishes zero actuator commands, and continuously synchronizes the reference to Safe attitude; valid Safe release recouples to On and tracks the new reference. If attitude becomes Unsafe while held, AP disengages to CwsSuspended, both PFDs annunciate Unsafe Attitude, and synchronization pauses; when attitude becomes Safe the annunciation clears and synchronization resumes while authority remains off, and valid release ends Off. Invalid input enters Failed. This realizes the main and exception paths of appendix B use case 4.

SCN-OFF-01 — AP disengagement: from On or CWS, valid engage false has priority, enters Off, produces paired AP Status Off, deasserts AP On, and zeroes both actuator commands; a later valid engage true is a new request. This realizes appendix B use case 5.

SCN-SAFE-01 — Unsafe-attitude denial and recovery outside CWS: valid attitude outside FORM-SAFE-01 denies fresh display synchronization and AP engagement; from On it removes AP authority to Off. Returning Safe does not reengage; the crew must issue a fresh admissible request. The distinct held-CWS exception is SCN-CWS-01.

SCN-INV-01 — Invalid-input/FGS failure: an invalid attitude makes guidance unavailable, clears FD On, asserts paired FCS Failed, and forces active AP to Failed with zero actuation. Restored Safe attitude plus a new valid reference clears FCS Failed, while AP remains Failed until explicit recovery.

SCN-FAIL-01 — AP authority/input failure and recovery: while AP is On, an Invalid Engage or CWS status, direct Invalid attitude, or invalid active guidance produces Failed with paired AP Status Failed and zero actuation. Valid explicit disengage with restored qualified inputs recovers only to Off; a separate Off→SyncPending→On engagement is required.

SCN-AUD-01 — The complete scenario inventory is SCN-FD-01, SCN-FD-02, SCN-AP-01, SCN-CWS-01, SCN-OFF-01, SCN-SAFE-01, SCN-INV-01, and SCN-FAIL-01: exactly eight distinct families, with no scenario credited solely for a different data value or renamed path.

## Assumptions and constraints

ASM-AHS-01 — Source-grounded: CTX-AHS-01 is responsible for roll and pitch in `-180.0..+179.9` degrees inclusive, sensed to ±0.1 degree, and for status accurately indicating validity. Rationale: the four numbered AHS environmental assumptions in appendices B, C, and D.

ASM-PFD-01 — Source-grounded: guidance delivered to CTX-PFD-01 and CTX-PFD-02 remains in `-45.0..+45.0` degrees inclusive at 0.1-degree resolution. Rationale: the four numbered PFD environmental assumptions in appendices B and C.

ASM-CSA-01 — Source-grounded: commands delivered to CTX-CSA-01 remain in `-20.0..+20.0` degrees surface/second inclusive at 0.1 resolution. Rationale: the four numbered CSA environmental assumptions in appendices B and D.

ASM-FCI-01 — Selected beyond-source assumption: CTX-FCI-01 supplies each Boolean request as a current desired/held level with an independent honest validity status; valid engage true observed while AP is Off and not already processing a request is treated as a fresh engagement request. Rationale: the source tables give Boolean values/statuses but no event semantics, and this interpretation needs no edge-history state in PART-FCS-01.

ASM-ORD-01 — Selected beyond-source assumption: FORM-STEP-01 logical observations are sufficiently ordered for state-transition reasoning, but they do not assert the source AP Status latency of 0.1 seconds. Rationale: the non-executable run has no scheduler or physical time base.

ASM-SYS-01 — Selected architecture constraint: exactly one root FCS usage contains the eight flat semantic usages; allocation to FGS or AP is expressed by responsibility and trace, not by nonsemantic wrapper usages. Rationale: this preserves the source allocation while avoiding owner-count padding.

## Deferred and prohibited claims

DEFER-DET-01 — Detailed behavior and performance requirements absent from the appendices remain deferred except for the explicitly selected bounded formalizations above. The model must not imply that FORM-SAFE-01 or FORM-ACT-01 is FAA-approved, aircraft-specific, stable, controllable, or physically adequate.

DEFER-COM-01 — GOAL-B-04, GOAL-C-04, and GOAL-D-03 are not validated as passenger-comfort guarantees. The ±5.0 degree-surface/second selected proposal is only a finite command policy; no passenger model, acceleration limit, turbulence model, or comfort criterion is available.

DEFER-CST-01 — GOAL-B-05, GOAL-B-06, GOAL-C-05, GOAL-C-06, GOAL-D-04, and GOAL-D-05 are informational cost goals. No manufacturing or operating cost model is in scope, so these goals shall not be reported verified or validated.

DEFER-SAF-01 — GOAL-B-03, GOAL-C-03, and GOAL-D-02 receive bounded command-inhibition evidence only. System safety, hazard probability, physical maneuver safety, fail-operational behavior, redundancy, and certification remain deferred.

DEFER-EXE-01 — The seed declares no executable profile. HAMR/GumboX code generation, Rust/Verus realization, scheduling, application execution, scenario execution, and proof are `not-run`, not passed.

DEFER-TIM-01 — The appendix D AP Status latency of 0.1 seconds is preserved as a source fact but is not allocated as a verified timing requirement because this run has no executable time base. The Model Agent shall not add a periodicity or latency claim to make it appear satisfied.

## Generation support and bounded end-to-end analysis

GEN-SUP-01 — `@generated-support` is allowed only for explicit repository-library imports; data, enum, and record declarations; `attribute` declarations for every GUMBO-inspected record field; ports and connector syntax realizing the frozen inventory; pure helper predicates that are definitionally equivalent to a named FORM or CASE clause; analyzer partition scaffolding; visualization layout; and trace annotations. Each use shall name this clause and its supported abstract clause. Generated support shall not add a semantic usage, semantic interaction, root port, state variable, mode, transition, hidden input, domain behavior, contract case, or claim, and shall not change any producer, consumer, direction, ownership, priority, recovery rule, or metric.

GEN-SUP-02 — Generation shall use explicit SysML-AADL library imports and shall declare the paired PFD and actuator payloads as cohesive records whose GUMBO-observed fields are attributes. Left/right equality remains local at PART-FGS-02 or PART-APS-01. No display relay, record-field adapter, shadow state, or fixture-derived implicit type assumption is authorized.

ANALYSIS-01 — The bounded end-to-end analyzer shall compose the canonical owner-local relations through exactly INT-FCS-01 through INT-FCS-03, INT-FGS-01 through INT-FGS-05, INT-CROSS-01, INT-CROSS-02A, INT-CROSS-02B, INT-CROSS-03, and INT-APS-01 through INT-APS-03. It shall range over every root command Boolean/status combination, prior FGS and AP state including reference validity, and both attitude axes/statuses, then cover every derived guidance-validity and actuation-authority result. It shall not inject those derived facts as hidden root choices, replace an owner relation with forwarding logic, or infer a removed FD-product or range-feedback channel.

ANALYSIS-02 — Finite-domain factoring is allowed only when extensionally exact. For each axis, the retained partition or proof shall cover the raw attitude endpoints `-1800` and `1799`; Invalid status; the Safe/Unsafe boundaries and neighbors around `-450` and `+450`; reference-minus-attitude error regions below, at, and above the FD saturation boundaries `-450` and `+450`; and AP-guidance-minus-attitude regions below `-1`, within the inclusive `-1..+1` deadband, and above `+1`. The two axes, command/status classes, and prior/next state shall then be composed to establish totality and the invariants in PASS-04; the three labels Safe/Unsafe/Invalid alone are insufficient.

## Structural bounds, trace rules, and objective pass criteria

STRUCT-01 — The generated architecture shall have exactly one explicit root FCS system usage, exactly eight reachable semantic usages realizing PART-FCS-01 through PART-APS-03, containment depth exactly one beneath the root, one weakly connected region, no composite wrapper credited as a ninth usage, and no untraced component.

STRUCT-02 — The generated architecture shall realize exactly the 21 directed connections in the complete interaction inventory: six root boundary routes and 15 owner-to-owner semantic interactions. One record may carry several cohesive fields, but no listed interaction may be split or merged in a way that changes its producer, consumer, direction, type meaning, or count without Designer revision.

STRUCT-03 — Required state is limited to STATE-FGS-01 and STATE-APS-01. Helper state, shadow modes, duplicated Reference Attitude, deployment bindings, nested subsystem wrappers, clocks, timers, and extra root ports are prohibited unless returned to the Designer as a concrete realizability question.

TRACE-01 — Every actionable identifier in this abstract shall map to one or more model elements or be explicitly marked informational/deferred. Every significant component, port, connection, state variable, mode, transition, and contract clause shall trace to an abstract identifier or carry a specific generated-support justification. Trace coverage is many-to-many and must have no missing, unexplained, malformed, or duplicated identifiers.

PASS-01 — Source conformance passes only if the canonical source uses the repository SysML-AADL library, has exactly one root usage, and passes both architecture-stage and final `hamr sysml tipe` checks with all endpoints resolved and port directions/types compatible.

PASS-02 — Complexity passes only if retained metrics report medium tier, counting rules `campaign-v1`, exactly eight semantic usages, exactly 15 semantic interactions after excluding six root routes, exactly 20 nontrivial contract cases, exactly eight scenario families, `multiple_decision_owners=true`, and `priority_conflict=true`; architecture metrics must separately report exactly 21 total directed connections, and the ownership audit must substantiate all eight PART clauses with the named local cases.

PASS-03 — Behavioral coverage passes only if every contract obligation enumerated by CASE-AUD-01 has a nonvacuous local contract at its assigned owner, initialization is explicit, every controlled output is constrained for every finite status/mode partition, and fresh-request, CWS, disengagement, fault, and recovery paths are included.

PASS-04 — Bounded analysis passes only if its independently retained relation satisfies ANALYSIS-01 and ANALYSIS-02; produces one permitted next result per finite class; finds no actuation without authority, out-of-range published command, inconsistent paired PFD field, direct Failed-to-On recovery, invalid-input engagement, or disagreement between AP attitude handling and AP-guidance qualification; and agrees with canonical local contracts rather than reproducing forwarding logic.

PASS-05 — Traceability passes only with zero missing IDs, zero unexplained trace IDs, zero unannotated significant elements, and explicit informational/deferred disposition for the cost, certification, physical-performance, timing, and executable claims.

PASS-06 — Validation passes only if the model realizes all eight scenario families and the preserved allocation chain without replacing it with a generic supervisor, if every usage and interaction has the responsibility stated here, and if no formalization or selected policy is presented as a handbook fact.

PASS-07 — Visualization passes only if the single `system-overview` view is bound to the accepted source revision, shows the root boundary, all eight semantic usages, the FGS/AP allocation grouping, and representative priority/recovery flows without unresolved endpoints, overlaps, clipping, or unreviewed trace IDs.

PASS-08 — Overall acceptance requires PASS-01 through PASS-07. Parsing, typechecking, bounded analysis, contracts, trace coverage, rendering, and Designer domain validation remain separate evidence; no one result substitutes for another.
