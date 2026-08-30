// #Sireum
// @formatter:off

// This file is auto-generated from RequestCommand.scala, RequestToken.scala, GateOutcome.scala, EvaluationTicket.scala, RequestContext.scala, EligibilityStatus.scala, EnergyEvidence.scala, EnergyVerdict.scala, TaggedTicket.scala, CameraEvidence.scala, RadioEvidence.scala, SupportVerdict.scala, EligibilityDecision.scala, ObservationProgress.scala, ObservationAuthorization.scala, RequestState.scala, LastAcceptedToken.scala, GatePhase.scala, RequestInput.scala, TaggedEnergyVerdict.scala, TaggedSupportVerdict.scala, Base_Types.scala, RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_Containers.scala, EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_Containers.scala, ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_Containers.scala, EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_Containers.scala, AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_Containers.scala, ObservationKind.scala, Container.scala, DataContent.scala, Aux_Types.scala

package forest_observation_eligibility_supervisor

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printForest_Observation_Eligibility_SupervisorRequestCommandType(o: Forest_Observation_Eligibility_Supervisor.RequestCommand.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.RequestCommand.NoCommand => "NoCommand"
        case Forest_Observation_Eligibility_Supervisor.RequestCommand.Begin => "Begin"
        case Forest_Observation_Eligibility_Supervisor.RequestCommand.Cancel => "Cancel"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.RequestCommand")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorRequestCommand_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorRequestCommandType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorRequestTokenType(o: Forest_Observation_Eligibility_Supervisor.RequestToken.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.RequestToken.TokenA => "TokenA"
        case Forest_Observation_Eligibility_Supervisor.RequestToken.TokenB => "TokenB"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.RequestToken")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorRequestToken_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestToken_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.RequestToken_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorRequestTokenType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorGateOutcomeType(o: Forest_Observation_Eligibility_Supervisor.GateOutcome.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.GateOutcome.None => "None"
        case Forest_Observation_Eligibility_Supervisor.GateOutcome.DeniedPower => "DeniedPower"
        case Forest_Observation_Eligibility_Supervisor.GateOutcome.DeniedSupport => "DeniedSupport"
        case Forest_Observation_Eligibility_Supervisor.GateOutcome.Authorized => "Authorized"
        case Forest_Observation_Eligibility_Supervisor.GateOutcome.Active => "Active"
        case Forest_Observation_Eligibility_Supervisor.GateOutcome.Cancelled => "Cancelled"
        case Forest_Observation_Eligibility_Supervisor.GateOutcome.Completed => "Completed"
        case Forest_Observation_Eligibility_Supervisor.GateOutcome.Failed => "Failed"
        case Forest_Observation_Eligibility_Supervisor.GateOutcome.Recovered => "Recovered"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.GateOutcome")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorGateOutcome_Payload(o: Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorGateOutcomeType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEvaluationTicketType(o: Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket => "NoTicket"
        case Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenA => "TokenA"
        case Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenB => "TokenB"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.EvaluationTicket")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload(o: Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorRequestContextType(o: Forest_Observation_Eligibility_Supervisor.RequestContext.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext => "NoContext"
        case Forest_Observation_Eligibility_Supervisor.RequestContext.EvaluateTokenA => "EvaluateTokenA"
        case Forest_Observation_Eligibility_Supervisor.RequestContext.EvaluateTokenB => "EvaluateTokenB"
        case Forest_Observation_Eligibility_Supervisor.RequestContext.CancelOutstanding => "CancelOutstanding"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.RequestContext")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorRequestContext_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestContext_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.RequestContext_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorRequestContextType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEligibilityStatusType(o: Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Idle => "Idle"
        case Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Evaluating => "Evaluating"
        case Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Authorized => "Authorized"
        case Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Active => "Active"
        case Forest_Observation_Eligibility_Supervisor.EligibilityStatus.DeniedPower => "DeniedPower"
        case Forest_Observation_Eligibility_Supervisor.EligibilityStatus.DeniedSupport => "DeniedSupport"
        case Forest_Observation_Eligibility_Supervisor.EligibilityStatus.DuplicateIgnored => "DuplicateIgnored"
        case Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Busy => "Busy"
        case Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Cancelled => "Cancelled"
        case Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Completed => "Completed"
        case Forest_Observation_Eligibility_Supervisor.EligibilityStatus.ServiceFailed => "ServiceFailed"
        case Forest_Observation_Eligibility_Supervisor.EligibilityStatus.AwaitingRecovery => "AwaitingRecovery"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.EligibilityStatus")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload(o: Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorEligibilityStatusType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEnergyEvidenceType(o: Forest_Observation_Eligibility_Supervisor.EnergyEvidence.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.EnergyEvidence.AdequateCurrent => "AdequateCurrent"
        case Forest_Observation_Eligibility_Supervisor.EnergyEvidence.LowCurrent => "LowCurrent"
        case Forest_Observation_Eligibility_Supervisor.EnergyEvidence.UnknownCurrent => "UnknownCurrent"
        case Forest_Observation_Eligibility_Supervisor.EnergyEvidence.Invalid => "Invalid"
        case Forest_Observation_Eligibility_Supervisor.EnergyEvidence.Stale => "Stale"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.EnergyEvidence")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload(o: Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorEnergyEvidenceType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEnergyVerdictType(o: Forest_Observation_Eligibility_Supervisor.EnergyVerdict.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.EnergyVerdict.NoEnergyVerdict => "NoEnergyVerdict"
        case Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyReady => "EnergyReady"
        case Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyInsufficient => "EnergyInsufficient"
        case Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyUntrusted => "EnergyUntrusted"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.EnergyVerdict")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload(o: Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorEnergyVerdictType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorTaggedTicketType(o: Forest_Observation_Eligibility_Supervisor.TaggedTicket.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.TaggedTicket.NoTicket => "NoTicket"
        case Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenA => "TokenA"
        case Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenB => "TokenB"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.TaggedTicket")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorTaggedTicket_Payload(o: Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorTaggedTicketType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorCameraEvidenceType(o: Forest_Observation_Eligibility_Supervisor.CameraEvidence.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.CameraEvidence.AvailableCurrent => "AvailableCurrent"
        case Forest_Observation_Eligibility_Supervisor.CameraEvidence.UnavailableCurrent => "UnavailableCurrent"
        case Forest_Observation_Eligibility_Supervisor.CameraEvidence.UnknownCurrent => "UnknownCurrent"
        case Forest_Observation_Eligibility_Supervisor.CameraEvidence.Invalid => "Invalid"
        case Forest_Observation_Eligibility_Supervisor.CameraEvidence.Stale => "Stale"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.CameraEvidence")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorCameraEvidence_Payload(o: Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorCameraEvidenceType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorRadioEvidenceType(o: Forest_Observation_Eligibility_Supervisor.RadioEvidence.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.RadioEvidence.AvailableCurrent => "AvailableCurrent"
        case Forest_Observation_Eligibility_Supervisor.RadioEvidence.UnavailableCurrent => "UnavailableCurrent"
        case Forest_Observation_Eligibility_Supervisor.RadioEvidence.UnknownCurrent => "UnknownCurrent"
        case Forest_Observation_Eligibility_Supervisor.RadioEvidence.Invalid => "Invalid"
        case Forest_Observation_Eligibility_Supervisor.RadioEvidence.Stale => "Stale"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.RadioEvidence")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorRadioEvidence_Payload(o: Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorRadioEvidenceType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorSupportVerdictType(o: Forest_Observation_Eligibility_Supervisor.SupportVerdict.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.SupportVerdict.NoSupportVerdict => "NoSupportVerdict"
        case Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportReady => "SupportReady"
        case Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportUnavailable => "SupportUnavailable"
        case Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportUntrusted => "SupportUntrusted"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.SupportVerdict")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorSupportVerdict_Payload(o: Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorSupportVerdictType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEligibilityDecisionType(o: Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.EligibilityDecision.NoDecision => "NoDecision"
        case Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Permit => "Permit"
        case Forest_Observation_Eligibility_Supervisor.EligibilityDecision.DenyPower => "DenyPower"
        case Forest_Observation_Eligibility_Supervisor.EligibilityDecision.DenySupport => "DenySupport"
        case Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Withdraw => "Withdraw"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.EligibilityDecision")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload(o: Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorEligibilityDecisionType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorObservationProgressType(o: Forest_Observation_Eligibility_Supervisor.ObservationProgress.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.ObservationProgress.Idle => "Idle"
        case Forest_Observation_Eligibility_Supervisor.ObservationProgress.Active => "Active"
        case Forest_Observation_Eligibility_Supervisor.ObservationProgress.Completed => "Completed"
        case Forest_Observation_Eligibility_Supervisor.ObservationProgress.Failed => "Failed"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.ObservationProgress")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorObservationProgress_Payload(o: Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorObservationProgressType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorObservationAuthorizationType(o: Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Withhold => "Withhold"
        case Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Permit => "Permit"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.ObservationAuthorization")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload(o: Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorObservationAuthorizationType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorRequestStateType(o: Forest_Observation_Eligibility_Supervisor.RequestState.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.RequestState.Idle => "Idle"
        case Forest_Observation_Eligibility_Supervisor.RequestState.Pending => "Pending"
        case Forest_Observation_Eligibility_Supervisor.RequestState.Engaged => "Engaged"
        case Forest_Observation_Eligibility_Supervisor.RequestState.RecoveryHold => "RecoveryHold"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.RequestState")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorRequestState_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestState_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.RequestState_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorRequestStateType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorLastAcceptedTokenType(o: Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.None => "None"
        case Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.TokenA => "TokenA"
        case Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.TokenB => "TokenB"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.LastAcceptedToken")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorLastAcceptedToken_Payload(o: Forest_Observation_Eligibility_Supervisor.LastAcceptedToken_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.LastAcceptedToken_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorLastAcceptedTokenType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorGatePhaseType(o: Forest_Observation_Eligibility_Supervisor.GatePhase.Type): ST = {
      val value: String = o match {
        case Forest_Observation_Eligibility_Supervisor.GatePhase.Closed => "Closed"
        case Forest_Observation_Eligibility_Supervisor.GatePhase.Authorized => "Authorized"
        case Forest_Observation_Eligibility_Supervisor.GatePhase.Active => "Active"
        case Forest_Observation_Eligibility_Supervisor.GatePhase.FailureHold => "FailureHold"
      }
      return printObject(ISZ(
        ("type", printString("Forest_Observation_Eligibility_Supervisor.GatePhase")),
        ("value", printString(value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorGatePhase_Payload(o: Forest_Observation_Eligibility_Supervisor.GatePhase_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.GatePhase_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorGatePhaseType(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorRequestInput(o: Forest_Observation_Eligibility_Supervisor.RequestInput): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.RequestInput""""),
        ("command", printForest_Observation_Eligibility_SupervisorRequestCommandType(o.command)),
        ("token", printForest_Observation_Eligibility_SupervisorRequestTokenType(o.token))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorRequestInput_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestInput_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.RequestInput_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorRequestInput(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(o: Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict""""),
        ("verdict", printForest_Observation_Eligibility_SupervisorEnergyVerdictType(o.verdict)),
        ("ticket", printForest_Observation_Eligibility_SupervisorTaggedTicketType(o.ticket))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload(o: Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(o.value))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(o: Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict""""),
        ("verdict", printForest_Observation_Eligibility_SupervisorSupportVerdictType(o.verdict)),
        ("ticket", printForest_Observation_Eligibility_SupervisorTaggedTicketType(o.ticket))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload(o: Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload""""),
        ("value", printForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(o.value))
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

    @pure def printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container): ST = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P => return printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS => return printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(o)
      }
    }

    @pure def printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P""""),
        ("api_gateOutcome", printForest_Observation_Eligibility_SupervisorGateOutcomeType(o.api_gateOutcome)),
        ("api_requestInput", printForest_Observation_Eligibility_SupervisorRequestInput(o.api_requestInput))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS""""),
        ("In_lastAcceptedToken", printForest_Observation_Eligibility_SupervisorLastAcceptedTokenType(o.In_lastAcceptedToken)),
        ("In_requestState", printForest_Observation_Eligibility_SupervisorRequestStateType(o.In_requestState)),
        ("api_gateOutcome", printForest_Observation_Eligibility_SupervisorGateOutcomeType(o.api_gateOutcome)),
        ("api_requestInput", printForest_Observation_Eligibility_SupervisorRequestInput(o.api_requestInput))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container): ST = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P => return printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS => return printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(o)
      }
    }

    @pure def printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P""""),
        ("api_eligibilityStatus", printForest_Observation_Eligibility_SupervisorEligibilityStatusType(o.api_eligibilityStatus)),
        ("api_energyTicket", printForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.api_energyTicket)),
        ("api_requestContext", printForest_Observation_Eligibility_SupervisorRequestContextType(o.api_requestContext)),
        ("api_supportTicket", printForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.api_supportTicket))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS""""),
        ("lastAcceptedToken", printForest_Observation_Eligibility_SupervisorLastAcceptedTokenType(o.lastAcceptedToken)),
        ("requestState", printForest_Observation_Eligibility_SupervisorRequestStateType(o.requestState)),
        ("api_eligibilityStatus", printForest_Observation_Eligibility_SupervisorEligibilityStatusType(o.api_eligibilityStatus)),
        ("api_energyTicket", printForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.api_energyTicket)),
        ("api_requestContext", printForest_Observation_Eligibility_SupervisorRequestContextType(o.api_requestContext)),
        ("api_supportTicket", printForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.api_supportTicket))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container): ST = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P => return printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS => return printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(o)
      }
    }

    @pure def printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P""""),
        ("api_energyEvidence", printForest_Observation_Eligibility_SupervisorEnergyEvidenceType(o.api_energyEvidence)),
        ("api_evaluationTicket", printForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.api_evaluationTicket))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS""""),
        ("api_energyEvidence", printForest_Observation_Eligibility_SupervisorEnergyEvidenceType(o.api_energyEvidence)),
        ("api_evaluationTicket", printForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.api_evaluationTicket))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container): ST = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P => return printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS => return printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(o)
      }
    }

    @pure def printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P""""),
        ("api_energyVerdictOut", printForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(o.api_energyVerdictOut))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS""""),
        ("api_energyVerdictOut", printForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(o.api_energyVerdictOut))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container): ST = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P => return printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS => return printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(o)
      }
    }

    @pure def printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P""""),
        ("api_cameraEvidence", printForest_Observation_Eligibility_SupervisorCameraEvidenceType(o.api_cameraEvidence)),
        ("api_evaluationTicket", printForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.api_evaluationTicket)),
        ("api_radioEvidence", printForest_Observation_Eligibility_SupervisorRadioEvidenceType(o.api_radioEvidence))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS""""),
        ("api_cameraEvidence", printForest_Observation_Eligibility_SupervisorCameraEvidenceType(o.api_cameraEvidence)),
        ("api_evaluationTicket", printForest_Observation_Eligibility_SupervisorEvaluationTicketType(o.api_evaluationTicket)),
        ("api_radioEvidence", printForest_Observation_Eligibility_SupervisorRadioEvidenceType(o.api_radioEvidence))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container): ST = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P => return printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS => return printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(o)
      }
    }

    @pure def printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P""""),
        ("api_supportVerdictOut", printForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(o.api_supportVerdictOut))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS""""),
        ("api_supportVerdictOut", printForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(o.api_supportVerdictOut))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container): ST = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P => return printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS => return printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(o)
      }
    }

    @pure def printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P""""),
        ("api_energyVerdictIn", printForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(o.api_energyVerdictIn)),
        ("api_requestContext", printForest_Observation_Eligibility_SupervisorRequestContextType(o.api_requestContext)),
        ("api_supportVerdictIn", printForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(o.api_supportVerdictIn))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS""""),
        ("api_energyVerdictIn", printForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(o.api_energyVerdictIn)),
        ("api_requestContext", printForest_Observation_Eligibility_SupervisorRequestContextType(o.api_requestContext)),
        ("api_supportVerdictIn", printForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(o.api_supportVerdictIn))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container): ST = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P => return printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS => return printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(o)
      }
    }

    @pure def printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P""""),
        ("api_eligibilityDecision", printForest_Observation_Eligibility_SupervisorEligibilityDecisionType(o.api_eligibilityDecision))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS""""),
        ("api_eligibilityDecision", printForest_Observation_Eligibility_SupervisorEligibilityDecisionType(o.api_eligibilityDecision))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container): ST = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P => return printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS => return printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(o)
      }
    }

    @pure def printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P""""),
        ("api_eligibilityDecision", printForest_Observation_Eligibility_SupervisorEligibilityDecisionType(o.api_eligibilityDecision)),
        ("api_observationProgress", printForest_Observation_Eligibility_SupervisorObservationProgressType(o.api_observationProgress))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS""""),
        ("In_gatePhase", printForest_Observation_Eligibility_SupervisorGatePhaseType(o.In_gatePhase)),
        ("api_eligibilityDecision", printForest_Observation_Eligibility_SupervisorEligibilityDecisionType(o.api_eligibilityDecision)),
        ("api_observationProgress", printForest_Observation_Eligibility_SupervisorObservationProgressType(o.api_observationProgress))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container): ST = {
      o match {
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P => return printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS => return printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(o)
      }
    }

    @pure def printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P""""),
        ("api_gateOutcome", printForest_Observation_Eligibility_SupervisorGateOutcomeType(o.api_gateOutcome)),
        ("api_observationAuthorization", printForest_Observation_Eligibility_SupervisorObservationAuthorizationType(o.api_observationAuthorization))
      ))
    }

    @pure def printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS""""),
        ("gatePhase", printForest_Observation_Eligibility_SupervisorGatePhaseType(o.gatePhase)),
        ("api_gateOutcome", printForest_Observation_Eligibility_SupervisorGateOutcomeType(o.api_gateOutcome)),
        ("api_observationAuthorization", printForest_Observation_Eligibility_SupervisorObservationAuthorizationType(o.api_observationAuthorization))
      ))
    }

    @pure def printruntimemonitorObservationKindType(o: runtimemonitor.ObservationKind.Type): ST = {
      val value: String = o match {
        case runtimemonitor.ObservationKind.ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_requestLifecycle_postInit => "ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_requestLifecycle_postInit"
        case runtimemonitor.ObservationKind.ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_requestLifecycle_preCompute => "ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_requestLifecycle_preCompute"
        case runtimemonitor.ObservationKind.ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_requestLifecycle_postCompute => "ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_requestLifecycle_postCompute"
        case runtimemonitor.ObservationKind.ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_energyAssessor_postInit => "ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_energyAssessor_postInit"
        case runtimemonitor.ObservationKind.ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_energyAssessor_preCompute => "ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_energyAssessor_preCompute"
        case runtimemonitor.ObservationKind.ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_energyAssessor_postCompute => "ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_energyAssessor_postCompute"
        case runtimemonitor.ObservationKind.ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_observationSupportAssessor_postInit => "ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_observationSupportAssessor_postInit"
        case runtimemonitor.ObservationKind.ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_observationSupportAssessor_preCompute => "ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_observationSupportAssessor_preCompute"
        case runtimemonitor.ObservationKind.ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_observationSupportAssessor_postCompute => "ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_observationSupportAssessor_postCompute"
        case runtimemonitor.ObservationKind.ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_eligibilityArbiter_postInit => "ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_eligibilityArbiter_postInit"
        case runtimemonitor.ObservationKind.ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_eligibilityArbiter_preCompute => "ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_eligibilityArbiter_preCompute"
        case runtimemonitor.ObservationKind.ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_eligibilityArbiter_postCompute => "ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_eligibilityArbiter_postCompute"
        case runtimemonitor.ObservationKind.ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_authorizationGate_postInit => "ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_authorizationGate_postInit"
        case runtimemonitor.ObservationKind.ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_authorizationGate_preCompute => "ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_authorizationGate_preCompute"
        case runtimemonitor.ObservationKind.ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_authorizationGate_postCompute => "ForestObservationEligibilitySupervisor_Instance_eligibilitySupervisionProcess_authorizationGate_postCompute"
      }
      return printObject(ISZ(
        ("type", printString("runtimemonitor.ObservationKind")),
        ("value", printString(value))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P => return printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS => return printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P => return printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS => return printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P => return printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS => return printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P => return printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS => return printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P => return printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS => return printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P => return printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS => return printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P => return printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS => return printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P => return printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS => return printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P => return printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS => return printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P => return printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS => return printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(o)
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
        case o: Forest_Observation_Eligibility_Supervisor.GatePhase_Payload => return printForest_Observation_Eligibility_SupervisorGatePhase_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload => return printForest_Observation_Eligibility_SupervisorGateOutcome_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestToken_Payload => return printForest_Observation_Eligibility_SupervisorRequestToken_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload => return printForest_Observation_Eligibility_SupervisorTaggedTicket_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestState_Payload => return printForest_Observation_Eligibility_SupervisorRequestState_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestInput_Payload => return printForest_Observation_Eligibility_SupervisorRequestInput_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload => return printForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload => return printForest_Observation_Eligibility_SupervisorRadioEvidence_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload => return printForest_Observation_Eligibility_SupervisorRequestCommand_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestContext_Payload => return printForest_Observation_Eligibility_SupervisorRequestContext_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload => return printForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload => return printForest_Observation_Eligibility_SupervisorSupportVerdict_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload => return printForest_Observation_Eligibility_SupervisorCameraEvidence_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload => return printForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.LastAcceptedToken_Payload => return printForest_Observation_Eligibility_SupervisorLastAcceptedToken_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload => return printForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload => return printForest_Observation_Eligibility_SupervisorObservationProgress_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload => return printForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload => return printForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload => return printForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload => return printForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P => return printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS => return printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P => return printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS => return printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P => return printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS => return printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P => return printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS => return printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P => return printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS => return printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P => return printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS => return printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P => return printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS => return printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P => return printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS => return printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P => return printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS => return printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P => return printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(o)
        case o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS => return printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(o)
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

    def parseForest_Observation_Eligibility_SupervisorRequestCommandType(): Forest_Observation_Eligibility_Supervisor.RequestCommand.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorRequestCommandT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorRequestCommandT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestCommand.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.RequestCommand")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.RequestCommand.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.RequestCommand.")
          return Forest_Observation_Eligibility_Supervisor.RequestCommand.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorRequestCommand_Payload(): Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorRequestCommand_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorRequestCommand_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorRequestCommandType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorRequestTokenType(): Forest_Observation_Eligibility_Supervisor.RequestToken.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorRequestTokenT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorRequestTokenT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestToken.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.RequestToken")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.RequestToken.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.RequestToken.")
          return Forest_Observation_Eligibility_Supervisor.RequestToken.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorRequestToken_Payload(): Forest_Observation_Eligibility_Supervisor.RequestToken_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorRequestToken_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorRequestToken_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestToken_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.RequestToken_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorRequestTokenType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.RequestToken_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorGateOutcomeType(): Forest_Observation_Eligibility_Supervisor.GateOutcome.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorGateOutcomeT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorGateOutcomeT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.GateOutcome.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.GateOutcome")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.GateOutcome.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.GateOutcome.")
          return Forest_Observation_Eligibility_Supervisor.GateOutcome.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorGateOutcome_Payload(): Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorGateOutcome_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorGateOutcome_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorGateOutcomeType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorEvaluationTicketType(): Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorEvaluationTicketT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEvaluationTicketT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EvaluationTicket")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.EvaluationTicket.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.EvaluationTicket.")
          return Forest_Observation_Eligibility_Supervisor.EvaluationTicket.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload(): Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorEvaluationTicket_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEvaluationTicket_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorRequestContextType(): Forest_Observation_Eligibility_Supervisor.RequestContext.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorRequestContextT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorRequestContextT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestContext.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.RequestContext")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.RequestContext.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.RequestContext.")
          return Forest_Observation_Eligibility_Supervisor.RequestContext.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorRequestContext_Payload(): Forest_Observation_Eligibility_Supervisor.RequestContext_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorRequestContext_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorRequestContext_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestContext_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.RequestContext_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorRequestContextType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.RequestContext_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityStatusType(): Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorEligibilityStatusT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityStatusT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EligibilityStatus")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.EligibilityStatus.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.EligibilityStatus.")
          return Forest_Observation_Eligibility_Supervisor.EligibilityStatus.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload(): Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorEligibilityStatus_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityStatus_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorEligibilityStatusType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyEvidenceType(): Forest_Observation_Eligibility_Supervisor.EnergyEvidence.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorEnergyEvidenceT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyEvidenceT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EnergyEvidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EnergyEvidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.EnergyEvidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.EnergyEvidence.")
          return Forest_Observation_Eligibility_Supervisor.EnergyEvidence.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload(): Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorEnergyEvidence_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyEvidence_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorEnergyEvidenceType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyVerdictType(): Forest_Observation_Eligibility_Supervisor.EnergyVerdict.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorEnergyVerdictT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyVerdictT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EnergyVerdict.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EnergyVerdict")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.EnergyVerdict.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.EnergyVerdict.")
          return Forest_Observation_Eligibility_Supervisor.EnergyVerdict.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload(): Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorEnergyVerdict_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyVerdict_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorEnergyVerdictType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorTaggedTicketType(): Forest_Observation_Eligibility_Supervisor.TaggedTicket.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorTaggedTicketT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorTaggedTicketT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.TaggedTicket.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.TaggedTicket")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.TaggedTicket.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.TaggedTicket.")
          return Forest_Observation_Eligibility_Supervisor.TaggedTicket.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorTaggedTicket_Payload(): Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorTaggedTicket_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorTaggedTicket_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorTaggedTicketType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorCameraEvidenceType(): Forest_Observation_Eligibility_Supervisor.CameraEvidence.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorCameraEvidenceT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorCameraEvidenceT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.CameraEvidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.CameraEvidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.CameraEvidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.CameraEvidence.")
          return Forest_Observation_Eligibility_Supervisor.CameraEvidence.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorCameraEvidence_Payload(): Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorCameraEvidence_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorCameraEvidence_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorCameraEvidenceType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorRadioEvidenceType(): Forest_Observation_Eligibility_Supervisor.RadioEvidence.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorRadioEvidenceT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorRadioEvidenceT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RadioEvidence.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.RadioEvidence")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.RadioEvidence.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.RadioEvidence.")
          return Forest_Observation_Eligibility_Supervisor.RadioEvidence.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorRadioEvidence_Payload(): Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorRadioEvidence_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorRadioEvidence_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorRadioEvidenceType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorSupportVerdictType(): Forest_Observation_Eligibility_Supervisor.SupportVerdict.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorSupportVerdictT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorSupportVerdictT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.SupportVerdict.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.SupportVerdict")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.SupportVerdict.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.SupportVerdict.")
          return Forest_Observation_Eligibility_Supervisor.SupportVerdict.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorSupportVerdict_Payload(): Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorSupportVerdict_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorSupportVerdict_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorSupportVerdictType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityDecisionType(): Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorEligibilityDecisionT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityDecisionT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EligibilityDecision")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.EligibilityDecision.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.EligibilityDecision.")
          return Forest_Observation_Eligibility_Supervisor.EligibilityDecision.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload(): Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorEligibilityDecision_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityDecision_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorEligibilityDecisionType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorObservationProgressType(): Forest_Observation_Eligibility_Supervisor.ObservationProgress.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorObservationProgressT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorObservationProgressT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.ObservationProgress.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.ObservationProgress")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.ObservationProgress.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.ObservationProgress.")
          return Forest_Observation_Eligibility_Supervisor.ObservationProgress.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorObservationProgress_Payload(): Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorObservationProgress_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorObservationProgress_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorObservationProgressType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorObservationAuthorizationType(): Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorObservationAuthorizationT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorObservationAuthorizationT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.ObservationAuthorization")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.")
          return Forest_Observation_Eligibility_Supervisor.ObservationAuthorization.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload(): Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorObservationAuthorization_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorObservationAuthorization_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorObservationAuthorizationType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorRequestStateType(): Forest_Observation_Eligibility_Supervisor.RequestState.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorRequestStateT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorRequestStateT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestState.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.RequestState")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.RequestState.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.RequestState.")
          return Forest_Observation_Eligibility_Supervisor.RequestState.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorRequestState_Payload(): Forest_Observation_Eligibility_Supervisor.RequestState_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorRequestState_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorRequestState_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestState_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.RequestState_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorRequestStateType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.RequestState_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorLastAcceptedTokenType(): Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorLastAcceptedTokenT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorLastAcceptedTokenT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.LastAcceptedToken")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.")
          return Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorLastAcceptedToken_Payload(): Forest_Observation_Eligibility_Supervisor.LastAcceptedToken_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorLastAcceptedToken_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorLastAcceptedToken_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.LastAcceptedToken_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.LastAcceptedToken_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorLastAcceptedTokenType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.LastAcceptedToken_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorGatePhaseType(): Forest_Observation_Eligibility_Supervisor.GatePhase.Type = {
      val r = parseForest_Observation_Eligibility_SupervisorGatePhaseT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorGatePhaseT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.GatePhase.Type = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.GatePhase")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      Forest_Observation_Eligibility_Supervisor.GatePhase.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for Forest_Observation_Eligibility_Supervisor.GatePhase.")
          return Forest_Observation_Eligibility_Supervisor.GatePhase.byOrdinal(0).get
      }
    }

    def parseForest_Observation_Eligibility_SupervisorGatePhase_Payload(): Forest_Observation_Eligibility_Supervisor.GatePhase_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorGatePhase_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorGatePhase_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.GatePhase_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.GatePhase_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorGatePhaseType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.GatePhase_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorRequestInput(): Forest_Observation_Eligibility_Supervisor.RequestInput = {
      val r = parseForest_Observation_Eligibility_SupervisorRequestInputT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorRequestInputT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestInput = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.RequestInput")
      }
      parser.parseObjectKey("command")
      val command = parseForest_Observation_Eligibility_SupervisorRequestCommandType()
      parser.parseObjectNext()
      parser.parseObjectKey("token")
      val token = parseForest_Observation_Eligibility_SupervisorRequestTokenType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.RequestInput(command, token)
    }

    def parseForest_Observation_Eligibility_SupervisorRequestInput_Payload(): Forest_Observation_Eligibility_Supervisor.RequestInput_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorRequestInput_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorRequestInput_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestInput_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.RequestInput_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorRequestInput()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.RequestInput_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(): Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict = {
      val r = parseForest_Observation_Eligibility_SupervisorTaggedEnergyVerdictT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorTaggedEnergyVerdictT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict")
      }
      parser.parseObjectKey("verdict")
      val verdict = parseForest_Observation_Eligibility_SupervisorEnergyVerdictType()
      parser.parseObjectNext()
      parser.parseObjectKey("ticket")
      val ticket = parseForest_Observation_Eligibility_SupervisorTaggedTicketType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict(verdict, ticket)
    }

    def parseForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload(): Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload(value)
    }

    def parseForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(): Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict = {
      val r = parseForest_Observation_Eligibility_SupervisorTaggedSupportVerdictT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorTaggedSupportVerdictT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict")
      }
      parser.parseObjectKey("verdict")
      val verdict = parseForest_Observation_Eligibility_SupervisorSupportVerdictType()
      parser.parseObjectNext()
      parser.parseObjectKey("ticket")
      val ticket = parseForest_Observation_Eligibility_SupervisorTaggedTicketType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict(verdict, ticket)
    }

    def parseForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload(): Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload = {
      val r = parseForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_PayloadT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_PayloadT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseForest_Observation_Eligibility_SupervisorTaggedSupportVerdict()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload(value)
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

    def parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container(): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P", "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS"))
      t.native match {
        case "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PST(T); return r
        case _ => val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PST(T); return r
      }
    }

    def parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P = {
      val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P")
      }
      parser.parseObjectKey("api_gateOutcome")
      val api_gateOutcome = parseForest_Observation_Eligibility_SupervisorGateOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestInput")
      val api_requestInput = parseForest_Observation_Eligibility_SupervisorRequestInput()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(api_gateOutcome, api_requestInput)
    }

    def parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS = {
      val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PST(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS")
      }
      parser.parseObjectKey("In_lastAcceptedToken")
      val In_lastAcceptedToken = parseForest_Observation_Eligibility_SupervisorLastAcceptedTokenType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_requestState")
      val In_requestState = parseForest_Observation_Eligibility_SupervisorRequestStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gateOutcome")
      val api_gateOutcome = parseForest_Observation_Eligibility_SupervisorGateOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestInput")
      val api_requestInput = parseForest_Observation_Eligibility_SupervisorRequestInput()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(In_lastAcceptedToken, In_requestState, api_gateOutcome, api_requestInput)
    }

    def parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container(): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P", "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS"))
      t.native match {
        case "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PST(T); return r
        case _ => val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PST(T); return r
      }
    }

    def parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P = {
      val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P")
      }
      parser.parseObjectKey("api_eligibilityStatus")
      val api_eligibilityStatus = parseForest_Observation_Eligibility_SupervisorEligibilityStatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_energyTicket")
      val api_energyTicket = parseForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestContext")
      val api_requestContext = parseForest_Observation_Eligibility_SupervisorRequestContextType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supportTicket")
      val api_supportTicket = parseForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(api_eligibilityStatus, api_energyTicket, api_requestContext, api_supportTicket)
    }

    def parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS = {
      val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PST(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS")
      }
      parser.parseObjectKey("lastAcceptedToken")
      val lastAcceptedToken = parseForest_Observation_Eligibility_SupervisorLastAcceptedTokenType()
      parser.parseObjectNext()
      parser.parseObjectKey("requestState")
      val requestState = parseForest_Observation_Eligibility_SupervisorRequestStateType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_eligibilityStatus")
      val api_eligibilityStatus = parseForest_Observation_Eligibility_SupervisorEligibilityStatusType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_energyTicket")
      val api_energyTicket = parseForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestContext")
      val api_requestContext = parseForest_Observation_Eligibility_SupervisorRequestContextType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supportTicket")
      val api_supportTicket = parseForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(lastAcceptedToken, requestState, api_eligibilityStatus, api_energyTicket, api_requestContext, api_supportTicket)
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container(): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P", "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS"))
      t.native match {
        case "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PST(T); return r
        case _ => val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PST(T); return r
      }
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P = {
      val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_energyEvidence")
      val api_energyEvidence = parseForest_Observation_Eligibility_SupervisorEnergyEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evaluationTicket")
      val api_evaluationTicket = parseForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(api_energyEvidence, api_evaluationTicket)
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS = {
      val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PST(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_energyEvidence")
      val api_energyEvidence = parseForest_Observation_Eligibility_SupervisorEnergyEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evaluationTicket")
      val api_evaluationTicket = parseForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(api_energyEvidence, api_evaluationTicket)
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container(): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P", "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS"))
      t.native match {
        case "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PST(T); return r
      }
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P = {
      val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_energyVerdictOut")
      val api_energyVerdictOut = parseForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(api_energyVerdictOut)
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS = {
      val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PST(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_energyVerdictOut")
      val api_energyVerdictOut = parseForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(api_energyVerdictOut)
    }

    def parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container(): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P", "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS"))
      t.native match {
        case "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PST(T); return r
        case _ => val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PST(T); return r
      }
    }

    def parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P = {
      val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P")
      }
      parser.parseObjectKey("api_cameraEvidence")
      val api_cameraEvidence = parseForest_Observation_Eligibility_SupervisorCameraEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evaluationTicket")
      val api_evaluationTicket = parseForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_radioEvidence")
      val api_radioEvidence = parseForest_Observation_Eligibility_SupervisorRadioEvidenceType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(api_cameraEvidence, api_evaluationTicket, api_radioEvidence)
    }

    def parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS = {
      val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PST(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS")
      }
      parser.parseObjectKey("api_cameraEvidence")
      val api_cameraEvidence = parseForest_Observation_Eligibility_SupervisorCameraEvidenceType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_evaluationTicket")
      val api_evaluationTicket = parseForest_Observation_Eligibility_SupervisorEvaluationTicketType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_radioEvidence")
      val api_radioEvidence = parseForest_Observation_Eligibility_SupervisorRadioEvidenceType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(api_cameraEvidence, api_evaluationTicket, api_radioEvidence)
    }

    def parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container(): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P", "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS"))
      t.native match {
        case "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PST(T); return r
      }
    }

    def parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P = {
      val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P")
      }
      parser.parseObjectKey("api_supportVerdictOut")
      val api_supportVerdictOut = parseForest_Observation_Eligibility_SupervisorTaggedSupportVerdict()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(api_supportVerdictOut)
    }

    def parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS = {
      val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PST(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS")
      }
      parser.parseObjectKey("api_supportVerdictOut")
      val api_supportVerdictOut = parseForest_Observation_Eligibility_SupervisorTaggedSupportVerdict()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(api_supportVerdictOut)
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container(): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P", "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS"))
      t.native match {
        case "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PST(T); return r
        case _ => val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PST(T); return r
      }
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P = {
      val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P")
      }
      parser.parseObjectKey("api_energyVerdictIn")
      val api_energyVerdictIn = parseForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestContext")
      val api_requestContext = parseForest_Observation_Eligibility_SupervisorRequestContextType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supportVerdictIn")
      val api_supportVerdictIn = parseForest_Observation_Eligibility_SupervisorTaggedSupportVerdict()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(api_energyVerdictIn, api_requestContext, api_supportVerdictIn)
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS = {
      val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PST(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS")
      }
      parser.parseObjectKey("api_energyVerdictIn")
      val api_energyVerdictIn = parseForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict()
      parser.parseObjectNext()
      parser.parseObjectKey("api_requestContext")
      val api_requestContext = parseForest_Observation_Eligibility_SupervisorRequestContextType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_supportVerdictIn")
      val api_supportVerdictIn = parseForest_Observation_Eligibility_SupervisorTaggedSupportVerdict()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(api_energyVerdictIn, api_requestContext, api_supportVerdictIn)
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container(): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P", "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS"))
      t.native match {
        case "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PST(T); return r
        case _ => val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PST(T); return r
      }
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P = {
      val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P")
      }
      parser.parseObjectKey("api_eligibilityDecision")
      val api_eligibilityDecision = parseForest_Observation_Eligibility_SupervisorEligibilityDecisionType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(api_eligibilityDecision)
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS = {
      val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PST(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS")
      }
      parser.parseObjectKey("api_eligibilityDecision")
      val api_eligibilityDecision = parseForest_Observation_Eligibility_SupervisorEligibilityDecisionType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(api_eligibilityDecision)
    }

    def parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container(): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P", "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS"))
      t.native match {
        case "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PST(T); return r
        case _ => val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PST(T); return r
      }
    }

    def parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P = {
      val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P")
      }
      parser.parseObjectKey("api_eligibilityDecision")
      val api_eligibilityDecision = parseForest_Observation_Eligibility_SupervisorEligibilityDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_observationProgress")
      val api_observationProgress = parseForest_Observation_Eligibility_SupervisorObservationProgressType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(api_eligibilityDecision, api_observationProgress)
    }

    def parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS = {
      val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PST(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS")
      }
      parser.parseObjectKey("In_gatePhase")
      val In_gatePhase = parseForest_Observation_Eligibility_SupervisorGatePhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_eligibilityDecision")
      val api_eligibilityDecision = parseForest_Observation_Eligibility_SupervisorEligibilityDecisionType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_observationProgress")
      val api_observationProgress = parseForest_Observation_Eligibility_SupervisorObservationProgressType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(In_gatePhase, api_eligibilityDecision, api_observationProgress)
    }

    def parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container(): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P", "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS"))
      t.native match {
        case "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PST(T); return r
        case _ => val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PST(T); return r
      }
    }

    def parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P = {
      val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PT(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PT(typeParsed: B): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P")
      }
      parser.parseObjectKey("api_gateOutcome")
      val api_gateOutcome = parseForest_Observation_Eligibility_SupervisorGateOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_observationAuthorization")
      val api_observationAuthorization = parseForest_Observation_Eligibility_SupervisorObservationAuthorizationType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(api_gateOutcome, api_observationAuthorization)
    }

    def parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS = {
      val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PST(F)
      return r
    }

    def parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PST(typeParsed: B): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS")
      }
      parser.parseObjectKey("gatePhase")
      val gatePhase = parseForest_Observation_Eligibility_SupervisorGatePhaseType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_gateOutcome")
      val api_gateOutcome = parseForest_Observation_Eligibility_SupervisorGateOutcomeType()
      parser.parseObjectNext()
      parser.parseObjectKey("api_observationAuthorization")
      val api_observationAuthorization = parseForest_Observation_Eligibility_SupervisorObservationAuthorizationType()
      parser.parseObjectNext()
      return Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(gatePhase, api_gateOutcome, api_observationAuthorization)
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
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P", "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS", "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P", "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS", "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P", "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS", "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P", "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS", "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P", "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS", "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P", "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS", "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P", "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS", "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P", "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS", "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P", "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS", "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P", "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PST(T); return r
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
      val t = parser.parseObjectTypes(ISZ("art.Empty", "Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "util.EmptyContainer", "Forest_Observation_Eligibility_Supervisor.GatePhase_Payload", "Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload", "Forest_Observation_Eligibility_Supervisor.RequestToken_Payload", "Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload", "Forest_Observation_Eligibility_Supervisor.RequestState_Payload", "Forest_Observation_Eligibility_Supervisor.RequestInput_Payload", "Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload", "Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload", "Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload", "Forest_Observation_Eligibility_Supervisor.RequestContext_Payload", "Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload", "Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload", "Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload", "Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload", "Forest_Observation_Eligibility_Supervisor.LastAcceptedToken_Payload", "Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload", "Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload", "Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload", "Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload", "Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload", "Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload", "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P", "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS", "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P", "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS", "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P", "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS", "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P", "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS", "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P", "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS", "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P", "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS", "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P", "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS", "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P", "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS", "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P", "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS", "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P", "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS"))
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
        case "Forest_Observation_Eligibility_Supervisor.GatePhase_Payload" => val r = parseForest_Observation_Eligibility_SupervisorGatePhase_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload" => val r = parseForest_Observation_Eligibility_SupervisorGateOutcome_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.RequestToken_Payload" => val r = parseForest_Observation_Eligibility_SupervisorRequestToken_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload" => val r = parseForest_Observation_Eligibility_SupervisorTaggedTicket_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.RequestState_Payload" => val r = parseForest_Observation_Eligibility_SupervisorRequestState_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.RequestInput_Payload" => val r = parseForest_Observation_Eligibility_SupervisorRequestInput_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload" => val r = parseForest_Observation_Eligibility_SupervisorEnergyVerdict_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload" => val r = parseForest_Observation_Eligibility_SupervisorRadioEvidence_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload" => val r = parseForest_Observation_Eligibility_SupervisorRequestCommand_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.RequestContext_Payload" => val r = parseForest_Observation_Eligibility_SupervisorRequestContext_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload" => val r = parseForest_Observation_Eligibility_SupervisorEnergyEvidence_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload" => val r = parseForest_Observation_Eligibility_SupervisorSupportVerdict_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload" => val r = parseForest_Observation_Eligibility_SupervisorCameraEvidence_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload" => val r = parseForest_Observation_Eligibility_SupervisorEvaluationTicket_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.LastAcceptedToken_Payload" => val r = parseForest_Observation_Eligibility_SupervisorLastAcceptedToken_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload" => val r = parseForest_Observation_Eligibility_SupervisorEligibilityStatus_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload" => val r = parseForest_Observation_Eligibility_SupervisorObservationProgress_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload" => val r = parseForest_Observation_Eligibility_SupervisorEligibilityDecision_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload" => val r = parseForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload" => val r = parseForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload" => val r = parseForest_Observation_Eligibility_SupervisorObservationAuthorization_PayloadT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PST(T); return r
        case "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P" => val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PT(T); return r
        case "Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS" => val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PST(T); return r
        case _ => val r = parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PST(T); return r
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

  def fromForest_Observation_Eligibility_SupervisorRequestCommand_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorRequestCommand_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorRequestCommand_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestCommand_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.RequestCommand_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorRequestCommand_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorRequestCommand_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestToken_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestToken_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorRequestToken_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorRequestToken_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.RequestToken_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestToken_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.RequestToken_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorRequestToken_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorRequestToken_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorGateOutcome_Payload(o: Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorGateOutcome_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorGateOutcome_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorGateOutcome_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.GateOutcome_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorGateOutcome_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorGateOutcome_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload(o: Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.EvaluationTicket_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorEvaluationTicket_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestContext_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestContext_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorRequestContext_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorRequestContext_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.RequestContext_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestContext_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.RequestContext_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorRequestContext_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorRequestContext_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload(o: Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.EligibilityStatus_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorEligibilityStatus_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload(o: Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.EnergyEvidence_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorEnergyEvidence_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload(o: Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.EnergyVerdict_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorEnergyVerdict_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorTaggedTicket_Payload(o: Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorTaggedTicket_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorTaggedTicket_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorTaggedTicket_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.TaggedTicket_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorTaggedTicket_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorTaggedTicket_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorCameraEvidence_Payload(o: Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorCameraEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorCameraEvidence_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorCameraEvidence_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.CameraEvidence_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorCameraEvidence_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorCameraEvidence_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRadioEvidence_Payload(o: Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorRadioEvidence_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorRadioEvidence_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRadioEvidence_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.RadioEvidence_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorRadioEvidence_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorRadioEvidence_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorSupportVerdict_Payload(o: Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorSupportVerdict_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorSupportVerdict_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorSupportVerdict_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.SupportVerdict_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorSupportVerdict_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorSupportVerdict_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload(o: Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.EligibilityDecision_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorEligibilityDecision_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorObservationProgress_Payload(o: Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorObservationProgress_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorObservationProgress_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorObservationProgress_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.ObservationProgress_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorObservationProgress_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorObservationProgress_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload(o: Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.ObservationAuthorization_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorObservationAuthorization_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestState_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestState_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorRequestState_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorRequestState_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.RequestState_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestState_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.RequestState_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorRequestState_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorRequestState_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorLastAcceptedToken_Payload(o: Forest_Observation_Eligibility_Supervisor.LastAcceptedToken_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorLastAcceptedToken_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorLastAcceptedToken_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.LastAcceptedToken_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorLastAcceptedToken_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.LastAcceptedToken_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorLastAcceptedToken_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorLastAcceptedToken_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorGatePhase_Payload(o: Forest_Observation_Eligibility_Supervisor.GatePhase_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorGatePhase_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorGatePhase_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.GatePhase_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorGatePhase_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.GatePhase_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorGatePhase_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorGatePhase_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestInput(o: Forest_Observation_Eligibility_Supervisor.RequestInput, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorRequestInput(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorRequestInput(s: String): Either[Forest_Observation_Eligibility_Supervisor.RequestInput, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestInput(parser: Parser): Forest_Observation_Eligibility_Supervisor.RequestInput = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorRequestInput()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorRequestInput _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestInput_Payload(o: Forest_Observation_Eligibility_Supervisor.RequestInput_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorRequestInput_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorRequestInput_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.RequestInput_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestInput_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.RequestInput_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorRequestInput_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorRequestInput_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(o: Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(s: String): Either[Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict(parser: Parser): Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload(o: Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorTaggedEnergyVerdict_Payload _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(o: Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(s: String): Either[Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorTaggedSupportVerdict(parser: Parser): Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorTaggedSupportVerdict()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorTaggedSupportVerdict _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload(o: Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload(s: String): Either[Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload(parser: Parser): Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict_Payload = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorTaggedSupportVerdict_Payload _)
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

  def fromForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container(s: String): Either[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container(parser: Parser): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(s: String): Either[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P(parser: Parser): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(s: String): Either[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS(parser: Parser): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PreState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container(s: String): Either[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container(parser: Parser): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(s: String): Either[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P(parser: Parser): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(s: String): Either[Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS(parser: Parser): Forest_Observation_Eligibility_Supervisor.RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorRequestLifecycle_eligibilitySupervisionProcess_requestLifecycle_PostState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container(s: String): Either[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container(parser: Parser): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(s: String): Either[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P(parser: Parser): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(s: String): Either[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS(parser: Parser): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PreState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container(s: String): Either[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container(parser: Parser): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(s: String): Either[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P(parser: Parser): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(s: String): Either[Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS(parser: Parser): Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorEnergyAssessor_eligibilitySupervisionProcess_energyAssessor_PostState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container(s: String): Either[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container(parser: Parser): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(s: String): Either[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P(parser: Parser): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(s: String): Either[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS(parser: Parser): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PreState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container(s: String): Either[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container(parser: Parser): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(s: String): Either[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P(parser: Parser): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(s: String): Either[Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS(parser: Parser): Forest_Observation_Eligibility_Supervisor.ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor_PostState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container(s: String): Either[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container(parser: Parser): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(s: String): Either[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P(parser: Parser): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(s: String): Either[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS(parser: Parser): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PreState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container(s: String): Either[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container(parser: Parser): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(s: String): Either[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P(parser: Parser): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(s: String): Either[Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS(parser: Parser): Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorEligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_PostState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container(s: String): Either[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container(parser: Parser): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(s: String): Either[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P(parser: Parser): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(s: String): Either[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS(parser: Parser): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PreState_Container_PS _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container(s: String): Either[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container(parser: Parser): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(s: String): Either[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P(parser: Parser): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_P _)
    return r
  }

  def fromForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(o: Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(s: String): Either[Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS, Json.ErrorMsg] = {
    def fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS(parser: Parser): Forest_Observation_Eligibility_Supervisor.AuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS = {
      val r = parser.parseForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS()
      return r
    }
    val r = to(s, fForest_Observation_Eligibility_SupervisorAuthorizationGate_eligibilitySupervisionProcess_authorizationGate_PostState_Container_PS _)
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