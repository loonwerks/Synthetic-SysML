// #Sireum
// @formatter:off

// This file is auto-generated from RequestPresence.scala, Validity.scala, WorkId.scala, ProductKind.scala, AdmissionAssessment.scala, MaterialDisposition.scala, MaterialAssessment.scala, StepDisposition.scala, LedgerPhase.scala, AttemptKind.scala, TargetQualification.scala, ProcessEvent.scala, CorrelatedOutcomePlan.scala, IntentKind.scala, CompetitorPresence.scala, FlowDecision.scala, DecisionReason.scala, CommandAction.scala, ProductionResult.scala, ProductionFlowStatus.scala, PresentedWorkRequest.scala, AdmissionFact.scala, MaterialHandoffObservation.scala, MaterialFact.scala, StepReadinessObservation.scala, FlowContext.scala, ProtectionContext.scala, FlowSnapshot.scala, ProcessResultObservation.scala, OutcomeFact.scala, FlowIntentFact.scala, AuthorizationFact.scala, LineFlowCommand.scala, ProductionOutcome.scala, Base_Types.scala, WorkRequestQualifier_supervisorProcess_workRequestQualifier_Containers.scala, MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_Containers.scala, TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_Containers.scala, ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_Containers.scala, ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_Containers.scala, FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_Containers.scala, FlowLedger_supervisorProcess_flowLedger_Containers.scala, ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_Containers.scala, FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package factory_flow

import org.sireum._

object MsgPack {

  object Constants {

    val Factory_FlowRequestPresence_Payload: Z = -32

    val Factory_FlowValidity_Payload: Z = -31

    val Factory_FlowWorkId_Payload: Z = -30

    val Factory_FlowProductKind_Payload: Z = -29

    val Factory_FlowAdmissionAssessment_Payload: Z = -28

    val Factory_FlowMaterialDisposition_Payload: Z = -27

    val Factory_FlowMaterialAssessment_Payload: Z = -26

    val Factory_FlowStepDisposition_Payload: Z = -25

    val Factory_FlowLedgerPhase_Payload: Z = -24

    val Factory_FlowAttemptKind_Payload: Z = -23

    val Factory_FlowTargetQualification_Payload: Z = -22

    val Factory_FlowProcessEvent_Payload: Z = -21

    val Factory_FlowCorrelatedOutcomePlan_Payload: Z = -20

    val Factory_FlowIntentKind_Payload: Z = -19

    val Factory_FlowCompetitorPresence_Payload: Z = -18

    val Factory_FlowFlowDecision_Payload: Z = -17

    val Factory_FlowDecisionReason_Payload: Z = -16

    val Factory_FlowCommandAction_Payload: Z = -15

    val Factory_FlowProductionResult_Payload: Z = -14

    val Factory_FlowProductionFlowStatus_Payload: Z = -13

    val Factory_FlowPresentedWorkRequest: Z = -12

    val Factory_FlowPresentedWorkRequest_Payload: Z = -11

    val Factory_FlowAdmissionFact: Z = -10

    val Factory_FlowAdmissionFact_Payload: Z = -9

    val Factory_FlowMaterialHandoffObservation: Z = -8

    val Factory_FlowMaterialHandoffObservation_Payload: Z = -7

    val Factory_FlowMaterialFact: Z = -6

    val Factory_FlowMaterialFact_Payload: Z = -5

    val Factory_FlowStepReadinessObservation: Z = -4

    val Factory_FlowStepReadinessObservation_Payload: Z = -3

    val Factory_FlowFlowContext: Z = -2

    val Factory_FlowFlowContext_Payload: Z = -1

    val Factory_FlowProtectionContext: Z = 0

    val Factory_FlowProtectionContext_Payload: Z = 1

    val Factory_FlowFlowSnapshot: Z = 2

    val Factory_FlowFlowSnapshot_Payload: Z = 3

    val Factory_FlowProcessResultObservation: Z = 4

    val Factory_FlowProcessResultObservation_Payload: Z = 5

    val Factory_FlowOutcomeFact: Z = 6

    val Factory_FlowOutcomeFact_Payload: Z = 7

    val Factory_FlowFlowIntentFact: Z = 8

    val Factory_FlowFlowIntentFact_Payload: Z = 9

    val Factory_FlowAuthorizationFact: Z = 10

    val Factory_FlowAuthorizationFact_Payload: Z = 11

    val Factory_FlowLineFlowCommand: Z = 12

    val Factory_FlowLineFlowCommand_Payload: Z = 13

    val Factory_FlowProductionOutcome: Z = 14

    val Factory_FlowProductionOutcome_Payload: Z = 15

    val Base_TypesBoolean_Payload: Z = 16

    val Base_TypesInteger_Payload: Z = 17

    val Base_TypesInteger_8_Payload: Z = 18

    val Base_TypesInteger_16_Payload: Z = 19

    val Base_TypesInteger_32_Payload: Z = 20

    val Base_TypesInteger_64_Payload: Z = 21

    val Base_TypesUnsigned_8_Payload: Z = 22

    val Base_TypesUnsigned_16_Payload: Z = 23

    val Base_TypesUnsigned_32_Payload: Z = 24

    val Base_TypesUnsigned_64_Payload: Z = 25

    val Base_TypesFloat_Payload: Z = 26

    val Base_TypesFloat_32_Payload: Z = 27

    val Base_TypesFloat_64_Payload: Z = 28

    val Base_TypesCharacter_Payload: Z = 29

    val Base_TypesString_Payload: Z = 30

    val Base_TypesBits_Payload: Z = 31

    val Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P: Z = 32

    val Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS: Z = 33

    val Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P: Z = 34

    val Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS: Z = 35

    val Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P: Z = 36

    val Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS: Z = 37

    val Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P: Z = 38

    val Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS: Z = 39

    val Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P: Z = 40

    val Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS: Z = 41

    val Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P: Z = 42

    val Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS: Z = 43

    val Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P: Z = 44

    val Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS: Z = 45

    val Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P: Z = 46

    val Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS: Z = 47

    val Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P: Z = 48

    val Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS: Z = 49

    val Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P: Z = 50

    val Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS: Z = 51

    val Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P: Z = 52

    val Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS: Z = 53

    val Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P: Z = 54

    val Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS: Z = 55

    val Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P: Z = 56

    val Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS: Z = 57

    val Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P: Z = 58

    val Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS: Z = 59

    val Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P: Z = 60

    val Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS: Z = 61

    val Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P: Z = 62

    val Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS: Z = 63

    val Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P: Z = 64

    val Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS: Z = 65

    val Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P: Z = 66

    val Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS: Z = 67

    val utilEmptyContainer: Z = 68

    val _artEmpty: Z = 69

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeFactory_FlowRequestPresenceType(o: Factory_Flow.RequestPresence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowRequestPresence_Payload(o: Factory_Flow.RequestPresence_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowRequestPresence_Payload)
      writeFactory_FlowRequestPresenceType(o.value)
    }

    def writeFactory_FlowValidityType(o: Factory_Flow.Validity.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowValidity_Payload(o: Factory_Flow.Validity_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowValidity_Payload)
      writeFactory_FlowValidityType(o.value)
    }

    def writeFactory_FlowWorkIdType(o: Factory_Flow.WorkId.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowWorkId_Payload(o: Factory_Flow.WorkId_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowWorkId_Payload)
      writeFactory_FlowWorkIdType(o.value)
    }

    def writeFactory_FlowProductKindType(o: Factory_Flow.ProductKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowProductKind_Payload(o: Factory_Flow.ProductKind_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowProductKind_Payload)
      writeFactory_FlowProductKindType(o.value)
    }

    def writeFactory_FlowAdmissionAssessmentType(o: Factory_Flow.AdmissionAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowAdmissionAssessment_Payload(o: Factory_Flow.AdmissionAssessment_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowAdmissionAssessment_Payload)
      writeFactory_FlowAdmissionAssessmentType(o.value)
    }

    def writeFactory_FlowMaterialDispositionType(o: Factory_Flow.MaterialDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowMaterialDisposition_Payload(o: Factory_Flow.MaterialDisposition_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowMaterialDisposition_Payload)
      writeFactory_FlowMaterialDispositionType(o.value)
    }

    def writeFactory_FlowMaterialAssessmentType(o: Factory_Flow.MaterialAssessment.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowMaterialAssessment_Payload(o: Factory_Flow.MaterialAssessment_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowMaterialAssessment_Payload)
      writeFactory_FlowMaterialAssessmentType(o.value)
    }

    def writeFactory_FlowStepDispositionType(o: Factory_Flow.StepDisposition.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowStepDisposition_Payload(o: Factory_Flow.StepDisposition_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowStepDisposition_Payload)
      writeFactory_FlowStepDispositionType(o.value)
    }

    def writeFactory_FlowLedgerPhaseType(o: Factory_Flow.LedgerPhase.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowLedgerPhase_Payload(o: Factory_Flow.LedgerPhase_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowLedgerPhase_Payload)
      writeFactory_FlowLedgerPhaseType(o.value)
    }

    def writeFactory_FlowAttemptKindType(o: Factory_Flow.AttemptKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowAttemptKind_Payload(o: Factory_Flow.AttemptKind_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowAttemptKind_Payload)
      writeFactory_FlowAttemptKindType(o.value)
    }

    def writeFactory_FlowTargetQualificationType(o: Factory_Flow.TargetQualification.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowTargetQualification_Payload(o: Factory_Flow.TargetQualification_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowTargetQualification_Payload)
      writeFactory_FlowTargetQualificationType(o.value)
    }

    def writeFactory_FlowProcessEventType(o: Factory_Flow.ProcessEvent.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowProcessEvent_Payload(o: Factory_Flow.ProcessEvent_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowProcessEvent_Payload)
      writeFactory_FlowProcessEventType(o.value)
    }

    def writeFactory_FlowCorrelatedOutcomePlanType(o: Factory_Flow.CorrelatedOutcomePlan.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowCorrelatedOutcomePlan_Payload(o: Factory_Flow.CorrelatedOutcomePlan_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowCorrelatedOutcomePlan_Payload)
      writeFactory_FlowCorrelatedOutcomePlanType(o.value)
    }

    def writeFactory_FlowIntentKindType(o: Factory_Flow.IntentKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowIntentKind_Payload(o: Factory_Flow.IntentKind_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowIntentKind_Payload)
      writeFactory_FlowIntentKindType(o.value)
    }

    def writeFactory_FlowCompetitorPresenceType(o: Factory_Flow.CompetitorPresence.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowCompetitorPresence_Payload(o: Factory_Flow.CompetitorPresence_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowCompetitorPresence_Payload)
      writeFactory_FlowCompetitorPresenceType(o.value)
    }

    def writeFactory_FlowFlowDecisionType(o: Factory_Flow.FlowDecision.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowFlowDecision_Payload(o: Factory_Flow.FlowDecision_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowDecision_Payload)
      writeFactory_FlowFlowDecisionType(o.value)
    }

    def writeFactory_FlowDecisionReasonType(o: Factory_Flow.DecisionReason.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowDecisionReason_Payload(o: Factory_Flow.DecisionReason_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowDecisionReason_Payload)
      writeFactory_FlowDecisionReasonType(o.value)
    }

    def writeFactory_FlowCommandActionType(o: Factory_Flow.CommandAction.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowCommandAction_Payload(o: Factory_Flow.CommandAction_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowCommandAction_Payload)
      writeFactory_FlowCommandActionType(o.value)
    }

    def writeFactory_FlowProductionResultType(o: Factory_Flow.ProductionResult.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowProductionResult_Payload(o: Factory_Flow.ProductionResult_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowProductionResult_Payload)
      writeFactory_FlowProductionResultType(o.value)
    }

    def writeFactory_FlowProductionFlowStatusType(o: Factory_Flow.ProductionFlowStatus.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeFactory_FlowProductionFlowStatus_Payload(o: Factory_Flow.ProductionFlowStatus_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowProductionFlowStatus_Payload)
      writeFactory_FlowProductionFlowStatusType(o.value)
    }

    def writeFactory_FlowPresentedWorkRequest(o: Factory_Flow.PresentedWorkRequest): Unit = {
      writer.writeZ(Constants.Factory_FlowPresentedWorkRequest)
      writeFactory_FlowRequestPresenceType(o.presence)
      writeFactory_FlowValidityType(o.validity)
      writeFactory_FlowWorkIdType(o.work_id)
      writeFactory_FlowProductKindType(o.product)
    }

    def writeFactory_FlowPresentedWorkRequest_Payload(o: Factory_Flow.PresentedWorkRequest_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowPresentedWorkRequest_Payload)
      writeFactory_FlowPresentedWorkRequest(o.value)
    }

    def writeFactory_FlowAdmissionFact(o: Factory_Flow.AdmissionFact): Unit = {
      writer.writeZ(Constants.Factory_FlowAdmissionFact)
      writeFactory_FlowAdmissionAssessmentType(o.assessment)
      writeFactory_FlowWorkIdType(o.work_id)
    }

    def writeFactory_FlowAdmissionFact_Payload(o: Factory_Flow.AdmissionFact_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowAdmissionFact_Payload)
      writeFactory_FlowAdmissionFact(o.value)
    }

    def writeFactory_FlowMaterialHandoffObservation(o: Factory_Flow.MaterialHandoffObservation): Unit = {
      writer.writeZ(Constants.Factory_FlowMaterialHandoffObservation)
      writeFactory_FlowValidityType(o.validity)
      writeFactory_FlowWorkIdType(o.work_id)
      writeFactory_FlowMaterialDispositionType(o.disposition)
    }

    def writeFactory_FlowMaterialHandoffObservation_Payload(o: Factory_Flow.MaterialHandoffObservation_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowMaterialHandoffObservation_Payload)
      writeFactory_FlowMaterialHandoffObservation(o.value)
    }

    def writeFactory_FlowMaterialFact(o: Factory_Flow.MaterialFact): Unit = {
      writer.writeZ(Constants.Factory_FlowMaterialFact)
      writeFactory_FlowMaterialAssessmentType(o.assessment)
    }

    def writeFactory_FlowMaterialFact_Payload(o: Factory_Flow.MaterialFact_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowMaterialFact_Payload)
      writeFactory_FlowMaterialFact(o.value)
    }

    def writeFactory_FlowStepReadinessObservation(o: Factory_Flow.StepReadinessObservation): Unit = {
      writer.writeZ(Constants.Factory_FlowStepReadinessObservation)
      writeFactory_FlowValidityType(o.validity)
      writer.writeS32(o.step)
      writeFactory_FlowStepDispositionType(o.disposition)
    }

    def writeFactory_FlowStepReadinessObservation_Payload(o: Factory_Flow.StepReadinessObservation_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowStepReadinessObservation_Payload)
      writeFactory_FlowStepReadinessObservation(o.value)
    }

    def writeFactory_FlowFlowContext(o: Factory_Flow.FlowContext): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowContext)
      writeFactory_FlowLedgerPhaseType(o.phase)
      writeFactory_FlowWorkIdType(o.work_id)
      writer.writeS32(o.step_value)
      writeFactory_FlowAttemptKindType(o.attempt)
    }

    def writeFactory_FlowFlowContext_Payload(o: Factory_Flow.FlowContext_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowContext_Payload)
      writeFactory_FlowFlowContext(o.value)
    }

    def writeFactory_FlowProtectionContext(o: Factory_Flow.ProtectionContext): Unit = {
      writer.writeZ(Constants.Factory_FlowProtectionContext)
      writeFactory_FlowLedgerPhaseType(o.phase)
      writeFactory_FlowWorkIdType(o.work_id)
      writer.writeS32(o.step_value)
      writeFactory_FlowAttemptKindType(o.attempt)
    }

    def writeFactory_FlowProtectionContext_Payload(o: Factory_Flow.ProtectionContext_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowProtectionContext_Payload)
      writeFactory_FlowProtectionContext(o.value)
    }

    def writeFactory_FlowFlowSnapshot(o: Factory_Flow.FlowSnapshot): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowSnapshot)
      writeFactory_FlowLedgerPhaseType(o.phase)
      writeFactory_FlowWorkIdType(o.work_id)
      writer.writeS32(o.step_value)
      writeFactory_FlowAttemptKindType(o.attempt)
    }

    def writeFactory_FlowFlowSnapshot_Payload(o: Factory_Flow.FlowSnapshot_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowSnapshot_Payload)
      writeFactory_FlowFlowSnapshot(o.value)
    }

    def writeFactory_FlowProcessResultObservation(o: Factory_Flow.ProcessResultObservation): Unit = {
      writer.writeZ(Constants.Factory_FlowProcessResultObservation)
      writeFactory_FlowValidityType(o.validity)
      writeFactory_FlowWorkIdType(o.work_id)
      writer.writeS32(o.step)
      writeFactory_FlowProcessEventType(o.event_kind)
    }

    def writeFactory_FlowProcessResultObservation_Payload(o: Factory_Flow.ProcessResultObservation_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowProcessResultObservation_Payload)
      writeFactory_FlowProcessResultObservation(o.value)
    }

    def writeFactory_FlowOutcomeFact(o: Factory_Flow.OutcomeFact): Unit = {
      writer.writeZ(Constants.Factory_FlowOutcomeFact)
      writeFactory_FlowCorrelatedOutcomePlanType(o.plan)
    }

    def writeFactory_FlowOutcomeFact_Payload(o: Factory_Flow.OutcomeFact_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowOutcomeFact_Payload)
      writeFactory_FlowOutcomeFact(o.value)
    }

    def writeFactory_FlowFlowIntentFact(o: Factory_Flow.FlowIntentFact): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowIntentFact)
      writeFactory_FlowIntentKindType(o.kind)
      writeFactory_FlowCompetitorPresenceType(o.competitor)
      writeFactory_FlowAdmissionAssessmentType(o.assessment)
      writeFactory_FlowLedgerPhaseType(o.phase)
      writeFactory_FlowWorkIdType(o.work_id)
      writer.writeS32(o.step)
    }

    def writeFactory_FlowFlowIntentFact_Payload(o: Factory_Flow.FlowIntentFact_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowIntentFact_Payload)
      writeFactory_FlowFlowIntentFact(o.value)
    }

    def writeFactory_FlowAuthorizationFact(o: Factory_Flow.AuthorizationFact): Unit = {
      writer.writeZ(Constants.Factory_FlowAuthorizationFact)
      writeFactory_FlowFlowDecisionType(o.decision)
      writeFactory_FlowDecisionReasonType(o.reason)
      writeFactory_FlowWorkIdType(o.work_id)
      writer.writeS32(o.step)
    }

    def writeFactory_FlowAuthorizationFact_Payload(o: Factory_Flow.AuthorizationFact_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowAuthorizationFact_Payload)
      writeFactory_FlowAuthorizationFact(o.value)
    }

    def writeFactory_FlowLineFlowCommand(o: Factory_Flow.LineFlowCommand): Unit = {
      writer.writeZ(Constants.Factory_FlowLineFlowCommand)
      writeFactory_FlowCommandActionType(o.action_kind)
      writeFactory_FlowWorkIdType(o.work_id)
      writer.writeS32(o.step)
    }

    def writeFactory_FlowLineFlowCommand_Payload(o: Factory_Flow.LineFlowCommand_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowLineFlowCommand_Payload)
      writeFactory_FlowLineFlowCommand(o.value)
    }

    def writeFactory_FlowProductionOutcome(o: Factory_Flow.ProductionOutcome): Unit = {
      writer.writeZ(Constants.Factory_FlowProductionOutcome)
      writeFactory_FlowProductionResultType(o.result)
      writeFactory_FlowWorkIdType(o.work_id)
    }

    def writeFactory_FlowProductionOutcome_Payload(o: Factory_Flow.ProductionOutcome_Payload): Unit = {
      writer.writeZ(Constants.Factory_FlowProductionOutcome_Payload)
      writeFactory_FlowProductionOutcome(o.value)
    }

    def writeBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBoolean_Payload)
      writer.writeB(o.value)
    }

    def writeBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_Payload)
      writer.writeZ(o.value)
    }

    def writeBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_8_Payload)
      writer.writeS8(o.value)
    }

    def writeBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_16_Payload)
      writer.writeS16(o.value)
    }

    def writeBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_32_Payload)
      writer.writeS32(o.value)
    }

    def writeBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_64_Payload)
      writer.writeS64(o.value)
    }

    def writeBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_8_Payload)
      writer.writeU8(o.value)
    }

    def writeBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_16_Payload)
      writer.writeU16(o.value)
    }

    def writeBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_32_Payload)
      writer.writeU32(o.value)
    }

    def writeBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_64_Payload)
      writer.writeU64(o.value)
    }

    def writeBase_TypesFloat_Payload(o: Base_Types.Float_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_Payload)
      writer.writeR(o.value)
    }

    def writeBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_32_Payload)
      writer.writeF32(o.value)
    }

    def writeBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_64_Payload)
      writer.writeF64(o.value)
    }

    def writeBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesCharacter_Payload)
      writer.writeC(o.value)
    }

    def writeBase_TypesString_Payload(o: Base_Types.String_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesString_Payload)
      writer.writeString(o.value)
    }

    def writeBase_TypesBits_Payload(o: Base_Types.Bits_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBits_Payload)
      writer.writeISZ(o.value, writer.writeB _)
    }

    def writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container): Unit = {
      o match {
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P => writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS => writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(o)
      }
    }

    def writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P)
      writeFactory_FlowPresentedWorkRequest(o.api_presentedWork)
    }

    def writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS)
      writeFactory_FlowPresentedWorkRequest(o.api_presentedWork)
    }

    def writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container): Unit = {
      o match {
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P => writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS => writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(o)
      }
    }

    def writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P)
      writeFactory_FlowAdmissionFact(o.api_admissionToMaterial)
      writeFactory_FlowAdmissionFact(o.api_admissionToPriority)
    }

    def writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS)
      writeFactory_FlowAdmissionFact(o.api_admissionToMaterial)
      writeFactory_FlowAdmissionFact(o.api_admissionToPriority)
    }

    def writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container): Unit = {
      o match {
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P => writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS => writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(o)
      }
    }

    def writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P)
      writeFactory_FlowAdmissionFact(o.api_admission)
      writeFactory_FlowMaterialHandoffObservation(o.api_materialObservation)
    }

    def writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS)
      writeFactory_FlowAdmissionFact(o.api_admission)
      writeFactory_FlowMaterialHandoffObservation(o.api_materialObservation)
    }

    def writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container): Unit = {
      o match {
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P => writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS => writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(o)
      }
    }

    def writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P)
      writeFactory_FlowMaterialFact(o.api_materialFact)
    }

    def writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS)
      writeFactory_FlowMaterialFact(o.api_materialFact)
    }

    def writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container): Unit = {
      o match {
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P => writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS => writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(o)
      }
    }

    def writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P)
      writeFactory_FlowFlowContext(o.api_flowContext)
      writeFactory_FlowStepReadinessObservation(o.api_readinessObservation)
    }

    def writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS)
      writeFactory_FlowFlowContext(o.api_flowContext)
      writeFactory_FlowStepReadinessObservation(o.api_readinessObservation)
    }

    def writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container): Unit = {
      o match {
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P => writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS => writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(o)
      }
    }

    def writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P)
      writeFactory_FlowTargetQualificationType(o.api_targetFact)
    }

    def writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS)
      writeFactory_FlowTargetQualificationType(o.api_targetFact)
    }

    def writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container): Unit = {
      o match {
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P => writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS => writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(o)
      }
    }

    def writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P)
      writeFactory_FlowFlowContext(o.api_flowContext)
      writeFactory_FlowProcessResultObservation(o.api_processResult)
    }

    def writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS)
      writeFactory_FlowFlowContext(o.api_flowContext)
      writeFactory_FlowProcessResultObservation(o.api_processResult)
    }

    def writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container): Unit = {
      o match {
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P => writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS => writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(o)
      }
    }

    def writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P)
      writeFactory_FlowOutcomeFact(o.api_outcomeToAuthorization)
      writeFactory_FlowOutcomeFact(o.api_outcomeToDeterminer)
    }

    def writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS)
      writeFactory_FlowOutcomeFact(o.api_outcomeToAuthorization)
      writeFactory_FlowOutcomeFact(o.api_outcomeToDeterminer)
    }

    def writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container): Unit = {
      o match {
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P => writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS => writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(o)
      }
    }

    def writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P)
      writeFactory_FlowAdmissionFact(o.api_admission)
      writeFactory_FlowProtectionContext(o.api_protectionContext)
    }

    def writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS)
      writeFactory_FlowAdmissionFact(o.api_admission)
      writeFactory_FlowProtectionContext(o.api_protectionContext)
    }

    def writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container): Unit = {
      o match {
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P => writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS => writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(o)
      }
    }

    def writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P)
      writeFactory_FlowFlowIntentFact(o.api_intentFact)
    }

    def writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS)
      writeFactory_FlowFlowIntentFact(o.api_intentFact)
    }

    def writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container): Unit = {
      o match {
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P => writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS => writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(o)
      }
    }

    def writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P)
      writeFactory_FlowFlowIntentFact(o.api_intentFact)
      writeFactory_FlowMaterialFact(o.api_materialFact)
      writeFactory_FlowOutcomeFact(o.api_outcomeFact)
      writeFactory_FlowTargetQualificationType(o.api_targetFact)
    }

    def writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS)
      writeFactory_FlowFlowIntentFact(o.api_intentFact)
      writeFactory_FlowMaterialFact(o.api_materialFact)
      writeFactory_FlowOutcomeFact(o.api_outcomeFact)
      writeFactory_FlowTargetQualificationType(o.api_targetFact)
    }

    def writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container): Unit = {
      o match {
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P => writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS => writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(o)
      }
    }

    def writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P)
      writeFactory_FlowAuthorizationFact(o.api_authorization)
      writeFactory_FlowDecisionReasonType(o.api_reasonToStatus)
    }

    def writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS)
      writeFactory_FlowAuthorizationFact(o.api_authorization)
      writeFactory_FlowDecisionReasonType(o.api_reasonToStatus)
    }

    def writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container): Unit = {
      o match {
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P => writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS => writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(o)
      }
    }

    def writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P)
      writeFactory_FlowAuthorizationFact(o.api_authorization)
    }

    def writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS)
      writeFactory_FlowAuthorizationFact(o.api_authorization)
    }

    def writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container): Unit = {
      o match {
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P => writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS => writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(o)
      }
    }

    def writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P)
      writeFactory_FlowFlowContext(o.api_contextToOutcome)
      writeFactory_FlowFlowContext(o.api_contextToReadiness)
      writeFactory_FlowLineFlowCommand(o.api_lineCommand)
      writeFactory_FlowProtectionContext(o.api_protectionContext)
      writeFactory_FlowFlowSnapshot(o.api_snapshotToOutcome)
      writeFactory_FlowFlowSnapshot(o.api_snapshotToStatus)
    }

    def writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS)
      writeFactory_FlowFlowContext(o.api_contextToOutcome)
      writeFactory_FlowFlowContext(o.api_contextToReadiness)
      writeFactory_FlowLineFlowCommand(o.api_lineCommand)
      writeFactory_FlowProtectionContext(o.api_protectionContext)
      writeFactory_FlowFlowSnapshot(o.api_snapshotToOutcome)
      writeFactory_FlowFlowSnapshot(o.api_snapshotToStatus)
    }

    def writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container): Unit = {
      o match {
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P => writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS => writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(o)
      }
    }

    def writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P)
      writeFactory_FlowFlowSnapshot(o.api_appliedSnapshot)
      writeFactory_FlowOutcomeFact(o.api_outcomeFact)
    }

    def writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS)
      writeFactory_FlowFlowSnapshot(o.api_appliedSnapshot)
      writeFactory_FlowOutcomeFact(o.api_outcomeFact)
    }

    def writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container): Unit = {
      o match {
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P => writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS => writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(o)
      }
    }

    def writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P)
      writeFactory_FlowProductionOutcome(o.api_productionOutcome)
    }

    def writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS)
      writeFactory_FlowProductionOutcome(o.api_productionOutcome)
    }

    def writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container): Unit = {
      o match {
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P => writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS => writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(o)
      }
    }

    def writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P)
      writeFactory_FlowFlowSnapshot(o.api_appliedSnapshot)
      writeFactory_FlowDecisionReasonType(o.api_decisionReason)
    }

    def writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS)
      writeFactory_FlowFlowSnapshot(o.api_appliedSnapshot)
      writeFactory_FlowDecisionReasonType(o.api_decisionReason)
    }

    def writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container): Unit = {
      o match {
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P => writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS => writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(o)
      }
    }

    def writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P)
      writeFactory_FlowProductionFlowStatusType(o.api_flowStatus)
    }

    def writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS)
      writeFactory_FlowProductionFlowStatusType(o.api_flowStatus)
    }

    def writeruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P => writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS => writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P => writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS => writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P => writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P => writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS => writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS => writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P => writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P => writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS => writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS => writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P => writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS => writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P => writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS => writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P => writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS => writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P => writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS => writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P => writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS => writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P => writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS => writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P => writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P => writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS => writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS => writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P => writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P => writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS => writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS => writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P => writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS => writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P => writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS => writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(o)
      }
    }

    def writeutilEmptyContainer(o: util.EmptyContainer): Unit = {
      writer.writeZ(Constants.utilEmptyContainer)
    }

    def write_artDataContent(o: art.DataContent): Unit = {
      o match {
        case o: art.Empty => write_artEmpty(o)
        case o: Base_Types.Boolean_Payload => writeBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => writeBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => writeBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => writeBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => writeBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => writeBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => writeBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => writeBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => writeBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => writeBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => writeBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => writeBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => writeBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => writeBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => writeBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => writeBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: Factory_Flow.WorkId_Payload => writeFactory_FlowWorkId_Payload(o)
        case o: Factory_Flow.Validity_Payload => writeFactory_FlowValidity_Payload(o)
        case o: Factory_Flow.IntentKind_Payload => writeFactory_FlowIntentKind_Payload(o)
        case o: Factory_Flow.AttemptKind_Payload => writeFactory_FlowAttemptKind_Payload(o)
        case o: Factory_Flow.ProductKind_Payload => writeFactory_FlowProductKind_Payload(o)
        case o: Factory_Flow.LedgerPhase_Payload => writeFactory_FlowLedgerPhase_Payload(o)
        case o: Factory_Flow.OutcomeFact_Payload => writeFactory_FlowOutcomeFact_Payload(o)
        case o: Factory_Flow.FlowContext_Payload => writeFactory_FlowFlowContext_Payload(o)
        case o: Factory_Flow.ProcessEvent_Payload => writeFactory_FlowProcessEvent_Payload(o)
        case o: Factory_Flow.MaterialFact_Payload => writeFactory_FlowMaterialFact_Payload(o)
        case o: Factory_Flow.FlowDecision_Payload => writeFactory_FlowFlowDecision_Payload(o)
        case o: Factory_Flow.FlowSnapshot_Payload => writeFactory_FlowFlowSnapshot_Payload(o)
        case o: Factory_Flow.CommandAction_Payload => writeFactory_FlowCommandAction_Payload(o)
        case o: Factory_Flow.AdmissionFact_Payload => writeFactory_FlowAdmissionFact_Payload(o)
        case o: Factory_Flow.DecisionReason_Payload => writeFactory_FlowDecisionReason_Payload(o)
        case o: Factory_Flow.FlowIntentFact_Payload => writeFactory_FlowFlowIntentFact_Payload(o)
        case o: Factory_Flow.RequestPresence_Payload => writeFactory_FlowRequestPresence_Payload(o)
        case o: Factory_Flow.StepDisposition_Payload => writeFactory_FlowStepDisposition_Payload(o)
        case o: Factory_Flow.LineFlowCommand_Payload => writeFactory_FlowLineFlowCommand_Payload(o)
        case o: Factory_Flow.ProductionResult_Payload => writeFactory_FlowProductionResult_Payload(o)
        case o: Factory_Flow.ProductionOutcome_Payload => writeFactory_FlowProductionOutcome_Payload(o)
        case o: Factory_Flow.ProtectionContext_Payload => writeFactory_FlowProtectionContext_Payload(o)
        case o: Factory_Flow.AuthorizationFact_Payload => writeFactory_FlowAuthorizationFact_Payload(o)
        case o: Factory_Flow.CompetitorPresence_Payload => writeFactory_FlowCompetitorPresence_Payload(o)
        case o: Factory_Flow.MaterialAssessment_Payload => writeFactory_FlowMaterialAssessment_Payload(o)
        case o: Factory_Flow.MaterialDisposition_Payload => writeFactory_FlowMaterialDisposition_Payload(o)
        case o: Factory_Flow.AdmissionAssessment_Payload => writeFactory_FlowAdmissionAssessment_Payload(o)
        case o: Factory_Flow.TargetQualification_Payload => writeFactory_FlowTargetQualification_Payload(o)
        case o: Factory_Flow.ProductionFlowStatus_Payload => writeFactory_FlowProductionFlowStatus_Payload(o)
        case o: Factory_Flow.PresentedWorkRequest_Payload => writeFactory_FlowPresentedWorkRequest_Payload(o)
        case o: Factory_Flow.CorrelatedOutcomePlan_Payload => writeFactory_FlowCorrelatedOutcomePlan_Payload(o)
        case o: Factory_Flow.StepReadinessObservation_Payload => writeFactory_FlowStepReadinessObservation_Payload(o)
        case o: Factory_Flow.ProcessResultObservation_Payload => writeFactory_FlowProcessResultObservation_Payload(o)
        case o: Factory_Flow.MaterialHandoffObservation_Payload => writeFactory_FlowMaterialHandoffObservation_Payload(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P => writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS => writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P => writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS => writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P => writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P => writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS => writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS => writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P => writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P => writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS => writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS => writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P => writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS => writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P => writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS => writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P => writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS => writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P => writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS => writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P => writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS => writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P => writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS => writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P => writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P => writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS => writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS => writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P => writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P => writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS => writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS => writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P => writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS => writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P => writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS => writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(o)
      }
    }

    def write_artEmpty(o: art.Empty): Unit = {
      writer.writeZ(Constants._artEmpty)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader.Impl) extends Reader {
      def errorOpt: Option[MessagePack.ErrorMsg] = {
        return reader.errorOpt
      }
    }

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def readFactory_FlowRequestPresenceType(): Factory_Flow.RequestPresence.Type = {
      val r = reader.readZ()
      return Factory_Flow.RequestPresence.byOrdinal(r).get
    }

    def readFactory_FlowRequestPresence_Payload(): Factory_Flow.RequestPresence_Payload = {
      val r = readFactory_FlowRequestPresence_PayloadT(F)
      return r
    }

    def readFactory_FlowRequestPresence_PayloadT(typeParsed: B): Factory_Flow.RequestPresence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowRequestPresence_Payload)
      }
      val value = readFactory_FlowRequestPresenceType()
      return Factory_Flow.RequestPresence_Payload(value)
    }

    def readFactory_FlowValidityType(): Factory_Flow.Validity.Type = {
      val r = reader.readZ()
      return Factory_Flow.Validity.byOrdinal(r).get
    }

    def readFactory_FlowValidity_Payload(): Factory_Flow.Validity_Payload = {
      val r = readFactory_FlowValidity_PayloadT(F)
      return r
    }

    def readFactory_FlowValidity_PayloadT(typeParsed: B): Factory_Flow.Validity_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowValidity_Payload)
      }
      val value = readFactory_FlowValidityType()
      return Factory_Flow.Validity_Payload(value)
    }

    def readFactory_FlowWorkIdType(): Factory_Flow.WorkId.Type = {
      val r = reader.readZ()
      return Factory_Flow.WorkId.byOrdinal(r).get
    }

    def readFactory_FlowWorkId_Payload(): Factory_Flow.WorkId_Payload = {
      val r = readFactory_FlowWorkId_PayloadT(F)
      return r
    }

    def readFactory_FlowWorkId_PayloadT(typeParsed: B): Factory_Flow.WorkId_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowWorkId_Payload)
      }
      val value = readFactory_FlowWorkIdType()
      return Factory_Flow.WorkId_Payload(value)
    }

    def readFactory_FlowProductKindType(): Factory_Flow.ProductKind.Type = {
      val r = reader.readZ()
      return Factory_Flow.ProductKind.byOrdinal(r).get
    }

    def readFactory_FlowProductKind_Payload(): Factory_Flow.ProductKind_Payload = {
      val r = readFactory_FlowProductKind_PayloadT(F)
      return r
    }

    def readFactory_FlowProductKind_PayloadT(typeParsed: B): Factory_Flow.ProductKind_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProductKind_Payload)
      }
      val value = readFactory_FlowProductKindType()
      return Factory_Flow.ProductKind_Payload(value)
    }

    def readFactory_FlowAdmissionAssessmentType(): Factory_Flow.AdmissionAssessment.Type = {
      val r = reader.readZ()
      return Factory_Flow.AdmissionAssessment.byOrdinal(r).get
    }

    def readFactory_FlowAdmissionAssessment_Payload(): Factory_Flow.AdmissionAssessment_Payload = {
      val r = readFactory_FlowAdmissionAssessment_PayloadT(F)
      return r
    }

    def readFactory_FlowAdmissionAssessment_PayloadT(typeParsed: B): Factory_Flow.AdmissionAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowAdmissionAssessment_Payload)
      }
      val value = readFactory_FlowAdmissionAssessmentType()
      return Factory_Flow.AdmissionAssessment_Payload(value)
    }

    def readFactory_FlowMaterialDispositionType(): Factory_Flow.MaterialDisposition.Type = {
      val r = reader.readZ()
      return Factory_Flow.MaterialDisposition.byOrdinal(r).get
    }

    def readFactory_FlowMaterialDisposition_Payload(): Factory_Flow.MaterialDisposition_Payload = {
      val r = readFactory_FlowMaterialDisposition_PayloadT(F)
      return r
    }

    def readFactory_FlowMaterialDisposition_PayloadT(typeParsed: B): Factory_Flow.MaterialDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowMaterialDisposition_Payload)
      }
      val value = readFactory_FlowMaterialDispositionType()
      return Factory_Flow.MaterialDisposition_Payload(value)
    }

    def readFactory_FlowMaterialAssessmentType(): Factory_Flow.MaterialAssessment.Type = {
      val r = reader.readZ()
      return Factory_Flow.MaterialAssessment.byOrdinal(r).get
    }

    def readFactory_FlowMaterialAssessment_Payload(): Factory_Flow.MaterialAssessment_Payload = {
      val r = readFactory_FlowMaterialAssessment_PayloadT(F)
      return r
    }

    def readFactory_FlowMaterialAssessment_PayloadT(typeParsed: B): Factory_Flow.MaterialAssessment_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowMaterialAssessment_Payload)
      }
      val value = readFactory_FlowMaterialAssessmentType()
      return Factory_Flow.MaterialAssessment_Payload(value)
    }

    def readFactory_FlowStepDispositionType(): Factory_Flow.StepDisposition.Type = {
      val r = reader.readZ()
      return Factory_Flow.StepDisposition.byOrdinal(r).get
    }

    def readFactory_FlowStepDisposition_Payload(): Factory_Flow.StepDisposition_Payload = {
      val r = readFactory_FlowStepDisposition_PayloadT(F)
      return r
    }

    def readFactory_FlowStepDisposition_PayloadT(typeParsed: B): Factory_Flow.StepDisposition_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowStepDisposition_Payload)
      }
      val value = readFactory_FlowStepDispositionType()
      return Factory_Flow.StepDisposition_Payload(value)
    }

    def readFactory_FlowLedgerPhaseType(): Factory_Flow.LedgerPhase.Type = {
      val r = reader.readZ()
      return Factory_Flow.LedgerPhase.byOrdinal(r).get
    }

    def readFactory_FlowLedgerPhase_Payload(): Factory_Flow.LedgerPhase_Payload = {
      val r = readFactory_FlowLedgerPhase_PayloadT(F)
      return r
    }

    def readFactory_FlowLedgerPhase_PayloadT(typeParsed: B): Factory_Flow.LedgerPhase_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowLedgerPhase_Payload)
      }
      val value = readFactory_FlowLedgerPhaseType()
      return Factory_Flow.LedgerPhase_Payload(value)
    }

    def readFactory_FlowAttemptKindType(): Factory_Flow.AttemptKind.Type = {
      val r = reader.readZ()
      return Factory_Flow.AttemptKind.byOrdinal(r).get
    }

    def readFactory_FlowAttemptKind_Payload(): Factory_Flow.AttemptKind_Payload = {
      val r = readFactory_FlowAttemptKind_PayloadT(F)
      return r
    }

    def readFactory_FlowAttemptKind_PayloadT(typeParsed: B): Factory_Flow.AttemptKind_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowAttemptKind_Payload)
      }
      val value = readFactory_FlowAttemptKindType()
      return Factory_Flow.AttemptKind_Payload(value)
    }

    def readFactory_FlowTargetQualificationType(): Factory_Flow.TargetQualification.Type = {
      val r = reader.readZ()
      return Factory_Flow.TargetQualification.byOrdinal(r).get
    }

    def readFactory_FlowTargetQualification_Payload(): Factory_Flow.TargetQualification_Payload = {
      val r = readFactory_FlowTargetQualification_PayloadT(F)
      return r
    }

    def readFactory_FlowTargetQualification_PayloadT(typeParsed: B): Factory_Flow.TargetQualification_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowTargetQualification_Payload)
      }
      val value = readFactory_FlowTargetQualificationType()
      return Factory_Flow.TargetQualification_Payload(value)
    }

    def readFactory_FlowProcessEventType(): Factory_Flow.ProcessEvent.Type = {
      val r = reader.readZ()
      return Factory_Flow.ProcessEvent.byOrdinal(r).get
    }

    def readFactory_FlowProcessEvent_Payload(): Factory_Flow.ProcessEvent_Payload = {
      val r = readFactory_FlowProcessEvent_PayloadT(F)
      return r
    }

    def readFactory_FlowProcessEvent_PayloadT(typeParsed: B): Factory_Flow.ProcessEvent_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProcessEvent_Payload)
      }
      val value = readFactory_FlowProcessEventType()
      return Factory_Flow.ProcessEvent_Payload(value)
    }

    def readFactory_FlowCorrelatedOutcomePlanType(): Factory_Flow.CorrelatedOutcomePlan.Type = {
      val r = reader.readZ()
      return Factory_Flow.CorrelatedOutcomePlan.byOrdinal(r).get
    }

    def readFactory_FlowCorrelatedOutcomePlan_Payload(): Factory_Flow.CorrelatedOutcomePlan_Payload = {
      val r = readFactory_FlowCorrelatedOutcomePlan_PayloadT(F)
      return r
    }

    def readFactory_FlowCorrelatedOutcomePlan_PayloadT(typeParsed: B): Factory_Flow.CorrelatedOutcomePlan_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowCorrelatedOutcomePlan_Payload)
      }
      val value = readFactory_FlowCorrelatedOutcomePlanType()
      return Factory_Flow.CorrelatedOutcomePlan_Payload(value)
    }

    def readFactory_FlowIntentKindType(): Factory_Flow.IntentKind.Type = {
      val r = reader.readZ()
      return Factory_Flow.IntentKind.byOrdinal(r).get
    }

    def readFactory_FlowIntentKind_Payload(): Factory_Flow.IntentKind_Payload = {
      val r = readFactory_FlowIntentKind_PayloadT(F)
      return r
    }

    def readFactory_FlowIntentKind_PayloadT(typeParsed: B): Factory_Flow.IntentKind_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowIntentKind_Payload)
      }
      val value = readFactory_FlowIntentKindType()
      return Factory_Flow.IntentKind_Payload(value)
    }

    def readFactory_FlowCompetitorPresenceType(): Factory_Flow.CompetitorPresence.Type = {
      val r = reader.readZ()
      return Factory_Flow.CompetitorPresence.byOrdinal(r).get
    }

    def readFactory_FlowCompetitorPresence_Payload(): Factory_Flow.CompetitorPresence_Payload = {
      val r = readFactory_FlowCompetitorPresence_PayloadT(F)
      return r
    }

    def readFactory_FlowCompetitorPresence_PayloadT(typeParsed: B): Factory_Flow.CompetitorPresence_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowCompetitorPresence_Payload)
      }
      val value = readFactory_FlowCompetitorPresenceType()
      return Factory_Flow.CompetitorPresence_Payload(value)
    }

    def readFactory_FlowFlowDecisionType(): Factory_Flow.FlowDecision.Type = {
      val r = reader.readZ()
      return Factory_Flow.FlowDecision.byOrdinal(r).get
    }

    def readFactory_FlowFlowDecision_Payload(): Factory_Flow.FlowDecision_Payload = {
      val r = readFactory_FlowFlowDecision_PayloadT(F)
      return r
    }

    def readFactory_FlowFlowDecision_PayloadT(typeParsed: B): Factory_Flow.FlowDecision_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowDecision_Payload)
      }
      val value = readFactory_FlowFlowDecisionType()
      return Factory_Flow.FlowDecision_Payload(value)
    }

    def readFactory_FlowDecisionReasonType(): Factory_Flow.DecisionReason.Type = {
      val r = reader.readZ()
      return Factory_Flow.DecisionReason.byOrdinal(r).get
    }

    def readFactory_FlowDecisionReason_Payload(): Factory_Flow.DecisionReason_Payload = {
      val r = readFactory_FlowDecisionReason_PayloadT(F)
      return r
    }

    def readFactory_FlowDecisionReason_PayloadT(typeParsed: B): Factory_Flow.DecisionReason_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowDecisionReason_Payload)
      }
      val value = readFactory_FlowDecisionReasonType()
      return Factory_Flow.DecisionReason_Payload(value)
    }

    def readFactory_FlowCommandActionType(): Factory_Flow.CommandAction.Type = {
      val r = reader.readZ()
      return Factory_Flow.CommandAction.byOrdinal(r).get
    }

    def readFactory_FlowCommandAction_Payload(): Factory_Flow.CommandAction_Payload = {
      val r = readFactory_FlowCommandAction_PayloadT(F)
      return r
    }

    def readFactory_FlowCommandAction_PayloadT(typeParsed: B): Factory_Flow.CommandAction_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowCommandAction_Payload)
      }
      val value = readFactory_FlowCommandActionType()
      return Factory_Flow.CommandAction_Payload(value)
    }

    def readFactory_FlowProductionResultType(): Factory_Flow.ProductionResult.Type = {
      val r = reader.readZ()
      return Factory_Flow.ProductionResult.byOrdinal(r).get
    }

    def readFactory_FlowProductionResult_Payload(): Factory_Flow.ProductionResult_Payload = {
      val r = readFactory_FlowProductionResult_PayloadT(F)
      return r
    }

    def readFactory_FlowProductionResult_PayloadT(typeParsed: B): Factory_Flow.ProductionResult_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProductionResult_Payload)
      }
      val value = readFactory_FlowProductionResultType()
      return Factory_Flow.ProductionResult_Payload(value)
    }

    def readFactory_FlowProductionFlowStatusType(): Factory_Flow.ProductionFlowStatus.Type = {
      val r = reader.readZ()
      return Factory_Flow.ProductionFlowStatus.byOrdinal(r).get
    }

    def readFactory_FlowProductionFlowStatus_Payload(): Factory_Flow.ProductionFlowStatus_Payload = {
      val r = readFactory_FlowProductionFlowStatus_PayloadT(F)
      return r
    }

    def readFactory_FlowProductionFlowStatus_PayloadT(typeParsed: B): Factory_Flow.ProductionFlowStatus_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProductionFlowStatus_Payload)
      }
      val value = readFactory_FlowProductionFlowStatusType()
      return Factory_Flow.ProductionFlowStatus_Payload(value)
    }

    def readFactory_FlowPresentedWorkRequest(): Factory_Flow.PresentedWorkRequest = {
      val r = readFactory_FlowPresentedWorkRequestT(F)
      return r
    }

    def readFactory_FlowPresentedWorkRequestT(typeParsed: B): Factory_Flow.PresentedWorkRequest = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowPresentedWorkRequest)
      }
      val presence = readFactory_FlowRequestPresenceType()
      val validity = readFactory_FlowValidityType()
      val work_id = readFactory_FlowWorkIdType()
      val product = readFactory_FlowProductKindType()
      return Factory_Flow.PresentedWorkRequest(presence, validity, work_id, product)
    }

    def readFactory_FlowPresentedWorkRequest_Payload(): Factory_Flow.PresentedWorkRequest_Payload = {
      val r = readFactory_FlowPresentedWorkRequest_PayloadT(F)
      return r
    }

    def readFactory_FlowPresentedWorkRequest_PayloadT(typeParsed: B): Factory_Flow.PresentedWorkRequest_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowPresentedWorkRequest_Payload)
      }
      val value = readFactory_FlowPresentedWorkRequest()
      return Factory_Flow.PresentedWorkRequest_Payload(value)
    }

    def readFactory_FlowAdmissionFact(): Factory_Flow.AdmissionFact = {
      val r = readFactory_FlowAdmissionFactT(F)
      return r
    }

    def readFactory_FlowAdmissionFactT(typeParsed: B): Factory_Flow.AdmissionFact = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowAdmissionFact)
      }
      val assessment = readFactory_FlowAdmissionAssessmentType()
      val work_id = readFactory_FlowWorkIdType()
      return Factory_Flow.AdmissionFact(assessment, work_id)
    }

    def readFactory_FlowAdmissionFact_Payload(): Factory_Flow.AdmissionFact_Payload = {
      val r = readFactory_FlowAdmissionFact_PayloadT(F)
      return r
    }

    def readFactory_FlowAdmissionFact_PayloadT(typeParsed: B): Factory_Flow.AdmissionFact_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowAdmissionFact_Payload)
      }
      val value = readFactory_FlowAdmissionFact()
      return Factory_Flow.AdmissionFact_Payload(value)
    }

    def readFactory_FlowMaterialHandoffObservation(): Factory_Flow.MaterialHandoffObservation = {
      val r = readFactory_FlowMaterialHandoffObservationT(F)
      return r
    }

    def readFactory_FlowMaterialHandoffObservationT(typeParsed: B): Factory_Flow.MaterialHandoffObservation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowMaterialHandoffObservation)
      }
      val validity = readFactory_FlowValidityType()
      val work_id = readFactory_FlowWorkIdType()
      val disposition = readFactory_FlowMaterialDispositionType()
      return Factory_Flow.MaterialHandoffObservation(validity, work_id, disposition)
    }

    def readFactory_FlowMaterialHandoffObservation_Payload(): Factory_Flow.MaterialHandoffObservation_Payload = {
      val r = readFactory_FlowMaterialHandoffObservation_PayloadT(F)
      return r
    }

    def readFactory_FlowMaterialHandoffObservation_PayloadT(typeParsed: B): Factory_Flow.MaterialHandoffObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowMaterialHandoffObservation_Payload)
      }
      val value = readFactory_FlowMaterialHandoffObservation()
      return Factory_Flow.MaterialHandoffObservation_Payload(value)
    }

    def readFactory_FlowMaterialFact(): Factory_Flow.MaterialFact = {
      val r = readFactory_FlowMaterialFactT(F)
      return r
    }

    def readFactory_FlowMaterialFactT(typeParsed: B): Factory_Flow.MaterialFact = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowMaterialFact)
      }
      val assessment = readFactory_FlowMaterialAssessmentType()
      return Factory_Flow.MaterialFact(assessment)
    }

    def readFactory_FlowMaterialFact_Payload(): Factory_Flow.MaterialFact_Payload = {
      val r = readFactory_FlowMaterialFact_PayloadT(F)
      return r
    }

    def readFactory_FlowMaterialFact_PayloadT(typeParsed: B): Factory_Flow.MaterialFact_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowMaterialFact_Payload)
      }
      val value = readFactory_FlowMaterialFact()
      return Factory_Flow.MaterialFact_Payload(value)
    }

    def readFactory_FlowStepReadinessObservation(): Factory_Flow.StepReadinessObservation = {
      val r = readFactory_FlowStepReadinessObservationT(F)
      return r
    }

    def readFactory_FlowStepReadinessObservationT(typeParsed: B): Factory_Flow.StepReadinessObservation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowStepReadinessObservation)
      }
      val validity = readFactory_FlowValidityType()
      val step = reader.readS32()
      val disposition = readFactory_FlowStepDispositionType()
      return Factory_Flow.StepReadinessObservation(validity, step, disposition)
    }

    def readFactory_FlowStepReadinessObservation_Payload(): Factory_Flow.StepReadinessObservation_Payload = {
      val r = readFactory_FlowStepReadinessObservation_PayloadT(F)
      return r
    }

    def readFactory_FlowStepReadinessObservation_PayloadT(typeParsed: B): Factory_Flow.StepReadinessObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowStepReadinessObservation_Payload)
      }
      val value = readFactory_FlowStepReadinessObservation()
      return Factory_Flow.StepReadinessObservation_Payload(value)
    }

    def readFactory_FlowFlowContext(): Factory_Flow.FlowContext = {
      val r = readFactory_FlowFlowContextT(F)
      return r
    }

    def readFactory_FlowFlowContextT(typeParsed: B): Factory_Flow.FlowContext = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowContext)
      }
      val phase = readFactory_FlowLedgerPhaseType()
      val work_id = readFactory_FlowWorkIdType()
      val step_value = reader.readS32()
      val attempt = readFactory_FlowAttemptKindType()
      return Factory_Flow.FlowContext(phase, work_id, step_value, attempt)
    }

    def readFactory_FlowFlowContext_Payload(): Factory_Flow.FlowContext_Payload = {
      val r = readFactory_FlowFlowContext_PayloadT(F)
      return r
    }

    def readFactory_FlowFlowContext_PayloadT(typeParsed: B): Factory_Flow.FlowContext_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowContext_Payload)
      }
      val value = readFactory_FlowFlowContext()
      return Factory_Flow.FlowContext_Payload(value)
    }

    def readFactory_FlowProtectionContext(): Factory_Flow.ProtectionContext = {
      val r = readFactory_FlowProtectionContextT(F)
      return r
    }

    def readFactory_FlowProtectionContextT(typeParsed: B): Factory_Flow.ProtectionContext = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProtectionContext)
      }
      val phase = readFactory_FlowLedgerPhaseType()
      val work_id = readFactory_FlowWorkIdType()
      val step_value = reader.readS32()
      val attempt = readFactory_FlowAttemptKindType()
      return Factory_Flow.ProtectionContext(phase, work_id, step_value, attempt)
    }

    def readFactory_FlowProtectionContext_Payload(): Factory_Flow.ProtectionContext_Payload = {
      val r = readFactory_FlowProtectionContext_PayloadT(F)
      return r
    }

    def readFactory_FlowProtectionContext_PayloadT(typeParsed: B): Factory_Flow.ProtectionContext_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProtectionContext_Payload)
      }
      val value = readFactory_FlowProtectionContext()
      return Factory_Flow.ProtectionContext_Payload(value)
    }

    def readFactory_FlowFlowSnapshot(): Factory_Flow.FlowSnapshot = {
      val r = readFactory_FlowFlowSnapshotT(F)
      return r
    }

    def readFactory_FlowFlowSnapshotT(typeParsed: B): Factory_Flow.FlowSnapshot = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowSnapshot)
      }
      val phase = readFactory_FlowLedgerPhaseType()
      val work_id = readFactory_FlowWorkIdType()
      val step_value = reader.readS32()
      val attempt = readFactory_FlowAttemptKindType()
      return Factory_Flow.FlowSnapshot(phase, work_id, step_value, attempt)
    }

    def readFactory_FlowFlowSnapshot_Payload(): Factory_Flow.FlowSnapshot_Payload = {
      val r = readFactory_FlowFlowSnapshot_PayloadT(F)
      return r
    }

    def readFactory_FlowFlowSnapshot_PayloadT(typeParsed: B): Factory_Flow.FlowSnapshot_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowSnapshot_Payload)
      }
      val value = readFactory_FlowFlowSnapshot()
      return Factory_Flow.FlowSnapshot_Payload(value)
    }

    def readFactory_FlowProcessResultObservation(): Factory_Flow.ProcessResultObservation = {
      val r = readFactory_FlowProcessResultObservationT(F)
      return r
    }

    def readFactory_FlowProcessResultObservationT(typeParsed: B): Factory_Flow.ProcessResultObservation = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProcessResultObservation)
      }
      val validity = readFactory_FlowValidityType()
      val work_id = readFactory_FlowWorkIdType()
      val step = reader.readS32()
      val event_kind = readFactory_FlowProcessEventType()
      return Factory_Flow.ProcessResultObservation(validity, work_id, step, event_kind)
    }

    def readFactory_FlowProcessResultObservation_Payload(): Factory_Flow.ProcessResultObservation_Payload = {
      val r = readFactory_FlowProcessResultObservation_PayloadT(F)
      return r
    }

    def readFactory_FlowProcessResultObservation_PayloadT(typeParsed: B): Factory_Flow.ProcessResultObservation_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProcessResultObservation_Payload)
      }
      val value = readFactory_FlowProcessResultObservation()
      return Factory_Flow.ProcessResultObservation_Payload(value)
    }

    def readFactory_FlowOutcomeFact(): Factory_Flow.OutcomeFact = {
      val r = readFactory_FlowOutcomeFactT(F)
      return r
    }

    def readFactory_FlowOutcomeFactT(typeParsed: B): Factory_Flow.OutcomeFact = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowOutcomeFact)
      }
      val plan = readFactory_FlowCorrelatedOutcomePlanType()
      return Factory_Flow.OutcomeFact(plan)
    }

    def readFactory_FlowOutcomeFact_Payload(): Factory_Flow.OutcomeFact_Payload = {
      val r = readFactory_FlowOutcomeFact_PayloadT(F)
      return r
    }

    def readFactory_FlowOutcomeFact_PayloadT(typeParsed: B): Factory_Flow.OutcomeFact_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowOutcomeFact_Payload)
      }
      val value = readFactory_FlowOutcomeFact()
      return Factory_Flow.OutcomeFact_Payload(value)
    }

    def readFactory_FlowFlowIntentFact(): Factory_Flow.FlowIntentFact = {
      val r = readFactory_FlowFlowIntentFactT(F)
      return r
    }

    def readFactory_FlowFlowIntentFactT(typeParsed: B): Factory_Flow.FlowIntentFact = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowIntentFact)
      }
      val kind = readFactory_FlowIntentKindType()
      val competitor = readFactory_FlowCompetitorPresenceType()
      val assessment = readFactory_FlowAdmissionAssessmentType()
      val phase = readFactory_FlowLedgerPhaseType()
      val work_id = readFactory_FlowWorkIdType()
      val step = reader.readS32()
      return Factory_Flow.FlowIntentFact(kind, competitor, assessment, phase, work_id, step)
    }

    def readFactory_FlowFlowIntentFact_Payload(): Factory_Flow.FlowIntentFact_Payload = {
      val r = readFactory_FlowFlowIntentFact_PayloadT(F)
      return r
    }

    def readFactory_FlowFlowIntentFact_PayloadT(typeParsed: B): Factory_Flow.FlowIntentFact_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowIntentFact_Payload)
      }
      val value = readFactory_FlowFlowIntentFact()
      return Factory_Flow.FlowIntentFact_Payload(value)
    }

    def readFactory_FlowAuthorizationFact(): Factory_Flow.AuthorizationFact = {
      val r = readFactory_FlowAuthorizationFactT(F)
      return r
    }

    def readFactory_FlowAuthorizationFactT(typeParsed: B): Factory_Flow.AuthorizationFact = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowAuthorizationFact)
      }
      val decision = readFactory_FlowFlowDecisionType()
      val reason = readFactory_FlowDecisionReasonType()
      val work_id = readFactory_FlowWorkIdType()
      val step = reader.readS32()
      return Factory_Flow.AuthorizationFact(decision, reason, work_id, step)
    }

    def readFactory_FlowAuthorizationFact_Payload(): Factory_Flow.AuthorizationFact_Payload = {
      val r = readFactory_FlowAuthorizationFact_PayloadT(F)
      return r
    }

    def readFactory_FlowAuthorizationFact_PayloadT(typeParsed: B): Factory_Flow.AuthorizationFact_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowAuthorizationFact_Payload)
      }
      val value = readFactory_FlowAuthorizationFact()
      return Factory_Flow.AuthorizationFact_Payload(value)
    }

    def readFactory_FlowLineFlowCommand(): Factory_Flow.LineFlowCommand = {
      val r = readFactory_FlowLineFlowCommandT(F)
      return r
    }

    def readFactory_FlowLineFlowCommandT(typeParsed: B): Factory_Flow.LineFlowCommand = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowLineFlowCommand)
      }
      val action_kind = readFactory_FlowCommandActionType()
      val work_id = readFactory_FlowWorkIdType()
      val step = reader.readS32()
      return Factory_Flow.LineFlowCommand(action_kind, work_id, step)
    }

    def readFactory_FlowLineFlowCommand_Payload(): Factory_Flow.LineFlowCommand_Payload = {
      val r = readFactory_FlowLineFlowCommand_PayloadT(F)
      return r
    }

    def readFactory_FlowLineFlowCommand_PayloadT(typeParsed: B): Factory_Flow.LineFlowCommand_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowLineFlowCommand_Payload)
      }
      val value = readFactory_FlowLineFlowCommand()
      return Factory_Flow.LineFlowCommand_Payload(value)
    }

    def readFactory_FlowProductionOutcome(): Factory_Flow.ProductionOutcome = {
      val r = readFactory_FlowProductionOutcomeT(F)
      return r
    }

    def readFactory_FlowProductionOutcomeT(typeParsed: B): Factory_Flow.ProductionOutcome = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProductionOutcome)
      }
      val result = readFactory_FlowProductionResultType()
      val work_id = readFactory_FlowWorkIdType()
      return Factory_Flow.ProductionOutcome(result, work_id)
    }

    def readFactory_FlowProductionOutcome_Payload(): Factory_Flow.ProductionOutcome_Payload = {
      val r = readFactory_FlowProductionOutcome_PayloadT(F)
      return r
    }

    def readFactory_FlowProductionOutcome_PayloadT(typeParsed: B): Factory_Flow.ProductionOutcome_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProductionOutcome_Payload)
      }
      val value = readFactory_FlowProductionOutcome()
      return Factory_Flow.ProductionOutcome_Payload(value)
    }

    def readBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = readBase_TypesBoolean_PayloadT(F)
      return r
    }

    def readBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBoolean_Payload)
      }
      val value = reader.readB()
      return Base_Types.Boolean_Payload(value)
    }

    def readBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = readBase_TypesInteger_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_Payload)
      }
      val value = reader.readZ()
      return Base_Types.Integer_Payload(value)
    }

    def readBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = readBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_8_Payload)
      }
      val value = reader.readS8()
      return Base_Types.Integer_8_Payload(value)
    }

    def readBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = readBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_16_Payload)
      }
      val value = reader.readS16()
      return Base_Types.Integer_16_Payload(value)
    }

    def readBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = readBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_32_Payload)
      }
      val value = reader.readS32()
      return Base_Types.Integer_32_Payload(value)
    }

    def readBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = readBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_64_Payload)
      }
      val value = reader.readS64()
      return Base_Types.Integer_64_Payload(value)
    }

    def readBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = readBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_8_Payload)
      }
      val value = reader.readU8()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def readBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = readBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_16_Payload)
      }
      val value = reader.readU16()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def readBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = readBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_32_Payload)
      }
      val value = reader.readU32()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def readBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = readBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_64_Payload)
      }
      val value = reader.readU64()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def readBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = readBase_TypesFloat_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_Payload)
      }
      val value = reader.readR()
      return Base_Types.Float_Payload(value)
    }

    def readBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = readBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_32_Payload)
      }
      val value = reader.readF32()
      return Base_Types.Float_32_Payload(value)
    }

    def readBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = readBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_64_Payload)
      }
      val value = reader.readF64()
      return Base_Types.Float_64_Payload(value)
    }

    def readBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = readBase_TypesCharacter_PayloadT(F)
      return r
    }

    def readBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesCharacter_Payload)
      }
      val value = reader.readC()
      return Base_Types.Character_Payload(value)
    }

    def readBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = readBase_TypesString_PayloadT(F)
      return r
    }

    def readBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesString_Payload)
      }
      val value = reader.readString()
      return Base_Types.String_Payload(value)
    }

    def readBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = readBase_TypesBits_PayloadT(F)
      return r
    }

    def readBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBits_Payload)
      }
      val value = reader.readISZ(reader.readB _)
      return Base_Types.Bits_Payload(value)
    }

    def readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container(): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P => val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PT(T); return r
        case Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS => val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container.")
          val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P = {
      val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PT(F)
      return r
    }

    def readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PT(typeParsed: B): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P)
      }
      val api_presentedWork = readFactory_FlowPresentedWorkRequest()
      return Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(api_presentedWork)
    }

    def readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS = {
      val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PST(F)
      return r
    }

    def readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PST(typeParsed: B): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS)
      }
      val api_presentedWork = readFactory_FlowPresentedWorkRequest()
      return Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(api_presentedWork)
    }

    def readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container(): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P => val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PT(T); return r
        case Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS => val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container.")
          val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P = {
      val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PT(F)
      return r
    }

    def readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PT(typeParsed: B): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P)
      }
      val api_admissionToMaterial = readFactory_FlowAdmissionFact()
      val api_admissionToPriority = readFactory_FlowAdmissionFact()
      return Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(api_admissionToMaterial, api_admissionToPriority)
    }

    def readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS = {
      val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PST(F)
      return r
    }

    def readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PST(typeParsed: B): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS)
      }
      val api_admissionToMaterial = readFactory_FlowAdmissionFact()
      val api_admissionToPriority = readFactory_FlowAdmissionFact()
      return Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(api_admissionToMaterial, api_admissionToPriority)
    }

    def readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container(): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P => val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PT(T); return r
        case Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS => val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container.")
          val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P = {
      val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PT(F)
      return r
    }

    def readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PT(typeParsed: B): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P)
      }
      val api_admission = readFactory_FlowAdmissionFact()
      val api_materialObservation = readFactory_FlowMaterialHandoffObservation()
      return Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(api_admission, api_materialObservation)
    }

    def readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS = {
      val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PST(F)
      return r
    }

    def readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PST(typeParsed: B): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS)
      }
      val api_admission = readFactory_FlowAdmissionFact()
      val api_materialObservation = readFactory_FlowMaterialHandoffObservation()
      return Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(api_admission, api_materialObservation)
    }

    def readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container(): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P => val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PT(T); return r
        case Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS => val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container.")
          val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P = {
      val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PT(F)
      return r
    }

    def readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PT(typeParsed: B): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P)
      }
      val api_materialFact = readFactory_FlowMaterialFact()
      return Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(api_materialFact)
    }

    def readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS = {
      val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PST(F)
      return r
    }

    def readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PST(typeParsed: B): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS)
      }
      val api_materialFact = readFactory_FlowMaterialFact()
      return Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(api_materialFact)
    }

    def readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container(): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P => val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PT(T); return r
        case Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS => val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container.")
          val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P = {
      val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PT(F)
      return r
    }

    def readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PT(typeParsed: B): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P)
      }
      val api_flowContext = readFactory_FlowFlowContext()
      val api_readinessObservation = readFactory_FlowStepReadinessObservation()
      return Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(api_flowContext, api_readinessObservation)
    }

    def readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS = {
      val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PST(F)
      return r
    }

    def readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PST(typeParsed: B): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS)
      }
      val api_flowContext = readFactory_FlowFlowContext()
      val api_readinessObservation = readFactory_FlowStepReadinessObservation()
      return Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(api_flowContext, api_readinessObservation)
    }

    def readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container(): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P => val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PT(T); return r
        case Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS => val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container.")
          val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P = {
      val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PT(F)
      return r
    }

    def readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PT(typeParsed: B): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P)
      }
      val api_targetFact = readFactory_FlowTargetQualificationType()
      return Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(api_targetFact)
    }

    def readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS = {
      val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PST(F)
      return r
    }

    def readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PST(typeParsed: B): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS)
      }
      val api_targetFact = readFactory_FlowTargetQualificationType()
      return Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(api_targetFact)
    }

    def readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container(): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P => val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PT(T); return r
        case Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS => val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container.")
          val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P = {
      val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PT(F)
      return r
    }

    def readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PT(typeParsed: B): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P)
      }
      val api_flowContext = readFactory_FlowFlowContext()
      val api_processResult = readFactory_FlowProcessResultObservation()
      return Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(api_flowContext, api_processResult)
    }

    def readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS = {
      val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PST(F)
      return r
    }

    def readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PST(typeParsed: B): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS)
      }
      val api_flowContext = readFactory_FlowFlowContext()
      val api_processResult = readFactory_FlowProcessResultObservation()
      return Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(api_flowContext, api_processResult)
    }

    def readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container(): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P => val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PT(T); return r
        case Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS => val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container.")
          val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P = {
      val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PT(F)
      return r
    }

    def readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PT(typeParsed: B): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P)
      }
      val api_outcomeToAuthorization = readFactory_FlowOutcomeFact()
      val api_outcomeToDeterminer = readFactory_FlowOutcomeFact()
      return Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(api_outcomeToAuthorization, api_outcomeToDeterminer)
    }

    def readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS = {
      val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PST(F)
      return r
    }

    def readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PST(typeParsed: B): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS)
      }
      val api_outcomeToAuthorization = readFactory_FlowOutcomeFact()
      val api_outcomeToDeterminer = readFactory_FlowOutcomeFact()
      return Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(api_outcomeToAuthorization, api_outcomeToDeterminer)
    }

    def readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container(): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P => val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PT(T); return r
        case Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS => val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container.")
          val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P = {
      val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PT(F)
      return r
    }

    def readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PT(typeParsed: B): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P)
      }
      val api_admission = readFactory_FlowAdmissionFact()
      val api_protectionContext = readFactory_FlowProtectionContext()
      return Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(api_admission, api_protectionContext)
    }

    def readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS = {
      val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PST(F)
      return r
    }

    def readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PST(typeParsed: B): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS)
      }
      val api_admission = readFactory_FlowAdmissionFact()
      val api_protectionContext = readFactory_FlowProtectionContext()
      return Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(api_admission, api_protectionContext)
    }

    def readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container(): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P => val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PT(T); return r
        case Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS => val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container.")
          val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P = {
      val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PT(F)
      return r
    }

    def readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PT(typeParsed: B): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P)
      }
      val api_intentFact = readFactory_FlowFlowIntentFact()
      return Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(api_intentFact)
    }

    def readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS = {
      val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PST(F)
      return r
    }

    def readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PST(typeParsed: B): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS)
      }
      val api_intentFact = readFactory_FlowFlowIntentFact()
      return Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(api_intentFact)
    }

    def readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container(): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P => val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PT(T); return r
        case Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS => val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container.")
          val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P = {
      val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PT(F)
      return r
    }

    def readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PT(typeParsed: B): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P)
      }
      val api_intentFact = readFactory_FlowFlowIntentFact()
      val api_materialFact = readFactory_FlowMaterialFact()
      val api_outcomeFact = readFactory_FlowOutcomeFact()
      val api_targetFact = readFactory_FlowTargetQualificationType()
      return Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(api_intentFact, api_materialFact, api_outcomeFact, api_targetFact)
    }

    def readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS = {
      val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PST(F)
      return r
    }

    def readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PST(typeParsed: B): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS)
      }
      val api_intentFact = readFactory_FlowFlowIntentFact()
      val api_materialFact = readFactory_FlowMaterialFact()
      val api_outcomeFact = readFactory_FlowOutcomeFact()
      val api_targetFact = readFactory_FlowTargetQualificationType()
      return Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(api_intentFact, api_materialFact, api_outcomeFact, api_targetFact)
    }

    def readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container(): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P => val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PT(T); return r
        case Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS => val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container.")
          val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P = {
      val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PT(F)
      return r
    }

    def readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PT(typeParsed: B): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P)
      }
      val api_authorization = readFactory_FlowAuthorizationFact()
      val api_reasonToStatus = readFactory_FlowDecisionReasonType()
      return Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(api_authorization, api_reasonToStatus)
    }

    def readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS = {
      val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PST(F)
      return r
    }

    def readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PST(typeParsed: B): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS)
      }
      val api_authorization = readFactory_FlowAuthorizationFact()
      val api_reasonToStatus = readFactory_FlowDecisionReasonType()
      return Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(api_authorization, api_reasonToStatus)
    }

    def readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container(): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P => val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PT(T); return r
        case Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS => val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container.")
          val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P = {
      val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PT(F)
      return r
    }

    def readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PT(typeParsed: B): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P)
      }
      val api_authorization = readFactory_FlowAuthorizationFact()
      return Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P(api_authorization)
    }

    def readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS = {
      val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PST(F)
      return r
    }

    def readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PST(typeParsed: B): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS)
      }
      val api_authorization = readFactory_FlowAuthorizationFact()
      return Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(api_authorization)
    }

    def readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container(): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P => val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PT(T); return r
        case Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS => val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container.")
          val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P = {
      val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PT(F)
      return r
    }

    def readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PT(typeParsed: B): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P)
      }
      val api_contextToOutcome = readFactory_FlowFlowContext()
      val api_contextToReadiness = readFactory_FlowFlowContext()
      val api_lineCommand = readFactory_FlowLineFlowCommand()
      val api_protectionContext = readFactory_FlowProtectionContext()
      val api_snapshotToOutcome = readFactory_FlowFlowSnapshot()
      val api_snapshotToStatus = readFactory_FlowFlowSnapshot()
      return Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P(api_contextToOutcome, api_contextToReadiness, api_lineCommand, api_protectionContext, api_snapshotToOutcome, api_snapshotToStatus)
    }

    def readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS = {
      val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PST(F)
      return r
    }

    def readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PST(typeParsed: B): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS)
      }
      val api_contextToOutcome = readFactory_FlowFlowContext()
      val api_contextToReadiness = readFactory_FlowFlowContext()
      val api_lineCommand = readFactory_FlowLineFlowCommand()
      val api_protectionContext = readFactory_FlowProtectionContext()
      val api_snapshotToOutcome = readFactory_FlowFlowSnapshot()
      val api_snapshotToStatus = readFactory_FlowFlowSnapshot()
      return Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(api_contextToOutcome, api_contextToReadiness, api_lineCommand, api_protectionContext, api_snapshotToOutcome, api_snapshotToStatus)
    }

    def readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container(): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P => val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PT(T); return r
        case Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS => val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container.")
          val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P = {
      val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PT(F)
      return r
    }

    def readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PT(typeParsed: B): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P)
      }
      val api_appliedSnapshot = readFactory_FlowFlowSnapshot()
      val api_outcomeFact = readFactory_FlowOutcomeFact()
      return Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(api_appliedSnapshot, api_outcomeFact)
    }

    def readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS = {
      val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PST(F)
      return r
    }

    def readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PST(typeParsed: B): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS)
      }
      val api_appliedSnapshot = readFactory_FlowFlowSnapshot()
      val api_outcomeFact = readFactory_FlowOutcomeFact()
      return Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(api_appliedSnapshot, api_outcomeFact)
    }

    def readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container(): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P => val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PT(T); return r
        case Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS => val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container.")
          val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P = {
      val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PT(F)
      return r
    }

    def readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PT(typeParsed: B): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P)
      }
      val api_productionOutcome = readFactory_FlowProductionOutcome()
      return Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(api_productionOutcome)
    }

    def readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS = {
      val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PST(F)
      return r
    }

    def readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PST(typeParsed: B): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS)
      }
      val api_productionOutcome = readFactory_FlowProductionOutcome()
      return Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(api_productionOutcome)
    }

    def readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container(): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P => val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PT(T); return r
        case Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS => val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container.")
          val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P = {
      val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PT(F)
      return r
    }

    def readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PT(typeParsed: B): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P)
      }
      val api_appliedSnapshot = readFactory_FlowFlowSnapshot()
      val api_decisionReason = readFactory_FlowDecisionReasonType()
      return Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(api_appliedSnapshot, api_decisionReason)
    }

    def readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS = {
      val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PST(F)
      return r
    }

    def readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PST(typeParsed: B): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS)
      }
      val api_appliedSnapshot = readFactory_FlowFlowSnapshot()
      val api_decisionReason = readFactory_FlowDecisionReasonType()
      return Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(api_appliedSnapshot, api_decisionReason)
    }

    def readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container(): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P => val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PT(T); return r
        case Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS => val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container.")
          val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PST(T)
          return r
      }
    }

    def readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P = {
      val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PT(F)
      return r
    }

    def readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PT(typeParsed: B): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P)
      }
      val api_flowStatus = readFactory_FlowProductionFlowStatusType()
      return Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(api_flowStatus)
    }

    def readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS = {
      val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PST(F)
      return r
    }

    def readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PST(typeParsed: B): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS)
      }
      val api_flowStatus = readFactory_FlowProductionFlowStatusType()
      return Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(api_flowStatus)
    }

    def readruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = reader.readZ()
      return runtimemonitor.ObservationKind.byOrdinal(r).get
    }

    def readutilContainer(): util.Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P => val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PT(T); return r
        case Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS => val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PST(T); return r
        case Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P => val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PT(T); return r
        case Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS => val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PST(T); return r
        case Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P => val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PT(T); return r
        case Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P => val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PT(T); return r
        case Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS => val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PST(T); return r
        case Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS => val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PST(T); return r
        case Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P => val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PT(T); return r
        case Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P => val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PT(T); return r
        case Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS => val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PST(T); return r
        case Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS => val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PST(T); return r
        case Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P => val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PT(T); return r
        case Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS => val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PST(T); return r
        case Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P => val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PT(T); return r
        case Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS => val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PST(T); return r
        case Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P => val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PT(T); return r
        case Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS => val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PST(T); return r
        case Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P => val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PT(T); return r
        case Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS => val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PST(T); return r
        case Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P => val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PT(T); return r
        case Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS => val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PST(T); return r
        case Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P => val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PT(T); return r
        case Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS => val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PST(T); return r
        case Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P => val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PT(T); return r
        case Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P => val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PT(T); return r
        case Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS => val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PST(T); return r
        case Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS => val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PST(T); return r
        case Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P => val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PT(T); return r
        case Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P => val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PT(T); return r
        case Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS => val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PST(T); return r
        case Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS => val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PST(T); return r
        case Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P => val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PT(T); return r
        case Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS => val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PST(T); return r
        case Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P => val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PT(T); return r
        case Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS => val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PST(T)
          return r
      }
    }

    def readutilEmptyContainer(): util.EmptyContainer = {
      val r = readutilEmptyContainerT(F)
      return r
    }

    def readutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        reader.expectZ(Constants.utilEmptyContainer)
      }
      return util.EmptyContainer()
    }

    def read_artDataContent(): art.DataContent = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants._artEmpty => val r = read_artEmptyT(T); return r
        case Constants.Base_TypesBoolean_Payload => val r = readBase_TypesBoolean_PayloadT(T); return r
        case Constants.Base_TypesInteger_Payload => val r = readBase_TypesInteger_PayloadT(T); return r
        case Constants.Base_TypesInteger_8_Payload => val r = readBase_TypesInteger_8_PayloadT(T); return r
        case Constants.Base_TypesInteger_16_Payload => val r = readBase_TypesInteger_16_PayloadT(T); return r
        case Constants.Base_TypesInteger_32_Payload => val r = readBase_TypesInteger_32_PayloadT(T); return r
        case Constants.Base_TypesInteger_64_Payload => val r = readBase_TypesInteger_64_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_8_Payload => val r = readBase_TypesUnsigned_8_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_16_Payload => val r = readBase_TypesUnsigned_16_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_32_Payload => val r = readBase_TypesUnsigned_32_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_64_Payload => val r = readBase_TypesUnsigned_64_PayloadT(T); return r
        case Constants.Base_TypesFloat_Payload => val r = readBase_TypesFloat_PayloadT(T); return r
        case Constants.Base_TypesFloat_32_Payload => val r = readBase_TypesFloat_32_PayloadT(T); return r
        case Constants.Base_TypesFloat_64_Payload => val r = readBase_TypesFloat_64_PayloadT(T); return r
        case Constants.Base_TypesCharacter_Payload => val r = readBase_TypesCharacter_PayloadT(T); return r
        case Constants.Base_TypesString_Payload => val r = readBase_TypesString_PayloadT(T); return r
        case Constants.Base_TypesBits_Payload => val r = readBase_TypesBits_PayloadT(T); return r
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.Factory_FlowWorkId_Payload => val r = readFactory_FlowWorkId_PayloadT(T); return r
        case Constants.Factory_FlowValidity_Payload => val r = readFactory_FlowValidity_PayloadT(T); return r
        case Constants.Factory_FlowIntentKind_Payload => val r = readFactory_FlowIntentKind_PayloadT(T); return r
        case Constants.Factory_FlowAttemptKind_Payload => val r = readFactory_FlowAttemptKind_PayloadT(T); return r
        case Constants.Factory_FlowProductKind_Payload => val r = readFactory_FlowProductKind_PayloadT(T); return r
        case Constants.Factory_FlowLedgerPhase_Payload => val r = readFactory_FlowLedgerPhase_PayloadT(T); return r
        case Constants.Factory_FlowOutcomeFact_Payload => val r = readFactory_FlowOutcomeFact_PayloadT(T); return r
        case Constants.Factory_FlowFlowContext_Payload => val r = readFactory_FlowFlowContext_PayloadT(T); return r
        case Constants.Factory_FlowProcessEvent_Payload => val r = readFactory_FlowProcessEvent_PayloadT(T); return r
        case Constants.Factory_FlowMaterialFact_Payload => val r = readFactory_FlowMaterialFact_PayloadT(T); return r
        case Constants.Factory_FlowFlowDecision_Payload => val r = readFactory_FlowFlowDecision_PayloadT(T); return r
        case Constants.Factory_FlowFlowSnapshot_Payload => val r = readFactory_FlowFlowSnapshot_PayloadT(T); return r
        case Constants.Factory_FlowCommandAction_Payload => val r = readFactory_FlowCommandAction_PayloadT(T); return r
        case Constants.Factory_FlowAdmissionFact_Payload => val r = readFactory_FlowAdmissionFact_PayloadT(T); return r
        case Constants.Factory_FlowDecisionReason_Payload => val r = readFactory_FlowDecisionReason_PayloadT(T); return r
        case Constants.Factory_FlowFlowIntentFact_Payload => val r = readFactory_FlowFlowIntentFact_PayloadT(T); return r
        case Constants.Factory_FlowRequestPresence_Payload => val r = readFactory_FlowRequestPresence_PayloadT(T); return r
        case Constants.Factory_FlowStepDisposition_Payload => val r = readFactory_FlowStepDisposition_PayloadT(T); return r
        case Constants.Factory_FlowLineFlowCommand_Payload => val r = readFactory_FlowLineFlowCommand_PayloadT(T); return r
        case Constants.Factory_FlowProductionResult_Payload => val r = readFactory_FlowProductionResult_PayloadT(T); return r
        case Constants.Factory_FlowProductionOutcome_Payload => val r = readFactory_FlowProductionOutcome_PayloadT(T); return r
        case Constants.Factory_FlowProtectionContext_Payload => val r = readFactory_FlowProtectionContext_PayloadT(T); return r
        case Constants.Factory_FlowAuthorizationFact_Payload => val r = readFactory_FlowAuthorizationFact_PayloadT(T); return r
        case Constants.Factory_FlowCompetitorPresence_Payload => val r = readFactory_FlowCompetitorPresence_PayloadT(T); return r
        case Constants.Factory_FlowMaterialAssessment_Payload => val r = readFactory_FlowMaterialAssessment_PayloadT(T); return r
        case Constants.Factory_FlowMaterialDisposition_Payload => val r = readFactory_FlowMaterialDisposition_PayloadT(T); return r
        case Constants.Factory_FlowAdmissionAssessment_Payload => val r = readFactory_FlowAdmissionAssessment_PayloadT(T); return r
        case Constants.Factory_FlowTargetQualification_Payload => val r = readFactory_FlowTargetQualification_PayloadT(T); return r
        case Constants.Factory_FlowProductionFlowStatus_Payload => val r = readFactory_FlowProductionFlowStatus_PayloadT(T); return r
        case Constants.Factory_FlowPresentedWorkRequest_Payload => val r = readFactory_FlowPresentedWorkRequest_PayloadT(T); return r
        case Constants.Factory_FlowCorrelatedOutcomePlan_Payload => val r = readFactory_FlowCorrelatedOutcomePlan_PayloadT(T); return r
        case Constants.Factory_FlowStepReadinessObservation_Payload => val r = readFactory_FlowStepReadinessObservation_PayloadT(T); return r
        case Constants.Factory_FlowProcessResultObservation_Payload => val r = readFactory_FlowProcessResultObservation_PayloadT(T); return r
        case Constants.Factory_FlowMaterialHandoffObservation_Payload => val r = readFactory_FlowMaterialHandoffObservation_PayloadT(T); return r
        case Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P => val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PT(T); return r
        case Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS => val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PST(T); return r
        case Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P => val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PT(T); return r
        case Constants.Factory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS => val r = readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PST(T); return r
        case Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P => val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PT(T); return r
        case Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P => val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PT(T); return r
        case Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS => val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PST(T); return r
        case Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS => val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PST(T); return r
        case Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P => val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PT(T); return r
        case Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P => val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PT(T); return r
        case Constants.Factory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS => val r = readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PST(T); return r
        case Constants.Factory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS => val r = readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PST(T); return r
        case Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P => val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PT(T); return r
        case Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS => val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PST(T); return r
        case Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P => val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PT(T); return r
        case Constants.Factory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS => val r = readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PST(T); return r
        case Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P => val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PT(T); return r
        case Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS => val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PST(T); return r
        case Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P => val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PT(T); return r
        case Constants.Factory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS => val r = readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PST(T); return r
        case Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P => val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PT(T); return r
        case Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS => val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PST(T); return r
        case Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P => val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PT(T); return r
        case Constants.Factory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS => val r = readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PST(T); return r
        case Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P => val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PT(T); return r
        case Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P => val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PT(T); return r
        case Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS => val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PST(T); return r
        case Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS => val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PST(T); return r
        case Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P => val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PT(T); return r
        case Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P => val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PT(T); return r
        case Constants.Factory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS => val r = readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PST(T); return r
        case Constants.Factory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS => val r = readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PST(T); return r
        case Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P => val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PT(T); return r
        case Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS => val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PST(T); return r
        case Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P => val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PT(T); return r
        case Constants.Factory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS => val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PST(T)
          return r
      }
    }

    def read_artEmpty(): art.Empty = {
      val r = read_artEmptyT(F)
      return r
    }

    def read_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        reader.expectZ(Constants._artEmpty)
      }
      return art.Empty()
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): Either[T, MessagePack.ErrorMsg] = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    rd.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromFactory_FlowRequestPresence_Payload(o: Factory_Flow.RequestPresence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowRequestPresence_Payload(o)
    return w.result
  }

  def toFactory_FlowRequestPresence_Payload(data: ISZ[U8]): Either[Factory_Flow.RequestPresence_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowRequestPresence_Payload(reader: Reader): Factory_Flow.RequestPresence_Payload = {
      val r = reader.readFactory_FlowRequestPresence_Payload()
      return r
    }
    val r = to(data, fFactory_FlowRequestPresence_Payload _)
    return r
  }

  def fromFactory_FlowValidity_Payload(o: Factory_Flow.Validity_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowValidity_Payload(o)
    return w.result
  }

  def toFactory_FlowValidity_Payload(data: ISZ[U8]): Either[Factory_Flow.Validity_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowValidity_Payload(reader: Reader): Factory_Flow.Validity_Payload = {
      val r = reader.readFactory_FlowValidity_Payload()
      return r
    }
    val r = to(data, fFactory_FlowValidity_Payload _)
    return r
  }

  def fromFactory_FlowWorkId_Payload(o: Factory_Flow.WorkId_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowWorkId_Payload(o)
    return w.result
  }

  def toFactory_FlowWorkId_Payload(data: ISZ[U8]): Either[Factory_Flow.WorkId_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowWorkId_Payload(reader: Reader): Factory_Flow.WorkId_Payload = {
      val r = reader.readFactory_FlowWorkId_Payload()
      return r
    }
    val r = to(data, fFactory_FlowWorkId_Payload _)
    return r
  }

  def fromFactory_FlowProductKind_Payload(o: Factory_Flow.ProductKind_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProductKind_Payload(o)
    return w.result
  }

  def toFactory_FlowProductKind_Payload(data: ISZ[U8]): Either[Factory_Flow.ProductKind_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowProductKind_Payload(reader: Reader): Factory_Flow.ProductKind_Payload = {
      val r = reader.readFactory_FlowProductKind_Payload()
      return r
    }
    val r = to(data, fFactory_FlowProductKind_Payload _)
    return r
  }

  def fromFactory_FlowAdmissionAssessment_Payload(o: Factory_Flow.AdmissionAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowAdmissionAssessment_Payload(o)
    return w.result
  }

  def toFactory_FlowAdmissionAssessment_Payload(data: ISZ[U8]): Either[Factory_Flow.AdmissionAssessment_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowAdmissionAssessment_Payload(reader: Reader): Factory_Flow.AdmissionAssessment_Payload = {
      val r = reader.readFactory_FlowAdmissionAssessment_Payload()
      return r
    }
    val r = to(data, fFactory_FlowAdmissionAssessment_Payload _)
    return r
  }

  def fromFactory_FlowMaterialDisposition_Payload(o: Factory_Flow.MaterialDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowMaterialDisposition_Payload(o)
    return w.result
  }

  def toFactory_FlowMaterialDisposition_Payload(data: ISZ[U8]): Either[Factory_Flow.MaterialDisposition_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowMaterialDisposition_Payload(reader: Reader): Factory_Flow.MaterialDisposition_Payload = {
      val r = reader.readFactory_FlowMaterialDisposition_Payload()
      return r
    }
    val r = to(data, fFactory_FlowMaterialDisposition_Payload _)
    return r
  }

  def fromFactory_FlowMaterialAssessment_Payload(o: Factory_Flow.MaterialAssessment_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowMaterialAssessment_Payload(o)
    return w.result
  }

  def toFactory_FlowMaterialAssessment_Payload(data: ISZ[U8]): Either[Factory_Flow.MaterialAssessment_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowMaterialAssessment_Payload(reader: Reader): Factory_Flow.MaterialAssessment_Payload = {
      val r = reader.readFactory_FlowMaterialAssessment_Payload()
      return r
    }
    val r = to(data, fFactory_FlowMaterialAssessment_Payload _)
    return r
  }

  def fromFactory_FlowStepDisposition_Payload(o: Factory_Flow.StepDisposition_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowStepDisposition_Payload(o)
    return w.result
  }

  def toFactory_FlowStepDisposition_Payload(data: ISZ[U8]): Either[Factory_Flow.StepDisposition_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowStepDisposition_Payload(reader: Reader): Factory_Flow.StepDisposition_Payload = {
      val r = reader.readFactory_FlowStepDisposition_Payload()
      return r
    }
    val r = to(data, fFactory_FlowStepDisposition_Payload _)
    return r
  }

  def fromFactory_FlowLedgerPhase_Payload(o: Factory_Flow.LedgerPhase_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowLedgerPhase_Payload(o)
    return w.result
  }

  def toFactory_FlowLedgerPhase_Payload(data: ISZ[U8]): Either[Factory_Flow.LedgerPhase_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowLedgerPhase_Payload(reader: Reader): Factory_Flow.LedgerPhase_Payload = {
      val r = reader.readFactory_FlowLedgerPhase_Payload()
      return r
    }
    val r = to(data, fFactory_FlowLedgerPhase_Payload _)
    return r
  }

  def fromFactory_FlowAttemptKind_Payload(o: Factory_Flow.AttemptKind_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowAttemptKind_Payload(o)
    return w.result
  }

  def toFactory_FlowAttemptKind_Payload(data: ISZ[U8]): Either[Factory_Flow.AttemptKind_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowAttemptKind_Payload(reader: Reader): Factory_Flow.AttemptKind_Payload = {
      val r = reader.readFactory_FlowAttemptKind_Payload()
      return r
    }
    val r = to(data, fFactory_FlowAttemptKind_Payload _)
    return r
  }

  def fromFactory_FlowTargetQualification_Payload(o: Factory_Flow.TargetQualification_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowTargetQualification_Payload(o)
    return w.result
  }

  def toFactory_FlowTargetQualification_Payload(data: ISZ[U8]): Either[Factory_Flow.TargetQualification_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowTargetQualification_Payload(reader: Reader): Factory_Flow.TargetQualification_Payload = {
      val r = reader.readFactory_FlowTargetQualification_Payload()
      return r
    }
    val r = to(data, fFactory_FlowTargetQualification_Payload _)
    return r
  }

  def fromFactory_FlowProcessEvent_Payload(o: Factory_Flow.ProcessEvent_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProcessEvent_Payload(o)
    return w.result
  }

  def toFactory_FlowProcessEvent_Payload(data: ISZ[U8]): Either[Factory_Flow.ProcessEvent_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowProcessEvent_Payload(reader: Reader): Factory_Flow.ProcessEvent_Payload = {
      val r = reader.readFactory_FlowProcessEvent_Payload()
      return r
    }
    val r = to(data, fFactory_FlowProcessEvent_Payload _)
    return r
  }

  def fromFactory_FlowCorrelatedOutcomePlan_Payload(o: Factory_Flow.CorrelatedOutcomePlan_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowCorrelatedOutcomePlan_Payload(o)
    return w.result
  }

  def toFactory_FlowCorrelatedOutcomePlan_Payload(data: ISZ[U8]): Either[Factory_Flow.CorrelatedOutcomePlan_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowCorrelatedOutcomePlan_Payload(reader: Reader): Factory_Flow.CorrelatedOutcomePlan_Payload = {
      val r = reader.readFactory_FlowCorrelatedOutcomePlan_Payload()
      return r
    }
    val r = to(data, fFactory_FlowCorrelatedOutcomePlan_Payload _)
    return r
  }

  def fromFactory_FlowIntentKind_Payload(o: Factory_Flow.IntentKind_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowIntentKind_Payload(o)
    return w.result
  }

  def toFactory_FlowIntentKind_Payload(data: ISZ[U8]): Either[Factory_Flow.IntentKind_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowIntentKind_Payload(reader: Reader): Factory_Flow.IntentKind_Payload = {
      val r = reader.readFactory_FlowIntentKind_Payload()
      return r
    }
    val r = to(data, fFactory_FlowIntentKind_Payload _)
    return r
  }

  def fromFactory_FlowCompetitorPresence_Payload(o: Factory_Flow.CompetitorPresence_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowCompetitorPresence_Payload(o)
    return w.result
  }

  def toFactory_FlowCompetitorPresence_Payload(data: ISZ[U8]): Either[Factory_Flow.CompetitorPresence_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowCompetitorPresence_Payload(reader: Reader): Factory_Flow.CompetitorPresence_Payload = {
      val r = reader.readFactory_FlowCompetitorPresence_Payload()
      return r
    }
    val r = to(data, fFactory_FlowCompetitorPresence_Payload _)
    return r
  }

  def fromFactory_FlowFlowDecision_Payload(o: Factory_Flow.FlowDecision_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowDecision_Payload(o)
    return w.result
  }

  def toFactory_FlowFlowDecision_Payload(data: ISZ[U8]): Either[Factory_Flow.FlowDecision_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowDecision_Payload(reader: Reader): Factory_Flow.FlowDecision_Payload = {
      val r = reader.readFactory_FlowFlowDecision_Payload()
      return r
    }
    val r = to(data, fFactory_FlowFlowDecision_Payload _)
    return r
  }

  def fromFactory_FlowDecisionReason_Payload(o: Factory_Flow.DecisionReason_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowDecisionReason_Payload(o)
    return w.result
  }

  def toFactory_FlowDecisionReason_Payload(data: ISZ[U8]): Either[Factory_Flow.DecisionReason_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowDecisionReason_Payload(reader: Reader): Factory_Flow.DecisionReason_Payload = {
      val r = reader.readFactory_FlowDecisionReason_Payload()
      return r
    }
    val r = to(data, fFactory_FlowDecisionReason_Payload _)
    return r
  }

  def fromFactory_FlowCommandAction_Payload(o: Factory_Flow.CommandAction_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowCommandAction_Payload(o)
    return w.result
  }

  def toFactory_FlowCommandAction_Payload(data: ISZ[U8]): Either[Factory_Flow.CommandAction_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowCommandAction_Payload(reader: Reader): Factory_Flow.CommandAction_Payload = {
      val r = reader.readFactory_FlowCommandAction_Payload()
      return r
    }
    val r = to(data, fFactory_FlowCommandAction_Payload _)
    return r
  }

  def fromFactory_FlowProductionResult_Payload(o: Factory_Flow.ProductionResult_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProductionResult_Payload(o)
    return w.result
  }

  def toFactory_FlowProductionResult_Payload(data: ISZ[U8]): Either[Factory_Flow.ProductionResult_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowProductionResult_Payload(reader: Reader): Factory_Flow.ProductionResult_Payload = {
      val r = reader.readFactory_FlowProductionResult_Payload()
      return r
    }
    val r = to(data, fFactory_FlowProductionResult_Payload _)
    return r
  }

  def fromFactory_FlowProductionFlowStatus_Payload(o: Factory_Flow.ProductionFlowStatus_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProductionFlowStatus_Payload(o)
    return w.result
  }

  def toFactory_FlowProductionFlowStatus_Payload(data: ISZ[U8]): Either[Factory_Flow.ProductionFlowStatus_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowProductionFlowStatus_Payload(reader: Reader): Factory_Flow.ProductionFlowStatus_Payload = {
      val r = reader.readFactory_FlowProductionFlowStatus_Payload()
      return r
    }
    val r = to(data, fFactory_FlowProductionFlowStatus_Payload _)
    return r
  }

  def fromFactory_FlowPresentedWorkRequest(o: Factory_Flow.PresentedWorkRequest, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowPresentedWorkRequest(o)
    return w.result
  }

  def toFactory_FlowPresentedWorkRequest(data: ISZ[U8]): Either[Factory_Flow.PresentedWorkRequest, MessagePack.ErrorMsg] = {
    def fFactory_FlowPresentedWorkRequest(reader: Reader): Factory_Flow.PresentedWorkRequest = {
      val r = reader.readFactory_FlowPresentedWorkRequest()
      return r
    }
    val r = to(data, fFactory_FlowPresentedWorkRequest _)
    return r
  }

  def fromFactory_FlowPresentedWorkRequest_Payload(o: Factory_Flow.PresentedWorkRequest_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowPresentedWorkRequest_Payload(o)
    return w.result
  }

  def toFactory_FlowPresentedWorkRequest_Payload(data: ISZ[U8]): Either[Factory_Flow.PresentedWorkRequest_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowPresentedWorkRequest_Payload(reader: Reader): Factory_Flow.PresentedWorkRequest_Payload = {
      val r = reader.readFactory_FlowPresentedWorkRequest_Payload()
      return r
    }
    val r = to(data, fFactory_FlowPresentedWorkRequest_Payload _)
    return r
  }

  def fromFactory_FlowAdmissionFact(o: Factory_Flow.AdmissionFact, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowAdmissionFact(o)
    return w.result
  }

  def toFactory_FlowAdmissionFact(data: ISZ[U8]): Either[Factory_Flow.AdmissionFact, MessagePack.ErrorMsg] = {
    def fFactory_FlowAdmissionFact(reader: Reader): Factory_Flow.AdmissionFact = {
      val r = reader.readFactory_FlowAdmissionFact()
      return r
    }
    val r = to(data, fFactory_FlowAdmissionFact _)
    return r
  }

  def fromFactory_FlowAdmissionFact_Payload(o: Factory_Flow.AdmissionFact_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowAdmissionFact_Payload(o)
    return w.result
  }

  def toFactory_FlowAdmissionFact_Payload(data: ISZ[U8]): Either[Factory_Flow.AdmissionFact_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowAdmissionFact_Payload(reader: Reader): Factory_Flow.AdmissionFact_Payload = {
      val r = reader.readFactory_FlowAdmissionFact_Payload()
      return r
    }
    val r = to(data, fFactory_FlowAdmissionFact_Payload _)
    return r
  }

  def fromFactory_FlowMaterialHandoffObservation(o: Factory_Flow.MaterialHandoffObservation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowMaterialHandoffObservation(o)
    return w.result
  }

  def toFactory_FlowMaterialHandoffObservation(data: ISZ[U8]): Either[Factory_Flow.MaterialHandoffObservation, MessagePack.ErrorMsg] = {
    def fFactory_FlowMaterialHandoffObservation(reader: Reader): Factory_Flow.MaterialHandoffObservation = {
      val r = reader.readFactory_FlowMaterialHandoffObservation()
      return r
    }
    val r = to(data, fFactory_FlowMaterialHandoffObservation _)
    return r
  }

  def fromFactory_FlowMaterialHandoffObservation_Payload(o: Factory_Flow.MaterialHandoffObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowMaterialHandoffObservation_Payload(o)
    return w.result
  }

  def toFactory_FlowMaterialHandoffObservation_Payload(data: ISZ[U8]): Either[Factory_Flow.MaterialHandoffObservation_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowMaterialHandoffObservation_Payload(reader: Reader): Factory_Flow.MaterialHandoffObservation_Payload = {
      val r = reader.readFactory_FlowMaterialHandoffObservation_Payload()
      return r
    }
    val r = to(data, fFactory_FlowMaterialHandoffObservation_Payload _)
    return r
  }

  def fromFactory_FlowMaterialFact(o: Factory_Flow.MaterialFact, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowMaterialFact(o)
    return w.result
  }

  def toFactory_FlowMaterialFact(data: ISZ[U8]): Either[Factory_Flow.MaterialFact, MessagePack.ErrorMsg] = {
    def fFactory_FlowMaterialFact(reader: Reader): Factory_Flow.MaterialFact = {
      val r = reader.readFactory_FlowMaterialFact()
      return r
    }
    val r = to(data, fFactory_FlowMaterialFact _)
    return r
  }

  def fromFactory_FlowMaterialFact_Payload(o: Factory_Flow.MaterialFact_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowMaterialFact_Payload(o)
    return w.result
  }

  def toFactory_FlowMaterialFact_Payload(data: ISZ[U8]): Either[Factory_Flow.MaterialFact_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowMaterialFact_Payload(reader: Reader): Factory_Flow.MaterialFact_Payload = {
      val r = reader.readFactory_FlowMaterialFact_Payload()
      return r
    }
    val r = to(data, fFactory_FlowMaterialFact_Payload _)
    return r
  }

  def fromFactory_FlowStepReadinessObservation(o: Factory_Flow.StepReadinessObservation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowStepReadinessObservation(o)
    return w.result
  }

  def toFactory_FlowStepReadinessObservation(data: ISZ[U8]): Either[Factory_Flow.StepReadinessObservation, MessagePack.ErrorMsg] = {
    def fFactory_FlowStepReadinessObservation(reader: Reader): Factory_Flow.StepReadinessObservation = {
      val r = reader.readFactory_FlowStepReadinessObservation()
      return r
    }
    val r = to(data, fFactory_FlowStepReadinessObservation _)
    return r
  }

  def fromFactory_FlowStepReadinessObservation_Payload(o: Factory_Flow.StepReadinessObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowStepReadinessObservation_Payload(o)
    return w.result
  }

  def toFactory_FlowStepReadinessObservation_Payload(data: ISZ[U8]): Either[Factory_Flow.StepReadinessObservation_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowStepReadinessObservation_Payload(reader: Reader): Factory_Flow.StepReadinessObservation_Payload = {
      val r = reader.readFactory_FlowStepReadinessObservation_Payload()
      return r
    }
    val r = to(data, fFactory_FlowStepReadinessObservation_Payload _)
    return r
  }

  def fromFactory_FlowFlowContext(o: Factory_Flow.FlowContext, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowContext(o)
    return w.result
  }

  def toFactory_FlowFlowContext(data: ISZ[U8]): Either[Factory_Flow.FlowContext, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowContext(reader: Reader): Factory_Flow.FlowContext = {
      val r = reader.readFactory_FlowFlowContext()
      return r
    }
    val r = to(data, fFactory_FlowFlowContext _)
    return r
  }

  def fromFactory_FlowFlowContext_Payload(o: Factory_Flow.FlowContext_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowContext_Payload(o)
    return w.result
  }

  def toFactory_FlowFlowContext_Payload(data: ISZ[U8]): Either[Factory_Flow.FlowContext_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowContext_Payload(reader: Reader): Factory_Flow.FlowContext_Payload = {
      val r = reader.readFactory_FlowFlowContext_Payload()
      return r
    }
    val r = to(data, fFactory_FlowFlowContext_Payload _)
    return r
  }

  def fromFactory_FlowProtectionContext(o: Factory_Flow.ProtectionContext, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProtectionContext(o)
    return w.result
  }

  def toFactory_FlowProtectionContext(data: ISZ[U8]): Either[Factory_Flow.ProtectionContext, MessagePack.ErrorMsg] = {
    def fFactory_FlowProtectionContext(reader: Reader): Factory_Flow.ProtectionContext = {
      val r = reader.readFactory_FlowProtectionContext()
      return r
    }
    val r = to(data, fFactory_FlowProtectionContext _)
    return r
  }

  def fromFactory_FlowProtectionContext_Payload(o: Factory_Flow.ProtectionContext_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProtectionContext_Payload(o)
    return w.result
  }

  def toFactory_FlowProtectionContext_Payload(data: ISZ[U8]): Either[Factory_Flow.ProtectionContext_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowProtectionContext_Payload(reader: Reader): Factory_Flow.ProtectionContext_Payload = {
      val r = reader.readFactory_FlowProtectionContext_Payload()
      return r
    }
    val r = to(data, fFactory_FlowProtectionContext_Payload _)
    return r
  }

  def fromFactory_FlowFlowSnapshot(o: Factory_Flow.FlowSnapshot, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowSnapshot(o)
    return w.result
  }

  def toFactory_FlowFlowSnapshot(data: ISZ[U8]): Either[Factory_Flow.FlowSnapshot, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowSnapshot(reader: Reader): Factory_Flow.FlowSnapshot = {
      val r = reader.readFactory_FlowFlowSnapshot()
      return r
    }
    val r = to(data, fFactory_FlowFlowSnapshot _)
    return r
  }

  def fromFactory_FlowFlowSnapshot_Payload(o: Factory_Flow.FlowSnapshot_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowSnapshot_Payload(o)
    return w.result
  }

  def toFactory_FlowFlowSnapshot_Payload(data: ISZ[U8]): Either[Factory_Flow.FlowSnapshot_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowSnapshot_Payload(reader: Reader): Factory_Flow.FlowSnapshot_Payload = {
      val r = reader.readFactory_FlowFlowSnapshot_Payload()
      return r
    }
    val r = to(data, fFactory_FlowFlowSnapshot_Payload _)
    return r
  }

  def fromFactory_FlowProcessResultObservation(o: Factory_Flow.ProcessResultObservation, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProcessResultObservation(o)
    return w.result
  }

  def toFactory_FlowProcessResultObservation(data: ISZ[U8]): Either[Factory_Flow.ProcessResultObservation, MessagePack.ErrorMsg] = {
    def fFactory_FlowProcessResultObservation(reader: Reader): Factory_Flow.ProcessResultObservation = {
      val r = reader.readFactory_FlowProcessResultObservation()
      return r
    }
    val r = to(data, fFactory_FlowProcessResultObservation _)
    return r
  }

  def fromFactory_FlowProcessResultObservation_Payload(o: Factory_Flow.ProcessResultObservation_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProcessResultObservation_Payload(o)
    return w.result
  }

  def toFactory_FlowProcessResultObservation_Payload(data: ISZ[U8]): Either[Factory_Flow.ProcessResultObservation_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowProcessResultObservation_Payload(reader: Reader): Factory_Flow.ProcessResultObservation_Payload = {
      val r = reader.readFactory_FlowProcessResultObservation_Payload()
      return r
    }
    val r = to(data, fFactory_FlowProcessResultObservation_Payload _)
    return r
  }

  def fromFactory_FlowOutcomeFact(o: Factory_Flow.OutcomeFact, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowOutcomeFact(o)
    return w.result
  }

  def toFactory_FlowOutcomeFact(data: ISZ[U8]): Either[Factory_Flow.OutcomeFact, MessagePack.ErrorMsg] = {
    def fFactory_FlowOutcomeFact(reader: Reader): Factory_Flow.OutcomeFact = {
      val r = reader.readFactory_FlowOutcomeFact()
      return r
    }
    val r = to(data, fFactory_FlowOutcomeFact _)
    return r
  }

  def fromFactory_FlowOutcomeFact_Payload(o: Factory_Flow.OutcomeFact_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowOutcomeFact_Payload(o)
    return w.result
  }

  def toFactory_FlowOutcomeFact_Payload(data: ISZ[U8]): Either[Factory_Flow.OutcomeFact_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowOutcomeFact_Payload(reader: Reader): Factory_Flow.OutcomeFact_Payload = {
      val r = reader.readFactory_FlowOutcomeFact_Payload()
      return r
    }
    val r = to(data, fFactory_FlowOutcomeFact_Payload _)
    return r
  }

  def fromFactory_FlowFlowIntentFact(o: Factory_Flow.FlowIntentFact, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowIntentFact(o)
    return w.result
  }

  def toFactory_FlowFlowIntentFact(data: ISZ[U8]): Either[Factory_Flow.FlowIntentFact, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowIntentFact(reader: Reader): Factory_Flow.FlowIntentFact = {
      val r = reader.readFactory_FlowFlowIntentFact()
      return r
    }
    val r = to(data, fFactory_FlowFlowIntentFact _)
    return r
  }

  def fromFactory_FlowFlowIntentFact_Payload(o: Factory_Flow.FlowIntentFact_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowIntentFact_Payload(o)
    return w.result
  }

  def toFactory_FlowFlowIntentFact_Payload(data: ISZ[U8]): Either[Factory_Flow.FlowIntentFact_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowIntentFact_Payload(reader: Reader): Factory_Flow.FlowIntentFact_Payload = {
      val r = reader.readFactory_FlowFlowIntentFact_Payload()
      return r
    }
    val r = to(data, fFactory_FlowFlowIntentFact_Payload _)
    return r
  }

  def fromFactory_FlowAuthorizationFact(o: Factory_Flow.AuthorizationFact, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowAuthorizationFact(o)
    return w.result
  }

  def toFactory_FlowAuthorizationFact(data: ISZ[U8]): Either[Factory_Flow.AuthorizationFact, MessagePack.ErrorMsg] = {
    def fFactory_FlowAuthorizationFact(reader: Reader): Factory_Flow.AuthorizationFact = {
      val r = reader.readFactory_FlowAuthorizationFact()
      return r
    }
    val r = to(data, fFactory_FlowAuthorizationFact _)
    return r
  }

  def fromFactory_FlowAuthorizationFact_Payload(o: Factory_Flow.AuthorizationFact_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowAuthorizationFact_Payload(o)
    return w.result
  }

  def toFactory_FlowAuthorizationFact_Payload(data: ISZ[U8]): Either[Factory_Flow.AuthorizationFact_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowAuthorizationFact_Payload(reader: Reader): Factory_Flow.AuthorizationFact_Payload = {
      val r = reader.readFactory_FlowAuthorizationFact_Payload()
      return r
    }
    val r = to(data, fFactory_FlowAuthorizationFact_Payload _)
    return r
  }

  def fromFactory_FlowLineFlowCommand(o: Factory_Flow.LineFlowCommand, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowLineFlowCommand(o)
    return w.result
  }

  def toFactory_FlowLineFlowCommand(data: ISZ[U8]): Either[Factory_Flow.LineFlowCommand, MessagePack.ErrorMsg] = {
    def fFactory_FlowLineFlowCommand(reader: Reader): Factory_Flow.LineFlowCommand = {
      val r = reader.readFactory_FlowLineFlowCommand()
      return r
    }
    val r = to(data, fFactory_FlowLineFlowCommand _)
    return r
  }

  def fromFactory_FlowLineFlowCommand_Payload(o: Factory_Flow.LineFlowCommand_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowLineFlowCommand_Payload(o)
    return w.result
  }

  def toFactory_FlowLineFlowCommand_Payload(data: ISZ[U8]): Either[Factory_Flow.LineFlowCommand_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowLineFlowCommand_Payload(reader: Reader): Factory_Flow.LineFlowCommand_Payload = {
      val r = reader.readFactory_FlowLineFlowCommand_Payload()
      return r
    }
    val r = to(data, fFactory_FlowLineFlowCommand_Payload _)
    return r
  }

  def fromFactory_FlowProductionOutcome(o: Factory_Flow.ProductionOutcome, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProductionOutcome(o)
    return w.result
  }

  def toFactory_FlowProductionOutcome(data: ISZ[U8]): Either[Factory_Flow.ProductionOutcome, MessagePack.ErrorMsg] = {
    def fFactory_FlowProductionOutcome(reader: Reader): Factory_Flow.ProductionOutcome = {
      val r = reader.readFactory_FlowProductionOutcome()
      return r
    }
    val r = to(data, fFactory_FlowProductionOutcome _)
    return r
  }

  def fromFactory_FlowProductionOutcome_Payload(o: Factory_Flow.ProductionOutcome_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProductionOutcome_Payload(o)
    return w.result
  }

  def toFactory_FlowProductionOutcome_Payload(data: ISZ[U8]): Either[Factory_Flow.ProductionOutcome_Payload, MessagePack.ErrorMsg] = {
    def fFactory_FlowProductionOutcome_Payload(reader: Reader): Factory_Flow.ProductionOutcome_Payload = {
      val r = reader.readFactory_FlowProductionOutcome_Payload()
      return r
    }
    val r = to(data, fFactory_FlowProductionOutcome_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBoolean_Payload(o)
    return w.result
  }

  def toBase_TypesBoolean_Payload(data: ISZ[U8]): Either[Base_Types.Boolean_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(reader: Reader): Base_Types.Boolean_Payload = {
      val r = reader.readBase_TypesBoolean_Payload()
      return r
    }
    val r = to(data, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_Payload(data: ISZ[U8]): Either[Base_Types.Integer_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_Payload(reader: Reader): Base_Types.Integer_Payload = {
      val r = reader.readBase_TypesInteger_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_8_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_8_Payload(data: ISZ[U8]): Either[Base_Types.Integer_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(reader: Reader): Base_Types.Integer_8_Payload = {
      val r = reader.readBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_16_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_16_Payload(data: ISZ[U8]): Either[Base_Types.Integer_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(reader: Reader): Base_Types.Integer_16_Payload = {
      val r = reader.readBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_32_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_32_Payload(data: ISZ[U8]): Either[Base_Types.Integer_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(reader: Reader): Base_Types.Integer_32_Payload = {
      val r = reader.readBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_64_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_64_Payload(data: ISZ[U8]): Either[Base_Types.Integer_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(reader: Reader): Base_Types.Integer_64_Payload = {
      val r = reader.readBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_8_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_8_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(reader: Reader): Base_Types.Unsigned_8_Payload = {
      val r = reader.readBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_16_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_16_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(reader: Reader): Base_Types.Unsigned_16_Payload = {
      val r = reader.readBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_32_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_32_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(reader: Reader): Base_Types.Unsigned_32_Payload = {
      val r = reader.readBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_64_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_64_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(reader: Reader): Base_Types.Unsigned_64_Payload = {
      val r = reader.readBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_Payload(data: ISZ[U8]): Either[Base_Types.Float_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_Payload(reader: Reader): Base_Types.Float_Payload = {
      val r = reader.readBase_TypesFloat_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_32_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_32_Payload(data: ISZ[U8]): Either[Base_Types.Float_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(reader: Reader): Base_Types.Float_32_Payload = {
      val r = reader.readBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_64_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_64_Payload(data: ISZ[U8]): Either[Base_Types.Float_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(reader: Reader): Base_Types.Float_64_Payload = {
      val r = reader.readBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesCharacter_Payload(o)
    return w.result
  }

  def toBase_TypesCharacter_Payload(data: ISZ[U8]): Either[Base_Types.Character_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(reader: Reader): Base_Types.Character_Payload = {
      val r = reader.readBase_TypesCharacter_Payload()
      return r
    }
    val r = to(data, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesString_Payload(o)
    return w.result
  }

  def toBase_TypesString_Payload(data: ISZ[U8]): Either[Base_Types.String_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesString_Payload(reader: Reader): Base_Types.String_Payload = {
      val r = reader.readBase_TypesString_Payload()
      return r
    }
    val r = to(data, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBits_Payload(o)
    return w.result
  }

  def toBase_TypesBits_Payload(data: ISZ[U8]): Either[Base_Types.Bits_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBits_Payload(reader: Reader): Base_Types.Bits_Payload = {
      val r = reader.readBase_TypesBits_Payload()
      return r
    }
    val r = to(data, fBase_TypesBits_Payload _)
    return r
  }

  def fromFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container(o)
    return w.result
  }

  def toFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container(data: ISZ[U8]): Either[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container(reader: Reader): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container = {
      val r = reader.readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container()
      return r
    }
    val r = to(data, fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container _)
    return r
  }

  def fromFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(o)
    return w.result
  }

  def toFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(data: ISZ[U8]): Either[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(reader: Reader): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P = {
      val r = reader.readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(reader: Reader): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS = {
      val r = reader.readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container(o)
    return w.result
  }

  def toFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container(data: ISZ[U8]): Either[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container(reader: Reader): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container = {
      val r = reader.readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container()
      return r
    }
    val r = to(data, fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container _)
    return r
  }

  def fromFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(o)
    return w.result
  }

  def toFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(data: ISZ[U8]): Either[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(reader: Reader): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P = {
      val r = reader.readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(reader: Reader): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS = {
      val r = reader.readFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS _)
    return r
  }

  def fromFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container(o)
    return w.result
  }

  def toFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container(data: ISZ[U8]): Either[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container(reader: Reader): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container = {
      val r = reader.readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container()
      return r
    }
    val r = to(data, fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container _)
    return r
  }

  def fromFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(o)
    return w.result
  }

  def toFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(data: ISZ[U8]): Either[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(reader: Reader): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P = {
      val r = reader.readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(reader: Reader): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS = {
      val r = reader.readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container(o)
    return w.result
  }

  def toFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container(data: ISZ[U8]): Either[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container(reader: Reader): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container = {
      val r = reader.readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container()
      return r
    }
    val r = to(data, fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container _)
    return r
  }

  def fromFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(o)
    return w.result
  }

  def toFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(data: ISZ[U8]): Either[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(reader: Reader): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P = {
      val r = reader.readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(reader: Reader): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS = {
      val r = reader.readFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS _)
    return r
  }

  def fromFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container(o)
    return w.result
  }

  def toFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container(data: ISZ[U8]): Either[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container(reader: Reader): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container = {
      val r = reader.readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container()
      return r
    }
    val r = to(data, fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container _)
    return r
  }

  def fromFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(o)
    return w.result
  }

  def toFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(data: ISZ[U8]): Either[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(reader: Reader): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P = {
      val r = reader.readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(reader: Reader): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS = {
      val r = reader.readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container(o)
    return w.result
  }

  def toFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container(data: ISZ[U8]): Either[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container(reader: Reader): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container = {
      val r = reader.readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container()
      return r
    }
    val r = to(data, fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container _)
    return r
  }

  def fromFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(o)
    return w.result
  }

  def toFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(data: ISZ[U8]): Either[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(reader: Reader): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P = {
      val r = reader.readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(reader: Reader): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS = {
      val r = reader.readFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS _)
    return r
  }

  def fromFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container(o)
    return w.result
  }

  def toFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container(data: ISZ[U8]): Either[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container(reader: Reader): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container = {
      val r = reader.readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container()
      return r
    }
    val r = to(data, fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container _)
    return r
  }

  def fromFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(o)
    return w.result
  }

  def toFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(data: ISZ[U8]): Either[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(reader: Reader): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P = {
      val r = reader.readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(reader: Reader): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS = {
      val r = reader.readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container(o)
    return w.result
  }

  def toFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container(data: ISZ[U8]): Either[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container(reader: Reader): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container = {
      val r = reader.readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container()
      return r
    }
    val r = to(data, fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container _)
    return r
  }

  def fromFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(o)
    return w.result
  }

  def toFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(data: ISZ[U8]): Either[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(reader: Reader): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P = {
      val r = reader.readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(reader: Reader): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS = {
      val r = reader.readFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS _)
    return r
  }

  def fromFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container(o)
    return w.result
  }

  def toFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container(data: ISZ[U8]): Either[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container(reader: Reader): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container = {
      val r = reader.readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container()
      return r
    }
    val r = to(data, fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container _)
    return r
  }

  def fromFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(o)
    return w.result
  }

  def toFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(data: ISZ[U8]): Either[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(reader: Reader): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P = {
      val r = reader.readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(reader: Reader): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS = {
      val r = reader.readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container(o)
    return w.result
  }

  def toFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container(data: ISZ[U8]): Either[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container(reader: Reader): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container = {
      val r = reader.readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container()
      return r
    }
    val r = to(data, fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container _)
    return r
  }

  def fromFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(o)
    return w.result
  }

  def toFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(data: ISZ[U8]): Either[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(reader: Reader): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P = {
      val r = reader.readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(reader: Reader): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS = {
      val r = reader.readFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS _)
    return r
  }

  def fromFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container(o)
    return w.result
  }

  def toFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container(data: ISZ[U8]): Either[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container(reader: Reader): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container = {
      val r = reader.readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container()
      return r
    }
    val r = to(data, fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container _)
    return r
  }

  def fromFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(o)
    return w.result
  }

  def toFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(data: ISZ[U8]): Either[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(reader: Reader): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P = {
      val r = reader.readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(reader: Reader): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS = {
      val r = reader.readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container(o)
    return w.result
  }

  def toFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container(data: ISZ[U8]): Either[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container(reader: Reader): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container = {
      val r = reader.readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container()
      return r
    }
    val r = to(data, fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container _)
    return r
  }

  def fromFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(o)
    return w.result
  }

  def toFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(data: ISZ[U8]): Either[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(reader: Reader): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P = {
      val r = reader.readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(reader: Reader): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS = {
      val r = reader.readFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS _)
    return r
  }

  def fromFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container(o)
    return w.result
  }

  def toFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container(data: ISZ[U8]): Either[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container(reader: Reader): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container = {
      val r = reader.readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container()
      return r
    }
    val r = to(data, fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container _)
    return r
  }

  def fromFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(o)
    return w.result
  }

  def toFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(data: ISZ[U8]): Either[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(reader: Reader): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P = {
      val r = reader.readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(reader: Reader): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS = {
      val r = reader.readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container(o)
    return w.result
  }

  def toFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container(data: ISZ[U8]): Either[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container(reader: Reader): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container = {
      val r = reader.readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container()
      return r
    }
    val r = to(data, fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container _)
    return r
  }

  def fromFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(o)
    return w.result
  }

  def toFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(data: ISZ[U8]): Either[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(reader: Reader): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P = {
      val r = reader.readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(reader: Reader): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS = {
      val r = reader.readFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS _)
    return r
  }

  def fromFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container(o)
    return w.result
  }

  def toFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container(data: ISZ[U8]): Either[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container(reader: Reader): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container = {
      val r = reader.readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container()
      return r
    }
    val r = to(data, fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container _)
    return r
  }

  def fromFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(o)
    return w.result
  }

  def toFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(data: ISZ[U8]): Either[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(reader: Reader): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P = {
      val r = reader.readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(reader: Reader): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS = {
      val r = reader.readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container(o)
    return w.result
  }

  def toFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container(data: ISZ[U8]): Either[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container(reader: Reader): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container = {
      val r = reader.readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container()
      return r
    }
    val r = to(data, fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container _)
    return r
  }

  def fromFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(o)
    return w.result
  }

  def toFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(data: ISZ[U8]): Either[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(reader: Reader): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P = {
      val r = reader.readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(reader: Reader): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS = {
      val r = reader.readFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS _)
    return r
  }

  def fromFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container(o)
    return w.result
  }

  def toFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container(data: ISZ[U8]): Either[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container(reader: Reader): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container = {
      val r = reader.readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container()
      return r
    }
    val r = to(data, fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container _)
    return r
  }

  def fromFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(o)
    return w.result
  }

  def toFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(data: ISZ[U8]): Either[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(reader: Reader): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P = {
      val r = reader.readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(reader: Reader): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS = {
      val r = reader.readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container(o)
    return w.result
  }

  def toFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container(data: ISZ[U8]): Either[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container(reader: Reader): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container = {
      val r = reader.readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container()
      return r
    }
    val r = to(data, fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container _)
    return r
  }

  def fromFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(o)
    return w.result
  }

  def toFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(data: ISZ[U8]): Either[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(reader: Reader): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P = {
      val r = reader.readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P()
      return r
    }
    val r = to(data, fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(o)
    return w.result
  }

  def toFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(data: ISZ[U8]): Either[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(reader: Reader): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS = {
      val r = reader.readFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS()
      return r
    }
    val r = to(data, fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilContainer(o)
    return w.result
  }

  def toutilContainer(data: ISZ[U8]): Either[util.Container, MessagePack.ErrorMsg] = {
    def futilContainer(reader: Reader): util.Container = {
      val r = reader.readutilContainer()
      return r
    }
    val r = to(data, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilEmptyContainer(o)
    return w.result
  }

  def toutilEmptyContainer(data: ISZ[U8]): Either[util.EmptyContainer, MessagePack.ErrorMsg] = {
    def futilEmptyContainer(reader: Reader): util.EmptyContainer = {
      val r = reader.readutilEmptyContainer()
      return r
    }
    val r = to(data, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artDataContent(o)
    return w.result
  }

  def to_artDataContent(data: ISZ[U8]): Either[art.DataContent, MessagePack.ErrorMsg] = {
    def f_artDataContent(reader: Reader): art.DataContent = {
      val r = reader.read_artDataContent()
      return r
    }
    val r = to(data, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artEmpty(o)
    return w.result
  }

  def to_artEmpty(data: ISZ[U8]): Either[art.Empty, MessagePack.ErrorMsg] = {
    def f_artEmpty(reader: Reader): art.Empty = {
      val r = reader.read_artEmpty()
      return r
    }
    val r = to(data, f_artEmpty _)
    return r
  }

}