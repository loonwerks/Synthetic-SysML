// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_523f17bf3a1f_3_Valid {
  @pure def check(
      communication_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment,
      energy_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyAssessment,
      fault_summary: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.FaultSummary,
      navigation_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.NavigationAssessment,
      observation_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment,
      obstacle_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment,
      propulsion_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
