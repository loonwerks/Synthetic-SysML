// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_cd358c9d506c_Candidate_Pointwise_Realizable {
  @pure def check(
      escapegatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.ChannelGate.Type,
      mininginterlockin: equiv_shared_0.Frigate_Threat_Response_Coordinator.MiningInterlock.Type,
      navigationavailablein: B,
      routestatusin: equiv_shared_0.Frigate_Threat_Response_Coordinator.RouteStatus.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_Candidate_GumboX.compute_CEP_Post(escapegatein, mininginterlockin, navigationavailablein, routestatusin, F)) |
        (equiv_shared_0.Frigate_Threat_Response_Coordinator.DepartureReadiness_threatResponseProcess_departureReadiness_Candidate_GumboX.compute_CEP_Post(escapegatein, mininginterlockin, navigationavailablein, routestatusin, T)))))
  }
}
