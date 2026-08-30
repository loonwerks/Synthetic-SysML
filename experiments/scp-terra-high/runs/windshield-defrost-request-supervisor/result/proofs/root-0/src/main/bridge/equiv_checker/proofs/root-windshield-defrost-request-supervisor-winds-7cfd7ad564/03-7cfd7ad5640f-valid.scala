// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7cfd7ad5640f_3_Valid {
  @pure def check(
      defrosteligibility: equiv_shared_0.Windshield_Defrost_Request_Supervisor.DefrostEligibility.Type,
      defrostenablecommand: equiv_shared_0.Windshield_Defrost_Request_Supervisor.DefrostEnableCommand.Type,
      policydisposition: equiv_shared_0.Windshield_Defrost_Request_Supervisor.PolicyDisposition.Type,
      requestintent: equiv_shared_0.Windshield_Defrost_Request_Supervisor.RequestIntent.Type,
      visibilityassessment: equiv_shared_0.Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
