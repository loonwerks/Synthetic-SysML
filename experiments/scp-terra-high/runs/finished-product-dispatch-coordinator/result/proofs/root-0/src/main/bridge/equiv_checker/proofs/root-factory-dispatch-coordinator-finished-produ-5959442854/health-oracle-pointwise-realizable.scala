// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_5959442854ad_Oracle_Pointwise_Realizable {
  @pure def check(
      dock_snapshot: equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Snapshot): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Assessment.Ready)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Assessment.Blocked)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Assessment.Unknown)))))
  }
}
