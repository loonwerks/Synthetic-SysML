// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Release_Arbiter_dispatch_coordinator_process_release_arbiter {

  def initialise(api: Release_Arbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_dispatch_decision(Factory_Dispatch_Coordinator.Dispatch_Decision.example())
    api.put_decision_reason(Factory_Dispatch_Coordinator.Decision_Reason.Idle)
  }

  def timeTriggered(api: Release_Arbiter_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_dispatch_decision(Factory_Dispatch_Coordinator.Dispatch_Decision.example())
    api.put_decision_reason(Factory_Dispatch_Coordinator.Decision_Reason.Idle)
  }

  def finalise(api: Release_Arbiter_Operational_Api): Unit = { }
}
