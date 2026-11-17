// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor {

  def initialise(api: NavigationEvidenceAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_navigation_assessment(Observation_Sortie_Eligibility_Supervisor.NavigationAssessment.example())
  }

  def timeTriggered(api: NavigationEvidenceAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_navigation_evidence: Option[Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord] = api.get_navigation_evidence()
    api.logInfo(s"Received on data port navigation_evidence: ${apiUsage_navigation_evidence}")
  }

  def finalise(api: NavigationEvidenceAssessor_Operational_Api): Unit = { }
}
