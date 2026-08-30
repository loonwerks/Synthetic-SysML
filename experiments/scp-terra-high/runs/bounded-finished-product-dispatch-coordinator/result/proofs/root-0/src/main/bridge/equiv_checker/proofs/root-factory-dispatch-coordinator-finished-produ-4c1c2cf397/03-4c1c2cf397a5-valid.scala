// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4c1c2cf397a5_3_Valid {
  @pure def check(
      arrival_fact: equiv_shared_0.Factory_Dispatch_Coordinator.Arrival_Fact.Type,
      request_arrival: equiv_shared_0.Factory_Dispatch_Coordinator.Request_Arrival_Sample.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
