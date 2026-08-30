// #Sireum

package scp_candidate.Vehicle_Controller_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility {

  def initialise(api: CrossChannelCompatibility_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_coordination_class(Vehicle_Controller_Mode_Coordinator.CoordinationClass.Quiet)
  }

  def timeTriggered(api: CrossChannelCompatibility_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_lifecycle_assessment(), api.get_condition_assessment()) match {
      case (Some(life), Some(condition)) =>
        val coordinationClass: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type =
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
        api.put_coordination_class(coordinationClass)
    }
  }

  def finalise(api: CrossChannelCompatibility_Operational_Api): Unit = { }
}
