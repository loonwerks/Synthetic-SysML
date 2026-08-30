// #Sireum
// @formatter:off

// This file is auto-generated from AccessRequest.scala, RequestOperation.scala, Correlation.scala, VesselStatus.scala, VesselClass.scala, StationReport.scala, StationProgress.scala, ServiceActivity.scala, ServiceClass.scala, LifecycleState.scala, RequestDisposition.scala, ControlEvent.scala, BerthState.scala, GateState.scala, RecoveryState.scala, RecoveryIntent.scala, LifecycleDirective.scala, DecisionContext.scala, BerthEvidenceKind.scala, GateDirective.scala, PriorityKind.scala, SupervisoryAction.scala, DecisionCause.scala, PublicMode.scala, AccessStatus.scala, DockingOutcome.scala, RequestFacts.scala, VesselFacts.scala, StationFacts.scala, ServiceFacts.scala, AdmissionGuard.scala, PriorLifecycleView.scala, AdmissionDecision.scala, RecoveryTransition.scala, CoordinationFrame.scala, BerthTransitionEvidence.scala, GateSafetyFrame.scala, PriorityDirective.scala, DockingProposal.scala, AccessProposal.scala, UndockingProposal.scala, DockingDecisionFrame.scala, DockingAccessResult.scala, Base_Types.scala, RequestClassification_supervisor_process_request_classification_Containers.scala, VesselStatusAssessment_supervisor_process_vessel_status_assessment_Containers.scala, StationReportAssessment_supervisor_process_station_report_assessment_Containers.scala, ServiceActivityAssessment_supervisor_process_service_activity_assessment_Containers.scala, RequestAdmission_supervisor_process_request_admission_Containers.scala, AccessCoherence_supervisor_process_access_coherence_Containers.scala, DockingLifecycle_supervisor_process_docking_lifecycle_Containers.scala, BerthCommitment_supervisor_process_berth_commitment_Containers.scala, ServiceAccessGate_supervisor_process_service_access_gate_Containers.scala, RecoverySupervisor_supervisor_process_recovery_supervisor_Containers.scala, DockingActionEligibility_supervisor_process_docking_action_eligibility_Containers.scala, AccessActionEligibility_supervisor_process_access_action_eligibility_Containers.scala, UndockingActionEligibility_supervisor_process_undocking_action_eligibility_Containers.scala, DockingActionArbitration_supervisor_process_docking_action_arbitration_Containers.scala, ResultComposition_supervisor_process_result_composition_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printDocking_Access_SupervisorAccessRequestType(o: Docking_Access_Supervisor.AccessRequest.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.AccessRequest.NONE => "NONE"
        case Docking_Access_Supervisor.AccessRequest.INVALID => "INVALID"
        case Docking_Access_Supervisor.AccessRequest.DOCK_A => "DOCK_A"
        case Docking_Access_Supervisor.AccessRequest.DOCK_B => "DOCK_B"
        case Docking_Access_Supervisor.AccessRequest.ACCESS_A => "ACCESS_A"
        case Docking_Access_Supervisor.AccessRequest.ACCESS_B => "ACCESS_B"
        case Docking_Access_Supervisor.AccessRequest.UNDOCK_A => "UNDOCK_A"
        case Docking_Access_Supervisor.AccessRequest.UNDOCK_B => "UNDOCK_B"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.AccessRequest")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorAccessRequest_Payload(o: Docking_Access_Supervisor.AccessRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.AccessRequest_Payload""""),
        ("value", printDocking_Access_SupervisorAccessRequestType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorRequestOperationType(o: Docking_Access_Supervisor.RequestOperation.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.RequestOperation.NONE => "NONE"
        case Docking_Access_Supervisor.RequestOperation.DOCK => "DOCK"
        case Docking_Access_Supervisor.RequestOperation.ACCESS => "ACCESS"
        case Docking_Access_Supervisor.RequestOperation.UNDOCK => "UNDOCK"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.RequestOperation")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorRequestOperation_Payload(o: Docking_Access_Supervisor.RequestOperation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RequestOperation_Payload""""),
        ("value", printDocking_Access_SupervisorRequestOperationType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorCorrelationType(o: Docking_Access_Supervisor.Correlation.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.Correlation.NONE => "NONE"
        case Docking_Access_Supervisor.Correlation.A => "A"
        case Docking_Access_Supervisor.Correlation.B => "B"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.Correlation")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorCorrelation_Payload(o: Docking_Access_Supervisor.Correlation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.Correlation_Payload""""),
        ("value", printDocking_Access_SupervisorCorrelationType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorVesselStatusType(o: Docking_Access_Supervisor.VesselStatus.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.VesselStatus.INVALID => "INVALID"
        case Docking_Access_Supervisor.VesselStatus.ON_WARP => "ON_WARP"
        case Docking_Access_Supervisor.VesselStatus.IN_GRID => "IN_GRID"
        case Docking_Access_Supervisor.VesselStatus.DOCKED_A => "DOCKED_A"
        case Docking_Access_Supervisor.VesselStatus.DOCKED_B => "DOCKED_B"
        case Docking_Access_Supervisor.VesselStatus.DEPARTED_A => "DEPARTED_A"
        case Docking_Access_Supervisor.VesselStatus.DEPARTED_B => "DEPARTED_B"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.VesselStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorVesselStatus_Payload(o: Docking_Access_Supervisor.VesselStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.VesselStatus_Payload""""),
        ("value", printDocking_Access_SupervisorVesselStatusType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorVesselClassType(o: Docking_Access_Supervisor.VesselClass.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.VesselClass.INVALID => "INVALID"
        case Docking_Access_Supervisor.VesselClass.ON_WARP => "ON_WARP"
        case Docking_Access_Supervisor.VesselClass.IN_GRID => "IN_GRID"
        case Docking_Access_Supervisor.VesselClass.DOCKED => "DOCKED"
        case Docking_Access_Supervisor.VesselClass.DEPARTED => "DEPARTED"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.VesselClass")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorVesselClass_Payload(o: Docking_Access_Supervisor.VesselClass_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.VesselClass_Payload""""),
        ("value", printDocking_Access_SupervisorVesselClassType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorStationReportType(o: Docking_Access_Supervisor.StationReport.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.StationReport.NONE => "NONE"
        case Docking_Access_Supervisor.StationReport.INVALID => "INVALID"
        case Docking_Access_Supervisor.StationReport.AVAILABLE => "AVAILABLE"
        case Docking_Access_Supervisor.StationReport.CLEAR_A => "CLEAR_A"
        case Docking_Access_Supervisor.StationReport.CLEAR_B => "CLEAR_B"
        case Docking_Access_Supervisor.StationReport.SECURED_A => "SECURED_A"
        case Docking_Access_Supervisor.StationReport.SECURED_B => "SECURED_B"
        case Docking_Access_Supervisor.StationReport.DENIED => "DENIED"
        case Docking_Access_Supervisor.StationReport.RELEASED_A => "RELEASED_A"
        case Docking_Access_Supervisor.StationReport.RELEASED_B => "RELEASED_B"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.StationReport")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorStationReport_Payload(o: Docking_Access_Supervisor.StationReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.StationReport_Payload""""),
        ("value", printDocking_Access_SupervisorStationReportType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorStationProgressType(o: Docking_Access_Supervisor.StationProgress.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.StationProgress.NONE => "NONE"
        case Docking_Access_Supervisor.StationProgress.INVALID => "INVALID"
        case Docking_Access_Supervisor.StationProgress.AVAILABLE => "AVAILABLE"
        case Docking_Access_Supervisor.StationProgress.CLEAR => "CLEAR"
        case Docking_Access_Supervisor.StationProgress.SECURED => "SECURED"
        case Docking_Access_Supervisor.StationProgress.DENIED => "DENIED"
        case Docking_Access_Supervisor.StationProgress.RELEASED => "RELEASED"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.StationProgress")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorStationProgress_Payload(o: Docking_Access_Supervisor.StationProgress_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.StationProgress_Payload""""),
        ("value", printDocking_Access_SupervisorStationProgressType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorServiceActivityType(o: Docking_Access_Supervisor.ServiceActivity.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.ServiceActivity.INVALID => "INVALID"
        case Docking_Access_Supervisor.ServiceActivity.QUIESCENT => "QUIESCENT"
        case Docking_Access_Supervisor.ServiceActivity.ACTIVE => "ACTIVE"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.ServiceActivity")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorServiceActivity_Payload(o: Docking_Access_Supervisor.ServiceActivity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.ServiceActivity_Payload""""),
        ("value", printDocking_Access_SupervisorServiceActivityType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorServiceClassType(o: Docking_Access_Supervisor.ServiceClass.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.ServiceClass.INVALID => "INVALID"
        case Docking_Access_Supervisor.ServiceClass.QUIESCENT => "QUIESCENT"
        case Docking_Access_Supervisor.ServiceClass.ACTIVE => "ACTIVE"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.ServiceClass")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorServiceClass_Payload(o: Docking_Access_Supervisor.ServiceClass_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.ServiceClass_Payload""""),
        ("value", printDocking_Access_SupervisorServiceClassType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorLifecycleStateType(o: Docking_Access_Supervisor.LifecycleState.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.LifecycleState.CLEAR_IDLE => "CLEAR_IDLE"
        case Docking_Access_Supervisor.LifecycleState.AWAIT_CLEAR_A => "AWAIT_CLEAR_A"
        case Docking_Access_Supervisor.LifecycleState.AWAIT_CLEAR_B => "AWAIT_CLEAR_B"
        case Docking_Access_Supervisor.LifecycleState.AWAIT_DOCK_A => "AWAIT_DOCK_A"
        case Docking_Access_Supervisor.LifecycleState.AWAIT_DOCK_B => "AWAIT_DOCK_B"
        case Docking_Access_Supervisor.LifecycleState.AWAIT_SECURE_A => "AWAIT_SECURE_A"
        case Docking_Access_Supervisor.LifecycleState.AWAIT_SECURE_B => "AWAIT_SECURE_B"
        case Docking_Access_Supervisor.LifecycleState.DOCKED_CLOSED_A => "DOCKED_CLOSED_A"
        case Docking_Access_Supervisor.LifecycleState.DOCKED_CLOSED_B => "DOCKED_CLOSED_B"
        case Docking_Access_Supervisor.LifecycleState.ACCESS_OPEN_A => "ACCESS_OPEN_A"
        case Docking_Access_Supervisor.LifecycleState.ACCESS_OPEN_B => "ACCESS_OPEN_B"
        case Docking_Access_Supervisor.LifecycleState.AWAIT_RELEASE_A => "AWAIT_RELEASE_A"
        case Docking_Access_Supervisor.LifecycleState.AWAIT_RELEASE_B => "AWAIT_RELEASE_B"
        case Docking_Access_Supervisor.LifecycleState.AWAIT_DEPART_A => "AWAIT_DEPART_A"
        case Docking_Access_Supervisor.LifecycleState.AWAIT_DEPART_B => "AWAIT_DEPART_B"
        case Docking_Access_Supervisor.LifecycleState.DOCKED_REBASE => "DOCKED_REBASE"
        case Docking_Access_Supervisor.LifecycleState.QUARANTINED => "QUARANTINED"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.LifecycleState")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorLifecycleState_Payload(o: Docking_Access_Supervisor.LifecycleState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.LifecycleState_Payload""""),
        ("value", printDocking_Access_SupervisorLifecycleStateType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorRequestDispositionType(o: Docking_Access_Supervisor.RequestDisposition.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.RequestDisposition.NO_REQUEST => "NO_REQUEST"
        case Docking_Access_Supervisor.RequestDisposition.ACCEPTED => "ACCEPTED"
        case Docking_Access_Supervisor.RequestDisposition.DUPLICATE => "DUPLICATE"
        case Docking_Access_Supervisor.RequestDisposition.REJECTED => "REJECTED"
        case Docking_Access_Supervisor.RequestDisposition.DEFERRED => "DEFERRED"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.RequestDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorRequestDisposition_Payload(o: Docking_Access_Supervisor.RequestDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RequestDisposition_Payload""""),
        ("value", printDocking_Access_SupervisorRequestDispositionType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorControlEventType(o: Docking_Access_Supervisor.ControlEvent.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.ControlEvent.NONE => "NONE"
        case Docking_Access_Supervisor.ControlEvent.EMERGENCY_STOP => "EMERGENCY_STOP"
        case Docking_Access_Supervisor.ControlEvent.RESET => "RESET"
        case Docking_Access_Supervisor.ControlEvent.VERIFY_CLEAR => "VERIFY_CLEAR"
        case Docking_Access_Supervisor.ControlEvent.VERIFY_DOCKED => "VERIFY_DOCKED"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.ControlEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorControlEvent_Payload(o: Docking_Access_Supervisor.ControlEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.ControlEvent_Payload""""),
        ("value", printDocking_Access_SupervisorControlEventType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorBerthStateType(o: Docking_Access_Supervisor.BerthState.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.BerthState.UNKNOWN => "UNKNOWN"
        case Docking_Access_Supervisor.BerthState.AVAILABLE => "AVAILABLE"
        case Docking_Access_Supervisor.BerthState.RESERVED => "RESERVED"
        case Docking_Access_Supervisor.BerthState.SECURED => "SECURED"
        case Docking_Access_Supervisor.BerthState.RELEASED => "RELEASED"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.BerthState")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorBerthState_Payload(o: Docking_Access_Supervisor.BerthState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.BerthState_Payload""""),
        ("value", printDocking_Access_SupervisorBerthStateType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorGateStateType(o: Docking_Access_Supervisor.GateState.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.GateState.CLOSED => "CLOSED"
        case Docking_Access_Supervisor.GateState.OPEN => "OPEN"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.GateState")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorGateState_Payload(o: Docking_Access_Supervisor.GateState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.GateState_Payload""""),
        ("value", printDocking_Access_SupervisorGateStateType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorRecoveryStateType(o: Docking_Access_Supervisor.RecoveryState.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.RecoveryState.HEALTHY => "HEALTHY"
        case Docking_Access_Supervisor.RecoveryState.LATCHED => "LATCHED"
        case Docking_Access_Supervisor.RecoveryState.RECONCILING => "RECONCILING"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.RecoveryState")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorRecoveryState_Payload(o: Docking_Access_Supervisor.RecoveryState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RecoveryState_Payload""""),
        ("value", printDocking_Access_SupervisorRecoveryStateType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorRecoveryIntentType(o: Docking_Access_Supervisor.RecoveryIntent.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.RecoveryIntent.RETAIN => "RETAIN"
        case Docking_Access_Supervisor.RecoveryIntent.LATCH => "LATCH"
        case Docking_Access_Supervisor.RecoveryIntent.RECONCILE => "RECONCILE"
        case Docking_Access_Supervisor.RecoveryIntent.OPEN_CLEAR => "OPEN_CLEAR"
        case Docking_Access_Supervisor.RecoveryIntent.OPEN_DOCKED => "OPEN_DOCKED"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.RecoveryIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorRecoveryIntent_Payload(o: Docking_Access_Supervisor.RecoveryIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RecoveryIntent_Payload""""),
        ("value", printDocking_Access_SupervisorRecoveryIntentType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorLifecycleDirectiveType(o: Docking_Access_Supervisor.LifecycleDirective.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.LifecycleDirective.RETAIN => "RETAIN"
        case Docking_Access_Supervisor.LifecycleDirective.QUARANTINE => "QUARANTINE"
        case Docking_Access_Supervisor.LifecycleDirective.ANCHOR_CLEAR => "ANCHOR_CLEAR"
        case Docking_Access_Supervisor.LifecycleDirective.ANCHOR_DOCKED => "ANCHOR_DOCKED"
        case Docking_Access_Supervisor.LifecycleDirective.CLEARANCE => "CLEARANCE"
        case Docking_Access_Supervisor.LifecycleDirective.DOCKED => "DOCKED"
        case Docking_Access_Supervisor.LifecycleDirective.SECURED => "SECURED"
        case Docking_Access_Supervisor.LifecycleDirective.OPEN_ACCESS => "OPEN_ACCESS"
        case Docking_Access_Supervisor.LifecycleDirective.CLOSE_ACCESS => "CLOSE_ACCESS"
        case Docking_Access_Supervisor.LifecycleDirective.RELEASED => "RELEASED"
        case Docking_Access_Supervisor.LifecycleDirective.DEPARTED => "DEPARTED"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.LifecycleDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorLifecycleDirective_Payload(o: Docking_Access_Supervisor.LifecycleDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.LifecycleDirective_Payload""""),
        ("value", printDocking_Access_SupervisorLifecycleDirectiveType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorDecisionContextType(o: Docking_Access_Supervisor.DecisionContext.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.DecisionContext.CLEAR => "CLEAR"
        case Docking_Access_Supervisor.DecisionContext.DOCKING => "DOCKING"
        case Docking_Access_Supervisor.DecisionContext.DOCKED_CLOSED => "DOCKED_CLOSED"
        case Docking_Access_Supervisor.DecisionContext.ACCESS_OPEN => "ACCESS_OPEN"
        case Docking_Access_Supervisor.DecisionContext.UNDOCKING => "UNDOCKING"
        case Docking_Access_Supervisor.DecisionContext.QUARANTINED => "QUARANTINED"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.DecisionContext")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorDecisionContext_Payload(o: Docking_Access_Supervisor.DecisionContext_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DecisionContext_Payload""""),
        ("value", printDocking_Access_SupervisorDecisionContextType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorBerthEvidenceKindType(o: Docking_Access_Supervisor.BerthEvidenceKind.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.BerthEvidenceKind.NO_EVENT => "NO_EVENT"
        case Docking_Access_Supervisor.BerthEvidenceKind.DOMINANT_FAULT => "DOMINANT_FAULT"
        case Docking_Access_Supervisor.BerthEvidenceKind.VERIFIED_CLEAR_ANCHOR => "VERIFIED_CLEAR_ANCHOR"
        case Docking_Access_Supervisor.BerthEvidenceKind.VERIFIED_DOCKED_ANCHOR => "VERIFIED_DOCKED_ANCHOR"
        case Docking_Access_Supervisor.BerthEvidenceKind.STATION_AVAILABLE => "STATION_AVAILABLE"
        case Docking_Access_Supervisor.BerthEvidenceKind.STATION_CLEARANCE => "STATION_CLEARANCE"
        case Docking_Access_Supervisor.BerthEvidenceKind.STATION_SECURED => "STATION_SECURED"
        case Docking_Access_Supervisor.BerthEvidenceKind.STATION_RELEASED => "STATION_RELEASED"
        case Docking_Access_Supervisor.BerthEvidenceKind.DEPARTURE_COMPLETION => "DEPARTURE_COMPLETION"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.BerthEvidenceKind")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorBerthEvidenceKind_Payload(o: Docking_Access_Supervisor.BerthEvidenceKind_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.BerthEvidenceKind_Payload""""),
        ("value", printDocking_Access_SupervisorBerthEvidenceKindType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorGateDirectiveType(o: Docking_Access_Supervisor.GateDirective.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.GateDirective.RETAIN => "RETAIN"
        case Docking_Access_Supervisor.GateDirective.FORCE_CLOSE => "FORCE_CLOSE"
        case Docking_Access_Supervisor.GateDirective.OPEN_SAFE => "OPEN_SAFE"
        case Docking_Access_Supervisor.GateDirective.ORDERED_CLOSE => "ORDERED_CLOSE"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.GateDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorGateDirective_Payload(o: Docking_Access_Supervisor.GateDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.GateDirective_Payload""""),
        ("value", printDocking_Access_SupervisorGateDirectiveType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorPriorityKindType(o: Docking_Access_Supervisor.PriorityKind.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.PriorityKind.ORDINARY => "ORDINARY"
        case Docking_Access_Supervisor.PriorityKind.REVOKE => "REVOKE"
        case Docking_Access_Supervisor.PriorityKind.DEPARTURE_COMPLETE => "DEPARTURE_COMPLETE"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.PriorityKind")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorPriorityKind_Payload(o: Docking_Access_Supervisor.PriorityKind_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.PriorityKind_Payload""""),
        ("value", printDocking_Access_SupervisorPriorityKindType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorSupervisoryActionType(o: Docking_Access_Supervisor.SupervisoryAction.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.SupervisoryAction.HOLD => "HOLD"
        case Docking_Access_Supervisor.SupervisoryAction.REQUEST_DOCK_CLEARANCE => "REQUEST_DOCK_CLEARANCE"
        case Docking_Access_Supervisor.SupervisoryAction.AUTHORIZE_DOCK_APPROACH => "AUTHORIZE_DOCK_APPROACH"
        case Docking_Access_Supervisor.SupervisoryAction.OPEN_SERVICE_ACCESS => "OPEN_SERVICE_ACCESS"
        case Docking_Access_Supervisor.SupervisoryAction.CLOSE_SERVICE_ACCESS => "CLOSE_SERVICE_ACCESS"
        case Docking_Access_Supervisor.SupervisoryAction.REQUEST_UNDOCK_RELEASE => "REQUEST_UNDOCK_RELEASE"
        case Docking_Access_Supervisor.SupervisoryAction.AUTHORIZE_UNDOCK => "AUTHORIZE_UNDOCK"
        case Docking_Access_Supervisor.SupervisoryAction.REVOKE_SERVICE_ACCESS => "REVOKE_SERVICE_ACCESS"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.SupervisoryAction")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorSupervisoryAction_Payload(o: Docking_Access_Supervisor.SupervisoryAction_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.SupervisoryAction_Payload""""),
        ("value", printDocking_Access_SupervisorSupervisoryActionType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorDecisionCauseType(o: Docking_Access_Supervisor.DecisionCause.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.DecisionCause.FAULT_OR_RECOVERY => "FAULT_OR_RECOVERY"
        case Docking_Access_Supervisor.DecisionCause.DEPARTURE_CONFIRMATION => "DEPARTURE_CONFIRMATION"
        case Docking_Access_Supervisor.DecisionCause.UNDOCK_SEQUENCE => "UNDOCK_SEQUENCE"
        case Docking_Access_Supervisor.DecisionCause.DOCKING_PROGRESS => "DOCKING_PROGRESS"
        case Docking_Access_Supervisor.DecisionCause.ACCESS_REQUEST => "ACCESS_REQUEST"
        case Docking_Access_Supervisor.DecisionCause.NEW_DOCK_REQUEST => "NEW_DOCK_REQUEST"
        case Docking_Access_Supervisor.DecisionCause.NO_ELIGIBLE_ACTION => "NO_ELIGIBLE_ACTION"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.DecisionCause")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorDecisionCause_Payload(o: Docking_Access_Supervisor.DecisionCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DecisionCause_Payload""""),
        ("value", printDocking_Access_SupervisorDecisionCauseType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorPublicModeType(o: Docking_Access_Supervisor.PublicMode.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.PublicMode.HOLDING => "HOLDING"
        case Docking_Access_Supervisor.PublicMode.DOCKING => "DOCKING"
        case Docking_Access_Supervisor.PublicMode.ACCESSIBLE => "ACCESSIBLE"
        case Docking_Access_Supervisor.PublicMode.UNDOCKING => "UNDOCKING"
        case Docking_Access_Supervisor.PublicMode.QUARANTINED => "QUARANTINED"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.PublicMode")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorPublicMode_Payload(o: Docking_Access_Supervisor.PublicMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.PublicMode_Payload""""),
        ("value", printDocking_Access_SupervisorPublicModeType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorAccessStatusType(o: Docking_Access_Supervisor.AccessStatus.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.AccessStatus.CLOSED => "CLOSED"
        case Docking_Access_Supervisor.AccessStatus.OPEN => "OPEN"
        case Docking_Access_Supervisor.AccessStatus.REVOKED => "REVOKED"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.AccessStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorAccessStatus_Payload(o: Docking_Access_Supervisor.AccessStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.AccessStatus_Payload""""),
        ("value", printDocking_Access_SupervisorAccessStatusType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingOutcomeType(o: Docking_Access_Supervisor.DockingOutcome.Type): ST = {
      val value: String = o match {
        case Docking_Access_Supervisor.DockingOutcome.NONE => "NONE"
        case Docking_Access_Supervisor.DockingOutcome.DOCKING_ACTIVE => "DOCKING_ACTIVE"
        case Docking_Access_Supervisor.DockingOutcome.DOCKED_ACCESS_READY => "DOCKED_ACCESS_READY"
        case Docking_Access_Supervisor.DockingOutcome.ACCESS_ACTIVE => "ACCESS_ACTIVE"
        case Docking_Access_Supervisor.DockingOutcome.UNDOCKING_ACTIVE => "UNDOCKING_ACTIVE"
        case Docking_Access_Supervisor.DockingOutcome.DEPARTURE_COMPLETE => "DEPARTURE_COMPLETE"
        case Docking_Access_Supervisor.DockingOutcome.RECOVERY_REQUIRED => "RECOVERY_REQUIRED"
      }
      return printObject(ISZ(
        ("type", printString("Docking_Access_Supervisor.DockingOutcome")),
        ("value", printString(value))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingOutcome_Payload(o: Docking_Access_Supervisor.DockingOutcome_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingOutcome_Payload""""),
        ("value", printDocking_Access_SupervisorDockingOutcomeType(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorRequestFacts(o: Docking_Access_Supervisor.RequestFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RequestFacts""""),
        ("present", printB(o.present)),
        ("usable", printB(o.usable)),
        ("operation", printDocking_Access_SupervisorRequestOperationType(o.operation)),
        ("correlation", printDocking_Access_SupervisorCorrelationType(o.correlation)),
        ("startsAuthorization", printB(o.startsAuthorization))
      ))
    }

    @pure def printDocking_Access_SupervisorRequestFacts_Payload(o: Docking_Access_Supervisor.RequestFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RequestFacts_Payload""""),
        ("value", printDocking_Access_SupervisorRequestFacts(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorVesselFacts(o: Docking_Access_Supervisor.VesselFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.VesselFacts""""),
        ("usable", printB(o.usable)),
        ("lifecycleClass", printDocking_Access_SupervisorVesselClassType(o.lifecycleClass)),
        ("approachReady", printB(o.approachReady)),
        ("docked", printB(o.docked)),
        ("departed", printB(o.departed)),
        ("correlation", printDocking_Access_SupervisorCorrelationType(o.correlation))
      ))
    }

    @pure def printDocking_Access_SupervisorVesselFacts_Payload(o: Docking_Access_Supervisor.VesselFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.VesselFacts_Payload""""),
        ("value", printDocking_Access_SupervisorVesselFacts(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorStationFacts(o: Docking_Access_Supervisor.StationFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.StationFacts""""),
        ("present", printB(o.present)),
        ("usable", printB(o.usable)),
        ("progress", printDocking_Access_SupervisorStationProgressType(o.progress)),
        ("available", printB(o.available)),
        ("denied", printB(o.denied)),
        ("correlation", printDocking_Access_SupervisorCorrelationType(o.correlation))
      ))
    }

    @pure def printDocking_Access_SupervisorStationFacts_Payload(o: Docking_Access_Supervisor.StationFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.StationFacts_Payload""""),
        ("value", printDocking_Access_SupervisorStationFacts(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorServiceFacts(o: Docking_Access_Supervisor.ServiceFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.ServiceFacts""""),
        ("usable", printB(o.usable)),
        ("serviceClass", printDocking_Access_SupervisorServiceClassType(o.serviceClass)),
        ("quiescent", printB(o.quiescent)),
        ("active", printB(o.active)),
        ("requestPermitted", printB(o.requestPermitted))
      ))
    }

    @pure def printDocking_Access_SupervisorServiceFacts_Payload(o: Docking_Access_Supervisor.ServiceFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.ServiceFacts_Payload""""),
        ("value", printDocking_Access_SupervisorServiceFacts(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorAdmissionGuard(o: Docking_Access_Supervisor.AdmissionGuard): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.AdmissionGuard""""),
        ("open", printB(o.open)),
        ("lifecycle", printDocking_Access_SupervisorLifecycleStateType(o.lifecycle)),
        ("correlation", printDocking_Access_SupervisorCorrelationType(o.correlation)),
        ("berthAvailable", printB(o.berthAvailable)),
        ("gateClosed", printB(o.gateClosed)),
        ("recoveryHealthy", printB(o.recoveryHealthy))
      ))
    }

    @pure def printDocking_Access_SupervisorAdmissionGuard_Payload(o: Docking_Access_Supervisor.AdmissionGuard_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.AdmissionGuard_Payload""""),
        ("value", printDocking_Access_SupervisorAdmissionGuard(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorPriorLifecycleView(o: Docking_Access_Supervisor.PriorLifecycleView): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.PriorLifecycleView""""),
        ("lifecycle", printDocking_Access_SupervisorLifecycleStateType(o.lifecycle)),
        ("correlation", printDocking_Access_SupervisorCorrelationType(o.correlation))
      ))
    }

    @pure def printDocking_Access_SupervisorPriorLifecycleView_Payload(o: Docking_Access_Supervisor.PriorLifecycleView_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.PriorLifecycleView_Payload""""),
        ("value", printDocking_Access_SupervisorPriorLifecycleView(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorAdmissionDecision(o: Docking_Access_Supervisor.AdmissionDecision): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.AdmissionDecision""""),
        ("disposition", printDocking_Access_SupervisorRequestDispositionType(o.disposition)),
        ("operation", printDocking_Access_SupervisorRequestOperationType(o.operation)),
        ("correlation", printDocking_Access_SupervisorCorrelationType(o.correlation)),
        ("accepted", printB(o.accepted)),
        ("startsAuthorization", printB(o.startsAuthorization))
      ))
    }

    @pure def printDocking_Access_SupervisorAdmissionDecision_Payload(o: Docking_Access_Supervisor.AdmissionDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.AdmissionDecision_Payload""""),
        ("value", printDocking_Access_SupervisorAdmissionDecision(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorRecoveryTransition(o: Docking_Access_Supervisor.RecoveryTransition): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RecoveryTransition""""),
        ("intent", printDocking_Access_SupervisorRecoveryIntentType(o.intent)),
        ("fault", printB(o.fault)),
        ("verifiedAnchor", printB(o.verifiedAnchor))
      ))
    }

    @pure def printDocking_Access_SupervisorRecoveryTransition_Payload(o: Docking_Access_Supervisor.RecoveryTransition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RecoveryTransition_Payload""""),
        ("value", printDocking_Access_SupervisorRecoveryTransition(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorCoordinationFrame(o: Docking_Access_Supervisor.CoordinationFrame): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.CoordinationFrame""""),
        ("directive", printDocking_Access_SupervisorLifecycleDirectiveType(o.directive)),
        ("correlation", printDocking_Access_SupervisorCorrelationType(o.correlation)),
        ("qualified", printB(o.qualified)),
        ("decisionContext", printDocking_Access_SupervisorDecisionContextType(o.decisionContext))
      ))
    }

    @pure def printDocking_Access_SupervisorCoordinationFrame_Payload(o: Docking_Access_Supervisor.CoordinationFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.CoordinationFrame_Payload""""),
        ("value", printDocking_Access_SupervisorCoordinationFrame(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorBerthTransitionEvidence(o: Docking_Access_Supervisor.BerthTransitionEvidence): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.BerthTransitionEvidence""""),
        ("eventKind", printDocking_Access_SupervisorBerthEvidenceKindType(o.eventKind)),
        ("correlation", printDocking_Access_SupervisorCorrelationType(o.correlation)),
        ("qualified", printB(o.qualified))
      ))
    }

    @pure def printDocking_Access_SupervisorBerthTransitionEvidence_Payload(o: Docking_Access_Supervisor.BerthTransitionEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.BerthTransitionEvidence_Payload""""),
        ("value", printDocking_Access_SupervisorBerthTransitionEvidence(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorGateSafetyFrame(o: Docking_Access_Supervisor.GateSafetyFrame): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.GateSafetyFrame""""),
        ("directive", printDocking_Access_SupervisorGateDirectiveType(o.directive)),
        ("safeToOpen", printB(o.safeToOpen)),
        ("decisionContext", printDocking_Access_SupervisorDecisionContextType(o.decisionContext))
      ))
    }

    @pure def printDocking_Access_SupervisorGateSafetyFrame_Payload(o: Docking_Access_Supervisor.GateSafetyFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.GateSafetyFrame_Payload""""),
        ("value", printDocking_Access_SupervisorGateSafetyFrame(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorPriorityDirective(o: Docking_Access_Supervisor.PriorityDirective): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.PriorityDirective""""),
        ("priority", printDocking_Access_SupervisorPriorityKindType(o.priority)),
        ("correlation", printDocking_Access_SupervisorCorrelationType(o.correlation)),
        ("decisionContext", printDocking_Access_SupervisorDecisionContextType(o.decisionContext))
      ))
    }

    @pure def printDocking_Access_SupervisorPriorityDirective_Payload(o: Docking_Access_Supervisor.PriorityDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.PriorityDirective_Payload""""),
        ("value", printDocking_Access_SupervisorPriorityDirective(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingProposal(o: Docking_Access_Supervisor.DockingProposal): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingProposal""""),
        ("applicable", printB(o.applicable)),
        ("proposedAction", printDocking_Access_SupervisorSupervisoryActionType(o.proposedAction)),
        ("cause", printDocking_Access_SupervisorDecisionCauseType(o.cause)),
        ("correlation", printDocking_Access_SupervisorCorrelationType(o.correlation)),
        ("decisionContext", printDocking_Access_SupervisorDecisionContextType(o.decisionContext))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingProposal_Payload(o: Docking_Access_Supervisor.DockingProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingProposal_Payload""""),
        ("value", printDocking_Access_SupervisorDockingProposal(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorAccessProposal(o: Docking_Access_Supervisor.AccessProposal): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.AccessProposal""""),
        ("applicable", printB(o.applicable)),
        ("proposedAction", printDocking_Access_SupervisorSupervisoryActionType(o.proposedAction)),
        ("cause", printDocking_Access_SupervisorDecisionCauseType(o.cause)),
        ("correlation", printDocking_Access_SupervisorCorrelationType(o.correlation)),
        ("decisionContext", printDocking_Access_SupervisorDecisionContextType(o.decisionContext))
      ))
    }

    @pure def printDocking_Access_SupervisorAccessProposal_Payload(o: Docking_Access_Supervisor.AccessProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.AccessProposal_Payload""""),
        ("value", printDocking_Access_SupervisorAccessProposal(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorUndockingProposal(o: Docking_Access_Supervisor.UndockingProposal): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.UndockingProposal""""),
        ("applicable", printB(o.applicable)),
        ("proposedAction", printDocking_Access_SupervisorSupervisoryActionType(o.proposedAction)),
        ("cause", printDocking_Access_SupervisorDecisionCauseType(o.cause)),
        ("correlation", printDocking_Access_SupervisorCorrelationType(o.correlation)),
        ("decisionContext", printDocking_Access_SupervisorDecisionContextType(o.decisionContext))
      ))
    }

    @pure def printDocking_Access_SupervisorUndockingProposal_Payload(o: Docking_Access_Supervisor.UndockingProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.UndockingProposal_Payload""""),
        ("value", printDocking_Access_SupervisorUndockingProposal(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingDecisionFrame(o: Docking_Access_Supervisor.DockingDecisionFrame): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingDecisionFrame""""),
        ("proposedAction", printDocking_Access_SupervisorSupervisoryActionType(o.proposedAction)),
        ("cause", printDocking_Access_SupervisorDecisionCauseType(o.cause)),
        ("correlation", printDocking_Access_SupervisorCorrelationType(o.correlation)),
        ("decisionContext", printDocking_Access_SupervisorDecisionContextType(o.decisionContext))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingDecisionFrame_Payload(o: Docking_Access_Supervisor.DockingDecisionFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingDecisionFrame_Payload""""),
        ("value", printDocking_Access_SupervisorDockingDecisionFrame(o.value))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingAccessResult(o: Docking_Access_Supervisor.DockingAccessResult): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingAccessResult""""),
        ("proposedAction", printDocking_Access_SupervisorSupervisoryActionType(o.proposedAction)),
        ("cause", printDocking_Access_SupervisorDecisionCauseType(o.cause)),
        ("mode", printDocking_Access_SupervisorPublicModeType(o.mode)),
        ("correlation", printDocking_Access_SupervisorCorrelationType(o.correlation)),
        ("disposition", printDocking_Access_SupervisorRequestDispositionType(o.disposition)),
        ("status", printDocking_Access_SupervisorAccessStatusType(o.status)),
        ("outcome", printDocking_Access_SupervisorDockingOutcomeType(o.outcome))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingAccessResult_Payload(o: Docking_Access_Supervisor.DockingAccessResult_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingAccessResult_Payload""""),
        ("value", printDocking_Access_SupervisorDockingAccessResult(o.value))
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

    @pure def printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P => return printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS => return printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P""""),
        ("api_access_request", printDocking_Access_SupervisorAccessRequestType(o.api_access_request))
      ))
    }

    @pure def printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS""""),
        ("api_access_request", printDocking_Access_SupervisorAccessRequestType(o.api_access_request))
      ))
    }

    @pure def printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P => return printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS => return printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P""""),
        ("api_request_facts", printDocking_Access_SupervisorRequestFacts(o.api_request_facts))
      ))
    }

    @pure def printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS""""),
        ("api_request_facts", printDocking_Access_SupervisorRequestFacts(o.api_request_facts))
      ))
    }

    @pure def printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P => return printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS => return printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P""""),
        ("api_vessel_status", printDocking_Access_SupervisorVesselStatusType(o.api_vessel_status))
      ))
    }

    @pure def printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS""""),
        ("api_vessel_status", printDocking_Access_SupervisorVesselStatusType(o.api_vessel_status))
      ))
    }

    @pure def printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P => return printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS => return printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P""""),
        ("api_vessel_facts", printDocking_Access_SupervisorVesselFacts(o.api_vessel_facts)),
        ("api_vessel_readiness", printDocking_Access_SupervisorVesselFacts(o.api_vessel_readiness))
      ))
    }

    @pure def printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS""""),
        ("api_vessel_facts", printDocking_Access_SupervisorVesselFacts(o.api_vessel_facts)),
        ("api_vessel_readiness", printDocking_Access_SupervisorVesselFacts(o.api_vessel_readiness))
      ))
    }

    @pure def printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P => return printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS => return printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P""""),
        ("api_station_report", printDocking_Access_SupervisorStationReportType(o.api_station_report))
      ))
    }

    @pure def printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS""""),
        ("api_station_report", printDocking_Access_SupervisorStationReportType(o.api_station_report))
      ))
    }

    @pure def printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P => return printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS => return printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P""""),
        ("api_station_facts", printDocking_Access_SupervisorStationFacts(o.api_station_facts))
      ))
    }

    @pure def printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS""""),
        ("api_station_facts", printDocking_Access_SupervisorStationFacts(o.api_station_facts))
      ))
    }

    @pure def printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P => return printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS => return printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P""""),
        ("api_service_activity", printDocking_Access_SupervisorServiceActivityType(o.api_service_activity))
      ))
    }

    @pure def printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS""""),
        ("api_service_activity", printDocking_Access_SupervisorServiceActivityType(o.api_service_activity))
      ))
    }

    @pure def printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P => return printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS => return printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P""""),
        ("api_service_facts", printDocking_Access_SupervisorServiceFacts(o.api_service_facts)),
        ("api_service_readiness", printDocking_Access_SupervisorServiceFacts(o.api_service_readiness))
      ))
    }

    @pure def printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS""""),
        ("api_service_facts", printDocking_Access_SupervisorServiceFacts(o.api_service_facts)),
        ("api_service_readiness", printDocking_Access_SupervisorServiceFacts(o.api_service_readiness))
      ))
    }

    @pure def printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P => return printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS => return printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P""""),
        ("api_admission_guard", printDocking_Access_SupervisorAdmissionGuard(o.api_admission_guard)),
        ("api_request_facts", printDocking_Access_SupervisorRequestFacts(o.api_request_facts)),
        ("api_service_readiness", printDocking_Access_SupervisorServiceFacts(o.api_service_readiness)),
        ("api_vessel_readiness", printDocking_Access_SupervisorVesselFacts(o.api_vessel_readiness))
      ))
    }

    @pure def printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS""""),
        ("api_admission_guard", printDocking_Access_SupervisorAdmissionGuard(o.api_admission_guard)),
        ("api_request_facts", printDocking_Access_SupervisorRequestFacts(o.api_request_facts)),
        ("api_service_readiness", printDocking_Access_SupervisorServiceFacts(o.api_service_readiness)),
        ("api_vessel_readiness", printDocking_Access_SupervisorVesselFacts(o.api_vessel_readiness))
      ))
    }

    @pure def printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P => return printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS => return printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P""""),
        ("api_access_admission", printDocking_Access_SupervisorAdmissionDecision(o.api_access_admission)),
        ("api_docking_admission", printDocking_Access_SupervisorAdmissionDecision(o.api_docking_admission)),
        ("api_gate_admission", printDocking_Access_SupervisorAdmissionDecision(o.api_gate_admission)),
        ("api_lifecycle_admission", printDocking_Access_SupervisorAdmissionDecision(o.api_lifecycle_admission)),
        ("api_request_disposition", printDocking_Access_SupervisorRequestDispositionType(o.api_request_disposition)),
        ("api_undocking_admission", printDocking_Access_SupervisorAdmissionDecision(o.api_undocking_admission))
      ))
    }

    @pure def printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS""""),
        ("api_access_admission", printDocking_Access_SupervisorAdmissionDecision(o.api_access_admission)),
        ("api_docking_admission", printDocking_Access_SupervisorAdmissionDecision(o.api_docking_admission)),
        ("api_gate_admission", printDocking_Access_SupervisorAdmissionDecision(o.api_gate_admission)),
        ("api_lifecycle_admission", printDocking_Access_SupervisorAdmissionDecision(o.api_lifecycle_admission)),
        ("api_request_disposition", printDocking_Access_SupervisorRequestDispositionType(o.api_request_disposition)),
        ("api_undocking_admission", printDocking_Access_SupervisorAdmissionDecision(o.api_undocking_admission))
      ))
    }

    @pure def printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P => return printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS => return printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P""""),
        ("api_control_event", printDocking_Access_SupervisorControlEventType(o.api_control_event)),
        ("api_prior_berth_state", printDocking_Access_SupervisorBerthStateType(o.api_prior_berth_state)),
        ("api_prior_gate_state", printDocking_Access_SupervisorGateStateType(o.api_prior_gate_state)),
        ("api_prior_lifecycle_view", printDocking_Access_SupervisorPriorLifecycleView(o.api_prior_lifecycle_view)),
        ("api_prior_recovery_state", printDocking_Access_SupervisorRecoveryStateType(o.api_prior_recovery_state)),
        ("api_service_facts", printDocking_Access_SupervisorServiceFacts(o.api_service_facts)),
        ("api_station_facts", printDocking_Access_SupervisorStationFacts(o.api_station_facts)),
        ("api_vessel_facts", printDocking_Access_SupervisorVesselFacts(o.api_vessel_facts))
      ))
    }

    @pure def printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS""""),
        ("api_control_event", printDocking_Access_SupervisorControlEventType(o.api_control_event)),
        ("api_prior_berth_state", printDocking_Access_SupervisorBerthStateType(o.api_prior_berth_state)),
        ("api_prior_gate_state", printDocking_Access_SupervisorGateStateType(o.api_prior_gate_state)),
        ("api_prior_lifecycle_view", printDocking_Access_SupervisorPriorLifecycleView(o.api_prior_lifecycle_view)),
        ("api_prior_recovery_state", printDocking_Access_SupervisorRecoveryStateType(o.api_prior_recovery_state)),
        ("api_service_facts", printDocking_Access_SupervisorServiceFacts(o.api_service_facts)),
        ("api_station_facts", printDocking_Access_SupervisorStationFacts(o.api_station_facts)),
        ("api_vessel_facts", printDocking_Access_SupervisorVesselFacts(o.api_vessel_facts))
      ))
    }

    @pure def printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P => return printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS => return printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P""""),
        ("api_access_frame", printDocking_Access_SupervisorCoordinationFrame(o.api_access_frame)),
        ("api_admission_guard", printDocking_Access_SupervisorAdmissionGuard(o.api_admission_guard)),
        ("api_berth_transition_evidence", printDocking_Access_SupervisorBerthTransitionEvidence(o.api_berth_transition_evidence)),
        ("api_docking_frame", printDocking_Access_SupervisorCoordinationFrame(o.api_docking_frame)),
        ("api_gate_safety_frame", printDocking_Access_SupervisorGateSafetyFrame(o.api_gate_safety_frame)),
        ("api_lifecycle_frame", printDocking_Access_SupervisorCoordinationFrame(o.api_lifecycle_frame)),
        ("api_priority_directive", printDocking_Access_SupervisorPriorityDirective(o.api_priority_directive)),
        ("api_recovery_transition", printDocking_Access_SupervisorRecoveryTransition(o.api_recovery_transition)),
        ("api_undocking_frame", printDocking_Access_SupervisorCoordinationFrame(o.api_undocking_frame))
      ))
    }

    @pure def printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS""""),
        ("api_access_frame", printDocking_Access_SupervisorCoordinationFrame(o.api_access_frame)),
        ("api_admission_guard", printDocking_Access_SupervisorAdmissionGuard(o.api_admission_guard)),
        ("api_berth_transition_evidence", printDocking_Access_SupervisorBerthTransitionEvidence(o.api_berth_transition_evidence)),
        ("api_docking_frame", printDocking_Access_SupervisorCoordinationFrame(o.api_docking_frame)),
        ("api_gate_safety_frame", printDocking_Access_SupervisorGateSafetyFrame(o.api_gate_safety_frame)),
        ("api_lifecycle_frame", printDocking_Access_SupervisorCoordinationFrame(o.api_lifecycle_frame)),
        ("api_priority_directive", printDocking_Access_SupervisorPriorityDirective(o.api_priority_directive)),
        ("api_recovery_transition", printDocking_Access_SupervisorRecoveryTransition(o.api_recovery_transition)),
        ("api_undocking_frame", printDocking_Access_SupervisorCoordinationFrame(o.api_undocking_frame))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P => return printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS => return printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P""""),
        ("api_admission_decision", printDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)),
        ("api_lifecycle_frame", printDocking_Access_SupervisorCoordinationFrame(o.api_lifecycle_frame))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS""""),
        ("api_admission_decision", printDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)),
        ("api_lifecycle_frame", printDocking_Access_SupervisorCoordinationFrame(o.api_lifecycle_frame))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P => return printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS => return printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P""""),
        ("api_prior_lifecycle_view", printDocking_Access_SupervisorPriorLifecycleView(o.api_prior_lifecycle_view))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS""""),
        ("api_prior_lifecycle_view", printDocking_Access_SupervisorPriorLifecycleView(o.api_prior_lifecycle_view))
      ))
    }

    @pure def printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P => return printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS => return printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P""""),
        ("api_berth_transition_evidence", printDocking_Access_SupervisorBerthTransitionEvidence(o.api_berth_transition_evidence))
      ))
    }

    @pure def printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS""""),
        ("api_berth_transition_evidence", printDocking_Access_SupervisorBerthTransitionEvidence(o.api_berth_transition_evidence))
      ))
    }

    @pure def printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P => return printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS => return printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P""""),
        ("api_prior_berth_state", printDocking_Access_SupervisorBerthStateType(o.api_prior_berth_state))
      ))
    }

    @pure def printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS""""),
        ("api_prior_berth_state", printDocking_Access_SupervisorBerthStateType(o.api_prior_berth_state))
      ))
    }

    @pure def printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P => return printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS => return printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P""""),
        ("api_admission_decision", printDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)),
        ("api_gate_safety_frame", printDocking_Access_SupervisorGateSafetyFrame(o.api_gate_safety_frame))
      ))
    }

    @pure def printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS""""),
        ("api_admission_decision", printDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)),
        ("api_gate_safety_frame", printDocking_Access_SupervisorGateSafetyFrame(o.api_gate_safety_frame))
      ))
    }

    @pure def printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P => return printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS => return printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P""""),
        ("api_prior_gate_state", printDocking_Access_SupervisorGateStateType(o.api_prior_gate_state))
      ))
    }

    @pure def printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS""""),
        ("api_prior_gate_state", printDocking_Access_SupervisorGateStateType(o.api_prior_gate_state))
      ))
    }

    @pure def printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P => return printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS => return printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P""""),
        ("api_recovery_transition", printDocking_Access_SupervisorRecoveryTransition(o.api_recovery_transition))
      ))
    }

    @pure def printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS""""),
        ("api_recovery_transition", printDocking_Access_SupervisorRecoveryTransition(o.api_recovery_transition))
      ))
    }

    @pure def printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P => return printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS => return printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P""""),
        ("api_prior_recovery_state", printDocking_Access_SupervisorRecoveryStateType(o.api_prior_recovery_state))
      ))
    }

    @pure def printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS""""),
        ("api_prior_recovery_state", printDocking_Access_SupervisorRecoveryStateType(o.api_prior_recovery_state))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P => return printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS => return printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P""""),
        ("api_admission_decision", printDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)),
        ("api_docking_frame", printDocking_Access_SupervisorCoordinationFrame(o.api_docking_frame))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS""""),
        ("api_admission_decision", printDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)),
        ("api_docking_frame", printDocking_Access_SupervisorCoordinationFrame(o.api_docking_frame))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P => return printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS => return printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P""""),
        ("api_docking_proposal", printDocking_Access_SupervisorDockingProposal(o.api_docking_proposal))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS""""),
        ("api_docking_proposal", printDocking_Access_SupervisorDockingProposal(o.api_docking_proposal))
      ))
    }

    @pure def printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P => return printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS => return printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P""""),
        ("api_access_frame", printDocking_Access_SupervisorCoordinationFrame(o.api_access_frame)),
        ("api_admission_decision", printDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision))
      ))
    }

    @pure def printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS""""),
        ("api_access_frame", printDocking_Access_SupervisorCoordinationFrame(o.api_access_frame)),
        ("api_admission_decision", printDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision))
      ))
    }

    @pure def printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P => return printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS => return printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P""""),
        ("api_access_proposal", printDocking_Access_SupervisorAccessProposal(o.api_access_proposal))
      ))
    }

    @pure def printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS""""),
        ("api_access_proposal", printDocking_Access_SupervisorAccessProposal(o.api_access_proposal))
      ))
    }

    @pure def printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P => return printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS => return printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P""""),
        ("api_admission_decision", printDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)),
        ("api_undocking_frame", printDocking_Access_SupervisorCoordinationFrame(o.api_undocking_frame))
      ))
    }

    @pure def printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS""""),
        ("api_admission_decision", printDocking_Access_SupervisorAdmissionDecision(o.api_admission_decision)),
        ("api_undocking_frame", printDocking_Access_SupervisorCoordinationFrame(o.api_undocking_frame))
      ))
    }

    @pure def printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P => return printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS => return printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P""""),
        ("api_undocking_proposal", printDocking_Access_SupervisorUndockingProposal(o.api_undocking_proposal))
      ))
    }

    @pure def printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS""""),
        ("api_undocking_proposal", printDocking_Access_SupervisorUndockingProposal(o.api_undocking_proposal))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P => return printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS => return printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P""""),
        ("api_access_proposal", printDocking_Access_SupervisorAccessProposal(o.api_access_proposal)),
        ("api_docking_proposal", printDocking_Access_SupervisorDockingProposal(o.api_docking_proposal)),
        ("api_priority_directive", printDocking_Access_SupervisorPriorityDirective(o.api_priority_directive)),
        ("api_undocking_proposal", printDocking_Access_SupervisorUndockingProposal(o.api_undocking_proposal))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS""""),
        ("api_access_proposal", printDocking_Access_SupervisorAccessProposal(o.api_access_proposal)),
        ("api_docking_proposal", printDocking_Access_SupervisorDockingProposal(o.api_docking_proposal)),
        ("api_priority_directive", printDocking_Access_SupervisorPriorityDirective(o.api_priority_directive)),
        ("api_undocking_proposal", printDocking_Access_SupervisorUndockingProposal(o.api_undocking_proposal))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P => return printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS => return printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P""""),
        ("api_docking_decision", printDocking_Access_SupervisorDockingDecisionFrame(o.api_docking_decision))
      ))
    }

    @pure def printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS""""),
        ("api_docking_decision", printDocking_Access_SupervisorDockingDecisionFrame(o.api_docking_decision))
      ))
    }

    @pure def printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P => return printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS => return printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P""""),
        ("api_docking_decision", printDocking_Access_SupervisorDockingDecisionFrame(o.api_docking_decision)),
        ("api_request_disposition", printDocking_Access_SupervisorRequestDispositionType(o.api_request_disposition))
      ))
    }

    @pure def printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS""""),
        ("api_docking_decision", printDocking_Access_SupervisorDockingDecisionFrame(o.api_docking_decision)),
        ("api_request_disposition", printDocking_Access_SupervisorRequestDispositionType(o.api_request_disposition))
      ))
    }

    @pure def printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container): ST = {
      o match {
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P => return printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS => return printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(o)
      }
    }

    @pure def printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P""""),
        ("api_docking_access_result", printDocking_Access_SupervisorDockingAccessResult(o.api_docking_access_result))
      ))
    }

    @pure def printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS""""),
        ("api_docking_access_result", printDocking_Access_SupervisorDockingAccessResult(o.api_docking_access_result))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_request_classification_postInit => "DockingAccessSupervisorSystem_Instance_supervisor_process_request_classification_postInit"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_request_classification_preCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_request_classification_preCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_request_classification_postCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_request_classification_postCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_vessel_status_assessment_postInit => "DockingAccessSupervisorSystem_Instance_supervisor_process_vessel_status_assessment_postInit"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_vessel_status_assessment_preCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_vessel_status_assessment_preCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_vessel_status_assessment_postCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_vessel_status_assessment_postCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_station_report_assessment_postInit => "DockingAccessSupervisorSystem_Instance_supervisor_process_station_report_assessment_postInit"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_station_report_assessment_preCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_station_report_assessment_preCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_station_report_assessment_postCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_station_report_assessment_postCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_service_activity_assessment_postInit => "DockingAccessSupervisorSystem_Instance_supervisor_process_service_activity_assessment_postInit"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_service_activity_assessment_preCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_service_activity_assessment_preCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_service_activity_assessment_postCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_service_activity_assessment_postCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_request_admission_postInit => "DockingAccessSupervisorSystem_Instance_supervisor_process_request_admission_postInit"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_request_admission_preCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_request_admission_preCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_request_admission_postCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_request_admission_postCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_access_coherence_postInit => "DockingAccessSupervisorSystem_Instance_supervisor_process_access_coherence_postInit"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_access_coherence_preCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_access_coherence_preCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_access_coherence_postCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_access_coherence_postCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_docking_lifecycle_postInit => "DockingAccessSupervisorSystem_Instance_supervisor_process_docking_lifecycle_postInit"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_docking_lifecycle_preCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_docking_lifecycle_preCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_docking_lifecycle_postCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_docking_lifecycle_postCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_berth_commitment_postInit => "DockingAccessSupervisorSystem_Instance_supervisor_process_berth_commitment_postInit"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_berth_commitment_preCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_berth_commitment_preCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_berth_commitment_postCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_berth_commitment_postCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_service_access_gate_postInit => "DockingAccessSupervisorSystem_Instance_supervisor_process_service_access_gate_postInit"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_service_access_gate_preCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_service_access_gate_preCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_service_access_gate_postCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_service_access_gate_postCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_recovery_supervisor_postInit => "DockingAccessSupervisorSystem_Instance_supervisor_process_recovery_supervisor_postInit"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_recovery_supervisor_preCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_recovery_supervisor_preCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_recovery_supervisor_postCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_recovery_supervisor_postCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_docking_action_eligibility_postInit => "DockingAccessSupervisorSystem_Instance_supervisor_process_docking_action_eligibility_postInit"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_docking_action_eligibility_preCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_docking_action_eligibility_preCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_docking_action_eligibility_postCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_docking_action_eligibility_postCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_access_action_eligibility_postInit => "DockingAccessSupervisorSystem_Instance_supervisor_process_access_action_eligibility_postInit"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_access_action_eligibility_preCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_access_action_eligibility_preCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_access_action_eligibility_postCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_access_action_eligibility_postCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_undocking_action_eligibility_postInit => "DockingAccessSupervisorSystem_Instance_supervisor_process_undocking_action_eligibility_postInit"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_undocking_action_eligibility_preCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_undocking_action_eligibility_preCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_undocking_action_eligibility_postCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_undocking_action_eligibility_postCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_docking_action_arbitration_postInit => "DockingAccessSupervisorSystem_Instance_supervisor_process_docking_action_arbitration_postInit"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_docking_action_arbitration_preCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_docking_action_arbitration_preCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_docking_action_arbitration_postCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_docking_action_arbitration_postCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_result_composition_postInit => "DockingAccessSupervisorSystem_Instance_supervisor_process_result_composition_postInit"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_result_composition_preCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_result_composition_preCompute"
        case runtimemonitor.ObservationKind.DockingAccessSupervisorSystem_Instance_supervisor_process_result_composition_postCompute => "DockingAccessSupervisorSystem_Instance_supervisor_process_result_composition_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P => return printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS => return printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P => return printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P => return printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS => return printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS => return printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P => return printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS => return printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P => return printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P => return printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS => return printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS => return printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P => return printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS => return printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P => return printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS => return printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P => return printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS => return printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P => return printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS => return printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P => return printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS => return printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P => return printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS => return printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P => return printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS => return printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P => return printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS => return printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P => return printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS => return printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P => return printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS => return printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P => return printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS => return printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P => return printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS => return printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P => return printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P => return printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS => return printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS => return printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P => return printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P => return printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS => return printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS => return printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P => return printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P => return printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS => return printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS => return printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P => return printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS => return printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P => return printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS => return printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P => return printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS => return printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P => return printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS => return printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P => return printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS => return printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P => return printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS => return printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(o)
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
        case o: Docking_Access_Supervisor.GateState_Payload => return printDocking_Access_SupervisorGateState_Payload(o)
        case o: Docking_Access_Supervisor.BerthState_Payload => return printDocking_Access_SupervisorBerthState_Payload(o)
        case o: Docking_Access_Supervisor.PublicMode_Payload => return printDocking_Access_SupervisorPublicMode_Payload(o)
        case o: Docking_Access_Supervisor.Correlation_Payload => return printDocking_Access_SupervisorCorrelation_Payload(o)
        case o: Docking_Access_Supervisor.VesselClass_Payload => return printDocking_Access_SupervisorVesselClass_Payload(o)
        case o: Docking_Access_Supervisor.VesselFacts_Payload => return printDocking_Access_SupervisorVesselFacts_Payload(o)
        case o: Docking_Access_Supervisor.AccessStatus_Payload => return printDocking_Access_SupervisorAccessStatus_Payload(o)
        case o: Docking_Access_Supervisor.ServiceClass_Payload => return printDocking_Access_SupervisorServiceClass_Payload(o)
        case o: Docking_Access_Supervisor.PriorityKind_Payload => return printDocking_Access_SupervisorPriorityKind_Payload(o)
        case o: Docking_Access_Supervisor.ControlEvent_Payload => return printDocking_Access_SupervisorControlEvent_Payload(o)
        case o: Docking_Access_Supervisor.VesselStatus_Payload => return printDocking_Access_SupervisorVesselStatus_Payload(o)
        case o: Docking_Access_Supervisor.ServiceFacts_Payload => return printDocking_Access_SupervisorServiceFacts_Payload(o)
        case o: Docking_Access_Supervisor.RequestFacts_Payload => return printDocking_Access_SupervisorRequestFacts_Payload(o)
        case o: Docking_Access_Supervisor.StationFacts_Payload => return printDocking_Access_SupervisorStationFacts_Payload(o)
        case o: Docking_Access_Supervisor.RecoveryState_Payload => return printDocking_Access_SupervisorRecoveryState_Payload(o)
        case o: Docking_Access_Supervisor.GateDirective_Payload => return printDocking_Access_SupervisorGateDirective_Payload(o)
        case o: Docking_Access_Supervisor.AccessRequest_Payload => return printDocking_Access_SupervisorAccessRequest_Payload(o)
        case o: Docking_Access_Supervisor.StationReport_Payload => return printDocking_Access_SupervisorStationReport_Payload(o)
        case o: Docking_Access_Supervisor.DecisionCause_Payload => return printDocking_Access_SupervisorDecisionCause_Payload(o)
        case o: Docking_Access_Supervisor.RecoveryIntent_Payload => return printDocking_Access_SupervisorRecoveryIntent_Payload(o)
        case o: Docking_Access_Supervisor.DockingOutcome_Payload => return printDocking_Access_SupervisorDockingOutcome_Payload(o)
        case o: Docking_Access_Supervisor.LifecycleState_Payload => return printDocking_Access_SupervisorLifecycleState_Payload(o)
        case o: Docking_Access_Supervisor.AdmissionGuard_Payload => return printDocking_Access_SupervisorAdmissionGuard_Payload(o)
        case o: Docking_Access_Supervisor.AccessProposal_Payload => return printDocking_Access_SupervisorAccessProposal_Payload(o)
        case o: Docking_Access_Supervisor.ServiceActivity_Payload => return printDocking_Access_SupervisorServiceActivity_Payload(o)
        case o: Docking_Access_Supervisor.StationProgress_Payload => return printDocking_Access_SupervisorStationProgress_Payload(o)
        case o: Docking_Access_Supervisor.DecisionContext_Payload => return printDocking_Access_SupervisorDecisionContext_Payload(o)
        case o: Docking_Access_Supervisor.GateSafetyFrame_Payload => return printDocking_Access_SupervisorGateSafetyFrame_Payload(o)
        case o: Docking_Access_Supervisor.DockingProposal_Payload => return printDocking_Access_SupervisorDockingProposal_Payload(o)
        case o: Docking_Access_Supervisor.RequestOperation_Payload => return printDocking_Access_SupervisorRequestOperation_Payload(o)
        case o: Docking_Access_Supervisor.SupervisoryAction_Payload => return printDocking_Access_SupervisorSupervisoryAction_Payload(o)
        case o: Docking_Access_Supervisor.BerthEvidenceKind_Payload => return printDocking_Access_SupervisorBerthEvidenceKind_Payload(o)
        case o: Docking_Access_Supervisor.PriorityDirective_Payload => return printDocking_Access_SupervisorPriorityDirective_Payload(o)
        case o: Docking_Access_Supervisor.CoordinationFrame_Payload => return printDocking_Access_SupervisorCoordinationFrame_Payload(o)
        case o: Docking_Access_Supervisor.AdmissionDecision_Payload => return printDocking_Access_SupervisorAdmissionDecision_Payload(o)
        case o: Docking_Access_Supervisor.UndockingProposal_Payload => return printDocking_Access_SupervisorUndockingProposal_Payload(o)
        case o: Docking_Access_Supervisor.RequestDisposition_Payload => return printDocking_Access_SupervisorRequestDisposition_Payload(o)
        case o: Docking_Access_Supervisor.LifecycleDirective_Payload => return printDocking_Access_SupervisorLifecycleDirective_Payload(o)
        case o: Docking_Access_Supervisor.PriorLifecycleView_Payload => return printDocking_Access_SupervisorPriorLifecycleView_Payload(o)
        case o: Docking_Access_Supervisor.RecoveryTransition_Payload => return printDocking_Access_SupervisorRecoveryTransition_Payload(o)
        case o: Docking_Access_Supervisor.DockingAccessResult_Payload => return printDocking_Access_SupervisorDockingAccessResult_Payload(o)
        case o: Docking_Access_Supervisor.DockingDecisionFrame_Payload => return printDocking_Access_SupervisorDockingDecisionFrame_Payload(o)
        case o: Docking_Access_Supervisor.BerthTransitionEvidence_Payload => return printDocking_Access_SupervisorBerthTransitionEvidence_Payload(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P => return printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS => return printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P => return printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P => return printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS => return printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS => return printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P => return printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS => return printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P => return printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P => return printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS => return printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS => return printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P => return printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS => return printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P => return printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS => return printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P => return printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS => return printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P => return printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS => return printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P => return printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS => return printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P => return printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS => return printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P => return printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS => return printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P => return printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS => return printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P => return printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS => return printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P => return printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS => return printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P => return printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS => return printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P => return printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS => return printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P => return printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P => return printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS => return printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS => return printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P => return printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P => return printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS => return printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS => return printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P => return printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P => return printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS => return printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS => return printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P => return printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS => return printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P => return printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS => return printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P => return printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS => return printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P => return printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS => return printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P => return printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS => return printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P => return printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(o)
        case o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS => return printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(o)
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

    def parseDocking_Access_SupervisorAccessRequestType(): Docking_Access_Supervisor.AccessRequest.Type = {
      val r = parseDocking_Access_SupervisorAccessRequestT(F)
      return r
    }

    def parseDocking_Access_SupervisorAccessRequestT(typeParsed: B): Docking_Access_Supervisor.AccessRequest.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AccessRequest")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.AccessRequest.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.AccessRequest.")
          return Docking_Access_Supervisor.AccessRequest.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorAccessRequest_Payload(): Docking_Access_Supervisor.AccessRequest_Payload = {
      val r = parseDocking_Access_SupervisorAccessRequest_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorAccessRequest_PayloadT(typeParsed: B): Docking_Access_Supervisor.AccessRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AccessRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorAccessRequestType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.AccessRequest_Payload(value)
    }

    def parseDocking_Access_SupervisorRequestOperationType(): Docking_Access_Supervisor.RequestOperation.Type = {
      val r = parseDocking_Access_SupervisorRequestOperationT(F)
      return r
    }

    def parseDocking_Access_SupervisorRequestOperationT(typeParsed: B): Docking_Access_Supervisor.RequestOperation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RequestOperation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.RequestOperation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.RequestOperation.")
          return Docking_Access_Supervisor.RequestOperation.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorRequestOperation_Payload(): Docking_Access_Supervisor.RequestOperation_Payload = {
      val r = parseDocking_Access_SupervisorRequestOperation_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorRequestOperation_PayloadT(typeParsed: B): Docking_Access_Supervisor.RequestOperation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RequestOperation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorRequestOperationType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RequestOperation_Payload(value)
    }

    def parseDocking_Access_SupervisorCorrelationType(): Docking_Access_Supervisor.Correlation.Type = {
      val r = parseDocking_Access_SupervisorCorrelationT(F)
      return r
    }

    def parseDocking_Access_SupervisorCorrelationT(typeParsed: B): Docking_Access_Supervisor.Correlation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.Correlation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.Correlation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.Correlation.")
          return Docking_Access_Supervisor.Correlation.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorCorrelation_Payload(): Docking_Access_Supervisor.Correlation_Payload = {
      val r = parseDocking_Access_SupervisorCorrelation_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorCorrelation_PayloadT(typeParsed: B): Docking_Access_Supervisor.Correlation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.Correlation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorCorrelationType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.Correlation_Payload(value)
    }

    def parseDocking_Access_SupervisorVesselStatusType(): Docking_Access_Supervisor.VesselStatus.Type = {
      val r = parseDocking_Access_SupervisorVesselStatusT(F)
      return r
    }

    def parseDocking_Access_SupervisorVesselStatusT(typeParsed: B): Docking_Access_Supervisor.VesselStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.VesselStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.VesselStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.VesselStatus.")
          return Docking_Access_Supervisor.VesselStatus.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorVesselStatus_Payload(): Docking_Access_Supervisor.VesselStatus_Payload = {
      val r = parseDocking_Access_SupervisorVesselStatus_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorVesselStatus_PayloadT(typeParsed: B): Docking_Access_Supervisor.VesselStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.VesselStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorVesselStatusType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.VesselStatus_Payload(value)
    }

    def parseDocking_Access_SupervisorVesselClassType(): Docking_Access_Supervisor.VesselClass.Type = {
      val r = parseDocking_Access_SupervisorVesselClassT(F)
      return r
    }

    def parseDocking_Access_SupervisorVesselClassT(typeParsed: B): Docking_Access_Supervisor.VesselClass.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.VesselClass")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.VesselClass.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.VesselClass.")
          return Docking_Access_Supervisor.VesselClass.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorVesselClass_Payload(): Docking_Access_Supervisor.VesselClass_Payload = {
      val r = parseDocking_Access_SupervisorVesselClass_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorVesselClass_PayloadT(typeParsed: B): Docking_Access_Supervisor.VesselClass_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.VesselClass_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorVesselClassType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.VesselClass_Payload(value)
    }

    def parseDocking_Access_SupervisorStationReportType(): Docking_Access_Supervisor.StationReport.Type = {
      val r = parseDocking_Access_SupervisorStationReportT(F)
      return r
    }

    def parseDocking_Access_SupervisorStationReportT(typeParsed: B): Docking_Access_Supervisor.StationReport.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.StationReport")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.StationReport.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.StationReport.")
          return Docking_Access_Supervisor.StationReport.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorStationReport_Payload(): Docking_Access_Supervisor.StationReport_Payload = {
      val r = parseDocking_Access_SupervisorStationReport_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorStationReport_PayloadT(typeParsed: B): Docking_Access_Supervisor.StationReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.StationReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorStationReportType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.StationReport_Payload(value)
    }

    def parseDocking_Access_SupervisorStationProgressType(): Docking_Access_Supervisor.StationProgress.Type = {
      val r = parseDocking_Access_SupervisorStationProgressT(F)
      return r
    }

    def parseDocking_Access_SupervisorStationProgressT(typeParsed: B): Docking_Access_Supervisor.StationProgress.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.StationProgress")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.StationProgress.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.StationProgress.")
          return Docking_Access_Supervisor.StationProgress.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorStationProgress_Payload(): Docking_Access_Supervisor.StationProgress_Payload = {
      val r = parseDocking_Access_SupervisorStationProgress_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorStationProgress_PayloadT(typeParsed: B): Docking_Access_Supervisor.StationProgress_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.StationProgress_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorStationProgressType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.StationProgress_Payload(value)
    }

    def parseDocking_Access_SupervisorServiceActivityType(): Docking_Access_Supervisor.ServiceActivity.Type = {
      val r = parseDocking_Access_SupervisorServiceActivityT(F)
      return r
    }

    def parseDocking_Access_SupervisorServiceActivityT(typeParsed: B): Docking_Access_Supervisor.ServiceActivity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ServiceActivity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.ServiceActivity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.ServiceActivity.")
          return Docking_Access_Supervisor.ServiceActivity.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorServiceActivity_Payload(): Docking_Access_Supervisor.ServiceActivity_Payload = {
      val r = parseDocking_Access_SupervisorServiceActivity_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorServiceActivity_PayloadT(typeParsed: B): Docking_Access_Supervisor.ServiceActivity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ServiceActivity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorServiceActivityType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.ServiceActivity_Payload(value)
    }

    def parseDocking_Access_SupervisorServiceClassType(): Docking_Access_Supervisor.ServiceClass.Type = {
      val r = parseDocking_Access_SupervisorServiceClassT(F)
      return r
    }

    def parseDocking_Access_SupervisorServiceClassT(typeParsed: B): Docking_Access_Supervisor.ServiceClass.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ServiceClass")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.ServiceClass.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.ServiceClass.")
          return Docking_Access_Supervisor.ServiceClass.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorServiceClass_Payload(): Docking_Access_Supervisor.ServiceClass_Payload = {
      val r = parseDocking_Access_SupervisorServiceClass_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorServiceClass_PayloadT(typeParsed: B): Docking_Access_Supervisor.ServiceClass_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ServiceClass_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorServiceClassType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.ServiceClass_Payload(value)
    }

    def parseDocking_Access_SupervisorLifecycleStateType(): Docking_Access_Supervisor.LifecycleState.Type = {
      val r = parseDocking_Access_SupervisorLifecycleStateT(F)
      return r
    }

    def parseDocking_Access_SupervisorLifecycleStateT(typeParsed: B): Docking_Access_Supervisor.LifecycleState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.LifecycleState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.LifecycleState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.LifecycleState.")
          return Docking_Access_Supervisor.LifecycleState.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorLifecycleState_Payload(): Docking_Access_Supervisor.LifecycleState_Payload = {
      val r = parseDocking_Access_SupervisorLifecycleState_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorLifecycleState_PayloadT(typeParsed: B): Docking_Access_Supervisor.LifecycleState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.LifecycleState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorLifecycleStateType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.LifecycleState_Payload(value)
    }

    def parseDocking_Access_SupervisorRequestDispositionType(): Docking_Access_Supervisor.RequestDisposition.Type = {
      val r = parseDocking_Access_SupervisorRequestDispositionT(F)
      return r
    }

    def parseDocking_Access_SupervisorRequestDispositionT(typeParsed: B): Docking_Access_Supervisor.RequestDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RequestDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.RequestDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.RequestDisposition.")
          return Docking_Access_Supervisor.RequestDisposition.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorRequestDisposition_Payload(): Docking_Access_Supervisor.RequestDisposition_Payload = {
      val r = parseDocking_Access_SupervisorRequestDisposition_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorRequestDisposition_PayloadT(typeParsed: B): Docking_Access_Supervisor.RequestDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RequestDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorRequestDispositionType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RequestDisposition_Payload(value)
    }

    def parseDocking_Access_SupervisorControlEventType(): Docking_Access_Supervisor.ControlEvent.Type = {
      val r = parseDocking_Access_SupervisorControlEventT(F)
      return r
    }

    def parseDocking_Access_SupervisorControlEventT(typeParsed: B): Docking_Access_Supervisor.ControlEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ControlEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.ControlEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.ControlEvent.")
          return Docking_Access_Supervisor.ControlEvent.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorControlEvent_Payload(): Docking_Access_Supervisor.ControlEvent_Payload = {
      val r = parseDocking_Access_SupervisorControlEvent_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorControlEvent_PayloadT(typeParsed: B): Docking_Access_Supervisor.ControlEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ControlEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorControlEventType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.ControlEvent_Payload(value)
    }

    def parseDocking_Access_SupervisorBerthStateType(): Docking_Access_Supervisor.BerthState.Type = {
      val r = parseDocking_Access_SupervisorBerthStateT(F)
      return r
    }

    def parseDocking_Access_SupervisorBerthStateT(typeParsed: B): Docking_Access_Supervisor.BerthState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.BerthState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.BerthState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.BerthState.")
          return Docking_Access_Supervisor.BerthState.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorBerthState_Payload(): Docking_Access_Supervisor.BerthState_Payload = {
      val r = parseDocking_Access_SupervisorBerthState_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorBerthState_PayloadT(typeParsed: B): Docking_Access_Supervisor.BerthState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.BerthState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorBerthStateType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.BerthState_Payload(value)
    }

    def parseDocking_Access_SupervisorGateStateType(): Docking_Access_Supervisor.GateState.Type = {
      val r = parseDocking_Access_SupervisorGateStateT(F)
      return r
    }

    def parseDocking_Access_SupervisorGateStateT(typeParsed: B): Docking_Access_Supervisor.GateState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.GateState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.GateState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.GateState.")
          return Docking_Access_Supervisor.GateState.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorGateState_Payload(): Docking_Access_Supervisor.GateState_Payload = {
      val r = parseDocking_Access_SupervisorGateState_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorGateState_PayloadT(typeParsed: B): Docking_Access_Supervisor.GateState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.GateState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorGateStateType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.GateState_Payload(value)
    }

    def parseDocking_Access_SupervisorRecoveryStateType(): Docking_Access_Supervisor.RecoveryState.Type = {
      val r = parseDocking_Access_SupervisorRecoveryStateT(F)
      return r
    }

    def parseDocking_Access_SupervisorRecoveryStateT(typeParsed: B): Docking_Access_Supervisor.RecoveryState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RecoveryState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.RecoveryState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.RecoveryState.")
          return Docking_Access_Supervisor.RecoveryState.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorRecoveryState_Payload(): Docking_Access_Supervisor.RecoveryState_Payload = {
      val r = parseDocking_Access_SupervisorRecoveryState_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorRecoveryState_PayloadT(typeParsed: B): Docking_Access_Supervisor.RecoveryState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RecoveryState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorRecoveryStateType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RecoveryState_Payload(value)
    }

    def parseDocking_Access_SupervisorRecoveryIntentType(): Docking_Access_Supervisor.RecoveryIntent.Type = {
      val r = parseDocking_Access_SupervisorRecoveryIntentT(F)
      return r
    }

    def parseDocking_Access_SupervisorRecoveryIntentT(typeParsed: B): Docking_Access_Supervisor.RecoveryIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RecoveryIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.RecoveryIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.RecoveryIntent.")
          return Docking_Access_Supervisor.RecoveryIntent.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorRecoveryIntent_Payload(): Docking_Access_Supervisor.RecoveryIntent_Payload = {
      val r = parseDocking_Access_SupervisorRecoveryIntent_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorRecoveryIntent_PayloadT(typeParsed: B): Docking_Access_Supervisor.RecoveryIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RecoveryIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorRecoveryIntentType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RecoveryIntent_Payload(value)
    }

    def parseDocking_Access_SupervisorLifecycleDirectiveType(): Docking_Access_Supervisor.LifecycleDirective.Type = {
      val r = parseDocking_Access_SupervisorLifecycleDirectiveT(F)
      return r
    }

    def parseDocking_Access_SupervisorLifecycleDirectiveT(typeParsed: B): Docking_Access_Supervisor.LifecycleDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.LifecycleDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.LifecycleDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.LifecycleDirective.")
          return Docking_Access_Supervisor.LifecycleDirective.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorLifecycleDirective_Payload(): Docking_Access_Supervisor.LifecycleDirective_Payload = {
      val r = parseDocking_Access_SupervisorLifecycleDirective_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorLifecycleDirective_PayloadT(typeParsed: B): Docking_Access_Supervisor.LifecycleDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.LifecycleDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorLifecycleDirectiveType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.LifecycleDirective_Payload(value)
    }

    def parseDocking_Access_SupervisorDecisionContextType(): Docking_Access_Supervisor.DecisionContext.Type = {
      val r = parseDocking_Access_SupervisorDecisionContextT(F)
      return r
    }

    def parseDocking_Access_SupervisorDecisionContextT(typeParsed: B): Docking_Access_Supervisor.DecisionContext.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DecisionContext")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.DecisionContext.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.DecisionContext.")
          return Docking_Access_Supervisor.DecisionContext.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorDecisionContext_Payload(): Docking_Access_Supervisor.DecisionContext_Payload = {
      val r = parseDocking_Access_SupervisorDecisionContext_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorDecisionContext_PayloadT(typeParsed: B): Docking_Access_Supervisor.DecisionContext_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DecisionContext_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorDecisionContextType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DecisionContext_Payload(value)
    }

    def parseDocking_Access_SupervisorBerthEvidenceKindType(): Docking_Access_Supervisor.BerthEvidenceKind.Type = {
      val r = parseDocking_Access_SupervisorBerthEvidenceKindT(F)
      return r
    }

    def parseDocking_Access_SupervisorBerthEvidenceKindT(typeParsed: B): Docking_Access_Supervisor.BerthEvidenceKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.BerthEvidenceKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.BerthEvidenceKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.BerthEvidenceKind.")
          return Docking_Access_Supervisor.BerthEvidenceKind.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorBerthEvidenceKind_Payload(): Docking_Access_Supervisor.BerthEvidenceKind_Payload = {
      val r = parseDocking_Access_SupervisorBerthEvidenceKind_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorBerthEvidenceKind_PayloadT(typeParsed: B): Docking_Access_Supervisor.BerthEvidenceKind_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.BerthEvidenceKind_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorBerthEvidenceKindType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.BerthEvidenceKind_Payload(value)
    }

    def parseDocking_Access_SupervisorGateDirectiveType(): Docking_Access_Supervisor.GateDirective.Type = {
      val r = parseDocking_Access_SupervisorGateDirectiveT(F)
      return r
    }

    def parseDocking_Access_SupervisorGateDirectiveT(typeParsed: B): Docking_Access_Supervisor.GateDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.GateDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.GateDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.GateDirective.")
          return Docking_Access_Supervisor.GateDirective.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorGateDirective_Payload(): Docking_Access_Supervisor.GateDirective_Payload = {
      val r = parseDocking_Access_SupervisorGateDirective_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorGateDirective_PayloadT(typeParsed: B): Docking_Access_Supervisor.GateDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.GateDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorGateDirectiveType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.GateDirective_Payload(value)
    }

    def parseDocking_Access_SupervisorPriorityKindType(): Docking_Access_Supervisor.PriorityKind.Type = {
      val r = parseDocking_Access_SupervisorPriorityKindT(F)
      return r
    }

    def parseDocking_Access_SupervisorPriorityKindT(typeParsed: B): Docking_Access_Supervisor.PriorityKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.PriorityKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.PriorityKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.PriorityKind.")
          return Docking_Access_Supervisor.PriorityKind.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorPriorityKind_Payload(): Docking_Access_Supervisor.PriorityKind_Payload = {
      val r = parseDocking_Access_SupervisorPriorityKind_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorPriorityKind_PayloadT(typeParsed: B): Docking_Access_Supervisor.PriorityKind_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.PriorityKind_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorPriorityKindType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.PriorityKind_Payload(value)
    }

    def parseDocking_Access_SupervisorSupervisoryActionType(): Docking_Access_Supervisor.SupervisoryAction.Type = {
      val r = parseDocking_Access_SupervisorSupervisoryActionT(F)
      return r
    }

    def parseDocking_Access_SupervisorSupervisoryActionT(typeParsed: B): Docking_Access_Supervisor.SupervisoryAction.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.SupervisoryAction")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.SupervisoryAction.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.SupervisoryAction.")
          return Docking_Access_Supervisor.SupervisoryAction.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorSupervisoryAction_Payload(): Docking_Access_Supervisor.SupervisoryAction_Payload = {
      val r = parseDocking_Access_SupervisorSupervisoryAction_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorSupervisoryAction_PayloadT(typeParsed: B): Docking_Access_Supervisor.SupervisoryAction_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.SupervisoryAction_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorSupervisoryActionType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.SupervisoryAction_Payload(value)
    }

    def parseDocking_Access_SupervisorDecisionCauseType(): Docking_Access_Supervisor.DecisionCause.Type = {
      val r = parseDocking_Access_SupervisorDecisionCauseT(F)
      return r
    }

    def parseDocking_Access_SupervisorDecisionCauseT(typeParsed: B): Docking_Access_Supervisor.DecisionCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DecisionCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.DecisionCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.DecisionCause.")
          return Docking_Access_Supervisor.DecisionCause.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorDecisionCause_Payload(): Docking_Access_Supervisor.DecisionCause_Payload = {
      val r = parseDocking_Access_SupervisorDecisionCause_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorDecisionCause_PayloadT(typeParsed: B): Docking_Access_Supervisor.DecisionCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DecisionCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorDecisionCauseType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DecisionCause_Payload(value)
    }

    def parseDocking_Access_SupervisorPublicModeType(): Docking_Access_Supervisor.PublicMode.Type = {
      val r = parseDocking_Access_SupervisorPublicModeT(F)
      return r
    }

    def parseDocking_Access_SupervisorPublicModeT(typeParsed: B): Docking_Access_Supervisor.PublicMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.PublicMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.PublicMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.PublicMode.")
          return Docking_Access_Supervisor.PublicMode.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorPublicMode_Payload(): Docking_Access_Supervisor.PublicMode_Payload = {
      val r = parseDocking_Access_SupervisorPublicMode_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorPublicMode_PayloadT(typeParsed: B): Docking_Access_Supervisor.PublicMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.PublicMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorPublicModeType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.PublicMode_Payload(value)
    }

    def parseDocking_Access_SupervisorAccessStatusType(): Docking_Access_Supervisor.AccessStatus.Type = {
      val r = parseDocking_Access_SupervisorAccessStatusT(F)
      return r
    }

    def parseDocking_Access_SupervisorAccessStatusT(typeParsed: B): Docking_Access_Supervisor.AccessStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AccessStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.AccessStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.AccessStatus.")
          return Docking_Access_Supervisor.AccessStatus.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorAccessStatus_Payload(): Docking_Access_Supervisor.AccessStatus_Payload = {
      val r = parseDocking_Access_SupervisorAccessStatus_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorAccessStatus_PayloadT(typeParsed: B): Docking_Access_Supervisor.AccessStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AccessStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorAccessStatusType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.AccessStatus_Payload(value)
    }

    def parseDocking_Access_SupervisorDockingOutcomeType(): Docking_Access_Supervisor.DockingOutcome.Type = {
      val r = parseDocking_Access_SupervisorDockingOutcomeT(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingOutcomeT(typeParsed: B): Docking_Access_Supervisor.DockingOutcome.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingOutcome")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docking_Access_Supervisor.DockingOutcome.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docking_Access_Supervisor.DockingOutcome.")
          return Docking_Access_Supervisor.DockingOutcome.byOrdinal(0).get
      }
    }

    def parseDocking_Access_SupervisorDockingOutcome_Payload(): Docking_Access_Supervisor.DockingOutcome_Payload = {
      val r = parseDocking_Access_SupervisorDockingOutcome_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingOutcome_PayloadT(typeParsed: B): Docking_Access_Supervisor.DockingOutcome_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingOutcome_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorDockingOutcomeType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingOutcome_Payload(value)
    }

    def parseDocking_Access_SupervisorRequestFacts(): Docking_Access_Supervisor.RequestFacts = {
      val r = parseDocking_Access_SupervisorRequestFactsT(F)
      return r
    }

    def parseDocking_Access_SupervisorRequestFactsT(typeParsed: B): Docking_Access_Supervisor.RequestFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RequestFacts")
      }
      parser.parseObjectKey("present")
      val present = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("usable")
      val usable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("operation")
      val operation = parseDocking_Access_SupervisorRequestOperationType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseDocking_Access_SupervisorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("startsAuthorization")
      val startsAuthorization = parser.parseB()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RequestFacts(present, usable, operation, correlation, startsAuthorization)
    }

    def parseDocking_Access_SupervisorRequestFacts_Payload(): Docking_Access_Supervisor.RequestFacts_Payload = {
      val r = parseDocking_Access_SupervisorRequestFacts_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorRequestFacts_PayloadT(typeParsed: B): Docking_Access_Supervisor.RequestFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RequestFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorRequestFacts()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RequestFacts_Payload(value)
    }

    def parseDocking_Access_SupervisorVesselFacts(): Docking_Access_Supervisor.VesselFacts = {
      val r = parseDocking_Access_SupervisorVesselFactsT(F)
      return r
    }

    def parseDocking_Access_SupervisorVesselFactsT(typeParsed: B): Docking_Access_Supervisor.VesselFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.VesselFacts")
      }
      parser.parseObjectKey("usable")
      val usable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("lifecycleClass")
      val lifecycleClass = parseDocking_Access_SupervisorVesselClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("approachReady")
      val approachReady = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("docked")
      val docked = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("departed")
      val departed = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseDocking_Access_SupervisorCorrelationType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.VesselFacts(usable, lifecycleClass, approachReady, docked, departed, correlation)
    }

    def parseDocking_Access_SupervisorVesselFacts_Payload(): Docking_Access_Supervisor.VesselFacts_Payload = {
      val r = parseDocking_Access_SupervisorVesselFacts_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorVesselFacts_PayloadT(typeParsed: B): Docking_Access_Supervisor.VesselFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.VesselFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorVesselFacts()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.VesselFacts_Payload(value)
    }

    def parseDocking_Access_SupervisorStationFacts(): Docking_Access_Supervisor.StationFacts = {
      val r = parseDocking_Access_SupervisorStationFactsT(F)
      return r
    }

    def parseDocking_Access_SupervisorStationFactsT(typeParsed: B): Docking_Access_Supervisor.StationFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.StationFacts")
      }
      parser.parseObjectKey("present")
      val present = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("usable")
      val usable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("progress")
      val progress = parseDocking_Access_SupervisorStationProgressType()
      parser.parseObjectNext()
      parser.parseObjectKey("available")
      val available = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("denied")
      val denied = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseDocking_Access_SupervisorCorrelationType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.StationFacts(present, usable, progress, available, denied, correlation)
    }

    def parseDocking_Access_SupervisorStationFacts_Payload(): Docking_Access_Supervisor.StationFacts_Payload = {
      val r = parseDocking_Access_SupervisorStationFacts_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorStationFacts_PayloadT(typeParsed: B): Docking_Access_Supervisor.StationFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.StationFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorStationFacts()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.StationFacts_Payload(value)
    }

    def parseDocking_Access_SupervisorServiceFacts(): Docking_Access_Supervisor.ServiceFacts = {
      val r = parseDocking_Access_SupervisorServiceFactsT(F)
      return r
    }

    def parseDocking_Access_SupervisorServiceFactsT(typeParsed: B): Docking_Access_Supervisor.ServiceFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ServiceFacts")
      }
      parser.parseObjectKey("usable")
      val usable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("serviceClass")
      val serviceClass = parseDocking_Access_SupervisorServiceClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("quiescent")
      val quiescent = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("active")
      val active = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("requestPermitted")
      val requestPermitted = parser.parseB()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.ServiceFacts(usable, serviceClass, quiescent, active, requestPermitted)
    }

    def parseDocking_Access_SupervisorServiceFacts_Payload(): Docking_Access_Supervisor.ServiceFacts_Payload = {
      val r = parseDocking_Access_SupervisorServiceFacts_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorServiceFacts_PayloadT(typeParsed: B): Docking_Access_Supervisor.ServiceFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ServiceFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorServiceFacts()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.ServiceFacts_Payload(value)
    }

    def parseDocking_Access_SupervisorAdmissionGuard(): Docking_Access_Supervisor.AdmissionGuard = {
      val r = parseDocking_Access_SupervisorAdmissionGuardT(F)
      return r
    }

    def parseDocking_Access_SupervisorAdmissionGuardT(typeParsed: B): Docking_Access_Supervisor.AdmissionGuard = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AdmissionGuard")
      }
      parser.parseObjectKey("open")
      val open = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("lifecycle")
      val lifecycle = parseDocking_Access_SupervisorLifecycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseDocking_Access_SupervisorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("berthAvailable")
      val berthAvailable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("gateClosed")
      val gateClosed = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("recoveryHealthy")
      val recoveryHealthy = parser.parseB()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.AdmissionGuard(open, lifecycle, correlation, berthAvailable, gateClosed, recoveryHealthy)
    }

    def parseDocking_Access_SupervisorAdmissionGuard_Payload(): Docking_Access_Supervisor.AdmissionGuard_Payload = {
      val r = parseDocking_Access_SupervisorAdmissionGuard_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorAdmissionGuard_PayloadT(typeParsed: B): Docking_Access_Supervisor.AdmissionGuard_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AdmissionGuard_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorAdmissionGuard()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.AdmissionGuard_Payload(value)
    }

    def parseDocking_Access_SupervisorPriorLifecycleView(): Docking_Access_Supervisor.PriorLifecycleView = {
      val r = parseDocking_Access_SupervisorPriorLifecycleViewT(F)
      return r
    }

    def parseDocking_Access_SupervisorPriorLifecycleViewT(typeParsed: B): Docking_Access_Supervisor.PriorLifecycleView = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.PriorLifecycleView")
      }
      parser.parseObjectKey("lifecycle")
      val lifecycle = parseDocking_Access_SupervisorLifecycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseDocking_Access_SupervisorCorrelationType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.PriorLifecycleView(lifecycle, correlation)
    }

    def parseDocking_Access_SupervisorPriorLifecycleView_Payload(): Docking_Access_Supervisor.PriorLifecycleView_Payload = {
      val r = parseDocking_Access_SupervisorPriorLifecycleView_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorPriorLifecycleView_PayloadT(typeParsed: B): Docking_Access_Supervisor.PriorLifecycleView_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.PriorLifecycleView_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorPriorLifecycleView()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.PriorLifecycleView_Payload(value)
    }

    def parseDocking_Access_SupervisorAdmissionDecision(): Docking_Access_Supervisor.AdmissionDecision = {
      val r = parseDocking_Access_SupervisorAdmissionDecisionT(F)
      return r
    }

    def parseDocking_Access_SupervisorAdmissionDecisionT(typeParsed: B): Docking_Access_Supervisor.AdmissionDecision = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AdmissionDecision")
      }
      parser.parseObjectKey("disposition")
      val disposition = parseDocking_Access_SupervisorRequestDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("operation")
      val operation = parseDocking_Access_SupervisorRequestOperationType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseDocking_Access_SupervisorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("accepted")
      val accepted = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("startsAuthorization")
      val startsAuthorization = parser.parseB()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.AdmissionDecision(disposition, operation, correlation, accepted, startsAuthorization)
    }

    def parseDocking_Access_SupervisorAdmissionDecision_Payload(): Docking_Access_Supervisor.AdmissionDecision_Payload = {
      val r = parseDocking_Access_SupervisorAdmissionDecision_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorAdmissionDecision_PayloadT(typeParsed: B): Docking_Access_Supervisor.AdmissionDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AdmissionDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.AdmissionDecision_Payload(value)
    }

    def parseDocking_Access_SupervisorRecoveryTransition(): Docking_Access_Supervisor.RecoveryTransition = {
      val r = parseDocking_Access_SupervisorRecoveryTransitionT(F)
      return r
    }

    def parseDocking_Access_SupervisorRecoveryTransitionT(typeParsed: B): Docking_Access_Supervisor.RecoveryTransition = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RecoveryTransition")
      }
      parser.parseObjectKey("intent")
      val intent = parseDocking_Access_SupervisorRecoveryIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("fault")
      val fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("verifiedAnchor")
      val verifiedAnchor = parser.parseB()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RecoveryTransition(intent, fault, verifiedAnchor)
    }

    def parseDocking_Access_SupervisorRecoveryTransition_Payload(): Docking_Access_Supervisor.RecoveryTransition_Payload = {
      val r = parseDocking_Access_SupervisorRecoveryTransition_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorRecoveryTransition_PayloadT(typeParsed: B): Docking_Access_Supervisor.RecoveryTransition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RecoveryTransition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorRecoveryTransition()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RecoveryTransition_Payload(value)
    }

    def parseDocking_Access_SupervisorCoordinationFrame(): Docking_Access_Supervisor.CoordinationFrame = {
      val r = parseDocking_Access_SupervisorCoordinationFrameT(F)
      return r
    }

    def parseDocking_Access_SupervisorCoordinationFrameT(typeParsed: B): Docking_Access_Supervisor.CoordinationFrame = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.CoordinationFrame")
      }
      parser.parseObjectKey("directive")
      val directive = parseDocking_Access_SupervisorLifecycleDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseDocking_Access_SupervisorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("qualified")
      val qualified = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("decisionContext")
      val decisionContext = parseDocking_Access_SupervisorDecisionContextType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.CoordinationFrame(directive, correlation, qualified, decisionContext)
    }

    def parseDocking_Access_SupervisorCoordinationFrame_Payload(): Docking_Access_Supervisor.CoordinationFrame_Payload = {
      val r = parseDocking_Access_SupervisorCoordinationFrame_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorCoordinationFrame_PayloadT(typeParsed: B): Docking_Access_Supervisor.CoordinationFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.CoordinationFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorCoordinationFrame()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.CoordinationFrame_Payload(value)
    }

    def parseDocking_Access_SupervisorBerthTransitionEvidence(): Docking_Access_Supervisor.BerthTransitionEvidence = {
      val r = parseDocking_Access_SupervisorBerthTransitionEvidenceT(F)
      return r
    }

    def parseDocking_Access_SupervisorBerthTransitionEvidenceT(typeParsed: B): Docking_Access_Supervisor.BerthTransitionEvidence = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.BerthTransitionEvidence")
      }
      parser.parseObjectKey("eventKind")
      val eventKind = parseDocking_Access_SupervisorBerthEvidenceKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseDocking_Access_SupervisorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("qualified")
      val qualified = parser.parseB()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.BerthTransitionEvidence(eventKind, correlation, qualified)
    }

    def parseDocking_Access_SupervisorBerthTransitionEvidence_Payload(): Docking_Access_Supervisor.BerthTransitionEvidence_Payload = {
      val r = parseDocking_Access_SupervisorBerthTransitionEvidence_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorBerthTransitionEvidence_PayloadT(typeParsed: B): Docking_Access_Supervisor.BerthTransitionEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.BerthTransitionEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorBerthTransitionEvidence()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.BerthTransitionEvidence_Payload(value)
    }

    def parseDocking_Access_SupervisorGateSafetyFrame(): Docking_Access_Supervisor.GateSafetyFrame = {
      val r = parseDocking_Access_SupervisorGateSafetyFrameT(F)
      return r
    }

    def parseDocking_Access_SupervisorGateSafetyFrameT(typeParsed: B): Docking_Access_Supervisor.GateSafetyFrame = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.GateSafetyFrame")
      }
      parser.parseObjectKey("directive")
      val directive = parseDocking_Access_SupervisorGateDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("safeToOpen")
      val safeToOpen = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("decisionContext")
      val decisionContext = parseDocking_Access_SupervisorDecisionContextType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.GateSafetyFrame(directive, safeToOpen, decisionContext)
    }

    def parseDocking_Access_SupervisorGateSafetyFrame_Payload(): Docking_Access_Supervisor.GateSafetyFrame_Payload = {
      val r = parseDocking_Access_SupervisorGateSafetyFrame_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorGateSafetyFrame_PayloadT(typeParsed: B): Docking_Access_Supervisor.GateSafetyFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.GateSafetyFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorGateSafetyFrame()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.GateSafetyFrame_Payload(value)
    }

    def parseDocking_Access_SupervisorPriorityDirective(): Docking_Access_Supervisor.PriorityDirective = {
      val r = parseDocking_Access_SupervisorPriorityDirectiveT(F)
      return r
    }

    def parseDocking_Access_SupervisorPriorityDirectiveT(typeParsed: B): Docking_Access_Supervisor.PriorityDirective = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.PriorityDirective")
      }
      parser.parseObjectKey("priority")
      val priority = parseDocking_Access_SupervisorPriorityKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseDocking_Access_SupervisorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("decisionContext")
      val decisionContext = parseDocking_Access_SupervisorDecisionContextType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.PriorityDirective(priority, correlation, decisionContext)
    }

    def parseDocking_Access_SupervisorPriorityDirective_Payload(): Docking_Access_Supervisor.PriorityDirective_Payload = {
      val r = parseDocking_Access_SupervisorPriorityDirective_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorPriorityDirective_PayloadT(typeParsed: B): Docking_Access_Supervisor.PriorityDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.PriorityDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorPriorityDirective()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.PriorityDirective_Payload(value)
    }

    def parseDocking_Access_SupervisorDockingProposal(): Docking_Access_Supervisor.DockingProposal = {
      val r = parseDocking_Access_SupervisorDockingProposalT(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingProposalT(typeParsed: B): Docking_Access_Supervisor.DockingProposal = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingProposal")
      }
      parser.parseObjectKey("applicable")
      val applicable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("proposedAction")
      val proposedAction = parseDocking_Access_SupervisorSupervisoryActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("cause")
      val cause = parseDocking_Access_SupervisorDecisionCauseType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseDocking_Access_SupervisorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("decisionContext")
      val decisionContext = parseDocking_Access_SupervisorDecisionContextType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingProposal(applicable, proposedAction, cause, correlation, decisionContext)
    }

    def parseDocking_Access_SupervisorDockingProposal_Payload(): Docking_Access_Supervisor.DockingProposal_Payload = {
      val r = parseDocking_Access_SupervisorDockingProposal_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingProposal_PayloadT(typeParsed: B): Docking_Access_Supervisor.DockingProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorDockingProposal()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingProposal_Payload(value)
    }

    def parseDocking_Access_SupervisorAccessProposal(): Docking_Access_Supervisor.AccessProposal = {
      val r = parseDocking_Access_SupervisorAccessProposalT(F)
      return r
    }

    def parseDocking_Access_SupervisorAccessProposalT(typeParsed: B): Docking_Access_Supervisor.AccessProposal = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AccessProposal")
      }
      parser.parseObjectKey("applicable")
      val applicable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("proposedAction")
      val proposedAction = parseDocking_Access_SupervisorSupervisoryActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("cause")
      val cause = parseDocking_Access_SupervisorDecisionCauseType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseDocking_Access_SupervisorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("decisionContext")
      val decisionContext = parseDocking_Access_SupervisorDecisionContextType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.AccessProposal(applicable, proposedAction, cause, correlation, decisionContext)
    }

    def parseDocking_Access_SupervisorAccessProposal_Payload(): Docking_Access_Supervisor.AccessProposal_Payload = {
      val r = parseDocking_Access_SupervisorAccessProposal_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorAccessProposal_PayloadT(typeParsed: B): Docking_Access_Supervisor.AccessProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AccessProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorAccessProposal()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.AccessProposal_Payload(value)
    }

    def parseDocking_Access_SupervisorUndockingProposal(): Docking_Access_Supervisor.UndockingProposal = {
      val r = parseDocking_Access_SupervisorUndockingProposalT(F)
      return r
    }

    def parseDocking_Access_SupervisorUndockingProposalT(typeParsed: B): Docking_Access_Supervisor.UndockingProposal = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.UndockingProposal")
      }
      parser.parseObjectKey("applicable")
      val applicable = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("proposedAction")
      val proposedAction = parseDocking_Access_SupervisorSupervisoryActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("cause")
      val cause = parseDocking_Access_SupervisorDecisionCauseType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseDocking_Access_SupervisorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("decisionContext")
      val decisionContext = parseDocking_Access_SupervisorDecisionContextType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.UndockingProposal(applicable, proposedAction, cause, correlation, decisionContext)
    }

    def parseDocking_Access_SupervisorUndockingProposal_Payload(): Docking_Access_Supervisor.UndockingProposal_Payload = {
      val r = parseDocking_Access_SupervisorUndockingProposal_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorUndockingProposal_PayloadT(typeParsed: B): Docking_Access_Supervisor.UndockingProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.UndockingProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorUndockingProposal()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.UndockingProposal_Payload(value)
    }

    def parseDocking_Access_SupervisorDockingDecisionFrame(): Docking_Access_Supervisor.DockingDecisionFrame = {
      val r = parseDocking_Access_SupervisorDockingDecisionFrameT(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingDecisionFrameT(typeParsed: B): Docking_Access_Supervisor.DockingDecisionFrame = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingDecisionFrame")
      }
      parser.parseObjectKey("proposedAction")
      val proposedAction = parseDocking_Access_SupervisorSupervisoryActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("cause")
      val cause = parseDocking_Access_SupervisorDecisionCauseType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseDocking_Access_SupervisorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("decisionContext")
      val decisionContext = parseDocking_Access_SupervisorDecisionContextType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingDecisionFrame(proposedAction, cause, correlation, decisionContext)
    }

    def parseDocking_Access_SupervisorDockingDecisionFrame_Payload(): Docking_Access_Supervisor.DockingDecisionFrame_Payload = {
      val r = parseDocking_Access_SupervisorDockingDecisionFrame_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingDecisionFrame_PayloadT(typeParsed: B): Docking_Access_Supervisor.DockingDecisionFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingDecisionFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorDockingDecisionFrame()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingDecisionFrame_Payload(value)
    }

    def parseDocking_Access_SupervisorDockingAccessResult(): Docking_Access_Supervisor.DockingAccessResult = {
      val r = parseDocking_Access_SupervisorDockingAccessResultT(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingAccessResultT(typeParsed: B): Docking_Access_Supervisor.DockingAccessResult = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingAccessResult")
      }
      parser.parseObjectKey("proposedAction")
      val proposedAction = parseDocking_Access_SupervisorSupervisoryActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("cause")
      val cause = parseDocking_Access_SupervisorDecisionCauseType()
      parser.parseObjectNext()
      parser.parseObjectKey("mode")
      val mode = parseDocking_Access_SupervisorPublicModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("correlation")
      val correlation = parseDocking_Access_SupervisorCorrelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseDocking_Access_SupervisorRequestDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseDocking_Access_SupervisorAccessStatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("outcome")
      val outcome = parseDocking_Access_SupervisorDockingOutcomeType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingAccessResult(proposedAction, cause, mode, correlation, disposition, status, outcome)
    }

    def parseDocking_Access_SupervisorDockingAccessResult_Payload(): Docking_Access_Supervisor.DockingAccessResult_Payload = {
      val r = parseDocking_Access_SupervisorDockingAccessResult_PayloadT(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingAccessResult_PayloadT(typeParsed: B): Docking_Access_Supervisor.DockingAccessResult_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingAccessResult_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocking_Access_SupervisorDockingAccessResult()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingAccessResult_Payload(value)
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

    def parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container(): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P", "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P" => val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS" => val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P = {
      val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P")
      }
      parser.parseObjectKey("api_access_request")
      val api_access_request = parseDocking_Access_SupervisorAccessRequestType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P(api_access_request)
    }

    def parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS = {
      val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_access_request")
      val api_access_request = parseDocking_Access_SupervisorAccessRequestType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS(api_access_request)
    }

    def parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container(): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P", "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P" => val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS" => val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P = {
      val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P")
      }
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseDocking_Access_SupervisorRequestFacts()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P(api_request_facts)
    }

    def parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS = {
      val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseDocking_Access_SupervisorRequestFacts()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS(api_request_facts)
    }

    def parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container(): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P", "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P" => val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS" => val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P = {
      val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_vessel_status")
      val api_vessel_status = parseDocking_Access_SupervisorVesselStatusType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(api_vessel_status)
    }

    def parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS = {
      val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_vessel_status")
      val api_vessel_status = parseDocking_Access_SupervisorVesselStatusType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(api_vessel_status)
    }

    def parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container(): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P", "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P" => val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS" => val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P = {
      val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_vessel_facts")
      val api_vessel_facts = parseDocking_Access_SupervisorVesselFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_vessel_readiness")
      val api_vessel_readiness = parseDocking_Access_SupervisorVesselFacts()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(api_vessel_facts, api_vessel_readiness)
    }

    def parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS = {
      val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_vessel_facts")
      val api_vessel_facts = parseDocking_Access_SupervisorVesselFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_vessel_readiness")
      val api_vessel_readiness = parseDocking_Access_SupervisorVesselFacts()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(api_vessel_facts, api_vessel_readiness)
    }

    def parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container(): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P", "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P" => val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS" => val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P = {
      val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_station_report")
      val api_station_report = parseDocking_Access_SupervisorStationReportType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(api_station_report)
    }

    def parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS = {
      val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_station_report")
      val api_station_report = parseDocking_Access_SupervisorStationReportType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(api_station_report)
    }

    def parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container(): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P", "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P" => val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS" => val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P = {
      val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_station_facts")
      val api_station_facts = parseDocking_Access_SupervisorStationFacts()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(api_station_facts)
    }

    def parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS = {
      val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_station_facts")
      val api_station_facts = parseDocking_Access_SupervisorStationFacts()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(api_station_facts)
    }

    def parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container(): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P", "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P" => val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS" => val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P = {
      val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P")
      }
      parser.parseObjectKey("api_service_activity")
      val api_service_activity = parseDocking_Access_SupervisorServiceActivityType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(api_service_activity)
    }

    def parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS = {
      val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_service_activity")
      val api_service_activity = parseDocking_Access_SupervisorServiceActivityType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(api_service_activity)
    }

    def parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container(): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P", "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P" => val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS" => val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P = {
      val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P")
      }
      parser.parseObjectKey("api_service_facts")
      val api_service_facts = parseDocking_Access_SupervisorServiceFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_service_readiness")
      val api_service_readiness = parseDocking_Access_SupervisorServiceFacts()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(api_service_facts, api_service_readiness)
    }

    def parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS = {
      val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_service_facts")
      val api_service_facts = parseDocking_Access_SupervisorServiceFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_service_readiness")
      val api_service_readiness = parseDocking_Access_SupervisorServiceFacts()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(api_service_facts, api_service_readiness)
    }

    def parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container(): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P", "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P" => val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS" => val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P = {
      val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P")
      }
      parser.parseObjectKey("api_admission_guard")
      val api_admission_guard = parseDocking_Access_SupervisorAdmissionGuard()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseDocking_Access_SupervisorRequestFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_service_readiness")
      val api_service_readiness = parseDocking_Access_SupervisorServiceFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_vessel_readiness")
      val api_vessel_readiness = parseDocking_Access_SupervisorVesselFacts()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P(api_admission_guard, api_request_facts, api_service_readiness, api_vessel_readiness)
    }

    def parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS = {
      val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS")
      }
      parser.parseObjectKey("api_admission_guard")
      val api_admission_guard = parseDocking_Access_SupervisorAdmissionGuard()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseDocking_Access_SupervisorRequestFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_service_readiness")
      val api_service_readiness = parseDocking_Access_SupervisorServiceFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_vessel_readiness")
      val api_vessel_readiness = parseDocking_Access_SupervisorVesselFacts()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS(api_admission_guard, api_request_facts, api_service_readiness, api_vessel_readiness)
    }

    def parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container(): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P", "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P" => val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS" => val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P = {
      val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P")
      }
      parser.parseObjectKey("api_access_admission")
      val api_access_admission = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_docking_admission")
      val api_docking_admission = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_admission")
      val api_gate_admission = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycle_admission")
      val api_lifecycle_admission = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_disposition")
      val api_request_disposition = parseDocking_Access_SupervisorRequestDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_undocking_admission")
      val api_undocking_admission = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P(api_access_admission, api_docking_admission, api_gate_admission, api_lifecycle_admission, api_request_disposition, api_undocking_admission)
    }

    def parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS = {
      val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS")
      }
      parser.parseObjectKey("api_access_admission")
      val api_access_admission = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_docking_admission")
      val api_docking_admission = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_admission")
      val api_gate_admission = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycle_admission")
      val api_lifecycle_admission = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_disposition")
      val api_request_disposition = parseDocking_Access_SupervisorRequestDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_undocking_admission")
      val api_undocking_admission = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS(api_access_admission, api_docking_admission, api_gate_admission, api_lifecycle_admission, api_request_disposition, api_undocking_admission)
    }

    def parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container(): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P", "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P" => val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS" => val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P = {
      val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P")
      }
      parser.parseObjectKey("api_control_event")
      val api_control_event = parseDocking_Access_SupervisorControlEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_berth_state")
      val api_prior_berth_state = parseDocking_Access_SupervisorBerthStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_gate_state")
      val api_prior_gate_state = parseDocking_Access_SupervisorGateStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_lifecycle_view")
      val api_prior_lifecycle_view = parseDocking_Access_SupervisorPriorLifecycleView()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_recovery_state")
      val api_prior_recovery_state = parseDocking_Access_SupervisorRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_service_facts")
      val api_service_facts = parseDocking_Access_SupervisorServiceFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_station_facts")
      val api_station_facts = parseDocking_Access_SupervisorStationFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_vessel_facts")
      val api_vessel_facts = parseDocking_Access_SupervisorVesselFacts()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P(api_control_event, api_prior_berth_state, api_prior_gate_state, api_prior_lifecycle_view, api_prior_recovery_state, api_service_facts, api_station_facts, api_vessel_facts)
    }

    def parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS = {
      val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS")
      }
      parser.parseObjectKey("api_control_event")
      val api_control_event = parseDocking_Access_SupervisorControlEventType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_berth_state")
      val api_prior_berth_state = parseDocking_Access_SupervisorBerthStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_gate_state")
      val api_prior_gate_state = parseDocking_Access_SupervisorGateStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_lifecycle_view")
      val api_prior_lifecycle_view = parseDocking_Access_SupervisorPriorLifecycleView()
      parser.parseObjectNext()
      parser.parseObjectKey("api_prior_recovery_state")
      val api_prior_recovery_state = parseDocking_Access_SupervisorRecoveryStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_service_facts")
      val api_service_facts = parseDocking_Access_SupervisorServiceFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_station_facts")
      val api_station_facts = parseDocking_Access_SupervisorStationFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_vessel_facts")
      val api_vessel_facts = parseDocking_Access_SupervisorVesselFacts()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(api_control_event, api_prior_berth_state, api_prior_gate_state, api_prior_lifecycle_view, api_prior_recovery_state, api_service_facts, api_station_facts, api_vessel_facts)
    }

    def parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container(): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P", "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P" => val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS" => val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P = {
      val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P")
      }
      parser.parseObjectKey("api_access_frame")
      val api_access_frame = parseDocking_Access_SupervisorCoordinationFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_admission_guard")
      val api_admission_guard = parseDocking_Access_SupervisorAdmissionGuard()
      parser.parseObjectNext()
      parser.parseObjectKey("api_berth_transition_evidence")
      val api_berth_transition_evidence = parseDocking_Access_SupervisorBerthTransitionEvidence()
      parser.parseObjectNext()
      parser.parseObjectKey("api_docking_frame")
      val api_docking_frame = parseDocking_Access_SupervisorCoordinationFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_safety_frame")
      val api_gate_safety_frame = parseDocking_Access_SupervisorGateSafetyFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycle_frame")
      val api_lifecycle_frame = parseDocking_Access_SupervisorCoordinationFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_priority_directive")
      val api_priority_directive = parseDocking_Access_SupervisorPriorityDirective()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_transition")
      val api_recovery_transition = parseDocking_Access_SupervisorRecoveryTransition()
      parser.parseObjectNext()
      parser.parseObjectKey("api_undocking_frame")
      val api_undocking_frame = parseDocking_Access_SupervisorCoordinationFrame()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P(api_access_frame, api_admission_guard, api_berth_transition_evidence, api_docking_frame, api_gate_safety_frame, api_lifecycle_frame, api_priority_directive, api_recovery_transition, api_undocking_frame)
    }

    def parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS = {
      val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS")
      }
      parser.parseObjectKey("api_access_frame")
      val api_access_frame = parseDocking_Access_SupervisorCoordinationFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_admission_guard")
      val api_admission_guard = parseDocking_Access_SupervisorAdmissionGuard()
      parser.parseObjectNext()
      parser.parseObjectKey("api_berth_transition_evidence")
      val api_berth_transition_evidence = parseDocking_Access_SupervisorBerthTransitionEvidence()
      parser.parseObjectNext()
      parser.parseObjectKey("api_docking_frame")
      val api_docking_frame = parseDocking_Access_SupervisorCoordinationFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_safety_frame")
      val api_gate_safety_frame = parseDocking_Access_SupervisorGateSafetyFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycle_frame")
      val api_lifecycle_frame = parseDocking_Access_SupervisorCoordinationFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_priority_directive")
      val api_priority_directive = parseDocking_Access_SupervisorPriorityDirective()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_transition")
      val api_recovery_transition = parseDocking_Access_SupervisorRecoveryTransition()
      parser.parseObjectNext()
      parser.parseObjectKey("api_undocking_frame")
      val api_undocking_frame = parseDocking_Access_SupervisorCoordinationFrame()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(api_access_frame, api_admission_guard, api_berth_transition_evidence, api_docking_frame, api_gate_safety_frame, api_lifecycle_frame, api_priority_directive, api_recovery_transition, api_undocking_frame)
    }

    def parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container(): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P", "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P" => val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS" => val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P = {
      val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycle_frame")
      val api_lifecycle_frame = parseDocking_Access_SupervisorCoordinationFrame()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(api_admission_decision, api_lifecycle_frame)
    }

    def parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS = {
      val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycle_frame")
      val api_lifecycle_frame = parseDocking_Access_SupervisorCoordinationFrame()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(api_admission_decision, api_lifecycle_frame)
    }

    def parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container(): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P", "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P" => val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS" => val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P = {
      val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P")
      }
      parser.parseObjectKey("api_prior_lifecycle_view")
      val api_prior_lifecycle_view = parseDocking_Access_SupervisorPriorLifecycleView()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(api_prior_lifecycle_view)
    }

    def parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS = {
      val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS")
      }
      parser.parseObjectKey("api_prior_lifecycle_view")
      val api_prior_lifecycle_view = parseDocking_Access_SupervisorPriorLifecycleView()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(api_prior_lifecycle_view)
    }

    def parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container(): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P", "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P" => val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS" => val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P = {
      val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P")
      }
      parser.parseObjectKey("api_berth_transition_evidence")
      val api_berth_transition_evidence = parseDocking_Access_SupervisorBerthTransitionEvidence()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(api_berth_transition_evidence)
    }

    def parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS = {
      val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS")
      }
      parser.parseObjectKey("api_berth_transition_evidence")
      val api_berth_transition_evidence = parseDocking_Access_SupervisorBerthTransitionEvidence()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(api_berth_transition_evidence)
    }

    def parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container(): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P", "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P" => val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS" => val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P = {
      val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P")
      }
      parser.parseObjectKey("api_prior_berth_state")
      val api_prior_berth_state = parseDocking_Access_SupervisorBerthStateType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(api_prior_berth_state)
    }

    def parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS = {
      val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS")
      }
      parser.parseObjectKey("api_prior_berth_state")
      val api_prior_berth_state = parseDocking_Access_SupervisorBerthStateType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(api_prior_berth_state)
    }

    def parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container(): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P", "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P" => val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS" => val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P = {
      val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_safety_frame")
      val api_gate_safety_frame = parseDocking_Access_SupervisorGateSafetyFrame()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(api_admission_decision, api_gate_safety_frame)
    }

    def parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS = {
      val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gate_safety_frame")
      val api_gate_safety_frame = parseDocking_Access_SupervisorGateSafetyFrame()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(api_admission_decision, api_gate_safety_frame)
    }

    def parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container(): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P", "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P" => val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS" => val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P = {
      val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P")
      }
      parser.parseObjectKey("api_prior_gate_state")
      val api_prior_gate_state = parseDocking_Access_SupervisorGateStateType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(api_prior_gate_state)
    }

    def parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS = {
      val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS")
      }
      parser.parseObjectKey("api_prior_gate_state")
      val api_prior_gate_state = parseDocking_Access_SupervisorGateStateType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(api_prior_gate_state)
    }

    def parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container(): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P", "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P" => val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS" => val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P = {
      val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P")
      }
      parser.parseObjectKey("api_recovery_transition")
      val api_recovery_transition = parseDocking_Access_SupervisorRecoveryTransition()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(api_recovery_transition)
    }

    def parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS = {
      val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_recovery_transition")
      val api_recovery_transition = parseDocking_Access_SupervisorRecoveryTransition()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(api_recovery_transition)
    }

    def parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container(): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P", "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P" => val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS" => val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P = {
      val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P")
      }
      parser.parseObjectKey("api_prior_recovery_state")
      val api_prior_recovery_state = parseDocking_Access_SupervisorRecoveryStateType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(api_prior_recovery_state)
    }

    def parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS = {
      val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_prior_recovery_state")
      val api_prior_recovery_state = parseDocking_Access_SupervisorRecoveryStateType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(api_prior_recovery_state)
    }

    def parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container(): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P", "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P" => val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS" => val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P = {
      val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_docking_frame")
      val api_docking_frame = parseDocking_Access_SupervisorCoordinationFrame()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(api_admission_decision, api_docking_frame)
    }

    def parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS = {
      val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_docking_frame")
      val api_docking_frame = parseDocking_Access_SupervisorCoordinationFrame()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(api_admission_decision, api_docking_frame)
    }

    def parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container(): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P", "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P" => val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS" => val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P = {
      val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_docking_proposal")
      val api_docking_proposal = parseDocking_Access_SupervisorDockingProposal()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(api_docking_proposal)
    }

    def parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS = {
      val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_docking_proposal")
      val api_docking_proposal = parseDocking_Access_SupervisorDockingProposal()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(api_docking_proposal)
    }

    def parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container(): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P", "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P" => val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS" => val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P = {
      val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_access_frame")
      val api_access_frame = parseDocking_Access_SupervisorCoordinationFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(api_access_frame, api_admission_decision)
    }

    def parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS = {
      val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_access_frame")
      val api_access_frame = parseDocking_Access_SupervisorCoordinationFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(api_access_frame, api_admission_decision)
    }

    def parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container(): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P", "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P" => val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS" => val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P = {
      val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_access_proposal")
      val api_access_proposal = parseDocking_Access_SupervisorAccessProposal()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(api_access_proposal)
    }

    def parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS = {
      val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_access_proposal")
      val api_access_proposal = parseDocking_Access_SupervisorAccessProposal()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(api_access_proposal)
    }

    def parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container(): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P", "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P" => val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS" => val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P = {
      val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_undocking_frame")
      val api_undocking_frame = parseDocking_Access_SupervisorCoordinationFrame()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(api_admission_decision, api_undocking_frame)
    }

    def parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS = {
      val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS")
      }
      parser.parseObjectKey("api_admission_decision")
      val api_admission_decision = parseDocking_Access_SupervisorAdmissionDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_undocking_frame")
      val api_undocking_frame = parseDocking_Access_SupervisorCoordinationFrame()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(api_admission_decision, api_undocking_frame)
    }

    def parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container(): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P", "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P" => val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS" => val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P = {
      val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P")
      }
      parser.parseObjectKey("api_undocking_proposal")
      val api_undocking_proposal = parseDocking_Access_SupervisorUndockingProposal()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(api_undocking_proposal)
    }

    def parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS = {
      val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS")
      }
      parser.parseObjectKey("api_undocking_proposal")
      val api_undocking_proposal = parseDocking_Access_SupervisorUndockingProposal()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(api_undocking_proposal)
    }

    def parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container(): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P", "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P" => val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS" => val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P = {
      val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P")
      }
      parser.parseObjectKey("api_access_proposal")
      val api_access_proposal = parseDocking_Access_SupervisorAccessProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_docking_proposal")
      val api_docking_proposal = parseDocking_Access_SupervisorDockingProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_priority_directive")
      val api_priority_directive = parseDocking_Access_SupervisorPriorityDirective()
      parser.parseObjectNext()
      parser.parseObjectKey("api_undocking_proposal")
      val api_undocking_proposal = parseDocking_Access_SupervisorUndockingProposal()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(api_access_proposal, api_docking_proposal, api_priority_directive, api_undocking_proposal)
    }

    def parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS = {
      val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS")
      }
      parser.parseObjectKey("api_access_proposal")
      val api_access_proposal = parseDocking_Access_SupervisorAccessProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_docking_proposal")
      val api_docking_proposal = parseDocking_Access_SupervisorDockingProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_priority_directive")
      val api_priority_directive = parseDocking_Access_SupervisorPriorityDirective()
      parser.parseObjectNext()
      parser.parseObjectKey("api_undocking_proposal")
      val api_undocking_proposal = parseDocking_Access_SupervisorUndockingProposal()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(api_access_proposal, api_docking_proposal, api_priority_directive, api_undocking_proposal)
    }

    def parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container(): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P", "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P" => val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS" => val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P = {
      val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P")
      }
      parser.parseObjectKey("api_docking_decision")
      val api_docking_decision = parseDocking_Access_SupervisorDockingDecisionFrame()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(api_docking_decision)
    }

    def parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS = {
      val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS")
      }
      parser.parseObjectKey("api_docking_decision")
      val api_docking_decision = parseDocking_Access_SupervisorDockingDecisionFrame()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(api_docking_decision)
    }

    def parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container(): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P", "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P" => val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS" => val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P = {
      val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PT(typeParsed: B): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P")
      }
      parser.parseObjectKey("api_docking_decision")
      val api_docking_decision = parseDocking_Access_SupervisorDockingDecisionFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_disposition")
      val api_request_disposition = parseDocking_Access_SupervisorRequestDispositionType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P(api_docking_decision, api_request_disposition)
    }

    def parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS = {
      val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PST(typeParsed: B): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS")
      }
      parser.parseObjectKey("api_docking_decision")
      val api_docking_decision = parseDocking_Access_SupervisorDockingDecisionFrame()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_disposition")
      val api_request_disposition = parseDocking_Access_SupervisorRequestDispositionType()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS(api_docking_decision, api_request_disposition)
    }

    def parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container(): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P", "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS"))
      t.native match {
        case "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P" => val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS" => val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PST(T); return r
      }
    }

    def parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P = {
      val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PT(F)
      return r
    }

    def parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PT(typeParsed: B): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P")
      }
      parser.parseObjectKey("api_docking_access_result")
      val api_docking_access_result = parseDocking_Access_SupervisorDockingAccessResult()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P(api_docking_access_result)
    }

    def parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS = {
      val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PST(F)
      return r
    }

    def parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PST(typeParsed: B): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS")
      }
      parser.parseObjectKey("api_docking_access_result")
      val api_docking_access_result = parseDocking_Access_SupervisorDockingAccessResult()
      parser.parseObjectNext()
      return Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS(api_docking_access_result)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P", "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS", "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P", "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P", "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS", "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS", "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P", "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS", "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P", "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P", "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS", "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS", "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P", "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS", "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P", "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS", "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P", "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS", "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P", "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS", "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P", "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS", "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P", "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS", "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P", "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS", "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P", "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS", "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P", "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS", "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P", "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS", "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P", "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS", "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P", "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS", "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P", "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P", "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS", "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS", "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P", "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P", "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS", "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS", "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P", "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P", "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS", "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS", "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P", "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS", "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P", "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS", "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P", "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS", "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P", "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS", "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P", "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS", "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P", "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P" => val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS" => val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P" => val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P" => val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS" => val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS" => val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P" => val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS" => val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P" => val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P" => val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS" => val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS" => val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P" => val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS" => val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P" => val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS" => val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P" => val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS" => val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P" => val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS" => val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P" => val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS" => val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P" => val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS" => val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P" => val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS" => val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P" => val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS" => val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P" => val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS" => val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P" => val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS" => val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P" => val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS" => val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P" => val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS" => val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P" => val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P" => val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS" => val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS" => val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P" => val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P" => val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS" => val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS" => val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P" => val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P" => val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS" => val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS" => val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P" => val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS" => val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P" => val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS" => val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P" => val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS" => val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P" => val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS" => val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P" => val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS" => val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P" => val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS" => val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Docking_Access_Supervisor.GateState_Payload", "Docking_Access_Supervisor.BerthState_Payload", "Docking_Access_Supervisor.PublicMode_Payload", "Docking_Access_Supervisor.Correlation_Payload", "Docking_Access_Supervisor.VesselClass_Payload", "Docking_Access_Supervisor.VesselFacts_Payload", "Docking_Access_Supervisor.AccessStatus_Payload", "Docking_Access_Supervisor.ServiceClass_Payload", "Docking_Access_Supervisor.PriorityKind_Payload", "Docking_Access_Supervisor.ControlEvent_Payload", "Docking_Access_Supervisor.VesselStatus_Payload", "Docking_Access_Supervisor.ServiceFacts_Payload", "Docking_Access_Supervisor.RequestFacts_Payload", "Docking_Access_Supervisor.StationFacts_Payload", "Docking_Access_Supervisor.RecoveryState_Payload", "Docking_Access_Supervisor.GateDirective_Payload", "Docking_Access_Supervisor.AccessRequest_Payload", "Docking_Access_Supervisor.StationReport_Payload", "Docking_Access_Supervisor.DecisionCause_Payload", "Docking_Access_Supervisor.RecoveryIntent_Payload", "Docking_Access_Supervisor.DockingOutcome_Payload", "Docking_Access_Supervisor.LifecycleState_Payload", "Docking_Access_Supervisor.AdmissionGuard_Payload", "Docking_Access_Supervisor.AccessProposal_Payload", "Docking_Access_Supervisor.ServiceActivity_Payload", "Docking_Access_Supervisor.StationProgress_Payload", "Docking_Access_Supervisor.DecisionContext_Payload", "Docking_Access_Supervisor.GateSafetyFrame_Payload", "Docking_Access_Supervisor.DockingProposal_Payload", "Docking_Access_Supervisor.RequestOperation_Payload", "Docking_Access_Supervisor.SupervisoryAction_Payload", "Docking_Access_Supervisor.BerthEvidenceKind_Payload", "Docking_Access_Supervisor.PriorityDirective_Payload", "Docking_Access_Supervisor.CoordinationFrame_Payload", "Docking_Access_Supervisor.AdmissionDecision_Payload", "Docking_Access_Supervisor.UndockingProposal_Payload", "Docking_Access_Supervisor.RequestDisposition_Payload", "Docking_Access_Supervisor.LifecycleDirective_Payload", "Docking_Access_Supervisor.PriorLifecycleView_Payload", "Docking_Access_Supervisor.RecoveryTransition_Payload", "Docking_Access_Supervisor.DockingAccessResult_Payload", "Docking_Access_Supervisor.DockingDecisionFrame_Payload", "Docking_Access_Supervisor.BerthTransitionEvidence_Payload", "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P", "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS", "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P", "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P", "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS", "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS", "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P", "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS", "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P", "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P", "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS", "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS", "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P", "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS", "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P", "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS", "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P", "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS", "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P", "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS", "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P", "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS", "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P", "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS", "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P", "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS", "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P", "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS", "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P", "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS", "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P", "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS", "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P", "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS", "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P", "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS", "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P", "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P", "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS", "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS", "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P", "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P", "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS", "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS", "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P", "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P", "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS", "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS", "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P", "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS", "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P", "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS", "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P", "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS", "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P", "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS", "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P", "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS", "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P", "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS"))
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
        case "Docking_Access_Supervisor.GateState_Payload" => val r = parseDocking_Access_SupervisorGateState_PayloadT(T); return r
        case "Docking_Access_Supervisor.BerthState_Payload" => val r = parseDocking_Access_SupervisorBerthState_PayloadT(T); return r
        case "Docking_Access_Supervisor.PublicMode_Payload" => val r = parseDocking_Access_SupervisorPublicMode_PayloadT(T); return r
        case "Docking_Access_Supervisor.Correlation_Payload" => val r = parseDocking_Access_SupervisorCorrelation_PayloadT(T); return r
        case "Docking_Access_Supervisor.VesselClass_Payload" => val r = parseDocking_Access_SupervisorVesselClass_PayloadT(T); return r
        case "Docking_Access_Supervisor.VesselFacts_Payload" => val r = parseDocking_Access_SupervisorVesselFacts_PayloadT(T); return r
        case "Docking_Access_Supervisor.AccessStatus_Payload" => val r = parseDocking_Access_SupervisorAccessStatus_PayloadT(T); return r
        case "Docking_Access_Supervisor.ServiceClass_Payload" => val r = parseDocking_Access_SupervisorServiceClass_PayloadT(T); return r
        case "Docking_Access_Supervisor.PriorityKind_Payload" => val r = parseDocking_Access_SupervisorPriorityKind_PayloadT(T); return r
        case "Docking_Access_Supervisor.ControlEvent_Payload" => val r = parseDocking_Access_SupervisorControlEvent_PayloadT(T); return r
        case "Docking_Access_Supervisor.VesselStatus_Payload" => val r = parseDocking_Access_SupervisorVesselStatus_PayloadT(T); return r
        case "Docking_Access_Supervisor.ServiceFacts_Payload" => val r = parseDocking_Access_SupervisorServiceFacts_PayloadT(T); return r
        case "Docking_Access_Supervisor.RequestFacts_Payload" => val r = parseDocking_Access_SupervisorRequestFacts_PayloadT(T); return r
        case "Docking_Access_Supervisor.StationFacts_Payload" => val r = parseDocking_Access_SupervisorStationFacts_PayloadT(T); return r
        case "Docking_Access_Supervisor.RecoveryState_Payload" => val r = parseDocking_Access_SupervisorRecoveryState_PayloadT(T); return r
        case "Docking_Access_Supervisor.GateDirective_Payload" => val r = parseDocking_Access_SupervisorGateDirective_PayloadT(T); return r
        case "Docking_Access_Supervisor.AccessRequest_Payload" => val r = parseDocking_Access_SupervisorAccessRequest_PayloadT(T); return r
        case "Docking_Access_Supervisor.StationReport_Payload" => val r = parseDocking_Access_SupervisorStationReport_PayloadT(T); return r
        case "Docking_Access_Supervisor.DecisionCause_Payload" => val r = parseDocking_Access_SupervisorDecisionCause_PayloadT(T); return r
        case "Docking_Access_Supervisor.RecoveryIntent_Payload" => val r = parseDocking_Access_SupervisorRecoveryIntent_PayloadT(T); return r
        case "Docking_Access_Supervisor.DockingOutcome_Payload" => val r = parseDocking_Access_SupervisorDockingOutcome_PayloadT(T); return r
        case "Docking_Access_Supervisor.LifecycleState_Payload" => val r = parseDocking_Access_SupervisorLifecycleState_PayloadT(T); return r
        case "Docking_Access_Supervisor.AdmissionGuard_Payload" => val r = parseDocking_Access_SupervisorAdmissionGuard_PayloadT(T); return r
        case "Docking_Access_Supervisor.AccessProposal_Payload" => val r = parseDocking_Access_SupervisorAccessProposal_PayloadT(T); return r
        case "Docking_Access_Supervisor.ServiceActivity_Payload" => val r = parseDocking_Access_SupervisorServiceActivity_PayloadT(T); return r
        case "Docking_Access_Supervisor.StationProgress_Payload" => val r = parseDocking_Access_SupervisorStationProgress_PayloadT(T); return r
        case "Docking_Access_Supervisor.DecisionContext_Payload" => val r = parseDocking_Access_SupervisorDecisionContext_PayloadT(T); return r
        case "Docking_Access_Supervisor.GateSafetyFrame_Payload" => val r = parseDocking_Access_SupervisorGateSafetyFrame_PayloadT(T); return r
        case "Docking_Access_Supervisor.DockingProposal_Payload" => val r = parseDocking_Access_SupervisorDockingProposal_PayloadT(T); return r
        case "Docking_Access_Supervisor.RequestOperation_Payload" => val r = parseDocking_Access_SupervisorRequestOperation_PayloadT(T); return r
        case "Docking_Access_Supervisor.SupervisoryAction_Payload" => val r = parseDocking_Access_SupervisorSupervisoryAction_PayloadT(T); return r
        case "Docking_Access_Supervisor.BerthEvidenceKind_Payload" => val r = parseDocking_Access_SupervisorBerthEvidenceKind_PayloadT(T); return r
        case "Docking_Access_Supervisor.PriorityDirective_Payload" => val r = parseDocking_Access_SupervisorPriorityDirective_PayloadT(T); return r
        case "Docking_Access_Supervisor.CoordinationFrame_Payload" => val r = parseDocking_Access_SupervisorCoordinationFrame_PayloadT(T); return r
        case "Docking_Access_Supervisor.AdmissionDecision_Payload" => val r = parseDocking_Access_SupervisorAdmissionDecision_PayloadT(T); return r
        case "Docking_Access_Supervisor.UndockingProposal_Payload" => val r = parseDocking_Access_SupervisorUndockingProposal_PayloadT(T); return r
        case "Docking_Access_Supervisor.RequestDisposition_Payload" => val r = parseDocking_Access_SupervisorRequestDisposition_PayloadT(T); return r
        case "Docking_Access_Supervisor.LifecycleDirective_Payload" => val r = parseDocking_Access_SupervisorLifecycleDirective_PayloadT(T); return r
        case "Docking_Access_Supervisor.PriorLifecycleView_Payload" => val r = parseDocking_Access_SupervisorPriorLifecycleView_PayloadT(T); return r
        case "Docking_Access_Supervisor.RecoveryTransition_Payload" => val r = parseDocking_Access_SupervisorRecoveryTransition_PayloadT(T); return r
        case "Docking_Access_Supervisor.DockingAccessResult_Payload" => val r = parseDocking_Access_SupervisorDockingAccessResult_PayloadT(T); return r
        case "Docking_Access_Supervisor.DockingDecisionFrame_Payload" => val r = parseDocking_Access_SupervisorDockingDecisionFrame_PayloadT(T); return r
        case "Docking_Access_Supervisor.BerthTransitionEvidence_Payload" => val r = parseDocking_Access_SupervisorBerthTransitionEvidence_PayloadT(T); return r
        case "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P" => val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS" => val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P" => val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P" => val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS" => val r = parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS" => val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P" => val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS" => val r = parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P" => val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P" => val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS" => val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS" => val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P" => val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS" => val r = parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P" => val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS" => val r = parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P" => val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS" => val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P" => val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS" => val r = parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P" => val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS" => val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P" => val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS" => val r = parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P" => val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS" => val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P" => val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS" => val r = parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P" => val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS" => val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P" => val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS" => val r = parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P" => val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS" => val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P" => val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS" => val r = parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P" => val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P" => val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS" => val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS" => val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P" => val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P" => val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS" => val r = parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS" => val r = parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P" => val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P" => val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS" => val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS" => val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P" => val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS" => val r = parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P" => val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS" => val r = parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P" => val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS" => val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P" => val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS" => val r = parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PST(T); return r
        case "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P" => val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PT(T); return r
        case "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS" => val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PST(T); return r
        case "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P" => val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PT(T); return r
        case "Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS" => val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PST(T); return r
        case _ => val r = parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PST(T); return r
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

  def fromDocking_Access_SupervisorAccessRequest_Payload(o: Docking_Access_Supervisor.AccessRequest_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAccessRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAccessRequest_Payload(s: String): Either[Docking_Access_Supervisor.AccessRequest_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessRequest_Payload(parser: Parser): Docking_Access_Supervisor.AccessRequest_Payload = {
      val r = parser.parseDocking_Access_SupervisorAccessRequest_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAccessRequest_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorRequestOperation_Payload(o: Docking_Access_Supervisor.RequestOperation_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRequestOperation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRequestOperation_Payload(s: String): Either[Docking_Access_Supervisor.RequestOperation_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestOperation_Payload(parser: Parser): Docking_Access_Supervisor.RequestOperation_Payload = {
      val r = parser.parseDocking_Access_SupervisorRequestOperation_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRequestOperation_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorCorrelation_Payload(o: Docking_Access_Supervisor.Correlation_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorCorrelation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorCorrelation_Payload(s: String): Either[Docking_Access_Supervisor.Correlation_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorCorrelation_Payload(parser: Parser): Docking_Access_Supervisor.Correlation_Payload = {
      val r = parser.parseDocking_Access_SupervisorCorrelation_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorCorrelation_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorVesselStatus_Payload(o: Docking_Access_Supervisor.VesselStatus_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorVesselStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorVesselStatus_Payload(s: String): Either[Docking_Access_Supervisor.VesselStatus_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselStatus_Payload(parser: Parser): Docking_Access_Supervisor.VesselStatus_Payload = {
      val r = parser.parseDocking_Access_SupervisorVesselStatus_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorVesselStatus_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorVesselClass_Payload(o: Docking_Access_Supervisor.VesselClass_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorVesselClass_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorVesselClass_Payload(s: String): Either[Docking_Access_Supervisor.VesselClass_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselClass_Payload(parser: Parser): Docking_Access_Supervisor.VesselClass_Payload = {
      val r = parser.parseDocking_Access_SupervisorVesselClass_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorVesselClass_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorStationReport_Payload(o: Docking_Access_Supervisor.StationReport_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorStationReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorStationReport_Payload(s: String): Either[Docking_Access_Supervisor.StationReport_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorStationReport_Payload(parser: Parser): Docking_Access_Supervisor.StationReport_Payload = {
      val r = parser.parseDocking_Access_SupervisorStationReport_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorStationReport_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorStationProgress_Payload(o: Docking_Access_Supervisor.StationProgress_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorStationProgress_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorStationProgress_Payload(s: String): Either[Docking_Access_Supervisor.StationProgress_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorStationProgress_Payload(parser: Parser): Docking_Access_Supervisor.StationProgress_Payload = {
      val r = parser.parseDocking_Access_SupervisorStationProgress_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorStationProgress_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorServiceActivity_Payload(o: Docking_Access_Supervisor.ServiceActivity_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorServiceActivity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorServiceActivity_Payload(s: String): Either[Docking_Access_Supervisor.ServiceActivity_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceActivity_Payload(parser: Parser): Docking_Access_Supervisor.ServiceActivity_Payload = {
      val r = parser.parseDocking_Access_SupervisorServiceActivity_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorServiceActivity_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorServiceClass_Payload(o: Docking_Access_Supervisor.ServiceClass_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorServiceClass_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorServiceClass_Payload(s: String): Either[Docking_Access_Supervisor.ServiceClass_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceClass_Payload(parser: Parser): Docking_Access_Supervisor.ServiceClass_Payload = {
      val r = parser.parseDocking_Access_SupervisorServiceClass_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorServiceClass_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorLifecycleState_Payload(o: Docking_Access_Supervisor.LifecycleState_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorLifecycleState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorLifecycleState_Payload(s: String): Either[Docking_Access_Supervisor.LifecycleState_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorLifecycleState_Payload(parser: Parser): Docking_Access_Supervisor.LifecycleState_Payload = {
      val r = parser.parseDocking_Access_SupervisorLifecycleState_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorLifecycleState_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorRequestDisposition_Payload(o: Docking_Access_Supervisor.RequestDisposition_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRequestDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRequestDisposition_Payload(s: String): Either[Docking_Access_Supervisor.RequestDisposition_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestDisposition_Payload(parser: Parser): Docking_Access_Supervisor.RequestDisposition_Payload = {
      val r = parser.parseDocking_Access_SupervisorRequestDisposition_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRequestDisposition_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorControlEvent_Payload(o: Docking_Access_Supervisor.ControlEvent_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorControlEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorControlEvent_Payload(s: String): Either[Docking_Access_Supervisor.ControlEvent_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorControlEvent_Payload(parser: Parser): Docking_Access_Supervisor.ControlEvent_Payload = {
      val r = parser.parseDocking_Access_SupervisorControlEvent_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorControlEvent_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorBerthState_Payload(o: Docking_Access_Supervisor.BerthState_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorBerthState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorBerthState_Payload(s: String): Either[Docking_Access_Supervisor.BerthState_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthState_Payload(parser: Parser): Docking_Access_Supervisor.BerthState_Payload = {
      val r = parser.parseDocking_Access_SupervisorBerthState_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorBerthState_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorGateState_Payload(o: Docking_Access_Supervisor.GateState_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorGateState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorGateState_Payload(s: String): Either[Docking_Access_Supervisor.GateState_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorGateState_Payload(parser: Parser): Docking_Access_Supervisor.GateState_Payload = {
      val r = parser.parseDocking_Access_SupervisorGateState_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorGateState_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorRecoveryState_Payload(o: Docking_Access_Supervisor.RecoveryState_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRecoveryState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRecoveryState_Payload(s: String): Either[Docking_Access_Supervisor.RecoveryState_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoveryState_Payload(parser: Parser): Docking_Access_Supervisor.RecoveryState_Payload = {
      val r = parser.parseDocking_Access_SupervisorRecoveryState_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRecoveryState_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorRecoveryIntent_Payload(o: Docking_Access_Supervisor.RecoveryIntent_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRecoveryIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRecoveryIntent_Payload(s: String): Either[Docking_Access_Supervisor.RecoveryIntent_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoveryIntent_Payload(parser: Parser): Docking_Access_Supervisor.RecoveryIntent_Payload = {
      val r = parser.parseDocking_Access_SupervisorRecoveryIntent_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRecoveryIntent_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorLifecycleDirective_Payload(o: Docking_Access_Supervisor.LifecycleDirective_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorLifecycleDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorLifecycleDirective_Payload(s: String): Either[Docking_Access_Supervisor.LifecycleDirective_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorLifecycleDirective_Payload(parser: Parser): Docking_Access_Supervisor.LifecycleDirective_Payload = {
      val r = parser.parseDocking_Access_SupervisorLifecycleDirective_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorLifecycleDirective_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorDecisionContext_Payload(o: Docking_Access_Supervisor.DecisionContext_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDecisionContext_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDecisionContext_Payload(s: String): Either[Docking_Access_Supervisor.DecisionContext_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDecisionContext_Payload(parser: Parser): Docking_Access_Supervisor.DecisionContext_Payload = {
      val r = parser.parseDocking_Access_SupervisorDecisionContext_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDecisionContext_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorBerthEvidenceKind_Payload(o: Docking_Access_Supervisor.BerthEvidenceKind_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorBerthEvidenceKind_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorBerthEvidenceKind_Payload(s: String): Either[Docking_Access_Supervisor.BerthEvidenceKind_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthEvidenceKind_Payload(parser: Parser): Docking_Access_Supervisor.BerthEvidenceKind_Payload = {
      val r = parser.parseDocking_Access_SupervisorBerthEvidenceKind_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorBerthEvidenceKind_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorGateDirective_Payload(o: Docking_Access_Supervisor.GateDirective_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorGateDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorGateDirective_Payload(s: String): Either[Docking_Access_Supervisor.GateDirective_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorGateDirective_Payload(parser: Parser): Docking_Access_Supervisor.GateDirective_Payload = {
      val r = parser.parseDocking_Access_SupervisorGateDirective_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorGateDirective_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorPriorityKind_Payload(o: Docking_Access_Supervisor.PriorityKind_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorPriorityKind_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorPriorityKind_Payload(s: String): Either[Docking_Access_Supervisor.PriorityKind_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorPriorityKind_Payload(parser: Parser): Docking_Access_Supervisor.PriorityKind_Payload = {
      val r = parser.parseDocking_Access_SupervisorPriorityKind_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorPriorityKind_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorSupervisoryAction_Payload(o: Docking_Access_Supervisor.SupervisoryAction_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorSupervisoryAction_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorSupervisoryAction_Payload(s: String): Either[Docking_Access_Supervisor.SupervisoryAction_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorSupervisoryAction_Payload(parser: Parser): Docking_Access_Supervisor.SupervisoryAction_Payload = {
      val r = parser.parseDocking_Access_SupervisorSupervisoryAction_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorSupervisoryAction_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorDecisionCause_Payload(o: Docking_Access_Supervisor.DecisionCause_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDecisionCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDecisionCause_Payload(s: String): Either[Docking_Access_Supervisor.DecisionCause_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDecisionCause_Payload(parser: Parser): Docking_Access_Supervisor.DecisionCause_Payload = {
      val r = parser.parseDocking_Access_SupervisorDecisionCause_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDecisionCause_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorPublicMode_Payload(o: Docking_Access_Supervisor.PublicMode_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorPublicMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorPublicMode_Payload(s: String): Either[Docking_Access_Supervisor.PublicMode_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorPublicMode_Payload(parser: Parser): Docking_Access_Supervisor.PublicMode_Payload = {
      val r = parser.parseDocking_Access_SupervisorPublicMode_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorPublicMode_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorAccessStatus_Payload(o: Docking_Access_Supervisor.AccessStatus_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAccessStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAccessStatus_Payload(s: String): Either[Docking_Access_Supervisor.AccessStatus_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessStatus_Payload(parser: Parser): Docking_Access_Supervisor.AccessStatus_Payload = {
      val r = parser.parseDocking_Access_SupervisorAccessStatus_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAccessStatus_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorDockingOutcome_Payload(o: Docking_Access_Supervisor.DockingOutcome_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingOutcome_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingOutcome_Payload(s: String): Either[Docking_Access_Supervisor.DockingOutcome_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingOutcome_Payload(parser: Parser): Docking_Access_Supervisor.DockingOutcome_Payload = {
      val r = parser.parseDocking_Access_SupervisorDockingOutcome_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingOutcome_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorRequestFacts(o: Docking_Access_Supervisor.RequestFacts, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRequestFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRequestFacts(s: String): Either[Docking_Access_Supervisor.RequestFacts, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestFacts(parser: Parser): Docking_Access_Supervisor.RequestFacts = {
      val r = parser.parseDocking_Access_SupervisorRequestFacts()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRequestFacts _)
    return r
  }

  def fromDocking_Access_SupervisorRequestFacts_Payload(o: Docking_Access_Supervisor.RequestFacts_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRequestFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRequestFacts_Payload(s: String): Either[Docking_Access_Supervisor.RequestFacts_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestFacts_Payload(parser: Parser): Docking_Access_Supervisor.RequestFacts_Payload = {
      val r = parser.parseDocking_Access_SupervisorRequestFacts_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRequestFacts_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorVesselFacts(o: Docking_Access_Supervisor.VesselFacts, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorVesselFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorVesselFacts(s: String): Either[Docking_Access_Supervisor.VesselFacts, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselFacts(parser: Parser): Docking_Access_Supervisor.VesselFacts = {
      val r = parser.parseDocking_Access_SupervisorVesselFacts()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorVesselFacts _)
    return r
  }

  def fromDocking_Access_SupervisorVesselFacts_Payload(o: Docking_Access_Supervisor.VesselFacts_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorVesselFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorVesselFacts_Payload(s: String): Either[Docking_Access_Supervisor.VesselFacts_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselFacts_Payload(parser: Parser): Docking_Access_Supervisor.VesselFacts_Payload = {
      val r = parser.parseDocking_Access_SupervisorVesselFacts_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorVesselFacts_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorStationFacts(o: Docking_Access_Supervisor.StationFacts, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorStationFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorStationFacts(s: String): Either[Docking_Access_Supervisor.StationFacts, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorStationFacts(parser: Parser): Docking_Access_Supervisor.StationFacts = {
      val r = parser.parseDocking_Access_SupervisorStationFacts()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorStationFacts _)
    return r
  }

  def fromDocking_Access_SupervisorStationFacts_Payload(o: Docking_Access_Supervisor.StationFacts_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorStationFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorStationFacts_Payload(s: String): Either[Docking_Access_Supervisor.StationFacts_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorStationFacts_Payload(parser: Parser): Docking_Access_Supervisor.StationFacts_Payload = {
      val r = parser.parseDocking_Access_SupervisorStationFacts_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorStationFacts_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorServiceFacts(o: Docking_Access_Supervisor.ServiceFacts, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorServiceFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorServiceFacts(s: String): Either[Docking_Access_Supervisor.ServiceFacts, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceFacts(parser: Parser): Docking_Access_Supervisor.ServiceFacts = {
      val r = parser.parseDocking_Access_SupervisorServiceFacts()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorServiceFacts _)
    return r
  }

  def fromDocking_Access_SupervisorServiceFacts_Payload(o: Docking_Access_Supervisor.ServiceFacts_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorServiceFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorServiceFacts_Payload(s: String): Either[Docking_Access_Supervisor.ServiceFacts_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceFacts_Payload(parser: Parser): Docking_Access_Supervisor.ServiceFacts_Payload = {
      val r = parser.parseDocking_Access_SupervisorServiceFacts_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorServiceFacts_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorAdmissionGuard(o: Docking_Access_Supervisor.AdmissionGuard, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAdmissionGuard(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAdmissionGuard(s: String): Either[Docking_Access_Supervisor.AdmissionGuard, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAdmissionGuard(parser: Parser): Docking_Access_Supervisor.AdmissionGuard = {
      val r = parser.parseDocking_Access_SupervisorAdmissionGuard()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAdmissionGuard _)
    return r
  }

  def fromDocking_Access_SupervisorAdmissionGuard_Payload(o: Docking_Access_Supervisor.AdmissionGuard_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAdmissionGuard_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAdmissionGuard_Payload(s: String): Either[Docking_Access_Supervisor.AdmissionGuard_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAdmissionGuard_Payload(parser: Parser): Docking_Access_Supervisor.AdmissionGuard_Payload = {
      val r = parser.parseDocking_Access_SupervisorAdmissionGuard_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAdmissionGuard_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorPriorLifecycleView(o: Docking_Access_Supervisor.PriorLifecycleView, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorPriorLifecycleView(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorPriorLifecycleView(s: String): Either[Docking_Access_Supervisor.PriorLifecycleView, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorPriorLifecycleView(parser: Parser): Docking_Access_Supervisor.PriorLifecycleView = {
      val r = parser.parseDocking_Access_SupervisorPriorLifecycleView()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorPriorLifecycleView _)
    return r
  }

  def fromDocking_Access_SupervisorPriorLifecycleView_Payload(o: Docking_Access_Supervisor.PriorLifecycleView_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorPriorLifecycleView_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorPriorLifecycleView_Payload(s: String): Either[Docking_Access_Supervisor.PriorLifecycleView_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorPriorLifecycleView_Payload(parser: Parser): Docking_Access_Supervisor.PriorLifecycleView_Payload = {
      val r = parser.parseDocking_Access_SupervisorPriorLifecycleView_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorPriorLifecycleView_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorAdmissionDecision(o: Docking_Access_Supervisor.AdmissionDecision, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAdmissionDecision(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAdmissionDecision(s: String): Either[Docking_Access_Supervisor.AdmissionDecision, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAdmissionDecision(parser: Parser): Docking_Access_Supervisor.AdmissionDecision = {
      val r = parser.parseDocking_Access_SupervisorAdmissionDecision()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAdmissionDecision _)
    return r
  }

  def fromDocking_Access_SupervisorAdmissionDecision_Payload(o: Docking_Access_Supervisor.AdmissionDecision_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAdmissionDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAdmissionDecision_Payload(s: String): Either[Docking_Access_Supervisor.AdmissionDecision_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAdmissionDecision_Payload(parser: Parser): Docking_Access_Supervisor.AdmissionDecision_Payload = {
      val r = parser.parseDocking_Access_SupervisorAdmissionDecision_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAdmissionDecision_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorRecoveryTransition(o: Docking_Access_Supervisor.RecoveryTransition, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRecoveryTransition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRecoveryTransition(s: String): Either[Docking_Access_Supervisor.RecoveryTransition, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoveryTransition(parser: Parser): Docking_Access_Supervisor.RecoveryTransition = {
      val r = parser.parseDocking_Access_SupervisorRecoveryTransition()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRecoveryTransition _)
    return r
  }

  def fromDocking_Access_SupervisorRecoveryTransition_Payload(o: Docking_Access_Supervisor.RecoveryTransition_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRecoveryTransition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRecoveryTransition_Payload(s: String): Either[Docking_Access_Supervisor.RecoveryTransition_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoveryTransition_Payload(parser: Parser): Docking_Access_Supervisor.RecoveryTransition_Payload = {
      val r = parser.parseDocking_Access_SupervisorRecoveryTransition_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRecoveryTransition_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorCoordinationFrame(o: Docking_Access_Supervisor.CoordinationFrame, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorCoordinationFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorCoordinationFrame(s: String): Either[Docking_Access_Supervisor.CoordinationFrame, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorCoordinationFrame(parser: Parser): Docking_Access_Supervisor.CoordinationFrame = {
      val r = parser.parseDocking_Access_SupervisorCoordinationFrame()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorCoordinationFrame _)
    return r
  }

  def fromDocking_Access_SupervisorCoordinationFrame_Payload(o: Docking_Access_Supervisor.CoordinationFrame_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorCoordinationFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorCoordinationFrame_Payload(s: String): Either[Docking_Access_Supervisor.CoordinationFrame_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorCoordinationFrame_Payload(parser: Parser): Docking_Access_Supervisor.CoordinationFrame_Payload = {
      val r = parser.parseDocking_Access_SupervisorCoordinationFrame_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorCoordinationFrame_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorBerthTransitionEvidence(o: Docking_Access_Supervisor.BerthTransitionEvidence, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorBerthTransitionEvidence(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorBerthTransitionEvidence(s: String): Either[Docking_Access_Supervisor.BerthTransitionEvidence, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthTransitionEvidence(parser: Parser): Docking_Access_Supervisor.BerthTransitionEvidence = {
      val r = parser.parseDocking_Access_SupervisorBerthTransitionEvidence()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorBerthTransitionEvidence _)
    return r
  }

  def fromDocking_Access_SupervisorBerthTransitionEvidence_Payload(o: Docking_Access_Supervisor.BerthTransitionEvidence_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorBerthTransitionEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorBerthTransitionEvidence_Payload(s: String): Either[Docking_Access_Supervisor.BerthTransitionEvidence_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthTransitionEvidence_Payload(parser: Parser): Docking_Access_Supervisor.BerthTransitionEvidence_Payload = {
      val r = parser.parseDocking_Access_SupervisorBerthTransitionEvidence_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorBerthTransitionEvidence_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorGateSafetyFrame(o: Docking_Access_Supervisor.GateSafetyFrame, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorGateSafetyFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorGateSafetyFrame(s: String): Either[Docking_Access_Supervisor.GateSafetyFrame, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorGateSafetyFrame(parser: Parser): Docking_Access_Supervisor.GateSafetyFrame = {
      val r = parser.parseDocking_Access_SupervisorGateSafetyFrame()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorGateSafetyFrame _)
    return r
  }

  def fromDocking_Access_SupervisorGateSafetyFrame_Payload(o: Docking_Access_Supervisor.GateSafetyFrame_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorGateSafetyFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorGateSafetyFrame_Payload(s: String): Either[Docking_Access_Supervisor.GateSafetyFrame_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorGateSafetyFrame_Payload(parser: Parser): Docking_Access_Supervisor.GateSafetyFrame_Payload = {
      val r = parser.parseDocking_Access_SupervisorGateSafetyFrame_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorGateSafetyFrame_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorPriorityDirective(o: Docking_Access_Supervisor.PriorityDirective, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorPriorityDirective(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorPriorityDirective(s: String): Either[Docking_Access_Supervisor.PriorityDirective, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorPriorityDirective(parser: Parser): Docking_Access_Supervisor.PriorityDirective = {
      val r = parser.parseDocking_Access_SupervisorPriorityDirective()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorPriorityDirective _)
    return r
  }

  def fromDocking_Access_SupervisorPriorityDirective_Payload(o: Docking_Access_Supervisor.PriorityDirective_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorPriorityDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorPriorityDirective_Payload(s: String): Either[Docking_Access_Supervisor.PriorityDirective_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorPriorityDirective_Payload(parser: Parser): Docking_Access_Supervisor.PriorityDirective_Payload = {
      val r = parser.parseDocking_Access_SupervisorPriorityDirective_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorPriorityDirective_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorDockingProposal(o: Docking_Access_Supervisor.DockingProposal, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingProposal(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingProposal(s: String): Either[Docking_Access_Supervisor.DockingProposal, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingProposal(parser: Parser): Docking_Access_Supervisor.DockingProposal = {
      val r = parser.parseDocking_Access_SupervisorDockingProposal()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingProposal _)
    return r
  }

  def fromDocking_Access_SupervisorDockingProposal_Payload(o: Docking_Access_Supervisor.DockingProposal_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingProposal_Payload(s: String): Either[Docking_Access_Supervisor.DockingProposal_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingProposal_Payload(parser: Parser): Docking_Access_Supervisor.DockingProposal_Payload = {
      val r = parser.parseDocking_Access_SupervisorDockingProposal_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingProposal_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorAccessProposal(o: Docking_Access_Supervisor.AccessProposal, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAccessProposal(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAccessProposal(s: String): Either[Docking_Access_Supervisor.AccessProposal, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessProposal(parser: Parser): Docking_Access_Supervisor.AccessProposal = {
      val r = parser.parseDocking_Access_SupervisorAccessProposal()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAccessProposal _)
    return r
  }

  def fromDocking_Access_SupervisorAccessProposal_Payload(o: Docking_Access_Supervisor.AccessProposal_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAccessProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAccessProposal_Payload(s: String): Either[Docking_Access_Supervisor.AccessProposal_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessProposal_Payload(parser: Parser): Docking_Access_Supervisor.AccessProposal_Payload = {
      val r = parser.parseDocking_Access_SupervisorAccessProposal_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAccessProposal_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorUndockingProposal(o: Docking_Access_Supervisor.UndockingProposal, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorUndockingProposal(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorUndockingProposal(s: String): Either[Docking_Access_Supervisor.UndockingProposal, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorUndockingProposal(parser: Parser): Docking_Access_Supervisor.UndockingProposal = {
      val r = parser.parseDocking_Access_SupervisorUndockingProposal()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorUndockingProposal _)
    return r
  }

  def fromDocking_Access_SupervisorUndockingProposal_Payload(o: Docking_Access_Supervisor.UndockingProposal_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorUndockingProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorUndockingProposal_Payload(s: String): Either[Docking_Access_Supervisor.UndockingProposal_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorUndockingProposal_Payload(parser: Parser): Docking_Access_Supervisor.UndockingProposal_Payload = {
      val r = parser.parseDocking_Access_SupervisorUndockingProposal_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorUndockingProposal_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorDockingDecisionFrame(o: Docking_Access_Supervisor.DockingDecisionFrame, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingDecisionFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingDecisionFrame(s: String): Either[Docking_Access_Supervisor.DockingDecisionFrame, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingDecisionFrame(parser: Parser): Docking_Access_Supervisor.DockingDecisionFrame = {
      val r = parser.parseDocking_Access_SupervisorDockingDecisionFrame()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingDecisionFrame _)
    return r
  }

  def fromDocking_Access_SupervisorDockingDecisionFrame_Payload(o: Docking_Access_Supervisor.DockingDecisionFrame_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingDecisionFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingDecisionFrame_Payload(s: String): Either[Docking_Access_Supervisor.DockingDecisionFrame_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingDecisionFrame_Payload(parser: Parser): Docking_Access_Supervisor.DockingDecisionFrame_Payload = {
      val r = parser.parseDocking_Access_SupervisorDockingDecisionFrame_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingDecisionFrame_Payload _)
    return r
  }

  def fromDocking_Access_SupervisorDockingAccessResult(o: Docking_Access_Supervisor.DockingAccessResult, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingAccessResult(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingAccessResult(s: String): Either[Docking_Access_Supervisor.DockingAccessResult, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingAccessResult(parser: Parser): Docking_Access_Supervisor.DockingAccessResult = {
      val r = parser.parseDocking_Access_SupervisorDockingAccessResult()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingAccessResult _)
    return r
  }

  def fromDocking_Access_SupervisorDockingAccessResult_Payload(o: Docking_Access_Supervisor.DockingAccessResult_Payload, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingAccessResult_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingAccessResult_Payload(s: String): Either[Docking_Access_Supervisor.DockingAccessResult_Payload, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingAccessResult_Payload(parser: Parser): Docking_Access_Supervisor.DockingAccessResult_Payload = {
      val r = parser.parseDocking_Access_SupervisorDockingAccessResult_Payload()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingAccessResult_Payload _)
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

  def fromDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container(s: String): Either[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container(parser: Parser): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container = {
      val r = parser.parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(s: String): Either[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(parser: Parser): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(s: String): Either[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(parser: Parser): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container(s: String): Either[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container(parser: Parser): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container = {
      val r = parser.parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(s: String): Either[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(parser: Parser): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(o: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(s: String): Either[Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(parser: Parser): Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container(s: String): Either[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container(parser: Parser): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container = {
      val r = parser.parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(s: String): Either[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(parser: Parser): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(s: String): Either[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(parser: Parser): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container(s: String): Either[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container(parser: Parser): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container = {
      val r = parser.parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(s: String): Either[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(parser: Parser): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(o: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(s: String): Either[Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(parser: Parser): Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container(s: String): Either[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container(parser: Parser): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container = {
      val r = parser.parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(s: String): Either[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(parser: Parser): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(s: String): Either[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(parser: Parser): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container(s: String): Either[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container(parser: Parser): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container = {
      val r = parser.parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(s: String): Either[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(parser: Parser): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(o: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(s: String): Either[Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(parser: Parser): Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container(s: String): Either[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container(parser: Parser): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container = {
      val r = parser.parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(s: String): Either[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(parser: Parser): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(s: String): Either[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(parser: Parser): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container(s: String): Either[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container(parser: Parser): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container = {
      val r = parser.parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(s: String): Either[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(parser: Parser): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(o: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(s: String): Either[Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(parser: Parser): Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container(s: String): Either[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container(parser: Parser): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container = {
      val r = parser.parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(s: String): Either[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(parser: Parser): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(s: String): Either[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(parser: Parser): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container(s: String): Either[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container(parser: Parser): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container = {
      val r = parser.parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(s: String): Either[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(parser: Parser): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(o: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(s: String): Either[Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(parser: Parser): Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container(s: String): Either[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container(parser: Parser): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container = {
      val r = parser.parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(s: String): Either[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(parser: Parser): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(s: String): Either[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(parser: Parser): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container(s: String): Either[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container(parser: Parser): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container = {
      val r = parser.parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(s: String): Either[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(parser: Parser): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(o: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(s: String): Either[Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(parser: Parser): Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container(s: String): Either[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container(parser: Parser): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container = {
      val r = parser.parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(s: String): Either[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(parser: Parser): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(s: String): Either[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(parser: Parser): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container(s: String): Either[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container(parser: Parser): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container = {
      val r = parser.parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(s: String): Either[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(parser: Parser): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(o: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(s: String): Either[Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(parser: Parser): Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container(s: String): Either[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container(parser: Parser): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container = {
      val r = parser.parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(s: String): Either[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(parser: Parser): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(s: String): Either[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(parser: Parser): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container(s: String): Either[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container(parser: Parser): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container = {
      val r = parser.parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(s: String): Either[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(parser: Parser): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(o: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(s: String): Either[Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(parser: Parser): Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container(s: String): Either[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container(parser: Parser): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container = {
      val r = parser.parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(s: String): Either[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(parser: Parser): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(s: String): Either[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(parser: Parser): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container(s: String): Either[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container(parser: Parser): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container = {
      val r = parser.parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(s: String): Either[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(parser: Parser): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(o: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(s: String): Either[Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(parser: Parser): Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container(s: String): Either[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container(parser: Parser): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container = {
      val r = parser.parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(s: String): Either[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(parser: Parser): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(s: String): Either[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(parser: Parser): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container(s: String): Either[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container(parser: Parser): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container = {
      val r = parser.parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(s: String): Either[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(parser: Parser): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(o: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(s: String): Either[Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(parser: Parser): Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container(s: String): Either[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container(parser: Parser): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container = {
      val r = parser.parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(s: String): Either[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(parser: Parser): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(s: String): Either[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(parser: Parser): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container(s: String): Either[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container(parser: Parser): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container = {
      val r = parser.parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(s: String): Either[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(parser: Parser): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(o: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(s: String): Either[Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(parser: Parser): Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container(s: String): Either[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container(parser: Parser): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container = {
      val r = parser.parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(s: String): Either[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(parser: Parser): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(s: String): Either[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(parser: Parser): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container(s: String): Either[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container(parser: Parser): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container = {
      val r = parser.parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(s: String): Either[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(parser: Parser): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(o: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(s: String): Either[Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(parser: Parser): Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container(s: String): Either[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container(parser: Parser): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container = {
      val r = parser.parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(s: String): Either[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(parser: Parser): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(s: String): Either[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(parser: Parser): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container(s: String): Either[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container(parser: Parser): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container = {
      val r = parser.parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(s: String): Either[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(parser: Parser): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(o: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(s: String): Either[Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(parser: Parser): Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container(s: String): Either[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container(parser: Parser): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container = {
      val r = parser.parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(s: String): Either[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(parser: Parser): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(s: String): Either[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(parser: Parser): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container(s: String): Either[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container(parser: Parser): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container = {
      val r = parser.parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(s: String): Either[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(parser: Parser): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(o: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(s: String): Either[Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(parser: Parser): Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container(s: String): Either[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container(parser: Parser): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container = {
      val r = parser.parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(s: String): Either[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(parser: Parser): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(s: String): Either[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(parser: Parser): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS _)
    return r
  }

  def fromDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container(s: String): Either[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container(parser: Parser): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container = {
      val r = parser.parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container _)
    return r
  }

  def fromDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(s: String): Either[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(parser: Parser): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P = {
      val r = parser.parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P _)
    return r
  }

  def fromDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(o: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(s: String): Either[Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(parser: Parser): Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS = {
      val r = parser.parseDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS _)
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