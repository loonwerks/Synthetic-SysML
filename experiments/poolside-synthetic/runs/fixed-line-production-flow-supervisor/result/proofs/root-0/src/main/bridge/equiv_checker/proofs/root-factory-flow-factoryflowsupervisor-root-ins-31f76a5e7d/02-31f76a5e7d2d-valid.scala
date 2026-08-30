// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_31f76a5e7d2d_2_Valid {
  @pure def check(
      appliedsnapshot: equiv_shared_0.Factory_Flow.FlowSnapshot,
      outcomefact: equiv_shared_0.Factory_Flow.OutcomeFact,
      productionoutcome: equiv_shared_0.Factory_Flow.ProductionOutcome): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Factory_Flow.ProductionOutcomeDeterminer_supervisorProcess_productionOutcomeDeterminer_GumboX.inititialize_IEP_Post(productionoutcome))) & T))
  }
}
