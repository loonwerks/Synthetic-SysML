// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_660a997e9a07_4_Valid {
  @pure def check(
      cabinhumidityband: equiv_shared_0.Cabin_Air_Care_Supervisor.CabinHumidityBand.Type,
      humidityassessment: equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityAssessment.Type,
      humidityvalidity: equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityValidity.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_GumboX.compute_CEP_Post(cabinhumidityband, humidityvalidity, humidityassessment))) ___>: (equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_Candidate_GumboX.compute_CEP_Post(cabinhumidityband, humidityvalidity, humidityassessment))) & T))
  }
}
