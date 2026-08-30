// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_176cc1c3baea_2_Complement {
  @pure def check(
      airassessment: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirAssessment.Type,
      airqualityvalidity: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirQualityValidity.Type,
      cabinairquality: equiv_shared_0.Cabin_Air_Treatment_Supervisor.CabinAirQuality.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_GumboX.compute_CEP_Post(airqualityvalidity, cabinairquality, airassessment))) & T)))
  }
}
