// #Sireum
// @formatter:off

// This file is auto-generated from RequestDisposition.scala, BrakeObservation.scala, ThermalCondition.scala, MaintenanceCondition.scala, HealthQualification.scala, PowerObservation.scala, SelfTestObservation.scala, TestCycleDirective.scala, CycleAssessment.scala, StartDecision.scala, LifecycleDirectiveSnapshot.scala, LifecyclePreMode.scala, LifecycleMode.scala, LifecycleReason.scala, StartEnable.scala, ParkingBrakeCommand.scala, PowerDisposition.scala, SelfTestCommand.scala, ControlLifecycleMode.scala, SupervisoryStatus.scala, CommittedTestCycle.scala, RequestLevels.scala, BrakeFacts.scala, PowerFacts.scala, RequestFacts.scala, HealthObservation.scala, StartAuthorizationFacts.scala, AppliedLifecycleSnapshot.scala, ControlFrame.scala, Base_Types.scala, RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_Containers.scala, BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_Containers.scala, HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_Containers.scala, PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_Containers.scala, SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_Containers.scala, StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_Containers.scala, LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_Containers.scala, CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorRequestDispositionType(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition.OffDominant => "OffDominant"
        case Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition.ReturnCandidate => "ReturnCandidate"
        case Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition.StartCandidate => "StartCandidate"
        case Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition.None => "None"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorRequestDispositionType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.Pressed => "Pressed"
        case Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.Released => "Released"
        case Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorThermalConditionType(o: Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition.Normal => "Normal"
        case Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition.OverMaximum => "OverMaximum"
        case Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorThermalConditionType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorMaintenanceConditionType(o: Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition.NotDue => "NotDue"
        case Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition.Due => "Due"
        case Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorMaintenanceConditionType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Ready => "Ready"
        case Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.NotReady => "NotReady"
        case Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorPowerObservationType(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.Available => "Available"
        case Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.Unavailable => "Unavailable"
        case Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorPowerObservationType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.NoEvent => "NoEvent"
        case Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.FreshPass => "FreshPass"
        case Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.FreshFail => "FreshFail"
        case Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType(o: Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.None => "None"
        case Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.BeginStart => "BeginStart"
        case Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.BeginRecovery => "BeginRecovery"
        case Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.Clear => "Clear"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType(o: Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.Idle => "Idle"
        case Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.AwaitingStart => "AwaitingStart"
        case Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.AwaitingRecovery => "AwaitingRecovery"
        case Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.StartPassed => "StartPassed"
        case Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.RecoveryPassed => "RecoveryPassed"
        case Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.Failed => "Failed"
        case Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorStartDecisionType(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision.OffPriority => "OffPriority"
        case Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision.NoStart => "NoStart"
        case Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision.DenyInvalid => "DenyInvalid"
        case Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision.DenyNotReady => "DenyNotReady"
        case Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision.BeginStartTest => "BeginStartTest"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorStartDecisionType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshotType(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot.None => "None"
        case Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot.BeginStart => "BeginStart"
        case Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot.BeginRecovery => "BeginRecovery"
        case Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot.Clear => "Clear"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshotType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreModeType(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode.Off => "Off"
        case Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode.Starting => "Starting"
        case Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode.On => "On"
        case Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode.Degraded => "Degraded"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreModeType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.Off => "Off"
        case Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.Starting => "Starting"
        case Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.On => "On"
        case Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.Degraded => "Degraded"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorLifecycleReasonType(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason.Ordinary => "Ordinary"
        case Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason.QualificationInvalid => "QualificationInvalid"
        case Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason.QualificationNotReady => "QualificationNotReady"
        case Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason.RecoveryAwaiting => "RecoveryAwaiting"
        case Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason.RecoveryCompleted => "RecoveryCompleted"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorLifecycleReasonType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorStartEnableType(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable.Inhibit => "Inhibit"
        case Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable.Permit => "Permit"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorStartEnableType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommandType(o: Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand.Apply => "Apply"
        case Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand.Release => "Release"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommandType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorPowerDispositionType(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition.Isolate => "Isolate"
        case Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition.TestOnly => "TestOnly"
        case Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition.Enable => "Enable"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorPowerDispositionType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommandType(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand.None => "None"
        case Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand.Initiate => "Initiate"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommandType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleModeType(o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode.Off => "Off"
        case Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode.Starting => "Starting"
        case Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode.On => "On"
        case Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode.Degraded => "Degraded"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleModeType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatusType(o: Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.Idle => "Idle"
        case Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.RequestConflict => "RequestConflict"
        case Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.StartBlockedInvalid => "StartBlockedInvalid"
        case Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.StartBlockedNotReady => "StartBlockedNotReady"
        case Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.Testing => "Testing"
        case Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.Operating => "Operating"
        case Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.Degraded => "Degraded"
        case Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.RecoveryTesting => "RecoveryTesting"
        case Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.RecoveredAwaitFreshStart => "RecoveredAwaitFreshStart"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatusType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleType(o: Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.Type): ST = {
      val value: String = o match {
        case Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.Idle => "Idle"
        case Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.AwaitingStart => "AwaitingStart"
        case Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.AwaitingRecovery => "AwaitingRecovery"
        case Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.StartPassed => "StartPassed"
        case Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.RecoveryPassed => "RecoveryPassed"
        case Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.Failed => "Failed"
        case Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleType(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels""""),
        ("start", printB(o.start)),
        ("off", printB(o.off)),
        ("returnLevel", printB(o.returnLevel))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts""""),
        ("evidenceTrusted", printB(o.evidenceTrusted)),
        ("readyForAdmission", printB(o.readyForAdmission))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts""""),
        ("evidenceTrusted", printB(o.evidenceTrusted)),
        ("availableForSupervision", printB(o.availableForSupervision))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts""""),
        ("offActive", printB(o.offActive)),
        ("freshReturn", printB(o.freshReturn)),
        ("freshStart", printB(o.freshStart)),
        ("conflict", printB(o.conflict)),
        ("disposition", printVehicle_Start_Readiness_Recovery_SupervisorRequestDispositionType(o.disposition))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation""""),
        ("thermal", printVehicle_Start_Readiness_Recovery_SupervisorThermalConditionType(o.thermal)),
        ("maintenance", printVehicle_Start_Readiness_Recovery_SupervisorMaintenanceConditionType(o.maintenance))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts""""),
        ("decision", printVehicle_Start_Readiness_Recovery_SupervisorStartDecisionType(o.decision)),
        ("conflict", printB(o.conflict))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(o: Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot""""),
        ("cycleDirective", printVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshotType(o.cycleDirective)),
        ("preModeSnapshot", printVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreModeType(o.preModeSnapshot)),
        ("nextMode", printVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType(o.nextMode)),
        ("reason", printVehicle_Start_Readiness_Recovery_SupervisorLifecycleReasonType(o.reason))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(o.value))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorControlFrame(o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame""""),
        ("startEnable", printVehicle_Start_Readiness_Recovery_SupervisorStartEnableType(o.startEnable)),
        ("parkingBrake", printVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommandType(o.parkingBrake)),
        ("powerDisposition", printVehicle_Start_Readiness_Recovery_SupervisorPowerDispositionType(o.powerDisposition)),
        ("selfTestCommand", printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommandType(o.selfTestCommand)),
        ("lifecycleMode", printVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleModeType(o.lifecycleMode)),
        ("status", printVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatusType(o.status))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload""""),
        ("value", printVehicle_Start_Readiness_Recovery_SupervisorControlFrame(o.value))
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

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P""""),
        ("api_request_levels", printVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(o.api_request_levels))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS""""),
        ("In_previousOff", printB(o.In_previousOff)),
        ("In_previousReturn", printB(o.In_previousReturn)),
        ("In_previousStart", printB(o.In_previousStart)),
        ("api_request_levels", printVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(o.api_request_levels))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P""""),
        ("api_request_to_authorization", printVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.api_request_to_authorization)),
        ("api_request_to_lifecycle", printVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.api_request_to_lifecycle))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS""""),
        ("previousOff", printB(o.previousOff)),
        ("previousReturn", printB(o.previousReturn)),
        ("previousStart", printB(o.previousStart)),
        ("api_request_to_authorization", printVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.api_request_to_authorization)),
        ("api_request_to_lifecycle", printVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.api_request_to_lifecycle))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P""""),
        ("api_brake_observation", printVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType(o.api_brake_observation))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS""""),
        ("api_brake_observation", printVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType(o.api_brake_observation))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P""""),
        ("api_brake_to_authorization", printVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.api_brake_to_authorization)),
        ("api_brake_to_lifecycle", printVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.api_brake_to_lifecycle))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS""""),
        ("api_brake_to_authorization", printVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.api_brake_to_authorization)),
        ("api_brake_to_lifecycle", printVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.api_brake_to_lifecycle))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P""""),
        ("api_health_observation", printVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(o.api_health_observation))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS""""),
        ("api_health_observation", printVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(o.api_health_observation))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P""""),
        ("api_health_to_authorization", printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.api_health_to_authorization)),
        ("api_health_to_lifecycle", printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.api_health_to_lifecycle))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS""""),
        ("api_health_to_authorization", printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.api_health_to_authorization)),
        ("api_health_to_lifecycle", printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.api_health_to_lifecycle))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P""""),
        ("api_power_observation", printVehicle_Start_Readiness_Recovery_SupervisorPowerObservationType(o.api_power_observation))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS""""),
        ("api_power_observation", printVehicle_Start_Readiness_Recovery_SupervisorPowerObservationType(o.api_power_observation))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P""""),
        ("api_power_to_authorization", printVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.api_power_to_authorization)),
        ("api_power_to_lifecycle", printVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.api_power_to_lifecycle))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS""""),
        ("api_power_to_authorization", printVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.api_power_to_authorization)),
        ("api_power_to_lifecycle", printVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.api_power_to_lifecycle))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P""""),
        ("api_self_test_observation", printVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType(o.api_self_test_observation)),
        ("api_test_cycle_directive", printVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType(o.api_test_cycle_directive))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS""""),
        ("In_committedTestCycle", printVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleType(o.In_committedTestCycle)),
        ("api_self_test_observation", printVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType(o.api_self_test_observation)),
        ("api_test_cycle_directive", printVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType(o.api_test_cycle_directive))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P""""),
        ("api_cycle_assessment", printVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType(o.api_cycle_assessment))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS""""),
        ("committedTestCycle", printVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleType(o.committedTestCycle)),
        ("api_cycle_assessment", printVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType(o.api_cycle_assessment))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P""""),
        ("api_brake_facts", printVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.api_brake_facts)),
        ("api_health_qualification", printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.api_health_qualification)),
        ("api_power_facts", printVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.api_power_facts)),
        ("api_request_facts", printVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.api_request_facts))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS""""),
        ("api_brake_facts", printVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.api_brake_facts)),
        ("api_health_qualification", printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.api_health_qualification)),
        ("api_power_facts", printVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.api_power_facts)),
        ("api_request_facts", printVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.api_request_facts))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P""""),
        ("api_authorization_to_lifecycle", printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.api_authorization_to_lifecycle)),
        ("api_authorization_to_outcome", printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.api_authorization_to_outcome))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS""""),
        ("api_authorization_to_lifecycle", printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.api_authorization_to_lifecycle)),
        ("api_authorization_to_outcome", printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.api_authorization_to_outcome))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P""""),
        ("api_authorization", printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.api_authorization)),
        ("api_brake_facts", printVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.api_brake_facts)),
        ("api_cycle_assessment", printVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType(o.api_cycle_assessment)),
        ("api_health_qualification", printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.api_health_qualification)),
        ("api_power_facts", printVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.api_power_facts)),
        ("api_request_facts", printVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.api_request_facts))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS""""),
        ("In_lifecycleModeMemory", printVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType(o.In_lifecycleModeMemory)),
        ("api_authorization", printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.api_authorization)),
        ("api_brake_facts", printVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o.api_brake_facts)),
        ("api_cycle_assessment", printVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType(o.api_cycle_assessment)),
        ("api_health_qualification", printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(o.api_health_qualification)),
        ("api_power_facts", printVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o.api_power_facts)),
        ("api_request_facts", printVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o.api_request_facts))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P""""),
        ("api_applied_lifecycle", printVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(o.api_applied_lifecycle)),
        ("api_test_cycle_directive", printVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType(o.api_test_cycle_directive))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS""""),
        ("lifecycleModeMemory", printVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType(o.lifecycleModeMemory)),
        ("api_applied_lifecycle", printVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(o.api_applied_lifecycle)),
        ("api_test_cycle_directive", printVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType(o.api_test_cycle_directive))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P""""),
        ("api_applied_lifecycle", printVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(o.api_applied_lifecycle)),
        ("api_authorization", printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.api_authorization))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS""""),
        ("api_applied_lifecycle", printVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(o.api_applied_lifecycle)),
        ("api_authorization", printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o.api_authorization))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P""""),
        ("api_control_frame", printVehicle_Start_Readiness_Recovery_SupervisorControlFrame(o.api_control_frame))
      ))
    }

    @pure def printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS""""),
        ("api_control_frame", printVehicle_Start_Readiness_Recovery_SupervisorControlFrame(o.api_control_frame))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_request_priority_owner_postInit => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_request_priority_owner_postInit"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_request_priority_owner_preCompute => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_request_priority_owner_preCompute"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_request_priority_owner_postCompute => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_request_priority_owner_postCompute"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_brake_qualification_owner_postInit => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_brake_qualification_owner_postInit"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_brake_qualification_owner_preCompute => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_brake_qualification_owner_preCompute"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_brake_qualification_owner_postCompute => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_brake_qualification_owner_postCompute"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_health_qualification_owner_postInit => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_health_qualification_owner_postInit"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_health_qualification_owner_preCompute => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_health_qualification_owner_preCompute"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_health_qualification_owner_postCompute => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_health_qualification_owner_postCompute"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_power_qualification_owner_postInit => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_power_qualification_owner_postInit"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_power_qualification_owner_preCompute => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_power_qualification_owner_preCompute"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_power_qualification_owner_postCompute => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_power_qualification_owner_postCompute"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_self_test_cycle_owner_postInit => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_self_test_cycle_owner_postInit"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_self_test_cycle_owner_preCompute => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_self_test_cycle_owner_preCompute"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_self_test_cycle_owner_postCompute => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_self_test_cycle_owner_postCompute"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_start_authorization_owner_postInit => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_start_authorization_owner_postInit"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_start_authorization_owner_preCompute => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_start_authorization_owner_preCompute"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_start_authorization_owner_postCompute => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_start_authorization_owner_postCompute"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_lifecycle_recovery_owner_postInit => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_lifecycle_recovery_owner_postInit"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_lifecycle_recovery_owner_preCompute => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_lifecycle_recovery_owner_preCompute"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_lifecycle_recovery_owner_postCompute => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_lifecycle_recovery_owner_postCompute"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_coordinated_outcome_owner_postInit => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_coordinated_outcome_owner_postInit"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_coordinated_outcome_owner_preCompute => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_coordinated_outcome_owner_preCompute"
        case runtimemonitor.ObservationKind.VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_coordinated_outcome_owner_postCompute => "VehicleStartReadinessRecoverySupervisorSystem_Instance_vehicle_supervisor_process_coordinated_outcome_owner_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(o)
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
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload => return printVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P => return printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(o)
        case o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS => return printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(o)
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

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestDispositionType(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestDispositionT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestDispositionT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorRequestDispositionType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorThermalConditionType(): Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorThermalConditionT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorThermalConditionT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorThermalConditionType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorMaintenanceConditionType(): Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorMaintenanceConditionT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorMaintenanceConditionT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorMaintenanceConditionType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerObservationType(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerObservationT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerObservationT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorPowerObservationType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType(): Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType(): Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartDecisionType(): Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartDecisionT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartDecisionT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartDecision_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartDecision_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorStartDecisionType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshotType(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshotT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshotT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshotType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreModeType(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreModeT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreModeT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreModeType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleReasonType(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleReasonT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleReasonT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleReasonType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartEnableType(): Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartEnableT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartEnableT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartEnable_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartEnable_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorStartEnableType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommandType(): Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommandT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommandT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommandType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerDispositionType(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerDispositionT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerDispositionT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorPowerDispositionType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommandType(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommandT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommandT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommandType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleModeType(): Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleModeT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleModeT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleModeType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatusType(): Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatusT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatusT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatusType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleType(): Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.Type = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.")
          return Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle.byOrdinal(0).get
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestLevelsT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestLevelsT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels")
      }
      parser.parseObjectKey("start")
      val start = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("off")
      val off = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("returnLevel")
      val returnLevel = parser.parseB()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels(start, off, returnLevel)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorRequestLevels()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFactsT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFactsT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts")
      }
      parser.parseObjectKey("evidenceTrusted")
      val evidenceTrusted = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("readyForAdmission")
      val readyForAdmission = parser.parseB()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts(evidenceTrusted, readyForAdmission)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerFactsT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerFactsT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts")
      }
      parser.parseObjectKey("evidenceTrusted")
      val evidenceTrusted = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("availableForSupervision")
      val availableForSupervision = parser.parseB()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts(evidenceTrusted, availableForSupervision)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestFactsT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestFactsT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts")
      }
      parser.parseObjectKey("offActive")
      val offActive = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("freshReturn")
      val freshReturn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("freshStart")
      val freshStart = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("conflict")
      val conflict = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseVehicle_Start_Readiness_Recovery_SupervisorRequestDispositionType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts(offActive, freshReturn, freshStart, conflict, disposition)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthObservationT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthObservationT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation")
      }
      parser.parseObjectKey("thermal")
      val thermal = parseVehicle_Start_Readiness_Recovery_SupervisorThermalConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("maintenance")
      val maintenance = parseVehicle_Start_Readiness_Recovery_SupervisorMaintenanceConditionType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation(thermal, maintenance)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorHealthObservation()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFactsT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFactsT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts")
      }
      parser.parseObjectKey("decision")
      val decision = parseVehicle_Start_Readiness_Recovery_SupervisorStartDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("conflict")
      val conflict = parser.parseB()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts(decision, conflict)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(): Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshotT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshotT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot")
      }
      parser.parseObjectKey("cycleDirective")
      val cycleDirective = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshotType()
      parser.parseObjectNext()
      parser.parseObjectKey("preModeSnapshot")
      val preModeSnapshot = parseVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("nextMode")
      val nextMode = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("reason")
      val reason = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleReasonType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot(cycleDirective, preModeSnapshot, nextMode, reason)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload(value)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorControlFrame(): Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorControlFrameT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorControlFrameT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame")
      }
      parser.parseObjectKey("startEnable")
      val startEnable = parseVehicle_Start_Readiness_Recovery_SupervisorStartEnableType()
      parser.parseObjectNext()
      parser.parseObjectKey("parkingBrake")
      val parkingBrake = parseVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("powerDisposition")
      val powerDisposition = parseVehicle_Start_Readiness_Recovery_SupervisorPowerDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("selfTestCommand")
      val selfTestCommand = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("lifecycleMode")
      val lifecycleMode = parseVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatusType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame(startEnable, parkingBrake, powerDisposition, selfTestCommand, lifecycleMode, status)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload(): Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorControlFrame_PayloadT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorControlFrame_PayloadT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Start_Readiness_Recovery_SupervisorControlFrame()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload(value)
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

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_request_levels")
      val api_request_levels = parseVehicle_Start_Readiness_Recovery_SupervisorRequestLevels()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(api_request_levels)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_previousOff")
      val In_previousOff = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_previousReturn")
      val In_previousReturn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_previousStart")
      val In_previousStart = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_levels")
      val api_request_levels = parseVehicle_Start_Readiness_Recovery_SupervisorRequestLevels()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(In_previousOff, In_previousReturn, In_previousStart, api_request_levels)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_request_to_authorization")
      val api_request_to_authorization = parseVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_to_lifecycle")
      val api_request_to_lifecycle = parseVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(api_request_to_authorization, api_request_to_lifecycle)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("previousOff")
      val previousOff = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("previousReturn")
      val previousReturn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("previousStart")
      val previousStart = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_to_authorization")
      val api_request_to_authorization = parseVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_to_lifecycle")
      val api_request_to_lifecycle = parseVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(previousOff, previousReturn, previousStart, api_request_to_authorization, api_request_to_lifecycle)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_brake_observation")
      val api_brake_observation = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(api_brake_observation)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_brake_observation")
      val api_brake_observation = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeObservationType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(api_brake_observation)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_brake_to_authorization")
      val api_brake_to_authorization = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_brake_to_lifecycle")
      val api_brake_to_lifecycle = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(api_brake_to_authorization, api_brake_to_lifecycle)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_brake_to_authorization")
      val api_brake_to_authorization = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_brake_to_lifecycle")
      val api_brake_to_lifecycle = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(api_brake_to_authorization, api_brake_to_lifecycle)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_health_observation")
      val api_health_observation = parseVehicle_Start_Readiness_Recovery_SupervisorHealthObservation()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(api_health_observation)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_health_observation")
      val api_health_observation = parseVehicle_Start_Readiness_Recovery_SupervisorHealthObservation()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(api_health_observation)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_health_to_authorization")
      val api_health_to_authorization = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_health_to_lifecycle")
      val api_health_to_lifecycle = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(api_health_to_authorization, api_health_to_lifecycle)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_health_to_authorization")
      val api_health_to_authorization = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_health_to_lifecycle")
      val api_health_to_lifecycle = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(api_health_to_authorization, api_health_to_lifecycle)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_power_observation")
      val api_power_observation = parseVehicle_Start_Readiness_Recovery_SupervisorPowerObservationType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(api_power_observation)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_power_observation")
      val api_power_observation = parseVehicle_Start_Readiness_Recovery_SupervisorPowerObservationType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(api_power_observation)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_power_to_authorization")
      val api_power_to_authorization = parseVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_power_to_lifecycle")
      val api_power_to_lifecycle = parseVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(api_power_to_authorization, api_power_to_lifecycle)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_power_to_authorization")
      val api_power_to_authorization = parseVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_power_to_lifecycle")
      val api_power_to_lifecycle = parseVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(api_power_to_authorization, api_power_to_lifecycle)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_self_test_observation")
      val api_self_test_observation = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_test_cycle_directive")
      val api_test_cycle_directive = parseVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(api_self_test_observation, api_test_cycle_directive)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_committedTestCycle")
      val In_committedTestCycle = parseVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_self_test_observation")
      val api_self_test_observation = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_test_cycle_directive")
      val api_test_cycle_directive = parseVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(In_committedTestCycle, api_self_test_observation, api_test_cycle_directive)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_cycle_assessment")
      val api_cycle_assessment = parseVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(api_cycle_assessment)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("committedTestCycle")
      val committedTestCycle = parseVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycleType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_cycle_assessment")
      val api_cycle_assessment = parseVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(committedTestCycle, api_cycle_assessment)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_brake_facts")
      val api_brake_facts = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_health_qualification")
      val api_health_qualification = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_power_facts")
      val api_power_facts = parseVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(api_brake_facts, api_health_qualification, api_power_facts, api_request_facts)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_brake_facts")
      val api_brake_facts = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_health_qualification")
      val api_health_qualification = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_power_facts")
      val api_power_facts = parseVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(api_brake_facts, api_health_qualification, api_power_facts, api_request_facts)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_authorization_to_lifecycle")
      val api_authorization_to_lifecycle = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_authorization_to_outcome")
      val api_authorization_to_outcome = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(api_authorization_to_lifecycle, api_authorization_to_outcome)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_authorization_to_lifecycle")
      val api_authorization_to_lifecycle = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_authorization_to_outcome")
      val api_authorization_to_outcome = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(api_authorization_to_lifecycle, api_authorization_to_outcome)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_authorization")
      val api_authorization = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_brake_facts")
      val api_brake_facts = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_cycle_assessment")
      val api_cycle_assessment = parseVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_health_qualification")
      val api_health_qualification = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_power_facts")
      val api_power_facts = parseVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(api_authorization, api_brake_facts, api_cycle_assessment, api_health_qualification, api_power_facts, api_request_facts)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_lifecycleModeMemory")
      val In_lifecycleModeMemory = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_authorization")
      val api_authorization = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_brake_facts")
      val api_brake_facts = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_cycle_assessment")
      val api_cycle_assessment = parseVehicle_Start_Readiness_Recovery_SupervisorCycleAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_health_qualification")
      val api_health_qualification = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_power_facts")
      val api_power_facts = parseVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_request_facts")
      val api_request_facts = parseVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(In_lifecycleModeMemory, api_authorization, api_brake_facts, api_cycle_assessment, api_health_qualification, api_power_facts, api_request_facts)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_applied_lifecycle")
      val api_applied_lifecycle = parseVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_test_cycle_directive")
      val api_test_cycle_directive = parseVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(api_applied_lifecycle, api_test_cycle_directive)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("lifecycleModeMemory")
      val lifecycleModeMemory = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_applied_lifecycle")
      val api_applied_lifecycle = parseVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_test_cycle_directive")
      val api_test_cycle_directive = parseVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirectiveType()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(lifecycleModeMemory, api_applied_lifecycle, api_test_cycle_directive)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_applied_lifecycle")
      val api_applied_lifecycle = parseVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_authorization")
      val api_authorization = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(api_applied_lifecycle, api_authorization)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_applied_lifecycle")
      val api_applied_lifecycle = parseVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_authorization")
      val api_authorization = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(api_applied_lifecycle, api_authorization)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container(): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PT(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_control_frame")
      val api_control_frame = parseVehicle_Start_Readiness_Recovery_SupervisorControlFrame()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(api_control_frame)
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS = {
      val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PST(typeParsed: B): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_control_frame")
      val api_control_frame = parseVehicle_Start_Readiness_Recovery_SupervisorControlFrame()
      parser.parseObjectNext()
      return Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(api_control_frame)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload", "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS", "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P", "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS"))
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
        case "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartEnable_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorControlFrame_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartDecision_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_PayloadT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PST(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PT(T); return r
        case "Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS" => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PST(T); return r
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

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.RequestDisposition_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorRequestDisposition_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorBrakeObservation_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.ThermalCondition_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorThermalCondition_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.MaintenanceCondition_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorMaintenanceCondition_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorHealthQualification_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorPowerObservation_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestObservation_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorSelfTestObservation_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.TestCycleDirective_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorTestCycleDirective_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.CycleAssessment_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorCycleAssessment_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.StartDecision_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorStartDecision_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleDirectiveSnapshot_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleDirectiveSnapshot_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.LifecyclePreMode_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorLifecyclePreMode_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleMode_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleReason_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleReason_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.StartEnable_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorStartEnable_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.ParkingBrakeCommand_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorParkingBrakeCommand_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.PowerDisposition_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorPowerDisposition_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCommand_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCommand_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.ControlLifecycleMode_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorControlLifecycleMode_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.SupervisoryStatus_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorSupervisoryStatus_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.CommittedTestCycle_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorCommittedTestCycle_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestLevels(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorRequestLevels()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorRequestLevels _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorRequestLevels_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorBrakeFacts_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerFacts(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorPowerFacts()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorPowerFacts _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorPowerFacts_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestFacts(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorRequestFacts()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorRequestFacts _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorRequestFacts_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthObservation(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorHealthObservation()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorHealthObservation _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorHealthObservation_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationFacts_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(o: Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorAppliedLifecycleSnapshot_Payload _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorControlFrame(o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorControlFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorControlFrame(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorControlFrame(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorControlFrame()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorControlFrame _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload(o: Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame_Payload = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorControlFrame_Payload _)
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

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorRequestPriorityOwner_vehicle_supervisor_process_request_priority_owner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorBrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorHealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorPowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.SelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorSelfTestCycleOwner_vehicle_supervisor_process_self_test_cycle_owner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorStartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorLifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(o: Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(s: String): Either[Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS(parser: Parser): Vehicle_Start_Readiness_Recovery_Supervisor.CoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS = {
      val r = parser.parseVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Start_Readiness_Recovery_SupervisorCoordinatedOutcomeOwner_vehicle_supervisor_process_coordinated_outcome_owner_PostState_Container_PS _)
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