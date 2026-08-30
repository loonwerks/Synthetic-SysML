// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor {

  def initialise(api: ObservationEvidenceAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_observation_assessment(Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment.example())
  }

  def timeTriggered(api: ObservationEvidenceAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_observation_evidence: Option[Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence] = api.get_observation_evidence()
    api.logInfo(s"Received on data port observation_evidence: ${apiUsage_observation_evidence}")
  }

  def finalise(api: ObservationEvidenceAssessor_Operational_Api): Unit = { }
}
