// #Sireum

package scp_candidate.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle {

  // BEGIN STATE VARS
  var requestState: Forest_Observation_Eligibility_Supervisor.RequestState.Type = Forest_Observation_Eligibility_Supervisor.RequestState.Idle

  var lastAcceptedToken: Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.Type = Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.None
  // END STATE VARS

  def initialise(api: RequestLifecycle_Initialization_Api): Unit = {
    Contract(
      Modifies(api, requestState, lastAcceptedToken),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_LIFECYCLE
        requestState == RequestState.Idle &
          lastAcceptedToken == LastAcceptedToken.None &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Idle
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    requestState = RequestState.Idle
    lastAcceptedToken = LastAcceptedToken.None
    api.put_energyTicket(EvaluationTicket.NoTicket)
    api.put_supportTicket(EvaluationTicket.NoTicket)
    api.put_requestContext(RequestContext.NoContext)
    api.put_eligibilityStatus(EligibilityStatus.Idle)
  }

  def timeTriggered(api: RequestLifecycle_Operational_Api): Unit = {
    Contract(Modifies(api, requestState, lastAcceptedToken))
    val input: Option[RequestInput] = api.get_requestInput()
    val feedback: Option[GateOutcome.Type] = api.get_gateOutcome()
    var energyTicket: EvaluationTicket.Type = EvaluationTicket.NoTicket
    var supportTicket: EvaluationTicket.Type = EvaluationTicket.NoTicket
    var context: RequestContext.Type = RequestContext.NoContext
    var status: EligibilityStatus.Type = EligibilityStatus.Idle

    feedback match {
      case Some(GateOutcome.Failed) =>
        requestState = RequestState.RecoveryHold
        status = EligibilityStatus.ServiceFailed
      case Some(GateOutcome.Recovered) =>
        requestState = RequestState.Idle
      case Some(GateOutcome.DeniedPower) =>
        requestState = RequestState.Idle
        status = EligibilityStatus.DeniedPower
      case Some(GateOutcome.DeniedSupport) =>
        requestState = RequestState.Idle
        status = EligibilityStatus.DeniedSupport
      case Some(GateOutcome.Cancelled) =>
        requestState = RequestState.Idle
        status = EligibilityStatus.Cancelled
      case Some(GateOutcome.Completed) =>
        requestState = RequestState.Idle
        status = EligibilityStatus.Completed
      case Some(GateOutcome.Authorized) =>
        requestState = RequestState.Engaged
        status = EligibilityStatus.Authorized
      case Some(GateOutcome.Active) =>
        requestState = RequestState.Engaged
        status = EligibilityStatus.Active
      case _ =>
        input match {
          case Some(RequestInput(RequestCommand.Cancel, _))
            if requestState == RequestState.Pending | requestState == RequestState.Engaged =>
            context = RequestContext.CancelOutstanding
            status = EligibilityStatus.Evaluating
          case Some(RequestInput(RequestCommand.Begin, _)) if requestState == RequestState.RecoveryHold =>
            status = EligibilityStatus.AwaitingRecovery
          case Some(RequestInput(RequestCommand.Begin, RequestToken.TokenA))
            if requestState != RequestState.RecoveryHold & lastAcceptedToken == LastAcceptedToken.TokenA =>
            status = EligibilityStatus.DuplicateIgnored
          case Some(RequestInput(RequestCommand.Begin, RequestToken.TokenB))
            if requestState != RequestState.RecoveryHold & lastAcceptedToken == LastAcceptedToken.TokenB =>
            status = EligibilityStatus.DuplicateIgnored
          case Some(RequestInput(RequestCommand.Begin, RequestToken.TokenA)) if requestState == RequestState.Idle =>
            requestState = RequestState.Pending
            lastAcceptedToken = LastAcceptedToken.TokenA
            energyTicket = EvaluationTicket.TokenA
            supportTicket = EvaluationTicket.TokenA
            context = RequestContext.EvaluateTokenA
            status = EligibilityStatus.Evaluating
          case Some(RequestInput(RequestCommand.Begin, RequestToken.TokenB)) if requestState == RequestState.Idle =>
            requestState = RequestState.Pending
            lastAcceptedToken = LastAcceptedToken.TokenB
            energyTicket = EvaluationTicket.TokenB
            supportTicket = EvaluationTicket.TokenB
            context = RequestContext.EvaluateTokenB
            status = EligibilityStatus.Evaluating
          case Some(RequestInput(RequestCommand.Begin, _)) =>
            status = EligibilityStatus.Busy
          case _ =>
            status =
              if (requestState == RequestState.Idle) EligibilityStatus.Idle
              else if (requestState == RequestState.Pending) EligibilityStatus.Evaluating
              else if (requestState == RequestState.Engaged) EligibilityStatus.Active
              else EligibilityStatus.AwaitingRecovery
        }
    }
    api.put_energyTicket(energyTicket)
    api.put_supportTicket(supportTicket)
    api.put_requestContext(context)
    api.put_eligibilityStatus(status)
  }

  def finalise(api: RequestLifecycle_Operational_Api): Unit = { }
}
