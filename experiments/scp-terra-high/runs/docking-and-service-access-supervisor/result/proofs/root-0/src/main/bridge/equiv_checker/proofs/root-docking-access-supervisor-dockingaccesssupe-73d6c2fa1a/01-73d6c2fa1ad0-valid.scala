// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_73d6c2fa1ad0_1_Valid {
  @pure def check(
      docking_access_result: equiv_shared_0.Docking_Access_Supervisor.DockingAccessResult,
      docking_decision: equiv_shared_0.Docking_Access_Supervisor.DockingDecisionFrame,
      request_disposition: equiv_shared_0.Docking_Access_Supervisor.RequestDisposition.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
