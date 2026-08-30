// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_992862f9cf73_3_Valid {
  @pure def check(
      arbitrationdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.ArbitrationDecision,
      preparationdecision: equiv_shared_0.EIT_Acquisition_Session_Coordinator.PreparationDecisionSnapshot,
      preparationstate: equiv_shared_0.EIT_Acquisition_Session_Coordinator.PreparationState.Type,
      in_committedpreparationstate: equiv_shared_0.EIT_Acquisition_Session_Coordinator.PreparationState.Type,
      committedpreparationstate: equiv_shared_0.EIT_Acquisition_Session_Coordinator.PreparationState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
