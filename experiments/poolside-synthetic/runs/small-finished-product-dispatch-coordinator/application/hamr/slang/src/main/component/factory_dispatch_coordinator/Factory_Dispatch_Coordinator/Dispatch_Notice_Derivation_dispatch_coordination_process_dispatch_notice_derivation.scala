// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Dispatch_Notice_Derivation_dispatch_coordination_process_dispatch_notice_derivation {

  def initialise(api: Dispatch_Notice_Derivation_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INITIAL_NOTICE_SAFE
        api.dispatch_status == Dispatch_Status.Idle &
        api.shipping_confirmation == Shipping_Confirmation.Not_Issued
      )
    )

    api.put_dispatch_status(Factory_Dispatch_Coordinator.Dispatch_Status.Idle)
    api.put_shipping_confirmation(Factory_Dispatch_Coordinator.Shipping_Confirmation.Not_Issued)
  }

  def timeTriggered(api: Dispatch_Notice_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case NOTICE_INPUT_FAULT
        //   dispatch status is input fault and shipping confirmation is not issued when dispatch resolution disposition is input fault
        (api.dispatch_resolution.disposition == Dispatch_Disposition.Input_Fault) ___>: (api.dispatch_status == Dispatch_Status.Input_Fault &
          api.shipping_confirmation == Shipping_Confirmation.Not_Issued),
        // case NOTICE_RECOVERY_BLOCKED
        //   dispatch status is recovery awaiting neutral and shipping confirmation is not issued when dispatch resolution disposition is recovery blocked
        (api.dispatch_resolution.disposition == Dispatch_Disposition.Recovery_Blocked) ___>: (api.dispatch_status == Dispatch_Status.Recovery_Awaiting_Neutral &
          api.shipping_confirmation == Shipping_Confirmation.Not_Issued),
        // case NOTICE_RECOVERY_CLEARED
        //   dispatch status is idle and shipping confirmation is not issued when dispatch resolution disposition is recovery cleared
        (api.dispatch_resolution.disposition == Dispatch_Disposition.Recovery_Cleared) ___>: (api.dispatch_status == Dispatch_Status.Idle &
          api.shipping_confirmation == Shipping_Confirmation.Not_Issued),
        // case NOTICE_ACKNOWLEDGED
        //   dispatch status is shipment acknowledged and shipping confirmation is issued when dispatch resolution disposition is shipment acknowledged
        (api.dispatch_resolution.disposition == Dispatch_Disposition.Shipment_Acknowledged) ___>: (api.dispatch_status == Dispatch_Status.Shipment_Acknowledged &
          api.shipping_confirmation == Shipping_Confirmation.Issued),
        // case NOTICE_UNEXPECTED
        //   dispatch status is unexpected outcome and shipping confirmation is not issued when dispatch resolution disposition is unexpected outcome
        (api.dispatch_resolution.disposition == Dispatch_Disposition.Unexpected_Outcome) ___>: (api.dispatch_status == Dispatch_Status.Unexpected_Outcome &
          api.shipping_confirmation == Shipping_Confirmation.Not_Issued),
        // case NOTICE_RELEASE_ISSUED
        //   dispatch status is release issued and shipping confirmation is not issued when dispatch resolution disposition is release from idle or release from queue
        (api.dispatch_resolution.disposition == Dispatch_Disposition.Release_From_Idle |
          api.dispatch_resolution.disposition == Dispatch_Disposition.Release_From_Queue) ___>: (api.dispatch_status == Dispatch_Status.Release_Issued &
          api.shipping_confirmation == Shipping_Confirmation.Not_Issued),
        // case NOTICE_WAITING_PRODUCT
        //   dispatch status is waiting product and shipping confirmation is not issued when dispatch resolution disposition is queue for product
        (api.dispatch_resolution.disposition == Dispatch_Disposition.Queue_For_Product) ___>: (api.dispatch_status == Dispatch_Status.Waiting_Product &
          api.shipping_confirmation == Shipping_Confirmation.Not_Issued),
        // case NOTICE_HOLD_IDLE
        //   dispatch status is idle and shipping confirmation is not issued when dispatch resolution disposition is hold position and next phase is idle
        (api.dispatch_resolution.disposition == Dispatch_Disposition.Hold_Position &
          api.dispatch_resolution.next_phase == Dispatch_Phase.Idle) ___>: (api.dispatch_status == Dispatch_Status.Idle &
          api.shipping_confirmation == Shipping_Confirmation.Not_Issued),
        // case NOTICE_HOLD_AWAITING
        //   dispatch status is waiting product and shipping confirmation is not issued when dispatch resolution disposition is hold position and next phase is awaiting product
        (api.dispatch_resolution.disposition == Dispatch_Disposition.Hold_Position &
          api.dispatch_resolution.next_phase == Dispatch_Phase.Awaiting_Product) ___>: (api.dispatch_status == Dispatch_Status.Waiting_Product &
          api.shipping_confirmation == Shipping_Confirmation.Not_Issued),
        // case NOTICE_HOLD_OUTSTANDING
        //   dispatch status is release issued and shipping confirmation is not issued when dispatch resolution disposition is hold position and next phase is release outstanding
        (api.dispatch_resolution.disposition == Dispatch_Disposition.Hold_Position &
          api.dispatch_resolution.next_phase == Dispatch_Phase.Release_Outstanding) ___>: (api.dispatch_status == Dispatch_Status.Release_Issued &
          api.shipping_confirmation == Shipping_Confirmation.Not_Issued)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val dispatch_resolution: Factory_Dispatch_Coordinator.Dispatch_Resolution = api.get_dispatch_resolution().get
    val status: Dispatch_Status.Type = dispatch_resolution.disposition match {
      case Dispatch_Disposition.Input_Fault => Dispatch_Status.Input_Fault
      case Dispatch_Disposition.Recovery_Blocked => Dispatch_Status.Recovery_Awaiting_Neutral
      case Dispatch_Disposition.Recovery_Cleared => Dispatch_Status.Idle
      case Dispatch_Disposition.Shipment_Acknowledged => Dispatch_Status.Shipment_Acknowledged
      case Dispatch_Disposition.Unexpected_Outcome => Dispatch_Status.Unexpected_Outcome
      case Dispatch_Disposition.Release_From_Idle => Dispatch_Status.Release_Issued
      case Dispatch_Disposition.Release_From_Queue => Dispatch_Status.Release_Issued
      case Dispatch_Disposition.Queue_For_Product => Dispatch_Status.Waiting_Product
      case Dispatch_Disposition.Hold_Position => dispatch_resolution.next_phase match {
        case Dispatch_Phase.Idle => Dispatch_Status.Idle
        case Dispatch_Phase.Awaiting_Product => Dispatch_Status.Waiting_Product
        case Dispatch_Phase.Release_Outstanding => Dispatch_Status.Release_Issued
      }
    }
    val confirmation: Shipping_Confirmation.Type =
      if (dispatch_resolution.disposition == Dispatch_Disposition.Shipment_Acknowledged) {
        Shipping_Confirmation.Issued
      } else {
        Shipping_Confirmation.Not_Issued
      }
    api.put_dispatch_status(status)
    api.put_shipping_confirmation(confirmation)
  }

  def finalise(api: Dispatch_Notice_Derivation_Operational_Api): Unit = { }
}
