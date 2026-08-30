// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_606d09efe3c5_3_Valid {
  @pure def check(
      cargostate: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.CargoState.Type,
      qualifiedrequest: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.QualifiedRequest.Type,
      transferrequest: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.TransferRequest.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
