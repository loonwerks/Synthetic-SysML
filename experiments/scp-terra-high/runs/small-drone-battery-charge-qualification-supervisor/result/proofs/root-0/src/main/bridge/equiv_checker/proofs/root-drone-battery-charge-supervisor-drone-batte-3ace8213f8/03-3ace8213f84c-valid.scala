// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3ace8213f84c_3_Valid {
  @pure def check(
      authorization: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type,
      battery_evidence: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryEvidence.Type,
      charge_context: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeContext.Type,
      decision_to_attention: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeDecision,
      decision_to_readiness: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeDecision,
      qualified_intent: equiv_shared_0.Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type,
      in_authorizationstate: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type,
      authorizationstate: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type,
      in_recoveryphase: equiv_shared_0.Drone_Battery_Charge_Supervisor.RecoveryPhase.Type,
      recoveryphase: equiv_shared_0.Drone_Battery_Charge_Supervisor.RecoveryPhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
