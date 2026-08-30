// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7de8307185e1_3_Valid {
  @pure def check(
      admission: equiv_shared_0.Factory_Flow.AdmissionFact,
      intentfact: equiv_shared_0.Factory_Flow.FlowIntentFact,
      protectioncontext: equiv_shared_0.Factory_Flow.ProtectionContext): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
