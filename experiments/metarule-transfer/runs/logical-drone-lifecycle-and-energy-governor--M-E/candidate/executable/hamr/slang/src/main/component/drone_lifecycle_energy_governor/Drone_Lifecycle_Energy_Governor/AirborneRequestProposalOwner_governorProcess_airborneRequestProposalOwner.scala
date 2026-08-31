// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner {

  def initialise(api: AirborneRequestProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_proposalOut(Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.NO_AIRBORNE_REQUEST)
  }

  def timeTriggered(api: AirborneRequestProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee AIRBORNE_REQUEST_CLASSIFICATION
        api.semanticsIn.intentCode == ExactRequestCode.RETURN &
          api.proposalOut == AirborneRequestProposal.RETURN_REQUESTED |
          api.semanticsIn.intentCode == ExactRequestCode.LAND &
            api.proposalOut == AirborneRequestProposal.LAND_REQUESTED |
          api.semanticsIn.intentCode != ExactRequestCode.RETURN &
            api.semanticsIn.intentCode != ExactRequestCode.LAND &
            api.proposalOut == AirborneRequestProposal.NO_AIRBORNE_REQUEST
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_semanticsIn() match {
      case Some(semantics) =>
        api.put_proposalOut(
          if (semantics.intentCode == ExactRequestCode.RETURN)
            AirborneRequestProposal.RETURN_REQUESTED
          else if (semantics.intentCode == ExactRequestCode.LAND)
            AirborneRequestProposal.LAND_REQUESTED
          else AirborneRequestProposal.NO_AIRBORNE_REQUEST)
      case _ => api.put_proposalOut(AirborneRequestProposal.NO_AIRBORNE_REQUEST)
    }
  }

  def finalise(api: AirborneRequestProposalOwner_Operational_Api): Unit = { }
}
