// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_eeedb695c1c8_1_Valid {
  @pure def check(
      accepted_directive: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type,
      candidate_event: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type,
      fault_summary: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.FaultSummary): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
