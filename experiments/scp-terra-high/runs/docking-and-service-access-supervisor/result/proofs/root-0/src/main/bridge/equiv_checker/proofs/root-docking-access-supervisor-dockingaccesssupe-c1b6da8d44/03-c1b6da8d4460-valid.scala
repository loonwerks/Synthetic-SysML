// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c1b6da8d4460_3_Valid {
  @pure def check(
      berth_transition_evidence: equiv_shared_0.Docking_Access_Supervisor.BerthTransitionEvidence,
      prior_berth_state: equiv_shared_0.Docking_Access_Supervisor.BerthState.Type,
      berthstate: equiv_shared_0.Docking_Access_Supervisor.BerthState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
