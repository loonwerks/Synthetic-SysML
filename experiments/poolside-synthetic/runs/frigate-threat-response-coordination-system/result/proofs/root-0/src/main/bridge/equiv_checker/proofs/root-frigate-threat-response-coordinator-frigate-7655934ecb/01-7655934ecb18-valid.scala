// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7655934ecb18_1_Valid {
  @pure def check(
      defenseactivation: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseActivation.Type,
      defensecondition: equiv_shared_0.Frigate_Threat_Response_Coordinator.DefenseCondition.Type,
      qualifiedthreat: equiv_shared_0.Frigate_Threat_Response_Coordinator.QualifiedThreat.Type,
      responserecord: equiv_shared_0.Frigate_Threat_Response_Coordinator.ResponseRecord,
      responserequest: equiv_shared_0.Frigate_Threat_Response_Coordinator.ResponseRequest,
      retreatcondition: equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatCondition.Type,
      retreatnavigationcommand: equiv_shared_0.Frigate_Threat_Response_Coordinator.RetreatNavigationCommand.Type,
      in_responsecommitment: equiv_shared_0.Frigate_Threat_Response_Coordinator.ResponseCommitment.Type,
      responsecommitment: equiv_shared_0.Frigate_Threat_Response_Coordinator.ResponseCommitment.Type,
      in_retreatrequestarmed: B,
      retreatrequestarmed: B): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
