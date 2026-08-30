// #Sireum

package scp_candidate.Drone_Lifecycle_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation {

  def initialise(api: Controlled_Outcome_Derivation_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initial_actuation
        api.lifecycle_actuation.power == Power_Permission.Disabled &&
          !(api.lifecycle_actuation.charging_permitted) &&
          !(api.lifecycle_actuation.flight_permitted)
        // END INITIALIZES ENSURES
      )
    )
    api.put_lifecycle_actuation(Lifecycle_Actuation(Power_Permission.Disabled, F, F))
  }

  def timeTriggered(api: Controlled_Outcome_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case off
        (api.selected_phase == Lifecycle_Phase.Off) ___>: (api.lifecycle_actuation.power == Power_Permission.Disabled &&
          !(api.lifecycle_actuation.charging_permitted) &&
          !(api.lifecycle_actuation.flight_permitted)),
        // case standby
        (api.selected_phase == Lifecycle_Phase.Standby) ___>: (api.lifecycle_actuation.power == Power_Permission.Standby_Enabled &&
          !(api.lifecycle_actuation.charging_permitted) &&
          !(api.lifecycle_actuation.flight_permitted)),
        // case charging
        (api.selected_phase == Lifecycle_Phase.Charging) ___>: (api.lifecycle_actuation.power == Power_Permission.Operational_Enabled &&
          api.lifecycle_actuation.charging_permitted &&
          !(api.lifecycle_actuation.flight_permitted)),
        // case ready
        (api.selected_phase == Lifecycle_Phase.Ready) ___>: (api.lifecycle_actuation.power == Power_Permission.Operational_Enabled &&
          !(api.lifecycle_actuation.charging_permitted) &&
          !(api.lifecycle_actuation.flight_permitted)),
        // case flying
        (api.selected_phase == Lifecycle_Phase.Flying) ___>: (api.lifecycle_actuation.power == Power_Permission.Operational_Enabled &&
          !(api.lifecycle_actuation.charging_permitted) &&
          api.lifecycle_actuation.flight_permitted)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val phase: Drone_Lifecycle_Governor.Lifecycle_Phase.Type = api.get_selected_phase().get
    val actuation: Drone_Lifecycle_Governor.Lifecycle_Actuation = phase match {
      case Lifecycle_Phase.Off =>
        Lifecycle_Actuation(Power_Permission.Disabled, F, F)
      case Lifecycle_Phase.Standby =>
        Lifecycle_Actuation(Power_Permission.Standby_Enabled, F, F)
      case Lifecycle_Phase.Charging =>
        Lifecycle_Actuation(Power_Permission.Operational_Enabled, T, F)
      case Lifecycle_Phase.Ready =>
        Lifecycle_Actuation(Power_Permission.Operational_Enabled, F, F)
      case Lifecycle_Phase.Flying =>
        Lifecycle_Actuation(Power_Permission.Operational_Enabled, F, T)
    }
    api.put_lifecycle_actuation(actuation)
  }

  def finalise(api: Controlled_Outcome_Derivation_Operational_Api): Unit = { }
}
