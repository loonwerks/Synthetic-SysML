// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0ae4b604408b_2_Valid {
  @pure def check(
      value: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Raw_Threat_Observation.D_Inv_Raw_Threat_Observation(value))) & T))
  }
}
