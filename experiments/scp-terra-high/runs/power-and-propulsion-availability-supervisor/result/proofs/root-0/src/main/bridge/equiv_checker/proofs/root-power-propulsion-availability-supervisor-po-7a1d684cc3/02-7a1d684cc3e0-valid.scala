// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7a1d684cc3e0_2_Valid {
  @pure def check(
      accepted_directive: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PriorityDirective.Type,
      actuation_feedback: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ActuationFeedback.Type,
      control_event: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ControlEvent.Type,
      demand_view: equiv_shared_0.Power_Propulsion_Availability_Supervisor.DemandPhase.Type,
      request_context: equiv_shared_0.Power_Propulsion_Availability_Supervisor.RequestContext,
      demandmemory: equiv_shared_0.Power_Propulsion_Availability_Supervisor.DemandPhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_Candidate_GumboX.inititialize_IEP_Post(demand_view, request_context))) ___>: (equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle_GumboX.inititialize_IEP_Post(demandmemory, demand_view, request_context))) & T))
  }
}
