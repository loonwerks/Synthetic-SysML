// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_06244bb4f6a2_Oracle_Pointwise_Realizable {
  @pure def check(
      dock_snapshot: equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Snapshot): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_GumboX.compute_CEP_Post(dock_snapshot, equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Assessment.Ready)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_GumboX.compute_CEP_Post(dock_snapshot, equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Assessment.Blocked)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_GumboX.compute_CEP_Post(dock_snapshot, equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Assessment.Unknown)))))
  }
}
