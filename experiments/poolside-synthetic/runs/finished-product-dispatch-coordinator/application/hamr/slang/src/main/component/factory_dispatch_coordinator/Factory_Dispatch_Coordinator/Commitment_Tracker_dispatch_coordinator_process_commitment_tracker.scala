// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Commitment_Tracker_dispatch_coordinator_process_commitment_tracker {

  // BEGIN STATE VARS
  var lifecycle: Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type = Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Idle

  var active_request_id: Factory_Dispatch_Coordinator.Request_Id.Type = Factory_Dispatch_Coordinator.Request_Id.None

  var active_product_id: Factory_Dispatch_Coordinator.Product_Id.Type = Factory_Dispatch_Coordinator.Product_Id.None

  var active_amount: Factory_Dispatch_Coordinator.Dispatch_Amount.Type = Factory_Dispatch_Coordinator.Dispatch_Amount.A0

  var active_attempt: Factory_Dispatch_Coordinator.Dispatch_Attempt.Type = Factory_Dispatch_Coordinator.Dispatch_Attempt.FreshAttempt

  var shipment_instruction_kind: Factory_Dispatch_Coordinator.Instruction_Kind.Type = Factory_Dispatch_Coordinator.Instruction_Kind.NoInstruction

  var shipment_instruction_request_id: Factory_Dispatch_Coordinator.Request_Id.Type = Factory_Dispatch_Coordinator.Request_Id.None

  var shipment_instruction_product_id: Factory_Dispatch_Coordinator.Product_Id.Type = Factory_Dispatch_Coordinator.Product_Id.None

  var shipment_instruction_amount: Factory_Dispatch_Coordinator.Dispatch_Amount.Type = Factory_Dispatch_Coordinator.Dispatch_Amount.A0
  // END STATE VARS

  def initialise(api: Commitment_Tracker_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_execution_context(Factory_Dispatch_Coordinator.Active_Execution_Context.example())
    api.put_recovery_context(Factory_Dispatch_Coordinator.Recovery_Qualification_Context.example())
    api.put_shipment_instruction(Factory_Dispatch_Coordinator.Shipment_Instruction.example())
    api.put_lifecycle_snapshot(Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Idle)
  }

  def timeTriggered(api: Commitment_Tracker_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PRESTATE_EXECUTION_CONTEXT
        //   prestate execution context
        api.execution_context.lifecycle == lifecycle &
          api.execution_context.active_request_id == Context_Request_Id.None &
          api.execution_context.active_attempt == Context_Attempt.FreshAttempt,
        // guarantee PRESTATE_RECOVERY_CONTEXT
        //   prestate recovery context
        api.recovery_context.lifecycle == lifecycle &
          api.recovery_context.stored_request_id == Capacity_Request_Id.None &
          api.recovery_context.stored_product_id == Capacity_Product_Id.None &
          api.recovery_context.stored_amount == Capacity_Amount.A0,
        // guarantee POSTSTATE_LIFECYCLE_PUBLICATION
        //   publish lifecycle snapshot
        api.lifecycle_snapshot == lifecycle,
        // case TRACK_FRESH_RELEASE
        (In(lifecycle) == Dispatch_Lifecycle.Idle &
          api.dispatch_decision.kind == Dispatch_Decision_Kind.ReleaseFresh) ___>: (lifecycle == Dispatch_Lifecycle.ActiveFresh &
          active_request_id == api.dispatch_decision.request_id &
          active_product_id == api.dispatch_decision.product_id &
          active_amount == api.dispatch_decision.amount &
          active_attempt == Dispatch_Attempt.FreshAttempt &
          api.shipment_instruction.kind == Instruction_Kind.ReleaseFresh &
          api.shipment_instruction.request_id == api.dispatch_decision.request_id &
          api.shipment_instruction.product_id == api.dispatch_decision.product_id &
          api.shipment_instruction.amount == api.dispatch_decision.amount),
        // case TRACK_COMPLETION
        ((In(lifecycle) == Dispatch_Lifecycle.ActiveFresh |
          In(lifecycle) == Dispatch_Lifecycle.ActiveRetry) &
          api.outcome_plan == Outcome_Plan.Completed) ___>: (lifecycle == Dispatch_Lifecycle.TerminalCompleted &
          active_request_id == In(active_request_id) &
          active_product_id == In(active_product_id) &
          active_amount == In(active_amount) &
          active_attempt == In(active_attempt) &
          api.shipment_instruction.kind == Instruction_Kind.NoInstruction &
          api.shipment_instruction.request_id == Request_Id.None &
          api.shipment_instruction.product_id == Product_Id.None &
          api.shipment_instruction.amount == Dispatch_Amount.A0),
        // case TRACK_FIRST_FAILURE
        (In(lifecycle) == Dispatch_Lifecycle.ActiveFresh &
          api.outcome_plan == Outcome_Plan.RetryEligible) ___>: (lifecycle == Dispatch_Lifecycle.RecoveryPending &
          active_request_id == In(active_request_id) &
          active_product_id == In(active_product_id) &
          active_amount == In(active_amount) &
          active_attempt == Dispatch_Attempt.FreshAttempt &
          api.shipment_instruction.kind == Instruction_Kind.NoInstruction &
          api.shipment_instruction.request_id == Request_Id.None &
          api.shipment_instruction.product_id == Product_Id.None &
          api.shipment_instruction.amount == Dispatch_Amount.A0),
        // case TRACK_RETRY_RELEASE
        (In(lifecycle) == Dispatch_Lifecycle.RecoveryPending &
          api.dispatch_decision.kind == Dispatch_Decision_Kind.ReleaseRetry) ___>: (lifecycle == Dispatch_Lifecycle.ActiveRetry &
          active_request_id == In(active_request_id) &
          active_product_id == In(active_product_id) &
          active_amount == In(active_amount) &
          active_attempt == Dispatch_Attempt.RetryAttempt &
          api.shipment_instruction.kind == Instruction_Kind.ReleaseRetry &
          api.shipment_instruction.request_id == In(active_request_id) &
          api.shipment_instruction.product_id == In(active_product_id) &
          api.shipment_instruction.amount == In(active_amount)),
        // case TRACK_RETRY_ABORT
        (In(lifecycle) == Dispatch_Lifecycle.ActiveRetry &
          api.outcome_plan == Outcome_Plan.Abort) ___>: (lifecycle == Dispatch_Lifecycle.TerminalFailed &
          active_request_id == In(active_request_id) &
          active_product_id == In(active_product_id) &
          active_amount == In(active_amount) &
          active_attempt == Dispatch_Attempt.RetryAttempt &
          api.shipment_instruction.kind == Instruction_Kind.Cancel &
          api.shipment_instruction.request_id == In(active_request_id) &
          api.shipment_instruction.product_id == In(active_product_id) &
          api.shipment_instruction.amount == In(active_amount)),
        // case TRACK_ACTIVE_PRESERVATION
        ((In(lifecycle) == Dispatch_Lifecycle.ActiveFresh |
          In(lifecycle) == Dispatch_Lifecycle.ActiveRetry) &
          api.outcome_plan == Outcome_Plan.Preserve) ___>: (lifecycle == In(lifecycle) &
          active_request_id == In(active_request_id) &
          active_product_id == In(active_product_id) &
          active_amount == In(active_amount) &
          active_attempt == In(active_attempt) &
          api.shipment_instruction.kind == Instruction_Kind.NoInstruction &
          api.shipment_instruction.request_id == Request_Id.None &
          api.shipment_instruction.product_id == Product_Id.None &
          api.shipment_instruction.amount == Dispatch_Amount.A0),
        // case TRACK_WAIT_INVENTORY
        ((In(lifecycle) == Dispatch_Lifecycle.Idle |
          In(lifecycle) == Dispatch_Lifecycle.RecoveryPending) &
          api.dispatch_decision.kind == Dispatch_Decision_Kind.WaitInventory) ___>: (lifecycle == In(lifecycle) &
          active_request_id == In(active_request_id) &
          active_product_id == In(active_product_id) &
          active_amount == In(active_amount) &
          active_attempt == In(active_attempt) &
          api.shipment_instruction.kind == Instruction_Kind.NoInstruction &
          api.shipment_instruction.request_id == Request_Id.None &
          api.shipment_instruction.product_id == Product_Id.None &
          api.shipment_instruction.amount == Dispatch_Amount.A0),
        // case TRACK_WAIT_DOCK
        ((In(lifecycle) == Dispatch_Lifecycle.Idle |
          In(lifecycle) == Dispatch_Lifecycle.RecoveryPending) &
          api.dispatch_decision.kind == Dispatch_Decision_Kind.WaitDock) ___>: (lifecycle == In(lifecycle) &
          active_request_id == In(active_request_id) &
          active_product_id == In(active_product_id) &
          active_amount == In(active_amount) &
          active_attempt == In(active_attempt) &
          api.shipment_instruction.kind == Instruction_Kind.NoInstruction &
          api.shipment_instruction.request_id == Request_Id.None &
          api.shipment_instruction.product_id == Product_Id.None &
          api.shipment_instruction.amount == Dispatch_Amount.A0),
        // case TRACK_IDLE
        (In(lifecycle) == Dispatch_Lifecycle.Idle &
          api.dispatch_decision.kind != Dispatch_Decision_Kind.ReleaseFresh &
          api.dispatch_decision.kind != Dispatch_Decision_Kind.WaitInventory &
          api.dispatch_decision.kind != Dispatch_Decision_Kind.WaitDock) ___>: (lifecycle == Dispatch_Lifecycle.Idle &
          active_request_id == Request_Id.None &
          active_product_id == Product_Id.None &
          active_amount == Dispatch_Amount.A0 &
          active_attempt == Dispatch_Attempt.FreshAttempt &
          api.shipment_instruction.kind == Instruction_Kind.NoInstruction &
          api.shipment_instruction.request_id == Request_Id.None &
          api.shipment_instruction.product_id == Product_Id.None &
          api.shipment_instruction.amount == Dispatch_Amount.A0),
        // case TRACK_TERMINAL_RESET
        ((In(lifecycle) == Dispatch_Lifecycle.TerminalCompleted |
          In(lifecycle) == Dispatch_Lifecycle.TerminalFailed) &
          api.dispatch_decision.kind == Dispatch_Decision_Kind.ResetIdle) ___>: (lifecycle == Dispatch_Lifecycle.Idle &
          active_request_id == Request_Id.None &
          active_product_id == Product_Id.None &
          active_amount == Dispatch_Amount.A0 &
          active_attempt == Dispatch_Attempt.FreshAttempt &
          api.shipment_instruction.kind == Instruction_Kind.NoInstruction &
          api.shipment_instruction.request_id == Request_Id.None &
          api.shipment_instruction.product_id == Product_Id.None &
          api.shipment_instruction.amount == Dispatch_Amount.A0)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_outcome_plan: Option[Factory_Dispatch_Coordinator.Outcome_Plan.Type] = api.get_outcome_plan()
    api.logInfo(s"Received on data port outcome_plan: ${apiUsage_outcome_plan}")
    val apiUsage_dispatch_decision: Option[Factory_Dispatch_Coordinator.Dispatch_Decision] = api.get_dispatch_decision()
    api.logInfo(s"Received on data port dispatch_decision: ${apiUsage_dispatch_decision}")
  }

  def finalise(api: Commitment_Tracker_Operational_Api): Unit = { }
}
