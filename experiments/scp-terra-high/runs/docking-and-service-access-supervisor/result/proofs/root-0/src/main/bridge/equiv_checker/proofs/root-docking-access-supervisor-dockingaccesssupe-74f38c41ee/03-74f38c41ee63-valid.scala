// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_74f38c41ee63_3_Valid {
  @pure def check(
      docking_access_result: equiv_shared_0.Docking_Access_Supervisor.DockingAccessResult,
      docking_decision: equiv_shared_0.Docking_Access_Supervisor.DockingDecisionFrame,
      request_disposition: equiv_shared_0.Docking_Access_Supervisor.RequestDisposition.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
