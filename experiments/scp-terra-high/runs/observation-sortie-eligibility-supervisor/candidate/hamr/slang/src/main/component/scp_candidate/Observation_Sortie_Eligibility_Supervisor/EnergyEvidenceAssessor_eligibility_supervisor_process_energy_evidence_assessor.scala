// #Sireum

package scp_candidate.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor {

  def initialise(api: EnergyEvidenceAssessor_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_ENERGY_NOT_READY
        api.energy_assessment.ready == F &&
          api.energy_assessment.localCause == EnergyCause.Invalid
        // END INITIALIZES ENSURES
      )
    )
    api.put_energy_assessment(EnergyAssessment(F, EnergyCause.Invalid))
  }

  def timeTriggered(api: EnergyEvidenceAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_energy_evidence() match {
      case Some(evidence) =>
        val assessment: EnergyAssessment =
          if (evidence.validity != Validity.Valid) EnergyAssessment(F, EnergyCause.Invalid)
          else if (evidence.freshness != Freshness.Current) EnergyAssessment(F, EnergyCause.Stale)
          else if (evidence.quality == EnergyQuality.Nominal) EnergyAssessment(T, EnergyCause.None)
          else if (evidence.quality == EnergyQuality.Limited) EnergyAssessment(F, EnergyCause.Limited)
          else EnergyAssessment(F, EnergyCause.UnavailableOrUnknown)
        api.put_energy_assessment(assessment)
    }
  }

  def finalise(api: EnergyEvidenceAssessor_Operational_Api): Unit = { }
}
