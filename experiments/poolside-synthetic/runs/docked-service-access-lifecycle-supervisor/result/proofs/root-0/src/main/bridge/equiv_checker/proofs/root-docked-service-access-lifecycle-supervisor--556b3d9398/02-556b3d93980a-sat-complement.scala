// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_556b3d93980a_2_Complement {
  @pure def check(
      dockreadiness: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type,
      lifecycleprestate: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type,
      operationalassessment: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.Type,
      serviceinterlock: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_GumboX.inititialize_IEP_Post(operationalassessment))) & T)))
  }
}
