// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_d03ae7bb8f78_Oracle_Pointwise_Realizable {
  @pure def check(
      observation: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_GumboX.inititialize_IEP_Post(equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Invalid)) |
        (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_GumboX.inititialize_IEP_Post(equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Dry)) |
        (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_GumboX.inititialize_IEP_Post(equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.None)) |
        (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityNeedAssessor_cabin_air_supervision_process_humidity_need_assessor_GumboX.inititialize_IEP_Post(equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Damp)))))
  }
}
