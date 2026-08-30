// #Sireum #Logika

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation {

  def initialise(api: Controlled_Outcome_Derivation_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INITIAL_ACTUATION_DISABLED
        api.lifecycle_actuation.power == Drone_Lifecycle_Governor.Power_Permission.Disabled &
        api.lifecycle_actuation.charging_permitted == F &
        api.lifecycle_actuation.flight_permitted == F
      )
    )
    api.put_lifecycle_actuation(Drone_Lifecycle_Governor.Lifecycle_Actuation(
      power = Drone_Lifecycle_Governor.Power_Permission.Disabled,
      charging_permitted = F,
      flight_permitted = F))
  }

  def timeTriggered(api: Controlled_Outcome_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // case ACTUATION_OFF
        (api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Off)
          ___>: (api.lifecycle_actuation.power == Drone_Lifecycle_Governor.Power_Permission.Disabled &
            api.lifecycle_actuation.charging_permitted == F &
            api.lifecycle_actuation.flight_permitted == F),
        // case ACTUATION_STANDBY
        (api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Standby)
          ___>: (api.lifecycle_actuation.power == Drone_Lifecycle_Governor.Power_Permission.Standby_Enabled &
            api.lifecycle_actuation.charging_permitted == F &
            api.lifecycle_actuation.flight_permitted == F),
        // case ACTUATION_CHARGING
        (api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Charging)
          ___>: (api.lifecycle_actuation.power == Drone_Lifecycle_Governor.Power_Permission.Operational_Enabled &
            api.lifecycle_actuation.charging_permitted == T &
            api.lifecycle_actuation.flight_permitted == F),
        // case ACTUATION_READY
        (api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Ready)
          ___>: (api.lifecycle_actuation.power == Drone_Lifecycle_Governor.Power_Permission.Operational_Enabled &
            api.lifecycle_actuation.charging_permitted == F &
            api.lifecycle_actuation.flight_permitted == F),
        // case ACTUATION_FLYING
        (api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Flying)
          ___>: (api.lifecycle_actuation.power == Drone_Lifecycle_Governor.Power_Permission.Operational_Enabled &
            api.lifecycle_actuation.charging_permitted == F &
            api.lifecycle_actuation.flight_permitted == T)
      )
    )
    val phase: Drone_Lifecycle_Governor.Lifecycle_Phase.Type = api.get_selected_phase().get
    var actuation: Drone_Lifecycle_Governor.Lifecycle_Actuation = Drone_Lifecycle_Governor.Lifecycle_Actuation(
      power = Drone_Lifecycle_Governor.Power_Permission.Disabled,
      charging_permitted = F,
      flight_permitted = F)
    phase match {
      case Drone_Lifecycle_Governor.Lifecycle_Phase.Off =>
        actuation = Drone_Lifecycle_Governor.Lifecycle_Actuation(
          power = Drone_Lifecycle_Governor.Power_Permission.Disabled,
          charging_permitted = F,
          flight_permitted = F)
      case Drone_Lifecycle_Governor.Lifecycle_Phase.Standby =>
        actuation = Drone_Lifecycle_Governor.Lifecycle_Actuation(
          power = Drone_Lifecycle_Governor.Power_Permission.Standby_Enabled,
          charging_permitted = F,
          flight_permitted = F)
      case Drone_Lifecycle_Governor.Lifecycle_Phase.Charging =>
        actuation = Drone_Lifecycle_Governor.Lifecycle_Actuation(
          power = Drone_Lifecycle_Governor.Power_Permission.Operational_Enabled,
          charging_permitted = T,
          flight_permitted = F)
      case Drone_Lifecycle_Governor.Lifecycle_Phase.Ready =>
        actuation = Drone_Lifecycle_Governor.Lifecycle_Actuation(
          power = Drone_Lifecycle_Governor.Power_Permission.Operational_Enabled,
          charging_permitted = F,
          flight_permitted = F)
      case Drone_Lifecycle_Governor.Lifecycle_Phase.Flying =>
        actuation = Drone_Lifecycle_Governor.Lifecycle_Actuation(
          power = Drone_Lifecycle_Governor.Power_Permission.Operational_Enabled,
          charging_permitted = F,
          flight_permitted = T)
    }
    api.put_lifecycle_actuation(actuation)
  }

  def finalise(api: Controlled_Outcome_Derivation_Operational_Api): Unit = { }
}
