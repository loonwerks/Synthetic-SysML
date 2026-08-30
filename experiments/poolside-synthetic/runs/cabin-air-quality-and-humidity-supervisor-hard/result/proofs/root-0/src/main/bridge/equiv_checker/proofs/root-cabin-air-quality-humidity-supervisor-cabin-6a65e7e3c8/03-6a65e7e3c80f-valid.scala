// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6a65e7e3c80f_3_Valid {
  @pure def check(
      accepted: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      capabilities: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts,
      humidity_report: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityRecoveryReport,
      proposal: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
