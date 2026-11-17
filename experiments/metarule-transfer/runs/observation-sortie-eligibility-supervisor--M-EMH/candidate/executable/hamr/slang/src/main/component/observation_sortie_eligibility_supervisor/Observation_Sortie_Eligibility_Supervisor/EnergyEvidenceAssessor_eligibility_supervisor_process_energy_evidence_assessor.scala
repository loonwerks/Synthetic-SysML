// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor {

  def initialise(api: EnergyEvidenceAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_energy_assessment(Observation_Sortie_Eligibility_Supervisor.EnergyAssessment.example())
  }

  def timeTriggered(api: EnergyEvidenceAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_energy_evidence: Option[Observation_Sortie_Eligibility_Supervisor.EnergyEvidence] = api.get_energy_evidence()
    api.logInfo(s"Received on data port energy_evidence: ${apiUsage_energy_evidence}")
  }

  def finalise(api: EnergyEvidenceAssessor_Operational_Api): Unit = { }
}
