// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

TemperatureRelation.scala

InputStatus.scala

TemperatureAssessment.scala

MaintenanceTiming.scala

MaintenanceAssessment.scala

ReturnIndication.scala

RecoveryProposal.scala

VehicleHealthMode.scala

DecisionReason.scala

ElectricalPowerDisposition.scala

RecoveryGuidance.scala

TemperatureSample.scala

MaintenanceSample.scala

ReturnSample.scala

HealthDecision.scala

Base_Types.scala

TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_Containers.scala

MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_Containers.scala

RecoveryApplicability_supervisionProcess_recoveryApplicability_Containers.scala

HealthModeArbitration_supervisionProcess_healthModeArbitration_Containers.scala

BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_Containers.scala

ObservationKind.scala

Container.scala

DataContent.scala

Aux_Types.scala

*/
@datatype class Config_String(minSize: Z, maxSize: Z, attempts: Z, verbose: B, filter: String => B) {}
@datatype class Config_Z(low: Option[Z], high: Option[Z], attempts: Z, verbose: B, filter: Z => B) {}

@datatype class Config_B(attempts: Z, verbose: B, filter: B => B) {}

@datatype class Config_C(low: Option[C], high: Option[C], attempts: Z, verbose: B, filter: C => B) {}

@datatype class Config_R(low: Option[R], high: Option[R], attempts: Z, verbose: B, filter: R => B) {}

@datatype class Config_F32(low: Option[F32], high: Option[F32], attempts: Z, verbose: B, filter: F32 => B) {}

@datatype class Config_F64(low: Option[F64], high: Option[F64], attempts: Z, verbose: B, filter: F64 => B) {}

@datatype class Config_S8(low: Option[S8], high: Option[S8], attempts: Z, verbose: B, filter: S8 => B) {}

@datatype class Config_S16(low: Option[S16], high: Option[S16], attempts: Z, verbose: B, filter: S16 => B) {}

@datatype class Config_S32(low: Option[S32], high: Option[S32], attempts: Z, verbose: B, filter: S32 => B) {}

@datatype class Config_S64(low: Option[S64], high: Option[S64], attempts: Z, verbose: B, filter: S64 => B) {}

@datatype class Config_U8(low: Option[U8], high: Option[U8], attempts: Z, verbose: B, filter: U8 => B) {}

@datatype class Config_U16(low: Option[U16], high: Option[U16], attempts: Z, verbose: B, filter: U16 => B) {}

@datatype class Config_U32(low: Option[U32], high: Option[U32], attempts: Z, verbose: B, filter: U32 => B) {}

@datatype class Config_U64(low: Option[U64], high: Option[U64], attempts: Z, verbose: B, filter: U64 => B) {}

@datatype class Config__artDataContent(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[_artDataContent_DataTypeId.Type], filter: art.DataContent => B) {}

@datatype class Config__artEmpty(attempts: Z, verbose: B, filter: art.Empty => B) {}

@datatype class Config_Base_TypesBoolean_Payload(attempts: Z, verbose: B, filter: Base_Types.Boolean_Payload => B) {}

@datatype class Config_Base_TypesInteger_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_Payload => B) {}

@datatype class Config_Base_TypesInteger_8_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_8_Payload => B) {}

@datatype class Config_Base_TypesInteger_16_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_16_Payload => B) {}

@datatype class Config_Base_TypesInteger_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_32_Payload => B) {}

@datatype class Config_Base_TypesInteger_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Integer_64_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_8_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_8_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_16_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_16_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_32_Payload => B) {}

@datatype class Config_Base_TypesUnsigned_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Unsigned_64_Payload => B) {}

@datatype class Config_Base_TypesFloat_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_Payload => B) {}

@datatype class Config_Base_TypesFloat_32_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_32_Payload => B) {}

@datatype class Config_Base_TypesFloat_64_Payload(attempts: Z, verbose: B, filter: Base_Types.Float_64_Payload => B) {}

@datatype class Config_Base_TypesCharacter_Payload(attempts: Z, verbose: B, filter: Base_Types.Character_Payload => B) {}

@datatype class Config_Base_TypesString_Payload(attempts: Z, verbose: B, filter: Base_Types.String_Payload => B) {}

@datatype class Config_ISZB(minSize: Z, maxSize: Z, attempts: Z, verbose: B, filter: ISZ[B] => B) {}

@datatype class Config_Base_TypesBits_Payload(attempts: Z, verbose: B, filter: Base_Types.Bits_Payload => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_DataTypeId.Type], filter: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_DataTypeId.Type], filter: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorBoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.BoundaryOutcomeDerivation_supervisionProcess_boundaryOutcomeDerivation_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorDecisionReasonType(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.DecisionReason.Type => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorDecisionReason_Payload(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.DecisionReason_Payload => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorElectricalPowerDispositionType(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition.Type => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorElectricalPowerDisposition_Payload(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.ElectricalPowerDisposition_Payload => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorHealthDecision(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.HealthDecision => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorHealthDecision_Payload(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.HealthDecision_Payload => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_DataTypeId.Type], filter: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_DataTypeId.Type], filter: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorHealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.HealthModeArbitration_supervisionProcess_healthModeArbitration_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorInputStatusType(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.InputStatus.Type => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorInputStatus_Payload(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.InputStatus_Payload => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorMaintenanceAssessmentType(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment.Type => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorMaintenanceAssessment_Payload(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.MaintenanceAssessment_Payload => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_DataTypeId.Type], filter: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_DataTypeId.Type], filter: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorMaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.MaintenanceEvidenceQualification_supervisionProcess_maintenanceQualification_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorMaintenanceSample(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.MaintenanceSample => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorMaintenanceSample_Payload(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.MaintenanceSample_Payload => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorMaintenanceTimingType(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.MaintenanceTiming.Type => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorMaintenanceTiming_Payload(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.MaintenanceTiming_Payload => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_DataTypeId.Type], filter: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_DataTypeId.Type], filter: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorRecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.RecoveryApplicability_supervisionProcess_recoveryApplicability_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorRecoveryGuidanceType(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.RecoveryGuidance.Type => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorRecoveryGuidance_Payload(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.RecoveryGuidance_Payload => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorRecoveryProposalType(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.RecoveryProposal.Type => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorRecoveryProposal_Payload(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.RecoveryProposal_Payload => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorReturnIndicationType(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.ReturnIndication.Type => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorReturnIndication_Payload(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.ReturnIndication_Payload => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorReturnSample(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.ReturnSample => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorReturnSample_Payload(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.ReturnSample_Payload => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorTemperatureAssessmentType(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.TemperatureAssessment.Type => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorTemperatureAssessment_Payload(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.TemperatureAssessment_Payload => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_DataTypeId.Type], filter: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_P => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PreState_Container_PS => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_DataTypeId.Type], filter: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_P => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorTemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.TemperatureEvidenceQualification_supervisionProcess_temperatureQualification_PostState_Container_PS => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorTemperatureRelationType(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.TemperatureRelation.Type => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorTemperatureRelation_Payload(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.TemperatureRelation_Payload => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorTemperatureSample(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.TemperatureSample => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorTemperatureSample_Payload(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.TemperatureSample_Payload => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorVehicleHealthModeType(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.VehicleHealthMode.Type => B) {}

@datatype class Config_Vehicle_Temperature_Health_SupervisorVehicleHealthMode_Payload(attempts: Z, verbose: B, filter: Vehicle_Temperature_Health_Supervisor.VehicleHealthMode_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


