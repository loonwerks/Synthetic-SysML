// #Sireum

package scp_candidate.Docked_Service_Access_Lifecycle_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleController_supervisorProcess_lifecycleController {

  // BEGIN STATE VARS
  var lifecycleMemory: Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.Type = Docked_Service_Access_Lifecycle_Supervisor.LifecycleState.IDLE_OUTSIDE
  // END STATE VARS

  def initialise(api: LifecycleController_Initialization_Api): Unit = {
    Contract(
      Modifies(api, lifecycleMemory),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee LIFECYCLE_INITIAL_SAFE
        lifecycleMemory == LifecycleState.IDLE_OUTSIDE &&
          api.monitorPrestate == LifecycleState.IDLE_OUTSIDE &&
          api.arbiterPrestate == LifecycleState.IDLE_OUTSIDE &&
          api.controlProposal.movement == MovementProposal.HOLD_MOVEMENT &&
          api.controlProposal.access == AccessProposal.LOCK_ACCESS &&
          api.lifecycleSnapshot.next_state == SnapshotLifecycleState.IDLE_OUTSIDE &&
          api.lifecycleSnapshot.result == LifecycleResult.NONE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    lifecycleMemory = LifecycleState.IDLE_OUTSIDE
    api.put_monitorPrestate(LifecycleState.IDLE_OUTSIDE)
    api.put_arbiterPrestate(LifecycleState.IDLE_OUTSIDE)
    api.put_controlProposal(ControlProposal(MovementProposal.HOLD_MOVEMENT, AccessProposal.LOCK_ACCESS))
    api.put_lifecycleSnapshot(LifecycleSnapshot(SnapshotLifecycleState.IDLE_OUTSIDE, LifecycleResult.NONE))
  }

  def timeTriggered(api: LifecycleController_Operational_Api): Unit = {
    Contract(Modifies(api, lifecycleMemory))
    val previous: LifecycleState.Type = lifecycleMemory
    lifecycleMemory = LifecycleState.RECOVERY_REQUIRED
    val proposal: ControlProposal = ControlProposal(MovementProposal.HOLD_MOVEMENT, AccessProposal.LOCK_ACCESS)
    val snapshot: LifecycleSnapshot = LifecycleSnapshot(SnapshotLifecycleState.RECOVERY_REQUIRED, LifecycleResult.RECOVERY_LATCHED)
    api.put_monitorPrestate(previous)
    api.put_arbiterPrestate(previous)
    api.put_controlProposal(proposal)
    api.put_lifecycleSnapshot(snapshot)
  }

  def finalise(api: LifecycleController_Operational_Api): Unit = { }
}
