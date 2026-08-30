// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f34d2c92f1a5_2_Valid {
  @pure def check(
      actuationdisposition: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ActuationDisposition.Type,
      recoverydecision: equiv_shared_0.HVAC_Energy_Interface_Supervisor.RecoveryDecision.Type,
      resourcegrant: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceGrant.Type,
      serviceselection: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ServiceSelection,
      supervisorstatus: equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisorStatus.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.HVAC_Energy_Interface_Supervisor.SupervisoryStatusComposer_climateSupervisionProcess_supervisoryStatusComposer_GumboX.inititialize_IEP_Post(supervisorstatus))) & T))
  }
}
