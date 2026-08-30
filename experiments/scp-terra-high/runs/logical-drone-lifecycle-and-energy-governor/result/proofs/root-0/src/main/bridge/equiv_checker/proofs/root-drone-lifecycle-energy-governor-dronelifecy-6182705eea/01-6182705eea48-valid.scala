// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6182705eea48_1_Valid {
  @pure def check(
      batteryin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.BatteryStateFacts,
      chargepermissionout: equiv_shared_0.Drone_Lifecycle_Energy_Governor.ChargePermission.Type,
      faultsin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.FaultVector,
      flightcontrolout: equiv_shared_0.Drone_Lifecycle_Energy_Governor.FlightControlOutputs,
      pilotstatusout: equiv_shared_0.Drone_Lifecycle_Energy_Governor.PilotStatus,
      propulsionpermissionout: equiv_shared_0.Drone_Lifecycle_Energy_Governor.PropulsionPermission.Type,
      resolutionin: equiv_shared_0.Drone_Lifecycle_Energy_Governor.LifecycleResolution): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
