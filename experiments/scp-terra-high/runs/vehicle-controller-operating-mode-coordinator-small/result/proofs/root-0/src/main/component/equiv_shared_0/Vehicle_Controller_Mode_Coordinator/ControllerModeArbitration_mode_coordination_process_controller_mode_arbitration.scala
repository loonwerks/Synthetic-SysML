// #Sireum

package equiv_shared_0.Vehicle_Controller_Mode_Coordinator

import org.sireum._
import equiv_shared_0._

object ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration {
  // BEGIN FUNCTIONS
  @strictpure def expected_class(life: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type, cond: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type): Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type = if (life == LifecycleAssessment.InvalidLifecycle |
        cond == ConditionAssessment.InvalidCondition) CoordinationClass.InvalidEvidence else if (life == LifecycleAssessment.NoLifecycle &
          cond == ConditionAssessment.NoCondition) CoordinationClass.Quiet else if (life != LifecycleAssessment.NoLifecycle &
          cond == ConditionAssessment.NoCondition) CoordinationClass.LifecycleOnly else if (life == LifecycleAssessment.NoLifecycle &
          cond != ConditionAssessment.NoCondition) CoordinationClass.ConditionOnly else if (life == LifecycleAssessment.OffRequested) CoordinationClass.OffDominantConflict else if ((life == LifecycleAssessment.StartRequested |
          life == LifecycleAssessment.OnRequested) &
          (cond == ConditionAssessment.MaintenanceRequested |
            cond == ConditionAssessment.DegradedReported)) CoordinationClass.ConditionDominantConflict else CoordinationClass.RecoveryConflict

  @strictpure def consistent(life: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type, cond: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type, kind: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type): Base_Types.Boolean = kind == expected_class(life, cond)

  @strictpure def guard_case_01(life: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type, cond: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type, kind: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type): Base_Types.Boolean = life == LifecycleAssessment.InvalidLifecycle |
    cond == ConditionAssessment.InvalidCondition |
    !(consistent(life, cond, kind))

  @strictpure def guard_case_02(life: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type, cond: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type, kind: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type): Base_Types.Boolean = !(guard_case_01(life, cond, kind)) &
    life == LifecycleAssessment.OffRequested

  @strictpure def guard_case_03(life: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type, cond: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type, kind: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type): Base_Types.Boolean = !(guard_case_01(life, cond, kind)) & !(guard_case_02(life, cond, kind)) &
    cond == ConditionAssessment.DegradedReported

  @strictpure def guard_case_04(life: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type, cond: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type, kind: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type): Base_Types.Boolean = !(guard_case_01(life, cond, kind)) & !(guard_case_02(life, cond, kind)) &
    !(guard_case_03(life, cond, kind)) &
    cond == ConditionAssessment.MaintenanceRequested

  @strictpure def guard_case_05(life: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type, cond: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type, kind: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type): Base_Types.Boolean = !(guard_case_01(life, cond, kind)) & !(guard_case_02(life, cond, kind)) &
    !(guard_case_03(life, cond, kind)) &
    !(guard_case_04(life, cond, kind)) &
    kind == CoordinationClass.RecoveryConflict

  @strictpure def guard_case_06(life: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type, cond: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type, kind: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type, mode: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type): Base_Types.Boolean = !(guard_case_01(life, cond, kind)) & !(guard_case_02(life, cond, kind)) &
    !(guard_case_03(life, cond, kind)) &
    !(guard_case_04(life, cond, kind)) &
    !(guard_case_05(life, cond, kind)) &
    life == LifecycleAssessment.NoLifecycle &
    cond == ConditionAssessment.ReturnRequested &
    (mode == ControllerModeDisposition.Maintenance |
      mode == ControllerModeDisposition.Degraded)

  @strictpure def guard_case_07(life: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type, cond: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type, kind: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type, mode: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type): Base_Types.Boolean = !(guard_case_01(life, cond, kind)) & !(guard_case_02(life, cond, kind)) &
    !(guard_case_03(life, cond, kind)) &
    !(guard_case_04(life, cond, kind)) &
    !(guard_case_05(life, cond, kind)) &
    !(guard_case_06(life, cond, kind, mode)) &
    life == LifecycleAssessment.NoLifecycle &
    cond == ConditionAssessment.ReturnRequested

  @strictpure def guard_case_08(life: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type, cond: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type, kind: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type, mode: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type): Base_Types.Boolean = !(guard_case_01(life, cond, kind)) & !(guard_case_02(life, cond, kind)) &
    !(guard_case_03(life, cond, kind)) &
    !(guard_case_04(life, cond, kind)) &
    !(guard_case_05(life, cond, kind)) &
    !(guard_case_06(life, cond, kind, mode)) &
    !(guard_case_07(life, cond, kind, mode)) &
    life == LifecycleAssessment.OnRequested &
    cond == ConditionAssessment.NoCondition &
    (mode == ControllerModeDisposition.Starting |
      mode == ControllerModeDisposition.On)

  @strictpure def guard_case_09(life: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type, cond: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type, kind: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type, mode: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type): Base_Types.Boolean = !(guard_case_01(life, cond, kind)) & !(guard_case_02(life, cond, kind)) &
    !(guard_case_03(life, cond, kind)) &
    !(guard_case_04(life, cond, kind)) &
    !(guard_case_05(life, cond, kind)) &
    !(guard_case_06(life, cond, kind, mode)) &
    !(guard_case_07(life, cond, kind, mode)) &
    !(guard_case_08(life, cond, kind, mode)) &
    life == LifecycleAssessment.StartRequested &
    cond == ConditionAssessment.NoCondition &
    (mode == ControllerModeDisposition.Off |
      mode == ControllerModeDisposition.Starting)

  @strictpure def guard_case_10(life: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type, cond: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type, kind: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type, mode: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type): Base_Types.Boolean = !(guard_case_01(life, cond, kind)) & !(guard_case_02(life, cond, kind)) &
    !(guard_case_03(life, cond, kind)) &
    !(guard_case_04(life, cond, kind)) &
    !(guard_case_05(life, cond, kind)) &
    !(guard_case_06(life, cond, kind, mode)) &
    !(guard_case_07(life, cond, kind, mode)) &
    !(guard_case_08(life, cond, kind, mode)) &
    !(guard_case_09(life, cond, kind, mode)) &
    life == LifecycleAssessment.NoLifecycle &
    cond == ConditionAssessment.NoCondition

  @strictpure def guard_case_11(life: Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type, cond: Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type, kind: Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type, mode: Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type): Base_Types.Boolean = !(guard_case_01(life, cond, kind)) & !(guard_case_02(life, cond, kind)) &
    !(guard_case_03(life, cond, kind)) &
    !(guard_case_04(life, cond, kind)) &
    !(guard_case_05(life, cond, kind)) &
    !(guard_case_06(life, cond, kind, mode)) &
    !(guard_case_07(life, cond, kind, mode)) &
    !(guard_case_08(life, cond, kind, mode)) &
    !(guard_case_09(life, cond, kind, mode)) &
    !(guard_case_10(life, cond, kind, mode))
  // END FUNCTIONS
}
