// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e25b66561aaa_4_Valid {
  @pure def check(
      berthobservation: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.BerthObservation.Type,
      gatereadiness: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type,
      monitorreadiness: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.DockReadiness.Type,
      shipcondition: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ShipCondition.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_GumboX.compute_CEP_Post(berthobservation, shipcondition, gatereadiness, monitorreadiness))) ___>: (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.DockReadinessQualifier_supervisorProcess_dockReadinessQualifier_Candidate_GumboX.compute_CEP_Post(berthobservation, shipcondition, gatereadiness, monitorreadiness))) & T))
  }
}
