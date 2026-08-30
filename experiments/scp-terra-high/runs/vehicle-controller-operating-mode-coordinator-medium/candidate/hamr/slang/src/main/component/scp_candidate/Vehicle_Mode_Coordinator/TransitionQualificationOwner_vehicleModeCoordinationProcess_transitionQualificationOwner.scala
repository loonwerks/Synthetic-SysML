// #Sireum

package scp_candidate.Vehicle_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object TransitionQualificationOwner_vehicleModeCoordinationProcess_transitionQualificationOwner {

  def initialise(api: TransitionQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_qualifiedTransition(QualifiedTransition.QualifiedStay)
  }

  def timeTriggered(api: TransitionQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val arbitration: Vehicle_Mode_Coordinator.ArbitrationResult = api.get_arbitrationResult().get
    val mode: Vehicle_Mode_Coordinator.ControllerMode.Type = api.get_currentMode().get
    val qualified: Vehicle_Mode_Coordinator.QualifiedTransition.Type = arbitration.selectedIntent match {
      case SelectedIntent.SelectOff => QualifiedTransition.QualifiedGoOff
      case SelectedIntent.SelectInvalidDegraded => QualifiedTransition.QualifiedGoDegraded
      case SelectedIntent.SelectConditionDegraded => QualifiedTransition.QualifiedGoDegraded
      case SelectedIntent.SelectMaintenance =>
        if (mode == ControllerMode.Degraded) QualifiedTransition.QualifiedReject
        else QualifiedTransition.QualifiedGoMaintenance
      case SelectedIntent.SelectReturn =>
        if (mode == ControllerMode.Degraded) QualifiedTransition.QualifiedResumeStored
        else if (mode == ControllerMode.Maintenance) QualifiedTransition.QualifiedGoOff
        else QualifiedTransition.QualifiedReject
      case SelectedIntent.SelectOn =>
        if (mode == ControllerMode.Starting) QualifiedTransition.QualifiedGoOn
        else QualifiedTransition.QualifiedReject
      case SelectedIntent.SelectStart =>
        if (mode == ControllerMode.Off) QualifiedTransition.QualifiedGoStarting
        else QualifiedTransition.QualifiedReject
      case SelectedIntent.SelectHold => QualifiedTransition.QualifiedStay
    }
    api.put_qualifiedTransition(qualified)
  }

  def finalise(api: TransitionQualificationOwner_Operational_Api): Unit = { }
}
