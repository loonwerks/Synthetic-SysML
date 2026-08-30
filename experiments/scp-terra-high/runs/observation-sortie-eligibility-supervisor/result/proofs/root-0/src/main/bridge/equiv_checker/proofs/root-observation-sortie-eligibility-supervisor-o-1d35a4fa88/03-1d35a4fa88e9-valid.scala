// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1d35a4fa88e9_3_Valid {
  @pure def check(
      accepted_directive: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type,
      fault_summary: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.FaultSummary,
      recovery_facts: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RecoveryFacts,
      recovery_phase: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type,
      in_recoverymemory: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type,
      recoverymemory: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
