// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_612f6d2a1438_2_Complement {
  @pure def check(
      chargedecision: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type,
      chargeeligibilityenvelope: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type,
      chargerequest: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.Type): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_Candidate_GumboX.inititialize_IEP_Post(chargeeligibilityenvelope, chargerequest, chargedecision))) ___>: (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter_GumboX.inititialize_IEP_Post(chargeeligibilityenvelope, chargerequest, chargedecision))) & T)))
  }
}
