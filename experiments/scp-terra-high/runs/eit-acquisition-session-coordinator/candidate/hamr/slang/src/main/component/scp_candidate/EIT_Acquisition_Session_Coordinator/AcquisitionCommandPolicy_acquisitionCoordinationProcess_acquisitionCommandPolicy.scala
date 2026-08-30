// #Sireum

package scp_candidate.EIT_Acquisition_Session_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AcquisitionCommandPolicy_acquisitionCoordinationProcess_acquisitionCommandPolicy {

  def initialise(api: AcquisitionCommandPolicy_Initialization_Api): Unit = {
    Contract(Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INIT_ACQUISITION_COMMAND
        api.acquisitionCommand == AcquisitionCommand.DO_NOT_COLLECT
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_acquisitionCommand(EIT_Acquisition_Session_Coordinator.AcquisitionCommand.DO_NOT_COLLECT)
  }

  def timeTriggered(api: AcquisitionCommandPolicy_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_monitoringDecision() match {
      case Some(decision) =>
        api.put_acquisitionCommand(
          if (decision.nextState == MonitoringDecisionNextState.MONITORING_ACTIVE) AcquisitionCommand.COLLECT
          else AcquisitionCommand.DO_NOT_COLLECT)
    }
  }

  def finalise(api: AcquisitionCommandPolicy_Operational_Api): Unit = { }
}
