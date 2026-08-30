// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ae60e2a0e502_4_Valid {
  @pure def check(
      comfortdemand: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemand.Type,
      recoverydecision: equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type,
      serviceselection: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ServiceSelection,
      visibilitydemand: equiv_shared_0.HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_GumboX.compute_CEP_Post(comfortdemand, recoverydecision, visibilitydemand, serviceselection))) ___>: (T)) & T))
  }
}
