// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Outcome_Qualification_dispatch_coordination_process_outcome_qualification {

  def initialise(api: Outcome_Qualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_OUTCOME_INVALID
        api.qualified_outcome == Qualified_Outcome.Invalid_Outcome
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_outcome(Factory_Dispatch_Coordinator.Qualified_Outcome.Invalid_Outcome)
  }

  def timeTriggered(api: Outcome_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        Outcome_Qualification_dispatch_coordination_process_outcome_qualification_GumboX.compute_CEP_Post(
          api.raw_outcome, api.qualified_outcome)
      )
    )
    val sample: Dispatch_Outcome_Sample = api.get_raw_outcome().get
    val qualified: Qualified_Outcome.Type = sample.status match {
      case Input_Status.Invalid => Qualified_Outcome.Invalid_Outcome
      case Input_Status.Valid =>
        sample.outcome match {
          case Dispatch_Outcome.No_Report => Qualified_Outcome.No_Qualified_Report
          case Dispatch_Outcome.Shipment_Accepted => Qualified_Outcome.Qualified_Shipment_Accepted
        }
    }
    api.put_qualified_outcome(qualified)
  }

  def finalise(api: Outcome_Qualification_Operational_Api): Unit = { }
}
