// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e481f4234784_2_Valid {
  @pure def check(
      advisorytorequestresult: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts,
      batteryin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts,
      eligibilityin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type,
      lifecyclein: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_Candidate_GumboX.compute_CEP_Post(batteryin, eligibilityin, lifecyclein, advisorytorequestresult))) ___>: (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner_GumboX.compute_CEP_Post(batteryin, eligibilityin, lifecyclein, advisorytorequestresult))) & T))
  }
}
