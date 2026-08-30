// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_377aeaf15b51_1_Valid {
  @pure def check(
      mining_in: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Command.Type,
      mining_out: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Command.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
