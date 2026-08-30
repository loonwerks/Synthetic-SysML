// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d18a07248538_2_Complement {
  @pure def check(
      collection_proposal: equiv_shared_0.EIT_Acquisition_Supervisor.Proposal.Type,
      cycle_frame: equiv_shared_0.EIT_Acquisition_Supervisor.CycleFrame,
      decision_frame: equiv_shared_0.EIT_Acquisition_Supervisor.DecisionFrame,
      image_frame: equiv_shared_0.EIT_Acquisition_Supervisor.ImageFrame,
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      release_proposal: equiv_shared_0.EIT_Acquisition_Supervisor.Proposal.Type,
      session_frame: equiv_shared_0.EIT_Acquisition_Supervisor.SessionFrame): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Supervisor.SupervisoryArbitration_acquisition_process_supervisory_arbitration_GumboX.compute_CEP_Post(collection_proposal, cycle_frame, image_frame, recovery_frame, release_proposal, session_frame, decision_frame))) & T)))
  }
}
