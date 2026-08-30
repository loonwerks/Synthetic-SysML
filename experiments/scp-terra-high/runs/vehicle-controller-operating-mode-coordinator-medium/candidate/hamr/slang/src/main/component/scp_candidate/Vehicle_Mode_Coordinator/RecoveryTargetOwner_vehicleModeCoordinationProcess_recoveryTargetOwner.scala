// #Sireum

package scp_candidate.Vehicle_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner {

  // BEGIN STATE VARS
  var recoveryTarget: Vehicle_Mode_Coordinator.RecoveryTarget.Type = Vehicle_Mode_Coordinator.RecoveryTarget.Off
  // END STATE VARS

  def initialise(api: RecoveryTargetOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api, recoveryTarget),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_RECOVERY_TARGET
        recoveryTarget == RecoveryTarget.Off &
          api.storedRecoveryTarget == RecoveryTarget.Off
        // END INITIALIZES ENSURES
      )
    )
    recoveryTarget = RecoveryTarget.Off
    api.put_storedRecoveryTarget(RecoveryTarget.Off)
  }

  def timeTriggered(api: RecoveryTargetOwner_Operational_Api): Unit = {
    Contract(Modifies(api, recoveryTarget))
    val mode: Vehicle_Mode_Coordinator.ControllerMode.Type = api.get_currentMode().get
    val resolution: Vehicle_Mode_Coordinator.TransitionResolution = api.get_appliedResolution().get
    api.put_storedRecoveryTarget(recoveryTarget)
    if (resolution.nextMode == ControllerMode.Degraded) {
      recoveryTarget =
        if (mode == ControllerMode.Starting) RecoveryTarget.Starting
        else if (mode == ControllerMode.On) RecoveryTarget.On
        else if (mode == ControllerMode.Degraded) recoveryTarget
        else RecoveryTarget.Off
    } else if (mode == ControllerMode.Degraded) {
      recoveryTarget = RecoveryTarget.Off
    }
  }

  def finalise(api: RecoveryTargetOwner_Operational_Api): Unit = { }
}
