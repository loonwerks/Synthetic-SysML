// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_77494d856ff1_4_Valid {
  @pure def check(
      availability_decision: equiv_shared_0.Power_Propulsion_Availability_Supervisor.AvailabilityDecision,
      availability_report: equiv_shared_0.Power_Propulsion_Availability_Supervisor.AvailabilityReport,
      battery_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type,
      charging_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type,
      demand_view: equiv_shared_0.Power_Propulsion_Availability_Supervisor.DemandPhase.Type,
      fault_action_summary: equiv_shared_0.Power_Propulsion_Availability_Supervisor.FaultActionSummary,
      power_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerAssessment.Type,
      propulsion_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type,
      recovery_frame: equiv_shared_0.Power_Propulsion_Availability_Supervisor.RecoveryFrame): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_GumboX.inititialize_IEP_Post(availability_decision, availability_report))) ___>: (equiv_shared_0.Power_Propulsion_Availability_Supervisor.AvailabilityDecisionOwner_supervisor_process_availability_decision_owner_Candidate_GumboX.inititialize_IEP_Post(availability_decision, availability_report))) & T))
  }
}
