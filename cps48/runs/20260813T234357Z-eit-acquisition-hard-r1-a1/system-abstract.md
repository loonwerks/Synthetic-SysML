---
abstract_id: SA-EIT-ACQ-01
seed_id: eit-acquisition-seed-20260813t233941z
seed_version: 1
status: approved-final
complexity: hard
executable_profile: not-declared
semantic_usage_bounds: [13, 16]
semantic_interaction_bounds: [22, 35]
nontrivial_contract_case_bounds: [21, 30]
scenario_family_bounds: [9, 12]
selected_semantic_usages: 15
selected_semantic_interactions: 33
selected_nontrivial_contract_cases: 30
selected_scenario_families: 10
node_count: [15, 15]
edge_count: [33, 33]
containment_depth: [1, 2]
requires_stateful_behavior: true
requires_fault_behavior: true
requires_multiple_state_or_decision_owners: true
requires_priority: true
requires_fault_propagation: true
requires_recovery: true
requires_composition: true
---

# EIT monitoring and acquisition supervisor

## Evidence classes and claim boundary

BASIS-01: [Seed-grounded fact] The frozen source supplies the actors `Doctor`, `EngineerTechnician`, `Patient`, and `EITSystem`; the six use-case names for belt application, calibration, monitoring start, impedance-data collection, EIT-image generation, and image analysis; the stated actor associations; and one boundary that includes all six use cases. It supplies no sequence, port direction, policy, data representation, validity rule, state, priority, fault behavior, or recovery rule.

METHOD-01: [Handbook-derived engineering control] This abstract defines need and context before parts, makes boundary quantities and responsible entities explicit, compares alternatives, separates nominal and off-nominal behavior, assigns unique trace IDs, and states objective verification and validation criteria. Those controls come from the project methodology and are not EIT domain facts.

PILOT-01: [Pilot abstraction] One evaluation consumes one finite boundary snapshot plus four retained pre-states and produces deterministic next states, one selected supervisory action, one control frame, and one status frame. All finite values, logical-step semantics, qualifications, priorities, state machines, recovery events, and command meanings below are Designer-owned experiment assumptions.

ARCH-01: [Selected architecture] The retained direction uses five independent evidence qualifiers, one fault composer, four distinct retained-state owners, three feasibility or release decision owners, one strict-priority arbiter, and one publication composer. Exactly `PART-01` through `PART-15` receive semantic-usage credit; root, context, type definitions, analyzer logic, and any generated routing support do not.

DEFER-01: [Deferred claim] The run makes no diagnosis, treatment, image-quality, patient-outcome, electrical-safety, medical-device-efficacy, regulatory, certification, physical-timing, algorithmic-reconstruction, production-readiness, or clinical-correctness claim. Physical belt application, calibration execution, current injection, voltage sensing, impedance calculation, image reconstruction, and clinical interpretation remain outside the modeled behavior.

## Need, purpose, and goals

NEED-01: [Pilot abstraction using seed vocabulary] A bounded supervisor is needed to coordinate a Doctor's monitoring intent with externally supplied belt, calibration, equipment, impedance-batch, and image-generation evidence so that ordinary acquisition work cannot hide invalid evidence, a reported failure, or incomplete recovery.

PURPOSE-01: [Pilot abstraction] For each logical evaluation, the system shall qualify the six boundary observations, propagate any local fault into one recovery gate, progress four independently owned supervisory states, choose at most one monitoring, collection, generation, release, stop, or hold action by strict priority, and publish mutually consistent control and status frames.

GOAL-01: [Pilot abstraction] The system shall cover every finite qualified-input and retained-state combination with exactly one case at each state owner and exactly one effective arbitration case.

GOAL-02: [Pilot abstraction] Invalid evidence or a reported preparation, equipment, batch, or image failure shall close the recovery gate in the same evaluation and inhibit ordinary monitoring, collection, generation, and release actions.

GOAL-03: [Pilot abstraction] Recovery shall require a fresh `RESET` event followed on a later evaluation by a fresh `VERIFY_OK` event, with any new fault dominating either event.

GOAL-04: [Pilot abstraction] When ordinary proposals coincide, explicit Doctor stop shall dominate start and all acquisition work, image release shall dominate new generation and collection, and image generation shall dominate collection.

GOAL-05: [Selected architecture] Separate session, acquisition-cycle, image-availability, and recovery owners shall retain only their own state, while the arbiter and publisher remain stateless and do not reproduce their transition relations.

## Operational context and selected system boundary

CTX-01: [Selected boundary] The modeled system is a supervisory coordinator between the named people and an external acquisition/imaging facility. It does not apply the belt, perform calibration, acquire physical signals, reconstruct an actual image, or analyze an image.

CTX-DOC-01: [Seed-grounded entity with pilot responsibility] The Doctor supplies one status-bearing monitoring event per evaluation and consumes the finite supervisory status. Under the pilot assumption, a valid non-`NONE` event is fresh and a request ignored during recovery release must be presented again later.

CTX-TECH-01: [Seed-grounded entity with pilot responsibility] The EngineerTechnician supplies one finite preparation observation and one status-bearing recovery event. This assigned observation and recovery authority are pilot responsibilities, not exclusivity claims inferred from the seed association.

CTX-PAT-01: [Seed-grounded entity; informational] The Patient remains external context associated with wearing the electrode belt, but supplies no modeled input and receives no modeled control because the source assigns no Patient use case and does not establish sensing, consent, or control semantics.

CTX-EIT-01: [Resolution of seed ambiguity] The source's `EITSystem` actor is treated here as an external acquisition/imaging facility distinct from this supervisory boundary. It supplies equipment, impedance-batch, and image-result observations and consumes requests; this is a selected viewpoint, not a source-grounded identity claim.

CTX-STATUS-01: [Selected boundary] The Doctor and EngineerTechnician consume `StatusFrame`; no field certifies image correctness, patient condition, calibration quality, or successful execution of a requested command.

MON-DOC-01: [Pilot abstraction] Root input `doctorSignal` has finite type `DoctorSignal={NONE,START,STOP,ACK_IMAGE,INVALID_INTENT,INVALID_STATUS}` and comes from `CTX-DOC-01`. The two invalid variants are explicit status concepts and intentionally collapse to one request-input fault during qualification.

MON-PREP-01: [Pilot abstraction] Root input `preparationObservation` has type `PreparationObservation={READY,NOT_APPLIED,CALIBRATION_NOT_PERFORMED,CALIBRATION_FAILED,INVALID_BELT_STATUS,INVALID_CALIBRATION_STATUS}` and comes from `CTX-TECH-01`. `READY` means only that belt-applied and calibration-performed evidence is currently asserted.

MON-EQUIP-01: [Pilot abstraction] Root input `equipmentObservation` has type `EquipmentObservation={READY,NOT_READY,BUSY,FAULTED,INVALID_HEALTH_STATUS,INVALID_AVAILABILITY_STATUS}` and comes from `CTX-EIT-01`. `READY` means command acceptance is reported possible, not that physical acquisition will succeed.

MON-BATCH-01: [Pilot abstraction] Root input `batchSignal` has type `BatchSignal={NONE,COMPLETE,INCOMPLETE,CORRUPT,INVALID_BATCH_KIND,INVALID_BATCH_STATUS}` and comes from `CTX-EIT-01`. Every non-`NONE` valid variant is a fresh abstract event and carries no samples, units, timestamps, quality score, or patient information.

MON-IMAGE-01: [Pilot abstraction] Root input `imageFeedback` has type `ImageFeedback={NONE,GENERATED,FAILED,INVALID_RESULT,INVALID_STATUS}` and comes from `CTX-EIT-01`. `GENERATED` means only that an abstract image result became available; it does not mean diagnostically usable or correct.

MON-REC-01: [Pilot abstraction] Root input `recoveryEvent` has type `RecoveryEvent={NONE,RESET,VERIFY_OK,INVALID_RESET,INVALID_STATUS}` and comes from `CTX-TECH-01`. Every valid non-`NONE` event is fresh for one evaluation; `RESET` and `VERIFY_OK` cannot be the same event.

CTRL-CONTROL-01: [Selected architecture] Root output `controlFrame=(acquisitionCommand,imageCommand)` goes to `CTX-EIT-01`, where `AcquisitionCommand={NO_COMMAND,REQUEST_START,REQUEST_COLLECTION,REQUEST_STOP}` and `ImageCommand={NO_COMMAND,REQUEST_GENERATION}`. A request is not an assertion of physical execution.

CTRL-STATUS-01: [Selected architecture] Root output `statusFrame=(publicMode,selectedCause,sessionState,cycleState,imageState,recoveryState,imageDisposition,dominantFault,multipleFaults)` goes to `CTX-STATUS-01` as one flat evaluation-consistent record.

TYPE-REQ-01: [Pilot abstraction] `RequestFacts=(requestClass,requestFault)`, where `RequestClass={NO_REQUEST,START_REQUEST,STOP_REQUEST,IMAGE_ACK}` and `requestFault` is Boolean; both invalid `DoctorSignal` values yield `NO_REQUEST/true`.

TYPE-PREP-01: [Pilot abstraction] `PreparationFacts={READY,NOT_READY,FAILED,INPUT_FAULT}`; `NOT_APPLIED` and `CALIBRATION_NOT_PERFORMED` both map to `NOT_READY`, while the two invalid variants map to `INPUT_FAULT`.

TYPE-EQUIP-01: [Pilot abstraction] `EquipmentFacts={READY,NOT_READY,BUSY,FAILED,INPUT_FAULT}`; the two invalid variants collapse to `INPUT_FAULT`.

TYPE-BATCH-01: [Pilot abstraction] `BatchFacts={NO_BATCH,USABLE,INCOMPLETE,FAILED,INPUT_FAULT}`; `CORRUPT` maps to `FAILED`, and both invalid variants collapse to `INPUT_FAULT`.

TYPE-IMAGE-01: [Pilot abstraction] `ImageResultFacts={NO_RESULT,AVAILABLE,FAILED,INPUT_FAULT}`; both invalid variants collapse to `INPUT_FAULT`.

TYPE-FAULT-01: [Pilot abstraction] `FaultSummary=(faultPresent,dominantFault,multipleFaults)`, with `DominantFault={NONE,RECOVERY_INPUT,REQUEST_INPUT,PREPARATION_INPUT,EQUIPMENT_INPUT,BATCH_INPUT,IMAGE_INPUT,PREPARATION_FAILURE,EQUIPMENT_FAILURE,BATCH_FAILURE,IMAGE_FAILURE}`. `RECOVERY_INPUT` is introduced only by the recovery owner; `PART-06` composes the other ten values.

TYPE-STATE-01: [Pilot abstraction] Retained domains are `SessionState={IDLE,MONITORING,RECOVERY}`, `CycleState={DORMANT,READY,COLLECTING,BATCH_READY,RECOVERY}`, `ImageState={EMPTY,AWAITING_IMAGE,AVAILABLE,RECOVERY}`, and `RecoveryState={HEALTHY,LATCHED,VERIFYING}`.

TYPE-ACTION-01: [Pilot abstraction] `SelectedAction={EMERGENCY_HOLD,STOP,START,RELEASE_IMAGE,GENERATE_IMAGE,COLLECT,HOLD}` and `SelectedCause={FAULT_OR_RECOVERY,DOCTOR_STOP,DOCTOR_START,IMAGE_AVAILABLE,USABLE_BATCH,READY_TO_COLLECT,NO_ELIGIBLE_WORK}`.

TYPE-PUBLIC-01: [Pilot abstraction] `PublicMode={IDLE,STARTING,MONITORING,COLLECTING,IMAGING,IMAGE_AVAILABLE,RECOVERY,FAULT}` and `ImageDisposition={WITHHELD,AVAILABLE_FOR_ANALYSIS}`. The latter means only boundary availability for Doctor analysis, never automated analysis or clinical validity.

## Essential assumptions and constraints

ASM-STEP-01: [Pilot abstraction] An evaluation is an ordered logical step with no duration claim. All owners consume one coherent snapshot and their declared pre-state; next-state values and outputs become the result of that step.

ASM-FRESH-01: [Pilot abstraction] `CTX-DOC-01`, `CTX-EIT-01`, and `CTX-TECH-01` are responsible for presenting non-`NONE` Doctor, batch, image, and recovery events for exactly one evaluation and for not replaying them as fresh events.

ASM-PREP-01: [Pilot abstraction] `CTX-TECH-01` is responsible for the declared finite preparation observation. The supervisor does not verify belt placement or calibration performance and must not relabel `READY` as clinically or physically correct.

ASM-CMD-01: [Pilot abstraction] `CTX-EIT-01` is responsible for accepting or rejecting requests and for later reporting observations. The supervisor does not infer success from issuance of `REQUEST_START`, `REQUEST_COLLECTION`, `REQUEST_STOP`, or `REQUEST_GENERATION`.

ASM-ONE-01: [Pilot abstraction] At most one monitoring session, one acquisition cycle, and one abstract image result are represented. There are no queues, identifiers, timestamps, multiple patients, multiple belts, or simultaneous image generations.

ASM-REC-01: [Pilot abstraction] A request supplied on the evaluation that reopens recovery is deliberately ignored; the responsible external entity must present a later fresh request. This prevents a recovery event and ordinary work from being accepted as one event.

ASM-INIT-01: [Pilot abstraction] Before the first evaluation, state is `IDLE/DORMANT/EMPTY/HEALTHY`, `controlFrame` contains two `NO_COMMAND` values, and `statusFrame` reports `IDLE/NO_ELIGIBLE_WORK` with no image or fault. Initialization is deterministic experiment behavior, not a physical safe-start claim.

CONSTR-SEM-01: [Hard gate] Exactly 15 responsibility-bearing semantic usages, 33 typed directed semantic interactions, 30 nontrivial owner-local contract cases, and 10 scenario families shall be realized. No context, root, type, router, splitter, constructor, analyzer, initialization, invariant, or mapping clause receives campaign credit.

CONSTR-ROOT-01: [Hard gate] The model shall contain exactly one explicit root system usage, exactly one weakly connected semantic region, semantic containment depth from one through two below the root, and no extra responsibility-bearing usage or semantic connection.

## Parts, responsibilities, and ownership

PART-01: [Semantic usage] `doctor_request_qualification` shall derive `RequestFacts` by many-to-one collapse of both invalid variants and shall not decide start eligibility, session transition, priority, or publication.

PART-02: [Semantic usage] `preparation_assessment` shall combine belt and calibration meaning already present in `PreparationObservation` into exactly one `PreparationFacts` value, distinguishing not-ready, reported failure, and invalid evidence without claiming physical correctness.

PART-03: [Semantic usage] `equipment_assessment` shall derive exactly one `EquipmentFacts` value, including many-to-one invalid collapse, and shall not decide collection or infer command success.

PART-04: [Semantic usage] `batch_assessment` shall derive exactly one `BatchFacts` value, distinguishing no event, usable, incomplete, reported failure, and invalid evidence; it shall not generate or assess an image.

PART-05: [Semantic usage] `image_result_assessment` shall derive exactly one `ImageResultFacts` value and shall not equate availability with correctness or analysis.

PART-06: [Semantic usage; composition owner] `fault_composition` shall combine the five qualified evidence results into `FaultSummary`. It owns `faultPresent`, simultaneous-fault detection, and dominant-fault priority: request input, preparation input, equipment input, batch input, image input, preparation failure, equipment failure, batch failure, image failure, then none.

PART-07: [Semantic usage; retained-state owner] `session_control` shall be the sole owner of `SessionState`, apply `CASE-06` through `CASE-11`, admit start only from `IDLE`, admit stop only from `MONITORING`, and expose `startAdmitted` and `stopAdmitted` without recomputing start feasibility.

PART-08: [Semantic usage; retained-state owner] `acquisition_cycle_control` shall be the sole owner of `CycleState`, apply `CASE-12` through `CASE-17`, and derive the observed acquisition phase from the received equipment, batch, and recovery facts without treating an issued command as completion.

PART-09: [Semantic usage; retained-state owner] `image_availability_control` shall be the sole owner of `ImageState`, apply `CASE-18` through `CASE-23`, initiate `generateProposal` for a fresh usable batch, sustain that proposal while awaiting feedback, retain availability until a valid acknowledgement or replacement batch, and never assess image quality.

PART-10: [Semantic usage; retained-state and recovery-decision owner] `recovery_control` shall be the sole owner of `RecoveryState`, qualify `RecoveryEvent`, apply `CASE-01` through `CASE-05`, and derive `RecoveryFrame=(recoveryState,recoveryGate,recoveryCause,effectiveFaultPresent,effectiveDominantFault,effectiveMultipleFaults)` with `RecoveryGate={OPEN,CLOSED}`. Invalid recovery input is a latching `RECOVERY_INPUT` fault, dominates the received local dominant fault, and sets effective multiplicity when a local fault is also present.

PART-11: [Semantic usage; decision owner] `start_feasibility` shall combine qualified start intent, ready preparation, ready equipment, and an open recovery gate into `StartFeasibility={FEASIBLE,NOT_FEASIBLE}`. It does not own the session transition.

PART-12: [Semantic usage; decision owner] `collection_feasibility` shall derive `CollectionProposal={PROPOSED,NOT_PROPOSED}` only when the derived session state is `MONITORING`, the derived cycle state is `READY`, and recovery is open.

PART-13: [Semantic usage; decision owner] `image_release_feasibility` shall derive `ReleaseProposal={PROPOSED,NOT_PROPOSED}` only when the derived session state is `MONITORING`, the derived image state is `AVAILABLE`, and recovery is open.

PART-14: [Semantic usage; priority and decision owner] `supervisory_arbitration` shall be the sole `SelectedAction` owner, apply `CASE-24` through `CASE-30`, and compose one `DecisionFrame` carrying the selected action/cause, the four received derived states, fault summary from the recovery frame, and image availability. It shall not recompute any upstream qualification, transition, or proposal.

PART-15: [Semantic usage; public composition owner] `publication_composition` shall be the sole writer of both root outputs. It shall map one received `DecisionFrame` into `ControlFrame` and `StatusFrame`, constrain every field, and derive public mode and image disposition without retaining state or re-arbitrating.

OWN-AUD-01: [Ownership audit] Persistent state is owned only by `PART-07`, `PART-08`, `PART-09`, and `PART-10`; start, collection, release, and selected-action decisions are owned only by `PART-11`, `PART-12`, `PART-13`, and `PART-14`; output composition is owned only by `PART-15`; local evidence/fault facts are owned only by `PART-01` through `PART-06`; and recovery-input validation plus effective system fault cause/multiplicity are owned only by `PART-10`.

OWN-AUD-02: [No-padding audit] Every credited usage derives a many-to-one classification, a multi-input fact, a retained transition, a feasibility relation, strict priority, or a multi-field public relation. No usage receives credit merely for copying, bundling, renaming, splitting, routing, or bijectively translating an input.

## Complete typed directed semantic interaction inventory

INT-01: [Semantic interaction] `doctor_request_qualification.request_facts` shall provide `RequestFacts` to `fault_composition.request_facts` for request-input fault composition.

INT-02: [Semantic interaction] `doctor_request_qualification.request_facts` shall provide `RequestFacts` to `start_feasibility.request_facts` for start-intent evaluation.

INT-03: [Semantic interaction] `doctor_request_qualification.request_facts` shall provide `RequestFacts` to `session_control.request_facts` for stop admission and image-independent session behavior.

INT-04: [Semantic interaction] `doctor_request_qualification.request_facts` shall provide `RequestFacts` to `image_availability_control.request_facts` for acknowledgement-driven clearing.

INT-05: [Semantic interaction] `preparation_assessment.preparation_facts` shall provide `PreparationFacts` to `fault_composition.preparation_facts`.

INT-06: [Semantic interaction] `preparation_assessment.preparation_facts` shall provide `PreparationFacts` to `start_feasibility.preparation_facts`.

INT-07: [Semantic interaction] `equipment_assessment.equipment_facts` shall provide `EquipmentFacts` to `fault_composition.equipment_facts`.

INT-08: [Semantic interaction] `equipment_assessment.equipment_facts` shall provide `EquipmentFacts` to `start_feasibility.equipment_facts`.

INT-09: [Semantic interaction] `equipment_assessment.equipment_facts` shall provide `EquipmentFacts` to `acquisition_cycle_control.equipment_facts`.

INT-10: [Semantic interaction] `batch_assessment.batch_facts` shall provide `BatchFacts` to `fault_composition.batch_facts`.

INT-11: [Semantic interaction] `batch_assessment.batch_facts` shall provide `BatchFacts` to `acquisition_cycle_control.batch_facts`.

INT-12: [Semantic interaction] `batch_assessment.batch_facts` shall provide `BatchFacts` to `image_availability_control.batch_facts`.

INT-13: [Semantic interaction] `image_result_assessment.image_result_facts` shall provide `ImageResultFacts` to `fault_composition.image_result_facts`.

INT-14: [Semantic interaction] `image_result_assessment.image_result_facts` shall provide `ImageResultFacts` to `image_availability_control.image_result_facts`.

INT-15: [Semantic interaction] `fault_composition.fault_summary` shall provide `FaultSummary` to `recovery_control.fault_summary`.

INT-16: [Semantic interaction] `recovery_control.recovery_frame` shall provide `RecoveryFrame` to `session_control.recovery_frame`.

INT-17: [Semantic interaction] `recovery_control.recovery_frame` shall provide `RecoveryFrame` to `acquisition_cycle_control.recovery_frame`.

INT-18: [Semantic interaction] `recovery_control.recovery_frame` shall provide `RecoveryFrame` to `image_availability_control.recovery_frame`.

INT-19: [Semantic interaction] `recovery_control.recovery_frame` shall provide `RecoveryFrame` to `start_feasibility.recovery_frame`.

INT-20: [Semantic interaction] `recovery_control.recovery_frame` shall provide `RecoveryFrame` to `collection_feasibility.recovery_frame`.

INT-21: [Semantic interaction] `recovery_control.recovery_frame` shall provide `RecoveryFrame` to `image_release_feasibility.recovery_frame`.

INT-22: [Semantic interaction] `recovery_control.recovery_frame` shall provide `RecoveryFrame` to `supervisory_arbitration.recovery_frame`.

INT-23: [Semantic interaction] `start_feasibility.start_feasibility` shall provide `StartFeasibility` to `session_control.start_feasibility`.

INT-24: [Semantic interaction] `session_control.session_frame` shall provide `SessionFrame=(sessionState,startAdmitted,stopAdmitted)` to `collection_feasibility.session_frame`.

INT-25: [Semantic interaction] `session_control.session_frame` shall provide `SessionFrame` to `image_release_feasibility.session_frame`.

INT-26: [Semantic interaction] `session_control.session_frame` shall provide `SessionFrame` to `supervisory_arbitration.session_frame`.

INT-27: [Semantic interaction] `acquisition_cycle_control.cycle_frame` shall provide `CycleFrame=(cycleState,batchReady)` to `collection_feasibility.cycle_frame`.

INT-28: [Semantic interaction] `acquisition_cycle_control.cycle_frame` shall provide `CycleFrame` to `supervisory_arbitration.cycle_frame`.

INT-29: [Semantic interaction] `image_availability_control.image_frame` shall provide `ImageFrame=(imageState,generateProposal)` to `image_release_feasibility.image_frame`.

INT-30: [Semantic interaction] `image_availability_control.image_frame` shall provide `ImageFrame` to `supervisory_arbitration.image_frame`.

INT-31: [Semantic interaction] `collection_feasibility.collection_proposal` shall provide `CollectionProposal` to `supervisory_arbitration.collection_proposal`.

INT-32: [Semantic interaction] `image_release_feasibility.release_proposal` shall provide `ReleaseProposal` to `supervisory_arbitration.release_proposal`.

INT-33: [Semantic interaction] `supervisory_arbitration.decision_frame` shall provide `DecisionFrame` to `publication_composition.decision_frame`.

INT-AUD-01: [Interaction audit] `INT-01` through `INT-33` are the complete semantic inventory: 14 qualification and state-input flows, one fault-to-recovery flow, seven recovery propagation flows, eight feasibility/state coordination flows, two proposal-to-arbiter flows, and one final decision flow. Root delegations and any containment routing are support connections and shall be inventoried separately without semantic credit.

## Faults, risks, priority, recovery, and composition

RISK-01: [Pilot risk] An invalid or failed local observation could otherwise be accepted as readiness and permit ordinary acquisition work; `FAULT-01` requires same-evaluation propagation to a closed recovery gate and emergency hold.

RISK-02: [Pilot risk] A reset treated as complete recovery could reopen work before a distinct verification event; `FAULT-02` requires latched and verifying recovery states with fresh-event separation.

RISK-03: [Pilot risk] Independently true stop, release, generation, or collection proposals could otherwise yield inconsistent commands and status; `PRIORITY-01` and `COMP-01` require one effective selection and one public composer.

FAULT-01: [Required behavior] Any request-input, preparation, equipment, batch, or image fault shall propagate in the same evaluation through its qualifier, `PART-06`, `PART-10`, all three operational state owners, all feasibility gates, `PART-14`, and `PART-15`, producing `EMERGENCY_HOLD`, `REQUEST_STOP/NO_COMMAND`, recovery or fault status, and no available image disposition. Contract inspection plus bounded analysis passes only if every local source and selected simultaneous-source combination reaches that exact chain without central recomputation.

FAULT-02: [Required behavior] While recovery is `LATCHED` or `VERIFYING`, start, collection, generation, and release shall be inhibited. A fresh `RESET` may move only `LATCHED` to `VERIFYING`; only a later fresh `VERIFY_OK` may reopen the gate; a new local or recovery-input fault dominates both. Ordered-trace analysis passes only if no same-step reset/verify or recovery-release/request combination bypasses this rule.

PRIORITY-01: [Required behavior] Effective arbitration priority shall be closed recovery or fault, admitted Doctor stop, admitted Doctor start, image release, image generation, impedance collection, then hold. Inspection and analyzer evidence pass only if all reachable simultaneous proposals select the earliest applicable item and every later proposal is observably suppressed.

COMP-01: [Required behavior] The publication composer shall derive both outputs from one received `DecisionFrame`. `EMERGENCY_HOLD` and `STOP` map to `REQUEST_STOP/NO_COMMAND`; `START` maps to `REQUEST_START/NO_COMMAND`; `GENERATE_IMAGE` maps to `NO_COMMAND/REQUEST_GENERATION`; `COLLECT` maps to `REQUEST_COLLECTION/NO_COMMAND`; `RELEASE_IMAGE` and `HOLD` map to two `NO_COMMAND` values. Public mode is `FAULT` for emergency hold with a current effective fault, `RECOVERY` for closed-gate hold without a current fault, `IDLE` for stop, `STARTING` for start, `IMAGE_AVAILABLE` for release, `IMAGING` for generation, `COLLECTING` for collection, and otherwise `MONITORING` exactly when session state is monitoring or `IDLE`. Only `RELEASE_IMAGE` may publish `AVAILABLE_FOR_ANALYSIS`, and every status state/fault field shall equal the corresponding received field.

## Exactly thirty nontrivial ordered contract cases

CASE-01: [Recovery owner; highest priority] If `FaultSummary.faultPresent` is true or `recoveryEvent` is invalid, next recovery shall be `LATCHED` and the gate shall be closed. Invalid recovery input shall select effective dominant fault `RECOVERY_INPUT`; otherwise the local dominant fault is preserved; effective multiplicity is true exactly for received local multiplicity or simultaneous recovery-input and local fault.

CASE-02: [Recovery owner] With no fault and prior recovery `HEALTHY`, next recovery shall remain `HEALTHY` and open; valid `RESET` or `VERIFY_OK` received without a preceding latch shall not create progress.

CASE-03: [Recovery owner] With no fault, prior recovery `LATCHED`, and fresh `RESET`, next recovery shall be `VERIFYING` and closed.

CASE-04: [Recovery owner] With no fault, prior recovery `VERIFYING`, and fresh `VERIFY_OK`, next recovery shall be `HEALTHY` and open.

CASE-05: [Recovery owner; closed-state stutter] With no fault and neither `CASE-03` nor `CASE-04` applicable, a prior `LATCHED` or `VERIFYING` state shall be preserved and the gate shall remain closed.

CASE-06: [Session owner; highest priority] If the received recovery gate is closed, next session shall be `RECOVERY` and neither start nor stop shall be admitted.

CASE-07: [Session owner; recovery release] If the gate is open and prior session is `RECOVERY`, next session shall be `IDLE`; any same-evaluation Doctor event shall be ignored and must be freshly re-presented later.

CASE-08: [Session owner] If the gate is open, prior session is `IDLE`, and start feasibility is `FEASIBLE`, next session shall be `MONITORING` with start admitted.

CASE-09: [Session owner] If the gate is open, prior session is `IDLE`, and start feasibility is not feasible, next session shall remain `IDLE` with no admitted transition.

CASE-10: [Session owner] If the gate is open, prior session is `MONITORING`, and qualified request is `STOP_REQUEST`, next session shall be `IDLE` with stop admitted.

CASE-11: [Session owner] If the gate is open, prior session is `MONITORING`, and qualified request is not `STOP_REQUEST`, next session shall remain `MONITORING` with no admitted transition.

CASE-12: [Cycle owner; highest priority] If the received recovery gate is closed, next cycle shall be `RECOVERY` and `batchReady` shall be false.

CASE-13: [Cycle owner; recovery release] If the gate is open and prior cycle is `RECOVERY`, next cycle shall be `DORMANT` and shall ignore same-evaluation equipment and batch progress.

CASE-14: [Cycle owner] If the gate is open, prior cycle is not `RECOVERY`, and batch facts are `USABLE`, next cycle shall be `BATCH_READY` with `batchReady=true`.

CASE-15: [Cycle owner] If the gate is open, prior cycle is not `RECOVERY`, no usable batch exists, and equipment facts are `BUSY`, next cycle shall be `COLLECTING`.

CASE-16: [Cycle owner] If the gate is open, prior cycle is not `RECOVERY`, no usable batch exists, and equipment facts are `READY`, next cycle shall be `READY`.

CASE-17: [Cycle owner; fallthrough] If the gate is open, prior cycle is not `RECOVERY`, and neither usable batch nor `BUSY` nor `READY` equipment applies, next cycle shall be `DORMANT`.

CASE-18: [Image owner; highest priority] If the received recovery gate is closed, next image state shall be `RECOVERY` and generation shall not be proposed.

CASE-19: [Image owner; recovery release] If the gate is open and prior image state is `RECOVERY`, next image state shall be `EMPTY` and all same-evaluation acknowledgement, batch, and image events shall be ignored.

CASE-20: [Image owner] If the gate is open, prior image state is not `RECOVERY`, and image result facts are `AVAILABLE`, next image state shall be `AVAILABLE` and generation shall not be proposed.

CASE-21: [Image owner] If the gate is open, prior image state is not `RECOVERY`, no generated result exists, and qualified request is `IMAGE_ACK`, next image state shall be `EMPTY` and generation shall not be proposed.

CASE-22: [Image owner] If the gate is open, prior image state is not `RECOVERY`, no generated result or acknowledgement applies, and batch facts are `USABLE`, next image state shall be `AWAITING_IMAGE` with generation proposed.

CASE-23: [Image owner; stutter] If the gate is open and none of `CASE-20` through `CASE-22` applies, prior `EMPTY`, `AWAITING_IMAGE`, or `AVAILABLE` shall be preserved; generation shall be proposed exactly when the preserved prior state is `AWAITING_IMAGE`, so an unacknowledged generation request remains visible until feedback.

CASE-24: [Arbiter; highest priority] If the received recovery gate is closed, selected action shall be `EMERGENCY_HOLD` with cause `FAULT_OR_RECOVERY`, regardless of every ordinary proposal.

CASE-25: [Arbiter] With recovery open, if session stop is admitted, selected action shall be `STOP` with cause `DOCTOR_STOP`.

CASE-26: [Arbiter] With recovery open and no admitted stop, if session start is admitted, selected action shall be `START` with cause `DOCTOR_START`.

CASE-27: [Arbiter] With recovery open and no higher-priority action, if release is proposed, selected action shall be `RELEASE_IMAGE` with cause `IMAGE_AVAILABLE`.

CASE-28: [Arbiter] With recovery open and no higher-priority action, if generation is proposed, selected action shall be `GENERATE_IMAGE` with cause `USABLE_BATCH`.

CASE-29: [Arbiter] With recovery open and no higher-priority action, if collection is proposed, selected action shall be `COLLECT` with cause `READY_TO_COLLECT`.

CASE-30: [Arbiter; fallthrough] With recovery open and no admitted transition or proposal, selected action shall be `HOLD` with cause `NO_ELIGIBLE_WORK`.

CASE-AUD-01: [Partition audit] `CASE-01` through `CASE-05`, `CASE-06` through `CASE-11`, `CASE-12` through `CASE-17`, `CASE-18` through `CASE-23`, and `CASE-24` through `CASE-30` are five complete ordered owner-local partitions containing exactly 30 nontrivial cases. Qualification equations, fault-priority equations, feasibility predicates, initialization, invariants, mappings, and scenario witnesses are mandatory but receive no case credit.

CASE-AUD-02: [Fresh/recovery closure audit] The partitions explicitly cover healthy no-event stutter, invalid recovery input, fault dominance, latch, reset, verification, closed-state stutter, recovery release, ignored same-evaluation work, later fresh start, monitoring stop/stutter, every equipment/batch class, image acknowledgement/availability/generation/stutter, all priority selections, and final hold; no finite path is left to an implicit default.

## Required owner-local behavior outside the counted cases

BEH-QUAL-01: [Required behavior] Each of `PART-01` through `PART-05` shall have a total local contract for its declared finite mapping, including the many-to-one invalid collapses. Inspection passes only if no downstream owner or analyzer substitutes the raw-to-qualified relation.

BEH-FAULT-01: [Required behavior] `PART-06` shall set `faultPresent` exactly when at least one received fact is input-fault or failed, set `multipleFaults` exactly when at least two local fault predicates hold, and select `dominantFault` by the order in `PART-06`. Exhaustive local analysis passes only if all single sources and all simultaneous combinations satisfy the three fields.

BEH-START-01: [Required behavior] `PART-11` shall derive `FEASIBLE` exactly for `START_REQUEST`, preparation `READY`, equipment `READY`, and recovery open; every other combination shall derive `NOT_FEASIBLE`.

BEH-COLLECT-01: [Required behavior] `PART-12` shall propose exactly when received next session is `MONITORING`, received next cycle is `READY`, and recovery is open; it shall not inspect raw equipment or batch inputs.

BEH-RELEASE-01: [Required behavior] `PART-13` shall propose exactly when received next session is `MONITORING`, received next image state is `AVAILABLE`, and recovery is open; it shall not infer image correctness.

BEH-COMP-01: [Required behavior] `PART-15` shall implement `COMP-01` as a total relation over all seven selected actions and constrain all 11 output fields across the two root frames. Contract analysis passes only if no action leaves a field unconstrained or permits contradictory command, mode, image-disposition, state, cause, or fault values.

## Exactly ten bounded scenario families

SCN-01: [Fresh nominal start and collection] From initial state, `START` with ready preparation and equipment shall select `START` and enter monitoring; on a later fresh evaluation with ready equipment and no other proposal, collection shall be proposed and selected.

SCN-02: [Batch-to-image-to-release-to-ack] While monitoring, a fresh complete batch shall make the cycle batch-ready, move image state to awaiting, and select generation over collection; later `GENERATED` shall make the image available and select release; later `ACK_IMAGE` shall clear availability.

SCN-03: [Preparation-blocked start] From idle and healthy recovery, `START` with either not-applied or calibration-not-performed evidence shall remain idle and select hold without latching recovery; the family demonstrates a nonfault readiness denial.

SCN-04: [Equipment-blocked start] From idle and healthy recovery, `START` with `NOT_READY` or `BUSY` equipment shall remain idle and select hold without treating unavailability as failure.

SCN-05: [Doctor stop dominance] While monitoring, a fresh `STOP` coincident with release, generation, or collection opportunity shall admit stop, clear the session to idle, select `STOP`, and publish `REQUEST_STOP` with no image command or available disposition.

SCN-06: [Ordinary priority conflicts] While monitoring and healthy, an available image coincident with a ready acquisition cycle shall demonstrate release over collection; an awaiting image with no feedback coincident with a ready cycle shall demonstrate generation over collection; each trace shall have exactly one selected action and matching output frames.

SCN-07: [Invalid-evidence propagation] Each invalid-source class—Doctor, preparation, equipment, batch, image, and recovery—shall be witnessed separately, and at least one simultaneous-invalid combination shall demonstrate dominant-fault and multiple-fault composition through emergency hold.

SCN-08: [Reported-failure propagation] Calibration failure, equipment failure, corrupt batch, and image failure shall each latch recovery and inhibit ordinary work; an incomplete batch shall instead remain a nonfault no-generation condition.

SCN-09: [Two-event recovery and fresh-request path] From latched state, fresh `RESET` shall enter closed verifying state; a later fresh `VERIFY_OK` shall reopen recovery while all three operational states move from recovery to their neutral states and ignore a coincident `START`; a still later fresh `START` with ready evidence shall succeed.

SCN-10: [No-result and state persistence] During healthy monitoring, equipment busy shall report collecting, absence of a batch shall not initiate generation, awaiting image with no feedback shall persist and re-propose generation, available image with no acknowledgement shall persist, and a later fresh acknowledgement shall clear it.

SCN-AUD-01: [Scenario audit] `SCN-01` through `SCN-10` are exactly ten distinct families: nominal start/collection, image lifecycle, two readiness denials, stop dominance, ordinary proposal priority, invalid faults, reported failures, ordered recovery/fresh restart, and benign persistence. Parameter witnesses within a family do not increase the count.

## Structural, traceability, analysis, and objective pass criteria

STRUCT-01: [Hard gate] The semantic architecture shall contain exactly the 15 usages `PART-01` through `PART-15`, exactly the 33 interactions `INT-01` through `INT-33`, one explicit root, one weakly connected semantic region, and containment depth one or two below the root.

STRUCT-02: [Hard gate] The behavioral inventory shall contain exactly 30 counted nontrivial cases and exactly ten scenario families. All 15 usages, 33 interactions, 30 cases, and ten families have distinct responsibilities or traces; additions used only to meet a count fail the gate.

STRUCT-03: [Support boundary] Root-to-leaf delegations, one cohesive process grouping level if required by the trusted library, finite enum/flat-record types, initialization, attribute mappings, connection plumbing, and analyzer code are permitted only as traced generated support and shall not change semantic counts, owners, topology, or policy.

TRACE-01: [Coverage gate] Every abstract identifier shall trace to one or more model elements, local contracts, analyzer assertions, scenario witnesses, or an explicit informational/deferred disposition. Every significant generated element shall trace back to an abstract identifier or carry a narrow `@generated-support` justification.

TRACE-02: [Grammar gate] Source trace declarations shall use the canonical uppercase hyphenated IDs exactly as declared here. Missing parents, reused declaration IDs, unexplained children, or silent weakening of a fault, priority, recovery, composition, or fresh-request clause blocks acceptance.

ANALYSIS-01: [Bounded-analysis gate] The raw boundary product contains exactly `6*6*6*6*5*5 = 32,400` snapshots. Crossing the `3*5*4*3 = 180` pre-state combinations yields exactly `5,832,000` exhaustive one-step evaluations; the retained analyzer shall either enumerate this exact product within the harness watchdog or ask the Designer to approve a semantics-preserving independent decomposition before generation.

ANALYSIS-02: [Ownership gate] The analyzer shall execute the five qualifier relations, fault composition, recovery transition, three operational state transitions, three feasibility relations, arbitration, and publication in the declared dependency order and transmit values corresponding to all 33 semantic interactions. It shall not replace local relations with one centralized policy function or receive semantic/owner credit.

ANALYSIS-03: [Behavior gate] Exhaustive one-step acceptance requires exactly one selected case in each of the five partitions, no uncovered or multiply effective case, all 30 cases reachable, no next-state or output mismatch, correct fault dominance and multiple-fault flags, and correct suppression of every lower-priority proposal.

ANALYSIS-04: [Trace gate] Retained multi-step traces shall execute all ten scenario families, including later-event image acknowledgement, same-evaluation fault propagation, both ordinary priority conflicts, `RESET` then later `VERIFY_OK`, ignored work on recovery release, and the still-later fresh start. These finite results are conformance evidence, not formal proof or physical validation.

VERIFY-01: [Verification pass criterion] Verification passes only if repository library conformance, exactly one root, endpoint/type/direction compatibility, exact semantic and support inventories, canonical local-contract ownership, case/scenario counts, bidirectional trace coverage, deterministic bounded analysis, and both architecture-stage and final Sireum typechecking pass. A not-run check remains not-run and cannot be counted as passed.

VALID-01: [Validation pass criterion] Designer validation passes only if the realized model preserves the selected supervisor boundary, external treatment of `EITSystem`, Patient noninteraction, seed-claim limits, all ten scenario families, fault propagation, strict priority, recovery separation, fresh-request behavior, and consistent publication without adding diagnostic or image-quality meaning.

PASS-01: [Objective campaign pass] The hard-tier campaign gate passes only at the exact `15 semantic usages / 33 semantic interactions / 30 nontrivial contract cases / 10 scenario families` point with four genuine retained-state owners and multiple local decision owners.

PASS-02: [Objective ownership pass] Canonical local contracts and bounded evidence shall agree that every credited owner derives its stated fact and that no raw-value copier, one-to-one renamer, bundle constructor, router, mirror state, or central recomputation receives semantic credit.

PASS-03: [Objective fault/recovery pass] Every local and recovery-input fault shall close the gate and reach both outputs in the same evaluation; recovery shall require distinct fresh reset and verification events; and a fresh start shall remain possible only on an evaluation after recovery release.

PASS-04: [Objective priority/composition pass] Every reachable conflict shall select one action by `PRIORITY-01`, and every selected action shall produce the unique pair of fully constrained output frames required by `COMP-01`.

PASS-05: [Objective presentation pass] Exactly one source-bound `system-overview` shall show the root boundary, all 15 semantic usages, the four state owners, principal fault/recovery and priority paths, both root outputs, and all 33 directed semantic interactions without presenting context or generated support as semantic usages.

## Exclusions, evidence status, and Model-review resolution

EXCL-01: [Explicit exclusion] No patient measurement, electrode count, stimulation value, sample array, impedance number, image pixel, image-quality score, timing deadline, queue, identifier, multiple session, automatic diagnosis, treatment command, physical actuator feedback, or authorization model is required or authorized.

DEFER-02: [Evidence status] Code generation, application execution, compositional formal proof, solver certification, real-time performance, physical testing, clinical validation, safety analysis, and certification are deferred and shall be reported `not-run`; bounded analysis and typechecking do not imply them.

RES-MODEL-01: [Accepted realizability finding] The trusted SysML/GUMBO subset can realize the four independent retained-state owners and same-evaluation propagation through `INT-15` through `INT-33` as an acyclic owner-local chain. No central component or analyzer is authorized to recompute those transition relations.

RES-MODEL-02: [Accepted realizability finding] `DecisionFrame`, `ControlFrame`, `StatusFrame`, and every other inspected record shall be flat finite data records whose inspected members are direct attributes. `PART-07` through `PART-10` shall use only owner-local retained state, explicit initialization, and owner-local `In(...)` pre-state references; every lower-priority `compute_cases` branch shall explicitly exclude earlier cases.

RES-MODEL-03: [Accepted bounded-analysis finding] Direct exhaustive enumeration of the exact 5,832,000 one-step product is authorized under the retained 180-second watchdog using aggregate counters and bounded witnesses rather than retained per-snapshot objects. This authorization is not execution evidence: the final analyzer run must still satisfy `ANALYSIS-01` through `ANALYSIS-04`.

SUPPORT-FINAL-01: [Approved generated support] Generation shall use one root `System`, one behavior-free support `Process`, the 15 semantic `Thread` usages as siblings at depth two, 33 direct typed sibling `PortConnection`s for `INT-01` through `INT-33`, and exactly 16 System/Process/Thread boundary-delegation support connections for the six root inputs and two root outputs. Finite enums, flat record types, initialization, owner-local tuple-consistency clauses, trace annotations, one source-bound `system-overview`, and deterministic analyzer code are also allowed without semantic credit; no support element may add, mirror, or reproduce semantic behavior.

AUTH-GEN-01: [Designer authorization] Model generation is authorized against this approved final abstract and `design-selection.md`. Generation shall preserve the exact boundary, `15/33/30/10` inventories, four retained-state owners, local decision ownership, priority, same-evaluation fault propagation, two-event recovery, fresh-request separation, one public composer, exclusions, generated-support boundary, and deferred claims.
