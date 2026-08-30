// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_57382c35531e_4_Valid {
  @pure def check(
      vessel_facts: equiv_shared_0.Docking_Access_Supervisor.VesselFacts,
      vessel_readiness: equiv_shared_0.Docking_Access_Supervisor.VesselFacts,
      vessel_status: equiv_shared_0.Docking_Access_Supervisor.VesselStatus.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Docking_Access_Supervisor.VesselStatusAssessment_supervisor_process_vessel_status_assessment_GumboX.inititialize_IEP_Post(vessel_facts, vessel_readiness))) ___>: (T)) & T))
  }
}
