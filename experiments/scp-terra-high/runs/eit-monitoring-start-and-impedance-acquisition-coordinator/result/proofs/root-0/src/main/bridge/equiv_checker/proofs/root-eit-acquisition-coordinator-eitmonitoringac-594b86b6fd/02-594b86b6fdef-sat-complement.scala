// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_594b86b6fdef_2_Complement {
  @pure def check(
      qualifiedrequest: equiv_shared_0.EIT_Acquisition_Coordinator.QualifiedRequest.Type,
      requestsample: equiv_shared_0.EIT_Acquisition_Coordinator.MonitoringRequestSample): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.EIT_Acquisition_Coordinator.RequestQualification_coordinationProcess_requestQualification_GumboX.compute_CEP_Post(requestsample, qualifiedrequest))) & T)))
  }
}
