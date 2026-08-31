// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor {

  def initialise(api: PropulsionEvidenceAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_propulsion_assessment(Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(
      F, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Invalid))
  }

  def timeTriggered(api: PropulsionEvidenceAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val input: Option[Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence] = api.get_propulsion_evidence()
    var result: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment =
      Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(
        F, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Invalid)
    input match {
      case Some(e) =>
        if (e.validity == Observation_Sortie_Eligibility_Supervisor.Validity.Valid &&
          e.freshness == Observation_Sortie_Eligibility_Supervisor.Freshness.Current &&
          e.alternatingKindsConfirmed == Observation_Sortie_Eligibility_Supervisor.Confirmation.Confirmed &&
          e.engine1 == Observation_Sortie_Eligibility_Supervisor.Engine1Condition.Nominal &&
          e.engine2 == Observation_Sortie_Eligibility_Supervisor.Engine2Condition.Nominal &&
          e.engine3 == Observation_Sortie_Eligibility_Supervisor.Engine3Condition.Nominal &&
          e.engine4 == Observation_Sortie_Eligibility_Supervisor.Engine4Condition.Nominal) {
          result = Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(
            T, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.None)
        } else if (e.validity == Observation_Sortie_Eligibility_Supervisor.Validity.Invalid) {
          result = Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(
            F, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Invalid)
        } else if (e.freshness == Observation_Sortie_Eligibility_Supervisor.Freshness.Stale) {
          result = Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(
            F, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Stale)
        } else if (e.alternatingKindsConfirmed != Observation_Sortie_Eligibility_Supervisor.Confirmation.Confirmed) {
          result = Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(
            F, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Configuration)
        } else if (e.engine1 != Observation_Sortie_Eligibility_Supervisor.Engine1Condition.Nominal) {
          result = Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(
            F, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Engine1)
        } else if (e.engine2 != Observation_Sortie_Eligibility_Supervisor.Engine2Condition.Nominal) {
          result = Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(
            F, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Engine2)
        } else if (e.engine3 != Observation_Sortie_Eligibility_Supervisor.Engine3Condition.Nominal) {
          result = Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(
            F, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Engine3)
        } else {
          result = Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(
            F, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Engine4)
        }
      case _ =>
    }
    api.put_propulsion_assessment(result)
  }

  def finalise(api: PropulsionEvidenceAssessor_Operational_Api): Unit = { }
}
