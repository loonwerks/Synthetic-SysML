// #Sireum

package vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import vehicle_controller_operating_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner {

  // BEGIN STATE VARS
  var previousReturn: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type =
    Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Invalid
  // END STATE VARS

  def initialise(api: ReturnEpochOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api, previousReturn),
      Ensures(
        // BEGIN INITIALISE ENSURES initialise
        // guarantee INITIAL_RETURN_HISTORY_INVALID
        previousReturn == IndicationLevel.Invalid &
          api.factsToConflict.fresh == F &
          api.factsToConflict.held == F &
          api.factsToConflict.clear == F &
          api.factsToConflict.invalid &
          api.factsToPriority == api.factsToConflict &
          api.factsToRecovery == api.factsToConflict
        // END INITIALISE ENSURES initialise
      )
    )
    previousReturn = IndicationLevel.Invalid

    val f: ReturnEpochFacts = ReturnEpochFacts(
      fresh = F,
      held = F,
      clear = F,
      invalid = T)
    api.put_factsToConflict(f)
    api.put_factsToPriority(f)
    api.put_factsToRecovery(f)
  }

  def timeTriggered(api: ReturnEpochOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, previousReturn),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee RETURN_EPOCH_DERIVATION
        api.factsToConflict.fresh == (In(previousReturn) == IndicationLevel.Clear &
          api.returnIndication.level == IndicationLevel.Asserted) &
          api.factsToConflict.held == (In(previousReturn) == IndicationLevel.Asserted &
            api.returnIndication.level == IndicationLevel.Asserted) &
          api.factsToConflict.clear == (api.returnIndication.level == IndicationLevel.Clear) &
          api.factsToConflict.invalid == (api.returnIndication.level == IndicationLevel.Invalid) &
          api.factsToPriority == api.factsToConflict &
          api.factsToRecovery == api.factsToConflict &
          previousReturn == api.returnIndication.level
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val returnIndication: Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication =
      api.get_returnIndication().get

    val level: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type = returnIndication.level

    val f: ReturnEpochFacts = ReturnEpochFacts(
      fresh = (previousReturn == IndicationLevel.Clear & level == IndicationLevel.Asserted),
      held = (previousReturn == IndicationLevel.Asserted & level == IndicationLevel.Asserted),
      clear = (level == IndicationLevel.Clear),
      invalid = (level == IndicationLevel.Invalid))

    api.put_factsToConflict(f)
    api.put_factsToPriority(f)
    api.put_factsToRecovery(f)

    previousReturn = level
  }

  def finalise(api: ReturnEpochOwner_Operational_Api): Unit = { }
}
