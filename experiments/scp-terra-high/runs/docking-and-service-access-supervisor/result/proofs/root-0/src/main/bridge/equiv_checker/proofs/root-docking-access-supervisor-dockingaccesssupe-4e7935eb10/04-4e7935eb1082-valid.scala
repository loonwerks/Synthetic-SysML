// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4e7935eb1082_4_Valid {
  @pure def check(
      station_facts: equiv_shared_0.Docking_Access_Supervisor.StationFacts,
      station_report: equiv_shared_0.Docking_Access_Supervisor.StationReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_GumboX.inititialize_IEP_Post(station_facts))) ___>: (T)) & T))
  }
}
