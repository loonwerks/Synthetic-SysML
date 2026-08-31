// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner {

  def initialise(api: OutcomeCompositionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_pilotStatusOut(Drone_Lifecycle_Energy_Governor.PilotStatus.example())
    api.put_chargePermissionOut(Drone_Lifecycle_Energy_Governor.ChargePermission.DENIED)
    api.put_flightControlOut(Drone_Lifecycle_Energy_Governor.FlightControlOutputs.example())
    api.put_propulsionPermissionOut(Drone_Lifecycle_Energy_Governor.PropulsionPermission.DISABLED)
  }

  def timeTriggered(api: OutcomeCompositionOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee REQUEST_RESULT_DERIVATION
        !(api.resolutionIn.requestPresent) &
          api.pilotStatusOut.requestResult == RequestResult.NONE |
          api.resolutionIn.requestPresent & api.resolutionIn.requestCausedTransition &
            api.pilotStatusOut.requestResult == RequestResult.ACCEPTED |
          api.resolutionIn.requestPresent & !(api.resolutionIn.requestCausedTransition) &
            api.resolutionIn.requestDefeatedByPriority &
            api.pilotStatusOut.requestResult == RequestResult.PREEMPTED |
          api.resolutionIn.requestPresent & !(api.resolutionIn.requestCausedTransition) &
            !(api.resolutionIn.requestDefeatedByPriority) &
            api.pilotStatusOut.requestResult == RequestResult.REJECTED,
        // guarantee BATTERY_NOTICE_DERIVATION
        api.batteryIn.confidence != BatteryConfidence.TRUSTED &
          api.pilotStatusOut.batteryNotice == BatteryNotice.UNTRUSTED |
          api.batteryIn.confidence == BatteryConfidence.TRUSTED &
            (api.batteryIn.band == BatteryBand.MEDIUM |
              api.batteryIn.band == BatteryBand.FULL) &
            api.pilotStatusOut.batteryNotice == BatteryNotice.CLEAR |
          api.batteryIn.confidence == BatteryConfidence.TRUSTED &
            api.batteryIn.band == BatteryBand.LOW &
            api.pilotStatusOut.batteryNotice == BatteryNotice.LOW |
          api.batteryIn.confidence == BatteryConfidence.TRUSTED &
            api.batteryIn.band == BatteryBand.CRITICAL &
            api.pilotStatusOut.batteryNotice == BatteryNotice.CRITICAL,
        // guarantee FLIGHT_INTENT_DERIVATION
        api.resolutionIn.nextPhase == LifecyclePhase.FLYING &
          api.resolutionIn.sourceLifecycleState != SourceLifecyclePhase.FLYING &
          api.flightControlOut.intent == FlightIntent.LAUNCH |
          api.resolutionIn.nextPhase == LifecyclePhase.FLYING &
            api.resolutionIn.sourceLifecycleState == SourceLifecyclePhase.FLYING &
            api.flightControlOut.intent == FlightIntent.CONTINUE |
          api.resolutionIn.nextPhase == LifecyclePhase.RETURNING &
            api.flightControlOut.intent == FlightIntent.RETURN |
          api.resolutionIn.nextPhase == LifecyclePhase.LANDING &
            api.flightControlOut.intent == FlightIntent.LAND |
          (api.resolutionIn.nextPhase == LifecyclePhase.OFF |
            api.resolutionIn.nextPhase == LifecyclePhase.STANDBY |
            api.resolutionIn.nextPhase == LifecyclePhase.CHARGING |
            api.resolutionIn.nextPhase == LifecyclePhase.READY) &
            api.flightControlOut.intent == FlightIntent.HOLD,
        // guarantee PERMISSION_DERIVATION
        api.chargePermissionOut == ChargePermission.PERMITTED == (api.resolutionIn.nextPhase == LifecyclePhase.CHARGING &
          api.resolutionIn.chargeRetentionEligible) &
          api.flightControlOut.launchPermission == LaunchPermission.PERMITTED == (api.resolutionIn.nextPhase == LifecyclePhase.READY &
            api.resolutionIn.launchReady) &
          api.propulsionPermissionOut == PropulsionPermission.ENABLED == (api.flightControlOut.intent != FlightIntent.HOLD),
        // guarantee ATOMIC_PHASE_AND_FAULT_COPY
        (api.resolutionIn.nextPhase == LifecyclePhase.OFF &
          api.pilotStatusOut.phase == PublishedPhase.OFF |
          api.resolutionIn.nextPhase == LifecyclePhase.STANDBY &
            api.pilotStatusOut.phase == PublishedPhase.STANDBY |
          api.resolutionIn.nextPhase == LifecyclePhase.CHARGING &
            api.pilotStatusOut.phase == PublishedPhase.CHARGING |
          api.resolutionIn.nextPhase == LifecyclePhase.READY &
            api.pilotStatusOut.phase == PublishedPhase.READY |
          api.resolutionIn.nextPhase == LifecyclePhase.FLYING &
            api.pilotStatusOut.phase == PublishedPhase.FLYING |
          api.resolutionIn.nextPhase == LifecyclePhase.RETURNING &
            api.pilotStatusOut.phase == PublishedPhase.RETURNING |
          api.resolutionIn.nextPhase == LifecyclePhase.LANDING &
            api.pilotStatusOut.phase == PublishedPhase.LANDING) &
          api.pilotStatusOut.batteryFault == api.faultsIn.batteryFault &
          api.pilotStatusOut.chargerFault == api.faultsIn.chargerFault &
          api.pilotStatusOut.navigationFault == api.faultsIn.navigationFault &
          api.pilotStatusOut.flightControlFault == api.faultsIn.flightControlFault &
          api.pilotStatusOut.homeFault == api.faultsIn.homeFault &
          api.pilotStatusOut.touchdownFault == api.faultsIn.touchdownFault &
          api.pilotStatusOut.aggregateFault == api.faultsIn.aggregateFault
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_batteryIn(), api.get_faultsIn(), api.get_resolutionIn()) match {
      case (Some(battery), Some(faults), Some(resolution)) =>
        val phase: PublishedPhase.Type = resolution.nextPhase match {
          case LifecyclePhase.OFF => PublishedPhase.OFF
          case LifecyclePhase.STANDBY => PublishedPhase.STANDBY
          case LifecyclePhase.CHARGING => PublishedPhase.CHARGING
          case LifecyclePhase.READY => PublishedPhase.READY
          case LifecyclePhase.FLYING => PublishedPhase.FLYING
          case LifecyclePhase.RETURNING => PublishedPhase.RETURNING
          case LifecyclePhase.LANDING => PublishedPhase.LANDING
        }
        val result: RequestResult.Type =
          if (!resolution.requestPresent) RequestResult.NONE
          else if (resolution.requestCausedTransition) RequestResult.ACCEPTED
          else if (resolution.requestDefeatedByPriority) RequestResult.PREEMPTED
          else RequestResult.REJECTED
        val notice: BatteryNotice.Type =
          if (battery.confidence != BatteryConfidence.TRUSTED) BatteryNotice.UNTRUSTED
          else if (battery.band == BatteryBand.LOW) BatteryNotice.LOW
          else if (battery.band == BatteryBand.CRITICAL) BatteryNotice.CRITICAL
          else BatteryNotice.CLEAR
        val intent: FlightIntent.Type =
          if (resolution.nextPhase == LifecyclePhase.FLYING &
            resolution.sourceLifecycleState != SourceLifecyclePhase.FLYING) FlightIntent.LAUNCH
          else if (resolution.nextPhase == LifecyclePhase.FLYING) FlightIntent.CONTINUE
          else if (resolution.nextPhase == LifecyclePhase.RETURNING) FlightIntent.RETURN
          else if (resolution.nextPhase == LifecyclePhase.LANDING) FlightIntent.LAND
          else FlightIntent.HOLD
        api.put_pilotStatusOut(PilotStatus(phase, result, notice, faults.batteryFault,
          faults.chargerFault, faults.navigationFault, faults.flightControlFault,
          faults.homeFault, faults.touchdownFault, faults.aggregateFault))
        api.put_chargePermissionOut(if (resolution.nextPhase == LifecyclePhase.CHARGING &
          resolution.chargeRetentionEligible) ChargePermission.PERMITTED
        else ChargePermission.DENIED)
        api.put_flightControlOut(FlightControlOutputs(intent,
          if (resolution.nextPhase == LifecyclePhase.READY & resolution.launchReady)
            LaunchPermission.PERMITTED else LaunchPermission.DENIED))
        api.put_propulsionPermissionOut(if (intent != FlightIntent.HOLD)
          PropulsionPermission.ENABLED else PropulsionPermission.DISABLED)
      case _ =>
        api.put_pilotStatusOut(PilotStatus(PublishedPhase.OFF, RequestResult.NONE,
          BatteryNotice.UNTRUSTED, T, F, F, F, F, F, T))
        api.put_chargePermissionOut(ChargePermission.DENIED)
        api.put_flightControlOut(FlightControlOutputs(FlightIntent.HOLD, LaunchPermission.DENIED))
        api.put_propulsionPermissionOut(PropulsionPermission.DISABLED)
    }
  }

  def finalise(api: OutcomeCompositionOwner_Operational_Api): Unit = { }
}
