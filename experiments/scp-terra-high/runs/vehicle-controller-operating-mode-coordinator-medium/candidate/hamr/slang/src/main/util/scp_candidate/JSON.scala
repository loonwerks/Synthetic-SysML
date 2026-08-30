// #Sireum
// @formatter:off

// This file is auto-generated from ReportedCondition.scala, ReportCurrency.scala, ConditionAssessment.scala, SelectedIntent.scala, ControllerMode.scala, TransitionKind.scala, ParkingBrakeDisposition.scala, CoordinationStatus.scala, RecoveryTarget.scala, QualifiedTransition.scala, LifecycleLevels.scala, LifecycleFacts.scala, ServiceLevels.scala, ServiceFacts.scala, ConditionEvidence.scala, ArbitrationResult.scala, TransitionResolution.scala, CoordinationOutcome.scala, Base_Types.scala, LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_Containers.scala, ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_Containers.scala, ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_Containers.scala, IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_Containers.scala, CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_Containers.scala, RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_Containers.scala, TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_Containers.scala, ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printVehicle_Mode_CoordinatorReportedConditionType(o: Vehicle_Mode_Coordinator.ReportedCondition.Type): ST = {
      val value: String = o match {
        case Vehicle_Mode_Coordinator.ReportedCondition.Normal => "Normal"
        case Vehicle_Mode_Coordinator.ReportedCondition.Degraded => "Degraded"
        case Vehicle_Mode_Coordinator.ReportedCondition.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Mode_Coordinator.ReportedCondition")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorReportedCondition_Payload(o: Vehicle_Mode_Coordinator.ReportedCondition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ReportedCondition_Payload""""),
        ("value", printVehicle_Mode_CoordinatorReportedConditionType(o.value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorReportCurrencyType(o: Vehicle_Mode_Coordinator.ReportCurrency.Type): ST = {
      val value: String = o match {
        case Vehicle_Mode_Coordinator.ReportCurrency.Current => "Current"
        case Vehicle_Mode_Coordinator.ReportCurrency.Stale => "Stale"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Mode_Coordinator.ReportCurrency")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorReportCurrency_Payload(o: Vehicle_Mode_Coordinator.ReportCurrency_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ReportCurrency_Payload""""),
        ("value", printVehicle_Mode_CoordinatorReportCurrencyType(o.value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorConditionAssessmentType(o: Vehicle_Mode_Coordinator.ConditionAssessment.Type): ST = {
      val value: String = o match {
        case Vehicle_Mode_Coordinator.ConditionAssessment.CurrentNormal => "CurrentNormal"
        case Vehicle_Mode_Coordinator.ConditionAssessment.CurrentDegraded => "CurrentDegraded"
        case Vehicle_Mode_Coordinator.ConditionAssessment.Unusable => "Unusable"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Mode_Coordinator.ConditionAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorConditionAssessment_Payload(o: Vehicle_Mode_Coordinator.ConditionAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ConditionAssessment_Payload""""),
        ("value", printVehicle_Mode_CoordinatorConditionAssessmentType(o.value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorSelectedIntentType(o: Vehicle_Mode_Coordinator.SelectedIntent.Type): ST = {
      val value: String = o match {
        case Vehicle_Mode_Coordinator.SelectedIntent.SelectOff => "SelectOff"
        case Vehicle_Mode_Coordinator.SelectedIntent.SelectInvalidDegraded => "SelectInvalidDegraded"
        case Vehicle_Mode_Coordinator.SelectedIntent.SelectConditionDegraded => "SelectConditionDegraded"
        case Vehicle_Mode_Coordinator.SelectedIntent.SelectMaintenance => "SelectMaintenance"
        case Vehicle_Mode_Coordinator.SelectedIntent.SelectReturn => "SelectReturn"
        case Vehicle_Mode_Coordinator.SelectedIntent.SelectOn => "SelectOn"
        case Vehicle_Mode_Coordinator.SelectedIntent.SelectStart => "SelectStart"
        case Vehicle_Mode_Coordinator.SelectedIntent.SelectHold => "SelectHold"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Mode_Coordinator.SelectedIntent")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorSelectedIntent_Payload(o: Vehicle_Mode_Coordinator.SelectedIntent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.SelectedIntent_Payload""""),
        ("value", printVehicle_Mode_CoordinatorSelectedIntentType(o.value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorControllerModeType(o: Vehicle_Mode_Coordinator.ControllerMode.Type): ST = {
      val value: String = o match {
        case Vehicle_Mode_Coordinator.ControllerMode.Off => "Off"
        case Vehicle_Mode_Coordinator.ControllerMode.Starting => "Starting"
        case Vehicle_Mode_Coordinator.ControllerMode.On => "On"
        case Vehicle_Mode_Coordinator.ControllerMode.Maintenance => "Maintenance"
        case Vehicle_Mode_Coordinator.ControllerMode.Degraded => "Degraded"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Mode_Coordinator.ControllerMode")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorControllerMode_Payload(o: Vehicle_Mode_Coordinator.ControllerMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ControllerMode_Payload""""),
        ("value", printVehicle_Mode_CoordinatorControllerModeType(o.value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorTransitionKindType(o: Vehicle_Mode_Coordinator.TransitionKind.Type): ST = {
      val value: String = o match {
        case Vehicle_Mode_Coordinator.TransitionKind.Stay => "Stay"
        case Vehicle_Mode_Coordinator.TransitionKind.GoOff => "GoOff"
        case Vehicle_Mode_Coordinator.TransitionKind.GoStarting => "GoStarting"
        case Vehicle_Mode_Coordinator.TransitionKind.GoOn => "GoOn"
        case Vehicle_Mode_Coordinator.TransitionKind.GoMaintenance => "GoMaintenance"
        case Vehicle_Mode_Coordinator.TransitionKind.GoDegraded => "GoDegraded"
        case Vehicle_Mode_Coordinator.TransitionKind.ResumeStored => "ResumeStored"
        case Vehicle_Mode_Coordinator.TransitionKind.Reject => "Reject"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Mode_Coordinator.TransitionKind")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorTransitionKind_Payload(o: Vehicle_Mode_Coordinator.TransitionKind_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.TransitionKind_Payload""""),
        ("value", printVehicle_Mode_CoordinatorTransitionKindType(o.value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorParkingBrakeDispositionType(o: Vehicle_Mode_Coordinator.ParkingBrakeDisposition.Type): ST = {
      val value: String = o match {
        case Vehicle_Mode_Coordinator.ParkingBrakeDisposition.Apply => "Apply"
        case Vehicle_Mode_Coordinator.ParkingBrakeDisposition.Release => "Release"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Mode_Coordinator.ParkingBrakeDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload(o: Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload""""),
        ("value", printVehicle_Mode_CoordinatorParkingBrakeDispositionType(o.value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorCoordinationStatusType(o: Vehicle_Mode_Coordinator.CoordinationStatus.Type): ST = {
      val value: String = o match {
        case Vehicle_Mode_Coordinator.CoordinationStatus.IdleOff => "IdleOff"
        case Vehicle_Mode_Coordinator.CoordinationStatus.StartingSequence => "StartingSequence"
        case Vehicle_Mode_Coordinator.CoordinationStatus.Operating => "Operating"
        case Vehicle_Mode_Coordinator.CoordinationStatus.MaintenanceHandoff => "MaintenanceHandoff"
        case Vehicle_Mode_Coordinator.CoordinationStatus.DegradedCondition => "DegradedCondition"
        case Vehicle_Mode_Coordinator.CoordinationStatus.DegradedInvalid => "DegradedInvalid"
        case Vehicle_Mode_Coordinator.CoordinationStatus.RecoveryResumed => "RecoveryResumed"
        case Vehicle_Mode_Coordinator.CoordinationStatus.ShutdownDominant => "ShutdownDominant"
        case Vehicle_Mode_Coordinator.CoordinationStatus.RequestConflict => "RequestConflict"
        case Vehicle_Mode_Coordinator.CoordinationStatus.RequestInapplicable => "RequestInapplicable"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Mode_Coordinator.CoordinationStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorCoordinationStatus_Payload(o: Vehicle_Mode_Coordinator.CoordinationStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.CoordinationStatus_Payload""""),
        ("value", printVehicle_Mode_CoordinatorCoordinationStatusType(o.value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorRecoveryTargetType(o: Vehicle_Mode_Coordinator.RecoveryTarget.Type): ST = {
      val value: String = o match {
        case Vehicle_Mode_Coordinator.RecoveryTarget.Off => "Off"
        case Vehicle_Mode_Coordinator.RecoveryTarget.Starting => "Starting"
        case Vehicle_Mode_Coordinator.RecoveryTarget.On => "On"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Mode_Coordinator.RecoveryTarget")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorRecoveryTarget_Payload(o: Vehicle_Mode_Coordinator.RecoveryTarget_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.RecoveryTarget_Payload""""),
        ("value", printVehicle_Mode_CoordinatorRecoveryTargetType(o.value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorQualifiedTransitionType(o: Vehicle_Mode_Coordinator.QualifiedTransition.Type): ST = {
      val value: String = o match {
        case Vehicle_Mode_Coordinator.QualifiedTransition.QualifiedStay => "QualifiedStay"
        case Vehicle_Mode_Coordinator.QualifiedTransition.QualifiedGoOff => "QualifiedGoOff"
        case Vehicle_Mode_Coordinator.QualifiedTransition.QualifiedGoStarting => "QualifiedGoStarting"
        case Vehicle_Mode_Coordinator.QualifiedTransition.QualifiedGoOn => "QualifiedGoOn"
        case Vehicle_Mode_Coordinator.QualifiedTransition.QualifiedGoMaintenance => "QualifiedGoMaintenance"
        case Vehicle_Mode_Coordinator.QualifiedTransition.QualifiedGoDegraded => "QualifiedGoDegraded"
        case Vehicle_Mode_Coordinator.QualifiedTransition.QualifiedResumeStored => "QualifiedResumeStored"
        case Vehicle_Mode_Coordinator.QualifiedTransition.QualifiedReject => "QualifiedReject"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Mode_Coordinator.QualifiedTransition")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorQualifiedTransition_Payload(o: Vehicle_Mode_Coordinator.QualifiedTransition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.QualifiedTransition_Payload""""),
        ("value", printVehicle_Mode_CoordinatorQualifiedTransitionType(o.value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorLifecycleLevels(o: Vehicle_Mode_Coordinator.LifecycleLevels): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.LifecycleLevels""""),
        ("startLevel", printB(o.startLevel)),
        ("onLevel", printB(o.onLevel)),
        ("offLevel", printB(o.offLevel))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorLifecycleLevels_Payload(o: Vehicle_Mode_Coordinator.LifecycleLevels_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.LifecycleLevels_Payload""""),
        ("value", printVehicle_Mode_CoordinatorLifecycleLevels(o.value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorLifecycleFacts(o: Vehicle_Mode_Coordinator.LifecycleFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.LifecycleFacts""""),
        ("freshStart", printB(o.freshStart)),
        ("freshOn", printB(o.freshOn)),
        ("offActive", printB(o.offActive)),
        ("lifecycleConflict", printB(o.lifecycleConflict))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorLifecycleFacts_Payload(o: Vehicle_Mode_Coordinator.LifecycleFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.LifecycleFacts_Payload""""),
        ("value", printVehicle_Mode_CoordinatorLifecycleFacts(o.value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorServiceLevels(o: Vehicle_Mode_Coordinator.ServiceLevels): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ServiceLevels""""),
        ("maintenanceLevel", printB(o.maintenanceLevel)),
        ("returnNormalLevel", printB(o.returnNormalLevel))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorServiceLevels_Payload(o: Vehicle_Mode_Coordinator.ServiceLevels_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ServiceLevels_Payload""""),
        ("value", printVehicle_Mode_CoordinatorServiceLevels(o.value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorServiceFacts(o: Vehicle_Mode_Coordinator.ServiceFacts): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ServiceFacts""""),
        ("freshMaintenance", printB(o.freshMaintenance)),
        ("freshReturn", printB(o.freshReturn)),
        ("serviceConflict", printB(o.serviceConflict))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorServiceFacts_Payload(o: Vehicle_Mode_Coordinator.ServiceFacts_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ServiceFacts_Payload""""),
        ("value", printVehicle_Mode_CoordinatorServiceFacts(o.value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorConditionEvidence(o: Vehicle_Mode_Coordinator.ConditionEvidence): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ConditionEvidence""""),
        ("reportedCondition", printVehicle_Mode_CoordinatorReportedConditionType(o.reportedCondition)),
        ("reportCurrency", printVehicle_Mode_CoordinatorReportCurrencyType(o.reportCurrency))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorConditionEvidence_Payload(o: Vehicle_Mode_Coordinator.ConditionEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ConditionEvidence_Payload""""),
        ("value", printVehicle_Mode_CoordinatorConditionEvidence(o.value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorArbitrationResult(o: Vehicle_Mode_Coordinator.ArbitrationResult): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ArbitrationResult""""),
        ("selectedIntent", printVehicle_Mode_CoordinatorSelectedIntentType(o.selectedIntent)),
        ("priorityConflict", printB(o.priorityConflict))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorArbitrationResult_Payload(o: Vehicle_Mode_Coordinator.ArbitrationResult_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ArbitrationResult_Payload""""),
        ("value", printVehicle_Mode_CoordinatorArbitrationResult(o.value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorTransitionResolution(o: Vehicle_Mode_Coordinator.TransitionResolution): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.TransitionResolution""""),
        ("nextMode", printVehicle_Mode_CoordinatorControllerModeType(o.nextMode)),
        ("kind", printVehicle_Mode_CoordinatorTransitionKindType(o.kind)),
        ("accepted", printB(o.accepted))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorTransitionResolution_Payload(o: Vehicle_Mode_Coordinator.TransitionResolution_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.TransitionResolution_Payload""""),
        ("value", printVehicle_Mode_CoordinatorTransitionResolution(o.value))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorCoordinationOutcome(o: Vehicle_Mode_Coordinator.CoordinationOutcome): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.CoordinationOutcome""""),
        ("parkingBrake", printVehicle_Mode_CoordinatorParkingBrakeDispositionType(o.parkingBrake)),
        ("status", printVehicle_Mode_CoordinatorCoordinationStatusType(o.status))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorCoordinationOutcome_Payload(o: Vehicle_Mode_Coordinator.CoordinationOutcome_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.CoordinationOutcome_Payload""""),
        ("value", printVehicle_Mode_CoordinatorCoordinationOutcome(o.value))
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

    @pure def printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P""""),
        ("api_lifecycleLevels", printVehicle_Mode_CoordinatorLifecycleLevels(o.api_lifecycleLevels))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS""""),
        ("In_previousOff", printB(o.In_previousOff)),
        ("In_previousOn", printB(o.In_previousOn)),
        ("In_previousStart", printB(o.In_previousStart)),
        ("api_lifecycleLevels", printVehicle_Mode_CoordinatorLifecycleLevels(o.api_lifecycleLevels))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P""""),
        ("api_lifecycleFacts", printVehicle_Mode_CoordinatorLifecycleFacts(o.api_lifecycleFacts))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS""""),
        ("previousOff", printB(o.previousOff)),
        ("previousOn", printB(o.previousOn)),
        ("previousStart", printB(o.previousStart)),
        ("api_lifecycleFacts", printVehicle_Mode_CoordinatorLifecycleFacts(o.api_lifecycleFacts))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P""""),
        ("api_serviceLevels", printVehicle_Mode_CoordinatorServiceLevels(o.api_serviceLevels))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS""""),
        ("In_previousMaintenance", printB(o.In_previousMaintenance)),
        ("In_previousReturn", printB(o.In_previousReturn)),
        ("api_serviceLevels", printVehicle_Mode_CoordinatorServiceLevels(o.api_serviceLevels))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P""""),
        ("api_serviceFacts", printVehicle_Mode_CoordinatorServiceFacts(o.api_serviceFacts))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS""""),
        ("previousMaintenance", printB(o.previousMaintenance)),
        ("previousReturn", printB(o.previousReturn)),
        ("api_serviceFacts", printVehicle_Mode_CoordinatorServiceFacts(o.api_serviceFacts))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P""""),
        ("api_conditionEvidence", printVehicle_Mode_CoordinatorConditionEvidence(o.api_conditionEvidence))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS""""),
        ("api_conditionEvidence", printVehicle_Mode_CoordinatorConditionEvidence(o.api_conditionEvidence))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P""""),
        ("api_conditionAssessment", printVehicle_Mode_CoordinatorConditionAssessmentType(o.api_conditionAssessment))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS""""),
        ("api_conditionAssessment", printVehicle_Mode_CoordinatorConditionAssessmentType(o.api_conditionAssessment))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P""""),
        ("api_conditionAssessment", printVehicle_Mode_CoordinatorConditionAssessmentType(o.api_conditionAssessment)),
        ("api_lifecycleFacts", printVehicle_Mode_CoordinatorLifecycleFacts(o.api_lifecycleFacts)),
        ("api_serviceFacts", printVehicle_Mode_CoordinatorServiceFacts(o.api_serviceFacts))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS""""),
        ("api_conditionAssessment", printVehicle_Mode_CoordinatorConditionAssessmentType(o.api_conditionAssessment)),
        ("api_lifecycleFacts", printVehicle_Mode_CoordinatorLifecycleFacts(o.api_lifecycleFacts)),
        ("api_serviceFacts", printVehicle_Mode_CoordinatorServiceFacts(o.api_serviceFacts))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P""""),
        ("api_arbitrationForPublication", printVehicle_Mode_CoordinatorArbitrationResult(o.api_arbitrationForPublication)),
        ("api_arbitrationForQualification", printVehicle_Mode_CoordinatorArbitrationResult(o.api_arbitrationForQualification))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS""""),
        ("api_arbitrationForPublication", printVehicle_Mode_CoordinatorArbitrationResult(o.api_arbitrationForPublication)),
        ("api_arbitrationForQualification", printVehicle_Mode_CoordinatorArbitrationResult(o.api_arbitrationForQualification))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P""""),
        ("api_appliedResolution", printVehicle_Mode_CoordinatorTransitionResolution(o.api_appliedResolution)),
        ("api_arbitrationResult", printVehicle_Mode_CoordinatorArbitrationResult(o.api_arbitrationResult))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS""""),
        ("api_appliedResolution", printVehicle_Mode_CoordinatorTransitionResolution(o.api_appliedResolution)),
        ("api_arbitrationResult", printVehicle_Mode_CoordinatorArbitrationResult(o.api_arbitrationResult))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P""""),
        ("api_coordinationOutcome", printVehicle_Mode_CoordinatorCoordinationOutcome(o.api_coordinationOutcome))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS""""),
        ("api_coordinationOutcome", printVehicle_Mode_CoordinatorCoordinationOutcome(o.api_coordinationOutcome))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P""""),
        ("api_appliedResolution", printVehicle_Mode_CoordinatorTransitionResolution(o.api_appliedResolution)),
        ("api_currentMode", printVehicle_Mode_CoordinatorControllerModeType(o.api_currentMode))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS""""),
        ("In_recoveryTarget", printVehicle_Mode_CoordinatorRecoveryTargetType(o.In_recoveryTarget)),
        ("api_appliedResolution", printVehicle_Mode_CoordinatorTransitionResolution(o.api_appliedResolution)),
        ("api_currentMode", printVehicle_Mode_CoordinatorControllerModeType(o.api_currentMode))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P""""),
        ("api_storedRecoveryTarget", printVehicle_Mode_CoordinatorRecoveryTargetType(o.api_storedRecoveryTarget))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS""""),
        ("recoveryTarget", printVehicle_Mode_CoordinatorRecoveryTargetType(o.recoveryTarget)),
        ("api_storedRecoveryTarget", printVehicle_Mode_CoordinatorRecoveryTargetType(o.api_storedRecoveryTarget))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P""""),
        ("api_arbitrationResult", printVehicle_Mode_CoordinatorArbitrationResult(o.api_arbitrationResult)),
        ("api_currentMode", printVehicle_Mode_CoordinatorControllerModeType(o.api_currentMode))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS""""),
        ("api_arbitrationResult", printVehicle_Mode_CoordinatorArbitrationResult(o.api_arbitrationResult)),
        ("api_currentMode", printVehicle_Mode_CoordinatorControllerModeType(o.api_currentMode))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P""""),
        ("api_qualifiedTransition", printVehicle_Mode_CoordinatorQualifiedTransitionType(o.api_qualifiedTransition))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS""""),
        ("api_qualifiedTransition", printVehicle_Mode_CoordinatorQualifiedTransitionType(o.api_qualifiedTransition))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container): ST = {
      o match {
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P""""),
        ("api_qualifiedTransition", printVehicle_Mode_CoordinatorQualifiedTransitionType(o.api_qualifiedTransition)),
        ("api_storedRecoveryTarget", printVehicle_Mode_CoordinatorRecoveryTargetType(o.api_storedRecoveryTarget))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS""""),
        ("In_controllerMode", printVehicle_Mode_CoordinatorControllerModeType(o.In_controllerMode)),
        ("api_qualifiedTransition", printVehicle_Mode_CoordinatorQualifiedTransitionType(o.api_qualifiedTransition)),
        ("api_storedRecoveryTarget", printVehicle_Mode_CoordinatorRecoveryTargetType(o.api_storedRecoveryTarget))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container): ST = {
      o match {
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P""""),
        ("api_appliedNextMode", printVehicle_Mode_CoordinatorControllerModeType(o.api_appliedNextMode)),
        ("api_modeForQualification", printVehicle_Mode_CoordinatorControllerModeType(o.api_modeForQualification)),
        ("api_modeForRecovery", printVehicle_Mode_CoordinatorControllerModeType(o.api_modeForRecovery)),
        ("api_resolutionForPublication", printVehicle_Mode_CoordinatorTransitionResolution(o.api_resolutionForPublication)),
        ("api_resolutionForRecovery", printVehicle_Mode_CoordinatorTransitionResolution(o.api_resolutionForRecovery))
      ))
    }

    @pure def printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS""""),
        ("controllerMode", printVehicle_Mode_CoordinatorControllerModeType(o.controllerMode)),
        ("api_appliedNextMode", printVehicle_Mode_CoordinatorControllerModeType(o.api_appliedNextMode)),
        ("api_modeForQualification", printVehicle_Mode_CoordinatorControllerModeType(o.api_modeForQualification)),
        ("api_modeForRecovery", printVehicle_Mode_CoordinatorControllerModeType(o.api_modeForRecovery)),
        ("api_resolutionForPublication", printVehicle_Mode_CoordinatorTransitionResolution(o.api_resolutionForPublication)),
        ("api_resolutionForRecovery", printVehicle_Mode_CoordinatorTransitionResolution(o.api_resolutionForRecovery))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_lifecycleEventOwner_postInit => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_lifecycleEventOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_lifecycleEventOwner_preCompute => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_lifecycleEventOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_lifecycleEventOwner_postCompute => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_lifecycleEventOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_serviceEventOwner_postInit => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_serviceEventOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_serviceEventOwner_preCompute => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_serviceEventOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_serviceEventOwner_postCompute => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_serviceEventOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_conditionAssessmentOwner_postInit => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_conditionAssessmentOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_conditionAssessmentOwner_preCompute => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_conditionAssessmentOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_conditionAssessmentOwner_postCompute => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_conditionAssessmentOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_intentArbitrationOwner_postInit => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_intentArbitrationOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_intentArbitrationOwner_preCompute => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_intentArbitrationOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_intentArbitrationOwner_postCompute => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_intentArbitrationOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_coordinationPublicationOwner_postInit => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_coordinationPublicationOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_coordinationPublicationOwner_preCompute => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_coordinationPublicationOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_coordinationPublicationOwner_postCompute => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_coordinationPublicationOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_recoveryTargetOwner_postInit => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_recoveryTargetOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_recoveryTargetOwner_preCompute => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_recoveryTargetOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_recoveryTargetOwner_postCompute => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_recoveryTargetOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_transitionQualificationOwner_postInit => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_transitionQualificationOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_transitionQualificationOwner_preCompute => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_transitionQualificationOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_transitionQualificationOwner_postCompute => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_transitionQualificationOwner_postCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_postInit => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_postInit"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_preCompute => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_preCompute"
        case runtimemonitor.ObservationKind.VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_postCompute => "VehicleControllerOperatingModeCoordinator_Instance_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(o)
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
        case o: Vehicle_Mode_Coordinator.ServiceFacts_Payload => return printVehicle_Mode_CoordinatorServiceFacts_Payload(o)
        case o: Vehicle_Mode_Coordinator.ServiceLevels_Payload => return printVehicle_Mode_CoordinatorServiceLevels_Payload(o)
        case o: Vehicle_Mode_Coordinator.ReportCurrency_Payload => return printVehicle_Mode_CoordinatorReportCurrency_Payload(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTarget_Payload => return printVehicle_Mode_CoordinatorRecoveryTarget_Payload(o)
        case o: Vehicle_Mode_Coordinator.ControllerMode_Payload => return printVehicle_Mode_CoordinatorControllerMode_Payload(o)
        case o: Vehicle_Mode_Coordinator.TransitionKind_Payload => return printVehicle_Mode_CoordinatorTransitionKind_Payload(o)
        case o: Vehicle_Mode_Coordinator.SelectedIntent_Payload => return printVehicle_Mode_CoordinatorSelectedIntent_Payload(o)
        case o: Vehicle_Mode_Coordinator.LifecycleFacts_Payload => return printVehicle_Mode_CoordinatorLifecycleFacts_Payload(o)
        case o: Vehicle_Mode_Coordinator.LifecycleLevels_Payload => return printVehicle_Mode_CoordinatorLifecycleLevels_Payload(o)
        case o: Vehicle_Mode_Coordinator.ReportedCondition_Payload => return printVehicle_Mode_CoordinatorReportedCondition_Payload(o)
        case o: Vehicle_Mode_Coordinator.ArbitrationResult_Payload => return printVehicle_Mode_CoordinatorArbitrationResult_Payload(o)
        case o: Vehicle_Mode_Coordinator.ConditionEvidence_Payload => return printVehicle_Mode_CoordinatorConditionEvidence_Payload(o)
        case o: Vehicle_Mode_Coordinator.CoordinationStatus_Payload => return printVehicle_Mode_CoordinatorCoordinationStatus_Payload(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessment_Payload => return printVehicle_Mode_CoordinatorConditionAssessment_Payload(o)
        case o: Vehicle_Mode_Coordinator.QualifiedTransition_Payload => return printVehicle_Mode_CoordinatorQualifiedTransition_Payload(o)
        case o: Vehicle_Mode_Coordinator.CoordinationOutcome_Payload => return printVehicle_Mode_CoordinatorCoordinationOutcome_Payload(o)
        case o: Vehicle_Mode_Coordinator.TransitionResolution_Payload => return printVehicle_Mode_CoordinatorTransitionResolution_Payload(o)
        case o: Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload => return printVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P => return printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS => return printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P => return printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(o)
        case o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS => return printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(o)
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

    def parseVehicle_Mode_CoordinatorReportedConditionType(): Vehicle_Mode_Coordinator.ReportedCondition.Type = {
      val r = parseVehicle_Mode_CoordinatorReportedConditionT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorReportedConditionT(typeParsed: B): Vehicle_Mode_Coordinator.ReportedCondition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ReportedCondition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Mode_Coordinator.ReportedCondition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Mode_Coordinator.ReportedCondition.")
          return Vehicle_Mode_Coordinator.ReportedCondition.byOrdinal(0).get
      }
    }

    def parseVehicle_Mode_CoordinatorReportedCondition_Payload(): Vehicle_Mode_Coordinator.ReportedCondition_Payload = {
      val r = parseVehicle_Mode_CoordinatorReportedCondition_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorReportedCondition_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ReportedCondition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ReportedCondition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorReportedConditionType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ReportedCondition_Payload(value)
    }

    def parseVehicle_Mode_CoordinatorReportCurrencyType(): Vehicle_Mode_Coordinator.ReportCurrency.Type = {
      val r = parseVehicle_Mode_CoordinatorReportCurrencyT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorReportCurrencyT(typeParsed: B): Vehicle_Mode_Coordinator.ReportCurrency.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ReportCurrency")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Mode_Coordinator.ReportCurrency.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Mode_Coordinator.ReportCurrency.")
          return Vehicle_Mode_Coordinator.ReportCurrency.byOrdinal(0).get
      }
    }

    def parseVehicle_Mode_CoordinatorReportCurrency_Payload(): Vehicle_Mode_Coordinator.ReportCurrency_Payload = {
      val r = parseVehicle_Mode_CoordinatorReportCurrency_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorReportCurrency_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ReportCurrency_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ReportCurrency_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorReportCurrencyType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ReportCurrency_Payload(value)
    }

    def parseVehicle_Mode_CoordinatorConditionAssessmentType(): Vehicle_Mode_Coordinator.ConditionAssessment.Type = {
      val r = parseVehicle_Mode_CoordinatorConditionAssessmentT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorConditionAssessmentT(typeParsed: B): Vehicle_Mode_Coordinator.ConditionAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ConditionAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Mode_Coordinator.ConditionAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Mode_Coordinator.ConditionAssessment.")
          return Vehicle_Mode_Coordinator.ConditionAssessment.byOrdinal(0).get
      }
    }

    def parseVehicle_Mode_CoordinatorConditionAssessment_Payload(): Vehicle_Mode_Coordinator.ConditionAssessment_Payload = {
      val r = parseVehicle_Mode_CoordinatorConditionAssessment_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorConditionAssessment_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ConditionAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ConditionAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorConditionAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ConditionAssessment_Payload(value)
    }

    def parseVehicle_Mode_CoordinatorSelectedIntentType(): Vehicle_Mode_Coordinator.SelectedIntent.Type = {
      val r = parseVehicle_Mode_CoordinatorSelectedIntentT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorSelectedIntentT(typeParsed: B): Vehicle_Mode_Coordinator.SelectedIntent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.SelectedIntent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Mode_Coordinator.SelectedIntent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Mode_Coordinator.SelectedIntent.")
          return Vehicle_Mode_Coordinator.SelectedIntent.byOrdinal(0).get
      }
    }

    def parseVehicle_Mode_CoordinatorSelectedIntent_Payload(): Vehicle_Mode_Coordinator.SelectedIntent_Payload = {
      val r = parseVehicle_Mode_CoordinatorSelectedIntent_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorSelectedIntent_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.SelectedIntent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.SelectedIntent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorSelectedIntentType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.SelectedIntent_Payload(value)
    }

    def parseVehicle_Mode_CoordinatorControllerModeType(): Vehicle_Mode_Coordinator.ControllerMode.Type = {
      val r = parseVehicle_Mode_CoordinatorControllerModeT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorControllerModeT(typeParsed: B): Vehicle_Mode_Coordinator.ControllerMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ControllerMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Mode_Coordinator.ControllerMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Mode_Coordinator.ControllerMode.")
          return Vehicle_Mode_Coordinator.ControllerMode.byOrdinal(0).get
      }
    }

    def parseVehicle_Mode_CoordinatorControllerMode_Payload(): Vehicle_Mode_Coordinator.ControllerMode_Payload = {
      val r = parseVehicle_Mode_CoordinatorControllerMode_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorControllerMode_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ControllerMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ControllerMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorControllerModeType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ControllerMode_Payload(value)
    }

    def parseVehicle_Mode_CoordinatorTransitionKindType(): Vehicle_Mode_Coordinator.TransitionKind.Type = {
      val r = parseVehicle_Mode_CoordinatorTransitionKindT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorTransitionKindT(typeParsed: B): Vehicle_Mode_Coordinator.TransitionKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.TransitionKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Mode_Coordinator.TransitionKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Mode_Coordinator.TransitionKind.")
          return Vehicle_Mode_Coordinator.TransitionKind.byOrdinal(0).get
      }
    }

    def parseVehicle_Mode_CoordinatorTransitionKind_Payload(): Vehicle_Mode_Coordinator.TransitionKind_Payload = {
      val r = parseVehicle_Mode_CoordinatorTransitionKind_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorTransitionKind_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.TransitionKind_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.TransitionKind_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorTransitionKindType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.TransitionKind_Payload(value)
    }

    def parseVehicle_Mode_CoordinatorParkingBrakeDispositionType(): Vehicle_Mode_Coordinator.ParkingBrakeDisposition.Type = {
      val r = parseVehicle_Mode_CoordinatorParkingBrakeDispositionT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorParkingBrakeDispositionT(typeParsed: B): Vehicle_Mode_Coordinator.ParkingBrakeDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ParkingBrakeDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Mode_Coordinator.ParkingBrakeDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Mode_Coordinator.ParkingBrakeDisposition.")
          return Vehicle_Mode_Coordinator.ParkingBrakeDisposition.byOrdinal(0).get
      }
    }

    def parseVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload(): Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload = {
      val r = parseVehicle_Mode_CoordinatorParkingBrakeDisposition_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorParkingBrakeDisposition_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorParkingBrakeDispositionType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload(value)
    }

    def parseVehicle_Mode_CoordinatorCoordinationStatusType(): Vehicle_Mode_Coordinator.CoordinationStatus.Type = {
      val r = parseVehicle_Mode_CoordinatorCoordinationStatusT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorCoordinationStatusT(typeParsed: B): Vehicle_Mode_Coordinator.CoordinationStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.CoordinationStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Mode_Coordinator.CoordinationStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Mode_Coordinator.CoordinationStatus.")
          return Vehicle_Mode_Coordinator.CoordinationStatus.byOrdinal(0).get
      }
    }

    def parseVehicle_Mode_CoordinatorCoordinationStatus_Payload(): Vehicle_Mode_Coordinator.CoordinationStatus_Payload = {
      val r = parseVehicle_Mode_CoordinatorCoordinationStatus_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorCoordinationStatus_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.CoordinationStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.CoordinationStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorCoordinationStatusType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.CoordinationStatus_Payload(value)
    }

    def parseVehicle_Mode_CoordinatorRecoveryTargetType(): Vehicle_Mode_Coordinator.RecoveryTarget.Type = {
      val r = parseVehicle_Mode_CoordinatorRecoveryTargetT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorRecoveryTargetT(typeParsed: B): Vehicle_Mode_Coordinator.RecoveryTarget.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.RecoveryTarget")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Mode_Coordinator.RecoveryTarget.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Mode_Coordinator.RecoveryTarget.")
          return Vehicle_Mode_Coordinator.RecoveryTarget.byOrdinal(0).get
      }
    }

    def parseVehicle_Mode_CoordinatorRecoveryTarget_Payload(): Vehicle_Mode_Coordinator.RecoveryTarget_Payload = {
      val r = parseVehicle_Mode_CoordinatorRecoveryTarget_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorRecoveryTarget_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.RecoveryTarget_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.RecoveryTarget_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorRecoveryTargetType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.RecoveryTarget_Payload(value)
    }

    def parseVehicle_Mode_CoordinatorQualifiedTransitionType(): Vehicle_Mode_Coordinator.QualifiedTransition.Type = {
      val r = parseVehicle_Mode_CoordinatorQualifiedTransitionT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorQualifiedTransitionT(typeParsed: B): Vehicle_Mode_Coordinator.QualifiedTransition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.QualifiedTransition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Mode_Coordinator.QualifiedTransition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Mode_Coordinator.QualifiedTransition.")
          return Vehicle_Mode_Coordinator.QualifiedTransition.byOrdinal(0).get
      }
    }

    def parseVehicle_Mode_CoordinatorQualifiedTransition_Payload(): Vehicle_Mode_Coordinator.QualifiedTransition_Payload = {
      val r = parseVehicle_Mode_CoordinatorQualifiedTransition_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorQualifiedTransition_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.QualifiedTransition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.QualifiedTransition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorQualifiedTransitionType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.QualifiedTransition_Payload(value)
    }

    def parseVehicle_Mode_CoordinatorLifecycleLevels(): Vehicle_Mode_Coordinator.LifecycleLevels = {
      val r = parseVehicle_Mode_CoordinatorLifecycleLevelsT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorLifecycleLevelsT(typeParsed: B): Vehicle_Mode_Coordinator.LifecycleLevels = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.LifecycleLevels")
      }
      parser.parseObjectKey("startLevel")
      val startLevel = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("onLevel")
      val onLevel = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("offLevel")
      val offLevel = parser.parseB()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.LifecycleLevels(startLevel, onLevel, offLevel)
    }

    def parseVehicle_Mode_CoordinatorLifecycleLevels_Payload(): Vehicle_Mode_Coordinator.LifecycleLevels_Payload = {
      val r = parseVehicle_Mode_CoordinatorLifecycleLevels_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorLifecycleLevels_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.LifecycleLevels_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.LifecycleLevels_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorLifecycleLevels()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.LifecycleLevels_Payload(value)
    }

    def parseVehicle_Mode_CoordinatorLifecycleFacts(): Vehicle_Mode_Coordinator.LifecycleFacts = {
      val r = parseVehicle_Mode_CoordinatorLifecycleFactsT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorLifecycleFactsT(typeParsed: B): Vehicle_Mode_Coordinator.LifecycleFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.LifecycleFacts")
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
      parser.parseObjectKey("lifecycleConflict")
      val lifecycleConflict = parser.parseB()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.LifecycleFacts(freshStart, freshOn, offActive, lifecycleConflict)
    }

    def parseVehicle_Mode_CoordinatorLifecycleFacts_Payload(): Vehicle_Mode_Coordinator.LifecycleFacts_Payload = {
      val r = parseVehicle_Mode_CoordinatorLifecycleFacts_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorLifecycleFacts_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.LifecycleFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.LifecycleFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorLifecycleFacts()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.LifecycleFacts_Payload(value)
    }

    def parseVehicle_Mode_CoordinatorServiceLevels(): Vehicle_Mode_Coordinator.ServiceLevels = {
      val r = parseVehicle_Mode_CoordinatorServiceLevelsT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorServiceLevelsT(typeParsed: B): Vehicle_Mode_Coordinator.ServiceLevels = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ServiceLevels")
      }
      parser.parseObjectKey("maintenanceLevel")
      val maintenanceLevel = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("returnNormalLevel")
      val returnNormalLevel = parser.parseB()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ServiceLevels(maintenanceLevel, returnNormalLevel)
    }

    def parseVehicle_Mode_CoordinatorServiceLevels_Payload(): Vehicle_Mode_Coordinator.ServiceLevels_Payload = {
      val r = parseVehicle_Mode_CoordinatorServiceLevels_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorServiceLevels_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ServiceLevels_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ServiceLevels_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorServiceLevels()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ServiceLevels_Payload(value)
    }

    def parseVehicle_Mode_CoordinatorServiceFacts(): Vehicle_Mode_Coordinator.ServiceFacts = {
      val r = parseVehicle_Mode_CoordinatorServiceFactsT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorServiceFactsT(typeParsed: B): Vehicle_Mode_Coordinator.ServiceFacts = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ServiceFacts")
      }
      parser.parseObjectKey("freshMaintenance")
      val freshMaintenance = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("freshReturn")
      val freshReturn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("serviceConflict")
      val serviceConflict = parser.parseB()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ServiceFacts(freshMaintenance, freshReturn, serviceConflict)
    }

    def parseVehicle_Mode_CoordinatorServiceFacts_Payload(): Vehicle_Mode_Coordinator.ServiceFacts_Payload = {
      val r = parseVehicle_Mode_CoordinatorServiceFacts_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorServiceFacts_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ServiceFacts_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ServiceFacts_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorServiceFacts()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ServiceFacts_Payload(value)
    }

    def parseVehicle_Mode_CoordinatorConditionEvidence(): Vehicle_Mode_Coordinator.ConditionEvidence = {
      val r = parseVehicle_Mode_CoordinatorConditionEvidenceT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorConditionEvidenceT(typeParsed: B): Vehicle_Mode_Coordinator.ConditionEvidence = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ConditionEvidence")
      }
      parser.parseObjectKey("reportedCondition")
      val reportedCondition = parseVehicle_Mode_CoordinatorReportedConditionType()
      parser.parseObjectNext()
      parser.parseObjectKey("reportCurrency")
      val reportCurrency = parseVehicle_Mode_CoordinatorReportCurrencyType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ConditionEvidence(reportedCondition, reportCurrency)
    }

    def parseVehicle_Mode_CoordinatorConditionEvidence_Payload(): Vehicle_Mode_Coordinator.ConditionEvidence_Payload = {
      val r = parseVehicle_Mode_CoordinatorConditionEvidence_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorConditionEvidence_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ConditionEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ConditionEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorConditionEvidence()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ConditionEvidence_Payload(value)
    }

    def parseVehicle_Mode_CoordinatorArbitrationResult(): Vehicle_Mode_Coordinator.ArbitrationResult = {
      val r = parseVehicle_Mode_CoordinatorArbitrationResultT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorArbitrationResultT(typeParsed: B): Vehicle_Mode_Coordinator.ArbitrationResult = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ArbitrationResult")
      }
      parser.parseObjectKey("selectedIntent")
      val selectedIntent = parseVehicle_Mode_CoordinatorSelectedIntentType()
      parser.parseObjectNext()
      parser.parseObjectKey("priorityConflict")
      val priorityConflict = parser.parseB()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ArbitrationResult(selectedIntent, priorityConflict)
    }

    def parseVehicle_Mode_CoordinatorArbitrationResult_Payload(): Vehicle_Mode_Coordinator.ArbitrationResult_Payload = {
      val r = parseVehicle_Mode_CoordinatorArbitrationResult_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorArbitrationResult_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.ArbitrationResult_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ArbitrationResult_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorArbitrationResult()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ArbitrationResult_Payload(value)
    }

    def parseVehicle_Mode_CoordinatorTransitionResolution(): Vehicle_Mode_Coordinator.TransitionResolution = {
      val r = parseVehicle_Mode_CoordinatorTransitionResolutionT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorTransitionResolutionT(typeParsed: B): Vehicle_Mode_Coordinator.TransitionResolution = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.TransitionResolution")
      }
      parser.parseObjectKey("nextMode")
      val nextMode = parseVehicle_Mode_CoordinatorControllerModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("kind")
      val kind = parseVehicle_Mode_CoordinatorTransitionKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("accepted")
      val accepted = parser.parseB()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.TransitionResolution(nextMode, kind, accepted)
    }

    def parseVehicle_Mode_CoordinatorTransitionResolution_Payload(): Vehicle_Mode_Coordinator.TransitionResolution_Payload = {
      val r = parseVehicle_Mode_CoordinatorTransitionResolution_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorTransitionResolution_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.TransitionResolution_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.TransitionResolution_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorTransitionResolution()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.TransitionResolution_Payload(value)
    }

    def parseVehicle_Mode_CoordinatorCoordinationOutcome(): Vehicle_Mode_Coordinator.CoordinationOutcome = {
      val r = parseVehicle_Mode_CoordinatorCoordinationOutcomeT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorCoordinationOutcomeT(typeParsed: B): Vehicle_Mode_Coordinator.CoordinationOutcome = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.CoordinationOutcome")
      }
      parser.parseObjectKey("parkingBrake")
      val parkingBrake = parseVehicle_Mode_CoordinatorParkingBrakeDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseVehicle_Mode_CoordinatorCoordinationStatusType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.CoordinationOutcome(parkingBrake, status)
    }

    def parseVehicle_Mode_CoordinatorCoordinationOutcome_Payload(): Vehicle_Mode_Coordinator.CoordinationOutcome_Payload = {
      val r = parseVehicle_Mode_CoordinatorCoordinationOutcome_PayloadT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorCoordinationOutcome_PayloadT(typeParsed: B): Vehicle_Mode_Coordinator.CoordinationOutcome_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.CoordinationOutcome_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Mode_CoordinatorCoordinationOutcome()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.CoordinationOutcome_Payload(value)
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

    def parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container(): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P = {
      val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_lifecycleLevels")
      val api_lifecycleLevels = parseVehicle_Mode_CoordinatorLifecycleLevels()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(api_lifecycleLevels)
    }

    def parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS = {
      val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_previousOff")
      val In_previousOff = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_previousOn")
      val In_previousOn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_previousStart")
      val In_previousStart = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleLevels")
      val api_lifecycleLevels = parseVehicle_Mode_CoordinatorLifecycleLevels()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(In_previousOff, In_previousOn, In_previousStart, api_lifecycleLevels)
    }

    def parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container(): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P = {
      val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_lifecycleFacts")
      val api_lifecycleFacts = parseVehicle_Mode_CoordinatorLifecycleFacts()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(api_lifecycleFacts)
    }

    def parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS = {
      val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("previousOff")
      val previousOff = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("previousOn")
      val previousOn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("previousStart")
      val previousStart = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleFacts")
      val api_lifecycleFacts = parseVehicle_Mode_CoordinatorLifecycleFacts()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(previousOff, previousOn, previousStart, api_lifecycleFacts)
    }

    def parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container(): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P = {
      val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_serviceLevels")
      val api_serviceLevels = parseVehicle_Mode_CoordinatorServiceLevels()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(api_serviceLevels)
    }

    def parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS = {
      val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_previousMaintenance")
      val In_previousMaintenance = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_previousReturn")
      val In_previousReturn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceLevels")
      val api_serviceLevels = parseVehicle_Mode_CoordinatorServiceLevels()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(In_previousMaintenance, In_previousReturn, api_serviceLevels)
    }

    def parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container(): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P = {
      val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_serviceFacts")
      val api_serviceFacts = parseVehicle_Mode_CoordinatorServiceFacts()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(api_serviceFacts)
    }

    def parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS = {
      val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("previousMaintenance")
      val previousMaintenance = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("previousReturn")
      val previousReturn = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceFacts")
      val api_serviceFacts = parseVehicle_Mode_CoordinatorServiceFacts()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(previousMaintenance, previousReturn, api_serviceFacts)
    }

    def parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container(): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P = {
      val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_conditionEvidence")
      val api_conditionEvidence = parseVehicle_Mode_CoordinatorConditionEvidence()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(api_conditionEvidence)
    }

    def parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS = {
      val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_conditionEvidence")
      val api_conditionEvidence = parseVehicle_Mode_CoordinatorConditionEvidence()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(api_conditionEvidence)
    }

    def parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container(): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P = {
      val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_conditionAssessment")
      val api_conditionAssessment = parseVehicle_Mode_CoordinatorConditionAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(api_conditionAssessment)
    }

    def parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS = {
      val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_conditionAssessment")
      val api_conditionAssessment = parseVehicle_Mode_CoordinatorConditionAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(api_conditionAssessment)
    }

    def parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container(): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P = {
      val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_conditionAssessment")
      val api_conditionAssessment = parseVehicle_Mode_CoordinatorConditionAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleFacts")
      val api_lifecycleFacts = parseVehicle_Mode_CoordinatorLifecycleFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceFacts")
      val api_serviceFacts = parseVehicle_Mode_CoordinatorServiceFacts()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(api_conditionAssessment, api_lifecycleFacts, api_serviceFacts)
    }

    def parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS = {
      val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_conditionAssessment")
      val api_conditionAssessment = parseVehicle_Mode_CoordinatorConditionAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lifecycleFacts")
      val api_lifecycleFacts = parseVehicle_Mode_CoordinatorLifecycleFacts()
      parser.parseObjectNext()
      parser.parseObjectKey("api_serviceFacts")
      val api_serviceFacts = parseVehicle_Mode_CoordinatorServiceFacts()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(api_conditionAssessment, api_lifecycleFacts, api_serviceFacts)
    }

    def parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container(): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P = {
      val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_arbitrationForPublication")
      val api_arbitrationForPublication = parseVehicle_Mode_CoordinatorArbitrationResult()
      parser.parseObjectNext()
      parser.parseObjectKey("api_arbitrationForQualification")
      val api_arbitrationForQualification = parseVehicle_Mode_CoordinatorArbitrationResult()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(api_arbitrationForPublication, api_arbitrationForQualification)
    }

    def parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS = {
      val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_arbitrationForPublication")
      val api_arbitrationForPublication = parseVehicle_Mode_CoordinatorArbitrationResult()
      parser.parseObjectNext()
      parser.parseObjectKey("api_arbitrationForQualification")
      val api_arbitrationForQualification = parseVehicle_Mode_CoordinatorArbitrationResult()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(api_arbitrationForPublication, api_arbitrationForQualification)
    }

    def parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container(): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P = {
      val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_appliedResolution")
      val api_appliedResolution = parseVehicle_Mode_CoordinatorTransitionResolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_arbitrationResult")
      val api_arbitrationResult = parseVehicle_Mode_CoordinatorArbitrationResult()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(api_appliedResolution, api_arbitrationResult)
    }

    def parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS = {
      val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_appliedResolution")
      val api_appliedResolution = parseVehicle_Mode_CoordinatorTransitionResolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_arbitrationResult")
      val api_arbitrationResult = parseVehicle_Mode_CoordinatorArbitrationResult()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(api_appliedResolution, api_arbitrationResult)
    }

    def parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container(): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P = {
      val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_coordinationOutcome")
      val api_coordinationOutcome = parseVehicle_Mode_CoordinatorCoordinationOutcome()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(api_coordinationOutcome)
    }

    def parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS = {
      val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_coordinationOutcome")
      val api_coordinationOutcome = parseVehicle_Mode_CoordinatorCoordinationOutcome()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(api_coordinationOutcome)
    }

    def parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container(): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P = {
      val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_appliedResolution")
      val api_appliedResolution = parseVehicle_Mode_CoordinatorTransitionResolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentMode")
      val api_currentMode = parseVehicle_Mode_CoordinatorControllerModeType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(api_appliedResolution, api_currentMode)
    }

    def parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS = {
      val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_recoveryTarget")
      val In_recoveryTarget = parseVehicle_Mode_CoordinatorRecoveryTargetType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_appliedResolution")
      val api_appliedResolution = parseVehicle_Mode_CoordinatorTransitionResolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentMode")
      val api_currentMode = parseVehicle_Mode_CoordinatorControllerModeType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(In_recoveryTarget, api_appliedResolution, api_currentMode)
    }

    def parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container(): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P = {
      val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_storedRecoveryTarget")
      val api_storedRecoveryTarget = parseVehicle_Mode_CoordinatorRecoveryTargetType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(api_storedRecoveryTarget)
    }

    def parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS = {
      val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("recoveryTarget")
      val recoveryTarget = parseVehicle_Mode_CoordinatorRecoveryTargetType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_storedRecoveryTarget")
      val api_storedRecoveryTarget = parseVehicle_Mode_CoordinatorRecoveryTargetType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(recoveryTarget, api_storedRecoveryTarget)
    }

    def parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container(): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P = {
      val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_arbitrationResult")
      val api_arbitrationResult = parseVehicle_Mode_CoordinatorArbitrationResult()
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentMode")
      val api_currentMode = parseVehicle_Mode_CoordinatorControllerModeType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(api_arbitrationResult, api_currentMode)
    }

    def parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS = {
      val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_arbitrationResult")
      val api_arbitrationResult = parseVehicle_Mode_CoordinatorArbitrationResult()
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentMode")
      val api_currentMode = parseVehicle_Mode_CoordinatorControllerModeType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(api_arbitrationResult, api_currentMode)
    }

    def parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container(): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P = {
      val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_qualifiedTransition")
      val api_qualifiedTransition = parseVehicle_Mode_CoordinatorQualifiedTransitionType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(api_qualifiedTransition)
    }

    def parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS = {
      val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_qualifiedTransition")
      val api_qualifiedTransition = parseVehicle_Mode_CoordinatorQualifiedTransitionType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(api_qualifiedTransition)
    }

    def parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container(): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P = {
      val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_qualifiedTransition")
      val api_qualifiedTransition = parseVehicle_Mode_CoordinatorQualifiedTransitionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_storedRecoveryTarget")
      val api_storedRecoveryTarget = parseVehicle_Mode_CoordinatorRecoveryTargetType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(api_qualifiedTransition, api_storedRecoveryTarget)
    }

    def parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS = {
      val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("In_controllerMode")
      val In_controllerMode = parseVehicle_Mode_CoordinatorControllerModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_qualifiedTransition")
      val api_qualifiedTransition = parseVehicle_Mode_CoordinatorQualifiedTransitionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_storedRecoveryTarget")
      val api_storedRecoveryTarget = parseVehicle_Mode_CoordinatorRecoveryTargetType()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(In_controllerMode, api_qualifiedTransition, api_storedRecoveryTarget)
    }

    def parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container(): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P = {
      val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PT(typeParsed: B): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_appliedNextMode")
      val api_appliedNextMode = parseVehicle_Mode_CoordinatorControllerModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_modeForQualification")
      val api_modeForQualification = parseVehicle_Mode_CoordinatorControllerModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_modeForRecovery")
      val api_modeForRecovery = parseVehicle_Mode_CoordinatorControllerModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resolutionForPublication")
      val api_resolutionForPublication = parseVehicle_Mode_CoordinatorTransitionResolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resolutionForRecovery")
      val api_resolutionForRecovery = parseVehicle_Mode_CoordinatorTransitionResolution()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(api_appliedNextMode, api_modeForQualification, api_modeForRecovery, api_resolutionForPublication, api_resolutionForRecovery)
    }

    def parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS = {
      val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PST(typeParsed: B): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("controllerMode")
      val controllerMode = parseVehicle_Mode_CoordinatorControllerModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_appliedNextMode")
      val api_appliedNextMode = parseVehicle_Mode_CoordinatorControllerModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_modeForQualification")
      val api_modeForQualification = parseVehicle_Mode_CoordinatorControllerModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_modeForRecovery")
      val api_modeForRecovery = parseVehicle_Mode_CoordinatorControllerModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resolutionForPublication")
      val api_resolutionForPublication = parseVehicle_Mode_CoordinatorTransitionResolution()
      parser.parseObjectNext()
      parser.parseObjectKey("api_resolutionForRecovery")
      val api_resolutionForRecovery = parseVehicle_Mode_CoordinatorTransitionResolution()
      parser.parseObjectNext()
      return Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(controllerMode, api_appliedNextMode, api_modeForQualification, api_modeForRecovery, api_resolutionForPublication, api_resolutionForRecovery)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS", "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS", "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS", "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS", "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS", "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS", "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS", "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS", "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS", "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS", "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS", "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS", "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS", "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS", "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS", "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Vehicle_Mode_Coordinator.ServiceFacts_Payload", "Vehicle_Mode_Coordinator.ServiceLevels_Payload", "Vehicle_Mode_Coordinator.ReportCurrency_Payload", "Vehicle_Mode_Coordinator.RecoveryTarget_Payload", "Vehicle_Mode_Coordinator.ControllerMode_Payload", "Vehicle_Mode_Coordinator.TransitionKind_Payload", "Vehicle_Mode_Coordinator.SelectedIntent_Payload", "Vehicle_Mode_Coordinator.LifecycleFacts_Payload", "Vehicle_Mode_Coordinator.LifecycleLevels_Payload", "Vehicle_Mode_Coordinator.ReportedCondition_Payload", "Vehicle_Mode_Coordinator.ArbitrationResult_Payload", "Vehicle_Mode_Coordinator.ConditionEvidence_Payload", "Vehicle_Mode_Coordinator.CoordinationStatus_Payload", "Vehicle_Mode_Coordinator.ConditionAssessment_Payload", "Vehicle_Mode_Coordinator.QualifiedTransition_Payload", "Vehicle_Mode_Coordinator.CoordinationOutcome_Payload", "Vehicle_Mode_Coordinator.TransitionResolution_Payload", "Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload", "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS", "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS", "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS", "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS", "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS", "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS", "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS", "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS", "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS", "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS", "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS", "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS", "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS", "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS", "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P", "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS", "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P", "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS"))
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
        case "Vehicle_Mode_Coordinator.ServiceFacts_Payload" => val r = parseVehicle_Mode_CoordinatorServiceFacts_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.ServiceLevels_Payload" => val r = parseVehicle_Mode_CoordinatorServiceLevels_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.ReportCurrency_Payload" => val r = parseVehicle_Mode_CoordinatorReportCurrency_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.RecoveryTarget_Payload" => val r = parseVehicle_Mode_CoordinatorRecoveryTarget_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.ControllerMode_Payload" => val r = parseVehicle_Mode_CoordinatorControllerMode_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.TransitionKind_Payload" => val r = parseVehicle_Mode_CoordinatorTransitionKind_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.SelectedIntent_Payload" => val r = parseVehicle_Mode_CoordinatorSelectedIntent_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.LifecycleFacts_Payload" => val r = parseVehicle_Mode_CoordinatorLifecycleFacts_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.LifecycleLevels_Payload" => val r = parseVehicle_Mode_CoordinatorLifecycleLevels_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.ReportedCondition_Payload" => val r = parseVehicle_Mode_CoordinatorReportedCondition_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.ArbitrationResult_Payload" => val r = parseVehicle_Mode_CoordinatorArbitrationResult_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.ConditionEvidence_Payload" => val r = parseVehicle_Mode_CoordinatorConditionEvidence_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.CoordinationStatus_Payload" => val r = parseVehicle_Mode_CoordinatorCoordinationStatus_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.ConditionAssessment_Payload" => val r = parseVehicle_Mode_CoordinatorConditionAssessment_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.QualifiedTransition_Payload" => val r = parseVehicle_Mode_CoordinatorQualifiedTransition_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.CoordinationOutcome_Payload" => val r = parseVehicle_Mode_CoordinatorCoordinationOutcome_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.TransitionResolution_Payload" => val r = parseVehicle_Mode_CoordinatorTransitionResolution_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload" => val r = parseVehicle_Mode_CoordinatorParkingBrakeDisposition_PayloadT(T); return r
        case "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P" => val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS" => val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PST(T); return r
        case "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P" => val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PT(T); return r
        case "Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS" => val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PST(T); return r
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

  def fromVehicle_Mode_CoordinatorReportedCondition_Payload(o: Vehicle_Mode_Coordinator.ReportedCondition_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorReportedCondition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorReportedCondition_Payload(s: String): Either[Vehicle_Mode_Coordinator.ReportedCondition_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorReportedCondition_Payload(parser: Parser): Vehicle_Mode_Coordinator.ReportedCondition_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorReportedCondition_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorReportedCondition_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorReportCurrency_Payload(o: Vehicle_Mode_Coordinator.ReportCurrency_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorReportCurrency_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorReportCurrency_Payload(s: String): Either[Vehicle_Mode_Coordinator.ReportCurrency_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorReportCurrency_Payload(parser: Parser): Vehicle_Mode_Coordinator.ReportCurrency_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorReportCurrency_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorReportCurrency_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionAssessment_Payload(o: Vehicle_Mode_Coordinator.ConditionAssessment_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorConditionAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorConditionAssessment_Payload(s: String): Either[Vehicle_Mode_Coordinator.ConditionAssessment_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionAssessment_Payload(parser: Parser): Vehicle_Mode_Coordinator.ConditionAssessment_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorConditionAssessment_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorConditionAssessment_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorSelectedIntent_Payload(o: Vehicle_Mode_Coordinator.SelectedIntent_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorSelectedIntent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorSelectedIntent_Payload(s: String): Either[Vehicle_Mode_Coordinator.SelectedIntent_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorSelectedIntent_Payload(parser: Parser): Vehicle_Mode_Coordinator.SelectedIntent_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorSelectedIntent_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorSelectedIntent_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorControllerMode_Payload(o: Vehicle_Mode_Coordinator.ControllerMode_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorControllerMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorControllerMode_Payload(s: String): Either[Vehicle_Mode_Coordinator.ControllerMode_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorControllerMode_Payload(parser: Parser): Vehicle_Mode_Coordinator.ControllerMode_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorControllerMode_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorControllerMode_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionKind_Payload(o: Vehicle_Mode_Coordinator.TransitionKind_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorTransitionKind_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorTransitionKind_Payload(s: String): Either[Vehicle_Mode_Coordinator.TransitionKind_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionKind_Payload(parser: Parser): Vehicle_Mode_Coordinator.TransitionKind_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorTransitionKind_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorTransitionKind_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload(o: Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload(s: String): Either[Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload(parser: Parser): Vehicle_Mode_Coordinator.ParkingBrakeDisposition_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorParkingBrakeDisposition_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationStatus_Payload(o: Vehicle_Mode_Coordinator.CoordinationStatus_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorCoordinationStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorCoordinationStatus_Payload(s: String): Either[Vehicle_Mode_Coordinator.CoordinationStatus_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationStatus_Payload(parser: Parser): Vehicle_Mode_Coordinator.CoordinationStatus_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorCoordinationStatus_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorCoordinationStatus_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorRecoveryTarget_Payload(o: Vehicle_Mode_Coordinator.RecoveryTarget_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorRecoveryTarget_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorRecoveryTarget_Payload(s: String): Either[Vehicle_Mode_Coordinator.RecoveryTarget_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorRecoveryTarget_Payload(parser: Parser): Vehicle_Mode_Coordinator.RecoveryTarget_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorRecoveryTarget_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorRecoveryTarget_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorQualifiedTransition_Payload(o: Vehicle_Mode_Coordinator.QualifiedTransition_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorQualifiedTransition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorQualifiedTransition_Payload(s: String): Either[Vehicle_Mode_Coordinator.QualifiedTransition_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorQualifiedTransition_Payload(parser: Parser): Vehicle_Mode_Coordinator.QualifiedTransition_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorQualifiedTransition_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorQualifiedTransition_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleLevels(o: Vehicle_Mode_Coordinator.LifecycleLevels, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorLifecycleLevels(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorLifecycleLevels(s: String): Either[Vehicle_Mode_Coordinator.LifecycleLevels, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleLevels(parser: Parser): Vehicle_Mode_Coordinator.LifecycleLevels = {
      val r = parser.parseVehicle_Mode_CoordinatorLifecycleLevels()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorLifecycleLevels _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleLevels_Payload(o: Vehicle_Mode_Coordinator.LifecycleLevels_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorLifecycleLevels_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorLifecycleLevels_Payload(s: String): Either[Vehicle_Mode_Coordinator.LifecycleLevels_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleLevels_Payload(parser: Parser): Vehicle_Mode_Coordinator.LifecycleLevels_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorLifecycleLevels_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorLifecycleLevels_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleFacts(o: Vehicle_Mode_Coordinator.LifecycleFacts, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorLifecycleFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorLifecycleFacts(s: String): Either[Vehicle_Mode_Coordinator.LifecycleFacts, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleFacts(parser: Parser): Vehicle_Mode_Coordinator.LifecycleFacts = {
      val r = parser.parseVehicle_Mode_CoordinatorLifecycleFacts()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorLifecycleFacts _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleFacts_Payload(o: Vehicle_Mode_Coordinator.LifecycleFacts_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorLifecycleFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorLifecycleFacts_Payload(s: String): Either[Vehicle_Mode_Coordinator.LifecycleFacts_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleFacts_Payload(parser: Parser): Vehicle_Mode_Coordinator.LifecycleFacts_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorLifecycleFacts_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorLifecycleFacts_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceLevels(o: Vehicle_Mode_Coordinator.ServiceLevels, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorServiceLevels(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorServiceLevels(s: String): Either[Vehicle_Mode_Coordinator.ServiceLevels, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceLevels(parser: Parser): Vehicle_Mode_Coordinator.ServiceLevels = {
      val r = parser.parseVehicle_Mode_CoordinatorServiceLevels()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorServiceLevels _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceLevels_Payload(o: Vehicle_Mode_Coordinator.ServiceLevels_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorServiceLevels_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorServiceLevels_Payload(s: String): Either[Vehicle_Mode_Coordinator.ServiceLevels_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceLevels_Payload(parser: Parser): Vehicle_Mode_Coordinator.ServiceLevels_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorServiceLevels_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorServiceLevels_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceFacts(o: Vehicle_Mode_Coordinator.ServiceFacts, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorServiceFacts(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorServiceFacts(s: String): Either[Vehicle_Mode_Coordinator.ServiceFacts, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceFacts(parser: Parser): Vehicle_Mode_Coordinator.ServiceFacts = {
      val r = parser.parseVehicle_Mode_CoordinatorServiceFacts()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorServiceFacts _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceFacts_Payload(o: Vehicle_Mode_Coordinator.ServiceFacts_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorServiceFacts_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorServiceFacts_Payload(s: String): Either[Vehicle_Mode_Coordinator.ServiceFacts_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceFacts_Payload(parser: Parser): Vehicle_Mode_Coordinator.ServiceFacts_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorServiceFacts_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorServiceFacts_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionEvidence(o: Vehicle_Mode_Coordinator.ConditionEvidence, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorConditionEvidence(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorConditionEvidence(s: String): Either[Vehicle_Mode_Coordinator.ConditionEvidence, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionEvidence(parser: Parser): Vehicle_Mode_Coordinator.ConditionEvidence = {
      val r = parser.parseVehicle_Mode_CoordinatorConditionEvidence()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorConditionEvidence _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionEvidence_Payload(o: Vehicle_Mode_Coordinator.ConditionEvidence_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorConditionEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorConditionEvidence_Payload(s: String): Either[Vehicle_Mode_Coordinator.ConditionEvidence_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionEvidence_Payload(parser: Parser): Vehicle_Mode_Coordinator.ConditionEvidence_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorConditionEvidence_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorConditionEvidence_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorArbitrationResult(o: Vehicle_Mode_Coordinator.ArbitrationResult, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorArbitrationResult(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorArbitrationResult(s: String): Either[Vehicle_Mode_Coordinator.ArbitrationResult, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorArbitrationResult(parser: Parser): Vehicle_Mode_Coordinator.ArbitrationResult = {
      val r = parser.parseVehicle_Mode_CoordinatorArbitrationResult()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorArbitrationResult _)
    return r
  }

  def fromVehicle_Mode_CoordinatorArbitrationResult_Payload(o: Vehicle_Mode_Coordinator.ArbitrationResult_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorArbitrationResult_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorArbitrationResult_Payload(s: String): Either[Vehicle_Mode_Coordinator.ArbitrationResult_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorArbitrationResult_Payload(parser: Parser): Vehicle_Mode_Coordinator.ArbitrationResult_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorArbitrationResult_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorArbitrationResult_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionResolution(o: Vehicle_Mode_Coordinator.TransitionResolution, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorTransitionResolution(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorTransitionResolution(s: String): Either[Vehicle_Mode_Coordinator.TransitionResolution, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionResolution(parser: Parser): Vehicle_Mode_Coordinator.TransitionResolution = {
      val r = parser.parseVehicle_Mode_CoordinatorTransitionResolution()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorTransitionResolution _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionResolution_Payload(o: Vehicle_Mode_Coordinator.TransitionResolution_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorTransitionResolution_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorTransitionResolution_Payload(s: String): Either[Vehicle_Mode_Coordinator.TransitionResolution_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionResolution_Payload(parser: Parser): Vehicle_Mode_Coordinator.TransitionResolution_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorTransitionResolution_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorTransitionResolution_Payload _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationOutcome(o: Vehicle_Mode_Coordinator.CoordinationOutcome, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorCoordinationOutcome(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorCoordinationOutcome(s: String): Either[Vehicle_Mode_Coordinator.CoordinationOutcome, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationOutcome(parser: Parser): Vehicle_Mode_Coordinator.CoordinationOutcome = {
      val r = parser.parseVehicle_Mode_CoordinatorCoordinationOutcome()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorCoordinationOutcome _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationOutcome_Payload(o: Vehicle_Mode_Coordinator.CoordinationOutcome_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorCoordinationOutcome_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorCoordinationOutcome_Payload(s: String): Either[Vehicle_Mode_Coordinator.CoordinationOutcome_Payload, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationOutcome_Payload(parser: Parser): Vehicle_Mode_Coordinator.CoordinationOutcome_Payload = {
      val r = parser.parseVehicle_Mode_CoordinatorCoordinationOutcome_Payload()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorCoordinationOutcome_Payload _)
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

  def fromVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container(s: String): Either[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container(parser: Parser): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container = {
      val r = parser.parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(s: String): Either[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P(parser: Parser): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(s: String): Either[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS(parser: Parser): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container(s: String): Either[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container(parser: Parser): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container = {
      val r = parser.parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(s: String): Either[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P(parser: Parser): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(s: String): Either[Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS(parser: Parser): Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorLifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container(s: String): Either[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container(parser: Parser): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container = {
      val r = parser.parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(s: String): Either[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P(parser: Parser): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(s: String): Either[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS(parser: Parser): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container(s: String): Either[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container(parser: Parser): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container = {
      val r = parser.parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(s: String): Either[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P(parser: Parser): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(s: String): Either[Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS(parser: Parser): Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container(s: String): Either[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container(parser: Parser): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container = {
      val r = parser.parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(s: String): Either[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P(parser: Parser): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(s: String): Either[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS(parser: Parser): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container(s: String): Either[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container(parser: Parser): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container = {
      val r = parser.parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(s: String): Either[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P(parser: Parser): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(s: String): Either[Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS(parser: Parser): Vehicle_Mode_Coordinator.ConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorConditionAssessmentOwner_vehicleModeCoordinationProcess_conditionAssessmentOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container(s: String): Either[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container(parser: Parser): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container = {
      val r = parser.parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(s: String): Either[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P(parser: Parser): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(s: String): Either[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS(parser: Parser): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container(s: String): Either[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container(parser: Parser): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container = {
      val r = parser.parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(s: String): Either[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P(parser: Parser): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(s: String): Either[Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS(parser: Parser): Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorIntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container(s: String): Either[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container(parser: Parser): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container = {
      val r = parser.parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(s: String): Either[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P(parser: Parser): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(s: String): Either[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS(parser: Parser): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container(s: String): Either[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container(parser: Parser): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container = {
      val r = parser.parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(s: String): Either[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P(parser: Parser): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(s: String): Either[Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS(parser: Parser): Vehicle_Mode_Coordinator.CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorCoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container(s: String): Either[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container(parser: Parser): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container = {
      val r = parser.parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(s: String): Either[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P(parser: Parser): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(s: String): Either[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS(parser: Parser): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container(s: String): Either[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container(parser: Parser): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container = {
      val r = parser.parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(s: String): Either[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P(parser: Parser): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(s: String): Either[Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS(parser: Parser): Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorRecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container(s: String): Either[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container(parser: Parser): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container = {
      val r = parser.parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(s: String): Either[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P(parser: Parser): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(s: String): Either[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS(parser: Parser): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container(s: String): Either[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container(parser: Parser): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container = {
      val r = parser.parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(s: String): Either[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P(parser: Parser): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(s: String): Either[Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS(parser: Parser): Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorTransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container(s: String): Either[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container(parser: Parser): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container = {
      val r = parser.parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(s: String): Either[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P(parser: Parser): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P = {
      val r = parser.parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(s: String): Either[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS(parser: Parser): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS = {
      val r = parser.parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container(s: String): Either[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container(parser: Parser): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container = {
      val r = parser.parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container _)
    return r
  }

  def fromVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(s: String): Either[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P(parser: Parser): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P = {
      val r = parser.parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_P _)
    return r
  }

  def fromVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(o: Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(s: String): Either[Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS(parser: Parser): Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS = {
      val r = parser.parseVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Mode_CoordinatorModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_PostState_Container_PS _)
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