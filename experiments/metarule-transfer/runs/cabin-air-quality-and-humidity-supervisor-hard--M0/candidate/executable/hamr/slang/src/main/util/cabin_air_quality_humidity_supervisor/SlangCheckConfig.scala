// #Sireum

package cabin_air_quality_humidity_supervisor

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Validity.scala

Arrival.scala

EnableChoice.scala

FilterPolicy.scala

HumidityPolicy.scala

RoutineAirflow.scala

CandidateClass.scala

AirCondition.scala

AirEvidence.scala

HumidityCondition.scala

HumidityEvidence.scala

PathGrant.scala

PathDisposition.scala

BlowerReadiness.scala

FilterUnitReadiness.scala

HumidifierReadiness.scala

DehumidifierReadiness.scala

FilterBranchBlowerDisposition.scala

FilterBranchPathDisposition.scala

HumidityBranchBlowerDisposition.scala

HumidityBranchHumidifierDisposition.scala

HumidityBranchDehumidifierDisposition.scala

RoutineBranchBlowerDisposition.scala

ComposerBlowerDisposition.scala

ComposerFilterDisposition.scala

ComposerHumidifierDisposition.scala

ComposerDehumidifierDisposition.scala

TrustState.scala

AirRecoveryEvent.scala

HumidityRecoveryEvent.scala

PreferenceEvent.scala

FilterProposal.scala

StatusCause.scala

HumidityProposal.scala

RoutineProposal.scala

SelectedIntent.scala

FlowClass.scala

TreatmentAction.scala

AuthorityUse.scala

SupervisorMode.scala

UserAirPreference.scala

QualifiedPreferenceCandidate.scala

AirQualityObservation.scala

HumidityObservation.scala

SharedAirPathAuthority.scala

AirTreatmentReadiness.scala

FilterCapabilityFacts.scala

HumidityCapabilityFacts.scala

BlowerCapabilityFact.scala

CapabilitySet.scala

AirRecoveryReport.scala

HumidityRecoveryReport.scala

AcceptedPreference.scala

FilterProposalReport.scala

HumidityProposalReport.scala

RoutineProposalReport.scala

SelectionReport.scala

CompositionReport.scala

CabinAirTreatmentPlan.scala

CabinAirSupervisorStatus.scala

Base_Types.scala

PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_Containers.scala

AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_Containers.scala

HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_Containers.scala

SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_Containers.scala

TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_Containers.scala

AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_Containers.scala

HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_Containers.scala

PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_Containers.scala

FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_Containers.scala

HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_Containers.scala

RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_Containers.scala

CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_Containers.scala

AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_Containers.scala

StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_Containers.scala

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

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAcceptedPreference(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAcceptedPreference_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirConditionType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirCondition.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirCondition_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirCondition_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirEvidenceType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirEvidence_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirEvidence_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirEvidenceRecoveryOwner_cabin_air_supervision_process_air_evidence_recovery_owner_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirQualityObservation(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirQualityObservation_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirRecoveryEventType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirRecoveryEvent_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryEvent_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirRecoveryReport(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirRecoveryReport_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAirTreatmentReadiness_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorArrivalType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.Arrival.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorArrival_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.Arrival_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AuthoritySafePlanComposer_cabin_air_supervision_process_authority_safe_plan_composer_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAuthorityUseType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorAuthorityUse_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.AuthorityUse_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorBlowerCapabilityFact_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorBlowerReadinessType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorBlowerReadiness_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.BlowerReadiness_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorCabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.CabinAirPriorityArbiter_cabin_air_supervision_process_cabin_air_priority_arbiter_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorCabinAirSupervisorStatus_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.CabinAirSupervisorStatus_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorCabinAirTreatmentPlan_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.CabinAirTreatmentPlan_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorCandidateClassType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.CandidateClass.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorCandidateClass_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.CandidateClass_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorCapabilitySet(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorCapabilitySet_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorComposerBlowerDispositionType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorComposerBlowerDisposition_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.ComposerBlowerDisposition_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDispositionType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorComposerDehumidifierDisposition_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.ComposerDehumidifierDisposition_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorComposerFilterDispositionType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorComposerFilterDisposition_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.ComposerFilterDisposition_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorComposerHumidifierDispositionType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorComposerHumidifierDisposition_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.ComposerHumidifierDisposition_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorCompositionReport(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.CompositionReport => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorCompositionReport_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.CompositionReport_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorDehumidifierReadinessType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorDehumidifierReadiness_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.DehumidifierReadiness_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorEnableChoiceType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.EnableChoice.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorEnableChoice_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.EnableChoice_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDispositionType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFilterBranchBlowerDisposition_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FilterBranchBlowerDisposition_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFilterBranchPathDispositionType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFilterBranchPathDisposition_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FilterBranchPathDisposition_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFilterCapabilityFacts_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFilterPolicyType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFilterPolicy_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FilterPolicy_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFilterProposalType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FilterProposal.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFilterProposal_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FilterProposal_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFilterProposalReport(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFilterProposalReport_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFilterUnitReadinessType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFilterUnitReadiness_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FilterUnitReadiness_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FiltrationProposalOwner_cabin_air_supervision_process_filtration_proposal_owner_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFlowClassType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FlowClass.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorFlowClass_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.FlowClass_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidifierReadinessType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidifierReadiness_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidifierReadiness_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDispositionType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityBranchBlowerDisposition_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchBlowerDisposition_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDispositionType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityBranchDehumidifierDisposition_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchDehumidifierDisposition_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDispositionType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityBranchHumidifierDisposition_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityBranchHumidifierDisposition_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityCapabilityFacts_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityConditionType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityCondition_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityCondition_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityEvidence_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidenceRecoveryOwner_cabin_air_supervision_process_humidity_evidence_recovery_owner_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityObservation(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityObservation_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityPolicyType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityPolicy_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityPolicy_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityProposal_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposal_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalReport(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityProposalReport_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEventType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryEvent_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryEvent_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorHumidityRecoveryReport_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPathDispositionType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPathDisposition_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.PathDisposition_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPathGrantType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.PathGrant.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPathGrant_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.PathGrant_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPreferenceEventType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPreferenceEvent_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.PreferenceEvent_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.PreferenceRequestQualifier_cabin_air_supervision_process_preference_request_qualifier_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorPreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.PreferenceSessionOwner_cabin_air_supervision_process_preference_session_owner_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorQualifiedPreferenceCandidate_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.QualifiedPreferenceCandidate_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorRoutineAirflow_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflow_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorRoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.RoutineAirflowProposalOwner_cabin_air_supervision_process_routine_airflow_proposal_owner_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDispositionType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorRoutineBranchBlowerDisposition_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.RoutineBranchBlowerDisposition_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorRoutineProposalType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorRoutineProposal_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposal_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorRoutineProposalReport(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorRoutineProposalReport_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorSelectedIntentType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorSelectedIntent_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.SelectedIntent_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorSelectionReport(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.SelectionReport => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorSelectionReport_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.SelectionReport_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorSharedAirPathAuthority_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.SharedAirPathAuthority_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorSharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.SharedPathAuthorityAssessor_cabin_air_supervision_process_shared_path_authority_assessor_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorStatusCauseType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.StatusCause.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorStatusCause_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.StatusCause_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorStatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.StatusOutcomeReconciler_cabin_air_supervision_process_status_outcome_reconciler_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorSupervisorModeType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorSupervisorMode_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.SupervisorMode_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorTreatmentActionType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorTreatmentAction_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.TreatmentAction_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PreState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_DataTypeId.Type], filter: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_P => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorTreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_PostState_Container_PS => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorTrustStateType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorTrustState_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.TrustState_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorUserAirPreference(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorUserAirPreference_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.UserAirPreference_Payload => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorValidityType(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.Validity.Type => B) {}

@datatype class Config_Cabin_Air_Quality_Humidity_SupervisorValidity_Payload(attempts: Z, verbose: B, filter: Cabin_Air_Quality_Humidity_Supervisor.Validity_Payload => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


