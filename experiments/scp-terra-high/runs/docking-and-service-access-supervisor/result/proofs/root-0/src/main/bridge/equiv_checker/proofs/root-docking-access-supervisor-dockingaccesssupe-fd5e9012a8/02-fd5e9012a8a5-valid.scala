// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fd5e9012a8a5_2_Valid {
  @pure def check(
      admission_decision: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision,
      lifecycle_frame: equiv_shared_0.Docking_Access_Supervisor.CoordinationFrame,
      prior_lifecycle_view: equiv_shared_0.Docking_Access_Supervisor.PriorLifecycleView,
      lifecyclestate: equiv_shared_0.Docking_Access_Supervisor.LifecycleState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Docking_Access_Supervisor.DockingLifecycle_supervisor_process_docking_lifecycle_GumboX.inititialize_IEP_Post(lifecyclestate, prior_lifecycle_view))) & T))
  }
}
