// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_815a804d8584_3_Valid {
  @pure def check(
      flowcontext: equiv_shared_0.Factory_Flow.FlowContext,
      outcometoauthorization: equiv_shared_0.Factory_Flow.OutcomeFact,
      outcometodeterminer: equiv_shared_0.Factory_Flow.OutcomeFact,
      processresult: equiv_shared_0.Factory_Flow.ProcessResultObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
