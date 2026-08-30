// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7de8307185e1_2_Complement {
  @pure def check(
      admission: equiv_shared_0.Factory_Flow.AdmissionFact,
      intentfact: equiv_shared_0.Factory_Flow.FlowIntentFact,
      protectioncontext: equiv_shared_0.Factory_Flow.ProtectionContext): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_Candidate_GumboX.compute_CEP_Post(admission, protectioncontext, intentfact))) ___>: (equiv_shared_0.Factory_Flow.ProtectedWorkPriorityResolver_supervisorProcess_protectedWorkPriorityResolver_GumboX.compute_CEP_Post(admission, protectioncontext, intentfact))) & T)))
  }
}
