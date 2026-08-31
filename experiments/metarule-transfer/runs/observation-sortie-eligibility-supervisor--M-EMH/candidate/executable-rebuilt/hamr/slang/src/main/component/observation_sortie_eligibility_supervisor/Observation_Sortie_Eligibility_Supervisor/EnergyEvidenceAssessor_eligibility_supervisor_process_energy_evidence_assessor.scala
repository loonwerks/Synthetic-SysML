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
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case ENERGY_READY
        (api.energy_evidence.validity == Validity.Valid &
          api.energy_evidence.freshness == Freshness.Current &
          api.energy_evidence.quality == EnergyQuality.Nominal) ___>: (api.energy_assessment.ready &
          api.energy_assessment.localCause == EnergyCause.None),
        // case ENERGY_NOT_READY_INVALID
        (api.energy_evidence.validity == Validity.Invalid) ___>: (!(api.energy_assessment.ready) &
          api.energy_assessment.localCause == EnergyCause.Invalid),
        // case ENERGY_NOT_READY_STALE
        (api.energy_evidence.validity == Validity.Valid &
          api.energy_evidence.freshness == Freshness.Stale) ___>: (!(api.energy_assessment.ready) &
          api.energy_assessment.localCause == EnergyCause.Stale),
        // case ENERGY_NOT_READY_UNAVAILABLE_OR_UNKNOWN
        (api.energy_evidence.validity == Validity.Valid &
          api.energy_evidence.freshness == Freshness.Current &
          (api.energy_evidence.quality == EnergyQuality.Unavailable |
            api.energy_evidence.quality == EnergyQuality.Unknown)) ___>: (!(api.energy_assessment.ready) &
          api.energy_assessment.localCause == EnergyCause.UnavailableOrUnknown),
        // case ENERGY_NOT_READY_LIMITED
        (api.energy_evidence.validity == Validity.Valid &
          api.energy_evidence.freshness == Freshness.Current &
          api.energy_evidence.quality == EnergyQuality.Limited) ___>: (!(api.energy_assessment.ready) &
          api.energy_assessment.localCause == EnergyCause.Limited)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val evidence = api.get_energy_evidence().get
    val assessment: EnergyAssessment =
      if (evidence.validity == Validity.Invalid) {
        EnergyAssessment(F, EnergyCause.Invalid)
      } else if (evidence.freshness == Freshness.Stale) {
        EnergyAssessment(F, EnergyCause.Stale)
      } else if (evidence.quality == EnergyQuality.Unavailable |
                 evidence.quality == EnergyQuality.Unknown) {
        EnergyAssessment(F, EnergyCause.UnavailableOrUnknown)
      } else if (evidence.quality == EnergyQuality.Limited) {
        EnergyAssessment(F, EnergyCause.Limited)
      } else {
        EnergyAssessment(T, EnergyCause.None)
      }
    api.put_energy_assessment(assessment)
  }

  def finalise(api: EnergyEvidenceAssessor_Operational_Api): Unit = { }
}
