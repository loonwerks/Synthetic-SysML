// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor {

  def initialise(api: EnergyEvidenceAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_energy_assessment(Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(
      F, Observation_Sortie_Eligibility_Supervisor.EnergyCause.Invalid))
  }

  def timeTriggered(api: EnergyEvidenceAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val input: Option[Observation_Sortie_Eligibility_Supervisor.EnergyEvidence] = api.get_energy_evidence()
    var result: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment =
      Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(
        F, Observation_Sortie_Eligibility_Supervisor.EnergyCause.UnavailableOrUnknown)
    input match {
      case Some(e) =>
        if (e.validity == Observation_Sortie_Eligibility_Supervisor.Validity.Valid &&
          e.freshness == Observation_Sortie_Eligibility_Supervisor.Freshness.Current &&
          e.quality == Observation_Sortie_Eligibility_Supervisor.EnergyQuality.Nominal) {
        result = Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(
          T, Observation_Sortie_Eligibility_Supervisor.EnergyCause.None)
        } else if (e.validity == Observation_Sortie_Eligibility_Supervisor.Validity.Invalid) {
          result = Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(
          F, Observation_Sortie_Eligibility_Supervisor.EnergyCause.Invalid)
        } else if (e.freshness == Observation_Sortie_Eligibility_Supervisor.Freshness.Stale) {
          result = Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(
          F, Observation_Sortie_Eligibility_Supervisor.EnergyCause.Stale)
        } else if (e.quality == Observation_Sortie_Eligibility_Supervisor.EnergyQuality.Limited) {
          result = Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(
          F, Observation_Sortie_Eligibility_Supervisor.EnergyCause.Limited)
        } else {
          result = Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(
            F, Observation_Sortie_Eligibility_Supervisor.EnergyCause.UnavailableOrUnknown)
        }
      case _ =>
    }
    api.put_energy_assessment(result)
  }

  def finalise(api: EnergyEvidenceAssessor_Operational_Api): Unit = { }
}
