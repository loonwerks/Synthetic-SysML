// #Sireum

package scp_candidate.Power_Propulsion_Availability_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PowerCommandInterlockOwner_supervisor_process_power_command_interlock {

  def initialise(api: PowerCommandInterlockOwner_Initialization_Api): Unit = {
    Contract(Modifies(api), Ensures(
      // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_COMMAND_DISABLED
        api.power_command == PowerCommand.DISABLE
        // END INITIALIZES ENSURES
    ))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_power_command(Power_Propulsion_Availability_Supervisor.PowerCommand.DISABLE)
  }

  def timeTriggered(api: PowerCommandInterlockOwner_Operational_Api): Unit = { }
  def finalise(api: PowerCommandInterlockOwner_Operational_Api): Unit = { }
}
