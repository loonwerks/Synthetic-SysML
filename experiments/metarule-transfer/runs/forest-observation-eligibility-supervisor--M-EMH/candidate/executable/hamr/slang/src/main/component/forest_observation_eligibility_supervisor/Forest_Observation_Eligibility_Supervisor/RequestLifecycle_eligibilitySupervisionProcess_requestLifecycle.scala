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
      Modifies(requestState, lastAcceptedToken, api)
    )
    requestState = idle
    lastAcceptedToken = noToken
    api.put_energyTicket(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket)
    api.put_supportTicket(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket)
    api.put_requestContext(Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext)
    api.put_eligibilityStatus(Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Idle)
  }

  @helper
  def timeTriggered(api: RequestLifecycle_Operational_Api): Unit = {
    Contract(
      Modifies(requestState, lastAcceptedToken, api)
    )
    val input: Z = requestCode(api)
    val gateOutcome: Z = gateOutcomeCode(api)

    var energyTicket = Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket
    var supportTicket = Forest_Observation_Eligibility_Supervisor.EvaluationTicket.NoTicket
    var requestContext = Forest_Observation_Eligibility_Supervisor.RequestContext.NoContext
    var status = stateStatus(requestState)

    gateOutcome match {
      case 7 =>
        requestState = recoveryHold
        status = Forest_Observation_Eligibility_Supervisor.EligibilityStatus.ServiceFailed
      case 8 =>
        requestState = idle
        status = Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Idle
      case 1 =>
        requestState = idle
        status = Forest_Observation_Eligibility_Supervisor.EligibilityStatus.DeniedPower
      case 2 =>
        requestState = idle
        status = Forest_Observation_Eligibility_Supervisor.EligibilityStatus.DeniedSupport
      case 5 =>
        requestState = idle
        status = Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Cancelled
      case 6 =>
        requestState = idle
        status = Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Completed
      case 3 =>
        requestState = engaged
        status = Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Authorized
      case 4 =>
        requestState = engaged
        status = Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Active
      case _ =>
        if (input == 0) {
          status = stateStatus(requestState)
        } else if (input == 3) {
          if (requestState == pending || requestState == engaged) {
            requestContext = Forest_Observation_Eligibility_Supervisor.RequestContext.CancelOutstanding
            status = Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Evaluating
          } else {
            status = stateStatus(requestState)
          }
        } else if (requestState == recoveryHold) {
          status = Forest_Observation_Eligibility_Supervisor.EligibilityStatus.AwaitingRecovery
        } else if (input == 1 && lastAcceptedToken == tokenA) {
          status = Forest_Observation_Eligibility_Supervisor.EligibilityStatus.DuplicateIgnored
        } else if (input == 2 && lastAcceptedToken == tokenB) {
          status = Forest_Observation_Eligibility_Supervisor.EligibilityStatus.DuplicateIgnored
        } else if (requestState == idle && input == 1) {
          requestState = pending
          lastAcceptedToken = tokenA
          energyTicket = Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenA
          supportTicket = Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenA
          requestContext = Forest_Observation_Eligibility_Supervisor.RequestContext.EvaluateTokenA
          status = Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Evaluating
        } else if (requestState == idle && input == 2) {
          requestState = pending
          lastAcceptedToken = tokenB
          energyTicket = Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenB
          supportTicket = Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenB
          requestContext = Forest_Observation_Eligibility_Supervisor.RequestContext.EvaluateTokenB
          status = Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Evaluating
        } else {
          status = Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Busy
        }
    }

    api.put_energyTicket(energyTicket)
    api.put_supportTicket(supportTicket)
    api.put_requestContext(requestContext)
    api.put_eligibilityStatus(status)
  }

  def finalise(api: RequestLifecycle_Operational_Api): Unit = { }

  def stateStatus(
    state: Z): Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Type = {
    state match {
      case `idle` =>
        return Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Idle
      case `pending` =>
        return Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Evaluating
      case `engaged` =>
        return Forest_Observation_Eligibility_Supervisor.EligibilityStatus.Active
      case _ =>
        return Forest_Observation_Eligibility_Supervisor.EligibilityStatus.AwaitingRecovery
    }
  }

  @helper def requestCode(api: RequestLifecycle_Operational_Api): Z = {
    val request = api.get_requestInput().getOrElse(Forest_Observation_Eligibility_Supervisor.RequestInput.example())
    request.command match {
      case Forest_Observation_Eligibility_Supervisor.RequestCommand.NoCommand => return 0
      case Forest_Observation_Eligibility_Supervisor.RequestCommand.Cancel => return 3
      case Forest_Observation_Eligibility_Supervisor.RequestCommand.Begin =>
        if (request.token == Forest_Observation_Eligibility_Supervisor.RequestToken.TokenA) {
          return 1
        } else {
          return 2
        }
    }
  }

  @helper def gateOutcomeCode(api: RequestLifecycle_Operational_Api): Z = {
    api.get_gateOutcome().getOrElse(Forest_Observation_Eligibility_Supervisor.GateOutcome.None) match {
      case Forest_Observation_Eligibility_Supervisor.GateOutcome.DeniedPower => return 1
      case Forest_Observation_Eligibility_Supervisor.GateOutcome.DeniedSupport => return 2
      case Forest_Observation_Eligibility_Supervisor.GateOutcome.Authorized => return 3
      case Forest_Observation_Eligibility_Supervisor.GateOutcome.Active => return 4
      case Forest_Observation_Eligibility_Supervisor.GateOutcome.Cancelled => return 5
      case Forest_Observation_Eligibility_Supervisor.GateOutcome.Completed => return 6
      case Forest_Observation_Eligibility_Supervisor.GateOutcome.Failed => return 7
      case Forest_Observation_Eligibility_Supervisor.GateOutcome.Recovered => return 8
      case _ => return 0
    }
  }
}
