// #Sireum

package scp_candidate.Vehicle_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner {

  // BEGIN STATE VARS
  var previousStart: Base_Types.Boolean = Base_Types.Boolean_example()

  var previousOn: Base_Types.Boolean = Base_Types.Boolean_example()

  var previousOff: Base_Types.Boolean = Base_Types.Boolean_example()
  // END STATE VARS

  def initialise(api: LifecycleEventOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api, previousStart, previousOn, previousOff),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_LIFECYCLE_HISTORY
        previousStart == F &
          previousOn == F &
          previousOff == F &
          api.lifecycleFacts.freshStart == F &
          api.lifecycleFacts.freshOn == F &
          api.lifecycleFacts.offActive == F &
          api.lifecycleFacts.lifecycleConflict == F
        // END INITIALIZES ENSURES
      )
    )
    previousStart = F
    previousOn = F
    previousOff = F
    api.put_lifecycleFacts(Vehicle_Mode_Coordinator.LifecycleFacts(F, F, F, F))
  }

  def timeTriggered(api: LifecycleEventOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, previousStart, previousOn, previousOff),
      Ensures(
        api.lifecycleFacts.freshStart == (api.lifecycleLevels.startLevel & !In(previousStart)) &
          api.lifecycleFacts.freshOn == (api.lifecycleLevels.onLevel & !In(previousOn)) &
          api.lifecycleFacts.offActive == api.lifecycleLevels.offLevel &
          api.lifecycleFacts.lifecycleConflict ==
            ((api.lifecycleLevels.startLevel & api.lifecycleLevels.onLevel) |
             (api.lifecycleLevels.startLevel & api.lifecycleLevels.offLevel) |
             (api.lifecycleLevels.onLevel & api.lifecycleLevels.offLevel)) &
          previousStart == api.lifecycleLevels.startLevel &
          previousOn == api.lifecycleLevels.onLevel &
          previousOff == api.lifecycleLevels.offLevel
      )
    )
    val levels: Vehicle_Mode_Coordinator.LifecycleLevels = api.get_lifecycleLevels().get
    api.put_lifecycleFacts(Vehicle_Mode_Coordinator.LifecycleFacts(
      levels.startLevel & !previousStart,
      levels.onLevel & !previousOn,
      levels.offLevel,
      (levels.startLevel & levels.onLevel) |
        (levels.startLevel & levels.offLevel) |
        (levels.onLevel & levels.offLevel)))
    previousStart = levels.startLevel
    previousOn = levels.onLevel
    previousOff = levels.offLevel
  }

  def finalise(api: LifecycleEventOwner_Operational_Api): Unit = { }
}
