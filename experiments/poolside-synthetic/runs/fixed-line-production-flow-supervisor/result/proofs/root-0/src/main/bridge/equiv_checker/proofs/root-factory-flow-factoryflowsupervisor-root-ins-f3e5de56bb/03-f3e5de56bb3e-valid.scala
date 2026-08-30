// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f3e5de56bb3e_3_Valid {
  @pure def check(
      admissiontomaterial: equiv_shared_0.Factory_Flow.AdmissionFact,
      admissiontopriority: equiv_shared_0.Factory_Flow.AdmissionFact,
      presentedwork: equiv_shared_0.Factory_Flow.PresentedWorkRequest): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
