// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier {

  def initialise(api: BatteryEvidenceQualifier_Initialization_Api): Unit = {
    api.put_batteryAssessment(Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE)
  }

  def timeTriggered(api: BatteryEvidenceQualifier_Operational_Api): Unit = {
    val capacity: Option[Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type] = api.get_batteryCapacity()
    val check: Option[Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type] = api.get_batteryCheck()
    val assessment: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type = (check, capacity) match {
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.INVALID), _) =>
        Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.VALID),
            Some(Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.LOW)) =>
        Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.LOW
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.VALID),
            Some(Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.USABLE)) =>
        Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.ADEQUATE
      case _ => Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE
    }
    api.put_batteryAssessment(assessment)
  }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}
