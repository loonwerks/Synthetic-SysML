// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ea815cd08364_1_Valid {
  @pure def check(
      acquisitioncommand: equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionCommand.Type,
      acquisitionevidence: equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidence.Type,
      monitoringresolution: equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringResolution,
      qualifiedrequest: equiv_shared_0.EIT_Acquisition_Coordinator.QualifiedRequest.Type,
      recoveryphase: equiv_shared_0.EIT_Acquisition_Coordinator.RecoveryPhase.Type,
      sessionmode: equiv_shared_0.EIT_Acquisition_Coordinator.SessionMode.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
