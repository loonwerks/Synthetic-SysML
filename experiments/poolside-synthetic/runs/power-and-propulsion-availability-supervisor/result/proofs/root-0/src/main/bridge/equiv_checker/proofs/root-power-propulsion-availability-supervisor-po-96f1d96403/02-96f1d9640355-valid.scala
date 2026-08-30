// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_96f1d9640355_2_Valid {
  @pure def check(
      odd_engine_assessment: equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairAssessment.Type,
      odd_engine_evidence: equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairEvidence): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_Candidate_GumboX.compute_CEP_Post(odd_engine_evidence, odd_engine_assessment))) ___>: (equiv_shared_0.Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_GumboX.compute_CEP_Post(odd_engine_evidence, odd_engine_assessment))) & T))
  }
}
