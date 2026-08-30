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
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_power_command(Power_Propulsion_Availability_Supervisor.PowerCommand.DISABLE)
  }

  def timeTriggered(api: PowerCommandInterlockOwner_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        commandMemory
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee COMPLETE_COMMAND_INTERLOCK
        //   power command follows availability, demand, recovery gate, directive, and command memory
        (api.availability_decision.decision != AvailabilityValue.AVAILABLE_FOR_ENABLE |
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
            commandMemory == CommandPhase.ENABLED &
            api.power_command == PowerCommand.ENABLE_HOLD |
          api.availability_decision.decision == AvailabilityValue.AVAILABLE_FOR_ENABLE &
            api.demand_view != DemandPhase.IDLE &
            api.recovery_gate == RecoveryGate.OPEN &
            (api.accepted_directive == PriorityDirective.ENABLE |
              api.accepted_directive == PriorityDirective.HOLD) &
            In(commandMemory) != CommandPhase.DISABLED &
            commandMemory == CommandPhase.ENABLE_PENDING &
            api.power_command == PowerCommand.ENABLE_NEW |
          api.availability_decision.decision == AvailabilityValue.AVAILABLE_FOR_ENABLE &
            api.demand_view != DemandPhase.IDLE &
            api.recovery_gate == RecoveryGate.OPEN &
            (api.accepted_directive == PriorityDirective.ENABLE |
              api.accepted_directive == PriorityDirective.HOLD) &
            In(commandMemory) != CommandPhase.DISABLED &
            api.actuation_feedback == ActuationFeedback.ENABLED_CONFIRMED &
            commandMemory == CommandPhase.ENABLED &
            api.power_command == PowerCommand.ENABLE_HOLD |
          api.availability_decision.decision == AvailabilityValue.AVAILABLE_FOR_ENABLE &
            api.demand_view != DemandPhase.IDLE &
            api.recovery_gate == RecoveryGate.OPEN &
            (api.accepted_directive == PriorityDirective.ENABLE |
              api.accepted_directive == PriorityDirective.HOLD) &
            In(commandMemory) != CommandPhase.DISABLED &
            api.actuation_feedback == ActuationFeedback.DISABLED_CONFIRMED &
            commandMemory == CommandPhase.ENABLE_PENDING &
            api.power_command == PowerCommand.ENABLE_NEW |
          api.availability_decision.decision == AvailabilityValue.AVAILABLE_FOR_ENABLE &
            api.demand_view != DemandPhase.IDLE &
            api.recovery_gate == RecoveryGate.OPEN &
            (api.accepted_directive == PriorityDirective.ENABLE |
              api.accepted_directive == PriorityDirective.HOLD) &
            In(commandMemory) != CommandPhase.DISABLED &
            api.actuation_feedback == ActuationFeedback.UNKNOWN &
            commandMemory == In(commandMemory) &
            api.power_command == PowerCommand.ENABLE_HOLD
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_actuation_feedback: Option[Power_Propulsion_Availability_Supervisor.ActuationFeedback.Type] = api.get_actuation_feedback()
    api.logInfo(s"Received on data port actuation_feedback: ${apiUsage_actuation_feedback}")
    val apiUsage_availability_decision: Option[Power_Propulsion_Availability_Supervisor.AvailabilityDecision] = api.get_availability_decision()
    api.logInfo(s"Received on data port availability_decision: ${apiUsage_availability_decision}")
    val apiUsage_demand_view: Option[Power_Propulsion_Availability_Supervisor.DemandPhase.Type] = api.get_demand_view()
    api.logInfo(s"Received on data port demand_view: ${apiUsage_demand_view}")
    val apiUsage_recovery_gate: Option[Power_Propulsion_Availability_Supervisor.RecoveryGate.Type] = api.get_recovery_gate()
    api.logInfo(s"Received on data port recovery_gate: ${apiUsage_recovery_gate}")
    val apiUsage_accepted_directive: Option[Power_Propulsion_Availability_Supervisor.PriorityDirective.Type] = api.get_accepted_directive()
    api.logInfo(s"Received on data port accepted_directive: ${apiUsage_accepted_directive}")
  }

  def finalise(api: PowerCommandInterlockOwner_Operational_Api): Unit = { }
}
