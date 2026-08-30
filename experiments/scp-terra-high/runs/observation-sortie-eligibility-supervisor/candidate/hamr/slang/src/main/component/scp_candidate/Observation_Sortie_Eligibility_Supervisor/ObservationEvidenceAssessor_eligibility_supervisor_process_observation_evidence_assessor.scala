// #Sireum

package scp_candidate.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor {

  def initialise(api: ObservationEvidenceAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_observation_assessment(Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment.example())
  }

  def timeTriggered(api: ObservationEvidenceAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_observation_evidence() match {
      case Some(e) =>
        val r: SingleEquipmentAssessment = if (e.validity != Validity.Valid) SingleEquipmentAssessment(F, SingleEquipmentCause.Invalid)
        else if (e.freshness != Freshness.Current) SingleEquipmentAssessment(F, SingleEquipmentCause.Stale)
        else if (e.condition == EquipmentCondition.Nominal) SingleEquipmentAssessment(T, SingleEquipmentCause.None)
        else SingleEquipmentAssessment(F, SingleEquipmentCause.Condition)
        api.put_observation_assessment(r)
    }
  }

  def finalise(api: ObservationEvidenceAssessor_Operational_Api): Unit = { }
}
