// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PowerCommandInterlockOwner_supervisor_process_power_command_interlock {
  // The executable projection omits the semantic-only CommandPhase type.
  // DISABLE, ENABLE_NEW, and ENABLE_HOLD encode disabled, pending, and enabled.
  var commandMemory: PowerCommand.Type = PowerCommand.DISABLE

  def initialise(api: PowerCommandInterlockOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, commandMemory))
    commandMemory = PowerCommand.DISABLE
    api.put_power_command(PowerCommand.DISABLE)
  }

  def timeTriggered(api: PowerCommandInterlockOwner_Operational_Api): Unit = {
    Contract(Modifies(api, commandMemory))
    val permitted: B = api.get_availability_decision() match {
      case Some(decision) => decision.decision == AvailabilityValue.AVAILABLE_FOR_ENABLE
      case _ => F
    }
    val activeDemand: B = api.get_demand_view() != Some(DemandPhase.IDLE)
    val openGate: B = api.get_recovery_gate() == Some(RecoveryGate.OPEN)
    val directive: Option[PriorityDirective.Type] = api.get_accepted_directive()
    val enableDirective: B =
      directive == Some(PriorityDirective.ENABLE) || directive == Some(PriorityDirective.HOLD)
    if (!permitted || !activeDemand || !openGate || !enableDirective) {
      commandMemory = PowerCommand.DISABLE
      api.put_power_command(PowerCommand.DISABLE)
    } else if (commandMemory == PowerCommand.DISABLE) {
      commandMemory = PowerCommand.ENABLE_NEW
      api.put_power_command(PowerCommand.ENABLE_NEW)
    } else {
      api.get_actuation_feedback() match {
        case Some(ActuationFeedback.ENABLED_CONFIRMED) => commandMemory = PowerCommand.ENABLE_HOLD
        case Some(ActuationFeedback.DISABLED_CONFIRMED) => commandMemory = PowerCommand.ENABLE_NEW
        case _ =>
      }
      api.put_power_command(PowerCommand.ENABLE_HOLD)
    }
  }

  def finalise(api: PowerCommandInterlockOwner_Operational_Api): Unit = { }
}
