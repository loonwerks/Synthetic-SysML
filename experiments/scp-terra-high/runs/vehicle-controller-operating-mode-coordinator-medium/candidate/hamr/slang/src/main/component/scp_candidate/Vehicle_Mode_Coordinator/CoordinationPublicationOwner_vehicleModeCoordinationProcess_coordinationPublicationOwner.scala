// #Sireum

package scp_candidate.Vehicle_Mode_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object CoordinationPublicationOwner_vehicleModeCoordinationProcess_coordinationPublicationOwner {

  def initialise(api: CoordinationPublicationOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_COORDINATION_OUTCOME
        api.coordinationOutcome.parkingBrake == ParkingBrakeDisposition.Apply &
          api.coordinationOutcome.status == CoordinationStatus.IdleOff
        // END INITIALIZES ENSURES
      )
    )
    api.put_coordinationOutcome(Vehicle_Mode_Coordinator.CoordinationOutcome(
      ParkingBrakeDisposition.Apply, CoordinationStatus.IdleOff))
  }

  def timeTriggered(api: CoordinationPublicationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val arbitration: Vehicle_Mode_Coordinator.ArbitrationResult = api.get_arbitrationResult().get
    val resolution: Vehicle_Mode_Coordinator.TransitionResolution = api.get_appliedResolution().get
    val status: Vehicle_Mode_Coordinator.CoordinationStatus.Type =
      if (arbitration.selectedIntent == SelectedIntent.SelectOff & arbitration.priorityConflict) {
        CoordinationStatus.ShutdownDominant
      } else if (resolution.kind == TransitionKind.Reject) {
        CoordinationStatus.RequestInapplicable
      } else if (resolution.kind == TransitionKind.ResumeStored) {
        CoordinationStatus.RecoveryResumed
      } else if (arbitration.selectedIntent == SelectedIntent.SelectInvalidDegraded) {
        CoordinationStatus.DegradedInvalid
      } else if (arbitration.selectedIntent == SelectedIntent.SelectConditionDegraded |
                 (!arbitration.priorityConflict & resolution.nextMode == ControllerMode.Degraded)) {
        CoordinationStatus.DegradedCondition
      } else if (arbitration.priorityConflict) {
        CoordinationStatus.RequestConflict
      } else if (resolution.nextMode == ControllerMode.Off) {
        CoordinationStatus.IdleOff
      } else if (resolution.nextMode == ControllerMode.Starting) {
        CoordinationStatus.StartingSequence
      } else if (resolution.nextMode == ControllerMode.On) {
        CoordinationStatus.Operating
      } else {
        CoordinationStatus.MaintenanceHandoff
      }
    val brake: Vehicle_Mode_Coordinator.ParkingBrakeDisposition.Type =
      if (resolution.nextMode == ControllerMode.On) ParkingBrakeDisposition.Release
      else ParkingBrakeDisposition.Apply
    api.put_coordinationOutcome(Vehicle_Mode_Coordinator.CoordinationOutcome(brake, status))
  }

  def finalise(api: CoordinationPublicationOwner_Operational_Api): Unit = { }
}
