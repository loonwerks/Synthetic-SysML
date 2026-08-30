// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_41e117a6dec4_4_Valid {
  @pure def check(
      eligibility_decision: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EligibilityDecision,
      release_feedback: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type,
      request_phase: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type,
      sortie_directive: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SortieDirective.Type,
      releasememory: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PermissionReleaseLedger_eligibility_supervisor_process_permission_release_ledger_GumboX.inititialize_IEP_Post(releasememory, release_feedback, sortie_directive))) ___>: (T)) & T))
  }
}
