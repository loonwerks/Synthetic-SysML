// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy {

  def initialise(api: FlightControlBatteryNoticePolicy_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_flightControlBatteryNotice(Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.CLEAR)
  }

  def timeTriggered(api: FlightControlBatteryNoticePolicy_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_19_CONTEXTUAL_NOTICE
        (T) ___>: ((api.batteryAssessment == BatteryAssessment.UNAVAILABLE ___>:
          api.flightControlBatteryNotice == FlightControlBatteryNotice.EVIDENCE_UNAVAILABLE) &
          (api.batteryAssessment == BatteryAssessment.LOW &
            api.lifecycleContext == LifecycleContext.FLYING ___>:
            api.flightControlBatteryNotice == FlightControlBatteryNotice.LOW_IN_FLIGHT_CONTEXT) &
          (api.batteryAssessment == BatteryAssessment.LOW &
            api.lifecycleContext != LifecycleContext.FLYING ___>:
            api.flightControlBatteryNotice == FlightControlBatteryNotice.LOW_BATTERY) &
          (api.batteryAssessment == BatteryAssessment.ADEQUATE ___>:
            api.flightControlBatteryNotice == FlightControlBatteryNotice.CLEAR))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val assessment = api.get_batteryAssessment().get
    val context = api.get_lifecycleContext().get
    if (assessment == BatteryAssessment.UNAVAILABLE) {
      api.put_flightControlBatteryNotice(FlightControlBatteryNotice.EVIDENCE_UNAVAILABLE)
    } else if (assessment == BatteryAssessment.LOW & context == LifecycleContext.FLYING) {
      api.put_flightControlBatteryNotice(FlightControlBatteryNotice.LOW_IN_FLIGHT_CONTEXT)
    } else if (assessment == BatteryAssessment.LOW) {
      api.put_flightControlBatteryNotice(FlightControlBatteryNotice.LOW_BATTERY)
    } else {
      api.put_flightControlBatteryNotice(FlightControlBatteryNotice.CLEAR)
    }
  }

  def finalise(api: FlightControlBatteryNoticePolicy_Operational_Api): Unit = { }
}
