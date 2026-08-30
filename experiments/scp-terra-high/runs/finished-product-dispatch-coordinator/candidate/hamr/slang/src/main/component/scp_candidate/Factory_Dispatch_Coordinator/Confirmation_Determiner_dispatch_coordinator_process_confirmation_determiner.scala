// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Confirmation_Determiner_dispatch_coordinator_process_confirmation_determiner {

  def initialise(api: Confirmation_Determiner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_shipping_confirmation(Factory_Dispatch_Coordinator.Shipping_Confirmation.example())
  }

  def timeTriggered(api: Confirmation_Determiner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_shipping_confirmation(Factory_Dispatch_Coordinator.Shipping_Confirmation.example())
  }

  def finalise(api: Confirmation_Determiner_Operational_Api): Unit = { }
}
