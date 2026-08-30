// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_ffe5120b5f50_Oracle_Pointwise_Realizable {
  @pure def check(
      episodesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EpisodeSnapshot,
      responsesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseSnapshot): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatus.QUIET)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatus.WATCHING)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatus.THREAT_DECLARED)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatus.DEFENDING)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatus.EGRESS_ORDERED)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatus.EGRESS_MOVING)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatus.EGRESS_BLOCKED)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatus.ARRIVAL_OBSERVED)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatus.EVIDENCE_UNAVAILABLE)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatusAssessor_threatResponseProcess_responseStatusAssessor_GumboX.inititialize_IEP_Post(equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStatus.CLEAR_PENDING)))))
  }
}
