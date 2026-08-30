// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6bcc82f3998f_1_Valid {
  @pure def check(
      factstoadvisory: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts,
      factstoeligibility: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts,
      faulttoaggregation: B,
      reportin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.LifecycleReportValue): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
