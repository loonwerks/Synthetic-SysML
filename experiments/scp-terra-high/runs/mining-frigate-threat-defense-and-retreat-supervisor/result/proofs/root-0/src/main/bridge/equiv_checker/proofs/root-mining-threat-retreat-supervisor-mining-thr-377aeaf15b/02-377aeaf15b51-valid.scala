// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_377aeaf15b51_2_Valid {
  @pure def check(
      mining_in: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Command.Type,
      mining_out: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Command.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_Candidate_GumboX.compute_CEP_Post(mining_in, mining_out))) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Command_Delivery_supervisor_process_mining_command_delivery_GumboX.compute_CEP_Post(mining_in, mining_out))) & T))
  }
}
