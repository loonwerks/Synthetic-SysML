// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ea1c958ddeec_3_Valid {
  @pure def check(
      defenseactivation: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseActivation.Type,
      defensecondition: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseCondition.Type,
      qualifiedthreat: equiv_shared_0.Frigate_Threat_Response_Coordinator.QualifiedThreat.Type,
      responserecord: equiv_shared_0.Frigate_Threat_Response_Coordinator.ResponseRecord,
      responserequest: equiv_shared_0.Frigate_Threat_Response_Coordinator.ResponseRequest,
      retreatcondition: equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatCondition.Type,
      retreatnavigationcommand: equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.Type,
      responsecommitment: equiv_shared_0.Frigate_Threat_Response_Coordinator.ResponseCommitment.Type,
      retreatrequestarmed: B): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
