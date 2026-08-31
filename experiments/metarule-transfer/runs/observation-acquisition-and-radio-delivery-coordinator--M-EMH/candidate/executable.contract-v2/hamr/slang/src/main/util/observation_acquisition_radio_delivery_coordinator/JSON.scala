// #Sireum
// @formatter:off

// This file is auto-generated from BatteryCapacityBand.scala, BatteryCheck.scala, BatteryAssessment.scala, SortieContext.scala, SortieQualification.scala, CameraCondition.scala, CaptureResult.scala, CameraEvidence.scala, RadioCondition.scala, DeliveryResult.scala, RadioEvidence.scala, ObservationSessionState.scala, SessionProposal.scala, ObservationIntent.scala, SessionDecision.scala, SnapshotPreSessionState.scala, SnapshotNextSessionState.scala, SnapshotCoordinationDisposition.scala, SnapshotCoordinationReason.scala, CameraAcquisitionCommand.scala, RadioDeliveryCommand.scala, StatusSessionState.scala, StatusCoordinationDisposition.scala, StatusCoordinationReason.scala, OperatorAdvisory.scala, DroneControlObservationNotice.scala, SessionSnapshot.scala, OperatorCoordinationStatus.scala, Base_Types.scala, BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_Containers.scala, SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_Containers.scala, CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_Containers.scala, RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_Containers.scala, SessionProposalOwner_coordinatorProcess_sessionProposalOwner_Containers.scala, ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_Containers.scala, ObservationSessionController_coordinatorProcess_observationSessionController_Containers.scala, CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package observation_acquisition_radio_delivery_coordinator

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.LOW => "LOW"
        case Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.USABLE => "USABLE"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.INVALID => "INVALID"
        case Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.VALID => "VALID"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.UNAVAILABLE => "UNAVAILABLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.LOW => "LOW"
        case Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.ADEQUATE => "ADEQUATE"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextType(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.OUTSIDE_OBSERVATION_POSITION => "OUTSIDE_OBSERVATION_POSITION"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.AT_OBSERVATION_POSITION => "AT_OBSERVATION_POSITION"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_EVIDENCE => "BLOCKED_EVIDENCE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_ENERGY => "BLOCKED_ENERGY"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_CONTEXT => "BLOCKED_CONTEXT"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE => "ELIGIBLE"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.UNAVAILABLE => "UNAVAILABLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.READY => "READY"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType(o: Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.NONE => "NONE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.CAPTURED => "CAPTURED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.FAILED => "FAILED"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE => "UNAVAILABLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.READY => "READY"
        case Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.CAPTURED => "CAPTURED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.FAILED => "FAILED"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.UNAVAILABLE => "UNAVAILABLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.READY => "READY"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType(o: Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.NONE => "NONE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.ACCEPTED => "ACCEPTED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.REJECTED => "REJECTED"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE => "UNAVAILABLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.READY => "READY"
        case Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.ACCEPTED => "ACCEPTED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.REJECTED => "REJECTED"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE => "IDLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING => "ACQUIRING"
        case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED => "QUEUED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING => "SENDING"
        case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED => "SUSPENDED"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE => "BLOCK_EVIDENCE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_ENERGY => "BLOCK_ENERGY"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CONTEXT => "BLOCK_CONTEXT"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CAMERA => "BLOCK_CAMERA"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_RADIO => "BLOCK_RADIO"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE => "RECOVER_EVIDENCE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY => "RECOVER_ENERGY"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT => "RECOVER_CONTEXT"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA => "RECOVER_CAMERA"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO => "RECOVER_RADIO"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.STARTABLE => "STARTABLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.HOLD => "HOLD"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE => "CAPTURE_COMPLETE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY => "BEGIN_DELIVERY"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE => "DELIVERY_COMPLETE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED => "DELIVERY_REJECTED"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.NO_REQUEST => "NO_REQUEST"
        case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.START_OBSERVATION => "START_OBSERVATION"
        case Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.CANCEL_OBSERVATION => "CANCEL_OBSERVATION"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.NO_CHANGE => "NO_CHANGE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_ACQUISITION => "BEGIN_ACQUISITION"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.CANCEL_TO_IDLE => "CANCEL_TO_IDLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_EVIDENCE => "SUSPEND_EVIDENCE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_ENERGY => "SUSPEND_ENERGY"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CONTEXT => "SUSPEND_CONTEXT"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_CAMERA => "SUSPEND_CAMERA"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.SUSPEND_RADIO => "SUSPEND_RADIO"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.QUEUE_CAPTURE => "QUEUE_CAPTURE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.BEGIN_TRANSMISSION => "BEGIN_TRANSMISSION"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.COMPLETE_TO_IDLE => "COMPLETE_TO_IDLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.RETRY_QUEUE => "RETRY_QUEUE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_EVIDENCE => "REJECT_EVIDENCE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_ENERGY => "REJECT_ENERGY"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CONTEXT => "REJECT_CONTEXT"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_CAMERA => "REJECT_CAMERA"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.REJECT_RADIO => "REJECT_RADIO"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionStateType(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.IDLE => "IDLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.ACQUIRING => "ACQUIRING"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.QUEUED => "QUEUED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.SENDING => "SENDING"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.SUSPENDED => "SUSPENDED"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionStateType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionStateType(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.IDLE => "IDLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.ACQUIRING => "ACQUIRING"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.QUEUED => "QUEUED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SENDING => "SENDING"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.SUSPENDED => "SUSPENDED"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionStateType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDispositionType(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.NO_CHANGE => "NO_CHANGE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.STARTED => "STARTED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.CANCELLED => "CANCELLED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.PROGRESSED => "PROGRESSED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.COMPLETED => "COMPLETED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.RECOVERY_APPLIED => "RECOVERY_APPLIED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.REJECTED => "REJECTED"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDispositionType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReasonType(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.NONE => "NONE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CANCELLED => "CANCELLED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.EVIDENCE_UNAVAILABLE => "EVIDENCE_UNAVAILABLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.ENERGY_LOW => "ENERGY_LOW"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CONTEXT_INELIGIBLE => "CONTEXT_INELIGIBLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.CAMERA_UNUSABLE => "CAMERA_UNUSABLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.RADIO_UNAVAILABLE => "RADIO_UNAVAILABLE"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReasonType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.HOLD => "HOLD"
        case Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.ACQUIRE => "ACQUIRE"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.HOLD => "HOLD"
        case Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.SEND_OBSERVATION => "SEND_OBSERVATION"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionStateType(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.IDLE => "IDLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.ACQUIRING => "ACQUIRING"
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.QUEUED => "QUEUED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.SENDING => "SENDING"
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.SUSPENDED => "SUSPENDED"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionStateType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDispositionType(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.NO_CHANGE => "NO_CHANGE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.STARTED => "STARTED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.CANCELLED => "CANCELLED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.PROGRESSED => "PROGRESSED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.COMPLETED => "COMPLETED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.RECOVERY_APPLIED => "RECOVERY_APPLIED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.REJECTED => "REJECTED"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDispositionType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReasonType(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.NONE => "NONE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CANCELLED => "CANCELLED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.EVIDENCE_UNAVAILABLE => "EVIDENCE_UNAVAILABLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.ENERGY_LOW => "ENERGY_LOW"
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CONTEXT_INELIGIBLE => "CONTEXT_INELIGIBLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.CAMERA_UNUSABLE => "CAMERA_UNUSABLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.RADIO_UNAVAILABLE => "RADIO_UNAVAILABLE"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReasonType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisoryType(o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.NONE => "NONE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.EVIDENCE_UNAVAILABLE => "EVIDENCE_UNAVAILABLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.ENERGY_LOW => "ENERGY_LOW"
        case Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.CONTEXT_INELIGIBLE => "CONTEXT_INELIGIBLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.CAMERA_UNUSABLE => "CAMERA_UNUSABLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.RADIO_UNAVAILABLE => "RADIO_UNAVAILABLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.REQUEST_REJECTED => "REQUEST_REJECTED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.DELIVERY_COMPLETED => "DELIVERY_COMPLETED"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisoryType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType(o: Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.Type): ST = {
      val value: String = o match {
        case Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.IDLE => "IDLE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.OBSERVATION_ACTIVE => "OBSERVATION_ACTIVE"
        case Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.OBSERVATION_BLOCKED => "OBSERVATION_BLOCKED"
        case Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.DELIVERY_REPORTED => "DELIVERY_REPORTED"
      }
      return printObject(ISZ(
        ("type", printString("Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice")),
        ("value", printString(value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot""""),
        ("preSession", printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionStateType(o.preSession)),
        ("nextSession", printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionStateType(o.nextSession)),
        ("disposition", printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDispositionType(o.disposition)),
        ("reason", printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReasonType(o.reason))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(o.value))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus""""),
        ("nextSession", printObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionStateType(o.nextSession)),
        ("batteryAssessment", printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o.batteryAssessment)),
        ("disposition", printObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDispositionType(o.disposition)),
        ("reason", printObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReasonType(o.reason)),
        ("advisory", printObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisoryType(o.advisory))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload""""),
        ("value", printObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(o.value))
      ))
    }

    @pure def printBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Boolean_Payload""""),
        ("value", printB(o.value))
      ))
    }

    @pure def printBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_Payload""""),
        ("value", printZ(o.value))
      ))
    }

    @pure def printBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_8_Payload""""),
        ("value", printS8(o.value))
      ))
    }

    @pure def printBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_16_Payload""""),
        ("value", printS16(o.value))
      ))
    }

    @pure def printBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_32_Payload""""),
        ("value", printS32(o.value))
      ))
    }

    @pure def printBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_64_Payload""""),
        ("value", printS64(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_8_Payload""""),
        ("value", printU8(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_16_Payload""""),
        ("value", printU16(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_32_Payload""""),
        ("value", printU32(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_64_Payload""""),
        ("value", printU64(o.value))
      ))
    }

    @pure def printBase_TypesFloat_Payload(o: Base_Types.Float_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_Payload""""),
        ("value", printR(o.value))
      ))
    }

    @pure def printBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_32_Payload""""),
        ("value", printF32(o.value))
      ))
    }

    @pure def printBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_64_Payload""""),
        ("value", printF64(o.value))
      ))
    }

    @pure def printBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Character_Payload""""),
        ("value", printC(o.value))
      ))
    }

    @pure def printBase_TypesString_Payload(o: Base_Types.String_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.String_Payload""""),
        ("value", printString(o.value))
      ))
    }

    @pure def printBase_TypesBits_Payload(o: Base_Types.Bits_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Bits_Payload""""),
        ("value", printISZ(T, o.value, printB _))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P""""),
        ("api_batteryCapacity", printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType(o.api_batteryCapacity)),
        ("api_batteryCheck", printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType(o.api_batteryCheck))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS""""),
        ("api_batteryCapacity", printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType(o.api_batteryCapacity)),
        ("api_batteryCheck", printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType(o.api_batteryCheck))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P""""),
        ("api_batteryAssessment", printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o.api_batteryAssessment))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS""""),
        ("api_batteryAssessment", printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o.api_batteryAssessment))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container): ST = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P""""),
        ("api_batteryAssessment", printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o.api_batteryAssessment)),
        ("api_sortieContext", printObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextType(o.api_sortieContext))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS""""),
        ("api_batteryAssessment", printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o.api_batteryAssessment)),
        ("api_sortieContext", printObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextType(o.api_sortieContext))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container): ST = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P""""),
        ("api_sortieQualification", printObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType(o.api_sortieQualification))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS""""),
        ("api_sortieQualification", printObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType(o.api_sortieQualification))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P""""),
        ("api_cameraCondition", printObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType(o.api_cameraCondition)),
        ("api_captureResult", printObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType(o.api_captureResult))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS""""),
        ("api_cameraCondition", printObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType(o.api_cameraCondition)),
        ("api_captureResult", printObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType(o.api_captureResult))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P""""),
        ("api_cameraEvidence", printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType(o.api_cameraEvidence))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS""""),
        ("api_cameraEvidence", printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType(o.api_cameraEvidence))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container): ST = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P""""),
        ("api_deliveryResult", printObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType(o.api_deliveryResult)),
        ("api_radioCondition", printObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType(o.api_radioCondition))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS""""),
        ("api_deliveryResult", printObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType(o.api_deliveryResult)),
        ("api_radioCondition", printObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType(o.api_radioCondition))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container): ST = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P""""),
        ("api_radioEvidence", printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType(o.api_radioEvidence))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS""""),
        ("api_radioEvidence", printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType(o.api_radioEvidence))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container): ST = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P""""),
        ("api_cameraEvidence", printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType(o.api_cameraEvidence)),
        ("api_radioEvidence", printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType(o.api_radioEvidence)),
        ("api_sessionPhaseInput", printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(o.api_sessionPhaseInput)),
        ("api_sortieQualification", printObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType(o.api_sortieQualification))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS""""),
        ("api_cameraEvidence", printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType(o.api_cameraEvidence)),
        ("api_radioEvidence", printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType(o.api_radioEvidence)),
        ("api_sessionPhaseInput", printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(o.api_sessionPhaseInput)),
        ("api_sortieQualification", printObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType(o.api_sortieQualification))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container): ST = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P""""),
        ("api_sessionProposal", printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType(o.api_sessionProposal))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS""""),
        ("api_sessionProposal", printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType(o.api_sessionProposal))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container): ST = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P""""),
        ("api_observationIntent", printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType(o.api_observationIntent)),
        ("api_sessionProposal", printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType(o.api_sessionProposal))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS""""),
        ("api_observationIntent", printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType(o.api_observationIntent)),
        ("api_sessionProposal", printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType(o.api_sessionProposal))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container): ST = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P""""),
        ("api_sessionDecision", printObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType(o.api_sessionDecision))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS""""),
        ("api_sessionDecision", printObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType(o.api_sessionDecision))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container): ST = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P""""),
        ("api_sessionDecision", printObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType(o.api_sessionDecision))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS""""),
        ("In_committedSession", printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(o.In_committedSession)),
        ("api_sessionDecision", printObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType(o.api_sessionDecision))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container): ST = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P""""),
        ("api_cameraAcquisitionCommand", printObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType(o.api_cameraAcquisitionCommand)),
        ("api_radioDeliveryCommand", printObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType(o.api_radioDeliveryCommand)),
        ("api_sessionPhaseOutput", printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(o.api_sessionPhaseOutput)),
        ("api_sessionSnapshot", printObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(o.api_sessionSnapshot))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS""""),
        ("committedSession", printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(o.committedSession)),
        ("api_cameraAcquisitionCommand", printObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType(o.api_cameraAcquisitionCommand)),
        ("api_radioDeliveryCommand", printObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType(o.api_radioDeliveryCommand)),
        ("api_sessionPhaseOutput", printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(o.api_sessionPhaseOutput)),
        ("api_sessionSnapshot", printObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(o.api_sessionSnapshot))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container): ST = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(o)
      }
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P""""),
        ("api_batteryAssessment", printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o.api_batteryAssessment)),
        ("api_sessionSnapshot", printObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(o.api_sessionSnapshot))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS""""),
        ("api_batteryAssessment", printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(o.api_batteryAssessment)),
        ("api_sessionSnapshot", printObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(o.api_sessionSnapshot))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container): ST = {
      o match {
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(o)
      }
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P""""),
        ("api_droneControlObservationNotice", printObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType(o.api_droneControlObservationNotice)),
        ("api_operatorCoordinationStatus", printObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(o.api_operatorCoordinationStatus))
      ))
    }

    @pure def printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS""""),
        ("api_droneControlObservationNotice", printObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType(o.api_droneControlObservationNotice)),
        ("api_operatorCoordinationStatus", printObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(o.api_operatorCoordinationStatus))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_batteryEvidenceQualifier_postInit => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_batteryEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_batteryEvidenceQualifier_preCompute => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_batteryEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_batteryEvidenceQualifier_postCompute => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_batteryEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_sortieApplicabilityQualifier_postInit => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_sortieApplicabilityQualifier_postInit"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_sortieApplicabilityQualifier_preCompute => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_sortieApplicabilityQualifier_preCompute"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_sortieApplicabilityQualifier_postCompute => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_sortieApplicabilityQualifier_postCompute"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_cameraEvidenceQualifier_postInit => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_cameraEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_cameraEvidenceQualifier_preCompute => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_cameraEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_cameraEvidenceQualifier_postCompute => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_cameraEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_radioEvidenceQualifier_postInit => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_radioEvidenceQualifier_postInit"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_radioEvidenceQualifier_preCompute => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_radioEvidenceQualifier_preCompute"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_radioEvidenceQualifier_postCompute => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_radioEvidenceQualifier_postCompute"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_sessionProposalOwner_postInit => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_sessionProposalOwner_postInit"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_sessionProposalOwner_preCompute => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_sessionProposalOwner_preCompute"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_sessionProposalOwner_postCompute => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_sessionProposalOwner_postCompute"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_observationIntentArbiter_postInit => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_observationIntentArbiter_postInit"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_observationIntentArbiter_preCompute => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_observationIntentArbiter_preCompute"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_observationIntentArbiter_postCompute => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_observationIntentArbiter_postCompute"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_observationSessionController_postInit => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_observationSessionController_postInit"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_observationSessionController_preCompute => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_observationSessionController_preCompute"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_observationSessionController_postCompute => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_observationSessionController_postCompute"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_coordinationOutcomePolicy_postInit => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_coordinationOutcomePolicy_postInit"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_coordinationOutcomePolicy_preCompute => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_coordinationOutcomePolicy_preCompute"
        case runtimemonitor.ObservationKind.ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_coordinationOutcomePolicy_postCompute => "ObservationAcquisitionRadioDeliveryCoordinator_Instance_coordinatorProcess_coordinationOutcomePolicy_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(o)
      }
    }

    @pure def printutilEmptyContainer(o: util.EmptyContainer): ST = {
      return printObject(ISZ(
        ("type", st""""util.EmptyContainer"""")
      ))
    }

    @pure def print_artDataContent(o: art.DataContent): ST = {
      o match {
        case o: art.Empty => return print_artEmpty(o)
        case o: Base_Types.Boolean_Payload => return printBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => return printBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => return printBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => return printBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => return printBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => return printBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => return printBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => return printBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => return printBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => return printBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => return printBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => return printBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => return printBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => return printBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => return printBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => return printBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload => return printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(o)
        case o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS => return printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(o)
      }
    }

    @pure def print_artEmpty(o: art.Empty): ST = {
      return printObject(ISZ(
        ("type", st""""art.Empty"""")
      ))
    }

  }

  @record class Parser(val input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextType(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType(): Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType(): Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionStateType(): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionStateT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionStateT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionStateType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionStateType(): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionStateT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionStateT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionStateType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDispositionType(): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDispositionT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDispositionT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDispositionType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReasonType(): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReasonT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReasonT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReasonType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionStateType(): Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionStateT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionStateT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionStateType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDispositionType(): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDispositionT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDispositionT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDispositionType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReasonType(): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReasonT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReasonT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReasonType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisoryType(): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisoryT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisoryT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisoryType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType(): Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.Type = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.")
          return Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice.byOrdinal(0).get
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshotT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshotT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot")
      }
      parser.parseObjectKey("preSession")
      val preSession = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("nextSession")
      val nextSession = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("reason")
      val reason = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReasonType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot(preSession, nextSession, disposition, reason)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatusT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatusT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus")
      }
      parser.parseObjectKey("nextSession")
      val nextSession = parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("batteryAssessment")
      val batteryAssessment = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("reason")
      val reason = parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReasonType()
      parser.parseObjectNext()
      parser.parseObjectKey("advisory")
      val advisory = parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisoryType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus(nextSession, batteryAssessment, disposition, reason, advisory)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload(): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_PayloadT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_PayloadT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload(value)
    }

    def parseBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = parseBase_TypesBoolean_PayloadT(F)
      return r
    }

    def parseBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Boolean_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseB()
      parser.parseObjectNext()
      return Base_Types.Boolean_Payload(value)
    }

    def parseBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = parseBase_TypesInteger_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseZ()
      parser.parseObjectNext()
      return Base_Types.Integer_Payload(value)
    }

    def parseBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = parseBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS8()
      parser.parseObjectNext()
      return Base_Types.Integer_8_Payload(value)
    }

    def parseBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = parseBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS16()
      parser.parseObjectNext()
      return Base_Types.Integer_16_Payload(value)
    }

    def parseBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = parseBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS32()
      parser.parseObjectNext()
      return Base_Types.Integer_32_Payload(value)
    }

    def parseBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = parseBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS64()
      parser.parseObjectNext()
      return Base_Types.Integer_64_Payload(value)
    }

    def parseBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = parseBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU8()
      parser.parseObjectNext()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def parseBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = parseBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU16()
      parser.parseObjectNext()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def parseBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = parseBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU32()
      parser.parseObjectNext()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def parseBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = parseBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU64()
      parser.parseObjectNext()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def parseBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = parseBase_TypesFloat_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseR()
      parser.parseObjectNext()
      return Base_Types.Float_Payload(value)
    }

    def parseBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = parseBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF32()
      parser.parseObjectNext()
      return Base_Types.Float_32_Payload(value)
    }

    def parseBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = parseBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF64()
      parser.parseObjectNext()
      return Base_Types.Float_64_Payload(value)
    }

    def parseBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = parseBase_TypesCharacter_PayloadT(F)
      return r
    }

    def parseBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Character_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseC()
      parser.parseObjectNext()
      return Base_Types.Character_Payload(value)
    }

    def parseBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = parseBase_TypesString_PayloadT(F)
      return r
    }

    def parseBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.String_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      return Base_Types.String_Payload(value)
    }

    def parseBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = parseBase_TypesBits_PayloadT(F)
      return r
    }

    def parseBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Bits_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseISZ(parser.parseB _)
      parser.parseObjectNext()
      return Base_Types.Bits_Payload(value)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryCapacity")
      val api_batteryCapacity = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_batteryCheck")
      val api_batteryCheck = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(api_batteryCapacity, api_batteryCheck)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryCapacity")
      val api_batteryCapacity = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_batteryCheck")
      val api_batteryCheck = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheckType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(api_batteryCapacity, api_batteryCheck)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_batteryAssessment")
      val api_batteryAssessment = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(api_batteryAssessment)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_batteryAssessment")
      val api_batteryAssessment = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(api_batteryAssessment)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS"))
      t.native match {
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryAssessment")
      val api_batteryAssessment = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sortieContext")
      val api_sortieContext = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(api_batteryAssessment, api_sortieContext)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryAssessment")
      val api_batteryAssessment = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sortieContext")
      val api_sortieContext = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieContextType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(api_batteryAssessment, api_sortieContext)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS"))
      t.native match {
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_sortieQualification")
      val api_sortieQualification = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(api_sortieQualification)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_sortieQualification")
      val api_sortieQualification = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(api_sortieQualification)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_cameraCondition")
      val api_cameraCondition = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_captureResult")
      val api_captureResult = parseObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(api_cameraCondition, api_captureResult)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_cameraCondition")
      val api_cameraCondition = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_captureResult")
      val api_captureResult = parseObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResultType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(api_cameraCondition, api_captureResult)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_cameraEvidence")
      val api_cameraEvidence = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(api_cameraEvidence)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_cameraEvidence")
      val api_cameraEvidence = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(api_cameraEvidence)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS"))
      t.native match {
        case "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_deliveryResult")
      val api_deliveryResult = parseObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_radioCondition")
      val api_radioCondition = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(api_deliveryResult, api_radioCondition)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_deliveryResult")
      val api_deliveryResult = parseObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResultType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_radioCondition")
      val api_radioCondition = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioConditionType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(api_deliveryResult, api_radioCondition)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS"))
      t.native match {
        case "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_radioEvidence")
      val api_radioEvidence = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(api_radioEvidence)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_radioEvidence")
      val api_radioEvidence = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(api_radioEvidence)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS"))
      t.native match {
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_cameraEvidence")
      val api_cameraEvidence = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_radioEvidence")
      val api_radioEvidence = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionPhaseInput")
      val api_sessionPhaseInput = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sortieQualification")
      val api_sortieQualification = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(api_cameraEvidence, api_radioEvidence, api_sessionPhaseInput, api_sortieQualification)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_cameraEvidence")
      val api_cameraEvidence = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_radioEvidence")
      val api_radioEvidence = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionPhaseInput")
      val api_sessionPhaseInput = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sortieQualification")
      val api_sortieQualification = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualificationType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(api_cameraEvidence, api_radioEvidence, api_sessionPhaseInput, api_sortieQualification)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS"))
      t.native match {
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_sessionProposal")
      val api_sessionProposal = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(api_sessionProposal)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_sessionProposal")
      val api_sessionProposal = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(api_sessionProposal)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS"))
      t.native match {
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P")
      }
      parser.parseObjectKey("api_observationIntent")
      val api_observationIntent = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionProposal")
      val api_sessionProposal = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(api_observationIntent, api_sessionProposal)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_observationIntent")
      val api_observationIntent = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionProposal")
      val api_sessionProposal = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(api_observationIntent, api_sessionProposal)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS"))
      t.native match {
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P")
      }
      parser.parseObjectKey("api_sessionDecision")
      val api_sessionDecision = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(api_sessionDecision)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_sessionDecision")
      val api_sessionDecision = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(api_sessionDecision)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS"))
      t.native match {
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P")
      }
      parser.parseObjectKey("api_sessionDecision")
      val api_sessionDecision = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(api_sessionDecision)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS")
      }
      parser.parseObjectKey("In_committedSession")
      val In_committedSession = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionDecision")
      val api_sessionDecision = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecisionType()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(In_committedSession, api_sessionDecision)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS"))
      t.native match {
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P")
      }
      parser.parseObjectKey("api_cameraAcquisitionCommand")
      val api_cameraAcquisitionCommand = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_radioDeliveryCommand")
      val api_radioDeliveryCommand = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionPhaseOutput")
      val api_sessionPhaseOutput = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionSnapshot")
      val api_sessionSnapshot = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(api_cameraAcquisitionCommand, api_radioDeliveryCommand, api_sessionPhaseOutput, api_sessionSnapshot)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS")
      }
      parser.parseObjectKey("committedSession")
      val committedSession = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_cameraAcquisitionCommand")
      val api_cameraAcquisitionCommand = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_radioDeliveryCommand")
      val api_radioDeliveryCommand = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionPhaseOutput")
      val api_sessionPhaseOutput = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionSnapshot")
      val api_sessionSnapshot = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(committedSession, api_cameraAcquisitionCommand, api_radioDeliveryCommand, api_sessionPhaseOutput, api_sessionSnapshot)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS"))
      t.native match {
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PST(T); return r
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P")
      }
      parser.parseObjectKey("api_batteryAssessment")
      val api_batteryAssessment = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionSnapshot")
      val api_sessionSnapshot = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(api_batteryAssessment, api_sessionSnapshot)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PST(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batteryAssessment")
      val api_batteryAssessment = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_sessionSnapshot")
      val api_sessionSnapshot = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(api_batteryAssessment, api_sessionSnapshot)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container(): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS"))
      t.native match {
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PST(T); return r
      }
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PT(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PT(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P")
      }
      parser.parseObjectKey("api_droneControlObservationNotice")
      val api_droneControlObservationNotice = parseObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_operatorCoordinationStatus")
      val api_operatorCoordinationStatus = parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(api_droneControlObservationNotice, api_operatorCoordinationStatus)
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS = {
      val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PST(F)
      return r
    }

    def parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PST(typeParsed: B): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS")
      }
      parser.parseObjectKey("api_droneControlObservationNotice")
      val api_droneControlObservationNotice = parseObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNoticeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_operatorCoordinationStatus")
      val api_operatorCoordinationStatus = parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus()
      parser.parseObjectNext()
      return Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(api_droneControlObservationNotice, api_operatorCoordinationStatus)
    }

    def parseruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = parseruntimemonitorObservationKindT(F)
      return r
    }

    def parseruntimemonitorObservationKindT(typeParsed: B): runtimemonitor.ObservationKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("runtimemonitor.ObservationKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      runtimemonitor.ObservationKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for runtimemonitor.ObservationKind.")
          return runtimemonitor.ObservationKind.byOrdinal(0).get
      }
    }

    def parseutilContainer(): util.Container = {
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PST(T); return r
      }
    }

    def parseutilEmptyContainer(): util.EmptyContainer = {
      val r = parseutilEmptyContainerT(F)
      return r
    }

    def parseutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        parser.parseObjectType("util.EmptyContainer")
      }
      return util.EmptyContainer()
    }

    def parse_artDataContent(): art.DataContent = {
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload", "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P", "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS", "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS"))
      t.native match {
        case "art.Empty" => val r = parse_artEmptyT(T); return r
        case "Base_Types.Boolean_Payload" => val r = parseBase_TypesBoolean_PayloadT(T); return r
        case "Base_Types.Integer_Payload" => val r = parseBase_TypesInteger_PayloadT(T); return r
        case "Base_Types.Integer_8_Payload" => val r = parseBase_TypesInteger_8_PayloadT(T); return r
        case "Base_Types.Integer_16_Payload" => val r = parseBase_TypesInteger_16_PayloadT(T); return r
        case "Base_Types.Integer_32_Payload" => val r = parseBase_TypesInteger_32_PayloadT(T); return r
        case "Base_Types.Integer_64_Payload" => val r = parseBase_TypesInteger_64_PayloadT(T); return r
        case "Base_Types.Unsigned_8_Payload" => val r = parseBase_TypesUnsigned_8_PayloadT(T); return r
        case "Base_Types.Unsigned_16_Payload" => val r = parseBase_TypesUnsigned_16_PayloadT(T); return r
        case "Base_Types.Unsigned_32_Payload" => val r = parseBase_TypesUnsigned_32_PayloadT(T); return r
        case "Base_Types.Unsigned_64_Payload" => val r = parseBase_TypesUnsigned_64_PayloadT(T); return r
        case "Base_Types.Float_Payload" => val r = parseBase_TypesFloat_PayloadT(T); return r
        case "Base_Types.Float_32_Payload" => val r = parseBase_TypesFloat_32_PayloadT(T); return r
        case "Base_Types.Float_64_Payload" => val r = parseBase_TypesFloat_64_PayloadT(T); return r
        case "Base_Types.Character_Payload" => val r = parseBase_TypesCharacter_PayloadT(T); return r
        case "Base_Types.String_Payload" => val r = parseBase_TypesString_PayloadT(T); return r
        case "Base_Types.Bits_Payload" => val r = parseBase_TypesBits_PayloadT(T); return r
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_PayloadT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PT(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PST(T); return r
        case "Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS" => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PST(T); return r
        case _ => val r = parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PST(T); return r
      }
    }

    def parse_artEmpty(): art.Empty = {
      val r = parse_artEmptyT(F)
      return r
    }

    def parse_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        parser.parseObjectType("art.Empty")
      }
      return art.Empty()
    }

    def eof(): B = {
      val r = parser.eof()
      return r
    }

  }

  def to[T](s: String, f: Parser => T): Either[T, Json.ErrorMsg] = {
    val parser = Parser(s)
    val r = f(parser)
    parser.eof()
    parser.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCapacityBand_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCapacityBand_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryCheck_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryCheck_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryAssessment_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryAssessment_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SortieContext_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSortieContext_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSortieQualification_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.CameraCondition_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraCondition_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.CaptureResult_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorCaptureResult_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidence_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.RadioCondition_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioCondition_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.DeliveryResult_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorDeliveryResult_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidence_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionState_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposal_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntent_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntent_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SessionDecision_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionDecision_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotPreSessionState_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotPreSessionState_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotNextSessionState_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotNextSessionState_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationDisposition_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationDisposition_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SnapshotCoordinationReason_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSnapshotCoordinationReason_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.CameraAcquisitionCommand_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraAcquisitionCommand_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.RadioDeliveryCommand_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioDeliveryCommand_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.StatusSessionState_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorStatusSessionState_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationDisposition_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationDisposition_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.StatusCoordinationReason_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorStatusCoordinationReason_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorAdvisory_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorOperatorAdvisory_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.DroneControlObservationNotice_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorDroneControlObservationNotice_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SessionSnapshot_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionSnapshot_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload(o: Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.OperatorCoordinationStatus_Payload = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorOperatorCoordinationStatus_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBoolean_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBoolean_Payload(s: String): Either[Base_Types.Boolean_Payload, Json.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(parser: Parser): Base_Types.Boolean_Payload = {
      val r = parser.parseBase_TypesBoolean_Payload()
      return r
    }
    val r = to(s, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_Payload(s: String): Either[Base_Types.Integer_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_Payload(parser: Parser): Base_Types.Integer_Payload = {
      val r = parser.parseBase_TypesInteger_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_8_Payload(s: String): Either[Base_Types.Integer_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(parser: Parser): Base_Types.Integer_8_Payload = {
      val r = parser.parseBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_16_Payload(s: String): Either[Base_Types.Integer_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(parser: Parser): Base_Types.Integer_16_Payload = {
      val r = parser.parseBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_32_Payload(s: String): Either[Base_Types.Integer_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(parser: Parser): Base_Types.Integer_32_Payload = {
      val r = parser.parseBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_64_Payload(s: String): Either[Base_Types.Integer_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(parser: Parser): Base_Types.Integer_64_Payload = {
      val r = parser.parseBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_8_Payload(s: String): Either[Base_Types.Unsigned_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(parser: Parser): Base_Types.Unsigned_8_Payload = {
      val r = parser.parseBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_16_Payload(s: String): Either[Base_Types.Unsigned_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(parser: Parser): Base_Types.Unsigned_16_Payload = {
      val r = parser.parseBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_32_Payload(s: String): Either[Base_Types.Unsigned_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(parser: Parser): Base_Types.Unsigned_32_Payload = {
      val r = parser.parseBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_64_Payload(s: String): Either[Base_Types.Unsigned_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(parser: Parser): Base_Types.Unsigned_64_Payload = {
      val r = parser.parseBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_Payload(s: String): Either[Base_Types.Float_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_Payload(parser: Parser): Base_Types.Float_Payload = {
      val r = parser.parseBase_TypesFloat_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_32_Payload(s: String): Either[Base_Types.Float_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(parser: Parser): Base_Types.Float_32_Payload = {
      val r = parser.parseBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_64_Payload(s: String): Either[Base_Types.Float_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(parser: Parser): Base_Types.Float_64_Payload = {
      val r = parser.parseBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesCharacter_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesCharacter_Payload(s: String): Either[Base_Types.Character_Payload, Json.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(parser: Parser): Base_Types.Character_Payload = {
      val r = parser.parseBase_TypesCharacter_Payload()
      return r
    }
    val r = to(s, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesString_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesString_Payload(s: String): Either[Base_Types.String_Payload, Json.ErrorMsg] = {
    def fBase_TypesString_Payload(parser: Parser): Base_Types.String_Payload = {
      val r = parser.parseBase_TypesString_Payload()
      return r
    }
    val r = to(s, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBits_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBits_Payload(s: String): Either[Base_Types.Bits_Payload, Json.ErrorMsg] = {
    def fBase_TypesBits_Payload(parser: Parser): Base_Types.Bits_Payload = {
      val r = parser.parseBase_TypesBits_Payload()
      return r
    }
    val r = to(s, fBase_TypesBits_Payload _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.BatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorBatteryEvidenceQualifier_coordinatorProcess_batteryEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PreState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSortieApplicabilityQualifier_coordinatorProcess_sortieApplicabilityQualifier_PostState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorCameraEvidenceQualifier_coordinatorProcess_cameraEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PreState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorRadioEvidenceQualifier_coordinatorProcess_radioEvidenceQualifier_PostState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PreState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorSessionProposalOwner_coordinatorProcess_sessionProposalOwner_PostState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PreState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationIntentArbiter_coordinatorProcess_observationIntentArbiter_PostState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PreState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorObservationSessionController_coordinatorProcess_observationSessionController_PostState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PreState_Container_PS _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_P _)
    return r
  }

  def fromObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(o: Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(s: String): Either[Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS, Json.ErrorMsg] = {
    def fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS(parser: Parser): Observation_Acquisition_Radio_Delivery_Coordinator.CoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS = {
      val r = parser.parseObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS()
      return r
    }
    val r = to(s, fObservation_Acquisition_Radio_Delivery_CoordinatorCoordinationOutcomePolicy_coordinatorProcess_coordinationOutcomePolicy_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, isCompact: B): String = {
    val st = Printer.printutilContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilContainer(s: String): Either[util.Container, Json.ErrorMsg] = {
    def futilContainer(parser: Parser): util.Container = {
      val r = parser.parseutilContainer()
      return r
    }
    val r = to(s, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, isCompact: B): String = {
    val st = Printer.printutilEmptyContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilEmptyContainer(s: String): Either[util.EmptyContainer, Json.ErrorMsg] = {
    def futilEmptyContainer(parser: Parser): util.EmptyContainer = {
      val r = parser.parseutilEmptyContainer()
      return r
    }
    val r = to(s, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, isCompact: B): String = {
    val st = Printer.print_artDataContent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artDataContent(s: String): Either[art.DataContent, Json.ErrorMsg] = {
    def f_artDataContent(parser: Parser): art.DataContent = {
      val r = parser.parse_artDataContent()
      return r
    }
    val r = to(s, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, isCompact: B): String = {
    val st = Printer.print_artEmpty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artEmpty(s: String): Either[art.Empty, Json.ErrorMsg] = {
    def f_artEmpty(parser: Parser): art.Empty = {
      val r = parser.parse_artEmpty()
      return r
    }
    val r = to(s, f_artEmpty _)
    return r
  }

}