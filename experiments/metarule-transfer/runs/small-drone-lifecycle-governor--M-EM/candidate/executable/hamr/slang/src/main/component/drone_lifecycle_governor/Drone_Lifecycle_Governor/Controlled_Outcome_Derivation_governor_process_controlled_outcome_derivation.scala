// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation {

  def initialise(api: Controlled_Outcome_Derivation_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_lifecycle_actuation(
      Lifecycle_Actuation(Power_Permission.Disabled, F, F))
  }

  def timeTriggered(api: Controlled_Outcome_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case ACTUATION_OFF
        (api.selected_phase == Lifecycle_Phase.Off) ___>: (api.lifecycle_actuation.power == Power_Permission.Disabled &
          api.lifecycle_actuation.charging_permitted == F &
          api.lifecycle_actuation.flight_permitted == F),
        // case ACTUATION_STANDBY
        (api.selected_phase == Lifecycle_Phase.Standby) ___>: (api.lifecycle_actuation.power == Power_Permission.Standby_Enabled &
          api.lifecycle_actuation.charging_permitted == F &
          api.lifecycle_actuation.flight_permitted == F),
        // case ACTUATION_CHARGING
        (api.selected_phase == Lifecycle_Phase.Charging) ___>: (api.lifecycle_actuation.power == Power_Permission.Operational_Enabled &
          api.lifecycle_actuation.charging_permitted == T &
          api.lifecycle_actuation.flight_permitted == F),
        // case ACTUATION_READY
        (api.selected_phase == Lifecycle_Phase.Ready) ___>: (api.lifecycle_actuation.power == Power_Permission.Operational_Enabled &
          api.lifecycle_actuation.charging_permitted == F &
          api.lifecycle_actuation.flight_permitted == F),
        // case ACTUATION_FLYING
        (api.selected_phase == Lifecycle_Phase.Flying) ___>: (api.lifecycle_actuation.power == Power_Permission.Operational_Enabled &
          api.lifecycle_actuation.charging_permitted == F &
          api.lifecycle_actuation.flight_permitted == T)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_selected_phase() match {
      case Some(Lifecycle_Phase.Off) =>
        api.put_lifecycle_actuation(
          Lifecycle_Actuation(Power_Permission.Disabled, F, F))
      case Some(Lifecycle_Phase.Standby) =>
        api.put_lifecycle_actuation(
          Lifecycle_Actuation(Power_Permission.Standby_Enabled, F, F))
      case Some(Lifecycle_Phase.Charging) =>
        api.put_lifecycle_actuation(
          Lifecycle_Actuation(Power_Permission.Operational_Enabled, T, F))
      case Some(Lifecycle_Phase.Ready) =>
        api.put_lifecycle_actuation(
          Lifecycle_Actuation(Power_Permission.Operational_Enabled, F, F))
      case Some(Lifecycle_Phase.Flying) =>
        api.put_lifecycle_actuation(
          Lifecycle_Actuation(Power_Permission.Operational_Enabled, F, T))
    }
  }

  def finalise(api: Controlled_Outcome_Derivation_Operational_Api): Unit = { }
}
