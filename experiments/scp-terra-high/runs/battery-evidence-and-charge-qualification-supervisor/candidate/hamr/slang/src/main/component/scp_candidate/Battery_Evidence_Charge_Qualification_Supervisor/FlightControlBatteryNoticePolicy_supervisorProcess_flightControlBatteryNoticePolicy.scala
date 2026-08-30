// #Sireum

package scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy {

  def initialise(api: FlightControlBatteryNoticePolicy_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initial_notice
        api.flightControlBatteryNotice == FlightControlBatteryNotice.CLEAR
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_flightControlBatteryNotice(Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.CLEAR)
  }

  def timeTriggered(api: FlightControlBatteryNoticePolicy_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_batteryAssessment(), api.get_lifecycleContext()) match {
      case (Some(assessment), Some(context)) =>
        val notice: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type =
          if (assessment == Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE)
            Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.EVIDENCE_UNAVAILABLE
          else if (assessment == Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.LOW &&
            context == Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.FLYING)
            Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.LOW_IN_FLIGHT_CONTEXT
          else if (assessment == Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.LOW)
            Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.LOW_BATTERY
          else Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.CLEAR
        api.put_flightControlBatteryNotice(notice)
    }
  }

  def finalise(api: FlightControlBatteryNoticePolicy_Operational_Api): Unit = { }
}
