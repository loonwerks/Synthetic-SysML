// #Sireum

package battery_evidence_charge_qualification_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

BatteryCapacityBand.scala

BatteryCheck.scala

BatteryAssessment.scala

LifecycleContext.scala

ChargeContextQualification.scala

BatteryReadinessAdvice.scala

ChargerConnection.scala

ChargeActivity.scala

ChargerPathQualification.scala

ChargeSessionState.scala

ChargeEligibilityEnvelope.scala

ChargeRequest.scala

ChargeDecision.scala

SnapshotPreSessionState.scala

SnapshotNextSessionState.scala

SnapshotChargeDisposition.scala

ChargeReason.scala

ChargePermission.scala

FlightControlBatteryNotice.scala

PilotSessionState.scala

PilotChargeDisposition.scala

PilotAdvisory.scala

ChargeSessionSnapshot.scala

PilotBatteryStatus.scala

Base_Types.scala

BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_Containers.scala

ChargeContextQualifier_supervisorProcess_chargeContextQualifier_Containers.scala

ChargerPathQualifier_supervisorProcess_chargerPathQualifier_Containers.scala

ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_Containers.scala

ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_Containers.scala

ChargeSessionController_supervisorProcess_chargeSessionController_Containers.scala

FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_Containers.scala

PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_Containers.scala

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

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessmentType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryAssessment_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBandType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCapacityBand_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheckType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryCheck_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_DataTypeId.Type], filter: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_P => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PreState_Container_PS => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_DataTypeId.Type], filter: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_P => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier_PostState_Container_PS => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdviceType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorBatteryReadinessAdvice_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.BatteryReadinessAdvice_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivityType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeActivity_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualificationType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualification_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_DataTypeId.Type], filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_P => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PreState_Container_PS => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_DataTypeId.Type], filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_P => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualifier_supervisorProcess_chargeContextQualifier_PostState_Container_PS => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecisionType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeDecision_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelopeType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityEnvelope_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_DataTypeId.Type], filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_P => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PreState_Container_PS => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_DataTypeId.Type], filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_P => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_PostState_Container_PS => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_DataTypeId.Type], filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_P => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PreState_Container_PS => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_DataTypeId.Type], filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_P => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_PostState_Container_PS => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermissionType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargePermission_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReasonType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeReason_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequestType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeRequest_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_DataTypeId.Type], filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_P => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PreState_Container_PS => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_DataTypeId.Type], filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_P => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionController_supervisorProcess_chargeSessionController_PostState_Container_PS => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionSnapshot_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionStateType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargeSessionState_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnectionType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargerConnection_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualificationType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualification_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_DataTypeId.Type], filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_P => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PreState_Container_PS => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_DataTypeId.Type], filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_P => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualifier_supervisorProcess_chargerPathQualifier_PostState_Container_PS => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticeType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNotice_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_DataTypeId.Type], filter: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_P => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PreState_Container_PS => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_DataTypeId.Type], filter: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_P => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorFlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy_PostState_Container_PS => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContextType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorLifecycleContext_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisoryType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorPilotAdvisory_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.PilotAdvisory_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatus_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_DataTypeId.Type], filter: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_P => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PreState_Container_PS => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_DataTypeId.Type], filter: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_P => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorPilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy_PostState_Container_PS => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDispositionType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorPilotChargeDisposition_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.PilotChargeDisposition_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionStateType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorPilotSessionState_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.PilotSessionState_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDispositionType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotChargeDisposition_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionStateType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotNextSessionState_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState_Payload => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionStateType(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.Type => B) {}

@datatype class Config_Battery_Evidence_Charge_Qualification_SupervisorSnapshotPreSessionState_Payload(attempts: Z, verbose: B, filter: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


