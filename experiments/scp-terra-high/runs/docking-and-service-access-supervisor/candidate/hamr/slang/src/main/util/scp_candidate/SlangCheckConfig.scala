// #Sireum

package scp_candidate

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

AccessRequest.scala

RequestOperation.scala

Correlation.scala

VesselStatus.scala

VesselClass.scala

StationReport.scala

StationProgress.scala

ServiceActivity.scala

ServiceClass.scala

LifecycleState.scala

RequestDisposition.scala

ControlEvent.scala

BerthState.scala

GateState.scala

RecoveryState.scala

RecoveryIntent.scala

LifecycleDirective.scala

DecisionContext.scala

BerthEvidenceKind.scala

GateDirective.scala

PriorityKind.scala

SupervisoryAction.scala

DecisionCause.scala

PublicMode.scala

AccessStatus.scala

DockingOutcome.scala

RequestFacts.scala

VesselFacts.scala

StationFacts.scala

ServiceFacts.scala

AdmissionGuard.scala

PriorLifecycleView.scala

AdmissionDecision.scala

RecoveryTransition.scala

CoordinationFrame.scala

BerthTransitionEvidence.scala

GateSafetyFrame.scala

PriorityDirective.scala

DockingProposal.scala

AccessProposal.scala

UndockingProposal.scala

DockingDecisionFrame.scala

DockingAccessResult.scala

Base_Types.scala

RequestClassification_supervisor_process_request_classification_Containers.scala

VesselStatusAssessment_supervisor_process_vessel_status_assessment_Containers.scala

StationReportAssessment_supervisor_process_station_report_assessment_Containers.scala

ServiceActivityAssessment_supervisor_process_service_activity_assessment_Containers.scala

RequestAdmission_supervisor_process_request_admission_Containers.scala

AccessCoherence_supervisor_process_access_coherence_Containers.scala

DockingLifecycle_supervisor_process_docking_lifecycle_Containers.scala

BerthCommitment_supervisor_process_berth_commitment_Containers.scala

ServiceAccessGate_supervisor_process_service_access_gate_Containers.scala

RecoverySupervisor_supervisor_process_recovery_supervisor_Containers.scala

DockingActionEligibility_supervisor_process_docking_action_eligibility_Containers.scala

AccessActionEligibility_supervisor_process_access_action_eligibility_Containers.scala

UndockingActionEligibility_supervisor_process_undocking_action_eligibility_Containers.scala

DockingActionArbitration_supervisor_process_docking_action_arbitration_Containers.scala

ResultComposition_supervisor_process_result_composition_Containers.scala

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

@datatype class Config_Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PreState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorAccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_PostState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PreState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PreState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorAccessCoherence_supervisor_process_access_coherence_PostState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AccessCoherence_supervisor_process_access_coherence_PostState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorAccessProposal(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AccessProposal => B) {}

@datatype class Config_Docking_Access_SupervisorAccessProposal_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AccessProposal_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorAccessRequestType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AccessRequest.Type => B) {}

@datatype class Config_Docking_Access_SupervisorAccessRequest_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AccessRequest_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorAccessStatusType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AccessStatus.Type => B) {}

@datatype class Config_Docking_Access_SupervisorAccessStatus_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AccessStatus_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorAdmissionDecision(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AdmissionDecision => B) {}

@datatype class Config_Docking_Access_SupervisorAdmissionDecision_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AdmissionDecision_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorAdmissionGuard(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AdmissionGuard => B) {}

@datatype class Config_Docking_Access_SupervisorAdmissionGuard_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.AdmissionGuard_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PreState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorBerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_PostState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorBerthEvidenceKindType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.BerthEvidenceKind.Type => B) {}

@datatype class Config_Docking_Access_SupervisorBerthEvidenceKind_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.BerthEvidenceKind_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorBerthStateType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.BerthState.Type => B) {}

@datatype class Config_Docking_Access_SupervisorBerthState_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.BerthState_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorBerthTransitionEvidence(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.BerthTransitionEvidence => B) {}

@datatype class Config_Docking_Access_SupervisorBerthTransitionEvidence_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.BerthTransitionEvidence_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorControlEventType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ControlEvent.Type => B) {}

@datatype class Config_Docking_Access_SupervisorControlEvent_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ControlEvent_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorCoordinationFrame(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.CoordinationFrame => B) {}

@datatype class Config_Docking_Access_SupervisorCoordinationFrame_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.CoordinationFrame_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorCorrelationType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.Correlation.Type => B) {}

@datatype class Config_Docking_Access_SupervisorCorrelation_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.Correlation_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorDecisionCauseType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DecisionCause.Type => B) {}

@datatype class Config_Docking_Access_SupervisorDecisionCause_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DecisionCause_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorDecisionContextType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DecisionContext.Type => B) {}

@datatype class Config_Docking_Access_SupervisorDecisionContext_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DecisionContext_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorDockingAccessResult(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingAccessResult => B) {}

@datatype class Config_Docking_Access_SupervisorDockingAccessResult_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingAccessResult_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PreState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorDockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_PostState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PreState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorDockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_PostState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorDockingDecisionFrame(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingDecisionFrame => B) {}

@datatype class Config_Docking_Access_SupervisorDockingDecisionFrame_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingDecisionFrame_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PreState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorDockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_PostState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorDockingOutcomeType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingOutcome.Type => B) {}

@datatype class Config_Docking_Access_SupervisorDockingOutcome_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingOutcome_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorDockingProposal(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingProposal => B) {}

@datatype class Config_Docking_Access_SupervisorDockingProposal_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.DockingProposal_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorGateDirectiveType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.GateDirective.Type => B) {}

@datatype class Config_Docking_Access_SupervisorGateDirective_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.GateDirective_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorGateSafetyFrame(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.GateSafetyFrame => B) {}

@datatype class Config_Docking_Access_SupervisorGateSafetyFrame_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.GateSafetyFrame_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorGateStateType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.GateState.Type => B) {}

@datatype class Config_Docking_Access_SupervisorGateState_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.GateState_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorLifecycleDirectiveType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.LifecycleDirective.Type => B) {}

@datatype class Config_Docking_Access_SupervisorLifecycleDirective_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.LifecycleDirective_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorLifecycleStateType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.LifecycleState.Type => B) {}

@datatype class Config_Docking_Access_SupervisorLifecycleState_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.LifecycleState_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorPriorLifecycleView(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.PriorLifecycleView => B) {}

@datatype class Config_Docking_Access_SupervisorPriorLifecycleView_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.PriorLifecycleView_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorPriorityDirective(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.PriorityDirective => B) {}

@datatype class Config_Docking_Access_SupervisorPriorityDirective_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.PriorityDirective_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorPriorityKindType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.PriorityKind.Type => B) {}

@datatype class Config_Docking_Access_SupervisorPriorityKind_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.PriorityKind_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorPublicModeType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.PublicMode.Type => B) {}

@datatype class Config_Docking_Access_SupervisorPublicMode_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.PublicMode_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorRecoveryIntentType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RecoveryIntent.Type => B) {}

@datatype class Config_Docking_Access_SupervisorRecoveryIntent_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RecoveryIntent_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorRecoveryStateType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RecoveryState.Type => B) {}

@datatype class Config_Docking_Access_SupervisorRecoveryState_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RecoveryState_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PreState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorRecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_PostState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorRecoveryTransition(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RecoveryTransition => B) {}

@datatype class Config_Docking_Access_SupervisorRecoveryTransition_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RecoveryTransition_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PreState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PreState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorRequestAdmission_supervisor_process_request_admission_PostState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_PostState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PreState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PreState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorRequestClassification_supervisor_process_request_classification_PostState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_PostState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorRequestDispositionType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RequestDisposition.Type => B) {}

@datatype class Config_Docking_Access_SupervisorRequestDisposition_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RequestDisposition_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorRequestFacts(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RequestFacts => B) {}

@datatype class Config_Docking_Access_SupervisorRequestFacts_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RequestFacts_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorRequestOperationType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RequestOperation.Type => B) {}

@datatype class Config_Docking_Access_SupervisorRequestOperation_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.RequestOperation_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PreState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PreState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorResultComposition_supervisor_process_result_composition_PostState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_PostState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PreState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ServiceAccessGate_supervisor_process_service_access_gate_PostState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorServiceActivityType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ServiceActivity.Type => B) {}

@datatype class Config_Docking_Access_SupervisorServiceActivity_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ServiceActivity_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PreState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_PostState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorServiceClassType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ServiceClass.Type => B) {}

@datatype class Config_Docking_Access_SupervisorServiceClass_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ServiceClass_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorServiceFacts(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ServiceFacts => B) {}

@datatype class Config_Docking_Access_SupervisorServiceFacts_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.ServiceFacts_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorStationFacts(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.StationFacts => B) {}

@datatype class Config_Docking_Access_SupervisorStationFacts_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.StationFacts_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorStationProgressType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.StationProgress.Type => B) {}

@datatype class Config_Docking_Access_SupervisorStationProgress_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.StationProgress_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorStationReportType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.StationReport.Type => B) {}

@datatype class Config_Docking_Access_SupervisorStationReport_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.StationReport_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PreState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorStationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_PostState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorSupervisoryActionType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.SupervisoryAction.Type => B) {}

@datatype class Config_Docking_Access_SupervisorSupervisoryAction_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.SupervisoryAction_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PreState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorUndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_PostState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorUndockingProposal(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.UndockingProposal => B) {}

@datatype class Config_Docking_Access_SupervisorUndockingProposal_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.UndockingProposal_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorVesselClassType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.VesselClass.Type => B) {}

@datatype class Config_Docking_Access_SupervisorVesselClass_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.VesselClass_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorVesselFacts(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.VesselFacts => B) {}

@datatype class Config_Docking_Access_SupervisorVesselFacts_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.VesselFacts_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorVesselStatusType(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.VesselStatus.Type => B) {}

@datatype class Config_Docking_Access_SupervisorVesselStatus_Payload(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.VesselStatus_Payload => B) {}

@datatype class Config_Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PreState_Container_PS => B) {}

@datatype class Config_Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_DataTypeId.Type], filter: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container => B) {}

@datatype class Config_Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_P => B) {}

@datatype class Config_Docking_Access_SupervisorVesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_PostState_Container_PS => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


