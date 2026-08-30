// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5dcf75db68fe_4_Valid {
  @pure def check(
      humidityneed: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.HumidityNeed.Type,
      humidityobservation: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.HumidityObservation): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.HumidityNeedAssessor_supervision_humidityNeedAssessor_GumboX.compute_CEP_Post(humidityobservation, humidityneed))) ___>: (T)) & T))
  }
}
