// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c9e92f5c5823_1_Valid {
  @pure def check(
      blower_fact: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact,
      capability_set: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet,
      filter_facts: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts,
      humidity_facts: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts,
      readiness: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
