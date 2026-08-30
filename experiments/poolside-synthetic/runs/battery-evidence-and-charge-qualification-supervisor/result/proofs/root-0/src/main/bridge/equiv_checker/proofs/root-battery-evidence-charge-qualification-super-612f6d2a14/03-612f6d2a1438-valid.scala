// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_612f6d2a1438_3_Valid {
  @pure def check(
      chargedecision: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type,
      chargeeligibilityenvelope: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type,
      chargerequest: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
