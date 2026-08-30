// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a1419391fb04_3_Valid {
  @pure def check(
      appliedsnapshot: equiv_shared_0.Factory_Flow.FlowSnapshot,
      decisionreason: equiv_shared_0.Factory_Flow.DecisionReason.Type,
      flowstatus: equiv_shared_0.Factory_Flow.ProductionFlowStatus.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
