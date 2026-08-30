// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4609acfc8a81_3_Valid {
  @pure def check(
      gateinterlock: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type,
      monitorinterlock: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceInterlock.Type,
      repairsignal: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.Type,
      resupplysignal: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.ServiceSignal.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
