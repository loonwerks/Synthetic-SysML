// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier {

  def initialise(api: BatteryEvidenceQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // BEGIN WORK
    api.put_batteryAssessment(BatteryAssessment.UNAVAILABLE)
    // END WORK
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
    // BEGIN WORK
    val batteryCapacity = api.get_batteryCapacity().get
    val batteryCheck = api.get_batteryCheck().get
    val assessment: BatteryAssessment.Type = 
      if (batteryCheck == BatteryCheck.INVALID) BatteryAssessment.UNAVAILABLE
      else if (batteryCapacity == BatteryCapacityBand.LOW) BatteryAssessment.LOW
      else BatteryAssessment.ADEQUATE
    api.put_batteryAssessment(assessment)
    // END WORK
  }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}