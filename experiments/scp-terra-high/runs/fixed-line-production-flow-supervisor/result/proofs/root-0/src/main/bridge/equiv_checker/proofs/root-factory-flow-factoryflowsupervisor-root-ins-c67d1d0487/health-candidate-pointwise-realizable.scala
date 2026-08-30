// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_c67d1d0487e2_Candidate_Pointwise_Realizable {
  @pure def check(
      admission: equiv_shared_0.Factory_Flow.AdmissionFact,
      materialobservation: equiv_shared_0.Factory_Flow.MaterialHandoffObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_Candidate_GumboX.compute_CEP_Post(admission, materialobservation, equiv_shared_0.Factory_Flow.MaterialFact(assessment = equiv_shared_0.Factory_Flow.MaterialAssessment.MaterialReady))) |
        (equiv_shared_0.Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_Candidate_GumboX.compute_CEP_Post(admission, materialobservation, equiv_shared_0.Factory_Flow.MaterialFact(assessment = equiv_shared_0.Factory_Flow.MaterialAssessment.MaterialUnavailable))) |
        (equiv_shared_0.Factory_Flow.MaterialCorrelationQualifier_supervisorProcess_materialCorrelationQualifier_Candidate_GumboX.compute_CEP_Post(admission, materialobservation, equiv_shared_0.Factory_Flow.MaterialFact(assessment = equiv_shared_0.Factory_Flow.MaterialAssessment.MaterialUnknown))))))
  }
}
