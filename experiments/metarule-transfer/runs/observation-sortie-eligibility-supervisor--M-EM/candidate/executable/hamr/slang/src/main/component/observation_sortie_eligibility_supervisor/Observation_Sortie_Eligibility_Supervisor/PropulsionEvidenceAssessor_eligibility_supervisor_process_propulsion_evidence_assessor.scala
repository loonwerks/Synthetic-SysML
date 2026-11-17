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
    val evidence: Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence = api.get_propulsion_evidence().get
    val result: Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment =
          if (evidence.validity != Observation_Sortie_Eligibility_Supervisor.Validity.Valid) {
            Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(F, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Invalid)
          } else if (evidence.freshness != Observation_Sortie_Eligibility_Supervisor.Freshness.Current) {
            Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(F, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Stale)
          } else if (evidence.alternatingKindsConfirmed != Observation_Sortie_Eligibility_Supervisor.Confirmation.Confirmed) {
            Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(F, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Configuration)
          } else if (evidence.engine1 != Observation_Sortie_Eligibility_Supervisor.Engine1Condition.Nominal) {
            Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(F, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Engine1)
          } else if (evidence.engine2 != Observation_Sortie_Eligibility_Supervisor.Engine2Condition.Nominal) {
            Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(F, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Engine2)
          } else if (evidence.engine3 != Observation_Sortie_Eligibility_Supervisor.Engine3Condition.Nominal) {
            Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(F, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Engine3)
          } else if (evidence.engine4 != Observation_Sortie_Eligibility_Supervisor.Engine4Condition.Nominal) {
            Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(F, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.Engine4)
          } else {
            Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment(T, Observation_Sortie_Eligibility_Supervisor.PropulsionCause.None)
          }
    api.put_propulsion_assessment(result)
  }

  def finalise(api: PropulsionEvidenceAssessor_Operational_Api): Unit = { }
}
