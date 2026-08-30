// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_ee0272304072_Oracle_Pointwise_Realizable {
  @pure def check(
      retreatnavigationevidence: equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatNavigationEvidence): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_GumboX.compute_CEP_Post(retreatnavigationevidence, equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatCondition.AVAILABLE)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_GumboX.compute_CEP_Post(retreatnavigationevidence, equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatCondition.UNAVAILABLE)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_GumboX.compute_CEP_Post(retreatnavigationevidence, equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatCondition.COMPLETE)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatReadinessAssessor_threatResponseProcess_retreatReadinessAssessor_GumboX.compute_CEP_Post(retreatnavigationevidence, equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatCondition.UNKNOWN)))))
  }
}
