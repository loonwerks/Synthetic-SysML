// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation {

  def initialise(api: Readiness_Evidence_Derivation_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_readiness_evidence(Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.EvidenceUnavailable)
  }

  def timeTriggered(api: Readiness_Evidence_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case READINESS_UNAVAILABLE
        (api.charge_decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault |
          api.charge_decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending) ___>: (api.readiness_evidence == Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.EvidenceUnavailable),
        // case READINESS_LOW
        (api.charge_decision.disposition != Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault &
          api.charge_decision.disposition != Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending &
          api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence) ___>: (api.readiness_evidence == Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.BatteryNotReady),
        // case READINESS_ADEQUATE
        (api.charge_decision.disposition != Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault &
          api.charge_decision.disposition != Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending &
          api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.AdequateBatteryEvidence) ___>: (api.readiness_evidence == Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.BatteryReady)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val decision = api.get_charge_decision().get
    val evidence = api.get_battery_evidence().get
    if (decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault |
      decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending) {
      api.put_readiness_evidence(Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.EvidenceUnavailable)
    } else if (evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence) {
      api.put_readiness_evidence(Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.BatteryNotReady)
    } else {
      api.put_readiness_evidence(Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.BatteryReady)
    }
  }

  def finalise(api: Readiness_Evidence_Derivation_Operational_Api): Unit = { }
}
