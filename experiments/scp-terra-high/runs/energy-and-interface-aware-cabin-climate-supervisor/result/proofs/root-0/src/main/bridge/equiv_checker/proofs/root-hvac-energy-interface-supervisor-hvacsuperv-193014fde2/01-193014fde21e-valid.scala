// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_193014fde21e_1_Valid {
  @pure def check(
      defrostrequest: equiv_shared_0.HVAC_Energy_Interface_Supervisor.DefrostRequest.Type,
      glazingcondition: equiv_shared_0.HVAC_Energy_Interface_Supervisor.GlazingCondition.Type,
      visibilitydemand: equiv_shared_0.HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
