// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2697b42b0afb_2_Valid {
  @pure def check(
      communication_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment,
      eligibility_decision: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EligibilityDecision,
      energy_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyAssessment,
      navigation_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.NavigationAssessment,
      observation_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment,
      obstacle_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment,
      propulsion_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment,
      recovery_facts: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RecoveryFacts,
      request_phase: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_GumboX.compute_CEP_Post(communication_assessment, energy_assessment, navigation_assessment, observation_assessment, obstacle_assessment, propulsion_assessment, recovery_facts, request_phase, eligibility_decision))) & T))
  }
}
