// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_cf4c6d23de99_2_Valid {
  @pure def check(
      arbitrationresult: equiv_shared_0.Vehicle_Mode_Coordinator.ArbitrationResult,
      currentmode: equiv_shared_0.Vehicle_Mode_Coordinator.ControllerMode.Type,
      qualifiedtransition: equiv_shared_0.Vehicle_Mode_Coordinator.QualifiedTransition.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Mode_Coordinator.TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner_GumboX.compute_CEP_Post(arbitrationresult, currentmode, qualifiedtransition))) & T))
  }
}
