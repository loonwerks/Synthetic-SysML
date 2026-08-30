// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fc2c0c466a11_4_Valid {
  @pure def check(
      qualifiedwarehouseevidence: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type,
      warehousesample: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_GumboX.compute_CEP_Post(warehousesample, qualifiedwarehouseevidence))) ___>: (T)) & T))
  }
}
