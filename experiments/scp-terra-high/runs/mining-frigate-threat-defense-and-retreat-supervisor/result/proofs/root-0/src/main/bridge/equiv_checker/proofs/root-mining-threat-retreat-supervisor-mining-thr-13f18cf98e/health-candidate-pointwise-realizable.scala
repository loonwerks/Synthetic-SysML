// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_13f18cf98e9a_Candidate_Pointwise_Realizable {
  @pure def check(
      defense_in: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Defense_Command.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_Candidate_GumboX.compute_CEP_Post(defense_in, equiv_shared_0.Mining_Threat_Retreat_Supervisor.Defense_Command.Stand_Down)) |
        (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Defense_Command_Delivery_supervisor_process_defense_command_delivery_Candidate_GumboX.compute_CEP_Post(defense_in, equiv_shared_0.Mining_Threat_Retreat_Supervisor.Defense_Command.Engage)))))
  }
}
