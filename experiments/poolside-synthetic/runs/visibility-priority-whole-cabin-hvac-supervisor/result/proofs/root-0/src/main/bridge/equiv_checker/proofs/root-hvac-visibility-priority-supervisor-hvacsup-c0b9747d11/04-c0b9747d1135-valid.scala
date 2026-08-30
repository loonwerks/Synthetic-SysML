// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c0b9747d1135_4_Valid {
  @pure def check(
      qualifiedrequest: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.QualifiedRequest,
      qualifiedtarget: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.QualifiedTarget,
      userrequest: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.UserClimateRequest): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_GumboX.compute_CEP_Post(userrequest, qualifiedrequest, qualifiedtarget))) ___>: (T)) & T))
  }
}
