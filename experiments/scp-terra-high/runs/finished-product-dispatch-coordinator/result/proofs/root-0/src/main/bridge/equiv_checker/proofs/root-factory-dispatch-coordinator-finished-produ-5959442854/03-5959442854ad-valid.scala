// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5959442854ad_3_Valid {
  @pure def check(
      assessment: equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Assessment.Type,
      dock_snapshot: equiv_shared_0.Factory_Dispatch_Coordinator.Dock_Snapshot): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
