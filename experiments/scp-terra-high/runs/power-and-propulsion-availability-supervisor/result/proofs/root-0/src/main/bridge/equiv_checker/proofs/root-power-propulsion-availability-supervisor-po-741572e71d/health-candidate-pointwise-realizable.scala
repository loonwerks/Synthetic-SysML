// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_741572e71d24_Candidate_Pointwise_Realizable {
  @pure def check(
      accepted_directive: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PriorityDirective.Type,
      actuation_feedback: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ActuationFeedback.Type,
      availability_decision: equiv_shared_0.Power_Propulsion_Availability_Supervisor.AvailabilityDecision,
      demand_view: equiv_shared_0.Power_Propulsion_Availability_Supervisor.DemandPhase.Type,
      recovery_gate: equiv_shared_0.Power_Propulsion_Availability_Supervisor.RecoveryGate.Type,
      in_commandmemory: equiv_shared_0.Power_Propulsion_Availability_Supervisor.CommandPhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_Candidate_GumboX.compute_CEP_Post(accepted_directive, actuation_feedback, availability_decision, demand_view, recovery_gate, equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommand.DISABLE)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_Candidate_GumboX.compute_CEP_Post(accepted_directive, actuation_feedback, availability_decision, demand_view, recovery_gate, equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommand.DISABLE)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_Candidate_GumboX.compute_CEP_Post(accepted_directive, actuation_feedback, availability_decision, demand_view, recovery_gate, equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommand.DISABLE)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_Candidate_GumboX.compute_CEP_Post(accepted_directive, actuation_feedback, availability_decision, demand_view, recovery_gate, equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommand.ENABLE_NEW)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_Candidate_GumboX.compute_CEP_Post(accepted_directive, actuation_feedback, availability_decision, demand_view, recovery_gate, equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommand.ENABLE_NEW)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_Candidate_GumboX.compute_CEP_Post(accepted_directive, actuation_feedback, availability_decision, demand_view, recovery_gate, equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommand.ENABLE_NEW)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_Candidate_GumboX.compute_CEP_Post(accepted_directive, actuation_feedback, availability_decision, demand_view, recovery_gate, equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommand.ENABLE_HOLD)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_Candidate_GumboX.compute_CEP_Post(accepted_directive, actuation_feedback, availability_decision, demand_view, recovery_gate, equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommand.ENABLE_HOLD)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_Candidate_GumboX.compute_CEP_Post(accepted_directive, actuation_feedback, availability_decision, demand_view, recovery_gate, equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommand.ENABLE_HOLD)))))
  }
}
