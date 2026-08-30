// #Sireum

package vehicle_controller_operating_mode_coordinator.Vehicle_Controller_Operating_Mode_Coordinator

import org.sireum._
import vehicle_controller_operating_mode_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner {

  // BEGIN STATE VARS
  var previousDegraded: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type =
    Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Invalid
  // END STATE VARS

  def initialise(api: DegradationEpochOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api, previousDegraded),
      Ensures(
        // BEGIN INITIALISE ENSURES initialise
        // guarantee INITIAL_DEGRADATION_HISTORY_INVALID
        previousDegraded == IndicationLevel.Invalid &
          api.factsToConflict.active == F &
          api.factsToConflict.fresh == F &
          api.factsToConflict.cleared == F &
          api.factsToConflict.held == F &
          api.factsToConflict.invalid &
          api.factsToPriority == api.factsToConflict &
          api.factsToEpisode == api.factsToConflict &
          api.factsToRecovery == api.factsToConflict
        // END INITIALISE ENSURES initialise
      )
    )
    previousDegraded = IndicationLevel.Invalid

    val f: DegradationEpochFacts = DegradationEpochFacts(
      active = F,
      fresh = F,
      cleared = F,
      held = F,
      invalid = T)
    api.put_factsToConflict(f)
    api.put_factsToPriority(f)
    api.put_factsToEpisode(f)
    api.put_factsToRecovery(f)
  }

  def timeTriggered(api: DegradationEpochOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, previousDegraded),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee DEGRADATION_EPOCH_DERIVATION
        api.factsToConflict.active == (api.degradedIndication.level == IndicationLevel.Asserted) &
          api.factsToConflict.fresh == (In(previousDegraded) == IndicationLevel.Clear &
            api.degradedIndication.level == IndicationLevel.Asserted) &
          api.factsToConflict.cleared == (In(previousDegraded) == IndicationLevel.Asserted &
            api.degradedIndication.level == IndicationLevel.Clear) &
          api.factsToConflict.held == (In(previousDegraded) == IndicationLevel.Asserted &
            api.degradedIndication.level == IndicationLevel.Asserted) &
          api.factsToConflict.invalid == (api.degradedIndication.level == IndicationLevel.Invalid) &
          api.factsToPriority == api.factsToConflict &
          api.factsToEpisode == api.factsToConflict &
          api.factsToRecovery == api.factsToConflict &
          previousDegraded == api.degradedIndication.level
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val degradedIndication: Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication =
      api.get_degradedIndication().get

    val level: Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type = degradedIndication.level

    val f: DegradationEpochFacts = DegradationEpochFacts(
      active = (level == IndicationLevel.Asserted),
      fresh = (previousDegraded == IndicationLevel.Clear & level == IndicationLevel.Asserted),
      cleared = (previousDegraded == IndicationLevel.Asserted & level == IndicationLevel.Clear),
      held = (previousDegraded == IndicationLevel.Asserted & level == IndicationLevel.Asserted),
      invalid = (level == IndicationLevel.Invalid))

    api.put_factsToConflict(f)
    api.put_factsToPriority(f)
    api.put_factsToEpisode(f)
    api.put_factsToRecovery(f)

    previousDegraded = level
  }

  def finalise(api: DegradationEpochOwner_Operational_Api): Unit = { }
}
