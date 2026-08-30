// #Sireum

package vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import vehicle_controller_operating_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner {

  // BEGIN STATE VARS
  var previousStart: Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.Type =
    Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.Invalid
  var previousOn: Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.Type =
    Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.Invalid
  var previousOff: Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.Type =
    Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.Invalid
  // END STATE VARS

  def initialise(api: LifecycleEpochOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api, previousStart, previousOn, previousOff),
      Ensures(
        // BEGIN INITIALISE ENSURES initialise
        // guarantee INITIAL_LIFECYCLE_HISTORY_INVALID
        previousStart == StartIndicationLevel.Invalid &
          previousOn == OnIndicationLevel.Invalid &
          previousOff == OffIndicationLevel.Invalid &
          api.factsToConflict.freshStart &
          api.factsToConflict.freshOn &
          api.factsToConflict.offActive &
          api.factsToConflict.heldStart &
          api.factsToConflict.heldOn &
          api.factsToConflict.heldOff &
          api.factsToConflict.anyInvalid &
          api.factsToPriority == api.factsToConflict
        // END INITIALISE ENSURES initialise
      )
    )
    previousStart = StartIndicationLevel.Invalid
    previousOn = OnIndicationLevel.Invalid
    previousOff = OffIndicationLevel.Invalid

    val f: LifecycleEpochFacts = LifecycleEpochFacts(
      freshStart = T,
      freshOn = T,
      offActive = T,
      heldStart = T,
      heldOn = T,
      heldOff = T,
      anyInvalid = T)
    api.put_factsToConflict(f)
    api.put_factsToPriority(f)
  }

  def timeTriggered(api: LifecycleEpochOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, previousStart, previousOn, previousOff),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee LIFECYCLE_EPOCH_DERIVATION
        api.factsToConflict.freshStart == (In(previousStart) == StartIndicationLevel.Clear &
          api.lifecycleIndications.startLevel == StartIndicationLevel.Asserted) &
          api.factsToConflict.freshOn == (In(previousOn) == OnIndicationLevel.Clear &
            api.lifecycleIndications.onLevel == OnIndicationLevel.Asserted) &
          api.factsToConflict.offActive == (api.lifecycleIndications.offLevel == OffIndicationLevel.Asserted) &
          api.factsToConflict.heldStart == (In(previousStart) == StartIndicationLevel.Asserted &
            api.lifecycleIndications.startLevel == StartIndicationLevel.Asserted) &
          api.factsToConflict.heldOn == (In(previousOn) == OnIndicationLevel.Asserted &
            api.lifecycleIndications.onLevel == OnIndicationLevel.Asserted) &
          api.factsToConflict.heldOff == (In(previousOff) == OffIndicationLevel.Asserted &
            api.lifecycleIndications.offLevel == OffIndicationLevel.Asserted) &
          api.factsToConflict.anyInvalid == (api.lifecycleIndications.startLevel == StartIndicationLevel.Invalid |
            api.lifecycleIndications.onLevel == OnIndicationLevel.Invalid |
            api.lifecycleIndications.offLevel == OffIndicationLevel.Invalid) &
          api.factsToPriority == api.factsToConflict &
          previousStart == api.lifecycleIndications.startLevel &
          previousOn == api.lifecycleIndications.onLevel &
          previousOff == api.lifecycleIndications.offLevel
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val lifecycleIndications: Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications =
      api.get_lifecycleIndications().get

    val startLevel: Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.Type = lifecycleIndications.startLevel
    val onLevel: Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.Type = lifecycleIndications.onLevel
    val offLevel: Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.Type = lifecycleIndications.offLevel

    val f: LifecycleEpochFacts = LifecycleEpochFacts(
      freshStart = (previousStart == StartIndicationLevel.Clear & startLevel == StartIndicationLevel.Asserted),
      freshOn = (previousOn == OnIndicationLevel.Clear & onLevel == OnIndicationLevel.Asserted),
      offActive = (offLevel == OffIndicationLevel.Asserted),
      heldStart = (previousStart == StartIndicationLevel.Asserted & startLevel == StartIndicationLevel.Asserted),
      heldOn = (previousOn == OnIndicationLevel.Asserted & onLevel == OnIndicationLevel.Asserted),
      heldOff = (previousOff == OffIndicationLevel.Asserted & offLevel == OffIndicationLevel.Asserted),
      anyInvalid = (startLevel == StartIndicationLevel.Invalid | onLevel == OnIndicationLevel.Invalid | offLevel == OffIndicationLevel.Invalid))

    api.put_factsToConflict(f)
    api.put_factsToPriority(f)

    previousStart = startLevel
    previousOn = onLevel
    previousOff = offLevel
  }

  def finalise(api: LifecycleEpochOwner_Operational_Api): Unit = { }
}
