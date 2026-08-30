// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

ThreatSampleValue.scala

IntentValue.scala

CargoBandValue.scala

CapacitorBandValue.scala

LocationValue.scala

ActionOutcomeValue.scala

ThreatValidityValue.scala

ThreatDispositionValue.scala

RecoveryGateValue.scala

EmergencyStateValue.scala

RecoveryStateValue.scala

ProposalValue.scala

MobilityProposalValue.scala

ActionValue.scala

SelectedCauseValue.scala

PublicResultValue.scala

MiningAvailabilityValue.scala

DefenseAvailabilityValue.scala

RetreatAvailabilityValue.scala

DestinationAvailabilityValue.scala

ServiceAvailabilityValue.scala

ReadinessAssessmentValue.scala

Base_Types.scala

Threat_Observation_supervisor_process_threat_observation_Containers.scala

Intent_Acquisition_supervisor_process_intent_acquisition_Containers.scala

Resource_Observation_supervisor_process_resource_observation_Containers.scala

Availability_Observation_supervisor_process_availability_observation_Containers.scala

Outcome_Observation_supervisor_process_outcome_observation_Containers.scala

Threat_Qualification_supervisor_process_threat_qualification_Containers.scala

Readiness_Assessment_supervisor_process_readiness_assessment_Containers.scala

Recovery_Control_supervisor_process_recovery_control_Containers.scala

Mining_Eligibility_supervisor_process_mining_eligibility_Containers.scala

Defense_Eligibility_supervisor_process_defense_eligibility_Containers.scala

Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_Containers.scala

Priority_Arbitration_supervisor_process_priority_arbitration_Containers.scala

Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_Containers.scala

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

@datatype class Config_Mining_Threat_Retreat_SupervisionActionOutcomeValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.ActionOutcomeValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionActionOutcomeValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.ActionOutcomeValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionActionValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.ActionValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionActionValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.ActionValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionAvailability_Observation_supervisor_process_availability_observation_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Availability_Observation_supervisor_process_availability_observation_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionCapacitorBandValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.CapacitorBandValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionCapacitorBandValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.CapacitorBandValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionCargoBandValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.CargoBandValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionCargoBandValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.CargoBandValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionDefenseAvailabilityValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionDefenseAvailabilityValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionDefense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Defense_Eligibility_supervisor_process_defense_eligibility_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionDestinationAvailabilityValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionDestinationAvailabilityValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionEmergencyStateValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.EmergencyStateValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionEmergencyStateValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.EmergencyStateValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionIntentValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.IntentValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionIntentValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.IntentValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionIntent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Intent_Acquisition_supervisor_process_intent_acquisition_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionLocationValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.LocationValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionLocationValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.LocationValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMiningAvailabilityValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.MiningAvailabilityValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMiningAvailabilityValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.MiningAvailabilityValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Mining_Eligibility_supervisor_process_mining_eligibility_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Mission_Mode_And_Public_Result_supervisor_process_mission_mode_and_public_result_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMobilityProposalValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.MobilityProposalValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMobilityProposalValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.MobilityProposalValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionMobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Mobility_Service_Eligibility_supervisor_process_mobility_service_eligibility_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionOutcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Outcome_Observation_supervisor_process_outcome_observation_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionPriority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Priority_Arbitration_supervisor_process_priority_arbitration_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionProposalValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.ProposalValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionProposalValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.ProposalValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionPublicResultValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.PublicResultValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionPublicResultValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.PublicResultValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionReadinessAssessmentValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionReadinessAssessmentValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionReadiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionRecoveryGateValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.RecoveryGateValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionRecoveryGateValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.RecoveryGateValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionRecoveryStateValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.RecoveryStateValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionRecoveryStateValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.RecoveryStateValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionRecovery_Control_supervisor_process_recovery_control_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Recovery_Control_supervisor_process_recovery_control_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionResource_Observation_supervisor_process_resource_observation_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Resource_Observation_supervisor_process_resource_observation_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionRetreatAvailabilityValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionRetreatAvailabilityValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionSelectedCauseValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.SelectedCauseValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionSelectedCauseValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.SelectedCauseValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionServiceAvailabilityValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionServiceAvailabilityValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreatDispositionValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.ThreatDispositionValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreatDispositionValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.ThreatDispositionValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreatSampleValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.ThreatSampleValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreatSampleValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.ThreatSampleValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreatValidityValue(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.ThreatValidityValue => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreatValidityValue_Payload(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.ThreatValidityValue_Payload => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreat_Observation_supervisor_process_threat_observation_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Threat_Observation_supervisor_process_threat_observation_PostState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PreState_Container_PS => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_DataTypeId.Type], filter: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_P => B) {}

@datatype class Config_Mining_Threat_Retreat_SupervisionThreat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Threat_Retreat_Supervision.Threat_Qualification_supervisor_process_threat_qualification_PostState_Container_PS => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


