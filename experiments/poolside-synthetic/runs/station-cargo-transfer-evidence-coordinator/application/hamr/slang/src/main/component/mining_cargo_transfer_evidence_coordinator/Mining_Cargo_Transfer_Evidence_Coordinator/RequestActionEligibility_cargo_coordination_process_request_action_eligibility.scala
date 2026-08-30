// #Sireum

package mining_cargo_transfer_evidence_coordinator.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import mining_cargo_transfer_evidence_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object RequestActionEligibility_cargo_coordination_process_request_action_eligibility {

  def initialise(api: RequestActionEligibility_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_request_proposal(Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal.example())
  }

  def timeTriggered(api: RequestActionEligibility_Operational_Api): Unit = {
    // example api usage

    val apiUsage_admission_decision: Option[Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision] = api.get_admission_decision()
    api.logInfo(s"Received on data port admission_decision: ${apiUsage_admission_decision}")
  }

  def finalise(api: RequestActionEligibility_Operational_Api): Unit = { }
}
