// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis {

  def initialise(api: Customer_Notice_Synthesis_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.customer_notice == Customer_Dispatch_Notice.None
      )
    )
    api.put_customer_notice(Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.None)
  }

  def timeTriggered(api: Customer_Notice_Synthesis_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee NOTICE_PRIORITY_RESOLUTION
        api.registry_outcome == Registry_Outcome.Invalid_Event ___>:
          api.customer_notice == Customer_Dispatch_Notice.Invalid_Event &
            api.registry_outcome == Registry_Outcome.Identifier_Conflict ___>:
            api.customer_notice == Customer_Dispatch_Notice.Identifier_Conflict &
              api.registry_outcome == Registry_Outcome.Stale_Result ___>:
              api.customer_notice == Customer_Dispatch_Notice.Stale_Result &
                api.registry_outcome == Registry_Outcome.Busy ___>:
                api.customer_notice == Customer_Dispatch_Notice.Busy &
                  api.registry_outcome == Registry_Outcome.Shipment_Failed_Retry_Pending ___>:
                  api.customer_notice == Customer_Dispatch_Notice.Shipment_Failed_Retry_Pending &
                    api.registry_outcome == Registry_Outcome.Duplicate_Acknowledged ___>:
                    api.customer_notice == Customer_Dispatch_Notice.Duplicate_Acknowledged &
                      api.dispatch_disposition == Dispatch_Disposition.Inventory_Invalid ___>:
                      api.customer_notice == Customer_Dispatch_Notice.Inventory_Evidence_Invalid &
                        api.dispatch_disposition == Dispatch_Disposition.Readiness_Invalid ___>:
                        api.customer_notice == Customer_Dispatch_Notice.Readiness_Evidence_Invalid &
                          api.dispatch_disposition == Dispatch_Disposition.Waiting_Stock ___>:
                          api.customer_notice == Customer_Dispatch_Notice.Waiting_For_Stock &
                            api.dispatch_disposition == Dispatch_Disposition.Waiting_Dispatch ___>:
                            api.customer_notice == Customer_Dispatch_Notice.Waiting_For_Dispatch &
                              api.dispatch_disposition == Dispatch_Disposition.Release_Issued ___>:
                              api.customer_notice == Customer_Dispatch_Notice.Release_Issued &
                                api.registry_outcome == Registry_Outcome.Shipment_Confirmed ___>:
                                api.customer_notice == Customer_Dispatch_Notice.Shipment_Confirmed &
                                  api.registry_outcome == Registry_Outcome.Request_Accepted ___>:
                                  api.customer_notice == Customer_Dispatch_Notice.Request_Accepted
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val registry_outcome = api.get_registry_outcome().get
    val dispatch_disposition = api.get_dispatch_disposition().get

    val notice: Factory_Dispatch_Coordinator.Customer_Dispatch_Notice.Type =
      if (registry_outcome == Registry_Outcome.Invalid_Event) {
        Customer_Dispatch_Notice.Invalid_Event
      } else if (registry_outcome == Registry_Outcome.Identifier_Conflict) {
        Customer_Dispatch_Notice.Identifier_Conflict
      } else if (registry_outcome == Registry_Outcome.Stale_Result) {
        Customer_Dispatch_Notice.Stale_Result
      } else if (registry_outcome == Registry_Outcome.Busy) {
        Customer_Dispatch_Notice.Busy
      } else if (registry_outcome == Registry_Outcome.Shipment_Failed_Retry_Pending) {
        Customer_Dispatch_Notice.Shipment_Failed_Retry_Pending
      } else if (registry_outcome == Registry_Outcome.Duplicate_Acknowledged) {
        Customer_Dispatch_Notice.Duplicate_Acknowledged
      } else if (dispatch_disposition == Dispatch_Disposition.Inventory_Invalid) {
        Customer_Dispatch_Notice.Inventory_Evidence_Invalid
      } else if (dispatch_disposition == Dispatch_Disposition.Readiness_Invalid) {
        Customer_Dispatch_Notice.Readiness_Evidence_Invalid
      } else if (dispatch_disposition == Dispatch_Disposition.Waiting_Stock) {
        Customer_Dispatch_Notice.Waiting_For_Stock
      } else if (dispatch_disposition == Dispatch_Disposition.Waiting_Dispatch) {
        Customer_Dispatch_Notice.Waiting_For_Dispatch
      } else if (dispatch_disposition == Dispatch_Disposition.Release_Issued) {
        Customer_Dispatch_Notice.Release_Issued
      } else if (registry_outcome == Registry_Outcome.Shipment_Confirmed) {
        Customer_Dispatch_Notice.Shipment_Confirmed
      } else if (registry_outcome == Registry_Outcome.Request_Accepted) {
        Customer_Dispatch_Notice.Request_Accepted
      } else {
        Customer_Dispatch_Notice.None
      }
    api.put_customer_notice(notice)
  }

  def finalise(api: Customer_Notice_Synthesis_Operational_Api): Unit = { }
}
