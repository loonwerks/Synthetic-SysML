// #Sireum
// @formatter:off

// This file is auto-generated from TemperatureRelation.scala, InputStatus.scala, TemperatureAssessment.scala, MaintenanceTiming.scala, MaintenanceAssessment.scala, ReturnIndication.scala, RecoveryProposal.scala, VehicleHealthMode.scala, DecisionReason.scala, ElectricalPowerDisposition.scala, RecoveryGuidance.scala, TemperatureSample.scala, MaintenanceSample.scala, ReturnSample.scala, HealthDecision.scala, Base_Types.scala, TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_Containers.scala, MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_Containers.scala, RecoveryApplicability_supervisionProcess_recoveryApplicability_Containers.scala, HealthModeArbitration_supervisionProcess_healthModeArbitration_Containers.scala, BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package vehicle_temperature_health_supervisor

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printVehicle_Temperature_Health_SupervisorTemperatureRelationType(o: Vehicle_Temperature_Health_Supervisor.TemperatureRelation.Type): ST = {
      val value: String = o match {
        case Vehicle_Temperature_Health_Supervisor.TemperatureRelation.AtOrBelowMaximum => "AtOrBelowMaximum"
        case Vehicle_Temperature_Health_Supervisor.TemperatureRelation.AboveMaximum => "AboveMaximum"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Temperature_Health_Supervisor.TemperatureRelation")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload(o: Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload""""),
        ("value", printVehicle_Temperature_Health_SupervisorTemperatureRelationType(o.value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorInputStatusType(o: Vehicle_Temperature_Health_Supervisor.InputStatus.Type): ST = {
      val value: String = o match {
        case Vehicle_Temperature_Health_Supervisor.InputStatus.Valid => "Valid"
        case Vehicle_Temperature_Health_Supervisor.InputStatus.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Temperature_Health_Supervisor.InputStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorInputStatus_Payload(o: Vehicle_Temperature_Health_Supervisor.InputStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.InputStatus_Payload""""),
        ("value", printVehicle_Temperature_Health_SupervisorInputStatusType(o.value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o: Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type): ST = {
      val value: String = o match {
        case Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.InvalidTemperature => "InvalidTemperature"
        case Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.NominalTemperature => "NominalTemperature"
        case Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.OverTemperature => "OverTemperature"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Temperature_Health_Supervisor.TemperatureAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload(o: Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload""""),
        ("value", printVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorMaintenanceTimingType(o: Vehicle_Temperature_Health_Supervisor.MaintenanceTiming.Type): ST = {
      val value: String = o match {
        case Vehicle_Temperature_Health_Supervisor.MaintenanceTiming.NotDue => "NotDue"
        case Vehicle_Temperature_Health_Supervisor.MaintenanceTiming.Due => "Due"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Temperature_Health_Supervisor.MaintenanceTiming")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload(o: Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload""""),
        ("value", printVehicle_Temperature_Health_SupervisorMaintenanceTimingType(o.value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o: Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type): ST = {
      val value: String = o match {
        case Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.InvalidMaintenance => "InvalidMaintenance"
        case Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.MaintenanceClear => "MaintenanceClear"
        case Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.MaintenanceDue => "MaintenanceDue"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload(o: Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload""""),
        ("value", printVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorReturnIndicationType(o: Vehicle_Temperature_Health_Supervisor.ReturnIndication.Type): ST = {
      val value: String = o match {
        case Vehicle_Temperature_Health_Supervisor.ReturnIndication.NoRequest => "NoRequest"
        case Vehicle_Temperature_Health_Supervisor.ReturnIndication.FreshRequest => "FreshRequest"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Temperature_Health_Supervisor.ReturnIndication")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorReturnIndication_Payload(o: Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload""""),
        ("value", printVehicle_Temperature_Health_SupervisorReturnIndicationType(o.value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorRecoveryProposalType(o: Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type): ST = {
      val value: String = o match {
        case Vehicle_Temperature_Health_Supervisor.RecoveryProposal.InvalidRecoveryEvidence => "InvalidRecoveryEvidence"
        case Vehicle_Temperature_Health_Supervisor.RecoveryProposal.NotRequested => "NotRequested"
        case Vehicle_Temperature_Health_Supervisor.RecoveryProposal.BlockedByMaintenance => "BlockedByMaintenance"
        case Vehicle_Temperature_Health_Supervisor.RecoveryProposal.BlockedByTemperature => "BlockedByTemperature"
        case Vehicle_Temperature_Health_Supervisor.RecoveryProposal.EligibleRecovery => "EligibleRecovery"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Temperature_Health_Supervisor.RecoveryProposal")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload(o: Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload""""),
        ("value", printVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorVehicleHealthModeType(o: Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Type): ST = {
      val value: String = o match {
        case Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Operational => "Operational"
        case Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.TemperatureDegraded => "TemperatureDegraded"
        case Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.MaintenanceHold => "MaintenanceHold"
        case Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Temperature_Health_Supervisor.VehicleHealthMode")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload(o: Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload""""),
        ("value", printVehicle_Temperature_Health_SupervisorVehicleHealthModeType(o.value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorDecisionReasonType(o: Vehicle_Temperature_Health_Supervisor.DecisionReason.Type): ST = {
      val value: String = o match {
        case Vehicle_Temperature_Health_Supervisor.DecisionReason.InvalidEvidence => "InvalidEvidence"
        case Vehicle_Temperature_Health_Supervisor.DecisionReason.MaintenanceActive => "MaintenanceActive"
        case Vehicle_Temperature_Health_Supervisor.DecisionReason.TemperatureActive => "TemperatureActive"
        case Vehicle_Temperature_Health_Supervisor.DecisionReason.NormalRetained => "NormalRetained"
        case Vehicle_Temperature_Health_Supervisor.DecisionReason.RecoveryNotRequired => "RecoveryNotRequired"
        case Vehicle_Temperature_Health_Supervisor.DecisionReason.FreshRecoveryRequired => "FreshRecoveryRequired"
        case Vehicle_Temperature_Health_Supervisor.DecisionReason.RecoveryAccepted => "RecoveryAccepted"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Temperature_Health_Supervisor.DecisionReason")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorDecisionReason_Payload(o: Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload""""),
        ("value", printVehicle_Temperature_Health_SupervisorDecisionReasonType(o.value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorElectricalPowerDispositionType(o: Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.Type): ST = {
      val value: String = o match {
        case Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.Enable => "Enable"
        case Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.Withhold => "Withhold"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload(o: Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload""""),
        ("value", printVehicle_Temperature_Health_SupervisorElectricalPowerDispositionType(o.value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorRecoveryGuidanceType(o: Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.Type): ST = {
      val value: String = o match {
        case Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.None => "None"
        case Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.ClearActiveCondition => "ClearActiveCondition"
        case Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.SubmitFreshReturnRequest => "SubmitFreshReturnRequest"
        case Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.RepairInputEvidence => "RepairInputEvidence"
      }
      return printObject(ISZ(
        ("type", printString("Vehicle_Temperature_Health_Supervisor.RecoveryGuidance")),
        ("value", printString(value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload(o: Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload""""),
        ("value", printVehicle_Temperature_Health_SupervisorRecoveryGuidanceType(o.value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorTemperatureSample(o: Vehicle_Temperature_Health_Supervisor.TemperatureSample): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.TemperatureSample""""),
        ("relation", printVehicle_Temperature_Health_SupervisorTemperatureRelationType(o.relation)),
        ("status", printVehicle_Temperature_Health_SupervisorInputStatusType(o.status))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorTemperatureSample_Payload(o: Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload""""),
        ("value", printVehicle_Temperature_Health_SupervisorTemperatureSample(o.value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorMaintenanceSample(o: Vehicle_Temperature_Health_Supervisor.MaintenanceSample): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.MaintenanceSample""""),
        ("timing", printVehicle_Temperature_Health_SupervisorMaintenanceTimingType(o.timing)),
        ("status", printVehicle_Temperature_Health_SupervisorInputStatusType(o.status))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload(o: Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload""""),
        ("value", printVehicle_Temperature_Health_SupervisorMaintenanceSample(o.value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorReturnSample(o: Vehicle_Temperature_Health_Supervisor.ReturnSample): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.ReturnSample""""),
        ("indication", printVehicle_Temperature_Health_SupervisorReturnIndicationType(o.indication)),
        ("status", printVehicle_Temperature_Health_SupervisorInputStatusType(o.status))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorReturnSample_Payload(o: Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload""""),
        ("value", printVehicle_Temperature_Health_SupervisorReturnSample(o.value))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorHealthDecision(o: Vehicle_Temperature_Health_Supervisor.HealthDecision): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.HealthDecision""""),
        ("nextMode", printVehicle_Temperature_Health_SupervisorVehicleHealthModeType(o.nextMode)),
        ("reason", printVehicle_Temperature_Health_SupervisorDecisionReasonType(o.reason))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorHealthDecision_Payload(o: Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload""""),
        ("value", printVehicle_Temperature_Health_SupervisorHealthDecision(o.value))
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

    @pure def printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container): ST = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P => return printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS => return printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P""""),
        ("api_rawTemperature", printVehicle_Temperature_Health_SupervisorTemperatureSample(o.api_rawTemperature))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS""""),
        ("api_rawTemperature", printVehicle_Temperature_Health_SupervisorTemperatureSample(o.api_rawTemperature))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container): ST = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P => return printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS => return printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P""""),
        ("api_assessmentForArbitration", printVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.api_assessmentForArbitration)),
        ("api_assessmentForRecovery", printVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.api_assessmentForRecovery))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS""""),
        ("api_assessmentForArbitration", printVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.api_assessmentForArbitration)),
        ("api_assessmentForRecovery", printVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.api_assessmentForRecovery))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container): ST = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P => return printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS => return printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P""""),
        ("api_rawMaintenance", printVehicle_Temperature_Health_SupervisorMaintenanceSample(o.api_rawMaintenance))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS""""),
        ("api_rawMaintenance", printVehicle_Temperature_Health_SupervisorMaintenanceSample(o.api_rawMaintenance))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container): ST = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P => return printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS => return printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P""""),
        ("api_assessmentForArbitration", printVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.api_assessmentForArbitration)),
        ("api_assessmentForRecovery", printVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.api_assessmentForRecovery))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS""""),
        ("api_assessmentForArbitration", printVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.api_assessmentForArbitration)),
        ("api_assessmentForRecovery", printVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.api_assessmentForRecovery))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container): ST = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P => return printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS => return printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P""""),
        ("api_maintenanceAssessment", printVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.api_maintenanceAssessment)),
        ("api_rawReturn", printVehicle_Temperature_Health_SupervisorReturnSample(o.api_rawReturn)),
        ("api_temperatureAssessment", printVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.api_temperatureAssessment))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS""""),
        ("api_maintenanceAssessment", printVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.api_maintenanceAssessment)),
        ("api_rawReturn", printVehicle_Temperature_Health_SupervisorReturnSample(o.api_rawReturn)),
        ("api_temperatureAssessment", printVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.api_temperatureAssessment))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container): ST = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P => return printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS => return printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P""""),
        ("api_proposalForArbitration", printVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.api_proposalForArbitration)),
        ("api_proposalForOutcomes", printVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.api_proposalForOutcomes))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS""""),
        ("api_proposalForArbitration", printVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.api_proposalForArbitration)),
        ("api_proposalForOutcomes", printVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.api_proposalForOutcomes))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container): ST = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P => return printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS => return printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P""""),
        ("api_maintenanceAssessment", printVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.api_maintenanceAssessment)),
        ("api_recoveryProposal", printVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.api_recoveryProposal)),
        ("api_temperatureAssessment", printVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.api_temperatureAssessment))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS""""),
        ("api_maintenanceAssessment", printVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(o.api_maintenanceAssessment)),
        ("api_recoveryProposal", printVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.api_recoveryProposal)),
        ("api_temperatureAssessment", printVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(o.api_temperatureAssessment))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container): ST = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P => return printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS => return printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P""""),
        ("api_healthDecision", printVehicle_Temperature_Health_SupervisorHealthDecision(o.api_healthDecision))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS""""),
        ("api_healthDecision", printVehicle_Temperature_Health_SupervisorHealthDecision(o.api_healthDecision))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container): ST = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P => return printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS => return printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(o)
      }
    }

    @pure def printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P""""),
        ("api_healthDecision", printVehicle_Temperature_Health_SupervisorHealthDecision(o.api_healthDecision)),
        ("api_recoveryProposal", printVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.api_recoveryProposal))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS""""),
        ("api_healthDecision", printVehicle_Temperature_Health_SupervisorHealthDecision(o.api_healthDecision)),
        ("api_recoveryProposal", printVehicle_Temperature_Health_SupervisorRecoveryProposalType(o.api_recoveryProposal))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container): ST = {
      o match {
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P => return printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS => return printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(o)
      }
    }

    @pure def printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P""""),
        ("api_powerDisposition", printVehicle_Temperature_Health_SupervisorElectricalPowerDispositionType(o.api_powerDisposition)),
        ("api_recoveryGuidance", printVehicle_Temperature_Health_SupervisorRecoveryGuidanceType(o.api_recoveryGuidance)),
        ("api_vehicleHealthMode", printVehicle_Temperature_Health_SupervisorVehicleHealthModeType(o.api_vehicleHealthMode))
      ))
    }

    @pure def printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS""""),
        ("api_powerDisposition", printVehicle_Temperature_Health_SupervisorElectricalPowerDispositionType(o.api_powerDisposition)),
        ("api_recoveryGuidance", printVehicle_Temperature_Health_SupervisorRecoveryGuidanceType(o.api_recoveryGuidance)),
        ("api_vehicleHealthMode", printVehicle_Temperature_Health_SupervisorVehicleHealthModeType(o.api_vehicleHealthMode))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_temperatureQualification_postInit => "VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_temperatureQualification_postInit"
        case runtimemonitor.ObservationKind.VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_temperatureQualification_preCompute => "VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_temperatureQualification_preCompute"
        case runtimemonitor.ObservationKind.VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_temperatureQualification_postCompute => "VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_temperatureQualification_postCompute"
        case runtimemonitor.ObservationKind.VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_maintenanceQualification_postInit => "VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_maintenanceQualification_postInit"
        case runtimemonitor.ObservationKind.VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_maintenanceQualification_preCompute => "VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_maintenanceQualification_preCompute"
        case runtimemonitor.ObservationKind.VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_maintenanceQualification_postCompute => "VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_maintenanceQualification_postCompute"
        case runtimemonitor.ObservationKind.VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_recoveryApplicability_postInit => "VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_recoveryApplicability_postInit"
        case runtimemonitor.ObservationKind.VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_recoveryApplicability_preCompute => "VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_recoveryApplicability_preCompute"
        case runtimemonitor.ObservationKind.VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_recoveryApplicability_postCompute => "VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_recoveryApplicability_postCompute"
        case runtimemonitor.ObservationKind.VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_healthModeArbitration_postInit => "VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_healthModeArbitration_postInit"
        case runtimemonitor.ObservationKind.VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_healthModeArbitration_preCompute => "VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_healthModeArbitration_preCompute"
        case runtimemonitor.ObservationKind.VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_healthModeArbitration_postCompute => "VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_healthModeArbitration_postCompute"
        case runtimemonitor.ObservationKind.VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_boundaryOutcomeDerivation_postInit => "VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_boundaryOutcomeDerivation_postInit"
        case runtimemonitor.ObservationKind.VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_boundaryOutcomeDerivation_preCompute => "VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_boundaryOutcomeDerivation_preCompute"
        case runtimemonitor.ObservationKind.VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_boundaryOutcomeDerivation_postCompute => "VehicleTemperatureHealthSupervisorSystem_Instance_supervisionProcess_boundaryOutcomeDerivation_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P => return printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P => return printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS => return printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS => return printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P => return printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P => return printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS => return printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS => return printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P => return printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS => return printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P => return printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS => return printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P => return printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P => return printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS => return printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS => return printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P => return printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P => return printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS => return printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS => return printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(o)
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
        case o: Vehicle_Temperature_Health_Supervisor.InputStatus_Payload => return printVehicle_Temperature_Health_SupervisorInputStatus_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload => return printVehicle_Temperature_Health_SupervisorReturnSample_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload => return printVehicle_Temperature_Health_SupervisorDecisionReason_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload => return printVehicle_Temperature_Health_SupervisorHealthDecision_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload => return printVehicle_Temperature_Health_SupervisorReturnIndication_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload => return printVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload => return printVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload => return printVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload => return printVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload => return printVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload => return printVehicle_Temperature_Health_SupervisorTemperatureSample_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload => return printVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload => return printVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload => return printVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload => return printVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P => return printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P => return printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS => return printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS => return printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P => return printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P => return printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS => return printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS => return printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P => return printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS => return printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P => return printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS => return printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P => return printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P => return printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS => return printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS => return printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P => return printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P => return printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(o)
        case o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS => return printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(o)
        case o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS => return printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(o)
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

    def parseVehicle_Temperature_Health_SupervisorTemperatureRelationType(): Vehicle_Temperature_Health_Supervisor.TemperatureRelation.Type = {
      val r = parseVehicle_Temperature_Health_SupervisorTemperatureRelationT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureRelationT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureRelation.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.TemperatureRelation")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Temperature_Health_Supervisor.TemperatureRelation.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Temperature_Health_Supervisor.TemperatureRelation.")
          return Vehicle_Temperature_Health_Supervisor.TemperatureRelation.byOrdinal(0).get
      }
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload(): Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload = {
      val r = parseVehicle_Temperature_Health_SupervisorTemperatureRelation_PayloadT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureRelation_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Temperature_Health_SupervisorTemperatureRelationType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload(value)
    }

    def parseVehicle_Temperature_Health_SupervisorInputStatusType(): Vehicle_Temperature_Health_Supervisor.InputStatus.Type = {
      val r = parseVehicle_Temperature_Health_SupervisorInputStatusT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorInputStatusT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.InputStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.InputStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Temperature_Health_Supervisor.InputStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Temperature_Health_Supervisor.InputStatus.")
          return Vehicle_Temperature_Health_Supervisor.InputStatus.byOrdinal(0).get
      }
    }

    def parseVehicle_Temperature_Health_SupervisorInputStatus_Payload(): Vehicle_Temperature_Health_Supervisor.InputStatus_Payload = {
      val r = parseVehicle_Temperature_Health_SupervisorInputStatus_PayloadT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorInputStatus_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.InputStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.InputStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Temperature_Health_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.InputStatus_Payload(value)
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureAssessmentType(): Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type = {
      val r = parseVehicle_Temperature_Health_SupervisorTemperatureAssessmentT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureAssessmentT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.TemperatureAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.")
          return Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.byOrdinal(0).get
      }
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload(): Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload = {
      val r = parseVehicle_Temperature_Health_SupervisorTemperatureAssessment_PayloadT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureAssessment_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload(value)
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceTimingType(): Vehicle_Temperature_Health_Supervisor.MaintenanceTiming.Type = {
      val r = parseVehicle_Temperature_Health_SupervisorMaintenanceTimingT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceTimingT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceTiming.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.MaintenanceTiming")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Temperature_Health_Supervisor.MaintenanceTiming.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Temperature_Health_Supervisor.MaintenanceTiming.")
          return Vehicle_Temperature_Health_Supervisor.MaintenanceTiming.byOrdinal(0).get
      }
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload(): Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload = {
      val r = parseVehicle_Temperature_Health_SupervisorMaintenanceTiming_PayloadT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceTiming_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Temperature_Health_SupervisorMaintenanceTimingType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload(value)
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(): Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type = {
      val r = parseVehicle_Temperature_Health_SupervisorMaintenanceAssessmentT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceAssessmentT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.")
          return Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.byOrdinal(0).get
      }
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload(): Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload = {
      val r = parseVehicle_Temperature_Health_SupervisorMaintenanceAssessment_PayloadT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceAssessment_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload(value)
    }

    def parseVehicle_Temperature_Health_SupervisorReturnIndicationType(): Vehicle_Temperature_Health_Supervisor.ReturnIndication.Type = {
      val r = parseVehicle_Temperature_Health_SupervisorReturnIndicationT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorReturnIndicationT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.ReturnIndication.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.ReturnIndication")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Temperature_Health_Supervisor.ReturnIndication.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Temperature_Health_Supervisor.ReturnIndication.")
          return Vehicle_Temperature_Health_Supervisor.ReturnIndication.byOrdinal(0).get
      }
    }

    def parseVehicle_Temperature_Health_SupervisorReturnIndication_Payload(): Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload = {
      val r = parseVehicle_Temperature_Health_SupervisorReturnIndication_PayloadT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorReturnIndication_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Temperature_Health_SupervisorReturnIndicationType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload(value)
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryProposalType(): Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type = {
      val r = parseVehicle_Temperature_Health_SupervisorRecoveryProposalT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryProposalT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.RecoveryProposal")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Temperature_Health_Supervisor.RecoveryProposal.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Temperature_Health_Supervisor.RecoveryProposal.")
          return Vehicle_Temperature_Health_Supervisor.RecoveryProposal.byOrdinal(0).get
      }
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload(): Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload = {
      val r = parseVehicle_Temperature_Health_SupervisorRecoveryProposal_PayloadT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryProposal_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload(value)
    }

    def parseVehicle_Temperature_Health_SupervisorVehicleHealthModeType(): Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Type = {
      val r = parseVehicle_Temperature_Health_SupervisorVehicleHealthModeT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorVehicleHealthModeT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.VehicleHealthMode")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.")
          return Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.byOrdinal(0).get
      }
    }

    def parseVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload(): Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload = {
      val r = parseVehicle_Temperature_Health_SupervisorVehicleHealthMode_PayloadT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorVehicleHealthMode_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Temperature_Health_SupervisorVehicleHealthModeType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload(value)
    }

    def parseVehicle_Temperature_Health_SupervisorDecisionReasonType(): Vehicle_Temperature_Health_Supervisor.DecisionReason.Type = {
      val r = parseVehicle_Temperature_Health_SupervisorDecisionReasonT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorDecisionReasonT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.DecisionReason.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.DecisionReason")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Temperature_Health_Supervisor.DecisionReason.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Temperature_Health_Supervisor.DecisionReason.")
          return Vehicle_Temperature_Health_Supervisor.DecisionReason.byOrdinal(0).get
      }
    }

    def parseVehicle_Temperature_Health_SupervisorDecisionReason_Payload(): Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload = {
      val r = parseVehicle_Temperature_Health_SupervisorDecisionReason_PayloadT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorDecisionReason_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Temperature_Health_SupervisorDecisionReasonType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload(value)
    }

    def parseVehicle_Temperature_Health_SupervisorElectricalPowerDispositionType(): Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.Type = {
      val r = parseVehicle_Temperature_Health_SupervisorElectricalPowerDispositionT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorElectricalPowerDispositionT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.")
          return Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.byOrdinal(0).get
      }
    }

    def parseVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload(): Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload = {
      val r = parseVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_PayloadT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Temperature_Health_SupervisorElectricalPowerDispositionType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload(value)
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryGuidanceType(): Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.Type = {
      val r = parseVehicle_Temperature_Health_SupervisorRecoveryGuidanceT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryGuidanceT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.RecoveryGuidance")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.")
          return Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.byOrdinal(0).get
      }
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload(): Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload = {
      val r = parseVehicle_Temperature_Health_SupervisorRecoveryGuidance_PayloadT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryGuidance_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Temperature_Health_SupervisorRecoveryGuidanceType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload(value)
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureSample(): Vehicle_Temperature_Health_Supervisor.TemperatureSample = {
      val r = parseVehicle_Temperature_Health_SupervisorTemperatureSampleT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureSampleT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureSample = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.TemperatureSample")
      }
      parser.parseObjectKey("relation")
      val relation = parseVehicle_Temperature_Health_SupervisorTemperatureRelationType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseVehicle_Temperature_Health_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.TemperatureSample(relation, status)
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureSample_Payload(): Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload = {
      val r = parseVehicle_Temperature_Health_SupervisorTemperatureSample_PayloadT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureSample_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Temperature_Health_SupervisorTemperatureSample()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload(value)
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceSample(): Vehicle_Temperature_Health_Supervisor.MaintenanceSample = {
      val r = parseVehicle_Temperature_Health_SupervisorMaintenanceSampleT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceSampleT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceSample = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.MaintenanceSample")
      }
      parser.parseObjectKey("timing")
      val timing = parseVehicle_Temperature_Health_SupervisorMaintenanceTimingType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseVehicle_Temperature_Health_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceSample(timing, status)
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload(): Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload = {
      val r = parseVehicle_Temperature_Health_SupervisorMaintenanceSample_PayloadT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceSample_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Temperature_Health_SupervisorMaintenanceSample()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload(value)
    }

    def parseVehicle_Temperature_Health_SupervisorReturnSample(): Vehicle_Temperature_Health_Supervisor.ReturnSample = {
      val r = parseVehicle_Temperature_Health_SupervisorReturnSampleT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorReturnSampleT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.ReturnSample = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.ReturnSample")
      }
      parser.parseObjectKey("indication")
      val indication = parseVehicle_Temperature_Health_SupervisorReturnIndicationType()
      parser.parseObjectNext()
      parser.parseObjectKey("status")
      val status = parseVehicle_Temperature_Health_SupervisorInputStatusType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.ReturnSample(indication, status)
    }

    def parseVehicle_Temperature_Health_SupervisorReturnSample_Payload(): Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload = {
      val r = parseVehicle_Temperature_Health_SupervisorReturnSample_PayloadT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorReturnSample_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Temperature_Health_SupervisorReturnSample()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload(value)
    }

    def parseVehicle_Temperature_Health_SupervisorHealthDecision(): Vehicle_Temperature_Health_Supervisor.HealthDecision = {
      val r = parseVehicle_Temperature_Health_SupervisorHealthDecisionT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorHealthDecisionT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.HealthDecision = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.HealthDecision")
      }
      parser.parseObjectKey("nextMode")
      val nextMode = parseVehicle_Temperature_Health_SupervisorVehicleHealthModeType()
      parser.parseObjectNext()
      parser.parseObjectKey("reason")
      val reason = parseVehicle_Temperature_Health_SupervisorDecisionReasonType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.HealthDecision(nextMode, reason)
    }

    def parseVehicle_Temperature_Health_SupervisorHealthDecision_Payload(): Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload = {
      val r = parseVehicle_Temperature_Health_SupervisorHealthDecision_PayloadT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorHealthDecision_PayloadT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseVehicle_Temperature_Health_SupervisorHealthDecision()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload(value)
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

    def parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container(): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P", "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P = {
      val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_rawTemperature")
      val api_rawTemperature = parseVehicle_Temperature_Health_SupervisorTemperatureSample()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(api_rawTemperature)
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS = {
      val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_rawTemperature")
      val api_rawTemperature = parseVehicle_Temperature_Health_SupervisorTemperatureSample()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(api_rawTemperature)
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container(): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P", "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P = {
      val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_assessmentForArbitration")
      val api_assessmentForArbitration = parseVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_assessmentForRecovery")
      val api_assessmentForRecovery = parseVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(api_assessmentForArbitration, api_assessmentForRecovery)
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS = {
      val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_assessmentForArbitration")
      val api_assessmentForArbitration = parseVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_assessmentForRecovery")
      val api_assessmentForRecovery = parseVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(api_assessmentForArbitration, api_assessmentForRecovery)
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container(): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P", "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P = {
      val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P")
      }
      parser.parseObjectKey("api_rawMaintenance")
      val api_rawMaintenance = parseVehicle_Temperature_Health_SupervisorMaintenanceSample()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(api_rawMaintenance)
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS = {
      val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS")
      }
      parser.parseObjectKey("api_rawMaintenance")
      val api_rawMaintenance = parseVehicle_Temperature_Health_SupervisorMaintenanceSample()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(api_rawMaintenance)
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container(): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P", "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P = {
      val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P")
      }
      parser.parseObjectKey("api_assessmentForArbitration")
      val api_assessmentForArbitration = parseVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_assessmentForRecovery")
      val api_assessmentForRecovery = parseVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(api_assessmentForArbitration, api_assessmentForRecovery)
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS = {
      val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS")
      }
      parser.parseObjectKey("api_assessmentForArbitration")
      val api_assessmentForArbitration = parseVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_assessmentForRecovery")
      val api_assessmentForRecovery = parseVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(api_assessmentForArbitration, api_assessmentForRecovery)
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container(): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P", "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P = {
      val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P")
      }
      parser.parseObjectKey("api_maintenanceAssessment")
      val api_maintenanceAssessment = parseVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_rawReturn")
      val api_rawReturn = parseVehicle_Temperature_Health_SupervisorReturnSample()
      parser.parseObjectNext()
      parser.parseObjectKey("api_temperatureAssessment")
      val api_temperatureAssessment = parseVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(api_maintenanceAssessment, api_rawReturn, api_temperatureAssessment)
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS = {
      val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS")
      }
      parser.parseObjectKey("api_maintenanceAssessment")
      val api_maintenanceAssessment = parseVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_rawReturn")
      val api_rawReturn = parseVehicle_Temperature_Health_SupervisorReturnSample()
      parser.parseObjectNext()
      parser.parseObjectKey("api_temperatureAssessment")
      val api_temperatureAssessment = parseVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(api_maintenanceAssessment, api_rawReturn, api_temperatureAssessment)
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container(): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P", "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P = {
      val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P")
      }
      parser.parseObjectKey("api_proposalForArbitration")
      val api_proposalForArbitration = parseVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_proposalForOutcomes")
      val api_proposalForOutcomes = parseVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(api_proposalForArbitration, api_proposalForOutcomes)
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS = {
      val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS")
      }
      parser.parseObjectKey("api_proposalForArbitration")
      val api_proposalForArbitration = parseVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_proposalForOutcomes")
      val api_proposalForOutcomes = parseVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(api_proposalForArbitration, api_proposalForOutcomes)
    }

    def parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container(): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P", "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P = {
      val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P")
      }
      parser.parseObjectKey("api_maintenanceAssessment")
      val api_maintenanceAssessment = parseVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryProposal")
      val api_recoveryProposal = parseVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_temperatureAssessment")
      val api_temperatureAssessment = parseVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(api_maintenanceAssessment, api_recoveryProposal, api_temperatureAssessment)
    }

    def parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS = {
      val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS")
      }
      parser.parseObjectKey("api_maintenanceAssessment")
      val api_maintenanceAssessment = parseVehicle_Temperature_Health_SupervisorMaintenanceAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryProposal")
      val api_recoveryProposal = parseVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_temperatureAssessment")
      val api_temperatureAssessment = parseVehicle_Temperature_Health_SupervisorTemperatureAssessmentType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(api_maintenanceAssessment, api_recoveryProposal, api_temperatureAssessment)
    }

    def parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container(): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P", "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P = {
      val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P")
      }
      parser.parseObjectKey("api_healthDecision")
      val api_healthDecision = parseVehicle_Temperature_Health_SupervisorHealthDecision()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(api_healthDecision)
    }

    def parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS = {
      val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS")
      }
      parser.parseObjectKey("api_healthDecision")
      val api_healthDecision = parseVehicle_Temperature_Health_SupervisorHealthDecision()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(api_healthDecision)
    }

    def parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container(): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P", "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS"))
      t.native match {
        case "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PST(T); return r
        case _ => val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PST(T); return r
      }
    }

    def parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P = {
      val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P")
      }
      parser.parseObjectKey("api_healthDecision")
      val api_healthDecision = parseVehicle_Temperature_Health_SupervisorHealthDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryProposal")
      val api_recoveryProposal = parseVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(api_healthDecision, api_recoveryProposal)
    }

    def parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS = {
      val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PST(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS")
      }
      parser.parseObjectKey("api_healthDecision")
      val api_healthDecision = parseVehicle_Temperature_Health_SupervisorHealthDecision()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryProposal")
      val api_recoveryProposal = parseVehicle_Temperature_Health_SupervisorRecoveryProposalType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(api_healthDecision, api_recoveryProposal)
    }

    def parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container(): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P", "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS"))
      t.native match {
        case "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PST(T); return r
      }
    }

    def parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P = {
      val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PT(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PT(typeParsed: B): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P")
      }
      parser.parseObjectKey("api_powerDisposition")
      val api_powerDisposition = parseVehicle_Temperature_Health_SupervisorElectricalPowerDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryGuidance")
      val api_recoveryGuidance = parseVehicle_Temperature_Health_SupervisorRecoveryGuidanceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_vehicleHealthMode")
      val api_vehicleHealthMode = parseVehicle_Temperature_Health_SupervisorVehicleHealthModeType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(api_powerDisposition, api_recoveryGuidance, api_vehicleHealthMode)
    }

    def parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS = {
      val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PST(F)
      return r
    }

    def parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PST(typeParsed: B): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS")
      }
      parser.parseObjectKey("api_powerDisposition")
      val api_powerDisposition = parseVehicle_Temperature_Health_SupervisorElectricalPowerDispositionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_recoveryGuidance")
      val api_recoveryGuidance = parseVehicle_Temperature_Health_SupervisorRecoveryGuidanceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_vehicleHealthMode")
      val api_vehicleHealthMode = parseVehicle_Temperature_Health_SupervisorVehicleHealthModeType()
      parser.parseObjectNext()
      return Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(api_powerDisposition, api_recoveryGuidance, api_vehicleHealthMode)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P", "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P", "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS", "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS", "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P", "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P", "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS", "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS", "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P", "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS", "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P", "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS", "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P", "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P", "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS", "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS", "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P", "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P", "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS", "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Vehicle_Temperature_Health_Supervisor.InputStatus_Payload", "Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload", "Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload", "Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload", "Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload", "Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload", "Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload", "Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload", "Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload", "Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload", "Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload", "Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload", "Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload", "Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload", "Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload", "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P", "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P", "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS", "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS", "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P", "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P", "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS", "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS", "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P", "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS", "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P", "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS", "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P", "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P", "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS", "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS", "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P", "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P", "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS", "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS"))
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
        case "Vehicle_Temperature_Health_Supervisor.InputStatus_Payload" => val r = parseVehicle_Temperature_Health_SupervisorInputStatus_PayloadT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload" => val r = parseVehicle_Temperature_Health_SupervisorReturnSample_PayloadT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload" => val r = parseVehicle_Temperature_Health_SupervisorDecisionReason_PayloadT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload" => val r = parseVehicle_Temperature_Health_SupervisorHealthDecision_PayloadT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload" => val r = parseVehicle_Temperature_Health_SupervisorReturnIndication_PayloadT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload" => val r = parseVehicle_Temperature_Health_SupervisorRecoveryGuidance_PayloadT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload" => val r = parseVehicle_Temperature_Health_SupervisorRecoveryProposal_PayloadT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload" => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceTiming_PayloadT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload" => val r = parseVehicle_Temperature_Health_SupervisorVehicleHealthMode_PayloadT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload" => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceSample_PayloadT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload" => val r = parseVehicle_Temperature_Health_SupervisorTemperatureSample_PayloadT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload" => val r = parseVehicle_Temperature_Health_SupervisorTemperatureRelation_PayloadT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload" => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceAssessment_PayloadT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload" => val r = parseVehicle_Temperature_Health_SupervisorTemperatureAssessment_PayloadT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload" => val r = parseVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_PayloadT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P" => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PT(T); return r
        case "Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PST(T); return r
        case "Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS" => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PST(T); return r
        case _ => val r = parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PST(T); return r
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

  def fromVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload(o: Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload(s: String): Either[Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload(parser: Parser): Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorTemperatureRelation_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorInputStatus_Payload(o: Vehicle_Temperature_Health_Supervisor.InputStatus_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorInputStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorInputStatus_Payload(s: String): Either[Vehicle_Temperature_Health_Supervisor.InputStatus_Payload, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorInputStatus_Payload(parser: Parser): Vehicle_Temperature_Health_Supervisor.InputStatus_Payload = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorInputStatus_Payload()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorInputStatus_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload(o: Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload(s: String): Either[Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload(parser: Parser): Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload(o: Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload(s: String): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload(parser: Parser): Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload(o: Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload(s: String): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload(parser: Parser): Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorReturnIndication_Payload(o: Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorReturnIndication_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorReturnIndication_Payload(s: String): Either[Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorReturnIndication_Payload(parser: Parser): Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorReturnIndication_Payload()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorReturnIndication_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload(o: Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload(s: String): Either[Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload(parser: Parser): Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorRecoveryProposal_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload(o: Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload(s: String): Either[Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload(parser: Parser): Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorDecisionReason_Payload(o: Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorDecisionReason_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorDecisionReason_Payload(s: String): Either[Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorDecisionReason_Payload(parser: Parser): Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorDecisionReason_Payload()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorDecisionReason_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload(o: Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload(s: String): Either[Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload(parser: Parser): Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload(o: Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload(s: String): Either[Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload(parser: Parser): Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorTemperatureSample(o: Vehicle_Temperature_Health_Supervisor.TemperatureSample, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorTemperatureSample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureSample(s: String): Either[Vehicle_Temperature_Health_Supervisor.TemperatureSample, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureSample(parser: Parser): Vehicle_Temperature_Health_Supervisor.TemperatureSample = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorTemperatureSample()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorTemperatureSample _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorTemperatureSample_Payload(o: Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorTemperatureSample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureSample_Payload(s: String): Either[Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureSample_Payload(parser: Parser): Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorTemperatureSample_Payload()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorTemperatureSample_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceSample(o: Vehicle_Temperature_Health_Supervisor.MaintenanceSample, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorMaintenanceSample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceSample(s: String): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceSample, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceSample(parser: Parser): Vehicle_Temperature_Health_Supervisor.MaintenanceSample = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorMaintenanceSample()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorMaintenanceSample _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload(o: Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload(s: String): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload(parser: Parser): Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorMaintenanceSample_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorReturnSample(o: Vehicle_Temperature_Health_Supervisor.ReturnSample, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorReturnSample(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorReturnSample(s: String): Either[Vehicle_Temperature_Health_Supervisor.ReturnSample, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorReturnSample(parser: Parser): Vehicle_Temperature_Health_Supervisor.ReturnSample = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorReturnSample()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorReturnSample _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorReturnSample_Payload(o: Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorReturnSample_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorReturnSample_Payload(s: String): Either[Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorReturnSample_Payload(parser: Parser): Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorReturnSample_Payload()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorReturnSample_Payload _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorHealthDecision(o: Vehicle_Temperature_Health_Supervisor.HealthDecision, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorHealthDecision(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorHealthDecision(s: String): Either[Vehicle_Temperature_Health_Supervisor.HealthDecision, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorHealthDecision(parser: Parser): Vehicle_Temperature_Health_Supervisor.HealthDecision = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorHealthDecision()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorHealthDecision _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorHealthDecision_Payload(o: Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorHealthDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorHealthDecision_Payload(s: String): Either[Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorHealthDecision_Payload(parser: Parser): Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorHealthDecision_Payload()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorHealthDecision_Payload _)
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

  def fromVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container(s: String): Either[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container(parser: Parser): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(s: String): Either[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(parser: Parser): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(s: String): Either[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(parser: Parser): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container(s: String): Either[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container(parser: Parser): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(s: String): Either[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(parser: Parser): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(s: String): Either[Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(parser: Parser): Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container(s: String): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container(parser: Parser): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(s: String): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(parser: Parser): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(s: String): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(parser: Parser): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container(s: String): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container(parser: Parser): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(s: String): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(parser: Parser): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(s: String): Either[Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(parser: Parser): Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container(s: String): Either[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container(parser: Parser): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(s: String): Either[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(parser: Parser): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(s: String): Either[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(parser: Parser): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container(s: String): Either[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container(parser: Parser): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(s: String): Either[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(parser: Parser): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(s: String): Either[Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(parser: Parser): Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container(s: String): Either[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container(parser: Parser): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(s: String): Either[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(parser: Parser): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(s: String): Either[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(parser: Parser): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container(s: String): Either[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container(parser: Parser): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(s: String): Either[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(parser: Parser): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(s: String): Either[Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(parser: Parser): Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container(s: String): Either[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container(parser: Parser): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(s: String): Either[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(parser: Parser): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(s: String): Either[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(parser: Parser): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container(s: String): Either[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container(parser: Parser): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(s: String): Either[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(parser: Parser): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P _)
    return r
  }

  def fromVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(o: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(s: String): Either[Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS, Json.ErrorMsg] = {
    def fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(parser: Parser): Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS = {
      val r = parser.parseVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS()
      return r
    }
    val r = to(s, fVehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS _)
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