// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_dadb344022a8_4_Valid {
  @pure def check(
      movement_service_in: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Type,
      movement_service_out: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_GumboX.compute_CEP_Post(movement_service_in, movement_service_out))) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_Candidate_GumboX.compute_CEP_Post(movement_service_in, movement_service_out))) & T))
  }
}
