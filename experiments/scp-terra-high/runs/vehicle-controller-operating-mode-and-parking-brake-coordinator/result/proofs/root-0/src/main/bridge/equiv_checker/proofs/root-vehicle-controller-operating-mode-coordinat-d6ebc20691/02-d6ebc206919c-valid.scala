// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d6ebc206919c_2_Valid {
  @pure def check(
      brakedemand: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.Type,
      coordinationframe: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame,
      modedecision: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_GumboX.inititialize_IEP_Post(coordinationframe))) & T))
  }
}
