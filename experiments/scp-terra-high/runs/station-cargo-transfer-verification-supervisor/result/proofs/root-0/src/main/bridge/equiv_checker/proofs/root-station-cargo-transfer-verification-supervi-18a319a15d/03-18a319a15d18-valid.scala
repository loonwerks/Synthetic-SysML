// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_18a319a15d18_3_Valid {
  @pure def check(
      shipfinding: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.ShipFinding.Type,
      verificationdisposition: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.VerificationDisposition.Type,
      warehousefinding: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
