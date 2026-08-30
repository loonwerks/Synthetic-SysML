// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4c1c2cf397a5_2_Complement {
  @pure def check(
      arrival_fact: equiv_shared_0.Factory_Dispatch_Coordinator.Arrival_Fact.Type,
      request_arrival: equiv_shared_0.Factory_Dispatch_Coordinator.Request_Arrival_Sample.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Request_Qualification_dispatch_coordination_process_request_qualification_GumboX.compute_CEP_Post(request_arrival, arrival_fact))) & T)))
  }
}
