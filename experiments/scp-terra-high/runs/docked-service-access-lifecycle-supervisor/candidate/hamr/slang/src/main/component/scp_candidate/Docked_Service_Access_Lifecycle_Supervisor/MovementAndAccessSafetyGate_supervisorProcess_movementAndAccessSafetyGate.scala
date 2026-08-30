// #Sireum

package scp_candidate.Docked_Service_Access_Lifecycle_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object MovementAndAccessSafetyGate_supervisorProcess_movementAndAccessSafetyGate {

  def initialise(api: MovementAndAccessSafetyGate_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee GATE_INITIAL_SAFE
        api.movementDirective == MovementDirective.HOLD &&
          api.serviceAccess == ServiceAccess.LOCKED &&
          api.gatedControl.movement == MovementDirective.HOLD &&
          api.gatedControl.access == ServiceAccess.LOCKED
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_gatedControl(GatedControl(MovementDirective.HOLD, ServiceAccess.LOCKED))
    api.put_movementDirective(MovementDirective.HOLD)
    api.put_serviceAccess(ServiceAccess.LOCKED)
  }

  def timeTriggered(api: MovementAndAccessSafetyGate_Operational_Api): Unit = {
    Contract(Modifies(api))
    val movement: MovementDirective.Type = MovementDirective.HOLD
    val access: ServiceAccess.Type = ServiceAccess.LOCKED
    val control: GatedControl = GatedControl(movement, access)
    api.put_movementDirective(movement)
    api.put_serviceAccess(access)
    api.put_gatedControl(control)
  }

  def finalise(api: MovementAndAccessSafetyGate_Operational_Api): Unit = { }
}
