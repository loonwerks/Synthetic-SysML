// #Sireum

package vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import vehicle_controller_operating_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner {

  def initialise(api: ConflictClassificationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALISE ENSURES initialise
        // guarantee INITIAL_CONFLICT_FAIL_CLOSED
        api.conflictToPriority == ConflictClass.InputInvalid &
          api.conflictToRecovery == api.conflictToPriority
        // END INITIALISE ENSURES initialise
      )
    )
    api.put_conflictToPriority(ConflictClass.InputInvalid)
    api.put_conflictToRecovery(ConflictClass.InputInvalid)
  }

  def timeTriggered(api: ConflictClassificationOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee CONFLICT_CARDINALITY_CLASSIFICATION
        api.conflictToRecovery == api.conflictToPriority &
          ((api.lifecycleFacts.anyInvalid | api.maintenanceFacts.invalid |
            api.degradationFacts.invalid |
            api.returnFacts.invalid) &
            api.conflictToPriority == ConflictClass.InputInvalid) |
          (api.lifecycleFacts.anyInvalid | api.maintenanceFacts.invalid |
            api.degradationFacts.invalid |
            api.returnFacts.invalid) == F &
            (api.degradationFacts.active & api.lifecycleFacts.offActive |
              api.degradationFacts.active & api.maintenanceFacts.active |
              api.degradationFacts.active & api.returnFacts.fresh |
              api.degradationFacts.active & api.lifecycleFacts.freshOn |
              api.degradationFacts.active & api.lifecycleFacts.freshStart |
              api.lifecycleFacts.offActive & api.maintenanceFacts.active |
              api.lifecycleFacts.offActive & api.returnFacts.fresh |
              api.lifecycleFacts.offActive & api.lifecycleFacts.freshOn |
              api.lifecycleFacts.offActive & api.lifecycleFacts.freshStart |
              api.maintenanceFacts.active & api.returnFacts.fresh |
              api.maintenanceFacts.active & api.lifecycleFacts.freshOn |
              api.maintenanceFacts.active & api.lifecycleFacts.freshStart |
              api.returnFacts.fresh & api.lifecycleFacts.freshOn |
              api.returnFacts.fresh & api.lifecycleFacts.freshStart |
              api.lifecycleFacts.freshOn & api.lifecycleFacts.freshStart) &
            api.conflictToPriority == ConflictClass.MultipleActionable |
          (api.lifecycleFacts.anyInvalid | api.maintenanceFacts.invalid |
            api.degradationFacts.invalid |
            api.returnFacts.invalid) == F &
            (api.degradationFacts.active & api.lifecycleFacts.offActive |
              api.degradationFacts.active & api.maintenanceFacts.active |
              api.degradationFacts.active & api.returnFacts.fresh |
              api.degradationFacts.active & api.lifecycleFacts.freshOn |
              api.degradationFacts.active & api.lifecycleFacts.freshStart |
              api.lifecycleFacts.offActive & api.maintenanceFacts.active |
              api.lifecycleFacts.offActive & api.returnFacts.fresh |
              api.lifecycleFacts.offActive & api.lifecycleFacts.freshOn |
              api.lifecycleFacts.offActive & api.lifecycleFacts.freshStart |
              api.maintenanceFacts.active & api.returnFacts.fresh |
              api.maintenanceFacts.active & api.lifecycleFacts.freshOn |
              api.maintenanceFacts.active & api.lifecycleFacts.freshStart |
              api.returnFacts.fresh & api.lifecycleFacts.freshOn |
              api.returnFacts.fresh & api.lifecycleFacts.freshStart |
              api.lifecycleFacts.freshOn & api.lifecycleFacts.freshStart) == F &
            api.conflictToPriority == ConflictClass.SingleOrNone
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val lifecycleFacts: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts = api.get_lifecycleFacts().get
    val maintenanceFacts: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts = api.get_maintenanceFacts().get
    val degradationFacts: Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts = api.get_degradationFacts().get
    val returnFacts: Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts = api.get_returnFacts().get

    val anyInvalid: B =
      lifecycleFacts.anyInvalid | maintenanceFacts.invalid |
        degradationFacts.invalid | returnFacts.invalid

    val actionable: B =
      (degradationFacts.active & lifecycleFacts.offActive) |
        (degradationFacts.active & maintenanceFacts.active) |
        (degradationFacts.active & returnFacts.fresh) |
        (degradationFacts.active & lifecycleFacts.freshOn) |
        (degradationFacts.active & lifecycleFacts.freshStart) |
        (lifecycleFacts.offActive & maintenanceFacts.active) |
        (lifecycleFacts.offActive & returnFacts.fresh) |
        (lifecycleFacts.offActive & lifecycleFacts.freshOn) |
        (lifecycleFacts.offActive & lifecycleFacts.freshStart) |
        (maintenanceFacts.active & returnFacts.fresh) |
        (maintenanceFacts.active & lifecycleFacts.freshOn) |
        (maintenanceFacts.active & lifecycleFacts.freshStart) |
        (returnFacts.fresh & lifecycleFacts.freshOn) |
        (returnFacts.fresh & lifecycleFacts.freshStart) |
        (lifecycleFacts.freshOn & lifecycleFacts.freshStart)

    val conflict: ConflictClass.Type =
      if (anyInvalid) ConflictClass.InputInvalid
      else (if (actionable) ConflictClass.MultipleActionable else ConflictClass.SingleOrNone)

    api.put_conflictToPriority(conflict)
    api.put_conflictToRecovery(conflict)
  }

  def finalise(api: ConflictClassificationOwner_Operational_Api): Unit = { }
}
