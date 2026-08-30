// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_519ed134d978_3_Valid {
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
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
