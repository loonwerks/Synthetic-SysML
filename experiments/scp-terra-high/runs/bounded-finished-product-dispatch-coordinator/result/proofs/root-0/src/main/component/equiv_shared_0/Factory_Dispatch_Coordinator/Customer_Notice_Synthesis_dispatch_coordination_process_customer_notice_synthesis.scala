// #Sireum

package equiv_shared_0.Factory_Dispatch_Coordinator

import org.sireum._
import equiv_shared_0._

object Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis {
  // BEGIN FUNCTIONS
  @strictpure def notice_for(registry: Factory_Dispatch_Coordinator.Registry_Outcome.Type, dispatch: Factory_Dispatch_Coordinator.Dispatch_Disposition.Type): Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Type = if (registry == Registry_Outcome.Invalid_Event) Customer_Dispatch_Notice.Invalid_Event else if (registry == Registry_Outcome.Identifier_Conflict) Customer_Dispatch_Notice.Identifier_Conflict else if (registry == Registry_Outcome.Stale_Result) Customer_Dispatch_Notice.Stale_Result else if (registry == Registry_Outcome.Busy) Customer_Dispatch_Notice.Busy else if (registry == Registry_Outcome.Shipment_Failed_Retry_Pending) Customer_Dispatch_Notice.Shipment_Failed_Retry_Pending else if (registry == Registry_Outcome.Duplicate_Acknowledged) Customer_Dispatch_Notice.Duplicate_Acknowledged else if (dispatch == Dispatch_Disposition.Inventory_Invalid) Customer_Dispatch_Notice.Inventory_Evidence_Invalid else if (dispatch == Dispatch_Disposition.Readiness_Invalid) Customer_Dispatch_Notice.Readiness_Evidence_Invalid else if (dispatch == Dispatch_Disposition.Waiting_Stock) Customer_Dispatch_Notice.Waiting_For_Stock else if (dispatch == Dispatch_Disposition.Waiting_Dispatch) Customer_Dispatch_Notice.Waiting_For_Dispatch else if (dispatch == Dispatch_Disposition.Release_Issued) Customer_Dispatch_Notice.Release_Issued else if (registry == Registry_Outcome.Shipment_Confirmed) Customer_Dispatch_Notice.Shipment_Confirmed else if (registry == Registry_Outcome.Request_Accepted) Customer_Dispatch_Notice.Request_Accepted else Customer_Dispatch_Notice.None
  // END FUNCTIONS
}
