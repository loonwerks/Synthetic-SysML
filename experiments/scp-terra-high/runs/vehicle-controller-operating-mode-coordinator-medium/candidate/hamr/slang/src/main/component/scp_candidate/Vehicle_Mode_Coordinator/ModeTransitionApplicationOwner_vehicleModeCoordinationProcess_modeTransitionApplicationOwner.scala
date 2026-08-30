// #Sireum

package scp_candidate.Vehicle_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner {

  // BEGIN STATE VARS
  var controllerMode: Vehicle_Mode_Coordinator.ControllerMode.Type = Vehicle_Mode_Coordinator.ControllerMode.Off
  // END STATE VARS

  def initialise(api: ModeTransitionApplicationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api, controllerMode),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_CONTROLLER_MODE
        controllerMode == ControllerMode.Off &
          api.modeForQualification == ControllerMode.Off &
          api.modeForRecovery == ControllerMode.Off &
          api.resolutionForRecovery.nextMode == ControllerMode.Off &
          api.resolutionForRecovery.kind == TransitionKind.Stay &
          api.resolutionForRecovery.accepted &
          api.resolutionForPublication.nextMode == ControllerMode.Off &
          api.resolutionForPublication.kind == TransitionKind.Stay &
          api.resolutionForPublication.accepted &
          api.appliedNextMode == ControllerMode.Off
        // END INITIALIZES ENSURES
      )
    )
    controllerMode = ControllerMode.Off
    val initial: Vehicle_Mode_Coordinator.TransitionResolution =
      Vehicle_Mode_Coordinator.TransitionResolution(ControllerMode.Off, TransitionKind.Stay, T)
    api.put_modeForQualification(ControllerMode.Off)
    api.put_modeForRecovery(ControllerMode.Off)
    api.put_resolutionForRecovery(initial)
    api.put_resolutionForPublication(initial)
    api.put_appliedNextMode(ControllerMode.Off)
  }

  def timeTriggered(api: ModeTransitionApplicationOwner_Operational_Api): Unit = {
    Contract(Modifies(api, controllerMode))
    val storedTarget: Vehicle_Mode_Coordinator.RecoveryTarget.Type = api.get_storedRecoveryTarget().get
    val qualified: Vehicle_Mode_Coordinator.QualifiedTransition.Type = api.get_qualifiedTransition().get
    val preMode: Vehicle_Mode_Coordinator.ControllerMode.Type = controllerMode
    val resolution: Vehicle_Mode_Coordinator.TransitionResolution = qualified match {
      case QualifiedTransition.QualifiedStay =>
        Vehicle_Mode_Coordinator.TransitionResolution(preMode, TransitionKind.Stay, T)
      case QualifiedTransition.QualifiedReject =>
        Vehicle_Mode_Coordinator.TransitionResolution(preMode, TransitionKind.Reject, F)
      case QualifiedTransition.QualifiedGoOff =>
        Vehicle_Mode_Coordinator.TransitionResolution(ControllerMode.Off, TransitionKind.GoOff, T)
      case QualifiedTransition.QualifiedGoStarting =>
        Vehicle_Mode_Coordinator.TransitionResolution(ControllerMode.Starting, TransitionKind.GoStarting, T)
      case QualifiedTransition.QualifiedGoOn =>
        Vehicle_Mode_Coordinator.TransitionResolution(ControllerMode.On, TransitionKind.GoOn, T)
      case QualifiedTransition.QualifiedGoMaintenance =>
        Vehicle_Mode_Coordinator.TransitionResolution(ControllerMode.Maintenance, TransitionKind.GoMaintenance, T)
      case QualifiedTransition.QualifiedGoDegraded =>
        Vehicle_Mode_Coordinator.TransitionResolution(ControllerMode.Degraded, TransitionKind.GoDegraded, T)
      case QualifiedTransition.QualifiedResumeStored =>
        val next: Vehicle_Mode_Coordinator.ControllerMode.Type = storedTarget match {
          case RecoveryTarget.Off => ControllerMode.Off
          case RecoveryTarget.Starting => ControllerMode.Starting
          case RecoveryTarget.On => ControllerMode.On
        }
        Vehicle_Mode_Coordinator.TransitionResolution(next, TransitionKind.ResumeStored, T)
    }
    api.put_modeForQualification(preMode)
    api.put_modeForRecovery(preMode)
    api.put_resolutionForRecovery(resolution)
    api.put_resolutionForPublication(resolution)
    controllerMode = resolution.nextMode
    api.put_appliedNextMode(resolution.nextMode)
  }

  def finalise(api: ModeTransitionApplicationOwner_Operational_Api): Unit = { }
}
