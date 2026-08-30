// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a00d95457afb_2_Valid {
  @pure def check(
      pilotreport: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.PilotTransferReport.Type,
      sessionsnapshot: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionSnapshot,
      stationreport: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.StationTransferReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_Candidate_GumboX.inititialize_IEP_Post(pilotreport, stationreport))) ___>: (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.OutcomeReporter_supervisorProcess_outcomeReporter_GumboX.inititialize_IEP_Post(pilotreport, stationreport))) & T))
  }
}
