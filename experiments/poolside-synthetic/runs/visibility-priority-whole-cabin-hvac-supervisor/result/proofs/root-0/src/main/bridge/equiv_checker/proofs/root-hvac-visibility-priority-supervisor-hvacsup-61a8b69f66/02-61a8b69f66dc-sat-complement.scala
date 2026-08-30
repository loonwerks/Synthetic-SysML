// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_61a8b69f66dc_2_Complement {
  @pure def check(
      qualifiedrequest: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.QualifiedRequest,
      qualifiedtarget: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.QualifiedTarget,
      userrequest: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.UserClimateRequest): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.RequestQualifier_supervision_requestQualifier_GumboX.inititialize_IEP_Post(qualifiedrequest, qualifiedtarget))) & T)))
  }
}
