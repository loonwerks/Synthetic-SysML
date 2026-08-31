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
    val evidence: Observation_Sortie_Eligibility_Supervisor.EnergyEvidence = api.get_energy_evidence().get
    val result: Observation_Sortie_Eligibility_Supervisor.EnergyAssessment =
          if (evidence.validity != Observation_Sortie_Eligibility_Supervisor.Validity.Valid) {
            Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(F, Observation_Sortie_Eligibility_Supervisor.EnergyCause.Invalid)
          } else if (evidence.freshness != Observation_Sortie_Eligibility_Supervisor.Freshness.Current) {
            Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(F, Observation_Sortie_Eligibility_Supervisor.EnergyCause.Stale)
          } else if (evidence.quality == Observation_Sortie_Eligibility_Supervisor.EnergyQuality.Unavailable ||
                     evidence.quality == Observation_Sortie_Eligibility_Supervisor.EnergyQuality.Unknown) {
            Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(F, Observation_Sortie_Eligibility_Supervisor.EnergyCause.UnavailableOrUnknown)
          } else if (evidence.quality != Observation_Sortie_Eligibility_Supervisor.EnergyQuality.Nominal) {
            Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(F, Observation_Sortie_Eligibility_Supervisor.EnergyCause.Limited)
          } else {
            Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(T, Observation_Sortie_Eligibility_Supervisor.EnergyCause.None)
          }
    api.put_energy_assessment(result)
  }

  def finalise(api: EnergyEvidenceAssessor_Operational_Api): Unit = { }
}
