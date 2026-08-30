// #Sireum

package vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import vehicle_controller_operating_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner {

  // BEGIN STATE VARS
  var previousMaintenance: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type =
    Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Invalid
  // END STATE VARS

  def initialise(api: MaintenanceEpochOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api, previousMaintenance),
      Ensures(
        // BEGIN INITIALISE ENSURES initialise
        // guarantee INITIAL_MAINTENANCE_HISTORY_INVALID
        previousMaintenance == IndicationLevel.Invalid &
          api.factsToConflict.active == F &
          api.factsToConflict.fresh == F &
          api.factsToConflict.cleared == F &
          api.factsToConflict.held == F &
          api.factsToConflict.invalid &
          api.factsToPriority == api.factsToConflict &
          api.factsToSession == api.factsToConflict
        // END INITIALISE ENSURES initialise
      )
    )
    previousMaintenance = IndicationLevel.Invalid

    val f: MaintenanceEpochFacts = MaintenanceEpochFacts(
      active = F,
      fresh = F,
      cleared = F,
      held = F,
      invalid = T)
    api.put_factsToConflict(f)
    api.put_factsToPriority(f)
    api.put_factsToSession(f)
  }

  def timeTriggered(api: MaintenanceEpochOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, previousMaintenance),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee MAINTENANCE_EPOCH_DERIVATION
        api.factsToConflict.active == (api.maintenanceIndication.level == IndicationLevel.Asserted) &
          api.factsToConflict.fresh == (In(previousMaintenance) == IndicationLevel.Clear &
            api.maintenanceIndication.level == IndicationLevel.Asserted) &
          api.factsToConflict.cleared == (In(previousMaintenance) == IndicationLevel.Asserted &
            api.maintenanceIndication.level == IndicationLevel.Clear) &
          api.factsToConflict.held == (In(previousMaintenance) == IndicationLevel.Asserted &
            api.maintenanceIndication.level == IndicationLevel.Asserted) &
          api.factsToConflict.invalid == (api.maintenanceIndication.level == IndicationLevel.Invalid) &
          api.factsToPriority == api.factsToConflict &
          api.factsToSession == api.factsToConflict &
          previousMaintenance == api.maintenanceIndication.level
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val maintenanceIndication: Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication =
      api.get_maintenanceIndication().get

    val level: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type = maintenanceIndication.level

    val f: MaintenanceEpochFacts = MaintenanceEpochFacts(
      active = (level == IndicationLevel.Asserted),
      fresh = (previousMaintenance == IndicationLevel.Clear & level == IndicationLevel.Asserted),
      cleared = (previousMaintenance == IndicationLevel.Asserted & level == IndicationLevel.Clear),
      held = (previousMaintenance == IndicationLevel.Asserted & level == IndicationLevel.Asserted),
      invalid = (level == IndicationLevel.Invalid))

    api.put_factsToConflict(f)
    api.put_factsToPriority(f)
    api.put_factsToSession(f)

    previousMaintenance = level
  }

  def finalise(api: MaintenanceEpochOwner_Operational_Api): Unit = { }
}
