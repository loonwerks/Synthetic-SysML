// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger {
  var releaseMemory: ReleaseFeedback.Type = ReleaseFeedback.NotReleased

  def initialise(api: PermissionReleaseLedger_Initialization_Api): Unit = {
    Contract(Modifies(api, releaseMemory))
    releaseMemory = ReleaseFeedback.NotReleased
    api.put_release_feedback(ReleaseFeedback.NotReleased)
    api.put_sortie_directive(SortieDirective.Withhold)
  }

  def timeTriggered(api: PermissionReleaseLedger_Operational_Api): Unit = {
    Contract(Modifies(api, releaseMemory))
    val decision: EligibilityDecision = api.get_eligibility_decision() match {
      case Some(value) => value
      case _ => EligibilityDecision(SortieDirective.Withhold, EligibilityReason.Recovery)
    }
    val phase: RequestPhase.Type = api.get_request_phase() match {
      case Some(value) => value
      case _ => RequestPhase.Idle
    }
    val release: B = phase == RequestPhase.Pending &&
      decision.directive == SortieDirective.Permit &&
      releaseMemory == ReleaseFeedback.NotReleased
    if (release) {
      api.put_sortie_directive(SortieDirective.Permit)
      api.put_release_feedback(ReleaseFeedback.Released)
    } else {
      api.put_sortie_directive(SortieDirective.Withhold)
      api.put_release_feedback(ReleaseFeedback.NotReleased)
    }
    if (phase == RequestPhase.Idle) {
      releaseMemory = ReleaseFeedback.NotReleased
    } else if (release) {
      releaseMemory = ReleaseFeedback.Released
    }
  }

  def finalise(api: PermissionReleaseLedger_Operational_Api): Unit = { }
}
