// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e8f03ae972c9_4_Valid {
  @pure def check(
      actuationdisposition: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ActuationDisposition.Type,
      fanpreference: equiv_shared_0.HVAC_Energy_Interface_Supervisor.FanPreference.Type,
      plantcommand: equiv_shared_0.HVAC_Energy_Interface_Supervisor.PlantCommand,
      resourcegrant: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ResourceGrant.Type,
      serviceselection: equiv_shared_0.HVAC_Energy_Interface_Supervisor.ServiceSelection): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.HVAC_Energy_Interface_Supervisor.ActuationCommandCoordinator_climateSupervisionProcess_actuationCommandCoordinator_GumboX.inititialize_IEP_Post(actuationdisposition, plantcommand))) ___>: (T)) & T))
  }
}
