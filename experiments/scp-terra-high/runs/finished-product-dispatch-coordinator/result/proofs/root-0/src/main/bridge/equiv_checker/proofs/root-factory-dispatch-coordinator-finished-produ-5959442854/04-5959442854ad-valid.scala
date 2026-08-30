// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5959442854ad_4_Valid {
  @pure def check(
      assessment: equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Assessment.Type,
      dock_snapshot: equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Snapshot): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Qualifier_dispatch_coordinator_process_dock_qualifier_GumboX.inititialize_IEP_Post(assessment))) ___>: (T)) & T))
  }
}
