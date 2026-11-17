// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter {

  var authorization: HVAC_Visibility_Priority_Supervisor.Authorization.Type =
    HVAC_Visibility_Priority_Supervisor.Authorization.Normal

  def initialise(api: PriorityAuthorizationArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api, authorization))
    authorization = HVAC_Visibility_Priority_Supervisor.Authorization.Normal
    publish(api, HVAC_Visibility_Priority_Supervisor.Service.None,
      HVAC_Visibility_Priority_Supervisor.HeatSource.None,
      HVAC_Visibility_Priority_Supervisor.FanIntent.Low,
      HVAC_Visibility_Priority_Supervisor.SelectionCause.None,
      HVAC_Visibility_Priority_Supervisor.SelectionMode.Idle,
      HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Idle,
      HVAC_Visibility_Priority_Supervisor.ArbitrationCause.None,
      HVAC_Visibility_Priority_Supervisor.NoncriticalCause.None)
  }

  def timeTriggered(api: PriorityAuthorizationArbiter_Operational_Api): Unit = {
    Contract(Modifies(api, authorization))
    (api.get_qualifiedRequest(), api.get_recoveryReport(), api.get_thermalProposal(),
      api.get_visibilityProposal(), api.get_cabinAirProposal()) match {
      case (Some(request), Some(recovery), Some(thermal), Some(visibility), Some(cabinAir)) =>
        val noncritical: HVAC_Visibility_Priority_Supervisor.NoncriticalCause.Type =
          noncriticalCause(thermal, cabinAir)
        if (recovery.recoveryState == HVAC_Visibility_Priority_Supervisor.RecoveryState.Latched ||
          recovery.recoveryState == HVAC_Visibility_Priority_Supervisor.RecoveryState.Pending) {
          authorization = HVAC_Visibility_Priority_Supervisor.Authorization.AwaitFresh
          publish(api, HVAC_Visibility_Priority_Supervisor.Service.None,
            HVAC_Visibility_Priority_Supervisor.HeatSource.None, request.fan,
            HVAC_Visibility_Priority_Supervisor.SelectionCause.AwaitingRecovery,
            HVAC_Visibility_Priority_Supervisor.SelectionMode.FaultHold,
            HVAC_Visibility_Priority_Supervisor.ArbitrationMode.FaultHold,
            HVAC_Visibility_Priority_Supervisor.ArbitrationCause.AwaitingRecovery, noncritical)
        } else if (recovery.recoveryEvent == HVAC_Visibility_Priority_Supervisor.RecoveryEvent.JustCleared) {
          authorization = HVAC_Visibility_Priority_Supervisor.Authorization.AwaitFresh
          publish(api, HVAC_Visibility_Priority_Supervisor.Service.None,
            HVAC_Visibility_Priority_Supervisor.HeatSource.None, request.fan,
            HVAC_Visibility_Priority_Supervisor.SelectionCause.AwaitingFreshRequest,
            HVAC_Visibility_Priority_Supervisor.SelectionMode.AwaitFresh,
            HVAC_Visibility_Priority_Supervisor.ArbitrationMode.AwaitFresh,
            HVAC_Visibility_Priority_Supervisor.ArbitrationCause.AwaitingFreshRequest, noncritical)
        } else if (authorization == HVAC_Visibility_Priority_Supervisor.Authorization.AwaitFresh &&
          (request.arrival != HVAC_Visibility_Priority_Supervisor.Arrival.New ||
            request.requestClass == HVAC_Visibility_Priority_Supervisor.RequestClass.Invalid)) {
          publish(api, HVAC_Visibility_Priority_Supervisor.Service.None,
            HVAC_Visibility_Priority_Supervisor.HeatSource.None, request.fan,
            HVAC_Visibility_Priority_Supervisor.SelectionCause.AwaitingFreshRequest,
            HVAC_Visibility_Priority_Supervisor.SelectionMode.AwaitFresh,
            HVAC_Visibility_Priority_Supervisor.ArbitrationMode.AwaitFresh,
            HVAC_Visibility_Priority_Supervisor.ArbitrationCause.AwaitingFreshRequest, noncritical)
        } else {
          authorization = HVAC_Visibility_Priority_Supervisor.Authorization.Normal
          if (visibility.visibilityApplicability == HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.Available &&
            visibility.urgency == HVAC_Visibility_Priority_Supervisor.ProposalUrgency.Urgent) {
            publish(api, HVAC_Visibility_Priority_Supervisor.Service.Defrost,
              HVAC_Visibility_Priority_Supervisor.HeatSource.None, request.fan,
              HVAC_Visibility_Priority_Supervisor.SelectionCause.VisibilityPriority,
              HVAC_Visibility_Priority_Supervisor.SelectionMode.Active,
              HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Active,
              HVAC_Visibility_Priority_Supervisor.ArbitrationCause.VisibilityPriority, noncritical)
          } else if (request.requestClass == HVAC_Visibility_Priority_Supervisor.RequestClass.Defrost &&
            visibility.visibilityApplicability == HVAC_Visibility_Priority_Supervisor.VisibilityProposalAvailability.Available) {
            publish(api, HVAC_Visibility_Priority_Supervisor.Service.Defrost,
              HVAC_Visibility_Priority_Supervisor.HeatSource.None, request.fan,
              HVAC_Visibility_Priority_Supervisor.SelectionCause.None,
              HVAC_Visibility_Priority_Supervisor.SelectionMode.Active,
              HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Active,
              HVAC_Visibility_Priority_Supervisor.ArbitrationCause.None, noncritical)
          } else if (request.requestClass == HVAC_Visibility_Priority_Supervisor.RequestClass.Off ||
            request.requestClass == HVAC_Visibility_Priority_Supervisor.RequestClass.Invalid) {
            publish(api, HVAC_Visibility_Priority_Supervisor.Service.None,
              HVAC_Visibility_Priority_Supervisor.HeatSource.None, request.fan,
              HVAC_Visibility_Priority_Supervisor.SelectionCause.None,
              HVAC_Visibility_Priority_Supervisor.SelectionMode.Idle,
              HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Idle,
              HVAC_Visibility_Priority_Supervisor.ArbitrationCause.None, noncritical)
          } else if (cabinAir.cabinAirApplicability == HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.Available &&
            cabinAir.service == HVAC_Visibility_Priority_Supervisor.Service.Filter) {
            publish(api, cabinAir.service, HVAC_Visibility_Priority_Supervisor.HeatSource.None, request.fan,
              HVAC_Visibility_Priority_Supervisor.SelectionCause.None, HVAC_Visibility_Priority_Supervisor.SelectionMode.Active,
              HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Active, HVAC_Visibility_Priority_Supervisor.ArbitrationCause.None, noncritical)
          } else if (cabinAir.cabinAirApplicability == HVAC_Visibility_Priority_Supervisor.CabinAirProposalAvailability.Available &&
            cabinAir.service == HVAC_Visibility_Priority_Supervisor.Service.Dry) {
            publish(api, cabinAir.service, HVAC_Visibility_Priority_Supervisor.HeatSource.None, request.fan,
              HVAC_Visibility_Priority_Supervisor.SelectionCause.None, HVAC_Visibility_Priority_Supervisor.SelectionMode.Active,
              HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Active, HVAC_Visibility_Priority_Supervisor.ArbitrationCause.None, noncritical)
          } else if (thermal.thermalApplicability == HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Available &&
            (thermal.service == HVAC_Visibility_Priority_Supervisor.Service.Heat ||
              thermal.service == HVAC_Visibility_Priority_Supervisor.Service.Cool)) {
            publish(api, thermal.service, thermal.heatSource, request.fan,
              HVAC_Visibility_Priority_Supervisor.SelectionCause.None, HVAC_Visibility_Priority_Supervisor.SelectionMode.Active,
              HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Active, HVAC_Visibility_Priority_Supervisor.ArbitrationCause.None, noncritical)
          } else if (thermal.thermalApplicability == HVAC_Visibility_Priority_Supervisor.ThermalProposalAvailability.Available &&
            thermal.service == HVAC_Visibility_Priority_Supervisor.Service.Ventilate) {
            publish(api, thermal.service, HVAC_Visibility_Priority_Supervisor.HeatSource.None, request.fan,
              HVAC_Visibility_Priority_Supervisor.SelectionCause.None, HVAC_Visibility_Priority_Supervisor.SelectionMode.Active,
              HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Active, HVAC_Visibility_Priority_Supervisor.ArbitrationCause.None, noncritical)
          } else {
            publish(api, HVAC_Visibility_Priority_Supervisor.Service.None, HVAC_Visibility_Priority_Supervisor.HeatSource.None, request.fan,
              HVAC_Visibility_Priority_Supervisor.SelectionCause.None, HVAC_Visibility_Priority_Supervisor.SelectionMode.Idle,
              HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Idle, HVAC_Visibility_Priority_Supervisor.ArbitrationCause.None, noncritical)
          }
        }
      case _ =>
        authorization = HVAC_Visibility_Priority_Supervisor.Authorization.AwaitFresh
        publish(api, HVAC_Visibility_Priority_Supervisor.Service.None, HVAC_Visibility_Priority_Supervisor.HeatSource.None,
          HVAC_Visibility_Priority_Supervisor.FanIntent.Low, HVAC_Visibility_Priority_Supervisor.SelectionCause.AwaitingRecovery,
          HVAC_Visibility_Priority_Supervisor.SelectionMode.FaultHold, HVAC_Visibility_Priority_Supervisor.ArbitrationMode.FaultHold,
          HVAC_Visibility_Priority_Supervisor.ArbitrationCause.AwaitingRecovery, HVAC_Visibility_Priority_Supervisor.NoncriticalCause.None)
    }
  }

  def finalise(api: PriorityAuthorizationArbiter_Operational_Api): Unit = { }

  def noncriticalCause(thermal: HVAC_Visibility_Priority_Supervisor.ThermalProposal,
                       cabinAir: HVAC_Visibility_Priority_Supervisor.CabinAirProposal):
    HVAC_Visibility_Priority_Supervisor.NoncriticalCause.Type = {
    if (cabinAir.airDegradation == HVAC_Visibility_Priority_Supervisor.AirDegradation.InvalidAirQuality) {
      return HVAC_Visibility_Priority_Supervisor.NoncriticalCause.InvalidAirQuality
    } else if (cabinAir.humidityDegradation == HVAC_Visibility_Priority_Supervisor.HumidityDegradation.InvalidHumidity) {
      return HVAC_Visibility_Priority_Supervisor.NoncriticalCause.InvalidHumidity
    } else if (thermal.degradation == HVAC_Visibility_Priority_Supervisor.ThermalDegradation.InvalidThermal) {
      return HVAC_Visibility_Priority_Supervisor.NoncriticalCause.InvalidThermal
    } else {
      return HVAC_Visibility_Priority_Supervisor.NoncriticalCause.None
    }
  }

  def publish(api: PriorityAuthorizationArbiter_Api,
              service: HVAC_Visibility_Priority_Supervisor.Service.Type,
              heatSource: HVAC_Visibility_Priority_Supervisor.HeatSource.Type,
              fan: HVAC_Visibility_Priority_Supervisor.FanIntent.Type,
              selectedCause: HVAC_Visibility_Priority_Supervisor.SelectionCause.Type,
              selectionMode: HVAC_Visibility_Priority_Supervisor.SelectionMode.Type,
              arbitrationMode: HVAC_Visibility_Priority_Supervisor.ArbitrationMode.Type,
              arbitrationCause: HVAC_Visibility_Priority_Supervisor.ArbitrationCause.Type,
              noncritical: HVAC_Visibility_Priority_Supervisor.NoncriticalCause.Type): Unit = {
    api.put_selectedIntent(HVAC_Visibility_Priority_Supervisor.SelectedIntent(
      service, heatSource, fan, selectedCause, selectionMode))
    api.put_arbitrationStatus(HVAC_Visibility_Priority_Supervisor.ArbitrationStatus(
      authorization, arbitrationMode, arbitrationCause, noncritical))
  }
}
