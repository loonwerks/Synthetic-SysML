// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0ced2f9304b3_1_Valid {
  @pure def check(
      humidityneed: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.HumidityNeed.Type,
      humidityobservation: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.HumidityObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
