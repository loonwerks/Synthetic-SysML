// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8b1ae078a82a_2_Complement {
  @pure def check(
      access_request: equiv_shared_0.Docking_Access_Supervisor.AccessRequest.Type,
      request_facts: equiv_shared_0.Docking_Access_Supervisor.RequestFacts): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Docking_Access_Supervisor.RequestClassification_supervisor_process_request_classification_GumboX.inititialize_IEP_Post(request_facts))) & T)))
  }
}
