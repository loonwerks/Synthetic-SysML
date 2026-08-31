// #Sireum

package drone_battery_charge_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

BatteryIndication.scala

InputStatus.scala

BatteryEvidence.scala

ChargerAvailability.scala

FlightActivity.scala

ChargeContext.scala

ChargeIntent.scala

QualifiedChargeIntent.scala

ChargeAuthorization.scala

ChargeDisposition.scala

BatteryAttention.scala

BatteryReadinessEvidence.scala

BatterySample.scala

ChargerSample.scala

FlightActivitySample.scala

ChargeIntentSample.scala

ChargeDecision.scala

Base_Types.scala

Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_Containers.scala

Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_Containers.scala

Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_Containers.scala

Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_Containers.scala

Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_Containers.scala

Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_Containers.scala

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

@datatype class Config_Drone_Battery_Charge_SupervisorBatteryAttentionType(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.BatteryAttention.Type => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorBatteryAttention_Payload(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.BatteryAttention_Payload => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorBatteryEvidenceType(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorBatteryEvidence_Payload(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.BatteryEvidence_Payload => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorBatteryIndicationType(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.BatteryIndication.Type => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorBatteryIndication_Payload(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.BatteryIndication_Payload => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidenceType(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorBatteryReadinessEvidence_Payload(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence_Payload => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorBatterySample(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.BatterySample => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorBatterySample_Payload(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.BatterySample_Payload => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_DataTypeId.Type], filter: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_P => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PreState_Container_PS => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_DataTypeId.Type], filter: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_P => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorBattery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification_PostState_Container_PS => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorChargeAuthorizationType(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorChargeAuthorization_Payload(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.ChargeAuthorization_Payload => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorChargeContextType(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.ChargeContext.Type => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorChargeContext_Payload(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.ChargeContext_Payload => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorChargeDecision(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.ChargeDecision => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorChargeDecision_Payload(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.ChargeDecision_Payload => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorChargeDispositionType(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.ChargeDisposition.Type => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorChargeDisposition_Payload(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.ChargeDisposition_Payload => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorChargeIntentType(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.ChargeIntent.Type => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorChargeIntent_Payload(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.ChargeIntent_Payload => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorChargeIntentSample(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.ChargeIntentSample => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorChargeIntentSample_Payload(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.ChargeIntentSample_Payload => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_DataTypeId.Type], filter: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_P => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PreState_Container_PS => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_DataTypeId.Type], filter: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_P => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Charge_Context_Qualification_charge_supervision_process_charge_context_qualification_PostState_Container_PS => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_DataTypeId.Type], filter: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_P => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PreState_Container_PS => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_DataTypeId.Type], filter: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_P => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_PostState_Container_PS => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_DataTypeId.Type], filter: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_P => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PreState_Container_PS => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_DataTypeId.Type], filter: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_P => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorCharge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_PostState_Container_PS => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorChargerAvailabilityType(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.ChargerAvailability.Type => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorChargerAvailability_Payload(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.ChargerAvailability_Payload => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorChargerSample(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.ChargerSample => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorChargerSample_Payload(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.ChargerSample_Payload => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorFlightActivityType(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.FlightActivity.Type => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorFlightActivity_Payload(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.FlightActivity_Payload => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorFlightActivitySample(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.FlightActivitySample => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorFlightActivitySample_Payload(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.FlightActivitySample_Payload => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorInputStatusType(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.InputStatus.Type => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorInputStatus_Payload(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.InputStatus_Payload => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_DataTypeId.Type], filter: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_P => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PreState_Container_PS => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_DataTypeId.Type], filter: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_P => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorPilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation_PostState_Container_PS => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntentType(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorQualifiedChargeIntent_Payload(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.QualifiedChargeIntent_Payload => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_DataTypeId.Type], filter: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_P => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PreState_Container_PS => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_DataTypeId.Type], filter: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_P => B) {}

@datatype class Config_Drone_Battery_Charge_SupervisorReadiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_PostState_Container_PS => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


