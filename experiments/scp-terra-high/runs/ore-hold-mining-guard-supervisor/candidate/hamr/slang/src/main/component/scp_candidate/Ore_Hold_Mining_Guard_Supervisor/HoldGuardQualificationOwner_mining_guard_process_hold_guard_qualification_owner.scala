// #Sireum

package scp_candidate.Ore_Hold_Mining_Guard_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner {

  def initialise(api: HoldGuardQualificationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_HOLD_ASSESSMENT_SAFE
        api.hold_assessment == HoldAssessment.InvalidHold
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_hold_assessment(Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.InvalidHold)
  }

  def timeTriggered(api: HoldGuardQualificationOwner_Operational_Api): Unit = { }

  def finalise(api: HoldGuardQualificationOwner_Operational_Api): Unit = { }
}
