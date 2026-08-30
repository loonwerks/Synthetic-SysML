// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4bb9469043c2_1_Valid {
  @pure def check(
      station_facts: equiv_shared_0.Docking_Access_Supervisor.StationFacts,
      station_report: equiv_shared_0.Docking_Access_Supervisor.StationReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
