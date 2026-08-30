// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_368411677476_1_Valid {
  @pure def check(
      evidence: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirEvidence.Type,
      report_to_filter: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport,
      report_to_status: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport,
      in_airtrustmemory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type,
      airtrustmemory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
