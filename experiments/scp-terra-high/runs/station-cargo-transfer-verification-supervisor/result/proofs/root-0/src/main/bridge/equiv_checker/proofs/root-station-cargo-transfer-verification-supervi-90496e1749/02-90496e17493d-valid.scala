// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_90496e17493d_2_Valid {
  @pure def check(
      cargostate: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CargoState.Type,
      qualifiedrequest: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.Type,
      transferrequest: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_Candidate_GumboX.compute_CEP_Post(cargostate, transferrequest, qualifiedrequest))) ___>: (equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.RequestQualifier_supervisorProcess_requestQualifier_GumboX.compute_CEP_Post(cargostate, transferrequest, qualifiedrequest))) & T))
  }
}
