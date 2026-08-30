// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0810bfe341e3_4_Valid {
  @pure def check(
      appliedsnapshot: equiv_shared_0.Factory_Flow.FlowSnapshot,
      outcomefact: equiv_shared_0.Factory_Flow.OutcomeFact,
      productionoutcome: equiv_shared_0.Factory_Flow.ProductionOutcome): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_GumboX.compute_CEP_Post(appliedsnapshot, outcomefact, productionoutcome))) ___>: (equiv_shared_0.Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_Candidate_GumboX.compute_CEP_Post(appliedsnapshot, outcomefact, productionoutcome))) & T))
  }
}
