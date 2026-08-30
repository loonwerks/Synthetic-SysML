// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0810bfe341e3_3_Valid {
  @pure def check(
      appliedsnapshot: equiv_shared_0.Factory_Flow.FlowSnapshot,
      outcomefact: equiv_shared_0.Factory_Flow.OutcomeFact,
      productionoutcome: equiv_shared_0.Factory_Flow.ProductionOutcome): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
