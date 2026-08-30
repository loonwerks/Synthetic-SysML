// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c656d5c4a3c1_4_Valid {
  @pure def check(
      defensecondition: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseCondition.Type,
      defenseevidence: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseEvidence): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseReadinessAssessor_threatResponseProcess_defenseReadinessAssessor_GumboX.compute_CEP_Post(defenseevidence, defensecondition))) ___>: (T)) & T))
  }
}
