// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_eeedb695c1c8_Oracle_Pointwise_Realizable {
  @pure def check(
      candidate_event: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type,
      fault_summary: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.FaultSummary): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_GumboX.compute_CEP_Post(candidate_event, fault_summary, equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Inhibit)) |
        (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_GumboX.compute_CEP_Post(candidate_event, fault_summary, equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Cancel)) |
        (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_GumboX.compute_CEP_Post(candidate_event, fault_summary, equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Recover)) |
        (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_GumboX.compute_CEP_Post(candidate_event, fault_summary, equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Submit)) |
        (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_GumboX.compute_CEP_Post(candidate_event, fault_summary, equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Hold)))))
  }
}
