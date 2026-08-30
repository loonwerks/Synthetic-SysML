// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_61871e0aa8e4_Oracle_Pointwise_Realizable {
  @pure def check(
      battery_evidence: equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryEvidence.Type,
      charge_decision: equiv_shared_0.Drone_Battery_Charge_Supervisor.ChargeDecision): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_GumboX.compute_CEP_Post(battery_evidence, charge_decision, equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.BatteryReady)) |
        (equiv_shared_0.Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_GumboX.compute_CEP_Post(battery_evidence, charge_decision, equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.BatteryNotReady)) |
        (equiv_shared_0.Drone_Battery_Charge_Supervisor.Readiness_Evidence_Derivation_charge_supervision_process_readiness_evidence_derivation_GumboX.compute_CEP_Post(battery_evidence, charge_decision, equiv_shared_0.Drone_Battery_Charge_Supervisor.BatteryReadinessEvidence.EvidenceUnavailable)))))
  }
}
