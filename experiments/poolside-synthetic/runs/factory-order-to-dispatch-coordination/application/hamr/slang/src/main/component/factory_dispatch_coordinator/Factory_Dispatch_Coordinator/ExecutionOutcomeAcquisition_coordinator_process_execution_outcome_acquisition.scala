// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition {

  def initialise(api: ExecutionOutcomeAcquisition_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_outcome_boundary_facts(Factory_Dispatch_Coordinator.OutcomeBoundaryFacts.example())
  }

  def timeTriggered(api: ExecutionOutcomeAcquisition_Operational_Api): Unit = {
    // example api usage

    val apiUsage_execution_outcome: Option[Factory_Dispatch_Coordinator.ExecutionOutcome.Type] = api.get_execution_outcome()
    api.logInfo(s"Received on data port execution_outcome: ${apiUsage_execution_outcome}")
  }

  def finalise(api: ExecutionOutcomeAcquisition_Operational_Api): Unit = { }
}
