// #Sireum

package scp_candidate.Station_Cargo_Transfer_Verification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PriorityArbiter_supervisorProcess_priorityArbiter {

  def initialise(api: PriorityArbiter_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee ARBITER_INITIAL
        api.admittedDirective == AdmittedDirective.Hold
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_admittedDirective(Station_Cargo_Transfer_Verification_Supervisor.AdmittedDirective.Hold)
  }

  def timeTriggered(api: PriorityArbiter_Operational_Api): Unit = { }
  def finalise(api: PriorityArbiter_Operational_Api): Unit = { }
}
