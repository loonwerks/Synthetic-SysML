// #Sireum
// @formatter:off

// This file is auto-generated from RequestPresence.scala, Validity.scala, WorkId.scala, ProductKind.scala, AdmissionAssessment.scala, MaterialDisposition.scala, MaterialAssessment.scala, StepDisposition.scala, LedgerPhase.scala, AttemptKind.scala, TargetQualification.scala, ProcessEvent.scala, CorrelatedOutcomePlan.scala, IntentKind.scala, CompetitorPresence.scala, FlowDecision.scala, DecisionReason.scala, CommandAction.scala, ProductionResult.scala, ProductionFlowStatus.scala, FlowStep.scala, PresentedWorkRequest.scala, AdmissionFact.scala, MaterialHandoffObservation.scala, MaterialFact.scala, StepReadinessObservation.scala, FlowContext.scala, ProtectionContext.scala, FlowSnapshot.scala, ProcessResultObservation.scala, OutcomeFact.scala, FlowIntentFact.scala, AuthorizationFact.scala, LineFlowCommand.scala, ProductionOutcome.scala, Base_Types.scala, WorkRequestQualifier_supervisorProcess_workRequestQualifier_Containers.scala, MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_Containers.scala, TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_Containers.scala, ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_Containers.scala, ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_Containers.scala, FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_Containers.scala, FlowLedger_supervisorProcess_flowLedger_Containers.scala, ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_Containers.scala, FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package scp_candidate

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printFactory_FlowRequestPresenceType(o: Factory_Flow.RequestPresence.Type): ST = {
      val value: String = o match {
        case Factory_Flow.RequestPresence.None => "None"
        case Factory_Flow.RequestPresence.Present => "Present"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.RequestPresence")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowRequestPresence_Payload(o: Factory_Flow.RequestPresence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.RequestPresence_Payload""""),
        ("value", printFactory_FlowRequestPresenceType(o.value))
      ))
    }

    @pure def printFactory_FlowValidityType(o: Factory_Flow.Validity.Type): ST = {
      val value: String = o match {
        case Factory_Flow.Validity.Valid => "Valid"
        case Factory_Flow.Validity.Invalid => "Invalid"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.Validity")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowValidity_Payload(o: Factory_Flow.Validity_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.Validity_Payload""""),
        ("value", printFactory_FlowValidityType(o.value))
      ))
    }

    @pure def printFactory_FlowWorkIdType(o: Factory_Flow.WorkId.Type): ST = {
      val value: String = o match {
        case Factory_Flow.WorkId.NoWork => "NoWork"
        case Factory_Flow.WorkId.W1 => "W1"
        case Factory_Flow.WorkId.W2 => "W2"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.WorkId")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowWorkId_Payload(o: Factory_Flow.WorkId_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.WorkId_Payload""""),
        ("value", printFactory_FlowWorkIdType(o.value))
      ))
    }

    @pure def printFactory_FlowProductKindType(o: Factory_Flow.ProductKind.Type): ST = {
      val value: String = o match {
        case Factory_Flow.ProductKind.AngleProduct => "AngleProduct"
        case Factory_Flow.ProductKind.UnsupportedProduct => "UnsupportedProduct"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.ProductKind")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowProductKind_Payload(o: Factory_Flow.ProductKind_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProductKind_Payload""""),
        ("value", printFactory_FlowProductKindType(o.value))
      ))
    }

    @pure def printFactory_FlowAdmissionAssessmentType(o: Factory_Flow.AdmissionAssessment.Type): ST = {
      val value: String = o match {
        case Factory_Flow.AdmissionAssessment.NoRequest => "NoRequest"
        case Factory_Flow.AdmissionAssessment.Eligible => "Eligible"
        case Factory_Flow.AdmissionAssessment.Malformed => "Malformed"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.AdmissionAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowAdmissionAssessment_Payload(o: Factory_Flow.AdmissionAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.AdmissionAssessment_Payload""""),
        ("value", printFactory_FlowAdmissionAssessmentType(o.value))
      ))
    }

    @pure def printFactory_FlowMaterialDispositionType(o: Factory_Flow.MaterialDisposition.Type): ST = {
      val value: String = o match {
        case Factory_Flow.MaterialDisposition.Ready => "Ready"
        case Factory_Flow.MaterialDisposition.Unavailable => "Unavailable"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.MaterialDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowMaterialDisposition_Payload(o: Factory_Flow.MaterialDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.MaterialDisposition_Payload""""),
        ("value", printFactory_FlowMaterialDispositionType(o.value))
      ))
    }

    @pure def printFactory_FlowMaterialAssessmentType(o: Factory_Flow.MaterialAssessment.Type): ST = {
      val value: String = o match {
        case Factory_Flow.MaterialAssessment.MaterialReady => "MaterialReady"
        case Factory_Flow.MaterialAssessment.MaterialUnavailable => "MaterialUnavailable"
        case Factory_Flow.MaterialAssessment.MaterialUnknown => "MaterialUnknown"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.MaterialAssessment")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowMaterialAssessment_Payload(o: Factory_Flow.MaterialAssessment_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.MaterialAssessment_Payload""""),
        ("value", printFactory_FlowMaterialAssessmentType(o.value))
      ))
    }

    @pure def printFactory_FlowStepDispositionType(o: Factory_Flow.StepDisposition.Type): ST = {
      val value: String = o match {
        case Factory_Flow.StepDisposition.Ready => "Ready"
        case Factory_Flow.StepDisposition.Blocked => "Blocked"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.StepDisposition")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowStepDisposition_Payload(o: Factory_Flow.StepDisposition_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.StepDisposition_Payload""""),
        ("value", printFactory_FlowStepDispositionType(o.value))
      ))
    }

    @pure def printFactory_FlowLedgerPhaseType(o: Factory_Flow.LedgerPhase.Type): ST = {
      val value: String = o match {
        case Factory_Flow.LedgerPhase.Idle => "Idle"
        case Factory_Flow.LedgerPhase.Active => "Active"
        case Factory_Flow.LedgerPhase.TransferPending => "TransferPending"
        case Factory_Flow.LedgerPhase.RecoveryPending => "RecoveryPending"
        case Factory_Flow.LedgerPhase.TerminalComplete => "TerminalComplete"
        case Factory_Flow.LedgerPhase.TerminalFailed => "TerminalFailed"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.LedgerPhase")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowLedgerPhase_Payload(o: Factory_Flow.LedgerPhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.LedgerPhase_Payload""""),
        ("value", printFactory_FlowLedgerPhaseType(o.value))
      ))
    }

    @pure def printFactory_FlowAttemptKindType(o: Factory_Flow.AttemptKind.Type): ST = {
      val value: String = o match {
        case Factory_Flow.AttemptKind.First => "First"
        case Factory_Flow.AttemptKind.Retry => "Retry"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.AttemptKind")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowAttemptKind_Payload(o: Factory_Flow.AttemptKind_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.AttemptKind_Payload""""),
        ("value", printFactory_FlowAttemptKindType(o.value))
      ))
    }

    @pure def printFactory_FlowTargetQualificationType(o: Factory_Flow.TargetQualification.Type): ST = {
      val value: String = o match {
        case Factory_Flow.TargetQualification.HeatingReady => "HeatingReady"
        case Factory_Flow.TargetQualification.HeatingBlocked => "HeatingBlocked"
        case Factory_Flow.TargetQualification.HeatingUnknown => "HeatingUnknown"
        case Factory_Flow.TargetQualification.BendingReady => "BendingReady"
        case Factory_Flow.TargetQualification.BendingBlocked => "BendingBlocked"
        case Factory_Flow.TargetQualification.BendingUnknown => "BendingUnknown"
        case Factory_Flow.TargetQualification.CuttingReady => "CuttingReady"
        case Factory_Flow.TargetQualification.CuttingBlocked => "CuttingBlocked"
        case Factory_Flow.TargetQualification.CuttingUnknown => "CuttingUnknown"
        case Factory_Flow.TargetQualification.DrillingReady => "DrillingReady"
        case Factory_Flow.TargetQualification.DrillingBlocked => "DrillingBlocked"
        case Factory_Flow.TargetQualification.DrillingUnknown => "DrillingUnknown"
        case Factory_Flow.TargetQualification.GrindingReady => "GrindingReady"
        case Factory_Flow.TargetQualification.GrindingBlocked => "GrindingBlocked"
        case Factory_Flow.TargetQualification.GrindingUnknown => "GrindingUnknown"
        case Factory_Flow.TargetQualification.PolishingReady => "PolishingReady"
        case Factory_Flow.TargetQualification.PolishingBlocked => "PolishingBlocked"
        case Factory_Flow.TargetQualification.PolishingUnknown => "PolishingUnknown"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.TargetQualification")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowTargetQualification_Payload(o: Factory_Flow.TargetQualification_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.TargetQualification_Payload""""),
        ("value", printFactory_FlowTargetQualificationType(o.value))
      ))
    }

    @pure def printFactory_FlowProcessEventType(o: Factory_Flow.ProcessEvent.Type): ST = {
      val value: String = o match {
        case Factory_Flow.ProcessEvent.NoEvent => "NoEvent"
        case Factory_Flow.ProcessEvent.InProgress => "InProgress"
        case Factory_Flow.ProcessEvent.Completed => "Completed"
        case Factory_Flow.ProcessEvent.Failed => "Failed"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.ProcessEvent")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowProcessEvent_Payload(o: Factory_Flow.ProcessEvent_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProcessEvent_Payload""""),
        ("value", printFactory_FlowProcessEventType(o.value))
      ))
    }

    @pure def printFactory_FlowCorrelatedOutcomePlanType(o: Factory_Flow.CorrelatedOutcomePlan.Type): ST = {
      val value: String = o match {
        case Factory_Flow.CorrelatedOutcomePlan.Preserve => "Preserve"
        case Factory_Flow.CorrelatedOutcomePlan.IntermediateCompleted => "IntermediateCompleted"
        case Factory_Flow.CorrelatedOutcomePlan.FinalCompleted => "FinalCompleted"
        case Factory_Flow.CorrelatedOutcomePlan.FirstFailure => "FirstFailure"
        case Factory_Flow.CorrelatedOutcomePlan.RetryFailure => "RetryFailure"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.CorrelatedOutcomePlan")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowCorrelatedOutcomePlan_Payload(o: Factory_Flow.CorrelatedOutcomePlan_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.CorrelatedOutcomePlan_Payload""""),
        ("value", printFactory_FlowCorrelatedOutcomePlanType(o.value))
      ))
    }

    @pure def printFactory_FlowIntentKindType(o: Factory_Flow.IntentKind.Type): ST = {
      val value: String = o match {
        case Factory_Flow.IntentKind.NoIntent => "NoIntent"
        case Factory_Flow.IntentKind.FreshIntent => "FreshIntent"
        case Factory_Flow.IntentKind.ActiveIntent => "ActiveIntent"
        case Factory_Flow.IntentKind.TransferIntent => "TransferIntent"
        case Factory_Flow.IntentKind.RecoveryIntent => "RecoveryIntent"
        case Factory_Flow.IntentKind.ResetIntent => "ResetIntent"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.IntentKind")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowIntentKind_Payload(o: Factory_Flow.IntentKind_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.IntentKind_Payload""""),
        ("value", printFactory_FlowIntentKindType(o.value))
      ))
    }

    @pure def printFactory_FlowCompetitorPresenceType(o: Factory_Flow.CompetitorPresence.Type): ST = {
      val value: String = o match {
        case Factory_Flow.CompetitorPresence.Absent => "Absent"
        case Factory_Flow.CompetitorPresence.Present => "Present"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.CompetitorPresence")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowCompetitorPresence_Payload(o: Factory_Flow.CompetitorPresence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.CompetitorPresence_Payload""""),
        ("value", printFactory_FlowCompetitorPresenceType(o.value))
      ))
    }

    @pure def printFactory_FlowFlowDecisionType(o: Factory_Flow.FlowDecision.Type): ST = {
      val value: String = o match {
        case Factory_Flow.FlowDecision.ResetComplete => "ResetComplete"
        case Factory_Flow.FlowDecision.ResetFailed => "ResetFailed"
        case Factory_Flow.FlowDecision.HoldActive => "HoldActive"
        case Factory_Flow.FlowDecision.BusyActive => "BusyActive"
        case Factory_Flow.FlowDecision.CompleteProduction => "CompleteProduction"
        case Factory_Flow.FlowDecision.AdvanceNow => "AdvanceNow"
        case Factory_Flow.FlowDecision.HoldTransfer => "HoldTransfer"
        case Factory_Flow.FlowDecision.EnterRecovery => "EnterRecovery"
        case Factory_Flow.FlowDecision.FailTerminal => "FailTerminal"
        case Factory_Flow.FlowDecision.ReleaseTransfer => "ReleaseTransfer"
        case Factory_Flow.FlowDecision.WaitTransfer => "WaitTransfer"
        case Factory_Flow.FlowDecision.RetryNow => "RetryNow"
        case Factory_Flow.FlowDecision.WaitRecovery => "WaitRecovery"
        case Factory_Flow.FlowDecision.IdleNoRequest => "IdleNoRequest"
        case Factory_Flow.FlowDecision.RejectMalformed => "RejectMalformed"
        case Factory_Flow.FlowDecision.WaitMaterialUnavailable => "WaitMaterialUnavailable"
        case Factory_Flow.FlowDecision.WaitMaterialUnknown => "WaitMaterialUnknown"
        case Factory_Flow.FlowDecision.WaitHeatingBlocked => "WaitHeatingBlocked"
        case Factory_Flow.FlowDecision.WaitHeatingUnknown => "WaitHeatingUnknown"
        case Factory_Flow.FlowDecision.StartWork => "StartWork"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.FlowDecision")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowFlowDecision_Payload(o: Factory_Flow.FlowDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowDecision_Payload""""),
        ("value", printFactory_FlowFlowDecisionType(o.value))
      ))
    }

    @pure def printFactory_FlowDecisionReasonType(o: Factory_Flow.DecisionReason.Type): ST = {
      val value: String = o match {
        case Factory_Flow.DecisionReason.ResetComplete => "ResetComplete"
        case Factory_Flow.DecisionReason.ResetFailed => "ResetFailed"
        case Factory_Flow.DecisionReason.Processing => "Processing"
        case Factory_Flow.DecisionReason.ProtectedBusy => "ProtectedBusy"
        case Factory_Flow.DecisionReason.Completed => "Completed"
        case Factory_Flow.DecisionReason.Advanced => "Advanced"
        case Factory_Flow.DecisionReason.TransferWaiting => "TransferWaiting"
        case Factory_Flow.DecisionReason.RecoveryEntered => "RecoveryEntered"
        case Factory_Flow.DecisionReason.Failed => "Failed"
        case Factory_Flow.DecisionReason.TransferReleased => "TransferReleased"
        case Factory_Flow.DecisionReason.RecoveryReleased => "RecoveryReleased"
        case Factory_Flow.DecisionReason.RecoveryWaiting => "RecoveryWaiting"
        case Factory_Flow.DecisionReason.NoRequest => "NoRequest"
        case Factory_Flow.DecisionReason.MalformedRequest => "MalformedRequest"
        case Factory_Flow.DecisionReason.MaterialUnavailable => "MaterialUnavailable"
        case Factory_Flow.DecisionReason.MaterialUnknown => "MaterialUnknown"
        case Factory_Flow.DecisionReason.HeatingBlocked => "HeatingBlocked"
        case Factory_Flow.DecisionReason.HeatingUnknown => "HeatingUnknown"
        case Factory_Flow.DecisionReason.Started => "Started"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.DecisionReason")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowDecisionReason_Payload(o: Factory_Flow.DecisionReason_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.DecisionReason_Payload""""),
        ("value", printFactory_FlowDecisionReasonType(o.value))
      ))
    }

    @pure def printFactory_FlowCommandActionType(o: Factory_Flow.CommandAction.Type): ST = {
      val value: String = o match {
        case Factory_Flow.CommandAction.NoCommand => "NoCommand"
        case Factory_Flow.CommandAction.Start => "Start"
        case Factory_Flow.CommandAction.Advance => "Advance"
        case Factory_Flow.CommandAction.Retry => "Retry"
        case Factory_Flow.CommandAction.Abort => "Abort"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.CommandAction")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowCommandAction_Payload(o: Factory_Flow.CommandAction_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.CommandAction_Payload""""),
        ("value", printFactory_FlowCommandActionType(o.value))
      ))
    }

    @pure def printFactory_FlowProductionResultType(o: Factory_Flow.ProductionResult.Type): ST = {
      val value: String = o match {
        case Factory_Flow.ProductionResult.None => "None"
        case Factory_Flow.ProductionResult.ProductionComplete => "ProductionComplete"
        case Factory_Flow.ProductionResult.ProductionFailed => "ProductionFailed"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.ProductionResult")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowProductionResult_Payload(o: Factory_Flow.ProductionResult_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProductionResult_Payload""""),
        ("value", printFactory_FlowProductionResultType(o.value))
      ))
    }

    @pure def printFactory_FlowProductionFlowStatusType(o: Factory_Flow.ProductionFlowStatus.Type): ST = {
      val value: String = o match {
        case Factory_Flow.ProductionFlowStatus.Idle => "Idle"
        case Factory_Flow.ProductionFlowStatus.Rejected => "Rejected"
        case Factory_Flow.ProductionFlowStatus.WaitingMaterial => "WaitingMaterial"
        case Factory_Flow.ProductionFlowStatus.WaitingStation => "WaitingStation"
        case Factory_Flow.ProductionFlowStatus.Started => "Started"
        case Factory_Flow.ProductionFlowStatus.Processing => "Processing"
        case Factory_Flow.ProductionFlowStatus.Busy => "Busy"
        case Factory_Flow.ProductionFlowStatus.Recovering => "Recovering"
        case Factory_Flow.ProductionFlowStatus.Advanced => "Advanced"
        case Factory_Flow.ProductionFlowStatus.Completed => "Completed"
        case Factory_Flow.ProductionFlowStatus.Failed => "Failed"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.ProductionFlowStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowProductionFlowStatus_Payload(o: Factory_Flow.ProductionFlowStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProductionFlowStatus_Payload""""),
        ("value", printFactory_FlowProductionFlowStatusType(o.value))
      ))
    }

    @pure def printFactory_FlowFlowStepType(o: Factory_Flow.FlowStep.Type): ST = {
      val value: String = o match {
        case Factory_Flow.FlowStep.Heating => "Heating"
        case Factory_Flow.FlowStep.Bending => "Bending"
        case Factory_Flow.FlowStep.Cutting => "Cutting"
        case Factory_Flow.FlowStep.Drilling => "Drilling"
        case Factory_Flow.FlowStep.Grinding => "Grinding"
        case Factory_Flow.FlowStep.Polishing => "Polishing"
      }
      return printObject(ISZ(
        ("type", printString("Factory_Flow.FlowStep")),
        ("value", printString(value))
      ))
    }

    @pure def printFactory_FlowFlowStep_Payload(o: Factory_Flow.FlowStep_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowStep_Payload""""),
        ("value", printFactory_FlowFlowStepType(o.value))
      ))
    }

    @pure def printFactory_FlowPresentedWorkRequest(o: Factory_Flow.PresentedWorkRequest): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.PresentedWorkRequest""""),
        ("presence", printFactory_FlowRequestPresenceType(o.presence)),
        ("validity", printFactory_FlowValidityType(o.validity)),
        ("work_id", printFactory_FlowWorkIdType(o.work_id)),
        ("product", printFactory_FlowProductKindType(o.product))
      ))
    }

    @pure def printFactory_FlowPresentedWorkRequest_Payload(o: Factory_Flow.PresentedWorkRequest_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.PresentedWorkRequest_Payload""""),
        ("value", printFactory_FlowPresentedWorkRequest(o.value))
      ))
    }

    @pure def printFactory_FlowAdmissionFact(o: Factory_Flow.AdmissionFact): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.AdmissionFact""""),
        ("assessment", printFactory_FlowAdmissionAssessmentType(o.assessment)),
        ("work_id", printFactory_FlowWorkIdType(o.work_id))
      ))
    }

    @pure def printFactory_FlowAdmissionFact_Payload(o: Factory_Flow.AdmissionFact_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.AdmissionFact_Payload""""),
        ("value", printFactory_FlowAdmissionFact(o.value))
      ))
    }

    @pure def printFactory_FlowMaterialHandoffObservation(o: Factory_Flow.MaterialHandoffObservation): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.MaterialHandoffObservation""""),
        ("validity", printFactory_FlowValidityType(o.validity)),
        ("work_id", printFactory_FlowWorkIdType(o.work_id)),
        ("disposition", printFactory_FlowMaterialDispositionType(o.disposition))
      ))
    }

    @pure def printFactory_FlowMaterialHandoffObservation_Payload(o: Factory_Flow.MaterialHandoffObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.MaterialHandoffObservation_Payload""""),
        ("value", printFactory_FlowMaterialHandoffObservation(o.value))
      ))
    }

    @pure def printFactory_FlowMaterialFact(o: Factory_Flow.MaterialFact): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.MaterialFact""""),
        ("assessment", printFactory_FlowMaterialAssessmentType(o.assessment))
      ))
    }

    @pure def printFactory_FlowMaterialFact_Payload(o: Factory_Flow.MaterialFact_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.MaterialFact_Payload""""),
        ("value", printFactory_FlowMaterialFact(o.value))
      ))
    }

    @pure def printFactory_FlowStepReadinessObservation(o: Factory_Flow.StepReadinessObservation): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.StepReadinessObservation""""),
        ("validity", printFactory_FlowValidityType(o.validity)),
        ("step", printS32(o.step)),
        ("disposition", printFactory_FlowStepDispositionType(o.disposition))
      ))
    }

    @pure def printFactory_FlowStepReadinessObservation_Payload(o: Factory_Flow.StepReadinessObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.StepReadinessObservation_Payload""""),
        ("value", printFactory_FlowStepReadinessObservation(o.value))
      ))
    }

    @pure def printFactory_FlowFlowContext(o: Factory_Flow.FlowContext): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowContext""""),
        ("phase", printFactory_FlowLedgerPhaseType(o.phase)),
        ("work_id", printFactory_FlowWorkIdType(o.work_id)),
        ("step_value", printS32(o.step_value)),
        ("attempt", printFactory_FlowAttemptKindType(o.attempt))
      ))
    }

    @pure def printFactory_FlowFlowContext_Payload(o: Factory_Flow.FlowContext_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowContext_Payload""""),
        ("value", printFactory_FlowFlowContext(o.value))
      ))
    }

    @pure def printFactory_FlowProtectionContext(o: Factory_Flow.ProtectionContext): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProtectionContext""""),
        ("phase", printFactory_FlowLedgerPhaseType(o.phase)),
        ("work_id", printFactory_FlowWorkIdType(o.work_id)),
        ("step_value", printS32(o.step_value)),
        ("attempt", printFactory_FlowAttemptKindType(o.attempt))
      ))
    }

    @pure def printFactory_FlowProtectionContext_Payload(o: Factory_Flow.ProtectionContext_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProtectionContext_Payload""""),
        ("value", printFactory_FlowProtectionContext(o.value))
      ))
    }

    @pure def printFactory_FlowFlowSnapshot(o: Factory_Flow.FlowSnapshot): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowSnapshot""""),
        ("phase", printFactory_FlowLedgerPhaseType(o.phase)),
        ("work_id", printFactory_FlowWorkIdType(o.work_id)),
        ("step_value", printS32(o.step_value)),
        ("attempt", printFactory_FlowAttemptKindType(o.attempt))
      ))
    }

    @pure def printFactory_FlowFlowSnapshot_Payload(o: Factory_Flow.FlowSnapshot_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowSnapshot_Payload""""),
        ("value", printFactory_FlowFlowSnapshot(o.value))
      ))
    }

    @pure def printFactory_FlowProcessResultObservation(o: Factory_Flow.ProcessResultObservation): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProcessResultObservation""""),
        ("validity", printFactory_FlowValidityType(o.validity)),
        ("work_id", printFactory_FlowWorkIdType(o.work_id)),
        ("step", printS32(o.step)),
        ("event_kind", printFactory_FlowProcessEventType(o.event_kind))
      ))
    }

    @pure def printFactory_FlowProcessResultObservation_Payload(o: Factory_Flow.ProcessResultObservation_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProcessResultObservation_Payload""""),
        ("value", printFactory_FlowProcessResultObservation(o.value))
      ))
    }

    @pure def printFactory_FlowOutcomeFact(o: Factory_Flow.OutcomeFact): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.OutcomeFact""""),
        ("plan", printFactory_FlowCorrelatedOutcomePlanType(o.plan))
      ))
    }

    @pure def printFactory_FlowOutcomeFact_Payload(o: Factory_Flow.OutcomeFact_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.OutcomeFact_Payload""""),
        ("value", printFactory_FlowOutcomeFact(o.value))
      ))
    }

    @pure def printFactory_FlowFlowIntentFact(o: Factory_Flow.FlowIntentFact): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowIntentFact""""),
        ("kind", printFactory_FlowIntentKindType(o.kind)),
        ("competitor", printFactory_FlowCompetitorPresenceType(o.competitor)),
        ("assessment", printFactory_FlowAdmissionAssessmentType(o.assessment)),
        ("phase", printFactory_FlowLedgerPhaseType(o.phase)),
        ("work_id", printFactory_FlowWorkIdType(o.work_id)),
        ("step", printS32(o.step))
      ))
    }

    @pure def printFactory_FlowFlowIntentFact_Payload(o: Factory_Flow.FlowIntentFact_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowIntentFact_Payload""""),
        ("value", printFactory_FlowFlowIntentFact(o.value))
      ))
    }

    @pure def printFactory_FlowAuthorizationFact(o: Factory_Flow.AuthorizationFact): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.AuthorizationFact""""),
        ("decision", printFactory_FlowFlowDecisionType(o.decision)),
        ("reason", printFactory_FlowDecisionReasonType(o.reason)),
        ("work_id", printFactory_FlowWorkIdType(o.work_id)),
        ("step", printS32(o.step))
      ))
    }

    @pure def printFactory_FlowAuthorizationFact_Payload(o: Factory_Flow.AuthorizationFact_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.AuthorizationFact_Payload""""),
        ("value", printFactory_FlowAuthorizationFact(o.value))
      ))
    }

    @pure def printFactory_FlowLineFlowCommand(o: Factory_Flow.LineFlowCommand): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.LineFlowCommand""""),
        ("action_kind", printFactory_FlowCommandActionType(o.action_kind)),
        ("work_id", printFactory_FlowWorkIdType(o.work_id)),
        ("step", printS32(o.step))
      ))
    }

    @pure def printFactory_FlowLineFlowCommand_Payload(o: Factory_Flow.LineFlowCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.LineFlowCommand_Payload""""),
        ("value", printFactory_FlowLineFlowCommand(o.value))
      ))
    }

    @pure def printFactory_FlowProductionOutcome(o: Factory_Flow.ProductionOutcome): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProductionOutcome""""),
        ("result", printFactory_FlowProductionResultType(o.result)),
        ("work_id", printFactory_FlowWorkIdType(o.work_id))
      ))
    }

    @pure def printFactory_FlowProductionOutcome_Payload(o: Factory_Flow.ProductionOutcome_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProductionOutcome_Payload""""),
        ("value", printFactory_FlowProductionOutcome(o.value))
      ))
    }

    @pure def printBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Boolean_Payload""""),
        ("value", printB(o.value))
      ))
    }

    @pure def printBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_Payload""""),
        ("value", printZ(o.value))
      ))
    }

    @pure def printBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_8_Payload""""),
        ("value", printS8(o.value))
      ))
    }

    @pure def printBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_16_Payload""""),
        ("value", printS16(o.value))
      ))
    }

    @pure def printBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_32_Payload""""),
        ("value", printS32(o.value))
      ))
    }

    @pure def printBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_64_Payload""""),
        ("value", printS64(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_8_Payload""""),
        ("value", printU8(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_16_Payload""""),
        ("value", printU16(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_32_Payload""""),
        ("value", printU32(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_64_Payload""""),
        ("value", printU64(o.value))
      ))
    }

    @pure def printBase_TypesFloat_Payload(o: Base_Types.Float_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_Payload""""),
        ("value", printR(o.value))
      ))
    }

    @pure def printBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_32_Payload""""),
        ("value", printF32(o.value))
      ))
    }

    @pure def printBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_64_Payload""""),
        ("value", printF64(o.value))
      ))
    }

    @pure def printBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Character_Payload""""),
        ("value", printC(o.value))
      ))
    }

    @pure def printBase_TypesString_Payload(o: Base_Types.String_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.String_Payload""""),
        ("value", printString(o.value))
      ))
    }

    @pure def printBase_TypesBits_Payload(o: Base_Types.Bits_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Bits_Payload""""),
        ("value", printISZ(T, o.value, printB _))
      ))
    }

    @pure def printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container): ST = {
      o match {
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P => return printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS => return printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P""""),
        ("api_presentedWork", printFactory_FlowPresentedWorkRequest(o.api_presentedWork))
      ))
    }

    @pure def printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS""""),
        ("api_presentedWork", printFactory_FlowPresentedWorkRequest(o.api_presentedWork))
      ))
    }

    @pure def printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container): ST = {
      o match {
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P => return printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS => return printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P""""),
        ("api_admissionToMaterial", printFactory_FlowAdmissionFact(o.api_admissionToMaterial)),
        ("api_admissionToPriority", printFactory_FlowAdmissionFact(o.api_admissionToPriority))
      ))
    }

    @pure def printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS""""),
        ("api_admissionToMaterial", printFactory_FlowAdmissionFact(o.api_admissionToMaterial)),
        ("api_admissionToPriority", printFactory_FlowAdmissionFact(o.api_admissionToPriority))
      ))
    }

    @pure def printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container): ST = {
      o match {
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P => return printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS => return printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P""""),
        ("api_admission", printFactory_FlowAdmissionFact(o.api_admission)),
        ("api_materialObservation", printFactory_FlowMaterialHandoffObservation(o.api_materialObservation))
      ))
    }

    @pure def printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS""""),
        ("api_admission", printFactory_FlowAdmissionFact(o.api_admission)),
        ("api_materialObservation", printFactory_FlowMaterialHandoffObservation(o.api_materialObservation))
      ))
    }

    @pure def printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container): ST = {
      o match {
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P => return printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS => return printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P""""),
        ("api_materialFact", printFactory_FlowMaterialFact(o.api_materialFact))
      ))
    }

    @pure def printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS""""),
        ("api_materialFact", printFactory_FlowMaterialFact(o.api_materialFact))
      ))
    }

    @pure def printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container): ST = {
      o match {
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P => return printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS => return printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P""""),
        ("api_flowContext", printFactory_FlowFlowContext(o.api_flowContext)),
        ("api_readinessObservation", printFactory_FlowStepReadinessObservation(o.api_readinessObservation))
      ))
    }

    @pure def printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS""""),
        ("api_flowContext", printFactory_FlowFlowContext(o.api_flowContext)),
        ("api_readinessObservation", printFactory_FlowStepReadinessObservation(o.api_readinessObservation))
      ))
    }

    @pure def printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container): ST = {
      o match {
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P => return printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS => return printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P""""),
        ("api_targetFact", printFactory_FlowTargetQualificationType(o.api_targetFact))
      ))
    }

    @pure def printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS""""),
        ("api_targetFact", printFactory_FlowTargetQualificationType(o.api_targetFact))
      ))
    }

    @pure def printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container): ST = {
      o match {
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P => return printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS => return printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P""""),
        ("api_flowContext", printFactory_FlowFlowContext(o.api_flowContext)),
        ("api_processResult", printFactory_FlowProcessResultObservation(o.api_processResult))
      ))
    }

    @pure def printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS""""),
        ("api_flowContext", printFactory_FlowFlowContext(o.api_flowContext)),
        ("api_processResult", printFactory_FlowProcessResultObservation(o.api_processResult))
      ))
    }

    @pure def printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container): ST = {
      o match {
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P => return printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS => return printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P""""),
        ("api_outcomeToAuthorization", printFactory_FlowOutcomeFact(o.api_outcomeToAuthorization)),
        ("api_outcomeToDeterminer", printFactory_FlowOutcomeFact(o.api_outcomeToDeterminer))
      ))
    }

    @pure def printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS""""),
        ("api_outcomeToAuthorization", printFactory_FlowOutcomeFact(o.api_outcomeToAuthorization)),
        ("api_outcomeToDeterminer", printFactory_FlowOutcomeFact(o.api_outcomeToDeterminer))
      ))
    }

    @pure def printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container): ST = {
      o match {
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P => return printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS => return printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P""""),
        ("api_admission", printFactory_FlowAdmissionFact(o.api_admission)),
        ("api_protectionContext", printFactory_FlowProtectionContext(o.api_protectionContext))
      ))
    }

    @pure def printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS""""),
        ("api_admission", printFactory_FlowAdmissionFact(o.api_admission)),
        ("api_protectionContext", printFactory_FlowProtectionContext(o.api_protectionContext))
      ))
    }

    @pure def printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container): ST = {
      o match {
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P => return printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS => return printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P""""),
        ("api_intentFact", printFactory_FlowFlowIntentFact(o.api_intentFact))
      ))
    }

    @pure def printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS""""),
        ("api_intentFact", printFactory_FlowFlowIntentFact(o.api_intentFact))
      ))
    }

    @pure def printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container): ST = {
      o match {
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P => return printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS => return printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P""""),
        ("api_intentFact", printFactory_FlowFlowIntentFact(o.api_intentFact)),
        ("api_materialFact", printFactory_FlowMaterialFact(o.api_materialFact)),
        ("api_outcomeFact", printFactory_FlowOutcomeFact(o.api_outcomeFact)),
        ("api_targetFact", printFactory_FlowTargetQualificationType(o.api_targetFact))
      ))
    }

    @pure def printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS""""),
        ("api_intentFact", printFactory_FlowFlowIntentFact(o.api_intentFact)),
        ("api_materialFact", printFactory_FlowMaterialFact(o.api_materialFact)),
        ("api_outcomeFact", printFactory_FlowOutcomeFact(o.api_outcomeFact)),
        ("api_targetFact", printFactory_FlowTargetQualificationType(o.api_targetFact))
      ))
    }

    @pure def printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container): ST = {
      o match {
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P => return printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS => return printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P""""),
        ("api_authorization", printFactory_FlowAuthorizationFact(o.api_authorization)),
        ("api_reasonToStatus", printFactory_FlowDecisionReasonType(o.api_reasonToStatus))
      ))
    }

    @pure def printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS""""),
        ("api_authorization", printFactory_FlowAuthorizationFact(o.api_authorization)),
        ("api_reasonToStatus", printFactory_FlowDecisionReasonType(o.api_reasonToStatus))
      ))
    }

    @pure def printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container): ST = {
      o match {
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P => return printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS => return printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P""""),
        ("api_authorization", printFactory_FlowAuthorizationFact(o.api_authorization))
      ))
    }

    @pure def printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS""""),
        ("In_activeStep", printFactory_FlowFlowStepType(o.In_activeStep)),
        ("In_activeWork", printFactory_FlowWorkIdType(o.In_activeWork)),
        ("In_attempt", printFactory_FlowAttemptKindType(o.In_attempt)),
        ("In_phase", printFactory_FlowLedgerPhaseType(o.In_phase)),
        ("api_authorization", printFactory_FlowAuthorizationFact(o.api_authorization))
      ))
    }

    @pure def printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container): ST = {
      o match {
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P => return printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS => return printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P""""),
        ("api_contextToOutcome", printFactory_FlowFlowContext(o.api_contextToOutcome)),
        ("api_contextToReadiness", printFactory_FlowFlowContext(o.api_contextToReadiness)),
        ("api_lineCommand", printFactory_FlowLineFlowCommand(o.api_lineCommand)),
        ("api_protectionContext", printFactory_FlowProtectionContext(o.api_protectionContext)),
        ("api_snapshotToOutcome", printFactory_FlowFlowSnapshot(o.api_snapshotToOutcome)),
        ("api_snapshotToStatus", printFactory_FlowFlowSnapshot(o.api_snapshotToStatus))
      ))
    }

    @pure def printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS""""),
        ("activeStep", printFactory_FlowFlowStepType(o.activeStep)),
        ("activeWork", printFactory_FlowWorkIdType(o.activeWork)),
        ("attempt", printFactory_FlowAttemptKindType(o.attempt)),
        ("phase", printFactory_FlowLedgerPhaseType(o.phase)),
        ("api_contextToOutcome", printFactory_FlowFlowContext(o.api_contextToOutcome)),
        ("api_contextToReadiness", printFactory_FlowFlowContext(o.api_contextToReadiness)),
        ("api_lineCommand", printFactory_FlowLineFlowCommand(o.api_lineCommand)),
        ("api_protectionContext", printFactory_FlowProtectionContext(o.api_protectionContext)),
        ("api_snapshotToOutcome", printFactory_FlowFlowSnapshot(o.api_snapshotToOutcome)),
        ("api_snapshotToStatus", printFactory_FlowFlowSnapshot(o.api_snapshotToStatus))
      ))
    }

    @pure def printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container): ST = {
      o match {
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P => return printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS => return printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P""""),
        ("api_appliedSnapshot", printFactory_FlowFlowSnapshot(o.api_appliedSnapshot)),
        ("api_outcomeFact", printFactory_FlowOutcomeFact(o.api_outcomeFact))
      ))
    }

    @pure def printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS""""),
        ("api_appliedSnapshot", printFactory_FlowFlowSnapshot(o.api_appliedSnapshot)),
        ("api_outcomeFact", printFactory_FlowOutcomeFact(o.api_outcomeFact))
      ))
    }

    @pure def printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container): ST = {
      o match {
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P => return printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS => return printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P""""),
        ("api_productionOutcome", printFactory_FlowProductionOutcome(o.api_productionOutcome))
      ))
    }

    @pure def printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS""""),
        ("api_productionOutcome", printFactory_FlowProductionOutcome(o.api_productionOutcome))
      ))
    }

    @pure def printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container): ST = {
      o match {
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P => return printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS => return printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P""""),
        ("api_appliedSnapshot", printFactory_FlowFlowSnapshot(o.api_appliedSnapshot)),
        ("api_decisionReason", printFactory_FlowDecisionReasonType(o.api_decisionReason))
      ))
    }

    @pure def printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS""""),
        ("api_appliedSnapshot", printFactory_FlowFlowSnapshot(o.api_appliedSnapshot)),
        ("api_decisionReason", printFactory_FlowDecisionReasonType(o.api_decisionReason))
      ))
    }

    @pure def printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container): ST = {
      o match {
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P => return printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS => return printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(o)
      }
    }

    @pure def printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P""""),
        ("api_flowStatus", printFactory_FlowProductionFlowStatusType(o.api_flowStatus))
      ))
    }

    @pure def printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS""""),
        ("api_flowStatus", printFactory_FlowProductionFlowStatusType(o.api_flowStatus))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_workRequestQualifier_postInit => "FactoryFlowSupervisor_Instance_supervisorProcess_workRequestQualifier_postInit"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_workRequestQualifier_preCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_workRequestQualifier_preCompute"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_workRequestQualifier_postCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_workRequestQualifier_postCompute"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_materialCorrelationQualifier_postInit => "FactoryFlowSupervisor_Instance_supervisorProcess_materialCorrelationQualifier_postInit"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_materialCorrelationQualifier_preCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_materialCorrelationQualifier_preCompute"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_materialCorrelationQualifier_postCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_materialCorrelationQualifier_postCompute"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_targetStepReadinessQualifier_postInit => "FactoryFlowSupervisor_Instance_supervisorProcess_targetStepReadinessQualifier_postInit"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_targetStepReadinessQualifier_preCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_targetStepReadinessQualifier_preCompute"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_targetStepReadinessQualifier_postCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_targetStepReadinessQualifier_postCompute"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_processOutcomeCorrelator_postInit => "FactoryFlowSupervisor_Instance_supervisorProcess_processOutcomeCorrelator_postInit"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_processOutcomeCorrelator_preCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_processOutcomeCorrelator_preCompute"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_processOutcomeCorrelator_postCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_processOutcomeCorrelator_postCompute"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_protectedWorkPriorityResolver_postInit => "FactoryFlowSupervisor_Instance_supervisorProcess_protectedWorkPriorityResolver_postInit"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_protectedWorkPriorityResolver_preCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_protectedWorkPriorityResolver_preCompute"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_protectedWorkPriorityResolver_postCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_protectedWorkPriorityResolver_postCompute"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_flowAuthorizationOwner_postInit => "FactoryFlowSupervisor_Instance_supervisorProcess_flowAuthorizationOwner_postInit"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_flowAuthorizationOwner_preCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_flowAuthorizationOwner_preCompute"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_flowAuthorizationOwner_postCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_flowAuthorizationOwner_postCompute"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_flowLedger_postInit => "FactoryFlowSupervisor_Instance_supervisorProcess_flowLedger_postInit"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_flowLedger_preCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_flowLedger_preCompute"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_flowLedger_postCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_flowLedger_postCompute"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_productionOutcomeDeterminer_postInit => "FactoryFlowSupervisor_Instance_supervisorProcess_productionOutcomeDeterminer_postInit"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_productionOutcomeDeterminer_preCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_productionOutcomeDeterminer_preCompute"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_productionOutcomeDeterminer_postCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_productionOutcomeDeterminer_postCompute"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_flowStatusDeterminer_postInit => "FactoryFlowSupervisor_Instance_supervisorProcess_flowStatusDeterminer_postInit"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_flowStatusDeterminer_preCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_flowStatusDeterminer_preCompute"
        case runtimemonitor.ObservationKind.FactoryFlowSupervisor_Instance_supervisorProcess_flowStatusDeterminer_postCompute => "FactoryFlowSupervisor_Instance_supervisorProcess_flowStatusDeterminer_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P => return printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS => return printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P => return printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS => return printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P => return printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P => return printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS => return printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS => return printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P => return printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P => return printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS => return printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS => return printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P => return printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS => return printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P => return printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS => return printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P => return printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS => return printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P => return printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS => return printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P => return printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS => return printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P => return printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS => return printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P => return printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P => return printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS => return printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS => return printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P => return printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P => return printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS => return printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS => return printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P => return printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS => return printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P => return printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS => return printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(o)
      }
    }

    @pure def printutilEmptyContainer(o: util.EmptyContainer): ST = {
      return printObject(ISZ(
        ("type", st""""util.EmptyContainer"""")
      ))
    }

    @pure def print_artDataContent(o: art.DataContent): ST = {
      o match {
        case o: art.Empty => return print_artEmpty(o)
        case o: Base_Types.Boolean_Payload => return printBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => return printBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => return printBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => return printBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => return printBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => return printBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => return printBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => return printBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => return printBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => return printBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => return printBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => return printBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => return printBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => return printBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => return printBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => return printBase_TypesBits_Payload(o)
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Factory_Flow.WorkId_Payload => return printFactory_FlowWorkId_Payload(o)
        case o: Factory_Flow.Validity_Payload => return printFactory_FlowValidity_Payload(o)
        case o: Factory_Flow.FlowStep_Payload => return printFactory_FlowFlowStep_Payload(o)
        case o: Factory_Flow.IntentKind_Payload => return printFactory_FlowIntentKind_Payload(o)
        case o: Factory_Flow.AttemptKind_Payload => return printFactory_FlowAttemptKind_Payload(o)
        case o: Factory_Flow.ProductKind_Payload => return printFactory_FlowProductKind_Payload(o)
        case o: Factory_Flow.LedgerPhase_Payload => return printFactory_FlowLedgerPhase_Payload(o)
        case o: Factory_Flow.OutcomeFact_Payload => return printFactory_FlowOutcomeFact_Payload(o)
        case o: Factory_Flow.FlowContext_Payload => return printFactory_FlowFlowContext_Payload(o)
        case o: Factory_Flow.ProcessEvent_Payload => return printFactory_FlowProcessEvent_Payload(o)
        case o: Factory_Flow.MaterialFact_Payload => return printFactory_FlowMaterialFact_Payload(o)
        case o: Factory_Flow.FlowDecision_Payload => return printFactory_FlowFlowDecision_Payload(o)
        case o: Factory_Flow.FlowSnapshot_Payload => return printFactory_FlowFlowSnapshot_Payload(o)
        case o: Factory_Flow.CommandAction_Payload => return printFactory_FlowCommandAction_Payload(o)
        case o: Factory_Flow.AdmissionFact_Payload => return printFactory_FlowAdmissionFact_Payload(o)
        case o: Factory_Flow.DecisionReason_Payload => return printFactory_FlowDecisionReason_Payload(o)
        case o: Factory_Flow.FlowIntentFact_Payload => return printFactory_FlowFlowIntentFact_Payload(o)
        case o: Factory_Flow.RequestPresence_Payload => return printFactory_FlowRequestPresence_Payload(o)
        case o: Factory_Flow.StepDisposition_Payload => return printFactory_FlowStepDisposition_Payload(o)
        case o: Factory_Flow.LineFlowCommand_Payload => return printFactory_FlowLineFlowCommand_Payload(o)
        case o: Factory_Flow.ProductionResult_Payload => return printFactory_FlowProductionResult_Payload(o)
        case o: Factory_Flow.ProductionOutcome_Payload => return printFactory_FlowProductionOutcome_Payload(o)
        case o: Factory_Flow.ProtectionContext_Payload => return printFactory_FlowProtectionContext_Payload(o)
        case o: Factory_Flow.AuthorizationFact_Payload => return printFactory_FlowAuthorizationFact_Payload(o)
        case o: Factory_Flow.CompetitorPresence_Payload => return printFactory_FlowCompetitorPresence_Payload(o)
        case o: Factory_Flow.MaterialAssessment_Payload => return printFactory_FlowMaterialAssessment_Payload(o)
        case o: Factory_Flow.MaterialDisposition_Payload => return printFactory_FlowMaterialDisposition_Payload(o)
        case o: Factory_Flow.AdmissionAssessment_Payload => return printFactory_FlowAdmissionAssessment_Payload(o)
        case o: Factory_Flow.TargetQualification_Payload => return printFactory_FlowTargetQualification_Payload(o)
        case o: Factory_Flow.ProductionFlowStatus_Payload => return printFactory_FlowProductionFlowStatus_Payload(o)
        case o: Factory_Flow.PresentedWorkRequest_Payload => return printFactory_FlowPresentedWorkRequest_Payload(o)
        case o: Factory_Flow.CorrelatedOutcomePlan_Payload => return printFactory_FlowCorrelatedOutcomePlan_Payload(o)
        case o: Factory_Flow.StepReadinessObservation_Payload => return printFactory_FlowStepReadinessObservation_Payload(o)
        case o: Factory_Flow.ProcessResultObservation_Payload => return printFactory_FlowProcessResultObservation_Payload(o)
        case o: Factory_Flow.MaterialHandoffObservation_Payload => return printFactory_FlowMaterialHandoffObservation_Payload(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P => return printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS => return printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P => return printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(o)
        case o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS => return printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P => return printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P => return printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS => return printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS => return printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P => return printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P => return printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(o)
        case o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS => return printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(o)
        case o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS => return printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P => return printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS => return printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P => return printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(o)
        case o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS => return printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P => return printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS => return printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P => return printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(o)
        case o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS => return printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P => return printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS => return printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P => return printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(o)
        case o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS => return printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P => return printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P => return printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS => return printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS => return printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P => return printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P => return printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(o)
        case o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS => return printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(o)
        case o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS => return printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P => return printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS => return printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P => return printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(o)
        case o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS => return printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(o)
      }
    }

    @pure def print_artEmpty(o: art.Empty): ST = {
      return printObject(ISZ(
        ("type", st""""art.Empty"""")
      ))
    }

  }

  @record class Parser(val input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

    def parseFactory_FlowRequestPresenceType(): Factory_Flow.RequestPresence.Type = {
      val r = parseFactory_FlowRequestPresenceT(F)
      return r
    }

    def parseFactory_FlowRequestPresenceT(typeParsed: B): Factory_Flow.RequestPresence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.RequestPresence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.RequestPresence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.RequestPresence.")
          return Factory_Flow.RequestPresence.byOrdinal(0).get
      }
    }

    def parseFactory_FlowRequestPresence_Payload(): Factory_Flow.RequestPresence_Payload = {
      val r = parseFactory_FlowRequestPresence_PayloadT(F)
      return r
    }

    def parseFactory_FlowRequestPresence_PayloadT(typeParsed: B): Factory_Flow.RequestPresence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.RequestPresence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowRequestPresenceType()
      parser.parseObjectNext()
      return Factory_Flow.RequestPresence_Payload(value)
    }

    def parseFactory_FlowValidityType(): Factory_Flow.Validity.Type = {
      val r = parseFactory_FlowValidityT(F)
      return r
    }

    def parseFactory_FlowValidityT(typeParsed: B): Factory_Flow.Validity.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.Validity")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.Validity.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.Validity.")
          return Factory_Flow.Validity.byOrdinal(0).get
      }
    }

    def parseFactory_FlowValidity_Payload(): Factory_Flow.Validity_Payload = {
      val r = parseFactory_FlowValidity_PayloadT(F)
      return r
    }

    def parseFactory_FlowValidity_PayloadT(typeParsed: B): Factory_Flow.Validity_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.Validity_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowValidityType()
      parser.parseObjectNext()
      return Factory_Flow.Validity_Payload(value)
    }

    def parseFactory_FlowWorkIdType(): Factory_Flow.WorkId.Type = {
      val r = parseFactory_FlowWorkIdT(F)
      return r
    }

    def parseFactory_FlowWorkIdT(typeParsed: B): Factory_Flow.WorkId.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.WorkId")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.WorkId.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.WorkId.")
          return Factory_Flow.WorkId.byOrdinal(0).get
      }
    }

    def parseFactory_FlowWorkId_Payload(): Factory_Flow.WorkId_Payload = {
      val r = parseFactory_FlowWorkId_PayloadT(F)
      return r
    }

    def parseFactory_FlowWorkId_PayloadT(typeParsed: B): Factory_Flow.WorkId_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.WorkId_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowWorkIdType()
      parser.parseObjectNext()
      return Factory_Flow.WorkId_Payload(value)
    }

    def parseFactory_FlowProductKindType(): Factory_Flow.ProductKind.Type = {
      val r = parseFactory_FlowProductKindT(F)
      return r
    }

    def parseFactory_FlowProductKindT(typeParsed: B): Factory_Flow.ProductKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProductKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.ProductKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.ProductKind.")
          return Factory_Flow.ProductKind.byOrdinal(0).get
      }
    }

    def parseFactory_FlowProductKind_Payload(): Factory_Flow.ProductKind_Payload = {
      val r = parseFactory_FlowProductKind_PayloadT(F)
      return r
    }

    def parseFactory_FlowProductKind_PayloadT(typeParsed: B): Factory_Flow.ProductKind_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProductKind_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowProductKindType()
      parser.parseObjectNext()
      return Factory_Flow.ProductKind_Payload(value)
    }

    def parseFactory_FlowAdmissionAssessmentType(): Factory_Flow.AdmissionAssessment.Type = {
      val r = parseFactory_FlowAdmissionAssessmentT(F)
      return r
    }

    def parseFactory_FlowAdmissionAssessmentT(typeParsed: B): Factory_Flow.AdmissionAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.AdmissionAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.AdmissionAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.AdmissionAssessment.")
          return Factory_Flow.AdmissionAssessment.byOrdinal(0).get
      }
    }

    def parseFactory_FlowAdmissionAssessment_Payload(): Factory_Flow.AdmissionAssessment_Payload = {
      val r = parseFactory_FlowAdmissionAssessment_PayloadT(F)
      return r
    }

    def parseFactory_FlowAdmissionAssessment_PayloadT(typeParsed: B): Factory_Flow.AdmissionAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.AdmissionAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowAdmissionAssessmentType()
      parser.parseObjectNext()
      return Factory_Flow.AdmissionAssessment_Payload(value)
    }

    def parseFactory_FlowMaterialDispositionType(): Factory_Flow.MaterialDisposition.Type = {
      val r = parseFactory_FlowMaterialDispositionT(F)
      return r
    }

    def parseFactory_FlowMaterialDispositionT(typeParsed: B): Factory_Flow.MaterialDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.MaterialDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.MaterialDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.MaterialDisposition.")
          return Factory_Flow.MaterialDisposition.byOrdinal(0).get
      }
    }

    def parseFactory_FlowMaterialDisposition_Payload(): Factory_Flow.MaterialDisposition_Payload = {
      val r = parseFactory_FlowMaterialDisposition_PayloadT(F)
      return r
    }

    def parseFactory_FlowMaterialDisposition_PayloadT(typeParsed: B): Factory_Flow.MaterialDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.MaterialDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowMaterialDispositionType()
      parser.parseObjectNext()
      return Factory_Flow.MaterialDisposition_Payload(value)
    }

    def parseFactory_FlowMaterialAssessmentType(): Factory_Flow.MaterialAssessment.Type = {
      val r = parseFactory_FlowMaterialAssessmentT(F)
      return r
    }

    def parseFactory_FlowMaterialAssessmentT(typeParsed: B): Factory_Flow.MaterialAssessment.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.MaterialAssessment")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.MaterialAssessment.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.MaterialAssessment.")
          return Factory_Flow.MaterialAssessment.byOrdinal(0).get
      }
    }

    def parseFactory_FlowMaterialAssessment_Payload(): Factory_Flow.MaterialAssessment_Payload = {
      val r = parseFactory_FlowMaterialAssessment_PayloadT(F)
      return r
    }

    def parseFactory_FlowMaterialAssessment_PayloadT(typeParsed: B): Factory_Flow.MaterialAssessment_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.MaterialAssessment_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowMaterialAssessmentType()
      parser.parseObjectNext()
      return Factory_Flow.MaterialAssessment_Payload(value)
    }

    def parseFactory_FlowStepDispositionType(): Factory_Flow.StepDisposition.Type = {
      val r = parseFactory_FlowStepDispositionT(F)
      return r
    }

    def parseFactory_FlowStepDispositionT(typeParsed: B): Factory_Flow.StepDisposition.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.StepDisposition")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.StepDisposition.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.StepDisposition.")
          return Factory_Flow.StepDisposition.byOrdinal(0).get
      }
    }

    def parseFactory_FlowStepDisposition_Payload(): Factory_Flow.StepDisposition_Payload = {
      val r = parseFactory_FlowStepDisposition_PayloadT(F)
      return r
    }

    def parseFactory_FlowStepDisposition_PayloadT(typeParsed: B): Factory_Flow.StepDisposition_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.StepDisposition_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowStepDispositionType()
      parser.parseObjectNext()
      return Factory_Flow.StepDisposition_Payload(value)
    }

    def parseFactory_FlowLedgerPhaseType(): Factory_Flow.LedgerPhase.Type = {
      val r = parseFactory_FlowLedgerPhaseT(F)
      return r
    }

    def parseFactory_FlowLedgerPhaseT(typeParsed: B): Factory_Flow.LedgerPhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.LedgerPhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.LedgerPhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.LedgerPhase.")
          return Factory_Flow.LedgerPhase.byOrdinal(0).get
      }
    }

    def parseFactory_FlowLedgerPhase_Payload(): Factory_Flow.LedgerPhase_Payload = {
      val r = parseFactory_FlowLedgerPhase_PayloadT(F)
      return r
    }

    def parseFactory_FlowLedgerPhase_PayloadT(typeParsed: B): Factory_Flow.LedgerPhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.LedgerPhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowLedgerPhaseType()
      parser.parseObjectNext()
      return Factory_Flow.LedgerPhase_Payload(value)
    }

    def parseFactory_FlowAttemptKindType(): Factory_Flow.AttemptKind.Type = {
      val r = parseFactory_FlowAttemptKindT(F)
      return r
    }

    def parseFactory_FlowAttemptKindT(typeParsed: B): Factory_Flow.AttemptKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.AttemptKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.AttemptKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.AttemptKind.")
          return Factory_Flow.AttemptKind.byOrdinal(0).get
      }
    }

    def parseFactory_FlowAttemptKind_Payload(): Factory_Flow.AttemptKind_Payload = {
      val r = parseFactory_FlowAttemptKind_PayloadT(F)
      return r
    }

    def parseFactory_FlowAttemptKind_PayloadT(typeParsed: B): Factory_Flow.AttemptKind_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.AttemptKind_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowAttemptKindType()
      parser.parseObjectNext()
      return Factory_Flow.AttemptKind_Payload(value)
    }

    def parseFactory_FlowTargetQualificationType(): Factory_Flow.TargetQualification.Type = {
      val r = parseFactory_FlowTargetQualificationT(F)
      return r
    }

    def parseFactory_FlowTargetQualificationT(typeParsed: B): Factory_Flow.TargetQualification.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.TargetQualification")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.TargetQualification.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.TargetQualification.")
          return Factory_Flow.TargetQualification.byOrdinal(0).get
      }
    }

    def parseFactory_FlowTargetQualification_Payload(): Factory_Flow.TargetQualification_Payload = {
      val r = parseFactory_FlowTargetQualification_PayloadT(F)
      return r
    }

    def parseFactory_FlowTargetQualification_PayloadT(typeParsed: B): Factory_Flow.TargetQualification_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.TargetQualification_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowTargetQualificationType()
      parser.parseObjectNext()
      return Factory_Flow.TargetQualification_Payload(value)
    }

    def parseFactory_FlowProcessEventType(): Factory_Flow.ProcessEvent.Type = {
      val r = parseFactory_FlowProcessEventT(F)
      return r
    }

    def parseFactory_FlowProcessEventT(typeParsed: B): Factory_Flow.ProcessEvent.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProcessEvent")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.ProcessEvent.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.ProcessEvent.")
          return Factory_Flow.ProcessEvent.byOrdinal(0).get
      }
    }

    def parseFactory_FlowProcessEvent_Payload(): Factory_Flow.ProcessEvent_Payload = {
      val r = parseFactory_FlowProcessEvent_PayloadT(F)
      return r
    }

    def parseFactory_FlowProcessEvent_PayloadT(typeParsed: B): Factory_Flow.ProcessEvent_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProcessEvent_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowProcessEventType()
      parser.parseObjectNext()
      return Factory_Flow.ProcessEvent_Payload(value)
    }

    def parseFactory_FlowCorrelatedOutcomePlanType(): Factory_Flow.CorrelatedOutcomePlan.Type = {
      val r = parseFactory_FlowCorrelatedOutcomePlanT(F)
      return r
    }

    def parseFactory_FlowCorrelatedOutcomePlanT(typeParsed: B): Factory_Flow.CorrelatedOutcomePlan.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.CorrelatedOutcomePlan")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.CorrelatedOutcomePlan.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.CorrelatedOutcomePlan.")
          return Factory_Flow.CorrelatedOutcomePlan.byOrdinal(0).get
      }
    }

    def parseFactory_FlowCorrelatedOutcomePlan_Payload(): Factory_Flow.CorrelatedOutcomePlan_Payload = {
      val r = parseFactory_FlowCorrelatedOutcomePlan_PayloadT(F)
      return r
    }

    def parseFactory_FlowCorrelatedOutcomePlan_PayloadT(typeParsed: B): Factory_Flow.CorrelatedOutcomePlan_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.CorrelatedOutcomePlan_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowCorrelatedOutcomePlanType()
      parser.parseObjectNext()
      return Factory_Flow.CorrelatedOutcomePlan_Payload(value)
    }

    def parseFactory_FlowIntentKindType(): Factory_Flow.IntentKind.Type = {
      val r = parseFactory_FlowIntentKindT(F)
      return r
    }

    def parseFactory_FlowIntentKindT(typeParsed: B): Factory_Flow.IntentKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.IntentKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.IntentKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.IntentKind.")
          return Factory_Flow.IntentKind.byOrdinal(0).get
      }
    }

    def parseFactory_FlowIntentKind_Payload(): Factory_Flow.IntentKind_Payload = {
      val r = parseFactory_FlowIntentKind_PayloadT(F)
      return r
    }

    def parseFactory_FlowIntentKind_PayloadT(typeParsed: B): Factory_Flow.IntentKind_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.IntentKind_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowIntentKindType()
      parser.parseObjectNext()
      return Factory_Flow.IntentKind_Payload(value)
    }

    def parseFactory_FlowCompetitorPresenceType(): Factory_Flow.CompetitorPresence.Type = {
      val r = parseFactory_FlowCompetitorPresenceT(F)
      return r
    }

    def parseFactory_FlowCompetitorPresenceT(typeParsed: B): Factory_Flow.CompetitorPresence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.CompetitorPresence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.CompetitorPresence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.CompetitorPresence.")
          return Factory_Flow.CompetitorPresence.byOrdinal(0).get
      }
    }

    def parseFactory_FlowCompetitorPresence_Payload(): Factory_Flow.CompetitorPresence_Payload = {
      val r = parseFactory_FlowCompetitorPresence_PayloadT(F)
      return r
    }

    def parseFactory_FlowCompetitorPresence_PayloadT(typeParsed: B): Factory_Flow.CompetitorPresence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.CompetitorPresence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowCompetitorPresenceType()
      parser.parseObjectNext()
      return Factory_Flow.CompetitorPresence_Payload(value)
    }

    def parseFactory_FlowFlowDecisionType(): Factory_Flow.FlowDecision.Type = {
      val r = parseFactory_FlowFlowDecisionT(F)
      return r
    }

    def parseFactory_FlowFlowDecisionT(typeParsed: B): Factory_Flow.FlowDecision.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowDecision")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.FlowDecision.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.FlowDecision.")
          return Factory_Flow.FlowDecision.byOrdinal(0).get
      }
    }

    def parseFactory_FlowFlowDecision_Payload(): Factory_Flow.FlowDecision_Payload = {
      val r = parseFactory_FlowFlowDecision_PayloadT(F)
      return r
    }

    def parseFactory_FlowFlowDecision_PayloadT(typeParsed: B): Factory_Flow.FlowDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowFlowDecisionType()
      parser.parseObjectNext()
      return Factory_Flow.FlowDecision_Payload(value)
    }

    def parseFactory_FlowDecisionReasonType(): Factory_Flow.DecisionReason.Type = {
      val r = parseFactory_FlowDecisionReasonT(F)
      return r
    }

    def parseFactory_FlowDecisionReasonT(typeParsed: B): Factory_Flow.DecisionReason.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.DecisionReason")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.DecisionReason.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.DecisionReason.")
          return Factory_Flow.DecisionReason.byOrdinal(0).get
      }
    }

    def parseFactory_FlowDecisionReason_Payload(): Factory_Flow.DecisionReason_Payload = {
      val r = parseFactory_FlowDecisionReason_PayloadT(F)
      return r
    }

    def parseFactory_FlowDecisionReason_PayloadT(typeParsed: B): Factory_Flow.DecisionReason_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.DecisionReason_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowDecisionReasonType()
      parser.parseObjectNext()
      return Factory_Flow.DecisionReason_Payload(value)
    }

    def parseFactory_FlowCommandActionType(): Factory_Flow.CommandAction.Type = {
      val r = parseFactory_FlowCommandActionT(F)
      return r
    }

    def parseFactory_FlowCommandActionT(typeParsed: B): Factory_Flow.CommandAction.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.CommandAction")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.CommandAction.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.CommandAction.")
          return Factory_Flow.CommandAction.byOrdinal(0).get
      }
    }

    def parseFactory_FlowCommandAction_Payload(): Factory_Flow.CommandAction_Payload = {
      val r = parseFactory_FlowCommandAction_PayloadT(F)
      return r
    }

    def parseFactory_FlowCommandAction_PayloadT(typeParsed: B): Factory_Flow.CommandAction_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.CommandAction_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowCommandActionType()
      parser.parseObjectNext()
      return Factory_Flow.CommandAction_Payload(value)
    }

    def parseFactory_FlowProductionResultType(): Factory_Flow.ProductionResult.Type = {
      val r = parseFactory_FlowProductionResultT(F)
      return r
    }

    def parseFactory_FlowProductionResultT(typeParsed: B): Factory_Flow.ProductionResult.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProductionResult")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.ProductionResult.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.ProductionResult.")
          return Factory_Flow.ProductionResult.byOrdinal(0).get
      }
    }

    def parseFactory_FlowProductionResult_Payload(): Factory_Flow.ProductionResult_Payload = {
      val r = parseFactory_FlowProductionResult_PayloadT(F)
      return r
    }

    def parseFactory_FlowProductionResult_PayloadT(typeParsed: B): Factory_Flow.ProductionResult_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProductionResult_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowProductionResultType()
      parser.parseObjectNext()
      return Factory_Flow.ProductionResult_Payload(value)
    }

    def parseFactory_FlowProductionFlowStatusType(): Factory_Flow.ProductionFlowStatus.Type = {
      val r = parseFactory_FlowProductionFlowStatusT(F)
      return r
    }

    def parseFactory_FlowProductionFlowStatusT(typeParsed: B): Factory_Flow.ProductionFlowStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProductionFlowStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.ProductionFlowStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.ProductionFlowStatus.")
          return Factory_Flow.ProductionFlowStatus.byOrdinal(0).get
      }
    }

    def parseFactory_FlowProductionFlowStatus_Payload(): Factory_Flow.ProductionFlowStatus_Payload = {
      val r = parseFactory_FlowProductionFlowStatus_PayloadT(F)
      return r
    }

    def parseFactory_FlowProductionFlowStatus_PayloadT(typeParsed: B): Factory_Flow.ProductionFlowStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProductionFlowStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowProductionFlowStatusType()
      parser.parseObjectNext()
      return Factory_Flow.ProductionFlowStatus_Payload(value)
    }

    def parseFactory_FlowFlowStepType(): Factory_Flow.FlowStep.Type = {
      val r = parseFactory_FlowFlowStepT(F)
      return r
    }

    def parseFactory_FlowFlowStepT(typeParsed: B): Factory_Flow.FlowStep.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowStep")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Factory_Flow.FlowStep.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Factory_Flow.FlowStep.")
          return Factory_Flow.FlowStep.byOrdinal(0).get
      }
    }

    def parseFactory_FlowFlowStep_Payload(): Factory_Flow.FlowStep_Payload = {
      val r = parseFactory_FlowFlowStep_PayloadT(F)
      return r
    }

    def parseFactory_FlowFlowStep_PayloadT(typeParsed: B): Factory_Flow.FlowStep_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowStep_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowFlowStepType()
      parser.parseObjectNext()
      return Factory_Flow.FlowStep_Payload(value)
    }

    def parseFactory_FlowPresentedWorkRequest(): Factory_Flow.PresentedWorkRequest = {
      val r = parseFactory_FlowPresentedWorkRequestT(F)
      return r
    }

    def parseFactory_FlowPresentedWorkRequestT(typeParsed: B): Factory_Flow.PresentedWorkRequest = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.PresentedWorkRequest")
      }
      parser.parseObjectKey("presence")
      val presence = parseFactory_FlowRequestPresenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("validity")
      val validity = parseFactory_FlowValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("work_id")
      val work_id = parseFactory_FlowWorkIdType()
      parser.parseObjectNext()
      parser.parseObjectKey("product")
      val product = parseFactory_FlowProductKindType()
      parser.parseObjectNext()
      return Factory_Flow.PresentedWorkRequest(presence, validity, work_id, product)
    }

    def parseFactory_FlowPresentedWorkRequest_Payload(): Factory_Flow.PresentedWorkRequest_Payload = {
      val r = parseFactory_FlowPresentedWorkRequest_PayloadT(F)
      return r
    }

    def parseFactory_FlowPresentedWorkRequest_PayloadT(typeParsed: B): Factory_Flow.PresentedWorkRequest_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.PresentedWorkRequest_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowPresentedWorkRequest()
      parser.parseObjectNext()
      return Factory_Flow.PresentedWorkRequest_Payload(value)
    }

    def parseFactory_FlowAdmissionFact(): Factory_Flow.AdmissionFact = {
      val r = parseFactory_FlowAdmissionFactT(F)
      return r
    }

    def parseFactory_FlowAdmissionFactT(typeParsed: B): Factory_Flow.AdmissionFact = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.AdmissionFact")
      }
      parser.parseObjectKey("assessment")
      val assessment = parseFactory_FlowAdmissionAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("work_id")
      val work_id = parseFactory_FlowWorkIdType()
      parser.parseObjectNext()
      return Factory_Flow.AdmissionFact(assessment, work_id)
    }

    def parseFactory_FlowAdmissionFact_Payload(): Factory_Flow.AdmissionFact_Payload = {
      val r = parseFactory_FlowAdmissionFact_PayloadT(F)
      return r
    }

    def parseFactory_FlowAdmissionFact_PayloadT(typeParsed: B): Factory_Flow.AdmissionFact_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.AdmissionFact_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowAdmissionFact()
      parser.parseObjectNext()
      return Factory_Flow.AdmissionFact_Payload(value)
    }

    def parseFactory_FlowMaterialHandoffObservation(): Factory_Flow.MaterialHandoffObservation = {
      val r = parseFactory_FlowMaterialHandoffObservationT(F)
      return r
    }

    def parseFactory_FlowMaterialHandoffObservationT(typeParsed: B): Factory_Flow.MaterialHandoffObservation = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.MaterialHandoffObservation")
      }
      parser.parseObjectKey("validity")
      val validity = parseFactory_FlowValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("work_id")
      val work_id = parseFactory_FlowWorkIdType()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseFactory_FlowMaterialDispositionType()
      parser.parseObjectNext()
      return Factory_Flow.MaterialHandoffObservation(validity, work_id, disposition)
    }

    def parseFactory_FlowMaterialHandoffObservation_Payload(): Factory_Flow.MaterialHandoffObservation_Payload = {
      val r = parseFactory_FlowMaterialHandoffObservation_PayloadT(F)
      return r
    }

    def parseFactory_FlowMaterialHandoffObservation_PayloadT(typeParsed: B): Factory_Flow.MaterialHandoffObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.MaterialHandoffObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowMaterialHandoffObservation()
      parser.parseObjectNext()
      return Factory_Flow.MaterialHandoffObservation_Payload(value)
    }

    def parseFactory_FlowMaterialFact(): Factory_Flow.MaterialFact = {
      val r = parseFactory_FlowMaterialFactT(F)
      return r
    }

    def parseFactory_FlowMaterialFactT(typeParsed: B): Factory_Flow.MaterialFact = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.MaterialFact")
      }
      parser.parseObjectKey("assessment")
      val assessment = parseFactory_FlowMaterialAssessmentType()
      parser.parseObjectNext()
      return Factory_Flow.MaterialFact(assessment)
    }

    def parseFactory_FlowMaterialFact_Payload(): Factory_Flow.MaterialFact_Payload = {
      val r = parseFactory_FlowMaterialFact_PayloadT(F)
      return r
    }

    def parseFactory_FlowMaterialFact_PayloadT(typeParsed: B): Factory_Flow.MaterialFact_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.MaterialFact_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowMaterialFact()
      parser.parseObjectNext()
      return Factory_Flow.MaterialFact_Payload(value)
    }

    def parseFactory_FlowStepReadinessObservation(): Factory_Flow.StepReadinessObservation = {
      val r = parseFactory_FlowStepReadinessObservationT(F)
      return r
    }

    def parseFactory_FlowStepReadinessObservationT(typeParsed: B): Factory_Flow.StepReadinessObservation = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.StepReadinessObservation")
      }
      parser.parseObjectKey("validity")
      val validity = parseFactory_FlowValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("step")
      val step = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("disposition")
      val disposition = parseFactory_FlowStepDispositionType()
      parser.parseObjectNext()
      return Factory_Flow.StepReadinessObservation(validity, step, disposition)
    }

    def parseFactory_FlowStepReadinessObservation_Payload(): Factory_Flow.StepReadinessObservation_Payload = {
      val r = parseFactory_FlowStepReadinessObservation_PayloadT(F)
      return r
    }

    def parseFactory_FlowStepReadinessObservation_PayloadT(typeParsed: B): Factory_Flow.StepReadinessObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.StepReadinessObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowStepReadinessObservation()
      parser.parseObjectNext()
      return Factory_Flow.StepReadinessObservation_Payload(value)
    }

    def parseFactory_FlowFlowContext(): Factory_Flow.FlowContext = {
      val r = parseFactory_FlowFlowContextT(F)
      return r
    }

    def parseFactory_FlowFlowContextT(typeParsed: B): Factory_Flow.FlowContext = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowContext")
      }
      parser.parseObjectKey("phase")
      val phase = parseFactory_FlowLedgerPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("work_id")
      val work_id = parseFactory_FlowWorkIdType()
      parser.parseObjectNext()
      parser.parseObjectKey("step_value")
      val step_value = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("attempt")
      val attempt = parseFactory_FlowAttemptKindType()
      parser.parseObjectNext()
      return Factory_Flow.FlowContext(phase, work_id, step_value, attempt)
    }

    def parseFactory_FlowFlowContext_Payload(): Factory_Flow.FlowContext_Payload = {
      val r = parseFactory_FlowFlowContext_PayloadT(F)
      return r
    }

    def parseFactory_FlowFlowContext_PayloadT(typeParsed: B): Factory_Flow.FlowContext_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowContext_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowFlowContext()
      parser.parseObjectNext()
      return Factory_Flow.FlowContext_Payload(value)
    }

    def parseFactory_FlowProtectionContext(): Factory_Flow.ProtectionContext = {
      val r = parseFactory_FlowProtectionContextT(F)
      return r
    }

    def parseFactory_FlowProtectionContextT(typeParsed: B): Factory_Flow.ProtectionContext = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProtectionContext")
      }
      parser.parseObjectKey("phase")
      val phase = parseFactory_FlowLedgerPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("work_id")
      val work_id = parseFactory_FlowWorkIdType()
      parser.parseObjectNext()
      parser.parseObjectKey("step_value")
      val step_value = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("attempt")
      val attempt = parseFactory_FlowAttemptKindType()
      parser.parseObjectNext()
      return Factory_Flow.ProtectionContext(phase, work_id, step_value, attempt)
    }

    def parseFactory_FlowProtectionContext_Payload(): Factory_Flow.ProtectionContext_Payload = {
      val r = parseFactory_FlowProtectionContext_PayloadT(F)
      return r
    }

    def parseFactory_FlowProtectionContext_PayloadT(typeParsed: B): Factory_Flow.ProtectionContext_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProtectionContext_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowProtectionContext()
      parser.parseObjectNext()
      return Factory_Flow.ProtectionContext_Payload(value)
    }

    def parseFactory_FlowFlowSnapshot(): Factory_Flow.FlowSnapshot = {
      val r = parseFactory_FlowFlowSnapshotT(F)
      return r
    }

    def parseFactory_FlowFlowSnapshotT(typeParsed: B): Factory_Flow.FlowSnapshot = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowSnapshot")
      }
      parser.parseObjectKey("phase")
      val phase = parseFactory_FlowLedgerPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("work_id")
      val work_id = parseFactory_FlowWorkIdType()
      parser.parseObjectNext()
      parser.parseObjectKey("step_value")
      val step_value = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("attempt")
      val attempt = parseFactory_FlowAttemptKindType()
      parser.parseObjectNext()
      return Factory_Flow.FlowSnapshot(phase, work_id, step_value, attempt)
    }

    def parseFactory_FlowFlowSnapshot_Payload(): Factory_Flow.FlowSnapshot_Payload = {
      val r = parseFactory_FlowFlowSnapshot_PayloadT(F)
      return r
    }

    def parseFactory_FlowFlowSnapshot_PayloadT(typeParsed: B): Factory_Flow.FlowSnapshot_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowSnapshot_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowFlowSnapshot()
      parser.parseObjectNext()
      return Factory_Flow.FlowSnapshot_Payload(value)
    }

    def parseFactory_FlowProcessResultObservation(): Factory_Flow.ProcessResultObservation = {
      val r = parseFactory_FlowProcessResultObservationT(F)
      return r
    }

    def parseFactory_FlowProcessResultObservationT(typeParsed: B): Factory_Flow.ProcessResultObservation = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProcessResultObservation")
      }
      parser.parseObjectKey("validity")
      val validity = parseFactory_FlowValidityType()
      parser.parseObjectNext()
      parser.parseObjectKey("work_id")
      val work_id = parseFactory_FlowWorkIdType()
      parser.parseObjectNext()
      parser.parseObjectKey("step")
      val step = parser.parseS32()
      parser.parseObjectNext()
      parser.parseObjectKey("event_kind")
      val event_kind = parseFactory_FlowProcessEventType()
      parser.parseObjectNext()
      return Factory_Flow.ProcessResultObservation(validity, work_id, step, event_kind)
    }

    def parseFactory_FlowProcessResultObservation_Payload(): Factory_Flow.ProcessResultObservation_Payload = {
      val r = parseFactory_FlowProcessResultObservation_PayloadT(F)
      return r
    }

    def parseFactory_FlowProcessResultObservation_PayloadT(typeParsed: B): Factory_Flow.ProcessResultObservation_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProcessResultObservation_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowProcessResultObservation()
      parser.parseObjectNext()
      return Factory_Flow.ProcessResultObservation_Payload(value)
    }

    def parseFactory_FlowOutcomeFact(): Factory_Flow.OutcomeFact = {
      val r = parseFactory_FlowOutcomeFactT(F)
      return r
    }

    def parseFactory_FlowOutcomeFactT(typeParsed: B): Factory_Flow.OutcomeFact = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.OutcomeFact")
      }
      parser.parseObjectKey("plan")
      val plan = parseFactory_FlowCorrelatedOutcomePlanType()
      parser.parseObjectNext()
      return Factory_Flow.OutcomeFact(plan)
    }

    def parseFactory_FlowOutcomeFact_Payload(): Factory_Flow.OutcomeFact_Payload = {
      val r = parseFactory_FlowOutcomeFact_PayloadT(F)
      return r
    }

    def parseFactory_FlowOutcomeFact_PayloadT(typeParsed: B): Factory_Flow.OutcomeFact_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.OutcomeFact_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowOutcomeFact()
      parser.parseObjectNext()
      return Factory_Flow.OutcomeFact_Payload(value)
    }

    def parseFactory_FlowFlowIntentFact(): Factory_Flow.FlowIntentFact = {
      val r = parseFactory_FlowFlowIntentFactT(F)
      return r
    }

    def parseFactory_FlowFlowIntentFactT(typeParsed: B): Factory_Flow.FlowIntentFact = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowIntentFact")
      }
      parser.parseObjectKey("kind")
      val kind = parseFactory_FlowIntentKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("competitor")
      val competitor = parseFactory_FlowCompetitorPresenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("assessment")
      val assessment = parseFactory_FlowAdmissionAssessmentType()
      parser.parseObjectNext()
      parser.parseObjectKey("phase")
      val phase = parseFactory_FlowLedgerPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("work_id")
      val work_id = parseFactory_FlowWorkIdType()
      parser.parseObjectNext()
      parser.parseObjectKey("step")
      val step = parser.parseS32()
      parser.parseObjectNext()
      return Factory_Flow.FlowIntentFact(kind, competitor, assessment, phase, work_id, step)
    }

    def parseFactory_FlowFlowIntentFact_Payload(): Factory_Flow.FlowIntentFact_Payload = {
      val r = parseFactory_FlowFlowIntentFact_PayloadT(F)
      return r
    }

    def parseFactory_FlowFlowIntentFact_PayloadT(typeParsed: B): Factory_Flow.FlowIntentFact_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowIntentFact_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowFlowIntentFact()
      parser.parseObjectNext()
      return Factory_Flow.FlowIntentFact_Payload(value)
    }

    def parseFactory_FlowAuthorizationFact(): Factory_Flow.AuthorizationFact = {
      val r = parseFactory_FlowAuthorizationFactT(F)
      return r
    }

    def parseFactory_FlowAuthorizationFactT(typeParsed: B): Factory_Flow.AuthorizationFact = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.AuthorizationFact")
      }
      parser.parseObjectKey("decision")
      val decision = parseFactory_FlowFlowDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("reason")
      val reason = parseFactory_FlowDecisionReasonType()
      parser.parseObjectNext()
      parser.parseObjectKey("work_id")
      val work_id = parseFactory_FlowWorkIdType()
      parser.parseObjectNext()
      parser.parseObjectKey("step")
      val step = parser.parseS32()
      parser.parseObjectNext()
      return Factory_Flow.AuthorizationFact(decision, reason, work_id, step)
    }

    def parseFactory_FlowAuthorizationFact_Payload(): Factory_Flow.AuthorizationFact_Payload = {
      val r = parseFactory_FlowAuthorizationFact_PayloadT(F)
      return r
    }

    def parseFactory_FlowAuthorizationFact_PayloadT(typeParsed: B): Factory_Flow.AuthorizationFact_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.AuthorizationFact_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowAuthorizationFact()
      parser.parseObjectNext()
      return Factory_Flow.AuthorizationFact_Payload(value)
    }

    def parseFactory_FlowLineFlowCommand(): Factory_Flow.LineFlowCommand = {
      val r = parseFactory_FlowLineFlowCommandT(F)
      return r
    }

    def parseFactory_FlowLineFlowCommandT(typeParsed: B): Factory_Flow.LineFlowCommand = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.LineFlowCommand")
      }
      parser.parseObjectKey("action_kind")
      val action_kind = parseFactory_FlowCommandActionType()
      parser.parseObjectNext()
      parser.parseObjectKey("work_id")
      val work_id = parseFactory_FlowWorkIdType()
      parser.parseObjectNext()
      parser.parseObjectKey("step")
      val step = parser.parseS32()
      parser.parseObjectNext()
      return Factory_Flow.LineFlowCommand(action_kind, work_id, step)
    }

    def parseFactory_FlowLineFlowCommand_Payload(): Factory_Flow.LineFlowCommand_Payload = {
      val r = parseFactory_FlowLineFlowCommand_PayloadT(F)
      return r
    }

    def parseFactory_FlowLineFlowCommand_PayloadT(typeParsed: B): Factory_Flow.LineFlowCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.LineFlowCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowLineFlowCommand()
      parser.parseObjectNext()
      return Factory_Flow.LineFlowCommand_Payload(value)
    }

    def parseFactory_FlowProductionOutcome(): Factory_Flow.ProductionOutcome = {
      val r = parseFactory_FlowProductionOutcomeT(F)
      return r
    }

    def parseFactory_FlowProductionOutcomeT(typeParsed: B): Factory_Flow.ProductionOutcome = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProductionOutcome")
      }
      parser.parseObjectKey("result")
      val result = parseFactory_FlowProductionResultType()
      parser.parseObjectNext()
      parser.parseObjectKey("work_id")
      val work_id = parseFactory_FlowWorkIdType()
      parser.parseObjectNext()
      return Factory_Flow.ProductionOutcome(result, work_id)
    }

    def parseFactory_FlowProductionOutcome_Payload(): Factory_Flow.ProductionOutcome_Payload = {
      val r = parseFactory_FlowProductionOutcome_PayloadT(F)
      return r
    }

    def parseFactory_FlowProductionOutcome_PayloadT(typeParsed: B): Factory_Flow.ProductionOutcome_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProductionOutcome_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseFactory_FlowProductionOutcome()
      parser.parseObjectNext()
      return Factory_Flow.ProductionOutcome_Payload(value)
    }

    def parseBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = parseBase_TypesBoolean_PayloadT(F)
      return r
    }

    def parseBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Boolean_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseB()
      parser.parseObjectNext()
      return Base_Types.Boolean_Payload(value)
    }

    def parseBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = parseBase_TypesInteger_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseZ()
      parser.parseObjectNext()
      return Base_Types.Integer_Payload(value)
    }

    def parseBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = parseBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS8()
      parser.parseObjectNext()
      return Base_Types.Integer_8_Payload(value)
    }

    def parseBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = parseBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS16()
      parser.parseObjectNext()
      return Base_Types.Integer_16_Payload(value)
    }

    def parseBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = parseBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS32()
      parser.parseObjectNext()
      return Base_Types.Integer_32_Payload(value)
    }

    def parseBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = parseBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS64()
      parser.parseObjectNext()
      return Base_Types.Integer_64_Payload(value)
    }

    def parseBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = parseBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU8()
      parser.parseObjectNext()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def parseBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = parseBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU16()
      parser.parseObjectNext()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def parseBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = parseBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU32()
      parser.parseObjectNext()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def parseBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = parseBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU64()
      parser.parseObjectNext()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def parseBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = parseBase_TypesFloat_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseR()
      parser.parseObjectNext()
      return Base_Types.Float_Payload(value)
    }

    def parseBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = parseBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF32()
      parser.parseObjectNext()
      return Base_Types.Float_32_Payload(value)
    }

    def parseBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = parseBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF64()
      parser.parseObjectNext()
      return Base_Types.Float_64_Payload(value)
    }

    def parseBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = parseBase_TypesCharacter_PayloadT(F)
      return r
    }

    def parseBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Character_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseC()
      parser.parseObjectNext()
      return Base_Types.Character_Payload(value)
    }

    def parseBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = parseBase_TypesString_PayloadT(F)
      return r
    }

    def parseBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.String_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      return Base_Types.String_Payload(value)
    }

    def parseBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = parseBase_TypesBits_PayloadT(F)
      return r
    }

    def parseBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Bits_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseISZ(parser.parseB _)
      parser.parseObjectNext()
      return Base_Types.Bits_Payload(value)
    }

    def parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container(): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P", "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS"))
      t.native match {
        case "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P" => val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PT(T); return r
        case "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS" => val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P = {
      val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PT(F)
      return r
    }

    def parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PT(typeParsed: B): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_presentedWork")
      val api_presentedWork = parseFactory_FlowPresentedWorkRequest()
      parser.parseObjectNext()
      return Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(api_presentedWork)
    }

    def parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS = {
      val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PST(F)
      return r
    }

    def parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PST(typeParsed: B): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_presentedWork")
      val api_presentedWork = parseFactory_FlowPresentedWorkRequest()
      parser.parseObjectNext()
      return Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(api_presentedWork)
    }

    def parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container(): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P", "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS"))
      t.native match {
        case "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P" => val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PT(T); return r
        case "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS" => val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P = {
      val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PT(F)
      return r
    }

    def parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PT(typeParsed: B): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_admissionToMaterial")
      val api_admissionToMaterial = parseFactory_FlowAdmissionFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_admissionToPriority")
      val api_admissionToPriority = parseFactory_FlowAdmissionFact()
      parser.parseObjectNext()
      return Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(api_admissionToMaterial, api_admissionToPriority)
    }

    def parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS = {
      val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PST(F)
      return r
    }

    def parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PST(typeParsed: B): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_admissionToMaterial")
      val api_admissionToMaterial = parseFactory_FlowAdmissionFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_admissionToPriority")
      val api_admissionToPriority = parseFactory_FlowAdmissionFact()
      parser.parseObjectNext()
      return Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(api_admissionToMaterial, api_admissionToPriority)
    }

    def parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container(): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P", "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS"))
      t.native match {
        case "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P" => val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PT(T); return r
        case "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS" => val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P = {
      val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PT(F)
      return r
    }

    def parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PT(typeParsed: B): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_admission")
      val api_admission = parseFactory_FlowAdmissionFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_materialObservation")
      val api_materialObservation = parseFactory_FlowMaterialHandoffObservation()
      parser.parseObjectNext()
      return Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(api_admission, api_materialObservation)
    }

    def parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS = {
      val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PST(F)
      return r
    }

    def parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PST(typeParsed: B): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_admission")
      val api_admission = parseFactory_FlowAdmissionFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_materialObservation")
      val api_materialObservation = parseFactory_FlowMaterialHandoffObservation()
      parser.parseObjectNext()
      return Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(api_admission, api_materialObservation)
    }

    def parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container(): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P", "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS"))
      t.native match {
        case "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P" => val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PT(T); return r
        case "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS" => val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P = {
      val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PT(F)
      return r
    }

    def parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PT(typeParsed: B): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_materialFact")
      val api_materialFact = parseFactory_FlowMaterialFact()
      parser.parseObjectNext()
      return Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(api_materialFact)
    }

    def parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS = {
      val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PST(F)
      return r
    }

    def parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PST(typeParsed: B): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_materialFact")
      val api_materialFact = parseFactory_FlowMaterialFact()
      parser.parseObjectNext()
      return Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(api_materialFact)
    }

    def parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container(): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P", "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS"))
      t.native match {
        case "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P" => val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PT(T); return r
        case "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS" => val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P = {
      val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PT(F)
      return r
    }

    def parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PT(typeParsed: B): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P")
      }
      parser.parseObjectKey("api_flowContext")
      val api_flowContext = parseFactory_FlowFlowContext()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readinessObservation")
      val api_readinessObservation = parseFactory_FlowStepReadinessObservation()
      parser.parseObjectNext()
      return Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(api_flowContext, api_readinessObservation)
    }

    def parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS = {
      val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PST(F)
      return r
    }

    def parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PST(typeParsed: B): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS")
      }
      parser.parseObjectKey("api_flowContext")
      val api_flowContext = parseFactory_FlowFlowContext()
      parser.parseObjectNext()
      parser.parseObjectKey("api_readinessObservation")
      val api_readinessObservation = parseFactory_FlowStepReadinessObservation()
      parser.parseObjectNext()
      return Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(api_flowContext, api_readinessObservation)
    }

    def parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container(): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P", "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS"))
      t.native match {
        case "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P" => val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PT(T); return r
        case "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS" => val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P = {
      val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PT(F)
      return r
    }

    def parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PT(typeParsed: B): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P")
      }
      parser.parseObjectKey("api_targetFact")
      val api_targetFact = parseFactory_FlowTargetQualificationType()
      parser.parseObjectNext()
      return Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(api_targetFact)
    }

    def parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS = {
      val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PST(F)
      return r
    }

    def parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PST(typeParsed: B): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS")
      }
      parser.parseObjectKey("api_targetFact")
      val api_targetFact = parseFactory_FlowTargetQualificationType()
      parser.parseObjectNext()
      return Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(api_targetFact)
    }

    def parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container(): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P", "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS"))
      t.native match {
        case "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P" => val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PT(T); return r
        case "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS" => val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P = {
      val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PT(F)
      return r
    }

    def parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PT(typeParsed: B): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P")
      }
      parser.parseObjectKey("api_flowContext")
      val api_flowContext = parseFactory_FlowFlowContext()
      parser.parseObjectNext()
      parser.parseObjectKey("api_processResult")
      val api_processResult = parseFactory_FlowProcessResultObservation()
      parser.parseObjectNext()
      return Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(api_flowContext, api_processResult)
    }

    def parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS = {
      val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PST(F)
      return r
    }

    def parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PST(typeParsed: B): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS")
      }
      parser.parseObjectKey("api_flowContext")
      val api_flowContext = parseFactory_FlowFlowContext()
      parser.parseObjectNext()
      parser.parseObjectKey("api_processResult")
      val api_processResult = parseFactory_FlowProcessResultObservation()
      parser.parseObjectNext()
      return Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(api_flowContext, api_processResult)
    }

    def parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container(): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P", "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS"))
      t.native match {
        case "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P" => val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PT(T); return r
        case "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS" => val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P = {
      val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PT(F)
      return r
    }

    def parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PT(typeParsed: B): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P")
      }
      parser.parseObjectKey("api_outcomeToAuthorization")
      val api_outcomeToAuthorization = parseFactory_FlowOutcomeFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_outcomeToDeterminer")
      val api_outcomeToDeterminer = parseFactory_FlowOutcomeFact()
      parser.parseObjectNext()
      return Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(api_outcomeToAuthorization, api_outcomeToDeterminer)
    }

    def parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS = {
      val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PST(F)
      return r
    }

    def parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PST(typeParsed: B): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS")
      }
      parser.parseObjectKey("api_outcomeToAuthorization")
      val api_outcomeToAuthorization = parseFactory_FlowOutcomeFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_outcomeToDeterminer")
      val api_outcomeToDeterminer = parseFactory_FlowOutcomeFact()
      parser.parseObjectNext()
      return Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(api_outcomeToAuthorization, api_outcomeToDeterminer)
    }

    def parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container(): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P", "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS"))
      t.native match {
        case "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P" => val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PT(T); return r
        case "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS" => val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P = {
      val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PT(F)
      return r
    }

    def parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PT(typeParsed: B): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P")
      }
      parser.parseObjectKey("api_admission")
      val api_admission = parseFactory_FlowAdmissionFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_protectionContext")
      val api_protectionContext = parseFactory_FlowProtectionContext()
      parser.parseObjectNext()
      return Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(api_admission, api_protectionContext)
    }

    def parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS = {
      val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PST(F)
      return r
    }

    def parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PST(typeParsed: B): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS")
      }
      parser.parseObjectKey("api_admission")
      val api_admission = parseFactory_FlowAdmissionFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_protectionContext")
      val api_protectionContext = parseFactory_FlowProtectionContext()
      parser.parseObjectNext()
      return Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(api_admission, api_protectionContext)
    }

    def parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container(): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P", "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS"))
      t.native match {
        case "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P" => val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PT(T); return r
        case "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS" => val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P = {
      val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PT(F)
      return r
    }

    def parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PT(typeParsed: B): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P")
      }
      parser.parseObjectKey("api_intentFact")
      val api_intentFact = parseFactory_FlowFlowIntentFact()
      parser.parseObjectNext()
      return Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(api_intentFact)
    }

    def parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS = {
      val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PST(F)
      return r
    }

    def parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PST(typeParsed: B): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS")
      }
      parser.parseObjectKey("api_intentFact")
      val api_intentFact = parseFactory_FlowFlowIntentFact()
      parser.parseObjectNext()
      return Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(api_intentFact)
    }

    def parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container(): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P", "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS"))
      t.native match {
        case "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P" => val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PT(T); return r
        case "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS" => val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P = {
      val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PT(F)
      return r
    }

    def parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PT(typeParsed: B): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P")
      }
      parser.parseObjectKey("api_intentFact")
      val api_intentFact = parseFactory_FlowFlowIntentFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_materialFact")
      val api_materialFact = parseFactory_FlowMaterialFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_outcomeFact")
      val api_outcomeFact = parseFactory_FlowOutcomeFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_targetFact")
      val api_targetFact = parseFactory_FlowTargetQualificationType()
      parser.parseObjectNext()
      return Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(api_intentFact, api_materialFact, api_outcomeFact, api_targetFact)
    }

    def parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS = {
      val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PST(F)
      return r
    }

    def parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PST(typeParsed: B): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS")
      }
      parser.parseObjectKey("api_intentFact")
      val api_intentFact = parseFactory_FlowFlowIntentFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_materialFact")
      val api_materialFact = parseFactory_FlowMaterialFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_outcomeFact")
      val api_outcomeFact = parseFactory_FlowOutcomeFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_targetFact")
      val api_targetFact = parseFactory_FlowTargetQualificationType()
      parser.parseObjectNext()
      return Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(api_intentFact, api_materialFact, api_outcomeFact, api_targetFact)
    }

    def parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container(): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P", "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS"))
      t.native match {
        case "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P" => val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PT(T); return r
        case "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS" => val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P = {
      val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PT(F)
      return r
    }

    def parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PT(typeParsed: B): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P")
      }
      parser.parseObjectKey("api_authorization")
      val api_authorization = parseFactory_FlowAuthorizationFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reasonToStatus")
      val api_reasonToStatus = parseFactory_FlowDecisionReasonType()
      parser.parseObjectNext()
      return Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(api_authorization, api_reasonToStatus)
    }

    def parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS = {
      val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PST(F)
      return r
    }

    def parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PST(typeParsed: B): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS")
      }
      parser.parseObjectKey("api_authorization")
      val api_authorization = parseFactory_FlowAuthorizationFact()
      parser.parseObjectNext()
      parser.parseObjectKey("api_reasonToStatus")
      val api_reasonToStatus = parseFactory_FlowDecisionReasonType()
      parser.parseObjectNext()
      return Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(api_authorization, api_reasonToStatus)
    }

    def parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container(): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P", "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS"))
      t.native match {
        case "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P" => val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PT(T); return r
        case "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS" => val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P = {
      val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PT(F)
      return r
    }

    def parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PT(typeParsed: B): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P")
      }
      parser.parseObjectKey("api_authorization")
      val api_authorization = parseFactory_FlowAuthorizationFact()
      parser.parseObjectNext()
      return Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P(api_authorization)
    }

    def parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS = {
      val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PST(F)
      return r
    }

    def parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PST(typeParsed: B): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS")
      }
      parser.parseObjectKey("In_activeStep")
      val In_activeStep = parseFactory_FlowFlowStepType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_activeWork")
      val In_activeWork = parseFactory_FlowWorkIdType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_attempt")
      val In_attempt = parseFactory_FlowAttemptKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_phase")
      val In_phase = parseFactory_FlowLedgerPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_authorization")
      val api_authorization = parseFactory_FlowAuthorizationFact()
      parser.parseObjectNext()
      return Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(In_activeStep, In_activeWork, In_attempt, In_phase, api_authorization)
    }

    def parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container(): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P", "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS"))
      t.native match {
        case "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P" => val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PT(T); return r
        case "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS" => val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P = {
      val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PT(F)
      return r
    }

    def parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PT(typeParsed: B): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P")
      }
      parser.parseObjectKey("api_contextToOutcome")
      val api_contextToOutcome = parseFactory_FlowFlowContext()
      parser.parseObjectNext()
      parser.parseObjectKey("api_contextToReadiness")
      val api_contextToReadiness = parseFactory_FlowFlowContext()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lineCommand")
      val api_lineCommand = parseFactory_FlowLineFlowCommand()
      parser.parseObjectNext()
      parser.parseObjectKey("api_protectionContext")
      val api_protectionContext = parseFactory_FlowProtectionContext()
      parser.parseObjectNext()
      parser.parseObjectKey("api_snapshotToOutcome")
      val api_snapshotToOutcome = parseFactory_FlowFlowSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_snapshotToStatus")
      val api_snapshotToStatus = parseFactory_FlowFlowSnapshot()
      parser.parseObjectNext()
      return Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P(api_contextToOutcome, api_contextToReadiness, api_lineCommand, api_protectionContext, api_snapshotToOutcome, api_snapshotToStatus)
    }

    def parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS = {
      val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PST(F)
      return r
    }

    def parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PST(typeParsed: B): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS")
      }
      parser.parseObjectKey("activeStep")
      val activeStep = parseFactory_FlowFlowStepType()
      parser.parseObjectNext()
      parser.parseObjectKey("activeWork")
      val activeWork = parseFactory_FlowWorkIdType()
      parser.parseObjectNext()
      parser.parseObjectKey("attempt")
      val attempt = parseFactory_FlowAttemptKindType()
      parser.parseObjectNext()
      parser.parseObjectKey("phase")
      val phase = parseFactory_FlowLedgerPhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_contextToOutcome")
      val api_contextToOutcome = parseFactory_FlowFlowContext()
      parser.parseObjectNext()
      parser.parseObjectKey("api_contextToReadiness")
      val api_contextToReadiness = parseFactory_FlowFlowContext()
      parser.parseObjectNext()
      parser.parseObjectKey("api_lineCommand")
      val api_lineCommand = parseFactory_FlowLineFlowCommand()
      parser.parseObjectNext()
      parser.parseObjectKey("api_protectionContext")
      val api_protectionContext = parseFactory_FlowProtectionContext()
      parser.parseObjectNext()
      parser.parseObjectKey("api_snapshotToOutcome")
      val api_snapshotToOutcome = parseFactory_FlowFlowSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_snapshotToStatus")
      val api_snapshotToStatus = parseFactory_FlowFlowSnapshot()
      parser.parseObjectNext()
      return Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(activeStep, activeWork, attempt, phase, api_contextToOutcome, api_contextToReadiness, api_lineCommand, api_protectionContext, api_snapshotToOutcome, api_snapshotToStatus)
    }

    def parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container(): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P", "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS"))
      t.native match {
        case "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P" => val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PT(T); return r
        case "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS" => val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P = {
      val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PT(F)
      return r
    }

    def parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PT(typeParsed: B): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P")
      }
      parser.parseObjectKey("api_appliedSnapshot")
      val api_appliedSnapshot = parseFactory_FlowFlowSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_outcomeFact")
      val api_outcomeFact = parseFactory_FlowOutcomeFact()
      parser.parseObjectNext()
      return Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(api_appliedSnapshot, api_outcomeFact)
    }

    def parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS = {
      val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PST(F)
      return r
    }

    def parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PST(typeParsed: B): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS")
      }
      parser.parseObjectKey("api_appliedSnapshot")
      val api_appliedSnapshot = parseFactory_FlowFlowSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_outcomeFact")
      val api_outcomeFact = parseFactory_FlowOutcomeFact()
      parser.parseObjectNext()
      return Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(api_appliedSnapshot, api_outcomeFact)
    }

    def parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container(): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P", "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS"))
      t.native match {
        case "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P" => val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PT(T); return r
        case "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS" => val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P = {
      val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PT(F)
      return r
    }

    def parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PT(typeParsed: B): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P")
      }
      parser.parseObjectKey("api_productionOutcome")
      val api_productionOutcome = parseFactory_FlowProductionOutcome()
      parser.parseObjectNext()
      return Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(api_productionOutcome)
    }

    def parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS = {
      val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PST(F)
      return r
    }

    def parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PST(typeParsed: B): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS")
      }
      parser.parseObjectKey("api_productionOutcome")
      val api_productionOutcome = parseFactory_FlowProductionOutcome()
      parser.parseObjectNext()
      return Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(api_productionOutcome)
    }

    def parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container(): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P", "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS"))
      t.native match {
        case "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P" => val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PT(T); return r
        case "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS" => val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P = {
      val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PT(F)
      return r
    }

    def parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PT(typeParsed: B): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P")
      }
      parser.parseObjectKey("api_appliedSnapshot")
      val api_appliedSnapshot = parseFactory_FlowFlowSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decisionReason")
      val api_decisionReason = parseFactory_FlowDecisionReasonType()
      parser.parseObjectNext()
      return Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(api_appliedSnapshot, api_decisionReason)
    }

    def parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS = {
      val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PST(F)
      return r
    }

    def parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PST(typeParsed: B): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS")
      }
      parser.parseObjectKey("api_appliedSnapshot")
      val api_appliedSnapshot = parseFactory_FlowFlowSnapshot()
      parser.parseObjectNext()
      parser.parseObjectKey("api_decisionReason")
      val api_decisionReason = parseFactory_FlowDecisionReasonType()
      parser.parseObjectNext()
      return Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(api_appliedSnapshot, api_decisionReason)
    }

    def parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container(): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P", "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS"))
      t.native match {
        case "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P" => val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PT(T); return r
        case "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS" => val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PST(T); return r
      }
    }

    def parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P = {
      val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PT(F)
      return r
    }

    def parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PT(typeParsed: B): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P")
      }
      parser.parseObjectKey("api_flowStatus")
      val api_flowStatus = parseFactory_FlowProductionFlowStatusType()
      parser.parseObjectNext()
      return Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(api_flowStatus)
    }

    def parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS = {
      val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PST(F)
      return r
    }

    def parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PST(typeParsed: B): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS")
      }
      parser.parseObjectKey("api_flowStatus")
      val api_flowStatus = parseFactory_FlowProductionFlowStatusType()
      parser.parseObjectNext()
      return Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(api_flowStatus)
    }

    def parseruntimemonitorObservationKindType(): runtimemonitor.ObservationKind.Type = {
      val r = parseruntimemonitorObservationKindT(F)
      return r
    }

    def parseruntimemonitorObservationKindT(typeParsed: B): runtimemonitor.ObservationKind.Type = {
      if (!typeParsed) {
        parser.parseObjectType("runtimemonitor.ObservationKind")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      runtimemonitor.ObservationKind.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for runtimemonitor.ObservationKind.")
          return runtimemonitor.ObservationKind.byOrdinal(0).get
      }
    }

    def parseutilContainer(): util.Container = {
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P", "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS", "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P", "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS", "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P", "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P", "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS", "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS", "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P", "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P", "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS", "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS", "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P", "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS", "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P", "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS", "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P", "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS", "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P", "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS", "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P", "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS", "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P", "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS", "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P", "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P", "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS", "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS", "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P", "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P", "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS", "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS", "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P", "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS", "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P", "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P" => val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PT(T); return r
        case "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS" => val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PST(T); return r
        case "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P" => val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PT(T); return r
        case "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS" => val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PST(T); return r
        case "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P" => val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PT(T); return r
        case "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P" => val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PT(T); return r
        case "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS" => val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PST(T); return r
        case "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS" => val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PST(T); return r
        case "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P" => val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PT(T); return r
        case "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P" => val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PT(T); return r
        case "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS" => val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PST(T); return r
        case "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS" => val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PST(T); return r
        case "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P" => val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PT(T); return r
        case "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS" => val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PST(T); return r
        case "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P" => val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PT(T); return r
        case "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS" => val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PST(T); return r
        case "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P" => val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PT(T); return r
        case "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS" => val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PST(T); return r
        case "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P" => val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PT(T); return r
        case "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS" => val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PST(T); return r
        case "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P" => val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PT(T); return r
        case "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS" => val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PST(T); return r
        case "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P" => val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PT(T); return r
        case "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS" => val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PST(T); return r
        case "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P" => val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PT(T); return r
        case "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P" => val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PT(T); return r
        case "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS" => val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PST(T); return r
        case "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS" => val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PST(T); return r
        case "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P" => val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PT(T); return r
        case "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P" => val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PT(T); return r
        case "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS" => val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PST(T); return r
        case "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS" => val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PST(T); return r
        case "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P" => val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PT(T); return r
        case "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS" => val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PST(T); return r
        case "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P" => val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PT(T); return r
        case "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS" => val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PST(T); return r
      }
    }

    def parseutilEmptyContainer(): util.EmptyContainer = {
      val r = parseutilEmptyContainerT(F)
      return r
    }

    def parseutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        parser.parseObjectType("util.EmptyContainer")
      }
      return util.EmptyContainer()
    }

    def parse_artDataContent(): art.DataContent = {
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Factory_Flow.WorkId_Payload", "Factory_Flow.Validity_Payload", "Factory_Flow.FlowStep_Payload", "Factory_Flow.IntentKind_Payload", "Factory_Flow.AttemptKind_Payload", "Factory_Flow.ProductKind_Payload", "Factory_Flow.LedgerPhase_Payload", "Factory_Flow.OutcomeFact_Payload", "Factory_Flow.FlowContext_Payload", "Factory_Flow.ProcessEvent_Payload", "Factory_Flow.MaterialFact_Payload", "Factory_Flow.FlowDecision_Payload", "Factory_Flow.FlowSnapshot_Payload", "Factory_Flow.CommandAction_Payload", "Factory_Flow.AdmissionFact_Payload", "Factory_Flow.DecisionReason_Payload", "Factory_Flow.FlowIntentFact_Payload", "Factory_Flow.RequestPresence_Payload", "Factory_Flow.StepDisposition_Payload", "Factory_Flow.LineFlowCommand_Payload", "Factory_Flow.ProductionResult_Payload", "Factory_Flow.ProductionOutcome_Payload", "Factory_Flow.ProtectionContext_Payload", "Factory_Flow.AuthorizationFact_Payload", "Factory_Flow.CompetitorPresence_Payload", "Factory_Flow.MaterialAssessment_Payload", "Factory_Flow.MaterialDisposition_Payload", "Factory_Flow.AdmissionAssessment_Payload", "Factory_Flow.TargetQualification_Payload", "Factory_Flow.ProductionFlowStatus_Payload", "Factory_Flow.PresentedWorkRequest_Payload", "Factory_Flow.CorrelatedOutcomePlan_Payload", "Factory_Flow.StepReadinessObservation_Payload", "Factory_Flow.ProcessResultObservation_Payload", "Factory_Flow.MaterialHandoffObservation_Payload", "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P", "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS", "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P", "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS", "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P", "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P", "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS", "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS", "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P", "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P", "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS", "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS", "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P", "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS", "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P", "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS", "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P", "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS", "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P", "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS", "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P", "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS", "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P", "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS", "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P", "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P", "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS", "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS", "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P", "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P", "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS", "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS", "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P", "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS", "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P", "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS"))
      t.native match {
        case "art.Empty" => val r = parse_artEmptyT(T); return r
        case "Base_Types.Boolean_Payload" => val r = parseBase_TypesBoolean_PayloadT(T); return r
        case "Base_Types.Integer_Payload" => val r = parseBase_TypesInteger_PayloadT(T); return r
        case "Base_Types.Integer_8_Payload" => val r = parseBase_TypesInteger_8_PayloadT(T); return r
        case "Base_Types.Integer_16_Payload" => val r = parseBase_TypesInteger_16_PayloadT(T); return r
        case "Base_Types.Integer_32_Payload" => val r = parseBase_TypesInteger_32_PayloadT(T); return r
        case "Base_Types.Integer_64_Payload" => val r = parseBase_TypesInteger_64_PayloadT(T); return r
        case "Base_Types.Unsigned_8_Payload" => val r = parseBase_TypesUnsigned_8_PayloadT(T); return r
        case "Base_Types.Unsigned_16_Payload" => val r = parseBase_TypesUnsigned_16_PayloadT(T); return r
        case "Base_Types.Unsigned_32_Payload" => val r = parseBase_TypesUnsigned_32_PayloadT(T); return r
        case "Base_Types.Unsigned_64_Payload" => val r = parseBase_TypesUnsigned_64_PayloadT(T); return r
        case "Base_Types.Float_Payload" => val r = parseBase_TypesFloat_PayloadT(T); return r
        case "Base_Types.Float_32_Payload" => val r = parseBase_TypesFloat_32_PayloadT(T); return r
        case "Base_Types.Float_64_Payload" => val r = parseBase_TypesFloat_64_PayloadT(T); return r
        case "Base_Types.Character_Payload" => val r = parseBase_TypesCharacter_PayloadT(T); return r
        case "Base_Types.String_Payload" => val r = parseBase_TypesString_PayloadT(T); return r
        case "Base_Types.Bits_Payload" => val r = parseBase_TypesBits_PayloadT(T); return r
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Factory_Flow.WorkId_Payload" => val r = parseFactory_FlowWorkId_PayloadT(T); return r
        case "Factory_Flow.Validity_Payload" => val r = parseFactory_FlowValidity_PayloadT(T); return r
        case "Factory_Flow.FlowStep_Payload" => val r = parseFactory_FlowFlowStep_PayloadT(T); return r
        case "Factory_Flow.IntentKind_Payload" => val r = parseFactory_FlowIntentKind_PayloadT(T); return r
        case "Factory_Flow.AttemptKind_Payload" => val r = parseFactory_FlowAttemptKind_PayloadT(T); return r
        case "Factory_Flow.ProductKind_Payload" => val r = parseFactory_FlowProductKind_PayloadT(T); return r
        case "Factory_Flow.LedgerPhase_Payload" => val r = parseFactory_FlowLedgerPhase_PayloadT(T); return r
        case "Factory_Flow.OutcomeFact_Payload" => val r = parseFactory_FlowOutcomeFact_PayloadT(T); return r
        case "Factory_Flow.FlowContext_Payload" => val r = parseFactory_FlowFlowContext_PayloadT(T); return r
        case "Factory_Flow.ProcessEvent_Payload" => val r = parseFactory_FlowProcessEvent_PayloadT(T); return r
        case "Factory_Flow.MaterialFact_Payload" => val r = parseFactory_FlowMaterialFact_PayloadT(T); return r
        case "Factory_Flow.FlowDecision_Payload" => val r = parseFactory_FlowFlowDecision_PayloadT(T); return r
        case "Factory_Flow.FlowSnapshot_Payload" => val r = parseFactory_FlowFlowSnapshot_PayloadT(T); return r
        case "Factory_Flow.CommandAction_Payload" => val r = parseFactory_FlowCommandAction_PayloadT(T); return r
        case "Factory_Flow.AdmissionFact_Payload" => val r = parseFactory_FlowAdmissionFact_PayloadT(T); return r
        case "Factory_Flow.DecisionReason_Payload" => val r = parseFactory_FlowDecisionReason_PayloadT(T); return r
        case "Factory_Flow.FlowIntentFact_Payload" => val r = parseFactory_FlowFlowIntentFact_PayloadT(T); return r
        case "Factory_Flow.RequestPresence_Payload" => val r = parseFactory_FlowRequestPresence_PayloadT(T); return r
        case "Factory_Flow.StepDisposition_Payload" => val r = parseFactory_FlowStepDisposition_PayloadT(T); return r
        case "Factory_Flow.LineFlowCommand_Payload" => val r = parseFactory_FlowLineFlowCommand_PayloadT(T); return r
        case "Factory_Flow.ProductionResult_Payload" => val r = parseFactory_FlowProductionResult_PayloadT(T); return r
        case "Factory_Flow.ProductionOutcome_Payload" => val r = parseFactory_FlowProductionOutcome_PayloadT(T); return r
        case "Factory_Flow.ProtectionContext_Payload" => val r = parseFactory_FlowProtectionContext_PayloadT(T); return r
        case "Factory_Flow.AuthorizationFact_Payload" => val r = parseFactory_FlowAuthorizationFact_PayloadT(T); return r
        case "Factory_Flow.CompetitorPresence_Payload" => val r = parseFactory_FlowCompetitorPresence_PayloadT(T); return r
        case "Factory_Flow.MaterialAssessment_Payload" => val r = parseFactory_FlowMaterialAssessment_PayloadT(T); return r
        case "Factory_Flow.MaterialDisposition_Payload" => val r = parseFactory_FlowMaterialDisposition_PayloadT(T); return r
        case "Factory_Flow.AdmissionAssessment_Payload" => val r = parseFactory_FlowAdmissionAssessment_PayloadT(T); return r
        case "Factory_Flow.TargetQualification_Payload" => val r = parseFactory_FlowTargetQualification_PayloadT(T); return r
        case "Factory_Flow.ProductionFlowStatus_Payload" => val r = parseFactory_FlowProductionFlowStatus_PayloadT(T); return r
        case "Factory_Flow.PresentedWorkRequest_Payload" => val r = parseFactory_FlowPresentedWorkRequest_PayloadT(T); return r
        case "Factory_Flow.CorrelatedOutcomePlan_Payload" => val r = parseFactory_FlowCorrelatedOutcomePlan_PayloadT(T); return r
        case "Factory_Flow.StepReadinessObservation_Payload" => val r = parseFactory_FlowStepReadinessObservation_PayloadT(T); return r
        case "Factory_Flow.ProcessResultObservation_Payload" => val r = parseFactory_FlowProcessResultObservation_PayloadT(T); return r
        case "Factory_Flow.MaterialHandoffObservation_Payload" => val r = parseFactory_FlowMaterialHandoffObservation_PayloadT(T); return r
        case "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P" => val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PT(T); return r
        case "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS" => val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PST(T); return r
        case "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P" => val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PT(T); return r
        case "Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS" => val r = parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PST(T); return r
        case "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P" => val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PT(T); return r
        case "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P" => val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PT(T); return r
        case "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS" => val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PST(T); return r
        case "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS" => val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PST(T); return r
        case "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P" => val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PT(T); return r
        case "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P" => val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PT(T); return r
        case "Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS" => val r = parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PST(T); return r
        case "Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS" => val r = parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PST(T); return r
        case "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P" => val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PT(T); return r
        case "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS" => val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PST(T); return r
        case "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P" => val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PT(T); return r
        case "Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS" => val r = parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PST(T); return r
        case "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P" => val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PT(T); return r
        case "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS" => val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PST(T); return r
        case "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P" => val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PT(T); return r
        case "Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS" => val r = parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PST(T); return r
        case "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P" => val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PT(T); return r
        case "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS" => val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PST(T); return r
        case "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P" => val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PT(T); return r
        case "Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS" => val r = parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PST(T); return r
        case "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P" => val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PT(T); return r
        case "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P" => val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PT(T); return r
        case "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS" => val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PST(T); return r
        case "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS" => val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PST(T); return r
        case "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P" => val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PT(T); return r
        case "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P" => val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PT(T); return r
        case "Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS" => val r = parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PST(T); return r
        case "Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS" => val r = parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PST(T); return r
        case "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P" => val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PT(T); return r
        case "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS" => val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PST(T); return r
        case "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P" => val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PT(T); return r
        case "Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS" => val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PST(T); return r
        case _ => val r = parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PST(T); return r
      }
    }

    def parse_artEmpty(): art.Empty = {
      val r = parse_artEmptyT(F)
      return r
    }

    def parse_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        parser.parseObjectType("art.Empty")
      }
      return art.Empty()
    }

    def eof(): B = {
      val r = parser.eof()
      return r
    }

  }

  def to[T](s: String, f: Parser => T): Either[T, Json.ErrorMsg] = {
    val parser = Parser(s)
    val r = f(parser)
    parser.eof()
    parser.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromFactory_FlowRequestPresence_Payload(o: Factory_Flow.RequestPresence_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowRequestPresence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowRequestPresence_Payload(s: String): Either[Factory_Flow.RequestPresence_Payload, Json.ErrorMsg] = {
    def fFactory_FlowRequestPresence_Payload(parser: Parser): Factory_Flow.RequestPresence_Payload = {
      val r = parser.parseFactory_FlowRequestPresence_Payload()
      return r
    }
    val r = to(s, fFactory_FlowRequestPresence_Payload _)
    return r
  }

  def fromFactory_FlowValidity_Payload(o: Factory_Flow.Validity_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowValidity_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowValidity_Payload(s: String): Either[Factory_Flow.Validity_Payload, Json.ErrorMsg] = {
    def fFactory_FlowValidity_Payload(parser: Parser): Factory_Flow.Validity_Payload = {
      val r = parser.parseFactory_FlowValidity_Payload()
      return r
    }
    val r = to(s, fFactory_FlowValidity_Payload _)
    return r
  }

  def fromFactory_FlowWorkId_Payload(o: Factory_Flow.WorkId_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowWorkId_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowWorkId_Payload(s: String): Either[Factory_Flow.WorkId_Payload, Json.ErrorMsg] = {
    def fFactory_FlowWorkId_Payload(parser: Parser): Factory_Flow.WorkId_Payload = {
      val r = parser.parseFactory_FlowWorkId_Payload()
      return r
    }
    val r = to(s, fFactory_FlowWorkId_Payload _)
    return r
  }

  def fromFactory_FlowProductKind_Payload(o: Factory_Flow.ProductKind_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowProductKind_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProductKind_Payload(s: String): Either[Factory_Flow.ProductKind_Payload, Json.ErrorMsg] = {
    def fFactory_FlowProductKind_Payload(parser: Parser): Factory_Flow.ProductKind_Payload = {
      val r = parser.parseFactory_FlowProductKind_Payload()
      return r
    }
    val r = to(s, fFactory_FlowProductKind_Payload _)
    return r
  }

  def fromFactory_FlowAdmissionAssessment_Payload(o: Factory_Flow.AdmissionAssessment_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowAdmissionAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowAdmissionAssessment_Payload(s: String): Either[Factory_Flow.AdmissionAssessment_Payload, Json.ErrorMsg] = {
    def fFactory_FlowAdmissionAssessment_Payload(parser: Parser): Factory_Flow.AdmissionAssessment_Payload = {
      val r = parser.parseFactory_FlowAdmissionAssessment_Payload()
      return r
    }
    val r = to(s, fFactory_FlowAdmissionAssessment_Payload _)
    return r
  }

  def fromFactory_FlowMaterialDisposition_Payload(o: Factory_Flow.MaterialDisposition_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowMaterialDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowMaterialDisposition_Payload(s: String): Either[Factory_Flow.MaterialDisposition_Payload, Json.ErrorMsg] = {
    def fFactory_FlowMaterialDisposition_Payload(parser: Parser): Factory_Flow.MaterialDisposition_Payload = {
      val r = parser.parseFactory_FlowMaterialDisposition_Payload()
      return r
    }
    val r = to(s, fFactory_FlowMaterialDisposition_Payload _)
    return r
  }

  def fromFactory_FlowMaterialAssessment_Payload(o: Factory_Flow.MaterialAssessment_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowMaterialAssessment_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowMaterialAssessment_Payload(s: String): Either[Factory_Flow.MaterialAssessment_Payload, Json.ErrorMsg] = {
    def fFactory_FlowMaterialAssessment_Payload(parser: Parser): Factory_Flow.MaterialAssessment_Payload = {
      val r = parser.parseFactory_FlowMaterialAssessment_Payload()
      return r
    }
    val r = to(s, fFactory_FlowMaterialAssessment_Payload _)
    return r
  }

  def fromFactory_FlowStepDisposition_Payload(o: Factory_Flow.StepDisposition_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowStepDisposition_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowStepDisposition_Payload(s: String): Either[Factory_Flow.StepDisposition_Payload, Json.ErrorMsg] = {
    def fFactory_FlowStepDisposition_Payload(parser: Parser): Factory_Flow.StepDisposition_Payload = {
      val r = parser.parseFactory_FlowStepDisposition_Payload()
      return r
    }
    val r = to(s, fFactory_FlowStepDisposition_Payload _)
    return r
  }

  def fromFactory_FlowLedgerPhase_Payload(o: Factory_Flow.LedgerPhase_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowLedgerPhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowLedgerPhase_Payload(s: String): Either[Factory_Flow.LedgerPhase_Payload, Json.ErrorMsg] = {
    def fFactory_FlowLedgerPhase_Payload(parser: Parser): Factory_Flow.LedgerPhase_Payload = {
      val r = parser.parseFactory_FlowLedgerPhase_Payload()
      return r
    }
    val r = to(s, fFactory_FlowLedgerPhase_Payload _)
    return r
  }

  def fromFactory_FlowAttemptKind_Payload(o: Factory_Flow.AttemptKind_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowAttemptKind_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowAttemptKind_Payload(s: String): Either[Factory_Flow.AttemptKind_Payload, Json.ErrorMsg] = {
    def fFactory_FlowAttemptKind_Payload(parser: Parser): Factory_Flow.AttemptKind_Payload = {
      val r = parser.parseFactory_FlowAttemptKind_Payload()
      return r
    }
    val r = to(s, fFactory_FlowAttemptKind_Payload _)
    return r
  }

  def fromFactory_FlowTargetQualification_Payload(o: Factory_Flow.TargetQualification_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowTargetQualification_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowTargetQualification_Payload(s: String): Either[Factory_Flow.TargetQualification_Payload, Json.ErrorMsg] = {
    def fFactory_FlowTargetQualification_Payload(parser: Parser): Factory_Flow.TargetQualification_Payload = {
      val r = parser.parseFactory_FlowTargetQualification_Payload()
      return r
    }
    val r = to(s, fFactory_FlowTargetQualification_Payload _)
    return r
  }

  def fromFactory_FlowProcessEvent_Payload(o: Factory_Flow.ProcessEvent_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowProcessEvent_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProcessEvent_Payload(s: String): Either[Factory_Flow.ProcessEvent_Payload, Json.ErrorMsg] = {
    def fFactory_FlowProcessEvent_Payload(parser: Parser): Factory_Flow.ProcessEvent_Payload = {
      val r = parser.parseFactory_FlowProcessEvent_Payload()
      return r
    }
    val r = to(s, fFactory_FlowProcessEvent_Payload _)
    return r
  }

  def fromFactory_FlowCorrelatedOutcomePlan_Payload(o: Factory_Flow.CorrelatedOutcomePlan_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowCorrelatedOutcomePlan_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowCorrelatedOutcomePlan_Payload(s: String): Either[Factory_Flow.CorrelatedOutcomePlan_Payload, Json.ErrorMsg] = {
    def fFactory_FlowCorrelatedOutcomePlan_Payload(parser: Parser): Factory_Flow.CorrelatedOutcomePlan_Payload = {
      val r = parser.parseFactory_FlowCorrelatedOutcomePlan_Payload()
      return r
    }
    val r = to(s, fFactory_FlowCorrelatedOutcomePlan_Payload _)
    return r
  }

  def fromFactory_FlowIntentKind_Payload(o: Factory_Flow.IntentKind_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowIntentKind_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowIntentKind_Payload(s: String): Either[Factory_Flow.IntentKind_Payload, Json.ErrorMsg] = {
    def fFactory_FlowIntentKind_Payload(parser: Parser): Factory_Flow.IntentKind_Payload = {
      val r = parser.parseFactory_FlowIntentKind_Payload()
      return r
    }
    val r = to(s, fFactory_FlowIntentKind_Payload _)
    return r
  }

  def fromFactory_FlowCompetitorPresence_Payload(o: Factory_Flow.CompetitorPresence_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowCompetitorPresence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowCompetitorPresence_Payload(s: String): Either[Factory_Flow.CompetitorPresence_Payload, Json.ErrorMsg] = {
    def fFactory_FlowCompetitorPresence_Payload(parser: Parser): Factory_Flow.CompetitorPresence_Payload = {
      val r = parser.parseFactory_FlowCompetitorPresence_Payload()
      return r
    }
    val r = to(s, fFactory_FlowCompetitorPresence_Payload _)
    return r
  }

  def fromFactory_FlowFlowDecision_Payload(o: Factory_Flow.FlowDecision_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowDecision_Payload(s: String): Either[Factory_Flow.FlowDecision_Payload, Json.ErrorMsg] = {
    def fFactory_FlowFlowDecision_Payload(parser: Parser): Factory_Flow.FlowDecision_Payload = {
      val r = parser.parseFactory_FlowFlowDecision_Payload()
      return r
    }
    val r = to(s, fFactory_FlowFlowDecision_Payload _)
    return r
  }

  def fromFactory_FlowDecisionReason_Payload(o: Factory_Flow.DecisionReason_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowDecisionReason_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowDecisionReason_Payload(s: String): Either[Factory_Flow.DecisionReason_Payload, Json.ErrorMsg] = {
    def fFactory_FlowDecisionReason_Payload(parser: Parser): Factory_Flow.DecisionReason_Payload = {
      val r = parser.parseFactory_FlowDecisionReason_Payload()
      return r
    }
    val r = to(s, fFactory_FlowDecisionReason_Payload _)
    return r
  }

  def fromFactory_FlowCommandAction_Payload(o: Factory_Flow.CommandAction_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowCommandAction_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowCommandAction_Payload(s: String): Either[Factory_Flow.CommandAction_Payload, Json.ErrorMsg] = {
    def fFactory_FlowCommandAction_Payload(parser: Parser): Factory_Flow.CommandAction_Payload = {
      val r = parser.parseFactory_FlowCommandAction_Payload()
      return r
    }
    val r = to(s, fFactory_FlowCommandAction_Payload _)
    return r
  }

  def fromFactory_FlowProductionResult_Payload(o: Factory_Flow.ProductionResult_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowProductionResult_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProductionResult_Payload(s: String): Either[Factory_Flow.ProductionResult_Payload, Json.ErrorMsg] = {
    def fFactory_FlowProductionResult_Payload(parser: Parser): Factory_Flow.ProductionResult_Payload = {
      val r = parser.parseFactory_FlowProductionResult_Payload()
      return r
    }
    val r = to(s, fFactory_FlowProductionResult_Payload _)
    return r
  }

  def fromFactory_FlowProductionFlowStatus_Payload(o: Factory_Flow.ProductionFlowStatus_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowProductionFlowStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProductionFlowStatus_Payload(s: String): Either[Factory_Flow.ProductionFlowStatus_Payload, Json.ErrorMsg] = {
    def fFactory_FlowProductionFlowStatus_Payload(parser: Parser): Factory_Flow.ProductionFlowStatus_Payload = {
      val r = parser.parseFactory_FlowProductionFlowStatus_Payload()
      return r
    }
    val r = to(s, fFactory_FlowProductionFlowStatus_Payload _)
    return r
  }

  def fromFactory_FlowFlowStep_Payload(o: Factory_Flow.FlowStep_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowStep_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowStep_Payload(s: String): Either[Factory_Flow.FlowStep_Payload, Json.ErrorMsg] = {
    def fFactory_FlowFlowStep_Payload(parser: Parser): Factory_Flow.FlowStep_Payload = {
      val r = parser.parseFactory_FlowFlowStep_Payload()
      return r
    }
    val r = to(s, fFactory_FlowFlowStep_Payload _)
    return r
  }

  def fromFactory_FlowPresentedWorkRequest(o: Factory_Flow.PresentedWorkRequest, isCompact: B): String = {
    val st = Printer.printFactory_FlowPresentedWorkRequest(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowPresentedWorkRequest(s: String): Either[Factory_Flow.PresentedWorkRequest, Json.ErrorMsg] = {
    def fFactory_FlowPresentedWorkRequest(parser: Parser): Factory_Flow.PresentedWorkRequest = {
      val r = parser.parseFactory_FlowPresentedWorkRequest()
      return r
    }
    val r = to(s, fFactory_FlowPresentedWorkRequest _)
    return r
  }

  def fromFactory_FlowPresentedWorkRequest_Payload(o: Factory_Flow.PresentedWorkRequest_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowPresentedWorkRequest_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowPresentedWorkRequest_Payload(s: String): Either[Factory_Flow.PresentedWorkRequest_Payload, Json.ErrorMsg] = {
    def fFactory_FlowPresentedWorkRequest_Payload(parser: Parser): Factory_Flow.PresentedWorkRequest_Payload = {
      val r = parser.parseFactory_FlowPresentedWorkRequest_Payload()
      return r
    }
    val r = to(s, fFactory_FlowPresentedWorkRequest_Payload _)
    return r
  }

  def fromFactory_FlowAdmissionFact(o: Factory_Flow.AdmissionFact, isCompact: B): String = {
    val st = Printer.printFactory_FlowAdmissionFact(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowAdmissionFact(s: String): Either[Factory_Flow.AdmissionFact, Json.ErrorMsg] = {
    def fFactory_FlowAdmissionFact(parser: Parser): Factory_Flow.AdmissionFact = {
      val r = parser.parseFactory_FlowAdmissionFact()
      return r
    }
    val r = to(s, fFactory_FlowAdmissionFact _)
    return r
  }

  def fromFactory_FlowAdmissionFact_Payload(o: Factory_Flow.AdmissionFact_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowAdmissionFact_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowAdmissionFact_Payload(s: String): Either[Factory_Flow.AdmissionFact_Payload, Json.ErrorMsg] = {
    def fFactory_FlowAdmissionFact_Payload(parser: Parser): Factory_Flow.AdmissionFact_Payload = {
      val r = parser.parseFactory_FlowAdmissionFact_Payload()
      return r
    }
    val r = to(s, fFactory_FlowAdmissionFact_Payload _)
    return r
  }

  def fromFactory_FlowMaterialHandoffObservation(o: Factory_Flow.MaterialHandoffObservation, isCompact: B): String = {
    val st = Printer.printFactory_FlowMaterialHandoffObservation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowMaterialHandoffObservation(s: String): Either[Factory_Flow.MaterialHandoffObservation, Json.ErrorMsg] = {
    def fFactory_FlowMaterialHandoffObservation(parser: Parser): Factory_Flow.MaterialHandoffObservation = {
      val r = parser.parseFactory_FlowMaterialHandoffObservation()
      return r
    }
    val r = to(s, fFactory_FlowMaterialHandoffObservation _)
    return r
  }

  def fromFactory_FlowMaterialHandoffObservation_Payload(o: Factory_Flow.MaterialHandoffObservation_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowMaterialHandoffObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowMaterialHandoffObservation_Payload(s: String): Either[Factory_Flow.MaterialHandoffObservation_Payload, Json.ErrorMsg] = {
    def fFactory_FlowMaterialHandoffObservation_Payload(parser: Parser): Factory_Flow.MaterialHandoffObservation_Payload = {
      val r = parser.parseFactory_FlowMaterialHandoffObservation_Payload()
      return r
    }
    val r = to(s, fFactory_FlowMaterialHandoffObservation_Payload _)
    return r
  }

  def fromFactory_FlowMaterialFact(o: Factory_Flow.MaterialFact, isCompact: B): String = {
    val st = Printer.printFactory_FlowMaterialFact(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowMaterialFact(s: String): Either[Factory_Flow.MaterialFact, Json.ErrorMsg] = {
    def fFactory_FlowMaterialFact(parser: Parser): Factory_Flow.MaterialFact = {
      val r = parser.parseFactory_FlowMaterialFact()
      return r
    }
    val r = to(s, fFactory_FlowMaterialFact _)
    return r
  }

  def fromFactory_FlowMaterialFact_Payload(o: Factory_Flow.MaterialFact_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowMaterialFact_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowMaterialFact_Payload(s: String): Either[Factory_Flow.MaterialFact_Payload, Json.ErrorMsg] = {
    def fFactory_FlowMaterialFact_Payload(parser: Parser): Factory_Flow.MaterialFact_Payload = {
      val r = parser.parseFactory_FlowMaterialFact_Payload()
      return r
    }
    val r = to(s, fFactory_FlowMaterialFact_Payload _)
    return r
  }

  def fromFactory_FlowStepReadinessObservation(o: Factory_Flow.StepReadinessObservation, isCompact: B): String = {
    val st = Printer.printFactory_FlowStepReadinessObservation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowStepReadinessObservation(s: String): Either[Factory_Flow.StepReadinessObservation, Json.ErrorMsg] = {
    def fFactory_FlowStepReadinessObservation(parser: Parser): Factory_Flow.StepReadinessObservation = {
      val r = parser.parseFactory_FlowStepReadinessObservation()
      return r
    }
    val r = to(s, fFactory_FlowStepReadinessObservation _)
    return r
  }

  def fromFactory_FlowStepReadinessObservation_Payload(o: Factory_Flow.StepReadinessObservation_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowStepReadinessObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowStepReadinessObservation_Payload(s: String): Either[Factory_Flow.StepReadinessObservation_Payload, Json.ErrorMsg] = {
    def fFactory_FlowStepReadinessObservation_Payload(parser: Parser): Factory_Flow.StepReadinessObservation_Payload = {
      val r = parser.parseFactory_FlowStepReadinessObservation_Payload()
      return r
    }
    val r = to(s, fFactory_FlowStepReadinessObservation_Payload _)
    return r
  }

  def fromFactory_FlowFlowContext(o: Factory_Flow.FlowContext, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowContext(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowContext(s: String): Either[Factory_Flow.FlowContext, Json.ErrorMsg] = {
    def fFactory_FlowFlowContext(parser: Parser): Factory_Flow.FlowContext = {
      val r = parser.parseFactory_FlowFlowContext()
      return r
    }
    val r = to(s, fFactory_FlowFlowContext _)
    return r
  }

  def fromFactory_FlowFlowContext_Payload(o: Factory_Flow.FlowContext_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowContext_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowContext_Payload(s: String): Either[Factory_Flow.FlowContext_Payload, Json.ErrorMsg] = {
    def fFactory_FlowFlowContext_Payload(parser: Parser): Factory_Flow.FlowContext_Payload = {
      val r = parser.parseFactory_FlowFlowContext_Payload()
      return r
    }
    val r = to(s, fFactory_FlowFlowContext_Payload _)
    return r
  }

  def fromFactory_FlowProtectionContext(o: Factory_Flow.ProtectionContext, isCompact: B): String = {
    val st = Printer.printFactory_FlowProtectionContext(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProtectionContext(s: String): Either[Factory_Flow.ProtectionContext, Json.ErrorMsg] = {
    def fFactory_FlowProtectionContext(parser: Parser): Factory_Flow.ProtectionContext = {
      val r = parser.parseFactory_FlowProtectionContext()
      return r
    }
    val r = to(s, fFactory_FlowProtectionContext _)
    return r
  }

  def fromFactory_FlowProtectionContext_Payload(o: Factory_Flow.ProtectionContext_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowProtectionContext_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProtectionContext_Payload(s: String): Either[Factory_Flow.ProtectionContext_Payload, Json.ErrorMsg] = {
    def fFactory_FlowProtectionContext_Payload(parser: Parser): Factory_Flow.ProtectionContext_Payload = {
      val r = parser.parseFactory_FlowProtectionContext_Payload()
      return r
    }
    val r = to(s, fFactory_FlowProtectionContext_Payload _)
    return r
  }

  def fromFactory_FlowFlowSnapshot(o: Factory_Flow.FlowSnapshot, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowSnapshot(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowSnapshot(s: String): Either[Factory_Flow.FlowSnapshot, Json.ErrorMsg] = {
    def fFactory_FlowFlowSnapshot(parser: Parser): Factory_Flow.FlowSnapshot = {
      val r = parser.parseFactory_FlowFlowSnapshot()
      return r
    }
    val r = to(s, fFactory_FlowFlowSnapshot _)
    return r
  }

  def fromFactory_FlowFlowSnapshot_Payload(o: Factory_Flow.FlowSnapshot_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowSnapshot_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowSnapshot_Payload(s: String): Either[Factory_Flow.FlowSnapshot_Payload, Json.ErrorMsg] = {
    def fFactory_FlowFlowSnapshot_Payload(parser: Parser): Factory_Flow.FlowSnapshot_Payload = {
      val r = parser.parseFactory_FlowFlowSnapshot_Payload()
      return r
    }
    val r = to(s, fFactory_FlowFlowSnapshot_Payload _)
    return r
  }

  def fromFactory_FlowProcessResultObservation(o: Factory_Flow.ProcessResultObservation, isCompact: B): String = {
    val st = Printer.printFactory_FlowProcessResultObservation(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProcessResultObservation(s: String): Either[Factory_Flow.ProcessResultObservation, Json.ErrorMsg] = {
    def fFactory_FlowProcessResultObservation(parser: Parser): Factory_Flow.ProcessResultObservation = {
      val r = parser.parseFactory_FlowProcessResultObservation()
      return r
    }
    val r = to(s, fFactory_FlowProcessResultObservation _)
    return r
  }

  def fromFactory_FlowProcessResultObservation_Payload(o: Factory_Flow.ProcessResultObservation_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowProcessResultObservation_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProcessResultObservation_Payload(s: String): Either[Factory_Flow.ProcessResultObservation_Payload, Json.ErrorMsg] = {
    def fFactory_FlowProcessResultObservation_Payload(parser: Parser): Factory_Flow.ProcessResultObservation_Payload = {
      val r = parser.parseFactory_FlowProcessResultObservation_Payload()
      return r
    }
    val r = to(s, fFactory_FlowProcessResultObservation_Payload _)
    return r
  }

  def fromFactory_FlowOutcomeFact(o: Factory_Flow.OutcomeFact, isCompact: B): String = {
    val st = Printer.printFactory_FlowOutcomeFact(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowOutcomeFact(s: String): Either[Factory_Flow.OutcomeFact, Json.ErrorMsg] = {
    def fFactory_FlowOutcomeFact(parser: Parser): Factory_Flow.OutcomeFact = {
      val r = parser.parseFactory_FlowOutcomeFact()
      return r
    }
    val r = to(s, fFactory_FlowOutcomeFact _)
    return r
  }

  def fromFactory_FlowOutcomeFact_Payload(o: Factory_Flow.OutcomeFact_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowOutcomeFact_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowOutcomeFact_Payload(s: String): Either[Factory_Flow.OutcomeFact_Payload, Json.ErrorMsg] = {
    def fFactory_FlowOutcomeFact_Payload(parser: Parser): Factory_Flow.OutcomeFact_Payload = {
      val r = parser.parseFactory_FlowOutcomeFact_Payload()
      return r
    }
    val r = to(s, fFactory_FlowOutcomeFact_Payload _)
    return r
  }

  def fromFactory_FlowFlowIntentFact(o: Factory_Flow.FlowIntentFact, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowIntentFact(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowIntentFact(s: String): Either[Factory_Flow.FlowIntentFact, Json.ErrorMsg] = {
    def fFactory_FlowFlowIntentFact(parser: Parser): Factory_Flow.FlowIntentFact = {
      val r = parser.parseFactory_FlowFlowIntentFact()
      return r
    }
    val r = to(s, fFactory_FlowFlowIntentFact _)
    return r
  }

  def fromFactory_FlowFlowIntentFact_Payload(o: Factory_Flow.FlowIntentFact_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowIntentFact_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowIntentFact_Payload(s: String): Either[Factory_Flow.FlowIntentFact_Payload, Json.ErrorMsg] = {
    def fFactory_FlowFlowIntentFact_Payload(parser: Parser): Factory_Flow.FlowIntentFact_Payload = {
      val r = parser.parseFactory_FlowFlowIntentFact_Payload()
      return r
    }
    val r = to(s, fFactory_FlowFlowIntentFact_Payload _)
    return r
  }

  def fromFactory_FlowAuthorizationFact(o: Factory_Flow.AuthorizationFact, isCompact: B): String = {
    val st = Printer.printFactory_FlowAuthorizationFact(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowAuthorizationFact(s: String): Either[Factory_Flow.AuthorizationFact, Json.ErrorMsg] = {
    def fFactory_FlowAuthorizationFact(parser: Parser): Factory_Flow.AuthorizationFact = {
      val r = parser.parseFactory_FlowAuthorizationFact()
      return r
    }
    val r = to(s, fFactory_FlowAuthorizationFact _)
    return r
  }

  def fromFactory_FlowAuthorizationFact_Payload(o: Factory_Flow.AuthorizationFact_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowAuthorizationFact_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowAuthorizationFact_Payload(s: String): Either[Factory_Flow.AuthorizationFact_Payload, Json.ErrorMsg] = {
    def fFactory_FlowAuthorizationFact_Payload(parser: Parser): Factory_Flow.AuthorizationFact_Payload = {
      val r = parser.parseFactory_FlowAuthorizationFact_Payload()
      return r
    }
    val r = to(s, fFactory_FlowAuthorizationFact_Payload _)
    return r
  }

  def fromFactory_FlowLineFlowCommand(o: Factory_Flow.LineFlowCommand, isCompact: B): String = {
    val st = Printer.printFactory_FlowLineFlowCommand(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowLineFlowCommand(s: String): Either[Factory_Flow.LineFlowCommand, Json.ErrorMsg] = {
    def fFactory_FlowLineFlowCommand(parser: Parser): Factory_Flow.LineFlowCommand = {
      val r = parser.parseFactory_FlowLineFlowCommand()
      return r
    }
    val r = to(s, fFactory_FlowLineFlowCommand _)
    return r
  }

  def fromFactory_FlowLineFlowCommand_Payload(o: Factory_Flow.LineFlowCommand_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowLineFlowCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowLineFlowCommand_Payload(s: String): Either[Factory_Flow.LineFlowCommand_Payload, Json.ErrorMsg] = {
    def fFactory_FlowLineFlowCommand_Payload(parser: Parser): Factory_Flow.LineFlowCommand_Payload = {
      val r = parser.parseFactory_FlowLineFlowCommand_Payload()
      return r
    }
    val r = to(s, fFactory_FlowLineFlowCommand_Payload _)
    return r
  }

  def fromFactory_FlowProductionOutcome(o: Factory_Flow.ProductionOutcome, isCompact: B): String = {
    val st = Printer.printFactory_FlowProductionOutcome(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProductionOutcome(s: String): Either[Factory_Flow.ProductionOutcome, Json.ErrorMsg] = {
    def fFactory_FlowProductionOutcome(parser: Parser): Factory_Flow.ProductionOutcome = {
      val r = parser.parseFactory_FlowProductionOutcome()
      return r
    }
    val r = to(s, fFactory_FlowProductionOutcome _)
    return r
  }

  def fromFactory_FlowProductionOutcome_Payload(o: Factory_Flow.ProductionOutcome_Payload, isCompact: B): String = {
    val st = Printer.printFactory_FlowProductionOutcome_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProductionOutcome_Payload(s: String): Either[Factory_Flow.ProductionOutcome_Payload, Json.ErrorMsg] = {
    def fFactory_FlowProductionOutcome_Payload(parser: Parser): Factory_Flow.ProductionOutcome_Payload = {
      val r = parser.parseFactory_FlowProductionOutcome_Payload()
      return r
    }
    val r = to(s, fFactory_FlowProductionOutcome_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBoolean_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBoolean_Payload(s: String): Either[Base_Types.Boolean_Payload, Json.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(parser: Parser): Base_Types.Boolean_Payload = {
      val r = parser.parseBase_TypesBoolean_Payload()
      return r
    }
    val r = to(s, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_Payload(s: String): Either[Base_Types.Integer_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_Payload(parser: Parser): Base_Types.Integer_Payload = {
      val r = parser.parseBase_TypesInteger_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_8_Payload(s: String): Either[Base_Types.Integer_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(parser: Parser): Base_Types.Integer_8_Payload = {
      val r = parser.parseBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_16_Payload(s: String): Either[Base_Types.Integer_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(parser: Parser): Base_Types.Integer_16_Payload = {
      val r = parser.parseBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_32_Payload(s: String): Either[Base_Types.Integer_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(parser: Parser): Base_Types.Integer_32_Payload = {
      val r = parser.parseBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_64_Payload(s: String): Either[Base_Types.Integer_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(parser: Parser): Base_Types.Integer_64_Payload = {
      val r = parser.parseBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_8_Payload(s: String): Either[Base_Types.Unsigned_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(parser: Parser): Base_Types.Unsigned_8_Payload = {
      val r = parser.parseBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_16_Payload(s: String): Either[Base_Types.Unsigned_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(parser: Parser): Base_Types.Unsigned_16_Payload = {
      val r = parser.parseBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_32_Payload(s: String): Either[Base_Types.Unsigned_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(parser: Parser): Base_Types.Unsigned_32_Payload = {
      val r = parser.parseBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_64_Payload(s: String): Either[Base_Types.Unsigned_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(parser: Parser): Base_Types.Unsigned_64_Payload = {
      val r = parser.parseBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_Payload(s: String): Either[Base_Types.Float_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_Payload(parser: Parser): Base_Types.Float_Payload = {
      val r = parser.parseBase_TypesFloat_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_32_Payload(s: String): Either[Base_Types.Float_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(parser: Parser): Base_Types.Float_32_Payload = {
      val r = parser.parseBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_64_Payload(s: String): Either[Base_Types.Float_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(parser: Parser): Base_Types.Float_64_Payload = {
      val r = parser.parseBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesCharacter_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesCharacter_Payload(s: String): Either[Base_Types.Character_Payload, Json.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(parser: Parser): Base_Types.Character_Payload = {
      val r = parser.parseBase_TypesCharacter_Payload()
      return r
    }
    val r = to(s, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesString_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesString_Payload(s: String): Either[Base_Types.String_Payload, Json.ErrorMsg] = {
    def fBase_TypesString_Payload(parser: Parser): Base_Types.String_Payload = {
      val r = parser.parseBase_TypesString_Payload()
      return r
    }
    val r = to(s, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBits_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBits_Payload(s: String): Either[Base_Types.Bits_Payload, Json.ErrorMsg] = {
    def fBase_TypesBits_Payload(parser: Parser): Base_Types.Bits_Payload = {
      val r = parser.parseBase_TypesBits_Payload()
      return r
    }
    val r = to(s, fBase_TypesBits_Payload _)
    return r
  }

  def fromFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container(s: String): Either[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container, Json.ErrorMsg] = {
    def fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container(parser: Parser): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container = {
      val r = parser.parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container()
      return r
    }
    val r = to(s, fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container _)
    return r
  }

  def fromFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(s: String): Either[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P(parser: Parser): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P = {
      val r = parser.parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(s: String): Either[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS(parser: Parser): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS = {
      val r = parser.parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container(s: String): Either[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container, Json.ErrorMsg] = {
    def fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container(parser: Parser): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container = {
      val r = parser.parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container()
      return r
    }
    val r = to(s, fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container _)
    return r
  }

  def fromFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(s: String): Either[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P(parser: Parser): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P = {
      val r = parser.parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(o: Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(s: String): Either[Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS(parser: Parser): Factory_Flow.WorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS = {
      val r = parser.parseFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowWorkRequestQualifier_supervisorProcess_workRequestQualifier_PostState_Container_PS _)
    return r
  }

  def fromFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container(s: String): Either[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container, Json.ErrorMsg] = {
    def fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container(parser: Parser): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container = {
      val r = parser.parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container()
      return r
    }
    val r = to(s, fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container _)
    return r
  }

  def fromFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(s: String): Either[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P(parser: Parser): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P = {
      val r = parser.parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(s: String): Either[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS(parser: Parser): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS = {
      val r = parser.parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container(s: String): Either[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container, Json.ErrorMsg] = {
    def fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container(parser: Parser): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container = {
      val r = parser.parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container()
      return r
    }
    val r = to(s, fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container _)
    return r
  }

  def fromFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(s: String): Either[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P(parser: Parser): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P = {
      val r = parser.parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(o: Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(s: String): Either[Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS(parser: Parser): Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS = {
      val r = parser.parseFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowMaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_PostState_Container_PS _)
    return r
  }

  def fromFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container(s: String): Either[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container, Json.ErrorMsg] = {
    def fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container(parser: Parser): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container = {
      val r = parser.parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container()
      return r
    }
    val r = to(s, fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container _)
    return r
  }

  def fromFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(s: String): Either[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P(parser: Parser): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P = {
      val r = parser.parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(s: String): Either[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS(parser: Parser): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS = {
      val r = parser.parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container(s: String): Either[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container, Json.ErrorMsg] = {
    def fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container(parser: Parser): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container = {
      val r = parser.parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container()
      return r
    }
    val r = to(s, fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container _)
    return r
  }

  def fromFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(s: String): Either[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P(parser: Parser): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P = {
      val r = parser.parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(o: Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(s: String): Either[Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS(parser: Parser): Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS = {
      val r = parser.parseFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowTargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_PostState_Container_PS _)
    return r
  }

  def fromFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container(s: String): Either[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container, Json.ErrorMsg] = {
    def fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container(parser: Parser): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container = {
      val r = parser.parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container()
      return r
    }
    val r = to(s, fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container _)
    return r
  }

  def fromFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(s: String): Either[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P(parser: Parser): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P = {
      val r = parser.parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(s: String): Either[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS(parser: Parser): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS = {
      val r = parser.parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container(s: String): Either[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container, Json.ErrorMsg] = {
    def fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container(parser: Parser): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container = {
      val r = parser.parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container()
      return r
    }
    val r = to(s, fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container _)
    return r
  }

  def fromFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(s: String): Either[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P(parser: Parser): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P = {
      val r = parser.parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(o: Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(s: String): Either[Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS(parser: Parser): Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS = {
      val r = parser.parseFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_PostState_Container_PS _)
    return r
  }

  def fromFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container(s: String): Either[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container, Json.ErrorMsg] = {
    def fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container(parser: Parser): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container = {
      val r = parser.parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container()
      return r
    }
    val r = to(s, fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container _)
    return r
  }

  def fromFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(s: String): Either[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P(parser: Parser): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P = {
      val r = parser.parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(s: String): Either[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS(parser: Parser): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS = {
      val r = parser.parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container(s: String): Either[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container, Json.ErrorMsg] = {
    def fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container(parser: Parser): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container = {
      val r = parser.parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container()
      return r
    }
    val r = to(s, fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container _)
    return r
  }

  def fromFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(s: String): Either[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P(parser: Parser): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P = {
      val r = parser.parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(o: Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(s: String): Either[Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS(parser: Parser): Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS = {
      val r = parser.parseFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_PostState_Container_PS _)
    return r
  }

  def fromFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container(s: String): Either[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container, Json.ErrorMsg] = {
    def fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container(parser: Parser): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container = {
      val r = parser.parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container()
      return r
    }
    val r = to(s, fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container _)
    return r
  }

  def fromFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(s: String): Either[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P(parser: Parser): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P = {
      val r = parser.parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(s: String): Either[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS(parser: Parser): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS = {
      val r = parser.parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container(s: String): Either[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container, Json.ErrorMsg] = {
    def fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container(parser: Parser): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container = {
      val r = parser.parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container()
      return r
    }
    val r = to(s, fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container _)
    return r
  }

  def fromFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(s: String): Either[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P(parser: Parser): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P = {
      val r = parser.parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(o: Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(s: String): Either[Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS(parser: Parser): Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS = {
      val r = parser.parseFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowFlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_PostState_Container_PS _)
    return r
  }

  def fromFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container(s: String): Either[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container, Json.ErrorMsg] = {
    def fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container(parser: Parser): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container = {
      val r = parser.parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container()
      return r
    }
    val r = to(s, fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container _)
    return r
  }

  def fromFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(s: String): Either[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P(parser: Parser): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_P = {
      val r = parser.parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(s: String): Either[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS(parser: Parser): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PreState_Container_PS = {
      val r = parser.parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container(s: String): Either[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container, Json.ErrorMsg] = {
    def fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container(parser: Parser): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container = {
      val r = parser.parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container()
      return r
    }
    val r = to(s, fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container _)
    return r
  }

  def fromFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(s: String): Either[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P(parser: Parser): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_P = {
      val r = parser.parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(o: Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(s: String): Either[Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS(parser: Parser): Factory_Flow.FlowLedger_supervisorProcess_flowLedger_PostState_Container_PS = {
      val r = parser.parseFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowFlowLedger_supervisorProcess_flowLedger_PostState_Container_PS _)
    return r
  }

  def fromFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container(s: String): Either[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container, Json.ErrorMsg] = {
    def fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container(parser: Parser): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container = {
      val r = parser.parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container()
      return r
    }
    val r = to(s, fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container _)
    return r
  }

  def fromFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(s: String): Either[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P(parser: Parser): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P = {
      val r = parser.parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(s: String): Either[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS(parser: Parser): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS = {
      val r = parser.parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container(s: String): Either[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container, Json.ErrorMsg] = {
    def fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container(parser: Parser): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container = {
      val r = parser.parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container()
      return r
    }
    val r = to(s, fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container _)
    return r
  }

  def fromFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(s: String): Either[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P(parser: Parser): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P = {
      val r = parser.parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(o: Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(s: String): Either[Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS(parser: Parser): Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS = {
      val r = parser.parseFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_PostState_Container_PS _)
    return r
  }

  def fromFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container(s: String): Either[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container, Json.ErrorMsg] = {
    def fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container(parser: Parser): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container = {
      val r = parser.parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container()
      return r
    }
    val r = to(s, fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container _)
    return r
  }

  def fromFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(s: String): Either[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P(parser: Parser): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P = {
      val r = parser.parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_P _)
    return r
  }

  def fromFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(s: String): Either[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS(parser: Parser): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS = {
      val r = parser.parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PreState_Container_PS _)
    return r
  }

  def fromFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container(s: String): Either[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container, Json.ErrorMsg] = {
    def fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container(parser: Parser): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container = {
      val r = parser.parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container()
      return r
    }
    val r = to(s, fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container _)
    return r
  }

  def fromFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(s: String): Either[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P, Json.ErrorMsg] = {
    def fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P(parser: Parser): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P = {
      val r = parser.parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P()
      return r
    }
    val r = to(s, fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_P _)
    return r
  }

  def fromFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(o: Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(s: String): Either[Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS, Json.ErrorMsg] = {
    def fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS(parser: Parser): Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS = {
      val r = parser.parseFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS()
      return r
    }
    val r = to(s, fFactory_FlowFlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, isCompact: B): String = {
    val st = Printer.printutilContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilContainer(s: String): Either[util.Container, Json.ErrorMsg] = {
    def futilContainer(parser: Parser): util.Container = {
      val r = parser.parseutilContainer()
      return r
    }
    val r = to(s, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, isCompact: B): String = {
    val st = Printer.printutilEmptyContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilEmptyContainer(s: String): Either[util.EmptyContainer, Json.ErrorMsg] = {
    def futilEmptyContainer(parser: Parser): util.EmptyContainer = {
      val r = parser.parseutilEmptyContainer()
      return r
    }
    val r = to(s, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, isCompact: B): String = {
    val st = Printer.print_artDataContent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artDataContent(s: String): Either[art.DataContent, Json.ErrorMsg] = {
    def f_artDataContent(parser: Parser): art.DataContent = {
      val r = parser.parse_artDataContent()
      return r
    }
    val r = to(s, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, isCompact: B): String = {
    val st = Printer.print_artEmpty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artEmpty(s: String): Either[art.Empty, Json.ErrorMsg] = {
    def f_artEmpty(parser: Parser): art.Empty = {
      val r = parser.parse_artEmpty()
      return r
    }
    val r = to(s, f_artEmpty _)
    return r
  }

}