// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_0df6ba6a901e_Oracle_Pointwise_Realizable {
  @pure def check(
      observation: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_GumboX.compute_CEP_Post(observation, equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Invalid)) |
        (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_GumboX.compute_CEP_Post(observation, equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Dry)) |
        (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_GumboX.compute_CEP_Post(observation, equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.None)) |
        (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_GumboX.compute_CEP_Post(observation, equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Damp)))))
  }
}
