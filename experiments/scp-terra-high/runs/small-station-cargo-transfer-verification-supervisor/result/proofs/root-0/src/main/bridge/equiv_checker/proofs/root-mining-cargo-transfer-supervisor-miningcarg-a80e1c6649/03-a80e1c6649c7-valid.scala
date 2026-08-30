// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a80e1c6649c7_3_Valid {
  @pure def check(
      resolution: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferResolution,
      supervisorstatus: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferSupervisorStatus.Type,
      verificationfinding: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.TransferVerificationFinding.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
