// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9cac59eb51ca_3_Valid {
  @pure def check(
      intent_sample: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeIntentSample,
      qualified_intent: equiv_shared_0.Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
