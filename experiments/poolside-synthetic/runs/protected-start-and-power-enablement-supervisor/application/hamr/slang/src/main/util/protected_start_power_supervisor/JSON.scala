// #Sireum
// @formatter:off

// This file is auto-generated from Command.scala, Validity.scala, PedalCondition.scala, TemperatureBand.scala, QualifiedTemperature.scala, SupplyAvailability.scala, ParkingBrakeCondition.scala, ThermalState.scala, SelfTestProgress.scala, SelfTestState.scala, Session.scala, SessionCause.scala, RearmState.scala, FuelDisposition.scala, ElectricalDisposition.scala, ParkingBrakeDisposition.scala, Notice.scala, CommandReport.scala, QualifiedCommandFacts.scala, QualifiedPedalFacts.scala, QualifiedSupplyFacts.scala, QualifiedParkingBrakeFacts.scala, StartRestraintFact.scala, ReadinessFacts.scala, ExactFaultSummary.scala, RecoveryPermitFact.scala, BrakePedalReport.scala, TemperatureReport.scala, ElectricalPowerReport.scala, ParkingBrakeReport.scala, ThermalStateFacts.scala, SelfTestReport.scala, SelfTestStateFacts.scala, SessionDecisionFacts.scala, RearmStateFacts.scala, ActuationDisposition.scala, SupervisoryStatus.scala, Base_Types.scala, CommandQualificationOwner_protected_start_power_process_command_qualification_owner_Containers.scala, BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_Containers.scala, TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_Containers.scala, ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_Containers.scala, ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_Containers.scala, ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_Containers.scala, SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_Containers.scala, StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_Containers.scala, ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_Containers.scala, OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_Containers.scala, FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_Containers.scala, RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_Containers.scala, ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_Containers.scala, SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package protected_start_power_supervisor

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printProtected_Start_Power_SupervisorCommandType(o: Protected_Start_Power_Supervisor.Command.Type): ST = {
      val value: String = o match {
        case Protected_Start_Power_Supervisor.Command.None => "None"
        case Protected_Start_Power_Supervisor.Command.Start => "Start"
        case Protected_Start_Power_Supervisor.Command.Off => "Off"
        case Protected_Start_Power_Supervisor.Command.EnterMaintenance => "EnterMaintenance"
        case Protected_Start_Power_Supervisor.Command.ReturnToNormal => "ReturnToNormal"
      }
      return printObject(ISZ(
        ("type", printString("Protected_Start_Power_Supervisor.Command")),
        ("value", printString(value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorCommand_Payload(o: Protected_Start_Power_Supervisor.Command_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.Command_Payload""""),
        ("value", printProtected_Start_Power_SupervisorCommandType(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorValidityType(o: Protected_Start_Power_Supervisor.Validity.Type): ST = {
      val value: String = o match {
        case Protected_Start_Power_Supervisor.Validity.Valid => "Valid"
        case Protected_Start_Power_Supervisor.Validity.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Protected_Start_Power_Supervisor.Validity")),
        ("value", printString(value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorValidity_Payload(o: Protected_Start_Power_Supervisor.Validity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.Validity_Payload""""),
        ("value", printProtected_Start_Power_SupervisorValidityType(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorPedalConditionType(o: Protected_Start_Power_Supervisor.PedalCondition.Type): ST = {
      val value: String = o match {
        case Protected_Start_Power_Supervisor.PedalCondition.Pressed => "Pressed"
        case Protected_Start_Power_Supervisor.PedalCondition.Released => "Released"
      }
      return printObject(ISZ(
        ("type", printString("Protected_Start_Power_Supervisor.PedalCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorPedalCondition_Payload(o: Protected_Start_Power_Supervisor.PedalCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.PedalCondition_Payload""""),
        ("value", printProtected_Start_Power_SupervisorPedalConditionType(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorTemperatureBandType(o: Protected_Start_Power_Supervisor.TemperatureBand.Type): ST = {
      val value: String = o match {
        case Protected_Start_Power_Supervisor.TemperatureBand.Nominal => "Nominal"
        case Protected_Start_Power_Supervisor.TemperatureBand.Elevated => "Elevated"
        case Protected_Start_Power_Supervisor.TemperatureBand.OverLimit => "OverLimit"
      }
      return printObject(ISZ(
        ("type", printString("Protected_Start_Power_Supervisor.TemperatureBand")),
        ("value", printString(value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorTemperatureBand_Payload(o: Protected_Start_Power_Supervisor.TemperatureBand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.TemperatureBand_Payload""""),
        ("value", printProtected_Start_Power_SupervisorTemperatureBandType(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorQualifiedTemperatureType(o: Protected_Start_Power_Supervisor.QualifiedTemperature.Type): ST = {
      val value: String = o match {
        case Protected_Start_Power_Supervisor.QualifiedTemperature.InvalidEvidence => "InvalidEvidence"
        case Protected_Start_Power_Supervisor.QualifiedTemperature.Nominal => "Nominal"
        case Protected_Start_Power_Supervisor.QualifiedTemperature.Elevated => "Elevated"
        case Protected_Start_Power_Supervisor.QualifiedTemperature.OverLimit => "OverLimit"
      }
      return printObject(ISZ(
        ("type", printString("Protected_Start_Power_Supervisor.QualifiedTemperature")),
        ("value", printString(value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorQualifiedTemperature_Payload(o: Protected_Start_Power_Supervisor.QualifiedTemperature_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.QualifiedTemperature_Payload""""),
        ("value", printProtected_Start_Power_SupervisorQualifiedTemperatureType(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSupplyAvailabilityType(o: Protected_Start_Power_Supervisor.SupplyAvailability.Type): ST = {
      val value: String = o match {
        case Protected_Start_Power_Supervisor.SupplyAvailability.Available => "Available"
        case Protected_Start_Power_Supervisor.SupplyAvailability.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("Protected_Start_Power_Supervisor.SupplyAvailability")),
        ("value", printString(value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSupplyAvailability_Payload(o: Protected_Start_Power_Supervisor.SupplyAvailability_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SupplyAvailability_Payload""""),
        ("value", printProtected_Start_Power_SupervisorSupplyAvailabilityType(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorParkingBrakeConditionType(o: Protected_Start_Power_Supervisor.ParkingBrakeCondition.Type): ST = {
      val value: String = o match {
        case Protected_Start_Power_Supervisor.ParkingBrakeCondition.Applied => "Applied"
        case Protected_Start_Power_Supervisor.ParkingBrakeCondition.Released => "Released"
      }
      return printObject(ISZ(
        ("type", printString("Protected_Start_Power_Supervisor.ParkingBrakeCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorParkingBrakeCondition_Payload(o: Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload""""),
        ("value", printProtected_Start_Power_SupervisorParkingBrakeConditionType(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorThermalStateType(o: Protected_Start_Power_Supervisor.ThermalState.Type): ST = {
      val value: String = o match {
        case Protected_Start_Power_Supervisor.ThermalState.Blocked => "Blocked"
        case Protected_Start_Power_Supervisor.ThermalState.Confirming => "Confirming"
        case Protected_Start_Power_Supervisor.ThermalState.Clear => "Clear"
      }
      return printObject(ISZ(
        ("type", printString("Protected_Start_Power_Supervisor.ThermalState")),
        ("value", printString(value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorThermalState_Payload(o: Protected_Start_Power_Supervisor.ThermalState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ThermalState_Payload""""),
        ("value", printProtected_Start_Power_SupervisorThermalStateType(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSelfTestProgressType(o: Protected_Start_Power_Supervisor.SelfTestProgress.Type): ST = {
      val value: String = o match {
        case Protected_Start_Power_Supervisor.SelfTestProgress.Idle => "Idle"
        case Protected_Start_Power_Supervisor.SelfTestProgress.Running => "Running"
        case Protected_Start_Power_Supervisor.SelfTestProgress.Passed => "Passed"
        case Protected_Start_Power_Supervisor.SelfTestProgress.Failed => "Failed"
      }
      return printObject(ISZ(
        ("type", printString("Protected_Start_Power_Supervisor.SelfTestProgress")),
        ("value", printString(value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSelfTestProgress_Payload(o: Protected_Start_Power_Supervisor.SelfTestProgress_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SelfTestProgress_Payload""""),
        ("value", printProtected_Start_Power_SupervisorSelfTestProgressType(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSelfTestStateType(o: Protected_Start_Power_Supervisor.SelfTestState.Type): ST = {
      val value: String = o match {
        case Protected_Start_Power_Supervisor.SelfTestState.Untested => "Untested"
        case Protected_Start_Power_Supervisor.SelfTestState.Testing => "Testing"
        case Protected_Start_Power_Supervisor.SelfTestState.Passed => "Passed"
        case Protected_Start_Power_Supervisor.SelfTestState.Failed => "Failed"
      }
      return printObject(ISZ(
        ("type", printString("Protected_Start_Power_Supervisor.SelfTestState")),
        ("value", printString(value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSelfTestState_Payload(o: Protected_Start_Power_Supervisor.SelfTestState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SelfTestState_Payload""""),
        ("value", printProtected_Start_Power_SupervisorSelfTestStateType(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSessionType(o: Protected_Start_Power_Supervisor.Session.Type): ST = {
      val value: String = o match {
        case Protected_Start_Power_Supervisor.Session.Off => "Off"
        case Protected_Start_Power_Supervisor.Session.Arming => "Arming"
        case Protected_Start_Power_Supervisor.Session.On => "On"
        case Protected_Start_Power_Supervisor.Session.Degraded => "Degraded"
        case Protected_Start_Power_Supervisor.Session.Maintenance => "Maintenance"
      }
      return printObject(ISZ(
        ("type", printString("Protected_Start_Power_Supervisor.Session")),
        ("value", printString(value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSession_Payload(o: Protected_Start_Power_Supervisor.Session_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.Session_Payload""""),
        ("value", printProtected_Start_Power_SupervisorSessionType(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSessionCauseType(o: Protected_Start_Power_Supervisor.SessionCause.Type): ST = {
      val value: String = o match {
        case Protected_Start_Power_Supervisor.SessionCause.CurrentFault => "CurrentFault"
        case Protected_Start_Power_Supervisor.SessionCause.FreshRecoveryAccepted => "FreshRecoveryAccepted"
        case Protected_Start_Power_Supervisor.SessionCause.RecoveryPending => "RecoveryPending"
        case Protected_Start_Power_Supervisor.SessionCause.OffAccepted => "OffAccepted"
        case Protected_Start_Power_Supervisor.SessionCause.MaintenanceAccepted => "MaintenanceAccepted"
        case Protected_Start_Power_Supervisor.SessionCause.StartAccepted => "StartAccepted"
        case Protected_Start_Power_Supervisor.SessionCause.StartRejected => "StartRejected"
        case Protected_Start_Power_Supervisor.SessionCause.EnableCompleted => "EnableCompleted"
        case Protected_Start_Power_Supervisor.SessionCause.EnableAborted => "EnableAborted"
        case Protected_Start_Power_Supervisor.SessionCause.OnSustained => "OnSustained"
        case Protected_Start_Power_Supervisor.SessionCause.ReadinessWithdrawn => "ReadinessWithdrawn"
        case Protected_Start_Power_Supervisor.SessionCause.NoApplicableRequest => "NoApplicableRequest"
      }
      return printObject(ISZ(
        ("type", printString("Protected_Start_Power_Supervisor.SessionCause")),
        ("value", printString(value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSessionCause_Payload(o: Protected_Start_Power_Supervisor.SessionCause_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SessionCause_Payload""""),
        ("value", printProtected_Start_Power_SupervisorSessionCauseType(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorRearmStateType(o: Protected_Start_Power_Supervisor.RearmState.Type): ST = {
      val value: String = o match {
        case Protected_Start_Power_Supervisor.RearmState.Blocked => "Blocked"
        case Protected_Start_Power_Supervisor.RearmState.Confirming => "Confirming"
        case Protected_Start_Power_Supervisor.RearmState.Ready => "Ready"
      }
      return printObject(ISZ(
        ("type", printString("Protected_Start_Power_Supervisor.RearmState")),
        ("value", printString(value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorRearmState_Payload(o: Protected_Start_Power_Supervisor.RearmState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.RearmState_Payload""""),
        ("value", printProtected_Start_Power_SupervisorRearmStateType(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorFuelDispositionType(o: Protected_Start_Power_Supervisor.FuelDisposition.Type): ST = {
      val value: String = o match {
        case Protected_Start_Power_Supervisor.FuelDisposition.Inhibit => "Inhibit"
        case Protected_Start_Power_Supervisor.FuelDisposition.Enable => "Enable"
      }
      return printObject(ISZ(
        ("type", printString("Protected_Start_Power_Supervisor.FuelDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorFuelDisposition_Payload(o: Protected_Start_Power_Supervisor.FuelDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.FuelDisposition_Payload""""),
        ("value", printProtected_Start_Power_SupervisorFuelDispositionType(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorElectricalDispositionType(o: Protected_Start_Power_Supervisor.ElectricalDisposition.Type): ST = {
      val value: String = o match {
        case Protected_Start_Power_Supervisor.ElectricalDisposition.Isolate => "Isolate"
        case Protected_Start_Power_Supervisor.ElectricalDisposition.Provide => "Provide"
      }
      return printObject(ISZ(
        ("type", printString("Protected_Start_Power_Supervisor.ElectricalDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorElectricalDisposition_Payload(o: Protected_Start_Power_Supervisor.ElectricalDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ElectricalDisposition_Payload""""),
        ("value", printProtected_Start_Power_SupervisorElectricalDispositionType(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorParkingBrakeDispositionType(o: Protected_Start_Power_Supervisor.ParkingBrakeDisposition.Type): ST = {
      val value: String = o match {
        case Protected_Start_Power_Supervisor.ParkingBrakeDisposition.Apply => "Apply"
        case Protected_Start_Power_Supervisor.ParkingBrakeDisposition.Release => "Release"
      }
      return printObject(ISZ(
        ("type", printString("Protected_Start_Power_Supervisor.ParkingBrakeDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload(o: Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload""""),
        ("value", printProtected_Start_Power_SupervisorParkingBrakeDispositionType(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorNoticeType(o: Protected_Start_Power_Supervisor.Notice.Type): ST = {
      val value: String = o match {
        case Protected_Start_Power_Supervisor.Notice.FaultAttention => "FaultAttention"
        case Protected_Start_Power_Supervisor.Notice.RecoveryRequired => "RecoveryRequired"
        case Protected_Start_Power_Supervisor.Notice.RecoveryConfirming => "RecoveryConfirming"
        case Protected_Start_Power_Supervisor.Notice.Maintenance => "Maintenance"
        case Protected_Start_Power_Supervisor.Notice.Starting => "Starting"
        case Protected_Start_Power_Supervisor.Notice.Enabled => "Enabled"
        case Protected_Start_Power_Supervisor.Notice.Off => "Off"
      }
      return printObject(ISZ(
        ("type", printString("Protected_Start_Power_Supervisor.Notice")),
        ("value", printString(value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorNotice_Payload(o: Protected_Start_Power_Supervisor.Notice_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.Notice_Payload""""),
        ("value", printProtected_Start_Power_SupervisorNoticeType(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorCommandReport(o: Protected_Start_Power_Supervisor.CommandReport): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.CommandReport""""),
        ("command", printProtected_Start_Power_SupervisorCommandType(o.command)),
        ("status", printProtected_Start_Power_SupervisorValidityType(o.status))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorCommandReport_Payload(o: Protected_Start_Power_Supervisor.CommandReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.CommandReport_Payload""""),
        ("value", printProtected_Start_Power_SupervisorCommandReport(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorQualifiedCommandFacts(o: Protected_Start_Power_Supervisor.QualifiedCommandFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.QualifiedCommandFacts""""),
        ("command", printProtected_Start_Power_SupervisorCommandType(o.command)),
        ("selfTestResetRequested", printB(o.selfTestResetRequested))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload(o: Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload""""),
        ("value", printProtected_Start_Power_SupervisorQualifiedCommandFacts(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorQualifiedPedalFacts(o: Protected_Start_Power_Supervisor.QualifiedPedalFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.QualifiedPedalFacts""""),
        ("pedalStartCondition", printB(o.pedalStartCondition))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload(o: Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload""""),
        ("value", printProtected_Start_Power_SupervisorQualifiedPedalFacts(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorQualifiedSupplyFacts(o: Protected_Start_Power_Supervisor.QualifiedSupplyFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.QualifiedSupplyFacts""""),
        ("supplyUsable", printB(o.supplyUsable))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload(o: Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload""""),
        ("value", printProtected_Start_Power_SupervisorQualifiedSupplyFacts(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(o: Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts""""),
        ("brakeAppliedEvidence", printB(o.brakeAppliedEvidence))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload(o: Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload""""),
        ("value", printProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorStartRestraintFact(o: Protected_Start_Power_Supervisor.StartRestraintFact): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.StartRestraintFact""""),
        ("startRestraintSatisfied", printB(o.startRestraintSatisfied))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorStartRestraintFact_Payload(o: Protected_Start_Power_Supervisor.StartRestraintFact_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.StartRestraintFact_Payload""""),
        ("value", printProtected_Start_Power_SupervisorStartRestraintFact(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorReadinessFacts(o: Protected_Start_Power_Supervisor.ReadinessFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ReadinessFacts""""),
        ("startReady", printB(o.startReady)),
        ("sustainReady", printB(o.sustainReady))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorReadinessFacts_Payload(o: Protected_Start_Power_Supervisor.ReadinessFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ReadinessFacts_Payload""""),
        ("value", printProtected_Start_Power_SupervisorReadinessFacts(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorExactFaultSummary(o: Protected_Start_Power_Supervisor.ExactFaultSummary): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ExactFaultSummary""""),
        ("commandFault", printB(o.commandFault)),
        ("pedalFault", printB(o.pedalFault)),
        ("thermalFault", printB(o.thermalFault)),
        ("supplyFault", printB(o.supplyFault)),
        ("parkingBrakeFault", printB(o.parkingBrakeFault)),
        ("selfTestFault", printB(o.selfTestFault)),
        ("anyFault", printB(o.anyFault))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorExactFaultSummary_Payload(o: Protected_Start_Power_Supervisor.ExactFaultSummary_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ExactFaultSummary_Payload""""),
        ("value", printProtected_Start_Power_SupervisorExactFaultSummary(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorRecoveryPermitFact(o: Protected_Start_Power_Supervisor.RecoveryPermitFact): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.RecoveryPermitFact""""),
        ("recoveryPermit", printB(o.recoveryPermit))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorRecoveryPermitFact_Payload(o: Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload""""),
        ("value", printProtected_Start_Power_SupervisorRecoveryPermitFact(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorBrakePedalReport(o: Protected_Start_Power_Supervisor.BrakePedalReport): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.BrakePedalReport""""),
        ("condition", printProtected_Start_Power_SupervisorPedalConditionType(o.condition)),
        ("status", printProtected_Start_Power_SupervisorValidityType(o.status))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorBrakePedalReport_Payload(o: Protected_Start_Power_Supervisor.BrakePedalReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.BrakePedalReport_Payload""""),
        ("value", printProtected_Start_Power_SupervisorBrakePedalReport(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorTemperatureReport(o: Protected_Start_Power_Supervisor.TemperatureReport): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.TemperatureReport""""),
        ("band", printProtected_Start_Power_SupervisorTemperatureBandType(o.band)),
        ("status", printProtected_Start_Power_SupervisorValidityType(o.status))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorTemperatureReport_Payload(o: Protected_Start_Power_Supervisor.TemperatureReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.TemperatureReport_Payload""""),
        ("value", printProtected_Start_Power_SupervisorTemperatureReport(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorElectricalPowerReport(o: Protected_Start_Power_Supervisor.ElectricalPowerReport): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ElectricalPowerReport""""),
        ("availability", printProtected_Start_Power_SupervisorSupplyAvailabilityType(o.availability)),
        ("status", printProtected_Start_Power_SupervisorValidityType(o.status))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorElectricalPowerReport_Payload(o: Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload""""),
        ("value", printProtected_Start_Power_SupervisorElectricalPowerReport(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorParkingBrakeReport(o: Protected_Start_Power_Supervisor.ParkingBrakeReport): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ParkingBrakeReport""""),
        ("condition", printProtected_Start_Power_SupervisorParkingBrakeConditionType(o.condition)),
        ("status", printProtected_Start_Power_SupervisorValidityType(o.status))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorParkingBrakeReport_Payload(o: Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload""""),
        ("value", printProtected_Start_Power_SupervisorParkingBrakeReport(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorThermalStateFacts(o: Protected_Start_Power_Supervisor.ThermalStateFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ThermalStateFacts""""),
        ("thermalState", printProtected_Start_Power_SupervisorThermalStateType(o.thermalState)),
        ("thermalClear", printB(o.thermalClear))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorThermalStateFacts_Payload(o: Protected_Start_Power_Supervisor.ThermalStateFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ThermalStateFacts_Payload""""),
        ("value", printProtected_Start_Power_SupervisorThermalStateFacts(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSelfTestReport(o: Protected_Start_Power_Supervisor.SelfTestReport): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SelfTestReport""""),
        ("progress", printProtected_Start_Power_SupervisorSelfTestProgressType(o.progress)),
        ("status", printProtected_Start_Power_SupervisorValidityType(o.status))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSelfTestReport_Payload(o: Protected_Start_Power_Supervisor.SelfTestReport_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SelfTestReport_Payload""""),
        ("value", printProtected_Start_Power_SupervisorSelfTestReport(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSelfTestStateFacts(o: Protected_Start_Power_Supervisor.SelfTestStateFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SelfTestStateFacts""""),
        ("selfTestState", printProtected_Start_Power_SupervisorSelfTestStateType(o.selfTestState)),
        ("selfTestPassed", printB(o.selfTestPassed))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSelfTestStateFacts_Payload(o: Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload""""),
        ("value", printProtected_Start_Power_SupervisorSelfTestStateFacts(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSessionDecisionFacts(o: Protected_Start_Power_Supervisor.SessionDecisionFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SessionDecisionFacts""""),
        ("session", printProtected_Start_Power_SupervisorSessionType(o.session)),
        ("cause", printProtected_Start_Power_SupervisorSessionCauseType(o.cause))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSessionDecisionFacts_Payload(o: Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload""""),
        ("value", printProtected_Start_Power_SupervisorSessionDecisionFacts(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorRearmStateFacts(o: Protected_Start_Power_Supervisor.RearmStateFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.RearmStateFacts""""),
        ("rearmState", printProtected_Start_Power_SupervisorRearmStateType(o.rearmState))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorRearmStateFacts_Payload(o: Protected_Start_Power_Supervisor.RearmStateFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.RearmStateFacts_Payload""""),
        ("value", printProtected_Start_Power_SupervisorRearmStateFacts(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorActuationDisposition(o: Protected_Start_Power_Supervisor.ActuationDisposition): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ActuationDisposition""""),
        ("fuel", printProtected_Start_Power_SupervisorFuelDispositionType(o.fuel)),
        ("electricalPower", printProtected_Start_Power_SupervisorElectricalDispositionType(o.electricalPower)),
        ("parkingBrake", printProtected_Start_Power_SupervisorParkingBrakeDispositionType(o.parkingBrake))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorActuationDisposition_Payload(o: Protected_Start_Power_Supervisor.ActuationDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ActuationDisposition_Payload""""),
        ("value", printProtected_Start_Power_SupervisorActuationDisposition(o.value))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSupervisoryStatus(o: Protected_Start_Power_Supervisor.SupervisoryStatus): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SupervisoryStatus""""),
        ("session", printProtected_Start_Power_SupervisorSessionType(o.session)),
        ("startReady", printB(o.startReady)),
        ("sustainReady", printB(o.sustainReady)),
        ("rearmState", printProtected_Start_Power_SupervisorRearmStateType(o.rearmState)),
        ("notice", printProtected_Start_Power_SupervisorNoticeType(o.notice)),
        ("commandFault", printB(o.commandFault)),
        ("pedalFault", printB(o.pedalFault)),
        ("thermalFault", printB(o.thermalFault)),
        ("supplyFault", printB(o.supplyFault)),
        ("parkingBrakeFault", printB(o.parkingBrakeFault)),
        ("selfTestFault", printB(o.selfTestFault)),
        ("anyFault", printB(o.anyFault))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSupervisoryStatus_Payload(o: Protected_Start_Power_Supervisor.SupervisoryStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SupervisoryStatus_Payload""""),
        ("value", printProtected_Start_Power_SupervisorSupervisoryStatus(o.value))
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

    @pure def printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P""""),
        ("api_command_report", printProtected_Start_Power_SupervisorCommandReport(o.api_command_report))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS""""),
        ("api_command_report", printProtected_Start_Power_SupervisorCommandReport(o.api_command_report))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P""""),
        ("api_command_fault", printB(o.api_command_fault)),
        ("api_qualified_command_facts", printProtected_Start_Power_SupervisorQualifiedCommandFacts(o.api_qualified_command_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS""""),
        ("api_command_fault", printB(o.api_command_fault)),
        ("api_qualified_command_facts", printProtected_Start_Power_SupervisorQualifiedCommandFacts(o.api_qualified_command_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P""""),
        ("api_brake_pedal_report", printProtected_Start_Power_SupervisorBrakePedalReport(o.api_brake_pedal_report))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS""""),
        ("api_brake_pedal_report", printProtected_Start_Power_SupervisorBrakePedalReport(o.api_brake_pedal_report))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P""""),
        ("api_pedal_fault", printB(o.api_pedal_fault)),
        ("api_qualified_pedal_facts", printProtected_Start_Power_SupervisorQualifiedPedalFacts(o.api_qualified_pedal_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS""""),
        ("api_pedal_fault", printB(o.api_pedal_fault)),
        ("api_qualified_pedal_facts", printProtected_Start_Power_SupervisorQualifiedPedalFacts(o.api_qualified_pedal_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P""""),
        ("api_temperature_report", printProtected_Start_Power_SupervisorTemperatureReport(o.api_temperature_report))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS""""),
        ("api_temperature_report", printProtected_Start_Power_SupervisorTemperatureReport(o.api_temperature_report))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P""""),
        ("api_qualified_temperature", printProtected_Start_Power_SupervisorQualifiedTemperatureType(o.api_qualified_temperature))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS""""),
        ("api_qualified_temperature", printProtected_Start_Power_SupervisorQualifiedTemperatureType(o.api_qualified_temperature))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P""""),
        ("api_electrical_power_report", printProtected_Start_Power_SupervisorElectricalPowerReport(o.api_electrical_power_report))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS""""),
        ("api_electrical_power_report", printProtected_Start_Power_SupervisorElectricalPowerReport(o.api_electrical_power_report))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P""""),
        ("api_qualified_supply_facts", printProtected_Start_Power_SupervisorQualifiedSupplyFacts(o.api_qualified_supply_facts)),
        ("api_supply_fault", printB(o.api_supply_fault))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS""""),
        ("api_qualified_supply_facts", printProtected_Start_Power_SupervisorQualifiedSupplyFacts(o.api_qualified_supply_facts)),
        ("api_supply_fault", printB(o.api_supply_fault))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P""""),
        ("api_parking_brake_report", printProtected_Start_Power_SupervisorParkingBrakeReport(o.api_parking_brake_report))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS""""),
        ("api_parking_brake_report", printProtected_Start_Power_SupervisorParkingBrakeReport(o.api_parking_brake_report))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P""""),
        ("api_parking_brake_fault", printB(o.api_parking_brake_fault)),
        ("api_qualified_parking_brake_facts", printProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(o.api_qualified_parking_brake_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS""""),
        ("api_parking_brake_fault", printB(o.api_parking_brake_fault)),
        ("api_qualified_parking_brake_facts", printProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(o.api_qualified_parking_brake_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P""""),
        ("api_qualified_temperature", printProtected_Start_Power_SupervisorQualifiedTemperatureType(o.api_qualified_temperature))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS""""),
        ("In_thermalMemory", printProtected_Start_Power_SupervisorThermalStateType(o.In_thermalMemory)),
        ("api_qualified_temperature", printProtected_Start_Power_SupervisorQualifiedTemperatureType(o.api_qualified_temperature))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P""""),
        ("api_thermal_fault", printB(o.api_thermal_fault)),
        ("api_thermal_state_facts", printProtected_Start_Power_SupervisorThermalStateFacts(o.api_thermal_state_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS""""),
        ("thermalMemory", printProtected_Start_Power_SupervisorThermalStateType(o.thermalMemory)),
        ("api_thermal_fault", printB(o.api_thermal_fault)),
        ("api_thermal_state_facts", printProtected_Start_Power_SupervisorThermalStateFacts(o.api_thermal_state_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P""""),
        ("api_qualified_command_facts", printProtected_Start_Power_SupervisorQualifiedCommandFacts(o.api_qualified_command_facts)),
        ("api_self_test_report", printProtected_Start_Power_SupervisorSelfTestReport(o.api_self_test_report))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS""""),
        ("In_selfTestMemory", printProtected_Start_Power_SupervisorSelfTestStateType(o.In_selfTestMemory)),
        ("api_qualified_command_facts", printProtected_Start_Power_SupervisorQualifiedCommandFacts(o.api_qualified_command_facts)),
        ("api_self_test_report", printProtected_Start_Power_SupervisorSelfTestReport(o.api_self_test_report))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P""""),
        ("api_self_test_fault", printB(o.api_self_test_fault)),
        ("api_self_test_state_facts", printProtected_Start_Power_SupervisorSelfTestStateFacts(o.api_self_test_state_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS""""),
        ("selfTestMemory", printProtected_Start_Power_SupervisorSelfTestStateType(o.selfTestMemory)),
        ("api_self_test_fault", printB(o.api_self_test_fault)),
        ("api_self_test_state_facts", printProtected_Start_Power_SupervisorSelfTestStateFacts(o.api_self_test_state_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P""""),
        ("api_qualified_parking_brake_facts", printProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(o.api_qualified_parking_brake_facts)),
        ("api_qualified_pedal_facts", printProtected_Start_Power_SupervisorQualifiedPedalFacts(o.api_qualified_pedal_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS""""),
        ("api_qualified_parking_brake_facts", printProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(o.api_qualified_parking_brake_facts)),
        ("api_qualified_pedal_facts", printProtected_Start_Power_SupervisorQualifiedPedalFacts(o.api_qualified_pedal_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P""""),
        ("api_start_restraint_fact", printProtected_Start_Power_SupervisorStartRestraintFact(o.api_start_restraint_fact))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS""""),
        ("api_start_restraint_fact", printProtected_Start_Power_SupervisorStartRestraintFact(o.api_start_restraint_fact))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P""""),
        ("api_qualified_supply_facts", printProtected_Start_Power_SupervisorQualifiedSupplyFacts(o.api_qualified_supply_facts)),
        ("api_self_test_state_facts", printProtected_Start_Power_SupervisorSelfTestStateFacts(o.api_self_test_state_facts)),
        ("api_start_restraint_fact", printProtected_Start_Power_SupervisorStartRestraintFact(o.api_start_restraint_fact)),
        ("api_thermal_state_facts", printProtected_Start_Power_SupervisorThermalStateFacts(o.api_thermal_state_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS""""),
        ("api_qualified_supply_facts", printProtected_Start_Power_SupervisorQualifiedSupplyFacts(o.api_qualified_supply_facts)),
        ("api_self_test_state_facts", printProtected_Start_Power_SupervisorSelfTestStateFacts(o.api_self_test_state_facts)),
        ("api_start_restraint_fact", printProtected_Start_Power_SupervisorStartRestraintFact(o.api_start_restraint_fact)),
        ("api_thermal_state_facts", printProtected_Start_Power_SupervisorThermalStateFacts(o.api_thermal_state_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P""""),
        ("api_readiness_facts", printProtected_Start_Power_SupervisorReadinessFacts(o.api_readiness_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS""""),
        ("api_readiness_facts", printProtected_Start_Power_SupervisorReadinessFacts(o.api_readiness_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P""""),
        ("api_exact_fault_summary", printProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)),
        ("api_qualified_command_facts", printProtected_Start_Power_SupervisorQualifiedCommandFacts(o.api_qualified_command_facts)),
        ("api_readiness_facts", printProtected_Start_Power_SupervisorReadinessFacts(o.api_readiness_facts)),
        ("api_recovery_permit_fact", printProtected_Start_Power_SupervisorRecoveryPermitFact(o.api_recovery_permit_fact))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS""""),
        ("api_exact_fault_summary", printProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)),
        ("api_qualified_command_facts", printProtected_Start_Power_SupervisorQualifiedCommandFacts(o.api_qualified_command_facts)),
        ("api_readiness_facts", printProtected_Start_Power_SupervisorReadinessFacts(o.api_readiness_facts)),
        ("api_recovery_permit_fact", printProtected_Start_Power_SupervisorRecoveryPermitFact(o.api_recovery_permit_fact))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P""""),
        ("api_session_decision_facts", printProtected_Start_Power_SupervisorSessionDecisionFacts(o.api_session_decision_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS""""),
        ("api_session_decision_facts", printProtected_Start_Power_SupervisorSessionDecisionFacts(o.api_session_decision_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P""""),
        ("api_command_fault", printB(o.api_command_fault)),
        ("api_parking_brake_fault", printB(o.api_parking_brake_fault)),
        ("api_pedal_fault", printB(o.api_pedal_fault)),
        ("api_self_test_fault", printB(o.api_self_test_fault)),
        ("api_supply_fault", printB(o.api_supply_fault)),
        ("api_thermal_fault", printB(o.api_thermal_fault))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS""""),
        ("api_command_fault", printB(o.api_command_fault)),
        ("api_parking_brake_fault", printB(o.api_parking_brake_fault)),
        ("api_pedal_fault", printB(o.api_pedal_fault)),
        ("api_self_test_fault", printB(o.api_self_test_fault)),
        ("api_supply_fault", printB(o.api_supply_fault)),
        ("api_thermal_fault", printB(o.api_thermal_fault))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P""""),
        ("api_exact_fault_summary", printProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS""""),
        ("api_exact_fault_summary", printProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P""""),
        ("api_exact_fault_summary", printProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)),
        ("api_qualified_command_facts", printProtected_Start_Power_SupervisorQualifiedCommandFacts(o.api_qualified_command_facts)),
        ("api_readiness_facts", printProtected_Start_Power_SupervisorReadinessFacts(o.api_readiness_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS""""),
        ("In_rearmMemory", printProtected_Start_Power_SupervisorRearmStateType(o.In_rearmMemory)),
        ("api_exact_fault_summary", printProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)),
        ("api_qualified_command_facts", printProtected_Start_Power_SupervisorQualifiedCommandFacts(o.api_qualified_command_facts)),
        ("api_readiness_facts", printProtected_Start_Power_SupervisorReadinessFacts(o.api_readiness_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P""""),
        ("api_rearm_state_facts", printProtected_Start_Power_SupervisorRearmStateFacts(o.api_rearm_state_facts)),
        ("api_recovery_permit_fact", printProtected_Start_Power_SupervisorRecoveryPermitFact(o.api_recovery_permit_fact))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS""""),
        ("rearmMemory", printProtected_Start_Power_SupervisorRearmStateType(o.rearmMemory)),
        ("api_rearm_state_facts", printProtected_Start_Power_SupervisorRearmStateFacts(o.api_rearm_state_facts)),
        ("api_recovery_permit_fact", printProtected_Start_Power_SupervisorRecoveryPermitFact(o.api_recovery_permit_fact))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P""""),
        ("api_exact_fault_summary", printProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)),
        ("api_session_decision_facts", printProtected_Start_Power_SupervisorSessionDecisionFacts(o.api_session_decision_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS""""),
        ("api_exact_fault_summary", printProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)),
        ("api_session_decision_facts", printProtected_Start_Power_SupervisorSessionDecisionFacts(o.api_session_decision_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P""""),
        ("api_actuation_disposition", printProtected_Start_Power_SupervisorActuationDisposition(o.api_actuation_disposition))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS""""),
        ("api_actuation_disposition", printProtected_Start_Power_SupervisorActuationDisposition(o.api_actuation_disposition))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P""""),
        ("api_exact_fault_summary", printProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)),
        ("api_readiness_facts", printProtected_Start_Power_SupervisorReadinessFacts(o.api_readiness_facts)),
        ("api_rearm_state_facts", printProtected_Start_Power_SupervisorRearmStateFacts(o.api_rearm_state_facts)),
        ("api_session_decision_facts", printProtected_Start_Power_SupervisorSessionDecisionFacts(o.api_session_decision_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS""""),
        ("api_exact_fault_summary", printProtected_Start_Power_SupervisorExactFaultSummary(o.api_exact_fault_summary)),
        ("api_readiness_facts", printProtected_Start_Power_SupervisorReadinessFacts(o.api_readiness_facts)),
        ("api_rearm_state_facts", printProtected_Start_Power_SupervisorRearmStateFacts(o.api_rearm_state_facts)),
        ("api_session_decision_facts", printProtected_Start_Power_SupervisorSessionDecisionFacts(o.api_session_decision_facts))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container): ST = {
      o match {
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(o)
      }
    }

    @pure def printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P""""),
        ("api_supervisory_status", printProtected_Start_Power_SupervisorSupervisoryStatus(o.api_supervisory_status))
      ))
    }

    @pure def printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS""""),
        ("api_supervisory_status", printProtected_Start_Power_SupervisorSupervisoryStatus(o.api_supervisory_status))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_command_qualification_owner_postInit => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_command_qualification_owner_postInit"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_command_qualification_owner_preCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_command_qualification_owner_preCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_command_qualification_owner_postCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_command_qualification_owner_postCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_brake_pedal_qualification_owner_postInit => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_brake_pedal_qualification_owner_postInit"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_brake_pedal_qualification_owner_preCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_brake_pedal_qualification_owner_preCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_brake_pedal_qualification_owner_postCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_brake_pedal_qualification_owner_postCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_temperature_qualification_owner_postInit => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_temperature_qualification_owner_postInit"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_temperature_qualification_owner_preCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_temperature_qualification_owner_preCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_temperature_qualification_owner_postCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_temperature_qualification_owner_postCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_electrical_supply_qualification_owner_postInit => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_electrical_supply_qualification_owner_postInit"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_electrical_supply_qualification_owner_preCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_electrical_supply_qualification_owner_preCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_electrical_supply_qualification_owner_postCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_electrical_supply_qualification_owner_postCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_parking_brake_qualification_owner_postInit => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_parking_brake_qualification_owner_postInit"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_parking_brake_qualification_owner_preCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_parking_brake_qualification_owner_preCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_parking_brake_qualification_owner_postCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_parking_brake_qualification_owner_postCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_thermal_clearance_state_owner_postInit => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_thermal_clearance_state_owner_postInit"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_thermal_clearance_state_owner_preCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_thermal_clearance_state_owner_preCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_thermal_clearance_state_owner_postCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_thermal_clearance_state_owner_postCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_self_test_campaign_state_owner_postInit => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_self_test_campaign_state_owner_postInit"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_self_test_campaign_state_owner_preCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_self_test_campaign_state_owner_preCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_self_test_campaign_state_owner_postCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_self_test_campaign_state_owner_postCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_start_restraint_decision_owner_postInit => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_start_restraint_decision_owner_postInit"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_start_restraint_decision_owner_preCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_start_restraint_decision_owner_preCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_start_restraint_decision_owner_postCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_start_restraint_decision_owner_postCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_readiness_composition_owner_postInit => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_readiness_composition_owner_postInit"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_readiness_composition_owner_preCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_readiness_composition_owner_preCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_readiness_composition_owner_postCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_readiness_composition_owner_postCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_operating_session_state_priority_owner_postInit => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_operating_session_state_priority_owner_postInit"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_operating_session_state_priority_owner_preCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_operating_session_state_priority_owner_preCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_operating_session_state_priority_owner_postCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_operating_session_state_priority_owner_postCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_fault_vector_composition_owner_postInit => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_fault_vector_composition_owner_postInit"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_fault_vector_composition_owner_preCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_fault_vector_composition_owner_preCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_fault_vector_composition_owner_postCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_fault_vector_composition_owner_postCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_rearm_qualification_state_owner_postInit => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_rearm_qualification_state_owner_postInit"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_rearm_qualification_state_owner_preCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_rearm_qualification_state_owner_preCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_rearm_qualification_state_owner_postCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_rearm_qualification_state_owner_postCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_actuation_composition_owner_postInit => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_actuation_composition_owner_postInit"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_actuation_composition_owner_preCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_actuation_composition_owner_preCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_actuation_composition_owner_postCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_actuation_composition_owner_postCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_supervisory_status_notice_owner_postInit => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_supervisory_status_notice_owner_postInit"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_supervisory_status_notice_owner_preCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_supervisory_status_notice_owner_preCompute"
        case runtimemonitor.ObservationKind.ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_supervisory_status_notice_owner_postCompute => "ProtectedStartPowerSupervisorSystem_Instance_protected_start_power_process_supervisory_status_notice_owner_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(o)
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
        case o: Protected_Start_Power_Supervisor.Notice_Payload => return printProtected_Start_Power_SupervisorNotice_Payload(o)
        case o: Protected_Start_Power_Supervisor.Session_Payload => return printProtected_Start_Power_SupervisorSession_Payload(o)
        case o: Protected_Start_Power_Supervisor.Command_Payload => return printProtected_Start_Power_SupervisorCommand_Payload(o)
        case o: Protected_Start_Power_Supervisor.Validity_Payload => return printProtected_Start_Power_SupervisorValidity_Payload(o)
        case o: Protected_Start_Power_Supervisor.RearmState_Payload => return printProtected_Start_Power_SupervisorRearmState_Payload(o)
        case o: Protected_Start_Power_Supervisor.ThermalState_Payload => return printProtected_Start_Power_SupervisorThermalState_Payload(o)
        case o: Protected_Start_Power_Supervisor.SessionCause_Payload => return printProtected_Start_Power_SupervisorSessionCause_Payload(o)
        case o: Protected_Start_Power_Supervisor.SelfTestState_Payload => return printProtected_Start_Power_SupervisorSelfTestState_Payload(o)
        case o: Protected_Start_Power_Supervisor.CommandReport_Payload => return printProtected_Start_Power_SupervisorCommandReport_Payload(o)
        case o: Protected_Start_Power_Supervisor.PedalCondition_Payload => return printProtected_Start_Power_SupervisorPedalCondition_Payload(o)
        case o: Protected_Start_Power_Supervisor.ReadinessFacts_Payload => return printProtected_Start_Power_SupervisorReadinessFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.SelfTestReport_Payload => return printProtected_Start_Power_SupervisorSelfTestReport_Payload(o)
        case o: Protected_Start_Power_Supervisor.FuelDisposition_Payload => return printProtected_Start_Power_SupervisorFuelDisposition_Payload(o)
        case o: Protected_Start_Power_Supervisor.TemperatureBand_Payload => return printProtected_Start_Power_SupervisorTemperatureBand_Payload(o)
        case o: Protected_Start_Power_Supervisor.RearmStateFacts_Payload => return printProtected_Start_Power_SupervisorRearmStateFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.SelfTestProgress_Payload => return printProtected_Start_Power_SupervisorSelfTestProgress_Payload(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalReport_Payload => return printProtected_Start_Power_SupervisorBrakePedalReport_Payload(o)
        case o: Protected_Start_Power_Supervisor.ThermalStateFacts_Payload => return printProtected_Start_Power_SupervisorThermalStateFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.TemperatureReport_Payload => return printProtected_Start_Power_SupervisorTemperatureReport_Payload(o)
        case o: Protected_Start_Power_Supervisor.ExactFaultSummary_Payload => return printProtected_Start_Power_SupervisorExactFaultSummary_Payload(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatus_Payload => return printProtected_Start_Power_SupervisorSupervisoryStatus_Payload(o)
        case o: Protected_Start_Power_Supervisor.SupplyAvailability_Payload => return printProtected_Start_Power_SupervisorSupplyAvailability_Payload(o)
        case o: Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload => return printProtected_Start_Power_SupervisorRecoveryPermitFact_Payload(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintFact_Payload => return printProtected_Start_Power_SupervisorStartRestraintFact_Payload(o)
        case o: Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload => return printProtected_Start_Power_SupervisorSelfTestStateFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload => return printProtected_Start_Power_SupervisorParkingBrakeReport_Payload(o)
        case o: Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload => return printProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.QualifiedTemperature_Payload => return printProtected_Start_Power_SupervisorQualifiedTemperature_Payload(o)
        case o: Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload => return printProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload => return printProtected_Start_Power_SupervisorSessionDecisionFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.ActuationDisposition_Payload => return printProtected_Start_Power_SupervisorActuationDisposition_Payload(o)
        case o: Protected_Start_Power_Supervisor.ElectricalDisposition_Payload => return printProtected_Start_Power_SupervisorElectricalDisposition_Payload(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload => return printProtected_Start_Power_SupervisorParkingBrakeCondition_Payload(o)
        case o: Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload => return printProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload => return printProtected_Start_Power_SupervisorElectricalPowerReport_Payload(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload => return printProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload(o)
        case o: Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload => return printProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P => return printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS => return printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P => return printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(o)
        case o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS => return printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(o)
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

    def parseProtected_Start_Power_SupervisorCommandType(): Protected_Start_Power_Supervisor.Command.Type = {
      val r = parseProtected_Start_Power_SupervisorCommandT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorCommandT(typeParsed: B): Protected_Start_Power_Supervisor.Command.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.Command")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Protected_Start_Power_Supervisor.Command.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Protected_Start_Power_Supervisor.Command.")
          return Protected_Start_Power_Supervisor.Command.byOrdinal(0).get
      }
    }

    def parseProtected_Start_Power_SupervisorCommand_Payload(): Protected_Start_Power_Supervisor.Command_Payload = {
      val r = parseProtected_Start_Power_SupervisorCommand_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorCommand_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.Command_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.Command_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorCommandType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.Command_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorValidityType(): Protected_Start_Power_Supervisor.Validity.Type = {
      val r = parseProtected_Start_Power_SupervisorValidityT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorValidityT(typeParsed: B): Protected_Start_Power_Supervisor.Validity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.Validity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Protected_Start_Power_Supervisor.Validity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Protected_Start_Power_Supervisor.Validity.")
          return Protected_Start_Power_Supervisor.Validity.byOrdinal(0).get
      }
    }

    def parseProtected_Start_Power_SupervisorValidity_Payload(): Protected_Start_Power_Supervisor.Validity_Payload = {
      val r = parseProtected_Start_Power_SupervisorValidity_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorValidity_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.Validity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.Validity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorValidityType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.Validity_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorPedalConditionType(): Protected_Start_Power_Supervisor.PedalCondition.Type = {
      val r = parseProtected_Start_Power_SupervisorPedalConditionT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorPedalConditionT(typeParsed: B): Protected_Start_Power_Supervisor.PedalCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.PedalCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Protected_Start_Power_Supervisor.PedalCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Protected_Start_Power_Supervisor.PedalCondition.")
          return Protected_Start_Power_Supervisor.PedalCondition.byOrdinal(0).get
      }
    }

    def parseProtected_Start_Power_SupervisorPedalCondition_Payload(): Protected_Start_Power_Supervisor.PedalCondition_Payload = {
      val r = parseProtected_Start_Power_SupervisorPedalCondition_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorPedalCondition_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.PedalCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.PedalCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorPedalConditionType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.PedalCondition_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorTemperatureBandType(): Protected_Start_Power_Supervisor.TemperatureBand.Type = {
      val r = parseProtected_Start_Power_SupervisorTemperatureBandT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorTemperatureBandT(typeParsed: B): Protected_Start_Power_Supervisor.TemperatureBand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.TemperatureBand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Protected_Start_Power_Supervisor.TemperatureBand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Protected_Start_Power_Supervisor.TemperatureBand.")
          return Protected_Start_Power_Supervisor.TemperatureBand.byOrdinal(0).get
      }
    }

    def parseProtected_Start_Power_SupervisorTemperatureBand_Payload(): Protected_Start_Power_Supervisor.TemperatureBand_Payload = {
      val r = parseProtected_Start_Power_SupervisorTemperatureBand_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorTemperatureBand_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.TemperatureBand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.TemperatureBand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorTemperatureBandType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.TemperatureBand_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorQualifiedTemperatureType(): Protected_Start_Power_Supervisor.QualifiedTemperature.Type = {
      val r = parseProtected_Start_Power_SupervisorQualifiedTemperatureT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorQualifiedTemperatureT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedTemperature.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.QualifiedTemperature")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Protected_Start_Power_Supervisor.QualifiedTemperature.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Protected_Start_Power_Supervisor.QualifiedTemperature.")
          return Protected_Start_Power_Supervisor.QualifiedTemperature.byOrdinal(0).get
      }
    }

    def parseProtected_Start_Power_SupervisorQualifiedTemperature_Payload(): Protected_Start_Power_Supervisor.QualifiedTemperature_Payload = {
      val r = parseProtected_Start_Power_SupervisorQualifiedTemperature_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorQualifiedTemperature_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedTemperature_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.QualifiedTemperature_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorQualifiedTemperatureType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.QualifiedTemperature_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorSupplyAvailabilityType(): Protected_Start_Power_Supervisor.SupplyAvailability.Type = {
      val r = parseProtected_Start_Power_SupervisorSupplyAvailabilityT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSupplyAvailabilityT(typeParsed: B): Protected_Start_Power_Supervisor.SupplyAvailability.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SupplyAvailability")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Protected_Start_Power_Supervisor.SupplyAvailability.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Protected_Start_Power_Supervisor.SupplyAvailability.")
          return Protected_Start_Power_Supervisor.SupplyAvailability.byOrdinal(0).get
      }
    }

    def parseProtected_Start_Power_SupervisorSupplyAvailability_Payload(): Protected_Start_Power_Supervisor.SupplyAvailability_Payload = {
      val r = parseProtected_Start_Power_SupervisorSupplyAvailability_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSupplyAvailability_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.SupplyAvailability_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SupplyAvailability_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorSupplyAvailabilityType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SupplyAvailability_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeConditionType(): Protected_Start_Power_Supervisor.ParkingBrakeCondition.Type = {
      val r = parseProtected_Start_Power_SupervisorParkingBrakeConditionT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeConditionT(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ParkingBrakeCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Protected_Start_Power_Supervisor.ParkingBrakeCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Protected_Start_Power_Supervisor.ParkingBrakeCondition.")
          return Protected_Start_Power_Supervisor.ParkingBrakeCondition.byOrdinal(0).get
      }
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeCondition_Payload(): Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload = {
      val r = parseProtected_Start_Power_SupervisorParkingBrakeCondition_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeCondition_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorParkingBrakeConditionType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorThermalStateType(): Protected_Start_Power_Supervisor.ThermalState.Type = {
      val r = parseProtected_Start_Power_SupervisorThermalStateT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorThermalStateT(typeParsed: B): Protected_Start_Power_Supervisor.ThermalState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ThermalState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Protected_Start_Power_Supervisor.ThermalState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Protected_Start_Power_Supervisor.ThermalState.")
          return Protected_Start_Power_Supervisor.ThermalState.byOrdinal(0).get
      }
    }

    def parseProtected_Start_Power_SupervisorThermalState_Payload(): Protected_Start_Power_Supervisor.ThermalState_Payload = {
      val r = parseProtected_Start_Power_SupervisorThermalState_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorThermalState_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ThermalState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ThermalState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorThermalStateType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ThermalState_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorSelfTestProgressType(): Protected_Start_Power_Supervisor.SelfTestProgress.Type = {
      val r = parseProtected_Start_Power_SupervisorSelfTestProgressT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSelfTestProgressT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestProgress.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SelfTestProgress")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Protected_Start_Power_Supervisor.SelfTestProgress.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Protected_Start_Power_Supervisor.SelfTestProgress.")
          return Protected_Start_Power_Supervisor.SelfTestProgress.byOrdinal(0).get
      }
    }

    def parseProtected_Start_Power_SupervisorSelfTestProgress_Payload(): Protected_Start_Power_Supervisor.SelfTestProgress_Payload = {
      val r = parseProtected_Start_Power_SupervisorSelfTestProgress_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSelfTestProgress_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestProgress_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SelfTestProgress_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorSelfTestProgressType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SelfTestProgress_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorSelfTestStateType(): Protected_Start_Power_Supervisor.SelfTestState.Type = {
      val r = parseProtected_Start_Power_SupervisorSelfTestStateT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSelfTestStateT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SelfTestState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Protected_Start_Power_Supervisor.SelfTestState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Protected_Start_Power_Supervisor.SelfTestState.")
          return Protected_Start_Power_Supervisor.SelfTestState.byOrdinal(0).get
      }
    }

    def parseProtected_Start_Power_SupervisorSelfTestState_Payload(): Protected_Start_Power_Supervisor.SelfTestState_Payload = {
      val r = parseProtected_Start_Power_SupervisorSelfTestState_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSelfTestState_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SelfTestState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorSelfTestStateType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SelfTestState_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorSessionType(): Protected_Start_Power_Supervisor.Session.Type = {
      val r = parseProtected_Start_Power_SupervisorSessionT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSessionT(typeParsed: B): Protected_Start_Power_Supervisor.Session.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.Session")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Protected_Start_Power_Supervisor.Session.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Protected_Start_Power_Supervisor.Session.")
          return Protected_Start_Power_Supervisor.Session.byOrdinal(0).get
      }
    }

    def parseProtected_Start_Power_SupervisorSession_Payload(): Protected_Start_Power_Supervisor.Session_Payload = {
      val r = parseProtected_Start_Power_SupervisorSession_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSession_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.Session_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.Session_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorSessionType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.Session_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorSessionCauseType(): Protected_Start_Power_Supervisor.SessionCause.Type = {
      val r = parseProtected_Start_Power_SupervisorSessionCauseT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSessionCauseT(typeParsed: B): Protected_Start_Power_Supervisor.SessionCause.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SessionCause")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Protected_Start_Power_Supervisor.SessionCause.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Protected_Start_Power_Supervisor.SessionCause.")
          return Protected_Start_Power_Supervisor.SessionCause.byOrdinal(0).get
      }
    }

    def parseProtected_Start_Power_SupervisorSessionCause_Payload(): Protected_Start_Power_Supervisor.SessionCause_Payload = {
      val r = parseProtected_Start_Power_SupervisorSessionCause_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSessionCause_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.SessionCause_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SessionCause_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorSessionCauseType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SessionCause_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorRearmStateType(): Protected_Start_Power_Supervisor.RearmState.Type = {
      val r = parseProtected_Start_Power_SupervisorRearmStateT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorRearmStateT(typeParsed: B): Protected_Start_Power_Supervisor.RearmState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.RearmState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Protected_Start_Power_Supervisor.RearmState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Protected_Start_Power_Supervisor.RearmState.")
          return Protected_Start_Power_Supervisor.RearmState.byOrdinal(0).get
      }
    }

    def parseProtected_Start_Power_SupervisorRearmState_Payload(): Protected_Start_Power_Supervisor.RearmState_Payload = {
      val r = parseProtected_Start_Power_SupervisorRearmState_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorRearmState_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.RearmState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.RearmState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorRearmStateType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.RearmState_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorFuelDispositionType(): Protected_Start_Power_Supervisor.FuelDisposition.Type = {
      val r = parseProtected_Start_Power_SupervisorFuelDispositionT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorFuelDispositionT(typeParsed: B): Protected_Start_Power_Supervisor.FuelDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.FuelDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Protected_Start_Power_Supervisor.FuelDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Protected_Start_Power_Supervisor.FuelDisposition.")
          return Protected_Start_Power_Supervisor.FuelDisposition.byOrdinal(0).get
      }
    }

    def parseProtected_Start_Power_SupervisorFuelDisposition_Payload(): Protected_Start_Power_Supervisor.FuelDisposition_Payload = {
      val r = parseProtected_Start_Power_SupervisorFuelDisposition_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorFuelDisposition_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.FuelDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.FuelDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorFuelDispositionType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.FuelDisposition_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorElectricalDispositionType(): Protected_Start_Power_Supervisor.ElectricalDisposition.Type = {
      val r = parseProtected_Start_Power_SupervisorElectricalDispositionT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorElectricalDispositionT(typeParsed: B): Protected_Start_Power_Supervisor.ElectricalDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ElectricalDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Protected_Start_Power_Supervisor.ElectricalDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Protected_Start_Power_Supervisor.ElectricalDisposition.")
          return Protected_Start_Power_Supervisor.ElectricalDisposition.byOrdinal(0).get
      }
    }

    def parseProtected_Start_Power_SupervisorElectricalDisposition_Payload(): Protected_Start_Power_Supervisor.ElectricalDisposition_Payload = {
      val r = parseProtected_Start_Power_SupervisorElectricalDisposition_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorElectricalDisposition_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ElectricalDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ElectricalDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorElectricalDispositionType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ElectricalDisposition_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeDispositionType(): Protected_Start_Power_Supervisor.ParkingBrakeDisposition.Type = {
      val r = parseProtected_Start_Power_SupervisorParkingBrakeDispositionT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeDispositionT(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ParkingBrakeDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Protected_Start_Power_Supervisor.ParkingBrakeDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Protected_Start_Power_Supervisor.ParkingBrakeDisposition.")
          return Protected_Start_Power_Supervisor.ParkingBrakeDisposition.byOrdinal(0).get
      }
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload(): Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload = {
      val r = parseProtected_Start_Power_SupervisorParkingBrakeDisposition_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeDisposition_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorParkingBrakeDispositionType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorNoticeType(): Protected_Start_Power_Supervisor.Notice.Type = {
      val r = parseProtected_Start_Power_SupervisorNoticeT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorNoticeT(typeParsed: B): Protected_Start_Power_Supervisor.Notice.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.Notice")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Protected_Start_Power_Supervisor.Notice.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Protected_Start_Power_Supervisor.Notice.")
          return Protected_Start_Power_Supervisor.Notice.byOrdinal(0).get
      }
    }

    def parseProtected_Start_Power_SupervisorNotice_Payload(): Protected_Start_Power_Supervisor.Notice_Payload = {
      val r = parseProtected_Start_Power_SupervisorNotice_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorNotice_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.Notice_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.Notice_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorNoticeType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.Notice_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorCommandReport(): Protected_Start_Power_Supervisor.CommandReport = {
      val r = parseProtected_Start_Power_SupervisorCommandReportT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorCommandReportT(typeParsed: B): Protected_Start_Power_Supervisor.CommandReport = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.CommandReport")
      }
      parser.parseObjectKey("command")
      val command = parseProtected_Start_Power_SupervisorCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseProtected_Start_Power_SupervisorValidityType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.CommandReport(command, status)
    }

    def parseProtected_Start_Power_SupervisorCommandReport_Payload(): Protected_Start_Power_Supervisor.CommandReport_Payload = {
      val r = parseProtected_Start_Power_SupervisorCommandReport_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorCommandReport_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.CommandReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.CommandReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorCommandReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.CommandReport_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorQualifiedCommandFacts(): Protected_Start_Power_Supervisor.QualifiedCommandFacts = {
      val r = parseProtected_Start_Power_SupervisorQualifiedCommandFactsT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorQualifiedCommandFactsT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedCommandFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.QualifiedCommandFacts")
      }
      parser.parseObjectKey("command")
      val command = parseProtected_Start_Power_SupervisorCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("selfTestResetRequested")
      val selfTestResetRequested = parser.parseB()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.QualifiedCommandFacts(command, selfTestResetRequested)
    }

    def parseProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload(): Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload = {
      val r = parseProtected_Start_Power_SupervisorQualifiedCommandFacts_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorQualifiedCommandFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorQualifiedCommandFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorQualifiedPedalFacts(): Protected_Start_Power_Supervisor.QualifiedPedalFacts = {
      val r = parseProtected_Start_Power_SupervisorQualifiedPedalFactsT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorQualifiedPedalFactsT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedPedalFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.QualifiedPedalFacts")
      }
      parser.parseObjectKey("pedalStartCondition")
      val pedalStartCondition = parser.parseB()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.QualifiedPedalFacts(pedalStartCondition)
    }

    def parseProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload(): Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload = {
      val r = parseProtected_Start_Power_SupervisorQualifiedPedalFacts_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorQualifiedPedalFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorQualifiedPedalFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorQualifiedSupplyFacts(): Protected_Start_Power_Supervisor.QualifiedSupplyFacts = {
      val r = parseProtected_Start_Power_SupervisorQualifiedSupplyFactsT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorQualifiedSupplyFactsT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedSupplyFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.QualifiedSupplyFacts")
      }
      parser.parseObjectKey("supplyUsable")
      val supplyUsable = parser.parseB()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.QualifiedSupplyFacts(supplyUsable)
    }

    def parseProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload(): Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload = {
      val r = parseProtected_Start_Power_SupervisorQualifiedSupplyFacts_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorQualifiedSupplyFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorQualifiedSupplyFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(): Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts = {
      val r = parseProtected_Start_Power_SupervisorQualifiedParkingBrakeFactsT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorQualifiedParkingBrakeFactsT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts")
      }
      parser.parseObjectKey("brakeAppliedEvidence")
      val brakeAppliedEvidence = parser.parseB()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts(brakeAppliedEvidence)
    }

    def parseProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload(): Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload = {
      val r = parseProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorStartRestraintFact(): Protected_Start_Power_Supervisor.StartRestraintFact = {
      val r = parseProtected_Start_Power_SupervisorStartRestraintFactT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorStartRestraintFactT(typeParsed: B): Protected_Start_Power_Supervisor.StartRestraintFact = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.StartRestraintFact")
      }
      parser.parseObjectKey("startRestraintSatisfied")
      val startRestraintSatisfied = parser.parseB()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.StartRestraintFact(startRestraintSatisfied)
    }

    def parseProtected_Start_Power_SupervisorStartRestraintFact_Payload(): Protected_Start_Power_Supervisor.StartRestraintFact_Payload = {
      val r = parseProtected_Start_Power_SupervisorStartRestraintFact_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorStartRestraintFact_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.StartRestraintFact_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.StartRestraintFact_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorStartRestraintFact()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.StartRestraintFact_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorReadinessFacts(): Protected_Start_Power_Supervisor.ReadinessFacts = {
      val r = parseProtected_Start_Power_SupervisorReadinessFactsT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorReadinessFactsT(typeParsed: B): Protected_Start_Power_Supervisor.ReadinessFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ReadinessFacts")
      }
      parser.parseObjectKey("startReady")
      val startReady = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("sustainReady")
      val sustainReady = parser.parseB()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ReadinessFacts(startReady, sustainReady)
    }

    def parseProtected_Start_Power_SupervisorReadinessFacts_Payload(): Protected_Start_Power_Supervisor.ReadinessFacts_Payload = {
      val r = parseProtected_Start_Power_SupervisorReadinessFacts_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorReadinessFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ReadinessFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ReadinessFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorReadinessFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ReadinessFacts_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorExactFaultSummary(): Protected_Start_Power_Supervisor.ExactFaultSummary = {
      val r = parseProtected_Start_Power_SupervisorExactFaultSummaryT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorExactFaultSummaryT(typeParsed: B): Protected_Start_Power_Supervisor.ExactFaultSummary = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ExactFaultSummary")
      }
      parser.parseObjectKey("commandFault")
      val commandFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("pedalFault")
      val pedalFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("thermalFault")
      val thermalFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("supplyFault")
      val supplyFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("parkingBrakeFault")
      val parkingBrakeFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("selfTestFault")
      val selfTestFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("anyFault")
      val anyFault = parser.parseB()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ExactFaultSummary(commandFault, pedalFault, thermalFault, supplyFault, parkingBrakeFault, selfTestFault, anyFault)
    }

    def parseProtected_Start_Power_SupervisorExactFaultSummary_Payload(): Protected_Start_Power_Supervisor.ExactFaultSummary_Payload = {
      val r = parseProtected_Start_Power_SupervisorExactFaultSummary_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorExactFaultSummary_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ExactFaultSummary_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ExactFaultSummary_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorExactFaultSummary()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ExactFaultSummary_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorRecoveryPermitFact(): Protected_Start_Power_Supervisor.RecoveryPermitFact = {
      val r = parseProtected_Start_Power_SupervisorRecoveryPermitFactT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorRecoveryPermitFactT(typeParsed: B): Protected_Start_Power_Supervisor.RecoveryPermitFact = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.RecoveryPermitFact")
      }
      parser.parseObjectKey("recoveryPermit")
      val recoveryPermit = parser.parseB()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.RecoveryPermitFact(recoveryPermit)
    }

    def parseProtected_Start_Power_SupervisorRecoveryPermitFact_Payload(): Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload = {
      val r = parseProtected_Start_Power_SupervisorRecoveryPermitFact_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorRecoveryPermitFact_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorRecoveryPermitFact()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorBrakePedalReport(): Protected_Start_Power_Supervisor.BrakePedalReport = {
      val r = parseProtected_Start_Power_SupervisorBrakePedalReportT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorBrakePedalReportT(typeParsed: B): Protected_Start_Power_Supervisor.BrakePedalReport = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.BrakePedalReport")
      }
      parser.parseObjectKey("condition")
      val condition = parseProtected_Start_Power_SupervisorPedalConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseProtected_Start_Power_SupervisorValidityType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.BrakePedalReport(condition, status)
    }

    def parseProtected_Start_Power_SupervisorBrakePedalReport_Payload(): Protected_Start_Power_Supervisor.BrakePedalReport_Payload = {
      val r = parseProtected_Start_Power_SupervisorBrakePedalReport_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorBrakePedalReport_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.BrakePedalReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.BrakePedalReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorBrakePedalReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.BrakePedalReport_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorTemperatureReport(): Protected_Start_Power_Supervisor.TemperatureReport = {
      val r = parseProtected_Start_Power_SupervisorTemperatureReportT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorTemperatureReportT(typeParsed: B): Protected_Start_Power_Supervisor.TemperatureReport = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.TemperatureReport")
      }
      parser.parseObjectKey("band")
      val band = parseProtected_Start_Power_SupervisorTemperatureBandType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseProtected_Start_Power_SupervisorValidityType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.TemperatureReport(band, status)
    }

    def parseProtected_Start_Power_SupervisorTemperatureReport_Payload(): Protected_Start_Power_Supervisor.TemperatureReport_Payload = {
      val r = parseProtected_Start_Power_SupervisorTemperatureReport_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorTemperatureReport_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.TemperatureReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.TemperatureReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorTemperatureReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.TemperatureReport_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorElectricalPowerReport(): Protected_Start_Power_Supervisor.ElectricalPowerReport = {
      val r = parseProtected_Start_Power_SupervisorElectricalPowerReportT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorElectricalPowerReportT(typeParsed: B): Protected_Start_Power_Supervisor.ElectricalPowerReport = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ElectricalPowerReport")
      }
      parser.parseObjectKey("availability")
      val availability = parseProtected_Start_Power_SupervisorSupplyAvailabilityType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseProtected_Start_Power_SupervisorValidityType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ElectricalPowerReport(availability, status)
    }

    def parseProtected_Start_Power_SupervisorElectricalPowerReport_Payload(): Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload = {
      val r = parseProtected_Start_Power_SupervisorElectricalPowerReport_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorElectricalPowerReport_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorElectricalPowerReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeReport(): Protected_Start_Power_Supervisor.ParkingBrakeReport = {
      val r = parseProtected_Start_Power_SupervisorParkingBrakeReportT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeReportT(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeReport = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ParkingBrakeReport")
      }
      parser.parseObjectKey("condition")
      val condition = parseProtected_Start_Power_SupervisorParkingBrakeConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseProtected_Start_Power_SupervisorValidityType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ParkingBrakeReport(condition, status)
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeReport_Payload(): Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload = {
      val r = parseProtected_Start_Power_SupervisorParkingBrakeReport_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeReport_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorParkingBrakeReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorThermalStateFacts(): Protected_Start_Power_Supervisor.ThermalStateFacts = {
      val r = parseProtected_Start_Power_SupervisorThermalStateFactsT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorThermalStateFactsT(typeParsed: B): Protected_Start_Power_Supervisor.ThermalStateFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ThermalStateFacts")
      }
      parser.parseObjectKey("thermalState")
      val thermalState = parseProtected_Start_Power_SupervisorThermalStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("thermalClear")
      val thermalClear = parser.parseB()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ThermalStateFacts(thermalState, thermalClear)
    }

    def parseProtected_Start_Power_SupervisorThermalStateFacts_Payload(): Protected_Start_Power_Supervisor.ThermalStateFacts_Payload = {
      val r = parseProtected_Start_Power_SupervisorThermalStateFacts_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorThermalStateFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ThermalStateFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ThermalStateFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorThermalStateFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ThermalStateFacts_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorSelfTestReport(): Protected_Start_Power_Supervisor.SelfTestReport = {
      val r = parseProtected_Start_Power_SupervisorSelfTestReportT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSelfTestReportT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestReport = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SelfTestReport")
      }
      parser.parseObjectKey("progress")
      val progress = parseProtected_Start_Power_SupervisorSelfTestProgressType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseProtected_Start_Power_SupervisorValidityType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SelfTestReport(progress, status)
    }

    def parseProtected_Start_Power_SupervisorSelfTestReport_Payload(): Protected_Start_Power_Supervisor.SelfTestReport_Payload = {
      val r = parseProtected_Start_Power_SupervisorSelfTestReport_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSelfTestReport_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestReport_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SelfTestReport_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorSelfTestReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SelfTestReport_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorSelfTestStateFacts(): Protected_Start_Power_Supervisor.SelfTestStateFacts = {
      val r = parseProtected_Start_Power_SupervisorSelfTestStateFactsT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSelfTestStateFactsT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestStateFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SelfTestStateFacts")
      }
      parser.parseObjectKey("selfTestState")
      val selfTestState = parseProtected_Start_Power_SupervisorSelfTestStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("selfTestPassed")
      val selfTestPassed = parser.parseB()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SelfTestStateFacts(selfTestState, selfTestPassed)
    }

    def parseProtected_Start_Power_SupervisorSelfTestStateFacts_Payload(): Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload = {
      val r = parseProtected_Start_Power_SupervisorSelfTestStateFacts_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSelfTestStateFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorSelfTestStateFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorSessionDecisionFacts(): Protected_Start_Power_Supervisor.SessionDecisionFacts = {
      val r = parseProtected_Start_Power_SupervisorSessionDecisionFactsT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSessionDecisionFactsT(typeParsed: B): Protected_Start_Power_Supervisor.SessionDecisionFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SessionDecisionFacts")
      }
      parser.parseObjectKey("session")
      val session = parseProtected_Start_Power_SupervisorSessionType()
      parser.parseObjectNext()
      parser.parseObjectKey("cause")
      val cause = parseProtected_Start_Power_SupervisorSessionCauseType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SessionDecisionFacts(session, cause)
    }

    def parseProtected_Start_Power_SupervisorSessionDecisionFacts_Payload(): Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload = {
      val r = parseProtected_Start_Power_SupervisorSessionDecisionFacts_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSessionDecisionFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorSessionDecisionFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorRearmStateFacts(): Protected_Start_Power_Supervisor.RearmStateFacts = {
      val r = parseProtected_Start_Power_SupervisorRearmStateFactsT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorRearmStateFactsT(typeParsed: B): Protected_Start_Power_Supervisor.RearmStateFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.RearmStateFacts")
      }
      parser.parseObjectKey("rearmState")
      val rearmState = parseProtected_Start_Power_SupervisorRearmStateType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.RearmStateFacts(rearmState)
    }

    def parseProtected_Start_Power_SupervisorRearmStateFacts_Payload(): Protected_Start_Power_Supervisor.RearmStateFacts_Payload = {
      val r = parseProtected_Start_Power_SupervisorRearmStateFacts_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorRearmStateFacts_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.RearmStateFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.RearmStateFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorRearmStateFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.RearmStateFacts_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorActuationDisposition(): Protected_Start_Power_Supervisor.ActuationDisposition = {
      val r = parseProtected_Start_Power_SupervisorActuationDispositionT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorActuationDispositionT(typeParsed: B): Protected_Start_Power_Supervisor.ActuationDisposition = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ActuationDisposition")
      }
      parser.parseObjectKey("fuel")
      val fuel = parseProtected_Start_Power_SupervisorFuelDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("electricalPower")
      val electricalPower = parseProtected_Start_Power_SupervisorElectricalDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("parkingBrake")
      val parkingBrake = parseProtected_Start_Power_SupervisorParkingBrakeDispositionType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ActuationDisposition(fuel, electricalPower, parkingBrake)
    }

    def parseProtected_Start_Power_SupervisorActuationDisposition_Payload(): Protected_Start_Power_Supervisor.ActuationDisposition_Payload = {
      val r = parseProtected_Start_Power_SupervisorActuationDisposition_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorActuationDisposition_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.ActuationDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ActuationDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorActuationDisposition()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ActuationDisposition_Payload(value)
    }

    def parseProtected_Start_Power_SupervisorSupervisoryStatus(): Protected_Start_Power_Supervisor.SupervisoryStatus = {
      val r = parseProtected_Start_Power_SupervisorSupervisoryStatusT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSupervisoryStatusT(typeParsed: B): Protected_Start_Power_Supervisor.SupervisoryStatus = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SupervisoryStatus")
      }
      parser.parseObjectKey("session")
      val session = parseProtected_Start_Power_SupervisorSessionType()
      parser.parseObjectNext()
      parser.parseObjectKey("startReady")
      val startReady = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("sustainReady")
      val sustainReady = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("rearmState")
      val rearmState = parseProtected_Start_Power_SupervisorRearmStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("notice")
      val notice = parseProtected_Start_Power_SupervisorNoticeType()
      parser.parseObjectNext()
      parser.parseObjectKey("commandFault")
      val commandFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("pedalFault")
      val pedalFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("thermalFault")
      val thermalFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("supplyFault")
      val supplyFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("parkingBrakeFault")
      val parkingBrakeFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("selfTestFault")
      val selfTestFault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("anyFault")
      val anyFault = parser.parseB()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SupervisoryStatus(session, startReady, sustainReady, rearmState, notice, commandFault, pedalFault, thermalFault, supplyFault, parkingBrakeFault, selfTestFault, anyFault)
    }

    def parseProtected_Start_Power_SupervisorSupervisoryStatus_Payload(): Protected_Start_Power_Supervisor.SupervisoryStatus_Payload = {
      val r = parseProtected_Start_Power_SupervisorSupervisoryStatus_PayloadT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSupervisoryStatus_PayloadT(typeParsed: B): Protected_Start_Power_Supervisor.SupervisoryStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SupervisoryStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseProtected_Start_Power_SupervisorSupervisoryStatus()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SupervisoryStatus_Payload(value)
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

    def parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container(): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_command_report")
      val api_command_report = parseProtected_Start_Power_SupervisorCommandReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(api_command_report)
    }

    def parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_command_report")
      val api_command_report = parseProtected_Start_Power_SupervisorCommandReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(api_command_report)
    }

    def parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container(): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_command_fault")
      val api_command_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_command_facts")
      val api_qualified_command_facts = parseProtected_Start_Power_SupervisorQualifiedCommandFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(api_command_fault, api_qualified_command_facts)
    }

    def parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_command_fault")
      val api_command_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_command_facts")
      val api_qualified_command_facts = parseProtected_Start_Power_SupervisorQualifiedCommandFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(api_command_fault, api_qualified_command_facts)
    }

    def parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container(): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_brake_pedal_report")
      val api_brake_pedal_report = parseProtected_Start_Power_SupervisorBrakePedalReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(api_brake_pedal_report)
    }

    def parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_brake_pedal_report")
      val api_brake_pedal_report = parseProtected_Start_Power_SupervisorBrakePedalReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(api_brake_pedal_report)
    }

    def parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container(): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_pedal_fault")
      val api_pedal_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_pedal_facts")
      val api_qualified_pedal_facts = parseProtected_Start_Power_SupervisorQualifiedPedalFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(api_pedal_fault, api_qualified_pedal_facts)
    }

    def parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_pedal_fault")
      val api_pedal_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_pedal_facts")
      val api_qualified_pedal_facts = parseProtected_Start_Power_SupervisorQualifiedPedalFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(api_pedal_fault, api_qualified_pedal_facts)
    }

    def parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container(): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_temperature_report")
      val api_temperature_report = parseProtected_Start_Power_SupervisorTemperatureReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(api_temperature_report)
    }

    def parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_temperature_report")
      val api_temperature_report = parseProtected_Start_Power_SupervisorTemperatureReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(api_temperature_report)
    }

    def parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container(): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualified_temperature")
      val api_qualified_temperature = parseProtected_Start_Power_SupervisorQualifiedTemperatureType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(api_qualified_temperature)
    }

    def parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_temperature")
      val api_qualified_temperature = parseProtected_Start_Power_SupervisorQualifiedTemperatureType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(api_qualified_temperature)
    }

    def parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container(): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_electrical_power_report")
      val api_electrical_power_report = parseProtected_Start_Power_SupervisorElectricalPowerReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(api_electrical_power_report)
    }

    def parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_electrical_power_report")
      val api_electrical_power_report = parseProtected_Start_Power_SupervisorElectricalPowerReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(api_electrical_power_report)
    }

    def parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container(): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualified_supply_facts")
      val api_qualified_supply_facts = parseProtected_Start_Power_SupervisorQualifiedSupplyFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supply_fault")
      val api_supply_fault = parser.parseB()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(api_qualified_supply_facts, api_supply_fault)
    }

    def parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_supply_facts")
      val api_qualified_supply_facts = parseProtected_Start_Power_SupervisorQualifiedSupplyFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supply_fault")
      val api_supply_fault = parser.parseB()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(api_qualified_supply_facts, api_supply_fault)
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container(): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_parking_brake_report")
      val api_parking_brake_report = parseProtected_Start_Power_SupervisorParkingBrakeReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(api_parking_brake_report)
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_parking_brake_report")
      val api_parking_brake_report = parseProtected_Start_Power_SupervisorParkingBrakeReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(api_parking_brake_report)
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container(): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_parking_brake_fault")
      val api_parking_brake_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_parking_brake_facts")
      val api_qualified_parking_brake_facts = parseProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(api_parking_brake_fault, api_qualified_parking_brake_facts)
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_parking_brake_fault")
      val api_parking_brake_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_parking_brake_facts")
      val api_qualified_parking_brake_facts = parseProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(api_parking_brake_fault, api_qualified_parking_brake_facts)
    }

    def parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container(): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_qualified_temperature")
      val api_qualified_temperature = parseProtected_Start_Power_SupervisorQualifiedTemperatureType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(api_qualified_temperature)
    }

    def parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_thermalMemory")
      val In_thermalMemory = parseProtected_Start_Power_SupervisorThermalStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_temperature")
      val api_qualified_temperature = parseProtected_Start_Power_SupervisorQualifiedTemperatureType()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(In_thermalMemory, api_qualified_temperature)
    }

    def parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container(): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_thermal_fault")
      val api_thermal_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_thermal_state_facts")
      val api_thermal_state_facts = parseProtected_Start_Power_SupervisorThermalStateFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(api_thermal_fault, api_thermal_state_facts)
    }

    def parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("thermalMemory")
      val thermalMemory = parseProtected_Start_Power_SupervisorThermalStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_thermal_fault")
      val api_thermal_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_thermal_state_facts")
      val api_thermal_state_facts = parseProtected_Start_Power_SupervisorThermalStateFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(thermalMemory, api_thermal_fault, api_thermal_state_facts)
    }

    def parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container(): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_qualified_command_facts")
      val api_qualified_command_facts = parseProtected_Start_Power_SupervisorQualifiedCommandFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_self_test_report")
      val api_self_test_report = parseProtected_Start_Power_SupervisorSelfTestReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(api_qualified_command_facts, api_self_test_report)
    }

    def parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_selfTestMemory")
      val In_selfTestMemory = parseProtected_Start_Power_SupervisorSelfTestStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_command_facts")
      val api_qualified_command_facts = parseProtected_Start_Power_SupervisorQualifiedCommandFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_self_test_report")
      val api_self_test_report = parseProtected_Start_Power_SupervisorSelfTestReport()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(In_selfTestMemory, api_qualified_command_facts, api_self_test_report)
    }

    def parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container(): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_self_test_fault")
      val api_self_test_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_self_test_state_facts")
      val api_self_test_state_facts = parseProtected_Start_Power_SupervisorSelfTestStateFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(api_self_test_fault, api_self_test_state_facts)
    }

    def parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("selfTestMemory")
      val selfTestMemory = parseProtected_Start_Power_SupervisorSelfTestStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_self_test_fault")
      val api_self_test_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_self_test_state_facts")
      val api_self_test_state_facts = parseProtected_Start_Power_SupervisorSelfTestStateFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(selfTestMemory, api_self_test_fault, api_self_test_state_facts)
    }

    def parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container(): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_qualified_parking_brake_facts")
      val api_qualified_parking_brake_facts = parseProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_pedal_facts")
      val api_qualified_pedal_facts = parseProtected_Start_Power_SupervisorQualifiedPedalFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(api_qualified_parking_brake_facts, api_qualified_pedal_facts)
    }

    def parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_parking_brake_facts")
      val api_qualified_parking_brake_facts = parseProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_pedal_facts")
      val api_qualified_pedal_facts = parseProtected_Start_Power_SupervisorQualifiedPedalFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(api_qualified_parking_brake_facts, api_qualified_pedal_facts)
    }

    def parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container(): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_start_restraint_fact")
      val api_start_restraint_fact = parseProtected_Start_Power_SupervisorStartRestraintFact()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(api_start_restraint_fact)
    }

    def parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_start_restraint_fact")
      val api_start_restraint_fact = parseProtected_Start_Power_SupervisorStartRestraintFact()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(api_start_restraint_fact)
    }

    def parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container(): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_qualified_supply_facts")
      val api_qualified_supply_facts = parseProtected_Start_Power_SupervisorQualifiedSupplyFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_self_test_state_facts")
      val api_self_test_state_facts = parseProtected_Start_Power_SupervisorSelfTestStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_start_restraint_fact")
      val api_start_restraint_fact = parseProtected_Start_Power_SupervisorStartRestraintFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_thermal_state_facts")
      val api_thermal_state_facts = parseProtected_Start_Power_SupervisorThermalStateFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(api_qualified_supply_facts, api_self_test_state_facts, api_start_restraint_fact, api_thermal_state_facts)
    }

    def parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_qualified_supply_facts")
      val api_qualified_supply_facts = parseProtected_Start_Power_SupervisorQualifiedSupplyFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_self_test_state_facts")
      val api_self_test_state_facts = parseProtected_Start_Power_SupervisorSelfTestStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_start_restraint_fact")
      val api_start_restraint_fact = parseProtected_Start_Power_SupervisorStartRestraintFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_thermal_state_facts")
      val api_thermal_state_facts = parseProtected_Start_Power_SupervisorThermalStateFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(api_qualified_supply_facts, api_self_test_state_facts, api_start_restraint_fact, api_thermal_state_facts)
    }

    def parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container(): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_readiness_facts")
      val api_readiness_facts = parseProtected_Start_Power_SupervisorReadinessFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(api_readiness_facts)
    }

    def parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_readiness_facts")
      val api_readiness_facts = parseProtected_Start_Power_SupervisorReadinessFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(api_readiness_facts)
    }

    def parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container(): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_exact_fault_summary")
      val api_exact_fault_summary = parseProtected_Start_Power_SupervisorExactFaultSummary()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_command_facts")
      val api_qualified_command_facts = parseProtected_Start_Power_SupervisorQualifiedCommandFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readiness_facts")
      val api_readiness_facts = parseProtected_Start_Power_SupervisorReadinessFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_permit_fact")
      val api_recovery_permit_fact = parseProtected_Start_Power_SupervisorRecoveryPermitFact()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(api_exact_fault_summary, api_qualified_command_facts, api_readiness_facts, api_recovery_permit_fact)
    }

    def parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_exact_fault_summary")
      val api_exact_fault_summary = parseProtected_Start_Power_SupervisorExactFaultSummary()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_command_facts")
      val api_qualified_command_facts = parseProtected_Start_Power_SupervisorQualifiedCommandFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readiness_facts")
      val api_readiness_facts = parseProtected_Start_Power_SupervisorReadinessFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_permit_fact")
      val api_recovery_permit_fact = parseProtected_Start_Power_SupervisorRecoveryPermitFact()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(api_exact_fault_summary, api_qualified_command_facts, api_readiness_facts, api_recovery_permit_fact)
    }

    def parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container(): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_session_decision_facts")
      val api_session_decision_facts = parseProtected_Start_Power_SupervisorSessionDecisionFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(api_session_decision_facts)
    }

    def parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_session_decision_facts")
      val api_session_decision_facts = parseProtected_Start_Power_SupervisorSessionDecisionFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(api_session_decision_facts)
    }

    def parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container(): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_command_fault")
      val api_command_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_parking_brake_fault")
      val api_parking_brake_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_pedal_fault")
      val api_pedal_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_self_test_fault")
      val api_self_test_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supply_fault")
      val api_supply_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_thermal_fault")
      val api_thermal_fault = parser.parseB()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(api_command_fault, api_parking_brake_fault, api_pedal_fault, api_self_test_fault, api_supply_fault, api_thermal_fault)
    }

    def parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_command_fault")
      val api_command_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_parking_brake_fault")
      val api_parking_brake_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_pedal_fault")
      val api_pedal_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_self_test_fault")
      val api_self_test_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supply_fault")
      val api_supply_fault = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_thermal_fault")
      val api_thermal_fault = parser.parseB()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(api_command_fault, api_parking_brake_fault, api_pedal_fault, api_self_test_fault, api_supply_fault, api_thermal_fault)
    }

    def parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container(): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_exact_fault_summary")
      val api_exact_fault_summary = parseProtected_Start_Power_SupervisorExactFaultSummary()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(api_exact_fault_summary)
    }

    def parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_exact_fault_summary")
      val api_exact_fault_summary = parseProtected_Start_Power_SupervisorExactFaultSummary()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(api_exact_fault_summary)
    }

    def parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container(): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_exact_fault_summary")
      val api_exact_fault_summary = parseProtected_Start_Power_SupervisorExactFaultSummary()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_command_facts")
      val api_qualified_command_facts = parseProtected_Start_Power_SupervisorQualifiedCommandFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readiness_facts")
      val api_readiness_facts = parseProtected_Start_Power_SupervisorReadinessFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(api_exact_fault_summary, api_qualified_command_facts, api_readiness_facts)
    }

    def parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_rearmMemory")
      val In_rearmMemory = parseProtected_Start_Power_SupervisorRearmStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_exact_fault_summary")
      val api_exact_fault_summary = parseProtected_Start_Power_SupervisorExactFaultSummary()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualified_command_facts")
      val api_qualified_command_facts = parseProtected_Start_Power_SupervisorQualifiedCommandFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readiness_facts")
      val api_readiness_facts = parseProtected_Start_Power_SupervisorReadinessFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(In_rearmMemory, api_exact_fault_summary, api_qualified_command_facts, api_readiness_facts)
    }

    def parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container(): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_rearm_state_facts")
      val api_rearm_state_facts = parseProtected_Start_Power_SupervisorRearmStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_permit_fact")
      val api_recovery_permit_fact = parseProtected_Start_Power_SupervisorRecoveryPermitFact()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(api_rearm_state_facts, api_recovery_permit_fact)
    }

    def parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("rearmMemory")
      val rearmMemory = parseProtected_Start_Power_SupervisorRearmStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_rearm_state_facts")
      val api_rearm_state_facts = parseProtected_Start_Power_SupervisorRearmStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recovery_permit_fact")
      val api_recovery_permit_fact = parseProtected_Start_Power_SupervisorRecoveryPermitFact()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(rearmMemory, api_rearm_state_facts, api_recovery_permit_fact)
    }

    def parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container(): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_exact_fault_summary")
      val api_exact_fault_summary = parseProtected_Start_Power_SupervisorExactFaultSummary()
      parser.parseObjectNext()
      parser.parseObjectKey("api_session_decision_facts")
      val api_session_decision_facts = parseProtected_Start_Power_SupervisorSessionDecisionFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(api_exact_fault_summary, api_session_decision_facts)
    }

    def parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_exact_fault_summary")
      val api_exact_fault_summary = parseProtected_Start_Power_SupervisorExactFaultSummary()
      parser.parseObjectNext()
      parser.parseObjectKey("api_session_decision_facts")
      val api_session_decision_facts = parseProtected_Start_Power_SupervisorSessionDecisionFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(api_exact_fault_summary, api_session_decision_facts)
    }

    def parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container(): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_actuation_disposition")
      val api_actuation_disposition = parseProtected_Start_Power_SupervisorActuationDisposition()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(api_actuation_disposition)
    }

    def parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_actuation_disposition")
      val api_actuation_disposition = parseProtected_Start_Power_SupervisorActuationDisposition()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(api_actuation_disposition)
    }

    def parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container(): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P")
      }
      parser.parseObjectKey("api_exact_fault_summary")
      val api_exact_fault_summary = parseProtected_Start_Power_SupervisorExactFaultSummary()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readiness_facts")
      val api_readiness_facts = parseProtected_Start_Power_SupervisorReadinessFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_rearm_state_facts")
      val api_rearm_state_facts = parseProtected_Start_Power_SupervisorRearmStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_session_decision_facts")
      val api_session_decision_facts = parseProtected_Start_Power_SupervisorSessionDecisionFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(api_exact_fault_summary, api_readiness_facts, api_rearm_state_facts, api_session_decision_facts)
    }

    def parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_exact_fault_summary")
      val api_exact_fault_summary = parseProtected_Start_Power_SupervisorExactFaultSummary()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readiness_facts")
      val api_readiness_facts = parseProtected_Start_Power_SupervisorReadinessFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_rearm_state_facts")
      val api_rearm_state_facts = parseProtected_Start_Power_SupervisorRearmStateFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_session_decision_facts")
      val api_session_decision_facts = parseProtected_Start_Power_SupervisorSessionDecisionFacts()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(api_exact_fault_summary, api_readiness_facts, api_rearm_state_facts, api_session_decision_facts)
    }

    def parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container(): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS"))
      t.native match {
        case "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PST(T); return r
      }
    }

    def parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P = {
      val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PT(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PT(typeParsed: B): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P")
      }
      parser.parseObjectKey("api_supervisory_status")
      val api_supervisory_status = parseProtected_Start_Power_SupervisorSupervisoryStatus()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(api_supervisory_status)
    }

    def parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS = {
      val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PST(F)
      return r
    }

    def parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PST(typeParsed: B): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_supervisory_status")
      val api_supervisory_status = parseProtected_Start_Power_SupervisorSupervisoryStatus()
      parser.parseObjectNext()
      return Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(api_supervisory_status)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Protected_Start_Power_Supervisor.Notice_Payload", "Protected_Start_Power_Supervisor.Session_Payload", "Protected_Start_Power_Supervisor.Command_Payload", "Protected_Start_Power_Supervisor.Validity_Payload", "Protected_Start_Power_Supervisor.RearmState_Payload", "Protected_Start_Power_Supervisor.ThermalState_Payload", "Protected_Start_Power_Supervisor.SessionCause_Payload", "Protected_Start_Power_Supervisor.SelfTestState_Payload", "Protected_Start_Power_Supervisor.CommandReport_Payload", "Protected_Start_Power_Supervisor.PedalCondition_Payload", "Protected_Start_Power_Supervisor.ReadinessFacts_Payload", "Protected_Start_Power_Supervisor.SelfTestReport_Payload", "Protected_Start_Power_Supervisor.FuelDisposition_Payload", "Protected_Start_Power_Supervisor.TemperatureBand_Payload", "Protected_Start_Power_Supervisor.RearmStateFacts_Payload", "Protected_Start_Power_Supervisor.SelfTestProgress_Payload", "Protected_Start_Power_Supervisor.BrakePedalReport_Payload", "Protected_Start_Power_Supervisor.ThermalStateFacts_Payload", "Protected_Start_Power_Supervisor.TemperatureReport_Payload", "Protected_Start_Power_Supervisor.ExactFaultSummary_Payload", "Protected_Start_Power_Supervisor.SupervisoryStatus_Payload", "Protected_Start_Power_Supervisor.SupplyAvailability_Payload", "Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload", "Protected_Start_Power_Supervisor.StartRestraintFact_Payload", "Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload", "Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload", "Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload", "Protected_Start_Power_Supervisor.QualifiedTemperature_Payload", "Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload", "Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload", "Protected_Start_Power_Supervisor.ActuationDisposition_Payload", "Protected_Start_Power_Supervisor.ElectricalDisposition_Payload", "Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload", "Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload", "Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload", "Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload", "Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload", "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS", "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P", "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS", "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P", "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS"))
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
        case "Protected_Start_Power_Supervisor.Notice_Payload" => val r = parseProtected_Start_Power_SupervisorNotice_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.Session_Payload" => val r = parseProtected_Start_Power_SupervisorSession_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.Command_Payload" => val r = parseProtected_Start_Power_SupervisorCommand_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.Validity_Payload" => val r = parseProtected_Start_Power_SupervisorValidity_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.RearmState_Payload" => val r = parseProtected_Start_Power_SupervisorRearmState_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.ThermalState_Payload" => val r = parseProtected_Start_Power_SupervisorThermalState_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.SessionCause_Payload" => val r = parseProtected_Start_Power_SupervisorSessionCause_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.SelfTestState_Payload" => val r = parseProtected_Start_Power_SupervisorSelfTestState_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.CommandReport_Payload" => val r = parseProtected_Start_Power_SupervisorCommandReport_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.PedalCondition_Payload" => val r = parseProtected_Start_Power_SupervisorPedalCondition_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.ReadinessFacts_Payload" => val r = parseProtected_Start_Power_SupervisorReadinessFacts_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.SelfTestReport_Payload" => val r = parseProtected_Start_Power_SupervisorSelfTestReport_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.FuelDisposition_Payload" => val r = parseProtected_Start_Power_SupervisorFuelDisposition_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.TemperatureBand_Payload" => val r = parseProtected_Start_Power_SupervisorTemperatureBand_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.RearmStateFacts_Payload" => val r = parseProtected_Start_Power_SupervisorRearmStateFacts_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.SelfTestProgress_Payload" => val r = parseProtected_Start_Power_SupervisorSelfTestProgress_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.BrakePedalReport_Payload" => val r = parseProtected_Start_Power_SupervisorBrakePedalReport_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.ThermalStateFacts_Payload" => val r = parseProtected_Start_Power_SupervisorThermalStateFacts_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.TemperatureReport_Payload" => val r = parseProtected_Start_Power_SupervisorTemperatureReport_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.ExactFaultSummary_Payload" => val r = parseProtected_Start_Power_SupervisorExactFaultSummary_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.SupervisoryStatus_Payload" => val r = parseProtected_Start_Power_SupervisorSupervisoryStatus_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.SupplyAvailability_Payload" => val r = parseProtected_Start_Power_SupervisorSupplyAvailability_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload" => val r = parseProtected_Start_Power_SupervisorRecoveryPermitFact_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.StartRestraintFact_Payload" => val r = parseProtected_Start_Power_SupervisorStartRestraintFact_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload" => val r = parseProtected_Start_Power_SupervisorSelfTestStateFacts_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload" => val r = parseProtected_Start_Power_SupervisorParkingBrakeReport_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload" => val r = parseProtected_Start_Power_SupervisorQualifiedPedalFacts_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.QualifiedTemperature_Payload" => val r = parseProtected_Start_Power_SupervisorQualifiedTemperature_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload" => val r = parseProtected_Start_Power_SupervisorQualifiedSupplyFacts_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload" => val r = parseProtected_Start_Power_SupervisorSessionDecisionFacts_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.ActuationDisposition_Payload" => val r = parseProtected_Start_Power_SupervisorActuationDisposition_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.ElectricalDisposition_Payload" => val r = parseProtected_Start_Power_SupervisorElectricalDisposition_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload" => val r = parseProtected_Start_Power_SupervisorParkingBrakeCondition_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload" => val r = parseProtected_Start_Power_SupervisorQualifiedCommandFacts_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload" => val r = parseProtected_Start_Power_SupervisorElectricalPowerReport_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload" => val r = parseProtected_Start_Power_SupervisorParkingBrakeDisposition_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload" => val r = parseProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_PayloadT(T); return r
        case "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P" => val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS" => val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PST(T); return r
        case "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P" => val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PT(T); return r
        case "Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS" => val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PST(T); return r
        case _ => val r = parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PST(T); return r
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

  def fromProtected_Start_Power_SupervisorCommand_Payload(o: Protected_Start_Power_Supervisor.Command_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorCommand_Payload(s: String): Either[Protected_Start_Power_Supervisor.Command_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommand_Payload(parser: Parser): Protected_Start_Power_Supervisor.Command_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorCommand_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorCommand_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorValidity_Payload(o: Protected_Start_Power_Supervisor.Validity_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorValidity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorValidity_Payload(s: String): Either[Protected_Start_Power_Supervisor.Validity_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorValidity_Payload(parser: Parser): Protected_Start_Power_Supervisor.Validity_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorValidity_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorValidity_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorPedalCondition_Payload(o: Protected_Start_Power_Supervisor.PedalCondition_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorPedalCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorPedalCondition_Payload(s: String): Either[Protected_Start_Power_Supervisor.PedalCondition_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorPedalCondition_Payload(parser: Parser): Protected_Start_Power_Supervisor.PedalCondition_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorPedalCondition_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorPedalCondition_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureBand_Payload(o: Protected_Start_Power_Supervisor.TemperatureBand_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorTemperatureBand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorTemperatureBand_Payload(s: String): Either[Protected_Start_Power_Supervisor.TemperatureBand_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureBand_Payload(parser: Parser): Protected_Start_Power_Supervisor.TemperatureBand_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorTemperatureBand_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorTemperatureBand_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedTemperature_Payload(o: Protected_Start_Power_Supervisor.QualifiedTemperature_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorQualifiedTemperature_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorQualifiedTemperature_Payload(s: String): Either[Protected_Start_Power_Supervisor.QualifiedTemperature_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedTemperature_Payload(parser: Parser): Protected_Start_Power_Supervisor.QualifiedTemperature_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorQualifiedTemperature_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorQualifiedTemperature_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupplyAvailability_Payload(o: Protected_Start_Power_Supervisor.SupplyAvailability_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSupplyAvailability_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSupplyAvailability_Payload(s: String): Either[Protected_Start_Power_Supervisor.SupplyAvailability_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupplyAvailability_Payload(parser: Parser): Protected_Start_Power_Supervisor.SupplyAvailability_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorSupplyAvailability_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSupplyAvailability_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeCondition_Payload(o: Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorParkingBrakeCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorParkingBrakeCondition_Payload(s: String): Either[Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeCondition_Payload(parser: Parser): Protected_Start_Power_Supervisor.ParkingBrakeCondition_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorParkingBrakeCondition_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorParkingBrakeCondition_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalState_Payload(o: Protected_Start_Power_Supervisor.ThermalState_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorThermalState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorThermalState_Payload(s: String): Either[Protected_Start_Power_Supervisor.ThermalState_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalState_Payload(parser: Parser): Protected_Start_Power_Supervisor.ThermalState_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorThermalState_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorThermalState_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestProgress_Payload(o: Protected_Start_Power_Supervisor.SelfTestProgress_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSelfTestProgress_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSelfTestProgress_Payload(s: String): Either[Protected_Start_Power_Supervisor.SelfTestProgress_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestProgress_Payload(parser: Parser): Protected_Start_Power_Supervisor.SelfTestProgress_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorSelfTestProgress_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSelfTestProgress_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestState_Payload(o: Protected_Start_Power_Supervisor.SelfTestState_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSelfTestState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSelfTestState_Payload(s: String): Either[Protected_Start_Power_Supervisor.SelfTestState_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestState_Payload(parser: Parser): Protected_Start_Power_Supervisor.SelfTestState_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorSelfTestState_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSelfTestState_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSession_Payload(o: Protected_Start_Power_Supervisor.Session_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSession_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSession_Payload(s: String): Either[Protected_Start_Power_Supervisor.Session_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSession_Payload(parser: Parser): Protected_Start_Power_Supervisor.Session_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorSession_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSession_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSessionCause_Payload(o: Protected_Start_Power_Supervisor.SessionCause_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSessionCause_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSessionCause_Payload(s: String): Either[Protected_Start_Power_Supervisor.SessionCause_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSessionCause_Payload(parser: Parser): Protected_Start_Power_Supervisor.SessionCause_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorSessionCause_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSessionCause_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmState_Payload(o: Protected_Start_Power_Supervisor.RearmState_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorRearmState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorRearmState_Payload(s: String): Either[Protected_Start_Power_Supervisor.RearmState_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmState_Payload(parser: Parser): Protected_Start_Power_Supervisor.RearmState_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorRearmState_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorRearmState_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorFuelDisposition_Payload(o: Protected_Start_Power_Supervisor.FuelDisposition_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorFuelDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorFuelDisposition_Payload(s: String): Either[Protected_Start_Power_Supervisor.FuelDisposition_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorFuelDisposition_Payload(parser: Parser): Protected_Start_Power_Supervisor.FuelDisposition_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorFuelDisposition_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorFuelDisposition_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalDisposition_Payload(o: Protected_Start_Power_Supervisor.ElectricalDisposition_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorElectricalDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorElectricalDisposition_Payload(s: String): Either[Protected_Start_Power_Supervisor.ElectricalDisposition_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalDisposition_Payload(parser: Parser): Protected_Start_Power_Supervisor.ElectricalDisposition_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorElectricalDisposition_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorElectricalDisposition_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload(o: Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload(s: String): Either[Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload(parser: Parser): Protected_Start_Power_Supervisor.ParkingBrakeDisposition_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorParkingBrakeDisposition_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorNotice_Payload(o: Protected_Start_Power_Supervisor.Notice_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorNotice_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorNotice_Payload(s: String): Either[Protected_Start_Power_Supervisor.Notice_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorNotice_Payload(parser: Parser): Protected_Start_Power_Supervisor.Notice_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorNotice_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorNotice_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorCommandReport(o: Protected_Start_Power_Supervisor.CommandReport, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorCommandReport(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorCommandReport(s: String): Either[Protected_Start_Power_Supervisor.CommandReport, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommandReport(parser: Parser): Protected_Start_Power_Supervisor.CommandReport = {
      val r = parser.parseProtected_Start_Power_SupervisorCommandReport()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorCommandReport _)
    return r
  }

  def fromProtected_Start_Power_SupervisorCommandReport_Payload(o: Protected_Start_Power_Supervisor.CommandReport_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorCommandReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorCommandReport_Payload(s: String): Either[Protected_Start_Power_Supervisor.CommandReport_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommandReport_Payload(parser: Parser): Protected_Start_Power_Supervisor.CommandReport_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorCommandReport_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorCommandReport_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedCommandFacts(o: Protected_Start_Power_Supervisor.QualifiedCommandFacts, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorQualifiedCommandFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorQualifiedCommandFacts(s: String): Either[Protected_Start_Power_Supervisor.QualifiedCommandFacts, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedCommandFacts(parser: Parser): Protected_Start_Power_Supervisor.QualifiedCommandFacts = {
      val r = parser.parseProtected_Start_Power_SupervisorQualifiedCommandFacts()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorQualifiedCommandFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload(o: Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload(s: String): Either[Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload(parser: Parser): Protected_Start_Power_Supervisor.QualifiedCommandFacts_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorQualifiedCommandFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedPedalFacts(o: Protected_Start_Power_Supervisor.QualifiedPedalFacts, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorQualifiedPedalFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorQualifiedPedalFacts(s: String): Either[Protected_Start_Power_Supervisor.QualifiedPedalFacts, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedPedalFacts(parser: Parser): Protected_Start_Power_Supervisor.QualifiedPedalFacts = {
      val r = parser.parseProtected_Start_Power_SupervisorQualifiedPedalFacts()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorQualifiedPedalFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload(o: Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload(s: String): Either[Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload(parser: Parser): Protected_Start_Power_Supervisor.QualifiedPedalFacts_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorQualifiedPedalFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedSupplyFacts(o: Protected_Start_Power_Supervisor.QualifiedSupplyFacts, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorQualifiedSupplyFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorQualifiedSupplyFacts(s: String): Either[Protected_Start_Power_Supervisor.QualifiedSupplyFacts, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedSupplyFacts(parser: Parser): Protected_Start_Power_Supervisor.QualifiedSupplyFacts = {
      val r = parser.parseProtected_Start_Power_SupervisorQualifiedSupplyFacts()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorQualifiedSupplyFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload(o: Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload(s: String): Either[Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload(parser: Parser): Protected_Start_Power_Supervisor.QualifiedSupplyFacts_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorQualifiedSupplyFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(o: Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(s: String): Either[Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts(parser: Parser): Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts = {
      val r = parser.parseProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload(o: Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload(s: String): Either[Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload(parser: Parser): Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorQualifiedParkingBrakeFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorStartRestraintFact(o: Protected_Start_Power_Supervisor.StartRestraintFact, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorStartRestraintFact(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorStartRestraintFact(s: String): Either[Protected_Start_Power_Supervisor.StartRestraintFact, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorStartRestraintFact(parser: Parser): Protected_Start_Power_Supervisor.StartRestraintFact = {
      val r = parser.parseProtected_Start_Power_SupervisorStartRestraintFact()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorStartRestraintFact _)
    return r
  }

  def fromProtected_Start_Power_SupervisorStartRestraintFact_Payload(o: Protected_Start_Power_Supervisor.StartRestraintFact_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorStartRestraintFact_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorStartRestraintFact_Payload(s: String): Either[Protected_Start_Power_Supervisor.StartRestraintFact_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorStartRestraintFact_Payload(parser: Parser): Protected_Start_Power_Supervisor.StartRestraintFact_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorStartRestraintFact_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorStartRestraintFact_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorReadinessFacts(o: Protected_Start_Power_Supervisor.ReadinessFacts, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorReadinessFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorReadinessFacts(s: String): Either[Protected_Start_Power_Supervisor.ReadinessFacts, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorReadinessFacts(parser: Parser): Protected_Start_Power_Supervisor.ReadinessFacts = {
      val r = parser.parseProtected_Start_Power_SupervisorReadinessFacts()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorReadinessFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorReadinessFacts_Payload(o: Protected_Start_Power_Supervisor.ReadinessFacts_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorReadinessFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorReadinessFacts_Payload(s: String): Either[Protected_Start_Power_Supervisor.ReadinessFacts_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorReadinessFacts_Payload(parser: Parser): Protected_Start_Power_Supervisor.ReadinessFacts_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorReadinessFacts_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorReadinessFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorExactFaultSummary(o: Protected_Start_Power_Supervisor.ExactFaultSummary, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorExactFaultSummary(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorExactFaultSummary(s: String): Either[Protected_Start_Power_Supervisor.ExactFaultSummary, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorExactFaultSummary(parser: Parser): Protected_Start_Power_Supervisor.ExactFaultSummary = {
      val r = parser.parseProtected_Start_Power_SupervisorExactFaultSummary()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorExactFaultSummary _)
    return r
  }

  def fromProtected_Start_Power_SupervisorExactFaultSummary_Payload(o: Protected_Start_Power_Supervisor.ExactFaultSummary_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorExactFaultSummary_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorExactFaultSummary_Payload(s: String): Either[Protected_Start_Power_Supervisor.ExactFaultSummary_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorExactFaultSummary_Payload(parser: Parser): Protected_Start_Power_Supervisor.ExactFaultSummary_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorExactFaultSummary_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorExactFaultSummary_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRecoveryPermitFact(o: Protected_Start_Power_Supervisor.RecoveryPermitFact, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorRecoveryPermitFact(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorRecoveryPermitFact(s: String): Either[Protected_Start_Power_Supervisor.RecoveryPermitFact, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRecoveryPermitFact(parser: Parser): Protected_Start_Power_Supervisor.RecoveryPermitFact = {
      val r = parser.parseProtected_Start_Power_SupervisorRecoveryPermitFact()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorRecoveryPermitFact _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRecoveryPermitFact_Payload(o: Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorRecoveryPermitFact_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorRecoveryPermitFact_Payload(s: String): Either[Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRecoveryPermitFact_Payload(parser: Parser): Protected_Start_Power_Supervisor.RecoveryPermitFact_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorRecoveryPermitFact_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorRecoveryPermitFact_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorBrakePedalReport(o: Protected_Start_Power_Supervisor.BrakePedalReport, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorBrakePedalReport(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorBrakePedalReport(s: String): Either[Protected_Start_Power_Supervisor.BrakePedalReport, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorBrakePedalReport(parser: Parser): Protected_Start_Power_Supervisor.BrakePedalReport = {
      val r = parser.parseProtected_Start_Power_SupervisorBrakePedalReport()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorBrakePedalReport _)
    return r
  }

  def fromProtected_Start_Power_SupervisorBrakePedalReport_Payload(o: Protected_Start_Power_Supervisor.BrakePedalReport_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorBrakePedalReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorBrakePedalReport_Payload(s: String): Either[Protected_Start_Power_Supervisor.BrakePedalReport_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorBrakePedalReport_Payload(parser: Parser): Protected_Start_Power_Supervisor.BrakePedalReport_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorBrakePedalReport_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorBrakePedalReport_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureReport(o: Protected_Start_Power_Supervisor.TemperatureReport, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorTemperatureReport(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorTemperatureReport(s: String): Either[Protected_Start_Power_Supervisor.TemperatureReport, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureReport(parser: Parser): Protected_Start_Power_Supervisor.TemperatureReport = {
      val r = parser.parseProtected_Start_Power_SupervisorTemperatureReport()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorTemperatureReport _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureReport_Payload(o: Protected_Start_Power_Supervisor.TemperatureReport_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorTemperatureReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorTemperatureReport_Payload(s: String): Either[Protected_Start_Power_Supervisor.TemperatureReport_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureReport_Payload(parser: Parser): Protected_Start_Power_Supervisor.TemperatureReport_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorTemperatureReport_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorTemperatureReport_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalPowerReport(o: Protected_Start_Power_Supervisor.ElectricalPowerReport, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorElectricalPowerReport(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorElectricalPowerReport(s: String): Either[Protected_Start_Power_Supervisor.ElectricalPowerReport, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalPowerReport(parser: Parser): Protected_Start_Power_Supervisor.ElectricalPowerReport = {
      val r = parser.parseProtected_Start_Power_SupervisorElectricalPowerReport()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorElectricalPowerReport _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalPowerReport_Payload(o: Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorElectricalPowerReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorElectricalPowerReport_Payload(s: String): Either[Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalPowerReport_Payload(parser: Parser): Protected_Start_Power_Supervisor.ElectricalPowerReport_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorElectricalPowerReport_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorElectricalPowerReport_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeReport(o: Protected_Start_Power_Supervisor.ParkingBrakeReport, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorParkingBrakeReport(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorParkingBrakeReport(s: String): Either[Protected_Start_Power_Supervisor.ParkingBrakeReport, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeReport(parser: Parser): Protected_Start_Power_Supervisor.ParkingBrakeReport = {
      val r = parser.parseProtected_Start_Power_SupervisorParkingBrakeReport()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorParkingBrakeReport _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeReport_Payload(o: Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorParkingBrakeReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorParkingBrakeReport_Payload(s: String): Either[Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeReport_Payload(parser: Parser): Protected_Start_Power_Supervisor.ParkingBrakeReport_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorParkingBrakeReport_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorParkingBrakeReport_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalStateFacts(o: Protected_Start_Power_Supervisor.ThermalStateFacts, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorThermalStateFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorThermalStateFacts(s: String): Either[Protected_Start_Power_Supervisor.ThermalStateFacts, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalStateFacts(parser: Parser): Protected_Start_Power_Supervisor.ThermalStateFacts = {
      val r = parser.parseProtected_Start_Power_SupervisorThermalStateFacts()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorThermalStateFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalStateFacts_Payload(o: Protected_Start_Power_Supervisor.ThermalStateFacts_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorThermalStateFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorThermalStateFacts_Payload(s: String): Either[Protected_Start_Power_Supervisor.ThermalStateFacts_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalStateFacts_Payload(parser: Parser): Protected_Start_Power_Supervisor.ThermalStateFacts_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorThermalStateFacts_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorThermalStateFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestReport(o: Protected_Start_Power_Supervisor.SelfTestReport, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSelfTestReport(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSelfTestReport(s: String): Either[Protected_Start_Power_Supervisor.SelfTestReport, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestReport(parser: Parser): Protected_Start_Power_Supervisor.SelfTestReport = {
      val r = parser.parseProtected_Start_Power_SupervisorSelfTestReport()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSelfTestReport _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestReport_Payload(o: Protected_Start_Power_Supervisor.SelfTestReport_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSelfTestReport_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSelfTestReport_Payload(s: String): Either[Protected_Start_Power_Supervisor.SelfTestReport_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestReport_Payload(parser: Parser): Protected_Start_Power_Supervisor.SelfTestReport_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorSelfTestReport_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSelfTestReport_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestStateFacts(o: Protected_Start_Power_Supervisor.SelfTestStateFacts, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSelfTestStateFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSelfTestStateFacts(s: String): Either[Protected_Start_Power_Supervisor.SelfTestStateFacts, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestStateFacts(parser: Parser): Protected_Start_Power_Supervisor.SelfTestStateFacts = {
      val r = parser.parseProtected_Start_Power_SupervisorSelfTestStateFacts()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSelfTestStateFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestStateFacts_Payload(o: Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSelfTestStateFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSelfTestStateFacts_Payload(s: String): Either[Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestStateFacts_Payload(parser: Parser): Protected_Start_Power_Supervisor.SelfTestStateFacts_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorSelfTestStateFacts_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSelfTestStateFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSessionDecisionFacts(o: Protected_Start_Power_Supervisor.SessionDecisionFacts, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSessionDecisionFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSessionDecisionFacts(s: String): Either[Protected_Start_Power_Supervisor.SessionDecisionFacts, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSessionDecisionFacts(parser: Parser): Protected_Start_Power_Supervisor.SessionDecisionFacts = {
      val r = parser.parseProtected_Start_Power_SupervisorSessionDecisionFacts()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSessionDecisionFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSessionDecisionFacts_Payload(o: Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSessionDecisionFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSessionDecisionFacts_Payload(s: String): Either[Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSessionDecisionFacts_Payload(parser: Parser): Protected_Start_Power_Supervisor.SessionDecisionFacts_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorSessionDecisionFacts_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSessionDecisionFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmStateFacts(o: Protected_Start_Power_Supervisor.RearmStateFacts, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorRearmStateFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorRearmStateFacts(s: String): Either[Protected_Start_Power_Supervisor.RearmStateFacts, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmStateFacts(parser: Parser): Protected_Start_Power_Supervisor.RearmStateFacts = {
      val r = parser.parseProtected_Start_Power_SupervisorRearmStateFacts()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorRearmStateFacts _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmStateFacts_Payload(o: Protected_Start_Power_Supervisor.RearmStateFacts_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorRearmStateFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorRearmStateFacts_Payload(s: String): Either[Protected_Start_Power_Supervisor.RearmStateFacts_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmStateFacts_Payload(parser: Parser): Protected_Start_Power_Supervisor.RearmStateFacts_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorRearmStateFacts_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorRearmStateFacts_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorActuationDisposition(o: Protected_Start_Power_Supervisor.ActuationDisposition, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorActuationDisposition(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorActuationDisposition(s: String): Either[Protected_Start_Power_Supervisor.ActuationDisposition, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorActuationDisposition(parser: Parser): Protected_Start_Power_Supervisor.ActuationDisposition = {
      val r = parser.parseProtected_Start_Power_SupervisorActuationDisposition()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorActuationDisposition _)
    return r
  }

  def fromProtected_Start_Power_SupervisorActuationDisposition_Payload(o: Protected_Start_Power_Supervisor.ActuationDisposition_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorActuationDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorActuationDisposition_Payload(s: String): Either[Protected_Start_Power_Supervisor.ActuationDisposition_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorActuationDisposition_Payload(parser: Parser): Protected_Start_Power_Supervisor.ActuationDisposition_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorActuationDisposition_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorActuationDisposition_Payload _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupervisoryStatus(o: Protected_Start_Power_Supervisor.SupervisoryStatus, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSupervisoryStatus(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSupervisoryStatus(s: String): Either[Protected_Start_Power_Supervisor.SupervisoryStatus, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupervisoryStatus(parser: Parser): Protected_Start_Power_Supervisor.SupervisoryStatus = {
      val r = parser.parseProtected_Start_Power_SupervisorSupervisoryStatus()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSupervisoryStatus _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupervisoryStatus_Payload(o: Protected_Start_Power_Supervisor.SupervisoryStatus_Payload, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSupervisoryStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSupervisoryStatus_Payload(s: String): Either[Protected_Start_Power_Supervisor.SupervisoryStatus_Payload, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupervisoryStatus_Payload(parser: Parser): Protected_Start_Power_Supervisor.SupervisoryStatus_Payload = {
      val r = parser.parseProtected_Start_Power_SupervisorSupervisoryStatus_Payload()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSupervisoryStatus_Payload _)
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

  def fromProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container(s: String): Either[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container(parser: Parser): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container(s: String): Either[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container(parser: Parser): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorCommandQualificationOwner_protected_start_power_process_command_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container(s: String): Either[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container(parser: Parser): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container(s: String): Either[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container(parser: Parser): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorBrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container(s: String): Either[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container(parser: Parser): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container(s: String): Either[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container(parser: Parser): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.TemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorTemperatureQualificationOwner_protected_start_power_process_temperature_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container(s: String): Either[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container(parser: Parser): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container(s: String): Either[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container(parser: Parser): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container(s: String): Either[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container(parser: Parser): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container(s: String): Either[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container(parser: Parser): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.ParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorParkingBrakeQualificationOwner_protected_start_power_process_parking_brake_qualification_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container(s: String): Either[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container(parser: Parser): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container(s: String): Either[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container(parser: Parser): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.ThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorThermalClearanceStateOwner_protected_start_power_process_thermal_clearance_state_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container(s: String): Either[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container(parser: Parser): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container(s: String): Either[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container(parser: Parser): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container(s: String): Either[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container(parser: Parser): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container(s: String): Either[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container(parser: Parser): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorStartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container(s: String): Either[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container(parser: Parser): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container(s: String): Either[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container(parser: Parser): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container(s: String): Either[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container(parser: Parser): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container(s: String): Either[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container(parser: Parser): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.OperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorOperatingSessionStatePriorityOwner_protected_start_power_process_operating_session_state_priority_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container(s: String): Either[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container(parser: Parser): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container(s: String): Either[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container(parser: Parser): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.FaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorFaultVectorCompositionOwner_protected_start_power_process_fault_vector_composition_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container(s: String): Either[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container(parser: Parser): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container(s: String): Either[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container(parser: Parser): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorRearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container(s: String): Either[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container(parser: Parser): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container(s: String): Either[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container(parser: Parser): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_PostState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container(s: String): Either[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container(parser: Parser): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PreState_Container_PS _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container(s: String): Either[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container(parser: Parser): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container = {
      val r = parser.parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(s: String): Either[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P(parser: Parser): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P = {
      val r = parser.parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_P _)
    return r
  }

  def fromProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(o: Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(s: String): Either[Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS, Json.ErrorMsg] = {
    def fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS(parser: Parser): Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS = {
      val r = parser.parseProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS()
      return r
    }
    val r = to(s, fProtected_Start_Power_SupervisorSupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_PostState_Container_PS _)
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