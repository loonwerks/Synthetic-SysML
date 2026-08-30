// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Lifecycle_Event.scala

Input_Status.scala

Qualified_Request.scala

Battery_Indication.scala

Battery_Assessment_Value.scala

Lifecycle_Phase.scala

Power_Permission.scala

Attention_Status.scala

Lifecycle_Request_Sample.scala

Battery_Sample.scala

Decision_Disposition.scala

Lifecycle_Actuation.scala

Base_Types.scala

Request_Qualification_governor_process_request_qualification_Containers.scala

Battery_Assessment_governor_process_battery_assessment_Containers.scala

Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_Containers.scala

Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_Containers.scala

Attention_Derivation_governor_process_attention_derivation_Containers.scala

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

@datatype class Config_Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorAttention_Derivation_governor_process_attention_derivation_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Attention_Derivation_governor_process_attention_derivation_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorAttention_StatusType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Attention_Status.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorAttention_Status_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Attention_Status_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBattery_Assessment_ValueType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Battery_Assessment_Value.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBattery_Assessment_Value_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Battery_Assessment_Value_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBattery_Assessment_governor_process_battery_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Battery_Assessment_governor_process_battery_assessment_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBattery_IndicationType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Battery_Indication.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBattery_Indication_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Battery_Indication_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBattery_Sample(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Battery_Sample => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBattery_Sample_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Battery_Sample_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorControlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorDecision_Disposition(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Decision_Disposition => B) {}

@datatype class Config_Drone_Lifecycle_GovernorDecision_Disposition_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Decision_Disposition_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorInput_StatusType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Input_Status.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorInput_Status_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Input_Status_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycle_Actuation(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Lifecycle_Actuation => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycle_Actuation_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Lifecycle_Actuation_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycle_EventType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Lifecycle_Event.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycle_Event_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Lifecycle_Event_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycle_PhaseType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Lifecycle_Phase.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycle_Phase_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Lifecycle_Phase_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycle_Request_Sample(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Lifecycle_Request_Sample => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycle_Request_Sample_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Lifecycle_Request_Sample_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorPower_PermissionType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Power_Permission.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorPower_Permission_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Power_Permission_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorQualified_RequestType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Qualified_Request.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorQualified_Request_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Qualified_Request_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRequest_Qualification_governor_process_request_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.Request_Qualification_governor_process_request_qualification_PostState_Container_PS => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


