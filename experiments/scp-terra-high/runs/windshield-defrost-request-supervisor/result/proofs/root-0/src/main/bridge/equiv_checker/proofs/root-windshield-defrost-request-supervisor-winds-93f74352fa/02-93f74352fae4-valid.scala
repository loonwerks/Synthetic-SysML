// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_93f74352fae4_2_Valid {
  @pure def check(
      glazingcondition: equiv_shared_0.Windshield_Defrost_Request_Supervisor.GlazingCondition.Type,
      glazingvalidity: equiv_shared_0.Windshield_Defrost_Request_Supervisor.GlazingValidity.Type,
      visibilityassessment: equiv_shared_0.Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_Candidate_GumboX.compute_CEP_Post(glazingcondition, glazingvalidity, visibilityassessment))) ___>: (equiv_shared_0.Windshield_Defrost_Request_Supervisor.GlazingConditionAssessor_defrostSupervisionProcess_glazingConditionAssessor_GumboX.compute_CEP_Post(glazingcondition, glazingvalidity, visibilityassessment))) & T))
  }
}
