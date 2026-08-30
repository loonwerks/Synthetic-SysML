// @trace SCOPE-IN-01
package Observation_Acquisition_Radio_Delivery_Coordinator {
  private import HAMR::*;

  // @trace MON-01
  enum def ObservationIntent {
    enum NO_REQUEST;
    enum START_OBSERVATION;
    enum CANCEL_OBSERVATION;
  }

  // @trace MON-02
  enum def BatteryCapacityBand {
    enum LOW;
    enum USABLE;
  }

  // @trace MON-03
  enum def BatteryCheck {
    enum INVALID;
    enum VALID;
  }

  // @trace MON-04
  enum def SortieContext {
    enum OUTSIDE_OBSERVATION_POSITION;
    enum AT_OBSERVATION_POSITION;
  }

  // @trace MON-05
  enum def CameraCondition {
    enum UNAVAILABLE;
    enum READY;
  }

  // @trace MON-06
  enum def CaptureResult {
    enum NONE;
    enum CAPTURED;
    enum FAILED;
  }

  // @trace MON-07
  enum def RadioCondition {
    enum UNAVAILABLE;
    enum READY;
  }

  // @trace MON-08
  enum def DeliveryResult {
    enum NONE;
    enum ACCEPTED;
    enum REJECTED;
  }

  // @trace CTRL-01
  enum def CameraAcquisitionCommand {
    enum HOLD;
    enum ACQUIRE;
  }

  // @trace CTRL-02
  enum def RadioDeliveryCommand {
    enum HOLD;
    enum SEND_OBSERVATION;
  }

  // @trace CTRL-04
  enum def DroneControlObservationNotice {
    enum IDLE;
    enum OBSERVATION_ACTIVE;
    enum OBSERVATION_BLOCKED;
    enum DELIVERY_REPORTED;
  }

  // @trace TYPE-01
  enum def BatteryAssessment {
    enum UNAVAILABLE;
    enum LOW;
    enum ADEQUATE;
  }

  // @trace TYPE-02
  enum def SortieQualification {
    enum BLOCKED_EVIDENCE;
    enum BLOCKED_ENERGY;
    enum BLOCKED_CONTEXT;
    enum ELIGIBLE;
  }

  // @trace TYPE-03
  enum def CameraEvidence {
    enum UNAVAILABLE;
    enum READY;
    enum CAPTURED;
    enum FAILED;
  }

  // @trace TYPE-04
  enum def RadioEvidence {
    enum UNAVAILABLE;
    enum READY;
    enum ACCEPTED;
    enum REJECTED;
  }

  // @trace TYPE-05
  enum def ObservationSessionState {
    enum IDLE;
    enum ACQUIRING;
    enum QUEUED;
    enum SENDING;
    enum SUSPENDED;
  }

  // @trace TYPE-06
  enum def SessionProposal {
    enum BLOCK_EVIDENCE;
    enum BLOCK_ENERGY;
    enum BLOCK_CONTEXT;
    enum BLOCK_CAMERA;
    enum BLOCK_RADIO;
    enum RECOVER_EVIDENCE;
    enum RECOVER_ENERGY;
    enum RECOVER_CONTEXT;
    enum RECOVER_CAMERA;
    enum RECOVER_RADIO;
    enum STARTABLE;
    enum HOLD;
    enum CAPTURE_COMPLETE;
    enum BEGIN_DELIVERY;
    enum DELIVERY_COMPLETE;
    enum DELIVERY_REJECTED;
  }

  // @trace TYPE-07
  enum def SessionDecision {
    enum NO_CHANGE;
    enum BEGIN_ACQUISITION;
    enum CANCEL_TO_IDLE;
    enum SUSPEND_EVIDENCE;
    enum SUSPEND_ENERGY;
    enum SUSPEND_CONTEXT;
    enum SUSPEND_CAMERA;
    enum SUSPEND_RADIO;
    enum QUEUE_CAPTURE;
    enum BEGIN_TRANSMISSION;
    enum COMPLETE_TO_IDLE;
    enum RETRY_QUEUE;
    enum REJECT_EVIDENCE;
    enum REJECT_ENERGY;
    enum REJECT_CONTEXT;
    enum REJECT_CAMERA;
    enum REJECT_RADIO;
  }

  // @trace TYPE-08
  enum def CoordinationDisposition {
    enum NO_CHANGE;
    enum STARTED;
    enum CANCELLED;
    enum PROGRESSED;
    enum COMPLETED;
    enum RECOVERY_APPLIED;
    enum REJECTED;
  }

  // @trace TYPE-08
  enum def CoordinationReason {
    enum NONE;
    enum CANCELLED;
    enum EVIDENCE_UNAVAILABLE;
    enum ENERGY_LOW;
    enum CONTEXT_INELIGIBLE;
    enum CAMERA_UNUSABLE;
    enum RADIO_UNAVAILABLE;
  }

  // @trace TYPE-10
  enum def OperatorAdvisory {
    enum NONE;
    enum EVIDENCE_UNAVAILABLE;
    enum ENERGY_LOW;
    enum CONTEXT_INELIGIBLE;
    enum CAMERA_UNUSABLE;
    enum RADIO_UNAVAILABLE;
    enum REQUEST_REJECTED;
    enum DELIVERY_COMPLETED;
  }

  // @generated-support representation-only classifier for TYPE-09 pre-state
  enum def SnapshotPreSessionState {
    enum IDLE;
    enum ACQUIRING;
    enum QUEUED;
    enum SENDING;
    enum SUSPENDED;
  }

  // @generated-support representation-only classifier for TYPE-09 next-state
  enum def SnapshotNextSessionState {
    enum IDLE;
    enum ACQUIRING;
    enum QUEUED;
    enum SENDING;
    enum SUSPENDED;
  }

  // @generated-support representation-only classifier for TYPE-09 disposition
  enum def SnapshotCoordinationDisposition {
    enum NO_CHANGE;
    enum STARTED;
    enum CANCELLED;
    enum PROGRESSED;
    enum COMPLETED;
    enum RECOVERY_APPLIED;
    enum REJECTED;
  }

  // @generated-support representation-only classifier for TYPE-09 reason
  enum def SnapshotCoordinationReason {
    enum NONE;
    enum CANCELLED;
    enum EVIDENCE_UNAVAILABLE;
    enum ENERGY_LOW;
    enum CONTEXT_INELIGIBLE;
    enum CAMERA_UNUSABLE;
    enum RADIO_UNAVAILABLE;
  }

  // @generated-support representation-only classifier for CTRL-03 session
  enum def StatusSessionState {
    enum IDLE;
    enum ACQUIRING;
    enum QUEUED;
    enum SENDING;
    enum SUSPENDED;
  }

  // @generated-support representation-only classifier for CTRL-03 disposition
  enum def StatusCoordinationDisposition {
    enum NO_CHANGE;
    enum STARTED;
    enum CANCELLED;
    enum PROGRESSED;
    enum COMPLETED;
    enum RECOVERY_APPLIED;
    enum REJECTED;
  }

  // @generated-support representation-only classifier for CTRL-03 reason
  enum def StatusCoordinationReason {
    enum NONE;
    enum CANCELLED;
    enum EVIDENCE_UNAVAILABLE;
    enum ENERGY_LOW;
    enum CONTEXT_INELIGIBLE;
    enum CAMERA_UNUSABLE;
    enum RADIO_UNAVAILABLE;
  }

  // @trace TYPE-09
  part def SessionSnapshot :> Data {
    // @trace TYPE-09
    attribute preSession : SnapshotPreSessionState;
    // @trace TYPE-09
    attribute nextSession : SnapshotNextSessionState;
    // @trace TYPE-09
    attribute disposition : SnapshotCoordinationDisposition;
    // @trace TYPE-09
    attribute reason : SnapshotCoordinationReason;
  }

  // @trace CTRL-03
  part def OperatorCoordinationStatus :> Data {
    // @trace CTRL-03
    attribute nextSession : StatusSessionState;
    // @trace CTRL-03
    attribute batteryAssessment : BatteryAssessment;
    // @trace CTRL-03
    attribute disposition : StatusCoordinationDisposition;
    // @trace CTRL-03
    attribute reason : StatusCoordinationReason;
    // @trace CTRL-03
    attribute advisory : OperatorAdvisory;
  }

  // @trace PART-01
  part def BatteryEvidenceQualifier :> Thread {
    // @trace INT-01
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    // @trace INT-02
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    // @trace INT-09
    port batteryAssessment : DataPort { out :>> type : BatteryAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_BATTERY_ASSESSMENT "Initial battery assessment follows validity precedence":
            ((batteryCheck == BatteryCheck.INVALID) implies
              (batteryAssessment == BatteryAssessment.UNAVAILABLE)) &
            ((batteryCheck == BatteryCheck.VALID & batteryCapacity == BatteryCapacityBand.LOW) implies
              (batteryAssessment == BatteryAssessment.LOW)) &
            ((batteryCheck == BatteryCheck.VALID & batteryCapacity == BatteryCapacityBand.USABLE) implies
              (batteryAssessment == BatteryAssessment.ADEQUATE));
      compute
        compute_cases
          // @trace CASE-01
          case CASE_01_INVALID_EVIDENCE "Invalid battery evidence has precedence over either capacity band":
            assume batteryCheck == BatteryCheck.INVALID;
            guarantee batteryAssessment == BatteryAssessment.UNAVAILABLE;
          // @trace CASE-02
          case CASE_02_VALID_LOW "Valid low capacity is classified low":
            assume batteryCheck == BatteryCheck.VALID & batteryCapacity == BatteryCapacityBand.LOW;
            guarantee batteryAssessment == BatteryAssessment.LOW;
          // @trace CASE-03
          case CASE_03_VALID_USABLE "Valid usable capacity is classified adequate":
            assume batteryCheck == BatteryCheck.VALID & batteryCapacity == BatteryCapacityBand.USABLE;
            guarantee batteryAssessment == BatteryAssessment.ADEQUATE;
    }*/
  }

  // @trace PART-02
  part def SortieApplicabilityQualifier :> Thread {
    // @trace INT-09
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    // @trace INT-03
    port sortieContext : DataPort { in :>> type : SortieContext; }
    // @trace INT-11
    port sortieQualification : DataPort { out :>> type : SortieQualification; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_SORTIE_QUALIFICATION "Initial applicability follows evidence, energy, then context precedence":
            ((batteryAssessment == BatteryAssessment.UNAVAILABLE) implies
              (sortieQualification == SortieQualification.BLOCKED_EVIDENCE)) &
            ((batteryAssessment == BatteryAssessment.LOW) implies
              (sortieQualification == SortieQualification.BLOCKED_ENERGY)) &
            ((batteryAssessment == BatteryAssessment.ADEQUATE &
              sortieContext == SortieContext.OUTSIDE_OBSERVATION_POSITION) implies
              (sortieQualification == SortieQualification.BLOCKED_CONTEXT)) &
            ((batteryAssessment == BatteryAssessment.ADEQUATE &
              sortieContext == SortieContext.AT_OBSERVATION_POSITION) implies
              (sortieQualification == SortieQualification.ELIGIBLE));
      compute
        compute_cases
          // @trace CASE-04
          case CASE_04_EVIDENCE_BLOCK "Unavailable battery evidence blocks either context":
            assume batteryAssessment == BatteryAssessment.UNAVAILABLE;
            guarantee sortieQualification == SortieQualification.BLOCKED_EVIDENCE;
          // @trace CASE-05
          case CASE_05_ENERGY_BLOCK "Valid low energy blocks either context":
            assume batteryAssessment == BatteryAssessment.LOW;
            guarantee sortieQualification == SortieQualification.BLOCKED_ENERGY;
          // @trace CASE-06
          case CASE_06_CONTEXT_APPLICABILITY "Adequate evidence makes only the observation-position context eligible":
            assume batteryAssessment == BatteryAssessment.ADEQUATE;
            guarantee
              ((sortieContext == SortieContext.AT_OBSERVATION_POSITION) implies
                (sortieQualification == SortieQualification.ELIGIBLE)) &
              ((sortieContext == SortieContext.OUTSIDE_OBSERVATION_POSITION) implies
                (sortieQualification == SortieQualification.BLOCKED_CONTEXT));
    }*/
  }

  // @trace PART-03
  part def CameraEvidenceQualifier :> Thread {
    // @trace INT-04
    port cameraCondition : DataPort { in :>> type : CameraCondition; }
    // @trace INT-05
    port captureResult : DataPort { in :>> type : CaptureResult; }
    // @trace INT-12
    port cameraEvidence : DataPort { out :>> type : CameraEvidence; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_CAMERA_EVIDENCE "Initial camera evidence gives unavailability precedence over results":
            ((cameraCondition == CameraCondition.UNAVAILABLE) implies
              (cameraEvidence == CameraEvidence.UNAVAILABLE)) &
            ((cameraCondition == CameraCondition.READY & captureResult == CaptureResult.NONE) implies
              (cameraEvidence == CameraEvidence.READY)) &
            ((cameraCondition == CameraCondition.READY & captureResult == CaptureResult.CAPTURED) implies
              (cameraEvidence == CameraEvidence.CAPTURED)) &
            ((cameraCondition == CameraCondition.READY & captureResult == CaptureResult.FAILED) implies
              (cameraEvidence == CameraEvidence.FAILED));
      compute
        compute_cases
          // @trace CASE-07
          case CASE_07_CAMERA_UNAVAILABLE "Unavailable camera condition defeats every simultaneous result":
            assume cameraCondition == CameraCondition.UNAVAILABLE;
            guarantee cameraEvidence == CameraEvidence.UNAVAILABLE;
          // @trace CASE-08
          case CASE_08_CAMERA_READY "Ready camera with no result yields ready evidence":
            assume cameraCondition == CameraCondition.READY & captureResult == CaptureResult.NONE;
            guarantee cameraEvidence == CameraEvidence.READY;
          // @trace CASE-09
          case CASE_09_CAMERA_RESULT "A ready camera preserves captured versus failed result meaning":
            assume cameraCondition == CameraCondition.READY & captureResult != CaptureResult.NONE;
            guarantee
              ((captureResult == CaptureResult.CAPTURED) implies
                (cameraEvidence == CameraEvidence.CAPTURED)) &
              ((captureResult == CaptureResult.FAILED) implies
                (cameraEvidence == CameraEvidence.FAILED));
    }*/
  }

  // @trace PART-04
  part def RadioEvidenceQualifier :> Thread {
    // @trace INT-06
    port radioCondition : DataPort { in :>> type : RadioCondition; }
    // @trace INT-07
    port deliveryResult : DataPort { in :>> type : DeliveryResult; }
    // @trace INT-13
    port radioEvidence : DataPort { out :>> type : RadioEvidence; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_RADIO_EVIDENCE "Initial radio evidence gives unavailability precedence over results":
            ((radioCondition == RadioCondition.UNAVAILABLE) implies
              (radioEvidence == RadioEvidence.UNAVAILABLE)) &
            ((radioCondition == RadioCondition.READY & deliveryResult == DeliveryResult.NONE) implies
              (radioEvidence == RadioEvidence.READY)) &
            ((radioCondition == RadioCondition.READY & deliveryResult == DeliveryResult.ACCEPTED) implies
              (radioEvidence == RadioEvidence.ACCEPTED)) &
            ((radioCondition == RadioCondition.READY & deliveryResult == DeliveryResult.REJECTED) implies
              (radioEvidence == RadioEvidence.REJECTED));
      compute
        compute_cases
          // @trace CASE-10
          case CASE_10_RADIO_UNAVAILABLE "Unavailable radio condition defeats every simultaneous result":
            assume radioCondition == RadioCondition.UNAVAILABLE;
            guarantee radioEvidence == RadioEvidence.UNAVAILABLE;
          // @trace CASE-11
          case CASE_11_RADIO_READY "Ready radio with no result yields ready evidence":
            assume radioCondition == RadioCondition.READY & deliveryResult == DeliveryResult.NONE;
            guarantee radioEvidence == RadioEvidence.READY;
          // @trace CASE-12
          case CASE_12_RADIO_RESULT "A ready radio preserves accepted versus rejected result meaning":
            assume radioCondition == RadioCondition.READY & deliveryResult != DeliveryResult.NONE;
            guarantee
              ((deliveryResult == DeliveryResult.ACCEPTED) implies
                (radioEvidence == RadioEvidence.ACCEPTED)) &
              ((deliveryResult == DeliveryResult.REJECTED) implies
                (radioEvidence == RadioEvidence.REJECTED));
    }*/
  }

  // @trace PART-05
  part def SessionProposalOwner :> Thread {
    // @trace INT-11
    port sortieQualification : DataPort { in :>> type : SortieQualification; }
    // @trace INT-12
    port cameraEvidence : DataPort { in :>> type : CameraEvidence; }
    // @trace INT-13
    port radioEvidence : DataPort { in :>> type : RadioEvidence; }
    // @trace INT-14
    port sessionPhaseInput : DataPort { in :>> type : ObservationSessionState; }
    // @trace INT-15
    port sessionProposal : DataPort { out :>> type : SessionProposal; }

    language "GUMBO" /*{
      compute
        compute_cases
          // @trace CASE-13
          case CASE_13_PHASE_APPLICABLE_BLOCKER "The first phase-applicable qualification loss selects one block or recovery reason":
            assume sortieQualification != SortieQualification.ELIGIBLE |
              (sortieQualification == SortieQualification.ELIGIBLE &
               (sessionPhaseInput == ObservationSessionState.IDLE | sessionPhaseInput == ObservationSessionState.SUSPENDED) &
               (cameraEvidence == CameraEvidence.UNAVAILABLE |
                (cameraEvidence != CameraEvidence.UNAVAILABLE & radioEvidence == RadioEvidence.UNAVAILABLE))) |
              (sortieQualification == SortieQualification.ELIGIBLE & sessionPhaseInput == ObservationSessionState.ACQUIRING &
               ((cameraEvidence == CameraEvidence.UNAVAILABLE | cameraEvidence == CameraEvidence.FAILED) |
                (cameraEvidence != CameraEvidence.UNAVAILABLE & cameraEvidence != CameraEvidence.FAILED &
                 radioEvidence == RadioEvidence.UNAVAILABLE))) |
              (sortieQualification == SortieQualification.ELIGIBLE &
               (sessionPhaseInput == ObservationSessionState.QUEUED | sessionPhaseInput == ObservationSessionState.SENDING) &
               radioEvidence == RadioEvidence.UNAVAILABLE);
            guarantee
              ((sortieQualification == SortieQualification.BLOCKED_EVIDENCE &
                (sessionPhaseInput == ObservationSessionState.IDLE | sessionPhaseInput == ObservationSessionState.SUSPENDED)) implies
                (sessionProposal == SessionProposal.BLOCK_EVIDENCE)) &
              ((sortieQualification == SortieQualification.BLOCKED_EVIDENCE &
                (sessionPhaseInput == ObservationSessionState.ACQUIRING | sessionPhaseInput == ObservationSessionState.QUEUED |
                 sessionPhaseInput == ObservationSessionState.SENDING)) implies
                (sessionProposal == SessionProposal.RECOVER_EVIDENCE)) &
              ((sortieQualification == SortieQualification.BLOCKED_ENERGY &
                (sessionPhaseInput == ObservationSessionState.IDLE | sessionPhaseInput == ObservationSessionState.SUSPENDED)) implies
                (sessionProposal == SessionProposal.BLOCK_ENERGY)) &
              ((sortieQualification == SortieQualification.BLOCKED_ENERGY &
                (sessionPhaseInput == ObservationSessionState.ACQUIRING | sessionPhaseInput == ObservationSessionState.QUEUED |
                 sessionPhaseInput == ObservationSessionState.SENDING)) implies
                (sessionProposal == SessionProposal.RECOVER_ENERGY)) &
              ((sortieQualification == SortieQualification.BLOCKED_CONTEXT &
                (sessionPhaseInput == ObservationSessionState.IDLE | sessionPhaseInput == ObservationSessionState.SUSPENDED)) implies
                (sessionProposal == SessionProposal.BLOCK_CONTEXT)) &
              ((sortieQualification == SortieQualification.BLOCKED_CONTEXT &
                (sessionPhaseInput == ObservationSessionState.ACQUIRING | sessionPhaseInput == ObservationSessionState.QUEUED |
                 sessionPhaseInput == ObservationSessionState.SENDING)) implies
                (sessionProposal == SessionProposal.RECOVER_CONTEXT)) &
              ((sortieQualification == SortieQualification.ELIGIBLE &
                (sessionPhaseInput == ObservationSessionState.IDLE | sessionPhaseInput == ObservationSessionState.SUSPENDED) &
                cameraEvidence == CameraEvidence.UNAVAILABLE) implies
                (sessionProposal == SessionProposal.BLOCK_CAMERA)) &
              ((sortieQualification == SortieQualification.ELIGIBLE & sessionPhaseInput == ObservationSessionState.ACQUIRING &
                (cameraEvidence == CameraEvidence.UNAVAILABLE | cameraEvidence == CameraEvidence.FAILED)) implies
                (sessionProposal == SessionProposal.RECOVER_CAMERA)) &
              ((sortieQualification == SortieQualification.ELIGIBLE &
                (sessionPhaseInput == ObservationSessionState.IDLE | sessionPhaseInput == ObservationSessionState.SUSPENDED) &
                cameraEvidence != CameraEvidence.UNAVAILABLE & radioEvidence == RadioEvidence.UNAVAILABLE) implies
                (sessionProposal == SessionProposal.BLOCK_RADIO)) &
              ((sortieQualification == SortieQualification.ELIGIBLE &
                ((sessionPhaseInput == ObservationSessionState.ACQUIRING & cameraEvidence != CameraEvidence.UNAVAILABLE &
                  cameraEvidence != CameraEvidence.FAILED) |
                 sessionPhaseInput == ObservationSessionState.QUEUED | sessionPhaseInput == ObservationSessionState.SENDING) &
                radioEvidence == RadioEvidence.UNAVAILABLE) implies
                (sessionProposal == SessionProposal.RECOVER_RADIO));
          // @trace CASE-14
          case CASE_14_AUTOMATIC_PROGRESS "An active unblocked phase holds or selects its single automatic progress proposal":
            assume sortieQualification == SortieQualification.ELIGIBLE &
              ((sessionPhaseInput == ObservationSessionState.ACQUIRING &
                cameraEvidence != CameraEvidence.UNAVAILABLE & cameraEvidence != CameraEvidence.FAILED &
                radioEvidence != RadioEvidence.UNAVAILABLE) |
               (sessionPhaseInput == ObservationSessionState.QUEUED & radioEvidence != RadioEvidence.UNAVAILABLE) |
               (sessionPhaseInput == ObservationSessionState.SENDING & radioEvidence != RadioEvidence.UNAVAILABLE));
            guarantee
              ((sessionPhaseInput == ObservationSessionState.ACQUIRING & cameraEvidence == CameraEvidence.CAPTURED) implies
                (sessionProposal == SessionProposal.CAPTURE_COMPLETE)) &
              ((sessionPhaseInput == ObservationSessionState.ACQUIRING & cameraEvidence == CameraEvidence.READY) implies
                (sessionProposal == SessionProposal.HOLD)) &
              ((sessionPhaseInput == ObservationSessionState.QUEUED) implies
                (sessionProposal == SessionProposal.BEGIN_DELIVERY)) &
              ((sessionPhaseInput == ObservationSessionState.SENDING & radioEvidence == RadioEvidence.ACCEPTED) implies
                (sessionProposal == SessionProposal.DELIVERY_COMPLETE)) &
              ((sessionPhaseInput == ObservationSessionState.SENDING & radioEvidence == RadioEvidence.REJECTED) implies
                (sessionProposal == SessionProposal.DELIVERY_REJECTED)) &
              ((sessionPhaseInput == ObservationSessionState.SENDING & radioEvidence == RadioEvidence.READY) implies
                (sessionProposal == SessionProposal.HOLD));
          // @trace CASE-15
          case CASE_15_NONACTIVE_STARTABLE "An unblocked nonactive phase is startable and ignores stale results":
            assume sortieQualification == SortieQualification.ELIGIBLE &
              (sessionPhaseInput == ObservationSessionState.IDLE | sessionPhaseInput == ObservationSessionState.SUSPENDED) &
              cameraEvidence != CameraEvidence.UNAVAILABLE & radioEvidence != RadioEvidence.UNAVAILABLE;
            guarantee sessionProposal == SessionProposal.STARTABLE;
    }*/
  }

  // @trace PART-06
  part def ObservationIntentArbiter :> Thread {
    // @trace INT-08
    port observationIntent : DataPort { in :>> type : ObservationIntent; }
    // @trace INT-15
    port sessionProposal : DataPort { in :>> type : SessionProposal; }
    // @trace INT-16
    port sessionDecision : DataPort { out :>> type : SessionDecision; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_ARBITRATION "Initial decision applies cancellation, recovery, progress, fresh-start, then hold priority":
            ((observationIntent == ObservationIntent.CANCEL_OBSERVATION) implies
              (sessionDecision == SessionDecision.CANCEL_TO_IDLE)) &
            ((observationIntent != ObservationIntent.CANCEL_OBSERVATION & sessionProposal == SessionProposal.RECOVER_EVIDENCE) implies
              (sessionDecision == SessionDecision.SUSPEND_EVIDENCE)) &
            ((observationIntent != ObservationIntent.CANCEL_OBSERVATION & sessionProposal == SessionProposal.RECOVER_ENERGY) implies
              (sessionDecision == SessionDecision.SUSPEND_ENERGY)) &
            ((observationIntent != ObservationIntent.CANCEL_OBSERVATION & sessionProposal == SessionProposal.RECOVER_CONTEXT) implies
              (sessionDecision == SessionDecision.SUSPEND_CONTEXT)) &
            ((observationIntent != ObservationIntent.CANCEL_OBSERVATION & sessionProposal == SessionProposal.RECOVER_CAMERA) implies
              (sessionDecision == SessionDecision.SUSPEND_CAMERA)) &
            ((observationIntent != ObservationIntent.CANCEL_OBSERVATION & sessionProposal == SessionProposal.RECOVER_RADIO) implies
              (sessionDecision == SessionDecision.SUSPEND_RADIO)) &
            ((observationIntent != ObservationIntent.CANCEL_OBSERVATION & sessionProposal == SessionProposal.CAPTURE_COMPLETE) implies
              (sessionDecision == SessionDecision.QUEUE_CAPTURE)) &
            ((observationIntent != ObservationIntent.CANCEL_OBSERVATION & sessionProposal == SessionProposal.BEGIN_DELIVERY) implies
              (sessionDecision == SessionDecision.BEGIN_TRANSMISSION)) &
            ((observationIntent != ObservationIntent.CANCEL_OBSERVATION & sessionProposal == SessionProposal.DELIVERY_COMPLETE) implies
              (sessionDecision == SessionDecision.COMPLETE_TO_IDLE)) &
            ((observationIntent != ObservationIntent.CANCEL_OBSERVATION & sessionProposal == SessionProposal.DELIVERY_REJECTED) implies
              (sessionDecision == SessionDecision.RETRY_QUEUE)) &
            ((observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.STARTABLE) implies
              (sessionDecision == SessionDecision.BEGIN_ACQUISITION)) &
            ((observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.BLOCK_EVIDENCE) implies
              (sessionDecision == SessionDecision.REJECT_EVIDENCE)) &
            ((observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.BLOCK_ENERGY) implies
              (sessionDecision == SessionDecision.REJECT_ENERGY)) &
            ((observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.BLOCK_CONTEXT) implies
              (sessionDecision == SessionDecision.REJECT_CONTEXT)) &
            ((observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.BLOCK_CAMERA) implies
              (sessionDecision == SessionDecision.REJECT_CAMERA)) &
            ((observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.BLOCK_RADIO) implies
              (sessionDecision == SessionDecision.REJECT_RADIO)) &
            ((observationIntent != ObservationIntent.CANCEL_OBSERVATION &
              sessionProposal != SessionProposal.RECOVER_EVIDENCE & sessionProposal != SessionProposal.RECOVER_ENERGY &
              sessionProposal != SessionProposal.RECOVER_CONTEXT & sessionProposal != SessionProposal.RECOVER_CAMERA &
              sessionProposal != SessionProposal.RECOVER_RADIO & sessionProposal != SessionProposal.CAPTURE_COMPLETE &
              sessionProposal != SessionProposal.BEGIN_DELIVERY & sessionProposal != SessionProposal.DELIVERY_COMPLETE &
              sessionProposal != SessionProposal.DELIVERY_REJECTED &
              (observationIntent == ObservationIntent.NO_REQUEST | sessionProposal == SessionProposal.HOLD)) implies
              (sessionDecision == SessionDecision.NO_CHANGE));
      compute
        compute_cases
          // @trace CASE-16
          case CASE_16_CANCEL_PRIORITY "Cancellation wins every simultaneous proposal":
            assume observationIntent == ObservationIntent.CANCEL_OBSERVATION;
            guarantee sessionDecision == SessionDecision.CANCEL_TO_IDLE;
          // @trace CASE-17
          case CASE_17_RECOVERY_OR_PROGRESS "Recovery and automatic progress preempt fresh start and no request":
            assume observationIntent != ObservationIntent.CANCEL_OBSERVATION &
              (sessionProposal == SessionProposal.RECOVER_EVIDENCE | sessionProposal == SessionProposal.RECOVER_ENERGY |
               sessionProposal == SessionProposal.RECOVER_CONTEXT | sessionProposal == SessionProposal.RECOVER_CAMERA |
               sessionProposal == SessionProposal.RECOVER_RADIO | sessionProposal == SessionProposal.CAPTURE_COMPLETE |
               sessionProposal == SessionProposal.BEGIN_DELIVERY | sessionProposal == SessionProposal.DELIVERY_COMPLETE |
               sessionProposal == SessionProposal.DELIVERY_REJECTED);
            guarantee
              ((sessionProposal == SessionProposal.RECOVER_EVIDENCE) implies (sessionDecision == SessionDecision.SUSPEND_EVIDENCE)) &
              ((sessionProposal == SessionProposal.RECOVER_ENERGY) implies (sessionDecision == SessionDecision.SUSPEND_ENERGY)) &
              ((sessionProposal == SessionProposal.RECOVER_CONTEXT) implies (sessionDecision == SessionDecision.SUSPEND_CONTEXT)) &
              ((sessionProposal == SessionProposal.RECOVER_CAMERA) implies (sessionDecision == SessionDecision.SUSPEND_CAMERA)) &
              ((sessionProposal == SessionProposal.RECOVER_RADIO) implies (sessionDecision == SessionDecision.SUSPEND_RADIO)) &
              ((sessionProposal == SessionProposal.CAPTURE_COMPLETE) implies (sessionDecision == SessionDecision.QUEUE_CAPTURE)) &
              ((sessionProposal == SessionProposal.BEGIN_DELIVERY) implies (sessionDecision == SessionDecision.BEGIN_TRANSMISSION)) &
              ((sessionProposal == SessionProposal.DELIVERY_COMPLETE) implies (sessionDecision == SessionDecision.COMPLETE_TO_IDLE)) &
              ((sessionProposal == SessionProposal.DELIVERY_REJECTED) implies (sessionDecision == SessionDecision.RETRY_QUEUE));
          // @trace CASE-18
          case CASE_18_FRESH_START_REJECTION_OR_HOLD "The remaining partition starts, rejects, or holds":
            assume observationIntent != ObservationIntent.CANCEL_OBSERVATION &
              sessionProposal != SessionProposal.RECOVER_EVIDENCE & sessionProposal != SessionProposal.RECOVER_ENERGY &
              sessionProposal != SessionProposal.RECOVER_CONTEXT & sessionProposal != SessionProposal.RECOVER_CAMERA &
              sessionProposal != SessionProposal.RECOVER_RADIO & sessionProposal != SessionProposal.CAPTURE_COMPLETE &
              sessionProposal != SessionProposal.BEGIN_DELIVERY & sessionProposal != SessionProposal.DELIVERY_COMPLETE &
              sessionProposal != SessionProposal.DELIVERY_REJECTED;
            guarantee
              ((observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.STARTABLE) implies
                (sessionDecision == SessionDecision.BEGIN_ACQUISITION)) &
              ((observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.BLOCK_EVIDENCE) implies
                (sessionDecision == SessionDecision.REJECT_EVIDENCE)) &
              ((observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.BLOCK_ENERGY) implies
                (sessionDecision == SessionDecision.REJECT_ENERGY)) &
              ((observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.BLOCK_CONTEXT) implies
                (sessionDecision == SessionDecision.REJECT_CONTEXT)) &
              ((observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.BLOCK_CAMERA) implies
                (sessionDecision == SessionDecision.REJECT_CAMERA)) &
              ((observationIntent == ObservationIntent.START_OBSERVATION & sessionProposal == SessionProposal.BLOCK_RADIO) implies
                (sessionDecision == SessionDecision.REJECT_RADIO)) &
              ((observationIntent == ObservationIntent.NO_REQUEST | sessionProposal == SessionProposal.HOLD) implies
                (sessionDecision == SessionDecision.NO_CHANGE));
    }*/
  }

  // @trace PART-07
  part def ObservationSessionController :> Thread {
    // @trace INT-16
    port sessionDecision : DataPort { in :>> type : SessionDecision; }
    // @trace INT-14
    port sessionPhaseOutput : DataPort { out :>> type : ObservationSessionState; }
    // @trace INT-17
    port sessionSnapshot : DataPort { out :>> type : SessionSnapshot; }
    // @trace INT-18
    port cameraAcquisitionCommand : DataPort { out :>> type : CameraAcquisitionCommand; }
    // @trace INT-19
    port radioDeliveryCommand : DataPort { out :>> type : RadioDeliveryCommand; }

    language "GUMBO" /*{
      state
        // @trace TYPE-05
        committedSession : ObservationSessionState;
      initialize
        guarantee
          // @trace INIT-01
          INIT_SESSION_COMMANDS_AND_SNAPSHOT "The sole session state and all controller outputs initialize to the safe inactive result":
            committedSession == ObservationSessionState.IDLE &
            sessionPhaseOutput == ObservationSessionState.IDLE &
            sessionSnapshot.preSession == SnapshotPreSessionState.IDLE &
            sessionSnapshot.nextSession == SnapshotNextSessionState.IDLE &
            sessionSnapshot.disposition == SnapshotCoordinationDisposition.NO_CHANGE &
            sessionSnapshot.reason == SnapshotCoordinationReason.NONE &
            cameraAcquisitionCommand == CameraAcquisitionCommand.HOLD &
            radioDeliveryCommand == RadioDeliveryCommand.HOLD;
      compute
        guarantee
          // @trace INT-14
          PUBLISH_PRE_SESSION "Feedback publishes the committed pre-evaluation state":
            sessionPhaseOutput == In(committedSession);
        guarantee
          // @trace TYPE-09
          COMPLETE_SNAPSHOT "The snapshot records both pre-state and the selected committed next state":
            ((In(committedSession) == ObservationSessionState.IDLE) implies
              (sessionSnapshot.preSession == SnapshotPreSessionState.IDLE)) &
            ((In(committedSession) == ObservationSessionState.ACQUIRING) implies
              (sessionSnapshot.preSession == SnapshotPreSessionState.ACQUIRING)) &
            ((In(committedSession) == ObservationSessionState.QUEUED) implies
              (sessionSnapshot.preSession == SnapshotPreSessionState.QUEUED)) &
            ((In(committedSession) == ObservationSessionState.SENDING) implies
              (sessionSnapshot.preSession == SnapshotPreSessionState.SENDING)) &
            ((In(committedSession) == ObservationSessionState.SUSPENDED) implies
              (sessionSnapshot.preSession == SnapshotPreSessionState.SUSPENDED)) &
            ((committedSession == ObservationSessionState.IDLE) implies
              (sessionSnapshot.nextSession == SnapshotNextSessionState.IDLE)) &
            ((committedSession == ObservationSessionState.ACQUIRING) implies
              (sessionSnapshot.nextSession == SnapshotNextSessionState.ACQUIRING)) &
            ((committedSession == ObservationSessionState.QUEUED) implies
              (sessionSnapshot.nextSession == SnapshotNextSessionState.QUEUED)) &
            ((committedSession == ObservationSessionState.SENDING) implies
              (sessionSnapshot.nextSession == SnapshotNextSessionState.SENDING)) &
            ((committedSession == ObservationSessionState.SUSPENDED) implies
              (sessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED));
        guarantee
          // @trace CTRL-01
          CAMERA_COMMAND_FROM_NEXT_STATE "Logical acquisition is asserted exactly in the acquiring next state":
            ((committedSession == ObservationSessionState.ACQUIRING) implies
              (cameraAcquisitionCommand == CameraAcquisitionCommand.ACQUIRE)) &
            ((committedSession != ObservationSessionState.ACQUIRING) implies
              (cameraAcquisitionCommand == CameraAcquisitionCommand.HOLD));
        guarantee
          // @trace CTRL-02
          RADIO_COMMAND_FROM_NEXT_STATE "Logical delivery is asserted exactly in the sending next state":
            ((committedSession == ObservationSessionState.SENDING) implies
              (radioDeliveryCommand == RadioDeliveryCommand.SEND_OBSERVATION)) &
            ((committedSession != ObservationSessionState.SENDING) implies
              (radioDeliveryCommand == RadioDeliveryCommand.HOLD));
        guarantee
          // @trace BEH-STATE-01
          RECOVERY_REASON_PRESERVATION "A recovery disposition carries exactly one approved qualification reason":
            (sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED) implies
              (sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE |
               sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW |
               sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE |
               sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE |
               sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE);
        compute_cases
          // @trace CASE-19
          case CASE_19_TOTAL_STATE_COMMAND_RESULT "Every decision selects one next state, disposition, reason, snapshot, and command pair":
            guarantee
              ((sessionDecision == SessionDecision.NO_CHANGE) implies
                (committedSession == In(committedSession) &
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.NO_CHANGE &
                 sessionSnapshot.reason == SnapshotCoordinationReason.NONE)) &
              ((sessionDecision == SessionDecision.BEGIN_ACQUISITION) implies
                (committedSession == ObservationSessionState.ACQUIRING &
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.STARTED &
                 sessionSnapshot.reason == SnapshotCoordinationReason.NONE)) &
              ((sessionDecision == SessionDecision.CANCEL_TO_IDLE) implies
                (committedSession == ObservationSessionState.IDLE &
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.CANCELLED &
                 sessionSnapshot.reason == SnapshotCoordinationReason.CANCELLED)) &
              ((sessionDecision == SessionDecision.SUSPEND_EVIDENCE) implies
                (committedSession == ObservationSessionState.SUSPENDED &
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                 sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE)) &
              ((sessionDecision == SessionDecision.SUSPEND_ENERGY) implies
                (committedSession == ObservationSessionState.SUSPENDED &
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                 sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW)) &
              ((sessionDecision == SessionDecision.SUSPEND_CONTEXT) implies
                (committedSession == ObservationSessionState.SUSPENDED &
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                 sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE)) &
              ((sessionDecision == SessionDecision.SUSPEND_CAMERA) implies
                (committedSession == ObservationSessionState.SUSPENDED &
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                 sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE)) &
              ((sessionDecision == SessionDecision.SUSPEND_RADIO) implies
                (committedSession == ObservationSessionState.SUSPENDED &
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                 sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE)) &
              ((sessionDecision == SessionDecision.QUEUE_CAPTURE) implies
                (committedSession == ObservationSessionState.QUEUED &
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.PROGRESSED &
                 sessionSnapshot.reason == SnapshotCoordinationReason.NONE)) &
              ((sessionDecision == SessionDecision.BEGIN_TRANSMISSION) implies
                (committedSession == ObservationSessionState.SENDING &
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.PROGRESSED &
                 sessionSnapshot.reason == SnapshotCoordinationReason.NONE)) &
              ((sessionDecision == SessionDecision.COMPLETE_TO_IDLE) implies
                (committedSession == ObservationSessionState.IDLE &
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.COMPLETED &
                 sessionSnapshot.reason == SnapshotCoordinationReason.NONE)) &
              ((sessionDecision == SessionDecision.RETRY_QUEUE) implies
                (committedSession == ObservationSessionState.QUEUED &
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.PROGRESSED &
                 sessionSnapshot.reason == SnapshotCoordinationReason.NONE)) &
              ((sessionDecision == SessionDecision.REJECT_EVIDENCE) implies
                (committedSession == In(committedSession) &
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED &
                 sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE)) &
              ((sessionDecision == SessionDecision.REJECT_ENERGY) implies
                (committedSession == In(committedSession) &
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED &
                 sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW)) &
              ((sessionDecision == SessionDecision.REJECT_CONTEXT) implies
                (committedSession == In(committedSession) &
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED &
                 sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE)) &
              ((sessionDecision == SessionDecision.REJECT_CAMERA) implies
                (committedSession == In(committedSession) &
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED &
                 sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE)) &
              ((sessionDecision == SessionDecision.REJECT_RADIO) implies
                (committedSession == In(committedSession) &
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED &
                 sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE));
    }*/
  }

  // @trace PART-08
  part def CoordinationOutcomePolicy :> Thread {
    // @trace INT-10
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    // @trace INT-17
    port sessionSnapshot : DataPort { in :>> type : SessionSnapshot; }
    // @trace INT-20
    port operatorCoordinationStatus : DataPort { out :>> type : OperatorCoordinationStatus; }
    // @trace INT-21
    port droneControlObservationNotice : DataPort { out :>> type : DroneControlObservationNotice; }

    language "GUMBO" /*{
      initialize
        guarantee
          // @trace INIT-01
          INIT_COORDINATION_OUTCOMES "Initial status copies the complete snapshot and applies advisory and notice precedence":
            operatorCoordinationStatus.batteryAssessment == batteryAssessment &
            ((sessionSnapshot.nextSession == SnapshotNextSessionState.IDLE) implies
              (operatorCoordinationStatus.nextSession == StatusSessionState.IDLE)) &
            ((sessionSnapshot.nextSession == SnapshotNextSessionState.ACQUIRING) implies
              (operatorCoordinationStatus.nextSession == StatusSessionState.ACQUIRING)) &
            ((sessionSnapshot.nextSession == SnapshotNextSessionState.QUEUED) implies
              (operatorCoordinationStatus.nextSession == StatusSessionState.QUEUED)) &
            ((sessionSnapshot.nextSession == SnapshotNextSessionState.SENDING) implies
              (operatorCoordinationStatus.nextSession == StatusSessionState.SENDING)) &
            ((sessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED) implies
              (operatorCoordinationStatus.nextSession == StatusSessionState.SUSPENDED)) &
            ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.NO_CHANGE) implies
              (operatorCoordinationStatus.disposition == StatusCoordinationDisposition.NO_CHANGE)) &
            ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.STARTED) implies
              (operatorCoordinationStatus.disposition == StatusCoordinationDisposition.STARTED)) &
            ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.CANCELLED) implies
              (operatorCoordinationStatus.disposition == StatusCoordinationDisposition.CANCELLED)) &
            ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.PROGRESSED) implies
              (operatorCoordinationStatus.disposition == StatusCoordinationDisposition.PROGRESSED)) &
            ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.COMPLETED) implies
              (operatorCoordinationStatus.disposition == StatusCoordinationDisposition.COMPLETED)) &
            ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED) implies
              (operatorCoordinationStatus.disposition == StatusCoordinationDisposition.RECOVERY_APPLIED)) &
            ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED) implies
              (operatorCoordinationStatus.disposition == StatusCoordinationDisposition.REJECTED)) &
            ((sessionSnapshot.reason == SnapshotCoordinationReason.NONE) implies
              (operatorCoordinationStatus.reason == StatusCoordinationReason.NONE)) &
            ((sessionSnapshot.reason == SnapshotCoordinationReason.CANCELLED) implies
              (operatorCoordinationStatus.reason == StatusCoordinationReason.CANCELLED)) &
            ((sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) implies
              (operatorCoordinationStatus.reason == StatusCoordinationReason.EVIDENCE_UNAVAILABLE)) &
            ((sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW) implies
              (operatorCoordinationStatus.reason == StatusCoordinationReason.ENERGY_LOW)) &
            ((sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE) implies
              (operatorCoordinationStatus.reason == StatusCoordinationReason.CONTEXT_INELIGIBLE)) &
            ((sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE) implies
              (operatorCoordinationStatus.reason == StatusCoordinationReason.CAMERA_UNUSABLE)) &
            ((sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE) implies
              (operatorCoordinationStatus.reason == StatusCoordinationReason.RADIO_UNAVAILABLE)) &
            ((batteryAssessment == BatteryAssessment.UNAVAILABLE) implies
              (operatorCoordinationStatus.advisory == OperatorAdvisory.EVIDENCE_UNAVAILABLE)) &
            ((batteryAssessment == BatteryAssessment.LOW) implies
              (operatorCoordinationStatus.advisory == OperatorAdvisory.ENERGY_LOW)) &
            ((batteryAssessment == BatteryAssessment.ADEQUATE &
              sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
              sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) implies
              (operatorCoordinationStatus.advisory == OperatorAdvisory.EVIDENCE_UNAVAILABLE)) &
            ((batteryAssessment == BatteryAssessment.ADEQUATE &
              sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
              sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW) implies
              (operatorCoordinationStatus.advisory == OperatorAdvisory.ENERGY_LOW)) &
            ((batteryAssessment == BatteryAssessment.ADEQUATE &
              sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
              sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE) implies
              (operatorCoordinationStatus.advisory == OperatorAdvisory.CONTEXT_INELIGIBLE)) &
            ((batteryAssessment == BatteryAssessment.ADEQUATE &
              sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
              sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE) implies
              (operatorCoordinationStatus.advisory == OperatorAdvisory.CAMERA_UNUSABLE)) &
            ((batteryAssessment == BatteryAssessment.ADEQUATE &
              sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
              sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE) implies
              (operatorCoordinationStatus.advisory == OperatorAdvisory.RADIO_UNAVAILABLE)) &
            ((batteryAssessment == BatteryAssessment.ADEQUATE &
              sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED) implies
              (operatorCoordinationStatus.advisory == OperatorAdvisory.REQUEST_REJECTED)) &
            ((batteryAssessment == BatteryAssessment.ADEQUATE &
              sessionSnapshot.disposition == SnapshotCoordinationDisposition.COMPLETED) implies
              (operatorCoordinationStatus.advisory == OperatorAdvisory.DELIVERY_COMPLETED)) &
            ((batteryAssessment == BatteryAssessment.ADEQUATE &
              ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                (sessionSnapshot.reason == SnapshotCoordinationReason.NONE | sessionSnapshot.reason == SnapshotCoordinationReason.CANCELLED)) |
               (sessionSnapshot.disposition != SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                sessionSnapshot.disposition != SnapshotCoordinationDisposition.REJECTED &
                sessionSnapshot.disposition != SnapshotCoordinationDisposition.COMPLETED))) implies
              (operatorCoordinationStatus.advisory == OperatorAdvisory.NONE)) &
            ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.COMPLETED) implies
              (droneControlObservationNotice == DroneControlObservationNotice.DELIVERY_REPORTED)) &
            ((sessionSnapshot.disposition != SnapshotCoordinationDisposition.COMPLETED &
              (sessionSnapshot.nextSession == SnapshotNextSessionState.ACQUIRING |
               sessionSnapshot.nextSession == SnapshotNextSessionState.QUEUED |
               sessionSnapshot.nextSession == SnapshotNextSessionState.SENDING)) implies
              (droneControlObservationNotice == DroneControlObservationNotice.OBSERVATION_ACTIVE)) &
            ((sessionSnapshot.disposition != SnapshotCoordinationDisposition.COMPLETED &
              sessionSnapshot.nextSession != ObservationSessionState.ACQUIRING &
              sessionSnapshot.nextSession != ObservationSessionState.QUEUED &
              sessionSnapshot.nextSession != ObservationSessionState.SENDING &
              (sessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED |
               sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED)) implies
              (droneControlObservationNotice == DroneControlObservationNotice.OBSERVATION_BLOCKED)) &
            ((sessionSnapshot.disposition != SnapshotCoordinationDisposition.COMPLETED &
              sessionSnapshot.nextSession == SnapshotNextSessionState.IDLE &
              sessionSnapshot.disposition != SnapshotCoordinationDisposition.REJECTED) implies
              (droneControlObservationNotice == DroneControlObservationNotice.IDLE));
      compute
        compute_cases
          // @trace CASE-20
          case CASE_20_RECIPIENT_SPECIFIC_OUTCOMES "Every structural input selects one operator advisory and one drone-control notice":
            guarantee
              operatorCoordinationStatus.batteryAssessment == batteryAssessment &
              ((sessionSnapshot.nextSession == SnapshotNextSessionState.IDLE) implies
                (operatorCoordinationStatus.nextSession == StatusSessionState.IDLE)) &
              ((sessionSnapshot.nextSession == SnapshotNextSessionState.ACQUIRING) implies
                (operatorCoordinationStatus.nextSession == StatusSessionState.ACQUIRING)) &
              ((sessionSnapshot.nextSession == SnapshotNextSessionState.QUEUED) implies
                (operatorCoordinationStatus.nextSession == StatusSessionState.QUEUED)) &
              ((sessionSnapshot.nextSession == SnapshotNextSessionState.SENDING) implies
                (operatorCoordinationStatus.nextSession == StatusSessionState.SENDING)) &
              ((sessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED) implies
                (operatorCoordinationStatus.nextSession == StatusSessionState.SUSPENDED)) &
              ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.NO_CHANGE) implies
                (operatorCoordinationStatus.disposition == StatusCoordinationDisposition.NO_CHANGE)) &
              ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.STARTED) implies
                (operatorCoordinationStatus.disposition == StatusCoordinationDisposition.STARTED)) &
              ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.CANCELLED) implies
                (operatorCoordinationStatus.disposition == StatusCoordinationDisposition.CANCELLED)) &
              ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.PROGRESSED) implies
                (operatorCoordinationStatus.disposition == StatusCoordinationDisposition.PROGRESSED)) &
              ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.COMPLETED) implies
                (operatorCoordinationStatus.disposition == StatusCoordinationDisposition.COMPLETED)) &
              ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED) implies
                (operatorCoordinationStatus.disposition == StatusCoordinationDisposition.RECOVERY_APPLIED)) &
              ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED) implies
                (operatorCoordinationStatus.disposition == StatusCoordinationDisposition.REJECTED)) &
              ((sessionSnapshot.reason == SnapshotCoordinationReason.NONE) implies
                (operatorCoordinationStatus.reason == StatusCoordinationReason.NONE)) &
              ((sessionSnapshot.reason == SnapshotCoordinationReason.CANCELLED) implies
                (operatorCoordinationStatus.reason == StatusCoordinationReason.CANCELLED)) &
              ((sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) implies
                (operatorCoordinationStatus.reason == StatusCoordinationReason.EVIDENCE_UNAVAILABLE)) &
              ((sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW) implies
                (operatorCoordinationStatus.reason == StatusCoordinationReason.ENERGY_LOW)) &
              ((sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE) implies
                (operatorCoordinationStatus.reason == StatusCoordinationReason.CONTEXT_INELIGIBLE)) &
              ((sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE) implies
                (operatorCoordinationStatus.reason == StatusCoordinationReason.CAMERA_UNUSABLE)) &
              ((sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE) implies
                (operatorCoordinationStatus.reason == StatusCoordinationReason.RADIO_UNAVAILABLE)) &
              ((batteryAssessment == BatteryAssessment.UNAVAILABLE) implies
                (operatorCoordinationStatus.advisory == OperatorAdvisory.EVIDENCE_UNAVAILABLE)) &
              ((batteryAssessment == BatteryAssessment.LOW) implies
                (operatorCoordinationStatus.advisory == OperatorAdvisory.ENERGY_LOW)) &
              ((batteryAssessment == BatteryAssessment.ADEQUATE &
                sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                sessionSnapshot.reason == SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) implies
                (operatorCoordinationStatus.advisory == OperatorAdvisory.EVIDENCE_UNAVAILABLE)) &
              ((batteryAssessment == BatteryAssessment.ADEQUATE &
                sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                sessionSnapshot.reason == SnapshotCoordinationReason.ENERGY_LOW) implies
                (operatorCoordinationStatus.advisory == OperatorAdvisory.ENERGY_LOW)) &
              ((batteryAssessment == BatteryAssessment.ADEQUATE &
                sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                sessionSnapshot.reason == SnapshotCoordinationReason.CONTEXT_INELIGIBLE) implies
                (operatorCoordinationStatus.advisory == OperatorAdvisory.CONTEXT_INELIGIBLE)) &
              ((batteryAssessment == BatteryAssessment.ADEQUATE &
                sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                sessionSnapshot.reason == SnapshotCoordinationReason.CAMERA_UNUSABLE) implies
                (operatorCoordinationStatus.advisory == OperatorAdvisory.CAMERA_UNUSABLE)) &
              ((batteryAssessment == BatteryAssessment.ADEQUATE &
                sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                sessionSnapshot.reason == SnapshotCoordinationReason.RADIO_UNAVAILABLE) implies
                (operatorCoordinationStatus.advisory == OperatorAdvisory.RADIO_UNAVAILABLE)) &
              ((batteryAssessment == BatteryAssessment.ADEQUATE &
                sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED) implies
                (operatorCoordinationStatus.advisory == OperatorAdvisory.REQUEST_REJECTED)) &
              ((batteryAssessment == BatteryAssessment.ADEQUATE &
                sessionSnapshot.disposition == SnapshotCoordinationDisposition.COMPLETED) implies
                (operatorCoordinationStatus.advisory == OperatorAdvisory.DELIVERY_COMPLETED)) &
              ((batteryAssessment == BatteryAssessment.ADEQUATE &
                ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                  (sessionSnapshot.reason == SnapshotCoordinationReason.NONE | sessionSnapshot.reason == SnapshotCoordinationReason.CANCELLED)) |
                 (sessionSnapshot.disposition != SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                  sessionSnapshot.disposition != SnapshotCoordinationDisposition.REJECTED &
                  sessionSnapshot.disposition != SnapshotCoordinationDisposition.COMPLETED))) implies
                (operatorCoordinationStatus.advisory == OperatorAdvisory.NONE)) &
              ((sessionSnapshot.disposition == SnapshotCoordinationDisposition.COMPLETED) implies
                (droneControlObservationNotice == DroneControlObservationNotice.DELIVERY_REPORTED)) &
              ((sessionSnapshot.disposition != SnapshotCoordinationDisposition.COMPLETED &
                (sessionSnapshot.nextSession == SnapshotNextSessionState.ACQUIRING |
                 sessionSnapshot.nextSession == SnapshotNextSessionState.QUEUED |
                 sessionSnapshot.nextSession == SnapshotNextSessionState.SENDING)) implies
                (droneControlObservationNotice == DroneControlObservationNotice.OBSERVATION_ACTIVE)) &
              ((sessionSnapshot.disposition != SnapshotCoordinationDisposition.COMPLETED &
                sessionSnapshot.nextSession != ObservationSessionState.ACQUIRING &
                sessionSnapshot.nextSession != ObservationSessionState.QUEUED &
                sessionSnapshot.nextSession != ObservationSessionState.SENDING &
                (sessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED |
                 sessionSnapshot.disposition == SnapshotCoordinationDisposition.REJECTED)) implies
                (droneControlObservationNotice == DroneControlObservationNotice.OBSERVATION_BLOCKED)) &
              ((sessionSnapshot.disposition != SnapshotCoordinationDisposition.COMPLETED &
                sessionSnapshot.nextSession == SnapshotNextSessionState.IDLE &
                sessionSnapshot.disposition != SnapshotCoordinationDisposition.REJECTED) implies
                (droneControlObservationNotice == DroneControlObservationNotice.IDLE));
    }*/
  }

  // @generated-support behavior-free containment required by CONSTR-02
  part def CoordinatorProcess :> Process {
    // @generated-support transparent boundary routing port for MON-01
    port observationIntent : DataPort { in :>> type : ObservationIntent; }
    // @generated-support transparent boundary routing port for MON-02
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    // @generated-support transparent boundary routing port for MON-03
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    // @generated-support transparent boundary routing port for MON-04
    port sortieContext : DataPort { in :>> type : SortieContext; }
    // @generated-support transparent boundary routing port for MON-05
    port cameraCondition : DataPort { in :>> type : CameraCondition; }
    // @generated-support transparent boundary routing port for MON-06
    port captureResult : DataPort { in :>> type : CaptureResult; }
    // @generated-support transparent boundary routing port for MON-07
    port radioCondition : DataPort { in :>> type : RadioCondition; }
    // @generated-support transparent boundary routing port for MON-08
    port deliveryResult : DataPort { in :>> type : DeliveryResult; }
    // @generated-support transparent boundary routing port for CTRL-01
    port cameraAcquisitionCommand : DataPort { out :>> type : CameraAcquisitionCommand; }
    // @generated-support transparent boundary routing port for CTRL-02
    port radioDeliveryCommand : DataPort { out :>> type : RadioDeliveryCommand; }
    // @generated-support transparent boundary routing port for CTRL-03
    port operatorCoordinationStatus : DataPort { out :>> type : OperatorCoordinationStatus; }
    // @generated-support transparent boundary routing port for CTRL-04
    port droneControlObservationNotice : DataPort { out :>> type : DroneControlObservationNotice; }

    // @trace PART-01
    part batteryEvidenceQualifier : BatteryEvidenceQualifier;
    // @trace PART-02
    part sortieApplicabilityQualifier : SortieApplicabilityQualifier;
    // @trace PART-03
    part cameraEvidenceQualifier : CameraEvidenceQualifier;
    // @trace PART-04
    part radioEvidenceQualifier : RadioEvidenceQualifier;
    // @trace PART-05
    part sessionProposalOwner : SessionProposalOwner;
    // @trace PART-06
    part observationIntentArbiter : ObservationIntentArbiter;
    // @trace PART-07
    part observationSessionController : ObservationSessionController;
    // @trace PART-08
    part coordinationOutcomePolicy : CoordinationOutcomePolicy;

    // @trace INT-01
    connection int01 : PortConnection connect batteryCapacity to batteryEvidenceQualifier.batteryCapacity;
    // @trace INT-02
    connection int02 : PortConnection connect batteryCheck to batteryEvidenceQualifier.batteryCheck;
    // @trace INT-03
    connection int03 : PortConnection connect sortieContext to sortieApplicabilityQualifier.sortieContext;
    // @trace INT-04
    connection int04 : PortConnection connect cameraCondition to cameraEvidenceQualifier.cameraCondition;
    // @trace INT-05
    connection int05 : PortConnection connect captureResult to cameraEvidenceQualifier.captureResult;
    // @trace INT-06
    connection int06 : PortConnection connect radioCondition to radioEvidenceQualifier.radioCondition;
    // @trace INT-07
    connection int07 : PortConnection connect deliveryResult to radioEvidenceQualifier.deliveryResult;
    // @trace INT-08
    connection int08 : PortConnection connect observationIntent to observationIntentArbiter.observationIntent;
    // @trace INT-09
    connection int09 : PortConnection connect batteryEvidenceQualifier.batteryAssessment to sortieApplicabilityQualifier.batteryAssessment;
    // @trace INT-10
    connection int10 : PortConnection connect batteryEvidenceQualifier.batteryAssessment to coordinationOutcomePolicy.batteryAssessment;
    // @trace INT-11
    connection int11 : PortConnection connect sortieApplicabilityQualifier.sortieQualification to sessionProposalOwner.sortieQualification;
    // @trace INT-12
    connection int12 : PortConnection connect cameraEvidenceQualifier.cameraEvidence to sessionProposalOwner.cameraEvidence;
    // @trace INT-13
    connection int13 : PortConnection connect radioEvidenceQualifier.radioEvidence to sessionProposalOwner.radioEvidence;
    // @trace INT-14
    connection int14 : PortConnection connect observationSessionController.sessionPhaseOutput to sessionProposalOwner.sessionPhaseInput;
    // @trace INT-15
    connection int15 : PortConnection connect sessionProposalOwner.sessionProposal to observationIntentArbiter.sessionProposal;
    // @trace INT-16
    connection int16 : PortConnection connect observationIntentArbiter.sessionDecision to observationSessionController.sessionDecision;
    // @trace INT-17
    connection int17 : PortConnection connect observationSessionController.sessionSnapshot to coordinationOutcomePolicy.sessionSnapshot;
    // @trace INT-18
    connection int18 : PortConnection connect observationSessionController.cameraAcquisitionCommand to cameraAcquisitionCommand;
    // @trace INT-19
    connection int19 : PortConnection connect observationSessionController.radioDeliveryCommand to radioDeliveryCommand;
    // @trace INT-20
    connection int20 : PortConnection connect coordinationOutcomePolicy.operatorCoordinationStatus to operatorCoordinationStatus;
    // @trace INT-21
    connection int21 : PortConnection connect coordinationOutcomePolicy.droneControlObservationNotice to droneControlObservationNotice;
  }

  // @trace SCOPE-IN-01
  part def ObservationAcquisitionRadioDeliveryCoordinator :> System {
    // @trace MON-01
    port observationIntent : DataPort { in :>> type : ObservationIntent; }
    // @trace MON-02
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    // @trace MON-03
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    // @trace MON-04
    port sortieContext : DataPort { in :>> type : SortieContext; }
    // @trace MON-05
    port cameraCondition : DataPort { in :>> type : CameraCondition; }
    // @trace MON-06
    port captureResult : DataPort { in :>> type : CaptureResult; }
    // @trace MON-07
    port radioCondition : DataPort { in :>> type : RadioCondition; }
    // @trace MON-08
    port deliveryResult : DataPort { in :>> type : DeliveryResult; }
    // @trace CTRL-01
    port cameraAcquisitionCommand : DataPort { out :>> type : CameraAcquisitionCommand; }
    // @trace CTRL-02
    port radioDeliveryCommand : DataPort { out :>> type : RadioDeliveryCommand; }
    // @trace CTRL-03
    port operatorCoordinationStatus : DataPort { out :>> type : OperatorCoordinationStatus; }
    // @trace CTRL-04
    port droneControlObservationNotice : DataPort { out :>> type : DroneControlObservationNotice; }

    // @generated-support behavior-free containment usage required by CONSTR-02
    part coordinatorProcess : CoordinatorProcess;

    // @generated-support transparent support route for MON-01
    connection supportObservationIntent : PortConnection connect observationIntent to coordinatorProcess.observationIntent;
    // @generated-support transparent support route for MON-02
    connection supportBatteryCapacity : PortConnection connect batteryCapacity to coordinatorProcess.batteryCapacity;
    // @generated-support transparent support route for MON-03
    connection supportBatteryCheck : PortConnection connect batteryCheck to coordinatorProcess.batteryCheck;
    // @generated-support transparent support route for MON-04
    connection supportSortieContext : PortConnection connect sortieContext to coordinatorProcess.sortieContext;
    // @generated-support transparent support route for MON-05
    connection supportCameraCondition : PortConnection connect cameraCondition to coordinatorProcess.cameraCondition;
    // @generated-support transparent support route for MON-06
    connection supportCaptureResult : PortConnection connect captureResult to coordinatorProcess.captureResult;
    // @generated-support transparent support route for MON-07
    connection supportRadioCondition : PortConnection connect radioCondition to coordinatorProcess.radioCondition;
    // @generated-support transparent support route for MON-08
    connection supportDeliveryResult : PortConnection connect deliveryResult to coordinatorProcess.deliveryResult;
    // @generated-support transparent support route for CTRL-01
    connection supportCameraCommand : PortConnection connect coordinatorProcess.cameraAcquisitionCommand to cameraAcquisitionCommand;
    // @generated-support transparent support route for CTRL-02
    connection supportRadioCommand : PortConnection connect coordinatorProcess.radioDeliveryCommand to radioDeliveryCommand;
    // @generated-support transparent support route for CTRL-03
    connection supportOperatorStatus : PortConnection connect coordinatorProcess.operatorCoordinationStatus to operatorCoordinationStatus;
    // @generated-support transparent support route for CTRL-04
    connection supportDroneNotice : PortConnection connect coordinatorProcess.droneControlObservationNotice to droneControlObservationNotice;
  }

  // @trace SCOPE-IN-01
  part observationAcquisitionRadioDeliveryCoordinator : ObservationAcquisitionRadioDeliveryCoordinator;
}
