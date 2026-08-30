// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2391dc7fb3c4_2_Complement {
  @pure def check(
      faulttoaggregation: B,
      qualificationin: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification,
      statetoadvisory: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts,
      statetoattention: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts,
      statetoeligibility: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts,
      confidencestate: equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner_GumboX.inititialize_IEP_Post(confidencestate, faulttoaggregation, statetoadvisory, statetoattention, statetoeligibility))) & T)))
  }
}
