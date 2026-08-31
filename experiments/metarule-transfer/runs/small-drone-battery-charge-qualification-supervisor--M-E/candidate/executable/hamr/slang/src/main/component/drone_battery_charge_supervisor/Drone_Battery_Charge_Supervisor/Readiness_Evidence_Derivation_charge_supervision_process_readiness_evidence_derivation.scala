// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation {

  def initialise(api: Readiness_Evidence_Derivation_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_readiness_evidence(Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.EvidenceUnavailable)
  }

  def timeTriggered(api: Readiness_Evidence_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case READINESS_UNAVAILABLE
        (api.charge_decision.disposition == ChargeDisposition.InputFault |
          api.charge_decision.disposition == ChargeDisposition.RecoveryPending) ___>: (api.readiness_evidence == BatteryReadinessEvidence.EvidenceUnavailable),
        // case READINESS_LOW
        (api.charge_decision.disposition != ChargeDisposition.InputFault &
          api.charge_decision.disposition != ChargeDisposition.RecoveryPending &
          api.battery_evidence == BatteryEvidence.LowBatteryEvidence) ___>: (api.readiness_evidence == BatteryReadinessEvidence.BatteryNotReady),
        // case READINESS_ADEQUATE
        (api.charge_decision.disposition != ChargeDisposition.InputFault &
          api.charge_decision.disposition != ChargeDisposition.RecoveryPending &
          api.battery_evidence == BatteryEvidence.AdequateBatteryEvidence) ___>: (api.readiness_evidence == BatteryReadinessEvidence.BatteryReady)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val decision = api.get_charge_decision().get
    val evidence = api.get_battery_evidence().get
    if (decision.disposition == ChargeDisposition.InputFault |
      decision.disposition == ChargeDisposition.RecoveryPending) {
      api.put_readiness_evidence(BatteryReadinessEvidence.EvidenceUnavailable)
    } else if (evidence == BatteryEvidence.LowBatteryEvidence) {
      api.put_readiness_evidence(BatteryReadinessEvidence.BatteryNotReady)
    } else {
      api.put_readiness_evidence(BatteryReadinessEvidence.BatteryReady)
    }
  }

  def finalise(api: Readiness_Evidence_Derivation_Operational_Api): Unit = { }
}
