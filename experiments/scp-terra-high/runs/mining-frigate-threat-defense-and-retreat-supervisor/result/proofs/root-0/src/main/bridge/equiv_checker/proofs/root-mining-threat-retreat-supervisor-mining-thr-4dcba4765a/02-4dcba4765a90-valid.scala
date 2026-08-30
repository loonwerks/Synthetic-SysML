// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4dcba4765a90_2_Valid {
  @pure def check(
      qualified_capacitor: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Capacitor_Observation,
      qualified_cargo: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Cargo_Observation,
      raw_capacitor: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Capacitor_Observation,
      raw_cargo: equiv_shared_0.Mining_Threat_Retreat_Supervisor.Cargo_Observation): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_Candidate_GumboX.compute_CEP_Post(raw_capacitor, raw_cargo, qualified_capacitor, qualified_cargo))) ___>: (equiv_shared_0.Mining_Threat_Retreat_Supervisor.Resource_Qualification_supervisor_process_resource_qualification_GumboX.compute_CEP_Post(raw_capacitor, raw_cargo, qualified_capacitor, qualified_cargo))) & T))
  }
}
