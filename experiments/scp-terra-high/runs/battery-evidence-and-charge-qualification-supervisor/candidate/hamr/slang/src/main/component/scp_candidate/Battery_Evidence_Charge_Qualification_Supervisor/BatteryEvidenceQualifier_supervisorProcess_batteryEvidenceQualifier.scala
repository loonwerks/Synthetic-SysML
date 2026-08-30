// #Sireum

package scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier {

  def initialise(api: BatteryEvidenceQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initial_assessment
        api.batteryAssessment == BatteryAssessment.UNAVAILABLE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_batteryAssessment(Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE)
  }

  def timeTriggered(api: BatteryEvidenceQualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_batteryCapacity(), api.get_batteryCheck()) match {
      case (Some(capacity), Some(check)) =>
        val assessment: Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type =
          if (check == Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.INVALID)
            Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE
          else if (capacity == Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.LOW)
            Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.LOW
          else Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.ADEQUATE
        api.put_batteryAssessment(assessment)
    }
  }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}
