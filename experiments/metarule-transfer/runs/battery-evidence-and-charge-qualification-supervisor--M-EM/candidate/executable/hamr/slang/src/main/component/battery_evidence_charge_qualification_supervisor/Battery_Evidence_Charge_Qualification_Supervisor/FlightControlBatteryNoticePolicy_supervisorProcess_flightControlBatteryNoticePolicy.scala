// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FlightControlBatteryNoticePolicy_supervisorProcess_flightControlBatteryNoticePolicy {

  def initialise(api: FlightControlBatteryNoticePolicy_Initialization_Api): Unit = {
    api.put_flightControlBatteryNotice(Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.EVIDENCE_UNAVAILABLE)
  }

  def timeTriggered(api: FlightControlBatteryNoticePolicy_Operational_Api): Unit = {
    val notice: Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.Type =
      (api.get_batteryAssessment(), api.get_lifecycleContext()) match {
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE), _) =>
        Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.EVIDENCE_UNAVAILABLE
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.LOW),
            Some(Battery_Evidence_Charge_Qualification_Supervisor.LifecycleContext.FLYING)) =>
        Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.LOW_IN_FLIGHT_CONTEXT
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.LOW), Some(_)) =>
        Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.LOW_BATTERY
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.ADEQUATE), Some(_)) =>
        Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.CLEAR
      case _ => Battery_Evidence_Charge_Qualification_Supervisor.FlightControlBatteryNotice.EVIDENCE_UNAVAILABLE
    }
    api.put_flightControlBatteryNotice(notice)
  }

  def finalise(api: FlightControlBatteryNoticePolicy_Operational_Api): Unit = { }
}
