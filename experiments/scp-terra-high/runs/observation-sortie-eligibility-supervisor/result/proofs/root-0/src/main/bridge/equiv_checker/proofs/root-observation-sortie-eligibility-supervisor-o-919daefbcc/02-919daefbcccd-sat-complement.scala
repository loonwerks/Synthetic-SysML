// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_919daefbcccd_2_Complement {
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
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EligibilityDecisionOwner_eligibility_supervisor_process_eligibility_decision_owner_GumboX.inititialize_IEP_Post(eligibility_decision))) & T)))
  }
}
