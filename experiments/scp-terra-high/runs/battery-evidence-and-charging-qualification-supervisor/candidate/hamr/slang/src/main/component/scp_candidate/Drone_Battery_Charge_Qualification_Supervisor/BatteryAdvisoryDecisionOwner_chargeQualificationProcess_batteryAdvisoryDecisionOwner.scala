// #Sireum

package scp_candidate.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner {

  def initialise(api: BatteryAdvisoryDecisionOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_ADVISORY
        api.advisoryToRequestResult.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN
        // END INITIALIZES ENSURES
      )
    )
    api.put_advisoryToRequestResult(AdvisoryFacts(PilotAdvisory.ADVISORY_UNKNOWN))
  }

  def timeTriggered(api: BatteryAdvisoryDecisionOwner_Operational_Api): Unit = { }

  def finalise(api: BatteryAdvisoryDecisionOwner_Operational_Api): Unit = { }
}
