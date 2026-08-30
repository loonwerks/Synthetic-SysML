// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4609acfc8a81_2_Complement {
  @pure def check(
      gateinterlock: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type,
      monitorinterlock: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type,
      repairsignal: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.Type,
      resupplysignal: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.Type): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_Candidate_GumboX.compute_CEP_Post(repairsignal, resupplysignal, gateinterlock, monitorinterlock))) ___>: (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlockQualifier_supervisorProcess_serviceInterlockQualifier_GumboX.compute_CEP_Post(repairsignal, resupplysignal, gateinterlock, monitorinterlock))) & T)))
  }
}
