// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7773836a5ea5_3_Valid {
  @pure def check(
      qualifiedshipprogress: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedShipProgress.Type,
      shipsample: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.ShipTransferSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
