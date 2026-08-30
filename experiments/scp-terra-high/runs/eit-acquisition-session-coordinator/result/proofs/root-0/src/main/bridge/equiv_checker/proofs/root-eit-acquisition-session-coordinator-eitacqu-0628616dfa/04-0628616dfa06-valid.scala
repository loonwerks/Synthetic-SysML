// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0628616dfa06_4_Valid {
  @pure def check(
      arbitrationdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.ArbitrationDecision,
      preparationdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot,
      preparationstate: equiv_shared_0.EIT_Acquisition_Session_Coordinator.PreparationState.Type,
      committedpreparationstate: equiv_shared_0.EIT_Acquisition_Session_Coordinator.PreparationState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_GumboX.inititialize_IEP_Post(committedpreparationstate, preparationdecision, preparationstate))) ___>: (equiv_shared_0.EIT_Acquisition_Session_Coordinator.PreparationStateGovernor_acquisitionCoordinationProcess_preparationStateGovernor_Candidate_GumboX.inititialize_IEP_Post(committedpreparationstate, preparationdecision, preparationstate))) & T))
  }
}
