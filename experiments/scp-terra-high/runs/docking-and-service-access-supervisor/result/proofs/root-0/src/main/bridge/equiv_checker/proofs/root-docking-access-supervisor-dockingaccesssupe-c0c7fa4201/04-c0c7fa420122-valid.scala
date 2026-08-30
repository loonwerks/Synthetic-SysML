// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c0c7fa420122_4_Valid {
  @pure def check(
      vessel_facts: equiv_shared_0.Docking_Access_Supervisor.VesselFacts,
      vessel_readiness: equiv_shared_0.Docking_Access_Supervisor.VesselFacts,
      vessel_status: equiv_shared_0.Docking_Access_Supervisor.VesselStatus.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_GumboX.compute_CEP_Post(vessel_status, vessel_facts, vessel_readiness))) ___>: (T)) & T))
  }
}
