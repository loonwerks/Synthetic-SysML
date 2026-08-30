// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Dispatch_Priority_Resolver_dispatch_coordinator_process_dispatch_priority_resolver {

  def initialise(api: Dispatch_Priority_Resolver_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_selected_intent(Factory_Dispatch_Coordinator.Selected_Intent.None)
  }

  def timeTriggered(api: Dispatch_Priority_Resolver_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_selected_intent(Factory_Dispatch_Coordinator.Selected_Intent.None)
  }

  def finalise(api: Dispatch_Priority_Resolver_Operational_Api): Unit = { }
}
