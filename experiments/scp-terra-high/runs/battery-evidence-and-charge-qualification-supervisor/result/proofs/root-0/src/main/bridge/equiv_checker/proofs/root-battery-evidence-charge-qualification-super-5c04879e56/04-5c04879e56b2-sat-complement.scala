// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5c04879e56b2_4_Complement {
  @pure def check(
      chargecontextqualification: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type,
      chargeeligibilityenvelope: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type,
      chargerpathqualification: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type,
      currentchargesession: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_GumboX.inititialize_IEP_Post(chargecontextqualification, chargerpathqualification, currentchargesession, chargeeligibilityenvelope))) ___>: (equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner_Candidate_GumboX.inititialize_IEP_Post(chargeeligibilityenvelope))) & T)))
  }
}
