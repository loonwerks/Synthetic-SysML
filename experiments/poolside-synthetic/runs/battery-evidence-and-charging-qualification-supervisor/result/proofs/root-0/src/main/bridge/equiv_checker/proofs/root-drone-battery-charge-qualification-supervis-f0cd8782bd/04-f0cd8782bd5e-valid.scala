// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f0cd8782bd5e_4_Valid {
  @pure def check(
      batteryin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts,
      clearedtorequestresult: B,
      requestin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type,
      resolutiontonotification: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution,
      attentionstate: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_GumboX.inititialize_IEP_Post(attentionstate, clearedtorequestresult, resolutiontonotification))) ___>: (T)) & T))
  }
}
