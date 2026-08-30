// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FaultAggregationOwner_chargeQualificationProcess_faultAggregationOwner {

  def initialise(api: FaultAggregationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_faultsToNotification(Drone_Battery_Charge_Qualification_Supervisor.FaultFacts.example())
    api.put_faultsToComposition(Drone_Battery_Charge_Qualification_Supervisor.FaultFacts.example())
  }

  def timeTriggered(api: FaultAggregationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_chargerFaultIn: Option[Base_Types.Boolean] = api.get_chargerFaultIn()
    api.logInfo(s"Received on data port chargerFaultIn: ${apiUsage_chargerFaultIn}")
    val apiUsage_interfaceFaultIn: Option[Base_Types.Boolean] = api.get_interfaceFaultIn()
    api.logInfo(s"Received on data port interfaceFaultIn: ${apiUsage_interfaceFaultIn}")
    val apiUsage_contextFaultIn: Option[Base_Types.Boolean] = api.get_contextFaultIn()
    api.logInfo(s"Received on data port contextFaultIn: ${apiUsage_contextFaultIn}")
    val apiUsage_batteryFaultIn: Option[Base_Types.Boolean] = api.get_batteryFaultIn()
    api.logInfo(s"Received on data port batteryFaultIn: ${apiUsage_batteryFaultIn}")
    val apiUsage_sessionConflictIn: Option[Base_Types.Boolean] = api.get_sessionConflictIn()
    api.logInfo(s"Received on data port sessionConflictIn: ${apiUsage_sessionConflictIn}")
  }

  def finalise(api: FaultAggregationOwner_Operational_Api): Unit = { }
}
