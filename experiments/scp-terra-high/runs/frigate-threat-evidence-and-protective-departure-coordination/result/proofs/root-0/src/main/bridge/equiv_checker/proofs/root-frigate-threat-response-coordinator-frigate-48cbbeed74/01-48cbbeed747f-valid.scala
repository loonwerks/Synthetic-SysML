// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_48cbbeed747f_1_Valid {
  @pure def check(
      alertstatein: equiv_shared_0.Frigate_Threat_Response_Coordinator.AlertState.Type,
      defenseauthorityin: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseAuthority.Type,
      defenseproposaltocompositionout: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.Type,
      defenseproposaltocoordinationout: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.Type,
      defensereadyin: B): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
