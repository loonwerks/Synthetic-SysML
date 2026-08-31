// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter {

  def status(mode: StatusMode.Type, reason: StatusReason.Type): AirCareSupervisorStatus = {
    Contract(Ensures(Res == AirCareSupervisorStatus(mode, reason)))
    return AirCareSupervisorStatus(mode, reason)
  }

  def initialise(api: AirCarePriorityResultArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_airTreatmentCommand(AirTreatmentCommand.Off)
    api.put_airCareSupervisorStatus(status(StatusMode.Idle, StatusReason.None))
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
    val recoveryGate = api.get_recoveryGate().get
    val requestIntent = api.get_requestIntent().get
    val airProposal = api.get_airProposal().get
    val humidityProposal = api.get_humidityProposal().get
    val result: (AirTreatmentCommand.Type, AirCareSupervisorStatus) =
      recoveryGate match {
        case RecoveryMemory.FaultHeld =>
          (AirTreatmentCommand.Off, status(StatusMode.Recovery, StatusReason.ReadinessInvalid))
        case RecoveryMemory.AwaitFresh =>
          (AirTreatmentCommand.Off, status(StatusMode.Recovery, StatusReason.AwaitFresh))
        case RecoveryMemory.Ready =>
          requestIntent match {
            case RequestIntent.None =>
              (AirTreatmentCommand.Off, status(StatusMode.Idle, StatusReason.None))
            case RequestIntent.BlockedInvalid =>
              (AirTreatmentCommand.Off, status(StatusMode.Attention, StatusReason.RequestInvalid))
            case RequestIntent.BlockedRearm =>
              (AirTreatmentCommand.Off, status(StatusMode.Attention, StatusReason.RearmRequired))
            case _ =>
              (airProposal, humidityProposal) match {
                case (AirProposal.FilterNormal, HumidityProposal.Dry) =>
                  (AirTreatmentCommand.FilterNormal, status(StatusMode.Active, StatusReason.AirPriority))
                case (AirProposal.FilterIntensive, HumidityProposal.Dry) =>
                  (AirTreatmentCommand.FilterIntensive, status(StatusMode.Active, StatusReason.AirPriority))
                case (AirProposal.FilterNormal, HumidityProposal.InvalidHumidityObservation) =>
                  (AirTreatmentCommand.FilterNormal, status(StatusMode.Active, StatusReason.HumidityObservationInvalid))
                case (AirProposal.FilterIntensive, HumidityProposal.InvalidHumidityObservation) =>
                  (AirTreatmentCommand.FilterIntensive, status(StatusMode.Active, StatusReason.HumidityObservationInvalid))
                case (AirProposal.FilterNormal, HumidityProposal.DryerUnavailable) =>
                  (AirTreatmentCommand.FilterNormal, status(StatusMode.Active, StatusReason.DryerUnavailable))
                case (AirProposal.FilterIntensive, HumidityProposal.DryerUnavailable) =>
                  (AirTreatmentCommand.FilterIntensive, status(StatusMode.Active, StatusReason.DryerUnavailable))
                case (AirProposal.FilterNormal, _) =>
                  (AirTreatmentCommand.FilterNormal, status(StatusMode.Active, StatusReason.Filtering))
                case (AirProposal.FilterIntensive, _) =>
                  (AirTreatmentCommand.FilterIntensive, status(StatusMode.Active, StatusReason.Filtering))
                case (AirProposal.InvalidAirObservation, HumidityProposal.Dry) =>
                  (AirTreatmentCommand.Dry, status(StatusMode.Active, StatusReason.AirObservationInvalid))
                case (AirProposal.FilterUnavailable, HumidityProposal.Dry) =>
                  (AirTreatmentCommand.Dry, status(StatusMode.Active, StatusReason.FilterUnavailable))
                case (AirProposal.None, HumidityProposal.Dry) =>
                  (AirTreatmentCommand.Dry, status(StatusMode.Active, StatusReason.Drying))
                case (AirProposal.InvalidAirObservation, _) =>
                  (AirTreatmentCommand.Off, status(StatusMode.Active, StatusReason.AirObservationInvalid))
                case (AirProposal.FilterUnavailable, _) =>
                  (AirTreatmentCommand.Off, status(StatusMode.Active, StatusReason.FilterUnavailable))
                case (AirProposal.None, HumidityProposal.InvalidHumidityObservation) =>
                  (AirTreatmentCommand.Off, status(StatusMode.Active, StatusReason.HumidityObservationInvalid))
                case (AirProposal.None, HumidityProposal.DryerUnavailable) =>
                  (AirTreatmentCommand.Off, status(StatusMode.Active, StatusReason.DryerUnavailable))
                case _ =>
                  (AirTreatmentCommand.Off, status(StatusMode.Active, StatusReason.NoTreatmentNeeded))
              }
          }
      }
    api.put_airTreatmentCommand(result._1)
    api.put_airCareSupervisorStatus(result._2)
  }

  def finalise(api: AirCarePriorityResultArbiter_Operational_Api): Unit = { }
}
