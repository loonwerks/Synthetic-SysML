// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object QuotationEligibility_coordinator_process_quotation_eligibility {

  def initialise(api: QuotationEligibility_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_proposal(Factory_Dispatch_Coordinator.ProposalState.NOT_PROPOSED)
  }

  def timeTriggered(api: QuotationEligibility_Operational_Api): Unit = {
    // example api usage

    val apiUsage_request_facts: Option[Factory_Dispatch_Coordinator.RequestFacts] = api.get_request_facts()
    api.logInfo(s"Received on data port request_facts: ${apiUsage_request_facts}")
    val apiUsage_order_state: Option[Factory_Dispatch_Coordinator.OrderState.Type] = api.get_order_state()
    api.logInfo(s"Received on data port order_state: ${apiUsage_order_state}")
    val apiUsage_recovery_gate: Option[Factory_Dispatch_Coordinator.RecoveryGate.Type] = api.get_recovery_gate()
    api.logInfo(s"Received on data port recovery_gate: ${apiUsage_recovery_gate}")
  }

  def finalise(api: QuotationEligibility_Operational_Api): Unit = { }
}
