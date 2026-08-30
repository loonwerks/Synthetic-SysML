// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy {

  def initialise(api: FlightControlBatteryNoticePolicy_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // BEGIN WORK
    api.put_flightControlBatteryNotice(FlightControlBatteryNotice.CLEAR)
    // END WORK
  }

  def timeTriggered(api: FlightControlBatteryNoticePolicy_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_19_CONTEXTUAL_NOTICE
        (T) ___>: (api.batteryAssessment == BatteryAssessment.UNAVAILABLE ___>:
          api.flightControlBatteryNotice == FlightControlBatteryNotice.EVIDENCE_UNAVAILABLE &
            (api.batteryAssessment == BatteryAssessment.LOW &
              api.lifecycleContext == LifecycleContext.FLYING) ___>:
            api.flightControlBatteryNotice == FlightControlBatteryNotice.LOW_IN_FLIGHT_CONTEXT &
              (api.batteryAssessment == BatteryAssessment.LOW &
                api.lifecycleContext != LifecycleContext.FLYING) ___>:
              api.flightControlBatteryNotice == FlightControlBatteryNotice.LOW_BATTERY &
                api.batteryAssessment == BatteryAssessment.ADEQUATE ___>:
                api.flightControlBatteryNotice == FlightControlBatteryNotice.CLEAR)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // BEGIN WORK
    val batteryAssessment = api.get_batteryAssessment().get
    val lifecycleContext = api.get_lifecycleContext().get
    var notice: FlightControlBatteryNotice.Type = FlightControlBatteryNotice.CLEAR
    if (batteryAssessment == BatteryAssessment.UNAVAILABLE) {
      notice = FlightControlBatteryNotice.EVIDENCE_UNAVAILABLE
    } else if (batteryAssessment == BatteryAssessment.LOW) {
      if (lifecycleContext == LifecycleContext.FLYING) {
        notice = FlightControlBatteryNotice.LOW_IN_FLIGHT_CONTEXT
      } else {
        notice = FlightControlBatteryNotice.LOW_BATTERY
      }
    } else {
      notice = FlightControlBatteryNotice.CLEAR
    }
    api.put_flightControlBatteryNotice(notice)
    // END WORK
  }

  def finalise(api: FlightControlBatteryNoticePolicy_Operational_Api): Unit = { }
}
