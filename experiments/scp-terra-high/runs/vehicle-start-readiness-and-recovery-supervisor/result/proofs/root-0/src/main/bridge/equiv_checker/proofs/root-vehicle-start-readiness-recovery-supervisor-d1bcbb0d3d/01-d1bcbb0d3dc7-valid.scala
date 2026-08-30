// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d1bcbb0d3dc7_1_Valid {
  @pure def check(
      applied_lifecycle: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.AppliedLifecycleSnapshot,
      authorization: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts,
      control_frame: equiv_shared_0.Vehicle_Start_Readiness_Recovery_Supervisor.ControlFrame): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
