// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter {

  def initialise(api: EligibilityArbiter_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_eligibilityDecision(Forest_Observation_Eligibility_Supervisor.EligibilityDecision.NoDecision)
  }

  @helper
  def timeTriggered(api: EligibilityArbiter_Operational_Api): Unit = {
    val context = api.get_requestContext()
    val energy = api.get_energyVerdictIn()
    val support = api.get_supportVerdictIn()
    val decision: Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Type = (context, energy, support) match {
      case (Some(Forest_Observation_Eligibility_Supervisor.RequestContext.CancelOutstanding), _, _) =>
        Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Withdraw
      case (Some(Forest_Observation_Eligibility_Supervisor.RequestContext.EvaluateTokenA),
            Some(e), Some(s))
          if e.ticket == Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenA &&
             s.ticket == Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenA =>
        decide(e.verdict, s.verdict)
      case (Some(Forest_Observation_Eligibility_Supervisor.RequestContext.EvaluateTokenB),
            Some(e), Some(s))
          if e.ticket == Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenB &&
             s.ticket == Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenB =>
        decide(e.verdict, s.verdict)
      case _ =>
        Forest_Observation_Eligibility_Supervisor.EligibilityDecision.NoDecision
    }
    api.put_eligibilityDecision(decision)
  }

  def finalise(api: EligibilityArbiter_Operational_Api): Unit = { }

  def decide(
    energy: Forest_Observation_Eligibility_Supervisor.EnergyVerdict.Type,
    support: Forest_Observation_Eligibility_Supervisor.SupportVerdict.Type): Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Type = {
    if (energy == Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyInsufficient ||
        energy == Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyUntrusted) {
      return Forest_Observation_Eligibility_Supervisor.EligibilityDecision.DenyPower
    }
    if (energy == Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyReady &&
        (support == Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportUnavailable ||
         support == Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportUntrusted)) {
      return Forest_Observation_Eligibility_Supervisor.EligibilityDecision.DenySupport
    }
    if (energy == Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyReady &&
        support == Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportReady) {
      return Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Permit
    }
    return Forest_Observation_Eligibility_Supervisor.EligibilityDecision.NoDecision
  }
}
