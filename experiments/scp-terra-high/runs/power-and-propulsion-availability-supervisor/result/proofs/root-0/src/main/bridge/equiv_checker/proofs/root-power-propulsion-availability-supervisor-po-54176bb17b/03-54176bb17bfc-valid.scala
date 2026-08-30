// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_54176bb17bfc_3_Valid {
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
      Ensures((T) ___>: (T)))
  }
}
