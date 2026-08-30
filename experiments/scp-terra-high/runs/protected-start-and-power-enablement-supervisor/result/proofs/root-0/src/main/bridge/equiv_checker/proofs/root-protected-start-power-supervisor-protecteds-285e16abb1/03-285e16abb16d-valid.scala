// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_285e16abb16d_3_Valid {
  @pure def check(
      actuation_disposition: equiv_shared_0.Protected_Start_Power_Supervisor.ActuationDisposition,
      exact_fault_summary: equiv_shared_0.Protected_Start_Power_Supervisor.ExactFaultSummary,
      session_decision_facts: equiv_shared_0.Protected_Start_Power_Supervisor.SessionDecisionFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
