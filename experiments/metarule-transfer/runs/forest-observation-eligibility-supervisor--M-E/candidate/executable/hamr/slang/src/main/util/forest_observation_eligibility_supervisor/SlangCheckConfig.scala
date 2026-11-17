// #Sireum

package forest_observation_eligibility_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

RequestCommand.scala

RequestToken.scala

GateOutcome.scala

EvaluationTicket.scala

RequestContext.scala

EligibilityStatus.scala

EnergyEvidence.scala

EnergyVerdict.scala

TaggedTicket.scala

CameraEvidence.scala

RadioEvidence.scala

SupportVerdict.scala

EligibilityDecision.scala

ObservationProgress.scala

ObservationAuthorization.scala

RequestState.scala

LastAcceptedToken.scala

GatePhase.scala

RequestInput.scala

TaggedEnergyVerdict.scala

TaggedSupportVerdict.scala

Base_Types.scala

RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_Containers.scala

EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_Containers.scala

ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_Containers.scala

EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_Containers.scala

AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_Containers.scala

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

@datatype class Config_Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_DataTypeId.Type], filter: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_DataTypeId.Type], filter: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorCameraEvidenceType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.CameraEvidence.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorCameraEvidence_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_DataTypeId.Type], filter: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_DataTypeId.Type], filter: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEligibilityDecisionType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEligibilityDecision_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEligibilityStatusType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEligibilityStatus_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_DataTypeId.Type], filter: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_DataTypeId.Type], filter: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEnergyEvidenceType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EnergyEvidence.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEnergyEvidence_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEnergyVerdictType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EnergyVerdict.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEnergyVerdict_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEvaluationTicketType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorEvaluationTicket_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorGateOutcomeType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.GateOutcome.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorGateOutcome_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorGatePhaseType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.GatePhase.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorGatePhase_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.GatePhase_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorLastAcceptedTokenType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorLastAcceptedToken_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.LastAcceptedToken_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorObservationAuthorizationType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorObservationAuthorization_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorObservationProgressType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.ObservationProgress.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorObservationProgress_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_DataTypeId.Type], filter: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_DataTypeId.Type], filter: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRadioEvidenceType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.RadioEvidence.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRadioEvidence_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRequestCommandType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.RequestCommand.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRequestCommand_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRequestContextType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.RequestContext.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRequestContext_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.RequestContext_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRequestInput(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.RequestInput => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRequestInput_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.RequestInput_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_DataTypeId.Type], filter: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_DataTypeId.Type], filter: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRequestStateType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.RequestState.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRequestState_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.RequestState_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRequestTokenType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.RequestToken.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorRequestToken_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.RequestToken_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorSupportVerdictType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.SupportVerdict.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorSupportVerdict_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorTaggedSupportVerdict(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorTaggedTicketType(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.TaggedTicket.Type => B) {}

@datatype class Config_Forest_Observation_Eligibility_SupervisorTaggedTicket_Payload(attempts: Z, verbose: B, filter: Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


