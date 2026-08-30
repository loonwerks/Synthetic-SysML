// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_377aeaf15b51_Oracle_Pointwise_Realizable {
  @pure def check(
      mining_in: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Command.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_GumboX.compute_CEP_Post(mining_in, equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Command.Stop)) |
        (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_GumboX.compute_CEP_Post(mining_in, equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Command.Mine)))))
  }
}
