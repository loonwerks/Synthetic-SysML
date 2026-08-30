// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_cd358c9d506c_4_Valid {
  @pure def check(
      escapegatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelGate.Type,
      escapereadyout: B,
      mininginterlockin: equiv_shared_0.Frigate_Threat_Response_Coordinator.MiningInterlock.Type,
      navigationavailablein: B,
      routestatusin: equiv_shared_0.Frigate_Threat_Response_Coordinator.RouteStatus.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_GumboX.compute_CEP_Post(escapegatein, mininginterlockin, navigationavailablein, routestatusin, escapereadyout))) ___>: (T)) & T))
  }
}
