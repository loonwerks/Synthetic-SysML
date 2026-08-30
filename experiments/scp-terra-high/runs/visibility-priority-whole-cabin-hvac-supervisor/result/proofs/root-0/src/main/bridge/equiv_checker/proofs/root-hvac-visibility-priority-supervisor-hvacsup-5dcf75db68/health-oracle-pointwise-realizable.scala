// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_5dcf75db68fe_Oracle_Pointwise_Realizable {
  @pure def check(
      humidityobservation: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.HumidityObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_GumboX.compute_CEP_Post(humidityobservation, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.HumidityNeed.Unavailable)) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_GumboX.compute_CEP_Post(humidityobservation, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.HumidityNeed.None)) |
        (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_GumboX.compute_CEP_Post(humidityobservation, equiv_shared_0.HVAC_Visibility_Priority_Supervisor.HumidityNeed.Dry)))))
  }
}
