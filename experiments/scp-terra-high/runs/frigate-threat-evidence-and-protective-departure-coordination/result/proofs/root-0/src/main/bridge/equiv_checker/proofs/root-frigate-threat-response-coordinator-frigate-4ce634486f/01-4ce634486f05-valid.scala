// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4ce634486f05_1_Valid {
  @pure def check(
      defensegatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelGate.Type,
      defensereadyout: B,
      readinesscontextin: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseReadinessContext): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
