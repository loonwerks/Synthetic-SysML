// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_af918a6b11a3_2_Complement {
  @pure def check(
      confidencetofault: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type,
      evidencein: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidence,
      statetocharge: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      statetocomposition: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      statetohazard: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      statetoreadiness: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      confidencestate: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_GumboX.inititialize_IEP_Post(confidencestate, confidencetofault, statetocharge, statetocomposition, statetohazard, statetoreadiness))) & T)))
  }
}
