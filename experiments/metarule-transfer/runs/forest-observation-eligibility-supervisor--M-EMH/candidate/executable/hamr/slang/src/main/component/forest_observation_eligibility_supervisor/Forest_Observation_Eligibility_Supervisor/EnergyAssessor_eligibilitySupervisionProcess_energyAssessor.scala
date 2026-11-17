// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EnergyAssessor_eligibilitySupervisionProcess_energyAssessor {

  def initialise(api: EnergyAssessor_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_energyVerdictOut(Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict(
      Forest_Observation_Eligibility_Supervisor.EnergyVerdict.NoEnergyVerdict,
      Forest_Observation_Eligibility_Supervisor.TaggedTicket.NoTicket))
  }

  @helper
  def timeTriggered(api: EnergyAssessor_Operational_Api): Unit = {
    val evidence = api.get_energyEvidence()
    val ticket = api.get_evaluationTicket()
    val noVerdict = Forest_Observation_Eligibility_Supervisor.EnergyVerdict.NoEnergyVerdict
    val noTicket = Forest_Observation_Eligibility_Supervisor.TaggedTicket.NoTicket

    var verdict = noVerdict
    var taggedTicket = noTicket

    (ticket, evidence) match {
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenA),
            Some(Forest_Observation_Eligibility_Supervisor.EnergyEvidence.AdequateCurrent)) =>
        taggedTicket = Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenA
        verdict = Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyReady
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenB),
            Some(Forest_Observation_Eligibility_Supervisor.EnergyEvidence.AdequateCurrent)) =>
        taggedTicket = Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenB
        verdict = Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyReady
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenA),
            Some(Forest_Observation_Eligibility_Supervisor.EnergyEvidence.LowCurrent)) =>
        taggedTicket = Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenA
        verdict = Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyInsufficient
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenB),
            Some(Forest_Observation_Eligibility_Supervisor.EnergyEvidence.LowCurrent)) =>
        taggedTicket = Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenB
        verdict = Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyInsufficient
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenA), Some(_)) =>
        taggedTicket = Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenA
        verdict = Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyUntrusted
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenB), Some(_)) =>
        taggedTicket = Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenB
        verdict = Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyUntrusted
      case _ =>
    }

    api.put_energyVerdictOut(Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict(verdict, taggedTicket))
  }

  def finalise(api: EnergyAssessor_Operational_Api): Unit = { }
}
