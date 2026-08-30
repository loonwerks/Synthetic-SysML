// #Sireum

package vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import vehicle_controller_operating_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner {

  // BEGIN STATE VARS
  var modeMemory: Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Type = Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Off
  // END STATE VARS

  def initialise(api: ControllerModeTransitionOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api, modeMemory),
      Ensures(
        // BEGIN INITIALISE ENSURES initialise
        // guarantee INITIAL_MODE_OFF
        modeMemory == ControllerMode.Off &
          api.modeDecision.nextMode == modeMemory &
          api.modeDecision.reason == TransitionReason.DormantDemand
        // END INITIALISE ENSURES initialise
      )
    )
    modeMemory = ControllerMode.Off
    api.put_modeDecision(Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision(
      nextMode = ControllerMode.Off,
      reason = TransitionReason.DormantDemand))
  }

  def timeTriggered(api: ControllerModeTransitionOwner_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        modeMemory, api
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee MODE_OUTPUT_COHERENCE
        api.modeDecision.nextMode == modeMemory,
        // case CASE_26_MODE_DEGRADED
        //   episodeSnapshot nextEpisode is not ClearEpisode
        (api.episodeSnapshot.nextEpisode != DegradedEpisode.ClearEpisode) ___>: (modeMemory == ControllerMode.Degraded &
          api.modeDecision.reason == TransitionReason.FaultDominant),
        // case CASE_27_MODE_MAINTENANCE
        //   nextEpisode is ClearEpisode and nextSession is Active
        (api.episodeSnapshot.nextEpisode == DegradedEpisode.ClearEpisode &
          api.maintenanceSnapshot.nextSession == MaintenanceSession.Active) ___>: (modeMemory == ControllerMode.Maintenance &
          api.modeDecision.reason == TransitionReason.MaintenanceDominant),
        // case CASE_28_MODE_STANDBY
        //   nextEpisode is ClearEpisode, nextSession is Inactive, nextDemand is Staged
        (api.episodeSnapshot.nextEpisode == DegradedEpisode.ClearEpisode &
          api.maintenanceSnapshot.nextSession == MaintenanceSession.Inactive &
          api.demandSnapshot.nextDemand == OperatingDemand.Staged) ___>: (modeMemory == ControllerMode.Standby &
          (api.recoveryDecision == RecoveryDecision.Confirm &
            api.modeDecision.reason == TransitionReason.RecoveryConfirmed |
            api.recoveryDecision != RecoveryDecision.Confirm &
              api.modeDecision.reason == TransitionReason.StartStaged)),
        // case CASE_29_MODE_OPERATING
        //   nextEpisode is ClearEpisode, nextSession is Inactive, nextDemand is RunRequested
        (api.episodeSnapshot.nextEpisode == DegradedEpisode.ClearEpisode &
          api.maintenanceSnapshot.nextSession == MaintenanceSession.Inactive &
          api.demandSnapshot.nextDemand == OperatingDemand.RunRequested) ___>: (modeMemory == ControllerMode.Operating &
          api.modeDecision.reason == TransitionReason.RunRequested),
        // case CASE_30_MODE_OFF
        //   nextEpisode is ClearEpisode, nextSession is Inactive, nextDemand is Dormant
        (api.episodeSnapshot.nextEpisode == DegradedEpisode.ClearEpisode &
          api.maintenanceSnapshot.nextSession == MaintenanceSession.Inactive &
          api.demandSnapshot.nextDemand == OperatingDemand.Dormant) ___>: (modeMemory == ControllerMode.Off &
          api.modeDecision.reason == TransitionReason.DormantDemand)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val demandSnapshot: Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot = api.get_demandSnapshot().get
    val maintenanceSnapshot: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot = api.get_maintenanceSnapshot().get
    val episodeSnapshot: Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot = api.get_episodeSnapshot().get
    val recoveryDecision: Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type = api.get_recoveryDecision().get

    val nextEpisode: Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.Type = episodeSnapshot.nextEpisode
    val nextSession: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.Type = maintenanceSnapshot.nextSession
    val nextDemand: Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Type = demandSnapshot.nextDemand

    if (nextEpisode != DegradedEpisode.ClearEpisode) {
      // CASE_26_MODE_DEGRADED
      modeMemory = ControllerMode.Degraded
      api.put_modeDecision(Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision(
        nextMode = ControllerMode.Degraded,
        reason = TransitionReason.FaultDominant))
    } else if (nextSession == MaintenanceSession.Active) {
      // CASE_27_MODE_MAINTENANCE
      modeMemory = ControllerMode.Maintenance
      api.put_modeDecision(Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision(
        nextMode = ControllerMode.Maintenance,
        reason = TransitionReason.MaintenanceDominant))
    } else {
      nextDemand match {
        case OperatingDemand.Staged =>
          // CASE_28_MODE_STANDBY
          modeMemory = ControllerMode.Standby
          val reason: TransitionReason.Type =
            if (recoveryDecision == RecoveryDecision.Confirm) TransitionReason.RecoveryConfirmed
            else TransitionReason.StartStaged
          api.put_modeDecision(Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision(
            nextMode = ControllerMode.Standby,
            reason = reason))
        case OperatingDemand.RunRequested =>
          // CASE_29_MODE_OPERATING
          modeMemory = ControllerMode.Operating
          api.put_modeDecision(Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision(
            nextMode = ControllerMode.Operating,
            reason = TransitionReason.RunRequested))
        case OperatingDemand.Dormant =>
          // CASE_30_MODE_OFF
          modeMemory = ControllerMode.Off
          api.put_modeDecision(Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision(
            nextMode = ControllerMode.Off,
            reason = TransitionReason.DormantDemand))
      }
    }
  }

  def finalise(api: ControllerModeTransitionOwner_Operational_Api): Unit = { }
}
