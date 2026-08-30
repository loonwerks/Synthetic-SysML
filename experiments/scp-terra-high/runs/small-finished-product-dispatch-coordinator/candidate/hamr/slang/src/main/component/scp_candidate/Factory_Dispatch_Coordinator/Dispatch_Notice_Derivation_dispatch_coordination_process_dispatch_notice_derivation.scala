// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation {

  def initialise(api: Dispatch_Notice_Derivation_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_NOTICE_SAFE
        api.dispatch_status == Dispatch_Status.Idle &&
          api.shipping_confirmation == Shipping_Confirmation.Not_Issued
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_dispatch_status(Factory_Dispatch_Coordinator.Dispatch_Status.Idle)
    api.put_shipping_confirmation(Factory_Dispatch_Coordinator.Shipping_Confirmation.Not_Issued)
  }

  def timeTriggered(api: Dispatch_Notice_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation_GumboX.compute_CEP_Post(
          api.dispatch_resolution, api.dispatch_status, api.shipping_confirmation)
      )
    )
    val resolution: Dispatch_Resolution = api.get_dispatch_resolution().get
    val status: Dispatch_Status.Type = resolution.disposition match {
      case Dispatch_Disposition.Input_Fault => Dispatch_Status.Input_Fault
      case Dispatch_Disposition.Recovery_Blocked => Dispatch_Status.Recovery_Awaiting_Neutral
      case Dispatch_Disposition.Recovery_Cleared => Dispatch_Status.Idle
      case Dispatch_Disposition.Shipment_Acknowledged => Dispatch_Status.Shipment_Acknowledged
      case Dispatch_Disposition.Unexpected_Outcome => Dispatch_Status.Unexpected_Outcome
      case Dispatch_Disposition.Release_From_Idle => Dispatch_Status.Release_Issued
      case Dispatch_Disposition.Release_From_Queue => Dispatch_Status.Release_Issued
      case Dispatch_Disposition.Queue_For_Product => Dispatch_Status.Waiting_Product
      case Dispatch_Disposition.Hold_Position =>
        resolution.next_phase match {
          case Dispatch_Phase.Idle => Dispatch_Status.Idle
          case Dispatch_Phase.Awaiting_Product => Dispatch_Status.Waiting_Product
          case Dispatch_Phase.Release_Outstanding => Dispatch_Status.Release_Issued
        }
    }
    val confirmation: Shipping_Confirmation.Type = resolution.disposition match {
      case Dispatch_Disposition.Shipment_Acknowledged => Shipping_Confirmation.Issued
      case _ => Shipping_Confirmation.Not_Issued
    }
    api.put_dispatch_status(status)
    api.put_shipping_confirmation(confirmation)
  }

  def finalise(api: Dispatch_Notice_Derivation_Operational_Api): Unit = { }
}
