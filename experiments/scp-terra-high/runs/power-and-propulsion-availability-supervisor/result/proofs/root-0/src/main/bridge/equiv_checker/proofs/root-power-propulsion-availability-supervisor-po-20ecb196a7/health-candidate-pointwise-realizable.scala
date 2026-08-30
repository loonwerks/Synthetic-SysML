// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_20ecb196a792_Candidate_Pointwise_Realizable {
  @pure def check(
      power_evidence: equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerEvidence): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_Candidate_GumboX.compute_CEP_Post(power_evidence, equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerAssessment.READY_NONE)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_Candidate_GumboX.compute_CEP_Post(power_evidence, equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerAssessment.NOT_READY_INVALID)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_Candidate_GumboX.compute_CEP_Post(power_evidence, equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerAssessment.NOT_READY_STALE)) |
        (equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerManagementAssessmentOwner_supervisor_process_power_management_assessment_Candidate_GumboX.compute_CEP_Post(power_evidence, equiv_shared_0.Power_Propulsion_Availability_Supervisor.PowerAssessment.NOT_READY_CONDITION)))))
  }
}
