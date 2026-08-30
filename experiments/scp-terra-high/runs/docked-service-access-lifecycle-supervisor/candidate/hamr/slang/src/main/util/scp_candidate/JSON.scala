// #Sireum
// @formatter:off

// This file is auto-generated from PilotIntent.scala, QualifiedIntent.scala, BerthObservation.scala, ShipCondition.scala, DockReadiness.scala, ServiceSignal.scala, ServiceInterlock.scala, LifecycleState.scala, OperationalAssessment.scala, AdmittedDirective.scala, MovementProposal.scala, AccessProposal.scala, SnapshotLifecycleState.scala, LifecycleResult.scala, MovementDirective.scala, ServiceAccess.scala, PilotLifecycleReport.scala, StationAccessReport.scala, ControlProposal.scala, LifecycleSnapshot.scala, GatedControl.scala, Base_Types.scala, IntentQualifier_supervisorProcess_intentQualifier_Containers.scala, DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_Containers.scala, ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_Containers.scala, LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_Containers.scala, PriorityArbiter_supervisorProcess_priorityArbiter_Containers.scala, LifecycleController_supervisorProcess_lifecycleController_Containers.scala, MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_Containers.scala, LifecycleReporter_supervisorProcess_lifecycleReporter_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printDocked_Service_Access_Lifecycle_SupervisorPilotIntentType(o: Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.NONE => "NONE"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.FRESH_DOCK => "FRESH_DOCK"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.REPEATED_DOCK => "REPEATED_DOCK"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.FRESH_UNDOCK => "FRESH_UNDOCK"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.REPEATED_UNDOCK => "REPEATED_UNDOCK"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.FRESH_RESET => "FRESH_RESET"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.REPEATED_RESET => "REPEATED_RESET"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.PilotIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorPilotIntentType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType(o: Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.NO_ACTION => "NO_ACTION"
        case Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.DOCK_REQUEST => "DOCK_REQUEST"
        case Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.UNDOCK_REQUEST => "UNDOCK_REQUEST"
        case Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.RESET_REQUEST => "RESET_REQUEST"
        case Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.INTENT_FAULT => "INTENT_FAULT"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorBerthObservationType(o: Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.APPROACH_CLEAR => "APPROACH_CLEAR"
        case Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.DOCKED_SECURE => "DOCKED_SECURE"
        case Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.DEPARTURE_CLEAR => "DEPARTURE_CLEAR"
        case Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.RELEASED => "RELEASED"
        case Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.BLOCKED => "BLOCKED"
        case Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.BerthObservation")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorBerthObservationType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorShipConditionType(o: Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.APPROACH_READY => "APPROACH_READY"
        case Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.SERVICE_READY => "SERVICE_READY"
        case Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.DEPARTURE_READY => "DEPARTURE_READY"
        case Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.TRANSIT => "TRANSIT"
        case Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.NOT_READY => "NOT_READY"
        case Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.ShipCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorShipConditionType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.DOCK_READY => "DOCK_READY"
        case Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.SERVICE_READY => "SERVICE_READY"
        case Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.UNDOCK_READY => "UNDOCK_READY"
        case Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.RELEASE_CONFIRMED => "RELEASE_CONFIRMED"
        case Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.TEMPORARILY_BLOCKED => "TEMPORARILY_BLOCKED"
        case Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.READINESS_CONFLICT => "READINESS_CONFLICT"
        case Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.READINESS_FAULT => "READINESS_FAULT"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.DockReadiness")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorServiceSignalType(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.QUIESCENT => "QUIESCENT"
        case Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.REQUEST => "REQUEST"
        case Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.ACTIVE => "ACTIVE"
        case Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.COMPLETE => "COMPLETE"
        case Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.FAULT => "FAULT"
        case Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.INVALID => "INVALID"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorServiceSignalType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.QUIESCENT => "QUIESCENT"
        case Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.SINGLE_DEMAND => "SINGLE_DEMAND"
        case Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.SINGLE_ACTIVE => "SINGLE_ACTIVE"
        case Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.SINGLE_COMPLETION => "SINGLE_COMPLETION"
        case Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.SERVICE_CONFLICT => "SERVICE_CONFLICT"
        case Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.SERVICE_FAULT => "SERVICE_FAULT"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.IDLE_OUTSIDE => "IDLE_OUTSIDE"
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.DOCK_CLEARANCE_LATCHED => "DOCK_CLEARANCE_LATCHED"
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.DOCKED_ACCESS_LOCKED => "DOCKED_ACCESS_LOCKED"
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.SERVICE_ACCESS_GRANTED => "SERVICE_ACCESS_GRANTED"
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.SERVICE_IN_PROGRESS => "SERVICE_IN_PROGRESS"
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.UNDOCK_CLEARANCE_LATCHED => "UNDOCK_CLEARANCE_LATCHED"
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.RECOVERY_REQUIRED => "RECOVERY_REQUIRED"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.LifecycleState")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType(o: Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.OUTSIDE_STABLE => "OUTSIDE_STABLE"
        case Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.DOCK_ELIGIBLE => "DOCK_ELIGIBLE"
        case Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.DOCK_WAITING => "DOCK_WAITING"
        case Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.DOCK_CONFIRMED => "DOCK_CONFIRMED"
        case Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.DOCKED_QUIESCENT => "DOCKED_QUIESCENT"
        case Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.SERVICE_DEMAND_READY => "SERVICE_DEMAND_READY"
        case Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.SERVICE_GRANT_PENDING => "SERVICE_GRANT_PENDING"
        case Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.SERVICE_OCCUPIED => "SERVICE_OCCUPIED"
        case Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.SERVICE_RELEASED => "SERVICE_RELEASED"
        case Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.SERVICE_WITHDRAWN => "SERVICE_WITHDRAWN"
        case Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.UNDOCK_ELIGIBLE => "UNDOCK_ELIGIBLE"
        case Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.UNDOCK_WAITING => "UNDOCK_WAITING"
        case Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.RELEASE_CONFIRMED => "RELEASE_CONFIRMED"
        case Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.RECOVERY_CLEARABLE => "RECOVERY_CLEARABLE"
        case Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.TEMPORARILY_BLOCKED => "TEMPORARILY_BLOCKED"
        case Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.ASSESSMENT_CONFLICT => "ASSESSMENT_CONFLICT"
        case Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.ASSESSMENT_FAULT => "ASSESSMENT_FAULT"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType(o: Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.ENTER_RECOVERY_FAULT => "ENTER_RECOVERY_FAULT"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.ENTER_RECOVERY_CONFLICT => "ENTER_RECOVERY_CONFLICT"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.RESET_RECOVERY => "RESET_RECOVERY"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.HOLD_RECOVERY => "HOLD_RECOVERY"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.FINISH_SERVICE_DEFER_UNDOCK => "FINISH_SERVICE_DEFER_UNDOCK"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.FINISH_SERVICE => "FINISH_SERVICE"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.DEFER_UNDOCK => "DEFER_UNDOCK"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.HOLD_ACTIVE_SERVICE => "HOLD_ACTIVE_SERVICE"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.START_SERVICE => "START_SERVICE"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.HOLD_SERVICE_GRANT => "HOLD_SERVICE_GRANT"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.WITHDRAW_SERVICE_GRANT => "WITHDRAW_SERVICE_GRANT"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.CONFIRM_RELEASE => "CONFIRM_RELEASE"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.HOLD_UNDOCK_CLEARANCE => "HOLD_UNDOCK_CLEARANCE"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.CONFIRM_DOCK => "CONFIRM_DOCK"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.HOLD_DOCK_CLEARANCE => "HOLD_DOCK_CLEARANCE"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.AUTHORIZE_UNDOCK => "AUTHORIZE_UNDOCK"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.GRANT_SERVICE_ACCESS => "GRANT_SERVICE_ACCESS"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.AUTHORIZE_DOCK => "AUTHORIZE_DOCK"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.INHIBIT_ACTION => "INHIBIT_ACTION"
        case Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.HOLD_STABLE => "HOLD_STABLE"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorMovementProposalType(o: Docked_Service_Access_Lifecycle_Supervisor.MovementProposal.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.MovementProposal.HOLD_MOVEMENT => "HOLD_MOVEMENT"
        case Docked_Service_Access_Lifecycle_Supervisor.MovementProposal.AUTHORIZE_DOCK => "AUTHORIZE_DOCK"
        case Docked_Service_Access_Lifecycle_Supervisor.MovementProposal.AUTHORIZE_UNDOCK => "AUTHORIZE_UNDOCK"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.MovementProposal")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorMovementProposalType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorAccessProposalType(o: Docked_Service_Access_Lifecycle_Supervisor.AccessProposal.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.AccessProposal.LOCK_ACCESS => "LOCK_ACCESS"
        case Docked_Service_Access_Lifecycle_Supervisor.AccessProposal.ENABLE_ACCESS => "ENABLE_ACCESS"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.AccessProposal")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorAccessProposalType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleStateType(o: Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.IDLE_OUTSIDE => "IDLE_OUTSIDE"
        case Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.DOCK_CLEARANCE_LATCHED => "DOCK_CLEARANCE_LATCHED"
        case Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.DOCKED_ACCESS_LOCKED => "DOCKED_ACCESS_LOCKED"
        case Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.SERVICE_ACCESS_GRANTED => "SERVICE_ACCESS_GRANTED"
        case Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.SERVICE_IN_PROGRESS => "SERVICE_IN_PROGRESS"
        case Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.UNDOCK_CLEARANCE_LATCHED => "UNDOCK_CLEARANCE_LATCHED"
        case Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.RECOVERY_REQUIRED => "RECOVERY_REQUIRED"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleStateType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleResultType(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.NONE => "NONE"
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.DOCK_ACCEPTED => "DOCK_ACCEPTED"
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.DOCK_CONFIRMED => "DOCK_CONFIRMED"
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.SERVICE_GRANTED => "SERVICE_GRANTED"
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.SERVICE_RUNNING => "SERVICE_RUNNING"
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.SERVICE_FINISHED => "SERVICE_FINISHED"
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.UNDOCK_DEFERRED => "UNDOCK_DEFERRED"
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.UNDOCK_ACCEPTED => "UNDOCK_ACCEPTED"
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.RELEASED => "RELEASED"
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.INHIBITED => "INHIBITED"
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.RECOVERY_LATCHED => "RECOVERY_LATCHED"
        case Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.RESET_COMPLETE => "RESET_COMPLETE"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorLifecycleResultType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType(o: Docked_Service_Access_Lifecycle_Supervisor.MovementDirective.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.MovementDirective.HOLD => "HOLD"
        case Docked_Service_Access_Lifecycle_Supervisor.MovementDirective.PERMIT_DOCK => "PERMIT_DOCK"
        case Docked_Service_Access_Lifecycle_Supervisor.MovementDirective.PERMIT_UNDOCK => "PERMIT_UNDOCK"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.MovementDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorServiceAccessType(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess.LOCKED => "LOCKED"
        case Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess.ENABLED => "ENABLED"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorServiceAccessType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType(o: Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.OUTSIDE_IDLE => "OUTSIDE_IDLE"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.DOCK_PERMITTED => "DOCK_PERMITTED"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.DOCKED_READY => "DOCKED_READY"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.SERVICE_GRANTED => "SERVICE_GRANTED"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.SERVICE_ACTIVE => "SERVICE_ACTIVE"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.SERVICE_FINISHED => "SERVICE_FINISHED"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.UNDOCK_DEFERRED => "UNDOCK_DEFERRED"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.UNDOCK_PERMITTED => "UNDOCK_PERMITTED"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.RELEASE_CONFIRMED => "RELEASE_CONFIRMED"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.INHIBITED => "INHIBITED"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.RECOVERY_REQUIRED => "RECOVERY_REQUIRED"
        case Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.RESET_COMPLETE => "RESET_COMPLETE"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorStationAccessReportType(o: Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.Type): ST = {
      val value: String = o match {
        case Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.NO_ACCESS => "NO_ACCESS"
        case Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.DOCK_EXPECTED => "DOCK_EXPECTED"
        case Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.ACCESS_AVAILABLE => "ACCESS_AVAILABLE"
        case Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.ACCESS_RESERVED => "ACCESS_RESERVED"
        case Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.ACCESS_OCCUPIED => "ACCESS_OCCUPIED"
        case Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.DEPARTURE_EXPECTED => "DEPARTURE_EXPECTED"
        case Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.ACCESS_INHIBITED => "ACCESS_INHIBITED"
        case Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.RECOVERY_REQUIRED => "RECOVERY_REQUIRED"
      }
      return printObject(ISZ(
        ("type", printString("Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport")),
        ("value", printString(value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorStationAccessReportType(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorControlProposal(o: Docked_Service_Access_Lifecycle_Supervisor.ControlProposal): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.ControlProposal""""),
        ("movement", printDocked_Service_Access_Lifecycle_SupervisorMovementProposalType(o.movement)),
        ("access", printDocked_Service_Access_Lifecycle_SupervisorAccessProposalType(o.access))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorControlProposal(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot""""),
        ("next_state", printDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleStateType(o.next_state)),
        ("result", printDocked_Service_Access_Lifecycle_SupervisorLifecycleResultType(o.result))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(o.value))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorGatedControl(o: Docked_Service_Access_Lifecycle_Supervisor.GatedControl): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.GatedControl""""),
        ("movement", printDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType(o.movement)),
        ("access", printDocked_Service_Access_Lifecycle_SupervisorServiceAccessType(o.access))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload""""),
        ("value", printDocked_Service_Access_Lifecycle_SupervisorGatedControl(o.value))
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

    @pure def printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container): ST = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P""""),
        ("api_pilotIntent", printDocked_Service_Access_Lifecycle_SupervisorPilotIntentType(o.api_pilotIntent))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS""""),
        ("api_pilotIntent", printDocked_Service_Access_Lifecycle_SupervisorPilotIntentType(o.api_pilotIntent))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container): ST = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P""""),
        ("api_qualifiedIntent", printDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType(o.api_qualifiedIntent))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS""""),
        ("api_qualifiedIntent", printDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType(o.api_qualifiedIntent))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container): ST = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P""""),
        ("api_berthObservation", printDocked_Service_Access_Lifecycle_SupervisorBerthObservationType(o.api_berthObservation)),
        ("api_shipCondition", printDocked_Service_Access_Lifecycle_SupervisorShipConditionType(o.api_shipCondition))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS""""),
        ("api_berthObservation", printDocked_Service_Access_Lifecycle_SupervisorBerthObservationType(o.api_berthObservation)),
        ("api_shipCondition", printDocked_Service_Access_Lifecycle_SupervisorShipConditionType(o.api_shipCondition))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container): ST = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P""""),
        ("api_gateReadiness", printDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.api_gateReadiness)),
        ("api_monitorReadiness", printDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.api_monitorReadiness))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS""""),
        ("api_gateReadiness", printDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.api_gateReadiness)),
        ("api_monitorReadiness", printDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.api_monitorReadiness))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container): ST = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P""""),
        ("api_repairSignal", printDocked_Service_Access_Lifecycle_SupervisorServiceSignalType(o.api_repairSignal)),
        ("api_resupplySignal", printDocked_Service_Access_Lifecycle_SupervisorServiceSignalType(o.api_resupplySignal))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS""""),
        ("api_repairSignal", printDocked_Service_Access_Lifecycle_SupervisorServiceSignalType(o.api_repairSignal)),
        ("api_resupplySignal", printDocked_Service_Access_Lifecycle_SupervisorServiceSignalType(o.api_resupplySignal))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container): ST = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P""""),
        ("api_gateInterlock", printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.api_gateInterlock)),
        ("api_monitorInterlock", printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.api_monitorInterlock))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS""""),
        ("api_gateInterlock", printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.api_gateInterlock)),
        ("api_monitorInterlock", printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.api_monitorInterlock))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container): ST = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(o)
      }
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P""""),
        ("api_dockReadiness", printDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.api_dockReadiness)),
        ("api_lifecyclePrestate", printDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.api_lifecyclePrestate)),
        ("api_serviceInterlock", printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.api_serviceInterlock))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS""""),
        ("api_dockReadiness", printDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.api_dockReadiness)),
        ("api_lifecyclePrestate", printDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.api_lifecyclePrestate)),
        ("api_serviceInterlock", printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.api_serviceInterlock))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container): ST = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(o)
      }
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P""""),
        ("api_operationalAssessment", printDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType(o.api_operationalAssessment))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS""""),
        ("api_operationalAssessment", printDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType(o.api_operationalAssessment))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container): ST = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o)
      }
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P""""),
        ("api_lifecyclePrestate", printDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.api_lifecyclePrestate)),
        ("api_operationalAssessment", printDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType(o.api_operationalAssessment)),
        ("api_qualifiedIntent", printDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType(o.api_qualifiedIntent))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS""""),
        ("api_lifecyclePrestate", printDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.api_lifecyclePrestate)),
        ("api_operationalAssessment", printDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType(o.api_operationalAssessment)),
        ("api_qualifiedIntent", printDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType(o.api_qualifiedIntent))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container): ST = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o)
      }
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P""""),
        ("api_admittedDirective", printDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType(o.api_admittedDirective))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS""""),
        ("api_admittedDirective", printDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType(o.api_admittedDirective))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container): ST = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(o)
      }
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P""""),
        ("api_admittedDirective", printDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType(o.api_admittedDirective))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS""""),
        ("In_lifecycleMemory", printDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.In_lifecycleMemory)),
        ("api_admittedDirective", printDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType(o.api_admittedDirective))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container): ST = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(o)
      }
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P""""),
        ("api_arbiterPrestate", printDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.api_arbiterPrestate)),
        ("api_controlProposal", printDocked_Service_Access_Lifecycle_SupervisorControlProposal(o.api_controlProposal)),
        ("api_lifecycleSnapshot", printDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(o.api_lifecycleSnapshot)),
        ("api_monitorPrestate", printDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.api_monitorPrestate))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS""""),
        ("lifecycleMemory", printDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.lifecycleMemory)),
        ("api_arbiterPrestate", printDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.api_arbiterPrestate)),
        ("api_controlProposal", printDocked_Service_Access_Lifecycle_SupervisorControlProposal(o.api_controlProposal)),
        ("api_lifecycleSnapshot", printDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(o.api_lifecycleSnapshot)),
        ("api_monitorPrestate", printDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(o.api_monitorPrestate))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container): ST = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(o)
      }
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P""""),
        ("api_controlProposal", printDocked_Service_Access_Lifecycle_SupervisorControlProposal(o.api_controlProposal)),
        ("api_dockReadiness", printDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.api_dockReadiness)),
        ("api_serviceInterlock", printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.api_serviceInterlock))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS""""),
        ("api_controlProposal", printDocked_Service_Access_Lifecycle_SupervisorControlProposal(o.api_controlProposal)),
        ("api_dockReadiness", printDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(o.api_dockReadiness)),
        ("api_serviceInterlock", printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(o.api_serviceInterlock))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container): ST = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(o)
      }
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P""""),
        ("api_gatedControl", printDocked_Service_Access_Lifecycle_SupervisorGatedControl(o.api_gatedControl)),
        ("api_movementDirective", printDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType(o.api_movementDirective)),
        ("api_serviceAccess", printDocked_Service_Access_Lifecycle_SupervisorServiceAccessType(o.api_serviceAccess))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS""""),
        ("api_gatedControl", printDocked_Service_Access_Lifecycle_SupervisorGatedControl(o.api_gatedControl)),
        ("api_movementDirective", printDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType(o.api_movementDirective)),
        ("api_serviceAccess", printDocked_Service_Access_Lifecycle_SupervisorServiceAccessType(o.api_serviceAccess))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container): ST = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(o)
      }
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P""""),
        ("api_gatedControl", printDocked_Service_Access_Lifecycle_SupervisorGatedControl(o.api_gatedControl)),
        ("api_lifecycleSnapshot", printDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(o.api_lifecycleSnapshot))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS""""),
        ("api_gatedControl", printDocked_Service_Access_Lifecycle_SupervisorGatedControl(o.api_gatedControl)),
        ("api_lifecycleSnapshot", printDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(o.api_lifecycleSnapshot))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container): ST = {
      o match {
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(o)
      }
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P""""),
        ("api_pilotReport", printDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType(o.api_pilotReport)),
        ("api_stationReport", printDocked_Service_Access_Lifecycle_SupervisorStationAccessReportType(o.api_stationReport))
      ))
    }

    @pure def printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS""""),
        ("api_pilotReport", printDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType(o.api_pilotReport)),
        ("api_stationReport", printDocked_Service_Access_Lifecycle_SupervisorStationAccessReportType(o.api_stationReport))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_intentQualifier_postInit => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_intentQualifier_postInit"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_intentQualifier_preCompute => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_intentQualifier_preCompute"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_intentQualifier_postCompute => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_intentQualifier_postCompute"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_dockReadinessQualifier_postInit => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_dockReadinessQualifier_postInit"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_dockReadinessQualifier_preCompute => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_dockReadinessQualifier_preCompute"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_dockReadinessQualifier_postCompute => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_dockReadinessQualifier_postCompute"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_serviceInterlockQualifier_postInit => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_serviceInterlockQualifier_postInit"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_serviceInterlockQualifier_preCompute => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_serviceInterlockQualifier_preCompute"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_serviceInterlockQualifier_postCompute => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_serviceInterlockQualifier_postCompute"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleConsistencyMonitor_postInit => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleConsistencyMonitor_postInit"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleConsistencyMonitor_preCompute => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleConsistencyMonitor_preCompute"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleConsistencyMonitor_postCompute => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleConsistencyMonitor_postCompute"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_priorityArbiter_postInit => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_priorityArbiter_postInit"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_priorityArbiter_preCompute => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_priorityArbiter_preCompute"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_priorityArbiter_postCompute => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_priorityArbiter_postCompute"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleController_postInit => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleController_postInit"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleController_preCompute => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleController_preCompute"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleController_postCompute => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleController_postCompute"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_movementAndAccessSafetyGate_postInit => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_movementAndAccessSafetyGate_postInit"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_movementAndAccessSafetyGate_preCompute => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_movementAndAccessSafetyGate_preCompute"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_movementAndAccessSafetyGate_postCompute => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_movementAndAccessSafetyGate_postCompute"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleReporter_postInit => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleReporter_postInit"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleReporter_preCompute => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleReporter_preCompute"
        case runtimemonitor.ObservationKind.DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleReporter_postCompute => "DockedServiceAccessLifecycleSupervisorSystem_Instance_supervisorProcess_lifecycleReporter_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(o)
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
        case o: Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload => return printDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload => return printDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload => return printDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload => return printDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload => return printDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload => return printDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload => return printDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload => return printDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload => return printDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload => return printDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload => return printDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload => return printDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload => return printDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload => return printDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload => return printDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload => return printDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload => return printDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload => return printDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P => return printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(o)
        case o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS => return printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(o)
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

    def parseDocked_Service_Access_Lifecycle_SupervisorPilotIntentType(): Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorPilotIntentT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorPilotIntentT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.PilotIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.")
          return Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload(): Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorPilotIntent_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorPilotIntent_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorPilotIntentType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType(): Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.")
          return Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload(): Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorBerthObservationType(): Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorBerthObservationT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorBerthObservationT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.BerthObservation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.")
          return Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload(): Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorBerthObservation_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorBerthObservation_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorBerthObservationType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorShipConditionType(): Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorShipConditionT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorShipConditionT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.ShipCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.")
          return Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload(): Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorShipCondition_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorShipCondition_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorShipConditionType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessType(): Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.DockReadiness")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.")
          return Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload(): Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadiness_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorDockReadiness_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceSignalType(): Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceSignalT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceSignalT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.")
          return Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload(): Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceSignal_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceSignal_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorServiceSignalType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType(): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.")
          return Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload(): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleStateT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleStateT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.")
          return Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleState_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleState_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType(): Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.")
          return Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload(): Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType(): Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.")
          return Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload(): Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementProposalType(): Docked_Service_Access_Lifecycle_Supervisor.MovementProposal.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementProposalT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementProposalT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.MovementProposal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.MovementProposal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.MovementProposal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.MovementProposal.")
          return Docked_Service_Access_Lifecycle_Supervisor.MovementProposal.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload(): Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementProposal_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementProposal_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorMovementProposalType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorAccessProposalType(): Docked_Service_Access_Lifecycle_Supervisor.AccessProposal.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorAccessProposalT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorAccessProposalT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.AccessProposal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.AccessProposal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.AccessProposal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.AccessProposal.")
          return Docked_Service_Access_Lifecycle_Supervisor.AccessProposal.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload(): Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorAccessProposal_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorAccessProposal_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorAccessProposalType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleStateType(): Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleStateT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleStateT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.")
          return Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload(): Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleStateType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleResultType(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleResultT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleResultT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.")
          return Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleResultType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType(): Docked_Service_Access_Lifecycle_Supervisor.MovementDirective.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.MovementDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.MovementDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.MovementDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.MovementDirective.")
          return Docked_Service_Access_Lifecycle_Supervisor.MovementDirective.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload(): Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementDirective_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementDirective_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceAccessType(): Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceAccessT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceAccessT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess.")
          return Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload(): Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceAccess_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceAccess_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorServiceAccessType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType(): Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.")
          return Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload(): Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorStationAccessReportType(): Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.Type = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorStationAccessReportT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorStationAccessReportT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.")
          return Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.byOrdinal(0).get
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload(): Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorStationAccessReportType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorControlProposal(): Docked_Service_Access_Lifecycle_Supervisor.ControlProposal = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorControlProposalT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorControlProposalT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ControlProposal = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.ControlProposal")
      }
      parser.parseObjectKey("movement")
      val movement = parseDocked_Service_Access_Lifecycle_SupervisorMovementProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("access")
      val access = parseDocked_Service_Access_Lifecycle_SupervisorAccessProposalType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.ControlProposal(movement, access)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload(): Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorControlProposal_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorControlProposal_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorControlProposal()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshotT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshotT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot")
      }
      parser.parseObjectKey("next_state")
      val next_state = parseDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("result")
      val result = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleResultType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot(next_state, result)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload(value)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorGatedControl(): Docked_Service_Access_Lifecycle_Supervisor.GatedControl = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorGatedControlT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorGatedControlT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.GatedControl = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.GatedControl")
      }
      parser.parseObjectKey("movement")
      val movement = parseDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("access")
      val access = parseDocked_Service_Access_Lifecycle_SupervisorServiceAccessType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.GatedControl(movement, access)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload(): Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorGatedControl_PayloadT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorGatedControl_PayloadT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseDocked_Service_Access_Lifecycle_SupervisorGatedControl()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload(value)
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

    def parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container(): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS"))
      t.native match {
        case "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_pilotIntent")
      val api_pilotIntent = parseDocked_Service_Access_Lifecycle_SupervisorPilotIntentType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(api_pilotIntent)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PST(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_pilotIntent")
      val api_pilotIntent = parseDocked_Service_Access_Lifecycle_SupervisorPilotIntentType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(api_pilotIntent)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container(): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS"))
      t.native match {
        case "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualifiedIntent")
      val api_qualifiedIntent = parseDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(api_qualifiedIntent)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PST(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualifiedIntent")
      val api_qualifiedIntent = parseDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(api_qualifiedIntent)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container(): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS"))
      t.native match {
        case "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_berthObservation")
      val api_berthObservation = parseDocked_Service_Access_Lifecycle_SupervisorBerthObservationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_shipCondition")
      val api_shipCondition = parseDocked_Service_Access_Lifecycle_SupervisorShipConditionType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(api_berthObservation, api_shipCondition)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PST(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_berthObservation")
      val api_berthObservation = parseDocked_Service_Access_Lifecycle_SupervisorBerthObservationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_shipCondition")
      val api_shipCondition = parseDocked_Service_Access_Lifecycle_SupervisorShipConditionType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(api_berthObservation, api_shipCondition)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container(): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS"))
      t.native match {
        case "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_gateReadiness")
      val api_gateReadiness = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitorReadiness")
      val api_monitorReadiness = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(api_gateReadiness, api_monitorReadiness)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PST(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_gateReadiness")
      val api_gateReadiness = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitorReadiness")
      val api_monitorReadiness = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(api_gateReadiness, api_monitorReadiness)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container(): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS"))
      t.native match {
        case "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_repairSignal")
      val api_repairSignal = parseDocked_Service_Access_Lifecycle_SupervisorServiceSignalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resupplySignal")
      val api_resupplySignal = parseDocked_Service_Access_Lifecycle_SupervisorServiceSignalType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(api_repairSignal, api_resupplySignal)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PST(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_repairSignal")
      val api_repairSignal = parseDocked_Service_Access_Lifecycle_SupervisorServiceSignalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resupplySignal")
      val api_resupplySignal = parseDocked_Service_Access_Lifecycle_SupervisorServiceSignalType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(api_repairSignal, api_resupplySignal)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container(): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS"))
      t.native match {
        case "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_gateInterlock")
      val api_gateInterlock = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitorInterlock")
      val api_monitorInterlock = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(api_gateInterlock, api_monitorInterlock)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PST(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_gateInterlock")
      val api_gateInterlock = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitorInterlock")
      val api_monitorInterlock = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(api_gateInterlock, api_monitorInterlock)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS"))
      t.native match {
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PST(T); return r
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P")
      }
      parser.parseObjectKey("api_dockReadiness")
      val api_dockReadiness = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecyclePrestate")
      val api_lifecyclePrestate = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceInterlock")
      val api_serviceInterlock = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(api_dockReadiness, api_lifecyclePrestate, api_serviceInterlock)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PST(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_dockReadiness")
      val api_dockReadiness = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecyclePrestate")
      val api_lifecyclePrestate = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceInterlock")
      val api_serviceInterlock = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(api_dockReadiness, api_lifecyclePrestate, api_serviceInterlock)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS"))
      t.native match {
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PST(T); return r
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P")
      }
      parser.parseObjectKey("api_operationalAssessment")
      val api_operationalAssessment = parseDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(api_operationalAssessment)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PST(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_operationalAssessment")
      val api_operationalAssessment = parseDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(api_operationalAssessment)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS"))
      t.native match {
        case "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(T); return r
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P")
      }
      parser.parseObjectKey("api_lifecyclePrestate")
      val api_lifecyclePrestate = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_operationalAssessment")
      val api_operationalAssessment = parseDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedIntent")
      val api_qualifiedIntent = parseDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(api_lifecyclePrestate, api_operationalAssessment, api_qualifiedIntent)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_lifecyclePrestate")
      val api_lifecyclePrestate = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_operationalAssessment")
      val api_operationalAssessment = parseDocked_Service_Access_Lifecycle_SupervisorOperationalAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedIntent")
      val api_qualifiedIntent = parseDocked_Service_Access_Lifecycle_SupervisorQualifiedIntentType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(api_lifecyclePrestate, api_operationalAssessment, api_qualifiedIntent)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS"))
      t.native match {
        case "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(T); return r
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P")
      }
      parser.parseObjectKey("api_admittedDirective")
      val api_admittedDirective = parseDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(api_admittedDirective)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_admittedDirective")
      val api_admittedDirective = parseDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(api_admittedDirective)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS"))
      t.native match {
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PST(T); return r
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P")
      }
      parser.parseObjectKey("api_admittedDirective")
      val api_admittedDirective = parseDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(api_admittedDirective)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PST(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS")
      }
      parser.parseObjectKey("In_lifecycleMemory")
      val In_lifecycleMemory = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_admittedDirective")
      val api_admittedDirective = parseDocked_Service_Access_Lifecycle_SupervisorAdmittedDirectiveType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(In_lifecycleMemory, api_admittedDirective)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS"))
      t.native match {
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PST(T); return r
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P")
      }
      parser.parseObjectKey("api_arbiterPrestate")
      val api_arbiterPrestate = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_controlProposal")
      val api_controlProposal = parseDocked_Service_Access_Lifecycle_SupervisorControlProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleSnapshot")
      val api_lifecycleSnapshot = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitorPrestate")
      val api_monitorPrestate = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(api_arbiterPrestate, api_controlProposal, api_lifecycleSnapshot, api_monitorPrestate)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PST(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS")
      }
      parser.parseObjectKey("lifecycleMemory")
      val lifecycleMemory = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_arbiterPrestate")
      val api_arbiterPrestate = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_controlProposal")
      val api_controlProposal = parseDocked_Service_Access_Lifecycle_SupervisorControlProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleSnapshot")
      val api_lifecycleSnapshot = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_monitorPrestate")
      val api_monitorPrestate = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleStateType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(lifecycleMemory, api_arbiterPrestate, api_controlProposal, api_lifecycleSnapshot, api_monitorPrestate)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container(): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS"))
      t.native match {
        case "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PST(T); return r
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P")
      }
      parser.parseObjectKey("api_controlProposal")
      val api_controlProposal = parseDocked_Service_Access_Lifecycle_SupervisorControlProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_dockReadiness")
      val api_dockReadiness = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceInterlock")
      val api_serviceInterlock = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(api_controlProposal, api_dockReadiness, api_serviceInterlock)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PST(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS")
      }
      parser.parseObjectKey("api_controlProposal")
      val api_controlProposal = parseDocked_Service_Access_Lifecycle_SupervisorControlProposal()
      parser.parseObjectNext()
      parser.parseObjectKey("api_dockReadiness")
      val api_dockReadiness = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceInterlock")
      val api_serviceInterlock = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(api_controlProposal, api_dockReadiness, api_serviceInterlock)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container(): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS"))
      t.native match {
        case "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PST(T); return r
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P")
      }
      parser.parseObjectKey("api_gatedControl")
      val api_gatedControl = parseDocked_Service_Access_Lifecycle_SupervisorGatedControl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_movementDirective")
      val api_movementDirective = parseDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceAccess")
      val api_serviceAccess = parseDocked_Service_Access_Lifecycle_SupervisorServiceAccessType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(api_gatedControl, api_movementDirective, api_serviceAccess)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PST(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS")
      }
      parser.parseObjectKey("api_gatedControl")
      val api_gatedControl = parseDocked_Service_Access_Lifecycle_SupervisorGatedControl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_movementDirective")
      val api_movementDirective = parseDocked_Service_Access_Lifecycle_SupervisorMovementDirectiveType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceAccess")
      val api_serviceAccess = parseDocked_Service_Access_Lifecycle_SupervisorServiceAccessType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(api_gatedControl, api_movementDirective, api_serviceAccess)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS"))
      t.native match {
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PST(T); return r
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P")
      }
      parser.parseObjectKey("api_gatedControl")
      val api_gatedControl = parseDocked_Service_Access_Lifecycle_SupervisorGatedControl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleSnapshot")
      val api_lifecycleSnapshot = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(api_gatedControl, api_lifecycleSnapshot)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PST(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_gatedControl")
      val api_gatedControl = parseDocked_Service_Access_Lifecycle_SupervisorGatedControl()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleSnapshot")
      val api_lifecycleSnapshot = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(api_gatedControl, api_lifecycleSnapshot)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS"))
      t.native match {
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PST(T); return r
      }
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PT(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PT(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P")
      }
      parser.parseObjectKey("api_pilotReport")
      val api_pilotReport = parseDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stationReport")
      val api_stationReport = parseDocked_Service_Access_Lifecycle_SupervisorStationAccessReportType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(api_pilotReport, api_stationReport)
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS = {
      val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PST(F)
      return r
    }

    def parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PST(typeParsed: B): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_pilotReport")
      val api_pilotReport = parseDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReportType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_stationReport")
      val api_stationReport = parseDocked_Service_Access_Lifecycle_SupervisorStationAccessReportType()
      parser.parseObjectNext()
      return Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(api_pilotReport, api_stationReport)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload", "Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload", "Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload", "Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload", "Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload", "Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload", "Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload", "Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload", "Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload", "Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload", "Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload", "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload", "Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload", "Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload", "Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload", "Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload", "Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload", "Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload", "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P", "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS", "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS"))
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
        case "Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorPilotIntent_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorGatedControl_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceAccess_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceSignal_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorShipCondition_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadiness_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorAccessProposal_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleState_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorControlProposal_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementProposal_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorBerthObservation_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementDirective_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload" => val r = parseDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_PayloadT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P" => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PT(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PST(T); return r
        case "Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS" => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PST(T); return r
        case _ => val r = parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PST(T); return r
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

  def fromDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.PilotIntent_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorPilotIntent_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorQualifiedIntent_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.BerthObservation_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorBerthObservation_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.ShipCondition_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorShipCondition_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.DockReadiness_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorDockReadiness_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorServiceSignal_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorServiceInterlock_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleState_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleState_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorOperationalAssessment_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorAdmittedDirective_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.MovementProposal_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorMovementProposal_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.AccessProposal_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorAccessProposal_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.SnapshotLifecycleState_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorSnapshotLifecycleState_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleResult_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleResult_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.MovementDirective_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorMovementDirective_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorServiceAccess_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorPilotLifecycleReport_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorStationAccessReport_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorControlProposal(o: Docked_Service_Access_Lifecycle_Supervisor.ControlProposal, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorControlProposal(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorControlProposal(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.ControlProposal, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorControlProposal(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.ControlProposal = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorControlProposal()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorControlProposal _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.ControlProposal_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorControlProposal_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleSnapshot_Payload _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorGatedControl(o: Docked_Service_Access_Lifecycle_Supervisor.GatedControl, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorGatedControl(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorGatedControl(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.GatedControl, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorGatedControl(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.GatedControl = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorGatedControl()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorGatedControl _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload(o: Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.GatedControl_Payload = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorGatedControl_Payload _)
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

  def fromDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PreState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.IntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorIntentQualifier_supervisorProcess_intentQualifier_PostState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PreState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorDockReadinessQualifier_supervisorProcess_dockReadinessQualifier_PostState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PreState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_PostState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PreState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_PostState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PreState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.PriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorPriorityArbiter_supervisorProcess_priorityArbiter_PostState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_P = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PreState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_P = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleController_supervisorProcess_lifecycleController_PostState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PreState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorMovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_PostState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PreState_Container_PS _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_P _)
    return r
  }

  def fromDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(o: Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(s: String): Either[Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS, Json.ErrorMsg] = {
    def fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS(parser: Parser): Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS = {
      val r = parser.parseDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS()
      return r
    }
    val r = to(s, fDocked_Service_Access_Lifecycle_SupervisorLifecycleReporter_supervisorProcess_lifecycleReporter_PostState_Container_PS _)
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