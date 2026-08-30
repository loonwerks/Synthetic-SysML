// #Sireum

package equiv_shared_0.Factory_Dispatch_Coordinator

import org.sireum._
import equiv_shared_0._

object Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier {
  // BEGIN FUNCTIONS
  @strictpure def amount_at_least(available: Factory_Dispatch_Coordinator.Inventory_Amount.Type, required: Factory_Dispatch_Coordinator.Dispatch_Amount.Type): Base_Types.Boolean = required == Dispatch_Amount.A0 |
    required == Dispatch_Amount.A1 &
      available != Inventory_Amount.A0 |
    required == Dispatch_Amount.A2 &
      (available == Inventory_Amount.A2 |
        available == Inventory_Amount.A3 |
        available == Inventory_Amount.A4) |
    required == Dispatch_Amount.A3 &
      (available == Inventory_Amount.A3 |
        available == Inventory_Amount.A4) |
    required == Dispatch_Amount.A4 &
      available == Inventory_Amount.A4

  @strictpure def amount_below(available: Factory_Dispatch_Coordinator.Inventory_Amount.Type, required: Factory_Dispatch_Coordinator.Dispatch_Amount.Type): Base_Types.Boolean = required == Dispatch_Amount.A1 &
    available == Inventory_Amount.A0 |
    required == Dispatch_Amount.A2 &
      (available == Inventory_Amount.A0 |
        available == Inventory_Amount.A1) |
    required == Dispatch_Amount.A3 &
      (available == Inventory_Amount.A0 |
        available == Inventory_Amount.A1 |
        available == Inventory_Amount.A2) |
    required == Dispatch_Amount.A4 &
      available != Inventory_Amount.A4

  @strictpure def same_product(inventory_product: Factory_Dispatch_Coordinator.Inventory_Product_Id.Type, requested_product: Factory_Dispatch_Coordinator.Product_Id.Type): Base_Types.Boolean = inventory_product == Inventory_Product_Id.P1 &
    requested_product == Product_Id.P1 |
    inventory_product == Inventory_Product_Id.P2 &
      requested_product == Product_Id.P2 |
    inventory_product == Inventory_Product_Id.P3 &
      requested_product == Product_Id.P3 |
    inventory_product == Inventory_Product_Id.P4 &
      requested_product == Product_Id.P4

  @strictpure def recovery_amount_at_least(available: Factory_Dispatch_Coordinator.Inventory_Amount.Type, required: Factory_Dispatch_Coordinator.Capacity_Amount.Type): Base_Types.Boolean = required == Capacity_Amount.A0 |
    required == Capacity_Amount.A1 &
      available != Inventory_Amount.A0 |
    required == Capacity_Amount.A2 &
      (available == Inventory_Amount.A2 |
        available == Inventory_Amount.A3 |
        available == Inventory_Amount.A4) |
    required == Capacity_Amount.A3 &
      (available == Inventory_Amount.A3 |
        available == Inventory_Amount.A4) |
    required == Capacity_Amount.A4 &
      available == Inventory_Amount.A4

  @strictpure def recovery_amount_below(available: Factory_Dispatch_Coordinator.Inventory_Amount.Type, required: Factory_Dispatch_Coordinator.Capacity_Amount.Type): Base_Types.Boolean = required == Capacity_Amount.A1 &
    available == Inventory_Amount.A0 |
    required == Capacity_Amount.A2 &
      (available == Inventory_Amount.A0 |
        available == Inventory_Amount.A1) |
    required == Capacity_Amount.A3 &
      (available == Inventory_Amount.A0 |
        available == Inventory_Amount.A1 |
        available == Inventory_Amount.A2) |
    required == Capacity_Amount.A4 &
      available != Inventory_Amount.A4

  @strictpure def same_recovery_product(inventory_product: Factory_Dispatch_Coordinator.Inventory_Product_Id.Type, stored_product: Factory_Dispatch_Coordinator.Capacity_Product_Id.Type): Base_Types.Boolean = inventory_product == Inventory_Product_Id.P1 &
    stored_product == Capacity_Product_Id.P1 |
    inventory_product == Inventory_Product_Id.P2 &
      stored_product == Capacity_Product_Id.P2 |
    inventory_product == Inventory_Product_Id.P3 &
      stored_product == Capacity_Product_Id.P3 |
    inventory_product == Inventory_Product_Id.P4 &
      stored_product == Capacity_Product_Id.P4

  @strictpure def inventory_is_sufficient(snap: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot, fact: Factory_Dispatch_Coordinator.Qualified_Request_Fact): Base_Types.Boolean = snap.validity == Observation_Validity.Valid &
    fact.product_id != Product_Id.None &
    same_product(snap.pid, fact.product_id) &
    amount_at_least(snap.qty, fact.amount)

  @strictpure def inventory_is_insufficient(snap: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot, fact: Factory_Dispatch_Coordinator.Qualified_Request_Fact): Base_Types.Boolean = snap.validity == Observation_Validity.Valid &
    fact.product_id != Product_Id.None &
    same_product(snap.pid, fact.product_id) &
    amount_below(snap.qty, fact.amount)

  @strictpure def inventory_is_unknown(snap: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot, fact: Factory_Dispatch_Coordinator.Qualified_Request_Fact): Base_Types.Boolean = snap.validity == Observation_Validity.Invalid |
    fact.product_id == Product_Id.None |
    !(same_product(snap.pid, fact.product_id))

  @strictpure def fresh_inventory_class(snap: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot, fact: Factory_Dispatch_Coordinator.Qualified_Request_Fact): Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.Type = if (fact.assessment != Admission_Assessment.AdmissibleFresh) Fresh_Inventory_Assessment.NotApplicable else if (inventory_is_sufficient(snap, fact)) Fresh_Inventory_Assessment.Sufficient else if (inventory_is_insufficient(snap, fact)) Fresh_Inventory_Assessment.Insufficient else Fresh_Inventory_Assessment.Unknown

  @strictpure def recovery_inventory_class(snap: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot, context: Factory_Dispatch_Coordinator.Recovery_Qualification_Context): Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.Type = if (context.lifecycle != Dispatch_Lifecycle.RecoveryPending |
        context.stored_request_id == Capacity_Request_Id.None |
        context.stored_product_id == Capacity_Product_Id.None |
        context.stored_amount == Capacity_Amount.A0) Recovery_Inventory_Assessment.NotApplicable else if (snap.validity == Observation_Validity.Valid &
          same_recovery_product(snap.pid, context.stored_product_id) &
          recovery_amount_at_least(snap.qty, context.stored_amount)) Recovery_Inventory_Assessment.Sufficient else if (snap.validity == Observation_Validity.Valid &
          same_recovery_product(snap.pid, context.stored_product_id) &
          recovery_amount_below(snap.qty, context.stored_amount)) Recovery_Inventory_Assessment.Insufficient else Recovery_Inventory_Assessment.Unknown

  @strictpure def candidate_request(value: Factory_Dispatch_Coordinator.Capacity_Request_Id.Type): Factory_Dispatch_Coordinator.Candidate_Request_Id.Type = if (value == Capacity_Request_Id.R1) Candidate_Request_Id.R1 else if (value == Capacity_Request_Id.R2) Candidate_Request_Id.R2 else if (value == Capacity_Request_Id.R3) Candidate_Request_Id.R3 else if (value == Capacity_Request_Id.R4) Candidate_Request_Id.R4 else if (value == Capacity_Request_Id.R5) Candidate_Request_Id.R5 else if (value == Capacity_Request_Id.R6) Candidate_Request_Id.R6 else if (value == Capacity_Request_Id.R7) Candidate_Request_Id.R7 else if (value == Capacity_Request_Id.R8) Candidate_Request_Id.R8 else Candidate_Request_Id.None

  @strictpure def candidate_product(value: Factory_Dispatch_Coordinator.Capacity_Product_Id.Type): Factory_Dispatch_Coordinator.Candidate_Product_Id.Type = if (value == Capacity_Product_Id.P1) Candidate_Product_Id.P1 else if (value == Capacity_Product_Id.P2) Candidate_Product_Id.P2 else if (value == Capacity_Product_Id.P3) Candidate_Product_Id.P3 else if (value == Capacity_Product_Id.P4) Candidate_Product_Id.P4 else Candidate_Product_Id.None

  @strictpure def candidate_amount(value: Factory_Dispatch_Coordinator.Capacity_Amount.Type): Factory_Dispatch_Coordinator.Candidate_Amount.Type = if (value == Capacity_Amount.A1) Candidate_Amount.A1 else if (value == Capacity_Amount.A2) Candidate_Amount.A2 else if (value == Capacity_Amount.A3) Candidate_Amount.A3 else if (value == Capacity_Amount.A4) Candidate_Amount.A4 else Candidate_Amount.A0

  @strictpure def candidate_lifecycle(value: Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type): Factory_Dispatch_Coordinator.Candidate_Lifecycle.Type = if (value == Dispatch_Lifecycle.ActiveFresh) Candidate_Lifecycle.ActiveFresh else if (value == Dispatch_Lifecycle.RecoveryPending) Candidate_Lifecycle.RecoveryPending else if (value == Dispatch_Lifecycle.ActiveRetry) Candidate_Lifecycle.ActiveRetry else if (value == Dispatch_Lifecycle.TerminalCompleted) Candidate_Lifecycle.TerminalCompleted else if (value == Dispatch_Lifecycle.TerminalFailed) Candidate_Lifecycle.TerminalFailed else Candidate_Lifecycle.Idle
  // END FUNCTIONS
}
