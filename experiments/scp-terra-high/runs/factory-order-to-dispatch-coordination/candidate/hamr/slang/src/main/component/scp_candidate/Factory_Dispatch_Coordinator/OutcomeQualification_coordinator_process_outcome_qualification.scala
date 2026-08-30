// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object OutcomeQualification_coordinator_process_outcome_qualification {

  def initialise(api: OutcomeQualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_QUALIFIED_OUTCOME
        api.qualified_outcome == QualifiedOutcome.NO_PROGRESS
        // END INITIALIZES ENSURES
      )
    )
    api.put_qualified_outcome(QualifiedOutcome.NO_PROGRESS)
  }

  def timeTriggered(api: OutcomeQualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    val boundary: Factory_Dispatch_Coordinator.OutcomeBoundaryFacts = api.get_outcome_boundary_facts().get
    val prior: OrderState.Type = api.get_prior_order_state().get
    val qualified: QualifiedOutcome.Type =
      if (boundary.event_class == OutcomeEventClass.NO_EVENT &&
          boundary.execution_outcome == ExecutionOutcome.NONE) { QualifiedOutcome.NO_PROGRESS }
      else if (boundary.event_class == OutcomeEventClass.FAILURE ||
          (boundary.execution_outcome == ExecutionOutcome.QUOTE_OK && prior != OrderState.IDLE) ||
          ((boundary.execution_outcome == ExecutionOutcome.MATERIAL_OK ||
            boundary.execution_outcome == ExecutionOutcome.PRODUCTION_OK ||
            boundary.execution_outcome == ExecutionOutcome.DISPATCH_OK) && prior != OrderState.OPEN))
        { QualifiedOutcome.FAULT }
      else if (boundary.execution_outcome == ExecutionOutcome.QUOTE_OK) { QualifiedOutcome.QUOTE_ACCEPTED }
      else if (boundary.execution_outcome == ExecutionOutcome.MATERIAL_OK) { QualifiedOutcome.MATERIAL_CONFIRMED }
      else if (boundary.execution_outcome == ExecutionOutcome.PRODUCTION_OK) { QualifiedOutcome.PRODUCTION_COMPLETED }
      else { QualifiedOutcome.DISPATCH_COMPLETED }
    api.put_qualified_outcome(qualified)
  }

  def finalise(api: OutcomeQualification_Operational_Api): Unit = { }
}
