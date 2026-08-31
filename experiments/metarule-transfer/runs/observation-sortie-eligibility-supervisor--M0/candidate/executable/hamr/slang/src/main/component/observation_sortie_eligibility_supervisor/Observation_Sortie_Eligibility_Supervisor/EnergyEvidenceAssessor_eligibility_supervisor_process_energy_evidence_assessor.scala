// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor {

  def initialise(api: EnergyEvidenceAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_energy_assessment(EnergyAssessment(F, EnergyCause.Invalid))
  }

  def timeTriggered(api: EnergyEvidenceAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val assessment: EnergyAssessment = api.get_energy_evidence() match {
      case Some(evidence) =>
        if (evidence.validity != Validity.Valid) EnergyAssessment(F, EnergyCause.Invalid)
        else if (evidence.freshness != Freshness.Current) EnergyAssessment(F, EnergyCause.Stale)
        else if (evidence.quality == EnergyQuality.Nominal) EnergyAssessment(T, EnergyCause.None)
        else if (evidence.quality == EnergyQuality.Limited) EnergyAssessment(F, EnergyCause.Limited)
        else EnergyAssessment(F, EnergyCause.UnavailableOrUnknown)
      case _ => EnergyAssessment(F, EnergyCause.Invalid)
    }
    api.put_energy_assessment(assessment)
  }

  def finalise(api: EnergyEvidenceAssessor_Operational_Api): Unit = { }
}
