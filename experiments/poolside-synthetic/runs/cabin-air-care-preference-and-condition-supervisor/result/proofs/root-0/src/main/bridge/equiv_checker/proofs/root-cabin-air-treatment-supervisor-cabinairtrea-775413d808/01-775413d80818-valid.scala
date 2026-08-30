// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_775413d80818_1_Valid {
  @pure def check(
      airassessment: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirAssessment.Type,
      airqualityvalidity: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirQualityValidity.Type,
      cabinairquality: equiv_shared_0.Cabin_Air_Treatment_Supervisor.CabinAirQuality.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
