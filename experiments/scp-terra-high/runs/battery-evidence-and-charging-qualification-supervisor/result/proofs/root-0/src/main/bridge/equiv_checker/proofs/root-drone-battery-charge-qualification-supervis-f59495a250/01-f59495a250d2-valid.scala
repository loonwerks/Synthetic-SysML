// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f59495a250d2_1_Valid {
  @pure def check(
      factstoeligibility: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts,
      factstosession: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts,
      faulttoaggregation: B,
      reportin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargeInterfaceReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
