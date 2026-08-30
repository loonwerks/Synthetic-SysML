// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0540662257d1_3_Valid {
  @pure def check(
      accepted_directive: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PriorityDirective.Type,
      battery_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type,
      charging_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type,
      fault_action_summary: equiv_shared_0.Power_Propulsion_Availability_Supervisor.FaultActionSummary,
      power_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerAssessment.Type,
      propulsion_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type,
      request_context: equiv_shared_0.Power_Propulsion_Availability_Supervisor.RequestContext): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
