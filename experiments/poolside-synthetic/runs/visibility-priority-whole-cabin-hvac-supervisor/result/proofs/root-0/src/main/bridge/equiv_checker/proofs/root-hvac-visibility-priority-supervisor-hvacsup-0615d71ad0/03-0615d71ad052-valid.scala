// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0615d71ad052_3_Valid {
  @pure def check(
      airneed: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirNeed.Type,
      airobservation: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirQualityObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
