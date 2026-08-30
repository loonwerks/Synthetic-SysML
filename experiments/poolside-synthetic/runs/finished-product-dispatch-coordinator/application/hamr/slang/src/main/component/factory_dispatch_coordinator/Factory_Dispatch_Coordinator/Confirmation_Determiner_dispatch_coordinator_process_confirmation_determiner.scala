// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner {

  def initialise(api: Confirmation_Determiner_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    val shippingConfirmation = Factory_Dispatch_Coordinator.Shipping_Confirmation(
      kind = Factory_Dispatch_Coordinator.Confirmation_Kind.None,
      request_id = Factory_Dispatch_Coordinator.Request_Id.None)
    api.put_shipping_confirmation(shippingConfirmation)
  }

  def timeTriggered(api: Confirmation_Determiner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CONFIRMATION_SUPPRESS_PRESERVE
        (api.confirmation_context.classification == Confirmation_Outcome_Class.Preserve) ___>: (api.shipping_confirmation.kind == Confirmation_Kind.None &
          api.shipping_confirmation.request_id == Request_Id.None),
        // case CONFIRMATION_SUPPRESS_RECOVERY
        (api.confirmation_context.classification == Confirmation_Outcome_Class.RetryEligible) ___>: (api.shipping_confirmation.kind == Confirmation_Kind.None &
          api.shipping_confirmation.request_id == Request_Id.None),
        // case CONFIRMATION_SHIPPED
        (api.confirmation_context.classification == Confirmation_Outcome_Class.Completed) ___>: (api.shipping_confirmation.kind == Confirmation_Kind.Shipped &
          api.shipping_confirmation.request_id == Request_Id.None),
        // case CONFIRMATION_FAILED
        (api.confirmation_context.classification == Confirmation_Outcome_Class.Abort) ___>: (api.shipping_confirmation.kind == Confirmation_Kind.DispatchFailed &
          api.shipping_confirmation.request_id == Request_Id.None)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_confirmation_context: Option[Factory_Dispatch_Coordinator.Confirmation_Context] = api.get_confirmation_context()
    api.logInfo(s"Received on data port confirmation_context: ${apiUsage_confirmation_context}")

    val context = api.get_confirmation_context().get

    val kind: Factory_Dispatch_Coordinator.Confirmation_Kind.Type =
      if (context.classification == Confirmation_Outcome_Class.Preserve) {
        Confirmation_Kind.None
      } else if (context.classification == Confirmation_Outcome_Class.RetryEligible) {
        Confirmation_Kind.None
      } else if (context.classification == Confirmation_Outcome_Class.Completed) {
        Confirmation_Kind.Shipped
      } else {
        Confirmation_Kind.DispatchFailed
      }
    val shippingConfirmation = Factory_Dispatch_Coordinator.Shipping_Confirmation(
      kind = kind,
      request_id = Factory_Dispatch_Coordinator.Request_Id.None)
    api.put_shipping_confirmation(shippingConfirmation)
  }

  def finalise(api: Confirmation_Determiner_Operational_Api): Unit = { }
}
