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
        //   N.md INACTIVE_PIPELINE_COHERENCE
        api.energyTicket == EvaluationTicket.NoTicket == (api.supportTicket == EvaluationTicket.NoTicket) &
          api.energyTicket == EvaluationTicket.TokenA == (api.supportTicket == EvaluationTicket.TokenA) &
          api.energyTicket == EvaluationTicket.TokenB == (api.supportTicket == EvaluationTicket.TokenB),
        // case LIFECYCLE_FAILED_FEEDBACK
        //   N.md LIFECYCLE_FAILED_FEEDBACK
        (api.gateOutcome == GateOutcome.Failed) ___>: (requestState == RequestState.RecoveryHold &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.ServiceFailed),
        // case LIFECYCLE_RECOVERED_FEEDBACK
        //   N.md LIFECYCLE_RECOVERED_FEEDBACK
        (api.gateOutcome == GateOutcome.Recovered) ___>: (requestState == RequestState.Idle &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Idle),
        // case LIFECYCLE_DENIED_POWER
        //   N.md LIFECYCLE_DENIED_POWER
        (api.gateOutcome == GateOutcome.DeniedPower) ___>: (requestState == RequestState.Idle &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.DeniedPower),
        // case LIFECYCLE_DENIED_SUPPORT
        //   N.md LIFECYCLE_DENIED_SUPPORT
        (api.gateOutcome == GateOutcome.DeniedSupport) ___>: (requestState == RequestState.Idle &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.DeniedSupport),
        // case LIFECYCLE_CANCELLED
        //   N.md LIFECYCLE_CANCELLED
        (api.gateOutcome == GateOutcome.Cancelled) ___>: (requestState == RequestState.Idle &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Cancelled),
        // case LIFECYCLE_COMPLETED
        //   N.md LIFECYCLE_COMPLETED
        (api.gateOutcome == GateOutcome.Completed) ___>: (requestState == RequestState.Idle &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Completed),
        // case LIFECYCLE_AUTHORIZED
        //   N.md LIFECYCLE_AUTHORIZED
        (api.gateOutcome == GateOutcome.Authorized) ___>: (requestState == RequestState.Engaged &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Authorized),
        // case LIFECYCLE_ACTIVE
        //   N.md LIFECYCLE_ACTIVE
        (api.gateOutcome == GateOutcome.Active) ___>: (requestState == RequestState.Engaged &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Active),
        // case LIFECYCLE_NO_COMMAND
        //   N.md LIFECYCLE_NO_COMMAND
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.NoCommand) ___>: (api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext),
        // case LIFECYCLE_CANCEL_OUTSTANDING
        //   N.md LIFECYCLE_CANCEL_OUTSTANDING
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Cancel &
          (In(requestState) == RequestState.Pending |
            In(requestState) == RequestState.Engaged)) ___>: (api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.CancelOutstanding &
          api.eligibilityStatus == EligibilityStatus.Evaluating),
        // case LIFECYCLE_CANCEL_NOOP
        //   N.md LIFECYCLE_CANCEL_NOOP
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Cancel &
          (In(requestState) == RequestState.Idle |
            In(requestState) == RequestState.RecoveryHold)) ___>: (api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext),
        // case LIFECYCLE_BEGIN_DURING_RECOVERY
        //   N.md LIFECYCLE_BEGIN_DURING_RECOVERY
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Begin &
          In(requestState) == RequestState.RecoveryHold) ___>: (requestState == RequestState.RecoveryHold &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.AwaitingRecovery),
        // case LIFECYCLE_REPLAY_TOKEN_A
        //   N.md LIFECYCLE_REPLAY_TOKEN_A
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Begin &
          api.requestInput.token == RequestToken.TokenA &
          In(lastAcceptedToken) == LastAcceptedToken.TokenA &
          In(requestState) != RequestState.RecoveryHold) ___>: (api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.DuplicateIgnored),
        // case LIFECYCLE_REPLAY_TOKEN_B
        //   N.md LIFECYCLE_REPLAY_TOKEN_B
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Begin &
          api.requestInput.token == RequestToken.TokenB &
          In(lastAcceptedToken) == LastAcceptedToken.TokenB &
          In(requestState) != RequestState.RecoveryHold) ___>: (api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.DuplicateIgnored),
        // case LIFECYCLE_FRESH_TOKEN_A
        //   N.md LIFECYCLE_FRESH_TOKEN_A
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
        //   N.md LIFECYCLE_FRESH_TOKEN_B
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
        //   N.md LIFECYCLE_BUSY_TOKEN_A
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
        //   N.md LIFECYCLE_BUSY_TOKEN_B
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
      status = if (requestState == RequestState.Idle) EligibilityStatus.Idle
      else if (requestState == RequestState.Pending) EligibilityStatus.Evaluating
      else if (requestState == RequestState.Engaged) EligibilityStatus.Active
      else EligibilityStatus.AwaitingRecovery
    } else if (request.command == RequestCommand.Cancel) {
      if (requestState == RequestState.Pending | requestState == RequestState.Engaged) {
        context = RequestContext.CancelOutstanding
        status = EligibilityStatus.Evaluating
      } else if (requestState == RequestState.Idle) {
        status = EligibilityStatus.Idle
      } else {
        status = EligibilityStatus.AwaitingRecovery
      }
    } else if (requestState == RequestState.RecoveryHold) {
      status = EligibilityStatus.AwaitingRecovery
    } else if (request.token == RequestToken.TokenA &
      lastAcceptedToken == LastAcceptedToken.TokenA) {
      status = EligibilityStatus.DuplicateIgnored
    } else if (request.token == RequestToken.TokenB &
      lastAcceptedToken == LastAcceptedToken.TokenB) {
      status = EligibilityStatus.DuplicateIgnored
    } else if (requestState == RequestState.Idle & request.token == RequestToken.TokenA) {
      requestState = RequestState.Pending
      lastAcceptedToken = LastAcceptedToken.TokenA
      ticket = EvaluationTicket.TokenA
      context = RequestContext.EvaluateTokenA
      status = EligibilityStatus.Evaluating
    } else if (requestState == RequestState.Idle & request.token == RequestToken.TokenB) {
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
