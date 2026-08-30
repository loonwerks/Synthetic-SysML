// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b3c2fb45d0a0_1_Valid {
  @pure def check(
      accepted: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AcceptedPreference,
      capability: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact,
      path: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.PathDisposition.Type,
      proposal: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.RoutineProposalReport): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
