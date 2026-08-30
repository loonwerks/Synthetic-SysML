// #Sireum

package scp_candidate.Cabin_Air_Quality_Humidity_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityProposalOwner_cabin_air_supervision_process_humidity_proposal_owner {

  def initialise(api: HumidityProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_proposal(Cabin_Air_Quality_Humidity_Supervisor.HumidityProposalReport.example())
  }

  def timeTriggered(api: HumidityProposalOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
  }

  def finalise(api: HumidityProposalOwner_Operational_Api): Unit = { }
}
