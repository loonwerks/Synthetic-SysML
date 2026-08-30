// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9cac59eb51ca_4_Valid {
  @pure def check(
      intent_sample: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeIntentSample,
      qualified_intent: equiv_shared_0.Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_GumboX.compute_CEP_Post(intent_sample, qualified_intent))) ___>: (T)) & T))
  }
}
