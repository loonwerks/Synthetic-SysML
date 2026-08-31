// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor {

  def initialise(api: CommunicationEvidenceAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_communication_assessment(Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment.example())
  }

  def timeTriggered(api: CommunicationEvidenceAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_communication_evidence: Option[Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence] = api.get_communication_evidence()
    api.logInfo(s"Received on data port communication_evidence: ${apiUsage_communication_evidence}")
  }

  def finalise(api: CommunicationEvidenceAssessor_Operational_Api): Unit = { }
}
