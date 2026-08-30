// #Sireum

package factory_flow

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

RequestPresence.scala

Validity.scala

WorkId.scala

ProductKind.scala

AdmissionAssessment.scala

MaterialDisposition.scala

MaterialAssessment.scala

StepDisposition.scala

LedgerPhase.scala

AttemptKind.scala

TargetQualification.scala

ProcessEvent.scala

CorrelatedOutcomePlan.scala

IntentKind.scala

CompetitorPresence.scala

FlowDecision.scala

DecisionReason.scala

CommandAction.scala

ProductionResult.scala

ProductionFlowStatus.scala

PresentedWorkRequest.scala

AdmissionFact.scala

MaterialHandoffObservation.scala

MaterialFact.scala

StepReadinessObservation.scala

FlowContext.scala

ProtectionContext.scala

FlowSnapshot.scala

ProcessResultObservation.scala

OutcomeFact.scala

FlowIntentFact.scala

AuthorizationFact.scala

LineFlowCommand.scala

ProductionOutcome.scala

Base_Types.scala

WorkRequestQualifier_supervisorProcess_workRequestQualifier_Containers.scala

MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_Containers.scala

TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_Containers.scala

ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_Containers.scala

ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_Containers.scala

FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_Containers.scala

FlowLedger_supervisorProcess_flowLedger_Containers.scala

ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_Containers.scala

FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_Containers.scala

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

@datatype class Config_Factory_FlowAdmissionAssessmentType(attempts: Z, verbose: B, filter: Factory_Flow.AdmissionAssessment.Type => B) {}

@datatype class Config_Factory_FlowAdmissionAssessment_Payload(attempts: Z, verbose: B, filter: Factory_Flow.AdmissionAssessment_Payload => B) {}

@datatype class Config_Factory_FlowAdmissionFact(attempts: Z, verbose: B, filter: Factory_Flow.AdmissionFact => B) {}

@datatype class Config_Factory_FlowAdmissionFact_Payload(attempts: Z, verbose: B, filter: Factory_Flow.AdmissionFact_Payload => B) {}

@datatype class Config_Factory_FlowAttemptKindType(attempts: Z, verbose: B, filter: Factory_Flow.AttemptKind.Type => B) {}

@datatype class Config_Factory_FlowAttemptKind_Payload(attempts: Z, verbose: B, filter: Factory_Flow.AttemptKind_Payload => B) {}

@datatype class Config_Factory_FlowAuthorizationFact(attempts: Z, verbose: B, filter: Factory_Flow.AuthorizationFact => B) {}

@datatype class Config_Factory_FlowAuthorizationFact_Payload(attempts: Z, verbose: B, filter: Factory_Flow.AuthorizationFact_Payload => B) {}

@datatype class Config_Factory_FlowCommandActionType(attempts: Z, verbose: B, filter: Factory_Flow.CommandAction.Type => B) {}

@datatype class Config_Factory_FlowCommandAction_Payload(attempts: Z, verbose: B, filter: Factory_Flow.CommandAction_Payload => B) {}

@datatype class Config_Factory_FlowCompetitorPresenceType(attempts: Z, verbose: B, filter: Factory_Flow.CompetitorPresence.Type => B) {}

@datatype class Config_Factory_FlowCompetitorPresence_Payload(attempts: Z, verbose: B, filter: Factory_Flow.CompetitorPresence_Payload => B) {}

@datatype class Config_Factory_FlowCorrelatedOutcomePlanType(attempts: Z, verbose: B, filter: Factory_Flow.CorrelatedOutcomePlan.Type => B) {}

@datatype class Config_Factory_FlowCorrelatedOutcomePlan_Payload(attempts: Z, verbose: B, filter: Factory_Flow.CorrelatedOutcomePlan_Payload => B) {}

@datatype class Config_Factory_FlowDecisionReasonType(attempts: Z, verbose: B, filter: Factory_Flow.DecisionReason.Type => B) {}

@datatype class Config_Factory_FlowDecisionReason_Payload(attempts: Z, verbose: B, filter: Factory_Flow.DecisionReason_Payload => B) {}

@datatype class Config_Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_DataTypeId.Type], filter: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container => B) {}

@datatype class Config_Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P => B) {}

@datatype class Config_Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS => B) {}

@datatype class Config_Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_DataTypeId.Type], filter: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container => B) {}

@datatype class Config_Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P => B) {}

@datatype class Config_Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS => B) {}

@datatype class Config_Factory_FlowFlowContext(attempts: Z, verbose: B, filter: Factory_Flow.FlowContext => B) {}

@datatype class Config_Factory_FlowFlowContext_Payload(attempts: Z, verbose: B, filter: Factory_Flow.FlowContext_Payload => B) {}

@datatype class Config_Factory_FlowFlowDecisionType(attempts: Z, verbose: B, filter: Factory_Flow.FlowDecision.Type => B) {}

@datatype class Config_Factory_FlowFlowDecision_Payload(attempts: Z, verbose: B, filter: Factory_Flow.FlowDecision_Payload => B) {}

@datatype class Config_Factory_FlowFlowIntentFact(attempts: Z, verbose: B, filter: Factory_Flow.FlowIntentFact => B) {}

@datatype class Config_Factory_FlowFlowIntentFact_Payload(attempts: Z, verbose: B, filter: Factory_Flow.FlowIntentFact_Payload => B) {}

@datatype class Config_Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_DataTypeId.Type], filter: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container => B) {}

@datatype class Config_Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P => B) {}

@datatype class Config_Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS => B) {}

@datatype class Config_Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_DataTypeId.Type], filter: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container => B) {}

@datatype class Config_Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P => B) {}

@datatype class Config_Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS => B) {}

@datatype class Config_Factory_FlowFlowSnapshot(attempts: Z, verbose: B, filter: Factory_Flow.FlowSnapshot => B) {}

@datatype class Config_Factory_FlowFlowSnapshot_Payload(attempts: Z, verbose: B, filter: Factory_Flow.FlowSnapshot_Payload => B) {}

@datatype class Config_Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_DataTypeId.Type], filter: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container => B) {}

@datatype class Config_Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P => B) {}

@datatype class Config_Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS => B) {}

@datatype class Config_Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_DataTypeId.Type], filter: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container => B) {}

@datatype class Config_Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P => B) {}

@datatype class Config_Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS => B) {}

@datatype class Config_Factory_FlowIntentKindType(attempts: Z, verbose: B, filter: Factory_Flow.IntentKind.Type => B) {}

@datatype class Config_Factory_FlowIntentKind_Payload(attempts: Z, verbose: B, filter: Factory_Flow.IntentKind_Payload => B) {}

@datatype class Config_Factory_FlowLedgerPhaseType(attempts: Z, verbose: B, filter: Factory_Flow.LedgerPhase.Type => B) {}

@datatype class Config_Factory_FlowLedgerPhase_Payload(attempts: Z, verbose: B, filter: Factory_Flow.LedgerPhase_Payload => B) {}

@datatype class Config_Factory_FlowLineFlowCommand(attempts: Z, verbose: B, filter: Factory_Flow.LineFlowCommand => B) {}

@datatype class Config_Factory_FlowLineFlowCommand_Payload(attempts: Z, verbose: B, filter: Factory_Flow.LineFlowCommand_Payload => B) {}

@datatype class Config_Factory_FlowMaterialAssessmentType(attempts: Z, verbose: B, filter: Factory_Flow.MaterialAssessment.Type => B) {}

@datatype class Config_Factory_FlowMaterialAssessment_Payload(attempts: Z, verbose: B, filter: Factory_Flow.MaterialAssessment_Payload => B) {}

@datatype class Config_Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_DataTypeId.Type], filter: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container => B) {}

@datatype class Config_Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P => B) {}

@datatype class Config_Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS => B) {}

@datatype class Config_Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_DataTypeId.Type], filter: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container => B) {}

@datatype class Config_Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P => B) {}

@datatype class Config_Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS => B) {}

@datatype class Config_Factory_FlowMaterialDispositionType(attempts: Z, verbose: B, filter: Factory_Flow.MaterialDisposition.Type => B) {}

@datatype class Config_Factory_FlowMaterialDisposition_Payload(attempts: Z, verbose: B, filter: Factory_Flow.MaterialDisposition_Payload => B) {}

@datatype class Config_Factory_FlowMaterialFact(attempts: Z, verbose: B, filter: Factory_Flow.MaterialFact => B) {}

@datatype class Config_Factory_FlowMaterialFact_Payload(attempts: Z, verbose: B, filter: Factory_Flow.MaterialFact_Payload => B) {}

@datatype class Config_Factory_FlowMaterialHandoffObservation(attempts: Z, verbose: B, filter: Factory_Flow.MaterialHandoffObservation => B) {}

@datatype class Config_Factory_FlowMaterialHandoffObservation_Payload(attempts: Z, verbose: B, filter: Factory_Flow.MaterialHandoffObservation_Payload => B) {}

@datatype class Config_Factory_FlowOutcomeFact(attempts: Z, verbose: B, filter: Factory_Flow.OutcomeFact => B) {}

@datatype class Config_Factory_FlowOutcomeFact_Payload(attempts: Z, verbose: B, filter: Factory_Flow.OutcomeFact_Payload => B) {}

@datatype class Config_Factory_FlowPresentedWorkRequest(attempts: Z, verbose: B, filter: Factory_Flow.PresentedWorkRequest => B) {}

@datatype class Config_Factory_FlowPresentedWorkRequest_Payload(attempts: Z, verbose: B, filter: Factory_Flow.PresentedWorkRequest_Payload => B) {}

@datatype class Config_Factory_FlowProcessEventType(attempts: Z, verbose: B, filter: Factory_Flow.ProcessEvent.Type => B) {}

@datatype class Config_Factory_FlowProcessEvent_Payload(attempts: Z, verbose: B, filter: Factory_Flow.ProcessEvent_Payload => B) {}

@datatype class Config_Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_DataTypeId.Type], filter: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container => B) {}

@datatype class Config_Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P => B) {}

@datatype class Config_Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS => B) {}

@datatype class Config_Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_DataTypeId.Type], filter: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container => B) {}

@datatype class Config_Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P => B) {}

@datatype class Config_Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS => B) {}

@datatype class Config_Factory_FlowProcessResultObservation(attempts: Z, verbose: B, filter: Factory_Flow.ProcessResultObservation => B) {}

@datatype class Config_Factory_FlowProcessResultObservation_Payload(attempts: Z, verbose: B, filter: Factory_Flow.ProcessResultObservation_Payload => B) {}

@datatype class Config_Factory_FlowProductKindType(attempts: Z, verbose: B, filter: Factory_Flow.ProductKind.Type => B) {}

@datatype class Config_Factory_FlowProductKind_Payload(attempts: Z, verbose: B, filter: Factory_Flow.ProductKind_Payload => B) {}

@datatype class Config_Factory_FlowProductionFlowStatusType(attempts: Z, verbose: B, filter: Factory_Flow.ProductionFlowStatus.Type => B) {}

@datatype class Config_Factory_FlowProductionFlowStatus_Payload(attempts: Z, verbose: B, filter: Factory_Flow.ProductionFlowStatus_Payload => B) {}

@datatype class Config_Factory_FlowProductionOutcome(attempts: Z, verbose: B, filter: Factory_Flow.ProductionOutcome => B) {}

@datatype class Config_Factory_FlowProductionOutcome_Payload(attempts: Z, verbose: B, filter: Factory_Flow.ProductionOutcome_Payload => B) {}

@datatype class Config_Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_DataTypeId.Type], filter: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container => B) {}

@datatype class Config_Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P => B) {}

@datatype class Config_Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS => B) {}

@datatype class Config_Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_DataTypeId.Type], filter: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container => B) {}

@datatype class Config_Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P => B) {}

@datatype class Config_Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS => B) {}

@datatype class Config_Factory_FlowProductionResultType(attempts: Z, verbose: B, filter: Factory_Flow.ProductionResult.Type => B) {}

@datatype class Config_Factory_FlowProductionResult_Payload(attempts: Z, verbose: B, filter: Factory_Flow.ProductionResult_Payload => B) {}

@datatype class Config_Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_DataTypeId.Type], filter: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container => B) {}

@datatype class Config_Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P => B) {}

@datatype class Config_Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS => B) {}

@datatype class Config_Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_DataTypeId.Type], filter: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container => B) {}

@datatype class Config_Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P => B) {}

@datatype class Config_Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS => B) {}

@datatype class Config_Factory_FlowProtectionContext(attempts: Z, verbose: B, filter: Factory_Flow.ProtectionContext => B) {}

@datatype class Config_Factory_FlowProtectionContext_Payload(attempts: Z, verbose: B, filter: Factory_Flow.ProtectionContext_Payload => B) {}

@datatype class Config_Factory_FlowRequestPresenceType(attempts: Z, verbose: B, filter: Factory_Flow.RequestPresence.Type => B) {}

@datatype class Config_Factory_FlowRequestPresence_Payload(attempts: Z, verbose: B, filter: Factory_Flow.RequestPresence_Payload => B) {}

@datatype class Config_Factory_FlowStepDispositionType(attempts: Z, verbose: B, filter: Factory_Flow.StepDisposition.Type => B) {}

@datatype class Config_Factory_FlowStepDisposition_Payload(attempts: Z, verbose: B, filter: Factory_Flow.StepDisposition_Payload => B) {}

@datatype class Config_Factory_FlowStepReadinessObservation(attempts: Z, verbose: B, filter: Factory_Flow.StepReadinessObservation => B) {}

@datatype class Config_Factory_FlowStepReadinessObservation_Payload(attempts: Z, verbose: B, filter: Factory_Flow.StepReadinessObservation_Payload => B) {}

@datatype class Config_Factory_FlowTargetQualificationType(attempts: Z, verbose: B, filter: Factory_Flow.TargetQualification.Type => B) {}

@datatype class Config_Factory_FlowTargetQualification_Payload(attempts: Z, verbose: B, filter: Factory_Flow.TargetQualification_Payload => B) {}

@datatype class Config_Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_DataTypeId.Type], filter: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container => B) {}

@datatype class Config_Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P => B) {}

@datatype class Config_Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS => B) {}

@datatype class Config_Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_DataTypeId.Type], filter: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container => B) {}

@datatype class Config_Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P => B) {}

@datatype class Config_Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS => B) {}

@datatype class Config_Factory_FlowValidityType(attempts: Z, verbose: B, filter: Factory_Flow.Validity.Type => B) {}

@datatype class Config_Factory_FlowValidity_Payload(attempts: Z, verbose: B, filter: Factory_Flow.Validity_Payload => B) {}

@datatype class Config_Factory_FlowWorkIdType(attempts: Z, verbose: B, filter: Factory_Flow.WorkId.Type => B) {}

@datatype class Config_Factory_FlowWorkId_Payload(attempts: Z, verbose: B, filter: Factory_Flow.WorkId_Payload => B) {}

@datatype class Config_Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_DataTypeId.Type], filter: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container => B) {}

@datatype class Config_Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P => B) {}

@datatype class Config_Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS => B) {}

@datatype class Config_Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_DataTypeId.Type], filter: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container => B) {}

@datatype class Config_Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(attempts: Z, verbose: B, filter: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P => B) {}

@datatype class Config_Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(attempts: Z, verbose: B, filter: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS => B) {}

@datatype class Config_utilContainer(attempts: Z, verbose: B, additiveTypeFiltering: B, typeFilter: ISZ[utilContainer_DataTypeId.Type], filter: util.Container => B) {}

@datatype class Config_utilEmptyContainer(attempts: Z, verbose: B, filter: util.EmptyContainer => B) {}

@datatype class Config_runtimemonitorObservationKindType(attempts: Z, verbose: B, filter: runtimemonitor.ObservationKind.Type => B) {}


