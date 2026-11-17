// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EnergyAssessor_eligibilitySupervisionProcess_energyAssessor {

  def initialise(api: EnergyAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_energyVerdictOut(TaggedEnergyVerdict(EnergyVerdict.NoEnergyVerdict, TaggedTicket.NoTicket))
  }

  def timeTriggered(api: EnergyAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case ENERGY_INACTIVE
        //   N.md ENERGY_INACTIVE
        (api.evaluationTicket == EvaluationTicket.NoTicket) ___>: (api.energyVerdictOut.ticket == TaggedTicket.NoTicket &
          api.energyVerdictOut.verdict == EnergyVerdict.NoEnergyVerdict),
        // case ENERGY_READY
        //   N.md ENERGY_READY
        (api.evaluationTicket != EvaluationTicket.NoTicket &
          api.energyEvidence == EnergyEvidence.AdequateCurrent) ___>: ((api.evaluationTicket == EvaluationTicket.TokenA ___>:
          api.energyVerdictOut.ticket == TaggedTicket.TokenA) &
          (api.evaluationTicket == EvaluationTicket.TokenB ___>:
            api.energyVerdictOut.ticket == TaggedTicket.TokenB) &
          api.energyVerdictOut.verdict == EnergyVerdict.EnergyReady),
        // case ENERGY_INSUFFICIENT
        //   N.md ENERGY_INSUFFICIENT
        (api.evaluationTicket != EvaluationTicket.NoTicket &
          api.energyEvidence == EnergyEvidence.LowCurrent) ___>: ((api.evaluationTicket == EvaluationTicket.TokenA ___>:
          api.energyVerdictOut.ticket == TaggedTicket.TokenA) &
          (api.evaluationTicket == EvaluationTicket.TokenB ___>:
            api.energyVerdictOut.ticket == TaggedTicket.TokenB) &
          api.energyVerdictOut.verdict == EnergyVerdict.EnergyInsufficient),
        // case ENERGY_UNTRUSTED
        //   N.md ENERGY_UNTRUSTED
        (api.evaluationTicket != EvaluationTicket.NoTicket &
          (api.energyEvidence == EnergyEvidence.UnknownCurrent |
            api.energyEvidence == EnergyEvidence.Invalid |
            api.energyEvidence == EnergyEvidence.Stale)) ___>: ((api.evaluationTicket == EvaluationTicket.TokenA ___>:
          api.energyVerdictOut.ticket == TaggedTicket.TokenA) &
          (api.evaluationTicket == EvaluationTicket.TokenB ___>:
            api.energyVerdictOut.ticket == TaggedTicket.TokenB) &
          api.energyVerdictOut.verdict == EnergyVerdict.EnergyUntrusted)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val evidence = api.get_energyEvidence().get
    val ticket = api.get_evaluationTicket().get
    val taggedTicket: TaggedTicket.Type = ticket match {
      case EvaluationTicket.TokenA => TaggedTicket.TokenA
      case EvaluationTicket.TokenB => TaggedTicket.TokenB
      case _ => TaggedTicket.NoTicket
    }
    val verdict: EnergyVerdict.Type =
      if (ticket == EvaluationTicket.NoTicket) EnergyVerdict.NoEnergyVerdict
      else if (evidence == EnergyEvidence.AdequateCurrent) EnergyVerdict.EnergyReady
      else if (evidence == EnergyEvidence.LowCurrent) EnergyVerdict.EnergyInsufficient
      else EnergyVerdict.EnergyUntrusted
    api.put_energyVerdictOut(TaggedEnergyVerdict(verdict, taggedTicket))
  }

  def finalise(api: EnergyAssessor_Operational_Api): Unit = { }
}
