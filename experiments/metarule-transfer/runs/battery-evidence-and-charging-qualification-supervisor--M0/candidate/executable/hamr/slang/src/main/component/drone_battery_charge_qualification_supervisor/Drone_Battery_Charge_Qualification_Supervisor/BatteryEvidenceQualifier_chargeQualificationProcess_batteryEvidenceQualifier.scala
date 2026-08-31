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
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case INVALID_BATTERY_REPORT
        (api.reportIn.validity == Validity.Invalid) ___>: (!(api.qualificationOut.validEvidence) &
          api.qualificationOut.band == QualifiedBand.Suppressed),
        // case VALID_FULL_REPORT
        (api.reportIn.validity == Validity.Valid &
          api.reportIn.band == BatteryBand.Full) ___>: (api.qualificationOut.validEvidence &
          api.qualificationOut.band == QualifiedBand.Full),
        // case VALID_NOMINAL_REPORT
        (api.reportIn.validity == Validity.Valid &
          api.reportIn.band == BatteryBand.Nominal) ___>: (api.qualificationOut.validEvidence &
          api.qualificationOut.band == QualifiedBand.Nominal),
        // case VALID_LOW_REPORT
        (api.reportIn.validity == Validity.Valid &
          api.reportIn.band == BatteryBand.Low) ___>: (api.qualificationOut.validEvidence &
          api.qualificationOut.band == QualifiedBand.Low),
        // case VALID_CRITICAL_REPORT
        (api.reportIn.validity == Validity.Valid &
          api.reportIn.band == BatteryBand.Critical) ___>: (api.qualificationOut.validEvidence &
          api.qualificationOut.band == QualifiedBand.Critical)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val report = api.get_reportIn().get
    val qualification: BatteryQualification =
      if (report.validity == Validity.Invalid) {
        BatteryQualification(F, QualifiedBand.Suppressed)
      } else if (report.band == BatteryBand.Full) {
        BatteryQualification(T, QualifiedBand.Full)
      } else if (report.band == BatteryBand.Nominal) {
        BatteryQualification(T, QualifiedBand.Nominal)
      } else if (report.band == BatteryBand.Low) {
        BatteryQualification(T, QualifiedBand.Low)
      } else {
        BatteryQualification(T, QualifiedBand.Critical)
      }
    api.put_qualificationOut(qualification)
  }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}
