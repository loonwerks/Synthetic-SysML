// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_078b3de9568d_3_Valid {
  @pure def check(
      gatedcontrol: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.GatedControl,
      lifecyclesnapshot: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot,
      pilotreport: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.Type,
      stationreport: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
