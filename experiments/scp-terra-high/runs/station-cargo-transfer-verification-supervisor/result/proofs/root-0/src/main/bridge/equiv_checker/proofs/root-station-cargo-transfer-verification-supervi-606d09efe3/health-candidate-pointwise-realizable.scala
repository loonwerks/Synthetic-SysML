// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_606d09efe3c5_Candidate_Pointwise_Realizable {
  @pure def check(
      cargostate: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CargoState.Type,
      transferrequest: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.NoNewRequest)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.StartCandidate)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.RejectEmpty)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.CancelCandidate)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.ResetCandidate)) |
        (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_Candidate_GumboX.inititialize_IEP_Post(equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.InputFault)))))
  }
}
