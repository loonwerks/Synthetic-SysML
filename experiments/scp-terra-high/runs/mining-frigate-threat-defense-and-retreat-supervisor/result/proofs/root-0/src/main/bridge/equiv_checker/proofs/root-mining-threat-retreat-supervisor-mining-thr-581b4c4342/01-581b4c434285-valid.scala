// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_581b4c434285_1_Valid {
  @pure def check(
      qualified_defense_availability: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation,
      qualified_mining_availability: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation,
      qualified_request: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Request_Observation,
      qualified_retreat_availability: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation,
      raw_defense_availability: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Defense_Availability_Observation,
      raw_mining_availability: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mining_Availability_Observation,
      raw_request: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Request_Observation,
      raw_retreat_availability: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Retreat_Availability_Observation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
