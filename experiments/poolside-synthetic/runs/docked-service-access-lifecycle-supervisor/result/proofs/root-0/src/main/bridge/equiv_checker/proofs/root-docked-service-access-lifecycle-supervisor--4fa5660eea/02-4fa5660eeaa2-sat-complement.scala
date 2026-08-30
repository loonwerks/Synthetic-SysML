// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4fa5660eeaa2_2_Complement {
  @pure def check(
      admitteddirective: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.Type,
      arbiterprestate: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type,
      controlproposal: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ControlProposal,
      lifecyclesnapshot: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot,
      monitorprestate: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type,
      in_lifecyclememory: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type,
      lifecyclememory: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_GumboX.compute_CEP_Post(in_lifecyclememory, lifecyclememory, admitteddirective, arbiterprestate, controlproposal, lifecyclesnapshot, monitorprestate))) & T)))
  }
}
