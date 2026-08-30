// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_13269d066c23_Oracle_Pointwise_Realizable {
  @pure def check(
      intent_sample: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeIntentSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_GumboX.inititialize_IEP_Post(equiv_shared_0.Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.InvalidChargeIntent)) |
        (equiv_shared_0.Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_GumboX.inititialize_IEP_Post(equiv_shared_0.Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent)) |
        (equiv_shared_0.Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_GumboX.inititialize_IEP_Post(equiv_shared_0.Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.BeginCharge)) |
        (equiv_shared_0.Drone_Battery_Charge_Supervisor.Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification_GumboX.inititialize_IEP_Post(equiv_shared_0.Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.EndCharge)))))
  }
}
