// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_dadb344022a8_3_Valid {
  @pure def check(
      movement_service_in: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Type,
      movement_service_out: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
