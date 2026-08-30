// #Sireum

package scp_candidate.Ore_Hold_Mining_Guard_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner {

  def initialise(api: MiningSupportQualificationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_SUPPORT_ASSESSMENT_SAFE
        api.support_assessment == SupportAssessment.InvalidSupport
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_support_assessment(Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.InvalidSupport)
  }

  def timeTriggered(api: MiningSupportQualificationOwner_Operational_Api): Unit = { }

  def finalise(api: MiningSupportQualificationOwner_Operational_Api): Unit = { }
}
