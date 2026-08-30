// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6380228cc4c8_1_Valid {
  @pure def check(
      accepted: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      capabilities: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts,
      humidity_report: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport,
      proposal: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
