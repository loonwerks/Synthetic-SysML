// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier {

  def initialise(api: Inventory_Qualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_candidate_readiness(Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness.example())
  }

  def timeTriggered(api: Inventory_Qualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_candidate_readiness(Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness.example())
  }

  def finalise(api: Inventory_Qualifier_Operational_Api): Unit = { }
}
