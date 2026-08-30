// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fed03ab53774_4_Valid {
  @pure def check(
      airassessment: equiv_shared_0.Cabin_Air_Care_Supervisor.AirAssessment.Type,
      airqualityvalidity: equiv_shared_0.Cabin_Air_Care_Supervisor.AirQualityValidity.Type,
      cabinairquality: equiv_shared_0.Cabin_Air_Care_Supervisor.CabinAirQuality.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_GumboX.compute_CEP_Post(airqualityvalidity, cabinairquality, airassessment))) ___>: (equiv_shared_0.Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_Candidate_GumboX.compute_CEP_Post(airqualityvalidity, cabinairquality, airassessment))) & T))
  }
}
