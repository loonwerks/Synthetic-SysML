// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_40c175a14fbe_2_Valid {
  @pure def check(
      actuation_disposition: equiv_shared_0.Protected_Start_Power_Supervisor.ActuationDisposition,
      exact_fault_summary: equiv_shared_0.Protected_Start_Power_Supervisor.ExactFaultSummary,
      session_decision_facts: equiv_shared_0.Protected_Start_Power_Supervisor.SessionDecisionFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_GumboX.compute_CEP_Post(exact_fault_summary, session_decision_facts, actuation_disposition))) & T))
  }
}
