// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_17a7a9905f8c_3_Complement {
  @pure def check(
      assessment_defense: equiv_shared_0.Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue,
      assessment_mining: equiv_shared_0.Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue,
      assessment_mobility: equiv_shared_0.Mining_Threat_Retreat_Supervision.ReadinessAssessmentValue,
      capacitor_band: equiv_shared_0.Mining_Threat_Retreat_Supervision.CapacitorBandValue,
      cargo_band: equiv_shared_0.Mining_Threat_Retreat_Supervision.CargoBandValue,
      defense_available: equiv_shared_0.Mining_Threat_Retreat_Supervision.DefenseAvailabilityValue,
      destination_available: equiv_shared_0.Mining_Threat_Retreat_Supervision.DestinationAvailabilityValue,
      location: equiv_shared_0.Mining_Threat_Retreat_Supervision.LocationValue,
      mining_available: equiv_shared_0.Mining_Threat_Retreat_Supervision.MiningAvailabilityValue,
      retreat_available: equiv_shared_0.Mining_Threat_Retreat_Supervision.RetreatAvailabilityValue,
      service_available: equiv_shared_0.Mining_Threat_Retreat_Supervision.ServiceAvailabilityValue): Unit = {
    Contract(Requires(!((T) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervision.Readiness_Assessment_supervisor_process_readiness_assessment_GumboX.compute_CEP_Pre(capacitor_band, cargo_band, defense_available, destination_available, location, mining_available, retreat_available, service_available)))))
  }
}
