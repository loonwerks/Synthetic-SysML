// #Sireum

package scp_candidate.Ore_Hold_Mining_Guard_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner {

  def initialise(api: MiningCommandDerivationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_MINING_COMMAND_SAFE
        api.mining_command == MiningCommand.StopMining
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_mining_command(Ore_Hold_Mining_Guard_Supervisor.MiningCommand.StopMining)
  }

  def timeTriggered(api: MiningCommandDerivationOwner_Operational_Api): Unit = { }

  def finalise(api: MiningCommandDerivationOwner_Operational_Api): Unit = { }
}
