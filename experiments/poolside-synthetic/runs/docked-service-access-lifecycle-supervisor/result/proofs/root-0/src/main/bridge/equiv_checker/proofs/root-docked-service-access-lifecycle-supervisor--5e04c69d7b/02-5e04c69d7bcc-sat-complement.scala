// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5e04c69d7bcc_2_Complement {
  @pure def check(
      gatedcontrol: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.GatedControl,
      lifecyclesnapshot: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleSnapshot,
      pilotreport: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.PilotLifecycleReport.Type,
      stationreport: equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.StationAccessReport.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Docked_Service_Access_Lifecycle_Supervisor.LifecycleReporter_supervisorProcess_lifecycleReporter_GumboX.inititialize_IEP_Post(pilotreport, stationreport))) & T)))
  }
}
