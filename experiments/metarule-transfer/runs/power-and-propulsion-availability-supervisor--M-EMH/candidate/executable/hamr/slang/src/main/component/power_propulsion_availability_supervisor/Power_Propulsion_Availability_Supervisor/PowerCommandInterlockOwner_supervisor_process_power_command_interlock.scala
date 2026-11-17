// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PowerCommandInterlockOwner_supervisor_process_power_command_interlock {

  // The generated data surface does not expose CommandPhase because it is
  // internal-only.  `F` is DISABLED; `T` represents ENABLE_PENDING or ENABLED.
  var commandMemory: B = F

  def initialise(api: PowerCommandInterlockOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, commandMemory))
    commandMemory = F
    api.put_power_command(Power_Propulsion_Availability_Supervisor.PowerCommand.DISABLE)
  }

  def timeTriggered(api: PowerCommandInterlockOwner_Operational_Api): Unit = {
    Contract(Modifies(api, commandMemory))
    val feedback: Power_Propulsion_Availability_Supervisor.ActuationFeedback.Type = api.get_actuation_feedback() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.ActuationFeedback.UNKNOWN
    }
    val availability: Power_Propulsion_Availability_Supervisor.AvailabilityDecision = api.get_availability_decision() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.AvailabilityDecision(
        Power_Propulsion_Availability_Supervisor.AvailabilityValue.UNAVAILABLE,
        Power_Propulsion_Availability_Supervisor.AvailabilityCause.RECOVERY)
    }
    val demand: Power_Propulsion_Availability_Supervisor.DemandPhase.Type = api.get_demand_view() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE
    }
    val gate: Power_Propulsion_Availability_Supervisor.RecoveryGate.Type = api.get_recovery_gate() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.RecoveryGate.CLOSED
    }
    val directive: Power_Propulsion_Availability_Supervisor.PriorityDirective.Type = api.get_accepted_directive() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.PriorityDirective.INHIBIT
    }
    val enabledPath: B =
      availability.decision == Power_Propulsion_Availability_Supervisor.AvailabilityValue.AVAILABLE_FOR_ENABLE &&
      demand != Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE &&
      gate == Power_Propulsion_Availability_Supervisor.RecoveryGate.OPEN &&
      (directive == Power_Propulsion_Availability_Supervisor.PriorityDirective.ENABLE ||
       directive == Power_Propulsion_Availability_Supervisor.PriorityDirective.HOLD)

    if (!enabledPath) {
      commandMemory = F
      api.put_power_command(Power_Propulsion_Availability_Supervisor.PowerCommand.DISABLE)
    } else if (!commandMemory) {
      commandMemory = T
      api.put_power_command(Power_Propulsion_Availability_Supervisor.PowerCommand.ENABLE_NEW)
    } else {
      if (feedback == Power_Propulsion_Availability_Supervisor.ActuationFeedback.ENABLED_CONFIRMED) {
        commandMemory = T
      } else if (feedback == Power_Propulsion_Availability_Supervisor.ActuationFeedback.DISABLED_CONFIRMED) {
        commandMemory = T
      }
      api.put_power_command(Power_Propulsion_Availability_Supervisor.PowerCommand.ENABLE_HOLD)
    }
  }

  def finalise(api: PowerCommandInterlockOwner_Operational_Api): Unit = { }
}
