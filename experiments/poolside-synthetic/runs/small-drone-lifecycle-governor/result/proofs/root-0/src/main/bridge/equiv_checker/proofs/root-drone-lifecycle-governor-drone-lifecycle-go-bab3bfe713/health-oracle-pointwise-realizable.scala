// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_bab3bfe713f7_Oracle_Pointwise_Realizable {
  @pure def check(
      selected_phase: equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Phase.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_GumboX.compute_CEP_Post(selected_phase, equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Actuation(power = equiv_shared_0.Drone_Lifecycle_Governor.Power_Permission.Disabled, charging_permitted = F, flight_permitted = F))) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_GumboX.compute_CEP_Post(selected_phase, equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Actuation(power = equiv_shared_0.Drone_Lifecycle_Governor.Power_Permission.Disabled, charging_permitted = F, flight_permitted = T))) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_GumboX.compute_CEP_Post(selected_phase, equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Actuation(power = equiv_shared_0.Drone_Lifecycle_Governor.Power_Permission.Disabled, charging_permitted = T, flight_permitted = F))) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_GumboX.compute_CEP_Post(selected_phase, equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Actuation(power = equiv_shared_0.Drone_Lifecycle_Governor.Power_Permission.Disabled, charging_permitted = T, flight_permitted = T))) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_GumboX.compute_CEP_Post(selected_phase, equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Actuation(power = equiv_shared_0.Drone_Lifecycle_Governor.Power_Permission.Standby_Enabled, charging_permitted = F, flight_permitted = F))) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_GumboX.compute_CEP_Post(selected_phase, equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Actuation(power = equiv_shared_0.Drone_Lifecycle_Governor.Power_Permission.Standby_Enabled, charging_permitted = F, flight_permitted = T))) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_GumboX.compute_CEP_Post(selected_phase, equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Actuation(power = equiv_shared_0.Drone_Lifecycle_Governor.Power_Permission.Standby_Enabled, charging_permitted = T, flight_permitted = F))) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_GumboX.compute_CEP_Post(selected_phase, equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Actuation(power = equiv_shared_0.Drone_Lifecycle_Governor.Power_Permission.Standby_Enabled, charging_permitted = T, flight_permitted = T))) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_GumboX.compute_CEP_Post(selected_phase, equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Actuation(power = equiv_shared_0.Drone_Lifecycle_Governor.Power_Permission.Operational_Enabled, charging_permitted = F, flight_permitted = F))) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_GumboX.compute_CEP_Post(selected_phase, equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Actuation(power = equiv_shared_0.Drone_Lifecycle_Governor.Power_Permission.Operational_Enabled, charging_permitted = F, flight_permitted = T))) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_GumboX.compute_CEP_Post(selected_phase, equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Actuation(power = equiv_shared_0.Drone_Lifecycle_Governor.Power_Permission.Operational_Enabled, charging_permitted = T, flight_permitted = F))) |
        (equiv_shared_0.Drone_Lifecycle_Governor.Controlled_Outcome_Derivation_governor_process_controlled_outcome_derivation_GumboX.compute_CEP_Post(selected_phase, equiv_shared_0.Drone_Lifecycle_Governor.Lifecycle_Actuation(power = equiv_shared_0.Drone_Lifecycle_Governor.Power_Permission.Operational_Enabled, charging_permitted = T, flight_permitted = T))))))
  }
}
