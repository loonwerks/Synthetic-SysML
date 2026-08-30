// #Sireum

package eit_acquisition_supervisor.EIT_Acquisition_Supervisor

import org.sireum._
import eit_acquisition_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PublicationComposition_acquisition_process_publication_composition {

  def initialise(api: PublicationComposition_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_control_frame(
      EIT_Acquisition_Supervisor.ControlFrame(
        acquisitionCommand = EIT_Acquisition_Supervisor.AcquisitionCommand.NO_COMMAND,
        imageCommand = EIT_Acquisition_Supervisor.ImageCommand.NO_COMMAND))
    api.put_status_frame(
      EIT_Acquisition_Supervisor.StatusFrame(
        publicMode = EIT_Acquisition_Supervisor.PublicMode.IDLE,
        selectedCause = EIT_Acquisition_Supervisor.SelectedCause.NO_ELIGIBLE_WORK,
        sessionState = EIT_Acquisition_Supervisor.SessionState.IDLE,
        cycleState = EIT_Acquisition_Supervisor.CycleState.DORMANT,
        imageState = EIT_Acquisition_Supervisor.ImageState.EMPTY,
        recoveryState = EIT_Acquisition_Supervisor.RecoveryState.HEALTHY,
        imageDisposition = EIT_Acquisition_Supervisor.ImageDisposition.WITHHELD,
        dominantFault = EIT_Acquisition_Supervisor.DominantFault.NONE,
        multipleFaults = F))
  }

  def timeTriggered(api: PublicationComposition_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val decision_frame: EIT_Acquisition_Supervisor.DecisionFrame =
      api.get_decision_frame() match {
        case Some(v: EIT_Acquisition_Supervisor.DecisionFrame) => v
        case _ => EIT_Acquisition_Supervisor.DecisionFrame.example()
      }

    val selectedAction: EIT_Acquisition_Supervisor.SelectedAction.Type = decision_frame.selectedAction

    val (acquisitionCommand, imageCommand): (EIT_Acquisition_Supervisor.AcquisitionCommand.Type, EIT_Acquisition_Supervisor.ImageCommand.Type) =
      if (selectedAction == EIT_Acquisition_Supervisor.SelectedAction.EMERGENCY_HOLD ||
          selectedAction == EIT_Acquisition_Supervisor.SelectedAction.STOP) {
        (EIT_Acquisition_Supervisor.AcquisitionCommand.REQUEST_STOP,
         EIT_Acquisition_Supervisor.ImageCommand.NO_COMMAND)
      } else if (selectedAction == EIT_Acquisition_Supervisor.SelectedAction.START) {
        (EIT_Acquisition_Supervisor.AcquisitionCommand.REQUEST_START,
         EIT_Acquisition_Supervisor.ImageCommand.NO_COMMAND)
      } else if (selectedAction == EIT_Acquisition_Supervisor.SelectedAction.COLLECT) {
        (EIT_Acquisition_Supervisor.AcquisitionCommand.REQUEST_COLLECTION,
         EIT_Acquisition_Supervisor.ImageCommand.NO_COMMAND)
      } else if (selectedAction == EIT_Acquisition_Supervisor.SelectedAction.GENERATE_IMAGE) {
        (EIT_Acquisition_Supervisor.AcquisitionCommand.NO_COMMAND,
         EIT_Acquisition_Supervisor.ImageCommand.REQUEST_GENERATION)
      } else {
        (EIT_Acquisition_Supervisor.AcquisitionCommand.NO_COMMAND,
         EIT_Acquisition_Supervisor.ImageCommand.NO_COMMAND)
      }

    val imageDisposition: EIT_Acquisition_Supervisor.ImageDisposition.Type =
      if (selectedAction == EIT_Acquisition_Supervisor.SelectedAction.RELEASE_IMAGE) {
        EIT_Acquisition_Supervisor.ImageDisposition.AVAILABLE_FOR_ANALYSIS
      } else {
        EIT_Acquisition_Supervisor.ImageDisposition.WITHHELD
      }

    val publicMode: EIT_Acquisition_Supervisor.PublicMode.Type =
      if (selectedAction == EIT_Acquisition_Supervisor.SelectedAction.EMERGENCY_HOLD &&
          decision_frame.effectiveFaultPresent) {
        EIT_Acquisition_Supervisor.PublicMode.FAULT
      } else if (selectedAction == EIT_Acquisition_Supervisor.SelectedAction.STOP) {
        EIT_Acquisition_Supervisor.PublicMode.IDLE
      } else if (selectedAction == EIT_Acquisition_Supervisor.SelectedAction.START) {
        EIT_Acquisition_Supervisor.PublicMode.STARTING
      } else if (selectedAction == EIT_Acquisition_Supervisor.SelectedAction.RELEASE_IMAGE) {
        EIT_Acquisition_Supervisor.PublicMode.IMAGE_AVAILABLE
      } else if (selectedAction == EIT_Acquisition_Supervisor.SelectedAction.GENERATE_IMAGE) {
        EIT_Acquisition_Supervisor.PublicMode.IMAGING
      } else if (selectedAction == EIT_Acquisition_Supervisor.SelectedAction.COLLECT) {
        EIT_Acquisition_Supervisor.PublicMode.COLLECTING
      } else if (selectedAction == EIT_Acquisition_Supervisor.SelectedAction.HOLD) {
        if (decision_frame.sessionState == EIT_Acquisition_Supervisor.SessionState.MONITORING) {
          EIT_Acquisition_Supervisor.PublicMode.MONITORING
        } else {
          EIT_Acquisition_Supervisor.PublicMode.IDLE
        }
      } else {
        EIT_Acquisition_Supervisor.PublicMode.IDLE
      }

    api.put_control_frame(
      EIT_Acquisition_Supervisor.ControlFrame(
        acquisitionCommand = acquisitionCommand,
        imageCommand = imageCommand))

    api.put_status_frame(
      EIT_Acquisition_Supervisor.StatusFrame(
        publicMode = publicMode,
        selectedCause = decision_frame.selectedCause,
        sessionState = decision_frame.sessionState,
        cycleState = decision_frame.cycleState,
        imageState = decision_frame.imageState,
        recoveryState = decision_frame.recoveryState,
        imageDisposition = imageDisposition,
        dominantFault = decision_frame.dominantFault,
        multipleFaults = decision_frame.multipleFaults))
  }

  def finalise(api: PublicationComposition_Operational_Api): Unit = { }
}
