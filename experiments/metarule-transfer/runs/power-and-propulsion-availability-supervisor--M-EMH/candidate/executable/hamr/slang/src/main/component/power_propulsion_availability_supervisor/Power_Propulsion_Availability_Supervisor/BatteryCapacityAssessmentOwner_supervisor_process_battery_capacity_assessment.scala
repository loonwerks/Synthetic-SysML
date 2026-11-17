// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment {

  def initialise(api: BatteryCapacityAssessmentOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_battery_assessment(Power_Propulsion_Availability_Supervisor.BatteryAssessment.NOT_READY_INVALID)
  }

  def timeTriggered(api: BatteryCapacityAssessmentOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val assessment: Power_Propulsion_Availability_Supervisor.BatteryAssessment.Type = api.get_qualified_battery() match {
      case Some(battery) =>
        if (battery.admission == Power_Propulsion_Availability_Supervisor.AdmissionResult.REJECTED_INVALID)
          Power_Propulsion_Availability_Supervisor.BatteryAssessment.NOT_READY_INVALID
        else if (battery.admission == Power_Propulsion_Availability_Supervisor.AdmissionResult.REJECTED_STALE)
          Power_Propulsion_Availability_Supervisor.BatteryAssessment.NOT_READY_STALE
        else if (battery.quality == Power_Propulsion_Availability_Supervisor.BatteryQuality.ADEQUATE)
          Power_Propulsion_Availability_Supervisor.BatteryAssessment.READY_NONE
        else if (battery.quality == Power_Propulsion_Availability_Supervisor.BatteryQuality.LIMITED)
          Power_Propulsion_Availability_Supervisor.BatteryAssessment.NOT_READY_LIMITED
        else Power_Propulsion_Availability_Supervisor.BatteryAssessment.NOT_READY_DEPLETED_OR_UNKNOWN
      case _ => Power_Propulsion_Availability_Supervisor.BatteryAssessment.NOT_READY_INVALID
    }
    api.put_battery_assessment(assessment)
  }

  def finalise(api: BatteryCapacityAssessmentOwner_Operational_Api): Unit = { }
}
