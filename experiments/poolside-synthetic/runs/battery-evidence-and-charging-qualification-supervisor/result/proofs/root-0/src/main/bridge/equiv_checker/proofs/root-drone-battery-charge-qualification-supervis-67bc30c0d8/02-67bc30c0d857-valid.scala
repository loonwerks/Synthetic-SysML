// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_67bc30c0d857_2_Valid {
  @pure def check(
      batteryin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts,
      chargerin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts,
      eligibilitytoadvisory: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type,
      eligibilitytosession: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type,
      interfacein: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts,
      lifecyclein: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner_GumboX.inititialize_IEP_Post(eligibilitytoadvisory, eligibilitytosession))) & T))
  }
}
