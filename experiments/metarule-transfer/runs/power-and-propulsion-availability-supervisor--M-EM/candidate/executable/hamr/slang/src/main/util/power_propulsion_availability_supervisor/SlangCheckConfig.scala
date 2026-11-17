// #Sireum

package power_propulsion_availability_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

BatteryQuality.scala

EvidenceValidity.scala

EvidenceFreshness.scala

AdmissionResult.scala

BatteryAssessment.scala

PowerCondition.scala

PowerAssessment.scala

EnginePositionOneCondition.scala

EnginePositionTwoCondition.scala

EnginePairAssessment.scala

EngineCount.scala

AlternatingKinds.scala

ConfigurationAssessment.scala

PropulsionAssessment.scala

ChargerCoupling.scala

ChargingAssessment.scala

ControlEvent.scala

ActuationFeedback.scala

PriorityDirective.scala

DemandPhase.scala

RequestContextEvent.scala

FaultStatus.scala

FaultCause.scala

SummaryDirective.scala

RecoveryPhase.scala

RecoveryGate.scala

AvailabilityValue.scala

AvailabilityCause.scala

ReportAvailabilityValue.scala

ReportAvailabilityCause.scala

ReportDemandPhase.scala

ReportRecoveryPhase.scala

PowerCommand.scala

CommandPhase.scala

BatteryObservation.scala

QualifiedBatteryObservation.scala

PowerEvidence.scala

EnginePairEvidence.scala

ConfigurationEvidence.scala

ChargerEvidence.scala

RequestContext.scala

FaultActionSummary.scala

RecoveryFrame.scala

AvailabilityDecision.scala

AvailabilityReport.scala

Base_Types.scala

BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_Containers.scala

BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_Containers.scala

PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_Containers.scala

OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_Containers.scala

EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_Containers.scala

FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_Containers.scala

PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_Containers.scala

ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_Containers.scala

EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_Containers.scala

FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_Containers.scala

RecoveryQualificationOwner_supervisor_process_recovery_qualification_Containers.scala

AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_Containers.scala

PowerCommandInterlockOwner_supervisor_process_power_command_interlock_Containers.scala

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

@datatype class Config_Power_Propulsion_Availability_SupervisorActuationFeedbackType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ActuationFeedback.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorActuationFeedback_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ActuationFeedback_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAdmissionResultType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.AdmissionResult.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAdmissionResult_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.AdmissionResult_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAlternatingKindsType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.AlternatingKinds.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAlternatingKinds_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.AlternatingKinds_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAvailabilityCauseType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.AvailabilityCause.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAvailabilityCause_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.AvailabilityCause_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAvailabilityDecision(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.AvailabilityDecision => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAvailabilityDecision_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.AvailabilityDecision_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PreState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_PostState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAvailabilityReport(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.AvailabilityReport => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAvailabilityReport_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.AvailabilityReport_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAvailabilityValueType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.AvailabilityValue.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorAvailabilityValue_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.AvailabilityValue_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryAssessmentType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryAssessment_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.BatteryAssessment_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PreState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment_PostState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryObservation(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.BatteryObservation => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryObservation_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.BatteryObservation_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PreState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission_PostState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryQualityType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.BatteryQuality.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorBatteryQuality_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.BatteryQuality_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorChargerCouplingType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ChargerCoupling.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorChargerCoupling_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ChargerCoupling_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorChargerEvidence(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ChargerEvidence => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorChargerEvidence_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ChargerEvidence_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorChargingAssessmentType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorChargingAssessment_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ChargingAssessment_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PreState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ChargingInterlockAssessor_supervisor_process_charging_interlock_assessor_PostState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorCommandPhaseType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.CommandPhase.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorCommandPhase_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.CommandPhase_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorConfigurationAssessmentType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ConfigurationAssessment.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorConfigurationAssessment_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ConfigurationAssessment_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorConfigurationEvidence(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ConfigurationEvidence => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorConfigurationEvidence_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ConfigurationEvidence_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorControlEventType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ControlEvent.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorControlEvent_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ControlEvent_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorDemandPhaseType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.DemandPhase.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorDemandPhase_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.DemandPhase_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PreState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_PostState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEngineCountType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EngineCount.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEngineCount_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EngineCount_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEnginePairAssessmentType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEnginePairAssessment_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EnginePairAssessment_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEnginePairEvidence(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EnginePairEvidence => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEnginePairEvidence_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EnginePairEvidence_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEnginePositionOneConditionType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEnginePositionOneCondition_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EnginePositionOneCondition_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEnginePositionTwoConditionType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEnginePositionTwoCondition_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EnginePositionTwoCondition_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PreState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_PostState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEvidenceFreshnessType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EvidenceFreshness.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEvidenceFreshness_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EvidenceFreshness_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEvidenceValidityType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EvidenceValidity.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorEvidenceValidity_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.EvidenceValidity_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PreState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_PostState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFaultActionSummary(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.FaultActionSummary => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFaultActionSummary_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.FaultActionSummary_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFaultCauseType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.FaultCause.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFaultCause_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.FaultCause_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFaultStatusType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.FaultStatus.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFaultStatus_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.FaultStatus_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PreState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorFourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.FourEngineConfigurationAssessor_supervisor_process_four_engine_configuration_assessor_PostState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PreState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorOddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_PostState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerAssessmentType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PowerAssessment.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerAssessment_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PowerAssessment_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerCommandType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PowerCommand.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerCommand_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PowerCommand_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PreState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_PostState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerConditionType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PowerCondition.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerCondition_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PowerCondition_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerEvidence(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PowerEvidence => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerEvidence_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PowerEvidence_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PreState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_PostState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPriorityDirectiveType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PriorityDirective.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPriorityDirective_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PriorityDirective_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPropulsionAssessmentType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPropulsionAssessment_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PropulsionAssessment_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PreState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorPropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.PropulsionEvidenceComposer_supervisor_process_propulsion_evidence_composer_PostState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorQualifiedBatteryObservation(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorQualifiedBatteryObservation_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorRecoveryFrame(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.RecoveryFrame => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorRecoveryFrame_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.RecoveryFrame_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorRecoveryGateType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.RecoveryGate.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorRecoveryGate_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.RecoveryGate_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorRecoveryPhaseType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.RecoveryPhase.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorRecoveryPhase_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.RecoveryPhase_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PreState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_DataTypeId.Type], filter: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_P => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorRecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.RecoveryQualificationOwner_supervisor_process_recovery_qualification_PostState_Container_PS => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorReportAvailabilityCauseType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorReportAvailabilityCause_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ReportAvailabilityCause_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorReportAvailabilityValueType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorReportAvailabilityValue_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ReportAvailabilityValue_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorReportDemandPhaseType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ReportDemandPhase.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorReportDemandPhase_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ReportDemandPhase_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorReportRecoveryPhaseType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorReportRecoveryPhase_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.ReportRecoveryPhase_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorRequestContext(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.RequestContext => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorRequestContext_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.RequestContext_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorRequestContextEventType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.RequestContextEvent.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorRequestContextEvent_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.RequestContextEvent_Payload => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorSummaryDirectiveType(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.SummaryDirective.Type => B) {}

@datatype class Config_Power_Propulsion_Availability_SupervisorSummaryDirective_Payload(attempts: Z, verbose: B, filter: Power_Propulsion_Availability_Supervisor.SummaryDirective_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


