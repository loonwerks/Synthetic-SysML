// @trace SCOPE-IN-01
package EIT_Acquisition_Session_Coordinator {
  private import HAMR::*;

  // @trace MON-01
  enum def DoctorRequest {
    enum NO_DOCTOR_REQUEST;
    enum START_MONITORING;
    enum STOP_MONITORING;
  }

  // @trace MON-02
  enum def TechnicianRequest {
    enum NO_TECHNICIAN_REQUEST;
    enum CONFIRM_BELT;
    enum RECORD_CALIBRATION;
    enum RESET_PREPARATION;
  }

  // @trace MON-03
  enum def BeltObservation {
    enum BELT_OBSERVATION_INVALID;
    enum BELT_NOT_APPLIED;
    enum BELT_APPLIED;
  }

  // @trace MON-04
  enum def CalibrationObservation {
    enum CALIBRATION_OBSERVATION_INVALID;
    enum CALIBRATION_NOT_AVAILABLE;
    enum CALIBRATION_FAILED;
    enum CALIBRATION_PASSED;
  }

  // @trace MON-05
  enum def AcquisitionObservation {
    enum ACQUISITION_AVAILABLE;
    enum ACQUISITION_FAULT;
  }

  // @trace MON-06
  enum def ImpedanceFrameObservation {
    enum NO_FRAME;
    enum INVALID_FRAME;
    enum FRAME_A;
    enum FRAME_B;
  }

  // @trace CTRL-01
  enum def AcquisitionCommand {
    enum DO_NOT_COLLECT;
    enum COLLECT;
  }

  // @trace CTRL-02
  enum def FrameDelivery {
    enum NO_DELIVERY;
    enum DELIVER_FRAME_A;
    enum DELIVER_FRAME_B;
  }

  // @trace TYPE-01
  enum def BeltQualification {
    enum BELT_UNAVAILABLE;
    enum BELT_ABSENT;
    enum BELT_PRESENT;
  }

  // @trace TYPE-01A
  part def BeltAssessment :> Data {
    // @trace TYPE-01A
    attribute beltCategory : BeltQualification;
    // @trace TYPE-01A
    attribute qualified : Boolean;
  }

  // @trace TYPE-02
  enum def CalibrationQualification {
    enum CALIBRATION_BLOCKED;
    enum NOT_CALIBRATED;
    enum CALIBRATED;
  }

  // @trace TYPE-03
  enum def PreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }

  // @trace TYPE-04
  enum def MonitoringState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }

  // @trace TYPE-05
  enum def EligibilityCondition {
    enum BELT_UNAVAILABLE_CONDITION;
    enum BELT_ABSENT_CONDITION;
    enum CALIBRATION_NOT_READY_CONDITION;
    enum ACQUISITION_FAULT_CONDITION;
    enum ACQUISITION_READY;
  }

  // @trace TYPE-06
  enum def RecoveryProposal {
    enum NO_RECOVERY;
    enum RESET_PREPARATION_RECOVERY;
    enum HOLD_MONITORING_RECOVERY;
  }

  // @trace TYPE-07
  enum def EffectiveIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }

  // @trace TYPE-08
  enum def RequestDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }

  // @trace TYPE-09
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

  // @trace TYPE-10
  enum def EligibilityEnvelopeCondition {
    enum BELT_UNAVAILABLE_CONDITION;
    enum BELT_ABSENT_CONDITION;
    enum CALIBRATION_NOT_READY_CONDITION;
    enum ACQUISITION_FAULT_CONDITION;
    enum ACQUISITION_READY;
  }
  // @trace TYPE-10
  enum def EligibilityEnvelopeRecovery {
    enum NO_RECOVERY;
    enum RESET_PREPARATION_RECOVERY;
    enum HOLD_MONITORING_RECOVERY;
  }
  // @trace TYPE-10
  enum def EligibilityEnvelopePreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  // @trace TYPE-10
  enum def EligibilityEnvelopeMonitoringState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  // @trace TYPE-10
  part def EligibilityEnvelope :> Data {
    // @trace TYPE-10
    attribute condition : EligibilityEnvelopeCondition;
    // @trace TYPE-10
    attribute recovery : EligibilityEnvelopeRecovery;
    // @trace TYPE-10
    attribute beltQualified : Boolean;
    // @trace TYPE-10
    attribute calibrationQualified : Boolean;
    // @trace TYPE-10
    attribute preparationState : EligibilityEnvelopePreparationState;
    // @trace TYPE-10
    attribute monitoringState : EligibilityEnvelopeMonitoringState;
  }

  // @trace TYPE-11
  enum def ArbitrationDecisionEffectiveIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }
  // @trace TYPE-11
  enum def ArbitrationDecisionDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  // @trace TYPE-11
  part def ArbitrationDecision :> Data {
    // @trace TYPE-11
    attribute effectiveIntent : ArbitrationDecisionEffectiveIntent;
    // @trace TYPE-11
    attribute disposition : ArbitrationDecisionDisposition;
  }

  // @trace TYPE-12
  enum def PreparationDecisionPreState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  // @trace TYPE-12
  enum def PreparationDecisionNextState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  // @trace TYPE-12
  enum def PreparationDecisionIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }
  // @trace TYPE-12
  enum def PreparationDecisionDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  // @trace TYPE-12
  part def PreparationDecisionSnapshot :> Data {
    // @trace TYPE-12
    attribute preState : PreparationDecisionPreState;
    // @trace TYPE-12
    attribute nextState : PreparationDecisionNextState;
    // @trace TYPE-12
    attribute effectiveIntent : PreparationDecisionIntent;
    // @trace TYPE-12
    attribute disposition : PreparationDecisionDisposition;
  }

  // @trace TYPE-13
  enum def MonitoringDecisionPreState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  // @trace TYPE-13
  enum def MonitoringDecisionNextState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  // @trace TYPE-13
  enum def MonitoringDecisionIntent {
    enum NO_INTENT;
    enum STOP_INTENT;
    enum RESET_PREPARATION_INTENT;
    enum HOLD_MONITORING_INTENT;
    enum CONFIRM_BELT_INTENT;
    enum RECORD_CALIBRATION_INTENT;
    enum START_MONITORING_INTENT;
  }
  // @trace TYPE-13
  enum def MonitoringDecisionDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  // @trace TYPE-13
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
  // @trace TYPE-13
  enum def MonitoringDecisionPreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  // @trace TYPE-13
  part def MonitoringDecisionSnapshot :> Data {
    // @trace TYPE-13
    attribute preState : MonitoringDecisionPreState;
    // @trace TYPE-13
    attribute nextState : MonitoringDecisionNextState;
    // @trace TYPE-13
    attribute effectiveIntent : MonitoringDecisionIntent;
    // @trace TYPE-13
    attribute disposition : MonitoringDecisionDisposition;
    // @trace TYPE-13
    attribute notice : MonitoringDecisionNotice;
    // @trace TYPE-13
    attribute preparationState : MonitoringDecisionPreparationState;
  }

  // @trace TYPE-14
  enum def SessionStatusPreparationState {
    enum UNPREPARED;
    enum BELT_CONFIRMED;
    enum PREPARATION_CALIBRATED;
  }
  // @trace TYPE-14
  enum def SessionStatusMonitoringState {
    enum MONITORING_INACTIVE;
    enum MONITORING_ACTIVE;
    enum MONITORING_HELD;
  }
  // @trace TYPE-14
  enum def SessionStatusDisposition {
    enum NO_REQUEST_DISPOSITION;
    enum ACCEPTED;
    enum REJECTED;
    enum RECOVERY_APPLIED;
    enum PREEMPTED;
  }
  // @trace TYPE-14
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
  // @trace CTRL-03
  part def SessionStatus :> Data {
    // @trace TYPE-14
    attribute preparationState : SessionStatusPreparationState;
    // @trace TYPE-14
    attribute monitoringState : SessionStatusMonitoringState;
    // @trace TYPE-14
    attribute disposition : SessionStatusDisposition;
    // @trace TYPE-14
    attribute notice : SessionStatusNotice;
  }

  // @trace PART-01
  part def BeltQualificationOwner :> Thread {
    // @trace INT-03
    port beltObservation : DataPort { in :>> type : BeltObservation; }
    // @trace INT-07
    port beltAssessment : DataPort { out :>> type : BeltAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_BELT_ASSESSMENT "Initial belt assessment is the legal classification of the current observation":
            ((beltObservation == BeltObservation.BELT_OBSERVATION_INVALID) implies
              (beltAssessment.beltCategory == BeltQualification.BELT_UNAVAILABLE & beltAssessment.qualified == F)) &
            ((beltObservation == BeltObservation.BELT_NOT_APPLIED) implies
              (beltAssessment.beltCategory == BeltQualification.BELT_ABSENT & beltAssessment.qualified == F)) &
            ((beltObservation == BeltObservation.BELT_APPLIED) implies
              (beltAssessment.beltCategory == BeltQualification.BELT_PRESENT & beltAssessment.qualified == T));
      compute
        compute_cases
          // @trace CASE-01
          case CASE_01_INVALID_BELT "Invalid observation is unavailable and unqualified":
            assume beltObservation == BeltObservation.BELT_OBSERVATION_INVALID;
            guarantee beltAssessment.beltCategory == BeltQualification.BELT_UNAVAILABLE &
              beltAssessment.qualified == F;
          // @trace CASE-02
          case CASE_02_BELT_ABSENT "A not-applied observation is absent and unqualified":
            assume beltObservation == BeltObservation.BELT_NOT_APPLIED;
            guarantee beltAssessment.beltCategory == BeltQualification.BELT_ABSENT &
              beltAssessment.qualified == F;
          // @trace CASE-03
          case CASE_03_BELT_PRESENT "An applied observation is present and qualified":
            assume beltObservation == BeltObservation.BELT_APPLIED;
            guarantee beltAssessment.beltCategory == BeltQualification.BELT_PRESENT &
              beltAssessment.qualified == T;
    }*/
  }

  // @trace PART-02
  part def CalibrationQualificationOwner :> Thread {
    // @trace INT-04
    port calibrationObservation : DataPort { in :>> type : CalibrationObservation; }
    // @trace INT-07
    port beltAssessment : DataPort { in :>> type : BeltAssessment; }
    // @trace INT-09
    port calibrationQualification : DataPort { out :>> type : CalibrationQualification; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_CALIBRATION_QUALIFICATION "Initial calibration qualification consumes the supplied belt Boolean":
            ((beltAssessment.qualified == F) implies
              (calibrationQualification == CalibrationQualification.CALIBRATION_BLOCKED)) &
            ((beltAssessment.qualified == T & calibrationObservation != CalibrationObservation.CALIBRATION_PASSED) implies
              (calibrationQualification == CalibrationQualification.NOT_CALIBRATED)) &
            ((beltAssessment.qualified == T & calibrationObservation == CalibrationObservation.CALIBRATION_PASSED) implies
              (calibrationQualification == CalibrationQualification.CALIBRATED));
      compute
        compute_cases
          // @trace CASE-04
          case CASE_04_BELT_BLOCKS_CALIBRATION "An unqualified supplied belt fact blocks every calibration observation":
            assume beltAssessment.qualified == F;
            guarantee calibrationQualification == CalibrationQualification.CALIBRATION_BLOCKED;
          // @trace CASE-05
          case CASE_05_CALIBRATION_NOT_READY "A qualified belt without a passed observation is not calibrated":
            assume beltAssessment.qualified == T &
              calibrationObservation != CalibrationObservation.CALIBRATION_PASSED;
            guarantee calibrationQualification == CalibrationQualification.NOT_CALIBRATED;
          // @trace CASE-06
          case CASE_06_CALIBRATION_READY "A qualified belt and passed observation are calibrated":
            assume beltAssessment.qualified == T &
              calibrationObservation == CalibrationObservation.CALIBRATION_PASSED;
            guarantee calibrationQualification == CalibrationQualification.CALIBRATED;
    }*/
  }

  // @trace PART-03
  part def AcquisitionEligibilityOwner :> Thread {
    // @trace INT-05
    port acquisitionObservation : DataPort { in :>> type : AcquisitionObservation; }
    // @trace INT-08
    port beltAssessment : DataPort { in :>> type : BeltAssessment; }
    // @trace INT-09
    port calibrationQualification : DataPort { in :>> type : CalibrationQualification; }
    // @trace INT-10
    port preparationState : DataPort { in :>> type : PreparationState; }
    // @trace INT-11
    port monitoringState : DataPort { in :>> type : MonitoringState; }
    // @trace INT-12
    port eligibilityEnvelope : DataPort { out :>> type : EligibilityEnvelope; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_ELIGIBILITY_ENVELOPE "Initial envelope is a legal field-complete result of current qualifications and committed states":
            ((beltAssessment.beltCategory == BeltQualification.BELT_UNAVAILABLE & beltAssessment.qualified == F) implies
              (eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_UNAVAILABLE_CONDITION &
               eligibilityEnvelope.beltQualified == F & eligibilityEnvelope.calibrationQualified == F)) &
            ((beltAssessment.beltCategory == BeltQualification.BELT_ABSENT & beltAssessment.qualified == F) implies
              (eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_ABSENT_CONDITION &
               eligibilityEnvelope.beltQualified == F & eligibilityEnvelope.calibrationQualified == F)) &
            ((beltAssessment.qualified == T &
              (preparationState != PreparationState.PREPARATION_CALIBRATED |
               calibrationQualification != CalibrationQualification.CALIBRATED)) implies
              (eligibilityEnvelope.condition == EligibilityEnvelopeCondition.CALIBRATION_NOT_READY_CONDITION &
               eligibilityEnvelope.beltQualified == T)) &
            ((beltAssessment.qualified == T & calibrationQualification == CalibrationQualification.CALIBRATED &
              preparationState == PreparationState.PREPARATION_CALIBRATED &
              acquisitionObservation == AcquisitionObservation.ACQUISITION_FAULT) implies
              (eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_FAULT_CONDITION &
               eligibilityEnvelope.beltQualified == T & eligibilityEnvelope.calibrationQualified == T)) &
            ((beltAssessment.qualified == T & calibrationQualification == CalibrationQualification.CALIBRATED &
              preparationState == PreparationState.PREPARATION_CALIBRATED &
              acquisitionObservation == AcquisitionObservation.ACQUISITION_AVAILABLE) implies
              (eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY &
               eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY &
               eligibilityEnvelope.beltQualified == T & eligibilityEnvelope.calibrationQualified == T));
      compute
        guarantee
          // @trace TYPE-10
          PROJECT_ELIGIBILITY_STATES "The envelope carries both supplied committed states through field-specific classifiers":
            ((preparationState == PreparationState.UNPREPARED) implies
              (eligibilityEnvelope.preparationState == EligibilityEnvelopePreparationState.UNPREPARED)) &
            ((preparationState == PreparationState.BELT_CONFIRMED) implies
              (eligibilityEnvelope.preparationState == EligibilityEnvelopePreparationState.BELT_CONFIRMED)) &
            ((preparationState == PreparationState.PREPARATION_CALIBRATED) implies
              (eligibilityEnvelope.preparationState == EligibilityEnvelopePreparationState.PREPARATION_CALIBRATED)) &
            ((monitoringState == MonitoringState.MONITORING_INACTIVE) implies
              (eligibilityEnvelope.monitoringState == EligibilityEnvelopeMonitoringState.MONITORING_INACTIVE)) &
            ((monitoringState == MonitoringState.MONITORING_ACTIVE) implies
              (eligibilityEnvelope.monitoringState == EligibilityEnvelopeMonitoringState.MONITORING_ACTIVE)) &
            ((monitoringState == MonitoringState.MONITORING_HELD) implies
              (eligibilityEnvelope.monitoringState == EligibilityEnvelopeMonitoringState.MONITORING_HELD));
        guarantee
          // @trace TYPE-10
          PROJECT_CALIBRATION_BOOLEAN "The envelope calibration Boolean is true exactly for the supplied calibrated fact":
            ((calibrationQualification == CalibrationQualification.CALIBRATED) implies
              (eligibilityEnvelope.calibrationQualified == T)) &
            ((calibrationQualification != CalibrationQualification.CALIBRATED) implies
              (eligibilityEnvelope.calibrationQualified == F));
        compute_cases
          // @trace CASE-08
          case CASE_08_BELT_UNAVAILABLE "Unavailable belt evidence has first eligibility and recovery precedence":
            assume beltAssessment.beltCategory == BeltQualification.BELT_UNAVAILABLE &
              beltAssessment.qualified == F;
            guarantee eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_UNAVAILABLE_CONDITION &
              eligibilityEnvelope.beltQualified == F & eligibilityEnvelope.calibrationQualified == F &
              ((preparationState != PreparationState.UNPREPARED) implies
                (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY)) &
              ((preparationState == PreparationState.UNPREPARED & monitoringState == MonitoringState.MONITORING_ACTIVE) implies
                (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY)) &
              ((preparationState == PreparationState.UNPREPARED & monitoringState != MonitoringState.MONITORING_ACTIVE) implies
                (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY));
          // @trace CASE-09
          case CASE_09_BELT_ABSENT "Absent belt evidence preserves its reason and the same state-dependent recovery policy":
            assume beltAssessment.beltCategory == BeltQualification.BELT_ABSENT &
              beltAssessment.qualified == F;
            guarantee eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_ABSENT_CONDITION &
              eligibilityEnvelope.beltQualified == F & eligibilityEnvelope.calibrationQualified == F &
              ((preparationState != PreparationState.UNPREPARED) implies
                (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY)) &
              ((preparationState == PreparationState.UNPREPARED & monitoringState == MonitoringState.MONITORING_ACTIVE) implies
                (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY)) &
              ((preparationState == PreparationState.UNPREPARED & monitoringState != MonitoringState.MONITORING_ACTIVE) implies
                (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY));
          // @trace CASE-10
          case CASE_10_CALIBRATION_NOT_READY "A present belt with unready preparation or calibration selects reset before hold":
            assume beltAssessment.qualified == T &
              (preparationState != PreparationState.PREPARATION_CALIBRATED |
               calibrationQualification != CalibrationQualification.CALIBRATED);
            guarantee eligibilityEnvelope.condition == EligibilityEnvelopeCondition.CALIBRATION_NOT_READY_CONDITION &
              eligibilityEnvelope.beltQualified == T &
              ((preparationState == PreparationState.PREPARATION_CALIBRATED &
                calibrationQualification != CalibrationQualification.CALIBRATED) implies
                (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY)) &
              (((preparationState != PreparationState.PREPARATION_CALIBRATED |
                 calibrationQualification == CalibrationQualification.CALIBRATED) &
                monitoringState == MonitoringState.MONITORING_ACTIVE) implies
                (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY)) &
              (((preparationState != PreparationState.PREPARATION_CALIBRATED |
                 calibrationQualification == CalibrationQualification.CALIBRATED) &
                monitoringState != MonitoringState.MONITORING_ACTIVE) implies
                (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY));
          // @trace CASE-11
          case CASE_11_ACQUISITION_FAULT "Qualified preparation with unavailable acquisition holds only active monitoring":
            assume beltAssessment.qualified == T &
              calibrationQualification == CalibrationQualification.CALIBRATED &
              preparationState == PreparationState.PREPARATION_CALIBRATED &
              acquisitionObservation == AcquisitionObservation.ACQUISITION_FAULT;
            guarantee eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_FAULT_CONDITION &
              eligibilityEnvelope.beltQualified == T & eligibilityEnvelope.calibrationQualified == T &
              ((monitoringState == MonitoringState.MONITORING_ACTIVE) implies
                (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY)) &
              ((monitoringState != MonitoringState.MONITORING_ACTIVE) implies
                (eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY));
          // @trace CASE-12
          case CASE_12_ACQUISITION_READY "All supplied qualifications and availability yield ready without recovery":
            assume beltAssessment.qualified == T &
              calibrationQualification == CalibrationQualification.CALIBRATED &
              preparationState == PreparationState.PREPARATION_CALIBRATED &
              acquisitionObservation == AcquisitionObservation.ACQUISITION_AVAILABLE;
            guarantee eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY &
              eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY &
              eligibilityEnvelope.beltQualified == T & eligibilityEnvelope.calibrationQualified == T;
    }*/
  }

  // @trace PART-04
  part def RequestArbiter :> Thread {
    // @trace INT-01
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    // @trace INT-02
    port technicianRequest : DataPort { in :>> type : TechnicianRequest; }
    // @trace INT-12
    port eligibilityEnvelope : DataPort { in :>> type : EligibilityEnvelope; }
    // @trace INT-13
    port arbitrationDecision : DataPort { out :>> type : ArbitrationDecision; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_ARBITRATION "Initial arbitration applies the same complete priority relation as a logical evaluation":
            ((doctorRequest == DoctorRequest.STOP_MONITORING) implies
              (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT)) &
            ((doctorRequest != DoctorRequest.STOP_MONITORING &
              eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY) implies
              (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT)) &
            ((doctorRequest != DoctorRequest.STOP_MONITORING &
              eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY) implies
              (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT));
      compute
        compute_cases
          // @trace CASE-13
          case CASE_13_STOP_PRIORITY "Doctor stop preempts every concurrent recovery or technician fact":
            assume doctorRequest == DoctorRequest.STOP_MONITORING;
            guarantee arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT &
              (((eligibilityEnvelope.recovery != EligibilityEnvelopeRecovery.NO_RECOVERY |
                 technicianRequest != TechnicianRequest.NO_TECHNICIAN_REQUEST)) implies
                (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED)) &
              ((eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY &
                technicianRequest == TechnicianRequest.NO_TECHNICIAN_REQUEST) implies
                (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED));
          // @trace CASE-14
          case CASE_14_RECOVERY_PRIORITY "Without stop, recovery preempts every concurrent fresh request":
            assume doctorRequest != DoctorRequest.STOP_MONITORING &
              eligibilityEnvelope.recovery != EligibilityEnvelopeRecovery.NO_RECOVERY;
            guarantee
              ((eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.RESET_PREPARATION_RECOVERY) implies
                (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT)) &
              ((eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.HOLD_MONITORING_RECOVERY) implies
                (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT)) &
              (((doctorRequest == DoctorRequest.START_MONITORING |
                 technicianRequest != TechnicianRequest.NO_TECHNICIAN_REQUEST)) implies
                (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED)) &
              ((doctorRequest != DoctorRequest.START_MONITORING &
                technicianRequest == TechnicianRequest.NO_TECHNICIAN_REQUEST) implies
                (arbitrationDecision.disposition == ArbitrationDecisionDisposition.RECOVERY_APPLIED));
          // @trace CASE-15
          case CASE_15_TECHNICIAN_PRIORITY_AND_APPLICABILITY "A selected technician request either derives an applicable intent or rejects without falling through":
            assume doctorRequest != DoctorRequest.STOP_MONITORING &
              eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY &
              technicianRequest != TechnicianRequest.NO_TECHNICIAN_REQUEST;
            guarantee
              ((technicianRequest == TechnicianRequest.RESET_PREPARATION) implies
                (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT &
                 ((doctorRequest == DoctorRequest.START_MONITORING) implies
                   (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED)) &
                 ((doctorRequest != DoctorRequest.START_MONITORING) implies
                   (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED)))) &
              ((technicianRequest == TechnicianRequest.CONFIRM_BELT &
                eligibilityEnvelope.beltQualified == T &
                eligibilityEnvelope.preparationState != EligibilityEnvelopePreparationState.PREPARATION_CALIBRATED) implies
                (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT &
                 ((doctorRequest == DoctorRequest.START_MONITORING) implies
                   (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED)) &
                 ((doctorRequest != DoctorRequest.START_MONITORING) implies
                   (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED)))) &
              ((technicianRequest == TechnicianRequest.RECORD_CALIBRATION &
                eligibilityEnvelope.beltQualified == T & eligibilityEnvelope.calibrationQualified == T &
                eligibilityEnvelope.preparationState != EligibilityEnvelopePreparationState.UNPREPARED) implies
                (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT &
                 ((doctorRequest == DoctorRequest.START_MONITORING) implies
                   (arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED)) &
                 ((doctorRequest != DoctorRequest.START_MONITORING) implies
                   (arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED)))) &
              (((technicianRequest == TechnicianRequest.CONFIRM_BELT &
                 (eligibilityEnvelope.beltQualified == F |
                  eligibilityEnvelope.preparationState == EligibilityEnvelopePreparationState.PREPARATION_CALIBRATED)) |
                (technicianRequest == TechnicianRequest.RECORD_CALIBRATION &
                 (eligibilityEnvelope.beltQualified == F | eligibilityEnvelope.calibrationQualified == F |
                  eligibilityEnvelope.preparationState == EligibilityEnvelopePreparationState.UNPREPARED))) implies
                (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT &
                 arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED));
          // @trace CASE-16
          case CASE_16_START_OR_NO_REQUEST "Without stop, recovery, or technician request, start is admitted only by the supplied ready envelope":
            assume doctorRequest != DoctorRequest.STOP_MONITORING &
              eligibilityEnvelope.recovery == EligibilityEnvelopeRecovery.NO_RECOVERY &
              technicianRequest == TechnicianRequest.NO_TECHNICIAN_REQUEST;
            guarantee
              ((doctorRequest == DoctorRequest.START_MONITORING &
                eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY) implies
                (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT &
                 arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED)) &
              ((doctorRequest == DoctorRequest.START_MONITORING &
                eligibilityEnvelope.condition != EligibilityEnvelopeCondition.ACQUISITION_READY) implies
                (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT &
                 arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED)) &
              ((doctorRequest == DoctorRequest.NO_DOCTOR_REQUEST) implies
                (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT &
                 arbitrationDecision.disposition == ArbitrationDecisionDisposition.NO_REQUEST_DISPOSITION));
    }*/
  }

  // @trace PART-05
  part def PreparationStateGovernor :> Thread {
    // @trace INT-13
    port arbitrationDecision : DataPort { in :>> type : ArbitrationDecision; }
    // @trace INT-10
    port preparationState : DataPort { out :>> type : PreparationState; }
    // @trace INT-14
    port preparationDecision : DataPort { out :>> type : PreparationDecisionSnapshot; }

    language "GUMBO" /*{
      state
        // @trace OWNER-05
        committedPreparationState : PreparationState;
      initialize
        guarantee
          // @trace INIT-01
          INIT_PREPARATION_STATE "Preparation and its complete decision snapshot initialize unprepared":
            committedPreparationState == PreparationState.UNPREPARED &
            preparationState == PreparationState.UNPREPARED &
            preparationDecision.preState == PreparationDecisionPreState.UNPREPARED &
            preparationDecision.nextState == PreparationDecisionNextState.UNPREPARED &
            preparationDecision.effectiveIntent == PreparationDecisionIntent.NO_INTENT &
            preparationDecision.disposition == PreparationDecisionDisposition.NO_REQUEST_DISPOSITION;
      compute
        guarantee
          // @trace INT-10
          PUBLISH_PREPARATION_PRE_STATE "Only this governor publishes its committed pre-evaluation state":
            preparationState == In(committedPreparationState);
        guarantee
          // @trace TYPE-12
          PROJECT_PREPARATION_SNAPSHOT "The snapshot projects pre-state, post-state, intent, and disposition field by field":
            ((In(committedPreparationState) == PreparationState.UNPREPARED) implies
              (preparationDecision.preState == PreparationDecisionPreState.UNPREPARED)) &
            ((In(committedPreparationState) == PreparationState.BELT_CONFIRMED) implies
              (preparationDecision.preState == PreparationDecisionPreState.BELT_CONFIRMED)) &
            ((In(committedPreparationState) == PreparationState.PREPARATION_CALIBRATED) implies
              (preparationDecision.preState == PreparationDecisionPreState.PREPARATION_CALIBRATED)) &
            ((committedPreparationState == PreparationState.UNPREPARED) implies
              (preparationDecision.nextState == PreparationDecisionNextState.UNPREPARED)) &
            ((committedPreparationState == PreparationState.BELT_CONFIRMED) implies
              (preparationDecision.nextState == PreparationDecisionNextState.BELT_CONFIRMED)) &
            ((committedPreparationState == PreparationState.PREPARATION_CALIBRATED) implies
              (preparationDecision.nextState == PreparationDecisionNextState.PREPARATION_CALIBRATED)) &
            ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT) implies
              (preparationDecision.effectiveIntent == PreparationDecisionIntent.NO_INTENT)) &
            ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT) implies
              (preparationDecision.effectiveIntent == PreparationDecisionIntent.STOP_INTENT)) &
            ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT) implies
              (preparationDecision.effectiveIntent == PreparationDecisionIntent.RESET_PREPARATION_INTENT)) &
            ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT) implies
              (preparationDecision.effectiveIntent == PreparationDecisionIntent.HOLD_MONITORING_INTENT)) &
            ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT) implies
              (preparationDecision.effectiveIntent == PreparationDecisionIntent.CONFIRM_BELT_INTENT)) &
            ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT) implies
              (preparationDecision.effectiveIntent == PreparationDecisionIntent.RECORD_CALIBRATION_INTENT)) &
            ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT) implies
              (preparationDecision.effectiveIntent == PreparationDecisionIntent.START_MONITORING_INTENT)) &
            ((arbitrationDecision.disposition == ArbitrationDecisionDisposition.NO_REQUEST_DISPOSITION) implies
              (preparationDecision.disposition == PreparationDecisionDisposition.NO_REQUEST_DISPOSITION)) &
            ((arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED) implies
              (preparationDecision.disposition == PreparationDecisionDisposition.ACCEPTED)) &
            ((arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) implies
              (preparationDecision.disposition == PreparationDecisionDisposition.REJECTED)) &
            ((arbitrationDecision.disposition == ArbitrationDecisionDisposition.RECOVERY_APPLIED) implies
              (preparationDecision.disposition == PreparationDecisionDisposition.RECOVERY_APPLIED)) &
            ((arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED) implies
              (preparationDecision.disposition == PreparationDecisionDisposition.PREEMPTED));
        compute_cases
          // @trace CASE-07
          case CASE_07_RESET_OR_RETAIN_PREPARATION "Reset clears preparation while stop, hold, start, and no intent retain pre-state":
            assume arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT |
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT |
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT |
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT |
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT;
            guarantee
              ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT) implies
                (committedPreparationState == PreparationState.UNPREPARED)) &
              ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT) implies
                (committedPreparationState == In(committedPreparationState)));
          // @trace CASE-17
          case CASE_17_ADVANCE_PREPARATION "Already-qualified confirmation and calibration intents commit their respective states":
            assume arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT |
              arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT;
            guarantee
              ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT) implies
                (committedPreparationState == PreparationState.BELT_CONFIRMED)) &
              ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT) implies
                (committedPreparationState == PreparationState.PREPARATION_CALIBRATED));
    }*/
  }

  // @trace PART-06
  part def MonitoringStateGovernor :> Thread {
    // @trace INT-14
    port preparationDecision : DataPort { in :>> type : PreparationDecisionSnapshot; }
    // @trace INT-15
    port arbitrationDecision : DataPort { in :>> type : ArbitrationDecision; }
    // @trace INT-16
    port eligibilityEnvelope : DataPort { in :>> type : EligibilityEnvelope; }
    // @trace INT-11
    port monitoringState : DataPort { out :>> type : MonitoringState; }
    // @trace INT-17
    port monitoringDecision : DataPort { out :>> type : MonitoringDecisionSnapshot; }

    language "GUMBO" /*{
      state
        // @trace OWNER-06
        committedMonitoringState : MonitoringState;
      initialize
        guarantee
          // @trace INIT-01
          INIT_MONITORING_STATE "Monitoring and its complete decision snapshot initialize inactive":
            committedMonitoringState == MonitoringState.MONITORING_INACTIVE &
            monitoringState == MonitoringState.MONITORING_INACTIVE &
            monitoringDecision.preState == MonitoringDecisionPreState.MONITORING_INACTIVE &
            monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_INACTIVE &
            monitoringDecision.effectiveIntent == MonitoringDecisionIntent.NO_INTENT &
            monitoringDecision.disposition == MonitoringDecisionDisposition.NO_REQUEST_DISPOSITION &
            monitoringDecision.notice == MonitoringDecisionNotice.NONE &
            monitoringDecision.preparationState == MonitoringDecisionPreparationState.UNPREPARED;
      compute
        guarantee
          // @trace INT-11
          PUBLISH_MONITORING_PRE_STATE "Only this governor publishes its committed pre-evaluation state":
            monitoringState == In(committedMonitoringState);
        guarantee
          // @trace TYPE-13
          PROJECT_MONITORING_STATES "The monitoring snapshot projects pre-state, post-state, and committed preparation":
            ((In(committedMonitoringState) == MonitoringState.MONITORING_INACTIVE) implies
              (monitoringDecision.preState == MonitoringDecisionPreState.MONITORING_INACTIVE)) &
            ((In(committedMonitoringState) == MonitoringState.MONITORING_ACTIVE) implies
              (monitoringDecision.preState == MonitoringDecisionPreState.MONITORING_ACTIVE)) &
            ((In(committedMonitoringState) == MonitoringState.MONITORING_HELD) implies
              (monitoringDecision.preState == MonitoringDecisionPreState.MONITORING_HELD)) &
            ((committedMonitoringState == MonitoringState.MONITORING_INACTIVE) implies
              (monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_INACTIVE)) &
            ((committedMonitoringState == MonitoringState.MONITORING_ACTIVE) implies
              (monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE)) &
            ((committedMonitoringState == MonitoringState.MONITORING_HELD) implies
              (monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_HELD)) &
            ((preparationDecision.nextState == PreparationDecisionNextState.UNPREPARED) implies
              (monitoringDecision.preparationState == MonitoringDecisionPreparationState.UNPREPARED)) &
            ((preparationDecision.nextState == PreparationDecisionNextState.BELT_CONFIRMED) implies
              (monitoringDecision.preparationState == MonitoringDecisionPreparationState.BELT_CONFIRMED)) &
            ((preparationDecision.nextState == PreparationDecisionNextState.PREPARATION_CALIBRATED) implies
              (monitoringDecision.preparationState == MonitoringDecisionPreparationState.PREPARATION_CALIBRATED));
        guarantee
          // @trace TYPE-13
          PROJECT_MONITORING_DECISION "The monitoring snapshot preserves the arbiter's intent and disposition through field-specific classifiers":
            ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.NO_INTENT) implies
              (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.NO_INTENT)) &
            ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT) implies
              (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.STOP_INTENT)) &
            ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT) implies
              (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.RESET_PREPARATION_INTENT)) &
            ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT) implies
              (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.HOLD_MONITORING_INTENT)) &
            ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.CONFIRM_BELT_INTENT) implies
              (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.CONFIRM_BELT_INTENT)) &
            ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RECORD_CALIBRATION_INTENT) implies
              (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.RECORD_CALIBRATION_INTENT)) &
            ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT) implies
              (monitoringDecision.effectiveIntent == MonitoringDecisionIntent.START_MONITORING_INTENT)) &
            ((arbitrationDecision.disposition == ArbitrationDecisionDisposition.NO_REQUEST_DISPOSITION) implies
              (monitoringDecision.disposition == MonitoringDecisionDisposition.NO_REQUEST_DISPOSITION)) &
            ((arbitrationDecision.disposition == ArbitrationDecisionDisposition.ACCEPTED) implies
              (monitoringDecision.disposition == MonitoringDecisionDisposition.ACCEPTED)) &
            ((arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) implies
              (monitoringDecision.disposition == MonitoringDecisionDisposition.REJECTED)) &
            ((arbitrationDecision.disposition == ArbitrationDecisionDisposition.RECOVERY_APPLIED) implies
              (monitoringDecision.disposition == MonitoringDecisionDisposition.RECOVERY_APPLIED)) &
            ((arbitrationDecision.disposition == ArbitrationDecisionDisposition.PREEMPTED) implies
              (monitoringDecision.disposition == MonitoringDecisionDisposition.PREEMPTED));
        compute_cases
          // @trace CASE-18
          case CASE_18_MONITORING_TRANSITION_AND_NOTICE "The sole monitoring owner applies stop, recovery, guarded start, retention, and notice priority":
            guarantee
              ((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.STOP_INTENT) implies
                (committedMonitoringState == MonitoringState.MONITORING_INACTIVE)) &
              ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.STOP_INTENT &
                In(committedMonitoringState) == MonitoringState.MONITORING_ACTIVE &
                (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT |
                 arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT)) implies
                (committedMonitoringState == MonitoringState.MONITORING_HELD)) &
              ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.STOP_INTENT &
                arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT &
                eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY) implies
                (committedMonitoringState == MonitoringState.MONITORING_ACTIVE)) &
              ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.STOP_INTENT &
                not (In(committedMonitoringState) == MonitoringState.MONITORING_ACTIVE &
                     (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT |
                      arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT)) &
                not (arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.START_MONITORING_INTENT &
                     eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY)) implies
                (committedMonitoringState == In(committedMonitoringState))) &
              (((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT |
                 arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT |
                 arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) &
                eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_UNAVAILABLE_CONDITION) implies
                (monitoringDecision.notice == MonitoringDecisionNotice.BELT_OBSERVATION_UNAVAILABLE)) &
              (((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT |
                 arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT |
                 arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) &
                eligibilityEnvelope.condition == EligibilityEnvelopeCondition.BELT_ABSENT_CONDITION) implies
                (monitoringDecision.notice == MonitoringDecisionNotice.BELT_NOT_CONFIRMED)) &
              (((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT |
                 arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT |
                 arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) &
                eligibilityEnvelope.condition == EligibilityEnvelopeCondition.CALIBRATION_NOT_READY_CONDITION) implies
                (monitoringDecision.notice == MonitoringDecisionNotice.CALIBRATION_NOT_READY)) &
              (((arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT |
                 arbitrationDecision.effectiveIntent == ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT |
                 arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED) &
                eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_FAULT_CONDITION) implies
                (monitoringDecision.notice == MonitoringDecisionNotice.ACQUISITION_UNAVAILABLE)) &
              ((arbitrationDecision.disposition == ArbitrationDecisionDisposition.REJECTED &
                eligibilityEnvelope.condition == EligibilityEnvelopeCondition.ACQUISITION_READY) implies
                (monitoringDecision.notice == MonitoringDecisionNotice.INAPPLICABLE_REQUEST)) &
              ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT &
                arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT &
                arbitrationDecision.disposition != ArbitrationDecisionDisposition.REJECTED &
                committedMonitoringState == MonitoringState.MONITORING_HELD) implies
                (monitoringDecision.notice == MonitoringDecisionNotice.MONITORING_HELD_NOTICE)) &
              ((arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.RESET_PREPARATION_INTENT &
                arbitrationDecision.effectiveIntent != ArbitrationDecisionEffectiveIntent.HOLD_MONITORING_INTENT &
                arbitrationDecision.disposition != ArbitrationDecisionDisposition.REJECTED &
                committedMonitoringState != MonitoringState.MONITORING_HELD) implies
                (monitoringDecision.notice == MonitoringDecisionNotice.NONE));
    }*/
  }

  // @trace PART-07
  part def AcquisitionCommandPolicy :> Thread {
    // @trace INT-17
    port monitoringDecision : DataPort { in :>> type : MonitoringDecisionSnapshot; }
    // @trace INT-19
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_ACQUISITION_COMMAND "The logical collection command initializes disabled":
            acquisitionCommand == AcquisitionCommand.DO_NOT_COLLECT;
      compute
        compute_cases
          // @trace CASE-19
          case CASE_19_ACTIVE_COLLECTION_CLASSIFICATION "Collection is requested exactly for the committed active monitoring decision":
            guarantee
              ((monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE) implies
                (acquisitionCommand == AcquisitionCommand.COLLECT)) &
              ((monitoringDecision.nextState != MonitoringDecisionNextState.MONITORING_ACTIVE) implies
                (acquisitionCommand == AcquisitionCommand.DO_NOT_COLLECT));
    }*/
  }

  // @trace PART-08
  part def SessionPublicationPolicy :> Thread {
    // @trace INT-06
    port impedanceFrame : DataPort { in :>> type : ImpedanceFrameObservation; }
    // @trace INT-18
    port monitoringDecision : DataPort { in :>> type : MonitoringDecisionSnapshot; }
    // @trace INT-20
    port frameDelivery : DataPort { out :>> type : FrameDelivery; }
    // @trace INT-21
    port sessionStatus : DataPort { out :>> type : SessionStatus; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_PUBLICATION "Delivery and the complete shared status initialize to the explicit safe values":
            frameDelivery == FrameDelivery.NO_DELIVERY &
            sessionStatus.preparationState == SessionStatusPreparationState.UNPREPARED &
            sessionStatus.monitoringState == SessionStatusMonitoringState.MONITORING_INACTIVE &
            sessionStatus.disposition == SessionStatusDisposition.NO_REQUEST_DISPOSITION &
            sessionStatus.notice == SessionStatusNotice.NONE;
      compute
        guarantee
          // @trace TYPE-14
          PROJECT_SESSION_STATUS "Shared status projects committed preparation, monitoring, and disposition field by field":
            ((monitoringDecision.preparationState == MonitoringDecisionPreparationState.UNPREPARED) implies
              (sessionStatus.preparationState == SessionStatusPreparationState.UNPREPARED)) &
            ((monitoringDecision.preparationState == MonitoringDecisionPreparationState.BELT_CONFIRMED) implies
              (sessionStatus.preparationState == SessionStatusPreparationState.BELT_CONFIRMED)) &
            ((monitoringDecision.preparationState == MonitoringDecisionPreparationState.PREPARATION_CALIBRATED) implies
              (sessionStatus.preparationState == SessionStatusPreparationState.PREPARATION_CALIBRATED)) &
            ((monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_INACTIVE) implies
              (sessionStatus.monitoringState == SessionStatusMonitoringState.MONITORING_INACTIVE)) &
            ((monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE) implies
              (sessionStatus.monitoringState == SessionStatusMonitoringState.MONITORING_ACTIVE)) &
            ((monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_HELD) implies
              (sessionStatus.monitoringState == SessionStatusMonitoringState.MONITORING_HELD)) &
            ((monitoringDecision.disposition == MonitoringDecisionDisposition.NO_REQUEST_DISPOSITION) implies
              (sessionStatus.disposition == SessionStatusDisposition.NO_REQUEST_DISPOSITION)) &
            ((monitoringDecision.disposition == MonitoringDecisionDisposition.ACCEPTED) implies
              (sessionStatus.disposition == SessionStatusDisposition.ACCEPTED)) &
            ((monitoringDecision.disposition == MonitoringDecisionDisposition.REJECTED) implies
              (sessionStatus.disposition == SessionStatusDisposition.REJECTED)) &
            ((monitoringDecision.disposition == MonitoringDecisionDisposition.RECOVERY_APPLIED) implies
              (sessionStatus.disposition == SessionStatusDisposition.RECOVERY_APPLIED)) &
            ((monitoringDecision.disposition == MonitoringDecisionDisposition.PREEMPTED) implies
              (sessionStatus.disposition == SessionStatusDisposition.PREEMPTED));
        compute_cases
          // @trace CASE-20
          case CASE_20_FRAME_ADMISSION_AND_NOTICE "Publication admits only active valid frames and applies monitoring notice before frame notices":
            guarantee
              ((monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE &
                impedanceFrame == ImpedanceFrameObservation.FRAME_A) implies
                (frameDelivery == FrameDelivery.DELIVER_FRAME_A)) &
              ((monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE &
                impedanceFrame == ImpedanceFrameObservation.FRAME_B) implies
                (frameDelivery == FrameDelivery.DELIVER_FRAME_B)) &
              ((monitoringDecision.nextState != MonitoringDecisionNextState.MONITORING_ACTIVE |
                impedanceFrame == ImpedanceFrameObservation.NO_FRAME |
                impedanceFrame == ImpedanceFrameObservation.INVALID_FRAME) implies
                (frameDelivery == FrameDelivery.NO_DELIVERY)) &
              ((monitoringDecision.notice == MonitoringDecisionNotice.BELT_OBSERVATION_UNAVAILABLE) implies
                (sessionStatus.notice == SessionStatusNotice.BELT_OBSERVATION_UNAVAILABLE)) &
              ((monitoringDecision.notice == MonitoringDecisionNotice.BELT_NOT_CONFIRMED) implies
                (sessionStatus.notice == SessionStatusNotice.BELT_NOT_CONFIRMED)) &
              ((monitoringDecision.notice == MonitoringDecisionNotice.CALIBRATION_NOT_READY) implies
                (sessionStatus.notice == SessionStatusNotice.CALIBRATION_NOT_READY)) &
              ((monitoringDecision.notice == MonitoringDecisionNotice.ACQUISITION_UNAVAILABLE) implies
                (sessionStatus.notice == SessionStatusNotice.ACQUISITION_UNAVAILABLE)) &
              ((monitoringDecision.notice == MonitoringDecisionNotice.MONITORING_HELD_NOTICE) implies
                (sessionStatus.notice == SessionStatusNotice.MONITORING_HELD_NOTICE)) &
              ((monitoringDecision.notice == MonitoringDecisionNotice.INAPPLICABLE_REQUEST) implies
                (sessionStatus.notice == SessionStatusNotice.INAPPLICABLE_REQUEST)) &
              ((monitoringDecision.notice == MonitoringDecisionNotice.NONE &
                monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE &
                impedanceFrame == ImpedanceFrameObservation.INVALID_FRAME) implies
                (sessionStatus.notice == SessionStatusNotice.FRAME_REJECTED)) &
              ((monitoringDecision.notice == MonitoringDecisionNotice.NONE &
                monitoringDecision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE &
                impedanceFrame == ImpedanceFrameObservation.NO_FRAME) implies
                (sessionStatus.notice == SessionStatusNotice.WAITING_FOR_FRAME)) &
              ((monitoringDecision.notice == MonitoringDecisionNotice.NONE &
                (monitoringDecision.nextState != MonitoringDecisionNextState.MONITORING_ACTIVE |
                 impedanceFrame == ImpedanceFrameObservation.FRAME_A |
                 impedanceFrame == ImpedanceFrameObservation.FRAME_B)) implies
                (sessionStatus.notice == SessionStatusNotice.NONE));
    }*/
  }

  // @generated-support behavior-free containment required by BOUND-06
  part def AcquisitionCoordinationProcess :> Process {
    // @generated-support root-to-Process route for MON-01
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    // @generated-support root-to-Process route for MON-02
    port technicianRequest : DataPort { in :>> type : TechnicianRequest; }
    // @generated-support root-to-Process route for MON-03
    port beltObservation : DataPort { in :>> type : BeltObservation; }
    // @generated-support root-to-Process route for MON-04
    port calibrationObservation : DataPort { in :>> type : CalibrationObservation; }
    // @generated-support root-to-Process route for MON-05
    port acquisitionObservation : DataPort { in :>> type : AcquisitionObservation; }
    // @generated-support root-to-Process route for MON-06
    port impedanceFrame : DataPort { in :>> type : ImpedanceFrameObservation; }
    // @generated-support Process-to-root route for CTRL-01
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }
    // @generated-support Process-to-root route for CTRL-02
    port frameDelivery : DataPort { out :>> type : FrameDelivery; }
    // @generated-support Process-to-root route for CTRL-03
    port sessionStatus : DataPort { out :>> type : SessionStatus; }

    // @trace PART-01
    part beltQualificationOwner : BeltQualificationOwner;
    // @trace PART-02
    part calibrationQualificationOwner : CalibrationQualificationOwner;
    // @trace PART-03
    part acquisitionEligibilityOwner : AcquisitionEligibilityOwner;
    // @trace PART-04
    part requestArbiter : RequestArbiter;
    // @trace PART-05
    part preparationStateGovernor : PreparationStateGovernor;
    // @trace PART-06
    part monitoringStateGovernor : MonitoringStateGovernor;
    // @trace PART-07
    part acquisitionCommandPolicy : AcquisitionCommandPolicy;
    // @trace PART-08
    part sessionPublicationPolicy : SessionPublicationPolicy;

    // @trace INT-01
    connection int01 : PortConnection connect doctorRequest to requestArbiter.doctorRequest;
    // @trace INT-02
    connection int02 : PortConnection connect technicianRequest to requestArbiter.technicianRequest;
    // @trace INT-03
    connection int03 : PortConnection connect beltObservation to beltQualificationOwner.beltObservation;
    // @trace INT-04
    connection int04 : PortConnection connect calibrationObservation to calibrationQualificationOwner.calibrationObservation;
    // @trace INT-05
    connection int05 : PortConnection connect acquisitionObservation to acquisitionEligibilityOwner.acquisitionObservation;
    // @trace INT-06
    connection int06 : PortConnection connect impedanceFrame to sessionPublicationPolicy.impedanceFrame;
    // @trace INT-07
    connection int07 : PortConnection connect beltQualificationOwner.beltAssessment to calibrationQualificationOwner.beltAssessment;
    // @trace INT-08
    connection int08 : PortConnection connect beltQualificationOwner.beltAssessment to acquisitionEligibilityOwner.beltAssessment;
    // @trace INT-09
    connection int09 : PortConnection connect calibrationQualificationOwner.calibrationQualification to acquisitionEligibilityOwner.calibrationQualification;
    // @trace INT-10
    connection int10 : PortConnection connect preparationStateGovernor.preparationState to acquisitionEligibilityOwner.preparationState;
    // @trace INT-11
    connection int11 : PortConnection connect monitoringStateGovernor.monitoringState to acquisitionEligibilityOwner.monitoringState;
    // @trace INT-12
    connection int12 : PortConnection connect acquisitionEligibilityOwner.eligibilityEnvelope to requestArbiter.eligibilityEnvelope;
    // @trace INT-13
    connection int13 : PortConnection connect requestArbiter.arbitrationDecision to preparationStateGovernor.arbitrationDecision;
    // @trace INT-14
    connection int14 : PortConnection connect preparationStateGovernor.preparationDecision to monitoringStateGovernor.preparationDecision;
    // @trace INT-15
    connection int15 : PortConnection connect requestArbiter.arbitrationDecision to monitoringStateGovernor.arbitrationDecision;
    // @trace INT-16
    connection int16 : PortConnection connect acquisitionEligibilityOwner.eligibilityEnvelope to monitoringStateGovernor.eligibilityEnvelope;
    // @trace INT-17
    connection int17 : PortConnection connect monitoringStateGovernor.monitoringDecision to acquisitionCommandPolicy.monitoringDecision;
    // @trace INT-18
    connection int18 : PortConnection connect monitoringStateGovernor.monitoringDecision to sessionPublicationPolicy.monitoringDecision;
    // @trace INT-19
    connection int19 : PortConnection connect acquisitionCommandPolicy.acquisitionCommand to acquisitionCommand;
    // @trace INT-20
    connection int20 : PortConnection connect sessionPublicationPolicy.frameDelivery to frameDelivery;
    // @trace INT-21
    connection int21 : PortConnection connect sessionPublicationPolicy.sessionStatus to sessionStatus;
  }

  // @trace SCOPE-IN-01
  part def EITAcquisitionSessionCoordinator :> System {
    // @trace MON-01
    port doctorRequest : DataPort { in :>> type : DoctorRequest; }
    // @trace MON-02
    port technicianRequest : DataPort { in :>> type : TechnicianRequest; }
    // @trace MON-03
    port beltObservation : DataPort { in :>> type : BeltObservation; }
    // @trace MON-04
    port calibrationObservation : DataPort { in :>> type : CalibrationObservation; }
    // @trace MON-05
    port acquisitionObservation : DataPort { in :>> type : AcquisitionObservation; }
    // @trace MON-06
    port impedanceFrame : DataPort { in :>> type : ImpedanceFrameObservation; }
    // @trace CTRL-01
    port acquisitionCommand : DataPort { out :>> type : AcquisitionCommand; }
    // @trace CTRL-02
    port frameDelivery : DataPort { out :>> type : FrameDelivery; }
    // @trace CTRL-03
    port sessionStatus : DataPort { out :>> type : SessionStatus; }

    // @generated-support behavior-free containment usage required by BOUND-06
    part acquisitionCoordinationProcess : AcquisitionCoordinationProcess;

    // @generated-support support route for MON-01
    connection supportDoctorRequest : PortConnection connect doctorRequest to acquisitionCoordinationProcess.doctorRequest;
    // @generated-support support route for MON-02
    connection supportTechnicianRequest : PortConnection connect technicianRequest to acquisitionCoordinationProcess.technicianRequest;
    // @generated-support support route for MON-03
    connection supportBeltObservation : PortConnection connect beltObservation to acquisitionCoordinationProcess.beltObservation;
    // @generated-support support route for MON-04
    connection supportCalibrationObservation : PortConnection connect calibrationObservation to acquisitionCoordinationProcess.calibrationObservation;
    // @generated-support support route for MON-05
    connection supportAcquisitionObservation : PortConnection connect acquisitionObservation to acquisitionCoordinationProcess.acquisitionObservation;
    // @generated-support support route for MON-06
    connection supportImpedanceFrame : PortConnection connect impedanceFrame to acquisitionCoordinationProcess.impedanceFrame;
    // @generated-support support route for CTRL-01
    connection supportAcquisitionCommand : PortConnection connect acquisitionCoordinationProcess.acquisitionCommand to acquisitionCommand;
    // @generated-support support route for CTRL-02
    connection supportFrameDelivery : PortConnection connect acquisitionCoordinationProcess.frameDelivery to frameDelivery;
    // @generated-support support route for CTRL-03
    connection supportSessionStatus : PortConnection connect acquisitionCoordinationProcess.sessionStatus to sessionStatus;
  }

  // @trace SCOPE-IN-01
  part eitAcquisitionSessionCoordinator : EITAcquisitionSessionCoordinator;
}
