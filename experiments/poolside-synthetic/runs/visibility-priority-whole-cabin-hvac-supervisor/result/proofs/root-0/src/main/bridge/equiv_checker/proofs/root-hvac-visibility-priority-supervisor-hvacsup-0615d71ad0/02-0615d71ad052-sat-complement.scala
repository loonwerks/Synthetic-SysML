// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0615d71ad052_2_Complement {
  @pure def check(
      airneed: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirNeed.Type,
      airobservation: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirQualityObservation): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.AirQualityNeedAssessor_supervision_airQualityNeedAssessor_GumboX.inititialize_IEP_Post(airneed))) & T)))
  }
}
