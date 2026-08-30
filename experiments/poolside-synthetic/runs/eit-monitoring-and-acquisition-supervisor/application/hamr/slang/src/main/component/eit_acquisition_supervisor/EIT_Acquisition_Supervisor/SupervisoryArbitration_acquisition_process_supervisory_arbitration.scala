// #Sireum

package eit_acquisition_supervisor.EIT_Acquisition_Supervisor

import org.sireum._
import eit_acquisition_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object SupervisoryArbitration_acquisition_process_supervisory_arbitration {

  def initialise(api: SupervisoryArbitration_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_decision_frame(
      EIT_Acquisition_Supervisor.DecisionFrame(
        selectedAction = EIT_Acquisition_Supervisor.SelectedAction.HOLD,
        selectedCause = EIT_Acquisition_Supervisor.SelectedCause.NO_ELIGIBLE_WORK,
        sessionState = EIT_Acquisition_Supervisor.SessionState.IDLE,
        cycleState = EIT_Acquisition_Supervisor.CycleState.DORMANT,
        imageState = EIT_Acquisition_Supervisor.ImageState.EMPTY,
        recoveryState = EIT_Acquisition_Supervisor.RecoveryState.HEALTHY,
        imageAvailable = F,
        effectiveFaultPresent = F,
        dominantFault = EIT_Acquisition_Supervisor.DominantFault.NONE,
        multipleFaults = F,
        recoveryGate = EIT_Acquisition_Supervisor.RecoveryGate.OPEN))
  }

  def timeTriggered(api: SupervisoryArbitration_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val recovery_frame: EIT_Acquisition_Supervisor.RecoveryFrame =
      api.get_recovery_frame() match {
        case Some(v: EIT_Acquisition_Supervisor.RecoveryFrame) => v
        case _ => EIT_Acquisition_Supervisor.RecoveryFrame.example()
      }

    val session_frame: EIT_Acquisition_Supervisor.SessionFrame =
      api.get_session_frame() match {
        case Some(v: EIT_Acquisition_Supervisor.SessionFrame) => v
        case _ => EIT_Acquisition_Supervisor.SessionFrame.example()
      }

    val cycle_frame: EIT_Acquisition_Supervisor.CycleFrame =
      api.get_cycle_frame() match {
        case Some(v: EIT_Acquisition_Supervisor.CycleFrame) => v
        case _ => EIT_Acquisition_Supervisor.CycleFrame.example()
      }

    val image_frame: EIT_Acquisition_Supervisor.ImageFrame =
      api.get_image_frame() match {
        case Some(v: EIT_Acquisition_Supervisor.ImageFrame) => v
        case _ => EIT_Acquisition_Supervisor.ImageFrame.example()
      }

    val collection_proposal: EIT_Acquisition_Supervisor.Proposal.Type =
      api.get_collection_proposal() match {
        case Some(v: EIT_Acquisition_Supervisor.Proposal.Type) => v
        case _ => EIT_Acquisition_Supervisor.Proposal.NOT_PROPOSED
      }

    val release_proposal: EIT_Acquisition_Supervisor.Proposal.Type =
      api.get_release_proposal() match {
        case Some(v: EIT_Acquisition_Supervisor.Proposal.Type) => v
        case _ => EIT_Acquisition_Supervisor.Proposal.NOT_PROPOSED
      }

    val recoveryGate: EIT_Acquisition_Supervisor.RecoveryGate.Type = recovery_frame.recoveryGate

    val (selectedAction, selectedCause): (EIT_Acquisition_Supervisor.SelectedAction.Type, EIT_Acquisition_Supervisor.SelectedCause.Type) =
      if (recoveryGate == EIT_Acquisition_Supervisor.RecoveryGate.CLOSED) {
        (EIT_Acquisition_Supervisor.SelectedAction.EMERGENCY_HOLD,
         EIT_Acquisition_Supervisor.SelectedCause.FAULT_OR_RECOVERY)
      } else if (session_frame.stopAdmitted) {
        (EIT_Acquisition_Supervisor.SelectedAction.STOP,
         EIT_Acquisition_Supervisor.SelectedCause.DOCTOR_STOP)
      } else if (session_frame.startAdmitted) {
        (EIT_Acquisition_Supervisor.SelectedAction.START,
         EIT_Acquisition_Supervisor.SelectedCause.DOCTOR_START)
      } else if (release_proposal == EIT_Acquisition_Supervisor.Proposal.PROPOSED) {
        (EIT_Acquisition_Supervisor.SelectedAction.RELEASE_IMAGE,
         EIT_Acquisition_Supervisor.SelectedCause.IMAGE_AVAILABLE)
      } else if (image_frame.generateProposal) {
        (EIT_Acquisition_Supervisor.SelectedAction.GENERATE_IMAGE,
         EIT_Acquisition_Supervisor.SelectedCause.USABLE_BATCH)
      } else if (collection_proposal == EIT_Acquisition_Supervisor.Proposal.PROPOSED) {
        (EIT_Acquisition_Supervisor.SelectedAction.COLLECT,
         EIT_Acquisition_Supervisor.SelectedCause.READY_TO_COLLECT)
      } else {
        (EIT_Acquisition_Supervisor.SelectedAction.HOLD,
         EIT_Acquisition_Supervisor.SelectedCause.NO_ELIGIBLE_WORK)
      }

    val imageAvailable: B = image_frame.imageState == EIT_Acquisition_Supervisor.ImageState.AVAILABLE

    api.put_decision_frame(
      EIT_Acquisition_Supervisor.DecisionFrame(
        selectedAction = selectedAction,
        selectedCause = selectedCause,
        sessionState = session_frame.sessionState,
        cycleState = cycle_frame.cycleState,
        imageState = image_frame.imageState,
        recoveryState = recovery_frame.recoveryState,
        imageAvailable = imageAvailable,
        effectiveFaultPresent = recovery_frame.effectiveFaultPresent,
        dominantFault = recovery_frame.dominantFault,
        multipleFaults = recovery_frame.effectiveMultipleFaults,
        recoveryGate = recoveryGate))
  }

  def finalise(api: SupervisoryArbitration_Operational_Api): Unit = { }
}
