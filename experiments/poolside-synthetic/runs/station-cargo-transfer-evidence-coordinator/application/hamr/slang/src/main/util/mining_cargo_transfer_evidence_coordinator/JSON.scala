// #Sireum
// @formatter:off

// This file is auto-generated from TransferRequest.scala, RequestKind.scala, Correlation.scala, DockContext.scala, DockReason.scala, ShipReport.scala, ShipReportClass.scala, ShipReportValue.scala, WarehouseReport.scala, WarehouseReportClass.scala, WarehouseReportValue.scala, SessionState.scala, FaultTrigger.scala, OrdinaryInhibition.scala, RequestDisposition.scala, RequestLedger.scala, ControlEvent.scala, RecoveryState.scala, ShipEvidenceState.scala, WarehouseEvidenceState.scala, RecoveryIntent.scala, ProgressClass.scala, TransferOutcome.scala, ShipUpdate.scala, WarehouseUpdate.scala, PriorityKind.scala, ProposalKind.scala, TransferAction.scala, DecisionCause.scala, DecisionOutcomeValue.scala, CoordinationMode.scala, PublicRequestDisposition.scala, PublicTransferOutcome.scala, RequestFacts.scala, DockFacts.scala, ShipReportFacts.scala, WarehouseReportFacts.scala, SessionView.scala, CoordinationGuard.scala, AdmissionDecision.scala, RecoveryTransition.scala, CoordinationFrame.scala, PriorityDirective.scala, ActionProposal.scala, TransferDecision.scala, TransferCoordinationResult.scala, Base_Types.scala, RequestAcquisition_cargo_coordination_process_request_acquisition_Containers.scala, DockContextAssessment_cargo_coordination_process_dock_context_assessment_Containers.scala, ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_Containers.scala, WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_Containers.scala, RequestAdmission_cargo_coordination_process_request_admission_Containers.scala, EvidenceCoherence_cargo_coordination_process_evidence_coherence_Containers.scala, TransferSession_cargo_coordination_process_transfer_session_Containers.scala, ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_Containers.scala, WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_Containers.scala, RecoverySupervisor_cargo_coordination_process_recovery_supervisor_Containers.scala, RequestActionEligibility_cargo_coordination_process_request_action_eligibility_Containers.scala, ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_Containers.scala, WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_Containers.scala, TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_Containers.scala, ResultComposition_cargo_coordination_process_result_composition_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package mining_cargo_transfer_evidence_coordinator

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.NONE => "NONE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.INVALID => "INVALID"
        case Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.START_A => "START_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.START_B => "START_B"
        case Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.CANCEL_A => "CANCEL_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.CANCEL_B => "CANCEL_B"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestKindType(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.NONE => "NONE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.START => "START"
        case Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.CANCEL => "CANCEL"
        case Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorRequestKindType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o: Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.NONE => "NONE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.A => "A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.B => "B"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.Correlation")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorDockContextType(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.INVALID => "INVALID"
        case Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.IN_GRID => "IN_GRID"
        case Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.ON_WARP => "ON_WARP"
        case Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.DOCKED_WITHHELD => "DOCKED_WITHHELD"
        case Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.DOCKED_READY => "DOCKED_READY"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.DockContext")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorDockContextType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorDockReasonType(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockReason.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.DockReason.READY => "READY"
        case Mining_Cargo_Transfer_Evidence_Coordinator.DockReason.NOT_DOCKED => "NOT_DOCKED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.DockReason.PERMISSION_WITHHELD => "PERMISSION_WITHHELD"
        case Mining_Cargo_Transfer_Evidence_Coordinator.DockReason.INVALID_CONTEXT => "INVALID_CONTEXT"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.DockReason")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorDockReasonType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipReportType(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.NONE => "NONE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.INVALID => "INVALID"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.ACCEPTED_A => "ACCEPTED_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.ACCEPTED_B => "ACCEPTED_B"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.MOVING_A => "MOVING_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.MOVING_B => "MOVING_B"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.COMPLETE_A => "COMPLETE_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.COMPLETE_B => "COMPLETE_B"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.FAILED_A => "FAILED_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.FAILED_B => "FAILED_B"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorShipReportType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipReportClassType(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.NO_EVENT => "NO_EVENT"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.ACCEPTED => "ACCEPTED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.MOVING => "MOVING"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.COMPLETE => "COMPLETE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.FAILED => "FAILED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorShipReportClassType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipReportValueType(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.NONE => "NONE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.INVALID => "INVALID"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.ACCEPTED_A => "ACCEPTED_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.ACCEPTED_B => "ACCEPTED_B"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.MOVING_A => "MOVING_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.MOVING_B => "MOVING_B"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.COMPLETE_A => "COMPLETE_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.COMPLETE_B => "COMPLETE_B"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.FAILED_A => "FAILED_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.FAILED_B => "FAILED_B"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorShipReportValueType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.NONE => "NONE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.INVALID => "INVALID"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.PENDING_A => "PENDING_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.PENDING_B => "PENDING_B"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.STORED_A => "STORED_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.STORED_B => "STORED_B"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.REJECTED_A => "REJECTED_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.REJECTED_B => "REJECTED_B"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClassType(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.NO_EVENT => "NO_EVENT"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.PENDING => "PENDING"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.STORED => "STORED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.REJECTED => "REJECTED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClassType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValueType(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.NONE => "NONE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.INVALID => "INVALID"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.PENDING_A => "PENDING_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.PENDING_B => "PENDING_B"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.STORED_A => "STORED_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.STORED_B => "STORED_B"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.REJECTED_A => "REJECTED_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.REJECTED_B => "REJECTED_B"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValueType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorSessionStateType(o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.IDLE => "IDLE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.AWAIT_SHIP_A => "AWAIT_SHIP_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.AWAIT_SHIP_B => "AWAIT_SHIP_B"
        case Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.TRANSFERRING_A => "TRANSFERRING_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.TRANSFERRING_B => "TRANSFERRING_B"
        case Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.AWAIT_WAREHOUSE_A => "AWAIT_WAREHOUSE_A"
        case Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.AWAIT_WAREHOUSE_B => "AWAIT_WAREHOUSE_B"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.SessionState")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorSessionStateType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType(o: Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger.CLEAR => "CLEAR"
        case Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger.TRIGGERED => "TRIGGERED"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType(o: Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition.OPEN => "OPEN"
        case Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition.INHIBITED => "INHIBITED"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.NO_REQUEST => "NO_REQUEST"
        case Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.ACCEPTED => "ACCEPTED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.DUPLICATE => "DUPLICATE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.REJECTED => "REJECTED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.DEFERRED => "DEFERRED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.CANCEL_ACCEPTED => "CANCEL_ACCEPTED"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestLedgerType(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.NO_HISTORY => "NO_HISTORY"
        case Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.A_LAST => "A_LAST"
        case Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.B_LAST => "B_LAST"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorRequestLedgerType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorControlEventType(o: Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.NONE => "NONE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.EMERGENCY_STOP => "EMERGENCY_STOP"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.RESET => "RESET"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.VERIFY_OK => "VERIFY_OK"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorControlEventType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.HEALTHY => "HEALTHY"
        case Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.LATCHED => "LATCHED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.RECOVERING => "RECOVERING"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.CLEAR => "CLEAR"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.ACKNOWLEDGED => "ACKNOWLEDGED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.MOVING => "MOVING"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.COMPLETE => "COMPLETE"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.CLEAR => "CLEAR"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.PENDING => "PENDING"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.RETAIN => "RETAIN"
        case Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.LATCH => "LATCH"
        case Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.BEGIN_RECOVERY => "BEGIN_RECOVERY"
        case Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.OPEN_RECOVERY => "OPEN_RECOVERY"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorProgressClassType(o: Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.NONE => "NONE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.SHIP_ACCEPTED => "SHIP_ACCEPTED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.SHIP_MOVING => "SHIP_MOVING"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.SHIP_COMPLETE => "SHIP_COMPLETE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.WAREHOUSE_PENDING => "WAREHOUSE_PENDING"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.WAREHOUSE_STORED => "WAREHOUSE_STORED"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorProgressClassType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcomeType(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.NONE => "NONE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.ACTIVE => "ACTIVE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.COMPLETED => "COMPLETED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.CANCELLED => "CANCELLED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.RECOVERY_REQUIRED => "RECOVERY_REQUIRED"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcomeType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.FREEZE => "FREEZE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.RETAIN => "RETAIN"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.ACKNOWLEDGE => "ACKNOWLEDGE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.MARK_MOVING => "MARK_MOVING"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.MARK_COMPLETE => "MARK_COMPLETE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.CLEAR => "CLEAR"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.FREEZE => "FREEZE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.RETAIN => "RETAIN"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.MARK_PENDING => "MARK_PENDING"
        case Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.CLEAR => "CLEAR"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorPriorityKindType(o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind.FAULT_OR_RECOVERY => "FAULT_OR_RECOVERY"
        case Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind.COMPLETION => "COMPLETION"
        case Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind.ORDINARY => "ORDINARY"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorPriorityKindType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorProposalKindType(o: Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.NONE => "NONE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.START => "START"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.CANCEL => "CANCEL"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.SHIP_PROGRESS => "SHIP_PROGRESS"
        case Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.WAREHOUSE_VERIFY => "WAREHOUSE_VERIFY"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorProposalKindType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.HOLD => "HOLD"
        case Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.BEGIN_TRANSFER => "BEGIN_TRANSFER"
        case Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.CONTINUE_TRANSFER => "CONTINUE_TRANSFER"
        case Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.REQUEST_WAREHOUSE_VERIFY => "REQUEST_WAREHOUSE_VERIFY"
        case Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.CANCEL_TRANSFER => "CANCEL_TRANSFER"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType(o: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.FAULT_OR_RECOVERY => "FAULT_OR_RECOVERY"
        case Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.CANCEL_REQUEST => "CANCEL_REQUEST"
        case Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.WAREHOUSE_CONFIRMATION => "WAREHOUSE_CONFIRMATION"
        case Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.SHIP_PROGRESS => "SHIP_PROGRESS"
        case Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.NEW_TRANSFER => "NEW_TRANSFER"
        case Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.NO_ELIGIBLE_ACTION => "NO_ELIGIBLE_ACTION"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValueType(o: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.NONE => "NONE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.ACTIVE => "ACTIVE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.COMPLETED => "COMPLETED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.CANCELLED => "CANCELLED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.RECOVERY_REQUIRED => "RECOVERY_REQUIRED"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValueType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationModeType(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode.HOLDING => "HOLDING"
        case Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode.COMMANDING_SHIP => "COMMANDING_SHIP"
        case Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode.VERIFYING_WAREHOUSE => "VERIFYING_WAREHOUSE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode.FAULT => "FAULT"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationModeType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDispositionType(o: Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.NO_REQUEST => "NO_REQUEST"
        case Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.ACCEPTED => "ACCEPTED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.DUPLICATE => "DUPLICATE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.REJECTED => "REJECTED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.DEFERRED => "DEFERRED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.CANCEL_ACCEPTED => "CANCEL_ACCEPTED"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDispositionType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcomeType(o: Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.Type): ST = {
      val value: String = o match {
        case Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.NONE => "NONE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.ACTIVE => "ACTIVE"
        case Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.COMPLETED => "COMPLETED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.CANCELLED => "CANCELLED"
        case Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.RECOVERY_REQUIRED => "RECOVERY_REQUIRED"
      }
      return printObject(ISZ(
        ("type", printString("Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome")),
        ("value", printString(value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcomeType(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts""""),
        ("kind", printMining_Cargo_Transfer_Evidence_CoordinatorRequestKindType(o.kind)),
        ("correlation", printMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation)),
        ("requestValidity", printB(o.requestValidity)),
        ("present", printB(o.present))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts""""),
        ("usable", printB(o.usable)),
        ("docked", printB(o.docked)),
        ("permissionGranted", printB(o.permissionGranted)),
        ("startReady", printB(o.startReady)),
        ("reason", printMining_Cargo_Transfer_Evidence_CoordinatorDockReasonType(o.reason))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts""""),
        ("reportClass", printMining_Cargo_Transfer_Evidence_CoordinatorShipReportClassType(o.reportClass)),
        ("correlation", printMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation)),
        ("usable", printB(o.usable)),
        ("shipValue", printMining_Cargo_Transfer_Evidence_CoordinatorShipReportValueType(o.shipValue))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts""""),
        ("reportClass", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClassType(o.reportClass)),
        ("correlation", printMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation)),
        ("usable", printB(o.usable)),
        ("warehouseValue", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValueType(o.warehouseValue))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionView): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.SessionView""""),
        ("session", printMining_Cargo_Transfer_Evidence_CoordinatorSessionStateType(o.session)),
        ("correlation", printMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard""""),
        ("faultTrigger", printMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType(o.faultTrigger)),
        ("inhibitOrdinary", printMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType(o.inhibitOrdinary))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o: Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision""""),
        ("kind", printMining_Cargo_Transfer_Evidence_CoordinatorRequestKindType(o.kind)),
        ("correlation", printMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation)),
        ("disposition", printMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(o.disposition)),
        ("updateLedger", printMining_Cargo_Transfer_Evidence_CoordinatorRequestLedgerType(o.updateLedger))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition""""),
        ("faultTrigger", printMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType(o.faultTrigger)),
        ("recoveryIntent", printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType(o.recoveryIntent))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame""""),
        ("progress", printMining_Cargo_Transfer_Evidence_CoordinatorProgressClassType(o.progress)),
        ("correlation", printMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation)),
        ("faultTrigger", printMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType(o.faultTrigger)),
        ("recoveryIntent", printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType(o.recoveryIntent)),
        ("inhibitOrdinary", printMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType(o.inhibitOrdinary)),
        ("outcomePulse", printMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcomeType(o.outcomePulse))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective""""),
        ("kind", printMining_Cargo_Transfer_Evidence_CoordinatorPriorityKindType(o.kind)),
        ("correlation", printMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o: Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal""""),
        ("kind", printMining_Cargo_Transfer_Evidence_CoordinatorProposalKindType(o.kind)),
        ("actionValue", printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType(o.actionValue)),
        ("correlation", printMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision""""),
        ("actionValue", printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType(o.actionValue)),
        ("cause", printMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType(o.cause)),
        ("correlation", printMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation)),
        ("outcomeValue", printMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValueType(o.outcomeValue))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(o.value))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult""""),
        ("actionValue", printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType(o.actionValue)),
        ("cause", printMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType(o.cause)),
        ("mode", printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationModeType(o.mode)),
        ("correlation", printMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(o.correlation)),
        ("requestDisposition", printMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDispositionType(o.requestDisposition)),
        ("outcomeValue", printMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcomeType(o.outcomeValue))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload""""),
        ("value", printMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(o.value))
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

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P""""),
        ("api_transfer_request", printMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType(o.api_transfer_request))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS""""),
        ("api_transfer_request", printMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType(o.api_transfer_request))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P""""),
        ("api_request_facts", printMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(o.api_request_facts))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS""""),
        ("api_request_facts", printMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(o.api_request_facts))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P""""),
        ("api_dock_context", printMining_Cargo_Transfer_Evidence_CoordinatorDockContextType(o.api_dock_context))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS""""),
        ("api_dock_context", printMining_Cargo_Transfer_Evidence_CoordinatorDockContextType(o.api_dock_context))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P""""),
        ("api_dock_facts", printMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(o.api_dock_facts))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS""""),
        ("api_dock_facts", printMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(o.api_dock_facts))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P""""),
        ("api_ship_report", printMining_Cargo_Transfer_Evidence_CoordinatorShipReportType(o.api_ship_report))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS""""),
        ("api_ship_report", printMining_Cargo_Transfer_Evidence_CoordinatorShipReportType(o.api_ship_report))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P""""),
        ("api_ship_report_facts", printMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(o.api_ship_report_facts))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS""""),
        ("api_ship_report_facts", printMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(o.api_ship_report_facts))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P""""),
        ("api_warehouse_report", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType(o.api_warehouse_report))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS""""),
        ("api_warehouse_report", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType(o.api_warehouse_report))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P""""),
        ("api_warehouse_report_facts", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(o.api_warehouse_report_facts))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS""""),
        ("api_warehouse_report_facts", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(o.api_warehouse_report_facts))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P""""),
        ("api_coordination_guard", printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(o.api_coordination_guard)),
        ("api_dock_facts", printMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(o.api_dock_facts)),
        ("api_prior_session_view", printMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)),
        ("api_request_facts", printMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(o.api_request_facts))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS""""),
        ("api_coordination_guard", printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(o.api_coordination_guard)),
        ("api_dock_facts", printMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(o.api_dock_facts)),
        ("api_prior_session_view", printMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)),
        ("api_request_facts", printMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(o.api_request_facts))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P""""),
        ("api_admission_decision", printMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)),
        ("api_request_disposition", printMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(o.api_request_disposition))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS""""),
        ("api_admission_decision", printMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)),
        ("api_request_disposition", printMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(o.api_request_disposition))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P""""),
        ("api_control_event", printMining_Cargo_Transfer_Evidence_CoordinatorControlEventType(o.api_control_event)),
        ("api_prior_recovery_state", printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType(o.api_prior_recovery_state)),
        ("api_prior_session_view", printMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)),
        ("api_prior_ship_evidence", printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.api_prior_ship_evidence)),
        ("api_prior_warehouse_evidence", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(o.api_prior_warehouse_evidence)),
        ("api_ship_report_facts", printMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(o.api_ship_report_facts)),
        ("api_warehouse_report_facts", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(o.api_warehouse_report_facts))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS""""),
        ("api_control_event", printMining_Cargo_Transfer_Evidence_CoordinatorControlEventType(o.api_control_event)),
        ("api_prior_recovery_state", printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType(o.api_prior_recovery_state)),
        ("api_prior_session_view", printMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)),
        ("api_prior_ship_evidence", printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.api_prior_ship_evidence)),
        ("api_prior_warehouse_evidence", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(o.api_prior_warehouse_evidence)),
        ("api_ship_report_facts", printMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(o.api_ship_report_facts)),
        ("api_warehouse_report_facts", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(o.api_warehouse_report_facts))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P""""),
        ("api_coordination_frame", printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(o.api_coordination_frame)),
        ("api_coordination_guard", printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(o.api_coordination_guard)),
        ("api_priority_directive", printMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(o.api_priority_directive)),
        ("api_recovery_transition", printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(o.api_recovery_transition)),
        ("api_ship_update", printMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType(o.api_ship_update)),
        ("api_warehouse_update", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType(o.api_warehouse_update))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS""""),
        ("api_coordination_frame", printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(o.api_coordination_frame)),
        ("api_coordination_guard", printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(o.api_coordination_guard)),
        ("api_priority_directive", printMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(o.api_priority_directive)),
        ("api_recovery_transition", printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(o.api_recovery_transition)),
        ("api_ship_update", printMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType(o.api_ship_update)),
        ("api_warehouse_update", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType(o.api_warehouse_update))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P""""),
        ("api_admission_decision", printMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)),
        ("api_coordination_frame", printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(o.api_coordination_frame))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS""""),
        ("api_admission_decision", printMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)),
        ("api_coordination_frame", printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(o.api_coordination_frame))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P""""),
        ("api_prior_session_view", printMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS""""),
        ("api_prior_session_view", printMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P""""),
        ("api_admission_decision", printMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)),
        ("api_ship_update", printMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType(o.api_ship_update))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS""""),
        ("api_admission_decision", printMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)),
        ("api_ship_update", printMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType(o.api_ship_update))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P""""),
        ("api_prior_ship_evidence", printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.api_prior_ship_evidence))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS""""),
        ("api_prior_ship_evidence", printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.api_prior_ship_evidence))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P""""),
        ("api_admission_decision", printMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)),
        ("api_warehouse_update", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType(o.api_warehouse_update))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS""""),
        ("api_admission_decision", printMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision)),
        ("api_warehouse_update", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType(o.api_warehouse_update))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P""""),
        ("api_prior_warehouse_evidence", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(o.api_prior_warehouse_evidence))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS""""),
        ("api_prior_warehouse_evidence", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(o.api_prior_warehouse_evidence))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P""""),
        ("api_recovery_transition", printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(o.api_recovery_transition))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS""""),
        ("api_recovery_transition", printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(o.api_recovery_transition))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P""""),
        ("api_prior_recovery_state", printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType(o.api_prior_recovery_state))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS""""),
        ("api_prior_recovery_state", printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType(o.api_prior_recovery_state))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P""""),
        ("api_admission_decision", printMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS""""),
        ("api_admission_decision", printMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o.api_admission_decision))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P""""),
        ("api_request_proposal", printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_request_proposal))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS""""),
        ("api_request_proposal", printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_request_proposal))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P""""),
        ("api_prior_session_view", printMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)),
        ("api_prior_ship_evidence", printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.api_prior_ship_evidence))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS""""),
        ("api_prior_session_view", printMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)),
        ("api_prior_ship_evidence", printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.api_prior_ship_evidence))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P""""),
        ("api_ship_proposal", printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_ship_proposal))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS""""),
        ("api_ship_proposal", printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_ship_proposal))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P""""),
        ("api_prior_session_view", printMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)),
        ("api_prior_ship_evidence", printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.api_prior_ship_evidence)),
        ("api_prior_warehouse_evidence", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(o.api_prior_warehouse_evidence))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS""""),
        ("api_prior_session_view", printMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o.api_prior_session_view)),
        ("api_prior_ship_evidence", printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(o.api_prior_ship_evidence)),
        ("api_prior_warehouse_evidence", printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(o.api_prior_warehouse_evidence))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P""""),
        ("api_warehouse_proposal", printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_warehouse_proposal))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS""""),
        ("api_warehouse_proposal", printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_warehouse_proposal))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P""""),
        ("api_priority_directive", printMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(o.api_priority_directive)),
        ("api_request_proposal", printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_request_proposal)),
        ("api_ship_proposal", printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_ship_proposal)),
        ("api_warehouse_proposal", printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_warehouse_proposal))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS""""),
        ("api_priority_directive", printMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(o.api_priority_directive)),
        ("api_request_proposal", printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_request_proposal)),
        ("api_ship_proposal", printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_ship_proposal)),
        ("api_warehouse_proposal", printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o.api_warehouse_proposal))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P""""),
        ("api_transfer_decision", printMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(o.api_transfer_decision))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS""""),
        ("api_transfer_decision", printMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(o.api_transfer_decision))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P""""),
        ("api_request_disposition", printMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(o.api_request_disposition)),
        ("api_transfer_decision", printMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(o.api_transfer_decision))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS""""),
        ("api_request_disposition", printMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(o.api_request_disposition)),
        ("api_transfer_decision", printMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(o.api_transfer_decision))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container): ST = {
      o match {
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(o)
      }
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P""""),
        ("api_transfer_result", printMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(o.api_transfer_result))
      ))
    }

    @pure def printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS""""),
        ("api_transfer_result", printMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(o.api_transfer_result))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_acquisition_postInit => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_acquisition_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_acquisition_preCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_acquisition_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_acquisition_postCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_acquisition_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_dock_context_assessment_postInit => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_dock_context_assessment_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_dock_context_assessment_preCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_dock_context_assessment_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_dock_context_assessment_postCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_dock_context_assessment_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_report_acquisition_postInit => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_report_acquisition_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_report_acquisition_preCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_report_acquisition_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_report_acquisition_postCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_report_acquisition_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_report_acquisition_postInit => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_report_acquisition_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_report_acquisition_preCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_report_acquisition_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_report_acquisition_postCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_report_acquisition_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_admission_postInit => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_admission_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_admission_preCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_admission_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_admission_postCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_admission_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_evidence_coherence_postInit => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_evidence_coherence_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_evidence_coherence_preCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_evidence_coherence_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_evidence_coherence_postCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_evidence_coherence_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_transfer_session_postInit => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_transfer_session_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_transfer_session_preCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_transfer_session_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_transfer_session_postCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_transfer_session_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_evidence_lifecycle_postInit => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_evidence_lifecycle_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_evidence_lifecycle_preCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_evidence_lifecycle_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_evidence_lifecycle_postCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_evidence_lifecycle_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_evidence_lifecycle_postInit => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_evidence_lifecycle_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_evidence_lifecycle_preCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_evidence_lifecycle_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_evidence_lifecycle_postCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_evidence_lifecycle_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_recovery_supervisor_postInit => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_recovery_supervisor_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_recovery_supervisor_preCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_recovery_supervisor_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_recovery_supervisor_postCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_recovery_supervisor_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_action_eligibility_postInit => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_action_eligibility_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_action_eligibility_preCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_action_eligibility_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_action_eligibility_postCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_request_action_eligibility_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_progress_eligibility_postInit => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_progress_eligibility_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_progress_eligibility_preCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_progress_eligibility_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_progress_eligibility_postCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_ship_progress_eligibility_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_verification_eligibility_postInit => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_verification_eligibility_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_verification_eligibility_preCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_verification_eligibility_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_verification_eligibility_postCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_warehouse_verification_eligibility_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_transfer_action_arbitration_postInit => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_transfer_action_arbitration_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_transfer_action_arbitration_preCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_transfer_action_arbitration_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_transfer_action_arbitration_postCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_transfer_action_arbitration_postCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_result_composition_postInit => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_result_composition_postInit"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_result_composition_preCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_result_composition_preCompute"
        case runtimemonitor.ObservationKind.StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_result_composition_postCompute => "StationCargoTransferEvidenceCoordinator_Instance_cargo_coordination_process_result_composition_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(o)
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
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(o)
        case o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS => return printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(o)
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

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestKindType(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestKindT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestKindT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestKindType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(): Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelationT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelationT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.Correlation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextType(): Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.DockContext")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContext_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockContext_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockReasonType(): Mining_Cargo_Transfer_Evidence_Coordinator.DockReason.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockReasonT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockReasonT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockReason.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.DockReason")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.DockReason.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.DockReason.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.DockReason.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockReason_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockReason_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorDockReasonType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportType(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReport_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReport_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportClassType(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportClassT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportClassT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportClassType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportValueType(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportValueT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportValueT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportValueType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClassType(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClassT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClassT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClassType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValueType(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValueT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValueT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValueType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorSessionStateType(): Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionStateT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorSessionStateT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.SessionState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionState_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorSessionState_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionStateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType(): Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType(): Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestLedgerType(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestLedgerT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestLedgerT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestLedgerType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorControlEventType(): Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorControlEventT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorControlEventT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorControlEventType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorProgressClassType(): Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorProgressClassT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorProgressClassT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorProgressClassType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcomeType(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcomeT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcomeT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcomeType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityKindType(): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityKindT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityKindT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityKindType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorProposalKindType(): Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorProposalKindT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorProposalKindT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorProposalKindType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType(): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValueType(): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValueT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValueT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValueType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationModeType(): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationModeT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationModeT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationModeType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDispositionType(): Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDispositionT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDispositionT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDispositionType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcomeType(): Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.Type = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcomeT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcomeT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.")
          return Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.byOrdinal(0).get
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcomeType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestFactsT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestFactsT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts")
      }
      parser.parseObjectKey("kind")
      val kind = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("requestValidity")
      val requestValidity = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("present")
      val present = parser.parseB()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts(kind, correlation, requestValidity, present)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(): Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockFactsT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockFactsT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts")
      }
      parser.parseObjectKey("usable")
      val usable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("docked")
      val docked = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("permissionGranted")
      val permissionGranted = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("startReady")
      val startReady = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("reason")
      val reason = parseMining_Cargo_Transfer_Evidence_CoordinatorDockReasonType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts(usable, docked, permissionGranted, startReady, reason)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorDockFacts()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportFactsT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportFactsT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts")
      }
      parser.parseObjectKey("reportClass")
      val reportClass = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("usable")
      val usable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("shipValue")
      val shipValue = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportValueType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts(reportClass, correlation, usable, shipValue)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFactsT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFactsT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts")
      }
      parser.parseObjectKey("reportClass")
      val reportClass = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("usable")
      val usable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("warehouseValue")
      val warehouseValue = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValueType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts(reportClass, correlation, usable, warehouseValue)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView(): Mining_Cargo_Transfer_Evidence_Coordinator.SessionView = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionViewT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorSessionViewT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.SessionView = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.SessionView")
      }
      parser.parseObjectKey("session")
      val session = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.SessionView(session, correlation)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuardT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuardT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard")
      }
      parser.parseObjectKey("faultTrigger")
      val faultTrigger = parseMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType()
      parser.parseObjectNext()
      parser.parseObjectKey("inhibitOrdinary")
      val inhibitOrdinary = parseMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard(faultTrigger, inhibitOrdinary)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(): Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecisionT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecisionT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision")
      }
      parser.parseObjectKey("kind")
      val kind = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("updateLedger")
      val updateLedger = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestLedgerType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision(kind, correlation, disposition, updateLedger)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransitionT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransitionT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition")
      }
      parser.parseObjectKey("faultTrigger")
      val faultTrigger = parseMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryIntent")
      val recoveryIntent = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition(faultTrigger, recoveryIntent)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrameT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrameT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame")
      }
      parser.parseObjectKey("progress")
      val progress = parseMining_Cargo_Transfer_Evidence_CoordinatorProgressClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("faultTrigger")
      val faultTrigger = parseMining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryIntent")
      val recoveryIntent = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("inhibitOrdinary")
      val inhibitOrdinary = parseMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType()
      parser.parseObjectNext()
      parser.parseObjectKey("outcomePulse")
      val outcomePulse = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcomeType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame(progress, correlation, faultTrigger, recoveryIntent, inhibitOrdinary, outcomePulse)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirectiveT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirectiveT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective")
      }
      parser.parseObjectKey("kind")
      val kind = parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective(kind, correlation)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(): Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposalT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposalT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal")
      }
      parser.parseObjectKey("kind")
      val kind = parseMining_Cargo_Transfer_Evidence_CoordinatorProposalKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("actionValue")
      val actionValue = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal(kind, actionValue, correlation)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferDecisionT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferDecisionT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision")
      }
      parser.parseObjectKey("actionValue")
      val actionValue = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("cause")
      val cause = parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("outcomeValue")
      val outcomeValue = parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValueType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision(actionValue, cause, correlation, outcomeValue)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload(value)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResultT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResultT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult")
      }
      parser.parseObjectKey("actionValue")
      val actionValue = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("cause")
      val cause = parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType()
      parser.parseObjectNext()
      parser.parseObjectKey("mode")
      val mode = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("requestDisposition")
      val requestDisposition = parseMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("outcomeValue")
      val outcomeValue = parseMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcomeType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult(actionValue, cause, mode, correlation, requestDisposition, outcomeValue)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_PayloadT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_PayloadT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload(value)
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

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P")
      }
      parser.parseObjectKey("api_transfer_request")
      val api_transfer_request = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(api_transfer_request)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_transfer_request")
      val api_transfer_request = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(api_transfer_request)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P")
      }
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(api_request_facts)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(api_request_facts)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_dock_context")
      val api_dock_context = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(api_dock_context)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_dock_context")
      val api_dock_context = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(api_dock_context)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_dock_facts")
      val api_dock_facts = parseMining_Cargo_Transfer_Evidence_CoordinatorDockFacts()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(api_dock_facts)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_dock_facts")
      val api_dock_facts = parseMining_Cargo_Transfer_Evidence_CoordinatorDockFacts()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(api_dock_facts)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P")
      }
      parser.parseObjectKey("api_ship_report")
      val api_ship_report = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(api_ship_report)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_ship_report")
      val api_ship_report = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(api_ship_report)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P")
      }
      parser.parseObjectKey("api_ship_report_facts")
      val api_ship_report_facts = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(api_ship_report_facts)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_ship_report_facts")
      val api_ship_report_facts = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(api_ship_report_facts)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P")
      }
      parser.parseObjectKey("api_warehouse_report")
      val api_warehouse_report = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(api_warehouse_report)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_warehouse_report")
      val api_warehouse_report = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(api_warehouse_report)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P")
      }
      parser.parseObjectKey("api_warehouse_report_facts")
      val api_warehouse_report_facts = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(api_warehouse_report_facts)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_warehouse_report_facts")
      val api_warehouse_report_facts = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(api_warehouse_report_facts)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P")
      }
      parser.parseObjectKey("api_coordination_guard")
      val api_coordination_guard = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard()
      parser.parseObjectNext()
      parser.parseObjectKey("api_dock_facts")
      val api_dock_facts = parseMining_Cargo_Transfer_Evidence_CoordinatorDockFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_session_view")
      val api_prior_session_view = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(api_coordination_guard, api_dock_facts, api_prior_session_view, api_request_facts)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS")
      }
      parser.parseObjectKey("api_coordination_guard")
      val api_coordination_guard = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard()
      parser.parseObjectNext()
      parser.parseObjectKey("api_dock_facts")
      val api_dock_facts = parseMining_Cargo_Transfer_Evidence_CoordinatorDockFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_session_view")
      val api_prior_session_view = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(api_coordination_guard, api_dock_facts, api_prior_session_view, api_request_facts)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_disposition")
      val api_request_disposition = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(api_admission_decision, api_request_disposition)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_disposition")
      val api_request_disposition = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(api_admission_decision, api_request_disposition)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P")
      }
      parser.parseObjectKey("api_control_event")
      val api_control_event = parseMining_Cargo_Transfer_Evidence_CoordinatorControlEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_recovery_state")
      val api_prior_recovery_state = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_session_view")
      val api_prior_session_view = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_ship_evidence")
      val api_prior_ship_evidence = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_warehouse_evidence")
      val api_prior_warehouse_evidence = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ship_report_facts")
      val api_ship_report_facts = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_warehouse_report_facts")
      val api_warehouse_report_facts = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(api_control_event, api_prior_recovery_state, api_prior_session_view, api_prior_ship_evidence, api_prior_warehouse_evidence, api_ship_report_facts, api_warehouse_report_facts)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS")
      }
      parser.parseObjectKey("api_control_event")
      val api_control_event = parseMining_Cargo_Transfer_Evidence_CoordinatorControlEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_recovery_state")
      val api_prior_recovery_state = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_session_view")
      val api_prior_session_view = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_ship_evidence")
      val api_prior_ship_evidence = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_warehouse_evidence")
      val api_prior_warehouse_evidence = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ship_report_facts")
      val api_ship_report_facts = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_warehouse_report_facts")
      val api_warehouse_report_facts = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(api_control_event, api_prior_recovery_state, api_prior_session_view, api_prior_ship_evidence, api_prior_warehouse_evidence, api_ship_report_facts, api_warehouse_report_facts)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P")
      }
      parser.parseObjectKey("api_coordination_frame")
      val api_coordination_frame = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_coordination_guard")
      val api_coordination_guard = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard()
      parser.parseObjectNext()
      parser.parseObjectKey("api_priority_directive")
      val api_priority_directive = parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_transition")
      val api_recovery_transition = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ship_update")
      val api_ship_update = parseMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_warehouse_update")
      val api_warehouse_update = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(api_coordination_frame, api_coordination_guard, api_priority_directive, api_recovery_transition, api_ship_update, api_warehouse_update)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS")
      }
      parser.parseObjectKey("api_coordination_frame")
      val api_coordination_frame = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_coordination_guard")
      val api_coordination_guard = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard()
      parser.parseObjectNext()
      parser.parseObjectKey("api_priority_directive")
      val api_priority_directive = parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_transition")
      val api_recovery_transition = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ship_update")
      val api_ship_update = parseMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_warehouse_update")
      val api_warehouse_update = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(api_coordination_frame, api_coordination_guard, api_priority_directive, api_recovery_transition, api_ship_update, api_warehouse_update)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_coordination_frame")
      val api_coordination_frame = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(api_admission_decision, api_coordination_frame)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_coordination_frame")
      val api_coordination_frame = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(api_admission_decision, api_coordination_frame)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P")
      }
      parser.parseObjectKey("api_prior_session_view")
      val api_prior_session_view = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(api_prior_session_view)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS")
      }
      parser.parseObjectKey("api_prior_session_view")
      val api_prior_session_view = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(api_prior_session_view)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ship_update")
      val api_ship_update = parseMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(api_admission_decision, api_ship_update)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ship_update")
      val api_ship_update = parseMining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(api_admission_decision, api_ship_update)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P")
      }
      parser.parseObjectKey("api_prior_ship_evidence")
      val api_prior_ship_evidence = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(api_prior_ship_evidence)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS")
      }
      parser.parseObjectKey("api_prior_ship_evidence")
      val api_prior_ship_evidence = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(api_prior_ship_evidence)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_warehouse_update")
      val api_warehouse_update = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(api_admission_decision, api_warehouse_update)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_warehouse_update")
      val api_warehouse_update = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(api_admission_decision, api_warehouse_update)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P")
      }
      parser.parseObjectKey("api_prior_warehouse_evidence")
      val api_prior_warehouse_evidence = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(api_prior_warehouse_evidence)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS")
      }
      parser.parseObjectKey("api_prior_warehouse_evidence")
      val api_prior_warehouse_evidence = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(api_prior_warehouse_evidence)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P")
      }
      parser.parseObjectKey("api_recovery_transition")
      val api_recovery_transition = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(api_recovery_transition)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_recovery_transition")
      val api_recovery_transition = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(api_recovery_transition)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P")
      }
      parser.parseObjectKey("api_prior_recovery_state")
      val api_prior_recovery_state = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(api_prior_recovery_state)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_prior_recovery_state")
      val api_prior_recovery_state = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(api_prior_recovery_state)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(api_admission_decision)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(api_admission_decision)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_request_proposal")
      val api_request_proposal = parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(api_request_proposal)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_request_proposal")
      val api_request_proposal = parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(api_request_proposal)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_prior_session_view")
      val api_prior_session_view = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_ship_evidence")
      val api_prior_ship_evidence = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(api_prior_session_view, api_prior_ship_evidence)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_prior_session_view")
      val api_prior_session_view = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_ship_evidence")
      val api_prior_ship_evidence = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(api_prior_session_view, api_prior_ship_evidence)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_ship_proposal")
      val api_ship_proposal = parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(api_ship_proposal)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_ship_proposal")
      val api_ship_proposal = parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(api_ship_proposal)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_prior_session_view")
      val api_prior_session_view = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_ship_evidence")
      val api_prior_ship_evidence = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_warehouse_evidence")
      val api_prior_warehouse_evidence = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(api_prior_session_view, api_prior_ship_evidence, api_prior_warehouse_evidence)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_prior_session_view")
      val api_prior_session_view = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_ship_evidence")
      val api_prior_ship_evidence = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_warehouse_evidence")
      val api_prior_warehouse_evidence = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(api_prior_session_view, api_prior_ship_evidence, api_prior_warehouse_evidence)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_warehouse_proposal")
      val api_warehouse_proposal = parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(api_warehouse_proposal)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_warehouse_proposal")
      val api_warehouse_proposal = parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(api_warehouse_proposal)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P")
      }
      parser.parseObjectKey("api_priority_directive")
      val api_priority_directive = parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_proposal")
      val api_request_proposal = parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ship_proposal")
      val api_ship_proposal = parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_warehouse_proposal")
      val api_warehouse_proposal = parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(api_priority_directive, api_request_proposal, api_ship_proposal, api_warehouse_proposal)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS")
      }
      parser.parseObjectKey("api_priority_directive")
      val api_priority_directive = parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_proposal")
      val api_request_proposal = parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_ship_proposal")
      val api_ship_proposal = parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_warehouse_proposal")
      val api_warehouse_proposal = parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(api_priority_directive, api_request_proposal, api_ship_proposal, api_warehouse_proposal)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P")
      }
      parser.parseObjectKey("api_transfer_decision")
      val api_transfer_decision = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(api_transfer_decision)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS")
      }
      parser.parseObjectKey("api_transfer_decision")
      val api_transfer_decision = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(api_transfer_decision)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P")
      }
      parser.parseObjectKey("api_request_disposition")
      val api_request_disposition = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_transfer_decision")
      val api_transfer_decision = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(api_request_disposition, api_transfer_decision)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_request_disposition")
      val api_request_disposition = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_transfer_decision")
      val api_transfer_decision = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(api_request_disposition, api_transfer_decision)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container(): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS"))
      t.native match {
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PST(T); return r
      }
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PT(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PT(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P")
      }
      parser.parseObjectKey("api_transfer_result")
      val api_transfer_result = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(api_transfer_result)
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS = {
      val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PST(F)
      return r
    }

    def parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PST(typeParsed: B): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_transfer_result")
      val api_transfer_result = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult()
      parser.parseObjectNext()
      return Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(api_transfer_result)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P", "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS"))
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
        case "Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockReason_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReport_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContext_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorSessionState_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_PayloadT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PST(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PT(T); return r
        case "Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS" => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PST(T); return r
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

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockFacts(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorDockFacts()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorDockFacts _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionView, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorSessionView(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorSessionView(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.SessionView, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorSessionView(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.SessionView = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorSessionView _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o: Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o: Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorActionProposal(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorActionProposal _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload _)
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

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P _)
    return r
  }

  def fromMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(o: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(s: String): Either[Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS, Json.ErrorMsg] = {
    def fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(parser: Parser): Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS = {
      val r = parser.parseMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS()
      return r
    }
    val r = to(s, fMining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS _)
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