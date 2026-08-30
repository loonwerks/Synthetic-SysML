// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ActionArbitration_coordinator_process_action_arbitration {

  def initialise(api: ActionArbitration_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_selected_action(Factory_Dispatch_Coordinator.DispatchAction.HOLD)
  }

  def timeTriggered(api: ActionArbitration_Operational_Api): Unit = {
    // example api usage

    val apiUsage_emergency_state: Option[Factory_Dispatch_Coordinator.EmergencyState.Type] = api.get_emergency_state()
    api.logInfo(s"Received on data port emergency_state: ${apiUsage_emergency_state}")
    val apiUsage_quotation_proposal: Option[Factory_Dispatch_Coordinator.ProposalState.Type] = api.get_quotation_proposal()
    api.logInfo(s"Received on data port quotation_proposal: ${apiUsage_quotation_proposal}")
    val apiUsage_procurement_proposal: Option[Factory_Dispatch_Coordinator.ProposalState.Type] = api.get_procurement_proposal()
    api.logInfo(s"Received on data port procurement_proposal: ${apiUsage_procurement_proposal}")
    val apiUsage_production_proposal: Option[Factory_Dispatch_Coordinator.ProposalState.Type] = api.get_production_proposal()
    api.logInfo(s"Received on data port production_proposal: ${apiUsage_production_proposal}")
    val apiUsage_dispatch_proposal: Option[Factory_Dispatch_Coordinator.ProposalState.Type] = api.get_dispatch_proposal()
    api.logInfo(s"Received on data port dispatch_proposal: ${apiUsage_dispatch_proposal}")
  }

  def finalise(api: ActionArbitration_Operational_Api): Unit = { }
}
