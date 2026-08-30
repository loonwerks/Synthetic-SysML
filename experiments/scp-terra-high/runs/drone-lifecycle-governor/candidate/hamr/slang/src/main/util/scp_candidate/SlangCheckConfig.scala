// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

LifecycleRequest.scala

ChargerState.scala

RecoveryProposal.scala

EffectiveIntent.scala

FreshRequestPreemption.scala

BatteryCapacityBand.scala

BatteryCheck.scala

BatteryQualification.scala

NavigationCondition.scala

RadioCondition.scala

FlightQualification.scala

LifecycleState.scala

EligibilityReason.scala

DecisionPreState.scala

DecisionNextState.scala

TransitionResult.scala

PowerCommand.scala

ChargeCommand.scala

FlightAuthorization.scala

PilotLifecycleState.scala

RequestDisposition.scala

PilotNotice.scala

ArbitratedIntent.scala

EligibilityEnvelope.scala

DecisionSnapshot.scala

PilotStatus.scala

Base_Types.scala

RequestArbiter_governorProcess_requestArbiter_Containers.scala

BatteryQualificationOwner_governorProcess_batteryQualificationOwner_Containers.scala

FlightReadinessOwner_governorProcess_flightReadinessOwner_Containers.scala

OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_Containers.scala

LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_Containers.scala

PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_Containers.scala

FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_Containers.scala

SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_Containers.scala

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

@datatype class Config_Drone_Lifecycle_GovernorArbitratedIntent(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.ArbitratedIntent => B) {}

@datatype class Config_Drone_Lifecycle_GovernorArbitratedIntent_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.ArbitratedIntent_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBatteryCapacityBandType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.BatteryCapacityBand.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBatteryCapacityBand_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.BatteryCapacityBand_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBatteryCheckType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.BatteryCheck.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBatteryCheck_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.BatteryCheck_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBatteryQualificationType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.BatteryQualification.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBatteryQualification_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.BatteryQualification_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorBatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.BatteryQualificationOwner_governorProcess_batteryQualificationOwner_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorChargeCommandType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.ChargeCommand.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorChargeCommand_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.ChargeCommand_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorChargerStateType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.ChargerState.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorChargerState_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.ChargerState_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorDecisionNextStateType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.DecisionNextState.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorDecisionNextState_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.DecisionNextState_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorDecisionPreStateType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.DecisionPreState.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorDecisionPreState_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.DecisionPreState_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorDecisionSnapshot(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.DecisionSnapshot => B) {}

@datatype class Config_Drone_Lifecycle_GovernorDecisionSnapshot_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.DecisionSnapshot_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorEffectiveIntentType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.EffectiveIntent.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorEffectiveIntent_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.EffectiveIntent_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorEligibilityEnvelope(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.EligibilityEnvelope => B) {}

@datatype class Config_Drone_Lifecycle_GovernorEligibilityEnvelope_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.EligibilityEnvelope_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorEligibilityReasonType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.EligibilityReason.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorEligibilityReason_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.EligibilityReason_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFlightAuthorizationType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.FlightAuthorization.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFlightAuthorization_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.FlightAuthorization_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.FlightAuthorizationPolicy_governorProcess_flightAuthorizationPolicy_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFlightQualificationType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.FlightQualification.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFlightQualification_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.FlightQualification_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.FlightReadinessOwner_governorProcess_flightReadinessOwner_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFreshRequestPreemptionType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.FreshRequestPreemption.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorFreshRequestPreemption_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.FreshRequestPreemption_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycleRequestType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.LifecycleRequest.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycleRequest_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.LifecycleRequest_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycleStateType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.LifecycleState.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycleState_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.LifecycleState_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorLifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.LifecycleStateGovernor_governorProcess_lifecycleStateGovernor_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorNavigationConditionType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.NavigationCondition.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorNavigationCondition_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.NavigationCondition_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorOperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorPilotLifecycleStateType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.PilotLifecycleState.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorPilotLifecycleState_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.PilotLifecycleState_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorPilotNoticeType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.PilotNotice.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorPilotNotice_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.PilotNotice_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorPilotStatus(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.PilotStatus => B) {}

@datatype class Config_Drone_Lifecycle_GovernorPilotStatus_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.PilotStatus_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorPowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.PowerChargeCommandPolicy_governorProcess_powerChargeCommandPolicy_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorPowerCommandType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.PowerCommand.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorPowerCommand_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.PowerCommand_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRadioConditionType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.RadioCondition.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRadioCondition_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.RadioCondition_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRecoveryProposalType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.RecoveryProposal.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRecoveryProposal_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.RecoveryProposal_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRequestArbiter_governorProcess_requestArbiter_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.RequestArbiter_governorProcess_requestArbiter_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRequestDispositionType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.RequestDisposition.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorRequestDisposition_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.RequestDisposition_Payload => B) {}

@datatype class Config_Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PreState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_DataTypeId.Type], filter: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container => B) {}

@datatype class Config_Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_P => B) {}

@datatype class Config_Drone_Lifecycle_GovernorSupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.SupervisoryStatusAssessment_governorProcess_supervisoryStatusAssessment_PostState_Container_PS => B) {}

@datatype class Config_Drone_Lifecycle_GovernorTransitionResultType(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.TransitionResult.Type => B) {}

@datatype class Config_Drone_Lifecycle_GovernorTransitionResult_Payload(attempts: Z, verbose: B, filter: Drone_Lifecycle_Governor.TransitionResult_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


