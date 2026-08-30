// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_cf4c6d23de99_1_Valid {
  @pure def check(
      arbitrationresult: equiv_shared_0.Vehicle_Mode_Coordinator.ArbitrationResult,
      currentmode: equiv_shared_0.Vehicle_Mode_Coordinator.ControllerMode.Type,
      qualifiedtransition: equiv_shared_0.Vehicle_Mode_Coordinator.QualifiedTransition.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
