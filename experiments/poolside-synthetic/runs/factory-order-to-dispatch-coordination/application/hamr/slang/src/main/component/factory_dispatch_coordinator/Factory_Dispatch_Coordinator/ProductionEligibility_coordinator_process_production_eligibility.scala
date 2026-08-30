// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ProductionEligibility_coordinator_process_production_eligibility {

  def initialise(api: ProductionEligibility_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_proposal(Factory_Dispatch_Coordinator.ProposalState.NOT_PROPOSED)
  }

  def timeTriggered(api: ProductionEligibility_Operational_Api): Unit = {
    // example api usage

    val apiUsage_stock_facts: Option[Factory_Dispatch_Coordinator.StockFacts] = api.get_stock_facts()
    api.logInfo(s"Received on data port stock_facts: ${apiUsage_stock_facts}")
    val apiUsage_production_available: Option[Base_Types.Boolean] = api.get_production_available()
    api.logInfo(s"Received on data port production_available: ${apiUsage_production_available}")
    val apiUsage_order_state: Option[Factory_Dispatch_Coordinator.OrderState.Type] = api.get_order_state()
    api.logInfo(s"Received on data port order_state: ${apiUsage_order_state}")
    val apiUsage_recovery_gate: Option[Factory_Dispatch_Coordinator.RecoveryGate.Type] = api.get_recovery_gate()
    api.logInfo(s"Received on data port recovery_gate: ${apiUsage_recovery_gate}")
  }

  def finalise(api: ProductionEligibility_Operational_Api): Unit = { }
}
