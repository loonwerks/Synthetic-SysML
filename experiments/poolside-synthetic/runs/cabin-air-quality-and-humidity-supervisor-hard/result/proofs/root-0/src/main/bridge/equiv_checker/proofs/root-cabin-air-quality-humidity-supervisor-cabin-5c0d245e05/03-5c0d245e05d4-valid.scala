// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5c0d245e05d4_3_Valid {
  @pure def check(
      accepted: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      air_report: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirRecoveryReport,
      capabilities: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts,
      proposal: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.FilterProposalReport): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
