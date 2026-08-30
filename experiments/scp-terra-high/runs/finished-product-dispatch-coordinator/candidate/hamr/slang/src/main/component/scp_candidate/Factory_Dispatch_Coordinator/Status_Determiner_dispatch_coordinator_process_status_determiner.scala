// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Status_Determiner_dispatch_coordinator_process_status_determiner {

  def initialise(api: Status_Determiner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_dispatch_status(Factory_Dispatch_Coordinator.Dispatch_Status.Idle)
  }

  def timeTriggered(api: Status_Determiner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_dispatch_status(Factory_Dispatch_Coordinator.Dispatch_Status.Idle)
  }

  def finalise(api: Status_Determiner_Operational_Api): Unit = { }
}
