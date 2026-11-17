// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor {

  def initialise(api: PropulsionEvidenceAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_propulsion_assessment(Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment.example())
  }

  def timeTriggered(api: PropulsionEvidenceAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_propulsion_evidence: Option[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence] = api.get_propulsion_evidence()
    api.logInfo(s"Received on data port propulsion_evidence: ${apiUsage_propulsion_evidence}")
  }

  def finalise(api: PropulsionEvidenceAssessor_Operational_Api): Unit = { }
}
