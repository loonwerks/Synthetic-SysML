// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier {

  def initialise(api: BatteryEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_qualificationOut(BatteryQualification(F, QualifiedBand.Suppressed))
  }

  def timeTriggered(api: BatteryEvidenceQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_reportIn() match {
      case Some(report) =>
        val qualification: BatteryQualification =
          if (report.validity != Validity.Valid) {
            BatteryQualification(F, QualifiedBand.Suppressed)
          } else {
            val band: QualifiedBand.Type = report.band match {
              case BatteryBand.Full => QualifiedBand.Full
              case BatteryBand.Nominal => QualifiedBand.Nominal
              case BatteryBand.Low => QualifiedBand.Low
              case _ => QualifiedBand.Critical
            }
            BatteryQualification(T, band)
          }
        api.put_qualificationOut(qualification)
      case _ =>
    }
  }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}
