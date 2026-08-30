// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6ecfc986f6a9_3_Valid {
  @pure def check(
      faultsummary: equiv_shared_0.EIT_Image_Availability_Coordinator.FaultSummary,
      recoveryevent: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryEvent.Type,
      recoveryframe: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryFrame,
      recovery: equiv_shared_0.EIT_Image_Availability_Coordinator.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
