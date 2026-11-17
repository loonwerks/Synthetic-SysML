// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner {

  def initialise(api: AirborneRequestProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_proposalOut(AirborneRequestProposal.NO_AIRBORNE_REQUEST)
  }

  def timeTriggered(api: AirborneRequestProposalOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_semanticsIn() match {
      case Some(semantics) =>
        val proposal: AirborneRequestProposal.Type = semantics.intentCode match {
          case ExactRequestCode.RETURN => AirborneRequestProposal.RETURN_REQUESTED
          case ExactRequestCode.LAND => AirborneRequestProposal.LAND_REQUESTED
          case _ => AirborneRequestProposal.NO_AIRBORNE_REQUEST
        }
        api.put_proposalOut(proposal)
      case _ => api.put_proposalOut(AirborneRequestProposal.NO_AIRBORNE_REQUEST)
    }
  }

  def finalise(api: AirborneRequestProposalOwner_Operational_Api): Unit = { }
}
