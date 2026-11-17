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
        //   Fault or recovery makes readiness evidence unavailable | N.md#READINESS_UNAVAILABLE
        (api.charge_decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault |
          api.charge_decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending) ___>: (api.readiness_evidence == Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.EvidenceUnavailable),
        // case READINESS_LOW
        //   Low valid evidence is not flight ready | N.md#READINESS_LOW
        (api.charge_decision.disposition != Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault &
          api.charge_decision.disposition != Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending &
          api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence) ___>: (api.readiness_evidence == Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.BatteryNotReady),
        // case READINESS_ADEQUATE
        //   Adequate valid evidence is flight-ready evidence | N.md#READINESS_ADEQUATE
        (api.charge_decision.disposition != Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault &
          api.charge_decision.disposition != Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending &
          api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.AdequateBatteryEvidence) ___>: (api.readiness_evidence == Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.BatteryReady)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val decision: Drone_Battery_Charge_Supervisor.ChargeDecision = api.get_charge_decision().get
    val evidence: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type = api.get_battery_evidence().get
    val readiness: Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.Type =
      if (decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault |
          decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending) {
        Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.EvidenceUnavailable
      } else if (evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence) {
        Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.BatteryNotReady
      } else {
        Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.BatteryReady
      }
    api.put_readiness_evidence(readiness)
  }

  def finalise(api: Readiness_Evidence_Derivation_Operational_Api): Unit = { }
}
