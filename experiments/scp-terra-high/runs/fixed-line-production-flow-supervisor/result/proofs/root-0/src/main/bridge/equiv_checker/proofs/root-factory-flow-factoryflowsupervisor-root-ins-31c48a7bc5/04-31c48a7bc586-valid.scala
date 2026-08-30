// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_31c48a7bc586_4_Valid {
  @pure def check(
      appliedsnapshot: equiv_shared_0.Factory_Flow.FlowSnapshot,
      decisionreason: equiv_shared_0.Factory_Flow.DecisionReason.Type,
      flowstatus: equiv_shared_0.Factory_Flow.ProductionFlowStatus.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_GumboX.inititialize_IEP_Post(flowstatus))) ___>: (equiv_shared_0.Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_Candidate_GumboX.inititialize_IEP_Post(flowstatus))) & T))
  }
}
