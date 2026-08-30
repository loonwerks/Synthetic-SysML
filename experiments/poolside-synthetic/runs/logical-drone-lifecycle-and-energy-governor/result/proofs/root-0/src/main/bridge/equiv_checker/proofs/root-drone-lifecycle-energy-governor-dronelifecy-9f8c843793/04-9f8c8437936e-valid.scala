// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9f8c8437936e_4_Valid {
  @pure def check(
      confidencetofault: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type,
      evidencein: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidence,
      statetocharge: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      statetocomposition: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      statetohazard: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      statetoreadiness: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      in_confidencestate: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type,
      confidencestate: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner_GumboX.compute_CEP_Post(in_confidencestate, confidencestate, evidencein, confidencetofault, statetocharge, statetocomposition, statetohazard, statetoreadiness))) ___>: (T)) & T))
  }
}
