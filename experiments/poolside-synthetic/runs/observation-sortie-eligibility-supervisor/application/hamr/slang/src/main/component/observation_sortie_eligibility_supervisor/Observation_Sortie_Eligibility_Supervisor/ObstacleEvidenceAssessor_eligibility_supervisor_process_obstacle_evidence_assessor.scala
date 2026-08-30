// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor {

  def initialise(api: ObstacleEvidenceAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_obstacle_assessment(Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment.example())
  }

  def timeTriggered(api: ObstacleEvidenceAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_obstacle_evidence: Option[Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence] = api.get_obstacle_evidence()
    api.logInfo(s"Received on data port obstacle_evidence: ${apiUsage_obstacle_evidence}")
  }

  def finalise(api: ObstacleEvidenceAssessor_Operational_Api): Unit = { }
}
