// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d06d11213d49_2_Complement {
  @pure def check(
      glazingobservation: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.GlazingObservation,
      visibilityfault: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Type,
      visibilityneed: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_GumboX.compute_CEP_Post(glazingobservation, visibilityfault, visibilityneed))) & T)))
  }
}
