// #Sireum

package scp_candidate.Vehicle_Controller_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation {

  def initialise(api: CoordinationFrameDerivation_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_mode_disposition(Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Off)
    api.put_coordination_result(Vehicle_Controller_Mode_Coordinator.CoordinationResult.Stable)
  }

  def timeTriggered(api: CoordinationFrameDerivation_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_mode_decision() match {
      case Some(decision) =>
        val result: Vehicle_Controller_Mode_Coordinator.CoordinationResult.Type =
          if (decision.reason == Vehicle_Controller_Mode_Coordinator.DecisionReason.InvalidEvidence) {
            Vehicle_Controller_Mode_Coordinator.CoordinationResult.EvidenceFault
          } else if (decision.reason == Vehicle_Controller_Mode_Coordinator.DecisionReason.NoRequest) {
            Vehicle_Controller_Mode_Coordinator.CoordinationResult.Stable
          } else if (decision.reason == Vehicle_Controller_Mode_Coordinator.DecisionReason.ConflictingRequestsRejected ||
                     decision.reason == Vehicle_Controller_Mode_Coordinator.DecisionReason.ReturnNotApplicable ||
                     decision.reason == Vehicle_Controller_Mode_Coordinator.DecisionReason.TransitionRejected) {
            Vehicle_Controller_Mode_Coordinator.CoordinationResult.Rejected
          } else {
            Vehicle_Controller_Mode_Coordinator.CoordinationResult.Applied
          }
        api.put_mode_disposition(decision.nextMode)
        api.put_coordination_result(result)
    }
  }

  def finalise(api: CoordinationFrameDerivation_Operational_Api): Unit = { }
}
