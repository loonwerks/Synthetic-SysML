// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b3ee8e3ed46e_2_Valid {
  @pure def check(
      authorization: equiv_shared_0.Factory_Flow.AuthorizationFact,
      intentfact: equiv_shared_0.Factory_Flow.FlowIntentFact,
      materialfact: equiv_shared_0.Factory_Flow.MaterialFact,
      outcomefact: equiv_shared_0.Factory_Flow.OutcomeFact,
      reasontostatus: equiv_shared_0.Factory_Flow.DecisionReason.Type,
      targetfact: equiv_shared_0.Factory_Flow.TargetQualification.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Factory_Flow.FlowAuthorizationOwner_supervisorProcess_flowAuthorizationOwner_GumboX.inititialize_IEP_Post(authorization, reasontostatus))) & T))
  }
}
