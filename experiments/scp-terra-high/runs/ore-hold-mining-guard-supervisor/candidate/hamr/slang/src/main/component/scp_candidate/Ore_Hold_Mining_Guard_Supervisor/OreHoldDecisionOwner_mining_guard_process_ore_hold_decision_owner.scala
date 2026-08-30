// #Sireum

package scp_candidate.Ore_Hold_Mining_Guard_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object OreHoldDecisionOwner_mining_guard_process_ore_hold_decision_owner {

  // BEGIN STATE VARS
  var guardMode: Ore_Hold_Mining_Guard_Supervisor.GuardMode.Type = Ore_Hold_Mining_Guard_Supervisor.GuardMode.Idle
  // END STATE VARS

  def initialise(api: OreHoldDecisionOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(guardMode, api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_DECISION_SAFE
        guardMode == GuardMode.Idle &
          api.resolution_to_command.nextMode == GuardMode.Idle &
          api.resolution_to_command.reason == ResolutionReason.IdleWaiting &
          api.resolution_to_command.requestConflict == F &
          api.resolution_to_reporting.nextMode == GuardMode.Idle &
          api.resolution_to_reporting.reason == ResolutionReason.IdleWaiting &
          api.resolution_to_reporting.requestConflict == F
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    guardMode = GuardMode.Idle
    val resolution = Ore_Hold_Mining_Guard_Supervisor.GuardResolution(GuardMode.Idle, ResolutionReason.IdleWaiting, F)
    api.put_resolution_to_command(resolution)
    api.put_resolution_to_reporting(resolution)
  }

  def timeTriggered(api: OreHoldDecisionOwner_Operational_Api): Unit = { }

  def finalise(api: OreHoldDecisionOwner_Operational_Api): Unit = { }
}
