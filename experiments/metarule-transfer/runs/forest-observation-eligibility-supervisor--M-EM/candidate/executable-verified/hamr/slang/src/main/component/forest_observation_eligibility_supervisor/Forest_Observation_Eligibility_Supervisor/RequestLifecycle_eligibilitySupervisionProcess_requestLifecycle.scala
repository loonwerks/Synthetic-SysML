// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle {

  // BEGIN STATE VARS
  var requestState: Forest_Observation_Eligibility_Supervisor.RequestState.Type = Forest_Observation_Eligibility_Supervisor.RequestState.Idle

  var lastAcceptedToken: Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.Type = Forest_Observation_Eligibility_Supervisor.LastAcceptedToken.None
  // END STATE VARS

  def initialise(api: RequestLifecycle_Initialization_Api): Unit = {
    Contract(Modifies(api, requestState, lastAcceptedToken))
    requestState = RequestState.Idle
    lastAcceptedToken = LastAcceptedToken.None
    api.put_energyTicket(EvaluationTicket.NoTicket)
    api.put_supportTicket(EvaluationTicket.NoTicket)
    api.put_requestContext(RequestContext.NoContext)
    api.put_eligibilityStatus(EligibilityStatus.Idle)
  }

  def timeTriggered(api: RequestLifecycle_Operational_Api): Unit = {
    Contract(
      Modifies(api, requestState, lastAcceptedToken),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee INACTIVE_PIPELINE_COHERENCE
        api.energyTicket == EvaluationTicket.NoTicket == (api.supportTicket == EvaluationTicket.NoTicket) &
          api.energyTicket == EvaluationTicket.TokenA == (api.supportTicket == EvaluationTicket.TokenA) &
          api.energyTicket == EvaluationTicket.TokenB == (api.supportTicket == EvaluationTicket.TokenB),
        // case LIFECYCLE_FAILED_FEEDBACK
        //   Failure feedback enters recovery hold | N.md
        (api.gateOutcome == GateOutcome.Failed) ___>: (requestState == RequestState.RecoveryHold &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.ServiceFailed),
        // case LIFECYCLE_RECOVERED_FEEDBACK
        //   Recovery feedback returns to idle | N.md
        (api.gateOutcome == GateOutcome.Recovered) ___>: (requestState == RequestState.Idle &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Idle),
        // case LIFECYCLE_DENIED_POWER
        //   Power denial ends the pending request | N.md
        (api.gateOutcome == GateOutcome.DeniedPower) ___>: (requestState == RequestState.Idle &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.DeniedPower),
        // case LIFECYCLE_DENIED_SUPPORT
        //   Support denial ends the pending request | N.md
        (api.gateOutcome == GateOutcome.DeniedSupport) ___>: (requestState == RequestState.Idle &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.DeniedSupport),
        // case LIFECYCLE_CANCELLED
        //   Withdrawal acknowledgement ends the request | N.md
        (api.gateOutcome == GateOutcome.Cancelled) ___>: (requestState == RequestState.Idle &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Cancelled),
        // case LIFECYCLE_COMPLETED
        //   Completion feedback ends the request | N.md
        (api.gateOutcome == GateOutcome.Completed) ___>: (requestState == RequestState.Idle &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Completed),
        // case LIFECYCLE_AUTHORIZED
        //   Authorization feedback engages the request | N.md
        (api.gateOutcome == GateOutcome.Authorized) ___>: (requestState == RequestState.Engaged &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Authorized),
        // case LIFECYCLE_ACTIVE
        //   Active feedback retains the engaged request | N.md
        (api.gateOutcome == GateOutcome.Active) ___>: (requestState == RequestState.Engaged &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Active),
        // case LIFECYCLE_NO_COMMAND
        //   No command preserves the logical request state | N.md
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.NoCommand) ___>: (api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          (requestState == RequestState.Idle ___>:
            api.eligibilityStatus == EligibilityStatus.Idle) &
          (requestState == RequestState.Pending ___>:
            api.eligibilityStatus == EligibilityStatus.Evaluating) &
          (requestState == RequestState.Engaged ___>:
            api.eligibilityStatus == EligibilityStatus.Active) &
          (requestState == RequestState.RecoveryHold ___>:
            api.eligibilityStatus == EligibilityStatus.AwaitingRecovery)),
        // case LIFECYCLE_CANCEL_OUTSTANDING
        //   Cancel an outstanding pending or engaged request | N.md
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Cancel &
          (In(requestState) == RequestState.Pending |
            In(requestState) == RequestState.Engaged)) ___>: (api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.CancelOutstanding &
          api.eligibilityStatus == EligibilityStatus.Evaluating),
        // case LIFECYCLE_CANCEL_NOOP
        //   Cancel is inert while idle or awaiting recovery | N.md
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Cancel &
          (In(requestState) == RequestState.Idle |
            In(requestState) == RequestState.RecoveryHold)) ___>: (api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          (requestState == RequestState.Idle ___>:
            api.eligibilityStatus == EligibilityStatus.Idle) &
          (requestState == RequestState.RecoveryHold ___>:
            api.eligibilityStatus == EligibilityStatus.AwaitingRecovery)),
        // case LIFECYCLE_BEGIN_DURING_RECOVERY
        //   Begin is withheld until fault recovery | N.md
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Begin &
          In(requestState) == RequestState.RecoveryHold) ___>: (requestState == RequestState.RecoveryHold &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.AwaitingRecovery),
        // case LIFECYCLE_REPLAY_TOKEN_A
        //   Replay of accepted TokenA is ignored | N.md
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Begin &
          api.requestInput.token == RequestToken.TokenA &
          In(lastAcceptedToken) == LastAcceptedToken.TokenA &
          In(requestState) != RequestState.RecoveryHold) ___>: (api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.DuplicateIgnored),
        // case LIFECYCLE_REPLAY_TOKEN_B
        //   Replay of accepted TokenB is ignored | N.md
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Begin &
          api.requestInput.token == RequestToken.TokenB &
          In(lastAcceptedToken) == LastAcceptedToken.TokenB &
          In(requestState) != RequestState.RecoveryHold) ___>: (api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.DuplicateIgnored),
        // case LIFECYCLE_FRESH_TOKEN_A
        //   Fresh TokenA begins a coherent evaluation | N.md
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Begin &
          api.requestInput.token == RequestToken.TokenA &
          In(lastAcceptedToken) != LastAcceptedToken.TokenA &
          In(requestState) == RequestState.Idle) ___>: (requestState == RequestState.Pending &
          lastAcceptedToken == LastAcceptedToken.TokenA &
          api.energyTicket == EvaluationTicket.TokenA &
          api.supportTicket == EvaluationTicket.TokenA &
          api.requestContext == RequestContext.EvaluateTokenA &
          api.eligibilityStatus == EligibilityStatus.Evaluating),
        // case LIFECYCLE_FRESH_TOKEN_B
        //   Fresh TokenB begins a coherent evaluation | N.md
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Begin &
          api.requestInput.token == RequestToken.TokenB &
          In(lastAcceptedToken) != LastAcceptedToken.TokenB &
          In(requestState) == RequestState.Idle) ___>: (requestState == RequestState.Pending &
          lastAcceptedToken == LastAcceptedToken.TokenB &
          api.energyTicket == EvaluationTicket.TokenB &
          api.supportTicket == EvaluationTicket.TokenB &
          api.requestContext == RequestContext.EvaluateTokenB &
          api.eligibilityStatus == EligibilityStatus.Evaluating),
        // case LIFECYCLE_BUSY_TOKEN_A
        //   Fresh TokenA is busy while work is outstanding | N.md
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Begin &
          api.requestInput.token == RequestToken.TokenA &
          In(lastAcceptedToken) != LastAcceptedToken.TokenA &
          (In(requestState) == RequestState.Pending |
            In(requestState) == RequestState.Engaged)) ___>: (api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Busy),
        // case LIFECYCLE_BUSY_TOKEN_B
        //   Fresh TokenB is busy while work is outstanding | N.md
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Begin &
          api.requestInput.token == RequestToken.TokenB &
          In(lastAcceptedToken) != LastAcceptedToken.TokenB &
          (In(requestState) == RequestState.Pending |
            In(requestState) == RequestState.Engaged)) ___>: (api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Busy)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val request = api.get_requestInput().get
    val outcome = api.get_gateOutcome().get
    var ticket: EvaluationTicket.Type = EvaluationTicket.NoTicket
    var context: RequestContext.Type = RequestContext.NoContext
    var status: EligibilityStatus.Type = EligibilityStatus.Idle

    if (outcome == GateOutcome.Failed) {
      requestState = RequestState.RecoveryHold
      status = EligibilityStatus.ServiceFailed
    } else if (outcome == GateOutcome.Recovered) {
      requestState = RequestState.Idle
      status = EligibilityStatus.Idle
    } else if (outcome == GateOutcome.DeniedPower) {
      requestState = RequestState.Idle
      status = EligibilityStatus.DeniedPower
    } else if (outcome == GateOutcome.DeniedSupport) {
      requestState = RequestState.Idle
      status = EligibilityStatus.DeniedSupport
    } else if (outcome == GateOutcome.Cancelled) {
      requestState = RequestState.Idle
      status = EligibilityStatus.Cancelled
    } else if (outcome == GateOutcome.Completed) {
      requestState = RequestState.Idle
      status = EligibilityStatus.Completed
    } else if (outcome == GateOutcome.Authorized) {
      requestState = RequestState.Engaged
      status = EligibilityStatus.Authorized
    } else if (outcome == GateOutcome.Active) {
      requestState = RequestState.Engaged
      status = EligibilityStatus.Active
    } else if (request.command == RequestCommand.NoCommand) {
      if (requestState == RequestState.Idle) {
        status = EligibilityStatus.Idle
      } else if (requestState == RequestState.Pending) {
        status = EligibilityStatus.Evaluating
      } else if (requestState == RequestState.Engaged) {
        status = EligibilityStatus.Active
      } else {
        status = EligibilityStatus.AwaitingRecovery
      }
    } else if (request.command == RequestCommand.Cancel) {
      if (requestState == RequestState.Pending || requestState == RequestState.Engaged) {
        context = RequestContext.CancelOutstanding
        status = EligibilityStatus.Evaluating
      } else if (requestState == RequestState.RecoveryHold) {
        status = EligibilityStatus.AwaitingRecovery
      } else {
        status = EligibilityStatus.Idle
      }
    } else if (requestState == RequestState.RecoveryHold) {
      status = EligibilityStatus.AwaitingRecovery
    } else if (request.token == RequestToken.TokenA &&
      lastAcceptedToken == LastAcceptedToken.TokenA) {
      status = EligibilityStatus.DuplicateIgnored
    } else if (request.token == RequestToken.TokenB &&
      lastAcceptedToken == LastAcceptedToken.TokenB) {
      status = EligibilityStatus.DuplicateIgnored
    } else if (requestState == RequestState.Idle && request.token == RequestToken.TokenA) {
      requestState = RequestState.Pending
      lastAcceptedToken = LastAcceptedToken.TokenA
      ticket = EvaluationTicket.TokenA
      context = RequestContext.EvaluateTokenA
      status = EligibilityStatus.Evaluating
    } else if (requestState == RequestState.Idle && request.token == RequestToken.TokenB) {
      requestState = RequestState.Pending
      lastAcceptedToken = LastAcceptedToken.TokenB
      ticket = EvaluationTicket.TokenB
      context = RequestContext.EvaluateTokenB
      status = EligibilityStatus.Evaluating
    } else {
      status = EligibilityStatus.Busy
    }
    api.put_energyTicket(ticket)
    api.put_supportTicket(ticket)
    api.put_requestContext(context)
    api.put_eligibilityStatus(status)
  }

  def finalise(api: RequestLifecycle_Operational_Api): Unit = { }
}
