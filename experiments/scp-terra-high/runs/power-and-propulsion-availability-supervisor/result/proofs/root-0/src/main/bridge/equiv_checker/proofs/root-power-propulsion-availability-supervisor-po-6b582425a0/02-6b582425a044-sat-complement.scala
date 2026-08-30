// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6b582425a044_2_Complement {
  @pure def check(
      accepted_directive: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PriorityDirective.Type,
      actuation_feedback: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ActuationFeedback.Type,
      availability_decision: equiv_shared_0.Power_Propulsion_Availability_Supervisor.AvailabilityDecision,
      demand_view: equiv_shared_0.Power_Propulsion_Availability_Supervisor.DemandPhase.Type,
      power_command: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommand.Type,
      recovery_gate: equiv_shared_0.Power_Propulsion_Availability_Supervisor.RecoveryGate.Type,
      commandmemory: equiv_shared_0.Power_Propulsion_Availability_Supervisor.CommandPhase.Type): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_Candidate_GumboX.inititialize_IEP_Post(power_command))) ___>: (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommandInterlockOwner_supervisor_process_power_command_interlock_GumboX.inititialize_IEP_Post(commandmemory, power_command))) & T)))
  }
}
