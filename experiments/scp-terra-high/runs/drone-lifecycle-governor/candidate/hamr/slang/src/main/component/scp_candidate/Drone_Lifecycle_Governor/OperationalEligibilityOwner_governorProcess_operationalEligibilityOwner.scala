// #Sireum

package scp_candidate.Drone_Lifecycle_Governor

import org.sireum._
import scp_candidate._

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
    Contract(Modifies(api))
    (api.get_chargerState(), api.get_batteryQualification(), api.get_flightQualification(),
      api.get_currentLifecycleState()) match {
      case (Some(charger), Some(battery), Some(flight), Some(state)) =>
        val flightEligible: B = battery == Drone_Lifecycle_Governor.BatteryQualification.SUFFICIENT &&
          flight == Drone_Lifecycle_Governor.FlightQualification.READY
        val chargeEligible: B = charger == Drone_Lifecycle_Governor.ChargerState.CONNECTED &&
          battery != Drone_Lifecycle_Governor.BatteryQualification.UNAVAILABLE
        val inFlightMode: B = state == Drone_Lifecycle_Governor.LifecycleState.READY ||
          state == Drone_Lifecycle_Governor.LifecycleState.FLYING
        val (recovery, reason): (Drone_Lifecycle_Governor.RecoveryProposal.Type, Drone_Lifecycle_Governor.EligibilityReason.Type) =
          if (inFlightMode && battery != Drone_Lifecycle_Governor.BatteryQualification.SUFFICIENT) {
            (Drone_Lifecycle_Governor.RecoveryProposal.TO_STANDBY_BATTERY,
              if (battery == Drone_Lifecycle_Governor.BatteryQualification.UNAVAILABLE)
                Drone_Lifecycle_Governor.EligibilityReason.BATTERY_UNAVAILABLE
              else Drone_Lifecycle_Governor.EligibilityReason.BATTERY_LOW)
          } else if (inFlightMode && flight != Drone_Lifecycle_Governor.FlightQualification.READY) {
            (Drone_Lifecycle_Governor.RecoveryProposal.TO_STANDBY_READINESS,
              if (flight == Drone_Lifecycle_Governor.FlightQualification.UNAVAILABLE)
                Drone_Lifecycle_Governor.EligibilityReason.FLIGHT_UNAVAILABLE
              else Drone_Lifecycle_Governor.EligibilityReason.FLIGHT_NOT_READY)
          } else if (state == Drone_Lifecycle_Governor.LifecycleState.CHARGING &&
            (charger == Drone_Lifecycle_Governor.ChargerState.DISCONNECTED ||
              battery == Drone_Lifecycle_Governor.BatteryQualification.UNAVAILABLE)) {
            (Drone_Lifecycle_Governor.RecoveryProposal.TO_STANDBY_CHARGE_PATH,
              if (charger == Drone_Lifecycle_Governor.ChargerState.DISCONNECTED)
                Drone_Lifecycle_Governor.EligibilityReason.CHARGER_DISCONNECTED
              else Drone_Lifecycle_Governor.EligibilityReason.BATTERY_UNAVAILABLE)
          } else {
            (Drone_Lifecycle_Governor.RecoveryProposal.NO_RECOVERY,
              if (battery == Drone_Lifecycle_Governor.BatteryQualification.UNAVAILABLE) Drone_Lifecycle_Governor.EligibilityReason.BATTERY_UNAVAILABLE
              else if (battery == Drone_Lifecycle_Governor.BatteryQualification.INSUFFICIENT) Drone_Lifecycle_Governor.EligibilityReason.BATTERY_LOW
              else if (flight == Drone_Lifecycle_Governor.FlightQualification.UNAVAILABLE) Drone_Lifecycle_Governor.EligibilityReason.FLIGHT_UNAVAILABLE
              else if (flight == Drone_Lifecycle_Governor.FlightQualification.NOT_READY) Drone_Lifecycle_Governor.EligibilityReason.FLIGHT_NOT_READY
              else Drone_Lifecycle_Governor.EligibilityReason.NONE)
          }
        api.put_recoveryProposal(recovery)
        api.put_eligibilityEnvelope(Drone_Lifecycle_Governor.EligibilityEnvelope(flightEligible, chargeEligible, reason))
    }
  }

  def finalise(api: OperationalEligibilityOwner_Operational_Api): Unit = { }
}
