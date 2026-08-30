// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_fed03ab53774_Candidate_Pointwise_Realizable {
  @pure def check(
      airqualityvalidity: equiv_shared_0.Cabin_Air_Care_Supervisor.AirQualityValidity.Type,
      cabinairquality: equiv_shared_0.Cabin_Air_Care_Supervisor.CabinAirQuality.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_Candidate_GumboX.compute_CEP_Post(airqualityvalidity, cabinairquality, equiv_shared_0.Cabin_Air_Care_Supervisor.AirAssessment.Acceptable)) |
        (equiv_shared_0.Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_Candidate_GumboX.compute_CEP_Post(airqualityvalidity, cabinairquality, equiv_shared_0.Cabin_Air_Care_Supervisor.AirAssessment.FilterNeeded)) |
        (equiv_shared_0.Cabin_Air_Care_Supervisor.AirQualityAssessor_airCareSupervisionProcess_airQualityAssessor_Candidate_GumboX.compute_CEP_Post(airqualityvalidity, cabinairquality, equiv_shared_0.Cabin_Air_Care_Supervisor.AirAssessment.Unknown)))))
  }
}
