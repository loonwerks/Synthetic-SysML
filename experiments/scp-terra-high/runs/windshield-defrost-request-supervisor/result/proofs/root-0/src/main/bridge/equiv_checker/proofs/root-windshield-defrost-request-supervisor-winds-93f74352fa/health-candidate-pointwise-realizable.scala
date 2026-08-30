// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_93f74352fae4_Candidate_Pointwise_Realizable {
  @pure def check(
      glazingcondition: equiv_shared_0.Windshield_Defrost_Request_Supervisor.GlazingCondition.Type,
      glazingvalidity: equiv_shared_0.Windshield_Defrost_Request_Supervisor.GlazingValidity.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_Candidate_GumboX.compute_CEP_Post(glazingcondition, glazingvalidity, equiv_shared_0.Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Clear)) |
        (equiv_shared_0.Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_Candidate_GumboX.compute_CEP_Post(glazingcondition, glazingvalidity, equiv_shared_0.Windshield_Defrost_Request_Supervisor.VisibilityAssessment.NeedsDefrost)) |
        (equiv_shared_0.Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_Candidate_GumboX.compute_CEP_Post(glazingcondition, glazingvalidity, equiv_shared_0.Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Unknown)))))
  }
}
