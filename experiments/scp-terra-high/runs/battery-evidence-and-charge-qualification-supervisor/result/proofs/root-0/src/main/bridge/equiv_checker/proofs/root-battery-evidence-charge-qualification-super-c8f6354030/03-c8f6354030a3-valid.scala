// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c8f6354030a3_3_Valid {
  @pure def check(
      chargecontextqualification: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type,
      chargeeligibilityenvelope: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type,
      chargerpathqualification: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type,
      currentchargesession: equiv_shared_0.Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
