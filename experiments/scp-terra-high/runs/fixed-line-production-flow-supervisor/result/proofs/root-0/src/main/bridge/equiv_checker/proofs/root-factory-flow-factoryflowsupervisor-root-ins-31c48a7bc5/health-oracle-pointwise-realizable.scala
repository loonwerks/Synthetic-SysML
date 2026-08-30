// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_31c48a7bc586_Oracle_Pointwise_Realizable {
  @pure def check(
      appliedsnapshot: equiv_shared_0.Factory_Flow.FlowSnapshot,
      decisionreason: equiv_shared_0.Factory_Flow.DecisionReason.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Flow.ProductionFlowStatus.Idle)) |
        (equiv_shared_0.Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Flow.ProductionFlowStatus.Rejected)) |
        (equiv_shared_0.Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Flow.ProductionFlowStatus.WaitingMaterial)) |
        (equiv_shared_0.Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Flow.ProductionFlowStatus.WaitingStation)) |
        (equiv_shared_0.Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Flow.ProductionFlowStatus.Started)) |
        (equiv_shared_0.Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Flow.ProductionFlowStatus.Processing)) |
        (equiv_shared_0.Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Flow.ProductionFlowStatus.Busy)) |
        (equiv_shared_0.Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Flow.ProductionFlowStatus.Recovering)) |
        (equiv_shared_0.Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Flow.ProductionFlowStatus.Advanced)) |
        (equiv_shared_0.Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Flow.ProductionFlowStatus.Completed)) |
        (equiv_shared_0.Factory_Flow.FlowStatusDeterminer_supervisorProcess_flowStatusDeterminer_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Flow.ProductionFlowStatus.Failed)))))
  }
}
