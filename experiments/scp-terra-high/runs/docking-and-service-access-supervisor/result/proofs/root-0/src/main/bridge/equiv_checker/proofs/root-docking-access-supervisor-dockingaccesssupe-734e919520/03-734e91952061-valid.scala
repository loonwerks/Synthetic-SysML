// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_734e91952061_3_Valid {
  @pure def check(
      admission_decision: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision,
      lifecycle_frame: equiv_shared_0.Docking_Access_Supervisor.CoordinationFrame,
      prior_lifecycle_view: equiv_shared_0.Docking_Access_Supervisor.PriorLifecycleView,
      in_lifecyclestate: equiv_shared_0.Docking_Access_Supervisor.LifecycleState.Type,
      lifecyclestate: equiv_shared_0.Docking_Access_Supervisor.LifecycleState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
