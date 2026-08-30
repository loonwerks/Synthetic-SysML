// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_906c4d62da3a_Candidate_Pointwise_Realizable {
  @pure def check(
      policydisposition: equiv_shared_0.Windshield_Defrost_Request_Supervisor.PolicyDisposition.Type,
      requestintent: equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestIntent.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_Candidate_GumboX.compute_CEP_Post(policydisposition, requestintent, equiv_shared_0.Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Idle)) |
        (equiv_shared_0.Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_Candidate_GumboX.compute_CEP_Post(policydisposition, requestintent, equiv_shared_0.Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Defrosting)) |
        (equiv_shared_0.Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_Candidate_GumboX.compute_CEP_Post(policydisposition, requestintent, equiv_shared_0.Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Complete)) |
        (equiv_shared_0.Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_Candidate_GumboX.compute_CEP_Post(policydisposition, requestintent, equiv_shared_0.Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.AttentionRequired)))))
  }
}
