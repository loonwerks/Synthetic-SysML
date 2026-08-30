// #Sireum #Logika
package equiv_checker.generated

import org.sireum._

object VC_980559ba171b_2_Simplified_Valid {
  @pure def check(
      defensecommand: equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseCommand.Type,
      egresscommand: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressCommand.Type,
      egressprogress: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressProgress.Type,
      responsedirective: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseDirective.Type,
      responsesnapshot: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseSnapshot,
      in_committedegress: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressSessionState.Type,
      committedegress: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressSessionState.Type): Unit = {
    Contract(Requires(T),
      Ensures(equiv_shared_0.Frigate_Threat_Egress_Supervisor.ResponseStateController_threatResponseProcess_responseStateController_GumboX.compute_CEP_Post(in_committedegress, committedegress, egressprogress, responsedirective, defensecommand, egresscommand, responsesnapshot)))
  }
}
