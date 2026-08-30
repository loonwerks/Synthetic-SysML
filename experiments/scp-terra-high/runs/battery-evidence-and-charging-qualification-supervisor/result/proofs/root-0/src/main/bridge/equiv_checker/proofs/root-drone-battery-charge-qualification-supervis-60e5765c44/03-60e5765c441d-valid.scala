// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_60e5765c441d_3_Valid {
  @pure def check(
      batteryin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts,
      clearedtorequestresult: B,
      requestin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type,
      resolutiontonotification: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution,
      in_attentionstate: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Type,
      attentionstate: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
