// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4fb0f75f6184_2_Complement {
  @pure def check(
      arrival_fact: equiv_shared_0.Factory_Dispatch_Coordinator.Arrival_Fact.Type,
      dispatch_candidate: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Candidate,
      pending_request: equiv_shared_0.Factory_Dispatch_Coordinator.Pending_Request_View.Type,
      registry_instruction: equiv_shared_0.Factory_Dispatch_Coordinator.Registry_Instruction.Type,
      registry_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.Registry_Outcome.Type,
      shipment_result: equiv_shared_0.Factory_Dispatch_Coordinator.Shipment_Result_Sample.Type,
      active: equiv_shared_0.Factory_Dispatch_Coordinator.Active_Slot.Type,
      last_completed: equiv_shared_0.Factory_Dispatch_Coordinator.Completion_Slot.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Request_Registry_dispatch_coordination_process_request_registry_GumboX.inititialize_IEP_Post(active, last_completed, dispatch_candidate, pending_request, registry_outcome))) & T)))
  }
}
