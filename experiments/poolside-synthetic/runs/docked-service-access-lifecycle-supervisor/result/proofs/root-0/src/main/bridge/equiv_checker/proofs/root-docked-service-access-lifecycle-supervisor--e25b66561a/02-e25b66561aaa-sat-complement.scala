// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e25b66561aaa_2_Complement {
  @pure def check(
      berthobservation: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.Type,
      gatereadiness: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type,
      monitorreadiness: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type,
      shipcondition: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_GumboX.compute_CEP_Post(berthobservation, shipcondition, gatereadiness, monitorreadiness))) & T)))
  }
}
