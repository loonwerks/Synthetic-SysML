// #Sireum

package scp_candidate.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryEvidenceQualifier_chargeQualificationProcess_batteryEvidenceQualifier {

  def initialise(api: BatteryEvidenceQualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_BATTERY_QUALIFICATION
        api.qualificationOut.validEvidence == F &&
          api.qualificationOut.band == QualifiedBand.Suppressed
        // END INITIALIZES ENSURES
      )
    )
    api.put_qualificationOut(BatteryQualification(F, QualifiedBand.Suppressed))
  }

  def timeTriggered(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}
