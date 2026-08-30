// #Sireum

package mining_cargo_transfer_evidence_coordinator.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import mining_cargo_transfer_evidence_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object DockContextAssessment_cargo_coordination_process_dock_context_assessment {

  def initialise(api: DockContextAssessment_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_dock_facts(Mining_Cargo_Transfer_Evidence_Coordinator.DockFacts.example())
  }

  def timeTriggered(api: DockContextAssessment_Operational_Api): Unit = {
    // example api usage

    val apiUsage_dock_context: Option[Mining_Cargo_Transfer_Evidence_Coordinator.DockContext.Type] = api.get_dock_context()
    api.logInfo(s"Received on data port dock_context: ${apiUsage_dock_context}")
  }

  def finalise(api: DockContextAssessment_Operational_Api): Unit = { }
}
