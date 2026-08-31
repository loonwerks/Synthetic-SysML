// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner {

  def initialise(api: OutcomeCompositionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    publishSafe(api)
  }

  def publishSafe(api: OutcomeCompositionOwner_Api): Unit = {
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
          if (!resolution.requestPresent) {
            Drone_Lifecycle_Energy_Governor.RequestResult.NONE
          } else if (resolution.requestCausedTransition) {
            Drone_Lifecycle_Energy_Governor.RequestResult.ACCEPTED
          } else if (resolution.requestDefeatedByPriority) {
            Drone_Lifecycle_Energy_Governor.RequestResult.PREEMPTED
          } else {
            Drone_Lifecycle_Energy_Governor.RequestResult.REJECTED
          }
        val notice: Drone_Lifecycle_Energy_Governor.BatteryNotice.Type =
          if (battery.confidence != Drone_Lifecycle_Energy_Governor.BatteryConfidence.TRUSTED) {
            Drone_Lifecycle_Energy_Governor.BatteryNotice.UNTRUSTED
          } else if (battery.band == Drone_Lifecycle_Energy_Governor.BatteryBand.LOW) {
            Drone_Lifecycle_Energy_Governor.BatteryNotice.LOW
          } else if (battery.band == Drone_Lifecycle_Energy_Governor.BatteryBand.CRITICAL) {
            Drone_Lifecycle_Energy_Governor.BatteryNotice.CRITICAL
          } else {
            Drone_Lifecycle_Energy_Governor.BatteryNotice.CLEAR
          }
        val intent: Drone_Lifecycle_Energy_Governor.FlightIntent.Type =
          if (resolution.nextPhase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING) {
            if (resolution.sourceLifecycleState == Drone_Lifecycle_Energy_Governor.SourceLifecyclePhase.FLYING) {
              Drone_Lifecycle_Energy_Governor.FlightIntent.CONTINUE
            } else {
              Drone_Lifecycle_Energy_Governor.FlightIntent.LAUNCH
            }
          } else if (resolution.nextPhase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING) {
            Drone_Lifecycle_Energy_Governor.FlightIntent.RETURN
          } else if (resolution.nextPhase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING) {
            Drone_Lifecycle_Energy_Governor.FlightIntent.LAND
          } else {
            Drone_Lifecycle_Energy_Governor.FlightIntent.HOLD
          }
        val launchPermission: Drone_Lifecycle_Energy_Governor.LaunchPermission.Type =
          if (resolution.nextPhase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY && resolution.launchReady) {
            Drone_Lifecycle_Energy_Governor.LaunchPermission.PERMITTED
          } else {
            Drone_Lifecycle_Energy_Governor.LaunchPermission.DENIED
          }
        api.put_pilotStatusOut(Drone_Lifecycle_Energy_Governor.PilotStatus(
          publishedPhase(resolution.nextPhase), requestResult, notice,
          faults.batteryFault, faults.chargerFault, faults.navigationFault,
          faults.flightControlFault, faults.homeFault, faults.touchdownFault, faults.aggregateFault))
        api.put_chargePermissionOut(
          if (resolution.nextPhase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING &&
            resolution.chargeRetentionEligible) Drone_Lifecycle_Energy_Governor.ChargePermission.PERMITTED
          else Drone_Lifecycle_Energy_Governor.ChargePermission.DENIED)
        api.put_flightControlOut(Drone_Lifecycle_Energy_Governor.FlightControlOutputs(intent, launchPermission))
        api.put_propulsionPermissionOut(
          if (intent != Drone_Lifecycle_Energy_Governor.FlightIntent.HOLD)
            Drone_Lifecycle_Energy_Governor.PropulsionPermission.ENABLED
          else Drone_Lifecycle_Energy_Governor.PropulsionPermission.DISABLED)
      case _ => publishSafe(api)
    }
  }

  def publishedPhase(phase: Drone_Lifecycle_Energy_Governor.LifecyclePhase.Type):
  Drone_Lifecycle_Energy_Governor.PublishedPhase.Type = {
    if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.STANDBY) {
      return Drone_Lifecycle_Energy_Governor.PublishedPhase.STANDBY
    } else if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.CHARGING) {
      return Drone_Lifecycle_Energy_Governor.PublishedPhase.CHARGING
    } else if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.READY) {
      return Drone_Lifecycle_Energy_Governor.PublishedPhase.READY
    } else if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.FLYING) {
      return Drone_Lifecycle_Energy_Governor.PublishedPhase.FLYING
    } else if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.RETURNING) {
      return Drone_Lifecycle_Energy_Governor.PublishedPhase.RETURNING
    } else if (phase == Drone_Lifecycle_Energy_Governor.LifecyclePhase.LANDING) {
      return Drone_Lifecycle_Energy_Governor.PublishedPhase.LANDING
    }
    return Drone_Lifecycle_Energy_Governor.PublishedPhase.OFF
  }

  def finalise(api: OutcomeCompositionOwner_Operational_Api): Unit = { }
}
