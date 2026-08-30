// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0f6d1c632f9f_2_Complement {
  @pure def check(
      eligibility_decision: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EligibilityDecision,
      eligibility_status: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EligibilityStatus,
      fault_summary: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.FaultSummary,
      recovery_phase: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RecoveryPhase.Type,
      request_phase: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.RequestPhase.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.StatusComposer_eligibility_supervisor_process_status_composer_GumboX.inititialize_IEP_Post(eligibility_status))) & T)))
  }
}
