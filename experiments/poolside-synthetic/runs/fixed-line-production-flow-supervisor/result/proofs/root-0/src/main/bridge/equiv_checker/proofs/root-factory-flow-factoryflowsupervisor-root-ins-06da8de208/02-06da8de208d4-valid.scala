// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_06da8de208d4_2_Valid {
  @pure def check(
      admission: equiv_shared_0.Factory_Flow.AdmissionFact,
      materialfact: equiv_shared_0.Factory_Flow.MaterialFact,
      materialobservation: equiv_shared_0.Factory_Flow.MaterialHandoffObservation): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_GumboX.inititialize_IEP_Post(materialfact))) & T))
  }
}
