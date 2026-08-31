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
    // example api usage

    val apiUsage_energyEvidence: Option[Forest_Observation_Eligibility_Supervisor.EnergyEvidence.Type] = api.get_energyEvidence()
    api.logInfo(s"Received on data port energyEvidence: ${apiUsage_energyEvidence}")
    val apiUsage_evaluationTicket: Option[Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type] = api.get_evaluationTicket()
    api.logInfo(s"Received on data port evaluationTicket: ${apiUsage_evaluationTicket}")
  }

  def finalise(api: EnergyAssessor_Operational_Api): Unit = { }
}
