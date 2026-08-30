// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d00e732d9ef2_3_Valid {
  @pure def check(
      accepted_directive: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type,
      candidate_event: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type,
      operator_event: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type,
      release_feedback: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type,
      request_phase: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type,
      in_requestmemory: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type,
      requestmemory: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
