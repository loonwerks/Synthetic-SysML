// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_594b86b6fdef_Oracle_Pointwise_Realizable {
  @pure def check(
      requestsample: equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringRequestSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_GumboX.compute_CEP_Post(requestsample, equiv_shared_0.EIT_Acquisition_Coordinator.QualifiedRequest.InvalidRequest)) |
        (equiv_shared_0.EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_GumboX.compute_CEP_Post(requestsample, equiv_shared_0.EIT_Acquisition_Coordinator.QualifiedRequest.NoQualifiedRequest)) |
        (equiv_shared_0.EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_GumboX.compute_CEP_Post(requestsample, equiv_shared_0.EIT_Acquisition_Coordinator.QualifiedRequest.QualifiedStart)) |
        (equiv_shared_0.EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_GumboX.compute_CEP_Post(requestsample, equiv_shared_0.EIT_Acquisition_Coordinator.QualifiedRequest.QualifiedStop)))))
  }
}
