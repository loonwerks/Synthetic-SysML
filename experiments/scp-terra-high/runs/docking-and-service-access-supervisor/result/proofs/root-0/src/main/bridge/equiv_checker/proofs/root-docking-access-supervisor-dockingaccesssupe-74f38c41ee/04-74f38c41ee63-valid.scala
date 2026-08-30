// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_74f38c41ee63_4_Valid {
  @pure def check(
      docking_access_result: equiv_shared_0.Docking_Access_Supervisor.DockingAccessResult,
      docking_decision: equiv_shared_0.Docking_Access_Supervisor.DockingDecisionFrame,
      request_disposition: equiv_shared_0.Docking_Access_Supervisor.RequestDisposition.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Docking_Access_Supervisor.ResultComposition_supervisor_process_result_composition_GumboX.inititialize_IEP_Post(docking_access_result))) ___>: (T)) & T))
  }
}
