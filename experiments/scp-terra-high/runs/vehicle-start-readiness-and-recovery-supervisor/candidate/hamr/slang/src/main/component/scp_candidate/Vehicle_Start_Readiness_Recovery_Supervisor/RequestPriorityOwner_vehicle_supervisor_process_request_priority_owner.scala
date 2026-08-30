// #Sireum

package scp_candidate.Vehicle_Start_Readiness_Recovery_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner {

  // BEGIN STATE VARS
  var previousStart: Base_Types.Boolean = Base_Types.Boolean_example()

  var previousOff: Base_Types.Boolean = Base_Types.Boolean_example()

  var previousReturn: Base_Types.Boolean = Base_Types.Boolean_example()
  // END STATE VARS

  def initialise(api: RequestPriorityOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(previousStart, previousOff, previousReturn, api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee c1
        !previousStart && !previousOff &&
          !previousReturn &&
          !(api.request_to_authorization.offActive) &&
          !(api.request_to_authorization.freshReturn) &&
          !(api.request_to_authorization.freshStart) &&
          !(api.request_to_authorization.conflict) &&
          api.request_to_authorization.disposition == RequestDisposition.None &&
          !(api.request_to_lifecycle.offActive) &&
          !(api.request_to_lifecycle.freshReturn) &&
          !(api.request_to_lifecycle.freshStart) &&
          !(api.request_to_lifecycle.conflict) &&
          api.request_to_lifecycle.disposition == RequestDisposition.None
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    previousStart = F
    previousOff = F
    previousReturn = F
    val facts = RequestFacts(F, F, F, F, RequestDisposition.None)
    api.put_request_to_authorization(facts)
    api.put_request_to_lifecycle(facts)
  }

  def timeTriggered(api: RequestPriorityOwner_Operational_Api): Unit = {
    Contract(Modifies(previousStart, previousOff, previousReturn, api))
    api.get_request_levels() match {
      case Some(levels) =>
        val freshReturn = levels.returnLevel && !previousReturn
        val freshStart = levels.start && !previousStart
        val conflict = (levels.off && freshReturn) ||
          (levels.off && freshStart) || (freshReturn && freshStart)
        var disposition: RequestDisposition.Type = RequestDisposition.None
        if (levels.off) {
          disposition = RequestDisposition.OffDominant
        } else if (freshReturn) {
          disposition = RequestDisposition.ReturnCandidate
        } else if (freshStart) {
          disposition = RequestDisposition.StartCandidate
        }
        val facts = RequestFacts(levels.off, freshReturn, freshStart, conflict, disposition)
        previousStart = levels.start
        previousOff = levels.off
        previousReturn = levels.returnLevel
        api.put_request_to_authorization(facts)
        api.put_request_to_lifecycle(facts)
    }
  }

  def finalise(api: RequestPriorityOwner_Operational_Api): Unit = { }
}
