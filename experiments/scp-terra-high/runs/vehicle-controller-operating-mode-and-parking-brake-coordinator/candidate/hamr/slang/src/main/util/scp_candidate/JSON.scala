// #Sireum
// @formatter:off

// This file is auto-generated from StartIndicationLevel.scala, OnIndicationLevel.scala, OffIndicationLevel.scala, IndicationLevel.scala, ConflictClass.scala, SelectedIndication.scala, RecoveryDecision.scala, PriorOperatingDemand.scala, OperatingDemand.scala, PriorMaintenanceSession.scala, MaintenanceSession.scala, PriorDegradedEpisode.scala, DegradedEpisode.scala, ControllerMode.scala, TransitionReason.scala, BrakeDemand.scala, PublishedControllerMode.scala, ParkingBrakeCommand.scala, LifecycleIndications.scala, LifecycleEpochFacts.scala, MaintenanceEpochFacts.scala, DegradationEpochFacts.scala, ReturnEpochFacts.scala, MaintenanceIndication.scala, DegradedIndication.scala, ReturnIndication.scala, DemandSnapshot.scala, MaintenanceSnapshot.scala, EpisodeSnapshot.scala, ModeDecision.scala, CoordinationFrame.scala, Base_Types.scala, LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_Containers.scala, MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_Containers.scala, DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_Containers.scala, ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_Containers.scala, ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_Containers.scala, IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_Containers.scala, OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_Containers.scala, MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_Containers.scala, DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_Containers.scala, RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_Containers.scala, ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_Containers.scala, ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_Containers.scala, OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevelType(o: Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.Clear => "Clear"
        case Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.Asserted => "Asserted"
        case Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevelType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevelType(o: Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.Clear => "Clear"
        case Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.Asserted => "Asserted"
        case Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevelType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevelType(o: Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.Clear => "Clear"
        case Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.Asserted => "Asserted"
        case Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevelType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Clear => "Clear"
        case Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Asserted => "Asserted"
        case Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.InputInvalid => "InputInvalid"
        case Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.MultipleActionable => "MultipleActionable"
        case Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.SingleOrNone => "SingleOrNone"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o: Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.InvalidSelected => "InvalidSelected"
        case Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.DegradedSelected => "DegradedSelected"
        case Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.OffSelected => "OffSelected"
        case Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.MaintenanceSelected => "MaintenanceSelected"
        case Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.ReturnSelected => "ReturnSelected"
        case Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.OnSelected => "OnSelected"
        case Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.StartSelected => "StartSelected"
        case Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.NoneSelected => "NoneSelected"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.NotApplicable => "NotApplicable"
        case Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Arm => "Arm"
        case Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Confirm => "Confirm"
        case Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Cancel => "Cancel"
        case Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Wait => "Wait"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemandType(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand.Dormant => "Dormant"
        case Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand.Staged => "Staged"
        case Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand.RunRequested => "RunRequested"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemandType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandType(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Dormant => "Dormant"
        case Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Staged => "Staged"
        case Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.RunRequested => "RunRequested"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSessionType(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession.Inactive => "Inactive"
        case Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession.Active => "Active"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSessionType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionType(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.Inactive => "Inactive"
        case Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.Active => "Active"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisodeType(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode.ClearEpisode => "ClearEpisode"
        case Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode.Latched => "Latched"
        case Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode.ReturnArmed => "ReturnArmed"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisodeType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeType(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.ClearEpisode => "ClearEpisode"
        case Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.Latched => "Latched"
        case Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.ReturnArmed => "ReturnArmed"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorControllerModeType(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Off => "Off"
        case Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Standby => "Standby"
        case Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Operating => "Operating"
        case Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Maintenance => "Maintenance"
        case Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Degraded => "Degraded"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorControllerModeType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorTransitionReasonType(o: Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.FaultDominant => "FaultDominant"
        case Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.MaintenanceDominant => "MaintenanceDominant"
        case Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.StartStaged => "StartStaged"
        case Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.RecoveryConfirmed => "RecoveryConfirmed"
        case Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.RunRequested => "RunRequested"
        case Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.DormantDemand => "DormantDemand"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorTransitionReasonType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType(o: Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.RequireApply => "RequireApply"
        case Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.AllowRelease => "AllowRelease"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerModeType(o: Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode.Off => "Off"
        case Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode.Standby => "Standby"
        case Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode.Operating => "Operating"
        case Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode.Maintenance => "Maintenance"
        case Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode.Degraded => "Degraded"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerModeType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommandType(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand.Type): ST = {
      val value: String = o match {
        case Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand.Apply => "Apply"
        case Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand.Release => "Release"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommandType(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications""""),
        ("startLevel", printVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevelType(o.startLevel)),
        ("onLevel", printVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevelType(o.onLevel)),
        ("offLevel", printVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevelType(o.offLevel))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts""""),
        ("freshStart", printB(o.freshStart)),
        ("freshOn", printB(o.freshOn)),
        ("offActive", printB(o.offActive)),
        ("heldStart", printB(o.heldStart)),
        ("heldOn", printB(o.heldOn)),
        ("heldOff", printB(o.heldOff)),
        ("anyInvalid", printB(o.anyInvalid))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts""""),
        ("active", printB(o.active)),
        ("fresh", printB(o.fresh)),
        ("cleared", printB(o.cleared)),
        ("held", printB(o.held)),
        ("invalid", printB(o.invalid))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts""""),
        ("active", printB(o.active)),
        ("fresh", printB(o.fresh)),
        ("cleared", printB(o.cleared)),
        ("held", printB(o.held)),
        ("invalid", printB(o.invalid))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts""""),
        ("fresh", printB(o.fresh)),
        ("held", printB(o.held)),
        ("clear", printB(o.clear)),
        ("invalid", printB(o.invalid))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication""""),
        ("level", printVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType(o.level))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication""""),
        ("level", printVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType(o.level))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication""""),
        ("level", printVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType(o.level))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(o: Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot""""),
        ("currentDemand", printVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemandType(o.currentDemand)),
        ("nextDemand", printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandType(o.nextDemand))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot""""),
        ("currentSession", printVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSessionType(o.currentSession)),
        ("nextSession", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionType(o.nextSession))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o: Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot""""),
        ("currentEpisode", printVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisodeType(o.currentEpisode)),
        ("nextEpisode", printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeType(o.nextEpisode))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorModeDecision(o: Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision""""),
        ("nextMode", printVehicle_Controller_Operating_Mode_CoordinatorControllerModeType(o.nextMode)),
        ("reason", printVehicle_Controller_Operating_Mode_CoordinatorTransitionReasonType(o.reason))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorModeDecision(o.value))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(o: Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame""""),
        ("mode", printVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerModeType(o.mode)),
        ("parkingBrake", printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommandType(o.parkingBrake))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload""""),
        ("value", printVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(o.value))
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

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P""""),
        ("api_lifecycleIndications", printVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(o.api_lifecycleIndications))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS""""),
        ("api_lifecycleIndications", printVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(o.api_lifecycleIndications))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P""""),
        ("api_factsToConflict", printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.api_factsToConflict)),
        ("api_factsToPriority", printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.api_factsToPriority))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS""""),
        ("api_factsToConflict", printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.api_factsToConflict)),
        ("api_factsToPriority", printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.api_factsToPriority))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P""""),
        ("api_maintenanceIndication", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(o.api_maintenanceIndication))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS""""),
        ("api_maintenanceIndication", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(o.api_maintenanceIndication))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P""""),
        ("api_factsToConflict", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_factsToConflict)),
        ("api_factsToPriority", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_factsToPriority)),
        ("api_factsToSession", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_factsToSession))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS""""),
        ("api_factsToConflict", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_factsToConflict)),
        ("api_factsToPriority", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_factsToPriority)),
        ("api_factsToSession", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_factsToSession))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P""""),
        ("api_degradedIndication", printVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(o.api_degradedIndication))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS""""),
        ("api_degradedIndication", printVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(o.api_degradedIndication))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P""""),
        ("api_factsToConflict", printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_factsToConflict)),
        ("api_factsToEpisode", printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_factsToEpisode)),
        ("api_factsToPriority", printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_factsToPriority)),
        ("api_factsToRecovery", printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_factsToRecovery))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS""""),
        ("api_factsToConflict", printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_factsToConflict)),
        ("api_factsToEpisode", printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_factsToEpisode)),
        ("api_factsToPriority", printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_factsToPriority)),
        ("api_factsToRecovery", printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_factsToRecovery))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P""""),
        ("api_returnIndication", printVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(o.api_returnIndication))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS""""),
        ("api_returnIndication", printVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(o.api_returnIndication))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P""""),
        ("api_factsToConflict", printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_factsToConflict)),
        ("api_factsToPriority", printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_factsToPriority)),
        ("api_factsToRecovery", printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_factsToRecovery))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS""""),
        ("api_factsToConflict", printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_factsToConflict)),
        ("api_factsToPriority", printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_factsToPriority)),
        ("api_factsToRecovery", printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_factsToRecovery))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P""""),
        ("api_degradationFacts", printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_degradationFacts)),
        ("api_lifecycleFacts", printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.api_lifecycleFacts)),
        ("api_maintenanceFacts", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_maintenanceFacts)),
        ("api_returnFacts", printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_returnFacts))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS""""),
        ("api_degradationFacts", printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_degradationFacts)),
        ("api_lifecycleFacts", printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.api_lifecycleFacts)),
        ("api_maintenanceFacts", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_maintenanceFacts)),
        ("api_returnFacts", printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_returnFacts))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P""""),
        ("api_conflictToPriority", printVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.api_conflictToPriority)),
        ("api_conflictToRecovery", printVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.api_conflictToRecovery))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS""""),
        ("api_conflictToPriority", printVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.api_conflictToPriority)),
        ("api_conflictToRecovery", printVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.api_conflictToRecovery))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P""""),
        ("api_conflictClass", printVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.api_conflictClass)),
        ("api_degradationFacts", printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_degradationFacts)),
        ("api_lifecycleFacts", printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.api_lifecycleFacts)),
        ("api_maintenanceFacts", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_maintenanceFacts)),
        ("api_returnFacts", printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_returnFacts))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS""""),
        ("api_conflictClass", printVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.api_conflictClass)),
        ("api_degradationFacts", printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_degradationFacts)),
        ("api_lifecycleFacts", printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o.api_lifecycleFacts)),
        ("api_maintenanceFacts", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_maintenanceFacts)),
        ("api_returnFacts", printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_returnFacts))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P""""),
        ("api_selectionToBrake", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToBrake)),
        ("api_selectionToDemand", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToDemand)),
        ("api_selectionToEpisode", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToEpisode)),
        ("api_selectionToRecovery", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToRecovery)),
        ("api_selectionToSession", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToSession))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS""""),
        ("api_selectionToBrake", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToBrake)),
        ("api_selectionToDemand", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToDemand)),
        ("api_selectionToEpisode", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToEpisode)),
        ("api_selectionToRecovery", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToRecovery)),
        ("api_selectionToSession", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectionToSession))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P""""),
        ("api_recoveryDecision", printVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_recoveryDecision)),
        ("api_selectedIndication", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS""""),
        ("api_recoveryDecision", printVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_recoveryDecision)),
        ("api_selectedIndication", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P""""),
        ("api_demandSnapshot", printVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(o.api_demandSnapshot))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS""""),
        ("api_demandSnapshot", printVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(o.api_demandSnapshot))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P""""),
        ("api_maintenanceFacts", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_maintenanceFacts)),
        ("api_selectedIndication", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS""""),
        ("api_maintenanceFacts", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o.api_maintenanceFacts)),
        ("api_selectedIndication", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P""""),
        ("api_maintenanceSnapshot", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.api_maintenanceSnapshot)),
        ("api_snapshotToBrake", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.api_snapshotToBrake))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS""""),
        ("api_maintenanceSnapshot", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.api_maintenanceSnapshot)),
        ("api_snapshotToBrake", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.api_snapshotToBrake))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P""""),
        ("api_degradationFacts", printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_degradationFacts)),
        ("api_recoveryDecision", printVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_recoveryDecision)),
        ("api_selectedIndication", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS""""),
        ("api_degradationFacts", printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_degradationFacts)),
        ("api_recoveryDecision", printVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_recoveryDecision)),
        ("api_selectedIndication", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P""""),
        ("api_snapshotToBrake", printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_snapshotToBrake)),
        ("api_snapshotToMode", printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_snapshotToMode)),
        ("api_snapshotToRecovery", printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_snapshotToRecovery))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS""""),
        ("api_snapshotToBrake", printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_snapshotToBrake)),
        ("api_snapshotToMode", printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_snapshotToMode)),
        ("api_snapshotToRecovery", printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_snapshotToRecovery))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P""""),
        ("api_conflictClass", printVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.api_conflictClass)),
        ("api_degradationFacts", printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_degradationFacts)),
        ("api_episodeSnapshot", printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_episodeSnapshot)),
        ("api_returnFacts", printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_returnFacts)),
        ("api_selectedIndication", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS""""),
        ("api_conflictClass", printVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(o.api_conflictClass)),
        ("api_degradationFacts", printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o.api_degradationFacts)),
        ("api_episodeSnapshot", printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_episodeSnapshot)),
        ("api_returnFacts", printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o.api_returnFacts)),
        ("api_selectedIndication", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P""""),
        ("api_decisionToDemand", printVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_decisionToDemand)),
        ("api_decisionToEpisode", printVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_decisionToEpisode)),
        ("api_decisionToMode", printVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_decisionToMode))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS""""),
        ("api_decisionToDemand", printVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_decisionToDemand)),
        ("api_decisionToEpisode", printVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_decisionToEpisode)),
        ("api_decisionToMode", printVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_decisionToMode))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P""""),
        ("api_demandSnapshot", printVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(o.api_demandSnapshot)),
        ("api_episodeSnapshot", printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_episodeSnapshot)),
        ("api_maintenanceSnapshot", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.api_maintenanceSnapshot)),
        ("api_recoveryDecision", printVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_recoveryDecision))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS""""),
        ("api_demandSnapshot", printVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(o.api_demandSnapshot)),
        ("api_episodeSnapshot", printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_episodeSnapshot)),
        ("api_maintenanceSnapshot", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.api_maintenanceSnapshot)),
        ("api_recoveryDecision", printVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(o.api_recoveryDecision))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P""""),
        ("api_modeDecision", printVehicle_Controller_Operating_Mode_CoordinatorModeDecision(o.api_modeDecision))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS""""),
        ("api_modeDecision", printVehicle_Controller_Operating_Mode_CoordinatorModeDecision(o.api_modeDecision))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P""""),
        ("api_episodeSnapshot", printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_episodeSnapshot)),
        ("api_maintenanceSnapshot", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.api_maintenanceSnapshot)),
        ("api_selectedIndication", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS""""),
        ("api_episodeSnapshot", printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o.api_episodeSnapshot)),
        ("api_maintenanceSnapshot", printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o.api_maintenanceSnapshot)),
        ("api_selectedIndication", printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(o.api_selectedIndication))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P""""),
        ("api_brakeDemand", printVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType(o.api_brakeDemand))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS""""),
        ("api_brakeDemand", printVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType(o.api_brakeDemand))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P""""),
        ("api_brakeDemand", printVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType(o.api_brakeDemand)),
        ("api_modeDecision", printVehicle_Controller_Operating_Mode_CoordinatorModeDecision(o.api_modeDecision))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS""""),
        ("api_brakeDemand", printVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType(o.api_brakeDemand)),
        ("api_modeDecision", printVehicle_Controller_Operating_Mode_CoordinatorModeDecision(o.api_modeDecision))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P""""),
        ("api_coordinationFrame", printVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(o.api_coordinationFrame))
      ))
    }

    @pure def printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS""""),
        ("api_coordinationFrame", printVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(o.api_coordinationFrame))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_lifecycleEpochOwner_postInit => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_lifecycleEpochOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_lifecycleEpochOwner_preCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_lifecycleEpochOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_lifecycleEpochOwner_postCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_lifecycleEpochOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_maintenanceEpochOwner_postInit => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_maintenanceEpochOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_maintenanceEpochOwner_preCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_maintenanceEpochOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_maintenanceEpochOwner_postCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_maintenanceEpochOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_degradationEpochOwner_postInit => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_degradationEpochOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_degradationEpochOwner_preCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_degradationEpochOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_degradationEpochOwner_postCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_degradationEpochOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_returnEpochOwner_postInit => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_returnEpochOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_returnEpochOwner_preCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_returnEpochOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_returnEpochOwner_postCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_returnEpochOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_conflictClassificationOwner_postInit => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_conflictClassificationOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_conflictClassificationOwner_preCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_conflictClassificationOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_conflictClassificationOwner_postCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_conflictClassificationOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_indicationPriorityOwner_postInit => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_indicationPriorityOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_indicationPriorityOwner_preCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_indicationPriorityOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_indicationPriorityOwner_postCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_indicationPriorityOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_operatingDemandOwner_postInit => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_operatingDemandOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_operatingDemandOwner_preCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_operatingDemandOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_operatingDemandOwner_postCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_operatingDemandOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_maintenanceSessionOwner_postInit => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_maintenanceSessionOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_maintenanceSessionOwner_preCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_maintenanceSessionOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_maintenanceSessionOwner_postCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_maintenanceSessionOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_degradedEpisodeOwner_postInit => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_degradedEpisodeOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_degradedEpisodeOwner_preCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_degradedEpisodeOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_degradedEpisodeOwner_postCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_degradedEpisodeOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_recoveryEligibilityOwner_postInit => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_recoveryEligibilityOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_recoveryEligibilityOwner_preCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_recoveryEligibilityOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_recoveryEligibilityOwner_postCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_recoveryEligibilityOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_controllerModeTransitionOwner_postInit => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_controllerModeTransitionOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_controllerModeTransitionOwner_preCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_controllerModeTransitionOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_controllerModeTransitionOwner_postCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_controllerModeTransitionOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_parkingBrakeDemandOwner_postInit => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_parkingBrakeDemandOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_parkingBrakeDemandOwner_preCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_parkingBrakeDemandOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_parkingBrakeDemandOwner_postCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_parkingBrakeDemandOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_outcomeCoherenceOwner_postInit => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_outcomeCoherenceOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_outcomeCoherenceOwner_preCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_outcomeCoherenceOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_outcomeCoherenceOwner_postCompute => "VehicleControllerOperatingModeCoordinatorSystem_Instance_modeCoordinationProcess_outcomeCoherenceOwner_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(o)
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
        case o: Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload => return printVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P => return printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(o)
        case o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS => return printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(o)
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

    def parseVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevelType(): Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevelT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevelT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.")
          return Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevelType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevelType(): Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevelT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevelT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.")
          return Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevelType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevelType(): Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevelT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevelT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.")
          return Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevelType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType(): Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.")
          return Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassType(): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.")
          return Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClass_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorConflictClass_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType(): Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.")
          return Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType(): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.")
          return Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemandType(): Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemandT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemandT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand.")
          return Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemandType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandType(): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.")
          return Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSessionType(): Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSessionT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSessionT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession.")
          return Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSessionType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionType(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.")
          return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisodeType(): Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisodeT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisodeT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode.")
          return Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisodeType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeType(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.")
          return Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeType(): Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.")
          return Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerMode_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorControllerMode_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorTransitionReasonType(): Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorTransitionReasonT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorTransitionReasonT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.")
          return Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorTransitionReasonType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType(): Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.")
          return Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerModeType(): Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerModeT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerModeT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode.")
          return Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerModeType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommandType(): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand.Type = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommandT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommandT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand.")
          return Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand.byOrdinal(0).get
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommandType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndicationsT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndicationsT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications")
      }
      parser.parseObjectKey("startLevel")
      val startLevel = parseVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevelType()
      parser.parseObjectNext()
      parser.parseObjectKey("onLevel")
      val onLevel = parseVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevelType()
      parser.parseObjectNext()
      parser.parseObjectKey("offLevel")
      val offLevel = parseVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevelType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications(startLevel, onLevel, offLevel)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFactsT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFactsT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts")
      }
      parser.parseObjectKey("freshStart")
      val freshStart = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("freshOn")
      val freshOn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("offActive")
      val offActive = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("heldStart")
      val heldStart = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("heldOn")
      val heldOn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("heldOff")
      val heldOff = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("anyInvalid")
      val anyInvalid = parser.parseB()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts(freshStart, freshOn, offActive, heldStart, heldOn, heldOff, anyInvalid)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFactsT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFactsT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts")
      }
      parser.parseObjectKey("active")
      val active = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("fresh")
      val fresh = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("cleared")
      val cleared = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("held")
      val held = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("invalid")
      val invalid = parser.parseB()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts(active, fresh, cleared, held, invalid)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFactsT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFactsT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts")
      }
      parser.parseObjectKey("active")
      val active = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("fresh")
      val fresh = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("cleared")
      val cleared = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("held")
      val held = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("invalid")
      val invalid = parser.parseB()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts(active, fresh, cleared, held, invalid)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFactsT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFactsT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts")
      }
      parser.parseObjectKey("fresh")
      val fresh = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("held")
      val held = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("clear")
      val clear = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("invalid")
      val invalid = parser.parseB()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts(fresh, held, clear, invalid)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndicationT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndicationT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication")
      }
      parser.parseObjectKey("level")
      val level = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication(level)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedIndicationT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedIndicationT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication")
      }
      parser.parseObjectKey("level")
      val level = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication(level)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnIndicationT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnIndicationT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication")
      }
      parser.parseObjectKey("level")
      val level = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationLevelType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication(level)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorReturnIndication()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(): Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshotT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshotT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot")
      }
      parser.parseObjectKey("currentDemand")
      val currentDemand = parseVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemandType()
      parser.parseObjectNext()
      parser.parseObjectKey("nextDemand")
      val nextDemand = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot(currentDemand, nextDemand)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshotT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshotT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot")
      }
      parser.parseObjectKey("currentSession")
      val currentSession = parseVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSessionType()
      parser.parseObjectNext()
      parser.parseObjectKey("nextSession")
      val nextSession = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot(currentSession, nextSession)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(): Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshotT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshotT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot")
      }
      parser.parseObjectKey("currentEpisode")
      val currentEpisode = parseVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisodeType()
      parser.parseObjectNext()
      parser.parseObjectKey("nextEpisode")
      val nextEpisode = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot(currentEpisode, nextEpisode)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorModeDecision(): Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorModeDecisionT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorModeDecisionT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision")
      }
      parser.parseObjectKey("nextMode")
      val nextMode = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("reason")
      val reason = parseVehicle_Controller_Operating_Mode_CoordinatorTransitionReasonType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision(nextMode, reason)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorModeDecision_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorModeDecision_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorModeDecision()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload(value)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(): Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrameT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrameT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame")
      }
      parser.parseObjectKey("mode")
      val mode = parseVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("parkingBrake")
      val parkingBrake = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommandType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame(mode, parkingBrake)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload(): Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_PayloadT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_PayloadT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload(value)
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

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_lifecycleIndications")
      val api_lifecycleIndications = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(api_lifecycleIndications)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_lifecycleIndications")
      val api_lifecycleIndications = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(api_lifecycleIndications)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_factsToConflict")
      val api_factsToConflict = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToPriority")
      val api_factsToPriority = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(api_factsToConflict, api_factsToPriority)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_factsToConflict")
      val api_factsToConflict = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToPriority")
      val api_factsToPriority = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(api_factsToConflict, api_factsToPriority)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_maintenanceIndication")
      val api_maintenanceIndication = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(api_maintenanceIndication)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_maintenanceIndication")
      val api_maintenanceIndication = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(api_maintenanceIndication)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_factsToConflict")
      val api_factsToConflict = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToPriority")
      val api_factsToPriority = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToSession")
      val api_factsToSession = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(api_factsToConflict, api_factsToPriority, api_factsToSession)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_factsToConflict")
      val api_factsToConflict = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToPriority")
      val api_factsToPriority = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToSession")
      val api_factsToSession = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(api_factsToConflict, api_factsToPriority, api_factsToSession)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_degradedIndication")
      val api_degradedIndication = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(api_degradedIndication)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_degradedIndication")
      val api_degradedIndication = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(api_degradedIndication)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_factsToConflict")
      val api_factsToConflict = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToEpisode")
      val api_factsToEpisode = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToPriority")
      val api_factsToPriority = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToRecovery")
      val api_factsToRecovery = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(api_factsToConflict, api_factsToEpisode, api_factsToPriority, api_factsToRecovery)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_factsToConflict")
      val api_factsToConflict = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToEpisode")
      val api_factsToEpisode = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToPriority")
      val api_factsToPriority = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToRecovery")
      val api_factsToRecovery = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(api_factsToConflict, api_factsToEpisode, api_factsToPriority, api_factsToRecovery)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_returnIndication")
      val api_returnIndication = parseVehicle_Controller_Operating_Mode_CoordinatorReturnIndication()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(api_returnIndication)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_returnIndication")
      val api_returnIndication = parseVehicle_Controller_Operating_Mode_CoordinatorReturnIndication()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(api_returnIndication)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_factsToConflict")
      val api_factsToConflict = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToPriority")
      val api_factsToPriority = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToRecovery")
      val api_factsToRecovery = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(api_factsToConflict, api_factsToPriority, api_factsToRecovery)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_factsToConflict")
      val api_factsToConflict = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToPriority")
      val api_factsToPriority = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_factsToRecovery")
      val api_factsToRecovery = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(api_factsToConflict, api_factsToPriority, api_factsToRecovery)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_degradationFacts")
      val api_degradationFacts = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleFacts")
      val api_lifecycleFacts = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_maintenanceFacts")
      val api_maintenanceFacts = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_returnFacts")
      val api_returnFacts = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(api_degradationFacts, api_lifecycleFacts, api_maintenanceFacts, api_returnFacts)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_degradationFacts")
      val api_degradationFacts = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleFacts")
      val api_lifecycleFacts = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_maintenanceFacts")
      val api_maintenanceFacts = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_returnFacts")
      val api_returnFacts = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(api_degradationFacts, api_lifecycleFacts, api_maintenanceFacts, api_returnFacts)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_conflictToPriority")
      val api_conflictToPriority = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_conflictToRecovery")
      val api_conflictToRecovery = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(api_conflictToPriority, api_conflictToRecovery)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_conflictToPriority")
      val api_conflictToPriority = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_conflictToRecovery")
      val api_conflictToRecovery = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(api_conflictToPriority, api_conflictToRecovery)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_conflictClass")
      val api_conflictClass = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_degradationFacts")
      val api_degradationFacts = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleFacts")
      val api_lifecycleFacts = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_maintenanceFacts")
      val api_maintenanceFacts = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_returnFacts")
      val api_returnFacts = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(api_conflictClass, api_degradationFacts, api_lifecycleFacts, api_maintenanceFacts, api_returnFacts)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_conflictClass")
      val api_conflictClass = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_degradationFacts")
      val api_degradationFacts = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleFacts")
      val api_lifecycleFacts = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_maintenanceFacts")
      val api_maintenanceFacts = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_returnFacts")
      val api_returnFacts = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(api_conflictClass, api_degradationFacts, api_lifecycleFacts, api_maintenanceFacts, api_returnFacts)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_selectionToBrake")
      val api_selectionToBrake = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectionToDemand")
      val api_selectionToDemand = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectionToEpisode")
      val api_selectionToEpisode = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectionToRecovery")
      val api_selectionToRecovery = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectionToSession")
      val api_selectionToSession = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(api_selectionToBrake, api_selectionToDemand, api_selectionToEpisode, api_selectionToRecovery, api_selectionToSession)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_selectionToBrake")
      val api_selectionToBrake = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectionToDemand")
      val api_selectionToDemand = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectionToEpisode")
      val api_selectionToEpisode = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectionToRecovery")
      val api_selectionToRecovery = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectionToSession")
      val api_selectionToSession = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(api_selectionToBrake, api_selectionToDemand, api_selectionToEpisode, api_selectionToRecovery, api_selectionToSession)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_recoveryDecision")
      val api_recoveryDecision = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectedIndication")
      val api_selectedIndication = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(api_recoveryDecision, api_selectedIndication)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_recoveryDecision")
      val api_recoveryDecision = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectedIndication")
      val api_selectedIndication = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(api_recoveryDecision, api_selectedIndication)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_demandSnapshot")
      val api_demandSnapshot = parseVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(api_demandSnapshot)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_demandSnapshot")
      val api_demandSnapshot = parseVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(api_demandSnapshot)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_maintenanceFacts")
      val api_maintenanceFacts = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectedIndication")
      val api_selectedIndication = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(api_maintenanceFacts, api_selectedIndication)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_maintenanceFacts")
      val api_maintenanceFacts = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectedIndication")
      val api_selectedIndication = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(api_maintenanceFacts, api_selectedIndication)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_maintenanceSnapshot")
      val api_maintenanceSnapshot = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_snapshotToBrake")
      val api_snapshotToBrake = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(api_maintenanceSnapshot, api_snapshotToBrake)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_maintenanceSnapshot")
      val api_maintenanceSnapshot = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_snapshotToBrake")
      val api_snapshotToBrake = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(api_maintenanceSnapshot, api_snapshotToBrake)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_degradationFacts")
      val api_degradationFacts = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryDecision")
      val api_recoveryDecision = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectedIndication")
      val api_selectedIndication = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(api_degradationFacts, api_recoveryDecision, api_selectedIndication)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_degradationFacts")
      val api_degradationFacts = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryDecision")
      val api_recoveryDecision = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectedIndication")
      val api_selectedIndication = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(api_degradationFacts, api_recoveryDecision, api_selectedIndication)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_snapshotToBrake")
      val api_snapshotToBrake = parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_snapshotToMode")
      val api_snapshotToMode = parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_snapshotToRecovery")
      val api_snapshotToRecovery = parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(api_snapshotToBrake, api_snapshotToMode, api_snapshotToRecovery)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_snapshotToBrake")
      val api_snapshotToBrake = parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_snapshotToMode")
      val api_snapshotToMode = parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_snapshotToRecovery")
      val api_snapshotToRecovery = parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(api_snapshotToBrake, api_snapshotToMode, api_snapshotToRecovery)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_conflictClass")
      val api_conflictClass = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_degradationFacts")
      val api_degradationFacts = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_episodeSnapshot")
      val api_episodeSnapshot = parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_returnFacts")
      val api_returnFacts = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectedIndication")
      val api_selectedIndication = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(api_conflictClass, api_degradationFacts, api_episodeSnapshot, api_returnFacts, api_selectedIndication)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_conflictClass")
      val api_conflictClass = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_degradationFacts")
      val api_degradationFacts = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_episodeSnapshot")
      val api_episodeSnapshot = parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_returnFacts")
      val api_returnFacts = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectedIndication")
      val api_selectedIndication = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(api_conflictClass, api_degradationFacts, api_episodeSnapshot, api_returnFacts, api_selectedIndication)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_decisionToDemand")
      val api_decisionToDemand = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decisionToEpisode")
      val api_decisionToEpisode = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decisionToMode")
      val api_decisionToMode = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(api_decisionToDemand, api_decisionToEpisode, api_decisionToMode)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_decisionToDemand")
      val api_decisionToDemand = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decisionToEpisode")
      val api_decisionToEpisode = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decisionToMode")
      val api_decisionToMode = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(api_decisionToDemand, api_decisionToEpisode, api_decisionToMode)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_demandSnapshot")
      val api_demandSnapshot = parseVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_episodeSnapshot")
      val api_episodeSnapshot = parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_maintenanceSnapshot")
      val api_maintenanceSnapshot = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryDecision")
      val api_recoveryDecision = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(api_demandSnapshot, api_episodeSnapshot, api_maintenanceSnapshot, api_recoveryDecision)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_demandSnapshot")
      val api_demandSnapshot = parseVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_episodeSnapshot")
      val api_episodeSnapshot = parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_maintenanceSnapshot")
      val api_maintenanceSnapshot = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryDecision")
      val api_recoveryDecision = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecisionType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(api_demandSnapshot, api_episodeSnapshot, api_maintenanceSnapshot, api_recoveryDecision)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_modeDecision")
      val api_modeDecision = parseVehicle_Controller_Operating_Mode_CoordinatorModeDecision()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(api_modeDecision)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_modeDecision")
      val api_modeDecision = parseVehicle_Controller_Operating_Mode_CoordinatorModeDecision()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(api_modeDecision)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_episodeSnapshot")
      val api_episodeSnapshot = parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_maintenanceSnapshot")
      val api_maintenanceSnapshot = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectedIndication")
      val api_selectedIndication = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(api_episodeSnapshot, api_maintenanceSnapshot, api_selectedIndication)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_episodeSnapshot")
      val api_episodeSnapshot = parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_maintenanceSnapshot")
      val api_maintenanceSnapshot = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_selectedIndication")
      val api_selectedIndication = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndicationType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(api_episodeSnapshot, api_maintenanceSnapshot, api_selectedIndication)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_brakeDemand")
      val api_brakeDemand = parseVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(api_brakeDemand)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_brakeDemand")
      val api_brakeDemand = parseVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(api_brakeDemand)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_brakeDemand")
      val api_brakeDemand = parseVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_modeDecision")
      val api_modeDecision = parseVehicle_Controller_Operating_Mode_CoordinatorModeDecision()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(api_brakeDemand, api_modeDecision)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_brakeDemand")
      val api_brakeDemand = parseVehicle_Controller_Operating_Mode_CoordinatorBrakeDemandType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_modeDecision")
      val api_modeDecision = parseVehicle_Controller_Operating_Mode_CoordinatorModeDecision()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(api_brakeDemand, api_modeDecision)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container(): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PT(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_coordinationFrame")
      val api_coordinationFrame = parseVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(api_coordinationFrame)
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS = {
      val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PST(typeParsed: B): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_coordinationFrame")
      val api_coordinationFrame = parseVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame()
      parser.parseObjectNext()
      return Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(api_coordinationFrame)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload", "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS", "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P", "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS"))
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
        case "Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorModeDecision_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClass_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerMode_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_PayloadT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PST(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PT(T); return r
        case "Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS" => val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PST(T); return r
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

  def fromVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorStartIndicationLevel_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorOnIndicationLevel_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorOffIndicationLevel_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorIndicationLevel_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorConflictClass_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorSelectedIndication_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorRecoveryDecision_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.PriorOperatingDemand_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorPriorOperatingDemand_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemand_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.PriorMaintenanceSession_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorPriorMaintenanceSession_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSession_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.PriorDegradedEpisode_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorPriorDegradedEpisode_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisode_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorControllerMode_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.TransitionReason_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorTransitionReason_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorBrakeDemand_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.PublishedControllerMode_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorPublishedControllerMode_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeCommand_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeCommand_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleIndications_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochFacts_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochFacts_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochFacts_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochFacts_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceIndication_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDegradedIndication_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnIndication(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorReturnIndication()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorReturnIndication _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorReturnIndication_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(o: Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDemandSnapshot_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSnapshot_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o: Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorEpisodeSnapshot_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorModeDecision(o: Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorModeDecision(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorModeDecision(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorModeDecision(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorModeDecision()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorModeDecision _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorModeDecision_Payload _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(o: Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload(o: Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame_Payload = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorCoordinationFrame_Payload _)
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

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorLifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorIndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorOperatingDemandOwner_modeCoordinationProcess_operatingDemandOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorMaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorDegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorRecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(o: Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(s: String): Either[Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS(parser: Parser): Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Controller_Operating_Mode_CoordinatorOutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_PostState_Container_PS _)
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