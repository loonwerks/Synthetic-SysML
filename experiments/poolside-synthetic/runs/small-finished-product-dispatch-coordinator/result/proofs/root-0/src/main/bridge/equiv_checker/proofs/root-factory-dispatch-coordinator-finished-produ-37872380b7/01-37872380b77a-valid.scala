// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_37872380b77a_1_Valid {
  @pure def check(
      availability_assessment: equiv_shared_0.Factory_Dispatch_Coordinator.Availability_Assessment_Value.Type,
      notice_resolution: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Resolution,
      qualified_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Outcome.Type,
      qualified_request: equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Request.Type,
      release_resolution: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Resolution,
      current_phase: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Phase.Type,
      recovery_required: B): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
