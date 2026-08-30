// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0f60c1f64cee_4_Valid {
  @pure def check(
      escapegatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelGate.Type,
      escapereadyout: B,
      mininginterlockin: equiv_shared_0.Frigate_Threat_Response_Coordinator.MiningInterlock.Type,
      navigationavailablein: B,
      routestatusin: equiv_shared_0.Frigate_Threat_Response_Coordinator.RouteStatus.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_GumboX.inititialize_IEP_Post(escapereadyout))) ___>: (equiv_shared_0.Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_Candidate_GumboX.inititialize_IEP_Post(escapereadyout))) & T))
  }
}
