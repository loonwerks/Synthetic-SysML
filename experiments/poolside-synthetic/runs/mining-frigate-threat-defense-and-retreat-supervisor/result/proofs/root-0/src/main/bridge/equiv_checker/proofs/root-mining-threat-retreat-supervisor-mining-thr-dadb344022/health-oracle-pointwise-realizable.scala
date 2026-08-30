// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_dadb344022a8_Oracle_Pointwise_Realizable {
  @pure def check(
      movement_service_in: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_GumboX.compute_CEP_Post(movement_service_in, equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Hold)) |
        (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_GumboX.compute_CEP_Post(movement_service_in, equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Retreat)) |
        (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_GumboX.compute_CEP_Post(movement_service_in, equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Dock)) |
        (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_GumboX.compute_CEP_Post(movement_service_in, equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Offload)) |
        (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_GumboX.compute_CEP_Post(movement_service_in, equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Resupply)) |
        (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command_Delivery_supervisor_process_movement_service_command_delivery_GumboX.compute_CEP_Post(movement_service_in, equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Acknowledge_Ready)))))
  }
}
