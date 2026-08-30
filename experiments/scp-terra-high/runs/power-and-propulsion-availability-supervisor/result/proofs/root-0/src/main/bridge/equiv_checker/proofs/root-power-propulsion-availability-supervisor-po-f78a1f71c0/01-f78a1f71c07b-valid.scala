// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f78a1f71c07b_1_Valid {
  @pure def check(
      accepted_directive: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PriorityDirective.Type,
      actuation_feedback: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ActuationFeedback.Type,
      control_event: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ControlEvent.Type,
      demand_view: equiv_shared_0.Power_Propulsion_Availability_Supervisor.DemandPhase.Type,
      request_context: equiv_shared_0.Power_Propulsion_Availability_Supervisor.RequestContext,
      in_demandmemory: equiv_shared_0.Power_Propulsion_Availability_Supervisor.DemandPhase.Type,
      demandmemory: equiv_shared_0.Power_Propulsion_Availability_Supervisor.DemandPhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
