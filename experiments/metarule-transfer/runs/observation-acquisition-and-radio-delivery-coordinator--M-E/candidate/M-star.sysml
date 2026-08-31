package Observation_Acquisition_Radio_Delivery_Coordinator {
  private import HAMR::*;

  enum def ObservationIntent {
    enum NO_REQUEST;
    enum START_OBSERVATION;
    enum CANCEL_OBSERVATION;
  }

  enum def BatteryCapacityBand {
    enum LOW;
    enum USABLE;
  }

  enum def BatteryCheck {
    enum INVALID;
    enum VALID;
  }

  enum def SortieContext {
    enum OUTSIDE_OBSERVATION_POSITION;
    enum AT_OBSERVATION_POSITION;
  }

  enum def CameraCondition {
    enum UNAVAILABLE;
    enum READY;
  }

  enum def CaptureResult {
    enum NONE;
    enum CAPTURED;
    enum FAILED;
  }

  enum def RadioCondition {
    enum UNAVAILABLE;
    enum READY;
  }

  enum def DeliveryResult {
    enum NONE;
    enum ACCEPTED;
    enum REJECTED;
  }

  enum def CameraAcquisitionCommand {
    enum HOLD;
    enum ACQUIRE;
  }

  enum def RadioDeliveryCommand {
    enum HOLD;
    enum SEND_OBSERVATION;
  }

  enum def DroneControlObservationNotice {
    enum IDLE;
    enum OBSERVATION_ACTIVE;
    enum OBSERVATION_BLOCKED;
    enum DELIVERY_REPORTED;
  }

  enum def BatteryAssessment {
    enum UNAVAILABLE;
    enum LOW;
    enum ADEQUATE;
  }

  enum def SortieQualification {
    enum BLOCKED_EVIDENCE;
    enum BLOCKED_ENERGY;
    enum BLOCKED_CONTEXT;
    enum ELIGIBLE;
  }

  enum def CameraEvidence {
    enum UNAVAILABLE;
    enum READY;
    enum CAPTURED;
    enum FAILED;
  }

  enum def RadioEvidence {
    enum UNAVAILABLE;
    enum READY;
    enum ACCEPTED;
    enum REJECTED;
  }

  enum def ObservationSessionState {
    enum IDLE;
    enum ACQUIRING;
    enum QUEUED;
    enum SENDING;
    enum SUSPENDED;
  }

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

  enum def CoordinationDisposition {
    enum NO_CHANGE;
    enum STARTED;
    enum CANCELLED;
    enum PROGRESSED;
    enum COMPLETED;
    enum RECOVERY_APPLIED;
    enum REJECTED;
  }

  enum def CoordinationReason {
    enum NONE;
    enum CANCELLED;
    enum EVIDENCE_UNAVAILABLE;
    enum ENERGY_LOW;
    enum CONTEXT_INELIGIBLE;
    enum CAMERA_UNUSABLE;
    enum RADIO_UNAVAILABLE;
  }

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

  enum def SnapshotPreSessionState {
    enum IDLE;
    enum ACQUIRING;
    enum QUEUED;
    enum SENDING;
    enum SUSPENDED;
  }

  enum def SnapshotNextSessionState {
    enum IDLE;
    enum ACQUIRING;
    enum QUEUED;
    enum SENDING;
    enum SUSPENDED;
  }

  enum def SnapshotCoordinationDisposition {
    enum NO_CHANGE;
    enum STARTED;
    enum CANCELLED;
    enum PROGRESSED;
    enum COMPLETED;
    enum RECOVERY_APPLIED;
    enum REJECTED;
  }

  enum def SnapshotCoordinationReason {
    enum NONE;
    enum CANCELLED;
    enum EVIDENCE_UNAVAILABLE;
    enum ENERGY_LOW;
    enum CONTEXT_INELIGIBLE;
    enum CAMERA_UNUSABLE;
    enum RADIO_UNAVAILABLE;
  }

  enum def StatusSessionState {
    enum IDLE;
    enum ACQUIRING;
    enum QUEUED;
    enum SENDING;
    enum SUSPENDED;
  }

  enum def StatusCoordinationDisposition {
    enum NO_CHANGE;
    enum STARTED;
    enum CANCELLED;
    enum PROGRESSED;
    enum COMPLETED;
    enum RECOVERY_APPLIED;
    enum REJECTED;
  }

  enum def StatusCoordinationReason {
    enum NONE;
    enum CANCELLED;
    enum EVIDENCE_UNAVAILABLE;
    enum ENERGY_LOW;
    enum CONTEXT_INELIGIBLE;
    enum CAMERA_UNUSABLE;
    enum RADIO_UNAVAILABLE;
  }

  part def SessionSnapshot :> Data {
    attribute preSession : SnapshotPreSessionState;
    attribute nextSession : SnapshotNextSessionState;
    attribute disposition : SnapshotCoordinationDisposition;
    attribute reason : SnapshotCoordinationReason;
  }

  part def OperatorCoordinationStatus :> Data {
    attribute nextSession : StatusSessionState;
    attribute batteryAssessment : BatteryAssessment;
    attribute disposition : StatusCoordinationDisposition;
    attribute reason : StatusCoordinationReason;
    attribute advisory : OperatorAdvisory;
  }

  part def BatteryEvidenceQualifier :> Thread {
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    port batteryAssessment : DataPort { out :>> type : BatteryAssessment; }

    language "GUMBO" /*{
      initialize
        guarantee INIT_BATTERY_ASSESSMENT:
          (batteryCheck == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryCheck.INVALID implies
            batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryAssessment.UNAVAILABLE) &
          ((batteryCheck == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryCheck.VALID &
            batteryCapacity == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryCapacityBand.LOW) implies
            batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryAssessment.LOW) &
          ((batteryCheck == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryCheck.VALID &
            batteryCapacity == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryCapacityBand.USABLE) implies
            batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryAssessment.ADEQUATE);
      compute
        compute_cases
          case CASE_01_INVALID_EVIDENCE:
            assume batteryCheck == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryCheck.INVALID;
            guarantee batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryAssessment.UNAVAILABLE;
          case CASE_02_VALID_LOW:
            assume batteryCheck == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryCheck.VALID &
              batteryCapacity == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryCapacityBand.LOW;
            guarantee batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryAssessment.LOW;
          case CASE_03_VALID_USABLE:
            assume batteryCheck == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryCheck.VALID &
              batteryCapacity == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryCapacityBand.USABLE;
            guarantee batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryAssessment.ADEQUATE;
    }*/
  }

  part def SortieApplicabilityQualifier :> Thread {
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    port sortieContext : DataPort { in :>> type : SortieContext; }
    port sortieQualification : DataPort { out :>> type : SortieQualification; }

    language "GUMBO" /*{
      initialize
        guarantee INIT_SORTIE_QUALIFICATION:
          (batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryAssessment.UNAVAILABLE implies
            sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.BLOCKED_EVIDENCE) &
          (batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryAssessment.LOW implies
            sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.BLOCKED_ENERGY) &
          ((batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryAssessment.ADEQUATE &
            sortieContext == Observation_Acquisition_Radio_Delivery_Coordinator::SortieContext.OUTSIDE_OBSERVATION_POSITION) implies
            sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.BLOCKED_CONTEXT) &
          ((batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryAssessment.ADEQUATE &
            sortieContext == Observation_Acquisition_Radio_Delivery_Coordinator::SortieContext.AT_OBSERVATION_POSITION) implies
            sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.ELIGIBLE);
      compute
        compute_cases
          case CASE_04_EVIDENCE_BLOCK:
            assume batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryAssessment.UNAVAILABLE;
            guarantee sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.BLOCKED_EVIDENCE;
          case CASE_05_ENERGY_BLOCK:
            assume batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryAssessment.LOW;
            guarantee sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.BLOCKED_ENERGY;
          case CASE_06_CONTEXT_APPLICABILITY:
            assume batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryAssessment.ADEQUATE;
            guarantee
              (sortieContext == Observation_Acquisition_Radio_Delivery_Coordinator::SortieContext.AT_OBSERVATION_POSITION implies
                sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.ELIGIBLE) &
              (sortieContext == Observation_Acquisition_Radio_Delivery_Coordinator::SortieContext.OUTSIDE_OBSERVATION_POSITION implies
                sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.BLOCKED_CONTEXT);
    }*/
  }

  part def CameraEvidenceQualifier :> Thread {
    port cameraCondition : DataPort { in :>> type : CameraCondition; }
    port captureResult : DataPort { in :>> type : CaptureResult; }
    port cameraEvidence : DataPort { out :>> type : CameraEvidence; }

    language "GUMBO" /*{
      initialize
        guarantee INIT_CAMERA_EVIDENCE:
          (cameraCondition == Observation_Acquisition_Radio_Delivery_Coordinator::CameraCondition.UNAVAILABLE implies
            cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.UNAVAILABLE) &
          ((cameraCondition == Observation_Acquisition_Radio_Delivery_Coordinator::CameraCondition.READY &
            captureResult == Observation_Acquisition_Radio_Delivery_Coordinator::CaptureResult.NONE) implies
            cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.READY) &
          ((cameraCondition == Observation_Acquisition_Radio_Delivery_Coordinator::CameraCondition.READY &
            captureResult == Observation_Acquisition_Radio_Delivery_Coordinator::CaptureResult.CAPTURED) implies
            cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.CAPTURED) &
          ((cameraCondition == Observation_Acquisition_Radio_Delivery_Coordinator::CameraCondition.READY &
            captureResult == Observation_Acquisition_Radio_Delivery_Coordinator::CaptureResult.FAILED) implies
            cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.FAILED);
      compute
        compute_cases
          case CASE_07_CAMERA_UNAVAILABLE:
            assume cameraCondition == Observation_Acquisition_Radio_Delivery_Coordinator::CameraCondition.UNAVAILABLE;
            guarantee cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.UNAVAILABLE;
          case CASE_08_CAMERA_READY:
            assume cameraCondition == Observation_Acquisition_Radio_Delivery_Coordinator::CameraCondition.READY &
              captureResult == Observation_Acquisition_Radio_Delivery_Coordinator::CaptureResult.NONE;
            guarantee cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.READY;
          case CASE_09_CAMERA_RESULT:
            assume cameraCondition == Observation_Acquisition_Radio_Delivery_Coordinator::CameraCondition.READY &
              captureResult != Observation_Acquisition_Radio_Delivery_Coordinator::CaptureResult.NONE;
            guarantee
              (captureResult == Observation_Acquisition_Radio_Delivery_Coordinator::CaptureResult.CAPTURED implies
                cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.CAPTURED) &
              (captureResult == Observation_Acquisition_Radio_Delivery_Coordinator::CaptureResult.FAILED implies
                cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.FAILED);
    }*/
  }

  part def RadioEvidenceQualifier :> Thread {
    port radioCondition : DataPort { in :>> type : RadioCondition; }
    port deliveryResult : DataPort { in :>> type : DeliveryResult; }
    port radioEvidence : DataPort { out :>> type : RadioEvidence; }

    language "GUMBO" /*{
      initialize
        guarantee INIT_RADIO_EVIDENCE:
          (radioCondition == Observation_Acquisition_Radio_Delivery_Coordinator::RadioCondition.UNAVAILABLE implies
            radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.UNAVAILABLE) &
          ((radioCondition == Observation_Acquisition_Radio_Delivery_Coordinator::RadioCondition.READY &
            deliveryResult == Observation_Acquisition_Radio_Delivery_Coordinator::DeliveryResult.NONE) implies
            radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.READY) &
          ((radioCondition == Observation_Acquisition_Radio_Delivery_Coordinator::RadioCondition.READY &
            deliveryResult == Observation_Acquisition_Radio_Delivery_Coordinator::DeliveryResult.ACCEPTED) implies
            radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.ACCEPTED) &
          ((radioCondition == Observation_Acquisition_Radio_Delivery_Coordinator::RadioCondition.READY &
            deliveryResult == Observation_Acquisition_Radio_Delivery_Coordinator::DeliveryResult.REJECTED) implies
            radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.REJECTED);
      compute
        compute_cases
          case CASE_10_RADIO_UNAVAILABLE:
            assume radioCondition == Observation_Acquisition_Radio_Delivery_Coordinator::RadioCondition.UNAVAILABLE;
            guarantee radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.UNAVAILABLE;
          case CASE_11_RADIO_READY:
            assume radioCondition == Observation_Acquisition_Radio_Delivery_Coordinator::RadioCondition.READY &
              deliveryResult == Observation_Acquisition_Radio_Delivery_Coordinator::DeliveryResult.NONE;
            guarantee radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.READY;
          case CASE_12_RADIO_RESULT:
            assume radioCondition == Observation_Acquisition_Radio_Delivery_Coordinator::RadioCondition.READY &
              deliveryResult != Observation_Acquisition_Radio_Delivery_Coordinator::DeliveryResult.NONE;
            guarantee
              (deliveryResult == Observation_Acquisition_Radio_Delivery_Coordinator::DeliveryResult.ACCEPTED implies
                radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.ACCEPTED) &
              (deliveryResult == Observation_Acquisition_Radio_Delivery_Coordinator::DeliveryResult.REJECTED implies
                radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.REJECTED);
    }*/
  }

  part def SessionProposalOwner :> Thread {
    port sortieQualification : DataPort { in :>> type : SortieQualification; }
    port cameraEvidence : DataPort { in :>> type : CameraEvidence; }
    port radioEvidence : DataPort { in :>> type : RadioEvidence; }
    port sessionPhaseInput : DataPort { in :>> type : ObservationSessionState; }
    port sessionProposal : DataPort { out :>> type : SessionProposal; }

    language "GUMBO" /*{
      compute
        compute_cases
          case CASE_13_PHASE_APPLICABLE_BLOCKER:
            assume
              sortieQualification != Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.ELIGIBLE |
              ((sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.IDLE |
                sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SUSPENDED) &
                (cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.UNAVAILABLE |
                  radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.UNAVAILABLE)) |
              (sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.ACQUIRING &
                (cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.UNAVAILABLE |
                  cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.FAILED |
                  radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.UNAVAILABLE)) |
              ((sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.QUEUED |
                sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SENDING) &
                radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.UNAVAILABLE);
            guarantee
              ((sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.BLOCKED_EVIDENCE &
                (sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.IDLE |
                  sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SUSPENDED)) implies
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.BLOCK_EVIDENCE) &
              ((sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.BLOCKED_EVIDENCE &
                (sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.ACQUIRING |
                  sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.QUEUED |
                  sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SENDING)) implies
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_EVIDENCE) &
              ((sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.BLOCKED_ENERGY &
                (sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.IDLE |
                  sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SUSPENDED)) implies
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.BLOCK_ENERGY) &
              ((sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.BLOCKED_ENERGY &
                (sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.ACQUIRING |
                  sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.QUEUED |
                  sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SENDING)) implies
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_ENERGY) &
              ((sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.BLOCKED_CONTEXT &
                (sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.IDLE |
                  sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SUSPENDED)) implies
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.BLOCK_CONTEXT) &
              ((sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.BLOCKED_CONTEXT &
                (sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.ACQUIRING |
                  sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.QUEUED |
                  sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SENDING)) implies
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_CONTEXT) &
              ((sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.ELIGIBLE &
                (sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.IDLE |
                  sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SUSPENDED) &
                cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.UNAVAILABLE) implies
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.BLOCK_CAMERA) &
              ((sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.ELIGIBLE &
                sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.ACQUIRING &
                (cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.UNAVAILABLE |
                  cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.FAILED)) implies
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_CAMERA) &
              ((sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.ELIGIBLE &
                (sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.IDLE |
                  sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SUSPENDED) &
                cameraEvidence != Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.UNAVAILABLE &
                radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.UNAVAILABLE) implies
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.BLOCK_RADIO) &
              ((sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.ELIGIBLE &
                ((sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.ACQUIRING &
                  cameraEvidence != Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.UNAVAILABLE &
                  cameraEvidence != Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.FAILED) |
                  sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.QUEUED |
                  sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SENDING) &
                radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.UNAVAILABLE) implies
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_RADIO);
          case CASE_14_AUTOMATIC_PROGRESS:
            assume sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.ELIGIBLE &
              ((sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.ACQUIRING &
                cameraEvidence != Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.UNAVAILABLE &
                cameraEvidence != Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.FAILED &
                radioEvidence != Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.UNAVAILABLE) |
               ((sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.QUEUED |
                 sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SENDING) &
                radioEvidence != Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.UNAVAILABLE));
            guarantee
              ((sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.ACQUIRING &
                cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.CAPTURED) implies
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.CAPTURE_COMPLETE) &
              ((sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.ACQUIRING &
                cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.READY) implies
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.HOLD) &
              (sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.QUEUED implies
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.BEGIN_DELIVERY) &
              ((sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SENDING &
                radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.ACCEPTED) implies
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.DELIVERY_COMPLETE) &
              ((sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SENDING &
                radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.REJECTED) implies
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.DELIVERY_REJECTED) &
              ((sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SENDING &
                radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.READY) implies
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.HOLD);
          case CASE_15_NONACTIVE_STARTABLE:
            assume sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator::SortieQualification.ELIGIBLE &
              (sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.IDLE |
                sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SUSPENDED) &
              cameraEvidence != Observation_Acquisition_Radio_Delivery_Coordinator::CameraEvidence.UNAVAILABLE &
              radioEvidence != Observation_Acquisition_Radio_Delivery_Coordinator::RadioEvidence.UNAVAILABLE;
            guarantee sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.STARTABLE;
    }*/
  }

  part def ObservationIntentArbiter :> Thread {
    port observationIntent : DataPort { in :>> type : ObservationIntent; }
    port sessionProposal : DataPort { in :>> type : SessionProposal; }
    port sessionDecision : DataPort { out :>> type : SessionDecision; }

    language "GUMBO" /*{
      initialize
        guarantee INIT_ARBITRATION:
          (observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.CANCEL_OBSERVATION implies
            sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.CANCEL_TO_IDLE) &
          ((observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.CANCEL_OBSERVATION &
            sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_EVIDENCE) implies
            sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.SUSPEND_EVIDENCE) &
          ((observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.CANCEL_OBSERVATION &
            sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_ENERGY) implies
            sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.SUSPEND_ENERGY) &
          ((observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.CANCEL_OBSERVATION &
            sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_CONTEXT) implies
            sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.SUSPEND_CONTEXT) &
          ((observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.CANCEL_OBSERVATION &
            sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_CAMERA) implies
            sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.SUSPEND_CAMERA) &
          ((observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.CANCEL_OBSERVATION &
            sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_RADIO) implies
            sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.SUSPEND_RADIO) &
          ((observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.CANCEL_OBSERVATION &
            sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.CAPTURE_COMPLETE) implies
            sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.QUEUE_CAPTURE) &
          ((observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.CANCEL_OBSERVATION &
            sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.BEGIN_DELIVERY) implies
            sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.BEGIN_TRANSMISSION) &
          ((observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.CANCEL_OBSERVATION &
            sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.DELIVERY_COMPLETE) implies
            sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.COMPLETE_TO_IDLE) &
          ((observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.CANCEL_OBSERVATION &
            sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.DELIVERY_REJECTED) implies
            sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.RETRY_QUEUE);
      compute
        compute_cases
          case CASE_16_CANCEL_PRIORITY:
            assume observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.CANCEL_OBSERVATION;
            guarantee sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.CANCEL_TO_IDLE;
          case CASE_17_RECOVERY_OR_PROGRESS:
            assume observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.CANCEL_OBSERVATION &
              (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_EVIDENCE |
               sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_ENERGY |
               sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_CONTEXT |
               sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_CAMERA |
               sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_RADIO |
               sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.CAPTURE_COMPLETE |
               sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.BEGIN_DELIVERY |
               sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.DELIVERY_COMPLETE |
               sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.DELIVERY_REJECTED);
            guarantee
              (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_EVIDENCE implies sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.SUSPEND_EVIDENCE) &
              (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_ENERGY implies sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.SUSPEND_ENERGY) &
              (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_CONTEXT implies sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.SUSPEND_CONTEXT) &
              (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_CAMERA implies sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.SUSPEND_CAMERA) &
              (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_RADIO implies sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.SUSPEND_RADIO) &
              (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.CAPTURE_COMPLETE implies sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.QUEUE_CAPTURE) &
              (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.BEGIN_DELIVERY implies sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.BEGIN_TRANSMISSION) &
              (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.DELIVERY_COMPLETE implies sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.COMPLETE_TO_IDLE) &
              (sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.DELIVERY_REJECTED implies sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.RETRY_QUEUE);
          case CASE_18_FRESH_START_REJECTION_OR_HOLD:
            assume observationIntent != Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.CANCEL_OBSERVATION &
              sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_EVIDENCE &
              sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_ENERGY &
              sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_CONTEXT &
              sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_CAMERA &
              sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.RECOVER_RADIO &
              sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.CAPTURE_COMPLETE &
              sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.BEGIN_DELIVERY &
              sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.DELIVERY_COMPLETE &
              sessionProposal != Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.DELIVERY_REJECTED;
            guarantee
              ((observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.START_OBSERVATION &
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.STARTABLE) implies sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.BEGIN_ACQUISITION) &
              ((observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.START_OBSERVATION &
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.BLOCK_EVIDENCE) implies sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.REJECT_EVIDENCE) &
              ((observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.START_OBSERVATION &
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.BLOCK_ENERGY) implies sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.REJECT_ENERGY) &
              ((observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.START_OBSERVATION &
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.BLOCK_CONTEXT) implies sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.REJECT_CONTEXT) &
              ((observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.START_OBSERVATION &
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.BLOCK_CAMERA) implies sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.REJECT_CAMERA) &
              ((observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.START_OBSERVATION &
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.BLOCK_RADIO) implies sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.REJECT_RADIO) &
              ((observationIntent == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationIntent.NO_REQUEST |
                sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator::SessionProposal.HOLD) implies sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.NO_CHANGE);
    }*/
                        
                
                 
                           
                                                                                                                        
                                                                                
                                                                    
                                                                                                                                      
                                                                      
                                                                                                                                    
                                                                    
                                                                                                                                     
                                                                     
                                                                                                                                    
                                                                    
                                                                                                                                   
                                                                   
                                                                                                                                      
                                                                   
                                                                                                                                    
                                                                        
                                                                                                                                       
                                                                      
                                                                                                                                       
                                                                 
                                                                                                                              
                                                                       
                                                                                                                                   
                                                                     
                                                                                                                                 
                                                                   
                                                                                                                                  
                                                                    
                                                                                                                                 
                                                                   
                                                                                                                                
                                                                  
                                                                         
                                                                                                                       
                                                                                                                      
                                                                                                                      
                                                                                                                        
                                                                    
                                                                                                                    
                                                              
             
                     
                           
                                                                                       
                                                                             
                                                                        
                           
                                                                                                                 
                                                                              
                                                                                                                        
                                                                                                                       
                                                                                                                       
                                                                                                                         
                                                                     
                     
                                                                                                                                     
                                                                                                                                 
                                                                                                                                   
                                                                                                                                 
                                                                                                                               
                                                                                                                                  
                                                                                                                                     
                                                                                                                                      
                                                                                                                                
                           
                                                                                                         
                                                                              
                                                                                                                       
                                                                                                                      
                                                                                                                      
                                                                                                                        
                                                                   
                     
                                                                                                                                
                                                                         
                                                                                                                                     
                                                                       
                                                                                                                                   
                                                                     
                                                                                                                                    
                                                                      
                                                                                                                                   
                                                                     
                                                                                                                                  
                                                                    
                                                                                                                    
                                                                
       
  }

  part def ObservationSessionController :> Thread {
    port sessionDecision : DataPort { in :>> type : SessionDecision; }
    port sessionPhaseOutput : DataPort { out :>> type : ObservationSessionState; }
    port sessionSnapshot : DataPort { out :>> type : SessionSnapshot; }
    port cameraAcquisitionCommand : DataPort { out :>> type : CameraAcquisitionCommand; }
    port radioDeliveryCommand : DataPort { out :>> type : RadioDeliveryCommand; }

    language "GUMBO" /*{
      state
        committedSession: Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState;
      initialize
        guarantee INIT_SESSION_COMMANDS_AND_SNAPSHOT:
          committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.IDLE &
          sessionPhaseOutput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.IDLE &
          sessionSnapshot.preSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotPreSessionState.IDLE &
          sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.IDLE &
          sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.NO_CHANGE &
          sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.NONE &
          cameraAcquisitionCommand == Observation_Acquisition_Radio_Delivery_Coordinator::CameraAcquisitionCommand.HOLD &
          radioDeliveryCommand == Observation_Acquisition_Radio_Delivery_Coordinator::RadioDeliveryCommand.HOLD;
      compute
        guarantee PUBLISH_PRE_SESSION:
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.IDLE implies sessionPhaseOutput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.IDLE) &
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.ACQUIRING implies sessionPhaseOutput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.ACQUIRING) &
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.QUEUED implies sessionPhaseOutput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.QUEUED) &
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SENDING implies sessionPhaseOutput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SENDING) &
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SUSPENDED implies sessionPhaseOutput == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SUSPENDED);
        guarantee COMPLETE_SNAPSHOT:
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.IDLE implies sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.IDLE) &
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.ACQUIRING implies sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.ACQUIRING) &
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.QUEUED implies sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.QUEUED) &
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SENDING implies sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.SENDING) &
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SUSPENDED implies sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.SUSPENDED);
        guarantee CAMERA_COMMAND_FROM_NEXT_STATE:
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.ACQUIRING implies cameraAcquisitionCommand == Observation_Acquisition_Radio_Delivery_Coordinator::CameraAcquisitionCommand.ACQUIRE) &
          (committedSession != Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.ACQUIRING implies cameraAcquisitionCommand == Observation_Acquisition_Radio_Delivery_Coordinator::CameraAcquisitionCommand.HOLD);
        guarantee RADIO_COMMAND_FROM_NEXT_STATE:
          (committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SENDING implies radioDeliveryCommand == Observation_Acquisition_Radio_Delivery_Coordinator::RadioDeliveryCommand.SEND_OBSERVATION) &
          (committedSession != Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SENDING implies radioDeliveryCommand == Observation_Acquisition_Radio_Delivery_Coordinator::RadioDeliveryCommand.HOLD);
        guarantee RECOVERY_REASON_PRESERVATION:
          sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.RECOVERY_APPLIED implies
            (sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE |
             sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.ENERGY_LOW |
             sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.CONTEXT_INELIGIBLE |
             sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.CAMERA_UNUSABLE |
             sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.RADIO_UNAVAILABLE);
        compute_cases
          case CASE_19_TOTAL_STATE_COMMAND_RESULT:
            assume T;
            guarantee
              (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.BEGIN_ACQUISITION implies
                committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.ACQUIRING &
                sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.STARTED &
                sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.NONE) &
              (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.CANCEL_TO_IDLE implies
                committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.IDLE &
                sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.CANCELLED &
                sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.CANCELLED) &
              (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.SUSPEND_EVIDENCE implies
                committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SUSPENDED &
                sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE) &
              (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.SUSPEND_ENERGY implies
                committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SUSPENDED &
                sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.ENERGY_LOW) &
              (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.SUSPEND_CONTEXT implies
                committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SUSPENDED &
                sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.CONTEXT_INELIGIBLE) &
              (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.SUSPEND_CAMERA implies
                committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SUSPENDED &
                sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.CAMERA_UNUSABLE) &
              (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.SUSPEND_RADIO implies
                committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SUSPENDED &
                sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.RECOVERY_APPLIED &
                sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.RADIO_UNAVAILABLE) &
              ((sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.QUEUE_CAPTURE |
                sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.RETRY_QUEUE) implies
                committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.QUEUED &
                sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.PROGRESSED &
                sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.NONE) &
              (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.BEGIN_TRANSMISSION implies
                committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.SENDING &
                sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.PROGRESSED &
                sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.NONE) &
              (sessionDecision == Observation_Acquisition_Radio_Delivery_Coordinator::SessionDecision.COMPLETE_TO_IDLE implies
                committedSession == Observation_Acquisition_Radio_Delivery_Coordinator::ObservationSessionState.IDLE &
                sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.COMPLETED &
                sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.NONE);
    }*/
                        
           
                         
                                                   
                
                 
                           
                                                                                                                                        
                                                              
                                                                
                                                                        
                                                                          
                                                                                      
                                                                       
                                                                       
                                                              
             
                 
                          
                                                                                      
                                                       
                 
                           
                                                                                                        
                                                                           
                                                                             
                                                                                
                                                                                  
                                                                             
                                                                               
                                                                              
                                                                                
                                                                                
                                                                                  
                                                                       
                                                                               
                                                                            
                                                                                    
                                                                         
                                                                                 
                                                                          
                                                                                  
                                                                            
                                                                                   
                 
                           
                                                                                                               
                                                                            
                                                                               
                                                                            
                                                                           
                 
                           
                                                                                                         
                                                                          
                                                                                
                                                                          
                                                                   
                 
                                
                                                                                                                  
                                                                                                     
                                                                                          
                                                                                
                                                                                        
                                                                                     
                                                                                       
                     
                           
                                                                                                                                           
                     
                                                                     
                                                           
                                                                                           
                                                                              
                                                                             
                                                                        
                                                                                         
                                                                              
                                                                          
                                                                   
                                                                                           
                                                                                   
                                                                            
                                                                        
                                                                                                  
                                                                                              
                                                                          
                                                                        
                                                                                                  
                                                                                    
                                                                           
                                                                        
                                                                                                  
                                                                                            
                                                                          
                                                                        
                                                                                                  
                                                                                         
                                                                         
                                                                        
                                                                                                  
                                                                                           
                                                                         
                                                                     
                                                                                            
                                                                              
                                                                              
                                                                      
                                                                                            
                                                                              
                                                                            
                                                                   
                                                                                           
                                                                              
                                                                       
                                                                     
                                                                                            
                                                                              
                                                                           
                                                           
                                                                                          
                                                                                              
                                                                         
                                                           
                                                                                          
                                                                                    
                                                                          
                                                           
                                                                                          
                                                                                            
                                                                         
                                                           
                                                                                          
                                                                                         
                                                                        
                                                           
                                                                                          
                                                                                          
       
  }

  part def CoordinationOutcomePolicy :> Thread {
    port batteryAssessment : DataPort { in :>> type : BatteryAssessment; }
    port sessionSnapshot : DataPort { in :>> type : SessionSnapshot; }
    port operatorCoordinationStatus : DataPort { out :>> type : OperatorCoordinationStatus; }
    port droneControlObservationNotice : DataPort { out :>> type : DroneControlObservationNotice; }

    language "GUMBO" /*{
      initialize
        guarantee INIT_COORDINATION_OUTCOMES:
          operatorCoordinationStatus.batteryAssessment == batteryAssessment &
          (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.IDLE implies operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::StatusSessionState.IDLE) &
          (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.ACQUIRING implies operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::StatusSessionState.ACQUIRING) &
          (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.QUEUED implies operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::StatusSessionState.QUEUED) &
          (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.SENDING implies operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::StatusSessionState.SENDING) &
          (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.SUSPENDED implies operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::StatusSessionState.SUSPENDED);
      compute
        compute_cases
          case CASE_20_RECIPIENT_SPECIFIC_OUTCOMES:
            assume T;
            guarantee
              operatorCoordinationStatus.batteryAssessment == batteryAssessment &
              (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.IDLE implies operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::StatusSessionState.IDLE) &
              (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.ACQUIRING implies operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::StatusSessionState.ACQUIRING) &
              (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.QUEUED implies operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::StatusSessionState.QUEUED) &
              (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.SENDING implies operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::StatusSessionState.SENDING) &
              (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.SUSPENDED implies operatorCoordinationStatus.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::StatusSessionState.SUSPENDED) &
              (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.NO_CHANGE implies operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::StatusCoordinationDisposition.NO_CHANGE) &
              (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.STARTED implies operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::StatusCoordinationDisposition.STARTED) &
              (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.CANCELLED implies operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::StatusCoordinationDisposition.CANCELLED) &
              (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.PROGRESSED implies operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::StatusCoordinationDisposition.PROGRESSED) &
              (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.COMPLETED implies operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::StatusCoordinationDisposition.COMPLETED) &
              (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.RECOVERY_APPLIED implies operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::StatusCoordinationDisposition.RECOVERY_APPLIED) &
              (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.REJECTED implies operatorCoordinationStatus.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::StatusCoordinationDisposition.REJECTED) &
              (sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.NONE implies operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator::StatusCoordinationReason.NONE) &
              (sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.CANCELLED implies operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator::StatusCoordinationReason.CANCELLED) &
              (sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE implies operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator::StatusCoordinationReason.EVIDENCE_UNAVAILABLE) &
              (sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.ENERGY_LOW implies operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator::StatusCoordinationReason.ENERGY_LOW) &
              (sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.CONTEXT_INELIGIBLE implies operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator::StatusCoordinationReason.CONTEXT_INELIGIBLE) &
              (sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.CAMERA_UNUSABLE implies operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator::StatusCoordinationReason.CAMERA_UNUSABLE) &
              (sessionSnapshot.reason == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationReason.RADIO_UNAVAILABLE implies operatorCoordinationStatus.reason == Observation_Acquisition_Radio_Delivery_Coordinator::StatusCoordinationReason.RADIO_UNAVAILABLE) &
              (batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryAssessment.UNAVAILABLE implies operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator::OperatorAdvisory.EVIDENCE_UNAVAILABLE) &
              (batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryAssessment.LOW implies operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator::OperatorAdvisory.ENERGY_LOW) &
              ((batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryAssessment.ADEQUATE &
                sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.REJECTED) implies operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator::OperatorAdvisory.REQUEST_REJECTED) &
              ((batteryAssessment == Observation_Acquisition_Radio_Delivery_Coordinator::BatteryAssessment.ADEQUATE &
                sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.COMPLETED) implies operatorCoordinationStatus.advisory == Observation_Acquisition_Radio_Delivery_Coordinator::OperatorAdvisory.DELIVERY_COMPLETED) &
              (sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.COMPLETED implies droneControlObservationNotice == Observation_Acquisition_Radio_Delivery_Coordinator::DroneControlObservationNotice.DELIVERY_REPORTED) &
              ((sessionSnapshot.disposition != Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.COMPLETED &
                (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.ACQUIRING |
                 sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.QUEUED |
                 sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.SENDING)) implies droneControlObservationNotice == Observation_Acquisition_Radio_Delivery_Coordinator::DroneControlObservationNotice.OBSERVATION_ACTIVE) &
              ((sessionSnapshot.disposition != Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.COMPLETED &
                (sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.SUSPENDED |
                 sessionSnapshot.disposition == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.REJECTED)) implies droneControlObservationNotice == Observation_Acquisition_Radio_Delivery_Coordinator::DroneControlObservationNotice.OBSERVATION_BLOCKED) &
              ((sessionSnapshot.disposition != Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.COMPLETED &
                sessionSnapshot.nextSession == Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotNextSessionState.IDLE &
                sessionSnapshot.disposition != Observation_Acquisition_Radio_Delivery_Coordinator::SnapshotCoordinationDisposition.REJECTED) implies droneControlObservationNotice == Observation_Acquisition_Radio_Delivery_Coordinator::DroneControlObservationNotice.IDLE);
    }*/
                        
                
                 
                           
                                                                                                                              
                                                                               
                                                                                   
                                                                                    
                                                                                        
                                                                                         
                                                                                     
                                                                                      
                                                                                      
                                                                                       
                                                                                        
                                                                                         
                                                                                               
                                                                                                    
                                                                                             
                                                                                                  
                                                                                               
                                                                                                    
                                                                                                
                                                                                                     
                                                                                               
                                                                                                    
                                                                                                      
                                                                                                           
                                                                                              
                                                                                                   
                                                                                
                                                                                     
                                                                                     
                                                                                          
                                                                                                
                                                                                                     
                                                                                      
                                                                                           
                                                                                              
                                                                                                   
                                                                                           
                                                                                                
                                                                                             
                                                                                                  
                                                                         
                                                                                               
                                                                 
                                                                                     
                                                               
                                                                                               
                                                                                                
                                                                                               
                                                               
                                                                                               
                                                                                      
                                                                                     
                                                               
                                                                                               
                                                                                              
                                                                                             
                                                               
                                                                                               
                                                                                           
                                                                                          
                                                               
                                                                                               
                                                                                             
                                                                                            
                                                               
                                                                                              
                                                                                           
                                                               
                                                                                               
                                                                                             
                                                               
                                                                                                 
                                                                                                                                               
                                                                                                 
                                                                                         
                                                                                                   
                                                                               
                                                                                               
                                                                                                   
                                                                                        
                                                                                  
                                                                               
                                                                                        
                                                                                                    
                                                                                        
                                                                                
                                                                             
                                                                              
                                                                                  
                                                                                                
                                                                                                     
                                                                                        
                                                                            
                                                                                              
                                                                                     
             
                     
                           
                                                                                                                                       
                     
                                                                                 
                                                                                     
                                                                                      
                                                                                          
                                                                                           
                                                                                       
                                                                                        
                                                                                        
                                                                                         
                                                                                          
                                                                                           
                                                                                                 
                                                                                                      
                                                                                               
                                                                                                    
                                                                                                 
                                                                                                      
                                                                                                  
                                                                                                       
                                                                                                 
                                                                                                      
                                                                                                        
                                                                                                             
                                                                                                
                                                                                                     
                                                                                  
                                                                                       
                                                                                       
                                                                                            
                                                                                                  
                                                                                                       
                                                                                        
                                                                                             
                                                                                                
                                                                                                     
                                                                                             
                                                                                                  
                                                                                               
                                                                                                    
                                                                           
                                                                                                 
                                                                   
                                                                                       
                                                                 
                                                                                                 
                                                                                                  
                                                                                                 
                                                                 
                                                                                                 
                                                                                        
                                                                                       
                                                                 
                                                                                                 
                                                                                                
                                                                                               
                                                                 
                                                                                                 
                                                                                             
                                                                                            
                                                                 
                                                                                                 
                                                                                               
                                                                                              
                                                                 
                                                                                                
                                                                                             
                                                                 
                                                                                                 
                                                                                               
                                                                 
                                                                                                   
                                                                                                                                                 
                                                                                                   
                                                                                           
                                                                                                     
                                                                                 
                                                                                                 
                                                                                                     
                                                                                          
                                                                                    
                                                                                 
                                                                                          
                                                                                                      
                                                                                          
                                                                                  
                                                                               
                                                                                
                                                                                    
                                                                                                  
                                                                                                       
                                                                                          
                                                                              
                                                                                                
                                                                                       
       
  }

  part def CoordinatorProcess :> Process {
    port observationIntent : DataPort { in :>> type : ObservationIntent; }
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    port sortieContext : DataPort { in :>> type : SortieContext; }
    port cameraCondition : DataPort { in :>> type : CameraCondition; }
    port captureResult : DataPort { in :>> type : CaptureResult; }
    port radioCondition : DataPort { in :>> type : RadioCondition; }
    port deliveryResult : DataPort { in :>> type : DeliveryResult; }
    port cameraAcquisitionCommand : DataPort { out :>> type : CameraAcquisitionCommand; }
    port radioDeliveryCommand : DataPort { out :>> type : RadioDeliveryCommand; }
    port operatorCoordinationStatus : DataPort { out :>> type : OperatorCoordinationStatus; }
    port droneControlObservationNotice : DataPort { out :>> type : DroneControlObservationNotice; }

    part batteryEvidenceQualifier : BatteryEvidenceQualifier;
    part sortieApplicabilityQualifier : SortieApplicabilityQualifier;
    part cameraEvidenceQualifier : CameraEvidenceQualifier;
    part radioEvidenceQualifier : RadioEvidenceQualifier;
    part sessionProposalOwner : SessionProposalOwner;
    part observationIntentArbiter : ObservationIntentArbiter;
    part observationSessionController : ObservationSessionController;
    part coordinationOutcomePolicy : CoordinationOutcomePolicy;

    connection int01 : PortConnection connect batteryCapacity to batteryEvidenceQualifier.batteryCapacity;
    connection int02 : PortConnection connect batteryCheck to batteryEvidenceQualifier.batteryCheck;
    connection int03 : PortConnection connect sortieContext to sortieApplicabilityQualifier.sortieContext;
    connection int04 : PortConnection connect cameraCondition to cameraEvidenceQualifier.cameraCondition;
    connection int05 : PortConnection connect captureResult to cameraEvidenceQualifier.captureResult;
    connection int06 : PortConnection connect radioCondition to radioEvidenceQualifier.radioCondition;
    connection int07 : PortConnection connect deliveryResult to radioEvidenceQualifier.deliveryResult;
    connection int08 : PortConnection connect observationIntent to observationIntentArbiter.observationIntent;
    connection int09 : PortConnection connect batteryEvidenceQualifier.batteryAssessment to sortieApplicabilityQualifier.batteryAssessment;
    connection int10 : PortConnection connect batteryEvidenceQualifier.batteryAssessment to coordinationOutcomePolicy.batteryAssessment;
    connection int11 : PortConnection connect sortieApplicabilityQualifier.sortieQualification to sessionProposalOwner.sortieQualification;
    connection int12 : PortConnection connect cameraEvidenceQualifier.cameraEvidence to sessionProposalOwner.cameraEvidence;
    connection int13 : PortConnection connect radioEvidenceQualifier.radioEvidence to sessionProposalOwner.radioEvidence;
    connection int14 : PortConnection connect observationSessionController.sessionPhaseOutput to sessionProposalOwner.sessionPhaseInput;
    connection int15 : PortConnection connect sessionProposalOwner.sessionProposal to observationIntentArbiter.sessionProposal;
    connection int16 : PortConnection connect observationIntentArbiter.sessionDecision to observationSessionController.sessionDecision;
    connection int17 : PortConnection connect observationSessionController.sessionSnapshot to coordinationOutcomePolicy.sessionSnapshot;
    connection int18 : PortConnection connect observationSessionController.cameraAcquisitionCommand to cameraAcquisitionCommand;
    connection int19 : PortConnection connect observationSessionController.radioDeliveryCommand to radioDeliveryCommand;
    connection int20 : PortConnection connect coordinationOutcomePolicy.operatorCoordinationStatus to operatorCoordinationStatus;
    connection int21 : PortConnection connect coordinationOutcomePolicy.droneControlObservationNotice to droneControlObservationNotice;
  }

  part def ObservationAcquisitionRadioDeliveryCoordinator :> System {
    port observationIntent : DataPort { in :>> type : ObservationIntent; }
    port batteryCapacity : DataPort { in :>> type : BatteryCapacityBand; }
    port batteryCheck : DataPort { in :>> type : BatteryCheck; }
    port sortieContext : DataPort { in :>> type : SortieContext; }
    port cameraCondition : DataPort { in :>> type : CameraCondition; }
    port captureResult : DataPort { in :>> type : CaptureResult; }
    port radioCondition : DataPort { in :>> type : RadioCondition; }
    port deliveryResult : DataPort { in :>> type : DeliveryResult; }
    port cameraAcquisitionCommand : DataPort { out :>> type : CameraAcquisitionCommand; }
    port radioDeliveryCommand : DataPort { out :>> type : RadioDeliveryCommand; }
    port operatorCoordinationStatus : DataPort { out :>> type : OperatorCoordinationStatus; }
    port droneControlObservationNotice : DataPort { out :>> type : DroneControlObservationNotice; }

    part coordinatorProcess : CoordinatorProcess;

    connection supportObservationIntent : PortConnection connect observationIntent to coordinatorProcess.observationIntent;
    connection supportBatteryCapacity : PortConnection connect batteryCapacity to coordinatorProcess.batteryCapacity;
    connection supportBatteryCheck : PortConnection connect batteryCheck to coordinatorProcess.batteryCheck;
    connection supportSortieContext : PortConnection connect sortieContext to coordinatorProcess.sortieContext;
    connection supportCameraCondition : PortConnection connect cameraCondition to coordinatorProcess.cameraCondition;
    connection supportCaptureResult : PortConnection connect captureResult to coordinatorProcess.captureResult;
    connection supportRadioCondition : PortConnection connect radioCondition to coordinatorProcess.radioCondition;
    connection supportDeliveryResult : PortConnection connect deliveryResult to coordinatorProcess.deliveryResult;
    connection supportCameraCommand : PortConnection connect coordinatorProcess.cameraAcquisitionCommand to cameraAcquisitionCommand;
    connection supportRadioCommand : PortConnection connect coordinatorProcess.radioDeliveryCommand to radioDeliveryCommand;
    connection supportOperatorStatus : PortConnection connect coordinatorProcess.operatorCoordinationStatus to operatorCoordinationStatus;
    connection supportDroneNotice : PortConnection connect coordinatorProcess.droneControlObservationNotice to droneControlObservationNotice;
  }

  part observationAcquisitionRadioDeliveryCoordinator : ObservationAcquisitionRadioDeliveryCoordinator;
}
