// #Sireum

package scp_candidate.EIT_Acquisition_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object SupervisoryArbitration_acquisition_process_supervisory_arbitration {

  def initialise(api: SupervisoryArbitration_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_decision_frame(EIT_Acquisition_Supervisor.DecisionFrame(
      EIT_Acquisition_Supervisor.SelectedAction.HOLD,
      EIT_Acquisition_Supervisor.SelectedCause.NO_ELIGIBLE_WORK,
      EIT_Acquisition_Supervisor.SessionState.IDLE,
      EIT_Acquisition_Supervisor.CycleState.DORMANT,
      EIT_Acquisition_Supervisor.ImageState.EMPTY,
      EIT_Acquisition_Supervisor.RecoveryState.HEALTHY,
      F, F, EIT_Acquisition_Supervisor.DominantFault.NONE, F,
      EIT_Acquisition_Supervisor.RecoveryGate.OPEN))
  }

  def timeTriggered(api: SupervisoryArbitration_Operational_Api): Unit = {
    Contract(Modifies(api))
    val recovery: EIT_Acquisition_Supervisor.RecoveryFrame = api.get_recovery_frame().get
    val session: EIT_Acquisition_Supervisor.SessionFrame = api.get_session_frame().get
    val cycle: EIT_Acquisition_Supervisor.CycleFrame = api.get_cycle_frame().get
    val image: EIT_Acquisition_Supervisor.ImageFrame = api.get_image_frame().get
    val collection: EIT_Acquisition_Supervisor.Proposal.Type = api.get_collection_proposal().get
    val release: EIT_Acquisition_Supervisor.Proposal.Type = api.get_release_proposal().get
    var action: EIT_Acquisition_Supervisor.SelectedAction.Type = EIT_Acquisition_Supervisor.SelectedAction.HOLD
    var cause: EIT_Acquisition_Supervisor.SelectedCause.Type = EIT_Acquisition_Supervisor.SelectedCause.NO_ELIGIBLE_WORK
    if (recovery.recoveryGate == EIT_Acquisition_Supervisor.RecoveryGate.CLOSED) {
      action = EIT_Acquisition_Supervisor.SelectedAction.EMERGENCY_HOLD
      cause = EIT_Acquisition_Supervisor.SelectedCause.FAULT_OR_RECOVERY
    } else if (session.stopAdmitted) {
      action = EIT_Acquisition_Supervisor.SelectedAction.STOP
      cause = EIT_Acquisition_Supervisor.SelectedCause.DOCTOR_STOP
    } else if (session.startAdmitted) {
      action = EIT_Acquisition_Supervisor.SelectedAction.START
      cause = EIT_Acquisition_Supervisor.SelectedCause.DOCTOR_START
    } else if (release == EIT_Acquisition_Supervisor.Proposal.PROPOSED) {
      action = EIT_Acquisition_Supervisor.SelectedAction.RELEASE_IMAGE
      cause = EIT_Acquisition_Supervisor.SelectedCause.IMAGE_AVAILABLE
    } else if (image.generateProposal) {
      action = EIT_Acquisition_Supervisor.SelectedAction.GENERATE_IMAGE
      cause = EIT_Acquisition_Supervisor.SelectedCause.USABLE_BATCH
    } else if (collection == EIT_Acquisition_Supervisor.Proposal.PROPOSED) {
      action = EIT_Acquisition_Supervisor.SelectedAction.COLLECT
      cause = EIT_Acquisition_Supervisor.SelectedCause.READY_TO_COLLECT
    }
    api.put_decision_frame(EIT_Acquisition_Supervisor.DecisionFrame(
      action, cause, session.sessionState, cycle.cycleState, image.imageState,
      recovery.recoveryState, image.imageState == EIT_Acquisition_Supervisor.ImageState.AVAILABLE,
      recovery.effectiveFaultPresent, recovery.dominantFault, recovery.effectiveMultipleFaults,
      recovery.recoveryGate))
  }

  def finalise(api: SupervisoryArbitration_Operational_Api): Unit = { }
}
