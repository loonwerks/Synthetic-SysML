// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f760fa1e6ea2_2_Valid {
  @pure def check(
      service_activity: equiv_shared_0.Docking_Access_Supervisor.ServiceActivity.Type,
      service_facts: equiv_shared_0.Docking_Access_Supervisor.ServiceFacts,
      service_readiness: equiv_shared_0.Docking_Access_Supervisor.ServiceFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_GumboX.compute_CEP_Post(service_activity, service_facts, service_readiness))) & T))
  }
}
