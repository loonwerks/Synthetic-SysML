// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object OrderLifecycle_coordinator_process_order_lifecycle {

  // BEGIN STATE VARS
  var retained_order: Factory_Dispatch_Coordinator.OrderState.Type = Factory_Dispatch_Coordinator.OrderState.IDLE
  // END STATE VARS

  def initialise(api: OrderLifecycle_Initialization_Api): Unit = {
    Contract(
      Modifies(api, retained_order),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_ORDER_IDLE
        retained_order == OrderState.IDLE &&
          api.prior_order_state == OrderState.IDLE &&
          api.order_state == OrderState.IDLE
        // END INITIALIZES ENSURES
      )
    )
    retained_order = OrderState.IDLE
    api.put_prior_order_state(OrderState.IDLE)
    api.put_order_state(OrderState.IDLE)
  }

  def timeTriggered(api: OrderLifecycle_Operational_Api): Unit = {
    Contract(Modifies(api, retained_order))
    val prior: OrderState.Type = retained_order
    val outcome: QualifiedOutcome.Type = api.get_qualified_outcome().get
    val gate: RecoveryGate.Type = api.get_recovery_gate().get
    api.put_prior_order_state(prior)
    if (gate == RecoveryGate.OPEN) {
      if (outcome == QualifiedOutcome.QUOTE_ACCEPTED ||
          outcome == QualifiedOutcome.MATERIAL_CONFIRMED ||
          outcome == QualifiedOutcome.PRODUCTION_COMPLETED) {
        retained_order = OrderState.OPEN
      } else if (outcome == QualifiedOutcome.DISPATCH_COMPLETED) {
        retained_order = OrderState.IDLE
      }
    }
    api.put_order_state(retained_order)
  }

  def finalise(api: OrderLifecycle_Operational_Api): Unit = { }
}
