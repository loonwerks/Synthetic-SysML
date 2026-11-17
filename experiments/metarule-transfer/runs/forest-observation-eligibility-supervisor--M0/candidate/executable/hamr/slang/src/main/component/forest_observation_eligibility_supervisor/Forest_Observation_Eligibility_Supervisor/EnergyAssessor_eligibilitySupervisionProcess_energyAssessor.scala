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
    api.put_energyVerdictOut(
      Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict(
        Forest_Observation_Eligibility_Supervisor.EnergyVerdict.NoEnergyVerdict,
        Forest_Observation_Eligibility_Supervisor.TaggedTicket.NoTicket))
  }

  def timeTriggered(api: EnergyAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val ticket = api.get_evaluationTicket()
    val evidence = api.get_energyEvidence()
    val output: Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict = (ticket, evidence) match {
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenA),
            Some(Forest_Observation_Eligibility_Supervisor.EnergyEvidence.AdequateCurrent)) =>
        Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict(
          Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyReady,
          Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenA)
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenB),
            Some(Forest_Observation_Eligibility_Supervisor.EnergyEvidence.AdequateCurrent)) =>
        Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict(
          Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyReady,
          Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenB)
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenA),
            Some(Forest_Observation_Eligibility_Supervisor.EnergyEvidence.LowCurrent)) =>
        Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict(
          Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyInsufficient,
          Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenA)
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenB),
            Some(Forest_Observation_Eligibility_Supervisor.EnergyEvidence.LowCurrent)) =>
        Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict(
          Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyInsufficient,
          Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenB)
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenA), Some(_)) =>
        Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict(
          Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyUntrusted,
          Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenA)
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenB), Some(_)) =>
        Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict(
          Forest_Observation_Eligibility_Supervisor.EnergyVerdict.EnergyUntrusted,
          Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenB)
      case _ =>
        Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict(
          Forest_Observation_Eligibility_Supervisor.EnergyVerdict.NoEnergyVerdict,
          Forest_Observation_Eligibility_Supervisor.TaggedTicket.NoTicket)
    }
    api.put_energyVerdictOut(output)
  }

  def finalise(api: EnergyAssessor_Operational_Api): Unit = { }
}
