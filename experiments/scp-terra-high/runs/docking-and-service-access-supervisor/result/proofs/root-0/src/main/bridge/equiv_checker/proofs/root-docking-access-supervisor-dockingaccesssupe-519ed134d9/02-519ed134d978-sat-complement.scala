// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_519ed134d978_2_Complement {
  @pure def check(
      access_admission: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision,
      admission_guard: equiv_shared_0.Docking_Access_Supervisor.AdmissionGuard,
      docking_admission: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision,
      gate_admission: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision,
      lifecycle_admission: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision,
      request_disposition: equiv_shared_0.Docking_Access_Supervisor.RequestDisposition.Type,
      request_facts: equiv_shared_0.Docking_Access_Supervisor.RequestFacts,
      service_readiness: equiv_shared_0.Docking_Access_Supervisor.ServiceFacts,
      undocking_admission: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision,
      vessel_readiness: equiv_shared_0.Docking_Access_Supervisor.VesselFacts,
      requestledger: equiv_shared_0.Docking_Access_Supervisor.RequestLedger.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_GumboX.inititialize_IEP_Post(requestledger, access_admission, docking_admission, gate_admission, lifecycle_admission, request_disposition, undocking_admission))) & T)))
  }
}
