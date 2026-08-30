// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_528684d1b416_2_Valid {
  @pure def check(
      blower_fact: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact,
      capability_set: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet,
      filter_facts: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts,
      humidity_facts: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts,
      readiness: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_GumboX.compute_CEP_Post(readiness, blower_fact, capability_set, filter_facts, humidity_facts))) & T))
  }
}
