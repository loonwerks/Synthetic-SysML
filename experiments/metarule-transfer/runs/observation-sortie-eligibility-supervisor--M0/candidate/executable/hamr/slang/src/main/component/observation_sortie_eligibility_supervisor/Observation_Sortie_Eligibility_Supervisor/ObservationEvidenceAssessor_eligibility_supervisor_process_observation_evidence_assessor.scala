// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor {

  def initialise(api: ObservationEvidenceAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_observation_assessment(SingleEquipmentAssessment(F, SingleEquipmentCause.Invalid))
  }

  def timeTriggered(api: ObservationEvidenceAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val assessment: SingleEquipmentAssessment = api.get_observation_evidence() match {
      case Some(evidence) =>
        if (evidence.validity != Validity.Valid) SingleEquipmentAssessment(F, SingleEquipmentCause.Invalid)
        else if (evidence.freshness != Freshness.Current) SingleEquipmentAssessment(F, SingleEquipmentCause.Stale)
        else if (evidence.condition != EquipmentCondition.Nominal) SingleEquipmentAssessment(F, SingleEquipmentCause.Condition)
        else SingleEquipmentAssessment(T, SingleEquipmentCause.None)
      case _ => SingleEquipmentAssessment(F, SingleEquipmentCause.Invalid)
    }
    api.put_observation_assessment(assessment)
  }

  def finalise(api: ObservationEvidenceAssessor_Operational_Api): Unit = { }
}
