// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_73d6c2fa1ad0_4_Valid {
  @pure def check(
      docking_access_result: equiv_shared_0.Docking_Access_Supervisor.DockingAccessResult,
      docking_decision: equiv_shared_0.Docking_Access_Supervisor.DockingDecisionFrame,
      request_disposition: equiv_shared_0.Docking_Access_Supervisor.RequestDisposition.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_GumboX.compute_CEP_Post(docking_decision, request_disposition, docking_access_result))) ___>: (T)) & T))
  }
}
