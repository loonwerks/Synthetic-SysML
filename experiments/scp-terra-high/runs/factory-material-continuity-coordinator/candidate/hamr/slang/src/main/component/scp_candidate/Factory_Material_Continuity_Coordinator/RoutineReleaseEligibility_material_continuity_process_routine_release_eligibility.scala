// #Sireum

package scp_candidate.Factory_Material_Continuity_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility {

  def initialise(api: RoutineReleaseEligibility_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_proposal(Factory_Material_Continuity_Coordinator.ProposalState.NotProposed)
  }

  def timeTriggered(api: RoutineReleaseEligibility_Operational_Api): Unit = { }

  def finalise(api: RoutineReleaseEligibility_Operational_Api): Unit = { }
}
