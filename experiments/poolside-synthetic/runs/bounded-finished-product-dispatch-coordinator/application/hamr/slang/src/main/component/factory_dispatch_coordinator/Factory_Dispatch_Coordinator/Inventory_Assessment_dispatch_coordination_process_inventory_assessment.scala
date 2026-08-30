// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Inventory_Assessment_dispatch_coordination_process_inventory_assessment {

  def initialise(api: Inventory_Assessment_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.inventory_finding == Inventory_Finding.No_Demand
      )
    )
    api.put_inventory_finding(Factory_Dispatch_Coordinator.Inventory_Finding.No_Demand)
  }

  def timeTriggered(api: Inventory_Assessment_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case STOCK_NO_DEMAND
        (api.pending_request == Pending_Request_View.No_Pending_Request) ___>: (api.inventory_finding == Inventory_Finding.No_Demand),
        // case STOCK_INVALID
        (api.pending_request != Pending_Request_View.No_Pending_Request &
          api.inventory_evidence.status == Input_Status.Invalid) ___>: (api.inventory_finding == Inventory_Finding.Invalid_Inventory)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val pending_request = api.get_pending_request().get
    val inventory_evidence = api.get_inventory_evidence().get

    if (pending_request == Pending_Request_View.No_Pending_Request) {
      api.put_inventory_finding(Inventory_Finding.No_Demand)
    } else if (inventory_evidence.status == Input_Status.Invalid) {
      api.put_inventory_finding(Inventory_Finding.Invalid_Inventory)
    } else {
      // STOCK_SUFFICIENT or STOCK_INSUFFICIENT - not constrained by current GUMBO
      api.put_inventory_finding(Inventory_Finding.Sufficient)
    }
  }

  def finalise(api: Inventory_Assessment_Operational_Api): Unit = { }
}
