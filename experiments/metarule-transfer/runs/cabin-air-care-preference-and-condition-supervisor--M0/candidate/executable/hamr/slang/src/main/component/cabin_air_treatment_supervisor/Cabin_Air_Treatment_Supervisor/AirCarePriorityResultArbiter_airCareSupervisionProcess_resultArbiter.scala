// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter {

  def initialise(api: AirCarePriorityResultArbiter_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(T)
    )
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
        //   Fault-held recovery dominates
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.FaultHeld) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Recovery &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.ReadinessInvalid),
        // case CASE_ARB_01_AWAIT_FRESH
        //   Await-fresh recovery dominates
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Recovery &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.AwaitFresh),
        // case CASE_ARB_02_NONE
        //   No request is idle
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.None) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Idle &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.None),
        // case CASE_ARB_02_INVALID
        //   Invalid request receives attention
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedInvalid) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Attention &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.RequestInvalid),
        // case CASE_ARB_02_REARM
        //   Rearm-blocked request receives attention
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedRearm) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Attention &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.RearmRequired),
        // case CASE_ARB_03_NORMAL_FILTERING
        //   Normal filtration is active
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge) &
          api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal &
          api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.None) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.FilterNormal &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.Filtering),
        // case CASE_ARB_03_INTENSIVE_FILTERING
        //   Intensive filtration is active
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge) &
          api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive &
          api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.None) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.FilterIntensive &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.Filtering),
        // case CASE_ARB_03_PRIORITY
        //   Filtration outranks drying
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge) &
          (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal |
            api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive) &
          api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry) ___>: (api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.AirPriority &
          ((api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal ___>:
            api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.FilterNormal) &
            (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive ___>:
              api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.FilterIntensive))),
        // case CASE_ARB_03_FILTER_HUMIDITY_INVALID
        //   Filtering preserves humidity diagnostic
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge) &
          (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal |
            api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive) &
          api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.InvalidHumidityObservation) ___>: (api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.HumidityObservationInvalid &
          ((api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal ___>:
            api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.FilterNormal) &
            (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive ___>:
              api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.FilterIntensive))),
        // case CASE_ARB_03_FILTER_DRYER_UNAVAILABLE
        //   Filtering preserves dryer diagnostic
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge) &
          (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal |
            api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive) &
          api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.DryerUnavailable) ___>: (api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.DryerUnavailable &
          ((api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal ___>:
            api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.FilterNormal) &
            (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive ___>:
              api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.FilterIntensive))),
        // case CASE_ARB_04_DRYING
        //   Drying is the residual treatment
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge) &
          (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None |
            api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation |
            api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable) &
          api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Dry &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          ((api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation ___>:
            api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.AirObservationInvalid) &
            (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable ___>:
              api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.FilterUnavailable) &
            (api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None ___>:
              api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.Drying))),
        // case CASE_ARB_04_AIR_INVALID
        //   Invalid air observation suppresses treatment
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge) &
          api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation &
          api.humidityProposal != Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.AirObservationInvalid),
        // case CASE_ARB_04_FILTER_UNAVAILABLE
        //   Unavailable filter suppresses treatment
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge) &
          api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable &
          api.humidityProposal != Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.FilterUnavailable),
        // case CASE_ARB_04_HUMIDITY_INVALID
        //   Invalid humidity observation suppresses treatment
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge) &
          api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None &
          api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.InvalidHumidityObservation) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.HumidityObservationInvalid),
        // case CASE_ARB_04_DRYER_UNAVAILABLE
        //   Unavailable dryer suppresses treatment
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge) &
          api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None &
          api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.DryerUnavailable) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.DryerUnavailable),
        // case CASE_ARB_04_NO_TREATMENT
        //   No proposals need no treatment
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.HeldPurge) &
          api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None &
          api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.None) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.NoTreatmentNeeded)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    var command = Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off
    var mode = Cabin_Air_Treatment_Supervisor.StatusMode.Recovery
    var reason = Cabin_Air_Treatment_Supervisor.StatusReason.ReadinessInvalid
    (api.get_recoveryGate(), api.get_requestIntent(), api.get_airProposal(), api.get_humidityProposal()) match {
      case (Some(Cabin_Air_Treatment_Supervisor.RecoveryMemory.FaultHeld), _, _, _) =>
      case (Some(Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh), _, _, _) =>
        reason = Cabin_Air_Treatment_Supervisor.StatusReason.AwaitFresh
      case (Some(Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready),
            Some(Cabin_Air_Treatment_Supervisor.RequestIntent.None), _, _) =>
        mode = Cabin_Air_Treatment_Supervisor.StatusMode.Idle
        reason = Cabin_Air_Treatment_Supervisor.StatusReason.None
      case (Some(Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready),
            Some(Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedInvalid), _, _) =>
        mode = Cabin_Air_Treatment_Supervisor.StatusMode.Attention
        reason = Cabin_Air_Treatment_Supervisor.StatusReason.RequestInvalid
      case (Some(Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready),
            Some(Cabin_Air_Treatment_Supervisor.RequestIntent.BlockedRearm), _, _) =>
        mode = Cabin_Air_Treatment_Supervisor.StatusMode.Attention
        reason = Cabin_Air_Treatment_Supervisor.StatusReason.RearmRequired
      case (Some(Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready), _, Some(air), Some(humidity)) =>
        mode = Cabin_Air_Treatment_Supervisor.StatusMode.Active
        if (air == Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal) {
          command = Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.FilterNormal
          if (humidity == Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry) {
            reason = Cabin_Air_Treatment_Supervisor.StatusReason.AirPriority
          } else if (humidity == Cabin_Air_Treatment_Supervisor.HumidityProposal.InvalidHumidityObservation) {
            reason = Cabin_Air_Treatment_Supervisor.StatusReason.HumidityObservationInvalid
          } else if (humidity == Cabin_Air_Treatment_Supervisor.HumidityProposal.DryerUnavailable) {
            reason = Cabin_Air_Treatment_Supervisor.StatusReason.DryerUnavailable
          } else {
            reason = Cabin_Air_Treatment_Supervisor.StatusReason.Filtering
          }
        } else if (air == Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive) {
          command = Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.FilterIntensive
          if (humidity == Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry) {
            reason = Cabin_Air_Treatment_Supervisor.StatusReason.AirPriority
          } else if (humidity == Cabin_Air_Treatment_Supervisor.HumidityProposal.InvalidHumidityObservation) {
            reason = Cabin_Air_Treatment_Supervisor.StatusReason.HumidityObservationInvalid
          } else if (humidity == Cabin_Air_Treatment_Supervisor.HumidityProposal.DryerUnavailable) {
            reason = Cabin_Air_Treatment_Supervisor.StatusReason.DryerUnavailable
          } else {
            reason = Cabin_Air_Treatment_Supervisor.StatusReason.Filtering
          }
        } else if (humidity == Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry) {
          command = Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Dry
          if (air == Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation) {
            reason = Cabin_Air_Treatment_Supervisor.StatusReason.AirObservationInvalid
          } else if (air == Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable) {
            reason = Cabin_Air_Treatment_Supervisor.StatusReason.FilterUnavailable
          } else {
            reason = Cabin_Air_Treatment_Supervisor.StatusReason.Drying
          }
        } else if (air == Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation) {
          reason = Cabin_Air_Treatment_Supervisor.StatusReason.AirObservationInvalid
        } else if (air == Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable) {
          reason = Cabin_Air_Treatment_Supervisor.StatusReason.FilterUnavailable
        } else if (humidity == Cabin_Air_Treatment_Supervisor.HumidityProposal.InvalidHumidityObservation) {
          reason = Cabin_Air_Treatment_Supervisor.StatusReason.HumidityObservationInvalid
        } else if (humidity == Cabin_Air_Treatment_Supervisor.HumidityProposal.DryerUnavailable) {
          reason = Cabin_Air_Treatment_Supervisor.StatusReason.DryerUnavailable
        } else {
          reason = Cabin_Air_Treatment_Supervisor.StatusReason.NoTreatmentNeeded
        }
      case _ =>
    }
    api.put_airTreatmentCommand(command)
    api.put_airCareSupervisorStatus(Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus(mode, reason))
  }

  def finalise(api: AirCarePriorityResultArbiter_Operational_Api): Unit = { }
}
