// #Sireum

package scp_candidate.Docked_Service_Access_Lifecycle_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PriorityArbiter_supervisorProcess_priorityArbiter {

  def initialise(api: PriorityArbiter_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee ARBITER_INITIAL_SAFE
        api.admittedDirective == AdmittedDirective.HOLD_STABLE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_admittedDirective(Docked_Service_Access_Lifecycle_Supervisor.AdmittedDirective.HOLD_STABLE)
  }

  def timeTriggered(api: PriorityArbiter_Operational_Api): Unit = {
    Contract(Modifies(api))
    val directive: AdmittedDirective.Type = AdmittedDirective.ENTER_RECOVERY_FAULT
    api.put_admittedDirective(directive)
  }

  def finalise(api: PriorityArbiter_Operational_Api): Unit = { }
}
