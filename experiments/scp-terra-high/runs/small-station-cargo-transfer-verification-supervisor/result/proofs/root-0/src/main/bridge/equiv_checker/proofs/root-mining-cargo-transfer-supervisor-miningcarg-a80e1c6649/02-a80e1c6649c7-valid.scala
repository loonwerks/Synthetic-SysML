// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a80e1c6649c7_2_Valid {
  @pure def check(
      resolution: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferResolution,
      supervisorstatus: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.Type,
      verificationfinding: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_Candidate_GumboX.inititialize_IEP_Post(supervisorstatus, verificationfinding))) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferReportDerivation_supervisionProcess_transferReportDerivation_GumboX.inititialize_IEP_Post(supervisorstatus, verificationfinding))) & T))
  }
}
