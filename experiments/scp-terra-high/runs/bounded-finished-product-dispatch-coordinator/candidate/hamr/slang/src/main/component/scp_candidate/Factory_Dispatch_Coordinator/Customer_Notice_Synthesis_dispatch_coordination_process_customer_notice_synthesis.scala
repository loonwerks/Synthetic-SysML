// #Sireum
package scp_candidate.Factory_Dispatch_Coordinator
import org.sireum._
import scp_candidate._

object Customer_Notice_Synthesis_dispatch_coordination_process_customer_notice_synthesis {
  def initialise(api: Customer_Notice_Synthesis_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_customer_notice(Customer_Dispatch_Notice.None)
  }
  def timeTriggered(api: Customer_Notice_Synthesis_Operational_Api): Unit = {
    Contract(Modifies(api))
    val registry: Registry_Outcome.Type = api.get_registry_outcome().get
    val dispatch: Dispatch_Disposition.Type = api.get_dispatch_disposition().get
    api.put_customer_notice(noticeFor(registry, dispatch))
  }
  def noticeFor(registry: Registry_Outcome.Type, dispatch: Dispatch_Disposition.Type): Customer_Dispatch_Notice.Type = {
    registry match {
      case Registry_Outcome.Invalid_Event => return Customer_Dispatch_Notice.Invalid_Event
      case Registry_Outcome.Identifier_Conflict => return Customer_Dispatch_Notice.Identifier_Conflict
      case Registry_Outcome.Stale_Result => return Customer_Dispatch_Notice.Stale_Result
      case Registry_Outcome.Busy => return Customer_Dispatch_Notice.Busy
      case Registry_Outcome.Shipment_Failed_Retry_Pending => return Customer_Dispatch_Notice.Shipment_Failed_Retry_Pending
      case Registry_Outcome.Duplicate_Acknowledged => return Customer_Dispatch_Notice.Duplicate_Acknowledged
      case Registry_Outcome.Shipment_Confirmed => return Customer_Dispatch_Notice.Shipment_Confirmed
      case Registry_Outcome.Request_Accepted => return Customer_Dispatch_Notice.Request_Accepted
      case _ =>
    }
    dispatch match {
      case Dispatch_Disposition.Inventory_Invalid => return Customer_Dispatch_Notice.Inventory_Evidence_Invalid
      case Dispatch_Disposition.Readiness_Invalid => return Customer_Dispatch_Notice.Readiness_Evidence_Invalid
      case Dispatch_Disposition.Waiting_Stock => return Customer_Dispatch_Notice.Waiting_For_Stock
      case Dispatch_Disposition.Waiting_Dispatch => return Customer_Dispatch_Notice.Waiting_For_Dispatch
      case Dispatch_Disposition.Release_Issued => return Customer_Dispatch_Notice.Release_Issued
      case _ => return Customer_Dispatch_Notice.None
    }
  }
  def finalise(api: Customer_Notice_Synthesis_Operational_Api): Unit = { }
}
