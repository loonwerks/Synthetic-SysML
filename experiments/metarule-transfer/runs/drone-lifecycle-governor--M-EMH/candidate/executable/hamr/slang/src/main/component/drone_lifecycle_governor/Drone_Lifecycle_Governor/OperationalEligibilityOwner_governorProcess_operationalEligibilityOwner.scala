// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner {

  def initialise(api: OperationalEligibilityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recoveryProposal(Drone_Lifecycle_Governor.RecoveryProposal.NO_RECOVERY)
    api.put_eligibilityEnvelope(Drone_Lifecycle_Governor.EligibilityEnvelope.example())
  }

  def timeTriggered(api: OperationalEligibilityOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_07
        //   Battery loss recovers READY or FLYING
        ((api.currentLifecycleState == LifecycleState.READY |
          api.currentLifecycleState == LifecycleState.FLYING) &
          api.batteryQualification != BatteryQualification.SUFFICIENT) ___>: (!(api.eligibilityEnvelope.flightEligible) &
          api.eligibilityEnvelope.chargeEligible == (api.chargerState == ChargerState.CONNECTED &
            api.batteryQualification != BatteryQualification.UNAVAILABLE) &
          api.recoveryProposal == RecoveryProposal.TO_STANDBY_BATTERY &
          (api.batteryQualification == BatteryQualification.UNAVAILABLE &
            api.eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_UNAVAILABLE |
            api.batteryQualification == BatteryQualification.INSUFFICIENT &
              api.eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_LOW)),
        // case CASE_08
        //   Readiness loss recovers READY or FLYING
        ((api.currentLifecycleState == LifecycleState.READY |
          api.currentLifecycleState == LifecycleState.FLYING) &
          api.batteryQualification == BatteryQualification.SUFFICIENT &
          api.flightQualification != FlightQualification.READY) ___>: (!(api.eligibilityEnvelope.flightEligible) &
          api.eligibilityEnvelope.chargeEligible == (api.chargerState == ChargerState.CONNECTED) &
          api.recoveryProposal == RecoveryProposal.TO_STANDBY_READINESS &
          (api.flightQualification == FlightQualification.UNAVAILABLE &
            api.eligibilityEnvelope.decisionReason == EligibilityReason.FLIGHT_UNAVAILABLE |
            api.flightQualification == FlightQualification.NOT_READY &
              api.eligibilityEnvelope.decisionReason == EligibilityReason.FLIGHT_NOT_READY)),
        // case CASE_09
        //   Charging premise loss recovers to standby
        (api.currentLifecycleState == LifecycleState.CHARGING &
          (api.chargerState == ChargerState.DISCONNECTED |
            api.batteryQualification == BatteryQualification.UNAVAILABLE)) ___>: (api.eligibilityEnvelope.flightEligible == (api.batteryQualification == BatteryQualification.SUFFICIENT &
          api.flightQualification == FlightQualification.READY) &
          !(api.eligibilityEnvelope.chargeEligible) &
          api.recoveryProposal == RecoveryProposal.TO_STANDBY_CHARGE_PATH &
          (api.chargerState == ChargerState.DISCONNECTED &
            api.eligibilityEnvelope.decisionReason == EligibilityReason.CHARGER_DISCONNECTED |
            api.chargerState == ChargerState.CONNECTED &
              api.batteryQualification == BatteryQualification.UNAVAILABLE &
              api.eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_UNAVAILABLE)),
        // case CASE_10
        //   No recovery publishes eligibility and reason
        (!((api.currentLifecycleState == LifecycleState.READY |
          api.currentLifecycleState == LifecycleState.FLYING) &
          api.batteryQualification != BatteryQualification.SUFFICIENT |
          (api.currentLifecycleState == LifecycleState.READY |
            api.currentLifecycleState == LifecycleState.FLYING) &
            api.batteryQualification == BatteryQualification.SUFFICIENT &
            api.flightQualification != FlightQualification.READY |
          api.currentLifecycleState == LifecycleState.CHARGING &
            (api.chargerState == ChargerState.DISCONNECTED |
              api.batteryQualification == BatteryQualification.UNAVAILABLE))) ___>: (api.recoveryProposal == RecoveryProposal.NO_RECOVERY &
          api.eligibilityEnvelope.flightEligible == (api.batteryQualification == BatteryQualification.SUFFICIENT &
            api.flightQualification == FlightQualification.READY) &
          api.eligibilityEnvelope.chargeEligible == (api.chargerState == ChargerState.CONNECTED &
            api.batteryQualification != BatteryQualification.UNAVAILABLE) &
          (api.batteryQualification == BatteryQualification.UNAVAILABLE &
            api.eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_UNAVAILABLE |
            api.batteryQualification == BatteryQualification.INSUFFICIENT &
              api.eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_LOW |
            api.batteryQualification == BatteryQualification.SUFFICIENT &
              api.flightQualification == FlightQualification.UNAVAILABLE &
              api.eligibilityEnvelope.decisionReason == EligibilityReason.FLIGHT_UNAVAILABLE |
            api.batteryQualification == BatteryQualification.SUFFICIENT &
              api.flightQualification == FlightQualification.NOT_READY &
              api.eligibilityEnvelope.decisionReason == EligibilityReason.FLIGHT_NOT_READY |
            api.batteryQualification == BatteryQualification.SUFFICIENT &
              api.flightQualification == FlightQualification.READY &
              api.eligibilityEnvelope.decisionReason == EligibilityReason.NONE))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val charger = api.get_chargerState().get
    val battery = api.get_batteryQualification().get
    val flight = api.get_flightQualification().get
    val lifecycle = api.get_currentLifecycleState().get
    val flightEligible = battery == BatteryQualification.SUFFICIENT &
      flight == FlightQualification.READY
    val chargeEligible = charger == ChargerState.CONNECTED &
      battery != BatteryQualification.UNAVAILABLE
    val batteryRecovery = (lifecycle == LifecycleState.READY |
      lifecycle == LifecycleState.FLYING) &
      battery != BatteryQualification.SUFFICIENT
    val readinessRecovery = (lifecycle == LifecycleState.READY |
      lifecycle == LifecycleState.FLYING) &
      battery == BatteryQualification.SUFFICIENT &
      flight != FlightQualification.READY
    val chargeRecovery = lifecycle == LifecycleState.CHARGING &
      (charger == ChargerState.DISCONNECTED |
        battery == BatteryQualification.UNAVAILABLE)
    val reason: Drone_Lifecycle_Governor.EligibilityReason.Type =
      if (chargeRecovery & charger == ChargerState.DISCONNECTED) EligibilityReason.CHARGER_DISCONNECTED
      else if (battery == BatteryQualification.UNAVAILABLE) EligibilityReason.BATTERY_UNAVAILABLE
      else if (battery == BatteryQualification.INSUFFICIENT) EligibilityReason.BATTERY_LOW
      else if (flight == FlightQualification.UNAVAILABLE) EligibilityReason.FLIGHT_UNAVAILABLE
      else if (flight == FlightQualification.NOT_READY) EligibilityReason.FLIGHT_NOT_READY
      else EligibilityReason.NONE
    val recovery: Drone_Lifecycle_Governor.RecoveryProposal.Type =
      if (batteryRecovery) RecoveryProposal.TO_STANDBY_BATTERY
      else if (readinessRecovery) RecoveryProposal.TO_STANDBY_READINESS
      else if (chargeRecovery) RecoveryProposal.TO_STANDBY_CHARGE_PATH
      else RecoveryProposal.NO_RECOVERY
    api.put_eligibilityEnvelope(EligibilityEnvelope(flightEligible, chargeEligible, reason))
    api.put_recoveryProposal(recovery)
  }

  def finalise(api: OperationalEligibilityOwner_Operational_Api): Unit = { }
}
