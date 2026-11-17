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

    api.put_battery_assessment(Power_Propulsion_Availability_Supervisor.BatteryAssessment.NOT_READY_INVALID)
  }

  def timeTriggered(api: BatteryCapacityAssessmentOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_03_BATTERY_READY
        (api.qualified_battery.admission == AdmissionResult.ADMITTED_NONE &
          api.qualified_battery.quality == BatteryQuality.ADEQUATE) ___>: (api.battery_assessment == BatteryAssessment.READY_NONE),
        // case CASE_04_BATTERY_NOT_READY
        (api.qualified_battery.admission != AdmissionResult.ADMITTED_NONE |
          api.qualified_battery.quality != BatteryQuality.ADEQUATE) ___>: (api.qualified_battery.admission == AdmissionResult.REJECTED_INVALID &
          api.battery_assessment == BatteryAssessment.NOT_READY_INVALID |
          api.qualified_battery.admission == AdmissionResult.REJECTED_STALE &
            api.battery_assessment == BatteryAssessment.NOT_READY_STALE |
          api.qualified_battery.admission == AdmissionResult.ADMITTED_NONE &
            api.qualified_battery.quality == BatteryQuality.LIMITED &
            api.battery_assessment == BatteryAssessment.NOT_READY_LIMITED |
          api.qualified_battery.admission == AdmissionResult.ADMITTED_NONE &
            (api.qualified_battery.quality == BatteryQuality.DEPLETED |
              api.qualified_battery.quality == BatteryQuality.UNKNOWN) &
            api.battery_assessment == BatteryAssessment.NOT_READY_DEPLETED_OR_UNKNOWN)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val q: Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation = api.get_qualified_battery().get
    api.put_battery_assessment(
      if (q.admission == AdmissionResult.ADMITTED_NONE)
        if (q.quality == BatteryQuality.ADEQUATE) BatteryAssessment.READY_NONE
        else if (q.quality == BatteryQuality.LIMITED) BatteryAssessment.NOT_READY_LIMITED
        else BatteryAssessment.NOT_READY_DEPLETED_OR_UNKNOWN
      else if (q.admission == AdmissionResult.REJECTED_INVALID) BatteryAssessment.NOT_READY_INVALID
      else BatteryAssessment.NOT_READY_STALE)
  }

  def finalise(api: BatteryCapacityAssessmentOwner_Operational_Api): Unit = { }
}
