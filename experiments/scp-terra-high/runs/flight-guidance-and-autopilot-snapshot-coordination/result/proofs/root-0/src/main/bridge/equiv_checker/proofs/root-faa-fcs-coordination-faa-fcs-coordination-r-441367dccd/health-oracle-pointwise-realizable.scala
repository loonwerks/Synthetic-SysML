// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_441367dccd60_Oracle_Pointwise_Realizable {
  @pure def check(
      reference_state_in: equiv_shared_0.FAA_FCS_Coordination.Reference_State.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_GumboX.compute_CEP_Post(reference_state_in, equiv_shared_0.FAA_FCS_Coordination.Reference_State.Synchronized)) |
        (equiv_shared_0.FAA_FCS_Coordination.Reference_State_Intake_i_fcs_coordination_process_reference_state_intake_GumboX.compute_CEP_Post(reference_state_in, equiv_shared_0.FAA_FCS_Coordination.Reference_State.Not_Synchronized)))))
  }
}
