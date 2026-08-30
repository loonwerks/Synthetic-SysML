// #Sireum

package scp_candidate.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger {

  def initialise(api: PermissionReleaseLedger_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_release_feedback(Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.NotReleased)
    api.put_sortie_directive(Observation_Sortie_Eligibility_Supervisor.SortieDirective.Withhold)
  }

  def timeTriggered(api: PermissionReleaseLedger_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_release_feedback(ReleaseFeedback.NotReleased)
    api.put_sortie_directive(SortieDirective.Withhold)
  }

  def finalise(api: PermissionReleaseLedger_Operational_Api): Unit = { }
}
