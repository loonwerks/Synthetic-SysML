// #Sireum

package scp_candidate.Vehicle_Controller_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration {

  var controllerMode: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type =
    Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Off

  def initialise(api: ControllerModeArbitration_Initialization_Api): Unit = {
    Contract(Modifies(controllerMode, api))
    controllerMode = Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Off
    api.put_mode_decision(Vehicle_Controller_Mode_Coordinator.ModeDecision(
      nextMode = controllerMode,
      reason = Vehicle_Controller_Mode_Coordinator.DecisionReason.NoRequest))
  }

  def timeTriggered(api: ControllerModeArbitration_Operational_Api): Unit = {
    Contract(Modifies(controllerMode, api))
    (api.get_lifecycle_assessment(), api.get_condition_assessment(), api.get_coordination_class()) match {
      case (Some(life), Some(condition), Some(kind)) =>
        val expected: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type =
          if (life == Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.InvalidLifecycle ||
              condition == Vehicle_Controller_Mode_Coordinator.ConditionAssessment.InvalidCondition) {
            Vehicle_Controller_Mode_Coordinator.CoordinationClass.InvalidEvidence
          } else if (life == Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.NoLifecycle &&
                     condition == Vehicle_Controller_Mode_Coordinator.ConditionAssessment.NoCondition) {
            Vehicle_Controller_Mode_Coordinator.CoordinationClass.Quiet
          } else if (life != Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.NoLifecycle &&
                     condition == Vehicle_Controller_Mode_Coordinator.ConditionAssessment.NoCondition) {
            Vehicle_Controller_Mode_Coordinator.CoordinationClass.LifecycleOnly
          } else if (life == Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.NoLifecycle) {
            Vehicle_Controller_Mode_Coordinator.CoordinationClass.ConditionOnly
          } else if (life == Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.OffRequested) {
            Vehicle_Controller_Mode_Coordinator.CoordinationClass.OffDominantConflict
          } else if (condition == Vehicle_Controller_Mode_Coordinator.ConditionAssessment.MaintenanceRequested ||
                     condition == Vehicle_Controller_Mode_Coordinator.ConditionAssessment.DegradedReported) {
            Vehicle_Controller_Mode_Coordinator.CoordinationClass.ConditionDominantConflict
          } else {
            Vehicle_Controller_Mode_Coordinator.CoordinationClass.RecoveryConflict
          }

        val reason: Vehicle_Controller_Mode_Coordinator.DecisionReason.Type =
          if (life == Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.InvalidLifecycle ||
              condition == Vehicle_Controller_Mode_Coordinator.ConditionAssessment.InvalidCondition ||
              kind != expected) {
            controllerMode = Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Degraded
            Vehicle_Controller_Mode_Coordinator.DecisionReason.InvalidEvidence
          } else if (life == Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.OffRequested) {
            controllerMode = Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Off
            Vehicle_Controller_Mode_Coordinator.DecisionReason.OffAccepted
          } else if (condition == Vehicle_Controller_Mode_Coordinator.ConditionAssessment.DegradedReported) {
            controllerMode = Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Degraded
            Vehicle_Controller_Mode_Coordinator.DecisionReason.DegradedAccepted
          } else if (condition == Vehicle_Controller_Mode_Coordinator.ConditionAssessment.MaintenanceRequested) {
            controllerMode = Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Maintenance
            Vehicle_Controller_Mode_Coordinator.DecisionReason.MaintenanceAccepted
          } else if (kind == Vehicle_Controller_Mode_Coordinator.CoordinationClass.RecoveryConflict) {
            Vehicle_Controller_Mode_Coordinator.DecisionReason.ConflictingRequestsRejected
          } else if (life == Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.NoLifecycle &&
                     condition == Vehicle_Controller_Mode_Coordinator.ConditionAssessment.ReturnRequested) {
            if (controllerMode == Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Maintenance ||
                controllerMode == Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Degraded) {
              controllerMode = Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Off
              Vehicle_Controller_Mode_Coordinator.DecisionReason.ReturnAccepted
            } else {
              Vehicle_Controller_Mode_Coordinator.DecisionReason.ReturnNotApplicable
            }
          } else if (life == Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.OnRequested &&
                     condition == Vehicle_Controller_Mode_Coordinator.ConditionAssessment.NoCondition &&
                     (controllerMode == Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Starting ||
                      controllerMode == Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.On)) {
            controllerMode = Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.On
            Vehicle_Controller_Mode_Coordinator.DecisionReason.OnAccepted
          } else if (life == Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.StartRequested &&
                     condition == Vehicle_Controller_Mode_Coordinator.ConditionAssessment.NoCondition &&
                     (controllerMode == Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Off ||
                      controllerMode == Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Starting)) {
            controllerMode = Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Starting
            Vehicle_Controller_Mode_Coordinator.DecisionReason.StartAccepted
          } else if (life == Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.NoLifecycle &&
                     condition == Vehicle_Controller_Mode_Coordinator.ConditionAssessment.NoCondition) {
            Vehicle_Controller_Mode_Coordinator.DecisionReason.NoRequest
          } else {
            Vehicle_Controller_Mode_Coordinator.DecisionReason.TransitionRejected
          }

        api.put_mode_decision(Vehicle_Controller_Mode_Coordinator.ModeDecision(
          nextMode = controllerMode,
          reason = reason))
    }
  }

  def finalise(api: ControllerModeArbitration_Operational_Api): Unit = { }
}
