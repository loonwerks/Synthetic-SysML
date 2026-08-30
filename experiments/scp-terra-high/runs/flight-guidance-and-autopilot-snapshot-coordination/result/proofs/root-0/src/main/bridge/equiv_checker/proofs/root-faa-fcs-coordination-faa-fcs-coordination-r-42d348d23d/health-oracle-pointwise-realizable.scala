// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_42d348d23d9b_Oracle_Pointwise_Realizable {
  @pure def check(
      ap_availability_in: equiv_shared_0.FAA_FCS_Coordination.AP_Availability.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_GumboX.compute_CEP_Post(ap_availability_in, equiv_shared_0.FAA_FCS_Coordination.AP_Availability.Available)) |
        (equiv_shared_0.FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_GumboX.compute_CEP_Post(ap_availability_in, equiv_shared_0.FAA_FCS_Coordination.AP_Availability.Failed)))))
  }
}
