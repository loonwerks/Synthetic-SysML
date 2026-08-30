// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_a9c94e95f880_Oracle_Pointwise_Realizable {
  @pure def check(
      decision_reason: equiv_shared_0.Factory_Dispatch_Coordinator.Decision_Reason.Type,
      lifecycle_snapshot: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Status.Idle)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Status.Rejected)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Status.WaitingInventory)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Status.WaitingDock)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Status.Busy)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Status.Released)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Status.Recovering)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Status.Completed)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Status_Determiner_dispatch_coordinator_process_status_determiner_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Status.Failed)))))
  }
}
