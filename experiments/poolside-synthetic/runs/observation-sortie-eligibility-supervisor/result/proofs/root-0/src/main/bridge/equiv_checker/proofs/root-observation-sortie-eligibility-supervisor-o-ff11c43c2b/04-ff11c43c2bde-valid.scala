// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ff11c43c2bde_4_Valid {
  @pure def check(
      eligibility_decision: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EligibilityDecision,
      eligibility_status: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EligibilityStatus,
      fault_summary: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.FaultSummary,
      recovery_phase: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type,
      request_phase: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_GumboX.compute_CEP_Post(eligibility_decision, fault_summary, recovery_phase, request_phase, eligibility_status))) ___>: (T)) & T))
  }
}
