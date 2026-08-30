// #Sireum

package scp_candidate.Drone_Lifecycle_Energy_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner {

  def initialise(api: AirborneRequestProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_proposalOut(Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.NO_AIRBORNE_REQUEST)
  }

  def timeTriggered(api: AirborneRequestProposalOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_semanticsIn() match {
      case Some(semantics) =>
        val proposal: Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.Type = if (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.RETURN) {
          Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.RETURN_REQUESTED
        } else if (semantics.intentCode == Drone_Lifecycle_Energy_Governor.ExactRequestCode.LAND) {
          Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.LAND_REQUESTED
        } else {
          Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.NO_AIRBORNE_REQUEST
        }
        api.put_proposalOut(proposal)
    }
  }

  def finalise(api: AirborneRequestProposalOwner_Operational_Api): Unit = { }
}
