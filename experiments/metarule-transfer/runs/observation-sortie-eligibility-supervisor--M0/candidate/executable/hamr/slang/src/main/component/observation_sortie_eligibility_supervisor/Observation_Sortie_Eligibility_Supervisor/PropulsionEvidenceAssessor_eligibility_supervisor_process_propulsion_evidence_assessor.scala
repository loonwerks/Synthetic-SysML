// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor {

  def initialise(api: PropulsionEvidenceAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_propulsion_assessment(PropulsionAssessment(F, PropulsionCause.Invalid))
  }

  def timeTriggered(api: PropulsionEvidenceAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val assessment: PropulsionAssessment = api.get_propulsion_evidence() match {
      case Some(evidence) =>
        if (evidence.validity != Validity.Valid) PropulsionAssessment(F, PropulsionCause.Invalid)
        else if (evidence.freshness != Freshness.Current) PropulsionAssessment(F, PropulsionCause.Stale)
        else if (evidence.alternatingKindsConfirmed != Confirmation.Confirmed) PropulsionAssessment(F, PropulsionCause.Configuration)
        else if (evidence.engine1 != Engine1Condition.Nominal) PropulsionAssessment(F, PropulsionCause.Engine1)
        else if (evidence.engine2 != Engine2Condition.Nominal) PropulsionAssessment(F, PropulsionCause.Engine2)
        else if (evidence.engine3 != Engine3Condition.Nominal) PropulsionAssessment(F, PropulsionCause.Engine3)
        else if (evidence.engine4 != Engine4Condition.Nominal) PropulsionAssessment(F, PropulsionCause.Engine4)
        else PropulsionAssessment(T, PropulsionCause.None)
      case _ => PropulsionAssessment(F, PropulsionCause.Invalid)
    }
    api.put_propulsion_assessment(assessment)
  }

  def finalise(api: PropulsionEvidenceAssessor_Operational_Api): Unit = { }
}
