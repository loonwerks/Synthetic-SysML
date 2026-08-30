// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8f50f55c8e9d_2_Valid {
  @pure def check(
      brakedemand: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.Type,
      coordinationframe: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.CoordinationFrame,
      modedecision: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_Candidate_GumboX.compute_CEP_Post(brakedemand, modedecision, coordinationframe))) ___>: (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.OutcomeCoherenceOwner_modeCoordinationProcess_outcomeCoherenceOwner_GumboX.compute_CEP_Post(brakedemand, modedecision, coordinationframe))) & T))
  }
}
