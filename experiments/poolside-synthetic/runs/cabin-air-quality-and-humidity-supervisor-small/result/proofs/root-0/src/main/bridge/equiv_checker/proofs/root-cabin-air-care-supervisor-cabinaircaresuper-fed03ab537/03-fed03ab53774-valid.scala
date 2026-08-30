// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fed03ab53774_3_Valid {
  @pure def check(
      airassessment: equiv_shared_0.Cabin_Air_Care_Supervisor.AirAssessment.Type,
      airqualityvalidity: equiv_shared_0.Cabin_Air_Care_Supervisor.AirQualityValidity.Type,
      cabinairquality: equiv_shared_0.Cabin_Air_Care_Supervisor.CabinAirQuality.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
