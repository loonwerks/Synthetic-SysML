// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4b42476ea71b_3_Valid {
  @pure def check(
      qualifiedwarehouseevidence: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type,
      warehousesample: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
