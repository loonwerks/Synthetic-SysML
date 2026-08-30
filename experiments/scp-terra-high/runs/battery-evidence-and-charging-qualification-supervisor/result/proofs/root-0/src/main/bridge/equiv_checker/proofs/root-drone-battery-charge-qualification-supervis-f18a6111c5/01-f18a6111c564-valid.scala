// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f18a6111c564_1_Valid {
  @pure def check(
      faulttoaggregation: B,
      qualificationin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification,
      statetoadvisory: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts,
      statetoattention: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts,
      statetoeligibility: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts,
      in_confidencestate: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Type,
      confidencestate: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
