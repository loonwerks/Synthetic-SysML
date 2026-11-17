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
        //   Insufficient battery recovers ready or flying state
        ((api.currentLifecycleState == LifecycleState.READY |
          api.currentLifecycleState == LifecycleState.FLYING) &
          api.batteryQualification != BatteryQualification.SUFFICIENT) ___>: (api.eligibilityEnvelope.flightEligible == F &
          api.eligibilityEnvelope.chargeEligible == (api.chargerState == ChargerState.CONNECTED &
            api.batteryQualification != BatteryQualification.UNAVAILABLE) &
          api.recoveryProposal == RecoveryProposal.TO_STANDBY_BATTERY &
          (api.batteryQualification == BatteryQualification.UNAVAILABLE &
            api.eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_UNAVAILABLE |
            api.batteryQualification == BatteryQualification.INSUFFICIENT &
              api.eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_LOW)),
        // case CASE_08
        //   Lost readiness recovers ready or flying state
        ((api.currentLifecycleState == LifecycleState.READY |
          api.currentLifecycleState == LifecycleState.FLYING) &
          api.batteryQualification == BatteryQualification.SUFFICIENT &
          api.flightQualification != FlightQualification.READY) ___>: (api.eligibilityEnvelope.flightEligible == F &
          api.eligibilityEnvelope.chargeEligible == (api.chargerState == ChargerState.CONNECTED) &
          api.recoveryProposal == RecoveryProposal.TO_STANDBY_READINESS &
          (api.flightQualification == FlightQualification.UNAVAILABLE &
            api.eligibilityEnvelope.decisionReason == EligibilityReason.FLIGHT_UNAVAILABLE |
            api.flightQualification == FlightQualification.NOT_READY &
              api.eligibilityEnvelope.decisionReason == EligibilityReason.FLIGHT_NOT_READY)),
        // case CASE_09
        //   Broken charging premise recovers charging state
        (api.currentLifecycleState == LifecycleState.CHARGING &
          (api.chargerState == ChargerState.DISCONNECTED |
            api.batteryQualification == BatteryQualification.UNAVAILABLE)) ___>: (api.eligibilityEnvelope.flightEligible == (api.batteryQualification == BatteryQualification.SUFFICIENT &
          api.flightQualification == FlightQualification.READY) &
          api.eligibilityEnvelope.chargeEligible == F &
          api.recoveryProposal == RecoveryProposal.TO_STANDBY_CHARGE_PATH &
          (api.chargerState == ChargerState.DISCONNECTED &
            api.eligibilityEnvelope.decisionReason == EligibilityReason.CHARGER_DISCONNECTED |
            api.chargerState == ChargerState.CONNECTED &
              api.batteryQualification == BatteryQualification.UNAVAILABLE &
              api.eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_UNAVAILABLE)),
        // case CASE_10
        //   Otherwise publish normal eligibility without recovery
        (!((api.currentLifecycleState == LifecycleState.READY |
          api.currentLifecycleState == LifecycleState.FLYING) &
          api.batteryQualification != BatteryQualification.SUFFICIENT) & !((api.currentLifecycleState == LifecycleState.READY |
          api.currentLifecycleState == LifecycleState.FLYING) &
          api.batteryQualification == BatteryQualification.SUFFICIENT &
          api.flightQualification != FlightQualification.READY) &
          !(api.currentLifecycleState == LifecycleState.CHARGING &
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
    val charger = api.get_chargerState()
    val battery = api.get_batteryQualification()
    val flight = api.get_flightQualification()
    val state = api.get_currentLifecycleState()
    (charger, battery, flight, state) match {
      case (Some(c), Some(b), Some(f), Some(s)) =>
        val flightEligible = b == BatteryQualification.SUFFICIENT &
          f == FlightQualification.READY
        val chargeEligible = c == ChargerState.CONNECTED &
          b != BatteryQualification.UNAVAILABLE
        if ((s == LifecycleState.READY | s == LifecycleState.FLYING) &
            b != BatteryQualification.SUFFICIENT) {
          val reason: EligibilityReason.Type = if (b == BatteryQualification.UNAVAILABLE)
            EligibilityReason.BATTERY_UNAVAILABLE else EligibilityReason.BATTERY_LOW
          api.put_recoveryProposal(RecoveryProposal.TO_STANDBY_BATTERY)
          api.put_eligibilityEnvelope(EligibilityEnvelope(F, chargeEligible, reason))
        } else if ((s == LifecycleState.READY | s == LifecycleState.FLYING) &
          f != FlightQualification.READY) {
          val reason: EligibilityReason.Type = if (f == FlightQualification.UNAVAILABLE)
            EligibilityReason.FLIGHT_UNAVAILABLE else EligibilityReason.FLIGHT_NOT_READY
          api.put_recoveryProposal(RecoveryProposal.TO_STANDBY_READINESS)
          api.put_eligibilityEnvelope(EligibilityEnvelope(F, c == ChargerState.CONNECTED, reason))
        } else if (s == LifecycleState.CHARGING &
          (c == ChargerState.DISCONNECTED | b == BatteryQualification.UNAVAILABLE)) {
          val reason: EligibilityReason.Type = if (c == ChargerState.DISCONNECTED)
            EligibilityReason.CHARGER_DISCONNECTED else EligibilityReason.BATTERY_UNAVAILABLE
          api.put_recoveryProposal(RecoveryProposal.TO_STANDBY_CHARGE_PATH)
          api.put_eligibilityEnvelope(EligibilityEnvelope(flightEligible, F, reason))
        } else {
          val reason: EligibilityReason.Type = if (b == BatteryQualification.UNAVAILABLE) {
            EligibilityReason.BATTERY_UNAVAILABLE
          } else if (b == BatteryQualification.INSUFFICIENT) {
            EligibilityReason.BATTERY_LOW
          } else if (f == FlightQualification.UNAVAILABLE) {
            EligibilityReason.FLIGHT_UNAVAILABLE
          } else if (f == FlightQualification.NOT_READY) {
            EligibilityReason.FLIGHT_NOT_READY
          } else {
            EligibilityReason.NONE
          }
          api.put_recoveryProposal(RecoveryProposal.NO_RECOVERY)
          api.put_eligibilityEnvelope(EligibilityEnvelope(flightEligible, chargeEligible, reason))
        }
      case _ =>
        api.put_recoveryProposal(RecoveryProposal.NO_RECOVERY)
        api.put_eligibilityEnvelope(EligibilityEnvelope(F, F, EligibilityReason.BATTERY_UNAVAILABLE))
    }
  }

  def finalise(api: OperationalEligibilityOwner_Operational_Api): Unit = { }
}
