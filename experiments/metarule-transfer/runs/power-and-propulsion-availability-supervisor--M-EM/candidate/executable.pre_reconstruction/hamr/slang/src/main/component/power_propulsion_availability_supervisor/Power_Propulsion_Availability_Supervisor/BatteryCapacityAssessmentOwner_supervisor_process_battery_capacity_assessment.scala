// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment {

  def initialise(api: BatteryCapacityAssessmentOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_battery_assessment(Power_Propulsion_Availability_Supervisor.BatteryAssessment.READY_NONE)
  }

  def timeTriggered(api: BatteryCapacityAssessmentOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_qualified_battery: Option[Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation] = api.get_qualified_battery()
    api.logInfo(s"Received on data port qualified_battery: ${apiUsage_qualified_battery}")
  }

  def finalise(api: BatteryCapacityAssessmentOwner_Operational_Api): Unit = { }
}
