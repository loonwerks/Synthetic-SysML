// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ExecutionOutcomeAcquisition_coordinator_process_execution_outcome_acquisition {

  def initialise(api: ExecutionOutcomeAcquisition_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_OUTCOME_BOUNDARY
        api.outcome_boundary_facts.execution_outcome == ExecutionOutcome.NONE &&
          api.outcome_boundary_facts.event_class == OutcomeEventClass.NO_EVENT
        // END INITIALIZES ENSURES
      )
    )
    api.put_outcome_boundary_facts(Factory_Dispatch_Coordinator.OutcomeBoundaryFacts(
      ExecutionOutcome.NONE, OutcomeEventClass.NO_EVENT))
  }

  def timeTriggered(api: ExecutionOutcomeAcquisition_Operational_Api): Unit = {
    Contract(Modifies(api))
    val outcome: ExecutionOutcome.Type = api.get_execution_outcome().get
    val eventClass: OutcomeEventClass.Type =
      if (outcome == ExecutionOutcome.NONE) { OutcomeEventClass.NO_EVENT }
      else if (outcome == ExecutionOutcome.FAILED) { OutcomeEventClass.FAILURE }
      else { OutcomeEventClass.SUCCESS }
    api.put_outcome_boundary_facts(Factory_Dispatch_Coordinator.OutcomeBoundaryFacts(outcome, eventClass))
  }

  def finalise(api: ExecutionOutcomeAcquisition_Operational_Api): Unit = { }
}
