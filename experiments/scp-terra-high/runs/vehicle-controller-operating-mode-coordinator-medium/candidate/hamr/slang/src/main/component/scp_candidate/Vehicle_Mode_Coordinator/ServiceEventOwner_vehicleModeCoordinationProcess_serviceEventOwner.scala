// #Sireum

package scp_candidate.Vehicle_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner {

  // BEGIN STATE VARS
  var previousMaintenance: Base_Types.Boolean = Base_Types.Boolean_example()

  var previousReturn: Base_Types.Boolean = Base_Types.Boolean_example()
  // END STATE VARS

  def initialise(api: ServiceEventOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api, previousMaintenance, previousReturn),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_SERVICE_HISTORY
        previousMaintenance == F &
          previousReturn == F &
          api.serviceFacts.freshMaintenance == F &
          api.serviceFacts.freshReturn == F &
          api.serviceFacts.serviceConflict == F
        // END INITIALIZES ENSURES
      )
    )
    previousMaintenance = F
    previousReturn = F
    api.put_serviceFacts(Vehicle_Mode_Coordinator.ServiceFacts(F, F, F))
  }

  def timeTriggered(api: ServiceEventOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, previousMaintenance, previousReturn),
      Ensures(
        api.serviceFacts.freshMaintenance ==
          (api.serviceLevels.maintenanceLevel & !In(previousMaintenance)) &
        api.serviceFacts.freshReturn ==
          (api.serviceLevels.returnNormalLevel & !In(previousReturn)) &
        api.serviceFacts.serviceConflict ==
          (api.serviceLevels.maintenanceLevel & api.serviceLevels.returnNormalLevel) &
        previousMaintenance == api.serviceLevels.maintenanceLevel &
        previousReturn == api.serviceLevels.returnNormalLevel
      )
    )
    val levels: Vehicle_Mode_Coordinator.ServiceLevels = api.get_serviceLevels().get
    api.put_serviceFacts(Vehicle_Mode_Coordinator.ServiceFacts(
      levels.maintenanceLevel & !previousMaintenance,
      levels.returnNormalLevel & !previousReturn,
      levels.maintenanceLevel & levels.returnNormalLevel))
    previousMaintenance = levels.maintenanceLevel
    previousReturn = levels.returnNormalLevel
  }

  def finalise(api: ServiceEventOwner_Operational_Api): Unit = { }
}
