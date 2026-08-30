// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4e7935eb1082_3_Valid {
  @pure def check(
      station_facts: equiv_shared_0.Docking_Access_Supervisor.StationFacts,
      station_report: equiv_shared_0.Docking_Access_Supervisor.StationReport.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
