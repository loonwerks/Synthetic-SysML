// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_897833dfcf85_4_Valid {
  @pure def check(
      comfortdemand: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ComfortDemand.Type,
      recoverydecision: equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type,
      serviceselection: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ServiceSelection,
      visibilitydemand: equiv_shared_0.HVAC_Energy_Interface_Supervisor.VisibilityDemand.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_GumboX.inititialize_IEP_Post(serviceselection))) ___>: (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ServicePriorityArbiter_climateSupervisionProcess_servicePriorityArbiter_Candidate_GumboX.inititialize_IEP_Post(serviceselection))) & T))
  }
}
