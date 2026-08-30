// #Sireum

package scp_candidate.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor {

  def initialise(api: PropulsionEvidenceAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_propulsion_assessment(Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment.example())
  }

  def timeTriggered(api: PropulsionEvidenceAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_propulsion_evidence() match {
      case Some(e) =>
        val r: PropulsionAssessment = if (e.validity != Validity.Valid) PropulsionAssessment(F, PropulsionCause.Invalid)
        else if (e.freshness != Freshness.Current) PropulsionAssessment(F, PropulsionCause.Stale)
        else if (e.alternatingKindsConfirmed != Confirmation.Confirmed) PropulsionAssessment(F, PropulsionCause.Configuration)
        else if (e.engine1 != Engine1Condition.Nominal) PropulsionAssessment(F, PropulsionCause.Engine1)
        else if (e.engine2 != Engine2Condition.Nominal) PropulsionAssessment(F, PropulsionCause.Engine2)
        else if (e.engine3 != Engine3Condition.Nominal) PropulsionAssessment(F, PropulsionCause.Engine3)
        else if (e.engine4 != Engine4Condition.Nominal) PropulsionAssessment(F, PropulsionCause.Engine4)
        else PropulsionAssessment(T, PropulsionCause.None)
        api.put_propulsion_assessment(r)
    }
  }

  def finalise(api: PropulsionEvidenceAssessor_Operational_Api): Unit = { }
}
