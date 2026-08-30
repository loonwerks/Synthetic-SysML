// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4ed86cfed9ce_1_Valid {
  @pure def check(
      image_frame: equiv_shared_0.EIT_Acquisition_Supervisor.ImageFrame,
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      release_proposal: equiv_shared_0.EIT_Acquisition_Supervisor.Proposal.Type,
      session_frame: equiv_shared_0.EIT_Acquisition_Supervisor.SessionFrame): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
