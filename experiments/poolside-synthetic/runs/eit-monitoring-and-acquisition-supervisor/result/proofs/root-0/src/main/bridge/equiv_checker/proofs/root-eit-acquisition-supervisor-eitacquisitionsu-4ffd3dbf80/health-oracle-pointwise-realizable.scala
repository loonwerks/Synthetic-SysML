// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_4ffd3dbf806d_Oracle_Pointwise_Realizable {
  @pure def check(
      image_frame: equiv_shared_0.EIT_Acquisition_Supervisor.ImageFrame,
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      session_frame: equiv_shared_0.EIT_Acquisition_Supervisor.SessionFrame): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_GumboX.compute_CEP_Post(image_frame, recovery_frame, session_frame, equiv_shared_0.EIT_Acquisition_Supervisor.Proposal.PROPOSED)) |
        (equiv_shared_0.EIT_Acquisition_Supervisor.ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility_GumboX.compute_CEP_Post(image_frame, recovery_frame, session_frame, equiv_shared_0.EIT_Acquisition_Supervisor.Proposal.NOT_PROPOSED)))))
  }
}
