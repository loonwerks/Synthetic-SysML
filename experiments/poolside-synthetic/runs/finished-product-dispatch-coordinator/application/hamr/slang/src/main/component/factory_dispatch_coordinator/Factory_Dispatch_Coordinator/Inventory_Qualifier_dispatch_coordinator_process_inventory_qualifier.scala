// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier {

  def amount_at_least(available: Factory_Dispatch_Coordinator.Inventory_Amount.Type,
                      required: Factory_Dispatch_Coordinator.Dispatch_Amount.Type): B = {
    Contract(
      Ensures(
        Res == ((required == Dispatch_Amount.A0) |
          (required == Dispatch_Amount.A1 & available != Inventory_Amount.A0) |
          (required == Dispatch_Amount.A2 & (available == Inventory_Amount.A2 | available == Inventory_Amount.A3 | available == Inventory_Amount.A4)) |
          (required == Dispatch_Amount.A3 & (available == Inventory_Amount.A3 | available == Inventory_Amount.A4)) |
          (required == Dispatch_Amount.A4 & available == Inventory_Amount.A4))
      )
    )
    return (required == Dispatch_Amount.A0) |
      (required == Dispatch_Amount.A1 & available != Inventory_Amount.A0) |
      (required == Dispatch_Amount.A2 & (available == Inventory_Amount.A2 | available == Inventory_Amount.A3 | available == Inventory_Amount.A4)) |
      (required == Dispatch_Amount.A3 & (available == Inventory_Amount.A3 | available == Inventory_Amount.A4)) |
      (required == Dispatch_Amount.A4 & available == Inventory_Amount.A4)
  }

  def amount_below(available: Factory_Dispatch_Coordinator.Inventory_Amount.Type,
                   required: Factory_Dispatch_Coordinator.Dispatch_Amount.Type): B = {
    Contract(
      Ensures(
        Res == ((required == Dispatch_Amount.A1 & available == Inventory_Amount.A0) |
          (required == Dispatch_Amount.A2 & (available == Inventory_Amount.A0 | available == Inventory_Amount.A1)) |
          (required == Dispatch_Amount.A3 & (available == Inventory_Amount.A0 | available == Inventory_Amount.A1 | available == Inventory_Amount.A2)) |
          (required == Dispatch_Amount.A4 & available != Inventory_Amount.A4))
      )
    )
    return (required == Dispatch_Amount.A1 & available == Inventory_Amount.A0) |
      (required == Dispatch_Amount.A2 & (available == Inventory_Amount.A0 | available == Inventory_Amount.A1)) |
      (required == Dispatch_Amount.A3 & (available == Inventory_Amount.A0 | available == Inventory_Amount.A1 | available == Inventory_Amount.A2)) |
      (required == Dispatch_Amount.A4 & available != Inventory_Amount.A4)
  }

  def same_product(inventory_product: Factory_Dispatch_Coordinator.Inventory_Product_Id.Type,
                   requested_product: Factory_Dispatch_Coordinator.Product_Id.Type): B = {
    Contract(
      Ensures(
        Res == ((inventory_product == Inventory_Product_Id.P1 & requested_product == Product_Id.P1) |
          (inventory_product == Inventory_Product_Id.P2 & requested_product == Product_Id.P2) |
          (inventory_product == Inventory_Product_Id.P3 & requested_product == Product_Id.P3) |
          (inventory_product == Inventory_Product_Id.P4 & requested_product == Product_Id.P4))
      )
    )
    return (inventory_product == Inventory_Product_Id.P1 & requested_product == Product_Id.P1) |
      (inventory_product == Inventory_Product_Id.P2 & requested_product == Product_Id.P2) |
      (inventory_product == Inventory_Product_Id.P3 & requested_product == Product_Id.P3) |
      (inventory_product == Inventory_Product_Id.P4 & requested_product == Product_Id.P4)
  }

  def inventory_is_sufficient(snap: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot,
                              fact: Factory_Dispatch_Coordinator.Qualified_Request_Fact): B = {
    Contract(
      Ensures(
        Res == (snap.validity == Observation_Validity.Valid &
          fact.product_id != Product_Id.None &
          same_product(snap.pid, fact.product_id) &
          amount_at_least(snap.qty, fact.amount))
      )
    )
    return snap.validity == Observation_Validity.Valid &
      fact.product_id != Product_Id.None &
      same_product(snap.pid, fact.product_id) &
      amount_at_least(snap.qty, fact.amount)
  }

  def inventory_is_insufficient(snap: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot,
                                fact: Factory_Dispatch_Coordinator.Qualified_Request_Fact): B = {
    Contract(
      Ensures(
        Res == (snap.validity == Observation_Validity.Valid &
          fact.product_id != Product_Id.None &
          same_product(snap.pid, fact.product_id) &
          amount_below(snap.qty, fact.amount))
      )
    )
    return snap.validity == Observation_Validity.Valid &
      fact.product_id != Product_Id.None &
      same_product(snap.pid, fact.product_id) &
      amount_below(snap.qty, fact.amount)
  }

  def inventory_is_unknown(snap: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot,
                           fact: Factory_Dispatch_Coordinator.Qualified_Request_Fact): B = {
    Contract(
      Ensures(
        Res == (snap.validity == Observation_Validity.Invalid |
          fact.product_id == Product_Id.None |
          not(same_product(snap.pid, fact.product_id)))
      )
    )
    return snap.validity == Observation_Validity.Invalid |
      fact.product_id == Product_Id.None |
      not(same_product(snap.pid, fact.product_id))
  }

  def fresh_inventory_class(snap: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot,
                            fact: Factory_Dispatch_Coordinator.Qualified_Request_Fact): Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.Type = {
    Contract(
      Ensures(
        if (fact.assessment != Admission_Assessment.AdmissibleFresh)
          Res == Fresh_Inventory_Assessment.NotApplicable
        else if (inventory_is_sufficient(snap, fact))
          Res == Fresh_Inventory_Assessment.Sufficient
        else if (inventory_is_insufficient(snap, fact))
          Res == Fresh_Inventory_Assessment.Insufficient
        else
          Res == Fresh_Inventory_Assessment.Unknown
      )
    )
    if (fact.assessment != Admission_Assessment.AdmissibleFresh) {
      return Fresh_Inventory_Assessment.NotApplicable
    } else if (inventory_is_sufficient(snap, fact)) {
      return Fresh_Inventory_Assessment.Sufficient
    } else if (inventory_is_insufficient(snap, fact)) {
      return Fresh_Inventory_Assessment.Insufficient
    } else {
      return Fresh_Inventory_Assessment.Unknown
    }
  }

  def same_recovery_product(inventory_product: Factory_Dispatch_Coordinator.Inventory_Product_Id.Type,
                            stored_product: Factory_Dispatch_Coordinator.Capacity_Product_Id.Type): B = {
    Contract(
      Ensures(
        Res == ((inventory_product == Inventory_Product_Id.P1 & stored_product == Capacity_Product_Id.P1) |
          (inventory_product == Inventory_Product_Id.P2 & stored_product == Capacity_Product_Id.P2) |
          (inventory_product == Inventory_Product_Id.P3 & stored_product == Capacity_Product_Id.P3) |
          (inventory_product == Inventory_Product_Id.P4 & stored_product == Capacity_Product_Id.P4))
      )
    )
    return (inventory_product == Inventory_Product_Id.P1 & stored_product == Capacity_Product_Id.P1) |
      (inventory_product == Inventory_Product_Id.P2 & stored_product == Capacity_Product_Id.P2) |
      (inventory_product == Inventory_Product_Id.P3 & stored_product == Capacity_Product_Id.P3) |
      (inventory_product == Inventory_Product_Id.P4 & stored_product == Capacity_Product_Id.P4)
  }

  def recovery_amount_at_least(available: Factory_Dispatch_Coordinator.Inventory_Amount.Type,
                               required: Factory_Dispatch_Coordinator.Capacity_Amount.Type): B = {
    Contract(
      Ensures(
        Res == ((required == Capacity_Amount.A0) |
          (required == Capacity_Amount.A1 & available != Inventory_Amount.A0) |
          (required == Capacity_Amount.A2 & (available == Inventory_Amount.A2 | available == Inventory_Amount.A3 | available == Inventory_Amount.A4)) |
          (required == Capacity_Amount.A3 & (available == Inventory_Amount.A3 | available == Inventory_Amount.A4)) |
          (required == Capacity_Amount.A4 & available == Inventory_Amount.A4))
      )
    )
    return (required == Capacity_Amount.A0) |
      (required == Capacity_Amount.A1 & available != Inventory_Amount.A0) |
      (required == Capacity_Amount.A2 & (available == Inventory_Amount.A2 | available == Inventory_Amount.A3 | available == Inventory_Amount.A4)) |
      (required == Capacity_Amount.A3 & (available == Inventory_Amount.A3 | available == Inventory_Amount.A4)) |
      (required == Capacity_Amount.A4 & available == Inventory_Amount.A4)
  }

  def recovery_amount_below(available: Factory_Dispatch_Coordinator.Inventory_Amount.Type,
                            required: Factory_Dispatch_Coordinator.Capacity_Amount.Type): B = {
    Contract(
      Ensures(
        Res == ((required == Capacity_Amount.A1 & available == Inventory_Amount.A0) |
          (required == Capacity_Amount.A2 & (available == Inventory_Amount.A0 | available == Inventory_Amount.A1)) |
          (required == Capacity_Amount.A3 & (available == Inventory_Amount.A0 | available == Inventory_Amount.A1 | available == Inventory_Amount.A2)) |
          (required == Capacity_Amount.A4 & available != Inventory_Amount.A4))
      )
    )
    return (required == Capacity_Amount.A1 & available == Inventory_Amount.A0) |
      (required == Capacity_Amount.A2 & (available == Inventory_Amount.A0 | available == Inventory_Amount.A1)) |
      (required == Capacity_Amount.A3 & (available == Inventory_Amount.A0 | available == Inventory_Amount.A1 | available == Inventory_Amount.A2)) |
      (required == Capacity_Amount.A4 & available != Inventory_Amount.A4)
  }

  def recovery_inventory_class(snap: Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot,
                               context: Factory_Dispatch_Coordinator.Recovery_Qualification_Context): Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.Type = {
    Contract(
      Ensures(
        if (context.lifecycle != Dispatch_Lifecycle.RecoveryPending |
             context.stored_request_id == Capacity_Request_Id.None |
             context.stored_product_id == Capacity_Product_Id.None |
             context.stored_amount == Capacity_Amount.A0)
          Res == Recovery_Inventory_Assessment.NotApplicable
        else if (snap.validity == Observation_Validity.Valid &
                  same_recovery_product(snap.pid, context.stored_product_id) &
                  recovery_amount_at_least(snap.qty, context.stored_amount))
          Res == Recovery_Inventory_Assessment.Sufficient
        else if (snap.validity == Observation_Validity.Valid &
                  same_recovery_product(snap.pid, context.stored_product_id) &
                  recovery_amount_below(snap.qty, context.stored_amount))
          Res == Recovery_Inventory_Assessment.Insufficient
        else
          Res == Recovery_Inventory_Assessment.Unknown
      )
    )
    if (context.lifecycle != Dispatch_Lifecycle.RecoveryPending |
        context.stored_request_id == Capacity_Request_Id.None |
        context.stored_product_id == Capacity_Product_Id.None |
        context.stored_amount == Capacity_Amount.A0) {
      return Recovery_Inventory_Assessment.NotApplicable
    } else if (snap.validity == Observation_Validity.Valid &
               same_recovery_product(snap.pid, context.stored_product_id) &
               recovery_amount_at_least(snap.qty, context.stored_amount)) {
      return Recovery_Inventory_Assessment.Sufficient
    } else if (snap.validity == Observation_Validity.Valid &
               same_recovery_product(snap.pid, context.stored_product_id) &
               recovery_amount_below(snap.qty, context.stored_amount)) {
      return Recovery_Inventory_Assessment.Insufficient
    } else {
      return Recovery_Inventory_Assessment.Unknown
    }
  }

  def candidate_request(value: Factory_Dispatch_Coordinator.Capacity_Request_Id.Type): Factory_Dispatch_Coordinator.Candidate_Request_Id.Type = {
    if (value == Capacity_Request_Id.R1) return Candidate_Request_Id.R1
    else if (value == Capacity_Request_Id.R2) return Candidate_Request_Id.R2
    else if (value == Capacity_Request_Id.R3) return Candidate_Request_Id.R3
    else if (value == Capacity_Request_Id.R4) return Candidate_Request_Id.R4
    else if (value == Capacity_Request_Id.R5) return Candidate_Request_Id.R5
    else if (value == Capacity_Request_Id.R6) return Candidate_Request_Id.R6
    else if (value == Capacity_Request_Id.R7) return Candidate_Request_Id.R7
    else if (value == Capacity_Request_Id.R8) return Candidate_Request_Id.R8
    else return Candidate_Request_Id.None
  }

  def candidate_product(value: Factory_Dispatch_Coordinator.Capacity_Product_Id.Type): Factory_Dispatch_Coordinator.Candidate_Product_Id.Type = {
    if (value == Capacity_Product_Id.P1) return Candidate_Product_Id.P1
    else if (value == Capacity_Product_Id.P2) return Candidate_Product_Id.P2
    else if (value == Capacity_Product_Id.P3) return Candidate_Product_Id.P3
    else if (value == Capacity_Product_Id.P4) return Candidate_Product_Id.P4
    else return Candidate_Product_Id.None
  }

  def candidate_amount(value: Factory_Dispatch_Coordinator.Capacity_Amount.Type): Factory_Dispatch_Coordinator.Candidate_Amount.Type = {
    if (value == Capacity_Amount.A1) return Candidate_Amount.A1
    else if (value == Capacity_Amount.A2) return Candidate_Amount.A2
    else if (value == Capacity_Amount.A3) return Candidate_Amount.A3
    else if (value == Capacity_Amount.A4) return Candidate_Amount.A4
    else return Candidate_Amount.A0
  }

  def candidate_lifecycle(value: Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type): Factory_Dispatch_Coordinator.Candidate_Lifecycle.Type = {
    if (value == Dispatch_Lifecycle.ActiveFresh) return Candidate_Lifecycle.ActiveFresh
    else if (value == Dispatch_Lifecycle.RecoveryPending) return Candidate_Lifecycle.RecoveryPending
    else if (value == Dispatch_Lifecycle.ActiveRetry) return Candidate_Lifecycle.ActiveRetry
    else if (value == Dispatch_Lifecycle.TerminalCompleted) return Candidate_Lifecycle.TerminalCompleted
    else if (value == Dispatch_Lifecycle.TerminalFailed) return Candidate_Lifecycle.TerminalFailed
    else return Candidate_Lifecycle.Idle
  }

  def initialise(api: Inventory_Qualifier_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    val readiness = Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness(
      fresh_assessment = Factory_Dispatch_Coordinator.Fresh_Inventory_Assessment.NotApplicable,
      recovery_assessment = Factory_Dispatch_Coordinator.Recovery_Inventory_Assessment.NotApplicable,
      recovery_request_id = Factory_Dispatch_Coordinator.Candidate_Request_Id.None,
      recovery_product_id = Factory_Dispatch_Coordinator.Candidate_Product_Id.None,
      recovery_amount = Factory_Dispatch_Coordinator.Candidate_Amount.A0,
      lifecycle_capacity = Factory_Dispatch_Coordinator.Candidate_Lifecycle.Idle)
    api.put_candidate_readiness(readiness)
  }

  def timeTriggered(api: Inventory_Qualifier_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee FRESH_INVENTORY_CLASSIFIED
        //   classify fresh inventory
        T,
        // guarantee RECOVERY_INVENTORY_CLASSIFIED
        //   classify recovery inventory
        T,
        // guarantee RECOVERY_CONTEXT_ROUTED
        //   route recovery context
        T
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_inventory_snapshot: Option[Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot] = api.get_inventory_snapshot()
    api.logInfo(s"Received on data port inventory_snapshot: ${apiUsage_inventory_snapshot}")
    val apiUsage_request_fact: Option[Factory_Dispatch_Coordinator.Qualified_Request_Fact] = api.get_request_fact()
    api.logInfo(s"Received on data port request_fact: ${apiUsage_request_fact}")
    val apiUsage_recovery_context: Option[Factory_Dispatch_Coordinator.Recovery_Qualification_Context] = api.get_recovery_context()
    api.logInfo(s"Received on data port recovery_context: ${apiUsage_recovery_context}")

    val snap = api.get_inventory_snapshot().get
    val fact = api.get_request_fact().get
    val context = api.get_recovery_context().get

    val freshAssessment = fresh_inventory_class(snap, fact)
    val recoveryAssessment = recovery_inventory_class(snap, context)
    val recoveryRequestId = candidate_request(context.stored_request_id)
    val recoveryProductId = candidate_product(context.stored_product_id)
    val recoveryAmount = candidate_amount(context.stored_amount)
    val lifecycleCapacity = candidate_lifecycle(context.lifecycle)

    val readiness = Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness(
      fresh_assessment = freshAssessment,
      recovery_assessment = recoveryAssessment,
      recovery_request_id = recoveryRequestId,
      recovery_product_id = recoveryProductId,
      recovery_amount = recoveryAmount,
      lifecycle_capacity = lifecycleCapacity)
    api.put_candidate_readiness(readiness)
  }

  def finalise(api: Inventory_Qualifier_Operational_Api): Unit = { }
}
