// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_bba8e22b73b4_4_Valid {
  @pure def check(
      flowcontext: equiv_shared_0.Factory_Flow.FlowContext,
      readinessobservation: equiv_shared_0.Factory_Flow.StepReadinessObservation,
      targetfact: equiv_shared_0.Factory_Flow.TargetQualification.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Flow.TargetStepReadinessQualifier_supervisorProcess_targetStepReadinessQualifier_GumboX.compute_CEP_Post(flowcontext, readinessobservation, targetfact))) ___>: (T)) & T))
  }
}
