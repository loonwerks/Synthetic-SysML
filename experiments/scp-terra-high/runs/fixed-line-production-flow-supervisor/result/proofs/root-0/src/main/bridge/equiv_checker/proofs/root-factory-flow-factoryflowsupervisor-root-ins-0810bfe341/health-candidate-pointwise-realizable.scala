// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_0810bfe341e3_Candidate_Pointwise_Realizable {
  @pure def check(
      appliedsnapshot: equiv_shared_0.Factory_Flow.FlowSnapshot,
      outcomefact: equiv_shared_0.Factory_Flow.OutcomeFact): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_Candidate_GumboX.compute_CEP_Post(appliedsnapshot, outcomefact, equiv_shared_0.Factory_Flow.ProductionOutcome(result = equiv_shared_0.Factory_Flow.ProductionResult.None, work_id = equiv_shared_0.Factory_Flow.WorkId.NoWork))) |
        (equiv_shared_0.Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_Candidate_GumboX.compute_CEP_Post(appliedsnapshot, outcomefact, equiv_shared_0.Factory_Flow.ProductionOutcome(result = equiv_shared_0.Factory_Flow.ProductionResult.None, work_id = equiv_shared_0.Factory_Flow.WorkId.W1))) |
        (equiv_shared_0.Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_Candidate_GumboX.compute_CEP_Post(appliedsnapshot, outcomefact, equiv_shared_0.Factory_Flow.ProductionOutcome(result = equiv_shared_0.Factory_Flow.ProductionResult.None, work_id = equiv_shared_0.Factory_Flow.WorkId.W2))) |
        (equiv_shared_0.Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_Candidate_GumboX.compute_CEP_Post(appliedsnapshot, outcomefact, equiv_shared_0.Factory_Flow.ProductionOutcome(result = equiv_shared_0.Factory_Flow.ProductionResult.ProductionComplete, work_id = equiv_shared_0.Factory_Flow.WorkId.NoWork))) |
        (equiv_shared_0.Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_Candidate_GumboX.compute_CEP_Post(appliedsnapshot, outcomefact, equiv_shared_0.Factory_Flow.ProductionOutcome(result = equiv_shared_0.Factory_Flow.ProductionResult.ProductionComplete, work_id = equiv_shared_0.Factory_Flow.WorkId.W1))) |
        (equiv_shared_0.Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_Candidate_GumboX.compute_CEP_Post(appliedsnapshot, outcomefact, equiv_shared_0.Factory_Flow.ProductionOutcome(result = equiv_shared_0.Factory_Flow.ProductionResult.ProductionComplete, work_id = equiv_shared_0.Factory_Flow.WorkId.W2))) |
        (equiv_shared_0.Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_Candidate_GumboX.compute_CEP_Post(appliedsnapshot, outcomefact, equiv_shared_0.Factory_Flow.ProductionOutcome(result = equiv_shared_0.Factory_Flow.ProductionResult.ProductionFailed, work_id = equiv_shared_0.Factory_Flow.WorkId.NoWork))) |
        (equiv_shared_0.Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_Candidate_GumboX.compute_CEP_Post(appliedsnapshot, outcomefact, equiv_shared_0.Factory_Flow.ProductionOutcome(result = equiv_shared_0.Factory_Flow.ProductionResult.ProductionFailed, work_id = equiv_shared_0.Factory_Flow.WorkId.W1))) |
        (equiv_shared_0.Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_Candidate_GumboX.compute_CEP_Post(appliedsnapshot, outcomefact, equiv_shared_0.Factory_Flow.ProductionOutcome(result = equiv_shared_0.Factory_Flow.ProductionResult.ProductionFailed, work_id = equiv_shared_0.Factory_Flow.WorkId.W2))))))
  }
}
