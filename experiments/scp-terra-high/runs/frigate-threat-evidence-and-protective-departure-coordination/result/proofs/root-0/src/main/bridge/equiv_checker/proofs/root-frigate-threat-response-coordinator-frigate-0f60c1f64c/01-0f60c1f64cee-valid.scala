// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0f60c1f64cee_1_Valid {
  @pure def check(
      escapegatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelGate.Type,
      escapereadyout: B,
      mininginterlockin: equiv_shared_0.Frigate_Threat_Response_Coordinator.MiningInterlock.Type,
      navigationavailablein: B,
      routestatusin: equiv_shared_0.Frigate_Threat_Response_Coordinator.RouteStatus.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
