// #Sireum

package scp_candidate.Factory_Material_Continuity_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility {

  def initialise(api: UrgentReleaseEligibility_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_proposal(Factory_Material_Continuity_Coordinator.ProposalState.NotProposed)
  }

  def timeTriggered(api: UrgentReleaseEligibility_Operational_Api): Unit = { }

  def finalise(api: UrgentReleaseEligibility_Operational_Api): Unit = { }
}
