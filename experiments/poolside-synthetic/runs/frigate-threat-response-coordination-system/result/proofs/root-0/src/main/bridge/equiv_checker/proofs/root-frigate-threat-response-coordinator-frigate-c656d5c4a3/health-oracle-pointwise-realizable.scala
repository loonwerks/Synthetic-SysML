// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_c656d5c4a3c1_Oracle_Pointwise_Realizable {
  @pure def check(
      defenseevidence: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseEvidence): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_GumboX.compute_CEP_Post(defenseevidence, equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseCondition.READY)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_GumboX.compute_CEP_Post(defenseevidence, equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseCondition.UNAVAILABLE)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_GumboX.compute_CEP_Post(defenseevidence, equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseCondition.UNKNOWN)))))
  }
}
