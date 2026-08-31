// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter {

  def initialise(api: AirCarePriorityResultArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_airTreatmentCommand(Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off)
    api.put_airCareSupervisorStatus(Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus(
      Cabin_Air_Treatment_Supervisor.StatusMode.Idle,
      Cabin_Air_Treatment_Supervisor.StatusReason.None))
  }

  def timeTriggered(api: AirCarePriorityResultArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_ARB_01_FAULT_HELD
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.FaultHeld) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Recovery &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.ReadinessInvalid),
        // case CASE_ARB_01_AWAIT_FRESH
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Recovery &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.AwaitFresh),
        // case CASE_ARB_02_NONE
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.None) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Idle &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.None),
        // case CASE_ARB_02_INVALID
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedInvalid) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Attention &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.RequestInvalid),
        // case CASE_ARB_02_REARM
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedRearm) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Attention &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.RearmRequired),
        // case CASE_ARB_03_NORMAL
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal &
          (api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry |
            api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.InvalidHumidityObservation |
            api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.DryerUnavailable |
            api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.None)) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.FilterNormal &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          (api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry &
            api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.AirPriority |
            api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.InvalidHumidityObservation &
              api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.HumidityObservationInvalid |
            api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.DryerUnavailable &
              api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.DryerUnavailable |
            api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.None &
              api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.Filtering)),
        // case CASE_ARB_03_INTENSIVE
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive &
          (api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry |
            api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.InvalidHumidityObservation |
            api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.DryerUnavailable |
            api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.None)) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.FilterIntensive &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          (api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry &
            api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.AirPriority |
            api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.InvalidHumidityObservation &
              api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.HumidityObservationInvalid |
            api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.DryerUnavailable &
              api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.DryerUnavailable |
            api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.None &
              api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.Filtering)),
        // case CASE_ARB_04_DRY
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None |
            api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation |
            api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable) &
          api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Dry &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation &
            api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.AirObservationInvalid |
            api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable &
              api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.FilterUnavailable |
            api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None &
              api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.Drying)),
        // case CASE_ARB_04_OFF
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None |
            api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation |
            api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable) &
          api.humidityProposal != Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation &
            api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.AirObservationInvalid |
            api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable &
              api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.FilterUnavailable |
            api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None &
              api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.InvalidHumidityObservation &
              api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.HumidityObservationInvalid |
            api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None &
              api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.DryerUnavailable &
              api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.DryerUnavailable |
            api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None &
              api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.None &
              api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.NoTreatmentNeeded))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_requestIntent(), api.get_airProposal(), api.get_humidityProposal(),
      api.get_recoveryGate()) match {
      case (Some(intent), Some(air), Some(humidity), Some(recovery)) =>
        if (recovery == Cabin_Air_Treatment_Supervisor.RecoveryMemory.FaultHeld) {
          api.put_airTreatmentCommand(Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off)
          api.put_airCareSupervisorStatus(Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus(
            Cabin_Air_Treatment_Supervisor.StatusMode.Recovery,
            Cabin_Air_Treatment_Supervisor.StatusReason.ReadinessInvalid))
        } else if (recovery == Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh) {
          api.put_airTreatmentCommand(Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off)
          api.put_airCareSupervisorStatus(Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus(
            Cabin_Air_Treatment_Supervisor.StatusMode.Recovery,
            Cabin_Air_Treatment_Supervisor.StatusReason.AwaitFresh))
        } else if (intent == Cabin_Air_Treatment_Supervisor.RequestIntent.None) {
          api.put_airTreatmentCommand(Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off)
          api.put_airCareSupervisorStatus(Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus(
            Cabin_Air_Treatment_Supervisor.StatusMode.Idle,
            Cabin_Air_Treatment_Supervisor.StatusReason.None))
        } else if (intent == Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedInvalid) {
          api.put_airTreatmentCommand(Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off)
          api.put_airCareSupervisorStatus(Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus(
            Cabin_Air_Treatment_Supervisor.StatusMode.Attention,
            Cabin_Air_Treatment_Supervisor.StatusReason.RequestInvalid))
        } else if (intent == Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedRearm) {
          api.put_airTreatmentCommand(Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off)
          api.put_airCareSupervisorStatus(Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus(
            Cabin_Air_Treatment_Supervisor.StatusMode.Attention,
            Cabin_Air_Treatment_Supervisor.StatusReason.RearmRequired))
        } else if (air == Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal |
          air == Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive) {
          if (air == Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal) {
            api.put_airTreatmentCommand(Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.FilterNormal)
          } else {
            api.put_airTreatmentCommand(Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.FilterIntensive)
          }
          val reason: Cabin_Air_Treatment_Supervisor.StatusReason.Type =
            if (humidity == Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry) {
              Cabin_Air_Treatment_Supervisor.StatusReason.AirPriority
            } else if (humidity == Cabin_Air_Treatment_Supervisor.HumidityProposal.InvalidHumidityObservation) {
              Cabin_Air_Treatment_Supervisor.StatusReason.HumidityObservationInvalid
            } else if (humidity == Cabin_Air_Treatment_Supervisor.HumidityProposal.DryerUnavailable) {
              Cabin_Air_Treatment_Supervisor.StatusReason.DryerUnavailable
            } else {
              Cabin_Air_Treatment_Supervisor.StatusReason.Filtering
            }
          api.put_airCareSupervisorStatus(Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus(
            Cabin_Air_Treatment_Supervisor.StatusMode.Active, reason))
        } else if (humidity == Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry) {
          val reason: Cabin_Air_Treatment_Supervisor.StatusReason.Type =
            if (air == Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation) {
              Cabin_Air_Treatment_Supervisor.StatusReason.AirObservationInvalid
            } else if (air == Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable) {
              Cabin_Air_Treatment_Supervisor.StatusReason.FilterUnavailable
            } else {
              Cabin_Air_Treatment_Supervisor.StatusReason.Drying
            }
          api.put_airTreatmentCommand(Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Dry)
          api.put_airCareSupervisorStatus(Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus(
            Cabin_Air_Treatment_Supervisor.StatusMode.Active, reason))
        } else {
          val reason: Cabin_Air_Treatment_Supervisor.StatusReason.Type =
            if (air == Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation) {
              Cabin_Air_Treatment_Supervisor.StatusReason.AirObservationInvalid
            } else if (air == Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable) {
              Cabin_Air_Treatment_Supervisor.StatusReason.FilterUnavailable
            } else if (humidity == Cabin_Air_Treatment_Supervisor.HumidityProposal.InvalidHumidityObservation) {
              Cabin_Air_Treatment_Supervisor.StatusReason.HumidityObservationInvalid
            } else if (humidity == Cabin_Air_Treatment_Supervisor.HumidityProposal.DryerUnavailable) {
              Cabin_Air_Treatment_Supervisor.StatusReason.DryerUnavailable
            } else {
              Cabin_Air_Treatment_Supervisor.StatusReason.NoTreatmentNeeded
            }
          api.put_airTreatmentCommand(Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off)
          api.put_airCareSupervisorStatus(Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus(
            Cabin_Air_Treatment_Supervisor.StatusMode.Active, reason))
        }
      case _ =>
        api.put_airTreatmentCommand(Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off)
        api.put_airCareSupervisorStatus(Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus(
          Cabin_Air_Treatment_Supervisor.StatusMode.Recovery,
          Cabin_Air_Treatment_Supervisor.StatusReason.ReadinessInvalid))
    }
  }

  def finalise(api: AirCarePriorityResultArbiter_Operational_Api): Unit = { }
}
