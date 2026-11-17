// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object FaultAggregationOwner_governorProcess_faultAggregationOwner {

  def initialise(api: FaultAggregationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_faultsOut(Drone_Lifecycle_Energy_Governor.FaultVector.example())
  }

  def timeTriggered(api: FaultAggregationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_confidenceIn: Option[Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type] = api.get_confidenceIn()
    api.logInfo(s"Received on data port confidenceIn: ${apiUsage_confidenceIn}")
    val apiUsage_chargerFaultIn: Option[Base_Types.Boolean] = api.get_chargerFaultIn()
    api.logInfo(s"Received on data port chargerFaultIn: ${apiUsage_chargerFaultIn}")
    val apiUsage_navigationIn: Option[Drone_Lifecycle_Energy_Governor.NavigationReport.Type] = api.get_navigationIn()
    api.logInfo(s"Received on data port navigationIn: ${apiUsage_navigationIn}")
    val apiUsage_flightControlIn: Option[Drone_Lifecycle_Energy_Governor.FlightControlReport.Type] = api.get_flightControlIn()
    api.logInfo(s"Received on data port flightControlIn: ${apiUsage_flightControlIn}")
    val apiUsage_homeFaultIn: Option[Base_Types.Boolean] = api.get_homeFaultIn()
    api.logInfo(s"Received on data port homeFaultIn: ${apiUsage_homeFaultIn}")
    val apiUsage_touchdownFaultIn: Option[Base_Types.Boolean] = api.get_touchdownFaultIn()
    api.logInfo(s"Received on data port touchdownFaultIn: ${apiUsage_touchdownFaultIn}")
  }

  def finalise(api: FaultAggregationOwner_Operational_Api): Unit = { }
}
