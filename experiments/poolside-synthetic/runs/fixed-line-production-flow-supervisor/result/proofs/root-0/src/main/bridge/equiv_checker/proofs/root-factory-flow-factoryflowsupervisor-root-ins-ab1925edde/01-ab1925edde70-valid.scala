// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ab1925edde70_1_Valid {
  @pure def check(
      flowcontext: equiv_shared_0.Factory_Flow.FlowContext,
      readinessobservation: equiv_shared_0.Factory_Flow.StepReadinessObservation,
      targetfact: equiv_shared_0.Factory_Flow.TargetQualification.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
