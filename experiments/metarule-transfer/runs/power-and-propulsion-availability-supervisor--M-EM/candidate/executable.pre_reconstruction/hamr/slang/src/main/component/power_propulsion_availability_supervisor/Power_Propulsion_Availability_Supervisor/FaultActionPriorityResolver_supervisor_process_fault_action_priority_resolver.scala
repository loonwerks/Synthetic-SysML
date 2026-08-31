// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FaultActionPriorityResolver_supervisor_process_fault_action_priority_resolver {

  def initialise(api: FaultActionPriorityResolver_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_accepted_directive(Power_Propulsion_Availability_Supervisor.PriorityDirective.INHIBIT)
    api.put_fault_action_summary(Power_Propulsion_Availability_Supervisor.FaultActionSummary.example())
  }

  def timeTriggered(api: FaultActionPriorityResolver_Operational_Api): Unit = {
    // example api usage

    val apiUsage_request_context: Option[Power_Propulsion_Availability_Supervisor.RequestContext] = api.get_request_context()
    api.logInfo(s"Received on data port request_context: ${apiUsage_request_context}")
    val apiUsage_battery_assessment: Option[Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type] = api.get_battery_assessment()
    api.logInfo(s"Received on data port battery_assessment: ${apiUsage_battery_assessment}")
    val apiUsage_power_assessment: Option[Power_Propulsion_Availability_Supervisor.PowerAssessment.Type] = api.get_power_assessment()
    api.logInfo(s"Received on data port power_assessment: ${apiUsage_power_assessment}")
    val apiUsage_propulsion_assessment: Option[Power_Propulsion_Availability_Supervisor.PropulsionAssessment.Type] = api.get_propulsion_assessment()
    api.logInfo(s"Received on data port propulsion_assessment: ${apiUsage_propulsion_assessment}")
    val apiUsage_charging_assessment: Option[Power_Propulsion_Availability_Supervisor.ChargingAssessment.Type] = api.get_charging_assessment()
    api.logInfo(s"Received on data port charging_assessment: ${apiUsage_charging_assessment}")
  }

  def finalise(api: FaultActionPriorityResolver_Operational_Api): Unit = { }
}
