// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6b582425a044_3_Valid {
  @pure def check(
      accepted_directive: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PriorityDirective.Type,
      actuation_feedback: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ActuationFeedback.Type,
      availability_decision: equiv_shared_0.Power_Propulsion_Availability_Supervisor.AvailabilityDecision,
      demand_view: equiv_shared_0.Power_Propulsion_Availability_Supervisor.DemandPhase.Type,
      power_command: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerCommand.Type,
      recovery_gate: equiv_shared_0.Power_Propulsion_Availability_Supervisor.RecoveryGate.Type,
      commandmemory: equiv_shared_0.Power_Propulsion_Availability_Supervisor.CommandPhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
