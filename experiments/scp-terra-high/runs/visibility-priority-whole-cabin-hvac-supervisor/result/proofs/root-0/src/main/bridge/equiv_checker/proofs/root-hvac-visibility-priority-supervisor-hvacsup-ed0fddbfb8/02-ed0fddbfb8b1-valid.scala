// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ed0fddbfb8b1_2_Valid {
  @pure def check(
      glazingobservation: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.GlazingObservation,
      visibilityfault: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Type,
      visibilityneed: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeedAssessor_supervision_visibilityNeedAssessor_GumboX.inititialize_IEP_Post(visibilityfault, visibilityneed))) & T))
  }
}
