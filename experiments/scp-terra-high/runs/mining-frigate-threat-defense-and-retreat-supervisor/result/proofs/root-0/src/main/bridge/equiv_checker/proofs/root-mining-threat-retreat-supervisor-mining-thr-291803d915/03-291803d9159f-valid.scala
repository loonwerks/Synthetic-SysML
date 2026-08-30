// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_291803d9159f_3_Valid {
  @pure def check(
      qualified_threat: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Observation,
      raw_threat: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Observation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
