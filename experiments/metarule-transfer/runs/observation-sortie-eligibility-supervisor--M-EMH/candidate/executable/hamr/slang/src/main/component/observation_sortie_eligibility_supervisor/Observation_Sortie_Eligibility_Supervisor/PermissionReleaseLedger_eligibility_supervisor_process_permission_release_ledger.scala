// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger {

  def initialise(api: PermissionReleaseLedger_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_release_feedback(Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.NotReleased)
    api.put_sortie_directive(Observation_Sortie_Eligibility_Supervisor.SortieDirective.Withhold)
  }

  def timeTriggered(api: PermissionReleaseLedger_Operational_Api): Unit = {
    // example api usage

    val apiUsage_eligibility_decision: Option[Observation_Sortie_Eligibility_Supervisor.EligibilityDecision] = api.get_eligibility_decision()
    api.logInfo(s"Received on data port eligibility_decision: ${apiUsage_eligibility_decision}")
    val apiUsage_request_phase: Option[Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type] = api.get_request_phase()
    api.logInfo(s"Received on data port request_phase: ${apiUsage_request_phase}")
  }

  def finalise(api: PermissionReleaseLedger_Operational_Api): Unit = { }
}
