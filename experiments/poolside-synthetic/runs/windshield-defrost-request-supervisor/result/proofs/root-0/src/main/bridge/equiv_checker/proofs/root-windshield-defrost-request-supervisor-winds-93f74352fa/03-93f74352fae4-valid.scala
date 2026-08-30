// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_93f74352fae4_3_Valid {
  @pure def check(
      glazingcondition: equiv_shared_0.Windshield_Defrost_Request_Supervisor.GlazingCondition.Type,
      glazingvalidity: equiv_shared_0.Windshield_Defrost_Request_Supervisor.GlazingValidity.Type,
      visibilityassessment: equiv_shared_0.Windshield_Defrost_Request_Supervisor.VisibilityAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
