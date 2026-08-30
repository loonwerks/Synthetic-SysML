// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f0f00f7dd053_2_Valid {
  @pure def check(
      customer_notice: equiv_shared_0.Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Type,
      dispatch_disposition: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Disposition.Type,
      registry_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.Registry_Outcome.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_Candidate_GumboX.compute_CEP_Post(dispatch_disposition, registry_outcome, customer_notice))) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_GumboX.compute_CEP_Post(dispatch_disposition, registry_outcome, customer_notice))) & T))
  }
}
