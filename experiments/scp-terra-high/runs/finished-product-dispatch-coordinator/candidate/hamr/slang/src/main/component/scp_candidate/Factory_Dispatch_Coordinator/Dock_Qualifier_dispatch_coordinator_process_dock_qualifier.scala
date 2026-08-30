// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Dock_Qualifier_dispatch_coordinator_process_dock_qualifier {

  def initialise(api: Dock_Qualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_assessment(Factory_Dispatch_Coordinator.Dock_Assessment.Unknown)
  }

  def timeTriggered(api: Dock_Qualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_assessment(Factory_Dispatch_Coordinator.Dock_Assessment.Unknown)
  }

  def finalise(api: Dock_Qualifier_Operational_Api): Unit = { }
}
