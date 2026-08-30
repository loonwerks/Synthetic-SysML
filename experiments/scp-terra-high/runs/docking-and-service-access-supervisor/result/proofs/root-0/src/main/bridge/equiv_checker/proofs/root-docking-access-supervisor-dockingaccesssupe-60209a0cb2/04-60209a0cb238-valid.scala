// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_60209a0cb238_4_Valid {
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
      in_requestledger: equiv_shared_0.Docking_Access_Supervisor.RequestLedger.Type,
      requestledger: equiv_shared_0.Docking_Access_Supervisor.RequestLedger.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Docking_Access_Supervisor.RequestAdmission_supervisor_process_request_admission_GumboX.compute_CEP_Post(in_requestledger, requestledger, admission_guard, request_facts, service_readiness, vessel_readiness, access_admission, docking_admission, gate_admission, lifecycle_admission, request_disposition, undocking_admission))) ___>: (T)) & T))
  }
}
