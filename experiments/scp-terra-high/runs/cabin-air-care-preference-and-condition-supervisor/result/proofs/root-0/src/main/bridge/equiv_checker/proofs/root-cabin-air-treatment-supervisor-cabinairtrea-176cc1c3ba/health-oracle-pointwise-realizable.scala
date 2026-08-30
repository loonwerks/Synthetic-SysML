// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_176cc1c3baea_Oracle_Pointwise_Realizable {
  @pure def check(
      airqualityvalidity: equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirQualityValidity.Type,
      cabinairquality: equiv_shared_0.Cabin_Air_Treatment_Supervisor.CabinAirQuality.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_GumboX.compute_CEP_Post(airqualityvalidity, cabinairquality, equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirAssessment.Unknown)) |
        (equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_GumboX.compute_CEP_Post(airqualityvalidity, cabinairquality, equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirAssessment.Clear)) |
        (equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_GumboX.compute_CEP_Post(airqualityvalidity, cabinairquality, equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirAssessment.FilterNormalNeeded)) |
        (equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirQualityQualificationOwner_airCareSupervisionProcess_airQualityOwner_GumboX.compute_CEP_Post(airqualityvalidity, cabinairquality, equiv_shared_0.Cabin_Air_Treatment_Supervisor.AirAssessment.FilterIntensiveNeeded)))))
  }
}
