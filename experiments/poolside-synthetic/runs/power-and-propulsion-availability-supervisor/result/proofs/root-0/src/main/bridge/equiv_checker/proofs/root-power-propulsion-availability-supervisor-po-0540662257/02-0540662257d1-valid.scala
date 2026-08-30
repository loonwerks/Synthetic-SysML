// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0540662257d1_2_Valid {
  @pure def check(
      accepted_directive: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PriorityDirective.Type,
      battery_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type,
      charging_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type,
      fault_action_summary: equiv_shared_0.Power_Propulsion_Availability_Supervisor.FaultActionSummary,
      power_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerAssessment.Type,
      propulsion_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type,
      request_context: equiv_shared_0.Power_Propulsion_Availability_Supervisor.RequestContext): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_Candidate_GumboX.inititialize_IEP_Post(accepted_directive, fault_action_summary))) ___>: (equiv_shared_0.Power_Propulsion_Availability_Supervisor.FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver_GumboX.inititialize_IEP_Post(accepted_directive, fault_action_summary))) & T))
  }
}
