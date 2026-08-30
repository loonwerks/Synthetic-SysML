// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c67d1d0487e2_2_Valid {
  @pure def check(
      admission: equiv_shared_0.Factory_Flow.AdmissionFact,
      materialfact: equiv_shared_0.Factory_Flow.MaterialFact,
      materialobservation: equiv_shared_0.Factory_Flow.MaterialHandoffObservation): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_Candidate_GumboX.compute_CEP_Post(admission, materialobservation, materialfact))) ___>: (equiv_shared_0.Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_GumboX.compute_CEP_Post(admission, materialobservation, materialfact))) & T))
  }
}
