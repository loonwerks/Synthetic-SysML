// #Sireum

package scp_candidate.EIT_Acquisition_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PublicationComposition_acquisition_process_publication_composition {

  def initialise(api: PublicationComposition_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_control_frame(EIT_Acquisition_Supervisor.ControlFrame(EIT_Acquisition_Supervisor.AcquisitionCommand.NO_COMMAND, EIT_Acquisition_Supervisor.ImageCommand.NO_COMMAND))
    api.put_status_frame(EIT_Acquisition_Supervisor.StatusFrame(
      EIT_Acquisition_Supervisor.PublicMode.IDLE, EIT_Acquisition_Supervisor.SelectedCause.NO_ELIGIBLE_WORK,
      EIT_Acquisition_Supervisor.SessionState.IDLE, EIT_Acquisition_Supervisor.CycleState.DORMANT,
      EIT_Acquisition_Supervisor.ImageState.EMPTY, EIT_Acquisition_Supervisor.RecoveryState.HEALTHY,
      EIT_Acquisition_Supervisor.ImageDisposition.WITHHELD, EIT_Acquisition_Supervisor.DominantFault.NONE, F))
  }

  def timeTriggered(api: PublicationComposition_Operational_Api): Unit = {
    Contract(Modifies(api))
    val decision: EIT_Acquisition_Supervisor.DecisionFrame = api.get_decision_frame().get
    var control: EIT_Acquisition_Supervisor.ControlFrame = EIT_Acquisition_Supervisor.ControlFrame(EIT_Acquisition_Supervisor.AcquisitionCommand.NO_COMMAND, EIT_Acquisition_Supervisor.ImageCommand.NO_COMMAND)
    var mode: EIT_Acquisition_Supervisor.PublicMode.Type = EIT_Acquisition_Supervisor.PublicMode.IDLE
    var disposition: EIT_Acquisition_Supervisor.ImageDisposition.Type = EIT_Acquisition_Supervisor.ImageDisposition.WITHHELD
    if (decision.selectedAction == EIT_Acquisition_Supervisor.SelectedAction.EMERGENCY_HOLD ||
      decision.selectedAction == EIT_Acquisition_Supervisor.SelectedAction.STOP) {
      control = EIT_Acquisition_Supervisor.ControlFrame(EIT_Acquisition_Supervisor.AcquisitionCommand.REQUEST_STOP, EIT_Acquisition_Supervisor.ImageCommand.NO_COMMAND)
    } else if (decision.selectedAction == EIT_Acquisition_Supervisor.SelectedAction.START) {
      control = EIT_Acquisition_Supervisor.ControlFrame(EIT_Acquisition_Supervisor.AcquisitionCommand.REQUEST_START, EIT_Acquisition_Supervisor.ImageCommand.NO_COMMAND)
    } else if (decision.selectedAction == EIT_Acquisition_Supervisor.SelectedAction.COLLECT) {
      control = EIT_Acquisition_Supervisor.ControlFrame(EIT_Acquisition_Supervisor.AcquisitionCommand.REQUEST_COLLECTION, EIT_Acquisition_Supervisor.ImageCommand.NO_COMMAND)
    } else if (decision.selectedAction == EIT_Acquisition_Supervisor.SelectedAction.GENERATE_IMAGE) {
      control = EIT_Acquisition_Supervisor.ControlFrame(EIT_Acquisition_Supervisor.AcquisitionCommand.NO_COMMAND, EIT_Acquisition_Supervisor.ImageCommand.REQUEST_GENERATION)
    }
    if (decision.selectedAction == EIT_Acquisition_Supervisor.SelectedAction.EMERGENCY_HOLD) {
      if (decision.effectiveFaultPresent) { mode = EIT_Acquisition_Supervisor.PublicMode.FAULT }
      else { mode = EIT_Acquisition_Supervisor.PublicMode.RECOVERY }
    } else if (decision.selectedAction == EIT_Acquisition_Supervisor.SelectedAction.STOP) { mode = EIT_Acquisition_Supervisor.PublicMode.IDLE }
    else if (decision.selectedAction == EIT_Acquisition_Supervisor.SelectedAction.START) { mode = EIT_Acquisition_Supervisor.PublicMode.STARTING }
    else if (decision.selectedAction == EIT_Acquisition_Supervisor.SelectedAction.RELEASE_IMAGE) { mode = EIT_Acquisition_Supervisor.PublicMode.IMAGE_AVAILABLE; disposition = EIT_Acquisition_Supervisor.ImageDisposition.AVAILABLE_FOR_ANALYSIS }
    else if (decision.selectedAction == EIT_Acquisition_Supervisor.SelectedAction.GENERATE_IMAGE) { mode = EIT_Acquisition_Supervisor.PublicMode.IMAGING }
    else if (decision.selectedAction == EIT_Acquisition_Supervisor.SelectedAction.COLLECT) { mode = EIT_Acquisition_Supervisor.PublicMode.COLLECTING }
    else if (decision.sessionState == EIT_Acquisition_Supervisor.SessionState.MONITORING) { mode = EIT_Acquisition_Supervisor.PublicMode.MONITORING }
    api.put_control_frame(control)
    api.put_status_frame(EIT_Acquisition_Supervisor.StatusFrame(
      mode, decision.selectedCause, decision.sessionState, decision.cycleState, decision.imageState,
      decision.recoveryState, disposition, decision.dominantFault, decision.multipleFaults))
  }

  def finalise(api: PublicationComposition_Operational_Api): Unit = { }
}
