// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier {

  def initialise(api: BatteryEvidenceQualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_batteryAssessment(Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE)
  }

  def timeTriggered(api: BatteryEvidenceQualifier_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_01_INVALID_EVIDENCE
        (api.batteryCheck == BatteryCheck.INVALID) ___>: (api.batteryAssessment == BatteryAssessment.UNAVAILABLE),
        // case CASE_02_VALID_LOW
        (api.batteryCheck == BatteryCheck.VALID &
          api.batteryCapacity == BatteryCapacityBand.LOW) ___>: (api.batteryAssessment == BatteryAssessment.LOW),
        // case CASE_03_VALID_USABLE
        (api.batteryCheck == BatteryCheck.VALID &
          api.batteryCapacity == BatteryCapacityBand.USABLE) ___>: (api.batteryAssessment == BatteryAssessment.ADEQUATE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val capacity = api.get_batteryCapacity().get
    val check = api.get_batteryCheck().get
    if (check == BatteryCheck.INVALID) {
      api.put_batteryAssessment(BatteryAssessment.UNAVAILABLE)
    } else if (capacity == BatteryCapacityBand.LOW) {
      api.put_batteryAssessment(BatteryAssessment.LOW)
    } else {
      api.put_batteryAssessment(BatteryAssessment.ADEQUATE)
    }
  }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}
