// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PowerCommandInterlockOwner_supervisor_process_power_command_interlock {

  // BEGIN STATE VARS
  var commandMemory: Power_Propulsion_Availability_Supervisor.CommandPhase.Type = Power_Propulsion_Availability_Supervisor.CommandPhase.DISABLED
  // END STATE VARS

  def initialise(api: PowerCommandInterlockOwner_Initialization_Api): Unit = {
    commandMemory = CommandPhase.DISABLED
    api.put_power_command(Power_Propulsion_Availability_Supervisor.PowerCommand.DISABLE)
  }

  def timeTriggered(api: PowerCommandInterlockOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case COMPLETE_COMMAND_INTERLOCK
        (T) ___>: ((api.availability_decision.decision != AvailabilityValue.AVAILABLE_FOR_ENABLE |
          api.demand_view == DemandPhase.IDLE |
          api.recovery_gate != RecoveryGate.OPEN |
          api.accepted_directive != PriorityDirective.ENABLE &
            api.accepted_directive != PriorityDirective.HOLD) &
          commandMemory == CommandPhase.DISABLED &
          api.power_command == PowerCommand.DISABLE |
          api.availability_decision.decision == AvailabilityValue.AVAILABLE_FOR_ENABLE &
            api.demand_view != DemandPhase.IDLE &
            api.recovery_gate == RecoveryGate.OPEN &
            (api.accepted_directive == PriorityDirective.ENABLE |
              api.accepted_directive == PriorityDirective.HOLD) &
            In(commandMemory) == CommandPhase.DISABLED &
            commandMemory == CommandPhase.ENABLE_PENDING &
            api.power_command == PowerCommand.ENABLE_NEW |
          api.availability_decision.decision == AvailabilityValue.AVAILABLE_FOR_ENABLE &
            api.demand_view != DemandPhase.IDLE &
            api.recovery_gate == RecoveryGate.OPEN &
            (api.accepted_directive == PriorityDirective.ENABLE |
              api.accepted_directive == PriorityDirective.HOLD) &
            In(commandMemory) != CommandPhase.DISABLED &
            api.power_command == PowerCommand.ENABLE_HOLD &
            (api.actuation_feedback == ActuationFeedback.ENABLED_CONFIRMED &
              commandMemory == CommandPhase.ENABLED |
              api.actuation_feedback == ActuationFeedback.DISABLED_CONFIRMED &
                commandMemory == CommandPhase.ENABLE_PENDING |
              api.actuation_feedback == ActuationFeedback.UNKNOWN &
                commandMemory == In(commandMemory)))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val previous: CommandPhase.Type = commandMemory
    val decision: Power_Propulsion_Availability_Supervisor.AvailabilityDecision = api.get_availability_decision().get
    val demand: DemandPhase.Type = api.get_demand_view().get
    val gate: RecoveryGate.Type = api.get_recovery_gate().get
    val directive: PriorityDirective.Type = api.get_accepted_directive().get
    val feedback: ActuationFeedback.Type = api.get_actuation_feedback().get
    val enabled: B = decision.decision == AvailabilityValue.AVAILABLE_FOR_ENABLE &
      demand != DemandPhase.IDLE & gate == RecoveryGate.OPEN &
      (directive == PriorityDirective.ENABLE | directive == PriorityDirective.HOLD)
    if (!enabled) {
      commandMemory = CommandPhase.DISABLED
      api.put_power_command(PowerCommand.DISABLE)
    } else if (previous == CommandPhase.DISABLED) {
      commandMemory = CommandPhase.ENABLE_PENDING
      api.put_power_command(PowerCommand.ENABLE_NEW)
    } else {
      if (feedback == ActuationFeedback.ENABLED_CONFIRMED) {
        commandMemory = CommandPhase.ENABLED
      } else if (feedback == ActuationFeedback.DISABLED_CONFIRMED) {
        commandMemory = CommandPhase.ENABLE_PENDING
      }
      api.put_power_command(PowerCommand.ENABLE_HOLD)
    }
  }

  def finalise(api: PowerCommandInterlockOwner_Operational_Api): Unit = { }
}
