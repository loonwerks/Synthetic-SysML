// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4b42476ea71b_4_Valid {
  @pure def check(
      qualifiedwarehouseevidence: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.QualifiedWarehouseEvidence.Type,
      warehousesample: equiv_shared_0.Mining_Cargo_Transfer_Supervisor.WarehouseReceiptSample): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Cargo_Transfer_Supervisor.WarehouseEvidenceQualification_supervisionProcess_warehouseEvidenceQualification_GumboX.inititialize_IEP_Post(qualifiedwarehouseevidence))) ___>: (T)) & T))
  }
}
