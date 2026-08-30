// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_441367dccd60_2_Valid {
  @pure def check(
      reference_state_in: equiv_shared_0.FAA_FCS_Coordination.Reference_State.Type,
      reference_state_out: equiv_shared_0.FAA_FCS_Coordination.Reference_State.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_Candidate_GumboX.compute_CEP_Post(reference_state_in, reference_state_out))) ___>: (equiv_shared_0.FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_GumboX.compute_CEP_Post(reference_state_in, reference_state_out))) & T))
  }
}
