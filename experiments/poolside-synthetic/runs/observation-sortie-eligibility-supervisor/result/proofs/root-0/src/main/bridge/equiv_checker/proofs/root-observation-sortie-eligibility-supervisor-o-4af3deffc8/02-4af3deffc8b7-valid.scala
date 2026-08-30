// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4af3deffc8b7_2_Valid {
  @pure def check(
      communication_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment,
      energy_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyAssessment,
      fault_summary: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.FaultSummary,
      navigation_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.NavigationAssessment,
      observation_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment,
      obstacle_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment,
      propulsion_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.FaultRegistry_eligibility_supervisor_process_fault_registry_GumboX.compute_CEP_Post(communication_assessment, energy_assessment, navigation_assessment, observation_assessment, obstacle_assessment, propulsion_assessment, fault_summary))) & T))
  }
}
