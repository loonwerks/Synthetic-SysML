// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EnergyAssessor_eligibilitySupervisionProcess_energyAssessor {

  def initialise(api: EnergyAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_energyVerdictOut(Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict.example())
  }

  def timeTriggered(api: EnergyAssessor_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case ENERGY_INACTIVE
        //   if evaluationTicket is NoTicket
        (api.evaluationTicket == EvaluationTicket.NoTicket) ___>: (api.energyVerdictOut.ticket == TaggedTicket.NoTicket &
          api.energyVerdictOut.verdict == EnergyVerdict.NoEnergyVerdict),
        // case ENERGY_READY
        //   if evaluationTicket is not NoTicket and energyEvidence is AdequateCurrent
        (api.evaluationTicket != EvaluationTicket.NoTicket &
          api.energyEvidence == EnergyEvidence.AdequateCurrent) ___>: ((api.evaluationTicket == EvaluationTicket.TokenA ___>:
          api.energyVerdictOut.ticket == TaggedTicket.TokenA) &
          (api.evaluationTicket == EvaluationTicket.TokenB ___>:
            api.energyVerdictOut.ticket == TaggedTicket.TokenB) &
          api.energyVerdictOut.verdict == EnergyVerdict.EnergyReady),
        // case ENERGY_INSUFFICIENT
        //   if evaluationTicket is not NoTicket and energyEvidence is LowCurrent
        (api.evaluationTicket != EvaluationTicket.NoTicket &
          api.energyEvidence == EnergyEvidence.LowCurrent) ___>: ((api.evaluationTicket == EvaluationTicket.TokenA ___>:
          api.energyVerdictOut.ticket == TaggedTicket.TokenA) &
          (api.evaluationTicket == EvaluationTicket.TokenB ___>:
            api.energyVerdictOut.ticket == TaggedTicket.TokenB) &
          api.energyVerdictOut.verdict == EnergyVerdict.EnergyInsufficient),
        // case ENERGY_UNTRUSTED
        //   if evaluationTicket is not NoTicket and energyEvidence is UnknownCurrent Invalid or Stale
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
    // example api usage

    val apiUsage_energyEvidence: Option[Forest_Observation_Eligibility_Supervisor.EnergyEvidence.Type] = api.get_energyEvidence()
    api.logInfo(s"Received on data port energyEvidence: ${apiUsage_energyEvidence}")
    val apiUsage_evaluationTicket: Option[Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type] = api.get_evaluationTicket()
    api.logInfo(s"Received on data port evaluationTicket: ${apiUsage_evaluationTicket}")
  }

  def finalise(api: EnergyAssessor_Operational_Api): Unit = { }
}
