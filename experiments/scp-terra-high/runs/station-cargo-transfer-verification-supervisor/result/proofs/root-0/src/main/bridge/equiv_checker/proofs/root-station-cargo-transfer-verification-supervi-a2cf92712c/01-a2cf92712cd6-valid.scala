// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a2cf92712cd6_1_Valid {
  @pure def check(
      receiptevidence: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseReceiptEvidence.Type,
      sessionexpectation: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.SessionExpectation.Type,
      warehousefinding: equiv_shared_0.Station_Cargo_Transfer_Verification_Supervisor.WarehouseFinding.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
