// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_06f8ba1e769f_2_Valid {
  @pure def check(
      defensecommand: equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseCommand.Type,
      egresscommand: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressCommand.Type,
      egressprogress: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressProgress.Type,
      responsedirective: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseDirective.Type,
      responsesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseSnapshot,
      committedegress: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressSessionState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_GumboX.inititialize_IEP_Post(committedegress, responsedirective, defensecommand, egresscommand, responsesnapshot))) & T))
  }
}
