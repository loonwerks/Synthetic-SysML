// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object OperationalEligibilityOwner_governorProcess_operationalEligibilityOwner {

  def initialise(api: OperationalEligibilityOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recoveryProposal(Drone_Lifecycle_Governor.RecoveryProposal.NO_RECOVERY)
    api.put_eligibilityEnvelope(Drone_Lifecycle_Governor.EligibilityEnvelope.example())
  }

  def timeTriggered(api: OperationalEligibilityOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_07
        //   READY/FLYING with non-SUFFICIENT battery -> TO_STANDBY_BATTERY
        ((api.currentLifecycleState == LifecycleState.READY |
          api.currentLifecycleState == LifecycleState.FLYING) &
          api.batteryQualification != BatteryQualification.SUFFICIENT) ___>: (api.eligibilityEnvelope.flightEligible == F &
          api.eligibilityEnvelope.chargeEligible == T == (api.chargerState == ChargerState.CONNECTED &
            api.batteryQualification != BatteryQualification.UNAVAILABLE) &
          api.recoveryProposal == RecoveryProposal.TO_STANDBY_BATTERY &
          (api.batteryQualification == BatteryQualification.UNAVAILABLE &
            api.eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_UNAVAILABLE |
            api.batteryQualification == BatteryQualification.INSUFFICIENT &
              api.eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_LOW)),
        // case CASE_08
        //   SUFFICIENT battery with non-READY flight -> TO_STANDBY_READINESS
        ((api.currentLifecycleState == LifecycleState.READY |
          api.currentLifecycleState == LifecycleState.FLYING) &
          api.batteryQualification == BatteryQualification.SUFFICIENT &
          api.flightQualification != FlightQualification.READY) ___>: (api.eligibilityEnvelope.flightEligible == F &
          api.eligibilityEnvelope.chargeEligible == T == (api.chargerState == ChargerState.CONNECTED) &
          api.recoveryProposal == RecoveryProposal.TO_STANDBY_READINESS &
          (api.flightQualification == FlightQualification.UNAVAILABLE &
            api.eligibilityEnvelope.decisionReason == EligibilityReason.FLIGHT_UNAVAILABLE |
            api.flightQualification == FlightQualification.NOT_READY &
              api.eligibilityEnvelope.decisionReason == EligibilityReason.FLIGHT_NOT_READY)),
        // case CASE_09
        //   CHARGING with charger DISCONNECTED or UNAVAILABLE battery -> TO_STANDBY_CHARGE_PATH
        (api.currentLifecycleState == LifecycleState.CHARGING &
          (api.chargerState == ChargerState.DISCONNECTED |
            api.batteryQualification == BatteryQualification.UNAVAILABLE)) ___>: (api.eligibilityEnvelope.flightEligible == T == (api.batteryQualification == BatteryQualification.SUFFICIENT &
          api.flightQualification == FlightQualification.READY) &
          api.eligibilityEnvelope.chargeEligible == F &
          api.recoveryProposal == RecoveryProposal.TO_STANDBY_CHARGE_PATH &
          (api.chargerState == ChargerState.DISCONNECTED &
            api.eligibilityEnvelope.decisionReason == EligibilityReason.CHARGER_DISCONNECTED |
            api.chargerState == ChargerState.CONNECTED &
              api.batteryQualification == BatteryQualification.UNAVAILABLE &
              api.eligibilityEnvelope.decisionReason == EligibilityReason.BATTERY_UNAVAILABLE)),
        // case CASE_10
        //   no recovery applicable -> NO_RECOVERY
        (!((api.currentLifecycleState == LifecycleState.READY |
          api.currentLifecycleState == LifecycleState.FLYING) &
          api.batteryQualification != BatteryQualification.SUFFICIENT) & !((api.currentLifecycleState == LifecycleState.READY |
          api.currentLifecycleState == LifecycleState.FLYING) &
          api.batteryQualification == BatteryQualification.SUFFICIENT &
          api.flightQualification != FlightQualification.READY) &
          !(api.currentLifecycleState == LifecycleState.CHARGING &
            (api.chargerState == ChargerState.DISCONNECTED |
              api.batteryQualification == BatteryQualification.UNAVAILABLE))) ___>: (api.recoveryProposal == RecoveryProposal.NO_RECOVERY &
          api.eligibilityEnvelope.flightEligible == T == (api.batteryQualification == BatteryQualification.SUFFICIENT &
            api.flightQualification == FlightQualification.READY) &
          api.eligibilityEnvelope.chargeEligible == T == (api.chargerState == ChargerState.CONNECTED &
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
    // example api usage

    val apiUsage_chargerState: Option[Drone_Lifecycle_Governor.ChargerState.Type] = api.get_chargerState()
    api.logInfo(s"Received on data port chargerState: ${apiUsage_chargerState}")
    val apiUsage_batteryQualification: Option[Drone_Lifecycle_Governor.BatteryQualification.Type] = api.get_batteryQualification()
    api.logInfo(s"Received on data port batteryQualification: ${apiUsage_batteryQualification}")
    val apiUsage_flightQualification: Option[Drone_Lifecycle_Governor.FlightQualification.Type] = api.get_flightQualification()
    api.logInfo(s"Received on data port flightQualification: ${apiUsage_flightQualification}")
    val apiUsage_currentLifecycleState: Option[Drone_Lifecycle_Governor.LifecycleState.Type] = api.get_currentLifecycleState()
    api.logInfo(s"Received on data port currentLifecycleState: ${apiUsage_currentLifecycleState}")
  }

  def finalise(api: OperationalEligibilityOwner_Operational_Api): Unit = { }
}
