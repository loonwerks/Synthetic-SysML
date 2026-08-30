// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_da1081622734_2_Valid {
  @pure def check(
      capacitor_input: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Capacitor_Observation,
      cargo_input: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Cargo_Observation,
      defense_availability_input: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation,
      defense_decision: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Defense_Command.Type,
      fault_decision: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Input_Fault.Type,
      mining_availability_input: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation,
      mining_decision: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Command.Type,
      movement_service_decision: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Movement_Service_Command.Type,
      phase_decision: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Operational_Phase.Type,
      request_input: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Request_Observation,
      retreat_availability_input: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation,
      service_progress_input: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Service_Progress_Observation,
      threat_input: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Threat_Observation,
      current_phase: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Operational_Phase.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_Candidate_GumboX.inititialize_IEP_Post(current_phase, defense_decision, fault_decision, mining_decision, movement_service_decision, phase_decision))) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Principal_Decision_Owner_supervisor_process_principal_decision_owner_GumboX.inititialize_IEP_Post(current_phase, defense_decision, fault_decision, mining_decision, movement_service_decision, phase_decision))) & T))
  }
}
