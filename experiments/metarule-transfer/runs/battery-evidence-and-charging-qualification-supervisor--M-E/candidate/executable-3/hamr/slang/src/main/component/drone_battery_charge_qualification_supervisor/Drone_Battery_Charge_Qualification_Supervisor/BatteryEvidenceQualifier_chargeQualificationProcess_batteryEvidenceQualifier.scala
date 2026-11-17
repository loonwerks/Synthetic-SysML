// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier {

  def initialise(api: BatteryEvidenceQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

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
        val apiUsage_reportIn: Option[Drone_Battery_Charge_Qualification_Supervisor.BatteryReportValue] = api.get_reportIn()
    api.logInfo(s"Received on data port reportIn: ${apiUsage_reportIn}")
    val band: QualifiedBand.Type =
      if (apiUsage_reportIn.get.validity == Validity.Invalid) QualifiedBand.Suppressed
      else if (apiUsage_reportIn.get.band == BatteryBand.Full) QualifiedBand.Full
      else if (apiUsage_reportIn.get.band == BatteryBand.Nominal) QualifiedBand.Nominal
      else if (apiUsage_reportIn.get.band == BatteryBand.Low) QualifiedBand.Low
      else QualifiedBand.Critical
    val qualification: BatteryQualification =
      BatteryQualification(apiUsage_reportIn.get.validity == Validity.Valid, band)
    api.put_qualificationOut(qualification)
  }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}
