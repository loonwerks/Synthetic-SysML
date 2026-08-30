// #Sireum

package ore_hold_mining_guard_supervisor.Ore_Hold_Mining_Guard_Supervisor

import org.sireum._
import ore_hold_mining_guard_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner {

  def initialise(api: MiningCommandDerivationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_mining_command(Ore_Hold_Mining_Guard_Supervisor.MiningCommand.StopMining)
  }

  def timeTriggered(api: MiningCommandDerivationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_guard_resolution: Option[Ore_Hold_Mining_Guard_Supervisor.GuardResolution] = api.get_guard_resolution()
    api.logInfo(s"Received on data port guard_resolution: ${apiUsage_guard_resolution}")
  }

  def finalise(api: MiningCommandDerivationOwner_Operational_Api): Unit = { }
}
