// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_43569624de77_4_Valid {
  @pure def check(
      service_activity: equiv_shared_0.Docking_Access_Supervisor.ServiceActivity.Type,
      service_facts: equiv_shared_0.Docking_Access_Supervisor.ServiceFacts,
      service_readiness: equiv_shared_0.Docking_Access_Supervisor.ServiceFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Docking_Access_Supervisor.ServiceActivityAssessment_supervisor_process_service_activity_assessment_GumboX.inititialize_IEP_Post(service_facts, service_readiness))) ___>: (T)) & T))
  }
}
