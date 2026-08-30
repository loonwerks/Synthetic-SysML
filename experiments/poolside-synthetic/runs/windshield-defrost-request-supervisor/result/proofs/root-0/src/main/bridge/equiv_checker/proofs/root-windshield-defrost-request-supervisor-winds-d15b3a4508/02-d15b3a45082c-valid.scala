// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d15b3a45082c_2_Valid {
  @pure def check(
      defrosteligibility: equiv_shared_0.Windshield_Defrost_Request_Supervisor.DefrostEligibility.Type,
      defrostenablecommand: equiv_shared_0.Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Type,
      policydisposition: equiv_shared_0.Windshield_Defrost_Request_Supervisor.PolicyDisposition.Type,
      requestintent: equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestIntent.Type,
      visibilityassessment: equiv_shared_0.Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_Candidate_GumboX.compute_CEP_Post(defrosteligibility, requestintent, visibilityassessment, defrostenablecommand, policydisposition))) ___>: (equiv_shared_0.Windshield_Defrost_Request_Supervisor.DefrostPolicySupervisor_defrostSupervisionProcess_defrostPolicySupervisor_GumboX.compute_CEP_Post(defrosteligibility, requestintent, visibilityassessment, defrostenablecommand, policydisposition))) & T))
  }
}
