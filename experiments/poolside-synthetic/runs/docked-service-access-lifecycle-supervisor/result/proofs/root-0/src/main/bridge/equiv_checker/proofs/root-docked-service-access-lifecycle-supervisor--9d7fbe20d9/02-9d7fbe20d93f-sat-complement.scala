// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9d7fbe20d93f_2_Complement {
  @pure def check(
      admitteddirective: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.Type,
      arbiterprestate: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type,
      controlproposal: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ControlProposal,
      lifecyclesnapshot: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot,
      monitorprestate: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type,
      lifecyclememory: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleController_supervisorProcess_lifecycleController_GumboX.inititialize_IEP_Post(lifecyclememory, arbiterprestate, controlproposal, lifecyclesnapshot, monitorprestate))) & T)))
  }
}
