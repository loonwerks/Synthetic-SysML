// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_906c4d62da3a_2_Valid {
  @pure def check(
      driverdefroststatus: equiv_shared_0.Windshield_Defrost_Request_Supervisor.DriverDefrostStatus.Type,
      policydisposition: equiv_shared_0.Windshield_Defrost_Request_Supervisor.PolicyDisposition.Type,
      requestintent: equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestIntent.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_Candidate_GumboX.compute_CEP_Post(policydisposition, requestintent, driverdefroststatus))) ___>: (equiv_shared_0.Windshield_Defrost_Request_Supervisor.DriverFeedbackReporter_defrostSupervisionProcess_driverFeedbackReporter_GumboX.compute_CEP_Post(policydisposition, requestintent, driverdefroststatus))) & T))
  }
}
