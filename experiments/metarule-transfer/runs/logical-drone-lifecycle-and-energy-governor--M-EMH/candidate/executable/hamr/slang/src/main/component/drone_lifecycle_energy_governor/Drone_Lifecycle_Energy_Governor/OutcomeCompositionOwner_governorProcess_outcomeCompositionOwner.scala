// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner {

  def initialise(api: OutcomeCompositionOwner_Initialization_Api): Unit = {
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
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee REQUEST_RESULT_DERIVATION
        (!(api.resolutionIn.requestPresent) ___>:
          api.pilotStatusOut.requestResult == RequestResult.NONE) &
          (api.resolutionIn.requestPresent & api.resolutionIn.requestCausedTransition ___>:
            api.pilotStatusOut.requestResult == RequestResult.ACCEPTED) &
          (api.resolutionIn.requestPresent & !(api.resolutionIn.requestCausedTransition) &
            api.resolutionIn.requestDefeatedByPriority ___>:
            api.pilotStatusOut.requestResult == RequestResult.PREEMPTED) &
          (api.resolutionIn.requestPresent & !(api.resolutionIn.requestCausedTransition) &
            !(api.resolutionIn.requestDefeatedByPriority) ___>:
            api.pilotStatusOut.requestResult == RequestResult.REJECTED),
        // guarantee BATTERY_NOTICE_DERIVATION
        (api.batteryIn.confidence != BatteryConfidence.TRUSTED ___>:
          api.pilotStatusOut.batteryNotice == BatteryNotice.UNTRUSTED) &
          (api.batteryIn.confidence == BatteryConfidence.TRUSTED &
            (api.batteryIn.band == BatteryBand.MEDIUM |
              api.batteryIn.band == BatteryBand.FULL) ___>:
            api.pilotStatusOut.batteryNotice == BatteryNotice.CLEAR) &
          (api.batteryIn.confidence == BatteryConfidence.TRUSTED &
            api.batteryIn.band == BatteryBand.LOW ___>:
            api.pilotStatusOut.batteryNotice == BatteryNotice.LOW) &
          (api.batteryIn.confidence == BatteryConfidence.TRUSTED &
            api.batteryIn.band == BatteryBand.CRITICAL ___>:
            api.pilotStatusOut.batteryNotice == BatteryNotice.CRITICAL),
        // guarantee FLIGHT_INTENT_DERIVATION
        (api.resolutionIn.nextPhase == LifecyclePhase.FLYING &
          api.resolutionIn.sourceLifecycleState != SourceLifecyclePhase.FLYING ___>:
          api.flightControlOut.intent == FlightIntent.LAUNCH) &
          (api.resolutionIn.nextPhase == LifecyclePhase.FLYING &
            api.resolutionIn.sourceLifecycleState == SourceLifecyclePhase.FLYING ___>:
            api.flightControlOut.intent == FlightIntent.CONTINUE) &
          (api.resolutionIn.nextPhase == LifecyclePhase.RETURNING ___>:
            api.flightControlOut.intent == FlightIntent.RETURN) &
          (api.resolutionIn.nextPhase == LifecyclePhase.LANDING ___>:
            api.flightControlOut.intent == FlightIntent.LAND) &
          (api.resolutionIn.nextPhase == LifecyclePhase.OFF |
            api.resolutionIn.nextPhase == LifecyclePhase.STANDBY |
            api.resolutionIn.nextPhase == LifecyclePhase.CHARGING |
            api.resolutionIn.nextPhase == LifecyclePhase.READY ___>:
            api.flightControlOut.intent == FlightIntent.HOLD),
        // guarantee PERMISSION_DERIVATION
        api.chargePermissionOut == ChargePermission.PERMITTED == (api.resolutionIn.nextPhase == LifecyclePhase.CHARGING &
          api.resolutionIn.chargeRetentionEligible) &
          api.flightControlOut.launchPermission == LaunchPermission.PERMITTED == (api.resolutionIn.nextPhase == LifecyclePhase.READY &
            api.resolutionIn.launchReady) &
          api.propulsionPermissionOut == PropulsionPermission.ENABLED == (api.flightControlOut.intent != FlightIntent.HOLD),
        // guarantee ATOMIC_PHASE_AND_FAULT_COPY
        (api.resolutionIn.nextPhase == LifecyclePhase.OFF ___>:
          api.pilotStatusOut.phase == PublishedPhase.OFF) &
          (api.resolutionIn.nextPhase == LifecyclePhase.STANDBY ___>:
            api.pilotStatusOut.phase == PublishedPhase.STANDBY) &
          (api.resolutionIn.nextPhase == LifecyclePhase.CHARGING ___>:
            api.pilotStatusOut.phase == PublishedPhase.CHARGING) &
          (api.resolutionIn.nextPhase == LifecyclePhase.READY ___>:
            api.pilotStatusOut.phase == PublishedPhase.READY) &
          (api.resolutionIn.nextPhase == LifecyclePhase.FLYING ___>:
            api.pilotStatusOut.phase == PublishedPhase.FLYING) &
          (api.resolutionIn.nextPhase == LifecyclePhase.RETURNING ___>:
            api.pilotStatusOut.phase == PublishedPhase.RETURNING) &
          (api.resolutionIn.nextPhase == LifecyclePhase.LANDING ___>:
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
    // example api usage

    val apiUsage_batteryIn: Option[Drone_Lifecycle_Energy_Governor.BatteryStateFacts] = api.get_batteryIn()
    api.logInfo(s"Received on data port batteryIn: ${apiUsage_batteryIn}")
    val apiUsage_faultsIn: Option[Drone_Lifecycle_Energy_Governor.FaultVector] = api.get_faultsIn()
    api.logInfo(s"Received on data port faultsIn: ${apiUsage_faultsIn}")
    val apiUsage_resolutionIn: Option[Drone_Lifecycle_Energy_Governor.LifecycleResolution] = api.get_resolutionIn()
    api.logInfo(s"Received on data port resolutionIn: ${apiUsage_resolutionIn}")
  }

  def finalise(api: OutcomeCompositionOwner_Operational_Api): Unit = { }
}
