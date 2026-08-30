// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Request_Qualifier_dispatch_coordinator_process_request_qualifier {

  def initialise(api: Request_Qualifier_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_inventory_request_fact(Factory_Dispatch_Coordinator.Qualified_Request_Fact.example())
    api.put_priority_admission(Factory_Dispatch_Coordinator.Admission_Assessment.NoRequest)
    api.put_arbiter_request_fact(Factory_Dispatch_Coordinator.Qualified_Request_Fact.example())
  }

  def timeTriggered(api: Request_Qualifier_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_inventory_request_fact(Factory_Dispatch_Coordinator.Qualified_Request_Fact.example())
    api.put_priority_admission(Factory_Dispatch_Coordinator.Admission_Assessment.NoRequest)
    api.put_arbiter_request_fact(Factory_Dispatch_Coordinator.Qualified_Request_Fact.example())
  }

  def finalise(api: Request_Qualifier_Operational_Api): Unit = { }
}
