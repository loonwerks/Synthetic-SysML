// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_af85f16ce9a8_2_Valid {
  @pure def check(
      pilotreport: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.Type,
      sessionsnapshot: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot,
      stationreport: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_Candidate_GumboX.compute_CEP_Post(sessionsnapshot, pilotreport, stationreport))) ___>: (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_GumboX.compute_CEP_Post(sessionsnapshot, pilotreport, stationreport))) & T))
  }
}
