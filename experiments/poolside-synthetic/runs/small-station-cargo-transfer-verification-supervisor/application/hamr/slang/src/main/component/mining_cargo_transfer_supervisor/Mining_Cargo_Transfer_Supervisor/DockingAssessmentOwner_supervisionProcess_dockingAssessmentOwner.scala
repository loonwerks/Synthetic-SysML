// #Sireum

package mining_cargo_transfer_supervisor.Mining_Cargo_Transfer_Supervisor

import org.sireum._
import mining_cargo_transfer_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object DockingAssessmentOwner_supervisionProcess_dockingAssessmentOwner {

  def initialise(api: DockingAssessmentOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_dockingAssessment(Mining_Cargo_Transfer_Supervisor.DockingAssessment.InvalidDocking)
  }

  def timeTriggered(api: DockingAssessmentOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_dockingSample: Option[Mining_Cargo_Transfer_Supervisor.DockingSample] = api.get_dockingSample()
    api.logInfo(s"Received on data port dockingSample: ${apiUsage_dockingSample}")
  }

  def finalise(api: DockingAssessmentOwner_Operational_Api): Unit = { }
}
