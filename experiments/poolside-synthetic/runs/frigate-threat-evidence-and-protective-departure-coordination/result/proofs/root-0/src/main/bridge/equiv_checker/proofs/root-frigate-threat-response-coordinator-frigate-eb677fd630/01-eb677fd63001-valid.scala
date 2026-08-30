// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_eb677fd63001_1_Valid {
  @pure def check(
      defenseproposalin: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseProposal.Type,
      escapeproposalin: equiv_shared_0.Frigate_Threat_Response_Coordinator.EscapeProposal.Type,
      responsepatternout: equiv_shared_0.Frigate_Threat_Response_Coordinator.ResponsePattern.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
