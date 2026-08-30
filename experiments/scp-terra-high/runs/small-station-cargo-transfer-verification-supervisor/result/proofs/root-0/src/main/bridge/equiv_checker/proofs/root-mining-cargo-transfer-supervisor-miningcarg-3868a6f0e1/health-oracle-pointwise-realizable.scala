// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_3868a6f0e173_Oracle_Pointwise_Realizable {
  @pure def check(
      requestsample: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.OffloadRequestSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_GumboX.compute_CEP_Post(requestsample, equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedRequest.InvalidRequest)) |
        (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_GumboX.compute_CEP_Post(requestsample, equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedRequest.NoQualifiedRequest)) |
        (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.RequestQualification_supervisionProcess_requestQualification_GumboX.compute_CEP_Post(requestsample, equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedRequest.QualifiedOffloadRequest)))))
  }
}
