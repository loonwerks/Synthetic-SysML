// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_96f1d9640355_Candidate_Pointwise_Realizable {
  @pure def check(
      odd_engine_evidence: equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairEvidence): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_Candidate_GumboX.compute_CEP_Post(odd_engine_evidence, equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairAssessment.READY_NONE)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_Candidate_GumboX.compute_CEP_Post(odd_engine_evidence, equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairAssessment.NOT_READY_INVALID)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_Candidate_GumboX.compute_CEP_Post(odd_engine_evidence, equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairAssessment.NOT_READY_STALE)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_Candidate_GumboX.compute_CEP_Post(odd_engine_evidence, equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairAssessment.NOT_READY_FIRST_POSITION)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.OddEngineGroupAssessor_supervisor_process_odd_engine_group_assessor_Candidate_GumboX.compute_CEP_Post(odd_engine_evidence, equiv_shared_0.Power_Propulsion_Availability_Supervisor.EnginePairAssessment.NOT_READY_SECOND_POSITION)))))
  }
}
