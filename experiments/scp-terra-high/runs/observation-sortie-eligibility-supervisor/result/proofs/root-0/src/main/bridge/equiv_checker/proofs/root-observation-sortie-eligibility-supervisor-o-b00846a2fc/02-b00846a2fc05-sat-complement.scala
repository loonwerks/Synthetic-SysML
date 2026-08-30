// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b00846a2fc05_2_Complement {
  @pure def check(
      accepted_directive: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type,
      candidate_event: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type,
      operator_event: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type,
      release_feedback: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.ReleaseFeedback.Type,
      request_phase: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type,
      requestmemory: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RequestLifecycleOwner_eligibility_supervisor_process_request_lifecycle_owner_GumboX.inititialize_IEP_Post(requestmemory, candidate_event, request_phase))) & T)))
  }
}
