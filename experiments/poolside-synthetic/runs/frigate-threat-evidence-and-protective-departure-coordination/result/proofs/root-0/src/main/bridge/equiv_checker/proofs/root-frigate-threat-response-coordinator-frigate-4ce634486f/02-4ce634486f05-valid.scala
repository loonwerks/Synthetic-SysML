// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4ce634486f05_2_Valid {
  @pure def check(
      defensegatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelGate.Type,
      defensereadyout: B,
      readinesscontextin: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseReadinessContext): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseReadiness_threatResponseProcess_defenseReadiness_GumboX.inititialize_IEP_Post(defensereadyout))) & T))
  }
}
