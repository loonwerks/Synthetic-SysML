// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object OutcomeQualification_coordinator_process_outcome_qualification {

  def initialise(api: OutcomeQualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_outcome(Factory_Dispatch_Coordinator.QualifiedOutcome.NO_PROGRESS)
  }

  def timeTriggered(api: OutcomeQualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_outcome_boundary_facts: Option[Factory_Dispatch_Coordinator.OutcomeBoundaryFacts] = api.get_outcome_boundary_facts()
    api.logInfo(s"Received on data port outcome_boundary_facts: ${apiUsage_outcome_boundary_facts}")
    val apiUsage_prior_order_state: Option[Factory_Dispatch_Coordinator.OrderState.Type] = api.get_prior_order_state()
    api.logInfo(s"Received on data port prior_order_state: ${apiUsage_prior_order_state}")
  }

  def finalise(api: OutcomeQualification_Operational_Api): Unit = { }
}
