// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner {
  def published(phase: LifecyclePhase.Type): PublishedPhase.Type = {
    var result: PublishedPhase.Type = PublishedPhase.OFF
    phase match {
      case LifecyclePhase.OFF => result = PublishedPhase.OFF
      case LifecyclePhase.STANDBY => result = PublishedPhase.STANDBY
      case LifecyclePhase.CHARGING => result = PublishedPhase.CHARGING
      case LifecyclePhase.READY => result = PublishedPhase.READY
      case LifecyclePhase.FLYING => result = PublishedPhase.FLYING
      case LifecyclePhase.RETURNING => result = PublishedPhase.RETURNING
      case LifecyclePhase.LANDING => result = PublishedPhase.LANDING
    }
    return result
  }

  def initialise(api: OutcomeCompositionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_pilotStatusOut(PilotStatus(
      PublishedPhase.OFF, RequestResult.NONE, BatteryNotice.UNTRUSTED, T, F, F, F, F, F, T))
    api.put_chargePermissionOut(ChargePermission.DENIED)
    api.put_flightControlOut(FlightControlOutputs(FlightIntent.HOLD, LaunchPermission.DENIED))
    api.put_propulsionPermissionOut(PropulsionPermission.DISABLED)
  }

  def timeTriggered(api: OutcomeCompositionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_batteryIn(), api.get_faultsIn(), api.get_resolutionIn()) match {
      case (Some(battery), Some(faults), Some(resolution)) =>
        val requestResult: RequestResult.Type =
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
        val chargePermission: ChargePermission.Type =
          if (resolution.nextPhase == LifecyclePhase.CHARGING & resolution.chargeRetentionEligible)
            ChargePermission.PERMITTED else ChargePermission.DENIED
        val launchPermission: LaunchPermission.Type =
          if (resolution.nextPhase == LifecyclePhase.READY & resolution.launchReady)
            LaunchPermission.PERMITTED else LaunchPermission.DENIED
        api.put_pilotStatusOut(PilotStatus(
          published(resolution.nextPhase), requestResult, notice,
          faults.batteryFault, faults.chargerFault, faults.navigationFault,
          faults.flightControlFault, faults.homeFault, faults.touchdownFault, faults.aggregateFault))
        api.put_chargePermissionOut(chargePermission)
        api.put_flightControlOut(FlightControlOutputs(intent, launchPermission))
        api.put_propulsionPermissionOut(
          if (intent != FlightIntent.HOLD) PropulsionPermission.ENABLED else PropulsionPermission.DISABLED)
      case _ =>
        api.put_pilotStatusOut(PilotStatus(
          PublishedPhase.OFF, RequestResult.NONE, BatteryNotice.UNTRUSTED, T, F, F, F, F, F, T))
        api.put_chargePermissionOut(ChargePermission.DENIED)
        api.put_flightControlOut(FlightControlOutputs(FlightIntent.HOLD, LaunchPermission.DENIED))
        api.put_propulsionPermissionOut(PropulsionPermission.DISABLED)
    }
  }

  def finalise(api: OutcomeCompositionOwner_Operational_Api): Unit = { }
}
