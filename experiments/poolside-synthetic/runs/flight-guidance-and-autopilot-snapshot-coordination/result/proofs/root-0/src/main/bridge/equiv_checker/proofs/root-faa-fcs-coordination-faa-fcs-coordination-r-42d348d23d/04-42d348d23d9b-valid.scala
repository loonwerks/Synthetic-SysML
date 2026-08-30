// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_42d348d23d9b_4_Valid {
  @pure def check(
      ap_availability_in: equiv_shared_0.FAA_FCS_Coordination.AP_Availability.Type,
      ap_availability_out: equiv_shared_0.FAA_FCS_Coordination.AP_Availability.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_GumboX.compute_CEP_Post(ap_availability_in, ap_availability_out))) ___>: (equiv_shared_0.FAA_FCS_Coordination.AP_Availability_Intake_i_fcs_coordination_process_ap_availability_intake_Candidate_GumboX.compute_CEP_Post(ap_availability_in, ap_availability_out))) & T))
  }
}
