// #Sireum

package scp_candidate.Ore_Hold_Mining_Guard_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RequestFreshnessPriorityOwner_mining_guard_process_request_freshness_priority_owner {

  // BEGIN STATE VARS
  var previousStart: Base_Types.Boolean = Base_Types.Boolean_example()

  var previousHalt: Base_Types.Boolean = Base_Types.Boolean_example()

  var previousResume: Base_Types.Boolean = Base_Types.Boolean_example()
  // END STATE VARS

  def initialise(api: RequestFreshnessPriorityOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(previousStart, previousHalt, previousResume, api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_REQUEST_OWNER_SAFE
        previousStart == F &
          previousHalt == F &
          previousResume == F &
          api.request_assessment.disposition == RequestDisposition.InvalidRequest &
          api.request_assessment.conflict == F
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    previousStart = F
    previousHalt = F
    previousResume = F
    api.put_request_assessment(Ore_Hold_Mining_Guard_Supervisor.RequestAssessment(RequestDisposition.InvalidRequest, F))
  }

  def timeTriggered(api: RequestFreshnessPriorityOwner_Operational_Api): Unit = { }

  def finalise(api: RequestFreshnessPriorityOwner_Operational_Api): Unit = { }
}
