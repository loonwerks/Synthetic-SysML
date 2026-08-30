// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f18a6111c564_2_Valid {
  @pure def check(
      faulttoaggregation: B,
      qualificationin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification,
      statetoadvisory: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts,
      statetoattention: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts,
      statetoeligibility: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts,
      in_confidencestate: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Type,
      confidencestate: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_Candidate_GumboX.compute_CEP_Post(in_confidencestate, confidencestate, qualificationin, faulttoaggregation, statetoadvisory, statetoattention, statetoeligibility))) ___>: (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_GumboX.compute_CEP_Post(in_confidencestate, confidencestate, qualificationin, faulttoaggregation, statetoadvisory, statetoattention, statetoeligibility))) & T))
  }
}
