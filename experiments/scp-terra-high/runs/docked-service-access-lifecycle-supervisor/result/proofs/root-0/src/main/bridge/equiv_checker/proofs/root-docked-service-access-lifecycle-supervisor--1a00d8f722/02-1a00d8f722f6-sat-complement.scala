// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1a00d8f722f6_2_Complement {
  @pure def check(
      dockreadiness: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type,
      lifecycleprestate: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type,
      operationalassessment: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.OperationalAssessment.Type,
      serviceinterlock: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_Candidate_GumboX.compute_CEP_Post(dockreadiness, lifecycleprestate, serviceinterlock, operationalassessment))) ___>: (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleConsistencyMonitor_supervisorProcess_lifecycleConsistencyMonitor_GumboX.compute_CEP_Post(dockreadiness, lifecycleprestate, serviceinterlock, operationalassessment))) & T)))
  }
}
