// #Sireum

package mining_cargo_transfer_evidence_coordinator

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

TransferRequest.scala

RequestKind.scala

Correlation.scala

DockContext.scala

DockReason.scala

ShipReport.scala

ShipReportClass.scala

ShipReportValue.scala

WarehouseReport.scala

WarehouseReportClass.scala

WarehouseReportValue.scala

SessionState.scala

FaultTrigger.scala

OrdinaryInhibition.scala

RequestDisposition.scala

RequestLedger.scala

ControlEvent.scala

RecoveryState.scala

ShipEvidenceState.scala

WarehouseEvidenceState.scala

RecoveryIntent.scala

ProgressClass.scala

TransferOutcome.scala

ShipUpdate.scala

WarehouseUpdate.scala

PriorityKind.scala

ProposalKind.scala

TransferAction.scala

DecisionCause.scala

DecisionOutcomeValue.scala

CoordinationMode.scala

PublicRequestDisposition.scala

PublicTransferOutcome.scala

RequestFacts.scala

DockFacts.scala

ShipReportFacts.scala

WarehouseReportFacts.scala

SessionView.scala

CoordinationGuard.scala

AdmissionDecision.scala

RecoveryTransition.scala

CoordinationFrame.scala

PriorityDirective.scala

ActionProposal.scala

TransferDecision.scala

TransferCoordinationResult.scala

Base_Types.scala

RequestAcquisition_cargo_coordination_process_request_acquisition_Containers.scala

DockContextAssessment_cargo_coordination_process_dock_context_assessment_Containers.scala

ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_Containers.scala

WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_Containers.scala

RequestAdmission_cargo_coordination_process_request_admission_Containers.scala

EvidenceCoherence_cargo_coordination_process_evidence_coherence_Containers.scala

TransferSession_cargo_coordination_process_transfer_session_Containers.scala

ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_Containers.scala

WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_Containers.scala

RecoverySupervisor_cargo_coordination_process_recovery_supervisor_Containers.scala

RequestActionEligibility_cargo_coordination_process_request_action_eligibility_Containers.scala

ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_Containers.scala

WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_Containers.scala

TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_Containers.scala

ResultComposition_cargo_coordination_process_result_composition_Containers.scala

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

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorActionProposal(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorActionProposal_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorAdmissionDecision_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorControlEventType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorControlEvent_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ControlEvent_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationFrame_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationGuard_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationModeType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorCoordinationMode_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorCorrelationType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorCorrelation_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.Correlation_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorDecisionCauseType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorDecisionCause_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValueType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorDecisionOutcomeValue_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorDockContextType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorDockContext_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.DockContext_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorDockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.DockContextAssessment_cargo_coordination_process_dock_context_assessment_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorDockFacts(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorDockFacts_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorDockReasonType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.DockReason.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorDockReason_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.DockReason_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorEvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.EvidenceCoherence_cargo_coordination_process_evidence_coherence_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorFaultTriggerType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorFaultTrigger_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibitionType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorOrdinaryInhibition_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorPriorityDirective_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorPriorityKindType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorPriorityKind_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorProgressClassType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorProgressClass_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorProposalKindType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorProposalKind_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDispositionType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorPublicRequestDisposition_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcomeType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorPublicTransferOutcome_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntentType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryIntent_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryStateType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryState_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRecoveryTransition_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAcquisition_cargo_coordination_process_request_acquisition_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestActionEligibility_cargo_coordination_process_request_action_eligibility_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestAdmission_cargo_coordination_process_request_admission_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestDispositionType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestDisposition_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestFacts(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestFacts_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestKindType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestKind_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestLedgerType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorRequestLedger_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ResultComposition_cargo_coordination_process_result_composition_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorSessionStateType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.SessionState.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorSessionState_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.SessionState_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorSessionView(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.SessionView => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorSessionView_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.SessionView_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceStateType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipEvidenceState_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipReport_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportClassType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportClass_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportFacts_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportValueType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipReportValue_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipUpdateType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorShipUpdate_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferAction_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferCoordinationResult_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferDecision(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferDecision_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferOutcomeType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferOutcome_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferRequestType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferRequest_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferRequest_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorTransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.TransferSession_cargo_coordination_process_transfer_session_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceStateType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseEvidenceState_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReport_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_PostState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClassType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportClass_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportFacts_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValueType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseReportValue_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdateType(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.Type => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseUpdate_Payload(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate_Payload => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PreState_Container_PS => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_DataTypeId.Type], filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_P => B) {}

@datatype class Config_Mining_Cargo_Transfer_Evidence_CoordinatorWarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS(attempts: Z, verbose: B, filter: Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility_PostState_Container_PS => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


