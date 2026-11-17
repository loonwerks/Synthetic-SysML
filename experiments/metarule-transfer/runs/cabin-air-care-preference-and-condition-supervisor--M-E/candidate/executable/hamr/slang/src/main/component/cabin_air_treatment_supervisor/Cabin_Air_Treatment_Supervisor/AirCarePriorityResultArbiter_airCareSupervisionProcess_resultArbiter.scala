// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter {

  def initialise(api: AirCarePriorityResultArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_airTreatmentCommand(AirTreatmentCommand.Off)
    api.put_airCareSupervisorStatus(AirCareSupervisorStatus.example())
  }

  def timeTriggered(api: AirCarePriorityResultArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_ARB_01_RECOVERY_DOMINATES
        (api.recoveryGate != RecoveryMemory.Ready) ___>: (api.airTreatmentCommand == AirTreatmentCommand.Off &
          (api.recoveryGate == RecoveryMemory.FaultHeld &
            api.airCareSupervisorStatus.mode == StatusMode.Recovery &
            api.airCareSupervisorStatus.reason == StatusReason.ReadinessInvalid |
            api.recoveryGate == RecoveryMemory.AwaitFresh &
              api.airCareSupervisorStatus.mode == StatusMode.Recovery &
              api.airCareSupervisorStatus.reason == StatusReason.AwaitFresh)),
        // case CASE_ARB_02_NONACTIONABLE_REQUEST
        (api.recoveryGate == RecoveryMemory.Ready &
          (api.requestIntent == RequestIntent.None |
            api.requestIntent == RequestIntent.BlockedInvalid |
            api.requestIntent == RequestIntent.BlockedRearm)) ___>: (api.airTreatmentCommand == AirTreatmentCommand.Off &
          (api.requestIntent == RequestIntent.None &
            api.airCareSupervisorStatus.mode == StatusMode.Idle &
            api.airCareSupervisorStatus.reason == StatusReason.None |
            api.requestIntent == RequestIntent.BlockedInvalid &
              api.airCareSupervisorStatus.mode == StatusMode.Attention &
              api.airCareSupervisorStatus.reason == StatusReason.RequestInvalid |
            api.requestIntent == RequestIntent.BlockedRearm &
              api.airCareSupervisorStatus.mode == StatusMode.Attention &
              api.airCareSupervisorStatus.reason == StatusReason.RearmRequired)),
        // case CASE_ARB_03_FILTRATION_PRIORITY
        (api.recoveryGate == RecoveryMemory.Ready &
          (api.requestIntent == RequestIntent.FreshAuto |
            api.requestIntent == RequestIntent.HeldAuto |
            api.requestIntent == RequestIntent.FreshPurge |
            api.requestIntent == RequestIntent.HeldPurge) &
          (api.airProposal == AirProposal.FilterNormal |
            api.airProposal == AirProposal.FilterIntensive)) ___>: (api.airCareSupervisorStatus.mode == StatusMode.Active &
          (api.airProposal == AirProposal.FilterNormal &
            api.airTreatmentCommand == AirTreatmentCommand.FilterNormal |
            api.airProposal == AirProposal.FilterIntensive &
              api.airTreatmentCommand == AirTreatmentCommand.FilterIntensive) &
          (api.humidityProposal == HumidityProposal.Dry &
            api.airCareSupervisorStatus.reason == StatusReason.AirPriority |
            api.humidityProposal == HumidityProposal.InvalidHumidityObservation &
              api.airCareSupervisorStatus.reason == StatusReason.HumidityObservationInvalid |
            api.humidityProposal == HumidityProposal.DryerUnavailable &
              api.airCareSupervisorStatus.reason == StatusReason.DryerUnavailable |
            api.humidityProposal == HumidityProposal.None &
              api.airCareSupervisorStatus.reason == StatusReason.Filtering)),
        // case CASE_ARB_04_DRY_OR_OFF_RESIDUAL
        (api.recoveryGate == RecoveryMemory.Ready &
          (api.requestIntent == RequestIntent.FreshAuto |
            api.requestIntent == RequestIntent.HeldAuto |
            api.requestIntent == RequestIntent.FreshPurge |
            api.requestIntent == RequestIntent.HeldPurge) &
          (api.airProposal == AirProposal.None |
            api.airProposal == AirProposal.InvalidAirObservation |
            api.airProposal == AirProposal.FilterUnavailable)) ___>: (api.airCareSupervisorStatus.mode == StatusMode.Active &
          (api.humidityProposal == HumidityProposal.Dry &
            api.airTreatmentCommand == AirTreatmentCommand.Dry &
            (api.airProposal == AirProposal.InvalidAirObservation &
              api.airCareSupervisorStatus.reason == StatusReason.AirObservationInvalid |
              api.airProposal == AirProposal.FilterUnavailable &
                api.airCareSupervisorStatus.reason == StatusReason.FilterUnavailable |
              api.airProposal == AirProposal.None &
                api.airCareSupervisorStatus.reason == StatusReason.Drying) |
            api.humidityProposal != HumidityProposal.Dry &
              api.airTreatmentCommand == AirTreatmentCommand.Off &
              (api.airProposal == AirProposal.InvalidAirObservation &
                api.airCareSupervisorStatus.reason == StatusReason.AirObservationInvalid |
                api.airProposal == AirProposal.FilterUnavailable &
                  api.airCareSupervisorStatus.reason == StatusReason.FilterUnavailable |
                api.airProposal == AirProposal.None &
                  api.humidityProposal == HumidityProposal.InvalidHumidityObservation &
                  api.airCareSupervisorStatus.reason == StatusReason.HumidityObservationInvalid |
                api.airProposal == AirProposal.None &
                  api.humidityProposal == HumidityProposal.DryerUnavailable &
                  api.airCareSupervisorStatus.reason == StatusReason.DryerUnavailable |
                api.airProposal == AirProposal.None &
                  api.humidityProposal == HumidityProposal.None &
                  api.airCareSupervisorStatus.reason == StatusReason.NoTreatmentNeeded)))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val intent = api.get_requestIntent().get
    val air = api.get_airProposal().get
    val humidity = api.get_humidityProposal().get
    val gate = api.get_recoveryGate().get

    var command = AirTreatmentCommand.Off
    var mode = StatusMode.Active
    var reason = StatusReason.NoTreatmentNeeded

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
    } else if (air == AirProposal.FilterNormal | air == AirProposal.FilterIntensive) {
      command =
        if (air == AirProposal.FilterNormal) AirTreatmentCommand.FilterNormal
        else AirTreatmentCommand.FilterIntensive
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
