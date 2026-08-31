// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargerPathQualifier_supervisorProcess_chargerPathQualifier {

  def initialise(api: ChargerPathQualifier_Initialization_Api): Unit = {
    api.put_chargerPathQualification(Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.UNAVAILABLE)
  }

  def timeTriggered(api: ChargerPathQualifier_Operational_Api): Unit = {
    val qualification: Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type =
      (api.get_chargerConnection(), api.get_chargeActivity()) match {
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.CONNECTED),
            Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.ACTIVE)) =>
        Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.ACTIVE
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.CONNECTED),
            Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.INACTIVE)) =>
        Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.READY
      case _ => Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.UNAVAILABLE
    }
    api.put_chargerPathQualification(qualification)
  }

  def finalise(api: ChargerPathQualifier_Operational_Api): Unit = { }
}
