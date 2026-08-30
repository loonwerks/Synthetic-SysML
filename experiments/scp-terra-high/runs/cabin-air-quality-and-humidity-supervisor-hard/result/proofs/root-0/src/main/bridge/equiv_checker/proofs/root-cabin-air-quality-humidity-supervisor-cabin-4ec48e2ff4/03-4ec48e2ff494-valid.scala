// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4ec48e2ff494_3_Valid {
  @pure def check(
      evidence: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityEvidence.Type,
      report_to_humidity: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport,
      report_to_status: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport,
      humiditytrustmemory: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.TrustState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
