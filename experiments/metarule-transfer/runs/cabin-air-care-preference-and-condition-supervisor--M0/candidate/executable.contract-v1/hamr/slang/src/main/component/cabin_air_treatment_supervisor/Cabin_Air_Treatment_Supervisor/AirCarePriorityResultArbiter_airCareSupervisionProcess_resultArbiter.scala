// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter {

  def initialise(api: AirCarePriorityResultArbiter_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_airTreatmentCommand(Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off)
    api.put_airCareSupervisorStatus(Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus.example())
  }

  def timeTriggered(api: AirCarePriorityResultArbiter_Operational_Api): Unit = {
    Contract(
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
          api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterNormal &
          api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.None) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.FilterNormal &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.Filtering),
        // case CASE_ARB_03_INTENSIVE_FILTERING
        //   Intensive filtration is active
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterIntensive &
          api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.None) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.FilterIntensive &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.Filtering),
        // case CASE_ARB_03_PRIORITY
        //   Filtration outranks drying
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
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
          api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.InvalidAirObservation &
          api.humidityProposal != Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.AirObservationInvalid),
        // case CASE_ARB_04_FILTER_UNAVAILABLE
        //   Unavailable filter suppresses treatment
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.FilterUnavailable &
          api.humidityProposal != Cabin_Air_Treatment_Supervisor.HumidityProposal.Dry) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.FilterUnavailable),
        // case CASE_ARB_04_HUMIDITY_INVALID
        //   Invalid humidity observation suppresses treatment
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None &
          api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.InvalidHumidityObservation) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.HumidityObservationInvalid),
        // case CASE_ARB_04_DRYER_UNAVAILABLE
        //   Unavailable dryer suppresses treatment
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None &
          api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.DryerUnavailable) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.DryerUnavailable),
        // case CASE_ARB_04_NO_TREATMENT
        //   No proposals need no treatment
        (api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          api.airProposal == Cabin_Air_Treatment_Supervisor.AirProposal.None &
          api.humidityProposal == Cabin_Air_Treatment_Supervisor.HumidityProposal.None) ___>: (api.airTreatmentCommand == Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off &
          api.airCareSupervisorStatus.mode == Cabin_Air_Treatment_Supervisor.StatusMode.Active &
          api.airCareSupervisorStatus.reason == Cabin_Air_Treatment_Supervisor.StatusReason.NoTreatmentNeeded)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_requestIntent: Option[Cabin_Air_Treatment_Supervisor.RequestIntent.Type] = api.get_requestIntent()
    api.logInfo(s"Received on data port requestIntent: ${apiUsage_requestIntent}")
    val apiUsage_airProposal: Option[Cabin_Air_Treatment_Supervisor.AirProposal.Type] = api.get_airProposal()
    api.logInfo(s"Received on data port airProposal: ${apiUsage_airProposal}")
    val apiUsage_humidityProposal: Option[Cabin_Air_Treatment_Supervisor.HumidityProposal.Type] = api.get_humidityProposal()
    api.logInfo(s"Received on data port humidityProposal: ${apiUsage_humidityProposal}")
    val apiUsage_recoveryGate: Option[Cabin_Air_Treatment_Supervisor.RecoveryMemory.Type] = api.get_recoveryGate()
    api.logInfo(s"Received on data port recoveryGate: ${apiUsage_recoveryGate}")
  }

  def finalise(api: AirCarePriorityResultArbiter_Operational_Api): Unit = { }
}
