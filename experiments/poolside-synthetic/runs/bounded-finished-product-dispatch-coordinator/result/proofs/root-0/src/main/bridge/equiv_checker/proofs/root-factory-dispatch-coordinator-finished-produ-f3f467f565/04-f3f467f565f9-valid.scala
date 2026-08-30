// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f3f467f565f9_4_Valid {
  @pure def check(
      arrival_fact: equiv_shared_0.Factory_Dispatch_Coordinator.Arrival_Fact.Type,
      request_arrival: equiv_shared_0.Factory_Dispatch_Coordinator.Request_Arrival_Sample.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_GumboX.inititialize_IEP_Post(arrival_fact))) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_Candidate_GumboX.inititialize_IEP_Post(arrival_fact))) & T))
  }
}
