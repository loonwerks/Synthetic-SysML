// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PowerCommandInterlockOwner_supervisor_process_power_command_interlock {

  // The semantic CommandPhase is contract-only, so retain its three values
  // locally as 0 = DISABLED, 1 = ENABLE_PENDING, and 2 = ENABLED.
  var commandMemory: Z = 0

  def initialise(api: PowerCommandInterlockOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, commandMemory))
    commandMemory = 0
    api.put_power_command(PowerCommand.DISABLE)
  }

  def timeTriggered(api: PowerCommandInterlockOwner_Operational_Api): Unit = {
    Contract(Modifies(api, commandMemory))
    commandMemory = 0
    api.put_power_command(PowerCommand.DISABLE)
  }

  def finalise(api: PowerCommandInterlockOwner_Operational_Api): Unit = { }
}
