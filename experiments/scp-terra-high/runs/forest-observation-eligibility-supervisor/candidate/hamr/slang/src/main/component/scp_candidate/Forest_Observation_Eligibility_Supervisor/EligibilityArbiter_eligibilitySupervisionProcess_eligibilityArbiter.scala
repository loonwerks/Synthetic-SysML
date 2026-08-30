// #Sireum

package scp_candidate.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter {

  def initialise(api: EligibilityArbiter_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_DECISION
        api.eligibilityDecision == EligibilityDecision.NoDecision
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_eligibilityDecision(Forest_Observation_Eligibility_Supervisor.EligibilityDecision.NoDecision)
  }

  def timeTriggered(api: EligibilityArbiter_Operational_Api): Unit = {
    Contract(Modifies(api))
    val context: Option[RequestContext.Type] = api.get_requestContext()
    val energy: Option[TaggedEnergyVerdict] = api.get_energyVerdictIn()
    val support: Option[TaggedSupportVerdict] = api.get_supportVerdictIn()
    val decision: EligibilityDecision.Type = (context, energy, support) match {
      case (Some(RequestContext.CancelOutstanding), _, _) => EligibilityDecision.Withdraw
      case (Some(RequestContext.EvaluateTokenA), Some(e), Some(s))
        if e.ticket == TaggedTicket.TokenA & s.ticket == TaggedTicket.TokenA =>
        if (e.verdict == EnergyVerdict.EnergyReady & s.verdict == SupportVerdict.SupportReady) EligibilityDecision.Permit
        else if (e.verdict == EnergyVerdict.EnergyReady) EligibilityDecision.DenySupport
        else EligibilityDecision.DenyPower
      case (Some(RequestContext.EvaluateTokenB), Some(e), Some(s))
        if e.ticket == TaggedTicket.TokenB & s.ticket == TaggedTicket.TokenB =>
        if (e.verdict == EnergyVerdict.EnergyReady & s.verdict == SupportVerdict.SupportReady) EligibilityDecision.Permit
        else if (e.verdict == EnergyVerdict.EnergyReady) EligibilityDecision.DenySupport
        else EligibilityDecision.DenyPower
      case _ => EligibilityDecision.NoDecision
    }
    api.put_eligibilityDecision(decision)
  }

  def finalise(api: EligibilityArbiter_Operational_Api): Unit = { }
}
