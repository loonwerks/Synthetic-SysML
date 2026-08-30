// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c67d1d0487e2_3_Valid {
  @pure def check(
      admission: equiv_shared_0.Factory_Flow.AdmissionFact,
      materialfact: equiv_shared_0.Factory_Flow.MaterialFact,
      materialobservation: equiv_shared_0.Factory_Flow.MaterialHandoffObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
