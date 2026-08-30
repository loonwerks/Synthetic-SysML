// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c1b6da8d4460_2_Valid {
  @pure def check(
      berth_transition_evidence: equiv_shared_0.Docking_Access_Supervisor.BerthTransitionEvidence,
      prior_berth_state: equiv_shared_0.Docking_Access_Supervisor.BerthState.Type,
      berthstate: equiv_shared_0.Docking_Access_Supervisor.BerthState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Docking_Access_Supervisor.BerthCommitment_supervisor_process_berth_commitment_GumboX.inititialize_IEP_Post(berthstate, prior_berth_state))) & T))
  }
}
