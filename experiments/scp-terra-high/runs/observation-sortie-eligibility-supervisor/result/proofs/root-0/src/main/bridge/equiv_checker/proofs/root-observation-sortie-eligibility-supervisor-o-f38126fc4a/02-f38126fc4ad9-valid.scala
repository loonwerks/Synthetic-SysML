// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f38126fc4ad9_2_Valid {
  @pure def check(
      accepted_directive: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type,
      fault_summary: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.FaultSummary,
      recovery_facts: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RecoveryFacts,
      recovery_phase: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type,
      recoverymemory: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RecoveryQualificationOwner_eligibility_supervisor_process_recovery_qualification_owner_GumboX.inititialize_IEP_Post(recoverymemory, recovery_facts, recovery_phase))) & T))
  }
}
