// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e90576d90854_1_Valid {
  @pure def check(
      arrival_fact: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Arrival_Fact,
      mission_facts: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mission_Facts,
      mission_invalidity: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Mission_Invalidity_Facts,
      raw_mission: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Raw_Mission_Observation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
