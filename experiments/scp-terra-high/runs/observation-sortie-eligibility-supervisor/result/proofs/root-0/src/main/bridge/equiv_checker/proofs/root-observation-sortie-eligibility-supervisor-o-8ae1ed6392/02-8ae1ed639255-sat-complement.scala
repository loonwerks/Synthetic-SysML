// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8ae1ed639255_2_Complement {
  @pure def check(
      accepted_directive: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type,
      candidate_event: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type,
      fault_summary: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.FaultSummary): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PriorityArbiter_eligibility_supervisor_process_priority_arbiter_GumboX.inititialize_IEP_Post(accepted_directive))) & T)))
  }
}
