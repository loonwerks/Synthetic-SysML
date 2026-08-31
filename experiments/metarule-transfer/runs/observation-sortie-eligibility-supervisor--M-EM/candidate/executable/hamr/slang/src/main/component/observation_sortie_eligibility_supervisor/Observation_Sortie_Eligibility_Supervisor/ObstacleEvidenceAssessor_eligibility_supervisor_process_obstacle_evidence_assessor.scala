// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor {

  def initialise(api: ObstacleEvidenceAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_obstacle_assessment(Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment(
      F, Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Invalid))
  }

  def timeTriggered(api: ObstacleEvidenceAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val evidence: Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence = api.get_obstacle_evidence().get
    val result: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment =
          if (evidence.validity != Observation_Sortie_Eligibility_Supervisor.Validity.Valid) {
            Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment(F, Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Invalid)
          } else if (evidence.freshness != Observation_Sortie_Eligibility_Supervisor.Freshness.Current) {
            Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment(F, Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Stale)
          } else if (evidence.condition != Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.Nominal) {
            Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment(F, Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Condition)
          } else {
            Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment(T, Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.None)
          }
    api.put_obstacle_assessment(result)
  }

  def finalise(api: ObstacleEvidenceAssessor_Operational_Api): Unit = { }
}
