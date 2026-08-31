// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger {

  // BEGIN STATE VARS
  var releaseMemory: Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type = Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.NotReleased
  // END STATE VARS

  def initialise(api: PermissionReleaseLedger_Initialization_Api): Unit = {
    Contract(Modifies(api, releaseMemory))
    releaseMemory = ReleaseFeedback.NotReleased
    api.put_release_feedback(ReleaseFeedback.NotReleased)
    api.put_sortie_directive(SortieDirective.Withhold)
  }

  def timeTriggered(api: PermissionReleaseLedger_Operational_Api): Unit = {
    Contract(
      Modifies(api, releaseMemory),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case ONE_SHOT_RELEASE_OUTPUT
        (api.request_phase == RequestPhase.Pending &
          api.eligibility_decision.directive == SortieDirective.Permit &
          In(releaseMemory) == ReleaseFeedback.NotReleased) ___>: (api.sortie_directive == SortieDirective.Permit &
          api.release_feedback == ReleaseFeedback.Released &
          releaseMemory == ReleaseFeedback.Released),
        // case RELEASE_WITHHELD
        (api.request_phase != RequestPhase.Pending |
          api.eligibility_decision.directive != SortieDirective.Permit |
          In(releaseMemory) == ReleaseFeedback.Released) ___>: (api.sortie_directive == SortieDirective.Withhold &
          api.release_feedback == ReleaseFeedback.NotReleased),
        // case RELEASE_RESET
        (api.request_phase == RequestPhase.Idle) ___>: (releaseMemory == ReleaseFeedback.NotReleased)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val decision = api.get_eligibility_decision().get
    val request = api.get_request_phase().get
    if (request == RequestPhase.Pending & decision.directive == SortieDirective.Permit &
        releaseMemory == ReleaseFeedback.NotReleased) {
      releaseMemory = ReleaseFeedback.Released
      api.put_sortie_directive(SortieDirective.Permit)
      api.put_release_feedback(ReleaseFeedback.Released)
    } else {
      if (request == RequestPhase.Idle) {
        releaseMemory = ReleaseFeedback.NotReleased
      }
      api.put_sortie_directive(SortieDirective.Withhold)
      api.put_release_feedback(ReleaseFeedback.NotReleased)
    }
  }

  def finalise(api: PermissionReleaseLedger_Operational_Api): Unit = { }
}
