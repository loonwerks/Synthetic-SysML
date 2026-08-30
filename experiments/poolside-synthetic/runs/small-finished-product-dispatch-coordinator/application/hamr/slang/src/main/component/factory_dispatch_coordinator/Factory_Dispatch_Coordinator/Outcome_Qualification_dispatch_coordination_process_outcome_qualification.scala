// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Outcome_Qualification_dispatch_coordination_process_outcome_qualification {

  def initialise(api: Outcome_Qualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INITIAL_OUTCOME_INVALID
        api.qualified_outcome == Qualified_Outcome.Invalid_Outcome
      )
    )

    api.put_qualified_outcome(Factory_Dispatch_Coordinator.Qualified_Outcome.Invalid_Outcome)
  }

  def timeTriggered(api: Outcome_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case OUTCOME_INVALID
        //   qualified outcome is invalid when raw outcome status is invalid
        (api.raw_outcome.status == Input_Status.Invalid) ___>: (api.qualified_outcome == Qualified_Outcome.Invalid_Outcome),
        // case OUTCOME_NEUTRAL
        //   qualified outcome is no qualified report when raw outcome is valid and no report
        (api.raw_outcome.status == Input_Status.Valid &
          api.raw_outcome.outcome == Dispatch_Outcome.No_Report) ___>: (api.qualified_outcome == Qualified_Outcome.No_Qualified_Report),
        // case OUTCOME_ACCEPTED
        //   qualified outcome is qualified shipment accepted when raw outcome is valid and accepted
        (api.raw_outcome.status == Input_Status.Valid &
          api.raw_outcome.outcome == Dispatch_Outcome.Shipment_Accepted) ___>: (api.qualified_outcome == Qualified_Outcome.Qualified_Shipment_Accepted)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val raw = api.get_raw_outcome().get
    val qualified: Qualified_Outcome.Type =
      if (raw.status == Input_Status.Invalid) {
        Qualified_Outcome.Invalid_Outcome
      } else if (raw.outcome == Dispatch_Outcome.No_Report) {
        Qualified_Outcome.No_Qualified_Report
      } else {
        Qualified_Outcome.Qualified_Shipment_Accepted
      }
    api.put_qualified_outcome(qualified)
  }

  def finalise(api: Outcome_Qualification_Operational_Api): Unit = { }
}
