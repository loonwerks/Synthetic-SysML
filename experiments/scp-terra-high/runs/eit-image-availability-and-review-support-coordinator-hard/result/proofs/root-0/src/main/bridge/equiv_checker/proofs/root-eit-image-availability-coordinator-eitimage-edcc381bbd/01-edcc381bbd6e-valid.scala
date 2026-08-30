// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_edcc381bbd6e_1_Valid {
  @pure def check(
      faultsummary: equiv_shared_0.EIT_Image_Availability_Coordinator.FaultSummary,
      recoveryevent: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryEvent.Type,
      recoveryframe: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryFrame,
      in_recovery: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryState.Type,
      recovery: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
