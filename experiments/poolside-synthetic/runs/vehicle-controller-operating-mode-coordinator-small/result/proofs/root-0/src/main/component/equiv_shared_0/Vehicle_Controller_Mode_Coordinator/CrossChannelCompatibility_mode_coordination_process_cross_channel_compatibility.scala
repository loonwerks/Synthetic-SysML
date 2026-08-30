// #Sireum

package equiv_shared_0.Vehicle_Controller_Mode_Coordinator

import org.sireum._
import equiv_shared_0._

object CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility {
  // BEGIN FUNCTIONS
  @strictpure def classify(life: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type, cond: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type): Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type = if (life == LifecycleAssessment.InvalidLifecycle |
        cond == ConditionAssessment.InvalidCondition) CoordinationClass.InvalidEvidence else if (life == LifecycleAssessment.NoLifecycle &
          cond == ConditionAssessment.NoCondition) CoordinationClass.Quiet else if (life != LifecycleAssessment.NoLifecycle &
          cond == ConditionAssessment.NoCondition) CoordinationClass.LifecycleOnly else if (life == LifecycleAssessment.NoLifecycle &
          cond != ConditionAssessment.NoCondition) CoordinationClass.ConditionOnly else if (life == LifecycleAssessment.OffRequested) CoordinationClass.OffDominantConflict else if ((life == LifecycleAssessment.StartRequested |
          life == LifecycleAssessment.OnRequested) &
          (cond == ConditionAssessment.MaintenanceRequested |
            cond == ConditionAssessment.DegradedReported)) CoordinationClass.ConditionDominantConflict else CoordinationClass.RecoveryConflict
  // END FUNCTIONS
}
