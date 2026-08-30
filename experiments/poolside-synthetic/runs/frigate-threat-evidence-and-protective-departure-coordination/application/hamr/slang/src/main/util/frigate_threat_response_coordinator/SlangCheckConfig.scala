// #Sireum

package frigate_threat_response_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

ContactClass.scala

EvidenceStatus.scala

ThreatBand.scala

ThreatValidity.scala

AlertState.scala

ThreatReport.scala

DefenseAuthority.scala

DefenseOutcome.scala

ChannelGate.scala

ChannelState.scala

EscapeAuthority.scala

EscapeOutcome.scala

RouteStatus.scala

MiningInterlock.scala

DefenseProposal.scala

EscapeProposal.scala

ResponsePattern.scala

DefenseDirective.scala

EscapeDirective.scala

ResponseStage.scala

DefenseChannelCondition.scala

EscapeChannelCondition.scala

ThreatEvidence.scala

QualifiedThreat.scala

DefenseReadinessContext.scala

ResponseFrame.scala

Base_Types.scala

ThreatQualification_threatResponseProcess_threatQualification_Containers.scala

AlertMemory_threatResponseProcess_alertMemory_Containers.scala

DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_Containers.scala

EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_Containers.scala

DefenseReadiness_threatResponseProcess_defenseReadiness_Containers.scala

DepartureReadiness_threatResponseProcess_departureReadiness_Containers.scala

DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_Containers.scala

DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_Containers.scala

ResponseCoordination_threatResponseProcess_responseCoordination_Containers.scala

ReportFrameComposition_threatResponseProcess_reportFrameComposition_Containers.scala

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

@datatype class Config_Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorAlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.AlertMemory_threatResponseProcess_alertMemory_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorAlertStateType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.AlertState.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorAlertState_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.AlertState_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorChannelGateType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ChannelGate.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorChannelGate_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ChannelGate_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorChannelStateType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ChannelState.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorChannelState_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ChannelState_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorContactClassType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ContactClass.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorContactClass_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ContactClass_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseActivationDecision_threatResponseProcess_defenseActivationDecision_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseAuthorityType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseAuthority.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseAuthority_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseAuthority_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseChannelConditionType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseChannelCondition.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseChannelCondition_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseChannelCondition_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseChannelRecovery_threatResponseProcess_defenseChannelRecovery_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseDirectiveType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseDirective.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseDirective_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseDirective_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseOutcomeType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseOutcome.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseOutcome_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseOutcome_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseProposalType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseProposal.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseProposal_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseProposal_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseReadinessContext(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseReadinessContext => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseReadinessContext_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseReadinessContext_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DepartureInitiationDecision_threatResponseProcess_departureInitiationDecision_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorDepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEscapeAuthorityType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.EscapeAuthority.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEscapeAuthority_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.EscapeAuthority_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEscapeChannelConditionType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.EscapeChannelCondition.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEscapeChannelCondition_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.EscapeChannelCondition_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.EscapeChannelRecovery_threatResponseProcess_escapeChannelRecovery_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEscapeDirectiveType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.EscapeDirective.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEscapeDirective_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.EscapeDirective_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEscapeOutcomeType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.EscapeOutcome.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEscapeOutcome_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.EscapeOutcome_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEscapeProposalType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.EscapeProposal.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEscapeProposal_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.EscapeProposal_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEvidenceStatusType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.EvidenceStatus.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorEvidenceStatus_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.EvidenceStatus_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorMiningInterlockType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.MiningInterlock.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorMiningInterlock_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.MiningInterlock_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorQualifiedThreat(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.QualifiedThreat => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorQualifiedThreat_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.QualifiedThreat_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ReportFrameComposition_threatResponseProcess_reportFrameComposition_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseCoordination_threatResponseProcess_responseCoordination_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseFrame(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseFrame => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseFrame_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseFrame_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponsePatternType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponsePattern.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponsePattern_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponsePattern_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseStageType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseStage.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorResponseStage_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ResponseStage_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorRouteStatusType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.RouteStatus.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorRouteStatus_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.RouteStatus_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatBandType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatBand.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatBand_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatBand_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatEvidence(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatEvidence => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatEvidence_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatEvidence_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PreState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_DataTypeId.Type], filter: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_P => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatQualification_threatResponseProcess_threatQualification_PostState_Container_PS => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatReportType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatReport.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatReport_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatReport_Payload => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatValidityType(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatValidity.Type => B) {}

@datatype class Config_Frigate_Threat_Response_CoordinatorThreatValidity_Payload(attempts: Z, verbose: B, filter: Frigate_Threat_Response_Coordinator.ThreatValidity_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


