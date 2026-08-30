// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3eb8e34b65a0_4_Valid {
  @pure def check(
      even_engine_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type,
      even_engine_evidence: equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairEvidence): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_GumboX.inititialize_IEP_Post(even_engine_assessment))) ___>: (equiv_shared_0.Power_Propulsion_Availability_Supervisor.EvenEngineGroupAssessor_supervisor_process_even_engine_group_assessor_Candidate_GumboX.inititialize_IEP_Post(even_engine_assessment))) & T))
  }
}
