package EIT_Acquisition_Session_Coordinator {
  private import HAMR::*;

  enum def DoctorRequest {
    enum NO_DOCTOR_REQUEST;
    enum START_MONITORING;
    enum STOP_MONITORING;
  }

  enum def TechnicianRequest {
    enum NO_TECHNICIAN_REQUEST;
    enum CONFIRM_BELT;
    enum RECORD_CALIBRATION;
    enum RESET_PREPARATION;
  }

  enum def BeltObservation {
    enum BELT_OBSERVATION_INVALID;
    enum BELT_NOT_APPLIED;
    enum BELT_APPLIED;
  }

  enum def CalibrationObservation {
    enum CALIBRATION_OBSERVATION_INVALID;
    enum CALIBRATION_NOT_AVAILABLE;
    enum CALIBRATION_FAILED;
    enum CALIBRATION_PASSED;
  }

  enum def AcquisitionObservation {
    enum ACQUISITION_AVAILABLE;
    enum ACQUISITION_FAULT;
  }

  enum def ImpedanceFrameObservation {
    enum NO_FRAME;
    enum INVALID_FRAME;
    enum FRAME_A;
    enum FRAME_B;
  }

  enum def AcquisitionCommand {
    enum DO_NOT_COLLECT;
    enum COLLECT;
  }

  enum def FrameDelivery {
    enum NO_DELIVERY;
    enum DELIVER_FRAME_A;
    enum DELIVER_FRAME_B;
  }

  enum def BeltQualification {
    enum BELT_UNAVAILABLE;
    enum BELT_ABSENT;
    enum BELT_PRESENT;
  }

  part def BeltAssessment :> Data {
    attribute beltCategory : BeltQualification;
    attribute qualified : Boolean;
  }

  enum def CalibrationQualification {
    enum CALIBRATION_BLOCKED;
    enum NOT_CALIBRATED;
    enum CALIBRATED;
  }

  enum def PreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }

  enum def MonitoringState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }

  enum def EligibilityCondition {
    enum BELT_UNAVAILABLE_CONDITION;
    enum BELT_ABSENT_CONDITION;
    enum CALIBRATION_NOT_READY_CONDITION;
    enum ACQUISITION_FAULT_CONDITION;
    enum ACQUISITION_READY;
  }

  enum def RecoveryProposal {
    enum NO_RECOVERY;
    enum RESET_PREPARATION_RECOVERY;
    enum HOLD_MONITORING_RECOVERY;
  }

  enum def EffectiveIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }

  enum def RequestDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }

  enum def SessionNotice {
    enum NONE;
    enum BELT_OBSERVATION_UNAVAILABLE;
    enum BELT_NOT_CONFIRMED;
    enum CALIBRATION_NOT_READY;
    enum ACQUISITION_UNAVAILABLE;
    enum MONITORING_HELD_NOTICE;
    enum INAPPLICABLE_REQUEST;
    enum WAITING_FOR_FRAME;
    enum FRAME_REJECTED;
  }

  enum def EligibilityEnvelopeCondition {
    enum BELT_UNAVAILABLE_CONDITION;
    enum BELT_ABSENT_CONDITION;
    enum CALIBRATION_NOT_READY_CONDITION;
    enum ACQUISITION_FAULT_CONDITION;
    enum ACQUISITION_READY;
  }
  enum def EligibilityEnvelopeRecovery {
    enum NO_RECOVERY;
    enum RESET_PREPARATION_RECOVERY;
    enum HOLD_MONITORING_RECOVERY;
  }
  enum def EligibilityEnvelopePreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  enum def EligibilityEnvelopeMonitoringState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  part def EligibilityEnvelope :> Data {
    attribute condition : EligibilityEnvelopeCondition;
    attribute recovery : EligibilityEnvelopeRecovery;
    attribute beltQualified : Boolean;
    attribute calibrationQualified : Boolean;
    attribute preparationState : EligibilityEnvelopePreparationState;
    attribute monitoringState : EligibilityEnvelopeMonitoringState;
  }

  enum def ArbitrationDecisionEffectiveIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }
  enum def ArbitrationDecisionDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  part def ArbitrationDecision :> Data {
    attribute effectiveIntent : ArbitrationDecisionEffectiveIntent;
    attribute disposition : ArbitrationDecisionDisposition;
  }

  enum def PreparationDecisionPreState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  enum def PreparationDecisionNextState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  enum def PreparationDecisionIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }
  enum def PreparationDecisionDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  part def PreparationDecisionSnapshot :> Data {
    attribute preState : PreparationDecisionPreState;
    attribute nextState : PreparationDecisionNextState;
    attribute effectiveIntent : PreparationDecisionIntent;
    attribute disposition : PreparationDecisionDisposition;
  }

  enum def MonitoringDecisionPreState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  enum def MonitoringDecisionNextState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  enum def MonitoringDecisionIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }
  enum def MonitoringDecisionDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  enum def MonitoringDecisionNotice {
    enum NONE;
    enum BELT_OBSERVATION_UNAVAILABLE;
    enum BELT_NOT_CONFIRMED;
    enum CALIBRATION_NOT_READY;
    enum ACQUISITION_UNAVAILABLE;
    enum MONITORING_HELD_NOTICE;
    enum INAPPLICABLE_REQUEST;
    enum WAITING_FOR_FRAME;
    enum FRAME_REJECTED;
  }
  enum def MonitoringDecisionPreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  part def MonitoringDecisionSnapshot :> Data {
    attribute preState : MonitoringDecisionPreState;
    attribute nextState : MonitoringDecisionNextState;
    attribute effectiveIntent : MonitoringDecisionIntent;
    attribute disposition : MonitoringDecisionDisposition;
    attribute notice : MonitoringDecisionNotice;
    attribute preparationState : MonitoringDecisionPreparationState;
  }

  enum def SessionStatusPreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  enum def SessionStatusMonitoringState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  enum def SessionStatusDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  enum def SessionStatusNotice {
    enum NONE;
    enum BELT_OBSERVATION_UNAVAILABLE;
    enum BELT_NOT_CONFIRMED;
    enum CALIBRATION_NOT_READY;
    enum ACQUISITION_UNAVAILABLE;
    enum MONITORING_HELD_NOTICE;
    enum INAPPLICABLE_REQUEST;
    enum WAITING_FOR_FRAME;
    enum FRAME_REJECTED;
  }
  part def SessionStatus :> Data {
    attribute preparationState : SessionStatusPreparationState;
    attribute monitoringState : SessionStatusMonitoringState;
    attribute disposition : SessionStatusDisposition;
    attribute notice : SessionStatusNotice;
  }

  part def BeltQualificationOwner :> Thread {
    port beltObservation : DataPort { in :>> type : BeltObservation; }
    port beltAssessment : DataPort { out :>> type : BeltAssessment; }

    language "GUMBO" /*{
  initialize
    guarantee INIT_BELT_ASSESSMENT "beltAssessment conditional on beltObservation":
      (beltObservation == BeltObservation.BELT_OBSERVATION_INVALID) implies (beltAssessment.beltCategory == BeltQualification.BELT_UNAVAILABLE & beltAssessment.qualified == F) &
      (beltObservation == BeltObservation.BELT_NOT_APPLIED) implies (beltAssessment.beltCategory == BeltQualification.BELT_ABSENT & beltAssessment.qualified == F) &
      (beltObservation == BeltObservation.BELT_APPLIED) implies (beltAssessment.beltCategory == BeltQualification.BELT_PRESENT & beltAssessment.qualified == T);

  compute
    compute_cases
      case CASE_01_INVALID_BELT "if beltObservation is BELT OBSERVATION INVALID":
        assume beltObservation == BeltObservation.BELT_OBSERVATION_INVALID;
        guarantee beltAssessment.beltCategory == BeltQualification.BELT_UNAVAILABLE & beltAssessment.qualified == F;
      case CASE_02_BELT_ABSENT "if beltObservation is BELT NOT APPLIED":
        assume beltObservation == BeltObservation.BELT_NOT_APPLIED;
        guarantee beltAssessment.beltCategory == BeltQualification.BELT_ABSENT & beltAssessment.qualified == F;
      case CASE_03_BELT_PRESENT "if beltObservation is BELT APPLIED":
        assume beltObservation == BeltObservation.BELT_APPLIED;
        guarantee beltAssessment.beltCategory == BeltQualification.BELT_PRESENT & beltAssessment.qualified == T;
}*/

                        
                
                 
                           
                                                                                                                
                                                                                  
                                                                                                                    
                                                                          
                                                                                                               
                                                                      
                                                                                                               
             
                     
                           
                                                                                         
                                                                               
                                                                                         
                                            
                           
                                                                                         
                                                                       
                                                                                    
                                            
                           
                                                                                      
                                                                   
                                                                                     
                                            
       
  }

  part def CalibrationQualificationOwner :> Thread {
    port calibrationObservation : DataPort { in :>> type : CalibrationObservation; }
    port beltAssessment : DataPort { in :>> type : BeltAssessment; }
    port calibrationQualification : DataPort { out :>> type : CalibrationQualification; }

    language "GUMBO" /*{
  initialize
    guarantee INIT_CALIBRATION_QUALIFICATION "calibrationQualification derived from beltAssessment and calibrationObservation":
      (beltAssessment.qualified == F) implies (calibrationQualification == CalibrationQualification.CALIBRATION_BLOCKED) &
      (beltAssessment.qualified == T & calibrationObservation != CalibrationObservation.CALIBRATION_PASSED) implies (calibrationQualification == CalibrationQualification.NOT_CALIBRATED) &
      (beltAssessment.qualified == T & calibrationObservation == CalibrationObservation.CALIBRATION_PASSED) implies (calibrationQualification == CalibrationQualification.CALIBRATED);

  compute
    compute_cases
      case CASE_04_BELT_BLOCKS_CALIBRATION "if beltAssessment qualified is F":
        assume beltAssessment.qualified == F;
        guarantee calibrationQualification == CalibrationQualification.CALIBRATION_BLOCKED;
      case CASE_05_CALIBRATION_NOT_READY "if beltAssessment qualified is T and calibrationObservation is not CALIBRATION PASSED":
        assume beltAssessment.qualified == T & calibrationObservation != CalibrationObservation.CALIBRATION_PASSED;
        guarantee calibrationQualification == CalibrationQualification.NOT_CALIBRATED;
      case CASE_06_CALIBRATION_READY "if beltAssessment qualified is T and calibrationObservation is CALIBRATION PASSED":
        assume beltAssessment.qualified == T & calibrationObservation == CalibrationObservation.CALIBRATION_PASSED;
        guarantee calibrationQualification == CalibrationQualification.CALIBRATED;
}*/
  }

  part def AcquisitionEligibilityOwner :> Thread {
    port acquisitionObservation : DataPort { in :>> type : AcquisitionObservation; }
    port beltAssessment : DataPort { in :>> type : BeltAssessment; }
    port calibrationQualification : DataPort { in :>> type : CalibrationQualification; }
    port preparationState : DataPort { in :>> type : PreparationState; }
    port monitoringState : DataPort { in :>> type : MonitoringState; }
    port eligibilityEnvelope : DataPort { out :>> type : EligibilityEnvelope; }

    language "GUMBO" /*{
  initialize
    guarantee INIT_ELIGIBILITY_ENVELOPE "eligibilityEnvelope derived from beltAssessment, calibrationQualification, preparationState, and acquisitionObservation":
      (beltAssessment.beltCategory == BeltQualification.BELT_UNAVAILABLE & beltAssessment.qualified == F) implies (eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_UNAVAILABLE_CONDITION & eligibilityEnvelope.beltQualified == F & eligibilityEnvelope.calibrationQualified == F) &
      (beltAssessment.beltCategory == BeltQualification.BELT_ABSENT & beltAssessment.qualified == F) implies (eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_ABSENT_CONDITION & eligibilityEnvelope.beltQualified == F & eligibilityEnvelope.calibrationQualified == F) &
      (beltAssessment.qualified == T & (preparationState != PreparationState.PREPARATION_CALIBRATED | calibrationQualification != CalibrationQualification.CALIBRATED)) implies (eligibilityEnvelope.condition == EligibilityEnvelopeCondition.CALIBRATION_NOT_READY_CONDITION & eligibilityEnvelope.beltQualified == T) &
      (beltAssessment.qualified == T & calibrationQualification == CalibrationQualification.CALIBRATED & preparationState == PreparationState.PREPARATION_CALIBRATED & acquisitionObservation == AcquisitionObservation.ACQUISITION_FAULT) implies (eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_FAULT_CONDITION & eligibilityEnvelope.beltQualified == T & eligibilityEnvelope.calibrationQualified == T) &
      (beltAssessment.qualified == T & calibrationQualification == CalibrationQualification.CALIBRATED & preparationState == PreparationState.PREPARATION_CALIBRATED & acquisitionObservation == AcquisitionObservation.ACQUISITION_AVAILABLE) implies (eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY & eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY & eligibilityEnvelope.beltQualified == T & eligibilityEnvelope.calibrationQualified == T);

  compute
    guarantee PROJECT_ELIGIBILITY_STATES "project preparationState and monitoringState into eligibilityEnvelope":
      (preparationState == PreparationState.UNPREPARED) implies (eligibilityEnvelope.preparationState == EligibilityEnvelopePreparationState.UNPREPARED) &
      (preparationState == PreparationState.BELT_CONFIRMED) implies (eligibilityEnvelope.preparationState == EligibilityEnvelopePreparationState.BELT_CONFIRMED) &
      (preparationState == PreparationState.PREPARATION_CALIBRATED) implies (eligibilityEnvelope.preparationState == EligibilityEnvelopePreparationState.PREPARATION_CALIBRATED) &
      (monitoringState == MonitoringState.MONITORING_INACTIVE) implies (eligibilityEnvelope.monitoringState == EligibilityEnvelopeMonitoringState.MONITORING_INACTIVE) &
      (monitoringState == MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.monitoringState == EligibilityEnvelopeMonitoringState.MONITORING_ACTIVE) &
      (monitoringState == MonitoringState.MONITORING_HELD) implies (eligibilityEnvelope.monitoringState == EligibilityEnvelopeMonitoringState.MONITORING_HELD);

    guarantee PROJECT_CALIBRATION_BOOLEAN "project calibrationQualification into eligibilityEnvelope.calibrationQualified":
      (calibrationQualification == CalibrationQualification.CALIBRATED) implies (eligibilityEnvelope.calibrationQualified == T) &
      (calibrationQualification != CalibrationQualification.CALIBRATED) implies (eligibilityEnvelope.calibrationQualified == F);

    compute_cases
      case CASE_08_BELT_UNAVAILABLE "if beltCategory is BELT UNAVAILABLE and qualified is F":
        assume beltAssessment.beltCategory == BeltQualification.BELT_UNAVAILABLE & beltAssessment.qualified == F;
        guarantee eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_UNAVAILABLE_CONDITION &
          eligibilityEnvelope.beltQualified == F &
          eligibilityEnvelope.calibrationQualified == F &
          ((preparationState != PreparationState.UNPREPARED) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY)) &
          (preparationState == PreparationState.UNPREPARED & monitoringState == MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY) &
          (preparationState == PreparationState.UNPREPARED & monitoringState != MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY);
      case CASE_09_BELT_ABSENT "if beltCategory is BELT ABSENT and qualified is F":
        assume beltAssessment.beltCategory == BeltQualification.BELT_ABSENT & beltAssessment.qualified == F;
        guarantee eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_ABSENT_CONDITION &
          eligibilityEnvelope.beltQualified == F &
          eligibilityEnvelope.calibrationQualified == F &
          ((preparationState != PreparationState.UNPREPARED) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY)) &
          (preparationState == PreparationState.UNPREPARED & monitoringState == MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY) &
          (preparationState == PreparationState.UNPREPARED & monitoringState != MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY);
      case CASE_10_CALIBRATION_NOT_READY "if beltAssessment qualified is T and preparation or calibration not ready":
        assume beltAssessment.qualified == T & (preparationState != PreparationState.PREPARATION_CALIBRATED | calibrationQualification != CalibrationQualification.CALIBRATED);
        guarantee eligibilityEnvelope.condition == EligibilityEnvelopeCondition.CALIBRATION_NOT_READY_CONDITION &
          eligibilityEnvelope.beltQualified == T &
          ((preparationState == PreparationState.PREPARATION_CALIBRATED & calibrationQualification != CalibrationQualification.CALIBRATED) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY)) &
          ((preparationState != PreparationState.PREPARATION_CALIBRATED | calibrationQualification == CalibrationQualification.CALIBRATED) & monitoringState == MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY) &
          ((preparationState != PreparationState.PREPARATION_CALIBRATED | calibrationQualification == CalibrationQualification.CALIBRATED) & monitoringState != MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY);
      case CASE_11_ACQUISITION_FAULT "if qualified is T, calibrated, preparation calibrated, and acquisition fault":
        assume beltAssessment.qualified == T & calibrationQualification == CalibrationQualification.CALIBRATED & preparationState == PreparationState.PREPARATION_CALIBRATED & acquisitionObservation == AcquisitionObservation.ACQUISITION_FAULT;
        guarantee eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_FAULT_CONDITION &
          eligibilityEnvelope.beltQualified == T &
          eligibilityEnvelope.calibrationQualified == T &
          ((monitoringState == MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY)) &
          ((monitoringState != MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY));
      case CASE_12_ACQUISITION_READY "if qualified is T, calibrated, preparation calibrated, and acquisition available":
        assume beltAssessment.qualified == T & calibrationQualification == CalibrationQualification.CALIBRATED & preparationState == PreparationState.PREPARATION_CALIBRATED & acquisitionObservation == AcquisitionObservation.ACQUISITION_AVAILABLE;
        guarantee eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY &
          eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY &
          eligibilityEnvelope.beltQualified == T &
          eligibilityEnvelope.calibrationQualified == T;
}*/
  }

  part def RequestArbiter :> Thread {
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    port technicianRequest : DataPort { in :>> type : TechnicianRequest; }
    port eligibilityEnvelope : DataPort { in :>> type : EligibilityEnvelope; }
    port arbitrationDecision : DataPort { out :>> type : ArbitrationDecision; }

    language "GUMBO" /*{
  initialize
    guarantee INIT_ARBITRATION "arbitrationDecision effectiveIntent derived from doctorRequest and eligibilityEnvelope recovery":
      (doctorRequest == DoctorRequest.STOP_MONITORING) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT) &
      (doctorRequest != DoctorRequest.STOP_MONITORING & eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT) &
      (doctorRequest != DoctorRequest.STOP_MONITORING & eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT);

  compute
    compute_cases
      case CASE_13_STOP_PRIORITY "if doctorRequest is STOP MONITORING":
        assume doctorRequest == DoctorRequest.STOP_MONITORING;
        guarantee arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT &
          ((eligibilityEnvelope.recovery != EligibilityEnvelopeRecovery.NO_RECOVERY | technicianRequest != TechnicianRequest.NO_TECHNICIAN_REQUEST) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED)) &
          ((eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY & technicianRequest == TechnicianRequest.NO_TECHNICIAN_REQUEST) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED));
      case CASE_14_RECOVERY_PRIORITY "if doctorRequest is not STOP and recovery is not NO_RECOVERY":
        assume doctorRequest != DoctorRequest.STOP_MONITORING & eligibilityEnvelope.recovery != EligibilityEnvelopeRecovery.NO_RECOVERY;
        guarantee ((eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT)) &
          ((eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT)) &
          ((doctorRequest == DoctorRequest.START_MONITORING | technicianRequest != TechnicianRequest.NO_TECHNICIAN_REQUEST) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED)) &
          ((doctorRequest != DoctorRequest.START_MONITORING & technicianRequest == TechnicianRequest.NO_TECHNICIAN_REQUEST) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.RECOVERY_APPLIED));
      case CASE_15_TECHNICIAN_PRIORITY_AND_APPLICABILITY "if doctorRequest is not STOP, recovery is NO_RECOVERY, and technicianRequest is not NO_TECHNICIAN_REQUEST":
        assume doctorRequest != DoctorRequest.STOP_MONITORING & eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY & technicianRequest != TechnicianRequest.NO_TECHNICIAN_REQUEST;
        guarantee ((technicianRequest == TechnicianRequest.RESET_PREPARATION) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT & ((doctorRequest == DoctorRequest.START_MONITORING) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED)) & ((doctorRequest != DoctorRequest.START_MONITORING) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED)))) &
          ((technicianRequest == TechnicianRequest.CONFIRM_BELT & eligibilityEnvelope.beltQualified == T & eligibilityEnvelope.preparationState != EligibilityEnvelopePreparationState.PREPARATION_CALIBRATED) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT & ((doctorRequest == DoctorRequest.START_MONITORING) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED)) & ((doctorRequest != DoctorRequest.START_MONITORING) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED)))) &
          ((technicianRequest == TechnicianRequest.RECORD_CALIBRATION & eligibilityEnvelope.beltQualified == T & eligibilityEnvelope.calibrationQualified == T & eligibilityEnvelope.preparationState != EligibilityEnvelopePreparationState.UNPREPARED) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT & ((doctorRequest == DoctorRequest.START_MONITORING) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED)) & ((doctorRequest != DoctorRequest.START_MONITORING) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED)))) &
          (((technicianRequest == TechnicianRequest.CONFIRM_BELT & (eligibilityEnvelope.beltQualified == F | eligibilityEnvelope.preparationState == EligibilityEnvelopePreparationState.PREPARATION_CALIBRATED)) | (technicianRequest == TechnicianRequest.RECORD_CALIBRATION & (eligibilityEnvelope.beltQualified == F | eligibilityEnvelope.calibrationQualified == F | eligibilityEnvelope.preparationState == EligibilityEnvelopePreparationState.UNPREPARED))) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT & arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED));
      case CASE_16_START_OR_NO_REQUEST "if doctorRequest is not STOP, recovery is NO_RECOVERY, and technicianRequest is NO_TECHNICIAN_REQUEST":
        assume doctorRequest != DoctorRequest.STOP_MONITORING & eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY & technicianRequest == TechnicianRequest.NO_TECHNICIAN_REQUEST;
        guarantee ((doctorRequest == DoctorRequest.START_MONITORING & eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT & arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED)) &
          ((doctorRequest == DoctorRequest.START_MONITORING & eligibilityEnvelope.condition != EligibilityEnvelopeCondition.ACQUISITION_READY) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT & arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED)) &
          ((doctorRequest == DoctorRequest.NO_DOCTOR_REQUEST) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT & arbitrationDecision.disposition == ArbitrationDecisionDisposition.NO_REQUEST_DISPOSITION));
}*/
  }

  part def PreparationStateGovernor :> Thread {
    port arbitrationDecision : DataPort { in :>> type : ArbitrationDecision; }
    port preparationState : DataPort { out :>> type : PreparationState; }
    port preparationDecision : DataPort { out :>> type : PreparationDecisionSnapshot; }

    language "GUMBO" /*{
  state
    committedPreparationState: PreparationState;

  initialize
    modifies committedPreparationState;
    guarantee INIT_PREPARATION_STATE "committedPreparationState, preparationState, and preparationDecision initialized":
      committedPreparationState == PreparationState.UNPREPARED &
      preparationState == PreparationState.UNPREPARED &
      preparationDecision.preState == PreparationDecisionPreState.UNPREPARED &
      preparationDecision.nextState == PreparationDecisionNextState.UNPREPARED &
      preparationDecision.effectiveIntent == PreparationDecisionIntent.NO_INTENT &
      preparationDecision.disposition == PreparationDecisionDisposition.NO_REQUEST_DISPOSITION;

  compute
    modifies committedPreparationState;
    guarantee PUBLISH_PREPARATION_PRE_STATE "preparationState set to committedPreparationState on entry":
      preparationState == committedPreparationState;

    guarantee PROJECT_PREPARATION_SNAPSHOT "preparationDecision snapshot projected from committedPreparationState and arbitrationDecision":
      (In(committedPreparationState) == PreparationState.UNPREPARED) implies (preparationDecision.preState == PreparationDecisionPreState.UNPREPARED) &
      (In(committedPreparationState) == PreparationState.BELT_CONFIRMED) implies (preparationDecision.preState == PreparationDecisionPreState.BELT_CONFIRMED) &
      (In(committedPreparationState) == PreparationState.PREPARATION_CALIBRATED) implies (preparationDecision.preState == PreparationDecisionPreState.PREPARATION_CALIBRATED) &
      (committedPreparationState == PreparationState.UNPREPARED) implies (preparationDecision.nextState == PreparationDecisionNextState.UNPREPARED) &
      (committedPreparationState == PreparationState.BELT_CONFIRMED) implies (preparationDecision.nextState == PreparationDecisionNextState.BELT_CONFIRMED) &
      (committedPreparationState == PreparationState.PREPARATION_CALIBRATED) implies (preparationDecision.nextState == PreparationDecisionNextState.PREPARATION_CALIBRATED) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT) implies (preparationDecision.effectiveIntent == PreparationDecisionIntent.NO_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT) implies (preparationDecision.effectiveIntent == PreparationDecisionIntent.STOP_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT) implies (preparationDecision.effectiveIntent == PreparationDecisionIntent.RESET_PREPARATION_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT) implies (preparationDecision.effectiveIntent == PreparationDecisionIntent.HOLD_MONITORING_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT) implies (preparationDecision.effectiveIntent == PreparationDecisionIntent.CONFIRM_BELT_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT) implies (preparationDecision.effectiveIntent == PreparationDecisionIntent.RECORD_CALIBRATION_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT) implies (preparationDecision.effectiveIntent == PreparationDecisionIntent.START_MONITORING_INTENT) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.NO_REQUEST_DISPOSITION) implies (preparationDecision.disposition == PreparationDecisionDisposition.NO_REQUEST_DISPOSITION) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED) implies (preparationDecision.disposition == PreparationDecisionDisposition.ACCEPTED) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) implies (preparationDecision.disposition == PreparationDecisionDisposition.REJECTED) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.RECOVERY_APPLIED) implies (preparationDecision.disposition == PreparationDecisionDisposition.RECOVERY_APPLIED) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED) implies (preparationDecision.disposition == PreparationDecisionDisposition.PREEMPTED);

    compute_cases
      case CASE_07_RESET_OR_RETAIN_PREPARATION "if effectiveIntent is RESET, STOP, HOLD, START, or NO INTENT":
        assume arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT & arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT;
        guarantee ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT) implies (committedPreparationState == PreparationState.UNPREPARED)) &
          ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT) implies (committedPreparationState == In(committedPreparationState)));
      case CASE_17_ADVANCE_PREPARATION "if effectiveIntent is CONFIRM BELT or RECORD CALIBRATION":
        assume arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT | arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT;
        guarantee ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT) implies (committedPreparationState == PreparationState.BELT_CONFIRMED)) &
          ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT) implies (committedPreparationState == PreparationState.PREPARATION_CALIBRATED));
}*/
  }

  part def MonitoringStateGovernor :> Thread {
    port preparationDecision : DataPort { in :>> type : PreparationDecisionSnapshot; }
    port arbitrationDecision : DataPort { in :>> type : ArbitrationDecision; }
    port eligibilityEnvelope : DataPort { in :>> type : EligibilityEnvelope; }
    port monitoringState : DataPort { out :>> type : MonitoringState; }
    port monitoringDecision : DataPort { out :>> type : MonitoringDecisionSnapshot; }

    language "GUMBO" /*{
  state
    committedMonitoringState: MonitoringState;

  initialize
    modifies committedMonitoringState;
    guarantee INIT_MONITORING_STATE "committedMonitoringState, monitoringState, and monitoringDecision initialized":
      committedMonitoringState == MonitoringState.MONITORING_INACTIVE &
      monitoringState == MonitoringState.MONITORING_INACTIVE &
      monitoringDecision.preState == MonitoringDecisionPreState.MONITORING_INACTIVE &
      monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_INACTIVE &
      monitoringDecision.effectiveIntent == MonitoringDecisionIntent.NO_INTENT &
      monitoringDecision.disposition == MonitoringDecisionDisposition.NO_REQUEST_DISPOSITION &
      monitoringDecision.notice == MonitoringDecisionNotice.NONE &
      monitoringDecision.preparationState == MonitoringDecisionPreparationState.UNPREPARED;

  compute
    modifies committedMonitoringState;
    guarantee PUBLISH_MONITORING_PRE_STATE "monitoringState set to committedMonitoringState on entry":
      monitoringState == In(committedMonitoringState);

    guarantee PROJECT_MONITORING_STATES "monitoringDecision preState, nextState, and preparationState projected":
      (In(committedMonitoringState) == MonitoringState.MONITORING_INACTIVE) implies (monitoringDecision.preState == MonitoringDecisionPreState.MONITORING_INACTIVE) &
      (In(committedMonitoringState) == MonitoringState.MONITORING_ACTIVE) implies (monitoringDecision.preState == MonitoringDecisionPreState.MONITORING_ACTIVE) &
      (In(committedMonitoringState) == MonitoringState.MONITORING_HELD) implies (monitoringDecision.preState == MonitoringDecisionPreState.MONITORING_HELD) &
      (committedMonitoringState == MonitoringState.MONITORING_INACTIVE) implies (monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_INACTIVE) &
      (committedMonitoringState == MonitoringState.MONITORING_ACTIVE) implies (monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE) &
      (committedMonitoringState == MonitoringState.MONITORING_HELD) implies (monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_HELD) &
      (preparationDecision.nextState == PreparationDecisionNextState.UNPREPARED) implies (monitoringDecision.preparationState == MonitoringDecisionPreparationState.UNPREPARED) &
      (preparationDecision.nextState == PreparationDecisionNextState.BELT_CONFIRMED) implies (monitoringDecision.preparationState == MonitoringDecisionPreparationState.BELT_CONFIRMED) &
      (preparationDecision.nextState == PreparationDecisionNextState.PREPARATION_CALIBRATED) implies (monitoringDecision.preparationState == MonitoringDecisionPreparationState.PREPARATION_CALIBRATED);

    guarantee PROJECT_MONITORING_DECISION "monitoringDecision effectiveIntent and disposition projected from arbitrationDecision":
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT) implies (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.NO_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT) implies (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.STOP_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT) implies (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.RESET_PREPARATION_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT) implies (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.HOLD_MONITORING_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT) implies (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.CONFIRM_BELT_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT) implies (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.RECORD_CALIBRATION_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT) implies (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.START_MONITORING_INTENT) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.NO_REQUEST_DISPOSITION) implies (monitoringDecision.disposition == MonitoringDecisionDisposition.NO_REQUEST_DISPOSITION) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED) implies (monitoringDecision.disposition == MonitoringDecisionDisposition.ACCEPTED) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) implies (monitoringDecision.disposition == MonitoringDecisionDisposition.REJECTED) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.RECOVERY_APPLIED) implies (monitoringDecision.disposition == MonitoringDecisionDisposition.RECOVERY_APPLIED) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED) implies (monitoringDecision.disposition == MonitoringDecisionDisposition.PREEMPTED);

    compute_cases
      case CASE_18_MONITORING_TRANSITION_AND_NOTICE "committedMonitoringState transition and monitoringDecision notice":
        guarantee (
          ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT) implies (committedMonitoringState == MonitoringState.MONITORING_INACTIVE)) &
          ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.STOP_INTENT & In(committedMonitoringState) == MonitoringState.MONITORING_ACTIVE & (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT | arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT)) implies (committedMonitoringState == MonitoringState.MONITORING_HELD)) &
          ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.STOP_INTENT & arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT & eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY) implies (committedMonitoringState == MonitoringState.MONITORING_ACTIVE)) &
          ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.STOP_INTENT & not(In(committedMonitoringState) == MonitoringState.MONITORING_ACTIVE & (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT | arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT)) & not(arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT & eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY)) implies (committedMonitoringState == In(committedMonitoringState))) &
          (((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT | arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT | arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) & eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_UNAVAILABLE_CONDITION) implies (monitoringDecision.notice == MonitoringDecisionNotice.BELT_OBSERVATION_UNAVAILABLE)) &
          (((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT | arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT | arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) & eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_ABSENT_CONDITION) implies (monitoringDecision.notice == MonitoringDecisionNotice.BELT_NOT_CONFIRMED)) &
          (((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT | arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT | arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) & eligibilityEnvelope.condition == EligibilityEnvelopeCondition.CALIBRATION_NOT_READY_CONDITION) implies (monitoringDecision.notice == MonitoringDecisionNotice.CALIBRATION_NOT_READY)) &
          (((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT | arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT | arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) & eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_FAULT_CONDITION) implies (monitoringDecision.notice == MonitoringDecisionNotice.ACQUISITION_UNAVAILABLE)) &
          ((arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED & eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY) implies (monitoringDecision.notice == MonitoringDecisionNotice.INAPPLICABLE_REQUEST)) &
          ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT & arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT & arbitrationDecision.disposition != ArbitrationDecisionDisposition.REJECTED & committedMonitoringState == MonitoringState.MONITORING_HELD) implies (monitoringDecision.notice == MonitoringDecisionNotice.MONITORING_HELD_NOTICE)) &
          ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT & arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT & arbitrationDecision.disposition != ArbitrationDecisionDisposition.REJECTED & committedMonitoringState != MonitoringState.MONITORING_HELD) implies (monitoringDecision.notice == MonitoringDecisionNotice.NONE));
        );
}*/


  part def AcquisitionCommandPolicy :> Thread {
    port monitoringDecision : DataPort { in :>> type : MonitoringDecisionSnapshot; }
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }

                        
                
                 
                           
                                                                                         
                                                                    
             
                     
                           
                                                                                                                                       
                     
                                                                                                      
                                                                     
                                                                                                      
                                                                           
       
  }

  part def SessionPublicationPolicy :> Thread {
    port impedanceFrame : DataPort { in :>> type : ImpedanceFrameObservation; }
    port monitoringDecision : DataPort { in :>> type : MonitoringDecisionSnapshot; }
    port frameDelivery : DataPort { out :>> type : FrameDelivery; }
    port sessionStatus : DataPort { out :>> type : SessionStatus; }

                        
                
                 
                           
                                                                                                            
                                                        
                                                                                        
                                                                                               
                                                                                          
                                                             
             
                 
                           
                                                                                                                            
                                                                                                           
                                                                                             
                                                                                                               
                                                                                                 
                                                                                                                       
                                                                                                         
                                                                                                      
                                                                                                    
                                                                                                    
                                                                                                  
                                                                                                  
                                                                                                
                                                                                                             
                                                                                               
                                                                                               
                                                                                 
                                                                                               
                                                                                 
                                                                                                       
                                                                                         
                                                                                                
                                                                                 
                     
                           
                                                                                                                                                   
                     
                                                                                               
                                                                            
                                                                   
                                                                                               
                                                                            
                                                                   
                                                                                               
                                                                      
                                                                                  
                                                               
                                                                                                           
                                                                                             
                                                                                                 
                                                                                   
                                                                                                    
                                                                                      
                                                                                                      
                                                                                        
                                                                                                     
                                                                                       
                                                                                                   
                                                                                     
                                                                            
                                                                                               
                                                                                  
                                                                               
                                                                            
                                                                                               
                                                                             
                                                                                  
                                                                            
                                                                                                
                                                                      
                                                                              
                                                                    
       
  }

  part def AcquisitionCoordinationProcess :> Process {
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    port technicianRequest : DataPort { in :>> type : TechnicianRequest; }
    port beltObservation : DataPort { in :>> type : BeltObservation; }
    port calibrationObservation : DataPort { in :>> type : CalibrationObservation; }
    port acquisitionObservation : DataPort { in :>> type : AcquisitionObservation; }
    port impedanceFrame : DataPort { in :>> type : ImpedanceFrameObservation; }
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }
    port frameDelivery : DataPort { out :>> type : FrameDelivery; }
    port sessionStatus : DataPort { out :>> type : SessionStatus; }

    part beltQualificationOwner : BeltQualificationOwner;
    part calibrationQualificationOwner : CalibrationQualificationOwner;
    part acquisitionEligibilityOwner : AcquisitionEligibilityOwner;
    part requestArbiter : RequestArbiter;
    part preparationStateGovernor : PreparationStateGovernor;
    part monitoringStateGovernor : MonitoringStateGovernor;
    part acquisitionCommandPolicy : AcquisitionCommandPolicy;
    part sessionPublicationPolicy : SessionPublicationPolicy;

    connection int01 : PortConnection connect doctorRequest to requestArbiter.doctorRequest;
    connection int02 : PortConnection connect technicianRequest to requestArbiter.technicianRequest;
    connection int03 : PortConnection connect beltObservation to beltQualificationOwner.beltObservation;
    connection int04 : PortConnection connect calibrationObservation to calibrationQualificationOwner.calibrationObservation;
    connection int05 : PortConnection connect acquisitionObservation to acquisitionEligibilityOwner.acquisitionObservation;
    connection int06 : PortConnection connect impedanceFrame to sessionPublicationPolicy.impedanceFrame;
    connection int07 : PortConnection connect beltQualificationOwner.beltAssessment to calibrationQualificationOwner.beltAssessment;
    connection int08 : PortConnection connect beltQualificationOwner.beltAssessment to acquisitionEligibilityOwner.beltAssessment;
    connection int09 : PortConnection connect calibrationQualificationOwner.calibrationQualification to acquisitionEligibilityOwner.calibrationQualification;
    connection int10 : PortConnection connect preparationStateGovernor.preparationState to acquisitionEligibilityOwner.preparationState;
    connection int11 : PortConnection connect monitoringStateGovernor.monitoringState to acquisitionEligibilityOwner.monitoringState;
    connection int12 : PortConnection connect acquisitionEligibilityOwner.eligibilityEnvelope to requestArbiter.eligibilityEnvelope;
    connection int13 : PortConnection connect requestArbiter.arbitrationDecision to preparationStateGovernor.arbitrationDecision;
    connection int14 : PortConnection connect preparationStateGovernor.preparationDecision to monitoringStateGovernor.preparationDecision;
    connection int15 : PortConnection connect requestArbiter.arbitrationDecision to monitoringStateGovernor.arbitrationDecision;
    connection int16 : PortConnection connect acquisitionEligibilityOwner.eligibilityEnvelope to monitoringStateGovernor.eligibilityEnvelope;
    connection int17 : PortConnection connect monitoringStateGovernor.monitoringDecision to acquisitionCommandPolicy.monitoringDecision;
    connection int18 : PortConnection connect monitoringStateGovernor.monitoringDecision to sessionPublicationPolicy.monitoringDecision;
    connection int19 : PortConnection connect acquisitionCommandPolicy.acquisitionCommand to acquisitionCommand;
    connection int20 : PortConnection connect sessionPublicationPolicy.frameDelivery to frameDelivery;
    connection int21 : PortConnection connect sessionPublicationPolicy.sessionStatus to sessionStatus;
  }

  part def EITAcquisitionSessionCoordinator :> System {
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    port technicianRequest : DataPort { in :>> type : TechnicianRequest; }
    port beltObservation : DataPort { in :>> type : BeltObservation; }
    port calibrationObservation : DataPort { in :>> type : CalibrationObservation; }
    port acquisitionObservation : DataPort { in :>> type : AcquisitionObservation; }
    port impedanceFrame : DataPort { in :>> type : ImpedanceFrameObservation; }
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }
    port frameDelivery : DataPort { out :>> type : FrameDelivery; }
    port sessionStatus : DataPort { out :>> type : SessionStatus; }

    part acquisitionCoordinationProcess : AcquisitionCoordinationProcess;

    connection supportDoctorRequest : PortConnection connect doctorRequest to acquisitionCoordinationProcess.doctorRequest;
    connection supportTechnicianRequest : PortConnection connect technicianRequest to acquisitionCoordinationProcess.technicianRequest;
    connection supportBeltObservation : PortConnection connect beltObservation to acquisitionCoordinationProcess.beltObservation;
    connection supportCalibrationObservation : PortConnection connect calibrationObservation to acquisitionCoordinationProcess.calibrationObservation;
    connection supportAcquisitionObservation : PortConnection connect acquisitionObservation to acquisitionCoordinationProcess.acquisitionObservation;
    connection supportImpedanceFrame : PortConnection connect impedanceFrame to acquisitionCoordinationProcess.impedanceFrame;
    connection supportAcquisitionCommand : PortConnection connect acquisitionCoordinationProcess.acquisitionCommand to acquisitionCommand;
    connection supportFrameDelivery : PortConnection connect acquisitionCoordinationProcess.frameDelivery to frameDelivery;
    connection supportSessionStatus : PortConnection connect acquisitionCoordinationProcess.sessionStatus to sessionStatus;
  }

  part eitAcquisitionSessionCoordinator : EITAcquisitionSessionCoordinator;
}}*/kage EIT_Acquisition_Session_Coordinator {
  private import HAMR::*;

  enum def DoctorRequest {
    enum NO_DOCTOR_REQUEST;
    enum START_MONITORING;
    enum STOP_MONITORING;
  }

  enum def TechnicianRequest {
    enum NO_TECHNICIAN_REQUEST;
    enum CONFIRM_BELT;
    enum RECORD_CALIBRATION;
    enum RESET_PREPARATION;
  }

  enum def BeltObservation {
    enum BELT_OBSERVATION_INVALID;
    enum BELT_NOT_APPLIED;
    enum BELT_APPLIED;
  }

  enum def CalibrationObservation {
    enum CALIBRATION_OBSERVATION_INVALID;
    enum CALIBRATION_NOT_AVAILABLE;
    enum CALIBRATION_FAILED;
    enum CALIBRATION_PASSED;
  }

  enum def AcquisitionObservation {
    enum ACQUISITION_AVAILABLE;
    enum ACQUISITION_FAULT;
  }

  enum def ImpedanceFrameObservation {
    enum NO_FRAME;
    enum INVALID_FRAME;
    enum FRAME_A;
    enum FRAME_B;
  }

  enum def AcquisitionCommand {
    enum DO_NOT_COLLECT;
    enum COLLECT;
  }

  enum def FrameDelivery {
    enum NO_DELIVERY;
    enum DELIVER_FRAME_A;
    enum DELIVER_FRAME_B;
  }

  enum def BeltQualification {
    enum BELT_UNAVAILABLE;
    enum BELT_ABSENT;
    enum BELT_PRESENT;
  }

  part def BeltAssessment :> Data {
    attribute beltCategory : BeltQualification;
    attribute qualified : Boolean;
  }

  enum def CalibrationQualification {
    enum CALIBRATION_BLOCKED;
    enum NOT_CALIBRATED;
    enum CALIBRATED;
  }

  enum def PreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }

  enum def MonitoringState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }

  enum def EligibilityCondition {
    enum BELT_UNAVAILABLE_CONDITION;
    enum BELT_ABSENT_CONDITION;
    enum CALIBRATION_NOT_READY_CONDITION;
    enum ACQUISITION_FAULT_CONDITION;
    enum ACQUISITION_READY;
  }

  enum def RecoveryProposal {
    enum NO_RECOVERY;
    enum RESET_PREPARATION_RECOVERY;
    enum HOLD_MONITORING_RECOVERY;
  }

  enum def EffectiveIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }

  enum def RequestDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }

  enum def SessionNotice {
    enum NONE;
    enum BELT_OBSERVATION_UNAVAILABLE;
    enum BELT_NOT_CONFIRMED;
    enum CALIBRATION_NOT_READY;
    enum ACQUISITION_UNAVAILABLE;
    enum MONITORING_HELD_NOTICE;
    enum INAPPLICABLE_REQUEST;
    enum WAITING_FOR_FRAME;
    enum FRAME_REJECTED;
  }

  enum def EligibilityEnvelopeCondition {
    enum BELT_UNAVAILABLE_CONDITION;
    enum BELT_ABSENT_CONDITION;
    enum CALIBRATION_NOT_READY_CONDITION;
    enum ACQUISITION_FAULT_CONDITION;
    enum ACQUISITION_READY;
  }
  enum def EligibilityEnvelopeRecovery {
    enum NO_RECOVERY;
    enum RESET_PREPARATION_RECOVERY;
    enum HOLD_MONITORING_RECOVERY;
  }
  enum def EligibilityEnvelopePreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  enum def EligibilityEnvelopeMonitoringState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  part def EligibilityEnvelope :> Data {
    attribute condition : EligibilityEnvelopeCondition;
    attribute recovery : EligibilityEnvelopeRecovery;
    attribute beltQualified : Boolean;
    attribute calibrationQualified : Boolean;
    attribute preparationState : EligibilityEnvelopePreparationState;
    attribute monitoringState : EligibilityEnvelopeMonitoringState;
  }

  enum def ArbitrationDecisionEffectiveIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }
  enum def ArbitrationDecisionDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  part def ArbitrationDecision :> Data {
    attribute effectiveIntent : ArbitrationDecisionEffectiveIntent;
    attribute disposition : ArbitrationDecisionDisposition;
  }

  enum def PreparationDecisionPreState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  enum def PreparationDecisionNextState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  enum def PreparationDecisionIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }
  enum def PreparationDecisionDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  part def PreparationDecisionSnapshot :> Data {
    attribute preState : PreparationDecisionPreState;
    attribute nextState : PreparationDecisionNextState;
    attribute effectiveIntent : PreparationDecisionIntent;
    attribute disposition : PreparationDecisionDisposition;
  }

  enum def MonitoringDecisionPreState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  enum def MonitoringDecisionNextState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  enum def MonitoringDecisionIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }
  enum def MonitoringDecisionDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  enum def MonitoringDecisionNotice {
    enum NONE;
    enum BELT_OBSERVATION_UNAVAILABLE;
    enum BELT_NOT_CONFIRMED;
    enum CALIBRATION_NOT_READY;
    enum ACQUISITION_UNAVAILABLE;
    enum MONITORING_HELD_NOTICE;
    enum INAPPLICABLE_REQUEST;
    enum WAITING_FOR_FRAME;
    enum FRAME_REJECTED;
  }
  enum def MonitoringDecisionPreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  part def MonitoringDecisionSnapshot :> Data {
    attribute preState : MonitoringDecisionPreState;
    attribute nextState : MonitoringDecisionNextState;
    attribute effectiveIntent : MonitoringDecisionIntent;
    attribute disposition : MonitoringDecisionDisposition;
    attribute notice : MonitoringDecisionNotice;
    attribute preparationState : MonitoringDecisionPreparationState;
  }

  enum def SessionStatusPreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  enum def SessionStatusMonitoringState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  enum def SessionStatusDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  enum def SessionStatusNotice {
    enum NONE;
    enum BELT_OBSERVATION_UNAVAILABLE;
    enum BELT_NOT_CONFIRMED;
    enum CALIBRATION_NOT_READY;
    enum ACQUISITION_UNAVAILABLE;
    enum MONITORING_HELD_NOTICE;
    enum INAPPLICABLE_REQUEST;
    enum WAITING_FOR_FRAME;
    enum FRAME_REJECTED;
  }
  part def SessionStatus :> Data {
    attribute preparationState : SessionStatusPreparationState;
    attribute monitoringState : SessionStatusMonitoringState;
    attribute disposition : SessionStatusDisposition;
    attribute notice : SessionStatusNotice;
  }

  part def BeltQualificationOwner :> Thread {
    port beltObservation : DataPort { in :>> type : BeltObservation; }
    port beltAssessment : DataPort { out :>> type : BeltAssessment; }

    language "GUMBO" /*{
  initialize
    guarantee INIT_BELT_ASSESSMENT "beltAssessment conditional on beltObservation":
      (beltObservation == BeltObservation.BELT_OBSERVATION_INVALID) implies (beltAssessment.beltCategory == BeltQualification.BELT_UNAVAILABLE & beltAssessment.qualified == F) &
      (beltObservation == BeltObservation.BELT_NOT_APPLIED) implies (beltAssessment.beltCategory == BeltQualification.BELT_ABSENT & beltAssessment.qualified == F) &
      (beltObservation == BeltObservation.BELT_APPLIED) implies (beltAssessment.beltCategory == BeltQualification.BELT_PRESENT & beltAssessment.qualified == T);

  compute
    compute_cases
      case CASE_01_INVALID_BELT "if beltObservation is BELT OBSERVATION INVALID":
        assume beltObservation == BeltObservation.BELT_OBSERVATION_INVALID;
        guarantee beltAssessment.beltCategory == BeltQualification.BELT_UNAVAILABLE & beltAssessment.qualified == F;
      case CASE_02_BELT_ABSENT "if beltObservation is BELT NOT APPLIED":
        assume beltObservation == BeltObservation.BELT_NOT_APPLIED;
        guarantee beltAssessment.beltCategory == BeltQualification.BELT_ABSENT & beltAssessment.qualified == F;
      case CASE_03_BELT_PRESENT "if beltObservation is BELT APPLIED":
        assume beltObservation == BeltObservation.BELT_APPLIED;
        guarantee beltAssessment.beltCategory == BeltQualification.BELT_PRESENT & beltAssessment.qualified == T;
}*/

                        
                
                 
                           
                                                                                                                
                                                                                  
                                                                                                                    
                                                                          
                                                                                                               
                                                                      
                                                                                                               
             
                     
                           
                                                                                         
                                                                               
                                                                                         
                                            
                           
                                                                                         
                                                                       
                                                                                    
                                            
                           
                                                                                      
                                                                   
                                                                                     
                                            
       
  }

  part def CalibrationQualificationOwner :> Thread {
    port calibrationObservation : DataPort { in :>> type : CalibrationObservation; }
    port beltAssessment : DataPort { in :>> type : BeltAssessment; }
    port calibrationQualification : DataPort { out :>> type : CalibrationQualification; }

    language "GUMBO" /*{
  initialize
    guarantee INIT_CALIBRATION_QUALIFICATION "calibrationQualification derived from beltAssessment and calibrationObservation":
      (beltAssessment.qualified == F) implies (calibrationQualification == CalibrationQualification.CALIBRATION_BLOCKED) &
      (beltAssessment.qualified == T & calibrationObservation != CalibrationObservation.CALIBRATION_PASSED) implies (calibrationQualification == CalibrationQualification.NOT_CALIBRATED) &
      (beltAssessment.qualified == T & calibrationObservation == CalibrationObservation.CALIBRATION_PASSED) implies (calibrationQualification == CalibrationQualification.CALIBRATED);

  compute
    compute_cases
      case CASE_04_BELT_BLOCKS_CALIBRATION "if beltAssessment qualified is F":
        assume beltAssessment.qualified == F;
        guarantee calibrationQualification == CalibrationQualification.CALIBRATION_BLOCKED;
      case CASE_05_CALIBRATION_NOT_READY "if beltAssessment qualified is T and calibrationObservation is not CALIBRATION PASSED":
        assume beltAssessment.qualified == T & calibrationObservation != CalibrationObservation.CALIBRATION_PASSED;
        guarantee calibrationQualification == CalibrationQualification.NOT_CALIBRATED;
      case CASE_06_CALIBRATION_READY "if beltAssessment qualified is T and calibrationObservation is CALIBRATION PASSED":
        assume beltAssessment.qualified == T & calibrationObservation == CalibrationObservation.CALIBRATION_PASSED;
        guarantee calibrationQualification == CalibrationQualification.CALIBRATED;
}*/
  }

  part def AcquisitionEligibilityOwner :> Thread {
    port acquisitionObservation : DataPort { in :>> type : AcquisitionObservation; }
    port beltAssessment : DataPort { in :>> type : BeltAssessment; }
    port calibrationQualification : DataPort { in :>> type : CalibrationQualification; }
    port preparationState : DataPort { in :>> type : PreparationState; }
    port monitoringState : DataPort { in :>> type : MonitoringState; }
    port eligibilityEnvelope : DataPort { out :>> type : EligibilityEnvelope; }

    language "GUMBO" /*{
  initialize
    guarantee INIT_ELIGIBILITY_ENVELOPE "eligibilityEnvelope derived from beltAssessment, calibrationQualification, preparationState, and acquisitionObservation":
      (beltAssessment.beltCategory == BeltQualification.BELT_UNAVAILABLE & beltAssessment.qualified == F) implies (eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_UNAVAILABLE_CONDITION & eligibilityEnvelope.beltQualified == F & eligibilityEnvelope.calibrationQualified == F) &
      (beltAssessment.beltCategory == BeltQualification.BELT_ABSENT & beltAssessment.qualified == F) implies (eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_ABSENT_CONDITION & eligibilityEnvelope.beltQualified == F & eligibilityEnvelope.calibrationQualified == F) &
      (beltAssessment.qualified == T & (preparationState != PreparationState.PREPARATION_CALIBRATED | calibrationQualification != CalibrationQualification.CALIBRATED)) implies (eligibilityEnvelope.condition == EligibilityEnvelopeCondition.CALIBRATION_NOT_READY_CONDITION & eligibilityEnvelope.beltQualified == T) &
      (beltAssessment.qualified == T & calibrationQualification == CalibrationQualification.CALIBRATED & preparationState == PreparationState.PREPARATION_CALIBRATED & acquisitionObservation == AcquisitionObservation.ACQUISITION_FAULT) implies (eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_FAULT_CONDITION & eligibilityEnvelope.beltQualified == T & eligibilityEnvelope.calibrationQualified == T) &
      (beltAssessment.qualified == T & calibrationQualification == CalibrationQualification.CALIBRATED & preparationState == PreparationState.PREPARATION_CALIBRATED & acquisitionObservation == AcquisitionObservation.ACQUISITION_AVAILABLE) implies (eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY & eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY & eligibilityEnvelope.beltQualified == T & eligibilityEnvelope.calibrationQualified == T);

  compute
    guarantee PROJECT_ELIGIBILITY_STATES "project preparationState and monitoringState into eligibilityEnvelope":
      (preparationState == PreparationState.UNPREPARED) implies (eligibilityEnvelope.preparationState == EligibilityEnvelopePreparationState.UNPREPARED) &
      (preparationState == PreparationState.BELT_CONFIRMED) implies (eligibilityEnvelope.preparationState == EligibilityEnvelopePreparationState.BELT_CONFIRMED) &
      (preparationState == PreparationState.PREPARATION_CALIBRATED) implies (eligibilityEnvelope.preparationState == EligibilityEnvelopePreparationState.PREPARATION_CALIBRATED) &
      (monitoringState == MonitoringState.MONITORING_INACTIVE) implies (eligibilityEnvelope.monitoringState == EligibilityEnvelopeMonitoringState.MONITORING_INACTIVE) &
      (monitoringState == MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.monitoringState == EligibilityEnvelopeMonitoringState.MONITORING_ACTIVE) &
      (monitoringState == MonitoringState.MONITORING_HELD) implies (eligibilityEnvelope.monitoringState == EligibilityEnvelopeMonitoringState.MONITORING_HELD);

    guarantee PROJECT_CALIBRATION_BOOLEAN "project calibrationQualification into eligibilityEnvelope.calibrationQualified":
      (calibrationQualification == CalibrationQualification.CALIBRATED) implies (eligibilityEnvelope.calibrationQualified == T) &
      (calibrationQualification != CalibrationQualification.CALIBRATED) implies (eligibilityEnvelope.calibrationQualified == F);

    compute_cases
      case CASE_08_BELT_UNAVAILABLE "if beltCategory is BELT UNAVAILABLE and qualified is F":
        assume beltAssessment.beltCategory == BeltQualification.BELT_UNAVAILABLE & beltAssessment.qualified == F;
        guarantee eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_UNAVAILABLE_CONDITION &
          eligibilityEnvelope.beltQualified == F &
          eligibilityEnvelope.calibrationQualified == F &
          ((preparationState != PreparationState.UNPREPARED) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY)) &
          (preparationState == PreparationState.UNPREPARED & monitoringState == MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY) &
          (preparationState == PreparationState.UNPREPARED & monitoringState != MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY);
      case CASE_09_BELT_ABSENT "if beltCategory is BELT ABSENT and qualified is F":
        assume beltAssessment.beltCategory == BeltQualification.BELT_ABSENT & beltAssessment.qualified == F;
        guarantee eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_ABSENT_CONDITION &
          eligibilityEnvelope.beltQualified == F &
          eligibilityEnvelope.calibrationQualified == F &
          ((preparationState != PreparationState.UNPREPARED) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY)) &
          (preparationState == PreparationState.UNPREPARED & monitoringState == MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY) &
          (preparationState == PreparationState.UNPREPARED & monitoringState != MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY);
      case CASE_10_CALIBRATION_NOT_READY "if beltAssessment qualified is T and preparation or calibration not ready":
        assume beltAssessment.qualified == T & (preparationState != PreparationState.PREPARATION_CALIBRATED | calibrationQualification != CalibrationQualification.CALIBRATED);
        guarantee eligibilityEnvelope.condition == EligibilityEnvelopeCondition.CALIBRATION_NOT_READY_CONDITION &
          eligibilityEnvelope.beltQualified == T &
          ((preparationState == PreparationState.PREPARATION_CALIBRATED & calibrationQualification != CalibrationQualification.CALIBRATED) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY)) &
          ((preparationState != PreparationState.PREPARATION_CALIBRATED | calibrationQualification == CalibrationQualification.CALIBRATED) & monitoringState == MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY) &
          ((preparationState != PreparationState.PREPARATION_CALIBRATED | calibrationQualification == CalibrationQualification.CALIBRATED) & monitoringState != MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY);
      case CASE_11_ACQUISITION_FAULT "if qualified is T, calibrated, preparation calibrated, and acquisition fault":
        assume beltAssessment.qualified == T & calibrationQualification == CalibrationQualification.CALIBRATED & preparationState == PreparationState.PREPARATION_CALIBRATED & acquisitionObservation == AcquisitionObservation.ACQUISITION_FAULT;
        guarantee eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_FAULT_CONDITION &
          eligibilityEnvelope.beltQualified == T &
          eligibilityEnvelope.calibrationQualified == T &
          ((monitoringState == MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY)) &
          ((monitoringState != MonitoringState.MONITORING_ACTIVE) implies (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY));
      case CASE_12_ACQUISITION_READY "if qualified is T, calibrated, preparation calibrated, and acquisition available":
        assume beltAssessment.qualified == T & calibrationQualification == CalibrationQualification.CALIBRATED & preparationState == PreparationState.PREPARATION_CALIBRATED & acquisitionObservation == AcquisitionObservation.ACQUISITION_AVAILABLE;
        guarantee eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY &
          eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY &
          eligibilityEnvelope.beltQualified == T &
          eligibilityEnvelope.calibrationQualified == T;
}*/
  }

  part def RequestArbiter :> Thread {
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    port technicianRequest : DataPort { in :>> type : TechnicianRequest; }
    port eligibilityEnvelope : DataPort { in :>> type : EligibilityEnvelope; }
    port arbitrationDecision : DataPort { out :>> type : ArbitrationDecision; }

    language "GUMBO" /*{
  initialize
    guarantee INIT_ARBITRATION "arbitrationDecision effectiveIntent derived from doctorRequest and eligibilityEnvelope recovery":
      (doctorRequest == DoctorRequest.STOP_MONITORING) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT) &
      (doctorRequest != DoctorRequest.STOP_MONITORING & eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT) &
      (doctorRequest != DoctorRequest.STOP_MONITORING & eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT);

  compute
    compute_cases
      case CASE_13_STOP_PRIORITY "if doctorRequest is STOP MONITORING":
        assume doctorRequest == DoctorRequest.STOP_MONITORING;
        guarantee arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT &
          ((eligibilityEnvelope.recovery != EligibilityEnvelopeRecovery.NO_RECOVERY | technicianRequest != TechnicianRequest.NO_TECHNICIAN_REQUEST) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED)) &
          ((eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY & technicianRequest == TechnicianRequest.NO_TECHNICIAN_REQUEST) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED));
      case CASE_14_RECOVERY_PRIORITY "if doctorRequest is not STOP and recovery is not NO_RECOVERY":
        assume doctorRequest != DoctorRequest.STOP_MONITORING & eligibilityEnvelope.recovery != EligibilityEnvelopeRecovery.NO_RECOVERY;
        guarantee ((eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT)) &
          ((eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT)) &
          ((doctorRequest == DoctorRequest.START_MONITORING | technicianRequest != TechnicianRequest.NO_TECHNICIAN_REQUEST) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED)) &
          ((doctorRequest != DoctorRequest.START_MONITORING & technicianRequest == TechnicianRequest.NO_TECHNICIAN_REQUEST) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.RECOVERY_APPLIED));
      case CASE_15_TECHNICIAN_PRIORITY_AND_APPLICABILITY "if doctorRequest is not STOP, recovery is NO_RECOVERY, and technicianRequest is not NO_TECHNICIAN_REQUEST":
        assume doctorRequest != DoctorRequest.STOP_MONITORING & eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY & technicianRequest != TechnicianRequest.NO_TECHNICIAN_REQUEST;
        guarantee ((technicianRequest == TechnicianRequest.RESET_PREPARATION) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT & ((doctorRequest == DoctorRequest.START_MONITORING) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED)) & ((doctorRequest != DoctorRequest.START_MONITORING) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED)))) &
          ((technicianRequest == TechnicianRequest.CONFIRM_BELT & eligibilityEnvelope.beltQualified == T & eligibilityEnvelope.preparationState != EligibilityEnvelopePreparationState.PREPARATION_CALIBRATED) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT & ((doctorRequest == DoctorRequest.START_MONITORING) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED)) & ((doctorRequest != DoctorRequest.START_MONITORING) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED)))) &
          ((technicianRequest == TechnicianRequest.RECORD_CALIBRATION & eligibilityEnvelope.beltQualified == T & eligibilityEnvelope.calibrationQualified == T & eligibilityEnvelope.preparationState != EligibilityEnvelopePreparationState.UNPREPARED) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT & ((doctorRequest == DoctorRequest.START_MONITORING) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED)) & ((doctorRequest != DoctorRequest.START_MONITORING) implies (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED)))) &
          (((technicianRequest == TechnicianRequest.CONFIRM_BELT & (eligibilityEnvelope.beltQualified == F | eligibilityEnvelope.preparationState == EligibilityEnvelopePreparationState.PREPARATION_CALIBRATED)) | (technicianRequest == TechnicianRequest.RECORD_CALIBRATION & (eligibilityEnvelope.beltQualified == F | eligibilityEnvelope.calibrationQualified == F | eligibilityEnvelope.preparationState == EligibilityEnvelopePreparationState.UNPREPARED))) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT & arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED));
      case CASE_16_START_OR_NO_REQUEST "if doctorRequest is not STOP, recovery is NO_RECOVERY, and technicianRequest is NO_TECHNICIAN_REQUEST":
        assume doctorRequest != DoctorRequest.STOP_MONITORING & eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY & technicianRequest == TechnicianRequest.NO_TECHNICIAN_REQUEST;
        guarantee ((doctorRequest == DoctorRequest.START_MONITORING & eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT & arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED)) &
          ((doctorRequest == DoctorRequest.START_MONITORING & eligibilityEnvelope.condition != EligibilityEnvelopeCondition.ACQUISITION_READY) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT & arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED)) &
          ((doctorRequest == DoctorRequest.NO_DOCTOR_REQUEST) implies (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT & arbitrationDecision.disposition == ArbitrationDecisionDisposition.NO_REQUEST_DISPOSITION));
}*/
  }

  part def PreparationStateGovernor :> Thread {
    port arbitrationDecision : DataPort { in :>> type : ArbitrationDecision; }
    port preparationState : DataPort { out :>> type : PreparationState; }
    port preparationDecision : DataPort { out :>> type : PreparationDecisionSnapshot; }

    language "GUMBO" /*{
  state
    committedPreparationState: PreparationState;

  initialize
    modifies committedPreparationState;
    guarantee INIT_PREPARATION_STATE "committedPreparationState, preparationState, and preparationDecision initialized":
      committedPreparationState == PreparationState.UNPREPARED &
      preparationState == PreparationState.UNPREPARED &
      preparationDecision.preState == PreparationDecisionPreState.UNPREPARED &
      preparationDecision.nextState == PreparationDecisionNextState.UNPREPARED &
      preparationDecision.effectiveIntent == PreparationDecisionIntent.NO_INTENT &
      preparationDecision.disposition == PreparationDecisionDisposition.NO_REQUEST_DISPOSITION;

  compute
    modifies committedPreparationState;
    guarantee PUBLISH_PREPARATION_PRE_STATE "preparationState set to committedPreparationState on entry":
      preparationState == committedPreparationState;

    guarantee PROJECT_PREPARATION_SNAPSHOT "preparationDecision snapshot projected from committedPreparationState and arbitrationDecision":
      (In(committedPreparationState) == PreparationState.UNPREPARED) implies (preparationDecision.preState == PreparationDecisionPreState.UNPREPARED) &
      (In(committedPreparationState) == PreparationState.BELT_CONFIRMED) implies (preparationDecision.preState == PreparationDecisionPreState.BELT_CONFIRMED) &
      (In(committedPreparationState) == PreparationState.PREPARATION_CALIBRATED) implies (preparationDecision.preState == PreparationDecisionPreState.PREPARATION_CALIBRATED) &
      (committedPreparationState == PreparationState.UNPREPARED) implies (preparationDecision.nextState == PreparationDecisionNextState.UNPREPARED) &
      (committedPreparationState == PreparationState.BELT_CONFIRMED) implies (preparationDecision.nextState == PreparationDecisionNextState.BELT_CONFIRMED) &
      (committedPreparationState == PreparationState.PREPARATION_CALIBRATED) implies (preparationDecision.nextState == PreparationDecisionNextState.PREPARATION_CALIBRATED) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT) implies (preparationDecision.effectiveIntent == PreparationDecisionIntent.NO_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT) implies (preparationDecision.effectiveIntent == PreparationDecisionIntent.STOP_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT) implies (preparationDecision.effectiveIntent == PreparationDecisionIntent.RESET_PREPARATION_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT) implies (preparationDecision.effectiveIntent == PreparationDecisionIntent.HOLD_MONITORING_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT) implies (preparationDecision.effectiveIntent == PreparationDecisionIntent.CONFIRM_BELT_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT) implies (preparationDecision.effectiveIntent == PreparationDecisionIntent.RECORD_CALIBRATION_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT) implies (preparationDecision.effectiveIntent == PreparationDecisionIntent.START_MONITORING_INTENT) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.NO_REQUEST_DISPOSITION) implies (preparationDecision.disposition == PreparationDecisionDisposition.NO_REQUEST_DISPOSITION) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED) implies (preparationDecision.disposition == PreparationDecisionDisposition.ACCEPTED) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) implies (preparationDecision.disposition == PreparationDecisionDisposition.REJECTED) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.RECOVERY_APPLIED) implies (preparationDecision.disposition == PreparationDecisionDisposition.RECOVERY_APPLIED) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED) implies (preparationDecision.disposition == PreparationDecisionDisposition.PREEMPTED);

    compute_cases
      case CASE_07_RESET_OR_RETAIN_PREPARATION "if effectiveIntent is RESET, STOP, HOLD, START, or NO INTENT":
        assume arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT & arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT;
        guarantee ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT) implies (committedPreparationState == PreparationState.UNPREPARED)) &
          ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT) implies (committedPreparationState == In(committedPreparationState)));
      case CASE_17_ADVANCE_PREPARATION "if effectiveIntent is CONFIRM BELT or RECORD CALIBRATION":
        assume arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT | arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT;
        guarantee ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT) implies (committedPreparationState == PreparationState.BELT_CONFIRMED)) &
          ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT) implies (committedPreparationState == PreparationState.PREPARATION_CALIBRATED));
}*/
  }

  part def MonitoringStateGovernor :> Thread {
    port preparationDecision : DataPort { in :>> type : PreparationDecisionSnapshot; }
    port arbitrationDecision : DataPort { in :>> type : ArbitrationDecision; }
    port eligibilityEnvelope : DataPort { in :>> type : EligibilityEnvelope; }
    port monitoringState : DataPort { out :>> type : MonitoringState; }
    port monitoringDecision : DataPort { out :>> type : MonitoringDecisionSnapshot; }

    language "GUMBO" /*{
  state
    committedMonitoringState: MonitoringState;

  initialize
    modifies committedMonitoringState;
    guarantee INIT_MONITORING_STATE "committedMonitoringState, monitoringState, and monitoringDecision initialized":
      committedMonitoringState == MonitoringState.MONITORING_INACTIVE &
      monitoringState == MonitoringState.MONITORING_INACTIVE &
      monitoringDecision.preState == MonitoringDecisionPreState.MONITORING_INACTIVE &
      monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_INACTIVE &
      monitoringDecision.effectiveIntent == MonitoringDecisionIntent.NO_INTENT &
      monitoringDecision.disposition == MonitoringDecisionDisposition.NO_REQUEST_DISPOSITION &
      monitoringDecision.notice == MonitoringDecisionNotice.NONE &
      monitoringDecision.preparationState == MonitoringDecisionPreparationState.UNPREPARED;

  compute
    modifies committedMonitoringState;
    guarantee PUBLISH_MONITORING_PRE_STATE "monitoringState set to committedMonitoringState on entry":
      monitoringState == In(committedMonitoringState);

    guarantee PROJECT_MONITORING_STATES "monitoringDecision preState, nextState, and preparationState projected":
      (In(committedMonitoringState) == MonitoringState.MONITORING_INACTIVE) implies (monitoringDecision.preState == MonitoringDecisionPreState.MONITORING_INACTIVE) &
      (In(committedMonitoringState) == MonitoringState.MONITORING_ACTIVE) implies (monitoringDecision.preState == MonitoringDecisionPreState.MONITORING_ACTIVE) &
      (In(committedMonitoringState) == MonitoringState.MONITORING_HELD) implies (monitoringDecision.preState == MonitoringDecisionPreState.MONITORING_HELD) &
      (committedMonitoringState == MonitoringState.MONITORING_INACTIVE) implies (monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_INACTIVE) &
      (committedMonitoringState == MonitoringState.MONITORING_ACTIVE) implies (monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE) &
      (committedMonitoringState == MonitoringState.MONITORING_HELD) implies (monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_HELD) &
      (preparationDecision.nextState == PreparationDecisionNextState.UNPREPARED) implies (monitoringDecision.preparationState == MonitoringDecisionPreparationState.UNPREPARED) &
      (preparationDecision.nextState == PreparationDecisionNextState.BELT_CONFIRMED) implies (monitoringDecision.preparationState == MonitoringDecisionPreparationState.BELT_CONFIRMED) &
      (preparationDecision.nextState == PreparationDecisionNextState.PREPARATION_CALIBRATED) implies (monitoringDecision.preparationState == MonitoringDecisionPreparationState.PREPARATION_CALIBRATED);

    guarantee PROJECT_MONITORING_DECISION "monitoringDecision effectiveIntent and disposition projected from arbitrationDecision":
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT) implies (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.NO_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT) implies (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.STOP_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT) implies (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.RESET_PREPARATION_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT) implies (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.HOLD_MONITORING_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT) implies (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.CONFIRM_BELT_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT) implies (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.RECORD_CALIBRATION_INTENT) &
      (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT) implies (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.START_MONITORING_INTENT) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.NO_REQUEST_DISPOSITION) implies (monitoringDecision.disposition == MonitoringDecisionDisposition.NO_REQUEST_DISPOSITION) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED) implies (monitoringDecision.disposition == MonitoringDecisionDisposition.ACCEPTED) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) implies (monitoringDecision.disposition == MonitoringDecisionDisposition.REJECTED) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.RECOVERY_APPLIED) implies (monitoringDecision.disposition == MonitoringDecisionDisposition.RECOVERY_APPLIED) &
      (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED) implies (monitoringDecision.disposition == MonitoringDecisionDisposition.PREEMPTED);

    compute_cases
      case CASE_18_MONITORING_TRANSITION_AND_NOTICE "committedMonitoringState transition and monitoringDecision notice":
        guarantee (
          ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT) implies (committedMonitoringState == MonitoringState.MONITORING_INACTIVE)) &
          ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.STOP_INTENT & In(committedMonitoringState) == MonitoringState.MONITORING_ACTIVE & (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT | arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT)) implies (committedMonitoringState == MonitoringState.MONITORING_HELD)) &
          ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.STOP_INTENT & arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT & eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY) implies (committedMonitoringState == MonitoringState.MONITORING_ACTIVE)) &
          ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.STOP_INTENT & not(In(committedMonitoringState) == MonitoringState.MONITORING_ACTIVE & (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT | arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT)) & not(arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT & eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY)) implies (committedMonitoringState == In(committedMonitoringState))) &
          (((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT | arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT | arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) & eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_UNAVAILABLE_CONDITION) implies (monitoringDecision.notice == MonitoringDecisionNotice.BELT_OBSERVATION_UNAVAILABLE)) &
          (((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT | arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT | arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) & eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_ABSENT_CONDITION) implies (monitoringDecision.notice == MonitoringDecisionNotice.BELT_NOT_CONFIRMED)) &
          (((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT | arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT | arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) & eligibilityEnvelope.condition == EligibilityEnvelopeCondition.CALIBRATION_NOT_READY_CONDITION) implies (monitoringDecision.notice == MonitoringDecisionNotice.CALIBRATION_NOT_READY)) &
          (((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT | arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT | arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) & eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_FAULT_CONDITION) implies (monitoringDecision.notice == MonitoringDecisionNotice.ACQUISITION_UNAVAILABLE)) &
          ((arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED & eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY) implies (monitoringDecision.notice == MonitoringDecisionNotice.INAPPLICABLE_REQUEST)) &
          ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT & arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT & arbitrationDecision.disposition != ArbitrationDecisionDisposition.REJECTED & committedMonitoringState == MonitoringState.MONITORING_HELD) implies (monitoringDecision.notice == MonitoringDecisionNotice.MONITORING_HELD_NOTICE)) &
          ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT & arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT & arbitrationDecision.disposition != ArbitrationDecisionDisposition.REJECTED & committedMonitoringState != MonitoringState.MONITORING_HELD) implies (monitoringDecision.notice == MonitoringDecisionNotice.NONE));
        );
}*/


  part def AcquisitionCommandPolicy :> Thread {
    port monitoringDecision : DataPort { in :>> type : MonitoringDecisionSnapshot; }
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }

                        
                
                 
                           
                                                                                         
                                                                    
             
                     
                           
                                                                                                                                       
                     
                                                                                                      
                                                                     
                                                                                                      
                                                                           
       
  }

  part def SessionPublicationPolicy :> Thread {
    port impedanceFrame : DataPort { in :>> type : ImpedanceFrameObservation; }
    port monitoringDecision : DataPort { in :>> type : MonitoringDecisionSnapshot; }
    port frameDelivery : DataPort { out :>> type : FrameDelivery; }
    port sessionStatus : DataPort { out :>> type : SessionStatus; }

                        
                
                 
                           
                                                                                                            
                                                        
                                                                                        
                                                                                               
                                                                                          
                                                             
             
                 
                           
                                                                                                                            
                                                                                                           
                                                                                             
                                                                                                               
                                                                                                 
                                                                                                                       
                                                                                                         
                                                                                                      
                                                                                                    
                                                                                                    
                                                                                                  
                                                                                                  
                                                                                                
                                                                                                             
                                                                                               
                                                                                               
                                                                                 
                                                                                               
                                                                                 
                                                                                                       
                                                                                         
                                                                                                
                                                                                 
                     
                           
                                                                                                                                                   
                     
                                                                                               
                                                                            
                                                                   
                                                                                               
                                                                            
                                                                   
                                                                                               
                                                                      
                                                                                  
                                                               
                                                                                                           
                                                                                             
                                                                                                 
                                                                                   
                                                                                                    
                                                                                      
                                                                                                      
                                                                                        
                                                                                                     
                                                                                       
                                                                                                   
                                                                                     
                                                                            
                                                                                               
                                                                                  
                                                                               
                                                                            
                                                                                               
                                                                             
                                                                                  
                                                                            
                                                                                                
                                                                      
                                                                              
                                                                    
       
  }

  part def AcquisitionCoordinationProcess :> Process {
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    port technicianRequest : DataPort { in :>> type : TechnicianRequest; }
    port beltObservation : DataPort { in :>> type : BeltObservation; }
    port calibrationObservation : DataPort { in :>> type : CalibrationObservation; }
    port acquisitionObservation : DataPort { in :>> type : AcquisitionObservation; }
    port impedanceFrame : DataPort { in :>> type : ImpedanceFrameObservation; }
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }
    port frameDelivery : DataPort { out :>> type : FrameDelivery; }
    port sessionStatus : DataPort { out :>> type : SessionStatus; }

    part beltQualificationOwner : BeltQualificationOwner;
    part calibrationQualificationOwner : CalibrationQualificationOwner;
    part acquisitionEligibilityOwner : AcquisitionEligibilityOwner;
    part requestArbiter : RequestArbiter;
    part preparationStateGovernor : PreparationStateGovernor;
    part monitoringStateGovernor : MonitoringStateGovernor;
    part acquisitionCommandPolicy : AcquisitionCommandPolicy;
    part sessionPublicationPolicy : SessionPublicationPolicy;

    connection int01 : PortConnection connect doctorRequest to requestArbiter.doctorRequest;
    connection int02 : PortConnection connect technicianRequest to requestArbiter.technicianRequest;
    connection int03 : PortConnection connect beltObservation to beltQualificationOwner.beltObservation;
    connection int04 : PortConnection connect calibrationObservation to calibrationQualificationOwner.calibrationObservation;
    connection int05 : PortConnection connect acquisitionObservation to acquisitionEligibilityOwner.acquisitionObservation;
    connection int06 : PortConnection connect impedanceFrame to sessionPublicationPolicy.impedanceFrame;
    connection int07 : PortConnection connect beltQualificationOwner.beltAssessment to calibrationQualificationOwner.beltAssessment;
    connection int08 : PortConnection connect beltQualificationOwner.beltAssessment to acquisitionEligibilityOwner.beltAssessment;
    connection int09 : PortConnection connect calibrationQualificationOwner.calibrationQualification to acquisitionEligibilityOwner.calibrationQualification;
    connection int10 : PortConnection connect preparationStateGovernor.preparationState to acquisitionEligibilityOwner.preparationState;
    connection int11 : PortConnection connect monitoringStateGovernor.monitoringState to acquisitionEligibilityOwner.monitoringState;
    connection int12 : PortConnection connect acquisitionEligibilityOwner.eligibilityEnvelope to requestArbiter.eligibilityEnvelope;
    connection int13 : PortConnection connect requestArbiter.arbitrationDecision to preparationStateGovernor.arbitrationDecision;
    connection int14 : PortConnection connect preparationStateGovernor.preparationDecision to monitoringStateGovernor.preparationDecision;
    connection int15 : PortConnection connect requestArbiter.arbitrationDecision to monitoringStateGovernor.arbitrationDecision;
    connection int16 : PortConnection connect acquisitionEligibilityOwner.eligibilityEnvelope to monitoringStateGovernor.eligibilityEnvelope;
    connection int17 : PortConnection connect monitoringStateGovernor.monitoringDecision to acquisitionCommandPolicy.monitoringDecision;
    connection int18 : PortConnection connect monitoringStateGovernor.monitoringDecision to sessionPublicationPolicy.monitoringDecision;
    connection int19 : PortConnection connect acquisitionCommandPolicy.acquisitionCommand to acquisitionCommand;
    connection int20 : PortConnection connect sessionPublicationPolicy.frameDelivery to frameDelivery;
    connection int21 : PortConnection connect sessionPublicationPolicy.sessionStatus to sessionStatus;
  }

  part def EITAcquisitionSessionCoordinator :> System {
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    port technicianRequest : DataPort { in :>> type : TechnicianRequest; }
    port beltObservation : DataPort { in :>> type : BeltObservation; }
    port calibrationObservation : DataPort { in :>> type : CalibrationObservation; }
    port acquisitionObservation : DataPort { in :>> type : AcquisitionObservation; }
    port impedanceFrame : DataPort { in :>> type : ImpedanceFrameObservation; }
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }
    port frameDelivery : DataPort { out :>> type : FrameDelivery; }
    port sessionStatus : DataPort { out :>> type : SessionStatus; }

    part acquisitionCoordinationProcess : AcquisitionCoordinationProcess;

    connection supportDoctorRequest : PortConnection connect doctorRequest to acquisitionCoordinationProcess.doctorRequest;
    connection supportTechnicianRequest : PortConnection connect technicianRequest to acquisitionCoordinationProcess.technicianRequest;
    connection supportBeltObservation : PortConnection connect beltObservation to acquisitionCoordinationProcess.beltObservation;
    connection supportCalibrationObservation : PortConnection connect calibrationObservation to acquisitionCoordinationProcess.calibrationObservation;
    connection supportAcquisitionObservation : PortConnection connect acquisitionObservation to acquisitionCoordinationProcess.acquisitionObservation;
    connection supportImpedanceFrame : PortConnection connect impedanceFrame to acquisitionCoordinationProcess.impedanceFrame;
    connection supportAcquisitionCommand : PortConnection connect acquisitionCoordinationProcess.acquisitionCommand to acquisitionCommand;
    connection supportFrameDelivery : PortConnection connect acquisitionCoordinationProcess.frameDelivery to frameDelivery;
    connection supportSessionStatus : PortConnection connect acquisitionCoordinationProcess.sessionStatus to sessionStatus;
  }

  part eitAcquisitionSessionCoordinator : EITAcquisitionSessionCoordinator;
}
