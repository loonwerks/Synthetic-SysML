// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c9e92f5c5823_4_Valid {
  @pure def check(
      blower_fact: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.BlowerCapabilityFact,
      capability_set: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.CapabilitySet,
      filter_facts: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.FilterCapabilityFacts,
      humidity_facts: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.HumidityCapabilityFacts,
      readiness: equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.AirTreatmentReadiness): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Cabin_Air_Quality_Humidity_Supervisor.TreatmentCapabilityAssessor_cabin_air_supervision_process_treatment_capability_assessor_GumboX.inititialize_IEP_Post(blower_fact, capability_set, filter_facts, humidity_facts))) ___>: (T)) & T))
  }
}
