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

  def timeTriggered(api: EligibilityArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val context = api.get_requestContext()
    val energy = api.get_energyVerdictIn()
    val support = api.get_supportVerdictIn()
    val matchingA = context == Some(Forest_Observation_Eligibility_Supervisor.RequestContext.EvaluateTokenA) &&
      energy.exists((v: Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict) =>
        v.ticket == Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenA) &&
      support.exists((v: Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict) =>
        v.ticket == Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenA)
    val matchingB = context == Some(Forest_Observation_Eligibility_Supervisor.RequestContext.EvaluateTokenB) &&
      energy.exists((v: Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict) =>
        v.ticket == Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenB) &&
      support.exists((v: Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict) =>
        v.ticket == Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenB)
    val decision: Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Type =
      if (context == Some(Forest_Observation_Eligibility_Supervisor.RequestContext.CancelOutstanding)) {
        Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Withdraw
      } else if (matchingA || matchingB) {
        (energy, support) match {
          case (Some(e), Some(_))
              if e.verdict == Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyInsufficient ||
                e.verdict == Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyUntrusted =>
            Forest_Observation_Eligibility_Supervisor.EligibilityDecision.DenyPower
          case (Some(e), Some(s))
              if e.verdict == Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyReady &&
                (s.verdict == Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportUnavailable ||
                  s.verdict == Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportUntrusted) =>
            Forest_Observation_Eligibility_Supervisor.EligibilityDecision.DenySupport
          case (Some(e), Some(s))
              if e.verdict == Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyReady &&
                s.verdict == Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportReady =>
            Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Permit
          case _ => Forest_Observation_Eligibility_Supervisor.EligibilityDecision.NoDecision
        }
      } else {
        Forest_Observation_Eligibility_Supervisor.EligibilityDecision.NoDecision
      }
    api.put_eligibilityDecision(decision)
  }

  def finalise(api: EligibilityArbiter_Operational_Api): Unit = { }
}
