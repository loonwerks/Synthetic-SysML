// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ed4c8ab09fbd_3_Valid {
  @pure def check(
      visibilityneed: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Type,
      visibilitypath: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness,
      visibilityproposal: equiv_shared_0.HVAC_Visibility_Priority_Supervisor.VisibilityProposal): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
