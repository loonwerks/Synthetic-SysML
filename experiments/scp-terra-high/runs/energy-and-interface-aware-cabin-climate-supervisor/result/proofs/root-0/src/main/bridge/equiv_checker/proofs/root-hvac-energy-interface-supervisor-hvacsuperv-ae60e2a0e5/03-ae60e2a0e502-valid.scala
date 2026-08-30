// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ae60e2a0e502_3_Valid {
  @pure def check(
      comfortdemand: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemand.Type,
      recoverydecision: equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type,
      serviceselection: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ServiceSelection,
      visibilitydemand: equiv_shared_0.HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
