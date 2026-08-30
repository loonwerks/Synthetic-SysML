// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_285e16abb16d_4_Valid {
  @pure def check(
      actuation_disposition: equiv_shared_0.Protected_Start_Power_Supervisor.ActuationDisposition,
      exact_fault_summary: equiv_shared_0.Protected_Start_Power_Supervisor.ExactFaultSummary,
      session_decision_facts: equiv_shared_0.Protected_Start_Power_Supervisor.SessionDecisionFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Protected_Start_Power_Supervisor.ActuationCompositionOwner_protected_start_power_process_actuation_composition_owner_GumboX.inititialize_IEP_Post(actuation_disposition))) ___>: (T)) & T))
  }
}
