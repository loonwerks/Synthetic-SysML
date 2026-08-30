// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ee0272304072_4_Valid {
  @pure def check(
      retreatcondition: equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatCondition.Type,
      retreatnavigationevidence: equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_GumboX.compute_CEP_Post(retreatnavigationevidence, retreatcondition))) ___>: (equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_Candidate_GumboX.compute_CEP_Post(retreatnavigationevidence, retreatcondition))) & T))
  }
}
