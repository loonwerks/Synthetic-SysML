// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_31c3e66e413b_2_Valid {
  @pure def check(
      odd_engine_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type,
      odd_engine_evidence: equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairEvidence): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_Candidate_GumboX.inititialize_IEP_Post(odd_engine_assessment))) ___>: (equiv_shared_0.Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_GumboX.inititialize_IEP_Post(odd_engine_assessment))) & T))
  }
}
