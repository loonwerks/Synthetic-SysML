// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_734e91952061_4_Valid {
  @pure def check(
      admission_decision: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision,
      lifecycle_frame: equiv_shared_0.Docking_Access_Supervisor.CoordinationFrame,
      prior_lifecycle_view: equiv_shared_0.Docking_Access_Supervisor.PriorLifecycleView,
      in_lifecyclestate: equiv_shared_0.Docking_Access_Supervisor.LifecycleState.Type,
      lifecyclestate: equiv_shared_0.Docking_Access_Supervisor.LifecycleState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_GumboX.compute_CEP_Post(in_lifecyclestate, lifecyclestate, admission_decision, lifecycle_frame, prior_lifecycle_view))) ___>: (T)) & T))
  }
}
