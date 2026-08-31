// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger {
  var releaseMemory: Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type =
    Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.NotReleased

  def initialise(api: PermissionReleaseLedger_Initialization_Api): Unit = {
    Contract(Modifies(api, releaseMemory))
    releaseMemory = Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.NotReleased
    api.put_release_feedback(Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.NotReleased)
    api.put_sortie_directive(Observation_Sortie_Eligibility_Supervisor.SortieDirective.Withhold)
  }

  def timeTriggered(api: PermissionReleaseLedger_Operational_Api): Unit = {
    Contract(Modifies(api, releaseMemory))
    val decision: Observation_Sortie_Eligibility_Supervisor.EligibilityDecision = api.get_eligibility_decision().get
    val request: Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type = api.get_request_phase().get
    val previous: Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type = releaseMemory
    val release: B = request == Observation_Sortie_Eligibility_Supervisor.RequestPhase.Pending &&
      decision.directive == Observation_Sortie_Eligibility_Supervisor.SortieDirective.Permit &&
      previous == Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.NotReleased
    if (release) {
      api.put_sortie_directive(Observation_Sortie_Eligibility_Supervisor.SortieDirective.Permit)
      api.put_release_feedback(Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Released)
    } else {
      api.put_sortie_directive(Observation_Sortie_Eligibility_Supervisor.SortieDirective.Withhold)
      api.put_release_feedback(Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.NotReleased)
    }
    if (request == Observation_Sortie_Eligibility_Supervisor.RequestPhase.Idle) {
      releaseMemory = Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.NotReleased
    } else if (release) {
      releaseMemory = Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Released
    } else {
      releaseMemory = previous
    }
  }

  def finalise(api: PermissionReleaseLedger_Operational_Api): Unit = { }
}
