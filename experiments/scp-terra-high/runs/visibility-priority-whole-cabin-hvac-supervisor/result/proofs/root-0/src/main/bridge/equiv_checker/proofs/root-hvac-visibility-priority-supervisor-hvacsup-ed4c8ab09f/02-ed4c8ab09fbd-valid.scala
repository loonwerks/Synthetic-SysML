// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ed4c8ab09fbd_2_Valid {
  @pure def check(
      visibilityneed: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Type,
      visibilitypath: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness,
      visibilityproposal: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityProposal): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityServiceProposer_supervision_visibilityServiceProposer_GumboX.compute_CEP_Post(visibilityneed, visibilitypath, visibilityproposal))) & T))
  }
}
