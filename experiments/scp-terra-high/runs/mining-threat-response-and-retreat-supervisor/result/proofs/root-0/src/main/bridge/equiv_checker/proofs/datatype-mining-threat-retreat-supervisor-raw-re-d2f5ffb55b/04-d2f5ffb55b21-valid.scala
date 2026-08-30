// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d2f5ffb55b21_4_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Raw_Resource_Observation.D_Inv_Raw_Resource_Observation(value))) ___>: (T)) & T))
  }
}
