// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_434aa5784735_2_Valid {
  @pure def check(
      flowcontext: equiv_shared_0.Factory_Flow.FlowContext,
      outcometoauthorization: equiv_shared_0.Factory_Flow.OutcomeFact,
      outcometodeterminer: equiv_shared_0.Factory_Flow.OutcomeFact,
      processresult: equiv_shared_0.Factory_Flow.ProcessResultObservation): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_Candidate_GumboX.compute_CEP_Post(flowcontext, processresult, outcometoauthorization, outcometodeterminer))) ___>: (equiv_shared_0.Factory_Flow.ProcessOutcomeCorrelator_supervisorProcess_processOutcomeCorrelator_GumboX.compute_CEP_Post(flowcontext, processresult, outcometoauthorization, outcometodeterminer))) & T))
  }
}
