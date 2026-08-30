// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4cedfa4c8b73_2_Valid {
  @pure def check(
      gateinterlock: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type,
      monitorinterlock: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type,
      repairsignal: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.Type,
      resupplysignal: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_Candidate_GumboX.inititialize_IEP_Post(gateinterlock, monitorinterlock))) ___>: (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_GumboX.inititialize_IEP_Post(gateinterlock, monitorinterlock))) & T))
  }
}
