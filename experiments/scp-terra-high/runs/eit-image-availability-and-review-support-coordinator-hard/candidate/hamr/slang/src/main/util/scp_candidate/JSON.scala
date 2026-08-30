// #Sireum
// @formatter:off

// This file is auto-generated from ImageSignal.scala, ImageFacts.scala, DoctorSignal.scala, ReviewFacts.scala, PreparationContext.scala, ContextFacts.scala, ServiceObservation.scala, ServiceFacts.scala, DominantFault.scala, RecoveryEvent.scala, RecoveryState.scala, EvidenceState.scala, AdmissionOutcome.scala, AdmissionReason.scala, ArtifactState.scala, AvailabilityDecision.scala, BlockReason.scala, ReviewState.scala, PresentationProposal.scala, SelectedAction.scala, SelectedReason.scala, UpstreamDisposition.scala, PublicMode.scala, Visibility.scala, FaultSummary.scala, RecoveryFrame.scala, EvidenceFrame.scala, AdmissionFrame.scala, ArtifactFrame.scala, AvailabilityDecisionFrame.scala, ReviewFrame.scala, PresentationFrame.scala, DecisionFrame.scala, AvailabilityFrame.scala, Base_Types.scala, ImageEventQualification_coordination_image_event_qualification_Containers.scala, DoctorEventQualification_coordination_doctor_event_qualification_Containers.scala, PreparationContextAssessment_coordination_preparation_context_assessment_Containers.scala, AvailabilityServiceAssessment_coordination_availability_service_assessment_Containers.scala, FaultComposition_coordination_fault_composition_Containers.scala, RecoveryControl_coordination_recovery_control_Containers.scala, EvidenceLifecycle_coordination_evidence_lifecycle_Containers.scala, AdmissionDecisionOwner_coordination_admission_decision_Containers.scala, ArtifactLifecycle_coordination_artifact_lifecycle_Containers.scala, AvailabilityDecisionOwner_coordination_availability_decision_Containers.scala, ReviewLifecycle_coordination_review_lifecycle_Containers.scala, PresentationDecisionOwner_coordination_presentation_decision_Containers.scala, AvailabilityArbitration_coordination_availability_arbitration_Containers.scala, PublicationComposition_coordination_publication_composition_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printEIT_Image_Availability_CoordinatorImageSignalType(o: EIT_Image_Availability_Coordinator.ImageSignal.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.ImageSignal.NONE => "NONE"
        case EIT_Image_Availability_Coordinator.ImageSignal.GENERATED => "GENERATED"
        case EIT_Image_Availability_Coordinator.ImageSignal.REVOKED => "REVOKED"
        case EIT_Image_Availability_Coordinator.ImageSignal.UPSTREAM_FAILURE => "UPSTREAM_FAILURE"
        case EIT_Image_Availability_Coordinator.ImageSignal.INVALID_A => "INVALID_A"
        case EIT_Image_Availability_Coordinator.ImageSignal.INVALID_B => "INVALID_B"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.ImageSignal")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorImageSignal_Payload(o: EIT_Image_Availability_Coordinator.ImageSignal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ImageSignal_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorImageSignalType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorImageFactsType(o: EIT_Image_Availability_Coordinator.ImageFacts.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.ImageFacts.NO_IMAGE => "NO_IMAGE"
        case EIT_Image_Availability_Coordinator.ImageFacts.NEW_IMAGE => "NEW_IMAGE"
        case EIT_Image_Availability_Coordinator.ImageFacts.WITHDRAWAL => "WITHDRAWAL"
        case EIT_Image_Availability_Coordinator.ImageFacts.REPORTED_FAILURE => "REPORTED_FAILURE"
        case EIT_Image_Availability_Coordinator.ImageFacts.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.ImageFacts")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorImageFacts_Payload(o: EIT_Image_Availability_Coordinator.ImageFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ImageFacts_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorImageFactsType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctorSignalType(o: EIT_Image_Availability_Coordinator.DoctorSignal.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.DoctorSignal.NONE => "NONE"
        case EIT_Image_Availability_Coordinator.DoctorSignal.REQUEST_VIEW => "REQUEST_VIEW"
        case EIT_Image_Availability_Coordinator.DoctorSignal.ACK_VIEW => "ACK_VIEW"
        case EIT_Image_Availability_Coordinator.DoctorSignal.DISMISS_VIEW => "DISMISS_VIEW"
        case EIT_Image_Availability_Coordinator.DoctorSignal.INVALID_A => "INVALID_A"
        case EIT_Image_Availability_Coordinator.DoctorSignal.INVALID_B => "INVALID_B"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.DoctorSignal")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctorSignal_Payload(o: EIT_Image_Availability_Coordinator.DoctorSignal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.DoctorSignal_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorDoctorSignalType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorReviewFactsType(o: EIT_Image_Availability_Coordinator.ReviewFacts.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.ReviewFacts.NO_REVIEW_EVENT => "NO_REVIEW_EVENT"
        case EIT_Image_Availability_Coordinator.ReviewFacts.VIEW_REQUEST => "VIEW_REQUEST"
        case EIT_Image_Availability_Coordinator.ReviewFacts.VIEW_ACK => "VIEW_ACK"
        case EIT_Image_Availability_Coordinator.ReviewFacts.VIEW_DISMISS => "VIEW_DISMISS"
        case EIT_Image_Availability_Coordinator.ReviewFacts.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.ReviewFacts")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorReviewFacts_Payload(o: EIT_Image_Availability_Coordinator.ReviewFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ReviewFacts_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorReviewFactsType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPreparationContextType(o: EIT_Image_Availability_Coordinator.PreparationContext.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.PreparationContext.NO_REPORT => "NO_REPORT"
        case EIT_Image_Availability_Coordinator.PreparationContext.BELT_REPORTED => "BELT_REPORTED"
        case EIT_Image_Availability_Coordinator.PreparationContext.CALIBRATION_REPORTED => "CALIBRATION_REPORTED"
        case EIT_Image_Availability_Coordinator.PreparationContext.BELT_AND_CALIBRATION_REPORTED => "BELT_AND_CALIBRATION_REPORTED"
        case EIT_Image_Availability_Coordinator.PreparationContext.REPORTED_FAILURE => "REPORTED_FAILURE"
        case EIT_Image_Availability_Coordinator.PreparationContext.INVALID_A => "INVALID_A"
        case EIT_Image_Availability_Coordinator.PreparationContext.INVALID_B => "INVALID_B"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.PreparationContext")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPreparationContext_Payload(o: EIT_Image_Availability_Coordinator.PreparationContext_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.PreparationContext_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorPreparationContextType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorContextFactsType(o: EIT_Image_Availability_Coordinator.ContextFacts.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.ContextFacts.NO_CONTEXT => "NO_CONTEXT"
        case EIT_Image_Availability_Coordinator.ContextFacts.PARTIAL_CONTEXT => "PARTIAL_CONTEXT"
        case EIT_Image_Availability_Coordinator.ContextFacts.COMPLETE_CONTEXT => "COMPLETE_CONTEXT"
        case EIT_Image_Availability_Coordinator.ContextFacts.REPORTED_FAILURE => "REPORTED_FAILURE"
        case EIT_Image_Availability_Coordinator.ContextFacts.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.ContextFacts")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorContextFacts_Payload(o: EIT_Image_Availability_Coordinator.ContextFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ContextFacts_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorContextFactsType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorServiceObservationType(o: EIT_Image_Availability_Coordinator.ServiceObservation.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.ServiceObservation.READY => "READY"
        case EIT_Image_Availability_Coordinator.ServiceObservation.DEGRADED => "DEGRADED"
        case EIT_Image_Availability_Coordinator.ServiceObservation.FAILED => "FAILED"
        case EIT_Image_Availability_Coordinator.ServiceObservation.INVALID_A => "INVALID_A"
        case EIT_Image_Availability_Coordinator.ServiceObservation.INVALID_B => "INVALID_B"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.ServiceObservation")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorServiceObservation_Payload(o: EIT_Image_Availability_Coordinator.ServiceObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ServiceObservation_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorServiceObservationType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorServiceFactsType(o: EIT_Image_Availability_Coordinator.ServiceFacts.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.ServiceFacts.READY => "READY"
        case EIT_Image_Availability_Coordinator.ServiceFacts.DEGRADED => "DEGRADED"
        case EIT_Image_Availability_Coordinator.ServiceFacts.REPORTED_FAILURE => "REPORTED_FAILURE"
        case EIT_Image_Availability_Coordinator.ServiceFacts.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.ServiceFacts")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorServiceFacts_Payload(o: EIT_Image_Availability_Coordinator.ServiceFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ServiceFacts_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorServiceFactsType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDominantFaultType(o: EIT_Image_Availability_Coordinator.DominantFault.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.DominantFault.RECOVERY_INPUT => "RECOVERY_INPUT"
        case EIT_Image_Availability_Coordinator.DominantFault.IMAGE_INPUT => "IMAGE_INPUT"
        case EIT_Image_Availability_Coordinator.DominantFault.DOCTOR_INPUT => "DOCTOR_INPUT"
        case EIT_Image_Availability_Coordinator.DominantFault.CONTEXT_INPUT => "CONTEXT_INPUT"
        case EIT_Image_Availability_Coordinator.DominantFault.SERVICE_INPUT => "SERVICE_INPUT"
        case EIT_Image_Availability_Coordinator.DominantFault.UPSTREAM_REPORTED => "UPSTREAM_REPORTED"
        case EIT_Image_Availability_Coordinator.DominantFault.CONTEXT_REPORTED => "CONTEXT_REPORTED"
        case EIT_Image_Availability_Coordinator.DominantFault.SERVICE_REPORTED => "SERVICE_REPORTED"
        case EIT_Image_Availability_Coordinator.DominantFault.NONE => "NONE"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.DominantFault")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDominantFault_Payload(o: EIT_Image_Availability_Coordinator.DominantFault_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.DominantFault_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorDominantFaultType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorRecoveryEventType(o: EIT_Image_Availability_Coordinator.RecoveryEvent.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.RecoveryEvent.NONE => "NONE"
        case EIT_Image_Availability_Coordinator.RecoveryEvent.RESET => "RESET"
        case EIT_Image_Availability_Coordinator.RecoveryEvent.VERIFY_OK => "VERIFY_OK"
        case EIT_Image_Availability_Coordinator.RecoveryEvent.RESUME => "RESUME"
        case EIT_Image_Availability_Coordinator.RecoveryEvent.INVALID_A => "INVALID_A"
        case EIT_Image_Availability_Coordinator.RecoveryEvent.INVALID_B => "INVALID_B"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.RecoveryEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorRecoveryEvent_Payload(o: EIT_Image_Availability_Coordinator.RecoveryEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.RecoveryEvent_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorRecoveryEventType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorRecoveryStateType(o: EIT_Image_Availability_Coordinator.RecoveryState.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.RecoveryState.HEALTHY => "HEALTHY"
        case EIT_Image_Availability_Coordinator.RecoveryState.LATCHED => "LATCHED"
        case EIT_Image_Availability_Coordinator.RecoveryState.VERIFYING => "VERIFYING"
        case EIT_Image_Availability_Coordinator.RecoveryState.ARMED => "ARMED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.RecoveryState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorRecoveryState_Payload(o: EIT_Image_Availability_Coordinator.RecoveryState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.RecoveryState_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorRecoveryStateType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorEvidenceStateType(o: EIT_Image_Availability_Coordinator.EvidenceState.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.EvidenceState.EMPTY => "EMPTY"
        case EIT_Image_Availability_Coordinator.EvidenceState.ACCEPTED => "ACCEPTED"
        case EIT_Image_Availability_Coordinator.EvidenceState.REJECTED => "REJECTED"
        case EIT_Image_Availability_Coordinator.EvidenceState.RECOVERY => "RECOVERY"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.EvidenceState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorEvidenceState_Payload(o: EIT_Image_Availability_Coordinator.EvidenceState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.EvidenceState_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorEvidenceStateType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAdmissionOutcomeType(o: EIT_Image_Availability_Coordinator.AdmissionOutcome.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.AdmissionOutcome.NONE => "NONE"
        case EIT_Image_Availability_Coordinator.AdmissionOutcome.ADMIT => "ADMIT"
        case EIT_Image_Availability_Coordinator.AdmissionOutcome.QUARANTINE => "QUARANTINE"
        case EIT_Image_Availability_Coordinator.AdmissionOutcome.REJECT => "REJECT"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.AdmissionOutcome")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload(o: EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorAdmissionOutcomeType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAdmissionReasonType(o: EIT_Image_Availability_Coordinator.AdmissionReason.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.AdmissionReason.NO_CANDIDATE => "NO_CANDIDATE"
        case EIT_Image_Availability_Coordinator.AdmissionReason.ELIGIBLE => "ELIGIBLE"
        case EIT_Image_Availability_Coordinator.AdmissionReason.EVIDENCE_INCOMPLETE => "EVIDENCE_INCOMPLETE"
        case EIT_Image_Availability_Coordinator.AdmissionReason.SERVICE_DEGRADED => "SERVICE_DEGRADED"
        case EIT_Image_Availability_Coordinator.AdmissionReason.RECOVERY_CLOSED => "RECOVERY_CLOSED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.AdmissionReason")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAdmissionReason_Payload(o: EIT_Image_Availability_Coordinator.AdmissionReason_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AdmissionReason_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorAdmissionReasonType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorArtifactStateType(o: EIT_Image_Availability_Coordinator.ArtifactState.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.ArtifactState.EMPTY => "EMPTY"
        case EIT_Image_Availability_Coordinator.ArtifactState.STAGED => "STAGED"
        case EIT_Image_Availability_Coordinator.ArtifactState.QUARANTINED => "QUARANTINED"
        case EIT_Image_Availability_Coordinator.ArtifactState.WITHDRAWN => "WITHDRAWN"
        case EIT_Image_Availability_Coordinator.ArtifactState.RECOVERY => "RECOVERY"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.ArtifactState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorArtifactState_Payload(o: EIT_Image_Availability_Coordinator.ArtifactState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ArtifactState_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorArtifactStateType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityDecisionType(o: EIT_Image_Availability_Coordinator.AvailabilityDecision.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.AvailabilityDecision.BLOCKED => "BLOCKED"
        case EIT_Image_Availability_Coordinator.AvailabilityDecision.ALLOWED => "ALLOWED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.AvailabilityDecision")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload(o: EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorAvailabilityDecisionType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorBlockReasonType(o: EIT_Image_Availability_Coordinator.BlockReason.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.BlockReason.RECOVERY_BLOCK => "RECOVERY_BLOCK"
        case EIT_Image_Availability_Coordinator.BlockReason.ARTIFACT_NOT_STAGED => "ARTIFACT_NOT_STAGED"
        case EIT_Image_Availability_Coordinator.BlockReason.EVIDENCE_NOT_ACCEPTED => "EVIDENCE_NOT_ACCEPTED"
        case EIT_Image_Availability_Coordinator.BlockReason.SERVICE_NOT_READY => "SERVICE_NOT_READY"
        case EIT_Image_Availability_Coordinator.BlockReason.NONE => "NONE"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.BlockReason")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorBlockReason_Payload(o: EIT_Image_Availability_Coordinator.BlockReason_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.BlockReason_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorBlockReasonType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorReviewStateType(o: EIT_Image_Availability_Coordinator.ReviewState.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.ReviewState.IDLE => "IDLE"
        case EIT_Image_Availability_Coordinator.ReviewState.OFFERED => "OFFERED"
        case EIT_Image_Availability_Coordinator.ReviewState.VIEWING => "VIEWING"
        case EIT_Image_Availability_Coordinator.ReviewState.ACKNOWLEDGED => "ACKNOWLEDGED"
        case EIT_Image_Availability_Coordinator.ReviewState.RECOVERY => "RECOVERY"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.ReviewState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorReviewState_Payload(o: EIT_Image_Availability_Coordinator.ReviewState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ReviewState_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorReviewStateType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPresentationProposalType(o: EIT_Image_Availability_Coordinator.PresentationProposal.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.PresentationProposal.NONE => "NONE"
        case EIT_Image_Availability_Coordinator.PresentationProposal.CLOSE => "CLOSE"
        case EIT_Image_Availability_Coordinator.PresentationProposal.OPEN => "OPEN"
        case EIT_Image_Availability_Coordinator.PresentationProposal.OFFER => "OFFER"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.PresentationProposal")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPresentationProposal_Payload(o: EIT_Image_Availability_Coordinator.PresentationProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.PresentationProposal_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorPresentationProposalType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorSelectedActionType(o: EIT_Image_Availability_Coordinator.SelectedAction.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.SelectedAction.SAFE_WITHHOLD => "SAFE_WITHHOLD"
        case EIT_Image_Availability_Coordinator.SelectedAction.WITHDRAW => "WITHDRAW"
        case EIT_Image_Availability_Coordinator.SelectedAction.REJECT => "REJECT"
        case EIT_Image_Availability_Coordinator.SelectedAction.CLOSE => "CLOSE"
        case EIT_Image_Availability_Coordinator.SelectedAction.ACCEPT => "ACCEPT"
        case EIT_Image_Availability_Coordinator.SelectedAction.OPEN => "OPEN"
        case EIT_Image_Availability_Coordinator.SelectedAction.OFFER => "OFFER"
        case EIT_Image_Availability_Coordinator.SelectedAction.HOLD => "HOLD"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.SelectedAction")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorSelectedAction_Payload(o: EIT_Image_Availability_Coordinator.SelectedAction_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.SelectedAction_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorSelectedActionType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorSelectedReasonType(o: EIT_Image_Availability_Coordinator.SelectedReason.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.SelectedReason.FAULT_OR_RECOVERY => "FAULT_OR_RECOVERY"
        case EIT_Image_Availability_Coordinator.SelectedReason.UPSTREAM_WITHDRAWAL => "UPSTREAM_WITHDRAWAL"
        case EIT_Image_Availability_Coordinator.SelectedReason.EVIDENCE_REJECTION => "EVIDENCE_REJECTION"
        case EIT_Image_Availability_Coordinator.SelectedReason.SERVICE_QUARANTINE => "SERVICE_QUARANTINE"
        case EIT_Image_Availability_Coordinator.SelectedReason.DOCTOR_CLOSURE => "DOCTOR_CLOSURE"
        case EIT_Image_Availability_Coordinator.SelectedReason.NEW_IMAGE_ACCEPTANCE => "NEW_IMAGE_ACCEPTANCE"
        case EIT_Image_Availability_Coordinator.SelectedReason.DOCTOR_OPENING => "DOCTOR_OPENING"
        case EIT_Image_Availability_Coordinator.SelectedReason.IMAGE_OFFER => "IMAGE_OFFER"
        case EIT_Image_Availability_Coordinator.SelectedReason.NO_ELIGIBLE_WORK => "NO_ELIGIBLE_WORK"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.SelectedReason")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorSelectedReason_Payload(o: EIT_Image_Availability_Coordinator.SelectedReason_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.SelectedReason_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorSelectedReasonType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorUpstreamDispositionType(o: EIT_Image_Availability_Coordinator.UpstreamDisposition.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.UpstreamDisposition.NO_ACTION => "NO_ACTION"
        case EIT_Image_Availability_Coordinator.UpstreamDisposition.ACCEPT_IMAGE => "ACCEPT_IMAGE"
        case EIT_Image_Availability_Coordinator.UpstreamDisposition.REJECT_IMAGE => "REJECT_IMAGE"
        case EIT_Image_Availability_Coordinator.UpstreamDisposition.ACK_WITHDRAWN => "ACK_WITHDRAWN"
        case EIT_Image_Availability_Coordinator.UpstreamDisposition.PAUSE_DELIVERY => "PAUSE_DELIVERY"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.UpstreamDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload(o: EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorUpstreamDispositionType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPublicModeType(o: EIT_Image_Availability_Coordinator.PublicMode.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.PublicMode.RECOVERY => "RECOVERY"
        case EIT_Image_Availability_Coordinator.PublicMode.FAULT => "FAULT"
        case EIT_Image_Availability_Coordinator.PublicMode.QUARANTINED => "QUARANTINED"
        case EIT_Image_Availability_Coordinator.PublicMode.STAGED => "STAGED"
        case EIT_Image_Availability_Coordinator.PublicMode.OFFERED => "OFFERED"
        case EIT_Image_Availability_Coordinator.PublicMode.VIEWING => "VIEWING"
        case EIT_Image_Availability_Coordinator.PublicMode.CLOSED => "CLOSED"
        case EIT_Image_Availability_Coordinator.PublicMode.IDLE => "IDLE"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.PublicMode")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPublicMode_Payload(o: EIT_Image_Availability_Coordinator.PublicMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.PublicMode_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorPublicModeType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorVisibilityType(o: EIT_Image_Availability_Coordinator.Visibility.Type): ST = {
      val value: String = o match {
        case EIT_Image_Availability_Coordinator.Visibility.HIDDEN => "HIDDEN"
        case EIT_Image_Availability_Coordinator.Visibility.OFFERED => "OFFERED"
        case EIT_Image_Availability_Coordinator.Visibility.VISIBLE => "VISIBLE"
        case EIT_Image_Availability_Coordinator.Visibility.CLOSED => "CLOSED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Image_Availability_Coordinator.Visibility")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorVisibility_Payload(o: EIT_Image_Availability_Coordinator.Visibility_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.Visibility_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorVisibilityType(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorFaultSummary(o: EIT_Image_Availability_Coordinator.FaultSummary): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.FaultSummary""""),
        ("faultPresent", printB(o.faultPresent)),
        ("dominantFault", printEIT_Image_Availability_CoordinatorDominantFaultType(o.dominantFault)),
        ("multipleFaults", printB(o.multipleFaults))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorFaultSummary_Payload(o: EIT_Image_Availability_Coordinator.FaultSummary_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.FaultSummary_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorFaultSummary(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorRecoveryFrame(o: EIT_Image_Availability_Coordinator.RecoveryFrame): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.RecoveryFrame""""),
        ("recoveryState", printEIT_Image_Availability_CoordinatorRecoveryStateType(o.recoveryState)),
        ("recoveryOpen", printB(o.recoveryOpen)),
        ("recoveryReleased", printB(o.recoveryReleased)),
        ("effectiveFaultPresent", printB(o.effectiveFaultPresent)),
        ("dominantFault", printEIT_Image_Availability_CoordinatorDominantFaultType(o.dominantFault)),
        ("effectiveMultipleFaults", printB(o.effectiveMultipleFaults))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorRecoveryFrame_Payload(o: EIT_Image_Availability_Coordinator.RecoveryFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.RecoveryFrame_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorRecoveryFrame(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorEvidenceFrame(o: EIT_Image_Availability_Coordinator.EvidenceFrame): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.EvidenceFrame""""),
        ("evidenceState", printEIT_Image_Availability_CoordinatorEvidenceStateType(o.evidenceState)),
        ("contextAccepted", printB(o.contextAccepted))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorEvidenceFrame_Payload(o: EIT_Image_Availability_Coordinator.EvidenceFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.EvidenceFrame_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorEvidenceFrame(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAdmissionFrame(o: EIT_Image_Availability_Coordinator.AdmissionFrame): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AdmissionFrame""""),
        ("outcome", printEIT_Image_Availability_CoordinatorAdmissionOutcomeType(o.outcome)),
        ("admissionReason", printEIT_Image_Availability_CoordinatorAdmissionReasonType(o.admissionReason))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAdmissionFrame_Payload(o: EIT_Image_Availability_Coordinator.AdmissionFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AdmissionFrame_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorAdmissionFrame(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorArtifactFrame(o: EIT_Image_Availability_Coordinator.ArtifactFrame): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ArtifactFrame""""),
        ("artifactState", printEIT_Image_Availability_CoordinatorArtifactStateType(o.artifactState)),
        ("withdrawProposal", printB(o.withdrawProposal)),
        ("rejectProposal", printB(o.rejectProposal)),
        ("acceptProposal", printB(o.acceptProposal)),
        ("closureWindow", printB(o.closureWindow))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorArtifactFrame_Payload(o: EIT_Image_Availability_Coordinator.ArtifactFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ArtifactFrame_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorArtifactFrame(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame""""),
        ("decision", printEIT_Image_Availability_CoordinatorAvailabilityDecisionType(o.decision)),
        ("blockReason", printEIT_Image_Availability_CoordinatorBlockReasonType(o.blockReason))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorReviewFrame(o: EIT_Image_Availability_Coordinator.ReviewFrame): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ReviewFrame""""),
        ("reviewState", printEIT_Image_Availability_CoordinatorReviewStateType(o.reviewState))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorReviewFrame_Payload(o: EIT_Image_Availability_Coordinator.ReviewFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ReviewFrame_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorReviewFrame(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPresentationFrame(o: EIT_Image_Availability_Coordinator.PresentationFrame): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.PresentationFrame""""),
        ("proposal", printEIT_Image_Availability_CoordinatorPresentationProposalType(o.proposal))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPresentationFrame_Payload(o: EIT_Image_Availability_Coordinator.PresentationFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.PresentationFrame_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorPresentationFrame(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDecisionFrame(o: EIT_Image_Availability_Coordinator.DecisionFrame): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.DecisionFrame""""),
        ("availabilityAllowed", printB(o.availabilityAllowed)),
        ("selectedAction", printEIT_Image_Availability_CoordinatorSelectedActionType(o.selectedAction)),
        ("selectedReason", printEIT_Image_Availability_CoordinatorSelectedReasonType(o.selectedReason)),
        ("recoveryState", printEIT_Image_Availability_CoordinatorRecoveryStateType(o.recoveryState)),
        ("recoveryOpen", printB(o.recoveryOpen)),
        ("recoveryReleased", printB(o.recoveryReleased)),
        ("effectiveFaultPresent", printB(o.effectiveFaultPresent)),
        ("dominantFault", printEIT_Image_Availability_CoordinatorDominantFaultType(o.dominantFault)),
        ("effectiveMultipleFaults", printB(o.effectiveMultipleFaults)),
        ("evidenceState", printEIT_Image_Availability_CoordinatorEvidenceStateType(o.evidenceState)),
        ("artifactState", printEIT_Image_Availability_CoordinatorArtifactStateType(o.artifactState)),
        ("reviewState", printEIT_Image_Availability_CoordinatorReviewStateType(o.reviewState))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDecisionFrame_Payload(o: EIT_Image_Availability_Coordinator.DecisionFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.DecisionFrame_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorDecisionFrame(o.value))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityFrame(o: EIT_Image_Availability_Coordinator.AvailabilityFrame): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AvailabilityFrame""""),
        ("publicMode", printEIT_Image_Availability_CoordinatorPublicModeType(o.publicMode)),
        ("visibility", printEIT_Image_Availability_CoordinatorVisibilityType(o.visibility)),
        ("selectedReason", printEIT_Image_Availability_CoordinatorSelectedReasonType(o.selectedReason)),
        ("recoveryState", printEIT_Image_Availability_CoordinatorRecoveryStateType(o.recoveryState)),
        ("evidenceState", printEIT_Image_Availability_CoordinatorEvidenceStateType(o.evidenceState)),
        ("artifactState", printEIT_Image_Availability_CoordinatorArtifactStateType(o.artifactState)),
        ("reviewState", printEIT_Image_Availability_CoordinatorReviewStateType(o.reviewState)),
        ("faultPresent", printB(o.faultPresent)),
        ("dominantFault", printEIT_Image_Availability_CoordinatorDominantFaultType(o.dominantFault)),
        ("multipleFaults", printB(o.multipleFaults))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload(o: EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload""""),
        ("value", printEIT_Image_Availability_CoordinatorAvailabilityFrame(o.value))
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

    @pure def printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P => return printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P""""),
        ("api_imageSignal", printEIT_Image_Availability_CoordinatorImageSignalType(o.api_imageSignal))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS""""),
        ("api_imageSignal", printEIT_Image_Availability_CoordinatorImageSignalType(o.api_imageSignal))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P => return printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P""""),
        ("api_imageFacts", printEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS""""),
        ("api_imageFacts", printEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P => return printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P""""),
        ("api_doctorSignal", printEIT_Image_Availability_CoordinatorDoctorSignalType(o.api_doctorSignal))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS""""),
        ("api_doctorSignal", printEIT_Image_Availability_CoordinatorDoctorSignalType(o.api_doctorSignal))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P => return printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P""""),
        ("api_reviewFacts", printEIT_Image_Availability_CoordinatorReviewFactsType(o.api_reviewFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS""""),
        ("api_reviewFacts", printEIT_Image_Availability_CoordinatorReviewFactsType(o.api_reviewFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P => return printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P""""),
        ("api_preparationContext", printEIT_Image_Availability_CoordinatorPreparationContextType(o.api_preparationContext))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS""""),
        ("api_preparationContext", printEIT_Image_Availability_CoordinatorPreparationContextType(o.api_preparationContext))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P => return printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P""""),
        ("api_contextFacts", printEIT_Image_Availability_CoordinatorContextFactsType(o.api_contextFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS""""),
        ("api_contextFacts", printEIT_Image_Availability_CoordinatorContextFactsType(o.api_contextFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P""""),
        ("api_availabilityService", printEIT_Image_Availability_CoordinatorServiceObservationType(o.api_availabilityService))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS""""),
        ("api_availabilityService", printEIT_Image_Availability_CoordinatorServiceObservationType(o.api_availabilityService))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P""""),
        ("api_serviceFacts", printEIT_Image_Availability_CoordinatorServiceFactsType(o.api_serviceFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS""""),
        ("api_serviceFacts", printEIT_Image_Availability_CoordinatorServiceFactsType(o.api_serviceFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P => return printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P""""),
        ("api_contextFacts", printEIT_Image_Availability_CoordinatorContextFactsType(o.api_contextFacts)),
        ("api_imageFacts", printEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)),
        ("api_reviewFacts", printEIT_Image_Availability_CoordinatorReviewFactsType(o.api_reviewFacts)),
        ("api_serviceFacts", printEIT_Image_Availability_CoordinatorServiceFactsType(o.api_serviceFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS""""),
        ("api_contextFacts", printEIT_Image_Availability_CoordinatorContextFactsType(o.api_contextFacts)),
        ("api_imageFacts", printEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)),
        ("api_reviewFacts", printEIT_Image_Availability_CoordinatorReviewFactsType(o.api_reviewFacts)),
        ("api_serviceFacts", printEIT_Image_Availability_CoordinatorServiceFactsType(o.api_serviceFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P => return printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P""""),
        ("api_faultSummary", printEIT_Image_Availability_CoordinatorFaultSummary(o.api_faultSummary))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS""""),
        ("api_faultSummary", printEIT_Image_Availability_CoordinatorFaultSummary(o.api_faultSummary))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P => return printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P""""),
        ("api_faultSummary", printEIT_Image_Availability_CoordinatorFaultSummary(o.api_faultSummary)),
        ("api_recoveryEvent", printEIT_Image_Availability_CoordinatorRecoveryEventType(o.api_recoveryEvent))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS""""),
        ("api_faultSummary", printEIT_Image_Availability_CoordinatorFaultSummary(o.api_faultSummary)),
        ("api_recoveryEvent", printEIT_Image_Availability_CoordinatorRecoveryEventType(o.api_recoveryEvent))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P => return printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P""""),
        ("api_recoveryFrame", printEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS""""),
        ("api_recoveryFrame", printEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P => return printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P""""),
        ("api_contextFacts", printEIT_Image_Availability_CoordinatorContextFactsType(o.api_contextFacts)),
        ("api_imageFacts", printEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)),
        ("api_recoveryFrame", printEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS""""),
        ("api_contextFacts", printEIT_Image_Availability_CoordinatorContextFactsType(o.api_contextFacts)),
        ("api_imageFacts", printEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)),
        ("api_recoveryFrame", printEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P => return printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P""""),
        ("api_evidenceFrame", printEIT_Image_Availability_CoordinatorEvidenceFrame(o.api_evidenceFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS""""),
        ("api_evidenceFrame", printEIT_Image_Availability_CoordinatorEvidenceFrame(o.api_evidenceFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P => return printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P""""),
        ("api_contextFacts", printEIT_Image_Availability_CoordinatorContextFactsType(o.api_contextFacts)),
        ("api_evidenceFrame", printEIT_Image_Availability_CoordinatorEvidenceFrame(o.api_evidenceFrame)),
        ("api_imageFacts", printEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)),
        ("api_recoveryFrame", printEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)),
        ("api_serviceFacts", printEIT_Image_Availability_CoordinatorServiceFactsType(o.api_serviceFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS""""),
        ("api_contextFacts", printEIT_Image_Availability_CoordinatorContextFactsType(o.api_contextFacts)),
        ("api_evidenceFrame", printEIT_Image_Availability_CoordinatorEvidenceFrame(o.api_evidenceFrame)),
        ("api_imageFacts", printEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)),
        ("api_recoveryFrame", printEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)),
        ("api_serviceFacts", printEIT_Image_Availability_CoordinatorServiceFactsType(o.api_serviceFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P => return printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P""""),
        ("api_admissionFrame", printEIT_Image_Availability_CoordinatorAdmissionFrame(o.api_admissionFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS""""),
        ("api_admissionFrame", printEIT_Image_Availability_CoordinatorAdmissionFrame(o.api_admissionFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P => return printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P""""),
        ("api_admissionFrame", printEIT_Image_Availability_CoordinatorAdmissionFrame(o.api_admissionFrame)),
        ("api_imageFacts", printEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)),
        ("api_recoveryFrame", printEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)),
        ("api_reviewFacts", printEIT_Image_Availability_CoordinatorReviewFactsType(o.api_reviewFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS""""),
        ("api_admissionFrame", printEIT_Image_Availability_CoordinatorAdmissionFrame(o.api_admissionFrame)),
        ("api_imageFacts", printEIT_Image_Availability_CoordinatorImageFactsType(o.api_imageFacts)),
        ("api_recoveryFrame", printEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)),
        ("api_reviewFacts", printEIT_Image_Availability_CoordinatorReviewFactsType(o.api_reviewFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P => return printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P""""),
        ("api_artifactFrame", printEIT_Image_Availability_CoordinatorArtifactFrame(o.api_artifactFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS""""),
        ("api_artifactFrame", printEIT_Image_Availability_CoordinatorArtifactFrame(o.api_artifactFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P""""),
        ("api_artifactFrame", printEIT_Image_Availability_CoordinatorArtifactFrame(o.api_artifactFrame)),
        ("api_evidenceFrame", printEIT_Image_Availability_CoordinatorEvidenceFrame(o.api_evidenceFrame)),
        ("api_recoveryFrame", printEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)),
        ("api_serviceFacts", printEIT_Image_Availability_CoordinatorServiceFactsType(o.api_serviceFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS""""),
        ("api_artifactFrame", printEIT_Image_Availability_CoordinatorArtifactFrame(o.api_artifactFrame)),
        ("api_evidenceFrame", printEIT_Image_Availability_CoordinatorEvidenceFrame(o.api_evidenceFrame)),
        ("api_recoveryFrame", printEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)),
        ("api_serviceFacts", printEIT_Image_Availability_CoordinatorServiceFactsType(o.api_serviceFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P""""),
        ("api_availabilityFrame", printEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.api_availabilityFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS""""),
        ("api_availabilityFrame", printEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.api_availabilityFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P => return printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P""""),
        ("api_availabilityFrame", printEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.api_availabilityFrame)),
        ("api_recoveryFrame", printEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)),
        ("api_reviewFacts", printEIT_Image_Availability_CoordinatorReviewFactsType(o.api_reviewFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS""""),
        ("api_availabilityFrame", printEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.api_availabilityFrame)),
        ("api_recoveryFrame", printEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)),
        ("api_reviewFacts", printEIT_Image_Availability_CoordinatorReviewFactsType(o.api_reviewFacts))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P => return printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P""""),
        ("api_reviewFrame", printEIT_Image_Availability_CoordinatorReviewFrame(o.api_reviewFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS""""),
        ("api_reviewFrame", printEIT_Image_Availability_CoordinatorReviewFrame(o.api_reviewFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P => return printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P""""),
        ("api_availabilityFrame", printEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.api_availabilityFrame)),
        ("api_reviewFrame", printEIT_Image_Availability_CoordinatorReviewFrame(o.api_reviewFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS""""),
        ("api_availabilityFrame", printEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.api_availabilityFrame)),
        ("api_reviewFrame", printEIT_Image_Availability_CoordinatorReviewFrame(o.api_reviewFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P => return printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P""""),
        ("api_presentationFrame", printEIT_Image_Availability_CoordinatorPresentationFrame(o.api_presentationFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS""""),
        ("api_presentationFrame", printEIT_Image_Availability_CoordinatorPresentationFrame(o.api_presentationFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P""""),
        ("api_admissionFrame", printEIT_Image_Availability_CoordinatorAdmissionFrame(o.api_admissionFrame)),
        ("api_artifactFrame", printEIT_Image_Availability_CoordinatorArtifactFrame(o.api_artifactFrame)),
        ("api_availabilityFrame", printEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.api_availabilityFrame)),
        ("api_evidenceFrame", printEIT_Image_Availability_CoordinatorEvidenceFrame(o.api_evidenceFrame)),
        ("api_presentationFrame", printEIT_Image_Availability_CoordinatorPresentationFrame(o.api_presentationFrame)),
        ("api_recoveryFrame", printEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)),
        ("api_reviewFrame", printEIT_Image_Availability_CoordinatorReviewFrame(o.api_reviewFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS""""),
        ("api_admissionFrame", printEIT_Image_Availability_CoordinatorAdmissionFrame(o.api_admissionFrame)),
        ("api_artifactFrame", printEIT_Image_Availability_CoordinatorArtifactFrame(o.api_artifactFrame)),
        ("api_availabilityFrame", printEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o.api_availabilityFrame)),
        ("api_evidenceFrame", printEIT_Image_Availability_CoordinatorEvidenceFrame(o.api_evidenceFrame)),
        ("api_presentationFrame", printEIT_Image_Availability_CoordinatorPresentationFrame(o.api_presentationFrame)),
        ("api_recoveryFrame", printEIT_Image_Availability_CoordinatorRecoveryFrame(o.api_recoveryFrame)),
        ("api_reviewFrame", printEIT_Image_Availability_CoordinatorReviewFrame(o.api_reviewFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P""""),
        ("api_decisionFrame", printEIT_Image_Availability_CoordinatorDecisionFrame(o.api_decisionFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS""""),
        ("api_decisionFrame", printEIT_Image_Availability_CoordinatorDecisionFrame(o.api_decisionFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P => return printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P""""),
        ("api_decisionFrame", printEIT_Image_Availability_CoordinatorDecisionFrame(o.api_decisionFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS""""),
        ("api_decisionFrame", printEIT_Image_Availability_CoordinatorDecisionFrame(o.api_decisionFrame))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container): ST = {
      o match {
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P => return printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P""""),
        ("api_analysisAvailability", printEIT_Image_Availability_CoordinatorAvailabilityFrame(o.api_analysisAvailability)),
        ("api_upstreamDisposition", printEIT_Image_Availability_CoordinatorUpstreamDispositionType(o.api_upstreamDisposition))
      ))
    }

    @pure def printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS""""),
        ("api_analysisAvailability", printEIT_Image_Availability_CoordinatorAvailabilityFrame(o.api_analysisAvailability)),
        ("api_upstreamDisposition", printEIT_Image_Availability_CoordinatorUpstreamDispositionType(o.api_upstreamDisposition))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_image_event_qualification_postInit => "EITImageAvailabilitySystem_Instance_coordination_image_event_qualification_postInit"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_image_event_qualification_preCompute => "EITImageAvailabilitySystem_Instance_coordination_image_event_qualification_preCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_image_event_qualification_postCompute => "EITImageAvailabilitySystem_Instance_coordination_image_event_qualification_postCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_doctor_event_qualification_postInit => "EITImageAvailabilitySystem_Instance_coordination_doctor_event_qualification_postInit"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_doctor_event_qualification_preCompute => "EITImageAvailabilitySystem_Instance_coordination_doctor_event_qualification_preCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_doctor_event_qualification_postCompute => "EITImageAvailabilitySystem_Instance_coordination_doctor_event_qualification_postCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_preparation_context_assessment_postInit => "EITImageAvailabilitySystem_Instance_coordination_preparation_context_assessment_postInit"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_preparation_context_assessment_preCompute => "EITImageAvailabilitySystem_Instance_coordination_preparation_context_assessment_preCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_preparation_context_assessment_postCompute => "EITImageAvailabilitySystem_Instance_coordination_preparation_context_assessment_postCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_availability_service_assessment_postInit => "EITImageAvailabilitySystem_Instance_coordination_availability_service_assessment_postInit"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_availability_service_assessment_preCompute => "EITImageAvailabilitySystem_Instance_coordination_availability_service_assessment_preCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_availability_service_assessment_postCompute => "EITImageAvailabilitySystem_Instance_coordination_availability_service_assessment_postCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_fault_composition_postInit => "EITImageAvailabilitySystem_Instance_coordination_fault_composition_postInit"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_fault_composition_preCompute => "EITImageAvailabilitySystem_Instance_coordination_fault_composition_preCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_fault_composition_postCompute => "EITImageAvailabilitySystem_Instance_coordination_fault_composition_postCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_recovery_control_postInit => "EITImageAvailabilitySystem_Instance_coordination_recovery_control_postInit"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_recovery_control_preCompute => "EITImageAvailabilitySystem_Instance_coordination_recovery_control_preCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_recovery_control_postCompute => "EITImageAvailabilitySystem_Instance_coordination_recovery_control_postCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_evidence_lifecycle_postInit => "EITImageAvailabilitySystem_Instance_coordination_evidence_lifecycle_postInit"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_evidence_lifecycle_preCompute => "EITImageAvailabilitySystem_Instance_coordination_evidence_lifecycle_preCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_evidence_lifecycle_postCompute => "EITImageAvailabilitySystem_Instance_coordination_evidence_lifecycle_postCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_admission_decision_postInit => "EITImageAvailabilitySystem_Instance_coordination_admission_decision_postInit"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_admission_decision_preCompute => "EITImageAvailabilitySystem_Instance_coordination_admission_decision_preCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_admission_decision_postCompute => "EITImageAvailabilitySystem_Instance_coordination_admission_decision_postCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_artifact_lifecycle_postInit => "EITImageAvailabilitySystem_Instance_coordination_artifact_lifecycle_postInit"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_artifact_lifecycle_preCompute => "EITImageAvailabilitySystem_Instance_coordination_artifact_lifecycle_preCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_artifact_lifecycle_postCompute => "EITImageAvailabilitySystem_Instance_coordination_artifact_lifecycle_postCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_availability_decision_postInit => "EITImageAvailabilitySystem_Instance_coordination_availability_decision_postInit"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_availability_decision_preCompute => "EITImageAvailabilitySystem_Instance_coordination_availability_decision_preCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_availability_decision_postCompute => "EITImageAvailabilitySystem_Instance_coordination_availability_decision_postCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_review_lifecycle_postInit => "EITImageAvailabilitySystem_Instance_coordination_review_lifecycle_postInit"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_review_lifecycle_preCompute => "EITImageAvailabilitySystem_Instance_coordination_review_lifecycle_preCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_review_lifecycle_postCompute => "EITImageAvailabilitySystem_Instance_coordination_review_lifecycle_postCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_presentation_decision_postInit => "EITImageAvailabilitySystem_Instance_coordination_presentation_decision_postInit"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_presentation_decision_preCompute => "EITImageAvailabilitySystem_Instance_coordination_presentation_decision_preCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_presentation_decision_postCompute => "EITImageAvailabilitySystem_Instance_coordination_presentation_decision_postCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_availability_arbitration_postInit => "EITImageAvailabilitySystem_Instance_coordination_availability_arbitration_postInit"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_availability_arbitration_preCompute => "EITImageAvailabilitySystem_Instance_coordination_availability_arbitration_preCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_availability_arbitration_postCompute => "EITImageAvailabilitySystem_Instance_coordination_availability_arbitration_postCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_publication_composition_postInit => "EITImageAvailabilitySystem_Instance_coordination_publication_composition_postInit"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_publication_composition_preCompute => "EITImageAvailabilitySystem_Instance_coordination_publication_composition_preCompute"
        case runtimemonitor.ObservationKind.EITImageAvailabilitySystem_Instance_coordination_publication_composition_postCompute => "EITImageAvailabilitySystem_Instance_coordination_publication_composition_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P => return printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P => return printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P => return printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P => return printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P => return printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P => return printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P => return printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P => return printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P => return printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P => return printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P => return printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P => return printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P => return printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P => return printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P => return printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P => return printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P => return printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P => return printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P => return printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P => return printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P => return printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P => return printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(o)
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
        case o: EIT_Image_Availability_Coordinator.Visibility_Payload => return printEIT_Image_Availability_CoordinatorVisibility_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ImageFacts_Payload => return printEIT_Image_Availability_CoordinatorImageFacts_Payload(o)
        case o: EIT_Image_Availability_Coordinator.PublicMode_Payload => return printEIT_Image_Availability_CoordinatorPublicMode_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ReviewState_Payload => return printEIT_Image_Availability_CoordinatorReviewState_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ImageSignal_Payload => return printEIT_Image_Availability_CoordinatorImageSignal_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ReviewFacts_Payload => return printEIT_Image_Availability_CoordinatorReviewFacts_Payload(o)
        case o: EIT_Image_Availability_Coordinator.BlockReason_Payload => return printEIT_Image_Availability_CoordinatorBlockReason_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ReviewFrame_Payload => return printEIT_Image_Availability_CoordinatorReviewFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ServiceFacts_Payload => return printEIT_Image_Availability_CoordinatorServiceFacts_Payload(o)
        case o: EIT_Image_Availability_Coordinator.DoctorSignal_Payload => return printEIT_Image_Availability_CoordinatorDoctorSignal_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ContextFacts_Payload => return printEIT_Image_Availability_CoordinatorContextFacts_Payload(o)
        case o: EIT_Image_Availability_Coordinator.FaultSummary_Payload => return printEIT_Image_Availability_CoordinatorFaultSummary_Payload(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceState_Payload => return printEIT_Image_Availability_CoordinatorEvidenceState_Payload(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryState_Payload => return printEIT_Image_Availability_CoordinatorRecoveryState_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactState_Payload => return printEIT_Image_Availability_CoordinatorArtifactState_Payload(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryEvent_Payload => return printEIT_Image_Availability_CoordinatorRecoveryEvent_Payload(o)
        case o: EIT_Image_Availability_Coordinator.DominantFault_Payload => return printEIT_Image_Availability_CoordinatorDominantFault_Payload(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceFrame_Payload => return printEIT_Image_Availability_CoordinatorEvidenceFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactFrame_Payload => return printEIT_Image_Availability_CoordinatorArtifactFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryFrame_Payload => return printEIT_Image_Availability_CoordinatorRecoveryFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.DecisionFrame_Payload => return printEIT_Image_Availability_CoordinatorDecisionFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.SelectedAction_Payload => return printEIT_Image_Availability_CoordinatorSelectedAction_Payload(o)
        case o: EIT_Image_Availability_Coordinator.SelectedReason_Payload => return printEIT_Image_Availability_CoordinatorSelectedReason_Payload(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionFrame_Payload => return printEIT_Image_Availability_CoordinatorAdmissionFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionReason_Payload => return printEIT_Image_Availability_CoordinatorAdmissionReason_Payload(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload => return printEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload(o)
        case o: EIT_Image_Availability_Coordinator.PresentationFrame_Payload => return printEIT_Image_Availability_CoordinatorPresentationFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload => return printEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.ServiceObservation_Payload => return printEIT_Image_Availability_CoordinatorServiceObservation_Payload(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContext_Payload => return printEIT_Image_Availability_CoordinatorPreparationContext_Payload(o)
        case o: EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload => return printEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload => return printEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload(o)
        case o: EIT_Image_Availability_Coordinator.PresentationProposal_Payload => return printEIT_Image_Availability_CoordinatorPresentationProposal_Payload(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload => return printEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P => return printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P => return printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P => return printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P => return printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P => return printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P => return printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P => return printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P => return printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P => return printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P => return printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P => return printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P => return printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P => return printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P => return printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P => return printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P => return printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P => return printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P => return printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P => return printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P => return printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P => return printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P => return printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P => return printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(o)
        case o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS => return printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(o)
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

    def parseEIT_Image_Availability_CoordinatorImageSignalType(): EIT_Image_Availability_Coordinator.ImageSignal.Type = {
      val r = parseEIT_Image_Availability_CoordinatorImageSignalT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImageSignalT(typeParsed: B): EIT_Image_Availability_Coordinator.ImageSignal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ImageSignal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.ImageSignal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.ImageSignal.")
          return EIT_Image_Availability_Coordinator.ImageSignal.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorImageSignal_Payload(): EIT_Image_Availability_Coordinator.ImageSignal_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorImageSignal_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImageSignal_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ImageSignal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ImageSignal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorImageSignalType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ImageSignal_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorImageFactsType(): EIT_Image_Availability_Coordinator.ImageFacts.Type = {
      val r = parseEIT_Image_Availability_CoordinatorImageFactsT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImageFactsT(typeParsed: B): EIT_Image_Availability_Coordinator.ImageFacts.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ImageFacts")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.ImageFacts.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.ImageFacts.")
          return EIT_Image_Availability_Coordinator.ImageFacts.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorImageFacts_Payload(): EIT_Image_Availability_Coordinator.ImageFacts_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorImageFacts_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImageFacts_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ImageFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ImageFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorImageFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ImageFacts_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorDoctorSignalType(): EIT_Image_Availability_Coordinator.DoctorSignal.Type = {
      val r = parseEIT_Image_Availability_CoordinatorDoctorSignalT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDoctorSignalT(typeParsed: B): EIT_Image_Availability_Coordinator.DoctorSignal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.DoctorSignal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.DoctorSignal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.DoctorSignal.")
          return EIT_Image_Availability_Coordinator.DoctorSignal.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorDoctorSignal_Payload(): EIT_Image_Availability_Coordinator.DoctorSignal_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorDoctorSignal_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDoctorSignal_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.DoctorSignal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.DoctorSignal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorDoctorSignalType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.DoctorSignal_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorReviewFactsType(): EIT_Image_Availability_Coordinator.ReviewFacts.Type = {
      val r = parseEIT_Image_Availability_CoordinatorReviewFactsT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorReviewFactsT(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewFacts.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ReviewFacts")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.ReviewFacts.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.ReviewFacts.")
          return EIT_Image_Availability_Coordinator.ReviewFacts.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorReviewFacts_Payload(): EIT_Image_Availability_Coordinator.ReviewFacts_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorReviewFacts_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorReviewFacts_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ReviewFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorReviewFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ReviewFacts_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorPreparationContextType(): EIT_Image_Availability_Coordinator.PreparationContext.Type = {
      val r = parseEIT_Image_Availability_CoordinatorPreparationContextT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPreparationContextT(typeParsed: B): EIT_Image_Availability_Coordinator.PreparationContext.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PreparationContext")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.PreparationContext.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.PreparationContext.")
          return EIT_Image_Availability_Coordinator.PreparationContext.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorPreparationContext_Payload(): EIT_Image_Availability_Coordinator.PreparationContext_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorPreparationContext_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPreparationContext_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.PreparationContext_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PreparationContext_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorPreparationContextType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.PreparationContext_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorContextFactsType(): EIT_Image_Availability_Coordinator.ContextFacts.Type = {
      val r = parseEIT_Image_Availability_CoordinatorContextFactsT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorContextFactsT(typeParsed: B): EIT_Image_Availability_Coordinator.ContextFacts.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ContextFacts")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.ContextFacts.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.ContextFacts.")
          return EIT_Image_Availability_Coordinator.ContextFacts.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorContextFacts_Payload(): EIT_Image_Availability_Coordinator.ContextFacts_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorContextFacts_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorContextFacts_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ContextFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ContextFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorContextFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ContextFacts_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorServiceObservationType(): EIT_Image_Availability_Coordinator.ServiceObservation.Type = {
      val r = parseEIT_Image_Availability_CoordinatorServiceObservationT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorServiceObservationT(typeParsed: B): EIT_Image_Availability_Coordinator.ServiceObservation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ServiceObservation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.ServiceObservation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.ServiceObservation.")
          return EIT_Image_Availability_Coordinator.ServiceObservation.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorServiceObservation_Payload(): EIT_Image_Availability_Coordinator.ServiceObservation_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorServiceObservation_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorServiceObservation_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ServiceObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ServiceObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorServiceObservationType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ServiceObservation_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorServiceFactsType(): EIT_Image_Availability_Coordinator.ServiceFacts.Type = {
      val r = parseEIT_Image_Availability_CoordinatorServiceFactsT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorServiceFactsT(typeParsed: B): EIT_Image_Availability_Coordinator.ServiceFacts.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ServiceFacts")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.ServiceFacts.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.ServiceFacts.")
          return EIT_Image_Availability_Coordinator.ServiceFacts.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorServiceFacts_Payload(): EIT_Image_Availability_Coordinator.ServiceFacts_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorServiceFacts_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorServiceFacts_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ServiceFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ServiceFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorServiceFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ServiceFacts_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorDominantFaultType(): EIT_Image_Availability_Coordinator.DominantFault.Type = {
      val r = parseEIT_Image_Availability_CoordinatorDominantFaultT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDominantFaultT(typeParsed: B): EIT_Image_Availability_Coordinator.DominantFault.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.DominantFault")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.DominantFault.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.DominantFault.")
          return EIT_Image_Availability_Coordinator.DominantFault.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorDominantFault_Payload(): EIT_Image_Availability_Coordinator.DominantFault_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorDominantFault_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDominantFault_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.DominantFault_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.DominantFault_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorDominantFaultType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.DominantFault_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryEventType(): EIT_Image_Availability_Coordinator.RecoveryEvent.Type = {
      val r = parseEIT_Image_Availability_CoordinatorRecoveryEventT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryEventT(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.RecoveryEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.RecoveryEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.RecoveryEvent.")
          return EIT_Image_Availability_Coordinator.RecoveryEvent.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryEvent_Payload(): EIT_Image_Availability_Coordinator.RecoveryEvent_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorRecoveryEvent_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryEvent_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.RecoveryEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorRecoveryEventType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.RecoveryEvent_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryStateType(): EIT_Image_Availability_Coordinator.RecoveryState.Type = {
      val r = parseEIT_Image_Availability_CoordinatorRecoveryStateT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryStateT(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.RecoveryState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.RecoveryState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.RecoveryState.")
          return EIT_Image_Availability_Coordinator.RecoveryState.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryState_Payload(): EIT_Image_Availability_Coordinator.RecoveryState_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorRecoveryState_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryState_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.RecoveryState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.RecoveryState_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceStateType(): EIT_Image_Availability_Coordinator.EvidenceState.Type = {
      val r = parseEIT_Image_Availability_CoordinatorEvidenceStateT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceStateT(typeParsed: B): EIT_Image_Availability_Coordinator.EvidenceState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.EvidenceState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.EvidenceState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.EvidenceState.")
          return EIT_Image_Availability_Coordinator.EvidenceState.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceState_Payload(): EIT_Image_Availability_Coordinator.EvidenceState_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorEvidenceState_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceState_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.EvidenceState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.EvidenceState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorEvidenceStateType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.EvidenceState_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionOutcomeType(): EIT_Image_Availability_Coordinator.AdmissionOutcome.Type = {
      val r = parseEIT_Image_Availability_CoordinatorAdmissionOutcomeT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionOutcomeT(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionOutcome.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AdmissionOutcome")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.AdmissionOutcome.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.AdmissionOutcome.")
          return EIT_Image_Availability_Coordinator.AdmissionOutcome.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload(): EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorAdmissionOutcome_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionOutcome_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorAdmissionOutcomeType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionReasonType(): EIT_Image_Availability_Coordinator.AdmissionReason.Type = {
      val r = parseEIT_Image_Availability_CoordinatorAdmissionReasonT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionReasonT(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionReason.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AdmissionReason")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.AdmissionReason.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.AdmissionReason.")
          return EIT_Image_Availability_Coordinator.AdmissionReason.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionReason_Payload(): EIT_Image_Availability_Coordinator.AdmissionReason_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorAdmissionReason_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionReason_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionReason_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AdmissionReason_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorAdmissionReasonType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AdmissionReason_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorArtifactStateType(): EIT_Image_Availability_Coordinator.ArtifactState.Type = {
      val r = parseEIT_Image_Availability_CoordinatorArtifactStateT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorArtifactStateT(typeParsed: B): EIT_Image_Availability_Coordinator.ArtifactState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ArtifactState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.ArtifactState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.ArtifactState.")
          return EIT_Image_Availability_Coordinator.ArtifactState.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorArtifactState_Payload(): EIT_Image_Availability_Coordinator.ArtifactState_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorArtifactState_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorArtifactState_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ArtifactState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ArtifactState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorArtifactStateType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ArtifactState_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecisionType(): EIT_Image_Availability_Coordinator.AvailabilityDecision.Type = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecisionT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityDecision.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityDecision")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.AvailabilityDecision.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.AvailabilityDecision.")
          return EIT_Image_Availability_Coordinator.AvailabilityDecision.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload(): EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecision_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecision_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorBlockReasonType(): EIT_Image_Availability_Coordinator.BlockReason.Type = {
      val r = parseEIT_Image_Availability_CoordinatorBlockReasonT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorBlockReasonT(typeParsed: B): EIT_Image_Availability_Coordinator.BlockReason.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.BlockReason")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.BlockReason.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.BlockReason.")
          return EIT_Image_Availability_Coordinator.BlockReason.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorBlockReason_Payload(): EIT_Image_Availability_Coordinator.BlockReason_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorBlockReason_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorBlockReason_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.BlockReason_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.BlockReason_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorBlockReasonType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.BlockReason_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorReviewStateType(): EIT_Image_Availability_Coordinator.ReviewState.Type = {
      val r = parseEIT_Image_Availability_CoordinatorReviewStateT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorReviewStateT(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ReviewState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.ReviewState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.ReviewState.")
          return EIT_Image_Availability_Coordinator.ReviewState.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorReviewState_Payload(): EIT_Image_Availability_Coordinator.ReviewState_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorReviewState_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorReviewState_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ReviewState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorReviewStateType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ReviewState_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorPresentationProposalType(): EIT_Image_Availability_Coordinator.PresentationProposal.Type = {
      val r = parseEIT_Image_Availability_CoordinatorPresentationProposalT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPresentationProposalT(typeParsed: B): EIT_Image_Availability_Coordinator.PresentationProposal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PresentationProposal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.PresentationProposal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.PresentationProposal.")
          return EIT_Image_Availability_Coordinator.PresentationProposal.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorPresentationProposal_Payload(): EIT_Image_Availability_Coordinator.PresentationProposal_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorPresentationProposal_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPresentationProposal_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.PresentationProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PresentationProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorPresentationProposalType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.PresentationProposal_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorSelectedActionType(): EIT_Image_Availability_Coordinator.SelectedAction.Type = {
      val r = parseEIT_Image_Availability_CoordinatorSelectedActionT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorSelectedActionT(typeParsed: B): EIT_Image_Availability_Coordinator.SelectedAction.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.SelectedAction")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.SelectedAction.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.SelectedAction.")
          return EIT_Image_Availability_Coordinator.SelectedAction.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorSelectedAction_Payload(): EIT_Image_Availability_Coordinator.SelectedAction_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorSelectedAction_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorSelectedAction_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.SelectedAction_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.SelectedAction_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorSelectedActionType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.SelectedAction_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorSelectedReasonType(): EIT_Image_Availability_Coordinator.SelectedReason.Type = {
      val r = parseEIT_Image_Availability_CoordinatorSelectedReasonT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorSelectedReasonT(typeParsed: B): EIT_Image_Availability_Coordinator.SelectedReason.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.SelectedReason")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.SelectedReason.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.SelectedReason.")
          return EIT_Image_Availability_Coordinator.SelectedReason.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorSelectedReason_Payload(): EIT_Image_Availability_Coordinator.SelectedReason_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorSelectedReason_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorSelectedReason_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.SelectedReason_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.SelectedReason_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorSelectedReasonType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.SelectedReason_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorUpstreamDispositionType(): EIT_Image_Availability_Coordinator.UpstreamDisposition.Type = {
      val r = parseEIT_Image_Availability_CoordinatorUpstreamDispositionT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorUpstreamDispositionT(typeParsed: B): EIT_Image_Availability_Coordinator.UpstreamDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.UpstreamDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.UpstreamDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.UpstreamDisposition.")
          return EIT_Image_Availability_Coordinator.UpstreamDisposition.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload(): EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorUpstreamDisposition_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorUpstreamDisposition_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorUpstreamDispositionType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorPublicModeType(): EIT_Image_Availability_Coordinator.PublicMode.Type = {
      val r = parseEIT_Image_Availability_CoordinatorPublicModeT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPublicModeT(typeParsed: B): EIT_Image_Availability_Coordinator.PublicMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PublicMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.PublicMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.PublicMode.")
          return EIT_Image_Availability_Coordinator.PublicMode.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorPublicMode_Payload(): EIT_Image_Availability_Coordinator.PublicMode_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorPublicMode_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPublicMode_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.PublicMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PublicMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorPublicModeType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.PublicMode_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorVisibilityType(): EIT_Image_Availability_Coordinator.Visibility.Type = {
      val r = parseEIT_Image_Availability_CoordinatorVisibilityT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorVisibilityT(typeParsed: B): EIT_Image_Availability_Coordinator.Visibility.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Visibility")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Image_Availability_Coordinator.Visibility.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Image_Availability_Coordinator.Visibility.")
          return EIT_Image_Availability_Coordinator.Visibility.byOrdinal(0).get
      }
    }

    def parseEIT_Image_Availability_CoordinatorVisibility_Payload(): EIT_Image_Availability_Coordinator.Visibility_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorVisibility_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorVisibility_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.Visibility_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.Visibility_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorVisibilityType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.Visibility_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorFaultSummary(): EIT_Image_Availability_Coordinator.FaultSummary = {
      val r = parseEIT_Image_Availability_CoordinatorFaultSummaryT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorFaultSummaryT(typeParsed: B): EIT_Image_Availability_Coordinator.FaultSummary = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.FaultSummary")
      }
      parser.parseObjectKey("faultPresent")
      val faultPresent = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("dominantFault")
      val dominantFault = parseEIT_Image_Availability_CoordinatorDominantFaultType()
      parser.parseObjectNext()
      parser.parseObjectKey("multipleFaults")
      val multipleFaults = parser.parseB()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.FaultSummary(faultPresent, dominantFault, multipleFaults)
    }

    def parseEIT_Image_Availability_CoordinatorFaultSummary_Payload(): EIT_Image_Availability_Coordinator.FaultSummary_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorFaultSummary_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorFaultSummary_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.FaultSummary_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.FaultSummary_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorFaultSummary()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.FaultSummary_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryFrame(): EIT_Image_Availability_Coordinator.RecoveryFrame = {
      val r = parseEIT_Image_Availability_CoordinatorRecoveryFrameT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryFrame = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.RecoveryFrame")
      }
      parser.parseObjectKey("recoveryState")
      val recoveryState = parseEIT_Image_Availability_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryOpen")
      val recoveryOpen = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryReleased")
      val recoveryReleased = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("effectiveFaultPresent")
      val effectiveFaultPresent = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("dominantFault")
      val dominantFault = parseEIT_Image_Availability_CoordinatorDominantFaultType()
      parser.parseObjectNext()
      parser.parseObjectKey("effectiveMultipleFaults")
      val effectiveMultipleFaults = parser.parseB()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.RecoveryFrame(recoveryState, recoveryOpen, recoveryReleased, effectiveFaultPresent, dominantFault, effectiveMultipleFaults)
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryFrame_Payload(): EIT_Image_Availability_Coordinator.RecoveryFrame_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorRecoveryFrame_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.RecoveryFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorRecoveryFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.RecoveryFrame_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceFrame(): EIT_Image_Availability_Coordinator.EvidenceFrame = {
      val r = parseEIT_Image_Availability_CoordinatorEvidenceFrameT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.EvidenceFrame = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.EvidenceFrame")
      }
      parser.parseObjectKey("evidenceState")
      val evidenceState = parseEIT_Image_Availability_CoordinatorEvidenceStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("contextAccepted")
      val contextAccepted = parser.parseB()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.EvidenceFrame(evidenceState, contextAccepted)
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceFrame_Payload(): EIT_Image_Availability_Coordinator.EvidenceFrame_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorEvidenceFrame_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.EvidenceFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.EvidenceFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorEvidenceFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.EvidenceFrame_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionFrame(): EIT_Image_Availability_Coordinator.AdmissionFrame = {
      val r = parseEIT_Image_Availability_CoordinatorAdmissionFrameT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionFrame = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AdmissionFrame")
      }
      parser.parseObjectKey("outcome")
      val outcome = parseEIT_Image_Availability_CoordinatorAdmissionOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("admissionReason")
      val admissionReason = parseEIT_Image_Availability_CoordinatorAdmissionReasonType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AdmissionFrame(outcome, admissionReason)
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionFrame_Payload(): EIT_Image_Availability_Coordinator.AdmissionFrame_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorAdmissionFrame_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AdmissionFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorAdmissionFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AdmissionFrame_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorArtifactFrame(): EIT_Image_Availability_Coordinator.ArtifactFrame = {
      val r = parseEIT_Image_Availability_CoordinatorArtifactFrameT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorArtifactFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.ArtifactFrame = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ArtifactFrame")
      }
      parser.parseObjectKey("artifactState")
      val artifactState = parseEIT_Image_Availability_CoordinatorArtifactStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("withdrawProposal")
      val withdrawProposal = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("rejectProposal")
      val rejectProposal = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("acceptProposal")
      val acceptProposal = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("closureWindow")
      val closureWindow = parser.parseB()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ArtifactFrame(artifactState, withdrawProposal, rejectProposal, acceptProposal, closureWindow)
    }

    def parseEIT_Image_Availability_CoordinatorArtifactFrame_Payload(): EIT_Image_Availability_Coordinator.ArtifactFrame_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorArtifactFrame_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorArtifactFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ArtifactFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ArtifactFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorArtifactFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ArtifactFrame_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(): EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrameT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame")
      }
      parser.parseObjectKey("decision")
      val decision = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("blockReason")
      val blockReason = parseEIT_Image_Availability_CoordinatorBlockReasonType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame(decision, blockReason)
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload(): EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorReviewFrame(): EIT_Image_Availability_Coordinator.ReviewFrame = {
      val r = parseEIT_Image_Availability_CoordinatorReviewFrameT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorReviewFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewFrame = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ReviewFrame")
      }
      parser.parseObjectKey("reviewState")
      val reviewState = parseEIT_Image_Availability_CoordinatorReviewStateType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ReviewFrame(reviewState)
    }

    def parseEIT_Image_Availability_CoordinatorReviewFrame_Payload(): EIT_Image_Availability_Coordinator.ReviewFrame_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorReviewFrame_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorReviewFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ReviewFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorReviewFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ReviewFrame_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorPresentationFrame(): EIT_Image_Availability_Coordinator.PresentationFrame = {
      val r = parseEIT_Image_Availability_CoordinatorPresentationFrameT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPresentationFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.PresentationFrame = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PresentationFrame")
      }
      parser.parseObjectKey("proposal")
      val proposal = parseEIT_Image_Availability_CoordinatorPresentationProposalType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.PresentationFrame(proposal)
    }

    def parseEIT_Image_Availability_CoordinatorPresentationFrame_Payload(): EIT_Image_Availability_Coordinator.PresentationFrame_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorPresentationFrame_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPresentationFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.PresentationFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PresentationFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorPresentationFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.PresentationFrame_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorDecisionFrame(): EIT_Image_Availability_Coordinator.DecisionFrame = {
      val r = parseEIT_Image_Availability_CoordinatorDecisionFrameT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDecisionFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.DecisionFrame = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.DecisionFrame")
      }
      parser.parseObjectKey("availabilityAllowed")
      val availabilityAllowed = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("selectedAction")
      val selectedAction = parseEIT_Image_Availability_CoordinatorSelectedActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("selectedReason")
      val selectedReason = parseEIT_Image_Availability_CoordinatorSelectedReasonType()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryState")
      val recoveryState = parseEIT_Image_Availability_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryOpen")
      val recoveryOpen = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryReleased")
      val recoveryReleased = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("effectiveFaultPresent")
      val effectiveFaultPresent = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("dominantFault")
      val dominantFault = parseEIT_Image_Availability_CoordinatorDominantFaultType()
      parser.parseObjectNext()
      parser.parseObjectKey("effectiveMultipleFaults")
      val effectiveMultipleFaults = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("evidenceState")
      val evidenceState = parseEIT_Image_Availability_CoordinatorEvidenceStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("artifactState")
      val artifactState = parseEIT_Image_Availability_CoordinatorArtifactStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("reviewState")
      val reviewState = parseEIT_Image_Availability_CoordinatorReviewStateType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.DecisionFrame(availabilityAllowed, selectedAction, selectedReason, recoveryState, recoveryOpen, recoveryReleased, effectiveFaultPresent, dominantFault, effectiveMultipleFaults, evidenceState, artifactState, reviewState)
    }

    def parseEIT_Image_Availability_CoordinatorDecisionFrame_Payload(): EIT_Image_Availability_Coordinator.DecisionFrame_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorDecisionFrame_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDecisionFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.DecisionFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.DecisionFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorDecisionFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.DecisionFrame_Payload(value)
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityFrame(): EIT_Image_Availability_Coordinator.AvailabilityFrame = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityFrameT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityFrameT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityFrame = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityFrame")
      }
      parser.parseObjectKey("publicMode")
      val publicMode = parseEIT_Image_Availability_CoordinatorPublicModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("visibility")
      val visibility = parseEIT_Image_Availability_CoordinatorVisibilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("selectedReason")
      val selectedReason = parseEIT_Image_Availability_CoordinatorSelectedReasonType()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryState")
      val recoveryState = parseEIT_Image_Availability_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("evidenceState")
      val evidenceState = parseEIT_Image_Availability_CoordinatorEvidenceStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("artifactState")
      val artifactState = parseEIT_Image_Availability_CoordinatorArtifactStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("reviewState")
      val reviewState = parseEIT_Image_Availability_CoordinatorReviewStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("faultPresent")
      val faultPresent = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("dominantFault")
      val dominantFault = parseEIT_Image_Availability_CoordinatorDominantFaultType()
      parser.parseObjectNext()
      parser.parseObjectKey("multipleFaults")
      val multipleFaults = parser.parseB()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AvailabilityFrame(publicMode, visibility, selectedReason, recoveryState, evidenceState, artifactState, reviewState, faultPresent, dominantFault, multipleFaults)
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload(): EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityFrame_PayloadT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityFrame_PayloadT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Image_Availability_CoordinatorAvailabilityFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload(value)
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

    def parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container(): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P", "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_imageSignal")
      val api_imageSignal = parseEIT_Image_Availability_CoordinatorImageSignalType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P(api_imageSignal)
    }

    def parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_imageSignal")
      val api_imageSignal = parseEIT_Image_Availability_CoordinatorImageSignalType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(api_imageSignal)
    }

    def parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container(): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P", "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_imageFacts")
      val api_imageFacts = parseEIT_Image_Availability_CoordinatorImageFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P(api_imageFacts)
    }

    def parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_imageFacts")
      val api_imageFacts = parseEIT_Image_Availability_CoordinatorImageFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(api_imageFacts)
    }

    def parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container(): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P", "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_doctorSignal")
      val api_doctorSignal = parseEIT_Image_Availability_CoordinatorDoctorSignalType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(api_doctorSignal)
    }

    def parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_doctorSignal")
      val api_doctorSignal = parseEIT_Image_Availability_CoordinatorDoctorSignalType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(api_doctorSignal)
    }

    def parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container(): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P", "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_reviewFacts")
      val api_reviewFacts = parseEIT_Image_Availability_CoordinatorReviewFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(api_reviewFacts)
    }

    def parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_reviewFacts")
      val api_reviewFacts = parseEIT_Image_Availability_CoordinatorReviewFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(api_reviewFacts)
    }

    def parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container(): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P", "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_preparationContext")
      val api_preparationContext = parseEIT_Image_Availability_CoordinatorPreparationContextType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(api_preparationContext)
    }

    def parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_preparationContext")
      val api_preparationContext = parseEIT_Image_Availability_CoordinatorPreparationContextType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(api_preparationContext)
    }

    def parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container(): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P", "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_contextFacts")
      val api_contextFacts = parseEIT_Image_Availability_CoordinatorContextFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(api_contextFacts)
    }

    def parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_contextFacts")
      val api_contextFacts = parseEIT_Image_Availability_CoordinatorContextFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(api_contextFacts)
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container(): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_availabilityService")
      val api_availabilityService = parseEIT_Image_Availability_CoordinatorServiceObservationType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(api_availabilityService)
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_availabilityService")
      val api_availabilityService = parseEIT_Image_Availability_CoordinatorServiceObservationType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(api_availabilityService)
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container(): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_serviceFacts")
      val api_serviceFacts = parseEIT_Image_Availability_CoordinatorServiceFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(api_serviceFacts)
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_serviceFacts")
      val api_serviceFacts = parseEIT_Image_Availability_CoordinatorServiceFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(api_serviceFacts)
    }

    def parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container(): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P", "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P")
      }
      parser.parseObjectKey("api_contextFacts")
      val api_contextFacts = parseEIT_Image_Availability_CoordinatorContextFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_imageFacts")
      val api_imageFacts = parseEIT_Image_Availability_CoordinatorImageFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reviewFacts")
      val api_reviewFacts = parseEIT_Image_Availability_CoordinatorReviewFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceFacts")
      val api_serviceFacts = parseEIT_Image_Availability_CoordinatorServiceFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P(api_contextFacts, api_imageFacts, api_reviewFacts, api_serviceFacts)
    }

    def parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_contextFacts")
      val api_contextFacts = parseEIT_Image_Availability_CoordinatorContextFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_imageFacts")
      val api_imageFacts = parseEIT_Image_Availability_CoordinatorImageFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reviewFacts")
      val api_reviewFacts = parseEIT_Image_Availability_CoordinatorReviewFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceFacts")
      val api_serviceFacts = parseEIT_Image_Availability_CoordinatorServiceFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS(api_contextFacts, api_imageFacts, api_reviewFacts, api_serviceFacts)
    }

    def parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container(): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P", "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P")
      }
      parser.parseObjectKey("api_faultSummary")
      val api_faultSummary = parseEIT_Image_Availability_CoordinatorFaultSummary()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P(api_faultSummary)
    }

    def parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_faultSummary")
      val api_faultSummary = parseEIT_Image_Availability_CoordinatorFaultSummary()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS(api_faultSummary)
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container(): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P", "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P")
      }
      parser.parseObjectKey("api_faultSummary")
      val api_faultSummary = parseEIT_Image_Availability_CoordinatorFaultSummary()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryEvent")
      val api_recoveryEvent = parseEIT_Image_Availability_CoordinatorRecoveryEventType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P(api_faultSummary, api_recoveryEvent)
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS")
      }
      parser.parseObjectKey("api_faultSummary")
      val api_faultSummary = parseEIT_Image_Availability_CoordinatorFaultSummary()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryEvent")
      val api_recoveryEvent = parseEIT_Image_Availability_CoordinatorRecoveryEventType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS(api_faultSummary, api_recoveryEvent)
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container(): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P", "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P")
      }
      parser.parseObjectKey("api_recoveryFrame")
      val api_recoveryFrame = parseEIT_Image_Availability_CoordinatorRecoveryFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P(api_recoveryFrame)
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS")
      }
      parser.parseObjectKey("api_recoveryFrame")
      val api_recoveryFrame = parseEIT_Image_Availability_CoordinatorRecoveryFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS(api_recoveryFrame)
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container(): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P", "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P")
      }
      parser.parseObjectKey("api_contextFacts")
      val api_contextFacts = parseEIT_Image_Availability_CoordinatorContextFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_imageFacts")
      val api_imageFacts = parseEIT_Image_Availability_CoordinatorImageFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryFrame")
      val api_recoveryFrame = parseEIT_Image_Availability_CoordinatorRecoveryFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(api_contextFacts, api_imageFacts, api_recoveryFrame)
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS")
      }
      parser.parseObjectKey("api_contextFacts")
      val api_contextFacts = parseEIT_Image_Availability_CoordinatorContextFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_imageFacts")
      val api_imageFacts = parseEIT_Image_Availability_CoordinatorImageFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryFrame")
      val api_recoveryFrame = parseEIT_Image_Availability_CoordinatorRecoveryFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(api_contextFacts, api_imageFacts, api_recoveryFrame)
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container(): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P", "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P")
      }
      parser.parseObjectKey("api_evidenceFrame")
      val api_evidenceFrame = parseEIT_Image_Availability_CoordinatorEvidenceFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(api_evidenceFrame)
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS")
      }
      parser.parseObjectKey("api_evidenceFrame")
      val api_evidenceFrame = parseEIT_Image_Availability_CoordinatorEvidenceFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(api_evidenceFrame)
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container(): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P", "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P")
      }
      parser.parseObjectKey("api_contextFacts")
      val api_contextFacts = parseEIT_Image_Availability_CoordinatorContextFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evidenceFrame")
      val api_evidenceFrame = parseEIT_Image_Availability_CoordinatorEvidenceFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_imageFacts")
      val api_imageFacts = parseEIT_Image_Availability_CoordinatorImageFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryFrame")
      val api_recoveryFrame = parseEIT_Image_Availability_CoordinatorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceFacts")
      val api_serviceFacts = parseEIT_Image_Availability_CoordinatorServiceFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(api_contextFacts, api_evidenceFrame, api_imageFacts, api_recoveryFrame, api_serviceFacts)
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS")
      }
      parser.parseObjectKey("api_contextFacts")
      val api_contextFacts = parseEIT_Image_Availability_CoordinatorContextFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evidenceFrame")
      val api_evidenceFrame = parseEIT_Image_Availability_CoordinatorEvidenceFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_imageFacts")
      val api_imageFacts = parseEIT_Image_Availability_CoordinatorImageFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryFrame")
      val api_recoveryFrame = parseEIT_Image_Availability_CoordinatorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceFacts")
      val api_serviceFacts = parseEIT_Image_Availability_CoordinatorServiceFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(api_contextFacts, api_evidenceFrame, api_imageFacts, api_recoveryFrame, api_serviceFacts)
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container(): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P", "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P")
      }
      parser.parseObjectKey("api_admissionFrame")
      val api_admissionFrame = parseEIT_Image_Availability_CoordinatorAdmissionFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(api_admissionFrame)
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS")
      }
      parser.parseObjectKey("api_admissionFrame")
      val api_admissionFrame = parseEIT_Image_Availability_CoordinatorAdmissionFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(api_admissionFrame)
    }

    def parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container(): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P", "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P")
      }
      parser.parseObjectKey("api_admissionFrame")
      val api_admissionFrame = parseEIT_Image_Availability_CoordinatorAdmissionFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_imageFacts")
      val api_imageFacts = parseEIT_Image_Availability_CoordinatorImageFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryFrame")
      val api_recoveryFrame = parseEIT_Image_Availability_CoordinatorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reviewFacts")
      val api_reviewFacts = parseEIT_Image_Availability_CoordinatorReviewFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(api_admissionFrame, api_imageFacts, api_recoveryFrame, api_reviewFacts)
    }

    def parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS")
      }
      parser.parseObjectKey("api_admissionFrame")
      val api_admissionFrame = parseEIT_Image_Availability_CoordinatorAdmissionFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_imageFacts")
      val api_imageFacts = parseEIT_Image_Availability_CoordinatorImageFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryFrame")
      val api_recoveryFrame = parseEIT_Image_Availability_CoordinatorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reviewFacts")
      val api_reviewFacts = parseEIT_Image_Availability_CoordinatorReviewFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(api_admissionFrame, api_imageFacts, api_recoveryFrame, api_reviewFacts)
    }

    def parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container(): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P", "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P")
      }
      parser.parseObjectKey("api_artifactFrame")
      val api_artifactFrame = parseEIT_Image_Availability_CoordinatorArtifactFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(api_artifactFrame)
    }

    def parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS")
      }
      parser.parseObjectKey("api_artifactFrame")
      val api_artifactFrame = parseEIT_Image_Availability_CoordinatorArtifactFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(api_artifactFrame)
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container(): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P")
      }
      parser.parseObjectKey("api_artifactFrame")
      val api_artifactFrame = parseEIT_Image_Availability_CoordinatorArtifactFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evidenceFrame")
      val api_evidenceFrame = parseEIT_Image_Availability_CoordinatorEvidenceFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryFrame")
      val api_recoveryFrame = parseEIT_Image_Availability_CoordinatorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceFacts")
      val api_serviceFacts = parseEIT_Image_Availability_CoordinatorServiceFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(api_artifactFrame, api_evidenceFrame, api_recoveryFrame, api_serviceFacts)
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS")
      }
      parser.parseObjectKey("api_artifactFrame")
      val api_artifactFrame = parseEIT_Image_Availability_CoordinatorArtifactFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evidenceFrame")
      val api_evidenceFrame = parseEIT_Image_Availability_CoordinatorEvidenceFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryFrame")
      val api_recoveryFrame = parseEIT_Image_Availability_CoordinatorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceFacts")
      val api_serviceFacts = parseEIT_Image_Availability_CoordinatorServiceFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(api_artifactFrame, api_evidenceFrame, api_recoveryFrame, api_serviceFacts)
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container(): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P")
      }
      parser.parseObjectKey("api_availabilityFrame")
      val api_availabilityFrame = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(api_availabilityFrame)
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS")
      }
      parser.parseObjectKey("api_availabilityFrame")
      val api_availabilityFrame = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(api_availabilityFrame)
    }

    def parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container(): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P", "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P")
      }
      parser.parseObjectKey("api_availabilityFrame")
      val api_availabilityFrame = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryFrame")
      val api_recoveryFrame = parseEIT_Image_Availability_CoordinatorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reviewFacts")
      val api_reviewFacts = parseEIT_Image_Availability_CoordinatorReviewFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(api_availabilityFrame, api_recoveryFrame, api_reviewFacts)
    }

    def parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS")
      }
      parser.parseObjectKey("api_availabilityFrame")
      val api_availabilityFrame = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryFrame")
      val api_recoveryFrame = parseEIT_Image_Availability_CoordinatorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reviewFacts")
      val api_reviewFacts = parseEIT_Image_Availability_CoordinatorReviewFactsType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(api_availabilityFrame, api_recoveryFrame, api_reviewFacts)
    }

    def parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container(): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P", "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P")
      }
      parser.parseObjectKey("api_reviewFrame")
      val api_reviewFrame = parseEIT_Image_Availability_CoordinatorReviewFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(api_reviewFrame)
    }

    def parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS")
      }
      parser.parseObjectKey("api_reviewFrame")
      val api_reviewFrame = parseEIT_Image_Availability_CoordinatorReviewFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(api_reviewFrame)
    }

    def parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container(): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P", "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P")
      }
      parser.parseObjectKey("api_availabilityFrame")
      val api_availabilityFrame = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reviewFrame")
      val api_reviewFrame = parseEIT_Image_Availability_CoordinatorReviewFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(api_availabilityFrame, api_reviewFrame)
    }

    def parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS")
      }
      parser.parseObjectKey("api_availabilityFrame")
      val api_availabilityFrame = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reviewFrame")
      val api_reviewFrame = parseEIT_Image_Availability_CoordinatorReviewFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(api_availabilityFrame, api_reviewFrame)
    }

    def parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container(): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P", "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P")
      }
      parser.parseObjectKey("api_presentationFrame")
      val api_presentationFrame = parseEIT_Image_Availability_CoordinatorPresentationFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(api_presentationFrame)
    }

    def parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS")
      }
      parser.parseObjectKey("api_presentationFrame")
      val api_presentationFrame = parseEIT_Image_Availability_CoordinatorPresentationFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(api_presentationFrame)
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container(): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P")
      }
      parser.parseObjectKey("api_admissionFrame")
      val api_admissionFrame = parseEIT_Image_Availability_CoordinatorAdmissionFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_artifactFrame")
      val api_artifactFrame = parseEIT_Image_Availability_CoordinatorArtifactFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_availabilityFrame")
      val api_availabilityFrame = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evidenceFrame")
      val api_evidenceFrame = parseEIT_Image_Availability_CoordinatorEvidenceFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_presentationFrame")
      val api_presentationFrame = parseEIT_Image_Availability_CoordinatorPresentationFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryFrame")
      val api_recoveryFrame = parseEIT_Image_Availability_CoordinatorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reviewFrame")
      val api_reviewFrame = parseEIT_Image_Availability_CoordinatorReviewFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(api_admissionFrame, api_artifactFrame, api_availabilityFrame, api_evidenceFrame, api_presentationFrame, api_recoveryFrame, api_reviewFrame)
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS")
      }
      parser.parseObjectKey("api_admissionFrame")
      val api_admissionFrame = parseEIT_Image_Availability_CoordinatorAdmissionFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_artifactFrame")
      val api_artifactFrame = parseEIT_Image_Availability_CoordinatorArtifactFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_availabilityFrame")
      val api_availabilityFrame = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evidenceFrame")
      val api_evidenceFrame = parseEIT_Image_Availability_CoordinatorEvidenceFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_presentationFrame")
      val api_presentationFrame = parseEIT_Image_Availability_CoordinatorPresentationFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryFrame")
      val api_recoveryFrame = parseEIT_Image_Availability_CoordinatorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reviewFrame")
      val api_reviewFrame = parseEIT_Image_Availability_CoordinatorReviewFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(api_admissionFrame, api_artifactFrame, api_availabilityFrame, api_evidenceFrame, api_presentationFrame, api_recoveryFrame, api_reviewFrame)
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container(): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P")
      }
      parser.parseObjectKey("api_decisionFrame")
      val api_decisionFrame = parseEIT_Image_Availability_CoordinatorDecisionFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(api_decisionFrame)
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS")
      }
      parser.parseObjectKey("api_decisionFrame")
      val api_decisionFrame = parseEIT_Image_Availability_CoordinatorDecisionFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(api_decisionFrame)
    }

    def parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container(): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P", "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P")
      }
      parser.parseObjectKey("api_decisionFrame")
      val api_decisionFrame = parseEIT_Image_Availability_CoordinatorDecisionFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P(api_decisionFrame)
    }

    def parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_decisionFrame")
      val api_decisionFrame = parseEIT_Image_Availability_CoordinatorDecisionFrame()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS(api_decisionFrame)
    }

    def parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container(): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P", "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS"))
      t.native match {
        case "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P = {
      val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PT(typeParsed: B): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P")
      }
      parser.parseObjectKey("api_analysisAvailability")
      val api_analysisAvailability = parseEIT_Image_Availability_CoordinatorAvailabilityFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upstreamDisposition")
      val api_upstreamDisposition = parseEIT_Image_Availability_CoordinatorUpstreamDispositionType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P(api_analysisAvailability, api_upstreamDisposition)
    }

    def parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS = {
      val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PST(typeParsed: B): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_analysisAvailability")
      val api_analysisAvailability = parseEIT_Image_Availability_CoordinatorAvailabilityFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_upstreamDisposition")
      val api_upstreamDisposition = parseEIT_Image_Availability_CoordinatorUpstreamDispositionType()
      parser.parseObjectNext()
      return EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS(api_analysisAvailability, api_upstreamDisposition)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P", "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P", "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS", "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS", "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P", "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P", "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS", "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS", "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P", "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS", "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P", "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS", "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P", "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P", "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS", "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS", "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P", "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P", "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS", "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS", "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P", "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS", "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P", "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS", "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P", "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS", "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P", "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS", "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P", "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS", "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS", "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P", "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS", "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS", "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS", "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS", "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P", "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS", "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P", "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS", "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P", "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS", "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P", "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS", "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P", "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS", "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P", "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS", "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS", "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "EIT_Image_Availability_Coordinator.Visibility_Payload", "EIT_Image_Availability_Coordinator.ImageFacts_Payload", "EIT_Image_Availability_Coordinator.PublicMode_Payload", "EIT_Image_Availability_Coordinator.ReviewState_Payload", "EIT_Image_Availability_Coordinator.ImageSignal_Payload", "EIT_Image_Availability_Coordinator.ReviewFacts_Payload", "EIT_Image_Availability_Coordinator.BlockReason_Payload", "EIT_Image_Availability_Coordinator.ReviewFrame_Payload", "EIT_Image_Availability_Coordinator.ServiceFacts_Payload", "EIT_Image_Availability_Coordinator.DoctorSignal_Payload", "EIT_Image_Availability_Coordinator.ContextFacts_Payload", "EIT_Image_Availability_Coordinator.FaultSummary_Payload", "EIT_Image_Availability_Coordinator.EvidenceState_Payload", "EIT_Image_Availability_Coordinator.RecoveryState_Payload", "EIT_Image_Availability_Coordinator.ArtifactState_Payload", "EIT_Image_Availability_Coordinator.RecoveryEvent_Payload", "EIT_Image_Availability_Coordinator.DominantFault_Payload", "EIT_Image_Availability_Coordinator.EvidenceFrame_Payload", "EIT_Image_Availability_Coordinator.ArtifactFrame_Payload", "EIT_Image_Availability_Coordinator.RecoveryFrame_Payload", "EIT_Image_Availability_Coordinator.DecisionFrame_Payload", "EIT_Image_Availability_Coordinator.SelectedAction_Payload", "EIT_Image_Availability_Coordinator.SelectedReason_Payload", "EIT_Image_Availability_Coordinator.AdmissionFrame_Payload", "EIT_Image_Availability_Coordinator.AdmissionReason_Payload", "EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload", "EIT_Image_Availability_Coordinator.PresentationFrame_Payload", "EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload", "EIT_Image_Availability_Coordinator.ServiceObservation_Payload", "EIT_Image_Availability_Coordinator.PreparationContext_Payload", "EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload", "EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload", "EIT_Image_Availability_Coordinator.PresentationProposal_Payload", "EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload", "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P", "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P", "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS", "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS", "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P", "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P", "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS", "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS", "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P", "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS", "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P", "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS", "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P", "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P", "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS", "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS", "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P", "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P", "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS", "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS", "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P", "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS", "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P", "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS", "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P", "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS", "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P", "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS", "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P", "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS", "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS", "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P", "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS", "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS", "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS", "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS", "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P", "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS", "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P", "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS", "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P", "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS", "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P", "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS", "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P", "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS", "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P", "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS", "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS", "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P", "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS"))
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
        case "EIT_Image_Availability_Coordinator.Visibility_Payload" => val r = parseEIT_Image_Availability_CoordinatorVisibility_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.ImageFacts_Payload" => val r = parseEIT_Image_Availability_CoordinatorImageFacts_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.PublicMode_Payload" => val r = parseEIT_Image_Availability_CoordinatorPublicMode_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.ReviewState_Payload" => val r = parseEIT_Image_Availability_CoordinatorReviewState_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.ImageSignal_Payload" => val r = parseEIT_Image_Availability_CoordinatorImageSignal_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.ReviewFacts_Payload" => val r = parseEIT_Image_Availability_CoordinatorReviewFacts_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.BlockReason_Payload" => val r = parseEIT_Image_Availability_CoordinatorBlockReason_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.ReviewFrame_Payload" => val r = parseEIT_Image_Availability_CoordinatorReviewFrame_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.ServiceFacts_Payload" => val r = parseEIT_Image_Availability_CoordinatorServiceFacts_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.DoctorSignal_Payload" => val r = parseEIT_Image_Availability_CoordinatorDoctorSignal_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.ContextFacts_Payload" => val r = parseEIT_Image_Availability_CoordinatorContextFacts_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.FaultSummary_Payload" => val r = parseEIT_Image_Availability_CoordinatorFaultSummary_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.EvidenceState_Payload" => val r = parseEIT_Image_Availability_CoordinatorEvidenceState_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.RecoveryState_Payload" => val r = parseEIT_Image_Availability_CoordinatorRecoveryState_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.ArtifactState_Payload" => val r = parseEIT_Image_Availability_CoordinatorArtifactState_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.RecoveryEvent_Payload" => val r = parseEIT_Image_Availability_CoordinatorRecoveryEvent_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.DominantFault_Payload" => val r = parseEIT_Image_Availability_CoordinatorDominantFault_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.EvidenceFrame_Payload" => val r = parseEIT_Image_Availability_CoordinatorEvidenceFrame_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.ArtifactFrame_Payload" => val r = parseEIT_Image_Availability_CoordinatorArtifactFrame_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.RecoveryFrame_Payload" => val r = parseEIT_Image_Availability_CoordinatorRecoveryFrame_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.DecisionFrame_Payload" => val r = parseEIT_Image_Availability_CoordinatorDecisionFrame_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.SelectedAction_Payload" => val r = parseEIT_Image_Availability_CoordinatorSelectedAction_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.SelectedReason_Payload" => val r = parseEIT_Image_Availability_CoordinatorSelectedReason_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.AdmissionFrame_Payload" => val r = parseEIT_Image_Availability_CoordinatorAdmissionFrame_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.AdmissionReason_Payload" => val r = parseEIT_Image_Availability_CoordinatorAdmissionReason_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload" => val r = parseEIT_Image_Availability_CoordinatorAdmissionOutcome_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.PresentationFrame_Payload" => val r = parseEIT_Image_Availability_CoordinatorPresentationFrame_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityFrame_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.ServiceObservation_Payload" => val r = parseEIT_Image_Availability_CoordinatorServiceObservation_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.PreparationContext_Payload" => val r = parseEIT_Image_Availability_CoordinatorPreparationContext_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload" => val r = parseEIT_Image_Availability_CoordinatorUpstreamDisposition_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecision_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.PresentationProposal_Payload" => val r = parseEIT_Image_Availability_CoordinatorPresentationProposal_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_PayloadT(T); return r
        case "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PST(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PT(T); return r
        case "EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS" => val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PST(T); return r
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

  def fromEIT_Image_Availability_CoordinatorImageSignal_Payload(o: EIT_Image_Availability_Coordinator.ImageSignal_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImageSignal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImageSignal_Payload(s: String): Either[EIT_Image_Availability_Coordinator.ImageSignal_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImageSignal_Payload(parser: Parser): EIT_Image_Availability_Coordinator.ImageSignal_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImageSignal_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImageSignal_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImageFacts_Payload(o: EIT_Image_Availability_Coordinator.ImageFacts_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImageFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImageFacts_Payload(s: String): Either[EIT_Image_Availability_Coordinator.ImageFacts_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImageFacts_Payload(parser: Parser): EIT_Image_Availability_Coordinator.ImageFacts_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImageFacts_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImageFacts_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctorSignal_Payload(o: EIT_Image_Availability_Coordinator.DoctorSignal_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctorSignal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctorSignal_Payload(s: String): Either[EIT_Image_Availability_Coordinator.DoctorSignal_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctorSignal_Payload(parser: Parser): EIT_Image_Availability_Coordinator.DoctorSignal_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctorSignal_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctorSignal_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewFacts_Payload(o: EIT_Image_Availability_Coordinator.ReviewFacts_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorReviewFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorReviewFacts_Payload(s: String): Either[EIT_Image_Availability_Coordinator.ReviewFacts_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewFacts_Payload(parser: Parser): EIT_Image_Availability_Coordinator.ReviewFacts_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorReviewFacts_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorReviewFacts_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPreparationContext_Payload(o: EIT_Image_Availability_Coordinator.PreparationContext_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPreparationContext_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPreparationContext_Payload(s: String): Either[EIT_Image_Availability_Coordinator.PreparationContext_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPreparationContext_Payload(parser: Parser): EIT_Image_Availability_Coordinator.PreparationContext_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPreparationContext_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPreparationContext_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorContextFacts_Payload(o: EIT_Image_Availability_Coordinator.ContextFacts_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorContextFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorContextFacts_Payload(s: String): Either[EIT_Image_Availability_Coordinator.ContextFacts_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorContextFacts_Payload(parser: Parser): EIT_Image_Availability_Coordinator.ContextFacts_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorContextFacts_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorContextFacts_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorServiceObservation_Payload(o: EIT_Image_Availability_Coordinator.ServiceObservation_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorServiceObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorServiceObservation_Payload(s: String): Either[EIT_Image_Availability_Coordinator.ServiceObservation_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorServiceObservation_Payload(parser: Parser): EIT_Image_Availability_Coordinator.ServiceObservation_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorServiceObservation_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorServiceObservation_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorServiceFacts_Payload(o: EIT_Image_Availability_Coordinator.ServiceFacts_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorServiceFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorServiceFacts_Payload(s: String): Either[EIT_Image_Availability_Coordinator.ServiceFacts_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorServiceFacts_Payload(parser: Parser): EIT_Image_Availability_Coordinator.ServiceFacts_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorServiceFacts_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorServiceFacts_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDominantFault_Payload(o: EIT_Image_Availability_Coordinator.DominantFault_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDominantFault_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDominantFault_Payload(s: String): Either[EIT_Image_Availability_Coordinator.DominantFault_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDominantFault_Payload(parser: Parser): EIT_Image_Availability_Coordinator.DominantFault_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDominantFault_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDominantFault_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryEvent_Payload(o: EIT_Image_Availability_Coordinator.RecoveryEvent_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorRecoveryEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorRecoveryEvent_Payload(s: String): Either[EIT_Image_Availability_Coordinator.RecoveryEvent_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryEvent_Payload(parser: Parser): EIT_Image_Availability_Coordinator.RecoveryEvent_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorRecoveryEvent_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorRecoveryEvent_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryState_Payload(o: EIT_Image_Availability_Coordinator.RecoveryState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorRecoveryState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorRecoveryState_Payload(s: String): Either[EIT_Image_Availability_Coordinator.RecoveryState_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryState_Payload(parser: Parser): EIT_Image_Availability_Coordinator.RecoveryState_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorRecoveryState_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorRecoveryState_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceState_Payload(o: EIT_Image_Availability_Coordinator.EvidenceState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorEvidenceState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorEvidenceState_Payload(s: String): Either[EIT_Image_Availability_Coordinator.EvidenceState_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceState_Payload(parser: Parser): EIT_Image_Availability_Coordinator.EvidenceState_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorEvidenceState_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorEvidenceState_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload(o: EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload(s: String): Either[EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload(parser: Parser): EIT_Image_Availability_Coordinator.AdmissionOutcome_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAdmissionOutcome_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionReason_Payload(o: EIT_Image_Availability_Coordinator.AdmissionReason_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAdmissionReason_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAdmissionReason_Payload(s: String): Either[EIT_Image_Availability_Coordinator.AdmissionReason_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionReason_Payload(parser: Parser): EIT_Image_Availability_Coordinator.AdmissionReason_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAdmissionReason_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAdmissionReason_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactState_Payload(o: EIT_Image_Availability_Coordinator.ArtifactState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorArtifactState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorArtifactState_Payload(s: String): Either[EIT_Image_Availability_Coordinator.ArtifactState_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactState_Payload(parser: Parser): EIT_Image_Availability_Coordinator.ArtifactState_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorArtifactState_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorArtifactState_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload(o: EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityDecision_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityDecision_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorBlockReason_Payload(o: EIT_Image_Availability_Coordinator.BlockReason_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorBlockReason_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorBlockReason_Payload(s: String): Either[EIT_Image_Availability_Coordinator.BlockReason_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorBlockReason_Payload(parser: Parser): EIT_Image_Availability_Coordinator.BlockReason_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorBlockReason_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorBlockReason_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewState_Payload(o: EIT_Image_Availability_Coordinator.ReviewState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorReviewState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorReviewState_Payload(s: String): Either[EIT_Image_Availability_Coordinator.ReviewState_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewState_Payload(parser: Parser): EIT_Image_Availability_Coordinator.ReviewState_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorReviewState_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorReviewState_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationProposal_Payload(o: EIT_Image_Availability_Coordinator.PresentationProposal_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPresentationProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPresentationProposal_Payload(s: String): Either[EIT_Image_Availability_Coordinator.PresentationProposal_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationProposal_Payload(parser: Parser): EIT_Image_Availability_Coordinator.PresentationProposal_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPresentationProposal_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPresentationProposal_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorSelectedAction_Payload(o: EIT_Image_Availability_Coordinator.SelectedAction_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorSelectedAction_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorSelectedAction_Payload(s: String): Either[EIT_Image_Availability_Coordinator.SelectedAction_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorSelectedAction_Payload(parser: Parser): EIT_Image_Availability_Coordinator.SelectedAction_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorSelectedAction_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorSelectedAction_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorSelectedReason_Payload(o: EIT_Image_Availability_Coordinator.SelectedReason_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorSelectedReason_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorSelectedReason_Payload(s: String): Either[EIT_Image_Availability_Coordinator.SelectedReason_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorSelectedReason_Payload(parser: Parser): EIT_Image_Availability_Coordinator.SelectedReason_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorSelectedReason_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorSelectedReason_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload(o: EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload(s: String): Either[EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload(parser: Parser): EIT_Image_Availability_Coordinator.UpstreamDisposition_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorUpstreamDisposition_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPublicMode_Payload(o: EIT_Image_Availability_Coordinator.PublicMode_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPublicMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPublicMode_Payload(s: String): Either[EIT_Image_Availability_Coordinator.PublicMode_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPublicMode_Payload(parser: Parser): EIT_Image_Availability_Coordinator.PublicMode_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPublicMode_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPublicMode_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorVisibility_Payload(o: EIT_Image_Availability_Coordinator.Visibility_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorVisibility_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorVisibility_Payload(s: String): Either[EIT_Image_Availability_Coordinator.Visibility_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorVisibility_Payload(parser: Parser): EIT_Image_Availability_Coordinator.Visibility_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorVisibility_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorVisibility_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorFaultSummary(o: EIT_Image_Availability_Coordinator.FaultSummary, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorFaultSummary(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorFaultSummary(s: String): Either[EIT_Image_Availability_Coordinator.FaultSummary, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorFaultSummary(parser: Parser): EIT_Image_Availability_Coordinator.FaultSummary = {
      val r = parser.parseEIT_Image_Availability_CoordinatorFaultSummary()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorFaultSummary _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorFaultSummary_Payload(o: EIT_Image_Availability_Coordinator.FaultSummary_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorFaultSummary_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorFaultSummary_Payload(s: String): Either[EIT_Image_Availability_Coordinator.FaultSummary_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorFaultSummary_Payload(parser: Parser): EIT_Image_Availability_Coordinator.FaultSummary_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorFaultSummary_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorFaultSummary_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryFrame(o: EIT_Image_Availability_Coordinator.RecoveryFrame, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorRecoveryFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorRecoveryFrame(s: String): Either[EIT_Image_Availability_Coordinator.RecoveryFrame, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryFrame(parser: Parser): EIT_Image_Availability_Coordinator.RecoveryFrame = {
      val r = parser.parseEIT_Image_Availability_CoordinatorRecoveryFrame()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorRecoveryFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryFrame_Payload(o: EIT_Image_Availability_Coordinator.RecoveryFrame_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorRecoveryFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorRecoveryFrame_Payload(s: String): Either[EIT_Image_Availability_Coordinator.RecoveryFrame_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryFrame_Payload(parser: Parser): EIT_Image_Availability_Coordinator.RecoveryFrame_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorRecoveryFrame_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorRecoveryFrame_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceFrame(o: EIT_Image_Availability_Coordinator.EvidenceFrame, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorEvidenceFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorEvidenceFrame(s: String): Either[EIT_Image_Availability_Coordinator.EvidenceFrame, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceFrame(parser: Parser): EIT_Image_Availability_Coordinator.EvidenceFrame = {
      val r = parser.parseEIT_Image_Availability_CoordinatorEvidenceFrame()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorEvidenceFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceFrame_Payload(o: EIT_Image_Availability_Coordinator.EvidenceFrame_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorEvidenceFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorEvidenceFrame_Payload(s: String): Either[EIT_Image_Availability_Coordinator.EvidenceFrame_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceFrame_Payload(parser: Parser): EIT_Image_Availability_Coordinator.EvidenceFrame_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorEvidenceFrame_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorEvidenceFrame_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionFrame(o: EIT_Image_Availability_Coordinator.AdmissionFrame, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAdmissionFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAdmissionFrame(s: String): Either[EIT_Image_Availability_Coordinator.AdmissionFrame, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionFrame(parser: Parser): EIT_Image_Availability_Coordinator.AdmissionFrame = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAdmissionFrame()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAdmissionFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionFrame_Payload(o: EIT_Image_Availability_Coordinator.AdmissionFrame_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAdmissionFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAdmissionFrame_Payload(s: String): Either[EIT_Image_Availability_Coordinator.AdmissionFrame_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionFrame_Payload(parser: Parser): EIT_Image_Availability_Coordinator.AdmissionFrame_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAdmissionFrame_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAdmissionFrame_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactFrame(o: EIT_Image_Availability_Coordinator.ArtifactFrame, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorArtifactFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorArtifactFrame(s: String): Either[EIT_Image_Availability_Coordinator.ArtifactFrame, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactFrame(parser: Parser): EIT_Image_Availability_Coordinator.ArtifactFrame = {
      val r = parser.parseEIT_Image_Availability_CoordinatorArtifactFrame()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorArtifactFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactFrame_Payload(o: EIT_Image_Availability_Coordinator.ArtifactFrame_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorArtifactFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorArtifactFrame_Payload(s: String): Either[EIT_Image_Availability_Coordinator.ArtifactFrame_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactFrame_Payload(parser: Parser): EIT_Image_Availability_Coordinator.ArtifactFrame_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorArtifactFrame_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorArtifactFrame_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityDecisionFrame_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityDecisionFrame_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewFrame(o: EIT_Image_Availability_Coordinator.ReviewFrame, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorReviewFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorReviewFrame(s: String): Either[EIT_Image_Availability_Coordinator.ReviewFrame, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewFrame(parser: Parser): EIT_Image_Availability_Coordinator.ReviewFrame = {
      val r = parser.parseEIT_Image_Availability_CoordinatorReviewFrame()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorReviewFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewFrame_Payload(o: EIT_Image_Availability_Coordinator.ReviewFrame_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorReviewFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorReviewFrame_Payload(s: String): Either[EIT_Image_Availability_Coordinator.ReviewFrame_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewFrame_Payload(parser: Parser): EIT_Image_Availability_Coordinator.ReviewFrame_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorReviewFrame_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorReviewFrame_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationFrame(o: EIT_Image_Availability_Coordinator.PresentationFrame, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPresentationFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPresentationFrame(s: String): Either[EIT_Image_Availability_Coordinator.PresentationFrame, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationFrame(parser: Parser): EIT_Image_Availability_Coordinator.PresentationFrame = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPresentationFrame()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPresentationFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationFrame_Payload(o: EIT_Image_Availability_Coordinator.PresentationFrame_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPresentationFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPresentationFrame_Payload(s: String): Either[EIT_Image_Availability_Coordinator.PresentationFrame_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationFrame_Payload(parser: Parser): EIT_Image_Availability_Coordinator.PresentationFrame_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPresentationFrame_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPresentationFrame_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDecisionFrame(o: EIT_Image_Availability_Coordinator.DecisionFrame, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDecisionFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDecisionFrame(s: String): Either[EIT_Image_Availability_Coordinator.DecisionFrame, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDecisionFrame(parser: Parser): EIT_Image_Availability_Coordinator.DecisionFrame = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDecisionFrame()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDecisionFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDecisionFrame_Payload(o: EIT_Image_Availability_Coordinator.DecisionFrame_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDecisionFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDecisionFrame_Payload(s: String): Either[EIT_Image_Availability_Coordinator.DecisionFrame_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDecisionFrame_Payload(parser: Parser): EIT_Image_Availability_Coordinator.DecisionFrame_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDecisionFrame_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDecisionFrame_Payload _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityFrame(o: EIT_Image_Availability_Coordinator.AvailabilityFrame, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityFrame(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityFrame, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityFrame(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityFrame = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityFrame()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityFrame _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload(o: EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityFrame_Payload = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityFrame_Payload _)
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

  def fromEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.ImageEventQualification_coordination_image_event_qualification_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorImageEventQualification_coordination_image_event_qualification_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.DoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorDoctorEventQualification_coordination_doctor_event_qualification_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.PreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPreparationContextAssessment_coordination_preparation_context_assessment_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityServiceAssessment_coordination_availability_service_assessment_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.FaultComposition_coordination_fault_composition_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorFaultComposition_coordination_fault_composition_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.RecoveryControl_coordination_recovery_control_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorRecoveryControl_coordination_recovery_control_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.EvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorEvidenceLifecycle_coordination_evidence_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.AdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAdmissionDecisionOwner_coordination_admission_decision_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.ArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorArtifactLifecycle_coordination_artifact_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityDecisionOwner_coordination_availability_decision_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.ReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorReviewLifecycle_coordination_review_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.PresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPresentationDecisionOwner_coordination_presentation_decision_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.AvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorAvailabilityArbitration_coordination_availability_arbitration_PostState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container(s: String): Either[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container(parser: Parser): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PreState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PreState_Container_PS _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container(s: String): Either[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container(parser: Parser): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(s: String): Either[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P(parser: Parser): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_P = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_P _)
    return r
  }

  def fromEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(o: EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(s: String): Either[EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS(parser: Parser): EIT_Image_Availability_Coordinator.PublicationComposition_coordination_publication_composition_PostState_Container_PS = {
      val r = parser.parseEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Image_Availability_CoordinatorPublicationComposition_coordination_publication_composition_PostState_Container_PS _)
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