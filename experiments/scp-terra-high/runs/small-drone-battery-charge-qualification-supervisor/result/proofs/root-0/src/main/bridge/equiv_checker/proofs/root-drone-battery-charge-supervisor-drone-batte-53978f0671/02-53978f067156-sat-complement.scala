// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_53978f067156_2_Complement {
  @pure def check(
      authorization: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type,
      battery_evidence: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryEvidence.Type,
      charge_context: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeContext.Type,
      decision_to_attention: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeDecision,
      decision_to_readiness: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeDecision,
      qualified_intent: equiv_shared_0.Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type,
      authorizationstate: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type,
      recoveryphase: equiv_shared_0.Drone_Battery_Charge_Supervisor.RecoveryPhase.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Battery_Charge_Supervisor.Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner_GumboX.inititialize_IEP_Post(authorizationstate, recoveryphase, authorization, decision_to_attention, decision_to_readiness))) & T)))
  }
}
