// #Sireum
// @formatter:off

// This file is auto-generated from DoctorSignal.scala, RequestClass.scala, PreparationObservation.scala, PreparationFacts.scala, EquipmentObservation.scala, EquipmentFacts.scala, BatchSignal.scala, BatchFacts.scala, ImageFeedback.scala, ImageResultFacts.scala, DominantFault.scala, RecoveryState.scala, RecoveryGate.scala, RecoveryCause.scala, StartFeasibility.scala, SessionState.scala, CycleState.scala, ImageState.scala, RecoveryEvent.scala, Proposal.scala, SelectedAction.scala, SelectedCause.scala, AcquisitionCommand.scala, ImageCommand.scala, PublicMode.scala, ImageDisposition.scala, RequestFactsRecord.scala, FaultSummary.scala, RecoveryFrame.scala, SessionFrame.scala, CycleFrame.scala, ImageFrame.scala, DecisionFrame.scala, ControlFrame.scala, StatusFrame.scala, Base_Types.scala, DoctorRequestQualification_acquisition_process_doctor_request_qualification_Containers.scala, PreparationAssessment_acquisition_process_preparation_assessment_Containers.scala, EquipmentAssessment_acquisition_process_equipment_assessment_Containers.scala, BatchAssessment_acquisition_process_batch_assessment_Containers.scala, ImageResultAssessment_acquisition_process_image_result_assessment_Containers.scala, FaultComposition_acquisition_process_fault_composition_Containers.scala, SessionControl_acquisition_process_session_control_Containers.scala, AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_Containers.scala, ImageAvailabilityControl_acquisition_process_image_availability_control_Containers.scala, RecoveryControl_acquisition_process_recovery_control_Containers.scala, StartFeasibilityOwner_acquisition_process_start_feasibility_Containers.scala, CollectionFeasibilityOwner_acquisition_process_collection_feasibility_Containers.scala, ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_Containers.scala, SupervisoryArbitration_acquisition_process_supervisory_arbitration_Containers.scala, PublicationComposition_acquisition_process_publication_composition_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package eit_acquisition_supervisor

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printEIT_Acquisition_SupervisorDoctorSignalType(o: EIT_Acquisition_Supervisor.DoctorSignal.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.DoctorSignal.NONE => "NONE"
        case EIT_Acquisition_Supervisor.DoctorSignal.START => "START"
        case EIT_Acquisition_Supervisor.DoctorSignal.STOP => "STOP"
        case EIT_Acquisition_Supervisor.DoctorSignal.ACK_IMAGE => "ACK_IMAGE"
        case EIT_Acquisition_Supervisor.DoctorSignal.INVALID_INTENT => "INVALID_INTENT"
        case EIT_Acquisition_Supervisor.DoctorSignal.INVALID_STATUS => "INVALID_STATUS"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.DoctorSignal")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorDoctorSignal_Payload(o: EIT_Acquisition_Supervisor.DoctorSignal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.DoctorSignal_Payload""""),
        ("value", printEIT_Acquisition_SupervisorDoctorSignalType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRequestClassType(o: EIT_Acquisition_Supervisor.RequestClass.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.RequestClass.NO_REQUEST => "NO_REQUEST"
        case EIT_Acquisition_Supervisor.RequestClass.START_REQUEST => "START_REQUEST"
        case EIT_Acquisition_Supervisor.RequestClass.STOP_REQUEST => "STOP_REQUEST"
        case EIT_Acquisition_Supervisor.RequestClass.IMAGE_ACK => "IMAGE_ACK"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.RequestClass")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRequestClass_Payload(o: EIT_Acquisition_Supervisor.RequestClass_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.RequestClass_Payload""""),
        ("value", printEIT_Acquisition_SupervisorRequestClassType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorPreparationObservationType(o: EIT_Acquisition_Supervisor.PreparationObservation.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.PreparationObservation.READY => "READY"
        case EIT_Acquisition_Supervisor.PreparationObservation.NOT_APPLIED => "NOT_APPLIED"
        case EIT_Acquisition_Supervisor.PreparationObservation.CALIBRATION_NOT_PERFORMED => "CALIBRATION_NOT_PERFORMED"
        case EIT_Acquisition_Supervisor.PreparationObservation.CALIBRATION_FAILED => "CALIBRATION_FAILED"
        case EIT_Acquisition_Supervisor.PreparationObservation.INVALID_BELT_STATUS => "INVALID_BELT_STATUS"
        case EIT_Acquisition_Supervisor.PreparationObservation.INVALID_CALIBRATION_STATUS => "INVALID_CALIBRATION_STATUS"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.PreparationObservation")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorPreparationObservation_Payload(o: EIT_Acquisition_Supervisor.PreparationObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.PreparationObservation_Payload""""),
        ("value", printEIT_Acquisition_SupervisorPreparationObservationType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorPreparationFactsType(o: EIT_Acquisition_Supervisor.PreparationFacts.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.PreparationFacts.READY => "READY"
        case EIT_Acquisition_Supervisor.PreparationFacts.NOT_READY => "NOT_READY"
        case EIT_Acquisition_Supervisor.PreparationFacts.FAILED => "FAILED"
        case EIT_Acquisition_Supervisor.PreparationFacts.INPUT_FAULT => "INPUT_FAULT"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.PreparationFacts")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorPreparationFacts_Payload(o: EIT_Acquisition_Supervisor.PreparationFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.PreparationFacts_Payload""""),
        ("value", printEIT_Acquisition_SupervisorPreparationFactsType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorEquipmentObservationType(o: EIT_Acquisition_Supervisor.EquipmentObservation.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.EquipmentObservation.READY => "READY"
        case EIT_Acquisition_Supervisor.EquipmentObservation.NOT_READY => "NOT_READY"
        case EIT_Acquisition_Supervisor.EquipmentObservation.BUSY => "BUSY"
        case EIT_Acquisition_Supervisor.EquipmentObservation.FAULTED => "FAULTED"
        case EIT_Acquisition_Supervisor.EquipmentObservation.INVALID_HEALTH_STATUS => "INVALID_HEALTH_STATUS"
        case EIT_Acquisition_Supervisor.EquipmentObservation.INVALID_AVAILABILITY_STATUS => "INVALID_AVAILABILITY_STATUS"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.EquipmentObservation")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorEquipmentObservation_Payload(o: EIT_Acquisition_Supervisor.EquipmentObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.EquipmentObservation_Payload""""),
        ("value", printEIT_Acquisition_SupervisorEquipmentObservationType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorEquipmentFactsType(o: EIT_Acquisition_Supervisor.EquipmentFacts.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.EquipmentFacts.READY => "READY"
        case EIT_Acquisition_Supervisor.EquipmentFacts.NOT_READY => "NOT_READY"
        case EIT_Acquisition_Supervisor.EquipmentFacts.BUSY => "BUSY"
        case EIT_Acquisition_Supervisor.EquipmentFacts.FAILED => "FAILED"
        case EIT_Acquisition_Supervisor.EquipmentFacts.INPUT_FAULT => "INPUT_FAULT"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.EquipmentFacts")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorEquipmentFacts_Payload(o: EIT_Acquisition_Supervisor.EquipmentFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.EquipmentFacts_Payload""""),
        ("value", printEIT_Acquisition_SupervisorEquipmentFactsType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorBatchSignalType(o: EIT_Acquisition_Supervisor.BatchSignal.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.BatchSignal.NONE => "NONE"
        case EIT_Acquisition_Supervisor.BatchSignal.COMPLETE => "COMPLETE"
        case EIT_Acquisition_Supervisor.BatchSignal.INCOMPLETE => "INCOMPLETE"
        case EIT_Acquisition_Supervisor.BatchSignal.CORRUPT => "CORRUPT"
        case EIT_Acquisition_Supervisor.BatchSignal.INVALID_BATCH_KIND => "INVALID_BATCH_KIND"
        case EIT_Acquisition_Supervisor.BatchSignal.INVALID_BATCH_STATUS => "INVALID_BATCH_STATUS"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.BatchSignal")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorBatchSignal_Payload(o: EIT_Acquisition_Supervisor.BatchSignal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.BatchSignal_Payload""""),
        ("value", printEIT_Acquisition_SupervisorBatchSignalType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorBatchFactsType(o: EIT_Acquisition_Supervisor.BatchFacts.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.BatchFacts.NO_BATCH => "NO_BATCH"
        case EIT_Acquisition_Supervisor.BatchFacts.USABLE => "USABLE"
        case EIT_Acquisition_Supervisor.BatchFacts.INCOMPLETE => "INCOMPLETE"
        case EIT_Acquisition_Supervisor.BatchFacts.FAILED => "FAILED"
        case EIT_Acquisition_Supervisor.BatchFacts.INPUT_FAULT => "INPUT_FAULT"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.BatchFacts")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorBatchFacts_Payload(o: EIT_Acquisition_Supervisor.BatchFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.BatchFacts_Payload""""),
        ("value", printEIT_Acquisition_SupervisorBatchFactsType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageFeedbackType(o: EIT_Acquisition_Supervisor.ImageFeedback.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.ImageFeedback.NONE => "NONE"
        case EIT_Acquisition_Supervisor.ImageFeedback.GENERATED => "GENERATED"
        case EIT_Acquisition_Supervisor.ImageFeedback.FAILED => "FAILED"
        case EIT_Acquisition_Supervisor.ImageFeedback.INVALID_RESULT => "INVALID_RESULT"
        case EIT_Acquisition_Supervisor.ImageFeedback.INVALID_STATUS => "INVALID_STATUS"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.ImageFeedback")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageFeedback_Payload(o: EIT_Acquisition_Supervisor.ImageFeedback_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageFeedback_Payload""""),
        ("value", printEIT_Acquisition_SupervisorImageFeedbackType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageResultFactsType(o: EIT_Acquisition_Supervisor.ImageResultFacts.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.ImageResultFacts.NO_RESULT => "NO_RESULT"
        case EIT_Acquisition_Supervisor.ImageResultFacts.AVAILABLE => "AVAILABLE"
        case EIT_Acquisition_Supervisor.ImageResultFacts.FAILED => "FAILED"
        case EIT_Acquisition_Supervisor.ImageResultFacts.INPUT_FAULT => "INPUT_FAULT"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.ImageResultFacts")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageResultFacts_Payload(o: EIT_Acquisition_Supervisor.ImageResultFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageResultFacts_Payload""""),
        ("value", printEIT_Acquisition_SupervisorImageResultFactsType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorDominantFaultType(o: EIT_Acquisition_Supervisor.DominantFault.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.DominantFault.NONE => "NONE"
        case EIT_Acquisition_Supervisor.DominantFault.RECOVERY_INPUT => "RECOVERY_INPUT"
        case EIT_Acquisition_Supervisor.DominantFault.REQUEST_INPUT => "REQUEST_INPUT"
        case EIT_Acquisition_Supervisor.DominantFault.PREPARATION_INPUT => "PREPARATION_INPUT"
        case EIT_Acquisition_Supervisor.DominantFault.EQUIPMENT_INPUT => "EQUIPMENT_INPUT"
        case EIT_Acquisition_Supervisor.DominantFault.BATCH_INPUT => "BATCH_INPUT"
        case EIT_Acquisition_Supervisor.DominantFault.IMAGE_INPUT => "IMAGE_INPUT"
        case EIT_Acquisition_Supervisor.DominantFault.PREPARATION_FAILURE => "PREPARATION_FAILURE"
        case EIT_Acquisition_Supervisor.DominantFault.EQUIPMENT_FAILURE => "EQUIPMENT_FAILURE"
        case EIT_Acquisition_Supervisor.DominantFault.BATCH_FAILURE => "BATCH_FAILURE"
        case EIT_Acquisition_Supervisor.DominantFault.IMAGE_FAILURE => "IMAGE_FAILURE"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.DominantFault")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorDominantFault_Payload(o: EIT_Acquisition_Supervisor.DominantFault_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.DominantFault_Payload""""),
        ("value", printEIT_Acquisition_SupervisorDominantFaultType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRecoveryStateType(o: EIT_Acquisition_Supervisor.RecoveryState.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.RecoveryState.HEALTHY => "HEALTHY"
        case EIT_Acquisition_Supervisor.RecoveryState.LATCHED => "LATCHED"
        case EIT_Acquisition_Supervisor.RecoveryState.VERIFYING => "VERIFYING"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.RecoveryState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRecoveryState_Payload(o: EIT_Acquisition_Supervisor.RecoveryState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.RecoveryState_Payload""""),
        ("value", printEIT_Acquisition_SupervisorRecoveryStateType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRecoveryGateType(o: EIT_Acquisition_Supervisor.RecoveryGate.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.RecoveryGate.OPEN => "OPEN"
        case EIT_Acquisition_Supervisor.RecoveryGate.CLOSED => "CLOSED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.RecoveryGate")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRecoveryGate_Payload(o: EIT_Acquisition_Supervisor.RecoveryGate_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.RecoveryGate_Payload""""),
        ("value", printEIT_Acquisition_SupervisorRecoveryGateType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRecoveryCauseType(o: EIT_Acquisition_Supervisor.RecoveryCause.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.RecoveryCause.NONE => "NONE"
        case EIT_Acquisition_Supervisor.RecoveryCause.LOCAL_FAULT => "LOCAL_FAULT"
        case EIT_Acquisition_Supervisor.RecoveryCause.RECOVERY_INPUT_FAULT => "RECOVERY_INPUT_FAULT"
        case EIT_Acquisition_Supervisor.RecoveryCause.LATCHED => "LATCHED"
        case EIT_Acquisition_Supervisor.RecoveryCause.VERIFYING => "VERIFYING"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.RecoveryCause")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRecoveryCause_Payload(o: EIT_Acquisition_Supervisor.RecoveryCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.RecoveryCause_Payload""""),
        ("value", printEIT_Acquisition_SupervisorRecoveryCauseType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorStartFeasibilityType(o: EIT_Acquisition_Supervisor.StartFeasibility.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.StartFeasibility.FEASIBLE => "FEASIBLE"
        case EIT_Acquisition_Supervisor.StartFeasibility.NOT_FEASIBLE => "NOT_FEASIBLE"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.StartFeasibility")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorStartFeasibility_Payload(o: EIT_Acquisition_Supervisor.StartFeasibility_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.StartFeasibility_Payload""""),
        ("value", printEIT_Acquisition_SupervisorStartFeasibilityType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorSessionStateType(o: EIT_Acquisition_Supervisor.SessionState.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.SessionState.IDLE => "IDLE"
        case EIT_Acquisition_Supervisor.SessionState.MONITORING => "MONITORING"
        case EIT_Acquisition_Supervisor.SessionState.RECOVERY => "RECOVERY"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.SessionState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorSessionState_Payload(o: EIT_Acquisition_Supervisor.SessionState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.SessionState_Payload""""),
        ("value", printEIT_Acquisition_SupervisorSessionStateType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorCycleStateType(o: EIT_Acquisition_Supervisor.CycleState.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.CycleState.DORMANT => "DORMANT"
        case EIT_Acquisition_Supervisor.CycleState.READY => "READY"
        case EIT_Acquisition_Supervisor.CycleState.COLLECTING => "COLLECTING"
        case EIT_Acquisition_Supervisor.CycleState.BATCH_READY => "BATCH_READY"
        case EIT_Acquisition_Supervisor.CycleState.RECOVERY => "RECOVERY"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.CycleState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorCycleState_Payload(o: EIT_Acquisition_Supervisor.CycleState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.CycleState_Payload""""),
        ("value", printEIT_Acquisition_SupervisorCycleStateType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageStateType(o: EIT_Acquisition_Supervisor.ImageState.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.ImageState.EMPTY => "EMPTY"
        case EIT_Acquisition_Supervisor.ImageState.AWAITING_IMAGE => "AWAITING_IMAGE"
        case EIT_Acquisition_Supervisor.ImageState.AVAILABLE => "AVAILABLE"
        case EIT_Acquisition_Supervisor.ImageState.RECOVERY => "RECOVERY"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.ImageState")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageState_Payload(o: EIT_Acquisition_Supervisor.ImageState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageState_Payload""""),
        ("value", printEIT_Acquisition_SupervisorImageStateType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRecoveryEventType(o: EIT_Acquisition_Supervisor.RecoveryEvent.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.RecoveryEvent.NONE => "NONE"
        case EIT_Acquisition_Supervisor.RecoveryEvent.RESET => "RESET"
        case EIT_Acquisition_Supervisor.RecoveryEvent.VERIFY_OK => "VERIFY_OK"
        case EIT_Acquisition_Supervisor.RecoveryEvent.INVALID_RESET => "INVALID_RESET"
        case EIT_Acquisition_Supervisor.RecoveryEvent.INVALID_STATUS => "INVALID_STATUS"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.RecoveryEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRecoveryEvent_Payload(o: EIT_Acquisition_Supervisor.RecoveryEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.RecoveryEvent_Payload""""),
        ("value", printEIT_Acquisition_SupervisorRecoveryEventType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorProposalType(o: EIT_Acquisition_Supervisor.Proposal.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.Proposal.PROPOSED => "PROPOSED"
        case EIT_Acquisition_Supervisor.Proposal.NOT_PROPOSED => "NOT_PROPOSED"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.Proposal")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorProposal_Payload(o: EIT_Acquisition_Supervisor.Proposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.Proposal_Payload""""),
        ("value", printEIT_Acquisition_SupervisorProposalType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorSelectedActionType(o: EIT_Acquisition_Supervisor.SelectedAction.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.SelectedAction.EMERGENCY_HOLD => "EMERGENCY_HOLD"
        case EIT_Acquisition_Supervisor.SelectedAction.STOP => "STOP"
        case EIT_Acquisition_Supervisor.SelectedAction.START => "START"
        case EIT_Acquisition_Supervisor.SelectedAction.RELEASE_IMAGE => "RELEASE_IMAGE"
        case EIT_Acquisition_Supervisor.SelectedAction.GENERATE_IMAGE => "GENERATE_IMAGE"
        case EIT_Acquisition_Supervisor.SelectedAction.COLLECT => "COLLECT"
        case EIT_Acquisition_Supervisor.SelectedAction.HOLD => "HOLD"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.SelectedAction")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorSelectedAction_Payload(o: EIT_Acquisition_Supervisor.SelectedAction_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.SelectedAction_Payload""""),
        ("value", printEIT_Acquisition_SupervisorSelectedActionType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorSelectedCauseType(o: EIT_Acquisition_Supervisor.SelectedCause.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.SelectedCause.FAULT_OR_RECOVERY => "FAULT_OR_RECOVERY"
        case EIT_Acquisition_Supervisor.SelectedCause.DOCTOR_STOP => "DOCTOR_STOP"
        case EIT_Acquisition_Supervisor.SelectedCause.DOCTOR_START => "DOCTOR_START"
        case EIT_Acquisition_Supervisor.SelectedCause.IMAGE_AVAILABLE => "IMAGE_AVAILABLE"
        case EIT_Acquisition_Supervisor.SelectedCause.USABLE_BATCH => "USABLE_BATCH"
        case EIT_Acquisition_Supervisor.SelectedCause.READY_TO_COLLECT => "READY_TO_COLLECT"
        case EIT_Acquisition_Supervisor.SelectedCause.NO_ELIGIBLE_WORK => "NO_ELIGIBLE_WORK"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.SelectedCause")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorSelectedCause_Payload(o: EIT_Acquisition_Supervisor.SelectedCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.SelectedCause_Payload""""),
        ("value", printEIT_Acquisition_SupervisorSelectedCauseType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorAcquisitionCommandType(o: EIT_Acquisition_Supervisor.AcquisitionCommand.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.AcquisitionCommand.NO_COMMAND => "NO_COMMAND"
        case EIT_Acquisition_Supervisor.AcquisitionCommand.REQUEST_START => "REQUEST_START"
        case EIT_Acquisition_Supervisor.AcquisitionCommand.REQUEST_COLLECTION => "REQUEST_COLLECTION"
        case EIT_Acquisition_Supervisor.AcquisitionCommand.REQUEST_STOP => "REQUEST_STOP"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.AcquisitionCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorAcquisitionCommand_Payload(o: EIT_Acquisition_Supervisor.AcquisitionCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.AcquisitionCommand_Payload""""),
        ("value", printEIT_Acquisition_SupervisorAcquisitionCommandType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageCommandType(o: EIT_Acquisition_Supervisor.ImageCommand.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.ImageCommand.NO_COMMAND => "NO_COMMAND"
        case EIT_Acquisition_Supervisor.ImageCommand.REQUEST_GENERATION => "REQUEST_GENERATION"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.ImageCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageCommand_Payload(o: EIT_Acquisition_Supervisor.ImageCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageCommand_Payload""""),
        ("value", printEIT_Acquisition_SupervisorImageCommandType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorPublicModeType(o: EIT_Acquisition_Supervisor.PublicMode.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.PublicMode.IDLE => "IDLE"
        case EIT_Acquisition_Supervisor.PublicMode.STARTING => "STARTING"
        case EIT_Acquisition_Supervisor.PublicMode.MONITORING => "MONITORING"
        case EIT_Acquisition_Supervisor.PublicMode.COLLECTING => "COLLECTING"
        case EIT_Acquisition_Supervisor.PublicMode.IMAGING => "IMAGING"
        case EIT_Acquisition_Supervisor.PublicMode.IMAGE_AVAILABLE => "IMAGE_AVAILABLE"
        case EIT_Acquisition_Supervisor.PublicMode.RECOVERY => "RECOVERY"
        case EIT_Acquisition_Supervisor.PublicMode.FAULT => "FAULT"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.PublicMode")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorPublicMode_Payload(o: EIT_Acquisition_Supervisor.PublicMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.PublicMode_Payload""""),
        ("value", printEIT_Acquisition_SupervisorPublicModeType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageDispositionType(o: EIT_Acquisition_Supervisor.ImageDisposition.Type): ST = {
      val value: String = o match {
        case EIT_Acquisition_Supervisor.ImageDisposition.WITHHELD => "WITHHELD"
        case EIT_Acquisition_Supervisor.ImageDisposition.AVAILABLE_FOR_ANALYSIS => "AVAILABLE_FOR_ANALYSIS"
      }
      return printObject(ISZ(
        ("type", printString("EIT_Acquisition_Supervisor.ImageDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageDisposition_Payload(o: EIT_Acquisition_Supervisor.ImageDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageDisposition_Payload""""),
        ("value", printEIT_Acquisition_SupervisorImageDispositionType(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRequestFactsRecord(o: EIT_Acquisition_Supervisor.RequestFactsRecord): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.RequestFactsRecord""""),
        ("requestClass", printEIT_Acquisition_SupervisorRequestClassType(o.requestClass)),
        ("requestFault", printB(o.requestFault))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRequestFactsRecord_Payload(o: EIT_Acquisition_Supervisor.RequestFactsRecord_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.RequestFactsRecord_Payload""""),
        ("value", printEIT_Acquisition_SupervisorRequestFactsRecord(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorFaultSummary(o: EIT_Acquisition_Supervisor.FaultSummary): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.FaultSummary""""),
        ("faultPresent", printB(o.faultPresent)),
        ("dominantFault", printEIT_Acquisition_SupervisorDominantFaultType(o.dominantFault)),
        ("multipleFaults", printB(o.multipleFaults))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorFaultSummary_Payload(o: EIT_Acquisition_Supervisor.FaultSummary_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.FaultSummary_Payload""""),
        ("value", printEIT_Acquisition_SupervisorFaultSummary(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRecoveryFrame(o: EIT_Acquisition_Supervisor.RecoveryFrame): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.RecoveryFrame""""),
        ("dominantFault", printEIT_Acquisition_SupervisorDominantFaultType(o.dominantFault)),
        ("recoveryState", printEIT_Acquisition_SupervisorRecoveryStateType(o.recoveryState)),
        ("recoveryGate", printEIT_Acquisition_SupervisorRecoveryGateType(o.recoveryGate)),
        ("recoveryCause", printEIT_Acquisition_SupervisorRecoveryCauseType(o.recoveryCause)),
        ("effectiveFaultPresent", printB(o.effectiveFaultPresent)),
        ("effectiveMultipleFaults", printB(o.effectiveMultipleFaults))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRecoveryFrame_Payload(o: EIT_Acquisition_Supervisor.RecoveryFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.RecoveryFrame_Payload""""),
        ("value", printEIT_Acquisition_SupervisorRecoveryFrame(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorSessionFrame(o: EIT_Acquisition_Supervisor.SessionFrame): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.SessionFrame""""),
        ("sessionState", printEIT_Acquisition_SupervisorSessionStateType(o.sessionState)),
        ("startAdmitted", printB(o.startAdmitted)),
        ("stopAdmitted", printB(o.stopAdmitted))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorSessionFrame_Payload(o: EIT_Acquisition_Supervisor.SessionFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.SessionFrame_Payload""""),
        ("value", printEIT_Acquisition_SupervisorSessionFrame(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorCycleFrame(o: EIT_Acquisition_Supervisor.CycleFrame): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.CycleFrame""""),
        ("cycleState", printEIT_Acquisition_SupervisorCycleStateType(o.cycleState)),
        ("batchReady", printB(o.batchReady))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorCycleFrame_Payload(o: EIT_Acquisition_Supervisor.CycleFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.CycleFrame_Payload""""),
        ("value", printEIT_Acquisition_SupervisorCycleFrame(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageFrame(o: EIT_Acquisition_Supervisor.ImageFrame): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageFrame""""),
        ("imageState", printEIT_Acquisition_SupervisorImageStateType(o.imageState)),
        ("generateProposal", printB(o.generateProposal))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageFrame_Payload(o: EIT_Acquisition_Supervisor.ImageFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageFrame_Payload""""),
        ("value", printEIT_Acquisition_SupervisorImageFrame(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorDecisionFrame(o: EIT_Acquisition_Supervisor.DecisionFrame): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.DecisionFrame""""),
        ("selectedAction", printEIT_Acquisition_SupervisorSelectedActionType(o.selectedAction)),
        ("selectedCause", printEIT_Acquisition_SupervisorSelectedCauseType(o.selectedCause)),
        ("sessionState", printEIT_Acquisition_SupervisorSessionStateType(o.sessionState)),
        ("cycleState", printEIT_Acquisition_SupervisorCycleStateType(o.cycleState)),
        ("imageState", printEIT_Acquisition_SupervisorImageStateType(o.imageState)),
        ("recoveryState", printEIT_Acquisition_SupervisorRecoveryStateType(o.recoveryState)),
        ("imageAvailable", printB(o.imageAvailable)),
        ("effectiveFaultPresent", printB(o.effectiveFaultPresent)),
        ("dominantFault", printEIT_Acquisition_SupervisorDominantFaultType(o.dominantFault)),
        ("multipleFaults", printB(o.multipleFaults)),
        ("recoveryGate", printEIT_Acquisition_SupervisorRecoveryGateType(o.recoveryGate))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorDecisionFrame_Payload(o: EIT_Acquisition_Supervisor.DecisionFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.DecisionFrame_Payload""""),
        ("value", printEIT_Acquisition_SupervisorDecisionFrame(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorControlFrame(o: EIT_Acquisition_Supervisor.ControlFrame): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ControlFrame""""),
        ("acquisitionCommand", printEIT_Acquisition_SupervisorAcquisitionCommandType(o.acquisitionCommand)),
        ("imageCommand", printEIT_Acquisition_SupervisorImageCommandType(o.imageCommand))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorControlFrame_Payload(o: EIT_Acquisition_Supervisor.ControlFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ControlFrame_Payload""""),
        ("value", printEIT_Acquisition_SupervisorControlFrame(o.value))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorStatusFrame(o: EIT_Acquisition_Supervisor.StatusFrame): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.StatusFrame""""),
        ("publicMode", printEIT_Acquisition_SupervisorPublicModeType(o.publicMode)),
        ("selectedCause", printEIT_Acquisition_SupervisorSelectedCauseType(o.selectedCause)),
        ("sessionState", printEIT_Acquisition_SupervisorSessionStateType(o.sessionState)),
        ("cycleState", printEIT_Acquisition_SupervisorCycleStateType(o.cycleState)),
        ("imageState", printEIT_Acquisition_SupervisorImageStateType(o.imageState)),
        ("recoveryState", printEIT_Acquisition_SupervisorRecoveryStateType(o.recoveryState)),
        ("imageDisposition", printEIT_Acquisition_SupervisorImageDispositionType(o.imageDisposition)),
        ("dominantFault", printEIT_Acquisition_SupervisorDominantFaultType(o.dominantFault)),
        ("multipleFaults", printB(o.multipleFaults))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorStatusFrame_Payload(o: EIT_Acquisition_Supervisor.StatusFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.StatusFrame_Payload""""),
        ("value", printEIT_Acquisition_SupervisorStatusFrame(o.value))
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

    @pure def printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P => return printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS => return printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P""""),
        ("api_doctor_signal", printEIT_Acquisition_SupervisorDoctorSignalType(o.api_doctor_signal))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS""""),
        ("api_doctor_signal", printEIT_Acquisition_SupervisorDoctorSignalType(o.api_doctor_signal))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P => return printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS => return printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P""""),
        ("api_request_facts", printEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS""""),
        ("api_request_facts", printEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P => return printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS => return printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P""""),
        ("api_preparation_observation", printEIT_Acquisition_SupervisorPreparationObservationType(o.api_preparation_observation))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS""""),
        ("api_preparation_observation", printEIT_Acquisition_SupervisorPreparationObservationType(o.api_preparation_observation))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P => return printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS => return printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P""""),
        ("api_preparation_facts", printEIT_Acquisition_SupervisorPreparationFactsType(o.api_preparation_facts))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS""""),
        ("api_preparation_facts", printEIT_Acquisition_SupervisorPreparationFactsType(o.api_preparation_facts))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P => return printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS => return printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P""""),
        ("api_equipment_observation", printEIT_Acquisition_SupervisorEquipmentObservationType(o.api_equipment_observation))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS""""),
        ("api_equipment_observation", printEIT_Acquisition_SupervisorEquipmentObservationType(o.api_equipment_observation))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P => return printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS => return printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P""""),
        ("api_equipment_facts", printEIT_Acquisition_SupervisorEquipmentFactsType(o.api_equipment_facts))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS""""),
        ("api_equipment_facts", printEIT_Acquisition_SupervisorEquipmentFactsType(o.api_equipment_facts))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P => return printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS => return printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P""""),
        ("api_batch_signal", printEIT_Acquisition_SupervisorBatchSignalType(o.api_batch_signal))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS""""),
        ("api_batch_signal", printEIT_Acquisition_SupervisorBatchSignalType(o.api_batch_signal))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P => return printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS => return printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P""""),
        ("api_batch_facts", printEIT_Acquisition_SupervisorBatchFactsType(o.api_batch_facts))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS""""),
        ("api_batch_facts", printEIT_Acquisition_SupervisorBatchFactsType(o.api_batch_facts))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P => return printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS => return printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P""""),
        ("api_image_feedback", printEIT_Acquisition_SupervisorImageFeedbackType(o.api_image_feedback))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS""""),
        ("api_image_feedback", printEIT_Acquisition_SupervisorImageFeedbackType(o.api_image_feedback))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P => return printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS => return printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P""""),
        ("api_image_result_facts", printEIT_Acquisition_SupervisorImageResultFactsType(o.api_image_result_facts))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS""""),
        ("api_image_result_facts", printEIT_Acquisition_SupervisorImageResultFactsType(o.api_image_result_facts))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P => return printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS => return printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P""""),
        ("api_batch_facts", printEIT_Acquisition_SupervisorBatchFactsType(o.api_batch_facts)),
        ("api_equipment_facts", printEIT_Acquisition_SupervisorEquipmentFactsType(o.api_equipment_facts)),
        ("api_image_result_facts", printEIT_Acquisition_SupervisorImageResultFactsType(o.api_image_result_facts)),
        ("api_preparation_facts", printEIT_Acquisition_SupervisorPreparationFactsType(o.api_preparation_facts)),
        ("api_request_facts", printEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS""""),
        ("api_batch_facts", printEIT_Acquisition_SupervisorBatchFactsType(o.api_batch_facts)),
        ("api_equipment_facts", printEIT_Acquisition_SupervisorEquipmentFactsType(o.api_equipment_facts)),
        ("api_image_result_facts", printEIT_Acquisition_SupervisorImageResultFactsType(o.api_image_result_facts)),
        ("api_preparation_facts", printEIT_Acquisition_SupervisorPreparationFactsType(o.api_preparation_facts)),
        ("api_request_facts", printEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P => return printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS => return printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P""""),
        ("api_fault_summary", printEIT_Acquisition_SupervisorFaultSummary(o.api_fault_summary))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS""""),
        ("api_fault_summary", printEIT_Acquisition_SupervisorFaultSummary(o.api_fault_summary))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P => return printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS => return printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P""""),
        ("api_recovery_frame", printEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)),
        ("api_request_facts", printEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts)),
        ("api_start_feasibility", printEIT_Acquisition_SupervisorStartFeasibilityType(o.api_start_feasibility))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS""""),
        ("api_recovery_frame", printEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)),
        ("api_request_facts", printEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts)),
        ("api_start_feasibility", printEIT_Acquisition_SupervisorStartFeasibilityType(o.api_start_feasibility))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P => return printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS => return printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P""""),
        ("api_session_frame", printEIT_Acquisition_SupervisorSessionFrame(o.api_session_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS""""),
        ("api_session_frame", printEIT_Acquisition_SupervisorSessionFrame(o.api_session_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P => return printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS => return printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P""""),
        ("api_batch_facts", printEIT_Acquisition_SupervisorBatchFactsType(o.api_batch_facts)),
        ("api_equipment_facts", printEIT_Acquisition_SupervisorEquipmentFactsType(o.api_equipment_facts)),
        ("api_recovery_frame", printEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS""""),
        ("api_batch_facts", printEIT_Acquisition_SupervisorBatchFactsType(o.api_batch_facts)),
        ("api_equipment_facts", printEIT_Acquisition_SupervisorEquipmentFactsType(o.api_equipment_facts)),
        ("api_recovery_frame", printEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P => return printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS => return printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P""""),
        ("api_cycle_frame", printEIT_Acquisition_SupervisorCycleFrame(o.api_cycle_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS""""),
        ("api_cycle_frame", printEIT_Acquisition_SupervisorCycleFrame(o.api_cycle_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P => return printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS => return printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P""""),
        ("api_batch_facts", printEIT_Acquisition_SupervisorBatchFactsType(o.api_batch_facts)),
        ("api_image_result_facts", printEIT_Acquisition_SupervisorImageResultFactsType(o.api_image_result_facts)),
        ("api_recovery_frame", printEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)),
        ("api_request_facts", printEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS""""),
        ("api_batch_facts", printEIT_Acquisition_SupervisorBatchFactsType(o.api_batch_facts)),
        ("api_image_result_facts", printEIT_Acquisition_SupervisorImageResultFactsType(o.api_image_result_facts)),
        ("api_recovery_frame", printEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)),
        ("api_request_facts", printEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P => return printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS => return printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P""""),
        ("api_image_frame", printEIT_Acquisition_SupervisorImageFrame(o.api_image_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS""""),
        ("api_image_frame", printEIT_Acquisition_SupervisorImageFrame(o.api_image_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P => return printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS => return printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P""""),
        ("api_fault_summary", printEIT_Acquisition_SupervisorFaultSummary(o.api_fault_summary)),
        ("api_recovery_event", printEIT_Acquisition_SupervisorRecoveryEventType(o.api_recovery_event))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS""""),
        ("api_fault_summary", printEIT_Acquisition_SupervisorFaultSummary(o.api_fault_summary)),
        ("api_recovery_event", printEIT_Acquisition_SupervisorRecoveryEventType(o.api_recovery_event))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P => return printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS => return printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P""""),
        ("api_recovery_frame", printEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS""""),
        ("api_recovery_frame", printEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P => return printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS => return printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P""""),
        ("api_equipment_facts", printEIT_Acquisition_SupervisorEquipmentFactsType(o.api_equipment_facts)),
        ("api_preparation_facts", printEIT_Acquisition_SupervisorPreparationFactsType(o.api_preparation_facts)),
        ("api_recovery_frame", printEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)),
        ("api_request_facts", printEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS""""),
        ("api_equipment_facts", printEIT_Acquisition_SupervisorEquipmentFactsType(o.api_equipment_facts)),
        ("api_preparation_facts", printEIT_Acquisition_SupervisorPreparationFactsType(o.api_preparation_facts)),
        ("api_recovery_frame", printEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)),
        ("api_request_facts", printEIT_Acquisition_SupervisorRequestFactsRecord(o.api_request_facts))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P => return printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS => return printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P""""),
        ("api_start_feasibility", printEIT_Acquisition_SupervisorStartFeasibilityType(o.api_start_feasibility))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS""""),
        ("api_start_feasibility", printEIT_Acquisition_SupervisorStartFeasibilityType(o.api_start_feasibility))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P => return printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS => return printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P""""),
        ("api_cycle_frame", printEIT_Acquisition_SupervisorCycleFrame(o.api_cycle_frame)),
        ("api_recovery_frame", printEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)),
        ("api_session_frame", printEIT_Acquisition_SupervisorSessionFrame(o.api_session_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS""""),
        ("api_cycle_frame", printEIT_Acquisition_SupervisorCycleFrame(o.api_cycle_frame)),
        ("api_recovery_frame", printEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)),
        ("api_session_frame", printEIT_Acquisition_SupervisorSessionFrame(o.api_session_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P => return printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS => return printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P""""),
        ("api_collection_proposal", printEIT_Acquisition_SupervisorProposalType(o.api_collection_proposal))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS""""),
        ("api_collection_proposal", printEIT_Acquisition_SupervisorProposalType(o.api_collection_proposal))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P => return printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS => return printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P""""),
        ("api_image_frame", printEIT_Acquisition_SupervisorImageFrame(o.api_image_frame)),
        ("api_recovery_frame", printEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)),
        ("api_session_frame", printEIT_Acquisition_SupervisorSessionFrame(o.api_session_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS""""),
        ("api_image_frame", printEIT_Acquisition_SupervisorImageFrame(o.api_image_frame)),
        ("api_recovery_frame", printEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)),
        ("api_session_frame", printEIT_Acquisition_SupervisorSessionFrame(o.api_session_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P => return printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS => return printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P""""),
        ("api_release_proposal", printEIT_Acquisition_SupervisorProposalType(o.api_release_proposal))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS""""),
        ("api_release_proposal", printEIT_Acquisition_SupervisorProposalType(o.api_release_proposal))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P => return printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS => return printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P""""),
        ("api_collection_proposal", printEIT_Acquisition_SupervisorProposalType(o.api_collection_proposal)),
        ("api_cycle_frame", printEIT_Acquisition_SupervisorCycleFrame(o.api_cycle_frame)),
        ("api_image_frame", printEIT_Acquisition_SupervisorImageFrame(o.api_image_frame)),
        ("api_recovery_frame", printEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)),
        ("api_release_proposal", printEIT_Acquisition_SupervisorProposalType(o.api_release_proposal)),
        ("api_session_frame", printEIT_Acquisition_SupervisorSessionFrame(o.api_session_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS""""),
        ("api_collection_proposal", printEIT_Acquisition_SupervisorProposalType(o.api_collection_proposal)),
        ("api_cycle_frame", printEIT_Acquisition_SupervisorCycleFrame(o.api_cycle_frame)),
        ("api_image_frame", printEIT_Acquisition_SupervisorImageFrame(o.api_image_frame)),
        ("api_recovery_frame", printEIT_Acquisition_SupervisorRecoveryFrame(o.api_recovery_frame)),
        ("api_release_proposal", printEIT_Acquisition_SupervisorProposalType(o.api_release_proposal)),
        ("api_session_frame", printEIT_Acquisition_SupervisorSessionFrame(o.api_session_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P => return printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS => return printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P""""),
        ("api_decision_frame", printEIT_Acquisition_SupervisorDecisionFrame(o.api_decision_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS""""),
        ("api_decision_frame", printEIT_Acquisition_SupervisorDecisionFrame(o.api_decision_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P => return printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS => return printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P""""),
        ("api_decision_frame", printEIT_Acquisition_SupervisorDecisionFrame(o.api_decision_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS""""),
        ("api_decision_frame", printEIT_Acquisition_SupervisorDecisionFrame(o.api_decision_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container): ST = {
      o match {
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P => return printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS => return printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(o)
      }
    }

    @pure def printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P""""),
        ("api_control_frame", printEIT_Acquisition_SupervisorControlFrame(o.api_control_frame)),
        ("api_status_frame", printEIT_Acquisition_SupervisorStatusFrame(o.api_status_frame))
      ))
    }

    @pure def printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS""""),
        ("api_control_frame", printEIT_Acquisition_SupervisorControlFrame(o.api_control_frame)),
        ("api_status_frame", printEIT_Acquisition_SupervisorStatusFrame(o.api_status_frame))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_doctor_request_qualification_postInit => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_doctor_request_qualification_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_doctor_request_qualification_preCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_doctor_request_qualification_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_doctor_request_qualification_postCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_doctor_request_qualification_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_preparation_assessment_postInit => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_preparation_assessment_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_preparation_assessment_preCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_preparation_assessment_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_preparation_assessment_postCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_preparation_assessment_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_equipment_assessment_postInit => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_equipment_assessment_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_equipment_assessment_preCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_equipment_assessment_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_equipment_assessment_postCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_equipment_assessment_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_batch_assessment_postInit => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_batch_assessment_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_batch_assessment_preCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_batch_assessment_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_batch_assessment_postCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_batch_assessment_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_result_assessment_postInit => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_result_assessment_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_result_assessment_preCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_result_assessment_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_result_assessment_postCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_result_assessment_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_fault_composition_postInit => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_fault_composition_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_fault_composition_preCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_fault_composition_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_fault_composition_postCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_fault_composition_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_session_control_postInit => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_session_control_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_session_control_preCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_session_control_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_session_control_postCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_session_control_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_acquisition_cycle_control_postInit => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_acquisition_cycle_control_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_acquisition_cycle_control_preCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_acquisition_cycle_control_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_acquisition_cycle_control_postCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_acquisition_cycle_control_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_availability_control_postInit => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_availability_control_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_availability_control_preCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_availability_control_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_availability_control_postCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_availability_control_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_recovery_control_postInit => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_recovery_control_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_recovery_control_preCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_recovery_control_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_recovery_control_postCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_recovery_control_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_start_feasibility_postInit => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_start_feasibility_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_start_feasibility_preCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_start_feasibility_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_start_feasibility_postCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_start_feasibility_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_collection_feasibility_postInit => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_collection_feasibility_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_collection_feasibility_preCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_collection_feasibility_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_collection_feasibility_postCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_collection_feasibility_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_release_feasibility_postInit => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_release_feasibility_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_release_feasibility_preCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_release_feasibility_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_release_feasibility_postCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_image_release_feasibility_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_supervisory_arbitration_postInit => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_supervisory_arbitration_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_supervisory_arbitration_preCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_supervisory_arbitration_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_supervisory_arbitration_postCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_supervisory_arbitration_postCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_publication_composition_postInit => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_publication_composition_postInit"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_publication_composition_preCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_publication_composition_preCompute"
        case runtimemonitor.ObservationKind.EITAcquisitionSupervisorSystem_Instance_acquisition_process_publication_composition_postCompute => "EITAcquisitionSupervisorSystem_Instance_acquisition_process_publication_composition_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P => return printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS => return printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P => return printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS => return printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P => return printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P => return printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS => return printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS => return printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P => return printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P => return printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS => return printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS => return printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P => return printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS => return printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P => return printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS => return printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P => return printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS => return printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P => return printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS => return printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P => return printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS => return printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P => return printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS => return printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P => return printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS => return printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P => return printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS => return printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P => return printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS => return printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P => return printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS => return printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P => return printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS => return printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P => return printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P => return printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS => return printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS => return printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P => return printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS => return printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P => return printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P => return printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS => return printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS => return printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P => return printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P => return printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS => return printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS => return printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P => return printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS => return printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P => return printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS => return printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P => return printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS => return printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P => return printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS => return printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P => return printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS => return printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P => return printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS => return printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(o)
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
        case o: EIT_Acquisition_Supervisor.Proposal_Payload => return printEIT_Acquisition_SupervisorProposal_Payload(o)
        case o: EIT_Acquisition_Supervisor.ImageState_Payload => return printEIT_Acquisition_SupervisorImageState_Payload(o)
        case o: EIT_Acquisition_Supervisor.CycleState_Payload => return printEIT_Acquisition_SupervisorCycleState_Payload(o)
        case o: EIT_Acquisition_Supervisor.BatchFacts_Payload => return printEIT_Acquisition_SupervisorBatchFacts_Payload(o)
        case o: EIT_Acquisition_Supervisor.PublicMode_Payload => return printEIT_Acquisition_SupervisorPublicMode_Payload(o)
        case o: EIT_Acquisition_Supervisor.CycleFrame_Payload => return printEIT_Acquisition_SupervisorCycleFrame_Payload(o)
        case o: EIT_Acquisition_Supervisor.ImageFrame_Payload => return printEIT_Acquisition_SupervisorImageFrame_Payload(o)
        case o: EIT_Acquisition_Supervisor.BatchSignal_Payload => return printEIT_Acquisition_SupervisorBatchSignal_Payload(o)
        case o: EIT_Acquisition_Supervisor.StatusFrame_Payload => return printEIT_Acquisition_SupervisorStatusFrame_Payload(o)
        case o: EIT_Acquisition_Supervisor.RecoveryGate_Payload => return printEIT_Acquisition_SupervisorRecoveryGate_Payload(o)
        case o: EIT_Acquisition_Supervisor.SessionState_Payload => return printEIT_Acquisition_SupervisorSessionState_Payload(o)
        case o: EIT_Acquisition_Supervisor.ImageCommand_Payload => return printEIT_Acquisition_SupervisorImageCommand_Payload(o)
        case o: EIT_Acquisition_Supervisor.RequestClass_Payload => return printEIT_Acquisition_SupervisorRequestClass_Payload(o)
        case o: EIT_Acquisition_Supervisor.DoctorSignal_Payload => return printEIT_Acquisition_SupervisorDoctorSignal_Payload(o)
        case o: EIT_Acquisition_Supervisor.SessionFrame_Payload => return printEIT_Acquisition_SupervisorSessionFrame_Payload(o)
        case o: EIT_Acquisition_Supervisor.FaultSummary_Payload => return printEIT_Acquisition_SupervisorFaultSummary_Payload(o)
        case o: EIT_Acquisition_Supervisor.ControlFrame_Payload => return printEIT_Acquisition_SupervisorControlFrame_Payload(o)
        case o: EIT_Acquisition_Supervisor.RecoveryState_Payload => return printEIT_Acquisition_SupervisorRecoveryState_Payload(o)
        case o: EIT_Acquisition_Supervisor.RecoveryEvent_Payload => return printEIT_Acquisition_SupervisorRecoveryEvent_Payload(o)
        case o: EIT_Acquisition_Supervisor.ImageFeedback_Payload => return printEIT_Acquisition_SupervisorImageFeedback_Payload(o)
        case o: EIT_Acquisition_Supervisor.RecoveryCause_Payload => return printEIT_Acquisition_SupervisorRecoveryCause_Payload(o)
        case o: EIT_Acquisition_Supervisor.SelectedCause_Payload => return printEIT_Acquisition_SupervisorSelectedCause_Payload(o)
        case o: EIT_Acquisition_Supervisor.DominantFault_Payload => return printEIT_Acquisition_SupervisorDominantFault_Payload(o)
        case o: EIT_Acquisition_Supervisor.RecoveryFrame_Payload => return printEIT_Acquisition_SupervisorRecoveryFrame_Payload(o)
        case o: EIT_Acquisition_Supervisor.DecisionFrame_Payload => return printEIT_Acquisition_SupervisorDecisionFrame_Payload(o)
        case o: EIT_Acquisition_Supervisor.EquipmentFacts_Payload => return printEIT_Acquisition_SupervisorEquipmentFacts_Payload(o)
        case o: EIT_Acquisition_Supervisor.SelectedAction_Payload => return printEIT_Acquisition_SupervisorSelectedAction_Payload(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibility_Payload => return printEIT_Acquisition_SupervisorStartFeasibility_Payload(o)
        case o: EIT_Acquisition_Supervisor.ImageDisposition_Payload => return printEIT_Acquisition_SupervisorImageDisposition_Payload(o)
        case o: EIT_Acquisition_Supervisor.PreparationFacts_Payload => return printEIT_Acquisition_SupervisorPreparationFacts_Payload(o)
        case o: EIT_Acquisition_Supervisor.ImageResultFacts_Payload => return printEIT_Acquisition_SupervisorImageResultFacts_Payload(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCommand_Payload => return printEIT_Acquisition_SupervisorAcquisitionCommand_Payload(o)
        case o: EIT_Acquisition_Supervisor.RequestFactsRecord_Payload => return printEIT_Acquisition_SupervisorRequestFactsRecord_Payload(o)
        case o: EIT_Acquisition_Supervisor.EquipmentObservation_Payload => return printEIT_Acquisition_SupervisorEquipmentObservation_Payload(o)
        case o: EIT_Acquisition_Supervisor.PreparationObservation_Payload => return printEIT_Acquisition_SupervisorPreparationObservation_Payload(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P => return printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS => return printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P => return printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS => return printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P => return printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P => return printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS => return printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS => return printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P => return printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P => return printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS => return printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS => return printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P => return printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS => return printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P => return printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS => return printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P => return printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS => return printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P => return printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS => return printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P => return printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS => return printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P => return printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS => return printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P => return printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS => return printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P => return printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS => return printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P => return printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS => return printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P => return printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS => return printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P => return printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS => return printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P => return printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P => return printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS => return printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS => return printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P => return printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS => return printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P => return printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P => return printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS => return printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS => return printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P => return printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P => return printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS => return printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS => return printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P => return printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS => return printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P => return printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS => return printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P => return printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS => return printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P => return printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS => return printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P => return printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS => return printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P => return printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(o)
        case o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS => return printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(o)
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

    def parseEIT_Acquisition_SupervisorDoctorSignalType(): EIT_Acquisition_Supervisor.DoctorSignal.Type = {
      val r = parseEIT_Acquisition_SupervisorDoctorSignalT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorDoctorSignalT(typeParsed: B): EIT_Acquisition_Supervisor.DoctorSignal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.DoctorSignal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.DoctorSignal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.DoctorSignal.")
          return EIT_Acquisition_Supervisor.DoctorSignal.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorDoctorSignal_Payload(): EIT_Acquisition_Supervisor.DoctorSignal_Payload = {
      val r = parseEIT_Acquisition_SupervisorDoctorSignal_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorDoctorSignal_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.DoctorSignal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.DoctorSignal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorDoctorSignalType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.DoctorSignal_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorRequestClassType(): EIT_Acquisition_Supervisor.RequestClass.Type = {
      val r = parseEIT_Acquisition_SupervisorRequestClassT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRequestClassT(typeParsed: B): EIT_Acquisition_Supervisor.RequestClass.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RequestClass")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.RequestClass.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.RequestClass.")
          return EIT_Acquisition_Supervisor.RequestClass.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorRequestClass_Payload(): EIT_Acquisition_Supervisor.RequestClass_Payload = {
      val r = parseEIT_Acquisition_SupervisorRequestClass_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRequestClass_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.RequestClass_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RequestClass_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorRequestClassType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.RequestClass_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorPreparationObservationType(): EIT_Acquisition_Supervisor.PreparationObservation.Type = {
      val r = parseEIT_Acquisition_SupervisorPreparationObservationT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorPreparationObservationT(typeParsed: B): EIT_Acquisition_Supervisor.PreparationObservation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.PreparationObservation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.PreparationObservation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.PreparationObservation.")
          return EIT_Acquisition_Supervisor.PreparationObservation.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorPreparationObservation_Payload(): EIT_Acquisition_Supervisor.PreparationObservation_Payload = {
      val r = parseEIT_Acquisition_SupervisorPreparationObservation_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorPreparationObservation_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.PreparationObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.PreparationObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorPreparationObservationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.PreparationObservation_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorPreparationFactsType(): EIT_Acquisition_Supervisor.PreparationFacts.Type = {
      val r = parseEIT_Acquisition_SupervisorPreparationFactsT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorPreparationFactsT(typeParsed: B): EIT_Acquisition_Supervisor.PreparationFacts.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.PreparationFacts")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.PreparationFacts.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.PreparationFacts.")
          return EIT_Acquisition_Supervisor.PreparationFacts.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorPreparationFacts_Payload(): EIT_Acquisition_Supervisor.PreparationFacts_Payload = {
      val r = parseEIT_Acquisition_SupervisorPreparationFacts_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorPreparationFacts_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.PreparationFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.PreparationFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorPreparationFactsType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.PreparationFacts_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorEquipmentObservationType(): EIT_Acquisition_Supervisor.EquipmentObservation.Type = {
      val r = parseEIT_Acquisition_SupervisorEquipmentObservationT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorEquipmentObservationT(typeParsed: B): EIT_Acquisition_Supervisor.EquipmentObservation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.EquipmentObservation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.EquipmentObservation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.EquipmentObservation.")
          return EIT_Acquisition_Supervisor.EquipmentObservation.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorEquipmentObservation_Payload(): EIT_Acquisition_Supervisor.EquipmentObservation_Payload = {
      val r = parseEIT_Acquisition_SupervisorEquipmentObservation_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorEquipmentObservation_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.EquipmentObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.EquipmentObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorEquipmentObservationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.EquipmentObservation_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorEquipmentFactsType(): EIT_Acquisition_Supervisor.EquipmentFacts.Type = {
      val r = parseEIT_Acquisition_SupervisorEquipmentFactsT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorEquipmentFactsT(typeParsed: B): EIT_Acquisition_Supervisor.EquipmentFacts.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.EquipmentFacts")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.EquipmentFacts.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.EquipmentFacts.")
          return EIT_Acquisition_Supervisor.EquipmentFacts.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorEquipmentFacts_Payload(): EIT_Acquisition_Supervisor.EquipmentFacts_Payload = {
      val r = parseEIT_Acquisition_SupervisorEquipmentFacts_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorEquipmentFacts_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.EquipmentFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.EquipmentFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorEquipmentFactsType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.EquipmentFacts_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorBatchSignalType(): EIT_Acquisition_Supervisor.BatchSignal.Type = {
      val r = parseEIT_Acquisition_SupervisorBatchSignalT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorBatchSignalT(typeParsed: B): EIT_Acquisition_Supervisor.BatchSignal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.BatchSignal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.BatchSignal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.BatchSignal.")
          return EIT_Acquisition_Supervisor.BatchSignal.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorBatchSignal_Payload(): EIT_Acquisition_Supervisor.BatchSignal_Payload = {
      val r = parseEIT_Acquisition_SupervisorBatchSignal_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorBatchSignal_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.BatchSignal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.BatchSignal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorBatchSignalType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.BatchSignal_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorBatchFactsType(): EIT_Acquisition_Supervisor.BatchFacts.Type = {
      val r = parseEIT_Acquisition_SupervisorBatchFactsT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorBatchFactsT(typeParsed: B): EIT_Acquisition_Supervisor.BatchFacts.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.BatchFacts")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.BatchFacts.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.BatchFacts.")
          return EIT_Acquisition_Supervisor.BatchFacts.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorBatchFacts_Payload(): EIT_Acquisition_Supervisor.BatchFacts_Payload = {
      val r = parseEIT_Acquisition_SupervisorBatchFacts_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorBatchFacts_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.BatchFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.BatchFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorBatchFactsType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.BatchFacts_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorImageFeedbackType(): EIT_Acquisition_Supervisor.ImageFeedback.Type = {
      val r = parseEIT_Acquisition_SupervisorImageFeedbackT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageFeedbackT(typeParsed: B): EIT_Acquisition_Supervisor.ImageFeedback.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageFeedback")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.ImageFeedback.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.ImageFeedback.")
          return EIT_Acquisition_Supervisor.ImageFeedback.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorImageFeedback_Payload(): EIT_Acquisition_Supervisor.ImageFeedback_Payload = {
      val r = parseEIT_Acquisition_SupervisorImageFeedback_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageFeedback_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.ImageFeedback_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageFeedback_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorImageFeedbackType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageFeedback_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorImageResultFactsType(): EIT_Acquisition_Supervisor.ImageResultFacts.Type = {
      val r = parseEIT_Acquisition_SupervisorImageResultFactsT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageResultFactsT(typeParsed: B): EIT_Acquisition_Supervisor.ImageResultFacts.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageResultFacts")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.ImageResultFacts.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.ImageResultFacts.")
          return EIT_Acquisition_Supervisor.ImageResultFacts.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorImageResultFacts_Payload(): EIT_Acquisition_Supervisor.ImageResultFacts_Payload = {
      val r = parseEIT_Acquisition_SupervisorImageResultFacts_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageResultFacts_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.ImageResultFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageResultFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorImageResultFactsType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageResultFacts_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorDominantFaultType(): EIT_Acquisition_Supervisor.DominantFault.Type = {
      val r = parseEIT_Acquisition_SupervisorDominantFaultT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorDominantFaultT(typeParsed: B): EIT_Acquisition_Supervisor.DominantFault.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.DominantFault")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.DominantFault.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.DominantFault.")
          return EIT_Acquisition_Supervisor.DominantFault.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorDominantFault_Payload(): EIT_Acquisition_Supervisor.DominantFault_Payload = {
      val r = parseEIT_Acquisition_SupervisorDominantFault_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorDominantFault_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.DominantFault_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.DominantFault_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorDominantFaultType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.DominantFault_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorRecoveryStateType(): EIT_Acquisition_Supervisor.RecoveryState.Type = {
      val r = parseEIT_Acquisition_SupervisorRecoveryStateT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRecoveryStateT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RecoveryState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.RecoveryState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.RecoveryState.")
          return EIT_Acquisition_Supervisor.RecoveryState.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorRecoveryState_Payload(): EIT_Acquisition_Supervisor.RecoveryState_Payload = {
      val r = parseEIT_Acquisition_SupervisorRecoveryState_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRecoveryState_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RecoveryState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorRecoveryStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.RecoveryState_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorRecoveryGateType(): EIT_Acquisition_Supervisor.RecoveryGate.Type = {
      val r = parseEIT_Acquisition_SupervisorRecoveryGateT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRecoveryGateT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryGate.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RecoveryGate")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.RecoveryGate.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.RecoveryGate.")
          return EIT_Acquisition_Supervisor.RecoveryGate.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorRecoveryGate_Payload(): EIT_Acquisition_Supervisor.RecoveryGate_Payload = {
      val r = parseEIT_Acquisition_SupervisorRecoveryGate_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRecoveryGate_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryGate_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RecoveryGate_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorRecoveryGateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.RecoveryGate_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorRecoveryCauseType(): EIT_Acquisition_Supervisor.RecoveryCause.Type = {
      val r = parseEIT_Acquisition_SupervisorRecoveryCauseT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRecoveryCauseT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RecoveryCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.RecoveryCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.RecoveryCause.")
          return EIT_Acquisition_Supervisor.RecoveryCause.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorRecoveryCause_Payload(): EIT_Acquisition_Supervisor.RecoveryCause_Payload = {
      val r = parseEIT_Acquisition_SupervisorRecoveryCause_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRecoveryCause_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RecoveryCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorRecoveryCauseType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.RecoveryCause_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorStartFeasibilityType(): EIT_Acquisition_Supervisor.StartFeasibility.Type = {
      val r = parseEIT_Acquisition_SupervisorStartFeasibilityT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorStartFeasibilityT(typeParsed: B): EIT_Acquisition_Supervisor.StartFeasibility.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.StartFeasibility")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.StartFeasibility.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.StartFeasibility.")
          return EIT_Acquisition_Supervisor.StartFeasibility.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorStartFeasibility_Payload(): EIT_Acquisition_Supervisor.StartFeasibility_Payload = {
      val r = parseEIT_Acquisition_SupervisorStartFeasibility_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorStartFeasibility_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.StartFeasibility_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.StartFeasibility_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorStartFeasibilityType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.StartFeasibility_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorSessionStateType(): EIT_Acquisition_Supervisor.SessionState.Type = {
      val r = parseEIT_Acquisition_SupervisorSessionStateT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorSessionStateT(typeParsed: B): EIT_Acquisition_Supervisor.SessionState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.SessionState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.SessionState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.SessionState.")
          return EIT_Acquisition_Supervisor.SessionState.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorSessionState_Payload(): EIT_Acquisition_Supervisor.SessionState_Payload = {
      val r = parseEIT_Acquisition_SupervisorSessionState_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorSessionState_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.SessionState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.SessionState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorSessionStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.SessionState_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorCycleStateType(): EIT_Acquisition_Supervisor.CycleState.Type = {
      val r = parseEIT_Acquisition_SupervisorCycleStateT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorCycleStateT(typeParsed: B): EIT_Acquisition_Supervisor.CycleState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.CycleState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.CycleState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.CycleState.")
          return EIT_Acquisition_Supervisor.CycleState.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorCycleState_Payload(): EIT_Acquisition_Supervisor.CycleState_Payload = {
      val r = parseEIT_Acquisition_SupervisorCycleState_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorCycleState_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.CycleState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.CycleState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorCycleStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.CycleState_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorImageStateType(): EIT_Acquisition_Supervisor.ImageState.Type = {
      val r = parseEIT_Acquisition_SupervisorImageStateT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageStateT(typeParsed: B): EIT_Acquisition_Supervisor.ImageState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.ImageState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.ImageState.")
          return EIT_Acquisition_Supervisor.ImageState.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorImageState_Payload(): EIT_Acquisition_Supervisor.ImageState_Payload = {
      val r = parseEIT_Acquisition_SupervisorImageState_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageState_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.ImageState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorImageStateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageState_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorRecoveryEventType(): EIT_Acquisition_Supervisor.RecoveryEvent.Type = {
      val r = parseEIT_Acquisition_SupervisorRecoveryEventT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRecoveryEventT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RecoveryEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.RecoveryEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.RecoveryEvent.")
          return EIT_Acquisition_Supervisor.RecoveryEvent.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorRecoveryEvent_Payload(): EIT_Acquisition_Supervisor.RecoveryEvent_Payload = {
      val r = parseEIT_Acquisition_SupervisorRecoveryEvent_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRecoveryEvent_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RecoveryEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorRecoveryEventType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.RecoveryEvent_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorProposalType(): EIT_Acquisition_Supervisor.Proposal.Type = {
      val r = parseEIT_Acquisition_SupervisorProposalT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorProposalT(typeParsed: B): EIT_Acquisition_Supervisor.Proposal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.Proposal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.Proposal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.Proposal.")
          return EIT_Acquisition_Supervisor.Proposal.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorProposal_Payload(): EIT_Acquisition_Supervisor.Proposal_Payload = {
      val r = parseEIT_Acquisition_SupervisorProposal_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorProposal_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.Proposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.Proposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorProposalType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.Proposal_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorSelectedActionType(): EIT_Acquisition_Supervisor.SelectedAction.Type = {
      val r = parseEIT_Acquisition_SupervisorSelectedActionT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorSelectedActionT(typeParsed: B): EIT_Acquisition_Supervisor.SelectedAction.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.SelectedAction")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.SelectedAction.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.SelectedAction.")
          return EIT_Acquisition_Supervisor.SelectedAction.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorSelectedAction_Payload(): EIT_Acquisition_Supervisor.SelectedAction_Payload = {
      val r = parseEIT_Acquisition_SupervisorSelectedAction_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorSelectedAction_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.SelectedAction_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.SelectedAction_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorSelectedActionType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.SelectedAction_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorSelectedCauseType(): EIT_Acquisition_Supervisor.SelectedCause.Type = {
      val r = parseEIT_Acquisition_SupervisorSelectedCauseT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorSelectedCauseT(typeParsed: B): EIT_Acquisition_Supervisor.SelectedCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.SelectedCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.SelectedCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.SelectedCause.")
          return EIT_Acquisition_Supervisor.SelectedCause.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorSelectedCause_Payload(): EIT_Acquisition_Supervisor.SelectedCause_Payload = {
      val r = parseEIT_Acquisition_SupervisorSelectedCause_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorSelectedCause_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.SelectedCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.SelectedCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorSelectedCauseType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.SelectedCause_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorAcquisitionCommandType(): EIT_Acquisition_Supervisor.AcquisitionCommand.Type = {
      val r = parseEIT_Acquisition_SupervisorAcquisitionCommandT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorAcquisitionCommandT(typeParsed: B): EIT_Acquisition_Supervisor.AcquisitionCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.AcquisitionCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.AcquisitionCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.AcquisitionCommand.")
          return EIT_Acquisition_Supervisor.AcquisitionCommand.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorAcquisitionCommand_Payload(): EIT_Acquisition_Supervisor.AcquisitionCommand_Payload = {
      val r = parseEIT_Acquisition_SupervisorAcquisitionCommand_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorAcquisitionCommand_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.AcquisitionCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.AcquisitionCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorAcquisitionCommandType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.AcquisitionCommand_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorImageCommandType(): EIT_Acquisition_Supervisor.ImageCommand.Type = {
      val r = parseEIT_Acquisition_SupervisorImageCommandT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageCommandT(typeParsed: B): EIT_Acquisition_Supervisor.ImageCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.ImageCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.ImageCommand.")
          return EIT_Acquisition_Supervisor.ImageCommand.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorImageCommand_Payload(): EIT_Acquisition_Supervisor.ImageCommand_Payload = {
      val r = parseEIT_Acquisition_SupervisorImageCommand_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageCommand_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.ImageCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorImageCommandType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageCommand_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorPublicModeType(): EIT_Acquisition_Supervisor.PublicMode.Type = {
      val r = parseEIT_Acquisition_SupervisorPublicModeT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorPublicModeT(typeParsed: B): EIT_Acquisition_Supervisor.PublicMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.PublicMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.PublicMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.PublicMode.")
          return EIT_Acquisition_Supervisor.PublicMode.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorPublicMode_Payload(): EIT_Acquisition_Supervisor.PublicMode_Payload = {
      val r = parseEIT_Acquisition_SupervisorPublicMode_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorPublicMode_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.PublicMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.PublicMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorPublicModeType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.PublicMode_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorImageDispositionType(): EIT_Acquisition_Supervisor.ImageDisposition.Type = {
      val r = parseEIT_Acquisition_SupervisorImageDispositionT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageDispositionT(typeParsed: B): EIT_Acquisition_Supervisor.ImageDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      EIT_Acquisition_Supervisor.ImageDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for EIT_Acquisition_Supervisor.ImageDisposition.")
          return EIT_Acquisition_Supervisor.ImageDisposition.byOrdinal(0).get
      }
    }

    def parseEIT_Acquisition_SupervisorImageDisposition_Payload(): EIT_Acquisition_Supervisor.ImageDisposition_Payload = {
      val r = parseEIT_Acquisition_SupervisorImageDisposition_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageDisposition_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.ImageDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorImageDispositionType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageDisposition_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorRequestFactsRecord(): EIT_Acquisition_Supervisor.RequestFactsRecord = {
      val r = parseEIT_Acquisition_SupervisorRequestFactsRecordT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRequestFactsRecordT(typeParsed: B): EIT_Acquisition_Supervisor.RequestFactsRecord = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RequestFactsRecord")
      }
      parser.parseObjectKey("requestClass")
      val requestClass = parseEIT_Acquisition_SupervisorRequestClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("requestFault")
      val requestFault = parser.parseB()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.RequestFactsRecord(requestClass, requestFault)
    }

    def parseEIT_Acquisition_SupervisorRequestFactsRecord_Payload(): EIT_Acquisition_Supervisor.RequestFactsRecord_Payload = {
      val r = parseEIT_Acquisition_SupervisorRequestFactsRecord_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRequestFactsRecord_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.RequestFactsRecord_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RequestFactsRecord_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorRequestFactsRecord()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.RequestFactsRecord_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorFaultSummary(): EIT_Acquisition_Supervisor.FaultSummary = {
      val r = parseEIT_Acquisition_SupervisorFaultSummaryT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorFaultSummaryT(typeParsed: B): EIT_Acquisition_Supervisor.FaultSummary = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.FaultSummary")
      }
      parser.parseObjectKey("faultPresent")
      val faultPresent = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("dominantFault")
      val dominantFault = parseEIT_Acquisition_SupervisorDominantFaultType()
      parser.parseObjectNext()
      parser.parseObjectKey("multipleFaults")
      val multipleFaults = parser.parseB()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.FaultSummary(faultPresent, dominantFault, multipleFaults)
    }

    def parseEIT_Acquisition_SupervisorFaultSummary_Payload(): EIT_Acquisition_Supervisor.FaultSummary_Payload = {
      val r = parseEIT_Acquisition_SupervisorFaultSummary_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorFaultSummary_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.FaultSummary_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.FaultSummary_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorFaultSummary()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.FaultSummary_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorRecoveryFrame(): EIT_Acquisition_Supervisor.RecoveryFrame = {
      val r = parseEIT_Acquisition_SupervisorRecoveryFrameT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRecoveryFrameT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryFrame = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RecoveryFrame")
      }
      parser.parseObjectKey("dominantFault")
      val dominantFault = parseEIT_Acquisition_SupervisorDominantFaultType()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryState")
      val recoveryState = parseEIT_Acquisition_SupervisorRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryGate")
      val recoveryGate = parseEIT_Acquisition_SupervisorRecoveryGateType()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryCause")
      val recoveryCause = parseEIT_Acquisition_SupervisorRecoveryCauseType()
      parser.parseObjectNext()
      parser.parseObjectKey("effectiveFaultPresent")
      val effectiveFaultPresent = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("effectiveMultipleFaults")
      val effectiveMultipleFaults = parser.parseB()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.RecoveryFrame(dominantFault, recoveryState, recoveryGate, recoveryCause, effectiveFaultPresent, effectiveMultipleFaults)
    }

    def parseEIT_Acquisition_SupervisorRecoveryFrame_Payload(): EIT_Acquisition_Supervisor.RecoveryFrame_Payload = {
      val r = parseEIT_Acquisition_SupervisorRecoveryFrame_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRecoveryFrame_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RecoveryFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.RecoveryFrame_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorSessionFrame(): EIT_Acquisition_Supervisor.SessionFrame = {
      val r = parseEIT_Acquisition_SupervisorSessionFrameT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorSessionFrameT(typeParsed: B): EIT_Acquisition_Supervisor.SessionFrame = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.SessionFrame")
      }
      parser.parseObjectKey("sessionState")
      val sessionState = parseEIT_Acquisition_SupervisorSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("startAdmitted")
      val startAdmitted = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("stopAdmitted")
      val stopAdmitted = parser.parseB()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.SessionFrame(sessionState, startAdmitted, stopAdmitted)
    }

    def parseEIT_Acquisition_SupervisorSessionFrame_Payload(): EIT_Acquisition_Supervisor.SessionFrame_Payload = {
      val r = parseEIT_Acquisition_SupervisorSessionFrame_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorSessionFrame_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.SessionFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.SessionFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorSessionFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.SessionFrame_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorCycleFrame(): EIT_Acquisition_Supervisor.CycleFrame = {
      val r = parseEIT_Acquisition_SupervisorCycleFrameT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorCycleFrameT(typeParsed: B): EIT_Acquisition_Supervisor.CycleFrame = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.CycleFrame")
      }
      parser.parseObjectKey("cycleState")
      val cycleState = parseEIT_Acquisition_SupervisorCycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("batchReady")
      val batchReady = parser.parseB()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.CycleFrame(cycleState, batchReady)
    }

    def parseEIT_Acquisition_SupervisorCycleFrame_Payload(): EIT_Acquisition_Supervisor.CycleFrame_Payload = {
      val r = parseEIT_Acquisition_SupervisorCycleFrame_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorCycleFrame_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.CycleFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.CycleFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorCycleFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.CycleFrame_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorImageFrame(): EIT_Acquisition_Supervisor.ImageFrame = {
      val r = parseEIT_Acquisition_SupervisorImageFrameT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageFrameT(typeParsed: B): EIT_Acquisition_Supervisor.ImageFrame = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageFrame")
      }
      parser.parseObjectKey("imageState")
      val imageState = parseEIT_Acquisition_SupervisorImageStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("generateProposal")
      val generateProposal = parser.parseB()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageFrame(imageState, generateProposal)
    }

    def parseEIT_Acquisition_SupervisorImageFrame_Payload(): EIT_Acquisition_Supervisor.ImageFrame_Payload = {
      val r = parseEIT_Acquisition_SupervisorImageFrame_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageFrame_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.ImageFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorImageFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageFrame_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorDecisionFrame(): EIT_Acquisition_Supervisor.DecisionFrame = {
      val r = parseEIT_Acquisition_SupervisorDecisionFrameT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorDecisionFrameT(typeParsed: B): EIT_Acquisition_Supervisor.DecisionFrame = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.DecisionFrame")
      }
      parser.parseObjectKey("selectedAction")
      val selectedAction = parseEIT_Acquisition_SupervisorSelectedActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("selectedCause")
      val selectedCause = parseEIT_Acquisition_SupervisorSelectedCauseType()
      parser.parseObjectNext()
      parser.parseObjectKey("sessionState")
      val sessionState = parseEIT_Acquisition_SupervisorSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("cycleState")
      val cycleState = parseEIT_Acquisition_SupervisorCycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("imageState")
      val imageState = parseEIT_Acquisition_SupervisorImageStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryState")
      val recoveryState = parseEIT_Acquisition_SupervisorRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("imageAvailable")
      val imageAvailable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("effectiveFaultPresent")
      val effectiveFaultPresent = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("dominantFault")
      val dominantFault = parseEIT_Acquisition_SupervisorDominantFaultType()
      parser.parseObjectNext()
      parser.parseObjectKey("multipleFaults")
      val multipleFaults = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryGate")
      val recoveryGate = parseEIT_Acquisition_SupervisorRecoveryGateType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.DecisionFrame(selectedAction, selectedCause, sessionState, cycleState, imageState, recoveryState, imageAvailable, effectiveFaultPresent, dominantFault, multipleFaults, recoveryGate)
    }

    def parseEIT_Acquisition_SupervisorDecisionFrame_Payload(): EIT_Acquisition_Supervisor.DecisionFrame_Payload = {
      val r = parseEIT_Acquisition_SupervisorDecisionFrame_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorDecisionFrame_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.DecisionFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.DecisionFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorDecisionFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.DecisionFrame_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorControlFrame(): EIT_Acquisition_Supervisor.ControlFrame = {
      val r = parseEIT_Acquisition_SupervisorControlFrameT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorControlFrameT(typeParsed: B): EIT_Acquisition_Supervisor.ControlFrame = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ControlFrame")
      }
      parser.parseObjectKey("acquisitionCommand")
      val acquisitionCommand = parseEIT_Acquisition_SupervisorAcquisitionCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("imageCommand")
      val imageCommand = parseEIT_Acquisition_SupervisorImageCommandType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ControlFrame(acquisitionCommand, imageCommand)
    }

    def parseEIT_Acquisition_SupervisorControlFrame_Payload(): EIT_Acquisition_Supervisor.ControlFrame_Payload = {
      val r = parseEIT_Acquisition_SupervisorControlFrame_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorControlFrame_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.ControlFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ControlFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorControlFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ControlFrame_Payload(value)
    }

    def parseEIT_Acquisition_SupervisorStatusFrame(): EIT_Acquisition_Supervisor.StatusFrame = {
      val r = parseEIT_Acquisition_SupervisorStatusFrameT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorStatusFrameT(typeParsed: B): EIT_Acquisition_Supervisor.StatusFrame = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.StatusFrame")
      }
      parser.parseObjectKey("publicMode")
      val publicMode = parseEIT_Acquisition_SupervisorPublicModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("selectedCause")
      val selectedCause = parseEIT_Acquisition_SupervisorSelectedCauseType()
      parser.parseObjectNext()
      parser.parseObjectKey("sessionState")
      val sessionState = parseEIT_Acquisition_SupervisorSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("cycleState")
      val cycleState = parseEIT_Acquisition_SupervisorCycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("imageState")
      val imageState = parseEIT_Acquisition_SupervisorImageStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryState")
      val recoveryState = parseEIT_Acquisition_SupervisorRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("imageDisposition")
      val imageDisposition = parseEIT_Acquisition_SupervisorImageDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("dominantFault")
      val dominantFault = parseEIT_Acquisition_SupervisorDominantFaultType()
      parser.parseObjectNext()
      parser.parseObjectKey("multipleFaults")
      val multipleFaults = parser.parseB()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.StatusFrame(publicMode, selectedCause, sessionState, cycleState, imageState, recoveryState, imageDisposition, dominantFault, multipleFaults)
    }

    def parseEIT_Acquisition_SupervisorStatusFrame_Payload(): EIT_Acquisition_Supervisor.StatusFrame_Payload = {
      val r = parseEIT_Acquisition_SupervisorStatusFrame_PayloadT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorStatusFrame_PayloadT(typeParsed: B): EIT_Acquisition_Supervisor.StatusFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.StatusFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseEIT_Acquisition_SupervisorStatusFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.StatusFrame_Payload(value)
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

    def parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container(): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P", "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_doctor_signal")
      val api_doctor_signal = parseEIT_Acquisition_SupervisorDoctorSignalType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(api_doctor_signal)
    }

    def parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_doctor_signal")
      val api_doctor_signal = parseEIT_Acquisition_SupervisorDoctorSignalType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(api_doctor_signal)
    }

    def parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container(): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P", "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseEIT_Acquisition_SupervisorRequestFactsRecord()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(api_request_facts)
    }

    def parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseEIT_Acquisition_SupervisorRequestFactsRecord()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(api_request_facts)
    }

    def parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container(): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P", "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_preparation_observation")
      val api_preparation_observation = parseEIT_Acquisition_SupervisorPreparationObservationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(api_preparation_observation)
    }

    def parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_preparation_observation")
      val api_preparation_observation = parseEIT_Acquisition_SupervisorPreparationObservationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(api_preparation_observation)
    }

    def parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container(): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P", "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_preparation_facts")
      val api_preparation_facts = parseEIT_Acquisition_SupervisorPreparationFactsType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(api_preparation_facts)
    }

    def parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_preparation_facts")
      val api_preparation_facts = parseEIT_Acquisition_SupervisorPreparationFactsType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(api_preparation_facts)
    }

    def parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container(): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P", "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_equipment_observation")
      val api_equipment_observation = parseEIT_Acquisition_SupervisorEquipmentObservationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(api_equipment_observation)
    }

    def parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_equipment_observation")
      val api_equipment_observation = parseEIT_Acquisition_SupervisorEquipmentObservationType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(api_equipment_observation)
    }

    def parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container(): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P", "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_equipment_facts")
      val api_equipment_facts = parseEIT_Acquisition_SupervisorEquipmentFactsType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(api_equipment_facts)
    }

    def parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_equipment_facts")
      val api_equipment_facts = parseEIT_Acquisition_SupervisorEquipmentFactsType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(api_equipment_facts)
    }

    def parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container(): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P", "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_batch_signal")
      val api_batch_signal = parseEIT_Acquisition_SupervisorBatchSignalType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(api_batch_signal)
    }

    def parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batch_signal")
      val api_batch_signal = parseEIT_Acquisition_SupervisorBatchSignalType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(api_batch_signal)
    }

    def parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container(): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P", "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_batch_facts")
      val api_batch_facts = parseEIT_Acquisition_SupervisorBatchFactsType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(api_batch_facts)
    }

    def parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_batch_facts")
      val api_batch_facts = parseEIT_Acquisition_SupervisorBatchFactsType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(api_batch_facts)
    }

    def parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container(): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P", "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_image_feedback")
      val api_image_feedback = parseEIT_Acquisition_SupervisorImageFeedbackType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(api_image_feedback)
    }

    def parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_image_feedback")
      val api_image_feedback = parseEIT_Acquisition_SupervisorImageFeedbackType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(api_image_feedback)
    }

    def parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container(): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P", "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_image_result_facts")
      val api_image_result_facts = parseEIT_Acquisition_SupervisorImageResultFactsType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(api_image_result_facts)
    }

    def parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_image_result_facts")
      val api_image_result_facts = parseEIT_Acquisition_SupervisorImageResultFactsType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(api_image_result_facts)
    }

    def parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container(): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P", "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P")
      }
      parser.parseObjectKey("api_batch_facts")
      val api_batch_facts = parseEIT_Acquisition_SupervisorBatchFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_equipment_facts")
      val api_equipment_facts = parseEIT_Acquisition_SupervisorEquipmentFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_image_result_facts")
      val api_image_result_facts = parseEIT_Acquisition_SupervisorImageResultFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_preparation_facts")
      val api_preparation_facts = parseEIT_Acquisition_SupervisorPreparationFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseEIT_Acquisition_SupervisorRequestFactsRecord()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P(api_batch_facts, api_equipment_facts, api_image_result_facts, api_preparation_facts, api_request_facts)
    }

    def parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batch_facts")
      val api_batch_facts = parseEIT_Acquisition_SupervisorBatchFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_equipment_facts")
      val api_equipment_facts = parseEIT_Acquisition_SupervisorEquipmentFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_image_result_facts")
      val api_image_result_facts = parseEIT_Acquisition_SupervisorImageResultFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_preparation_facts")
      val api_preparation_facts = parseEIT_Acquisition_SupervisorPreparationFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseEIT_Acquisition_SupervisorRequestFactsRecord()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS(api_batch_facts, api_equipment_facts, api_image_result_facts, api_preparation_facts, api_request_facts)
    }

    def parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container(): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P", "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P")
      }
      parser.parseObjectKey("api_fault_summary")
      val api_fault_summary = parseEIT_Acquisition_SupervisorFaultSummary()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P(api_fault_summary)
    }

    def parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_fault_summary")
      val api_fault_summary = parseEIT_Acquisition_SupervisorFaultSummary()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS(api_fault_summary)
    }

    def parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container(): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P", "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P")
      }
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parseEIT_Acquisition_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseEIT_Acquisition_SupervisorRequestFactsRecord()
      parser.parseObjectNext()
      parser.parseObjectKey("api_start_feasibility")
      val api_start_feasibility = parseEIT_Acquisition_SupervisorStartFeasibilityType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P(api_recovery_frame, api_request_facts, api_start_feasibility)
    }

    def parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS")
      }
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parseEIT_Acquisition_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseEIT_Acquisition_SupervisorRequestFactsRecord()
      parser.parseObjectNext()
      parser.parseObjectKey("api_start_feasibility")
      val api_start_feasibility = parseEIT_Acquisition_SupervisorStartFeasibilityType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS(api_recovery_frame, api_request_facts, api_start_feasibility)
    }

    def parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container(): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P", "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P")
      }
      parser.parseObjectKey("api_session_frame")
      val api_session_frame = parseEIT_Acquisition_SupervisorSessionFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P(api_session_frame)
    }

    def parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS")
      }
      parser.parseObjectKey("api_session_frame")
      val api_session_frame = parseEIT_Acquisition_SupervisorSessionFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS(api_session_frame)
    }

    def parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container(): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P", "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P")
      }
      parser.parseObjectKey("api_batch_facts")
      val api_batch_facts = parseEIT_Acquisition_SupervisorBatchFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_equipment_facts")
      val api_equipment_facts = parseEIT_Acquisition_SupervisorEquipmentFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parseEIT_Acquisition_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(api_batch_facts, api_equipment_facts, api_recovery_frame)
    }

    def parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batch_facts")
      val api_batch_facts = parseEIT_Acquisition_SupervisorBatchFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_equipment_facts")
      val api_equipment_facts = parseEIT_Acquisition_SupervisorEquipmentFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parseEIT_Acquisition_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(api_batch_facts, api_equipment_facts, api_recovery_frame)
    }

    def parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container(): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P", "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P")
      }
      parser.parseObjectKey("api_cycle_frame")
      val api_cycle_frame = parseEIT_Acquisition_SupervisorCycleFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(api_cycle_frame)
    }

    def parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS")
      }
      parser.parseObjectKey("api_cycle_frame")
      val api_cycle_frame = parseEIT_Acquisition_SupervisorCycleFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(api_cycle_frame)
    }

    def parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container(): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P", "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P")
      }
      parser.parseObjectKey("api_batch_facts")
      val api_batch_facts = parseEIT_Acquisition_SupervisorBatchFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_image_result_facts")
      val api_image_result_facts = parseEIT_Acquisition_SupervisorImageResultFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parseEIT_Acquisition_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseEIT_Acquisition_SupervisorRequestFactsRecord()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(api_batch_facts, api_image_result_facts, api_recovery_frame, api_request_facts)
    }

    def parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS")
      }
      parser.parseObjectKey("api_batch_facts")
      val api_batch_facts = parseEIT_Acquisition_SupervisorBatchFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_image_result_facts")
      val api_image_result_facts = parseEIT_Acquisition_SupervisorImageResultFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parseEIT_Acquisition_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseEIT_Acquisition_SupervisorRequestFactsRecord()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(api_batch_facts, api_image_result_facts, api_recovery_frame, api_request_facts)
    }

    def parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container(): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P", "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P")
      }
      parser.parseObjectKey("api_image_frame")
      val api_image_frame = parseEIT_Acquisition_SupervisorImageFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(api_image_frame)
    }

    def parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS")
      }
      parser.parseObjectKey("api_image_frame")
      val api_image_frame = parseEIT_Acquisition_SupervisorImageFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(api_image_frame)
    }

    def parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container(): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P", "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P")
      }
      parser.parseObjectKey("api_fault_summary")
      val api_fault_summary = parseEIT_Acquisition_SupervisorFaultSummary()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_event")
      val api_recovery_event = parseEIT_Acquisition_SupervisorRecoveryEventType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P(api_fault_summary, api_recovery_event)
    }

    def parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS")
      }
      parser.parseObjectKey("api_fault_summary")
      val api_fault_summary = parseEIT_Acquisition_SupervisorFaultSummary()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_event")
      val api_recovery_event = parseEIT_Acquisition_SupervisorRecoveryEventType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(api_fault_summary, api_recovery_event)
    }

    def parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container(): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P", "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P")
      }
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parseEIT_Acquisition_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P(api_recovery_frame)
    }

    def parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS")
      }
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parseEIT_Acquisition_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(api_recovery_frame)
    }

    def parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container(): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P", "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_equipment_facts")
      val api_equipment_facts = parseEIT_Acquisition_SupervisorEquipmentFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_preparation_facts")
      val api_preparation_facts = parseEIT_Acquisition_SupervisorPreparationFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parseEIT_Acquisition_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseEIT_Acquisition_SupervisorRequestFactsRecord()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(api_equipment_facts, api_preparation_facts, api_recovery_frame, api_request_facts)
    }

    def parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_equipment_facts")
      val api_equipment_facts = parseEIT_Acquisition_SupervisorEquipmentFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_preparation_facts")
      val api_preparation_facts = parseEIT_Acquisition_SupervisorPreparationFactsType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parseEIT_Acquisition_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseEIT_Acquisition_SupervisorRequestFactsRecord()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(api_equipment_facts, api_preparation_facts, api_recovery_frame, api_request_facts)
    }

    def parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container(): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P", "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_start_feasibility")
      val api_start_feasibility = parseEIT_Acquisition_SupervisorStartFeasibilityType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(api_start_feasibility)
    }

    def parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_start_feasibility")
      val api_start_feasibility = parseEIT_Acquisition_SupervisorStartFeasibilityType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(api_start_feasibility)
    }

    def parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container(): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P", "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_cycle_frame")
      val api_cycle_frame = parseEIT_Acquisition_SupervisorCycleFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parseEIT_Acquisition_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_session_frame")
      val api_session_frame = parseEIT_Acquisition_SupervisorSessionFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(api_cycle_frame, api_recovery_frame, api_session_frame)
    }

    def parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_cycle_frame")
      val api_cycle_frame = parseEIT_Acquisition_SupervisorCycleFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parseEIT_Acquisition_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_session_frame")
      val api_session_frame = parseEIT_Acquisition_SupervisorSessionFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(api_cycle_frame, api_recovery_frame, api_session_frame)
    }

    def parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container(): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P", "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_collection_proposal")
      val api_collection_proposal = parseEIT_Acquisition_SupervisorProposalType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(api_collection_proposal)
    }

    def parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_collection_proposal")
      val api_collection_proposal = parseEIT_Acquisition_SupervisorProposalType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(api_collection_proposal)
    }

    def parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container(): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P", "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_image_frame")
      val api_image_frame = parseEIT_Acquisition_SupervisorImageFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parseEIT_Acquisition_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_session_frame")
      val api_session_frame = parseEIT_Acquisition_SupervisorSessionFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(api_image_frame, api_recovery_frame, api_session_frame)
    }

    def parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_image_frame")
      val api_image_frame = parseEIT_Acquisition_SupervisorImageFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parseEIT_Acquisition_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_session_frame")
      val api_session_frame = parseEIT_Acquisition_SupervisorSessionFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(api_image_frame, api_recovery_frame, api_session_frame)
    }

    def parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container(): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P", "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_release_proposal")
      val api_release_proposal = parseEIT_Acquisition_SupervisorProposalType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(api_release_proposal)
    }

    def parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_release_proposal")
      val api_release_proposal = parseEIT_Acquisition_SupervisorProposalType()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(api_release_proposal)
    }

    def parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container(): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P", "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P")
      }
      parser.parseObjectKey("api_collection_proposal")
      val api_collection_proposal = parseEIT_Acquisition_SupervisorProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_cycle_frame")
      val api_cycle_frame = parseEIT_Acquisition_SupervisorCycleFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_image_frame")
      val api_image_frame = parseEIT_Acquisition_SupervisorImageFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parseEIT_Acquisition_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_release_proposal")
      val api_release_proposal = parseEIT_Acquisition_SupervisorProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_session_frame")
      val api_session_frame = parseEIT_Acquisition_SupervisorSessionFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(api_collection_proposal, api_cycle_frame, api_image_frame, api_recovery_frame, api_release_proposal, api_session_frame)
    }

    def parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS")
      }
      parser.parseObjectKey("api_collection_proposal")
      val api_collection_proposal = parseEIT_Acquisition_SupervisorProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_cycle_frame")
      val api_cycle_frame = parseEIT_Acquisition_SupervisorCycleFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_image_frame")
      val api_image_frame = parseEIT_Acquisition_SupervisorImageFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_frame")
      val api_recovery_frame = parseEIT_Acquisition_SupervisorRecoveryFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_release_proposal")
      val api_release_proposal = parseEIT_Acquisition_SupervisorProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_session_frame")
      val api_session_frame = parseEIT_Acquisition_SupervisorSessionFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(api_collection_proposal, api_cycle_frame, api_image_frame, api_recovery_frame, api_release_proposal, api_session_frame)
    }

    def parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container(): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P", "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P")
      }
      parser.parseObjectKey("api_decision_frame")
      val api_decision_frame = parseEIT_Acquisition_SupervisorDecisionFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(api_decision_frame)
    }

    def parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS")
      }
      parser.parseObjectKey("api_decision_frame")
      val api_decision_frame = parseEIT_Acquisition_SupervisorDecisionFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(api_decision_frame)
    }

    def parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container(): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P", "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P")
      }
      parser.parseObjectKey("api_decision_frame")
      val api_decision_frame = parseEIT_Acquisition_SupervisorDecisionFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P(api_decision_frame)
    }

    def parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_decision_frame")
      val api_decision_frame = parseEIT_Acquisition_SupervisorDecisionFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(api_decision_frame)
    }

    def parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container(): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P", "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS"))
      t.native match {
        case "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PST(T); return r
      }
    }

    def parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P = {
      val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PT(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PT(typeParsed: B): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P")
      }
      parser.parseObjectKey("api_control_frame")
      val api_control_frame = parseEIT_Acquisition_SupervisorControlFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_status_frame")
      val api_status_frame = parseEIT_Acquisition_SupervisorStatusFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P(api_control_frame, api_status_frame)
    }

    def parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS = {
      val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PST(F)
      return r
    }

    def parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PST(typeParsed: B): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_control_frame")
      val api_control_frame = parseEIT_Acquisition_SupervisorControlFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_status_frame")
      val api_status_frame = parseEIT_Acquisition_SupervisorStatusFrame()
      parser.parseObjectNext()
      return EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(api_control_frame, api_status_frame)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P", "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS", "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P", "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS", "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P", "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P", "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS", "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS", "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P", "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P", "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS", "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS", "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P", "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS", "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P", "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS", "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P", "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS", "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P", "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS", "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P", "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS", "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P", "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS", "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P", "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS", "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P", "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS", "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P", "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS", "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P", "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS", "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P", "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS", "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P", "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P", "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS", "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS", "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P", "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS", "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P", "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P", "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS", "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS", "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P", "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P", "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS", "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS", "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P", "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS", "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P", "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS", "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P", "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS", "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P", "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS", "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P", "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS", "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P", "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "EIT_Acquisition_Supervisor.Proposal_Payload", "EIT_Acquisition_Supervisor.ImageState_Payload", "EIT_Acquisition_Supervisor.CycleState_Payload", "EIT_Acquisition_Supervisor.BatchFacts_Payload", "EIT_Acquisition_Supervisor.PublicMode_Payload", "EIT_Acquisition_Supervisor.CycleFrame_Payload", "EIT_Acquisition_Supervisor.ImageFrame_Payload", "EIT_Acquisition_Supervisor.BatchSignal_Payload", "EIT_Acquisition_Supervisor.StatusFrame_Payload", "EIT_Acquisition_Supervisor.RecoveryGate_Payload", "EIT_Acquisition_Supervisor.SessionState_Payload", "EIT_Acquisition_Supervisor.ImageCommand_Payload", "EIT_Acquisition_Supervisor.RequestClass_Payload", "EIT_Acquisition_Supervisor.DoctorSignal_Payload", "EIT_Acquisition_Supervisor.SessionFrame_Payload", "EIT_Acquisition_Supervisor.FaultSummary_Payload", "EIT_Acquisition_Supervisor.ControlFrame_Payload", "EIT_Acquisition_Supervisor.RecoveryState_Payload", "EIT_Acquisition_Supervisor.RecoveryEvent_Payload", "EIT_Acquisition_Supervisor.ImageFeedback_Payload", "EIT_Acquisition_Supervisor.RecoveryCause_Payload", "EIT_Acquisition_Supervisor.SelectedCause_Payload", "EIT_Acquisition_Supervisor.DominantFault_Payload", "EIT_Acquisition_Supervisor.RecoveryFrame_Payload", "EIT_Acquisition_Supervisor.DecisionFrame_Payload", "EIT_Acquisition_Supervisor.EquipmentFacts_Payload", "EIT_Acquisition_Supervisor.SelectedAction_Payload", "EIT_Acquisition_Supervisor.StartFeasibility_Payload", "EIT_Acquisition_Supervisor.ImageDisposition_Payload", "EIT_Acquisition_Supervisor.PreparationFacts_Payload", "EIT_Acquisition_Supervisor.ImageResultFacts_Payload", "EIT_Acquisition_Supervisor.AcquisitionCommand_Payload", "EIT_Acquisition_Supervisor.RequestFactsRecord_Payload", "EIT_Acquisition_Supervisor.EquipmentObservation_Payload", "EIT_Acquisition_Supervisor.PreparationObservation_Payload", "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P", "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS", "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P", "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS", "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P", "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P", "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS", "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS", "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P", "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P", "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS", "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS", "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P", "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS", "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P", "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS", "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P", "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS", "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P", "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS", "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P", "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS", "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P", "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS", "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P", "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS", "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P", "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS", "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P", "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS", "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P", "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS", "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P", "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS", "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P", "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P", "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS", "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS", "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P", "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS", "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P", "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P", "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS", "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS", "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P", "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P", "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS", "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS", "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P", "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS", "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P", "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS", "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P", "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS", "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P", "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS", "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P", "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS", "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P", "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS"))
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
        case "EIT_Acquisition_Supervisor.Proposal_Payload" => val r = parseEIT_Acquisition_SupervisorProposal_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.ImageState_Payload" => val r = parseEIT_Acquisition_SupervisorImageState_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.CycleState_Payload" => val r = parseEIT_Acquisition_SupervisorCycleState_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.BatchFacts_Payload" => val r = parseEIT_Acquisition_SupervisorBatchFacts_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.PublicMode_Payload" => val r = parseEIT_Acquisition_SupervisorPublicMode_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.CycleFrame_Payload" => val r = parseEIT_Acquisition_SupervisorCycleFrame_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.ImageFrame_Payload" => val r = parseEIT_Acquisition_SupervisorImageFrame_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.BatchSignal_Payload" => val r = parseEIT_Acquisition_SupervisorBatchSignal_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.StatusFrame_Payload" => val r = parseEIT_Acquisition_SupervisorStatusFrame_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.RecoveryGate_Payload" => val r = parseEIT_Acquisition_SupervisorRecoveryGate_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.SessionState_Payload" => val r = parseEIT_Acquisition_SupervisorSessionState_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.ImageCommand_Payload" => val r = parseEIT_Acquisition_SupervisorImageCommand_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.RequestClass_Payload" => val r = parseEIT_Acquisition_SupervisorRequestClass_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.DoctorSignal_Payload" => val r = parseEIT_Acquisition_SupervisorDoctorSignal_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.SessionFrame_Payload" => val r = parseEIT_Acquisition_SupervisorSessionFrame_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.FaultSummary_Payload" => val r = parseEIT_Acquisition_SupervisorFaultSummary_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.ControlFrame_Payload" => val r = parseEIT_Acquisition_SupervisorControlFrame_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.RecoveryState_Payload" => val r = parseEIT_Acquisition_SupervisorRecoveryState_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.RecoveryEvent_Payload" => val r = parseEIT_Acquisition_SupervisorRecoveryEvent_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.ImageFeedback_Payload" => val r = parseEIT_Acquisition_SupervisorImageFeedback_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.RecoveryCause_Payload" => val r = parseEIT_Acquisition_SupervisorRecoveryCause_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.SelectedCause_Payload" => val r = parseEIT_Acquisition_SupervisorSelectedCause_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.DominantFault_Payload" => val r = parseEIT_Acquisition_SupervisorDominantFault_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.RecoveryFrame_Payload" => val r = parseEIT_Acquisition_SupervisorRecoveryFrame_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.DecisionFrame_Payload" => val r = parseEIT_Acquisition_SupervisorDecisionFrame_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.EquipmentFacts_Payload" => val r = parseEIT_Acquisition_SupervisorEquipmentFacts_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.SelectedAction_Payload" => val r = parseEIT_Acquisition_SupervisorSelectedAction_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.StartFeasibility_Payload" => val r = parseEIT_Acquisition_SupervisorStartFeasibility_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.ImageDisposition_Payload" => val r = parseEIT_Acquisition_SupervisorImageDisposition_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.PreparationFacts_Payload" => val r = parseEIT_Acquisition_SupervisorPreparationFacts_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.ImageResultFacts_Payload" => val r = parseEIT_Acquisition_SupervisorImageResultFacts_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.AcquisitionCommand_Payload" => val r = parseEIT_Acquisition_SupervisorAcquisitionCommand_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.RequestFactsRecord_Payload" => val r = parseEIT_Acquisition_SupervisorRequestFactsRecord_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.EquipmentObservation_Payload" => val r = parseEIT_Acquisition_SupervisorEquipmentObservation_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.PreparationObservation_Payload" => val r = parseEIT_Acquisition_SupervisorPreparationObservation_PayloadT(T); return r
        case "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P" => val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS" => val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PST(T); return r
        case "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P" => val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PT(T); return r
        case "EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS" => val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PST(T); return r
        case _ => val r = parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PST(T); return r
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

  def fromEIT_Acquisition_SupervisorDoctorSignal_Payload(o: EIT_Acquisition_Supervisor.DoctorSignal_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorDoctorSignal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorDoctorSignal_Payload(s: String): Either[EIT_Acquisition_Supervisor.DoctorSignal_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDoctorSignal_Payload(parser: Parser): EIT_Acquisition_Supervisor.DoctorSignal_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorDoctorSignal_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorDoctorSignal_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRequestClass_Payload(o: EIT_Acquisition_Supervisor.RequestClass_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorRequestClass_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorRequestClass_Payload(s: String): Either[EIT_Acquisition_Supervisor.RequestClass_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRequestClass_Payload(parser: Parser): EIT_Acquisition_Supervisor.RequestClass_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorRequestClass_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorRequestClass_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPreparationObservation_Payload(o: EIT_Acquisition_Supervisor.PreparationObservation_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorPreparationObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorPreparationObservation_Payload(s: String): Either[EIT_Acquisition_Supervisor.PreparationObservation_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPreparationObservation_Payload(parser: Parser): EIT_Acquisition_Supervisor.PreparationObservation_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorPreparationObservation_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorPreparationObservation_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPreparationFacts_Payload(o: EIT_Acquisition_Supervisor.PreparationFacts_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorPreparationFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorPreparationFacts_Payload(s: String): Either[EIT_Acquisition_Supervisor.PreparationFacts_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPreparationFacts_Payload(parser: Parser): EIT_Acquisition_Supervisor.PreparationFacts_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorPreparationFacts_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorPreparationFacts_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorEquipmentObservation_Payload(o: EIT_Acquisition_Supervisor.EquipmentObservation_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorEquipmentObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorEquipmentObservation_Payload(s: String): Either[EIT_Acquisition_Supervisor.EquipmentObservation_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorEquipmentObservation_Payload(parser: Parser): EIT_Acquisition_Supervisor.EquipmentObservation_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorEquipmentObservation_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorEquipmentObservation_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorEquipmentFacts_Payload(o: EIT_Acquisition_Supervisor.EquipmentFacts_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorEquipmentFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorEquipmentFacts_Payload(s: String): Either[EIT_Acquisition_Supervisor.EquipmentFacts_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorEquipmentFacts_Payload(parser: Parser): EIT_Acquisition_Supervisor.EquipmentFacts_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorEquipmentFacts_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorEquipmentFacts_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorBatchSignal_Payload(o: EIT_Acquisition_Supervisor.BatchSignal_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorBatchSignal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorBatchSignal_Payload(s: String): Either[EIT_Acquisition_Supervisor.BatchSignal_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorBatchSignal_Payload(parser: Parser): EIT_Acquisition_Supervisor.BatchSignal_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorBatchSignal_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorBatchSignal_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorBatchFacts_Payload(o: EIT_Acquisition_Supervisor.BatchFacts_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorBatchFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorBatchFacts_Payload(s: String): Either[EIT_Acquisition_Supervisor.BatchFacts_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorBatchFacts_Payload(parser: Parser): EIT_Acquisition_Supervisor.BatchFacts_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorBatchFacts_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorBatchFacts_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageFeedback_Payload(o: EIT_Acquisition_Supervisor.ImageFeedback_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageFeedback_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageFeedback_Payload(s: String): Either[EIT_Acquisition_Supervisor.ImageFeedback_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageFeedback_Payload(parser: Parser): EIT_Acquisition_Supervisor.ImageFeedback_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorImageFeedback_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageFeedback_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageResultFacts_Payload(o: EIT_Acquisition_Supervisor.ImageResultFacts_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageResultFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageResultFacts_Payload(s: String): Either[EIT_Acquisition_Supervisor.ImageResultFacts_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageResultFacts_Payload(parser: Parser): EIT_Acquisition_Supervisor.ImageResultFacts_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorImageResultFacts_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageResultFacts_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorDominantFault_Payload(o: EIT_Acquisition_Supervisor.DominantFault_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorDominantFault_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorDominantFault_Payload(s: String): Either[EIT_Acquisition_Supervisor.DominantFault_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDominantFault_Payload(parser: Parser): EIT_Acquisition_Supervisor.DominantFault_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorDominantFault_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorDominantFault_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryState_Payload(o: EIT_Acquisition_Supervisor.RecoveryState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorRecoveryState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorRecoveryState_Payload(s: String): Either[EIT_Acquisition_Supervisor.RecoveryState_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryState_Payload(parser: Parser): EIT_Acquisition_Supervisor.RecoveryState_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorRecoveryState_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorRecoveryState_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryGate_Payload(o: EIT_Acquisition_Supervisor.RecoveryGate_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorRecoveryGate_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorRecoveryGate_Payload(s: String): Either[EIT_Acquisition_Supervisor.RecoveryGate_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryGate_Payload(parser: Parser): EIT_Acquisition_Supervisor.RecoveryGate_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorRecoveryGate_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorRecoveryGate_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryCause_Payload(o: EIT_Acquisition_Supervisor.RecoveryCause_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorRecoveryCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorRecoveryCause_Payload(s: String): Either[EIT_Acquisition_Supervisor.RecoveryCause_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryCause_Payload(parser: Parser): EIT_Acquisition_Supervisor.RecoveryCause_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorRecoveryCause_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorRecoveryCause_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStartFeasibility_Payload(o: EIT_Acquisition_Supervisor.StartFeasibility_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorStartFeasibility_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorStartFeasibility_Payload(s: String): Either[EIT_Acquisition_Supervisor.StartFeasibility_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStartFeasibility_Payload(parser: Parser): EIT_Acquisition_Supervisor.StartFeasibility_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorStartFeasibility_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorStartFeasibility_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionState_Payload(o: EIT_Acquisition_Supervisor.SessionState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorSessionState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorSessionState_Payload(s: String): Either[EIT_Acquisition_Supervisor.SessionState_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionState_Payload(parser: Parser): EIT_Acquisition_Supervisor.SessionState_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorSessionState_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorSessionState_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCycleState_Payload(o: EIT_Acquisition_Supervisor.CycleState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorCycleState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorCycleState_Payload(s: String): Either[EIT_Acquisition_Supervisor.CycleState_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCycleState_Payload(parser: Parser): EIT_Acquisition_Supervisor.CycleState_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorCycleState_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorCycleState_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageState_Payload(o: EIT_Acquisition_Supervisor.ImageState_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageState_Payload(s: String): Either[EIT_Acquisition_Supervisor.ImageState_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageState_Payload(parser: Parser): EIT_Acquisition_Supervisor.ImageState_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorImageState_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageState_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryEvent_Payload(o: EIT_Acquisition_Supervisor.RecoveryEvent_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorRecoveryEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorRecoveryEvent_Payload(s: String): Either[EIT_Acquisition_Supervisor.RecoveryEvent_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryEvent_Payload(parser: Parser): EIT_Acquisition_Supervisor.RecoveryEvent_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorRecoveryEvent_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorRecoveryEvent_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorProposal_Payload(o: EIT_Acquisition_Supervisor.Proposal_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorProposal_Payload(s: String): Either[EIT_Acquisition_Supervisor.Proposal_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorProposal_Payload(parser: Parser): EIT_Acquisition_Supervisor.Proposal_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorProposal_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorProposal_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSelectedAction_Payload(o: EIT_Acquisition_Supervisor.SelectedAction_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorSelectedAction_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorSelectedAction_Payload(s: String): Either[EIT_Acquisition_Supervisor.SelectedAction_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSelectedAction_Payload(parser: Parser): EIT_Acquisition_Supervisor.SelectedAction_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorSelectedAction_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorSelectedAction_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSelectedCause_Payload(o: EIT_Acquisition_Supervisor.SelectedCause_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorSelectedCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorSelectedCause_Payload(s: String): Either[EIT_Acquisition_Supervisor.SelectedCause_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSelectedCause_Payload(parser: Parser): EIT_Acquisition_Supervisor.SelectedCause_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorSelectedCause_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorSelectedCause_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorAcquisitionCommand_Payload(o: EIT_Acquisition_Supervisor.AcquisitionCommand_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorAcquisitionCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorAcquisitionCommand_Payload(s: String): Either[EIT_Acquisition_Supervisor.AcquisitionCommand_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorAcquisitionCommand_Payload(parser: Parser): EIT_Acquisition_Supervisor.AcquisitionCommand_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorAcquisitionCommand_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorAcquisitionCommand_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageCommand_Payload(o: EIT_Acquisition_Supervisor.ImageCommand_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageCommand_Payload(s: String): Either[EIT_Acquisition_Supervisor.ImageCommand_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageCommand_Payload(parser: Parser): EIT_Acquisition_Supervisor.ImageCommand_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorImageCommand_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageCommand_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPublicMode_Payload(o: EIT_Acquisition_Supervisor.PublicMode_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorPublicMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorPublicMode_Payload(s: String): Either[EIT_Acquisition_Supervisor.PublicMode_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPublicMode_Payload(parser: Parser): EIT_Acquisition_Supervisor.PublicMode_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorPublicMode_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorPublicMode_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageDisposition_Payload(o: EIT_Acquisition_Supervisor.ImageDisposition_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageDisposition_Payload(s: String): Either[EIT_Acquisition_Supervisor.ImageDisposition_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageDisposition_Payload(parser: Parser): EIT_Acquisition_Supervisor.ImageDisposition_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorImageDisposition_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageDisposition_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRequestFactsRecord(o: EIT_Acquisition_Supervisor.RequestFactsRecord, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorRequestFactsRecord(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorRequestFactsRecord(s: String): Either[EIT_Acquisition_Supervisor.RequestFactsRecord, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRequestFactsRecord(parser: Parser): EIT_Acquisition_Supervisor.RequestFactsRecord = {
      val r = parser.parseEIT_Acquisition_SupervisorRequestFactsRecord()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorRequestFactsRecord _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRequestFactsRecord_Payload(o: EIT_Acquisition_Supervisor.RequestFactsRecord_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorRequestFactsRecord_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorRequestFactsRecord_Payload(s: String): Either[EIT_Acquisition_Supervisor.RequestFactsRecord_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRequestFactsRecord_Payload(parser: Parser): EIT_Acquisition_Supervisor.RequestFactsRecord_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorRequestFactsRecord_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorRequestFactsRecord_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorFaultSummary(o: EIT_Acquisition_Supervisor.FaultSummary, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorFaultSummary(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorFaultSummary(s: String): Either[EIT_Acquisition_Supervisor.FaultSummary, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorFaultSummary(parser: Parser): EIT_Acquisition_Supervisor.FaultSummary = {
      val r = parser.parseEIT_Acquisition_SupervisorFaultSummary()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorFaultSummary _)
    return r
  }

  def fromEIT_Acquisition_SupervisorFaultSummary_Payload(o: EIT_Acquisition_Supervisor.FaultSummary_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorFaultSummary_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorFaultSummary_Payload(s: String): Either[EIT_Acquisition_Supervisor.FaultSummary_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorFaultSummary_Payload(parser: Parser): EIT_Acquisition_Supervisor.FaultSummary_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorFaultSummary_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorFaultSummary_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryFrame(o: EIT_Acquisition_Supervisor.RecoveryFrame, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorRecoveryFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorRecoveryFrame(s: String): Either[EIT_Acquisition_Supervisor.RecoveryFrame, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryFrame(parser: Parser): EIT_Acquisition_Supervisor.RecoveryFrame = {
      val r = parser.parseEIT_Acquisition_SupervisorRecoveryFrame()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorRecoveryFrame _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryFrame_Payload(o: EIT_Acquisition_Supervisor.RecoveryFrame_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorRecoveryFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorRecoveryFrame_Payload(s: String): Either[EIT_Acquisition_Supervisor.RecoveryFrame_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryFrame_Payload(parser: Parser): EIT_Acquisition_Supervisor.RecoveryFrame_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorRecoveryFrame_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorRecoveryFrame_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionFrame(o: EIT_Acquisition_Supervisor.SessionFrame, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorSessionFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorSessionFrame(s: String): Either[EIT_Acquisition_Supervisor.SessionFrame, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionFrame(parser: Parser): EIT_Acquisition_Supervisor.SessionFrame = {
      val r = parser.parseEIT_Acquisition_SupervisorSessionFrame()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorSessionFrame _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionFrame_Payload(o: EIT_Acquisition_Supervisor.SessionFrame_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorSessionFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorSessionFrame_Payload(s: String): Either[EIT_Acquisition_Supervisor.SessionFrame_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionFrame_Payload(parser: Parser): EIT_Acquisition_Supervisor.SessionFrame_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorSessionFrame_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorSessionFrame_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCycleFrame(o: EIT_Acquisition_Supervisor.CycleFrame, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorCycleFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorCycleFrame(s: String): Either[EIT_Acquisition_Supervisor.CycleFrame, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCycleFrame(parser: Parser): EIT_Acquisition_Supervisor.CycleFrame = {
      val r = parser.parseEIT_Acquisition_SupervisorCycleFrame()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorCycleFrame _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCycleFrame_Payload(o: EIT_Acquisition_Supervisor.CycleFrame_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorCycleFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorCycleFrame_Payload(s: String): Either[EIT_Acquisition_Supervisor.CycleFrame_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCycleFrame_Payload(parser: Parser): EIT_Acquisition_Supervisor.CycleFrame_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorCycleFrame_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorCycleFrame_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageFrame(o: EIT_Acquisition_Supervisor.ImageFrame, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageFrame(s: String): Either[EIT_Acquisition_Supervisor.ImageFrame, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageFrame(parser: Parser): EIT_Acquisition_Supervisor.ImageFrame = {
      val r = parser.parseEIT_Acquisition_SupervisorImageFrame()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageFrame _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageFrame_Payload(o: EIT_Acquisition_Supervisor.ImageFrame_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageFrame_Payload(s: String): Either[EIT_Acquisition_Supervisor.ImageFrame_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageFrame_Payload(parser: Parser): EIT_Acquisition_Supervisor.ImageFrame_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorImageFrame_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageFrame_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorDecisionFrame(o: EIT_Acquisition_Supervisor.DecisionFrame, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorDecisionFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorDecisionFrame(s: String): Either[EIT_Acquisition_Supervisor.DecisionFrame, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDecisionFrame(parser: Parser): EIT_Acquisition_Supervisor.DecisionFrame = {
      val r = parser.parseEIT_Acquisition_SupervisorDecisionFrame()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorDecisionFrame _)
    return r
  }

  def fromEIT_Acquisition_SupervisorDecisionFrame_Payload(o: EIT_Acquisition_Supervisor.DecisionFrame_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorDecisionFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorDecisionFrame_Payload(s: String): Either[EIT_Acquisition_Supervisor.DecisionFrame_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDecisionFrame_Payload(parser: Parser): EIT_Acquisition_Supervisor.DecisionFrame_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorDecisionFrame_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorDecisionFrame_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorControlFrame(o: EIT_Acquisition_Supervisor.ControlFrame, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorControlFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorControlFrame(s: String): Either[EIT_Acquisition_Supervisor.ControlFrame, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorControlFrame(parser: Parser): EIT_Acquisition_Supervisor.ControlFrame = {
      val r = parser.parseEIT_Acquisition_SupervisorControlFrame()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorControlFrame _)
    return r
  }

  def fromEIT_Acquisition_SupervisorControlFrame_Payload(o: EIT_Acquisition_Supervisor.ControlFrame_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorControlFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorControlFrame_Payload(s: String): Either[EIT_Acquisition_Supervisor.ControlFrame_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorControlFrame_Payload(parser: Parser): EIT_Acquisition_Supervisor.ControlFrame_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorControlFrame_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorControlFrame_Payload _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStatusFrame(o: EIT_Acquisition_Supervisor.StatusFrame, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorStatusFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorStatusFrame(s: String): Either[EIT_Acquisition_Supervisor.StatusFrame, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStatusFrame(parser: Parser): EIT_Acquisition_Supervisor.StatusFrame = {
      val r = parser.parseEIT_Acquisition_SupervisorStatusFrame()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorStatusFrame _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStatusFrame_Payload(o: EIT_Acquisition_Supervisor.StatusFrame_Payload, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorStatusFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorStatusFrame_Payload(s: String): Either[EIT_Acquisition_Supervisor.StatusFrame_Payload, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStatusFrame_Payload(parser: Parser): EIT_Acquisition_Supervisor.StatusFrame_Payload = {
      val r = parser.parseEIT_Acquisition_SupervisorStatusFrame_Payload()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorStatusFrame_Payload _)
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

  def fromEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container(s: String): Either[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container(parser: Parser): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container(s: String): Either[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container(parser: Parser): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(o: EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.DoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorDoctorRequestQualification_acquisition_process_doctor_request_qualification_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container(s: String): Either[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container(parser: Parser): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container(s: String): Either[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container(parser: Parser): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(o: EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.PreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorPreparationAssessment_acquisition_process_preparation_assessment_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container(s: String): Either[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container(parser: Parser): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container(s: String): Either[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container(parser: Parser): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(o: EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.EquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorEquipmentAssessment_acquisition_process_equipment_assessment_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container(s: String): Either[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container(parser: Parser): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container(s: String): Either[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container(parser: Parser): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(o: EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.BatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorBatchAssessment_acquisition_process_batch_assessment_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container(s: String): Either[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container(parser: Parser): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container(s: String): Either[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container(parser: Parser): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(o: EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.ImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageResultAssessment_acquisition_process_image_result_assessment_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container(s: String): Either[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container(parser: Parser): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container(s: String): Either[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container(parser: Parser): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(o: EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.FaultComposition_acquisition_process_fault_composition_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorFaultComposition_acquisition_process_fault_composition_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container(s: String): Either[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container(parser: Parser): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container(s: String): Either[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container(parser: Parser): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(o: EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.SessionControl_acquisition_process_session_control_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorSessionControl_acquisition_process_session_control_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container(s: String): Either[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container(parser: Parser): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container(s: String): Either[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container(parser: Parser): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(o: EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.AcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorAcquisitionCycleControl_acquisition_process_acquisition_cycle_control_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container(s: String): Either[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container(parser: Parser): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container(s: String): Either[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container(parser: Parser): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(o: EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.ImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageAvailabilityControl_acquisition_process_image_availability_control_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container(s: String): Either[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container(parser: Parser): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container(s: String): Either[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container(parser: Parser): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(o: EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.RecoveryControl_acquisition_process_recovery_control_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorRecoveryControl_acquisition_process_recovery_control_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container(s: String): Either[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container(parser: Parser): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container(s: String): Either[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container(parser: Parser): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(o: EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.StartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorStartFeasibilityOwner_acquisition_process_start_feasibility_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container(s: String): Either[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container(parser: Parser): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container(s: String): Either[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container(parser: Parser): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(o: EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.CollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorCollectionFeasibilityOwner_acquisition_process_collection_feasibility_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container(s: String): Either[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container(parser: Parser): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container(s: String): Either[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container(parser: Parser): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(o: EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container(s: String): Either[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container(parser: Parser): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container(s: String): Either[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container(parser: Parser): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(o: EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorSupervisoryArbitration_acquisition_process_supervisory_arbitration_PostState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container(s: String): Either[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container(parser: Parser): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PreState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PreState_Container_PS _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container(s: String): Either[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container(parser: Parser): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container = {
      val r = parser.parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(s: String): Either[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P(parser: Parser): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_P = {
      val r = parser.parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_P _)
    return r
  }

  def fromEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(o: EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(s: String): Either[EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS, Json.ErrorMsg] = {
    def fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS(parser: Parser): EIT_Acquisition_Supervisor.PublicationComposition_acquisition_process_publication_composition_PostState_Container_PS = {
      val r = parser.parseEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS()
      return r
    }
    val r = to(s, fEIT_Acquisition_SupervisorPublicationComposition_acquisition_process_publication_composition_PostState_Container_PS _)
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