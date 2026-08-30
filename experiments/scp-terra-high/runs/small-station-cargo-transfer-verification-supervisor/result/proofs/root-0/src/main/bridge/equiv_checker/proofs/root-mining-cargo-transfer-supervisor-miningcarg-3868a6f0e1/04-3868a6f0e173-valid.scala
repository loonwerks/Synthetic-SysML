// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3868a6f0e173_4_Valid {
  @pure def check(
      qualifiedrequest: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedRequest.Type,
      requestsample: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.OffloadRequestSample): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_GumboX.compute_CEP_Post(requestsample, qualifiedrequest))) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_Candidate_GumboX.compute_CEP_Post(requestsample, qualifiedrequest))) & T))
  }
}
