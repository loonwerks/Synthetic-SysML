// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_0615d71ad052_Oracle_Pointwise_Realizable {
  @pure def check(
      airobservation: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirQualityObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_GumboX.inititialize_IEP_Post(equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirNeed.Unavailable)) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_GumboX.inititialize_IEP_Post(equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirNeed.None)) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_GumboX.inititialize_IEP_Post(equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirNeed.Filter)))))
  }
}
