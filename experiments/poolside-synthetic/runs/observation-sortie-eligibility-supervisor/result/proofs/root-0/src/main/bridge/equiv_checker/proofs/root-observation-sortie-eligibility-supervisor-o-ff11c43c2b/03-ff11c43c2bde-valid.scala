// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ff11c43c2bde_3_Valid {
  @pure def check(
      eligibility_decision: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EligibilityDecision,
      eligibility_status: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EligibilityStatus,
      fault_summary: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.FaultSummary,
      recovery_phase: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type,
      request_phase: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
