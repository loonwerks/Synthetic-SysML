// #Sireum

package scp_candidate.Drone_Lifecycle_Energy_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner {

  def initialise(api: OutcomeCompositionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_pilotStatusOut(Drone_Lifecycle_Energy_Governor.PilotStatus(
      Drone_Lifecycle_Energy_Governor.PublishedPhase.OFF,
      Drone_Lifecycle_Energy_Governor.RequestResult.NONE,
      Drone_Lifecycle_Energy_Governor.BatteryNotice.UNTRUSTED,
      T, F, F, F, F, F, T))
    api.put_chargePermissionOut(Drone_Lifecycle_Energy_Governor.ChargePermission.DENIED)
    api.put_flightControlOut(Drone_Lifecycle_Energy_Governor.FlightControlOutputs(
      Drone_Lifecycle_Energy_Governor.FlightIntent.HOLD,
      Drone_Lifecycle_Energy_Governor.LaunchPermission.DENIED))
    api.put_propulsionPermissionOut(Drone_Lifecycle_Energy_Governor.PropulsionPermission.DISABLED)
  }

  def timeTriggered(api: OutcomeCompositionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_batteryIn(), api.get_faultsIn(), api.get_resolutionIn()) match {
      case (Some(battery), Some(faults), Some(resolution)) =>
        val requestResult: Drone_Lifecycle_Energy_Governor.RequestResult.Type =
          if (!resolution.requestPresent) Drone_Lifecycle_Energy_Governor.RequestResult.NONE
          else if (resolution.requestCausedTransition) Drone_Lifecycle_Energy_Governor.RequestResult.ACCEPTED
          else if (resolution.requestDefeatedByPriority) Drone_Lifecycle_Energy_Governor.RequestResult.PREEMPTED
          else Drone_Lifecycle_Energy_Governor.RequestResult.REJECTED
        val notice: Drone_Lifecycle_Energy_Governor.BatteryNotice.Type =
          if (battery.confidence != Drone_Lifecycle_Energy_Governor.BatteryConfidence.TRUSTED)
            Drone_Lifecycle_Energy_Governor.BatteryNotice.UNTRUSTED
          else if (battery.band == Drone_Lifecycle_Energy_Governor.BatteryBand.LOW) Drone_Lifecycle_Energy_Governor.BatteryNotice.LOW
          else if (battery.band == Drone_Lifecycle_Energy_Governor.BatteryBand.CRITICAL) Drone_Lifecycle_Energy_Governor.BatteryNotice.CRITICAL
          else Drone_Lifecycle_Energy_Governor.BatteryNotice.CLEAR
        val intent: Drone_Lifecycle_Energy_Governor.FlightIntent.Type =
          if (resolution.nextPhase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING &&
            resolution.sourceLifecycleState == Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.FLYING)
            Drone_Lifecycle_Energy_Governor.FlightIntent.CONTINUE
          else if (resolution.nextPhase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING)
            Drone_Lifecycle_Energy_Governor.FlightIntent.LAUNCH
          else if (resolution.nextPhase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING)
            Drone_Lifecycle_Energy_Governor.FlightIntent.RETURN
          else if (resolution.nextPhase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING)
            Drone_Lifecycle_Energy_Governor.FlightIntent.LAND
          else Drone_Lifecycle_Energy_Governor.FlightIntent.HOLD
        val phase: Drone_Lifecycle_Energy_Governor.PublishedPhase.Type =
          if (resolution.nextPhase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.OFF) Drone_Lifecycle_Energy_Governor.PublishedPhase.OFF
          else if (resolution.nextPhase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY) Drone_Lifecycle_Energy_Governor.PublishedPhase.STANDBY
          else if (resolution.nextPhase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING) Drone_Lifecycle_Energy_Governor.PublishedPhase.CHARGING
          else if (resolution.nextPhase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY) Drone_Lifecycle_Energy_Governor.PublishedPhase.READY
          else if (resolution.nextPhase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING) Drone_Lifecycle_Energy_Governor.PublishedPhase.FLYING
          else if (resolution.nextPhase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING) Drone_Lifecycle_Energy_Governor.PublishedPhase.RETURNING
          else Drone_Lifecycle_Energy_Governor.PublishedPhase.LANDING
        val charge: Drone_Lifecycle_Energy_Governor.ChargePermission.Type = if (resolution.nextPhase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING &&
          resolution.chargeRetentionEligible) Drone_Lifecycle_Energy_Governor.ChargePermission.PERMITTED
        else Drone_Lifecycle_Energy_Governor.ChargePermission.DENIED
        val launch: Drone_Lifecycle_Energy_Governor.LaunchPermission.Type = if (resolution.nextPhase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY &&
          resolution.launchReady) Drone_Lifecycle_Energy_Governor.LaunchPermission.PERMITTED
        else Drone_Lifecycle_Energy_Governor.LaunchPermission.DENIED
        val propulsion: Drone_Lifecycle_Energy_Governor.PropulsionPermission.Type = if (intent != Drone_Lifecycle_Energy_Governor.FlightIntent.HOLD)
          Drone_Lifecycle_Energy_Governor.PropulsionPermission.ENABLED
        else Drone_Lifecycle_Energy_Governor.PropulsionPermission.DISABLED
        api.put_pilotStatusOut(Drone_Lifecycle_Energy_Governor.PilotStatus(
          phase, requestResult, notice, faults.batteryFault, faults.chargerFault,
          faults.navigationFault, faults.flightControlFault, faults.homeFault,
          faults.touchdownFault, faults.aggregateFault))
        api.put_chargePermissionOut(charge)
        api.put_flightControlOut(Drone_Lifecycle_Energy_Governor.FlightControlOutputs(intent, launch))
        api.put_propulsionPermissionOut(propulsion)
    }
  }

  def finalise(api: OutcomeCompositionOwner_Operational_Api): Unit = { }
}
