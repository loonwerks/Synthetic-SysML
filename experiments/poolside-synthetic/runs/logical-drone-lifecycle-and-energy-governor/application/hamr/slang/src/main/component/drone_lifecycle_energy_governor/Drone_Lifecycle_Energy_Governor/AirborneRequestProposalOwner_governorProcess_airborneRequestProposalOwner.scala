// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object AirborneRequestProposalOwner_governorProcess_airborneRequestProposalOwner {

  def initialise(api: AirborneRequestProposalOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_proposalOut(Drone_Lifecycle_Energy_Governor.AirborneRequestProposal.NO_AIRBORNE_REQUEST)
  }

  def timeTriggered(api: AirborneRequestProposalOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_semanticsIn: Option[Drone_Lifecycle_Energy_Governor.AirborneClassifiedRequest] = api.get_semanticsIn()
    api.logInfo(s"Received on data port semanticsIn: ${apiUsage_semanticsIn}")
  }

  def finalise(api: AirborneRequestProposalOwner_Operational_Api): Unit = { }
}
