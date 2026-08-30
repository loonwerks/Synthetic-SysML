// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration {

  def initialise(api: TransferActionArbitration_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_transfer_decision(Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision(
      Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.HOLD,
      Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.NO_ELIGIBLE_ACTION,
      Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.NONE,
      Mining_Cargo_Transfer_Evidence_Coordinator.DecisionOutcomeValue.NONE))
  }

  def timeTriggered(api: TransferActionArbitration_Operational_Api): Unit = { }
  def finalise(api: TransferActionArbitration_Operational_Api): Unit = { }
}
