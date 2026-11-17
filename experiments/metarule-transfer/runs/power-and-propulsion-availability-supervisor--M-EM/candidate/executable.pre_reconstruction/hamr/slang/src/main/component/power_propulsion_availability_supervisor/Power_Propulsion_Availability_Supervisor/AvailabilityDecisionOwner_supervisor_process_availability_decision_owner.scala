// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AvailabilityDecisionOwner_supervisor_process_availability_decision_owner {

  def initialise(api: AvailabilityDecisionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_availability_decision(Power_Propulsion_Availability_Supervisor.AvailabilityDecision.example())
    api.put_availability_report(Power_Propulsion_Availability_Supervisor.AvailabilityReport.example())
  }

  def timeTriggered(api: AvailabilityDecisionOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_battery_assessment: Option[Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type] = api.get_battery_assessment()
    api.logInfo(s"Received on data port battery_assessment: ${apiUsage_battery_assessment}")
    val apiUsage_power_assessment: Option[Power_Propulsion_Availability_Supervisor.PowerAssessment.Type] = api.get_power_assessment()
    api.logInfo(s"Received on data port power_assessment: ${apiUsage_power_assessment}")
    val apiUsage_propulsion_assessment: Option[Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type] = api.get_propulsion_assessment()
    api.logInfo(s"Received on data port propulsion_assessment: ${apiUsage_propulsion_assessment}")
    val apiUsage_charging_assessment: Option[Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type] = api.get_charging_assessment()
    api.logInfo(s"Received on data port charging_assessment: ${apiUsage_charging_assessment}")
    val apiUsage_demand_view: Option[Power_Propulsion_Availability_Supervisor.DemandPhase.Type] = api.get_demand_view()
    api.logInfo(s"Received on data port demand_view: ${apiUsage_demand_view}")
    val apiUsage_fault_action_summary: Option[Power_Propulsion_Availability_Supervisor.FaultActionSummary] = api.get_fault_action_summary()
    api.logInfo(s"Received on data port fault_action_summary: ${apiUsage_fault_action_summary}")
    val apiUsage_recovery_frame: Option[Power_Propulsion_Availability_Supervisor.RecoveryFrame] = api.get_recovery_frame()
    api.logInfo(s"Received on data port recovery_frame: ${apiUsage_recovery_frame}")
  }

  def finalise(api: AvailabilityDecisionOwner_Operational_Api): Unit = { }
}
