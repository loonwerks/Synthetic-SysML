// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor {

  def initialise(api: CommunicationEvidenceAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_communication_assessment(Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment(
      F, Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Invalid))
  }

  def timeTriggered(api: CommunicationEvidenceAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val input: Option[Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence] = api.get_communication_evidence()
    var result: Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment =
      Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment(
        F, Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Condition)
    input match {
      case Some(e) =>
        if (e.validity == Observation_Sortie_Eligibility_Supervisor.Validity.Valid &&
          e.freshness == Observation_Sortie_Eligibility_Supervisor.Freshness.Current &&
          e.condition == Observation_Sortie_Eligibility_Supervisor.EquipmentCondition.Nominal) {
          result = Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment(
          T, Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.None)
        } else if (e.validity == Observation_Sortie_Eligibility_Supervisor.Validity.Invalid) {
          result = Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment(
          F, Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Invalid)
        } else if (e.freshness == Observation_Sortie_Eligibility_Supervisor.Freshness.Stale) {
          result = Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment(
          F, Observation_Sortie_Eligibility_Supervisor.SingleEquipmentCause.Stale)
        }
      case _ =>
    }
    api.put_communication_assessment(result)
  }

  def finalise(api: CommunicationEvidenceAssessor_Operational_Api): Unit = { }
}
