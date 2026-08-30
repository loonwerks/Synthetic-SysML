// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

InputStatus.scala

RequestDisposition.scala

HoldObservation.scala

HoldAssessment.scala

AsteroidCondition.scala

LaserCondition.scala

TargetCondition.scala

SupportAssessment.scala

GuardMode.scala

ResolutionReason.scala

MiningCommand.scala

GuardStatus.scala

OffloadReadiness.scala

PilotRequestSample.scala

RequestAssessment.scala

HoldSample.scala

MiningSupportSample.scala

GuardResolution.scala

Base_Types.scala

RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_Containers.scala

HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_Containers.scala

MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_Containers.scala

OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_Containers.scala

MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_Containers.scala

GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_Containers.scala

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

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorAsteroidConditionType(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition.Type => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorAsteroidCondition_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.AsteroidCondition_Payload => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorGuardModeType(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorGuardMode_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.GuardMode_Payload => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_DataTypeId.Type], filter: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_P => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PreState_Container_PS => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_DataTypeId.Type], filter: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_P => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorGuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_PostState_Container_PS => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.GuardResolution => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorGuardResolution_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.GuardResolution_Payload => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorGuardStatusType(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorGuardStatus_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.GuardStatus_Payload => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessmentType(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.Type => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorHoldAssessment_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.HoldAssessment_Payload => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_DataTypeId.Type], filter: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_P => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PreState_Container_PS => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_DataTypeId.Type], filter: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_P => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorHoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_PostState_Container_PS => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorHoldObservationType(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.HoldObservation.Type => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorHoldObservation_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.HoldObservation_Payload => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorHoldSample(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.HoldSample => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorHoldSample_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.HoldSample_Payload => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorInputStatusType(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.InputStatus.Type => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorInputStatus_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.InputStatus_Payload => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorLaserConditionType(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.LaserCondition.Type => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorLaserCondition_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.LaserCondition_Payload => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandType(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorMiningCommand_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.MiningCommand_Payload => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_DataTypeId.Type], filter: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_P => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PreState_Container_PS => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_DataTypeId.Type], filter: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_P => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorMiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_PostState_Container_PS => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_DataTypeId.Type], filter: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_P => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PreState_Container_PS => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_DataTypeId.Type], filter: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_P => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_PostState_Container_PS => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorMiningSupportSample_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample_Payload => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadinessType(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorOffloadReadiness_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness_Payload => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_DataTypeId.Type], filter: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_P => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PreState_Container_PS => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_DataTypeId.Type], filter: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_P => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorOreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner_PostState_Container_PS => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorPilotRequestSample_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.PilotRequestSample_Payload => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorRequestAssessment_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.RequestAssessment_Payload => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorRequestDispositionType(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition.Type => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorRequestDisposition_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.RequestDisposition_Payload => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_DataTypeId.Type], filter: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_P => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PreState_Container_PS => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_DataTypeId.Type], filter: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_P => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorRequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner_PostState_Container_PS => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorResolutionReasonType(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason.Type => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorResolutionReason_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.ResolutionReason_Payload => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessmentType(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.Type => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorSupportAssessment_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.SupportAssessment_Payload => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorTargetConditionType(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.TargetCondition.Type => B) {}

@datatype class Config_Ore_Hold_Mining_Guard_SupervisorTargetCondition_Payload(attempts: Z, verbose: B, filter: Ore_Hold_Mining_Guard_Supervisor.TargetCondition_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


