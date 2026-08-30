// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_660a997e9a07_Oracle_Pointwise_Realizable {
  @pure def check(
      cabinhumidityband: equiv_shared_0.Cabin_Air_Care_Supervisor.CabinHumidityBand.Type,
      humidityvalidity: equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityValidity.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_GumboX.compute_CEP_Post(cabinhumidityband, humidityvalidity, equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityAssessment.AddMoisture)) |
        (equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_GumboX.compute_CEP_Post(cabinhumidityband, humidityvalidity, equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityAssessment.AtTarget)) |
        (equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_GumboX.compute_CEP_Post(cabinhumidityband, humidityvalidity, equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityAssessment.RemoveMoisture)) |
        (equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityAssessor_airCareSupervisionProcess_humidityAssessor_GumboX.compute_CEP_Post(cabinhumidityband, humidityvalidity, equiv_shared_0.Cabin_Air_Care_Supervisor.HumidityAssessment.Unknown)))))
  }
}
