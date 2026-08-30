// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e22d1038785d_2_Valid {
  @pure def check(
      airneed: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirNeed.Type,
      airobservation: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirQualityObservation): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_GumboX.compute_CEP_Post(airobservation, airneed))) & T))
  }
}
