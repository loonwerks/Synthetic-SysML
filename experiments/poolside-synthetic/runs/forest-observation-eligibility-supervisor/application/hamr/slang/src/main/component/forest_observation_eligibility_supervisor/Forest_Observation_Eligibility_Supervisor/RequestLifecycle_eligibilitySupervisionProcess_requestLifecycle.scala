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
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_energyTicket(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket)
    api.put_supportTicket(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket)
    api.put_requestContext(Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext)
    api.put_eligibilityStatus(Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Idle)
  }

  def timeTriggered(api: RequestLifecycle_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        requestState,
        lastAcceptedToken
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee INACTIVE_PIPELINE_COHERENCE
        //   energyTicket and supportTicket must agree
        api.energyTicket == EvaluationTicket.NoTicket == (api.supportTicket == EvaluationTicket.NoTicket) &
          api.energyTicket == EvaluationTicket.TokenA == (api.supportTicket == EvaluationTicket.TokenA) &
          api.energyTicket == EvaluationTicket.TokenB == (api.supportTicket == EvaluationTicket.TokenB),
        // case LIFECYCLE_FAILED_FEEDBACK
        //   if gateOutcome is Failed
        (api.gateOutcome == GateOutcome.Failed) ___>: (requestState == RequestState.RecoveryHold &
          lastAcceptedToken == In(lastAcceptedToken) &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.ServiceFailed),
        // case LIFECYCLE_RECOVERED_FEEDBACK
        //   if gateOutcome is Recovered
        (api.gateOutcome == GateOutcome.Recovered) ___>: (requestState == RequestState.Idle &
          lastAcceptedToken == In(lastAcceptedToken) &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Idle),
        // case LIFECYCLE_DENIED_POWER
        //   if gateOutcome is DeniedPower
        (api.gateOutcome == GateOutcome.DeniedPower) ___>: (requestState == RequestState.Idle &
          lastAcceptedToken == In(lastAcceptedToken) &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.DeniedPower),
        // case LIFECYCLE_DENIED_SUPPORT
        //   if gateOutcome is DeniedSupport
        (api.gateOutcome == GateOutcome.DeniedSupport) ___>: (requestState == RequestState.Idle &
          lastAcceptedToken == In(lastAcceptedToken) &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.DeniedSupport),
        // case LIFECYCLE_CANCELLED
        //   if gateOutcome is Cancelled
        (api.gateOutcome == GateOutcome.Cancelled) ___>: (requestState == RequestState.Idle &
          lastAcceptedToken == In(lastAcceptedToken) &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Cancelled),
        // case LIFECYCLE_COMPLETED
        //   if gateOutcome is Completed
        (api.gateOutcome == GateOutcome.Completed) ___>: (requestState == RequestState.Idle &
          lastAcceptedToken == In(lastAcceptedToken) &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Completed),
        // case LIFECYCLE_AUTHORIZED
        //   if gateOutcome is Authorized
        (api.gateOutcome == GateOutcome.Authorized) ___>: (requestState == RequestState.Engaged &
          lastAcceptedToken == In(lastAcceptedToken) &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Authorized),
        // case LIFECYCLE_ACTIVE
        //   if gateOutcome is Active
        (api.gateOutcome == GateOutcome.Active) ___>: (requestState == RequestState.Engaged &
          lastAcceptedToken == In(lastAcceptedToken) &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Active),
        // case LIFECYCLE_NO_COMMAND
        //   if gateOutcome is None and requestInput command is NoCommand
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.NoCommand) ___>: (requestState == In(requestState) &
          lastAcceptedToken == In(lastAcceptedToken) &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          (In(requestState) == RequestState.Idle ___>:
            api.eligibilityStatus == EligibilityStatus.Idle) &
          (In(requestState) == RequestState.Pending ___>:
            api.eligibilityStatus == EligibilityStatus.Evaluating) &
          (In(requestState) == RequestState.Engaged ___>:
            api.eligibilityStatus == EligibilityStatus.Active) &
          (In(requestState) == RequestState.RecoveryHold ___>:
            api.eligibilityStatus == EligibilityStatus.AwaitingRecovery)),
        // case LIFECYCLE_CANCEL_OUTSTANDING
        //   if gateOutcome is None, requestInput command is Cancel, and requestState on entry is Pending or Engaged
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Cancel &
          (In(requestState) == RequestState.Pending |
            In(requestState) == RequestState.Engaged)) ___>: (requestState == In(requestState) &
          lastAcceptedToken == In(lastAcceptedToken) &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.CancelOutstanding &
          api.eligibilityStatus == EligibilityStatus.Evaluating),
        // case LIFECYCLE_CANCEL_NOOP
        //   if gateOutcome is None, requestInput command is Cancel, and requestState on entry is Idle or RecoveryHold
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Cancel &
          (In(requestState) == RequestState.Idle |
            In(requestState) == RequestState.RecoveryHold)) ___>: (requestState == In(requestState) &
          lastAcceptedToken == In(lastAcceptedToken) &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          (In(requestState) == RequestState.Idle ___>:
            api.eligibilityStatus == EligibilityStatus.Idle) &
          (In(requestState) == RequestState.RecoveryHold ___>:
            api.eligibilityStatus == EligibilityStatus.AwaitingRecovery)),
        // case LIFECYCLE_BEGIN_DURING_RECOVERY
        //   if gateOutcome is None, requestInput command is Begin, and requestState on entry is RecoveryHold
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Begin &
          In(requestState) == RequestState.RecoveryHold) ___>: (requestState == RequestState.RecoveryHold &
          lastAcceptedToken == In(lastAcceptedToken) &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.AwaitingRecovery),
        // case LIFECYCLE_REPLAY_TOKEN_A
        //   if gateOutcome is None, requestInput command is Begin, token is TokenA replayed, and requestState on entry is not RecoveryHold
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Begin &
          api.requestInput.token == RequestToken.TokenA &
          In(lastAcceptedToken) == LastAcceptedToken.TokenA &
          In(requestState) != RequestState.RecoveryHold) ___>: (requestState == In(requestState) &
          lastAcceptedToken == In(lastAcceptedToken) &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.DuplicateIgnored),
        // case LIFECYCLE_REPLAY_TOKEN_B
        //   if gateOutcome is None, requestInput command is Begin, token is TokenB replayed, and requestState on entry is not RecoveryHold
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Begin &
          api.requestInput.token == RequestToken.TokenB &
          In(lastAcceptedToken) == LastAcceptedToken.TokenB &
          In(requestState) != RequestState.RecoveryHold) ___>: (requestState == In(requestState) &
          lastAcceptedToken == In(lastAcceptedToken) &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.DuplicateIgnored),
        // case LIFECYCLE_FRESH_TOKEN_A
        //   if gateOutcome is None, requestInput command is Begin, token is TokenA fresh, and requestState on entry is Idle
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
        //   if gateOutcome is None, requestInput command is Begin, token is TokenB fresh, and requestState on entry is Idle
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
        //   if gateOutcome is None, requestInput command is Begin, token is TokenA not fresh, and requestState on entry is Pending or Engaged
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Begin &
          api.requestInput.token == RequestToken.TokenA &
          In(lastAcceptedToken) != LastAcceptedToken.TokenA &
          (In(requestState) == RequestState.Pending |
            In(requestState) == RequestState.Engaged)) ___>: (requestState == In(requestState) &
          lastAcceptedToken == In(lastAcceptedToken) &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Busy),
        // case LIFECYCLE_BUSY_TOKEN_B
        //   if gateOutcome is None, requestInput command is Begin, token is TokenB not fresh, and requestState on entry is Pending or Engaged
        (api.gateOutcome == GateOutcome.None &
          api.requestInput.command == RequestCommand.Begin &
          api.requestInput.token == RequestToken.TokenB &
          In(lastAcceptedToken) != LastAcceptedToken.TokenB &
          (In(requestState) == RequestState.Pending |
            In(requestState) == RequestState.Engaged)) ___>: (requestState == In(requestState) &
          lastAcceptedToken == In(lastAcceptedToken) &
          api.energyTicket == EvaluationTicket.NoTicket &
          api.supportTicket == EvaluationTicket.NoTicket &
          api.requestContext == RequestContext.NoContext &
          api.eligibilityStatus == EligibilityStatus.Busy)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_requestInput: Option[Forest_Observation_Eligibility_Supervisor.RequestInput] = api.get_requestInput()
    api.logInfo(s"Received on data port requestInput: ${apiUsage_requestInput}")
    val apiUsage_gateOutcome: Option[Forest_Observation_Eligibility_Supervisor.GateOutcome.Type] = api.get_gateOutcome()
    api.logInfo(s"Received on data port gateOutcome: ${apiUsage_gateOutcome}")
  }

  def finalise(api: RequestLifecycle_Operational_Api): Unit = { }
}
