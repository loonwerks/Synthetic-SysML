// #Sireum

package scp_candidate.Factory_Material_Continuity_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ReplenishmentEligibility_material_continuity_process_replenishment_eligibility {

  def initialise(api: ReplenishmentEligibility_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_proposal(Factory_Material_Continuity_Coordinator.ProposalState.NotProposed)
  }

  def timeTriggered(api: ReplenishmentEligibility_Operational_Api): Unit = { }

  def finalise(api: ReplenishmentEligibility_Operational_Api): Unit = { }
}
