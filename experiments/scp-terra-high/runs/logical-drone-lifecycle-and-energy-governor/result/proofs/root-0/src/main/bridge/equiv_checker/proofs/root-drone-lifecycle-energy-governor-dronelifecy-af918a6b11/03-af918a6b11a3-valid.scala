// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_af918a6b11a3_3_Valid {
  @pure def check(
      confidencetofault: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type,
      evidencein: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryEvidence,
      statetocharge: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      statetocomposition: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      statetohazard: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      statetoreadiness: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      confidencestate: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
