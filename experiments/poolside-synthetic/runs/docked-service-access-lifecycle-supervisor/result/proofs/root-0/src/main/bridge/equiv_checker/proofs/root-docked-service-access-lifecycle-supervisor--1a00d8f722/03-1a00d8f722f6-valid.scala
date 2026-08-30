// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1a00d8f722f6_3_Valid {
  @pure def check(
      dockreadiness: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type,
      lifecycleprestate: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type,
      operationalassessment: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.Type,
      serviceinterlock: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
