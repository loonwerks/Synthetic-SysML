// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f4fc55d6d03c_4_Valid {
  @pure def check(
      eligibility_decision: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EligibilityDecision,
      release_feedback: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type,
      request_phase: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type,
      sortie_directive: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SortieDirective.Type,
      in_releasememory: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type,
      releasememory: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_GumboX.compute_CEP_Post(in_releasememory, releasememory, eligibility_decision, request_phase, release_feedback, sortie_directive))) ___>: (T)) & T))
  }
}
