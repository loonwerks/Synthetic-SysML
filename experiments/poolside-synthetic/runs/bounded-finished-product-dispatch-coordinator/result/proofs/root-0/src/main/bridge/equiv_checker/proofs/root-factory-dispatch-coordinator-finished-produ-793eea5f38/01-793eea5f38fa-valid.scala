// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_793eea5f38fa_1_Valid {
  @pure def check(
      dispatch_candidate: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Candidate,
      dispatch_disposition: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Disposition.Type,
      inventory_finding: equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Finding.Type,
      readiness_sample: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Readiness_Sample,
      registry_instruction: equiv_shared_0.Factory_Dispatch_Coordinator.Registry_Instruction.Type,
      shipment_release: equiv_shared_0.Factory_Dispatch_Coordinator.Shipment_Release_Directive.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
