// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e9f6137682e5_2_Complement {
  @pure def check(
      customer_notice: equiv_shared_0.Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Type,
      dispatch_disposition: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Disposition.Type,
      registry_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.Registry_Outcome.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis_GumboX.inititialize_IEP_Post(customer_notice))) & T)))
  }
}
