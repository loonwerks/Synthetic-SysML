// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2acfbe8c61fe_3_Valid {
  @pure def check(
      defensegatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelGate.Type,
      defensereadyout: B,
      readinesscontextin: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseReadinessContext): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
