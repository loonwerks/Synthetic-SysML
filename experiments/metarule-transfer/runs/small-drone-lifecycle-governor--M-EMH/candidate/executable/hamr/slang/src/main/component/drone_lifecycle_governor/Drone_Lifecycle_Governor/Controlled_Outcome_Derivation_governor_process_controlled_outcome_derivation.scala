// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation {

  def initialise(api: Controlled_Outcome_Derivation_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_lifecycle_actuation(Drone_Lifecycle_Governor.Lifecycle_Actuation.example())
  }

  def timeTriggered(api: Controlled_Outcome_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case ACTUATION_OFF
        //   N.md#ACTUATION_OFF
        (api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Off) ___>: (api.lifecycle_actuation.power == Drone_Lifecycle_Governor.Power_Permission.Disabled &
          !(api.lifecycle_actuation.charging_permitted) &
          !(api.lifecycle_actuation.flight_permitted)),
        // case ACTUATION_STANDBY
        //   N.md#ACTUATION_STANDBY
        (api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Standby) ___>: (api.lifecycle_actuation.power == Drone_Lifecycle_Governor.Power_Permission.Standby_Enabled &
          !(api.lifecycle_actuation.charging_permitted) &
          !(api.lifecycle_actuation.flight_permitted)),
        // case ACTUATION_CHARGING
        //   N.md#ACTUATION_CHARGING
        (api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Charging) ___>: (api.lifecycle_actuation.power == Drone_Lifecycle_Governor.Power_Permission.Operational_Enabled &
          api.lifecycle_actuation.charging_permitted &
          !(api.lifecycle_actuation.flight_permitted)),
        // case ACTUATION_READY
        //   N.md#ACTUATION_READY
        (api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Ready) ___>: (api.lifecycle_actuation.power == Drone_Lifecycle_Governor.Power_Permission.Operational_Enabled &
          !(api.lifecycle_actuation.charging_permitted) &
          !(api.lifecycle_actuation.flight_permitted)),
        // case ACTUATION_FLYING
        //   N.md#ACTUATION_FLYING
        (api.selected_phase == Drone_Lifecycle_Governor.Lifecycle_Phase.Flying) ___>: (api.lifecycle_actuation.power == Drone_Lifecycle_Governor.Power_Permission.Operational_Enabled &
          !(api.lifecycle_actuation.charging_permitted) &
          api.lifecycle_actuation.flight_permitted)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_selected_phase().get match {
      case Drone_Lifecycle_Governor.Lifecycle_Phase.Off =>
        api.put_lifecycle_actuation(Drone_Lifecycle_Governor.Lifecycle_Actuation(Drone_Lifecycle_Governor.Power_Permission.Disabled, F, F))
      case Drone_Lifecycle_Governor.Lifecycle_Phase.Standby =>
        api.put_lifecycle_actuation(Drone_Lifecycle_Governor.Lifecycle_Actuation(Drone_Lifecycle_Governor.Power_Permission.Standby_Enabled, F, F))
      case Drone_Lifecycle_Governor.Lifecycle_Phase.Charging =>
        api.put_lifecycle_actuation(Drone_Lifecycle_Governor.Lifecycle_Actuation(Drone_Lifecycle_Governor.Power_Permission.Operational_Enabled, T, F))
      case Drone_Lifecycle_Governor.Lifecycle_Phase.Ready =>
        api.put_lifecycle_actuation(Drone_Lifecycle_Governor.Lifecycle_Actuation(Drone_Lifecycle_Governor.Power_Permission.Operational_Enabled, F, F))
      case Drone_Lifecycle_Governor.Lifecycle_Phase.Flying =>
        api.put_lifecycle_actuation(Drone_Lifecycle_Governor.Lifecycle_Actuation(Drone_Lifecycle_Governor.Power_Permission.Operational_Enabled, F, T))
    }
  }

  def finalise(api: Controlled_Outcome_Derivation_Operational_Api): Unit = { }
}
