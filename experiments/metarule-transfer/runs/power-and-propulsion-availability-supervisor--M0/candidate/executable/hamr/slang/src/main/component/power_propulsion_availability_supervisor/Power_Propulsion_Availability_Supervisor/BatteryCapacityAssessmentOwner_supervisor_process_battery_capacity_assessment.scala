// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryCapacityAssessmentOwner_supervisor_process_battery_capacity_assessment {

  def initialise(api: BatteryCapacityAssessmentOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_battery_assessment(BatteryAssessment.NOT_READY_INVALID)
  }

  def timeTriggered(api: BatteryCapacityAssessmentOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val assessment: BatteryAssessment.Type = api.get_qualified_battery() match {
      case Some(battery) =>
        if (battery.admission == AdmissionResult.REJECTED_INVALID) BatteryAssessment.NOT_READY_INVALID
        else if (battery.admission == AdmissionResult.REJECTED_STALE) BatteryAssessment.NOT_READY_STALE
        else if (battery.quality == BatteryQuality.ADEQUATE) BatteryAssessment.READY_NONE
        else if (battery.quality == BatteryQuality.LIMITED) BatteryAssessment.NOT_READY_LIMITED
        else BatteryAssessment.NOT_READY_DEPLETED_OR_UNKNOWN
      case _ => BatteryAssessment.NOT_READY_INVALID
    }
    api.put_battery_assessment(assessment)
  }

  def finalise(api: BatteryCapacityAssessmentOwner_Operational_Api): Unit = { }
}
