// #Sireum

package equiv_shared_0.Vehicle_Controller_Mode_Coordinator

import org.sireum._
import equiv_shared_0._

object CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation {
  // BEGIN FUNCTIONS
  @strictpure def result_for(reason: Vehicle_Controller_Mode_Coordinator.DecisionReason.Type): Vehicle_Controller_Mode_Coordinator.CoordinationResult.Type = if (reason == DecisionReason.InvalidEvidence) CoordinationResult.EvidenceFault else if (reason == DecisionReason.NoRequest) CoordinationResult.Stable else if (reason == DecisionReason.ConflictingRequestsRejected |
          reason == DecisionReason.ReturnNotApplicable |
          reason == DecisionReason.TransitionRejected) CoordinationResult.Rejected else CoordinationResult.Applied
  // END FUNCTIONS
}
