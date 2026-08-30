// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a2b6534af697_1_Valid {
  @pure def check(
      acquisitioncommand: equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionCommand.Type,
      acquisitionevidence: equiv_shared_0.EIT_Acquisition_Coordinator.AcquisitionEvidence.Type,
      monitoringresolution: equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringResolution,
      qualifiedrequest: equiv_shared_0.EIT_Acquisition_Coordinator.QualifiedRequest.Type,
      in_recoveryphase: equiv_shared_0.EIT_Acquisition_Coordinator.RecoveryPhase.Type,
      recoveryphase: equiv_shared_0.EIT_Acquisition_Coordinator.RecoveryPhase.Type,
      in_sessionmode: equiv_shared_0.EIT_Acquisition_Coordinator.SessionMode.Type,
      sessionmode: equiv_shared_0.EIT_Acquisition_Coordinator.SessionMode.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
