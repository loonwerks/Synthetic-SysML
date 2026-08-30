// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_60e5765c441d_4_Valid {
  @pure def check(
      batteryin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts,
      clearedtorequestresult: B,
      requestin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type,
      resolutiontonotification: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution,
      in_attentionstate: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Type,
      attentionstate: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AttentionState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_GumboX.compute_CEP_Post(in_attentionstate, attentionstate, batteryin, requestin, clearedtorequestresult, resolutiontonotification))) ___>: (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner_Candidate_GumboX.compute_CEP_Post(in_attentionstate, attentionstate, batteryin, requestin, clearedtorequestresult, resolutiontonotification))) & T))
  }
}
