// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6559751b080f_1_Valid {
  @pure def check(
      batteryqualification: equiv_shared_0.Drone_Lifecycle_Governor.BatteryQualification.Type,
      chargerstate: equiv_shared_0.Drone_Lifecycle_Governor.ChargerState.Type,
      currentlifecyclestate: equiv_shared_0.Drone_Lifecycle_Governor.LifecycleState.Type,
      eligibilityenvelope: equiv_shared_0.Drone_Lifecycle_Governor.EligibilityEnvelope,
      flightqualification: equiv_shared_0.Drone_Lifecycle_Governor.FlightQualification.Type,
      recoveryproposal: equiv_shared_0.Drone_Lifecycle_Governor.RecoveryProposal.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
