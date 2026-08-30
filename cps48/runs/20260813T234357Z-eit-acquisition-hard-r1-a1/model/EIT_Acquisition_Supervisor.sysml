// Canonical final source for immutable run 20260813T234357Z-eit-acquisition-hard-r1-a1.
// The behavior-free checkpoint and its diagnostics are retained under validation/architecture-stage/.

// @trace PURPOSE-01
package EIT_Acquisition_Supervisor {
  private import HAMR::*;

  // @trace MON-DOC-01
  enum def DoctorSignal { enum NONE; enum START; enum STOP; enum ACK_IMAGE; enum INVALID_INTENT; enum INVALID_STATUS; }
  // @trace MON-PREP-01
  enum def PreparationObservation { enum READY; enum NOT_APPLIED; enum CALIBRATION_NOT_PERFORMED; enum CALIBRATION_FAILED; enum INVALID_BELT_STATUS; enum INVALID_CALIBRATION_STATUS; }
  // @trace MON-EQUIP-01
  enum def EquipmentObservation { enum READY; enum NOT_READY; enum BUSY; enum FAULTED; enum INVALID_HEALTH_STATUS; enum INVALID_AVAILABILITY_STATUS; }
  // @trace MON-BATCH-01
  enum def BatchSignal { enum NONE; enum COMPLETE; enum INCOMPLETE; enum CORRUPT; enum INVALID_BATCH_KIND; enum INVALID_BATCH_STATUS; }
  // @trace MON-IMAGE-01
  enum def ImageFeedback { enum NONE; enum GENERATED; enum FAILED; enum INVALID_RESULT; enum INVALID_STATUS; }
  // @trace MON-REC-01
  enum def RecoveryEvent { enum NONE; enum RESET; enum VERIFY_OK; enum INVALID_RESET; enum INVALID_STATUS; }
  // @trace TYPE-REQ-01
  enum def RequestClass { enum NO_REQUEST; enum START_REQUEST; enum STOP_REQUEST; enum IMAGE_ACK; }
  // @trace TYPE-PREP-01
  enum def PreparationFacts { enum READY; enum NOT_READY; enum FAILED; enum INPUT_FAULT; }
  // @trace TYPE-EQUIP-01
  enum def EquipmentFacts { enum READY; enum NOT_READY; enum BUSY; enum FAILED; enum INPUT_FAULT; }
  // @trace TYPE-BATCH-01
  enum def BatchFacts { enum NO_BATCH; enum USABLE; enum INCOMPLETE; enum FAILED; enum INPUT_FAULT; }
  // @trace TYPE-IMAGE-01
  enum def ImageResultFacts { enum NO_RESULT; enum AVAILABLE; enum FAILED; enum INPUT_FAULT; }
  // @trace TYPE-FAULT-01
  enum def DominantFault { enum NONE; enum RECOVERY_INPUT; enum REQUEST_INPUT; enum PREPARATION_INPUT; enum EQUIPMENT_INPUT; enum BATCH_INPUT; enum IMAGE_INPUT; enum PREPARATION_FAILURE; enum EQUIPMENT_FAILURE; enum BATCH_FAILURE; enum IMAGE_FAILURE; }
  // @trace TYPE-STATE-01
  enum def SessionState { enum IDLE; enum MONITORING; enum RECOVERY; }
  // @trace TYPE-STATE-01
  enum def CycleState { enum DORMANT; enum READY; enum COLLECTING; enum BATCH_READY; enum RECOVERY; }
  // @trace TYPE-STATE-01
  enum def ImageState { enum EMPTY; enum AWAITING_IMAGE; enum AVAILABLE; enum RECOVERY; }
  // @trace TYPE-STATE-01
  enum def RecoveryState { enum HEALTHY; enum LATCHED; enum VERIFYING; }
  // @trace PART-10
  enum def RecoveryGate { enum OPEN; enum CLOSED; }
  // @trace PART-10
  enum def RecoveryCause { enum NONE; enum LOCAL_FAULT; enum RECOVERY_INPUT_FAULT; enum LATCHED; enum VERIFYING; }
  // @trace BEH-START-01
  enum def StartFeasibility { enum FEASIBLE; enum NOT_FEASIBLE; }
  // @trace BEH-COLLECT-01
  enum def Proposal { enum PROPOSED; enum NOT_PROPOSED; }
  // @trace TYPE-ACTION-01
  enum def SelectedAction { enum EMERGENCY_HOLD; enum STOP; enum START; enum RELEASE_IMAGE; enum GENERATE_IMAGE; enum COLLECT; enum HOLD; }
  // @trace TYPE-ACTION-01
  enum def SelectedCause { enum FAULT_OR_RECOVERY; enum DOCTOR_STOP; enum DOCTOR_START; enum IMAGE_AVAILABLE; enum USABLE_BATCH; enum READY_TO_COLLECT; enum NO_ELIGIBLE_WORK; }
  // @trace CTRL-CONTROL-01
  enum def AcquisitionCommand { enum NO_COMMAND; enum REQUEST_START; enum REQUEST_COLLECTION; enum REQUEST_STOP; }
  // @trace CTRL-CONTROL-01
  enum def ImageCommand { enum NO_COMMAND; enum REQUEST_GENERATION; }
  // @trace TYPE-PUBLIC-01
  enum def PublicMode { enum IDLE; enum STARTING; enum MONITORING; enum COLLECTING; enum IMAGING; enum IMAGE_AVAILABLE; enum RECOVERY; enum FAULT; }
  // @trace TYPE-PUBLIC-01
  enum def ImageDisposition { enum WITHHELD; enum AVAILABLE_FOR_ANALYSIS; }

  // Every inspected Data member is an attribute rather than a nested part.
  // @trace TYPE-REQ-01
  part def RequestFactsRecord :> Data {
    // @trace TYPE-REQ-01
    attribute requestClass : RequestClass;
    // @trace TYPE-REQ-01
    attribute requestFault : Base_Types::Boolean;
  }
  // @trace TYPE-FAULT-01
  part def FaultSummary :> Data {
    // @trace TYPE-FAULT-01
    attribute faultPresent : Base_Types::Boolean;
    // @trace TYPE-FAULT-01
    attribute dominantFault : DominantFault;
    // @trace TYPE-FAULT-01
    attribute multipleFaults : Base_Types::Boolean;
  }
  // @trace PART-10
  part def RecoveryFrame :> Data {
    // @trace TYPE-FAULT-01
    attribute dominantFault : DominantFault;
    // @trace TYPE-STATE-01
    attribute recoveryState : RecoveryState;
    // @trace PART-10
    attribute recoveryGate : RecoveryGate;
    // @trace PART-10
    attribute recoveryCause : RecoveryCause;
    // @trace FAULT-01
    attribute effectiveFaultPresent : Base_Types::Boolean;
    // @trace TYPE-FAULT-01
    attribute effectiveMultipleFaults : Base_Types::Boolean;
  }
  // @trace PART-07
  part def SessionFrame :> Data {
    // @trace TYPE-STATE-01
    attribute sessionState : SessionState;
    // @trace PART-07
    attribute startAdmitted : Base_Types::Boolean;
    // @trace PART-07
    attribute stopAdmitted : Base_Types::Boolean;
  }
  // @trace PART-08
  part def CycleFrame :> Data {
    // @trace TYPE-STATE-01
    attribute cycleState : CycleState;
    // @trace PART-08
    attribute batchReady : Base_Types::Boolean;
  }
  // @trace PART-09
  part def ImageFrame :> Data {
    // @trace TYPE-STATE-01
    attribute imageState : ImageState;
    // @trace PART-09
    attribute generateProposal : Base_Types::Boolean;
  }
  // @trace PART-14
  part def DecisionFrame :> Data {
    // @trace TYPE-ACTION-01
    attribute selectedAction : SelectedAction;
    // @trace TYPE-ACTION-01
    attribute selectedCause : SelectedCause;
    // @trace TYPE-STATE-01
    attribute sessionState : SessionState;
    // @trace TYPE-STATE-01
    attribute cycleState : CycleState;
    // @trace TYPE-STATE-01
    attribute imageState : ImageState;
    // @trace TYPE-STATE-01
    attribute recoveryState : RecoveryState;
    // @trace PART-14
    attribute imageAvailable : Base_Types::Boolean;
    // @trace FAULT-01
    attribute effectiveFaultPresent : Base_Types::Boolean;
    // @trace TYPE-FAULT-01
    attribute dominantFault : DominantFault;
    // @trace TYPE-FAULT-01
    attribute multipleFaults : Base_Types::Boolean;
    // @trace PART-10
    attribute recoveryGate : RecoveryGate;
  }
  // @trace CTRL-CONTROL-01
  part def ControlFrame :> Data {
    // @trace CTRL-CONTROL-01
    attribute acquisitionCommand : AcquisitionCommand;
    // @trace CTRL-CONTROL-01
    attribute imageCommand : ImageCommand;
  }
  // @trace CTRL-STATUS-01
  part def StatusFrame :> Data {
    // @trace TYPE-PUBLIC-01
    attribute publicMode : PublicMode;
    // @trace TYPE-ACTION-01
    attribute selectedCause : SelectedCause;
    // @trace TYPE-STATE-01
    attribute sessionState : SessionState;
    // @trace TYPE-STATE-01
    attribute cycleState : CycleState;
    // @trace TYPE-STATE-01
    attribute imageState : ImageState;
    // @trace TYPE-STATE-01
    attribute recoveryState : RecoveryState;
    // @trace TYPE-PUBLIC-01
    attribute imageDisposition : ImageDisposition;
    // @trace TYPE-FAULT-01
    attribute dominantFault : DominantFault;
    // @trace TYPE-FAULT-01
    attribute multipleFaults : Base_Types::Boolean;
  }

  // @trace PART-01
  part def DoctorRequestQualification :> Thread {
    // @trace MON-DOC-01
    port doctor_signal : DataPort { in :>> type : DoctorSignal; }
    // @trace INT-01
    port request_facts : DataPort { out :>> type : RequestFactsRecord; }
    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_REQUEST_FACTS:
          request_facts.requestClass == RequestClass.NO_REQUEST & request_facts.requestFault == F;
      compute
        // @trace BEH-QUAL-01
        guarantee TOTAL_REQUEST_QUALIFICATION:
          ((doctor_signal == DoctorSignal.NONE & request_facts.requestClass == RequestClass.NO_REQUEST & request_facts.requestFault == F) |
           (doctor_signal == DoctorSignal.START & request_facts.requestClass == RequestClass.START_REQUEST & request_facts.requestFault == F) |
           (doctor_signal == DoctorSignal.STOP & request_facts.requestClass == RequestClass.STOP_REQUEST & request_facts.requestFault == F) |
           (doctor_signal == DoctorSignal.ACK_IMAGE & request_facts.requestClass == RequestClass.IMAGE_ACK & request_facts.requestFault == F) |
           ((doctor_signal == DoctorSignal.INVALID_INTENT | doctor_signal == DoctorSignal.INVALID_STATUS) &
            request_facts.requestClass == RequestClass.NO_REQUEST & request_facts.requestFault));
    }*/
  }

  // @trace PART-02
  part def PreparationAssessment :> Thread {
    // @trace MON-PREP-01
    port preparation_observation : DataPort { in :>> type : PreparationObservation; }
    // @trace INT-05
    port preparation_facts : DataPort { out :>> type : PreparationFacts; }
    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_PREPARATION_FACTS: preparation_facts == PreparationFacts.INPUT_FAULT;
      compute
        // @trace BEH-QUAL-01
        guarantee TOTAL_PREPARATION_ASSESSMENT:
          ((preparation_observation == PreparationObservation.READY & preparation_facts == PreparationFacts.READY) |
           ((preparation_observation == PreparationObservation.NOT_APPLIED |
             preparation_observation == PreparationObservation.CALIBRATION_NOT_PERFORMED) & preparation_facts == PreparationFacts.NOT_READY) |
           (preparation_observation == PreparationObservation.CALIBRATION_FAILED & preparation_facts == PreparationFacts.FAILED) |
           ((preparation_observation == PreparationObservation.INVALID_BELT_STATUS |
             preparation_observation == PreparationObservation.INVALID_CALIBRATION_STATUS) & preparation_facts == PreparationFacts.INPUT_FAULT));
    }*/
  }

  // @trace PART-03
  part def EquipmentAssessment :> Thread {
    // @trace MON-EQUIP-01
    port equipment_observation : DataPort { in :>> type : EquipmentObservation; }
    // @trace INT-07
    port equipment_facts : DataPort { out :>> type : EquipmentFacts; }
    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_EQUIPMENT_FACTS: equipment_facts == EquipmentFacts.INPUT_FAULT;
      compute
        // @trace BEH-QUAL-01
        guarantee TOTAL_EQUIPMENT_ASSESSMENT:
          ((equipment_observation == EquipmentObservation.READY & equipment_facts == EquipmentFacts.READY) |
           (equipment_observation == EquipmentObservation.NOT_READY & equipment_facts == EquipmentFacts.NOT_READY) |
           (equipment_observation == EquipmentObservation.BUSY & equipment_facts == EquipmentFacts.BUSY) |
           (equipment_observation == EquipmentObservation.FAULTED & equipment_facts == EquipmentFacts.FAILED) |
           ((equipment_observation == EquipmentObservation.INVALID_HEALTH_STATUS |
             equipment_observation == EquipmentObservation.INVALID_AVAILABILITY_STATUS) & equipment_facts == EquipmentFacts.INPUT_FAULT));
    }*/
  }

  // @trace PART-04
  part def BatchAssessment :> Thread {
    // @trace MON-BATCH-01
    port batch_signal : DataPort { in :>> type : BatchSignal; }
    // @trace INT-10
    port batch_facts : DataPort { out :>> type : BatchFacts; }
    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_BATCH_FACTS: batch_facts == BatchFacts.NO_BATCH;
      compute
        // @trace BEH-QUAL-01
        guarantee TOTAL_BATCH_ASSESSMENT:
          ((batch_signal == BatchSignal.NONE & batch_facts == BatchFacts.NO_BATCH) |
           (batch_signal == BatchSignal.COMPLETE & batch_facts == BatchFacts.USABLE) |
           (batch_signal == BatchSignal.INCOMPLETE & batch_facts == BatchFacts.INCOMPLETE) |
           (batch_signal == BatchSignal.CORRUPT & batch_facts == BatchFacts.FAILED) |
           ((batch_signal == BatchSignal.INVALID_BATCH_KIND | batch_signal == BatchSignal.INVALID_BATCH_STATUS) &
            batch_facts == BatchFacts.INPUT_FAULT));
    }*/
  }

  // @trace PART-05
  part def ImageResultAssessment :> Thread {
    // @trace MON-IMAGE-01
    port image_feedback : DataPort { in :>> type : ImageFeedback; }
    // @trace INT-13
    port image_result_facts : DataPort { out :>> type : ImageResultFacts; }
    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_IMAGE_FACTS: image_result_facts == ImageResultFacts.NO_RESULT;
      compute
        // @trace BEH-QUAL-01
        guarantee TOTAL_IMAGE_RESULT_ASSESSMENT:
          ((image_feedback == ImageFeedback.NONE & image_result_facts == ImageResultFacts.NO_RESULT) |
           (image_feedback == ImageFeedback.GENERATED & image_result_facts == ImageResultFacts.AVAILABLE) |
           (image_feedback == ImageFeedback.FAILED & image_result_facts == ImageResultFacts.FAILED) |
           ((image_feedback == ImageFeedback.INVALID_RESULT | image_feedback == ImageFeedback.INVALID_STATUS) &
            image_result_facts == ImageResultFacts.INPUT_FAULT));
    }*/
  }

  // @trace PART-06
  part def FaultComposition :> Thread {
    // @trace INT-01
    port request_facts : DataPort { in :>> type : RequestFactsRecord; }
    // @trace INT-05
    port preparation_facts : DataPort { in :>> type : PreparationFacts; }
    // @trace INT-07
    port equipment_facts : DataPort { in :>> type : EquipmentFacts; }
    // @trace INT-10
    port batch_facts : DataPort { in :>> type : BatchFacts; }
    // @trace INT-13
    port image_result_facts : DataPort { in :>> type : ImageResultFacts; }
    // @trace INT-15
    port fault_summary : DataPort { out :>> type : FaultSummary; }
    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_FAULT_SUMMARY:
          fault_summary.faultPresent == F & fault_summary.dominantFault == DominantFault.NONE &
          fault_summary.multipleFaults == F;
      compute
        // @trace BEH-FAULT-01
        guarantee LOCAL_FAULT_PRESENCE:
          fault_summary.faultPresent ==
            (request_facts.requestFault |
             preparation_facts == PreparationFacts.INPUT_FAULT |
             equipment_facts == EquipmentFacts.INPUT_FAULT |
             batch_facts == BatchFacts.INPUT_FAULT |
             image_result_facts == ImageResultFacts.INPUT_FAULT |
             preparation_facts == PreparationFacts.FAILED |
             equipment_facts == EquipmentFacts.FAILED |
             batch_facts == BatchFacts.FAILED |
             image_result_facts == ImageResultFacts.FAILED);
        // @trace BEH-FAULT-01
        guarantee LOCAL_FAULT_MULTIPLICITY:
          fault_summary.multipleFaults ==
            ((request_facts.requestFault &
              (preparation_facts == PreparationFacts.INPUT_FAULT | equipment_facts == EquipmentFacts.INPUT_FAULT |
               batch_facts == BatchFacts.INPUT_FAULT | image_result_facts == ImageResultFacts.INPUT_FAULT |
               preparation_facts == PreparationFacts.FAILED | equipment_facts == EquipmentFacts.FAILED |
               batch_facts == BatchFacts.FAILED | image_result_facts == ImageResultFacts.FAILED)) |
             (preparation_facts == PreparationFacts.INPUT_FAULT &
              (equipment_facts == EquipmentFacts.INPUT_FAULT | batch_facts == BatchFacts.INPUT_FAULT |
               image_result_facts == ImageResultFacts.INPUT_FAULT | preparation_facts == PreparationFacts.FAILED |
               equipment_facts == EquipmentFacts.FAILED | batch_facts == BatchFacts.FAILED |
               image_result_facts == ImageResultFacts.FAILED)) |
             (equipment_facts == EquipmentFacts.INPUT_FAULT &
              (batch_facts == BatchFacts.INPUT_FAULT | image_result_facts == ImageResultFacts.INPUT_FAULT |
               preparation_facts == PreparationFacts.FAILED | equipment_facts == EquipmentFacts.FAILED |
               batch_facts == BatchFacts.FAILED | image_result_facts == ImageResultFacts.FAILED)) |
             (batch_facts == BatchFacts.INPUT_FAULT &
              (image_result_facts == ImageResultFacts.INPUT_FAULT | preparation_facts == PreparationFacts.FAILED |
               equipment_facts == EquipmentFacts.FAILED | batch_facts == BatchFacts.FAILED |
               image_result_facts == ImageResultFacts.FAILED)) |
             (image_result_facts == ImageResultFacts.INPUT_FAULT &
              (preparation_facts == PreparationFacts.FAILED | equipment_facts == EquipmentFacts.FAILED |
               batch_facts == BatchFacts.FAILED | image_result_facts == ImageResultFacts.FAILED)) |
             (preparation_facts == PreparationFacts.FAILED &
              (equipment_facts == EquipmentFacts.FAILED | batch_facts == BatchFacts.FAILED |
               image_result_facts == ImageResultFacts.FAILED)) |
             (equipment_facts == EquipmentFacts.FAILED &
              (batch_facts == BatchFacts.FAILED | image_result_facts == ImageResultFacts.FAILED)) |
             (batch_facts == BatchFacts.FAILED & image_result_facts == ImageResultFacts.FAILED));
        // @trace BEH-FAULT-01
        guarantee LOCAL_DOMINANT_FAULT_PRIORITY:
          ((request_facts.requestFault & fault_summary.dominantFault == DominantFault.REQUEST_INPUT) |
           (request_facts.requestFault == F & preparation_facts == PreparationFacts.INPUT_FAULT &
            fault_summary.dominantFault == DominantFault.PREPARATION_INPUT) |
           (request_facts.requestFault == F & preparation_facts != PreparationFacts.INPUT_FAULT &
            equipment_facts == EquipmentFacts.INPUT_FAULT & fault_summary.dominantFault == DominantFault.EQUIPMENT_INPUT) |
           (request_facts.requestFault == F & preparation_facts != PreparationFacts.INPUT_FAULT &
            equipment_facts != EquipmentFacts.INPUT_FAULT & batch_facts == BatchFacts.INPUT_FAULT &
            fault_summary.dominantFault == DominantFault.BATCH_INPUT) |
           (request_facts.requestFault == F & preparation_facts != PreparationFacts.INPUT_FAULT &
            equipment_facts != EquipmentFacts.INPUT_FAULT & batch_facts != BatchFacts.INPUT_FAULT &
            image_result_facts == ImageResultFacts.INPUT_FAULT & fault_summary.dominantFault == DominantFault.IMAGE_INPUT) |
           (request_facts.requestFault == F & preparation_facts != PreparationFacts.INPUT_FAULT &
            equipment_facts != EquipmentFacts.INPUT_FAULT & batch_facts != BatchFacts.INPUT_FAULT &
            image_result_facts != ImageResultFacts.INPUT_FAULT & preparation_facts == PreparationFacts.FAILED &
            fault_summary.dominantFault == DominantFault.PREPARATION_FAILURE) |
           (request_facts.requestFault == F & preparation_facts != PreparationFacts.INPUT_FAULT &
            equipment_facts != EquipmentFacts.INPUT_FAULT & batch_facts != BatchFacts.INPUT_FAULT &
            image_result_facts != ImageResultFacts.INPUT_FAULT & preparation_facts != PreparationFacts.FAILED &
            equipment_facts == EquipmentFacts.FAILED & fault_summary.dominantFault == DominantFault.EQUIPMENT_FAILURE) |
           (request_facts.requestFault == F & preparation_facts != PreparationFacts.INPUT_FAULT &
            equipment_facts != EquipmentFacts.INPUT_FAULT & batch_facts != BatchFacts.INPUT_FAULT &
            image_result_facts != ImageResultFacts.INPUT_FAULT & preparation_facts != PreparationFacts.FAILED &
            equipment_facts != EquipmentFacts.FAILED & batch_facts == BatchFacts.FAILED &
            fault_summary.dominantFault == DominantFault.BATCH_FAILURE) |
           (request_facts.requestFault == F & preparation_facts != PreparationFacts.INPUT_FAULT &
            equipment_facts != EquipmentFacts.INPUT_FAULT & batch_facts != BatchFacts.INPUT_FAULT &
            image_result_facts != ImageResultFacts.INPUT_FAULT & preparation_facts != PreparationFacts.FAILED &
            equipment_facts != EquipmentFacts.FAILED & batch_facts != BatchFacts.FAILED &
            image_result_facts == ImageResultFacts.FAILED & fault_summary.dominantFault == DominantFault.IMAGE_FAILURE) |
           (fault_summary.faultPresent == F & fault_summary.dominantFault == DominantFault.NONE));
    }*/
  }

  // @trace PART-07
  part def SessionControl :> Thread {
    // @trace INT-03
    port request_facts : DataPort { in :>> type : RequestFactsRecord; }
    // @trace INT-16
    port recovery_frame : DataPort { in :>> type : RecoveryFrame; }
    // @trace INT-23
    port start_feasibility : DataPort { in :>> type : StartFeasibility; }
    // @trace INT-24
    port session_frame : DataPort { out :>> type : SessionFrame; }
    language "GUMBO" /*{
      state
        // @trace PART-07
        sessionMemory: SessionState;
      initialize
        modifies sessionMemory;
        // @trace ASM-INIT-01
        guarantee INITIAL_SESSION:
          sessionMemory == SessionState.IDLE & session_frame.sessionState == SessionState.IDLE &
          session_frame.startAdmitted == F & session_frame.stopAdmitted == F;
      compute
        modifies sessionMemory;
        // @trace PART-07
        guarantee SESSION_FRAME_STATE: session_frame.sessionState == sessionMemory;
        compute_cases
          // @trace CASE-06
          case CASE_06_CLOSED_RECOVERY:
            assume recovery_frame.recoveryGate == RecoveryGate.CLOSED;
            guarantee sessionMemory == SessionState.RECOVERY &
              session_frame.startAdmitted == F & session_frame.stopAdmitted == F;
          // @trace CASE-07
          case CASE_07_RECOVERY_RELEASE:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN &
              In(sessionMemory) == SessionState.RECOVERY;
            guarantee sessionMemory == SessionState.IDLE &
              session_frame.startAdmitted == F & session_frame.stopAdmitted == F;
          // @trace CASE-08
          case CASE_08_IDLE_START:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN &
              In(sessionMemory) == SessionState.IDLE &
              start_feasibility == StartFeasibility.FEASIBLE;
            guarantee sessionMemory == SessionState.MONITORING &
              session_frame.startAdmitted & session_frame.stopAdmitted == F;
          // @trace CASE-09
          case CASE_09_IDLE_NO_START:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN &
              In(sessionMemory) == SessionState.IDLE &
              start_feasibility != StartFeasibility.FEASIBLE;
            guarantee sessionMemory == SessionState.IDLE &
              session_frame.startAdmitted == F & session_frame.stopAdmitted == F;
          // @trace CASE-10
          case CASE_10_MONITORING_STOP:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN &
              In(sessionMemory) == SessionState.MONITORING &
              request_facts.requestClass == RequestClass.STOP_REQUEST;
            guarantee sessionMemory == SessionState.IDLE &
              session_frame.startAdmitted == F & session_frame.stopAdmitted;
          // @trace CASE-11
          case CASE_11_MONITORING_STUTTER:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN &
              In(sessionMemory) == SessionState.MONITORING &
              request_facts.requestClass != RequestClass.STOP_REQUEST;
            guarantee sessionMemory == SessionState.MONITORING &
              session_frame.startAdmitted == F & session_frame.stopAdmitted == F;
    }*/
  }

  // @trace PART-08
  part def AcquisitionCycleControl :> Thread {
    // @trace INT-09
    port equipment_facts : DataPort { in :>> type : EquipmentFacts; }
    // @trace INT-11
    port batch_facts : DataPort { in :>> type : BatchFacts; }
    // @trace INT-17
    port recovery_frame : DataPort { in :>> type : RecoveryFrame; }
    // @trace INT-27
    port cycle_frame : DataPort { out :>> type : CycleFrame; }
    language "GUMBO" /*{
      state
        // @trace PART-08
        cycleMemory: CycleState;
      initialize
        modifies cycleMemory;
        // @trace ASM-INIT-01
        guarantee INITIAL_CYCLE:
          cycleMemory == CycleState.DORMANT & cycle_frame.cycleState == CycleState.DORMANT &
          cycle_frame.batchReady == F;
      compute
        modifies cycleMemory;
        // @trace PART-08
        guarantee CYCLE_FRAME_STATE: cycle_frame.cycleState == cycleMemory;
        compute_cases
          // @trace CASE-12
          case CASE_12_CLOSED_RECOVERY:
            assume recovery_frame.recoveryGate == RecoveryGate.CLOSED;
            guarantee cycleMemory == CycleState.RECOVERY & cycle_frame.batchReady == F;
          // @trace CASE-13
          case CASE_13_RECOVERY_RELEASE:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN & In(cycleMemory) == CycleState.RECOVERY;
            guarantee cycleMemory == CycleState.DORMANT & cycle_frame.batchReady == F;
          // @trace CASE-14
          case CASE_14_USABLE_BATCH:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN & In(cycleMemory) != CycleState.RECOVERY &
              batch_facts == BatchFacts.USABLE;
            guarantee cycleMemory == CycleState.BATCH_READY & cycle_frame.batchReady;
          // @trace CASE-15
          case CASE_15_EQUIPMENT_BUSY:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN & In(cycleMemory) != CycleState.RECOVERY &
              batch_facts != BatchFacts.USABLE & equipment_facts == EquipmentFacts.BUSY;
            guarantee cycleMemory == CycleState.COLLECTING & cycle_frame.batchReady == F;
          // @trace CASE-16
          case CASE_16_EQUIPMENT_READY:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN & In(cycleMemory) != CycleState.RECOVERY &
              batch_facts != BatchFacts.USABLE & equipment_facts == EquipmentFacts.READY;
            guarantee cycleMemory == CycleState.READY & cycle_frame.batchReady == F;
          // @trace CASE-17
          case CASE_17_CYCLE_FALLTHROUGH:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN & In(cycleMemory) != CycleState.RECOVERY &
              batch_facts != BatchFacts.USABLE & equipment_facts != EquipmentFacts.BUSY &
              equipment_facts != EquipmentFacts.READY;
            guarantee cycleMemory == CycleState.DORMANT & cycle_frame.batchReady == F;
    }*/
  }

  // @trace PART-09
  part def ImageAvailabilityControl :> Thread {
    // @trace INT-04
    port request_facts : DataPort { in :>> type : RequestFactsRecord; }
    // @trace INT-12
    port batch_facts : DataPort { in :>> type : BatchFacts; }
    // @trace INT-14
    port image_result_facts : DataPort { in :>> type : ImageResultFacts; }
    // @trace INT-18
    port recovery_frame : DataPort { in :>> type : RecoveryFrame; }
    // @trace INT-29
    port image_frame : DataPort { out :>> type : ImageFrame; }
    language "GUMBO" /*{
      state
        // @trace PART-09
        imageMemory: ImageState;
      initialize
        modifies imageMemory;
        // @trace ASM-INIT-01
        guarantee INITIAL_IMAGE:
          imageMemory == ImageState.EMPTY & image_frame.imageState == ImageState.EMPTY &
          image_frame.generateProposal == F;
      compute
        modifies imageMemory;
        // @trace PART-09
        guarantee IMAGE_FRAME_STATE: image_frame.imageState == imageMemory;
        compute_cases
          // @trace CASE-18
          case CASE_18_CLOSED_RECOVERY:
            assume recovery_frame.recoveryGate == RecoveryGate.CLOSED;
            guarantee imageMemory == ImageState.RECOVERY & image_frame.generateProposal == F;
          // @trace CASE-19
          case CASE_19_RECOVERY_RELEASE:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN & In(imageMemory) == ImageState.RECOVERY;
            guarantee imageMemory == ImageState.EMPTY & image_frame.generateProposal == F;
          // @trace CASE-20
          case CASE_20_RESULT_AVAILABLE:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN & In(imageMemory) != ImageState.RECOVERY &
              image_result_facts == ImageResultFacts.AVAILABLE;
            guarantee imageMemory == ImageState.AVAILABLE & image_frame.generateProposal == F;
          // @trace CASE-21
          case CASE_21_IMAGE_ACK:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN & In(imageMemory) != ImageState.RECOVERY &
              image_result_facts != ImageResultFacts.AVAILABLE &
              request_facts.requestClass == RequestClass.IMAGE_ACK;
            guarantee imageMemory == ImageState.EMPTY & image_frame.generateProposal == F;
          // @trace CASE-22
          case CASE_22_USABLE_BATCH:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN & In(imageMemory) != ImageState.RECOVERY &
              image_result_facts != ImageResultFacts.AVAILABLE &
              request_facts.requestClass != RequestClass.IMAGE_ACK & batch_facts == BatchFacts.USABLE;
            guarantee imageMemory == ImageState.AWAITING_IMAGE & image_frame.generateProposal;
          // @trace CASE-23
          case CASE_23_IMAGE_STUTTER:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN & In(imageMemory) != ImageState.RECOVERY &
              image_result_facts != ImageResultFacts.AVAILABLE &
              request_facts.requestClass != RequestClass.IMAGE_ACK & batch_facts != BatchFacts.USABLE;
            guarantee imageMemory == In(imageMemory) &
              (image_frame.generateProposal == (In(imageMemory) == ImageState.AWAITING_IMAGE));
    }*/
  }

  // @trace PART-10
  part def RecoveryControl :> Thread {
    // @trace MON-REC-01
    port recovery_event : DataPort { in :>> type : RecoveryEvent; }
    // @trace INT-15
    port fault_summary : DataPort { in :>> type : FaultSummary; }
    // @trace INT-16
    port recovery_frame : DataPort { out :>> type : RecoveryFrame; }
    language "GUMBO" /*{
      state
        // @trace PART-10
        recoveryMemory: RecoveryState;
      initialize
        modifies recoveryMemory;
        // @trace ASM-INIT-01
        guarantee INITIAL_RECOVERY:
          recoveryMemory == RecoveryState.HEALTHY & recovery_frame.recoveryState == RecoveryState.HEALTHY &
          recovery_frame.recoveryGate == RecoveryGate.OPEN & recovery_frame.recoveryCause == RecoveryCause.NONE &
          recovery_frame.effectiveFaultPresent == F &
          recovery_frame.dominantFault == DominantFault.NONE &
          recovery_frame.effectiveMultipleFaults == F;
      compute
        modifies recoveryMemory;
        // @trace PART-10
        guarantee RECOVERY_FRAME_STATE_AND_GATE:
          recovery_frame.recoveryState == recoveryMemory &
          ((recoveryMemory == RecoveryState.HEALTHY & recovery_frame.recoveryGate == RecoveryGate.OPEN) |
           (recoveryMemory != RecoveryState.HEALTHY & recovery_frame.recoveryGate == RecoveryGate.CLOSED));
        // @trace FAULT-01
        guarantee EFFECTIVE_FAULT_COMPOSITION:
          recovery_frame.effectiveFaultPresent ==
            (fault_summary.faultPresent | recovery_event == RecoveryEvent.INVALID_RESET |
             recovery_event == RecoveryEvent.INVALID_STATUS) &
          recovery_frame.effectiveMultipleFaults ==
            (fault_summary.multipleFaults |
             ((recovery_event == RecoveryEvent.INVALID_RESET | recovery_event == RecoveryEvent.INVALID_STATUS) &
              fault_summary.faultPresent)) &
          (((recovery_event == RecoveryEvent.INVALID_RESET | recovery_event == RecoveryEvent.INVALID_STATUS) &
            recovery_frame.dominantFault == DominantFault.RECOVERY_INPUT) |
           (recovery_event != RecoveryEvent.INVALID_RESET & recovery_event != RecoveryEvent.INVALID_STATUS &
            recovery_frame.dominantFault == fault_summary.dominantFault));
        // @trace FAULT-02
        guarantee RECOVERY_CAUSE_CLASSIFICATION:
          (((recovery_event == RecoveryEvent.INVALID_RESET | recovery_event == RecoveryEvent.INVALID_STATUS) &
            recovery_frame.recoveryCause == RecoveryCause.RECOVERY_INPUT_FAULT) |
           (recovery_event != RecoveryEvent.INVALID_RESET & recovery_event != RecoveryEvent.INVALID_STATUS &
            fault_summary.faultPresent & recovery_frame.recoveryCause == RecoveryCause.LOCAL_FAULT) |
           (recovery_frame.effectiveFaultPresent == F & recoveryMemory == RecoveryState.LATCHED &
            recovery_frame.recoveryCause == RecoveryCause.LATCHED) |
           (recovery_frame.effectiveFaultPresent == F & recoveryMemory == RecoveryState.VERIFYING &
            recovery_frame.recoveryCause == RecoveryCause.VERIFYING) |
           (recovery_frame.effectiveFaultPresent == F & recoveryMemory == RecoveryState.HEALTHY &
            recovery_frame.recoveryCause == RecoveryCause.NONE));
        compute_cases
          // @trace CASE-01
          case CASE_01_FAULT_DOMINATES:
            assume fault_summary.faultPresent |
              recovery_event == RecoveryEvent.INVALID_RESET | recovery_event == RecoveryEvent.INVALID_STATUS;
            guarantee recoveryMemory == RecoveryState.LATCHED;
          // @trace CASE-02
          case CASE_02_HEALTHY_STUTTER:
            assume fault_summary.faultPresent == F & recovery_event != RecoveryEvent.INVALID_RESET &
              recovery_event != RecoveryEvent.INVALID_STATUS & In(recoveryMemory) == RecoveryState.HEALTHY;
            guarantee recoveryMemory == RecoveryState.HEALTHY;
          // @trace CASE-03
          case CASE_03_RESET_TO_VERIFYING:
            assume fault_summary.faultPresent == F & recovery_event != RecoveryEvent.INVALID_RESET &
              recovery_event != RecoveryEvent.INVALID_STATUS & In(recoveryMemory) == RecoveryState.LATCHED &
              recovery_event == RecoveryEvent.RESET;
            guarantee recoveryMemory == RecoveryState.VERIFYING;
          // @trace CASE-04
          case CASE_04_VERIFICATION_RELEASE:
            assume fault_summary.faultPresent == F & recovery_event != RecoveryEvent.INVALID_RESET &
              recovery_event != RecoveryEvent.INVALID_STATUS & In(recoveryMemory) == RecoveryState.VERIFYING &
              recovery_event == RecoveryEvent.VERIFY_OK;
            guarantee recoveryMemory == RecoveryState.HEALTHY;
          // @trace CASE-05
          case CASE_05_CLOSED_STUTTER:
            assume fault_summary.faultPresent == F & recovery_event != RecoveryEvent.INVALID_RESET &
              recovery_event != RecoveryEvent.INVALID_STATUS &
              ((In(recoveryMemory) == RecoveryState.LATCHED & recovery_event != RecoveryEvent.RESET) |
               (In(recoveryMemory) == RecoveryState.VERIFYING & recovery_event != RecoveryEvent.VERIFY_OK));
            guarantee recoveryMemory == In(recoveryMemory);
    }*/
  }

  // @trace PART-11
  part def StartFeasibilityOwner :> Thread {
    // @trace INT-02
    port request_facts : DataPort { in :>> type : RequestFactsRecord; }
    // @trace INT-06
    port preparation_facts : DataPort { in :>> type : PreparationFacts; }
    // @trace INT-08
    port equipment_facts : DataPort { in :>> type : EquipmentFacts; }
    // @trace INT-19
    port recovery_frame : DataPort { in :>> type : RecoveryFrame; }
    // @trace INT-23
    port start_feasibility : DataPort { out :>> type : StartFeasibility; }
    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_START_NOT_FEASIBLE: start_feasibility == StartFeasibility.NOT_FEASIBLE;
      compute
        // @trace BEH-START-01
        guarantee START_FEASIBILITY_RELATION:
          ((request_facts.requestClass == RequestClass.START_REQUEST &
            preparation_facts == PreparationFacts.READY & equipment_facts == EquipmentFacts.READY &
            recovery_frame.recoveryGate == RecoveryGate.OPEN & start_feasibility == StartFeasibility.FEASIBLE) |
           ((request_facts.requestClass != RequestClass.START_REQUEST |
             preparation_facts != PreparationFacts.READY | equipment_facts != EquipmentFacts.READY |
             recovery_frame.recoveryGate != RecoveryGate.OPEN) &
            start_feasibility == StartFeasibility.NOT_FEASIBLE));
    }*/
  }

  // @trace PART-12
  part def CollectionFeasibilityOwner :> Thread {
    // @trace INT-20
    port recovery_frame : DataPort { in :>> type : RecoveryFrame; }
    // @trace INT-24
    port session_frame : DataPort { in :>> type : SessionFrame; }
    // @trace INT-27
    port cycle_frame : DataPort { in :>> type : CycleFrame; }
    // @trace INT-31
    port collection_proposal : DataPort { out :>> type : Proposal; }
    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_COLLECTION_NOT_PROPOSED: collection_proposal == Proposal.NOT_PROPOSED;
      compute
        // @trace BEH-COLLECT-01
        guarantee COLLECTION_FEASIBILITY_RELATION:
          ((recovery_frame.recoveryGate == RecoveryGate.OPEN &
            session_frame.sessionState == SessionState.MONITORING & cycle_frame.cycleState == CycleState.READY &
            collection_proposal == Proposal.PROPOSED) |
           ((recovery_frame.recoveryGate != RecoveryGate.OPEN |
             session_frame.sessionState != SessionState.MONITORING | cycle_frame.cycleState != CycleState.READY) &
            collection_proposal == Proposal.NOT_PROPOSED));
    }*/
  }

  // @trace PART-13
  part def ImageReleaseFeasibilityOwner :> Thread {
    // @trace INT-21
    port recovery_frame : DataPort { in :>> type : RecoveryFrame; }
    // @trace INT-25
    port session_frame : DataPort { in :>> type : SessionFrame; }
    // @trace INT-29
    port image_frame : DataPort { in :>> type : ImageFrame; }
    // @trace INT-32
    port release_proposal : DataPort { out :>> type : Proposal; }
    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_RELEASE_NOT_PROPOSED: release_proposal == Proposal.NOT_PROPOSED;
      compute
        // @trace BEH-RELEASE-01
        guarantee IMAGE_RELEASE_FEASIBILITY_RELATION:
          ((recovery_frame.recoveryGate == RecoveryGate.OPEN &
            session_frame.sessionState == SessionState.MONITORING & image_frame.imageState == ImageState.AVAILABLE &
            release_proposal == Proposal.PROPOSED) |
           ((recovery_frame.recoveryGate != RecoveryGate.OPEN |
             session_frame.sessionState != SessionState.MONITORING | image_frame.imageState != ImageState.AVAILABLE) &
            release_proposal == Proposal.NOT_PROPOSED));
    }*/
  }

  // @trace PART-14
  part def SupervisoryArbitration :> Thread {
    // @trace INT-22
    port recovery_frame : DataPort { in :>> type : RecoveryFrame; }
    // @trace INT-26
    port session_frame : DataPort { in :>> type : SessionFrame; }
    // @trace INT-28
    port cycle_frame : DataPort { in :>> type : CycleFrame; }
    // @trace INT-30
    port image_frame : DataPort { in :>> type : ImageFrame; }
    // @trace INT-31
    port collection_proposal : DataPort { in :>> type : Proposal; }
    // @trace INT-32
    port release_proposal : DataPort { in :>> type : Proposal; }
    // @trace INT-33
    port decision_frame : DataPort { out :>> type : DecisionFrame; }
    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_DECISION_FRAME:
          decision_frame.selectedAction == SelectedAction.HOLD &
          decision_frame.selectedCause == SelectedCause.NO_ELIGIBLE_WORK &
          decision_frame.sessionState == SessionState.IDLE & decision_frame.cycleState == CycleState.DORMANT &
          decision_frame.imageState == ImageState.EMPTY & decision_frame.recoveryState == RecoveryState.HEALTHY &
          decision_frame.imageAvailable == F & decision_frame.effectiveFaultPresent == F &
          decision_frame.dominantFault == DominantFault.NONE & decision_frame.multipleFaults == F &
          decision_frame.recoveryGate == RecoveryGate.OPEN;
      compute
        // @trace COMP-01
        guarantee RECEIVED_DECISION_CONTEXT:
          decision_frame.sessionState == session_frame.sessionState &
          decision_frame.cycleState == cycle_frame.cycleState &
          decision_frame.imageState == image_frame.imageState &
          decision_frame.recoveryState == recovery_frame.recoveryState &
          decision_frame.imageAvailable == (image_frame.imageState == ImageState.AVAILABLE) &
          decision_frame.effectiveFaultPresent == recovery_frame.effectiveFaultPresent &
          decision_frame.dominantFault == recovery_frame.dominantFault &
          decision_frame.multipleFaults == recovery_frame.effectiveMultipleFaults &
          decision_frame.recoveryGate == recovery_frame.recoveryGate;
        compute_cases
          // @trace CASE-24
          case CASE_24_EMERGENCY_HOLD:
            assume recovery_frame.recoveryGate == RecoveryGate.CLOSED;
            guarantee decision_frame.selectedAction == SelectedAction.EMERGENCY_HOLD &
              decision_frame.selectedCause == SelectedCause.FAULT_OR_RECOVERY;
          // @trace CASE-25
          case CASE_25_STOP_PRIORITY:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN & session_frame.stopAdmitted;
            guarantee decision_frame.selectedAction == SelectedAction.STOP &
              decision_frame.selectedCause == SelectedCause.DOCTOR_STOP;
          // @trace CASE-26
          case CASE_26_START_PRIORITY:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN & session_frame.stopAdmitted == F &
              session_frame.startAdmitted;
            guarantee decision_frame.selectedAction == SelectedAction.START &
              decision_frame.selectedCause == SelectedCause.DOCTOR_START;
          // @trace CASE-27
          case CASE_27_RELEASE_PRIORITY:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN & session_frame.stopAdmitted == F &
              session_frame.startAdmitted == F & release_proposal == Proposal.PROPOSED;
            guarantee decision_frame.selectedAction == SelectedAction.RELEASE_IMAGE &
              decision_frame.selectedCause == SelectedCause.IMAGE_AVAILABLE;
          // @trace CASE-28
          case CASE_28_GENERATION_PRIORITY:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN & session_frame.stopAdmitted == F &
              session_frame.startAdmitted == F & release_proposal == Proposal.NOT_PROPOSED &
              image_frame.generateProposal;
            guarantee decision_frame.selectedAction == SelectedAction.GENERATE_IMAGE &
              decision_frame.selectedCause == SelectedCause.USABLE_BATCH;
          // @trace CASE-29
          case CASE_29_COLLECTION_PRIORITY:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN & session_frame.stopAdmitted == F &
              session_frame.startAdmitted == F & release_proposal == Proposal.NOT_PROPOSED &
              image_frame.generateProposal == F & collection_proposal == Proposal.PROPOSED;
            guarantee decision_frame.selectedAction == SelectedAction.COLLECT &
              decision_frame.selectedCause == SelectedCause.READY_TO_COLLECT;
          // @trace CASE-30
          case CASE_30_HOLD_FALLTHROUGH:
            assume recovery_frame.recoveryGate == RecoveryGate.OPEN & session_frame.stopAdmitted == F &
              session_frame.startAdmitted == F & release_proposal == Proposal.NOT_PROPOSED &
              image_frame.generateProposal == F & collection_proposal == Proposal.NOT_PROPOSED;
            guarantee decision_frame.selectedAction == SelectedAction.HOLD &
              decision_frame.selectedCause == SelectedCause.NO_ELIGIBLE_WORK;
    }*/
  }

  // @trace PART-15
  part def PublicationComposition :> Thread {
    // @trace INT-33
    port decision_frame : DataPort { in :>> type : DecisionFrame; }
    // @trace CTRL-CONTROL-01
    port control_frame : DataPort { out :>> type : ControlFrame; }
    // @trace CTRL-STATUS-01
    port status_frame : DataPort { out :>> type : StatusFrame; }
    language "GUMBO" /*{
      initialize
        // @trace ASM-INIT-01
        guarantee INITIAL_PUBLIC_OUTPUTS:
          control_frame.acquisitionCommand == AcquisitionCommand.NO_COMMAND &
          control_frame.imageCommand == ImageCommand.NO_COMMAND & status_frame.publicMode == PublicMode.IDLE &
          status_frame.selectedCause == SelectedCause.NO_ELIGIBLE_WORK &
          status_frame.sessionState == SessionState.IDLE & status_frame.cycleState == CycleState.DORMANT &
          status_frame.imageState == ImageState.EMPTY & status_frame.recoveryState == RecoveryState.HEALTHY &
          status_frame.imageDisposition == ImageDisposition.WITHHELD &
          status_frame.dominantFault == DominantFault.NONE & status_frame.multipleFaults == F;
      compute
        // @trace BEH-COMP-01
        guarantee COMPLETE_COMMAND_MAPPING:
          (((decision_frame.selectedAction == SelectedAction.EMERGENCY_HOLD |
             decision_frame.selectedAction == SelectedAction.STOP) &
            control_frame.acquisitionCommand == AcquisitionCommand.REQUEST_STOP &
            control_frame.imageCommand == ImageCommand.NO_COMMAND) |
           (decision_frame.selectedAction == SelectedAction.START &
            control_frame.acquisitionCommand == AcquisitionCommand.REQUEST_START &
            control_frame.imageCommand == ImageCommand.NO_COMMAND) |
           (decision_frame.selectedAction == SelectedAction.COLLECT &
            control_frame.acquisitionCommand == AcquisitionCommand.REQUEST_COLLECTION &
            control_frame.imageCommand == ImageCommand.NO_COMMAND) |
           (decision_frame.selectedAction == SelectedAction.GENERATE_IMAGE &
            control_frame.acquisitionCommand == AcquisitionCommand.NO_COMMAND &
            control_frame.imageCommand == ImageCommand.REQUEST_GENERATION) |
           ((decision_frame.selectedAction == SelectedAction.RELEASE_IMAGE |
             decision_frame.selectedAction == SelectedAction.HOLD) &
            control_frame.acquisitionCommand == AcquisitionCommand.NO_COMMAND &
            control_frame.imageCommand == ImageCommand.NO_COMMAND));
        // @trace COMP-01
        guarantee COMPLETE_STATUS_MAPPING:
          status_frame.selectedCause == decision_frame.selectedCause &
          status_frame.sessionState == decision_frame.sessionState &
          status_frame.cycleState == decision_frame.cycleState &
          status_frame.imageState == decision_frame.imageState &
          status_frame.recoveryState == decision_frame.recoveryState &
          status_frame.dominantFault == decision_frame.dominantFault &
          status_frame.multipleFaults == decision_frame.multipleFaults &
          ((decision_frame.selectedAction == SelectedAction.RELEASE_IMAGE &
            status_frame.imageDisposition == ImageDisposition.AVAILABLE_FOR_ANALYSIS) |
           (decision_frame.selectedAction != SelectedAction.RELEASE_IMAGE &
            status_frame.imageDisposition == ImageDisposition.WITHHELD)) &
          ((decision_frame.selectedAction == SelectedAction.EMERGENCY_HOLD &
            decision_frame.effectiveFaultPresent & status_frame.publicMode == PublicMode.FAULT) |
           (decision_frame.selectedAction == SelectedAction.EMERGENCY_HOLD &
            decision_frame.effectiveFaultPresent == F & status_frame.publicMode == PublicMode.RECOVERY) |
           (decision_frame.selectedAction == SelectedAction.STOP & status_frame.publicMode == PublicMode.IDLE) |
           (decision_frame.selectedAction == SelectedAction.START & status_frame.publicMode == PublicMode.STARTING) |
           (decision_frame.selectedAction == SelectedAction.RELEASE_IMAGE & status_frame.publicMode == PublicMode.IMAGE_AVAILABLE) |
           (decision_frame.selectedAction == SelectedAction.GENERATE_IMAGE & status_frame.publicMode == PublicMode.IMAGING) |
           (decision_frame.selectedAction == SelectedAction.COLLECT & status_frame.publicMode == PublicMode.COLLECTING) |
           (decision_frame.selectedAction == SelectedAction.HOLD &
            ((decision_frame.sessionState == SessionState.MONITORING & status_frame.publicMode == PublicMode.MONITORING) |
             (decision_frame.sessionState != SessionState.MONITORING & status_frame.publicMode == PublicMode.IDLE))));
    }*/
  }

  // @generated-support One behavior-free Process groups the semantic sibling Threads.
  part def EITAcquisitionProcess :> Process {
    // @generated-support Transparent Doctor boundary endpoint.
    port doctor_signal : DataPort { in :>> type : DoctorSignal; }
    // @generated-support Transparent preparation boundary endpoint.
    port preparation_observation : DataPort { in :>> type : PreparationObservation; }
    // @generated-support Transparent equipment boundary endpoint.
    port equipment_observation : DataPort { in :>> type : EquipmentObservation; }
    // @generated-support Transparent batch boundary endpoint.
    port batch_signal : DataPort { in :>> type : BatchSignal; }
    // @generated-support Transparent image-feedback boundary endpoint.
    port image_feedback : DataPort { in :>> type : ImageFeedback; }
    // @generated-support Transparent recovery-event boundary endpoint.
    port recovery_event : DataPort { in :>> type : RecoveryEvent; }
    // @generated-support Transparent control-frame boundary endpoint.
    port control_frame : DataPort { out :>> type : ControlFrame; }
    // @generated-support Transparent status-frame boundary endpoint.
    port status_frame : DataPort { out :>> type : StatusFrame; }

    // @trace PART-01
    part doctor_request_qualification : DoctorRequestQualification;
    // @trace PART-02
    part preparation_assessment : PreparationAssessment;
    // @trace PART-03
    part equipment_assessment : EquipmentAssessment;
    // @trace PART-04
    part batch_assessment : BatchAssessment;
    // @trace PART-05
    part image_result_assessment : ImageResultAssessment;
    // @trace PART-06
    part fault_composition : FaultComposition;
    // @trace PART-07
    part session_control : SessionControl;
    // @trace PART-08
    part acquisition_cycle_control : AcquisitionCycleControl;
    // @trace PART-09
    part image_availability_control : ImageAvailabilityControl;
    // @trace PART-10
    part recovery_control : RecoveryControl;
    // @trace PART-11
    part start_feasibility : StartFeasibilityOwner;
    // @trace PART-12
    part collection_feasibility : CollectionFeasibilityOwner;
    // @trace PART-13
    part image_release_feasibility : ImageReleaseFeasibilityOwner;
    // @trace PART-14
    part supervisory_arbitration : SupervisoryArbitration;
    // @trace PART-15
    part publication_composition : PublicationComposition;

    // Eight behavior-free Process-boundary connections.
    // @generated-support Transparent Doctor input delegation.
    connection support01 : PortConnection connect doctor_signal to doctor_request_qualification.doctor_signal;
    // @generated-support Transparent preparation input delegation.
    connection support02 : PortConnection connect preparation_observation to preparation_assessment.preparation_observation;
    // @generated-support Transparent equipment input delegation.
    connection support03 : PortConnection connect equipment_observation to equipment_assessment.equipment_observation;
    // @generated-support Transparent batch input delegation.
    connection support04 : PortConnection connect batch_signal to batch_assessment.batch_signal;
    // @generated-support Transparent image-feedback input delegation.
    connection support05 : PortConnection connect image_feedback to image_result_assessment.image_feedback;
    // @generated-support Transparent recovery-event input delegation.
    connection support06 : PortConnection connect recovery_event to recovery_control.recovery_event;
    // @generated-support Transparent control-frame output delegation.
    connection support07 : PortConnection connect publication_composition.control_frame to control_frame;
    // @generated-support Transparent status-frame output delegation.
    connection support08 : PortConnection connect publication_composition.status_frame to status_frame;

    // @trace INT-01
    connection int01 : PortConnection connect doctor_request_qualification.request_facts to fault_composition.request_facts;
    // @trace INT-02
    connection int02 : PortConnection connect doctor_request_qualification.request_facts to start_feasibility.request_facts;
    // @trace INT-03
    connection int03 : PortConnection connect doctor_request_qualification.request_facts to session_control.request_facts;
    // @trace INT-04
    connection int04 : PortConnection connect doctor_request_qualification.request_facts to image_availability_control.request_facts;
    // @trace INT-05
    connection int05 : PortConnection connect preparation_assessment.preparation_facts to fault_composition.preparation_facts;
    // @trace INT-06
    connection int06 : PortConnection connect preparation_assessment.preparation_facts to start_feasibility.preparation_facts;
    // @trace INT-07
    connection int07 : PortConnection connect equipment_assessment.equipment_facts to fault_composition.equipment_facts;
    // @trace INT-08
    connection int08 : PortConnection connect equipment_assessment.equipment_facts to start_feasibility.equipment_facts;
    // @trace INT-09
    connection int09 : PortConnection connect equipment_assessment.equipment_facts to acquisition_cycle_control.equipment_facts;
    // @trace INT-10
    connection int10 : PortConnection connect batch_assessment.batch_facts to fault_composition.batch_facts;
    // @trace INT-11
    connection int11 : PortConnection connect batch_assessment.batch_facts to acquisition_cycle_control.batch_facts;
    // @trace INT-12
    connection int12 : PortConnection connect batch_assessment.batch_facts to image_availability_control.batch_facts;
    // @trace INT-13
    connection int13 : PortConnection connect image_result_assessment.image_result_facts to fault_composition.image_result_facts;
    // @trace INT-14
    connection int14 : PortConnection connect image_result_assessment.image_result_facts to image_availability_control.image_result_facts;
    // @trace INT-15
    connection int15 : PortConnection connect fault_composition.fault_summary to recovery_control.fault_summary;
    // @trace INT-16
    connection int16 : PortConnection connect recovery_control.recovery_frame to session_control.recovery_frame;
    // @trace INT-17
    connection int17 : PortConnection connect recovery_control.recovery_frame to acquisition_cycle_control.recovery_frame;
    // @trace INT-18
    connection int18 : PortConnection connect recovery_control.recovery_frame to image_availability_control.recovery_frame;
    // @trace INT-19
    connection int19 : PortConnection connect recovery_control.recovery_frame to start_feasibility.recovery_frame;
    // @trace INT-20
    connection int20 : PortConnection connect recovery_control.recovery_frame to collection_feasibility.recovery_frame;
    // @trace INT-21
    connection int21 : PortConnection connect recovery_control.recovery_frame to image_release_feasibility.recovery_frame;
    // @trace INT-22
    connection int22 : PortConnection connect recovery_control.recovery_frame to supervisory_arbitration.recovery_frame;
    // @trace INT-23
    connection int23 : PortConnection connect start_feasibility.start_feasibility to session_control.start_feasibility;
    // @trace INT-24
    connection int24 : PortConnection connect session_control.session_frame to collection_feasibility.session_frame;
    // @trace INT-25
    connection int25 : PortConnection connect session_control.session_frame to image_release_feasibility.session_frame;
    // @trace INT-26
    connection int26 : PortConnection connect session_control.session_frame to supervisory_arbitration.session_frame;
    // @trace INT-27
    connection int27 : PortConnection connect acquisition_cycle_control.cycle_frame to collection_feasibility.cycle_frame;
    // @trace INT-28
    connection int28 : PortConnection connect acquisition_cycle_control.cycle_frame to supervisory_arbitration.cycle_frame;
    // @trace INT-29
    connection int29 : PortConnection connect image_availability_control.image_frame to image_release_feasibility.image_frame;
    // @trace INT-30
    connection int30 : PortConnection connect image_availability_control.image_frame to supervisory_arbitration.image_frame;
    // @trace INT-31
    connection int31 : PortConnection connect collection_feasibility.collection_proposal to supervisory_arbitration.collection_proposal;
    // @trace INT-32
    connection int32 : PortConnection connect image_release_feasibility.release_proposal to supervisory_arbitration.release_proposal;
    // @trace INT-33
    connection int33 : PortConnection connect supervisory_arbitration.decision_frame to publication_composition.decision_frame;
  }

  // @trace CTX-01
  part def EITAcquisitionSupervisorSystem :> System {
    // @trace MON-DOC-01
    port doctor_signal : DataPort { in :>> type : DoctorSignal; }
    // @trace MON-PREP-01
    port preparation_observation : DataPort { in :>> type : PreparationObservation; }
    // @trace MON-EQUIP-01
    port equipment_observation : DataPort { in :>> type : EquipmentObservation; }
    // @trace MON-BATCH-01
    port batch_signal : DataPort { in :>> type : BatchSignal; }
    // @trace MON-IMAGE-01
    port image_feedback : DataPort { in :>> type : ImageFeedback; }
    // @trace MON-REC-01
    port recovery_event : DataPort { in :>> type : RecoveryEvent; }
    // @trace CTRL-CONTROL-01
    port control_frame : DataPort { out :>> type : ControlFrame; }
    // @trace CTRL-STATUS-01
    port status_frame : DataPort { out :>> type : StatusFrame; }

    // @generated-support Sole behavior-free Process usage.
    part acquisition_process : EITAcquisitionProcess;
    // @generated-support Transparent Doctor root delegation.
    connection support09 : PortConnection connect doctor_signal to acquisition_process.doctor_signal;
    // @generated-support Transparent preparation root delegation.
    connection support10 : PortConnection connect preparation_observation to acquisition_process.preparation_observation;
    // @generated-support Transparent equipment root delegation.
    connection support11 : PortConnection connect equipment_observation to acquisition_process.equipment_observation;
    // @generated-support Transparent batch root delegation.
    connection support12 : PortConnection connect batch_signal to acquisition_process.batch_signal;
    // @generated-support Transparent image-feedback root delegation.
    connection support13 : PortConnection connect image_feedback to acquisition_process.image_feedback;
    // @generated-support Transparent recovery-event root delegation.
    connection support14 : PortConnection connect recovery_event to acquisition_process.recovery_event;
    // @generated-support Transparent control-frame root delegation.
    connection support15 : PortConnection connect acquisition_process.control_frame to control_frame;
    // @generated-support Transparent status-frame root delegation.
    connection support16 : PortConnection connect acquisition_process.status_frame to status_frame;
  }

  // @trace CONSTR-ROOT-01
  part eit_acquisition_supervisor : EITAcquisitionSupervisorSystem;
}
