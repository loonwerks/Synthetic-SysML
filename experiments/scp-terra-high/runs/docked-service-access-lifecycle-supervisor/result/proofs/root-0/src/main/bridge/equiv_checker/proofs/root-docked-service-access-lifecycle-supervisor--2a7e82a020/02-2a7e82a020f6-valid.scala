// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2a7e82a020f6_2_Valid {
  @pure def check(
      controlproposal: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ControlProposal,
      dockreadiness: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type,
      gatedcontrol: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.GatedControl,
      movementdirective: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.MovementDirective.Type,
      serviceaccess: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceAccess.Type,
      serviceinterlock: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_Candidate_GumboX.compute_CEP_Post(controlproposal, dockreadiness, serviceinterlock, gatedcontrol, movementdirective, serviceaccess))) ___>: (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate_GumboX.compute_CEP_Post(controlproposal, dockreadiness, serviceinterlock, gatedcontrol, movementdirective, serviceaccess))) & T))
  }
}
