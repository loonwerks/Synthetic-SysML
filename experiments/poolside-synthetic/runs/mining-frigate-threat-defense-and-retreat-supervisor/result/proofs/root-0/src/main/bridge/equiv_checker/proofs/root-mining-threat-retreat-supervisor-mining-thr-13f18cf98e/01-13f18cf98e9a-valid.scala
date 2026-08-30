// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_13f18cf98e9a_1_Valid {
  @pure def check(
      defense_in: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Defense_Command.Type,
      defense_out: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Defense_Command.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
