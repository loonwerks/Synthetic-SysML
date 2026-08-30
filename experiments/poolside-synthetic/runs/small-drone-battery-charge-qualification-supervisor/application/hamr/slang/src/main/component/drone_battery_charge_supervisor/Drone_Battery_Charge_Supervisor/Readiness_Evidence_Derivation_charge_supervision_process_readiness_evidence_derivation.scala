// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation {

  def initialise(api: Readiness_Evidence_Derivation_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.readiness_evidence == Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.EvidenceUnavailable
      )
    )

    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    // INITIAL_READINESS
    api.put_readiness_evidence(Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.EvidenceUnavailable)
  }

  def timeTriggered(api: Readiness_Evidence_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )

    // example api usage

    val charge_decision = api.get_charge_decision().get
    val battery_evidence = api.get_battery_evidence().get

    if (charge_decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault |
        charge_decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending) {
      // READINESS_UNAVAILABLE
      api.put_readiness_evidence(Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.EvidenceUnavailable)
    } else if (battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence) {
      // READINESS_LOW
      api.put_readiness_evidence(Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.BatteryNotReady)
    } else {
      // READINESS_ADEQUATE
      api.put_readiness_evidence(Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.BatteryReady)
    }
  }

  def finalise(api: Readiness_Evidence_Derivation_Operational_Api): Unit = { }
}
