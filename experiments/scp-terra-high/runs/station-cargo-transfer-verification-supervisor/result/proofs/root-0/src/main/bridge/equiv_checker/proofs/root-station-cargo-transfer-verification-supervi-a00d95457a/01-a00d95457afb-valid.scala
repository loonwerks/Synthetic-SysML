// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a00d95457afb_1_Valid {
  @pure def check(
      pilotreport: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.Type,
      sessionsnapshot: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot,
      stationreport: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
