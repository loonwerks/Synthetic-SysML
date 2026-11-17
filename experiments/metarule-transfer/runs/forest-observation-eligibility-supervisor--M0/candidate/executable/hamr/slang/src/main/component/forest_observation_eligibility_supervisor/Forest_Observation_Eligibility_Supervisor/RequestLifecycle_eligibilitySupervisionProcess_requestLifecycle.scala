// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestLifecycle_eligibilitySupervisionProcess_requestLifecycle {

  val idle: Z = 0
  val pending: Z = 1
  val engaged: Z = 2
  val recoveryHold: Z = 3
  val noToken: Z = 0
  val tokenA: Z = 1
  val tokenB: Z = 2
  var requestState: Z = idle
  var lastAcceptedToken: Z = noToken

  def initialise(api: RequestLifecycle_Initialization_Api): Unit = {
    Contract(
      Modifies(api, requestState, lastAcceptedToken)
    )
    requestState = idle
    lastAcceptedToken = noToken
    api.put_energyTicket(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket)
    api.put_supportTicket(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket)
    api.put_requestContext(Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext)
    api.put_eligibilityStatus(Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Idle)
  }

  def timeTriggered(api: RequestLifecycle_Operational_Api): Unit = {
    Contract(
      Modifies(api, requestState, lastAcceptedToken)
    )
    val input = api.get_requestInput()
    val outcome = api.get_gateOutcome()
    val result: (Z, Z, Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type,
      Forest_Observation_Eligibility_Supervisor.RequestContext.Type,
      Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Type) =
      if (outcome == Some(Forest_Observation_Eligibility_Supervisor.GateOutcome.Failed)) {
        (recoveryHold, lastAcceptedToken,
          Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket,
          Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext,
          Forest_Observation_Eligibility_Supervisor.EligibilityStatus.ServiceFailed)
      } else if (outcome == Some(Forest_Observation_Eligibility_Supervisor.GateOutcome.Recovered)) {
        (idle, lastAcceptedToken,
          Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket,
          Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext,
          Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Idle)
      } else if (outcome == Some(Forest_Observation_Eligibility_Supervisor.GateOutcome.DeniedPower)) {
        (idle, lastAcceptedToken,
          Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket,
          Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext,
          Forest_Observation_Eligibility_Supervisor.EligibilityStatus.DeniedPower)
      } else if (outcome == Some(Forest_Observation_Eligibility_Supervisor.GateOutcome.DeniedSupport)) {
        (idle, lastAcceptedToken,
          Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket,
          Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext,
          Forest_Observation_Eligibility_Supervisor.EligibilityStatus.DeniedSupport)
      } else if (outcome == Some(Forest_Observation_Eligibility_Supervisor.GateOutcome.Cancelled)) {
        (idle, lastAcceptedToken,
          Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket,
          Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext,
          Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Cancelled)
      } else if (outcome == Some(Forest_Observation_Eligibility_Supervisor.GateOutcome.Completed)) {
        (idle, lastAcceptedToken,
          Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket,
          Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext,
          Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Completed)
      } else if (outcome == Some(Forest_Observation_Eligibility_Supervisor.GateOutcome.Authorized)) {
        (engaged, lastAcceptedToken,
          Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket,
          Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext,
          Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Authorized)
      } else if (outcome == Some(Forest_Observation_Eligibility_Supervisor.GateOutcome.Active)) {
        (engaged, lastAcceptedToken,
          Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket,
          Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext,
          Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Active)
      } else {
        input match {
          case Some(value) if value.command == Forest_Observation_Eligibility_Supervisor.RequestCommand.Cancel &&
            (requestState == pending || requestState == engaged) =>
            (requestState, lastAcceptedToken,
              Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket,
              Forest_Observation_Eligibility_Supervisor.RequestContext.CancelOutstanding,
              Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Evaluating)
          case Some(value) if value.command == Forest_Observation_Eligibility_Supervisor.RequestCommand.Begin &&
            requestState == recoveryHold =>
            (recoveryHold, lastAcceptedToken,
              Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket,
              Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext,
              Forest_Observation_Eligibility_Supervisor.EligibilityStatus.AwaitingRecovery)
          case Some(value) if value.command == Forest_Observation_Eligibility_Supervisor.RequestCommand.Begin &&
            value.token == Forest_Observation_Eligibility_Supervisor.RequestToken.TokenA &&
            lastAcceptedToken == tokenA =>
            (requestState, lastAcceptedToken,
              Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket,
              Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext,
              Forest_Observation_Eligibility_Supervisor.EligibilityStatus.DuplicateIgnored)
          case Some(value) if value.command == Forest_Observation_Eligibility_Supervisor.RequestCommand.Begin &&
            value.token == Forest_Observation_Eligibility_Supervisor.RequestToken.TokenB &&
            lastAcceptedToken == tokenB =>
            (requestState, lastAcceptedToken,
              Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket,
              Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext,
              Forest_Observation_Eligibility_Supervisor.EligibilityStatus.DuplicateIgnored)
          case Some(value) if value.command == Forest_Observation_Eligibility_Supervisor.RequestCommand.Begin &&
            value.token == Forest_Observation_Eligibility_Supervisor.RequestToken.TokenA && requestState == idle =>
            (pending, tokenA, Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenA,
              Forest_Observation_Eligibility_Supervisor.RequestContext.EvaluateTokenA,
              Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Evaluating)
          case Some(value) if value.command == Forest_Observation_Eligibility_Supervisor.RequestCommand.Begin &&
            value.token == Forest_Observation_Eligibility_Supervisor.RequestToken.TokenB && requestState == idle =>
            (pending, tokenB, Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenB,
              Forest_Observation_Eligibility_Supervisor.RequestContext.EvaluateTokenB,
              Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Evaluating)
          case Some(value) if value.command == Forest_Observation_Eligibility_Supervisor.RequestCommand.Begin &&
            (requestState == pending || requestState == engaged) =>
            (requestState, lastAcceptedToken,
              Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket,
              Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext,
              Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Busy)
          case _ =>
            val status: Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Type =
              if (requestState == idle) Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Idle
              else if (requestState == pending) Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Evaluating
              else if (requestState == engaged) Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Active
              else Forest_Observation_Eligibility_Supervisor.EligibilityStatus.AwaitingRecovery
            (requestState, lastAcceptedToken,
              Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket,
              Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext, status)
        }
      }
    requestState = result._1
    lastAcceptedToken = result._2
    api.put_energyTicket(result._3)
    api.put_supportTicket(result._3)
    api.put_requestContext(result._4)
    api.put_eligibilityStatus(result._5)
  }

  def finalise(api: RequestLifecycle_Operational_Api): Unit = { }
}
