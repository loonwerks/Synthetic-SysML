// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4ed86cfed9ce_2_Complement {
  @pure def check(
      image_frame: equiv_shared_0.EIT_Acquisition_Supervisor.ImageFrame,
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      release_proposal: equiv_shared_0.EIT_Acquisition_Supervisor.Proposal.Type,
      session_frame: equiv_shared_0.EIT_Acquisition_Supervisor.SessionFrame): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_GumboX.inititialize_IEP_Post(release_proposal))) & T)))
  }
}
