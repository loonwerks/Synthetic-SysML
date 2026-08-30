// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4bb9469043c2_2_Complement {
  @pure def check(
      station_facts: equiv_shared_0.Docking_Access_Supervisor.StationFacts,
      station_report: equiv_shared_0.Docking_Access_Supervisor.StationReport.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Docking_Access_Supervisor.StationReportAssessment_supervisor_process_station_report_assessment_GumboX.compute_CEP_Post(station_report, station_facts))) & T)))
  }
}
