// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_49304e1c23aa_Oracle_Pointwise_Realizable {
  @pure def check(
      observation: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirQualityObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_GumboX.compute_CEP_Post(observation, equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Invalid)) |
        (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_GumboX.compute_CEP_Post(observation, equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Clean)) |
        (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirQualityNeedAssessor_cabin_air_supervision_process_air_quality_need_assessor_GumboX.compute_CEP_Post(observation, equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.FilterDemand)))))
  }
}
