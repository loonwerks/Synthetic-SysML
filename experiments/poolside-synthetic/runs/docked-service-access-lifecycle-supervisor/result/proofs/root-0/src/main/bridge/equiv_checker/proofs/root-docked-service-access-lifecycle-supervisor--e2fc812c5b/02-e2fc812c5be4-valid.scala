// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e2fc812c5be4_2_Valid {
  @pure def check(
      berthobservation: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.Type,
      gatereadiness: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type,
      monitorreadiness: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type,
      shipcondition: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_GumboX.inititialize_IEP_Post(gatereadiness, monitorreadiness))) & T))
  }
}
