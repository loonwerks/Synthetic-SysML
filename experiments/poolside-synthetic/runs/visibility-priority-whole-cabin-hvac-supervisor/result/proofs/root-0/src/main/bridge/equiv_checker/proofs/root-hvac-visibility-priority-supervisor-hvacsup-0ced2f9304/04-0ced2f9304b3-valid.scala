// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0ced2f9304b3_4_Valid {
  @pure def check(
      humidityneed: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.HumidityNeed.Type,
      humidityobservation: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.HumidityObservation): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_GumboX.inititialize_IEP_Post(humidityneed))) ___>: (T)) & T))
  }
}
