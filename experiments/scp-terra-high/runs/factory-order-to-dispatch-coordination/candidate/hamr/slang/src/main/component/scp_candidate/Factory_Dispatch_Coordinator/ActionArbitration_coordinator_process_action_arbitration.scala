// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ActionArbitration_coordinator_process_action_arbitration {

  def initialise(api: ActionArbitration_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_ACTION_HOLD
        api.selected_action == DispatchAction.HOLD
        // END INITIALIZES ENSURES
      )
    )
    api.put_selected_action(DispatchAction.HOLD)
  }

  def timeTriggered(api: ActionArbitration_Operational_Api): Unit = {
    Contract(Modifies(api))
    val action: DispatchAction.Type =
      if (api.get_emergency_state().get == EmergencyState.ACTIVE) { DispatchAction.HOLD }
      else if (api.get_dispatch_proposal().get == ProposalState.PROPOSED) { DispatchAction.RELEASE_DISPATCH }
      else if (api.get_production_proposal().get == ProposalState.PROPOSED) { DispatchAction.RELEASE_PRODUCTION }
      else if (api.get_procurement_proposal().get == ProposalState.PROPOSED) { DispatchAction.ORDER_MATERIAL }
      else if (api.get_quotation_proposal().get == ProposalState.PROPOSED) { DispatchAction.ISSUE_QUOTE }
      else { DispatchAction.HOLD }
    api.put_selected_action(action)
  }

  def finalise(api: ActionArbitration_Operational_Api): Unit = { }
}
