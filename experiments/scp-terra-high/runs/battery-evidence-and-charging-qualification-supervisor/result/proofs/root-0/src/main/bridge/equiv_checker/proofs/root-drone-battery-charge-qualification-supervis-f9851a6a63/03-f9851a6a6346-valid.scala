// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f9851a6a6346_3_Valid {
  @pure def check(
      batteryin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts,
      chargerin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts,
      eligibilitytoadvisory: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type,
      eligibilitytosession: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type,
      interfacein: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts,
      lifecyclein: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
