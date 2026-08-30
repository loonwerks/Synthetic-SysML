// #Sireum

package scp_candidate.Cabin_Air_Treatment_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter {

  def initialise(api: AirCarePriorityResultArbiter_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_RESULT_SAFE
        api.airTreatmentCommand == AirTreatmentCommand.Off &&
          api.airCareSupervisorStatus.mode == StatusMode.Idle &&
          api.airCareSupervisorStatus.reason == StatusReason.None
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_airTreatmentCommand(Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off)
    api.put_airCareSupervisorStatus(
      Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus(
        StatusMode.Idle,
        StatusReason.None))
  }

  def timeTriggered(api: AirCarePriorityResultArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val intent = api.get_requestIntent().get
    val air = api.get_airProposal().get
    val humidity = api.get_humidityProposal().get
    val gate = api.get_recoveryGate().get
    var command: AirTreatmentCommand.Type = AirTreatmentCommand.Off
    var mode: StatusMode.Type = StatusMode.Active
    var reason: StatusReason.Type = StatusReason.NoTreatmentNeeded
    if (gate == RecoveryMemory.FaultHeld) {
      mode = StatusMode.Recovery
      reason = StatusReason.ReadinessInvalid
    } else if (gate == RecoveryMemory.AwaitFresh) {
      mode = StatusMode.Recovery
      reason = StatusReason.AwaitFresh
    } else if (intent == RequestIntent.None) {
      mode = StatusMode.Idle
      reason = StatusReason.None
    } else if (intent == RequestIntent.BlockedInvalid) {
      mode = StatusMode.Attention
      reason = StatusReason.RequestInvalid
    } else if (intent == RequestIntent.BlockedRearm) {
      mode = StatusMode.Attention
      reason = StatusReason.RearmRequired
    } else if (air == AirProposal.FilterNormal || air == AirProposal.FilterIntensive) {
      if (air == AirProposal.FilterNormal) {
        command = AirTreatmentCommand.FilterNormal
      } else {
        command = AirTreatmentCommand.FilterIntensive
      }
      if (humidity == HumidityProposal.Dry) {
        reason = StatusReason.AirPriority
      } else if (humidity == HumidityProposal.InvalidHumidityObservation) {
        reason = StatusReason.HumidityObservationInvalid
      } else if (humidity == HumidityProposal.DryerUnavailable) {
        reason = StatusReason.DryerUnavailable
      } else {
        reason = StatusReason.Filtering
      }
    } else if (humidity == HumidityProposal.Dry) {
      command = AirTreatmentCommand.Dry
      if (air == AirProposal.InvalidAirObservation) {
        reason = StatusReason.AirObservationInvalid
      } else if (air == AirProposal.FilterUnavailable) {
        reason = StatusReason.FilterUnavailable
      } else {
        reason = StatusReason.Drying
      }
    } else if (air == AirProposal.InvalidAirObservation) {
      reason = StatusReason.AirObservationInvalid
    } else if (air == AirProposal.FilterUnavailable) {
      reason = StatusReason.FilterUnavailable
    } else if (humidity == HumidityProposal.InvalidHumidityObservation) {
      reason = StatusReason.HumidityObservationInvalid
    } else if (humidity == HumidityProposal.DryerUnavailable) {
      reason = StatusReason.DryerUnavailable
    }
    api.put_airTreatmentCommand(command)
    api.put_airCareSupervisorStatus(AirCareSupervisorStatus(mode, reason))
  }

  def finalise(api: AirCarePriorityResultArbiter_Operational_Api): Unit = { }
}
